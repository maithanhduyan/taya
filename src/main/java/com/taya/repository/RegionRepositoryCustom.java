/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import com.taya.form.RegionForm;
import com.taya.model.Region;

/**
 * @author ManNLM
 */
public interface RegionRepositoryCustom {

	public Region addOrUpdate(RegionForm regionForm);

}
