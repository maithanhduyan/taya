/**
 * TAYAFOOD 2018
 */
package com.taya.reposotory;

import com.taya.form.CountryForm;
import com.taya.model.Country;

/**
 * @author ManNLM
 */
public interface CountryRepositoryCustom {

	public Country addOrUpdate(CountryForm countryForm);
	
}
