import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {
    Validator validator = new Validator();

    @Test
    void validSentence1(){
        assertTrue(validator.validateSentence("The quick brown fox said \"hello Mr lazy dog\"."));
    }

    @Test
    void validSentence2(){
        assertTrue(validator.validateSentence("The quick brown fox said hello Mr lazy dog."));
    }

    @Test
    void validSentence3(){
        assertTrue(validator.validateSentence("One lazy dog is too few, 13 is too many."));
    }

    @Test
    void validSentence4(){
        assertTrue(validator.validateSentence("One lazy dog is too few, thirteen is too many."));
    }

    @Test
    void invalidSentence1(){
        assertTrue(!validator.validateSentence("The quick brown fox said \"hello Mr. lazy dog\"."));
    }

    @Test
    void invalidSentence2(){
        assertTrue(!validator.validateSentence("the quick brown fox said “hello Mr lazy dog\"."));
    }

    @Test
    void invalidSentence3(){
        assertTrue(!validator.validateSentence("\"The quick brown fox said “hello Mr lazy dog\"."));
    }

    @Test
    void invalidSentence4(){
        assertTrue(!validator.validateSentence("One lazy dog is too few, 12 is too many."));
    }

}
