package com.example.bai02.dao;

import com.example.bai02.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class UserDAO implements IUserDAO {
//    private String jdbcURL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private String URL = "jdbc:mysql://localhost:3306/user_management?useSSL=false";
    private String Username = "root";
    private String Password = "123456";
    //private static final String INSERT_USERS_SQL = "INSERT INTO users (name, email, country) VALUES (?, ?, ?);";
    //    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    //    private static final String SELECT_ALL_USERS = "select * from users";
    //    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    //    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";
    private static final String INSERT_USERS_SQL ="INSERT INTO USERS(NAME,EMAIL,COUNTRY) VALUES (?,?,?);";
    private static final String SELECT_USER_BY_ID = "SELECT ID,NAME,EMAIL,COUNTRY FROM USERS WHERE ID =?";
    private static final String SELECT_ALL_USERS = "SELECT * FROM USERS;";
    private static final String DELETE_USERS_SQL = "DELETE FROM USERS WHERE ID =?;";
    private static final String UPDATE_USERS_SQL = "UPDATE USERS SET NAME =?, EMAIL=?,COUNTRY=? WHERE ID =?;";
    public UserDAO() {
    }

//    protected Connection getConnection() {
//        Connection connection = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return connection;
//    }
    protected Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,Username,Password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    @Override
    public void insertUser(User user) throws SQLException {

    }

    @Override
    public User selectUser(int id) {
        return null;
    }

    @Override
    public List<User> selectAllUsers() {
        return null;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return false;
    }
    //Tạo lớp UserDAO cho phép người dùng thao tác với dữ liệu (Tạo mới, đọc, cập nhật, xoá).


}
