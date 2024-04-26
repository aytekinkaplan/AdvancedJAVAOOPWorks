package work012;

import com.oopworks.work013.NameInput;
import org.junit.Assert;
import org.junit.Test;

public class NameInputTest {
    @Test
    public void testGetNameFromInput() {
        // Test için kullanıcı girdisi yerine mock veri kullanarak test ediyoruz
        String userInput = "John";
        String expectedOutput = "John";

        // Metodu çağırarak gerçek sonucu alıyoruz
        String actualOutput = NameInput.getNameFromInput();

        // Gerçek sonucu beklenen sonuçla karşılaştırıyoruz
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
