package examples;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;


public class listTest {
    @Test
    public void listEx(){
    List<String> lst = Arrays.asList("orange", "mango", "banana");
    List<String> expected = Arrays.asList("banana", "mango", "orange");

    Collections.sort(lst);
    System.out.print(lst);
    assertIterableEquals(expected, lst);
    }
}