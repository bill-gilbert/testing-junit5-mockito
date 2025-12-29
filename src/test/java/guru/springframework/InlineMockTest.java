package guru.springframework;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

class InlineMockTest {
    @Test
    void testInlineMock() {
        Map mapMock = mock(Map.class);
        doReturn(2).when(mapMock).size();
        assertEquals(mapMock.size(), 2);
    }
}
