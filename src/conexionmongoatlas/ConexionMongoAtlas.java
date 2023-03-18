package conexionmongoatlas;

public class ConexionMongoAtlas{

    public static void main(String[] args) {
        
        Connection conexion = new Connection();
        
        conexion.Mostrar();
        conexion.insertar("Real Samesta");
//        System.out.println("Otro");
//        //conexion.Mostrar();
//        System.out.println("Otro mas");
//        //conexion.Actualizar("Nombre", "Zorros");
//        conexion.Eliminar("Zorros");
//        conexion.Mostrar();
        
        
    }
    
}