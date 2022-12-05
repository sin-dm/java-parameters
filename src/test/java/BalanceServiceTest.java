import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BalanceServiceTest {


    @Parameterized.Parameters(name = "{index}: add {0} - expected {1}")
    public static Object[][] params() {
        return new Object[][]{
                {100, 100},
                {200, 200},
                {300, 400}
        };
    }

    public static Object[] singleParam() {
        return new Object[] {100, 200, 300, 400};
    }

    @Parameterized.Parameter
    public int count;

    @Parameterized.Parameter(1)
    public int expected;

//    public BalanceServiceTest(int count, int expected) {
//        this.balanceService = new BalanceService();
//        this.count = count;
//        this.expected = expected;
//    }

    @Test
    public void testAddBalance() {
        BalanceService balanceService = new BalanceService();
        balanceService.add(count);
        assertEquals(expected, balanceService.getBalance());
    }

//    @Test
//    public void testWithdrawBalance() {
//        balanceService.withdraw(count);
//        assertEquals(expected, balanceService.getBalance());
//    }
}
