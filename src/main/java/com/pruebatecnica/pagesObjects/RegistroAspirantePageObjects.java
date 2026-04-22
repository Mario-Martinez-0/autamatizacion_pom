package com.pruebatecnica.pagesObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistroAspirantePageObjects extends PageObject {

    @FindBy(how = How.ID, using = "firstName")
    public WebElementFacade inputNombre;

    @FindBy(how = How.ID, using = "lastName")
    public WebElementFacade inputApellido;

    @FindBy(how = How.ID, using = "userEmail")
    public WebElementFacade inputEmail;

    @FindBy(how = How.CSS, using = "label[for='gender-radio-1']")
    public WebElementFacade radioMasculino;

    @FindBy(how = How.ID, using = "userNumber")
    public WebElementFacade inputMovil;

    @FindBy(how = How.ID, using = "dateOfBirthInput")
    public WebElementFacade inputFechaNacimiento;

    @FindBy(how = How.ID, using = "subjectsInput")
    public WebElementFacade inputMateria;

    @FindBy(how = How.CSS, using = "label[for='hobbies-checkbox-1']")
    public WebElementFacade checkboxDeportes;

    @FindBy(how = How.ID, using = "uploadPicture")
    public WebElementFacade inputFoto;

    @FindBy(how = How.ID, using = "currentAddress")
    public WebElementFacade textAreaDireccion;

    @FindBy(how = How.ID, using = "state")
    public WebElementFacade dropdownEstado;

    @FindBy(how = How.ID, using = "react-select-3-input")
    public WebElementFacade inputEstado;

    @FindBy(how = How.ID, using = "city")
    public WebElementFacade dropdownCiudad;

    @FindBy(how = How.ID, using = "react-select-4-input")
    public WebElementFacade inputCiudad;

    @FindBy(how = How.ID, using = "submit")
    public WebElementFacade buttonEnviar;

    @FindBy(how = How.ID, using = "example-modal-sizes-title-lg")
    public WebElementFacade labelConfirmacion;

}
