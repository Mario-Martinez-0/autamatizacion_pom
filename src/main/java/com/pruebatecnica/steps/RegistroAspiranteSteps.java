package com.pruebatecnica.steps;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.pruebatecnica.pagesObjects.RegistroAspirantePageObjects;

import net.serenitybdd.annotations.Step;

public class RegistroAspiranteSteps {

    @Page
    RegistroAspirantePageObjects registroPageObjects;

    @Step("Abrir formulario de registro")
    public void abrirFormulario() {
        registroPageObjects.openUrl("https://demoqa.com/automation-practice-form");
    }

    @Step("Ingresar nombre y apellido")
    public void ingresarNombreApellido() {
        registroPageObjects.inputNombre.type("Juan");
        registroPageObjects.inputApellido.type("Garcia");
    }

    @Step("Ingresar email")
    public void ingresarEmail() {
        registroPageObjects.inputEmail.type("juan.garcia@test.com");
    }

    @Step("Seleccionar genero masculino")
    public void seleccionarGenero() {
        registroPageObjects.radioMasculino.click();
    }

    @Step("Ingresar numero movil")
    public void ingresarMovil() {
        registroPageObjects.inputMovil.type("9876543210");
    }

    @Step("Ingresar fecha de nacimiento")
    public void ingresarFechaNacimiento() {
        registroPageObjects.inputFechaNacimiento.click();
        registroPageObjects.inputFechaNacimiento.sendKeys(Keys.chord(Keys.CONTROL, "a"), "10 Jul 1999");
        registroPageObjects.inputFechaNacimiento.sendKeys(Keys.ENTER);
    }

    @Step("Ingresar materia")
    public void ingresarMateria() {
        registroPageObjects.inputMateria.sendKeys("Maths");
        registroPageObjects.inputMateria.sendKeys(Keys.ENTER);
    }

    @Step("Seleccionar hobby Deportes")
    public void seleccionarHobby() {
        registroPageObjects.checkboxDeportes.click();
    }

    @Step("Cargar foto de perfil")
    public void cargarFoto() {

        String rutaImagen = "C:\\Users\\USUARIO\\Desktop\\Reto_Tecnico\\src\\main\\resources\\WhatsApp.jpeg";
        registroPageObjects.inputFoto.sendKeys(rutaImagen);
    }

    @Step("Ingresar direccion actual")
    public void ingresarDireccion() {
        registroPageObjects.textAreaDireccion.type("Calle 123, Bogota, Colombia");
    }

    @Step("Seleccionar estado NCR y ciudad Delhi")
    public void seleccionarEstadoCiudad() {
        registroPageObjects.dropdownEstado.click();
        registroPageObjects.inputEstado.sendKeys("NCR");
        registroPageObjects.inputEstado.sendKeys(Keys.ENTER);
        registroPageObjects.dropdownCiudad.click();
        registroPageObjects.inputCiudad.sendKeys("Delhi");
        registroPageObjects.inputCiudad.sendKeys(Keys.ENTER);
    }

    @Step("Clic en boton Submit")
    public void enviarFormulario() {
        ((JavascriptExecutor) registroPageObjects.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", registroPageObjects.buttonEnviar);
        registroPageObjects.buttonEnviar.click();
    }

    @Step("Validar confirmacion de registro exitoso")
    public void validarConfirmacion() {
        Assert.assertThat(
                registroPageObjects.labelConfirmacion.isDisplayed(),
                Matchers.is(true)
        );
        Assert.assertThat(
                registroPageObjects.labelConfirmacion.getText(),
                Matchers.containsString("Thanks for submitting the form")
        );
    }

}
