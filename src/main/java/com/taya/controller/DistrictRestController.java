/**
 * TAYAFOOD 2018
 */
package com.taya.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.taya.form.DistrictForm;
import com.taya.model.District;
import com.taya.repository.DistrictRepository;
import com.taya.repository.DistrictRepositoryCustom;

/**
 * @author ManNLM
 */

@RestController
@RequestMapping("/api")
public class DistrictRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DistrictRepository districtRepository;

	@Autowired
	private DistrictRepositoryCustom districtRepositoryCustom;

	@RequestMapping("/district")
	@ResponseBody
	public List<District> getDistrict() {
		return districtRepository.findAll();
	}

	@RequestMapping("/district/{districtId}")
	@ResponseBody
	public District getDistrictById(@PathVariable("districtId") Long districtId) {
		District district = null;
		try {
			district = districtRepository.findById(districtId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return district;
		}
		return district;
	}

	@RequestMapping(value = "/district/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public District updateDistrict(@RequestBody DistrictForm districtForm) {
		return districtRepositoryCustom.addOrUpdate(districtForm);
	}

	@RequestMapping(value = "/district/delete/{districtId}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void deleteDistrict(@PathVariable("districtId") Long districtId) {
		districtRepository.deleteById(districtId);
	}
}
