package evaluation6;

import jdbc.student_management_durgesh.ConnectionProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Operations{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Student student = new Student();

    //@Override
    public void retrieve() throws IOException {
        boolean f = false;
        boolean b = true;
        while(b) {
            System.out.println("ch: 1  for student, 2 for teacher, 0 to EXIT --");
            int ch = Integer.parseInt(br.readLine());
            switch (ch) {

                case 1:
                    try {

                        Connection connection = ConnectClass.create();
                        String q = "select * from student1;";
                        Statement statement = connection.createStatement();

                        ResultSet resultSet = statement.executeQuery(q);
                        while (resultSet.next()) {
                            int id = resultSet.getInt(1);
//                        br.readLine();
                            String name = resultSet.getString(2);
                            String sub = resultSet.getString(3);
                            String city = resultSet.getString(4);
                            int marks = resultSet.getInt(5);
                            int tid = resultSet.getInt(6);
                            System.out.println("Id: " + id);
                            System.out.println("Name: " + name);
                            System.out.println("sub: " + sub);
                            System.out.println("City: " + city);
                            System.out.println("marks: " + marks);
                            System.out.println("tid: " + tid);
                            System.out.println("----------------------------------");
                        }
                        f = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {

                        Connection connection1 = ConnectClass.create();
                        String q = "select * from teacher1;";
                        Statement statement1 = connection1.createStatement();

                        ResultSet resultSet = statement1.executeQuery(q);
                        while (resultSet.next()) {
                            int tid = resultSet.getInt(1);
                            String tname = resultSet.getString(2);
                            String tsub = resultSet.getString(3);
                            String tcity = resultSet.getString(4);
                            int texp = resultSet.getInt(5);
                            System.out.println("tId: " + tid);
                            System.out.println("tName: " + tname);
                            System.out.println("tsub: " + tsub);
                            System.out.println("tCity: " + tcity);
                            System.out.println("texp: " + texp);
                            System.out.println("-------------------------------------");
                        }
                        f = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("enter valid choice");
                    break;
            }
        }


    }

    //@Override
    public boolean update() throws IOException, SQLException {
        boolean f = false;
        boolean b = true;
        while(b) {
            System.out.println("ch: 1  for student, 2 for teacher, 0 to EXIT --");
            int ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    Connection connection = ConnectClass.create();
                    String q = "update student1 set marks = ? where id = ?;";
                    PreparedStatement preparedStatement = connection.prepareStatement(q);
                    try {
                        System.out.println("enter student id");
                        int id = Integer.parseInt(br.readLine());
                        preparedStatement.setInt(2, (id));
                        System.out.println("enter student marks");
                        int marks = Integer.parseInt(br.readLine());
                        preparedStatement.setInt(1, (marks));
                        preparedStatement.executeUpdate();
                        f = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    Connection connection1 = ConnectClass.create();
                    String q1 = "update teacher1 set tcity = ? where tid = ?;";
                    PreparedStatement preparedStatement1 = connection1.prepareStatement(q1);
                    try {
                        System.out.println("enter teacher id");
                        int id = Integer.parseInt(br.readLine());
                        preparedStatement1.setInt(2, (id));
                        System.out.println("enter teacher city");
                        String city = (br.readLine());
                        preparedStatement1.setString(1, (city));
                        preparedStatement1.executeUpdate();

                        f = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("enter valid choice");
                    break;

            }
        }
        return f;



    }

   // @Override
    public void delete() throws IOException, SQLException {
        boolean f = false;
        boolean b = true;
        while(b) {
            System.out.println("ch: 1  for student, 2 for teacher, 0 to EXIT --");
            int ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    Connection connection = ConnectClass.create();
                    String q = "delete from student1 where id = ?;";
                    PreparedStatement preparedStatement = connection.prepareStatement(q);
                  try{
                        System.out.println("enter student id");
                        int id = 0;
                        id = Integer.parseInt(br.readLine());
                        preparedStatement.setString(1, String.valueOf(id));
                        preparedStatement.executeUpdate();
                        f = true;

                  }catch (Exception e){
                    e.printStackTrace();
                  }
                break;
                case 2:
                    Connection connection1 = ConnectClass.create();
                    String q1 = "delete from teacher1 where tid = ?;";
                    PreparedStatement preparedStatement1 = connection1.prepareStatement(q1);
                    try{
                        System.out.println("enter teacher id");
                        int id = Integer.parseInt(br.readLine());
                        preparedStatement1.setString(1, String.valueOf(id));
                        preparedStatement1.executeUpdate();
                        f = true;
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                break;
                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("enter valid choice");
                    break;
            }
        }

    }

   // @Override
    public static boolean insert() throws SQLException, IOException {
        boolean f = false;
        boolean b = true;
        while(b){
            System.out.println("ch: 1  for student, 2 for teacher, 0 to EXIT --");
            int ch = Integer.parseInt(br.readLine());
        switch(ch) {
            case 1:
                Connection connection = ConnectClass.create();
                String q = "insert into student1 values(?,?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(q);
                try {
                    System.out.println("enter student id");
                    int id = 0;
                    id = Integer.parseInt(br.readLine());
                    preparedStatement.setString(1, String.valueOf(id));
                    System.out.println("enter student name");
                    String name = br.readLine();
                    preparedStatement.setString(2, (name));
                    System.out.println("enter student sub");
                    String sub = (br.readLine());
                    preparedStatement.setString(3, (sub));
                    System.out.println("enter student city");
                    String city = (br.readLine());
                    preparedStatement.setString(4, (city));
                    System.out.println("enter student marks");
                    int marks = Integer.parseInt(br.readLine());
                    preparedStatement.setString(5, String.valueOf(marks));
                    System.out.println("enter student tid");
                    int tid = Integer.parseInt(br.readLine());
                    preparedStatement.setString(6, String.valueOf(tid));
                    preparedStatement.executeUpdate();
                    f = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case 2:
                Connection connection1 = ConnectClass.create();
                String q1 = "insert into teacher1 values(?,?,?,?,?)";
                PreparedStatement preparedStatement1 = connection1.prepareStatement(q1);
                try {
                    System.out.println("enter teacher id");
                    int id = 0;
                    id = Integer.parseInt(br.readLine());
                    preparedStatement1.setString(1, String.valueOf(id));
                    System.out.println("enter teacher name");
                    String name = (br.readLine());
                    preparedStatement1.setString(2, (name));
                    System.out.println("enter teacher sub");
                    String sub = (br.readLine());
                    preparedStatement1.setString(3, (sub));
                    System.out.println("enter teacher city");
                    String city = (br.readLine());
                    preparedStatement1.setString(4, (city));
                    System.out.println("enter teacher exp");
                    int exp = Integer.parseInt(br.readLine());
                    preparedStatement1.setString(5, String.valueOf(exp));
                    preparedStatement1.executeUpdate();
                    f = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 0:
                b = false;
                break;
            default:
                System.out.println("enter valid choice");
                break;
        }

        }

    return f;

    }

   // @Override
    public void query1() throws SQLException {
        try {
            Connection connection = ConnectClass.create();
            String q = "select * from student1 where name like 'z%';";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sub = resultSet.getString(3);
                String city = resultSet.getString(4);
                int marks = resultSet.getInt(5);
                int tid = resultSet.getInt(6);
                //System.out.println(student.toString(id,name,sub,city,marks,tid));
                System.out.println("Id: " + id);
                System.out.println("Name: " + name);
                System.out.println("sub: " + sub);
                System.out.println("City: " + city);
                System.out.println("marks: " + marks);
                System.out.println("tid: " + tid);
                System.out.println("-------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //@Override
    public void query2() {
        try {
        Connection connection = ConnectClass.create();
        String q = "select * from teacher1 where texp>=5;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(q);
            while(resultSet.next()){
                int tid = resultSet.getInt(1);
                String tname = resultSet.getString(2);
                String tsub = resultSet.getString(3);
                String tcity = resultSet.getString(4);
                int texp = resultSet.getInt(5);
                System.out.println("tId: "+tid);
                System.out.println("tName: "+tname);
                System.out.println("tsub: "+tsub);
                System.out.println("tcity: "+tcity);
                System.out.println("texp: "+texp);
                System.out.println("--------------------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

   // @Override
    public void query3() {
        try{
            Connection connection = ConnectClass.create();
            String q = "select * from student1 s join teacher1 t on s.tid=t.tid where tcity in ('pune','mumbai') and tname like '%a';";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(q);
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String sub = resultSet.getString(3);
                String city = resultSet.getString(4);
                int marks= resultSet.getInt(5);
                int stid = resultSet.getInt(6);
                System.out.println("Id: "+id);
                System.out.println("Name: "+name);
                System.out.println("sub: "+sub);
                System.out.println("city: "+city);
                System.out.println("marks: "+marks);
                System.out.println("stId: "+stid);
                System.out.println("--------------");
                int tid = resultSet.getInt(7);
                String tname = resultSet.getString(8);
                String tsub = resultSet.getString(9);
                String tcity = resultSet.getString(10);
                int texp = resultSet.getInt(11);
                System.out.println("tId: "+tid);
                System.out.println("tName: "+tname);
                System.out.println("tsub: "+tsub);
                System.out.println("tcity: "+tcity);
                System.out.println("texp: "+texp);
                System.out.println("--------------------------------------");

            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
