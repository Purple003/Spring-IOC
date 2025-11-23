package metier;

import dao.IDao;
import org.junit.Assert;
import org.junit.Test;

public class MetierImplTest {

    @Test
    public void testCalcul() {
        IDao dao = () -> 10.0;
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        double result = metier.calcul();
        Assert.assertEquals(20.0, result, 0.001);
    }
}
