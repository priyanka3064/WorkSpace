package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)				
@CucumberOptions(features="./src/main/java/CucumberProject",glue={"stepDef"})						

public class Runner {

}
