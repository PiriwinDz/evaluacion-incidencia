package com.FixNow.FixNow.repository;
import java.util.ArrayList;
import java.util.List;
import com.FixNow.FixNow.modeloincidencia;


public class repositorioFix {
    private List<modeloincidencia> listaincidencia = new ArrayList<>();

    public List<modeloincidencia> obtenerlista() {
        return listaincidencia;
    }

    public void eliminarincidencia(int id) {
        listaincidencia.removeIf(inc -> inc.getId() == id);
    }

    public void modificarincidencia(int oldId, int newId) {
        for (modeloincidencia inc : listaincidencia) {
            if (inc.getId() == oldId) {
                inc.setId(newId);
                break;
            }
        }
    }

    public void agregarincidencia(modeloincidencia inc) {
        if (inc.getId() <= 0) {
            int nextId = listaincidencia.stream()
                .mapToInt(modeloincidencia::getId)
                .max()
                .orElse(0) + 1;
            inc.setId(nextId);
        }
        listaincidencia.add(inc);
    }
}

