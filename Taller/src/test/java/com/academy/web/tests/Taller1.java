package com.academy.web.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Taller1 {

    public Logger log = Logger.getLogger(Taller1.class);

    @BeforeSuite(groups = {"group1"})
    public void before () {
        log.info("Entrar a la página");
    }
    
    @Test(groups = {"group2"},priority=2)
    public void iniciarSesion () {
        log.info("Iniciar Sesion");
    }
    
    @Test(groups = {"group1"}, priority=1)
    public void crearCuenta () {
        log.info("Crear Cuenta");
    }
    
    @Test(groups = {"group3"}, priority=3)
    public void cancelarCuenta () {
        log.info("Cancelar Cuenta");
    }
 
    @AfterTest(groups = {"group1", "group2"})
    public void cerrarSesion () {
        log.info("Cerrar Sesión");
    }

}