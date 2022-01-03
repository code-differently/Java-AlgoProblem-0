package cd.rr.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgoProblem0Test {

    @Test
    public void testOne(){
        AlgoProblem0 algoProblem0 = new AlgoProblem0();

        String expected = "*****";
        String actual = algoProblem0.asterisks(5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        AlgoProblem0 algoProblem0 = new AlgoProblem0();

        String expected = "**********";
        String actual = algoProblem0.asterisks(10);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        AlgoProblem0 algoProblem0 = new AlgoProblem0();

        String expected = "****************************************";
        String actual = algoProblem0.asterisks(40);

        Assertions.assertEquals(expected,actual);
    }

}