
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class pruebaConexion {



    private static final String url = "jdbc:mysql://localhost:3306/prueba";
    private static final String user = "root";
    private static final String password = "root";

    public static void main(String[] args) throws SQLException {
//    try {
//        Connection cn = DriverManager.getConnection(url, user, password);
//        System.out.println("Conecto");
//    } catch (Exception e) {
//        System.out.println(e.getMessage());
//        }
String nombre ="Chiquito";
String apellido = "Romero";
int edad= 39;

crearAlumno(nombre,apellido,edad);
    }
    public  static void crearAlumno(String nombre, String apellido, int edad){
      try{
          Connection cn = DriverManager.getConnection(url, user, password);
          PreparedStatement pst = cn.prepareStatement("insert into alumno values(?,?,?,?)");
          pst.setInt(1,3);
          pst.setString(2,nombre);
          pst.setString(3, apellido);
          pst.setInt(4,edad);
          pst.executeUpdate();
      }catch(Exception e){
          System.out.println("no se cargaron los datos");
          System.out.println(e.getMessage());
      }
    }

}

