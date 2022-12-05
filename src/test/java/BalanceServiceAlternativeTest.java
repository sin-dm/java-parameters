import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class BalanceServiceAlternativeTest {

//    @Test
//    @Parameters({"100, 100", "200, 200", "300, 400"})
//    public void addBalance(int count, int expected) {
//        BalanceService balanceService = new BalanceService();
//        balanceService.add(count);
//        assertEquals(expected, balanceService.getBalance());
//    }

    @Test
    @Parameters(method = "balanceServiceWithdrawData")
    public void withdrawBalance(int count, int expected) {
        BalanceService balanceService = new BalanceService();
        balanceService.withdraw(count);
        assertEquals(expected, balanceService.getBalance());
    }

    public Object[][] balanceServiceWithdrawData() {
        return new Object[][] {
                {100, -100},
                {200, -200},
                {300, -400}
        };
    }
}
