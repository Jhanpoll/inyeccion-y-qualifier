package com.exampleinyeccion.inyeccion.component;

import org.springframework.stereotype.Component;

@Component
public class NombreImplement implements Nombre{

    @Override
    public void mostrarNombre() {
        System.out.println("jesus jhanpoll");
    }
}
