package com.dermotherlihy.account.infrastructure.jdbc;

import com.dermotherlihy.account.domain.model.Sex;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.Argument;
import org.skife.jdbi.v2.tweak.ArgumentFactory;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 25/02/2014
 * Time: 19:17
 * To change this template use File | Settings | File Templates.
 */
public class SexAsStringArgument implements ArgumentFactory<Sex> {


        @Override
        public boolean accepts(Class<?> expectedType, Object value, StatementContext ctx)
        {
            return value != null && Sex.class.isAssignableFrom(value.getClass());
        }

        @Override
        public Argument build(Class<?> expectedType, final Sex value, StatementContext ctx) {

            return new Argument()
            {
                @Override
                public void apply(int position, PreparedStatement statement, StatementContext ctx) throws SQLException
                {
                    statement.setString(position, String.valueOf(value.getCode()));
                }
            };

        }
}
