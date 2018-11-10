/**
 * TAYAFOOD 2018
 */
package com.taya.dao.production;

import com.taya.model.production.Foo;
import com.taya.model.production.FooForm;

/**
 * @author ManNLM
 */
public interface FooRepositoryCustom {

	public Foo addOrUpdateFoo(FooForm fooForm);
	
	
}
