package week1.mission1.gugudan;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A;
        int B;
        int C;




        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = (A*B);

        bw.write(C+"");
        br.close();
        bw.close();


    }
}
