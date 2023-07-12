package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoDao extends JpaRepository<Producto,Long>{
    
    
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioI, double precioS);
    
    
    @Query(value="SELECT a FROM Producto a WHERE a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> conlsultaConJPQL(double precioInf, double precioSup);
    
    @Query(nativeQuery=true,
            value="SELECT * FROM producto a WHERE a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Producto> conlsultaConSQL(double precioInf, double precioSup);
}
