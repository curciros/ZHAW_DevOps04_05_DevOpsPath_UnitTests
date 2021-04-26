package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class AlterCheckTest {

    @Test

    public void alterCheckKind(){
        AlterCheck ac = new AlterCheck();
        Assert.assertEquals("Kind", ac.alterCheck(10));
    }
    @Test

    public void alterCheckTeenager(){
        AlterCheck ac = new AlterCheck();
        Assert.assertEquals("Teenager", ac.alterCheck(18));
    }
    @Test

    public void alterCheckKnackig(){
        AlterCheck ac = new AlterCheck();
        Assert.assertEquals("knackig", ac.alterCheck(35));
    }
    @Test

    public void alterCheckMidlifecrisis(){
        AlterCheck ac = new AlterCheck();
        Assert.assertEquals("midlifecrisis", ac.alterCheck(47));
    }
    @Test

    public void alterCheckPensioniert(){
        AlterCheck ac = new AlterCheck();
        Assert.assertEquals("pensioniert", ac.alterCheck(70));
    }
}
