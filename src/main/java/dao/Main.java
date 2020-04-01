package dao;

public class Main {
    public static void main(String[] args) {
        UserDao userDAO = new UserDao();

        userDAO.findById(2);
        System.out.println(userDAO.findById(2).toString());
    }
}
