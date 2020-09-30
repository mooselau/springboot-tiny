package javaself;

import java.util.HashMap;
import java.util.Map;


public class OtherTester {
    public static void main(String[] args) {
        OtherTester tester = new OtherTester();
        tester.entrypoint();
    }

    public void entrypoint() {
        Map<String, Object> map = new HashMap<>();
        Long value = (Long)map.getOrDefault("key", null);
        System.out.println(value);
    }
}
