package com.hackyeah.repository;

import org.hibernate.dialect.PostgreSQL94Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;

public class MedianPostgresqlDialect extends PostgreSQL94Dialect {

	public MedianPostgresqlDialect() {
		super();
		registerFunction("median", new StandardSQLFunction("median"));
	}
}
