package br.com.fluentvalidator.builder;

import java.util.function.Predicate;

public interface Message<T, P, W extends When<T, P, W>> {

	Code<T, P, W> withCode(final String code);

	FieldName<T, P, W> withFieldName(final String fieldName);
	
	Critical<T, P, W> critical();	
	
	W when(final Predicate<P> predicate);
	
}
