package View;

import org.junit.Assert;

import static org.junit.Assert.*;

public class ViewControllerTest {
    @org.junit.Test
    public void calculateISBN(){
        ViewController newController = new ViewController();
        String ExpectedResult = "013031997X";
        Assert.assertEquals("ERROR CALCULATING ISBN 10!",ExpectedResult,newController.CalculateISBN("013031997"));
        System.out.println(newController.CalculateISBN("013031997"));
    }

}