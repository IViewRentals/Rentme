package com.example.rentsummary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.UUID;

@SpringBootTest
class RentsummaryApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {

    }

    @Test
    void getConnection() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

}
