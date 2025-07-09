package stream_pipeline;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NamesProcessingTest {
    //create a test method

    /**
     * Console test:
     * > mvn test -Dtest=NamesProcessingTest
     * > mvn test -Dtest=NamesProcessingTest#testGivenName_whenToUpperCase_thenReturnUpperCaseNames
     */
    @Test
    void testGivenName_whenToUpperCase_thenReturnUpperCaseNames() {
        // Given - arrange
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");

        // When - act
        List<String> result = NamesProcessing.toMyUpperCase.apply(names);

        // Then - assert
        assertEquals(List.of("ALICE", "BOB", "CHARLIE", "DAVID", "EVE"), result);
    }
}