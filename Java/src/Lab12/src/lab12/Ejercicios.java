package lab12;

//Para usar base de datos es importa esta libreria
import java.sql.*;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ejercicios {

    /*public static void main(String[] args) {
        
        try {
            //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ejercicio_1", "root", "root");

            //here sonoo is database name, root is username and password 
            //Aqui usamos el obejeto "con" y creamos una sentencia "stmt" tipo Statement
            Statement stmt = con.createStatement();

            //Usamos el el objeto tipo sentencia y lo guardado en el objeto tipo ResultSet
            ResultSet rs = stmt.executeQuery("select * from cursos");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("IdCurso");
            model.addColumn("Descripcion");
            model.addColumn("Creditos");
            TMostrar.setModel(model);
            
            String[] datos = new String[3];
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                model.addRow(datos);
            }

            con.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }
        
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/

    /*public void mostrar(String tabla) {
        String sql = "select * from " + tabla;
        Statement st;
        
        //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ejercicio_1", "root", "root");
        
        //conexion con =new conexion();
        //Connection conexion = con.conectar();
        System.out.println("sql");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("IdCurso");
        model.addColumn("Descripcion");
        model.addColumn("Creditos");
        
        TMostrar.setModel(model);

        String[] datos = new String[3];

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                model.addRow(datos);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }

    }*/

    /*public static void main(String[] args) {

        try {
            //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");
            

            //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ejercicio_1", "root", "root");

            //here sonoo is database name, root is username and password 
            //Aqui usamos el obejeto "con" y creamos una sentencia "stmt" tipo Statement
            Statement stmt = con.createStatement();
            
            //Usamos el el objeto tipo sentencia y lo guardado en el objeto tipo ResultSet
            ResultSet rs = stmt.executeQuery("select * from cursos");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
    
    
 /*/////Interface Rowsset/////
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Creating and Executing RowSet
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3307/ejercicio_1");
        rowSet.setUsername("root");
        rowSet.setPassword("root");

        rowSet.setCommand("select * from cursos");
        rowSet.execute();

        while (rowSet.next()) {
            // Generating cursor Moved event
            System.out.println("IdCurso: " + rowSet.getInt(1));
            System.out.println("Descripcion: " + rowSet.getString(2));
            System.out.println("Creditos: " + rowSet.getInt(3));
        }

    }*/
    
    
 /*/////Interface Prepared Statement////
    public static void main(String[] args) {

        try {
            //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/actividad_01", "root", "root");

            //here actividad_01 is database name, root is username and password 
            //Aqui creamos una sentencia "stmt" tipo PreparedStatement
            PreparedStatement stmt = con.prepareStatement("insert into cursos values(?,?,?)");

            stmt.setInt(1,7);//1 specifies the first parameter in the query
            stmt.setString(2, "Big data");
            stmt.setInt(3, 4);

            //Cantidad de registros insertados
            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }*/
 /*//CallableStatement para Procedimientos almacenados
    public static void main(String[] args) {

        try {
            //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/actividad_01", "root", "root");

            //here actividad_01 is database name, root is username and password 
            //Aqui usamos el obejeto "con" y creamos una sentencia "stmt" tipo Statement
            CallableStatement stmt = con.prepareCall("{call creditos_mayores_04()}");
            stmt.execute();
            con.close();

            System.out.println("Se ejecuto correctamente el procedimiento almacenado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
 /*//CallableStatement para funciones
    public static void main(String[] args) {

        try {
            //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/actividad_01", "root", "root");

            //here actividad_01 is database name, root is username and password 
            //Aqui usamos el obejeto "con" y creamos una sentencia "stmt" tipo Statement
            CallableStatement stmt = con.prepareCall("{call num_letras(?)}");
            stmt.registerOutParameter(1, Types.VARCHAR);
            stmt.setString(2,"a");
            stmt.execute();
            con.close();

            System.out.println("Se ejecuto correctamente la funcion");
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/

 /*/////Transacciones/////
    public static void main(String[] args) {

        try {
            //Usamos la clase controlador "com.mysql.cj.jdbc.Driver"
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Instanciamos "con" que almacenará la url de la conexión, usuario y contraseña
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/ejercicio_01", "root", "root");

            //here actividad_01 is database name, root is username and password 
            con.setAutoCommit(false);

            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into cursos values(8,'Inteligencia artificial',5)");
            stmt.executeUpdate("insert into cursos values(9,'Desarrollo web',4)");

            con.commit();
            System.out.println("Se insertaron los 2 registros");
            
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
}
