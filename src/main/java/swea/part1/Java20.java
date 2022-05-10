package swea.part1;

import java.io.FileInputStream;
import java.util.Scanner;

//D2 백만장자 프로젝트
public class Java20 {
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

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[] map = new int[n];

            for(int i=0;i<n;i++){
                map[i] = sc.nextInt();
            }

            long profit =0;

            //거꾸로 생각해보자 --> 최대값에서 작은 값을 빼는 구조
            int max=0;

            for(int i=n-1;i>=0;i--){
                //현재 구매일 뒤에 최대값이 있으면 무조건 구매하기 --> 이때 이익은 최대값-오늘금액
                int today = map[i];
                if(today<max){
                    profit+=max-today;
                }else{
                    max=today;
                }
            }
            System.out.printf("#%d %d\n",test_case,profit);
        }
    }
}
