package a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by alex on 18/05/2015.
 */
public class ScoreCollectionTest {

    @Test
    public void answersArithmeticMeanOfTwoNumbers() throws Exception {
        //arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        //actual
        int actualResult = collection.arithmeticMean();

        //assert
        assertThat(actualResult, equalTo(6));
    }
}