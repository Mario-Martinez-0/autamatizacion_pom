package com.pruebatecnica.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/RegistroAspirante.feature",
        tags = "@RegistroAspirante",
        glue = "com.pruebatecnica.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RegistroAspiranteRunner {
}
