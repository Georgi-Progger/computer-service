package repository.impl;

import config.ConnectionFactory;
import entity.User;
import repository.UserRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public User getById(Long id) {
        String query = "SELECT * FROM USERS WHERE id = ?";
        try {
            PreparedStatement preparedStatement = ConnectionFactory.getConnection().prepareStatement(query);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                Integer departmentId = resultSet.getInt("department_id");

                return new User(firstName, lastName, email, departmentId);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static User getById2(Long id) {
        String query = "SELECT * FROM USERS WHERE id = ?";
        try {
            PreparedStatement preparedStatement = ConnectionFactory.getConnection().prepareStatement(query);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                Integer departmentId = resultSet.getInt("department_id");

                return new User(firstName, lastName, email, departmentId);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User saveNewEntity(User entity) {
        return null;
    }

    public static void main(String[] args) {

        System.out.println(getById2(1L));
    }
}
