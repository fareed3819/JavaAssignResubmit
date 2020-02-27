package Assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingFilesTest {
    MatchingFiles matchingFiles = new MatchingFiles();

    //the method returns the concatinated absolute paths of all files matching the given regular expression otherwise returns Not found

    @Test
    void TestCase1() {
        assertEquals("/home/fareed/coding1/home/fareed/coding3/home/fareed/coding2/home/fareed/coding5/home/fareed/coding4"
                ,matchingFiles.searchForMatchedFiles(System.getProperty("user.home"), "[a-z]*[1-5]"));
    }
    @Test
    void TestCase2() {
        assertEquals("Not found",matchingFiles.searchForMatchedFiles(System.getProperty("user.home"), "indian*.java"));
    }
<<<<<<< HEAD
    @Test
    void TestCase3() {
        assertEquals("/home/fareed/coding5.cpp"
                , matchingFIles.searchForMatchedFiles(System.getProperty("user.home"), "[a-z]*[1-5].cpp"));
    }

}
=======
}
>>>>>>> 022a2683f8cf4ee516c053a7eee209f5445accdd
