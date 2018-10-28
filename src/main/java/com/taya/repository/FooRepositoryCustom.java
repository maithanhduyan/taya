/**
 * TAYAFOOD 2018
 */
package com.taya.repository;

import com.taya.model.Foo;
import com.taya.model.FooForm;

/**
 * @author AnMTD
 */

public interface FooRepositoryCustom {

	public Foo addOrUpdateFoo(FooForm fooForm);
	
	
}
