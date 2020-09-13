import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["src/test/resources/cucumber/features"],
    glue = ["bdd.stepsdefinitions"]
)
class TestKukes