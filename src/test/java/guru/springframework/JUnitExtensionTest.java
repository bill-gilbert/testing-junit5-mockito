package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {
    @Mock
    Map<String, Object> mapMock;

    @Test
    void annotationMapTest() {
        assertEquals(mapMock.size(), 0);
        mapMock.put("test", "success");
    }
}
