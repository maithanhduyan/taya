/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import com.taya.form.ImageForm;
import com.taya.model.Image;

/**
 * @author ManNLM
 */
public interface ImageRepositoryCustom {

	public Image addOrUpdate(ImageForm imageForm);

}
