package com.pruebatecnica.stepDefinitions;

import com.pruebatecnica.steps.RegistroAspiranteSteps;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;

public class RegistroAspiranteStepDefinitions {

    @Steps
    RegistroAspiranteSteps registroSteps;

    @Dado("que el aspirante abre el formulario de registro")
    public void queElAspiranteAbreElFormularioDeRegistro() {
        registroSteps.abrirFormulario();
    }

    @Cuando("el aspirante diligencia sus datos personales")
    public void elAspiranteDiligenciaSusDatosPersonales() {
        registroSteps.ingresarNombreApellido();
        registroSteps.ingresarEmail();
        registroSteps.seleccionarGenero();
        registroSteps.ingresarMovil();
        registroSteps.ingresarFechaNacimiento();
    }

    @Cuando("el aspirante diligencia su informacion adicional")
    public void elAspiranteDiligenciaSuInformacionAdicional() {
        registroSteps.ingresarMateria();
        registroSteps.seleccionarHobby();
        registroSteps.cargarFoto();
        registroSteps.ingresarDireccion();
        registroSteps.seleccionarEstadoCiudad();
    }

    @Cuando("el aspirante envia el formulario")
    public void elAspiranteEnviaElFormulario() {
        registroSteps.enviarFormulario();
    }

    @Entonces("puede visualizar la confirmacion del registro")
    public void puedeVisualizarLaConfirmacionDelRegistro() {
        registroSteps.validarConfirmacion();
    }

}
