#language:es
Característica: Registro de aspirante en formulario
  Yo como aspirante quiero registrar mis datos en el
  formulario de registro Student Registration Form

  @RegistroAspirante @Regresion
  Escenario: Registro exitoso del aspirante en el formulario
    Dado que el aspirante abre el formulario de registro
    Cuando el aspirante diligencia sus datos personales
    Y el aspirante diligencia su informacion adicional
    Y el aspirante envia el formulario
    Entonces puede visualizar la confirmacion del registro
