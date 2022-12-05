package java.by.step.maven.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class BaseTestClass {

    @Autowired
    BaseData baseData;
}
