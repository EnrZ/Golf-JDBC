import java.sql.*;

public class Main {

    //ctrl j shows intellij shortcuts
    public static void main(String[] args) {

        PreparedStatement preparedStatement = null;

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prac", "jdbc_prac", "goodpassword");
            String createTableQuery1 = "CREATE TABLE IF NOT EXISTS PLAYER (pid INTEGER not NULL, name VARCHAR(50),  PRIMARY KEY (pid)) engine=InnoDB";
            preparedStatement = connection.prepareStatement(createTableQuery1);

            int returnValue = preparedStatement.executeUpdate();

            System.out.println("returnValue : " + returnValue);

            String createTableQuery2 =  "CREATE TABLE IF NOT EXISTS COURSE (cid INTEGER not NULL, location VARCHAR(50), name VARCHAR(50), PRIMARY KEY (cid)) engine=InnoDB";
            preparedStatement = connection.prepareStatement(createTableQuery2);
            returnValue = preparedStatement.executeUpdate();

            System.out.println("returnValue : " + returnValue);

        } catch(Exception e){
            e.printStackTrace();
        }
    }


}