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

import com.taya.form.CountryForm;
import com.taya.model.Country;
import com.taya.repository.CountryRepository;
import com.taya.repository.CountryRepositoryCustom;

/**
 * @author ManNLM
 */

@RestController
@RequestMapping("/api")
public class CountryRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private CountryRepositoryCustom countryRepositoryCustom;

	@RequestMapping("/country")
	@ResponseBody
	public List<Country> getCountry() {
		return countryRepository.findAll();
	}

	@RequestMapping("/country/{countryId}")
	@ResponseBody
	public Country getCountryById(@PathVariable("countryId") Long countryId) {
		Country country = null;
		try {
			country = countryRepository.findById(countryId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return country;
		}
		return country;
	}

	@RequestMapping(value = "/country/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Country updateCountry(@RequestBody CountryForm countryForm) {
		return countryRepositoryCustom.addOrUpdate(countryForm);
	}

	@RequestMapping(value = "/country/delete/{countryId}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteCountry(@PathVariable("countryId") Long countryId) {
		countryRepository.deleteById(countryId);
	}

}
