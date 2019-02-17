package examples;

import examples.decompile.JavaCallExamplesKt;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> values = JavaCallExamplesKt.listTest();

        System.out.println(values.getClass());
    }
}
