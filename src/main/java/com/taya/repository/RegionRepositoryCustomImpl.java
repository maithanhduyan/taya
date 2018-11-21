/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.form.ProductForm;
import com.taya.form.RegionForm;
import com.taya.model.Product;
import com.taya.model.Region;

/**
 * @author ManNLM
 */

@Repository
@Transactional
public class RegionRepositoryCustomImpl implements RegionRepositoryCustom {

	@Autowired
	EntityManager entityManager;

	@Autowired
	CrudRepository<Region, Long> crud;

	@Override
	public Region addOrUpdate(RegionForm regionForm) {

		Region region = entityManager.find(Region.class, regionForm.getRegionid());

		if (region == null) {
			region = new Region();
			region.setRegioncode(regionForm.getRegioncode());
			region.setName(regionForm.getName());
			region.setActive(regionForm.getActive());
			region.setCountryid(regionForm.getCountryid());
			crud.save(region);
			return region;
		} else {
			region.setRegioncode(regionForm.getRegioncode());
			region.setName(regionForm.getName());
			region.setActive(regionForm.getActive());
			region.setCountryid(regionForm.getCountryid());
			entityManager.flush();
		}
		return region;
	}
}
