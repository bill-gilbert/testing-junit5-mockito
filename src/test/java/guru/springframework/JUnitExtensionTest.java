package guru.springframework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class JUnitExtensionTest {
    @Mock
    Map<String, Object> mapMock;

    @Test
    void annotationMapTest() {
        assertEquals(mapMock.size(), 0);
        doReturn(5).when(mapMock).size();
        mapMock.put("test", "success");
        assertEquals(mapMock.size(), 5);
    }
}
