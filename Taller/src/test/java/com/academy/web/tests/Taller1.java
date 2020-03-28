package com.academy.web.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class Taller1 {

    public Logger log = Logger.getLogger(Taller1.class);

    @BeforeSuite(groups = {"group1"})
    public void before () {
        log.info("Entrar a la página. Debe Tener Usuario");
    }
    
    @BeforeMethod(groups = {"grouptest"})
    public void iniciarSesion () {
        log.info("Iniciar Sesion");
    }

    @BeforeMethod(groups = {"group2"})
    public void verificarCuenta () {
        log.info("Verificar que la cuenta existe");
    }

    @Test(groups = {"group1"}, priority=1)
    public void crearCuenta () {
        log.info("Crear Cuenta");
    }

    @Test(groups = {"group2"}, priority=2)
    public void cancelarCuenta () {
        log.info("Cancelar Cuenta");
    }

    
    @AfterMethod(groups = {"grouptest"})
    public void cerrarSesion () {
        log.info("Cerrar Sesión");
    }

}
