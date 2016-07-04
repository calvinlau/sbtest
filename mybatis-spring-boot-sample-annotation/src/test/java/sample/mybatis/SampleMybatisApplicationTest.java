package sample.mybatis;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleMapperApplication.class)
public class SampleMybatisApplicationTest {

    @ClassRule
    public static OutputCapture out = new OutputCapture();

    @Test
    public void test() {
        String output = out.toString();
        assertTrue("Wrong output: " + output, output.contains("1,San Francisco,CA,US"));
    }

}