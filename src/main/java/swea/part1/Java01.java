package swea.part1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//D1 홀수만 더하기
public class Java01 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/main/java/swea/res/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++) {
            int sum=0;
            for(int i=0; i<10; i++){
                int val=sc.nextInt();
                if(val %2 !=0)
                    sum+=val;
            }
            System.out.println("#"+test_case+" "+sum);
        }
    }
}
