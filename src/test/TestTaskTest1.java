import org.junit.Assert;
import org.junit.Test;
public class TestTaskTest1 {
    int expect;
    int firstNumber;
    int secondNumber;
    Test1 task;


    @Test
    public void checkMethodLargestNumber() {
        expect = 8;
        secondNumber = 2;
        firstNumber = 8;
        task = new Test1(secondNumber, firstNumber);

        Assert.assertEquals(expect, task.numberIsLarger());
    }

    @Test
    public void checkMethodChangeNumber() {
        expect = 110;
        secondNumber = 10;
        firstNumber = 9;
        task = new Test1(secondNumber, firstNumber);
        Assert.assertEquals(expect, task.changeNumber());
    }

    @Test
    public void checkMethodSum() {
        expect = 100;
        secondNumber = 10;
        firstNumber = 90;
        task = new Test1(secondNumber, firstNumber);
        Assert.assertEquals(expect, task.sum());
    }
}
