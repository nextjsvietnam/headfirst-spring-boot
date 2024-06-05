package net.refactoreverything.headfirstspringboot.repository;

import net.refactoreverything.headfirstspringboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbcTemplate() {
        return jdbc;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public User save(User user) {
        System.out.println("Save user into database " + user.getClass().getTypeName());
        String sql = "INSERT INTO \"users\" ( username, password, email, firstName, lastName) VALUES(?,?,?,?,?)";
        int rows = jdbc.update(sql, user.getUsername(), user.getEmail(), user.getPassword(), user.getFirstName(), user.getLastName());
        System.out.println("Rows inserted: " + rows);
        return user;
    }

    public List<User> findAll() {

        String sql = "SELECT * FROM \"users\"";

//        RowMapper<User> rowMapper = new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//                User user = new User();
//                user.setId(rs.getInt("id"));
//                user.setUsername(rs.getString("username"));
//                user.setEmail(rs.getString("email"));
//                user.setPassword(rs.getString("password"));
//                user.setFirstName(rs.getString("firstName"));
//                user.setLastName(rs.getString("lastName"));
//                return user;
//            }
//        };

        return jdbc.query(sql, (rs, rowNum) -> {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            user.setFirstName(rs.getString("firstName"));
            user.setLastName(rs.getString("lastName"));
            return user;
        });
    }
}
