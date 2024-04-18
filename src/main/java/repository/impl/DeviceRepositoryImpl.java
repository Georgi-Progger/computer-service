import entity.Device;
import repository.DeviceRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeviceRepositoryImpl implements DeviceRepository {

    private Connection connection;

    public DeviceRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Device saveNewEntity(Device entity) {
        String sql = "INSERT INTO devices (device_name, technical_specifications) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, entity.getDeviceName());
            statement.setString(2, entity.getTechnicalSpecifications());
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating device failed, no rows affected.");
            }
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    entity.setId(generatedKeys.getLong(1));
                    return entity;
                } else {
                    throw new SQLException("Creating device failed, no ID obtained.");
                }
            }
        } catch (SQLException e) {
            // Handle exceptions
        }
        return null;
    }

    @Override
    public void updateEntity(Device entity) {
        String sql = "UPDATE devices SET device_name = ?, technical_specifications = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, entity.getDeviceName());
            statement.setString(2, entity.getTechnicalSpecifications());
            statement.setLong(3, entity.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.getErrorCode();
        }
    }

    @Override
    public void deleteEntity(Long id) {
        String sql = "DELETE FROM devices WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.getErrorCode();
        }
    }

    @Override
    public Device getById(Long id) {
        String sql = "SELECT * FROM devices WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Device(resultSet.getLong("id"), resultSet.getString("device_name"),
                        resultSet.getString("technical_specifications"));
            }
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return null;
    }

    @Override
    public List<Device> getAll() {
        List<Device> devices = new ArrayList<>();
        String sql = "SELECT * FROM devices";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Device device = new Device(resultSet.getLong("id"), resultSet.getString("device_name"),
                        resultSet.getString("technical_specifications"));
                devices.add(device);
            }
        } catch (SQLException e) {
            // Handle exceptions
        }
        return devices;
    }
}
