/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import com.taya.form.DistrictForm;
import com.taya.model.District;

/**
 * @author ManNLM
 */
public interface DistrictRepositoryCustom {

	public District addOrUpdate(DistrictForm districtForm);
}
