package com.example.world.hello.model.mapper;

import com.example.world.hello.model.User;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserMapper implements RowMapper<User>{

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("ID"));
        user.setName(resultSet.getString("NAME"));
        user.setRegisteredDate(resultSet.getDate("REGISTERDATE"));
        return user;
    }
}
