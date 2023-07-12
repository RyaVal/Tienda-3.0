package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface ProductoService {
    //Este metodo recupera los registros de la tabla producto 
    public List<Producto> getProductos(boolean activos);
    
   // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    // Ejemplo de un metodo que hace una consulta ampliada de JPA
    public List<Producto> consultaAmpliada(double precioI, double precioS);
    
     @Query(value="SELECT a FROM Producto a WHERE a.precio BETWEEN :precioInf AND :precioINF AND :precioSup ORDER a.descripcion ASC")
    public List<Producto> consultaJPQL(double precioI, double precioS);
}


