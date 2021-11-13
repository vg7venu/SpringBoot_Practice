package com.springed.demopackage.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDao {
    @Autowired
    JdbcConnection JdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return JdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        JdbcConnection = jdbcConnection;
    }
}
