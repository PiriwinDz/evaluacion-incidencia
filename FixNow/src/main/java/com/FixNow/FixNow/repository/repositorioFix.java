package com.FixNow.FixNow.repository;
import java.util.ArrayList;
import java.util.List;
import com.FixNow.FixNow.modeloincidencia;


public class repositorioFix {
    private List<modeloincidencia>listaincidencia = new ArrayList<>();

    

    public void repositorio(){
         modeloincidencia.add(listaincidencia);
         

    }

    public List <modeloincidencia>obtenerlista(){
        return listaincidencia;
    }

    public void eliminarincidencia(int id){
        listaincidencia.remove(id);
    }

    public void modificarincidencia(int antid , int newid ){
        int index=listaincidencia.indexOf(antid);
        if(index !=-1){
            listaincidencia.set(index, null);
        }

    
    
    }
    public void agregarincidencia()

}

