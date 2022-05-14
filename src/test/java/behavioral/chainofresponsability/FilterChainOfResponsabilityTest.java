package behavioral.chainofresponsability;

import behavioral.chainofresponsability.entities.Request;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("FilterChainOfResponsability")
public class FilterChainOfResponsabilityTest {

    private FilterChainOfResponsability filterChainOfResponsability;

    @BeforeEach
    public void setUp(){
        filterChainOfResponsability = new FilterChainOfResponsability();
    }

    @DisplayName("should return true when request is valid")
    @Test
    public void shouldReturnTrueWhenRequestIsValid(){
        var request = new Request()
                .setBody("some body")
                .setIp("1.2.4")
                .setToken("123");

        assertTrue(filterChainOfResponsability.doFilter(request));
    }

    @DisplayName("should return false when request contains black listed ip")
    @Test
    public void shouldReturnFalseWhenRequestContainsBlackListedIp(){
        var request = new Request()
                .setBody("some body")
                .setIp("1.2.3")
                .setToken("123");

        assertFalse(filterChainOfResponsability.doFilter(request));
    }

    @DisplayName("should return false when request contains invalid token")
    @Test
    public void shouldReturnFalseWhenRequestContainsInvalidToke(){
        var request = new Request()
                .setBody("some body")
                .setIp("1.2.3")
                .setToken("12");

        assertFalse(filterChainOfResponsability.doFilter(request));
    }
}
