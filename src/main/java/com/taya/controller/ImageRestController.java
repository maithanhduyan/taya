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

import com.taya.form.ImageForm;
import com.taya.model.Image;
import com.taya.repository.ImageRepository;
import com.taya.repository.ImageRepositoryCustom;

/**
 * @author ManNLM
 */
@RestController
@RequestMapping("/api")
public class ImageRestController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ImageRepository imageRepository;

	@Autowired
	private ImageRepositoryCustom imageRepositoryCustom;

	@RequestMapping("/image")
	@ResponseBody
	public List<Image> getImage() {
		return imageRepository.findAll();
	}

	@RequestMapping("/image/{imageId}")
	@ResponseBody
	public Image getCategoryById(@PathVariable("imageId") Long imageId) {
		Image image = null;
		try {
			image = imageRepository.findById(imageId).get();
		} catch (Exception ex) {
			logger.error(ex.getMessage());
			return image;
		}
		return image;
	}

	@RequestMapping(value = "/image/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Image updateCategory(@RequestBody ImageForm imageForm) {
		return imageRepositoryCustom.addOrUpdate(imageForm);
	}

	@RequestMapping(value = "/image/delete/{imageId}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void deleteImage(@PathVariable("imageId") Long imageId) {
		imageRepository.deleteById(imageId);
	}

}
