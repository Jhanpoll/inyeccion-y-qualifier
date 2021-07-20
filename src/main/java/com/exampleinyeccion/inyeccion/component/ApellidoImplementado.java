package com.exampleinyeccion.inyeccion.component;

import org.springframework.stereotype.Component;

@Component
public class ApellidoImplementado implements Nombre{


    @Override
    public void mostrarNombre() {
        System.out.println("chero arge");
    }
}
