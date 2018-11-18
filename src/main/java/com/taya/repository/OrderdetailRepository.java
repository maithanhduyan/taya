/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taya.model.Orderdetail;

/**
 * @author ManNLM
 */
public interface OrderdetailRepository extends CrudRepository<Orderdetail, Long> {

	public List<Orderdetail> findAll();

}
