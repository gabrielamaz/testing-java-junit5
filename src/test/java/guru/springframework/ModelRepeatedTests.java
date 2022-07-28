package guru.springframework;

import org.junit.jupiter.api.*;

@Tag("Repeated")
public interface ModelRepeatedTests {

    @BeforeEach
    default void beforeEachConsoleOutputer(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running Test - " + testInfo.getDisplayName() + " - " + repetitionInfo.getCurrentRepetition() + "/" + repetitionInfo.getTotalRepetitions());
    }
}
