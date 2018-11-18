/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.form.ImageForm;
import com.taya.model.Image;

/**
 * @author ManNLM
 */
@Repository
@Transactional
public class ImageRepositoryCustomImpl implements ImageRepositoryCustom {

	@Autowired
	EntityManager entityManager;

	@Autowired
	CrudRepository<Image, Long> crud;

	@Override
	public Image addOrUpdate(ImageForm imageForm) {

		Image image = entityManager.find(Image.class, imageForm.getImageid());

		if (image == null) {
			image = new Image();
			image.setImagename(imageForm.getImagename());
			image.setImagedata(imageForm.getImagedata());
			image.setProductid(image.getProductid());
			crud.save(image);
			return image;
		} else {
			image.setImagename(imageForm.getImagename());
			image.setImagedata(imageForm.getImagedata());
			image.setProductid(image.getProductid());
			entityManager.flush();
		}
		return image;
	}
}
