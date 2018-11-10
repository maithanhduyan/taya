package com.taya.reposotory;

import com.taya.model.Foo;
import com.taya.model.FooForm;

/**
 * @author Mai Thành Duy An
 */
public interface FooRepositoryCustom {

	public Foo addOrUpdate(FooForm fooForm);
}
