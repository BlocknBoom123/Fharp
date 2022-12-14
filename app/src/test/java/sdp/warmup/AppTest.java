/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.warmup;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void flattenUnpacksANestedArray() {
        // Arrange
        App classBeingTested = new App();
        Object[][] data = { {"hello", "world"}, {"how", "are", "you"}, {}, {"now?"} };
        Object[] expected = { "hello", "world", "how", "are", "you", "now?" };
        // Act
        Object[] result = classBeingTested.flatten(data);
        // Assert
        assertArrayEquals(expected, result);
        }
        
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
