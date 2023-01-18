import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class calculatortest {
    Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator =new Calculator();
    }

    @Test
    public void sumtest(){
        double sumResult= calculator.sum(1.5,3.6);
        Assertions.assertEquals(5.1,sumResult);
    }
    @Test
    public void removaltest(){
        double removalResult= calculator.removal(3.0,2.0);
        Assertions.assertEquals(1.0,removalResult);
    }
    @Test
    public void divisiontest(){
        double divisionResult= calculator.division(3.0,1.0);
        Assertions.assertEquals(3.0,divisionResult);
    }
    @Test
    public void crashtest(){
        double crashResult= calculator.crash(3.0,1.0);
        Assertions.assertEquals(3.0,crashResult);
    }
}
