
package conexionmongoatlas;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.BasicDBObject;

public class Connection {
    
    DB BaseDatos;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject ();

    public Connection(){
        Mongo mongo = new Mongo("mongodb+srv://migaelsa2q34@gmail.com:1234@cluster0.n7zvl9r.mongodb.net/?retryWrites=true&w=majority");
        BaseDatos =mongo.getDB("GaelDSM502");
        coleccion =BaseDatos.getCollection("Equipos");
        System.out.println("Conexion exitosa");
        
    }
    
    public boolean insertar(String nombre){
        document.put("Nombre",nombre);
        coleccion.insert(document);
        return true;
    }
    public void Mostrar(){
        DBCursor cursor = coleccion.find();
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
    
    public boolean Actualizar(String nombreViejo, String nombreNuevo){
        
        document.put("Nombre", nombreViejo);
        BasicDBObject documentoNuevo = new BasicDBObject();
        documentoNuevo.put("Nombre", nombreNuevo);
        coleccion.findAndModify(document, documentoNuevo);
        return true;
    }
    
    public boolean Eliminar(String nombre){
        document.put("Nombre", nombre);
        coleccion.remove(document);
        return true;
    }
    
}