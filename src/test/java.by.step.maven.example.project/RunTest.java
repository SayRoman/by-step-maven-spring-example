package java.by.step.maven.example.project;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RunTest extends BaseTestClass {


    @Test
    public void mock () {

        Assertions.assertEquals(1,2);
    }

    @Autowired
    Listener listener;
}
