package ru.sbt.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MaxK on 08.07.2017.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        Formula calc;
        System.out.println("Введите выражение вставляя пробел после каждого оператора. Например: \"1 + ( 2 - 3 ) * ( 11 + 2 * ( 3 + 4 ) ) + 5 \" ");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        calc = new Formula(reader.readLine());
        System.out.println(calc.Estimate());

    }
}
