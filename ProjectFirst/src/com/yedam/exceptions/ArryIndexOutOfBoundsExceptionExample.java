package com.yedam.exceptions;

public class ArryIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		int[] intAry = new int[3];

		for (int i = 0; i <= intAry.length; i++) { // 6번 돔
			try {
//				int num1 = Integer.parseInt(args[0]); // 문자열 타입의 값을 받아서 첫번째에 해당되는 값을 int(숫자)로 바꾸겠다????? 넘버포맷 에러가 남 ->그러면 아래의 처리는 하지 않음ㅎ
		
				intAry[i] = i + 1; // 예외 발생 가능 코드, (intAry에 선언된 배열(5개)보다 루핀(6번)도는 수가 더많음?)
				System.out.println(intAry[i]);
				int num1 = Integer.parseInt(args[0]); //
				
//			} catch(Exception e2) {
//				System.out.println("알 수 없는 오류 발생."); //  아래에서 오류가 남 , 더이상 예외를 처리 해 줄 것이 없기 때문? 

			} catch (ArrayIndexOutOfBoundsException e) { // 예외처리
				System.out.println("배열의 범위를 초과했습니다. intAry[" + i + "]");

			} catch(NumberFormatException e1) { //
				System.out.println("변환불가.");
				
			} catch(Exception e2) {
				System.out.println("알 수 없는 오류 발생."); // 최종적으로 알 수 없는 에러일때 씀, (위로 이동해서 해보기)
			}
		}
		System.out.println("end of prog."); // <-에러 발생, 배열의 범위를 벗어나게 끔 작업을 했기 때문에. (항상 실행됨?)
				//intAry[i] = i +1; 배열은 5개인데 6번 루핀 돌기때문?????????????
	}
}
