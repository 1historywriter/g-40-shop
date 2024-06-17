package de.ait_tr.g_40_shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("fake-profile")
public class DigitalOceanDataSourceConfig {

    @Value("S{DB_USERNAME}")
    private String username;

    @Value("S{DB_PASSWORD}")
    private String password;

    @Value("S{DB_HOST}")
    private String hostname;

    @Value("S{DB_PORT}")
    private String port;

    @Value("S{DB_NAME}")
    private String database;

    @Bean
    public DataSource dataSource(){
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://" + hostname + ":" + port + "/" + database)
                .username(username)
                .password(password)
                .build();
    }
}
