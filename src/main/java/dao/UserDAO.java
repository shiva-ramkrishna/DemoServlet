package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.User;

public class UserDAO {
	private String jdbcURL="jdbc:mysql://0.0.0.0:3306/demo?useSSL=false";
	private String jdbcUsername = "root";
    private String jdbcPassword = "root";
    
    
    private static final String INSERT_USERS_SQL="INSERT INTO user (name,email,country) VALUES (?,?,?);";
    private static final String SELECT_USERS_BY_ID="SELECT * FROM user where id = ?;";
    private static final String SELECT_ALL_USERS_SQL="SELECT * FROM user";
    private static final String DELETE_USERS_SQL="DELETE FROM user WHERE id=?;";
    private static final String UPDATE_USERS_SQL="UPDATE user SET name=?,email=?,country=? WHERE id=?;";
    
    public Connection getConnection()
    {
    	Connection connection=null;
    	try
    	{
    		Class.forName("com.mysql.jdbc.Driver");
    		connection=DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
    		
    	}
    	catch (SQLException e) {
    		e.printStackTrace();
		}
    	catch (Exception e) {
    		
		}
    	return connection;
    }
    
    
    public void inserUser(User user) throws SQLException{
    	System.out.println(INSERT_USERS_SQL);
    	try(Connection connection = getConnection();
    			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL))
    	{
    		preparedStatement.setString(1, user.getName());
    		preparedStatement.setString(2, user.getEmail());
    		preparedStatement.setString(3, user.getCountry());
    		System.out.println(preparedStatement);
    		preparedStatement.executeUpdate();
    		
    		
    	}catch (Exception e) {
    		e.printStackTrace();
		}
    }
    
    
}
