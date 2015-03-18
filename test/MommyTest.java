import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MommyTest {
    @Test
    public void shouldReturnSameIfNotHaveVowelCharacater() {
        Mommy mommy = new Mommy();
        assertThat(mommy.translate("b"), is("b"));
    }

    @Test
    public void shouldReturnMommyIfHaveSingleVowel() {
        Mommy mommy = new Mommy();
        assertThat(mommy.translate("a"), is("mommy"));
    }

    @Test
    public void shouldReturnbMommyIfHaveOneConsonantAndOneVowel(){
        Mommy mommy=new Mommy();
        assertThat(mommy.translate("ba"),is("bmommy"));
    }

    @Test
    public void shouldReturnSingleMommyIfContiousVoewl() {
        Mommy mommy = new Mommy();
        assertThat(mommy.translate("aa"), is("mommy"));
    }

    @Test
    public  void shouldChangeToMommyIfVowelsAreMoreThanThrityPercentage(){
        Mommy mommy=new Mommy();
        assertThat(mommy.translate("abbb"),is("abbb"));
    }
}
