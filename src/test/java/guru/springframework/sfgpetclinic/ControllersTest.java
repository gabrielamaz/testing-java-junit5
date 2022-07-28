package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

@Tag("Controllers")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface ControllersTest {

    @BeforeAll
    default void beforeAll() {
        System.out.println("Lets do something here");
    }
}
