/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import com.taya.form.UserForm;
import com.taya.model.User;

/**
 * @author ManNLM
 */
public interface UserRepositoryCustom {

	public User addOrUpdate(UserForm userForm);

}
