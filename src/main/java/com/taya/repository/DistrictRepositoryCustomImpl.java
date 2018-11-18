/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.form.DistrictForm;
import com.taya.model.District;

/**
 * @author ManNLM
 */

@Repository
@Transactional
public class DistrictRepositoryCustomImpl implements DistrictRepositoryCustom {

	@Autowired
	EntityManager entityManager;

	@Autowired
	CrudRepository<District, Long> crud;

	@Override
	public District addOrUpdate(DistrictForm districtForm) {
		District district = entityManager.find(District.class, districtForm.getDistrictid());
		if (district == null) {
			district = new District();
			district.setName(districtForm.getName());
			district.setDistrictcode(districtForm.getDistrictcode());
			district.setActive(districtForm.getActive());
			district.setRegionid(districtForm.getRegionid());
			crud.save(district);
			return district;
		} else {
			district.setName(districtForm.getName());
			district.setDistrictcode(districtForm.getDistrictcode());
			district.setActive(districtForm.getActive());
			district.setRegionid(districtForm.getRegionid());
			entityManager.flush();
		}
		return district;
	}

}
