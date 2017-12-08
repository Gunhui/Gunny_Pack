/*
 *	Project My Puppy Story
 *	Q&A Fnc. of Study Mode Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHui
 *	Since 17.09.12
 *	
 *	Version 0.2.0 Official
 *	Last update : 17.10.22
 */
package TMGC;
import java.util.*;
import java.text.*;
import java.io.*;

public class TMGCQNA {
	public static void question() {
		Scanner scanQNA = new Scanner(System.in);                        // scanQNA로 입력받음.
		String tmpText="";                                                           // ""한 이유 
		
		int tmpLV, tmpEXP, tmpHP, tmpStress;                                       // TMGCSYS에서 변수 값들 불러옴.
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		String[][] tmpQst= new String[2][41];									// 크기가 (3,42)인 배열 tmpQst을 만든다.
		int tmpQstRst=0;																// 문제출제 tmpQstRst를 만들고 초기값을 0으로 한다.
		
		for(int tmpClear=0;tmpClear<7;tmpClear++) {                       // 화면창을 깔끔하게 하기 위해 for문을 사용한다.
			System.out.println("");
		}
		
		TMGC.playMotion("study","문제를 준비하고 있습니다... 잠시만 기다려주세요~");                       // TMGC에 있는 캐릭터 모션효과를 불러온다.
		TMGC.playMotion("study_down","문제를 준비하고 있습니다... 잠시만 기다려주세요~");
		TMGC.playMotion("study","문제를 준비하고 있습니다... 잠시만 기다려주세요~");
		TMGC.playMotion("study_down","문제를 준비하고 있습니다... 잠시만 기다려주세요~");
		
		//0 : 문제, 1 : 정답
		tmpQst[0][0] = "한국의 수도는 대구이다. (맞다 또는 틀리다 중 입력)";              //답 : X				// 각 배열 칸에다가 문제랑 답을 넣는다.
		tmpQst[1][0] = "틀리다";
		tmpQst[0][1] = "일본의 수도는 도쿄이다. (맞다 또는 틀리다 중 입력)";              //답 : O
		tmpQst[1][1] = "맞다";
		tmpQst[0][2] = "중국의 수도는 베이징이다. (맞다 또는 틀리다 중 입력)";             //답 : O
		tmpQst[1][2] = "맞다";
		tmpQst[0][3] = "미국의 수도는 워싱턴이다. (맞다 또는 틀리다 중 입력)";             //답 : O
		tmpQst[1][3] = "맞다";
		tmpQst[0][4] = "이스라엘의 수도는 테헤란이다. (맞다 또는 틀리다 중 입력)";          //답 : X
		tmpQst[1][4] = "틀리다";
		tmpQst[0][5] = "이란의 수도는 테헤란이다. (맞다 또는 틀리다 중 입력)";             //답 : O
		tmpQst[1][5] = "맞다";
		tmpQst[0][6] = "독일의 수도는 베를린이다. (맞다 또는 틀리다 중 입력)";             //답 : O
		tmpQst[1][6] = "맞다";
		tmpQst[0][7] = "룩셈부르크의 수도는 룩셈부르크이다. (맞다 또는 틀리다 중 입력)";       //답 : O
		tmpQst[1][7] = "맞다";
		tmpQst[0][8] = "바티칸의 수도는 바티칸이다. (맞다 또는 틀리다 중 입력)";            //답 : O
		tmpQst[1][8] = "맞다";
		tmpQst[0][9] = "그리스의 수도는 아테네이다. (맞다 또는 틀리다 중 입력)";            //답 : O
		tmpQst[1][9] = "맞다";
		tmpQst[0][10] = "노르웨이의 수도는 노르웨이이다. (맞다 또는 틀리다 중 입력)";        //답 : X
		tmpQst[1][10] = "틀리다";
		tmpQst[0][11] = "영국의 수도는 멘처스터유나이티드이다. (맞다 또는 틀리다 중 입력)";     //답 : X  
		tmpQst[1][11] = "틀리다";
		tmpQst[0][12] = "프랑스의 수도는 파리이다. (맞다 또는 틀리다 중 입력)";             //답 : O
		tmpQst[1][12] = "맞다";
		tmpQst[0][13] = "이탈리아의 수도는 로마이다. (맞다 또는 틀리다 중 입력)";            //답 : O
		tmpQst[1][13] = "맞다";
		tmpQst[0][14] = "스위스의 수도는 베른이다. (맞다 또는 틀리다 중 입력)";             //답 : O
		tmpQst[1][14] = "맞다";
		tmpQst[0][15] = "벨기에의 수도는 브리쉘이다. (맞다 또는 틀리다 중 입력)";            //답 : O
		tmpQst[1][15] = "맞다";
		tmpQst[0][16] = "과테말라의 수도는 과테말라이다. (맞다 또는 틀리다 중 입력)";         //답 : O
		tmpQst[1][16] = "맞다";
		tmpQst[0][17] = "나이지리아의 수도는 아부자이다. (맞다 또는 틀리다 중 입력)";         //답 : O
		tmpQst[1][17] = "맞다";
		tmpQst[0][18] = "인도의 수도는 인도네시아이다. (맞다 또는 틀리다 중 입력)";          //답 : X
		tmpQst[1][18] = "틀리다";
		tmpQst[0][19] = "호주의 수도는 켄버라이다. (맞다 또는 틀리다 중 입력)";             //답 : O
		tmpQst[1][19] = "맞다";
		tmpQst[0][20] = "케나다의 수도는 오타와이다. (맞다 또는 틀리다 중 입력)";            //답 : O
		tmpQst[1][20] = "맞다";
		tmpQst[0][21] = "아이슬란드의 수도는 아이슬란드이다. (맞다 또는 틀리다 중 입력)";      //답 : X
		tmpQst[1][21] = "틀리다";
		tmpQst[0][22] = "터키의 수도는 앙카라이다. (맞다 또는 틀리다 중 입력)";             //답 : O
		tmpQst[1][22] = "맞다";
		tmpQst[0][23] = "체코의 수도는 프라하이다. (맞다 또는 틀리다 중 입력)";             //답 : O
		tmpQst[1][23] = "맞다";
		tmpQst[0][24] = "브라질의 수도는 브라질리아이다. (맞다 또는 틀리다 중 입력)";         //답 : O
		tmpQst[1][24] = "맞다";
		tmpQst[0][25] = "방글라데시의 수도는 방글라데시아이다. (맞다 또는 틀리다 중 입력)";     //답 : X
		tmpQst[1][25] = "틀리다";
		tmpQst[0][26] = "베트남의 수도는 하노이이다. (맞다 또는 틀리다 중 입력)";            //답 : O
		tmpQst[1][26] = "맞다";
		tmpQst[0][27] = "타이완의 수도는 타이완이다. (맞다 또는 틀리다 중 입력)";           //답 : X
		tmpQst[1][27] = "틀리다";
		tmpQst[0][28] = "필리핀의 수도는 마닐라이다. (맞다 또는 틀리다 중 입력)";           //답 : O
		tmpQst[1][28] = "맞다";
		tmpQst[0][29] = "싱가포르의 수도는 싱카포르이다. (맞다 또는 틀리다 중 입력)";         //답 : O
		tmpQst[1][29] = "맞다";
		tmpQst[0][30] = "우크라이나의 수도는 우크라이나이다. (맞다 또는 틀리다 중 입력)";      //답 : X
		tmpQst[1][30] = "틀리다";
		tmpQst[0][31] = "핀란드의 수도는 헬싱키이다. (맞다 또는 틀리다 중 입력)";           //답 : O
		tmpQst[1][31] = "맞다";
		tmpQst[0][32] = "불가리아의 수도는 소피아이다. (맞다 또는 틀리다 중 입력)";          //답 : O
		tmpQst[1][32] = "맞다";
		tmpQst[0][33] = "몰디브의 수도는 말레이다. (맞다 또는 틀리다 중 입력)";             //답 : O
		tmpQst[1][33] = "맞다";
		tmpQst[0][34] = "부탄의 수도는 부탄이다. (맞다 또는 틀리다 중 입력)";              //답 : X
		tmpQst[1][34] = "틀리다";
		tmpQst[0][35] = "레바논의 수도는 레바논이다. (맞다 또는 틀리다 중 입력)";           //답 : X
		tmpQst[1][35] = "틀리다";
		tmpQst[0][36] = "사우디아라비아의 수도는 리야드이다. (맞다 또는 틀리다 중 입력)";      //답 : O
		tmpQst[1][36] = "맞다";
		tmpQst[0][37] = "바레인의 수도는 바레인이다. (맞다 또는 틀리다 중 입력)";           //답 : X
		tmpQst[1][37] = "틀리다";
		tmpQst[0][38] = "네팔의 수도는 카트만두이다. (맞다 또는 틀리다 중 입력)";            //답 : O
		tmpQst[1][38] = "맞다";
		tmpQst[0][39] = "러시아의 수도는 모스크바이다. (맞다 또는 틀리다 중 입력)";          //답 : O
		tmpQst[1][39] = "맞다";
		tmpQst[0][40] = "크로아티아의 수도는 크로아티아이다. (맞다 또는 틀리다 중 입력)";	   //답 : X
		tmpQst[1][40] = "틀리다";
		
		for(int tmpClear=0;tmpClear<15;tmpClear++) {													// 화면창을 정리하기 위해 for문을 사용한다.
			System.out.println("");
		}
		
		//문제 생성
		if(TMGCSYS.tmgcLV>0 && TMGCSYS.tmgcLV<=5) {												// 레벨1~5까지 초급구간을 정해서 1~10문제 출제(랜덤)
			//초급
			tmpQstRst = TMGC.setrnd(10);
			System.out.print("\n\n[System] " + tmpQst[0][tmpQstRst] + "\n         정답 입력 : ");      // 답을 입력 받아온다.
			tmpText = scanQNA.next();
			
			//tmp TMGC.setrnd(10)
		}else if(TMGCSYS.tmgcLV>5 && TMGCSYS.tmgcLV<=9) {									    // 레벨 6~9까지 중급구간을 정해서 11~20문제 출제(랜덤)
			//중급
			tmpQstRst = TMGC.setrnd(9)+11;
			System.out.print("\n\n[System] " + tmpQst[0][tmpQstRst] + "\n         정답 입력 : ");		// 답을 입력 받아온다.
			tmpText = scanQNA.next();
			
			//tmpQst[0][TMGC.setrnd(9)+11]
		}else if(TMGCSYS.tmgcLV>9 && TMGCSYS.tmgcLV<=14) {    							// 레벨 10~14까지 고급구간을 정해서 21~30문제 출제(랜덤)
			//고급
			tmpQstRst = TMGC.setrnd(9)+21;
			System.out.print("\n\n[System] " + tmpQst[0][tmpQstRst] + "\n         정답 입력 : ");       // 답을 입력 받아온다.
			tmpText = scanQNA.next();
			//tmpQst[0][TMGC.setrnd(9)+21]
		}else{
			//그외 레벨
			tmpQstRst = TMGC.setrnd(9)+31;																// 레벨 15~20까지 구간을 정해서 31~40문제 출제(랜덤)
			System.out.print("\n\n[System] " + tmpQst[0][tmpQstRst] + "\n         정답 입력 : ");	// 답을 입력 받아온다.
			tmpText = scanQNA.next();
			//tmpQst[0][TMGC.setrnd(9)+31]
		}
		
		for(int tmpClear=0;tmpClear<5;tmpClear++) {												// 화면창 정리를 위해 for문 사용
			System.out.println("");
		}
		
		//정답 체크
		if(tmpText.equals(tmpQst[1][tmpQstRst])) {														// 입력받은 답과 출제된 문제의 답이랑 비교하려고
				//정답일 경우																						.equals( ) 사용한다. 맞을 때
				System.out.print("[System] 정답입니다!\n"
						+"         "+TMGCSYS.tmgcName+"가 조금 더 똑똑해 졌어요!\n\n");
	
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){							// 위에서 불러온 스텟들을 올리고 내린다
					TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (5+TMGCSYS.tmgcFeel);
				}
				
				TMGCSYS.tmgcLimitStudy += 1;															// 공부한계랑 카운트를 1씩 더해준다.
				TMGCSYS.tmgcCountStudy += 1;
				
				if(TMGCSYS.tmgcLimitStudy>=1)	TMGCSYS.tmgcCheckRegularHealth+=1;   //규칙적으로 생활 카운터에 1을 더해준다.
				
				TMGC.setlevel();																				// 능력치중 지적능력을 1 증가시킨다.
				TMGC.setability(0, 1, 0, 0);
				
				System.out.println("         (레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
		}else {															// 화면에 증가하거나 감소한 능력치들을 표시해준다.
				//오답일 경우
				System.out.print("[System] 정답이 아닙니다...\n"									   // 같지 않을 경우 정답이 아니라고 표시한다.
						+"         "+TMGCSYS.tmgcName+"의 기분이 우울해졌어요...ㅜㅅㅜ\n\n");
				
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (10+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (10+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (15+TMGCSYS.tmgcFeel);
				}
				
				TMGCSYS.tmgcLimitStudy += 1;
				TMGCSYS.tmgcCountStudy += 1;
				
				if(TMGCSYS.tmgcLimitStudy>=1)	TMGCSYS.tmgcCheckRegularHealth+=1;
				
				TMGC.setlevel();
				
				System.out.println("         (레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
		}
	}
}
