package com.FixNow.FixNow.service;

import com.FixNow.FixNow.repository.repositorioFix;
import java.util.List;
import com.FixNow.FixNow.modeloincidencia;
public class serviceFix {
    private final repositorioFix repository = new repositorioFix();

    
    public serviceFix() {
    }

    public List<modeloincidencia>obtenerlista(){
        return repository.obtenerlista();
    }

   public void eliminar(int id){
        repository.eliminarincidencia(id);
   }
   public void modificarincidencia(int antid , int newid){
        repository.modificarincidencia(antid, newid);
   }

   
   

}
