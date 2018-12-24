package dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setDataSource(dataSource());
        return userDao;
    }

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

//        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
//        dataSource.setUrl("jdbc:mysql://localhost/springbook");
//        dataSource.setUsername("jko");
//        dataSource.setPassword("123456789");

        return dataSource;
    }
}
