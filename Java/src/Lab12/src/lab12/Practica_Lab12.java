package lab12;

//Para usar base de datos es importa esta libreria
import java.sql.*;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Practica_Lab12 {

    /*
    public static void main(String[] args) {

        try {
            //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonoo", "root", "root");

            //here sonoo is database name, root is username and password 
            //Aqui usamos el obejeto "con" y creamos una sentencia "stmt" tipo Statement
            Statement stmt = con.createStatement();
            
            //Usamos el el objeto tipo sentencia y lo guardado en el objeto tipo ResultSet
            ResultSet rs = stmt.executeQuery("select * from emp");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
 /*  /////Interface Rowsset/////
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Creating and Executing RowSet
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3307/sonoo");
        rowSet.setUsername("root");
        rowSet.setPassword("root");

        rowSet.setCommand("select * from emp");
        rowSet.execute();

        while (rowSet.next()) {
            // Generating cursor Moved event
            System.out.println("Id: " + rowSet.getInt(1));
            System.out.println("Name: " + rowSet.getString(2));
            System.out.println("Age: " + rowSet.getInt(3));
        }

    }
}*/
 /*
    /////Interface Prepared Statement////
    public static void main(String[] args) {

        try {
            //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonoo", "root", "root");

            //here sonoo is database name, root is username and password 
            //Aqui creamos una sentencia "stmt" tipo PreparedStatement
            PreparedStatement stmt = con.prepareStatement("insert into Emp values(?,?,?)");

            stmt.setInt(1, 101);//1 specifies the first parameter in the query
            stmt.setString(2, "Ratan");
            stmt.setInt(3, 44);

            //Cantidad de registros insertados
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }*/
 /*
    //CallableStatement para Procedimientos almacenados y funciones
    public static void main(String[] args) {

        try {
            //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonoo", "root", "root");

            //here sonoo is database name, root is username and password 
            //Aqui usamos el obejeto "con" y creamos una sentencia "stmt" tipo Statement
            CallableStatement stmt = con.prepareCall("{call p_mostrar()}");
            stmt.execute();
            con.close();

            System.out.println("Se ejecuto correctamente el procedimiento almacenado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     */
    /*/////Transacciones/////
    public static void main(String[] args) {

        try {
            //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonoo", "root", "root");

            //here sonoo is database name, root is username and password 
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into emp values(190,'abhi',40)");
            stmt.executeUpdate("insert into emp values(191,'umesh',50)");

            con.commit();
            System.out.println("Se insertaron los 2 registros");
            
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }*/

}
