/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.form.CountryForm;
import com.taya.model.Country;

/**
 * @author ManNLM
 */
@Repository
@Transactional
public class CountryRepositoryCustomImpl implements CountryRepositoryCustom {

	@Autowired
	EntityManager entityManager;

	@Autowired
	CrudRepository<Country, Long> crud;

	@Override
	public Country addOrUpdate(CountryForm countryForm) {
		
		Country country = entityManager.find(Country.class, countryForm.getCountryid());

		if (country == null) {
			country = new Country();
			country.setA2(countryForm.getA2());
			country.setA3(countryForm.getA3());
			country.setActive(countryForm.getActive());
			country.setIdd(countryForm.getIdd());
			country.setName(countryForm.getName());
			country.setNumber(countryForm.getNumber());
			country.setZiprequired(countryForm.getZiprequired());
			crud.save(country);
			return country;
		} else {
			country.setA2(countryForm.getA2());
			country.setA3(countryForm.getA3());
			country.setActive(countryForm.getActive());
			country.setIdd(countryForm.getIdd());
			country.setName(countryForm.getName());
			country.setNumber(countryForm.getNumber());
			country.setZiprequired(countryForm.getZiprequired());
			entityManager.flush();
		}
		return country;
	}

}
