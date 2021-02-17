package com.yamilov.raiffeisen.devportal;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@All",
        features = {"src/test/java/com/yamilov/raiffeisen/devportal/features/"},
        glue = "com.yamilov.raiffeisen.devportal.steps",
        plugin = "pretty",
        monochrome = true
)
public class RunCucumberTest {
}
