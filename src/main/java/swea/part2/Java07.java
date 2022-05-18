package swea.part2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

//D2 조교의 성적 매기기
public class Java07 {
    public static void main(String[] args) throws Exception {
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
        System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        String[] hak = {"D0","C-","C0","C+","B-","B0","B+","A-","A0","A+"};
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt(); //학생수
            double[] students = new double[n];
            int k = sc.nextInt();// 학점을 알고싶은 학생의 번호
            int y = n/10;
            String grade = "";
            for(int i=0;i<n;i++){
                int mid = sc.nextInt(); //중간고사
                int fin = sc.nextInt(); //기말고사
                int assign = sc.nextInt(); //과제

                double score = mid*0.35 + fin*0.45 + assign*0.2;
                students[i] = score;
            }
            double target = students[k-1]; //학점을 알고싶은 학생의 총점
            Arrays.sort(students);
//            System.out.println(Arrays.toString(students));

            //같은 점수인 사람 찾기
            for(int i=0;i<n;i++) {
                if(students[i]==target){
                    grade = hak[i/y];
                    break;
                }
            }
            System.out.printf("#%d %s\n",test_case,grade);
        }
    }
}
