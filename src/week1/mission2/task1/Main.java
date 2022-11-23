package week1.mission2.task1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException { //속성값 두개
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = 10;
        int b = 2;

        int sum = (a+b); // 덧셈
        bw.write(a + " 더하기 " + b + " 는 " + sum + "입니다.");
        bw.newLine();

        int minus = (a-b); // 뺄셈
        bw.write(a + " 빼기 " + b + " 는 " + minus +"입니다.");
        bw.newLine();

        int divide = (a/b); //나눗셈
        bw.write(a + " 나누기 " + b + " 는 " + divide + "입니다.");
        bw.newLine();

        int multifly = (a&b); // 곱셈
        bw.write(a + " 곱하기 " + b + " 는 " + multifly + " 입니다. ");
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
