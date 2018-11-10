package com.taya.reposotory;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.taya.model.Foo;

/**
 * @author Mai Thành Duy An
 */
public interface FooRepository extends CrudRepository<Foo, Long>{

	public List<Foo> findAll();

}
