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

import com.taya.form.RegionForm;
import com.taya.model.Region;
import com.taya.repository.RegionRepository;
import com.taya.repository.RegionRepositoryCustom;

/**
 * @author ManNLM
 */

@RestController
@RequestMapping("/api")
public class RegionRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RegionRepository regionRepository;

	@Autowired
	private RegionRepositoryCustom regionRepositoryCustom;

	@RequestMapping("/region")
	@ResponseBody
	public List<Region> getRegion() {
		return regionRepository.findAll();
	}

	@RequestMapping("/region/{regionId}")
	@ResponseBody
	public Region getRegionById(@PathVariable("regionId") Long regionId) {
		Region region = null;
		try {
			region = regionRepository.findById(regionId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return region;
		}
		return region;
	}

	@RequestMapping(value = "/region/update", method = RequestMethod.PUT, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Region updateRegion(@RequestBody RegionForm regionForm) {
		return regionRepositoryCustom.addOrUpdate(regionForm);
	}

	@RequestMapping(value = "/region/delete/{regionId}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteRegion(@PathVariable("regionId") Long regionId) {
		regionRepository.deleteById(regionId);
	}
}
