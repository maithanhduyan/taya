package com.taya.repository;

import com.taya.form.FooForm;
import com.taya.model.Foo;

/**
 * @author Mai Thành Duy An
 */
public interface FooRepositoryCustom {

	public Foo addOrUpdate(FooForm fooForm);
}
