package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //Este metodo recupera los registros de la tabla categoria 
    public List<Categoria> getCategorias(boolean activos);
}
