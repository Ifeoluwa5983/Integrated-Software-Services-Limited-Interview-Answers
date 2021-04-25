package test;

import main.ReversingBitwiseOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingBitwiseOperationTest {

    ReversingBitwiseOperation reversingBitwiseOperation;

    @BeforeEach
    void setUp() {
        reversingBitwiseOperation = new ReversingBitwiseOperation();
    }

    @Test
    void test(){
        int[] a = {2, 3, 4, 5};
        int[] b = {3, 4, 5, 6};
        assertNotNull(a);
        assertNotNull(b);
        reversingBitwiseOperation.encodeArray(a,b, 4);
    }
}