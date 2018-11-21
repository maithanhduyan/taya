/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.taya.form.UserForm;
import com.taya.model.User;

/**
 * @author ManNLM
 */

@Repository
@Transactional
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

	@Autowired
	EntityManager entityManager;

	@Autowired
	CrudRepository<User, Long> crud;

	@Override
	public User addOrUpdate(UserForm userForm) {

		User user = entityManager.find(User.class, userForm.getUserid());

		if (user == null) {
			user = new User();
			user.setAddress(userForm.getAddress());
			user.setCreatedate(userForm.getCreatedate());
			user.setDob(userForm.getDob());
			user.setEmail(userForm.getEmail());
			user.setFirstname(userForm.getFirstname());
			user.setLastname(userForm.getLastname());
			user.setModifieddate(userForm.getModifieddate());
			user.setPassword(userForm.getPassword());
			user.setPhone(userForm.getPhone());
			user.setUseruuid(userForm.getUseruuid());
			crud.save(user);
			return user;
		} else {

			entityManager.flush();
		}
		return user;
	}
}
