/*
 *	Project My Puppy Story
 *	2nd Job Function Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHui
 *	Since 17.09.12
 *	
 *	Version 0.2.0 Official
 *	Last update : 17.10.22
 */
package TMGC;
import java.util.*;

public class TMGCJOB {
	public static void set2ndJobRecmd(){
		/*
		 * 직업 추천 코드
		 *  S, SH : 투기견, 군견
		 *  I, IH : 탐지견, 안내견
		 *  D, DH : 양치기견, 스타견
		 */
		String tmpRecmdJob="";
		int tmpArticleSTR=0,tmpArticleINT=0,tmpArticleDEB=0,tmpArticleHET=0;
		tmpArticleSTR=TMGCSYS.tmgcSTR;
		tmpArticleINT=TMGCSYS.tmgcINT;
		tmpArticleDEB=TMGCSYS.tmgcDEB;
		tmpArticleHET=TMGCSYS.tmgcHET;
		
		/*										STR												*/
		if(tmpArticleSTR>tmpArticleINT && tmpArticleINT>tmpArticleDEB) {
			//1>2>3
			tmpRecmdJob = "S";
		}else if(tmpArticleSTR>tmpArticleDEB && tmpArticleDEB>tmpArticleINT) {
			//1>3>2
			tmpRecmdJob = "S";
			
		/*										INT												*/
		}else if(tmpArticleINT>tmpArticleSTR && tmpArticleSTR>tmpArticleDEB) {
			//2>1>3
			tmpRecmdJob = "I";
		}else if(tmpArticleINT>tmpArticleDEB && tmpArticleDEB>tmpArticleSTR) {
			//2>3>1
			tmpRecmdJob = "I";
			
		/*										DEB												*/
		}else if(tmpArticleDEB>tmpArticleSTR && tmpArticleSTR>tmpArticleINT) {
			//3>1>2
			tmpRecmdJob = "D";
		}else if(tmpArticleDEB>tmpArticleINT && tmpArticleINT>tmpArticleSTR) {
			//3>2>1
			tmpRecmdJob = "D";
		}else if(tmpArticleSTR==tmpArticleINT || tmpArticleSTR==tmpArticleDEB || tmpArticleINT==tmpArticleDEB) {
			//3개의 능력치중 두개의 값이 동일할 경우 직업 랜덤 선택
			switch(TMGC.setrnd(3)) {
			case 1:
				tmpRecmdJob = "S";
				break;
			case 2:
				tmpRecmdJob = "I";
				break;
			case 3:
				tmpRecmdJob = "D";
				break;
			}
		}
		
		//HET 코드
		if(tmpArticleHET>=30){
			tmpRecmdJob = tmpRecmdJob+"H";
		}
		
		TMGCSYS.tmgc2ndJob = tmpRecmdJob;
	}
	
	//전투, 보초훈련
	public static void strBattle(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //모의 훈련장
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (10+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 0, 0, 0);
				
				TMGC.playMotion("normal", "모의 훈련장에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "모의 훈련장에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "모의 훈련장에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "모의 훈련장에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("모의 훈련장도 생각한것 만큼 쉽지는 않네요... 그래도 저 잘했죠? ㅎㅎ\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //대구 투견
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (30+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(2, 0, 0, 0);
				
				TMGC.playMotion("normal", "대구 투견 대회에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "대구 투견 대회에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "대구 투견 대회에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "대구 투견 대회에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("역시 투견 대회는 만만하게 볼게 아닌가봐요... 그래도 저 괜찮았죠? ㅎㅎ\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //서울 투견 대회
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (80+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (40+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(3, 0, 0, 0);
				
				TMGC.playMotion("normal", "서울 투견 대회에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "서울 투견 대회에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "서울 투견 대회에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "서울 투견 대회에서 전투 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("역시 투견 대회는 만만하게 볼게 아닌가봐요... 그래도 저 괜찮았죠? ㅎㅎ\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	public static void strGuard(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //모의 훈련장
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (10+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 0, 0, 0);
				
				TMGC.playMotion("normal", "모의 훈련장에서 보호 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "모의 훈련장에서 보호 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "모의 훈련장에서 보호 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "모의 훈련장에서 보호 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("모의 훈련장도 생각보다 위험하네요... 그래도 저 잘했죠? ㅎㅎ\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //예비군 관리대대 보초 훈련
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (30+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(2, 1, 0, 0);
				
				TMGC.playMotion("normal", "예비군 관리대대에서 보초 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "예비군 관리대대에서 보초 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "예비군 관리대대에서 보초 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "예비군 관리대대에서 보초 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("예비군 관리대대는 밤에도 사람이 많네요... 그래도 저 괜찮았죠? ㅎㅎ\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //검찰청 야간 보초 훈련
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (80+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (40+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(3, 1, 0, 0);
				
				TMGC.playMotion("normal", "검찰청에서 야간 보초 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "검찰청에서 야간 보초 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "검찰청에서 야간 보초 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "검찰청에서 야간 보초 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("야간 보초 훈련은 너무 힘들어요 -_- a... 좀 쉬어야할 것 같아요...\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	
	//냄새맡기, 표시구별훈련
	public static void intOlfaction(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //모의 훈련장
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (15+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 1, 0, 0);
				
				TMGC.playMotion("normal", "모의 훈련장에서 후각 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "모의 훈련장에서 후각 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "모의 훈련장에서 후각 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "모의 훈련장에서 후각 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("무슨 냄새인지 조금씩 알 것 같아요... 더 노력해야겠어요!\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //탄약 관리대대 후각 훈련
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (50+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (25+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 2, 0, 0);
				
				TMGC.playMotion("normal", "탄약 관리대대에서 후각 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "탄약 관리대대에서 후각 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "탄약 관리대대에서 후각 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "탄약 관리대대에서 후각 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("탄약 관리대대는 정말 위험한 것 같아요... 거기서는 조그마한 불씨도 조심합시다!\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //대구국제공항 마약 탐색 후각 훈련
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (25+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 3, 0, 0);
				
				TMGC.playMotion("normal", "대구국제공항에서 마약 탐색 후각 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "대구국제공항에서 마약 탐색 후각 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "대구국제공항에서 마약 탐색 후각 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "대구국제공항에서 마약 탐색 후각 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("마약 탐색 훈련은 너무 힘들어요... 좀 쉬어야할 것 같아요...\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	public static void intDisplay(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //모의 훈련장
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (15+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 1, 0, 0);
				
				TMGC.playMotion("common_1", "모의 훈련장에서 표시 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "모의 훈련장에서 표시 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_1", "모의 훈련장에서 표시 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "모의 훈련장에서 표시 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("무슨 사인(Sign)인지 조금씩 알 것 같아요... 더 노력해야겠어요!\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //포병 대대 포 발사 사인 인지 훈련
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (50+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (25+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 2, 0, 0);
				
				TMGC.playMotion("common_1", "포병 대대에서 포 발사 사인 인지 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "포병 대대에서 포 발사 사인 인지 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_1", "포병 대대에서 포 발사 사인 인지 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "포병 대대에서 포 발사 사인 인지 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("포병 대대는 정말 위험한 것 같아요... 북한군은 꼼짝도 못하겠는걸요? ㅎㅎ\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //대구국제공항 폭발물 탐색 훈련
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (25+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 3, 0, 0);
				
				TMGC.playMotion("common_1", "대구국제공항에서 폭발물 탐색 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "대구국제공항에서 폭발물 탐색 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_1", "대구국제공항에서 폭발물 탐색 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "대구국제공항에서 폭발물 탐색 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("폭발물 탐색 훈련은 너무 힘들어요... 좀 쉬어야할 것 같아요...\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	
	//신호훈련, 개인기
	public static void debSign(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //애완견 전문 아마데미 사인 훈련
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (15+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 0, 1, 0);
				
				TMGC.playMotion("common_1", "애완견 전문 아마데미에서 사인 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "애완견 전문 아마데미에서 사인 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "애완견 전문 아마데미에서 사인 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "애완견 전문 아마데미에서 사인 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("무슨 사인(Sign)인지 조금씩 알 것 같아요... 더 노력해야겠어요!\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //웹 드라마 촬영 현장 감독 지도 연기 훈련
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (50+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (25+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 1, 2, 0);
				
				TMGC.playMotion("common_1", "웹 드라마 촬영 현장에서 감독 지도 연기 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "웹 드라마 촬영 현장에서 감독 지도 연기 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "웹 드라마 촬영 현장에서 감독 지도 연기 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "웹 드라마 촬영 현장에서 감독 지도 연기 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("웹 드라마도 많은 분들의 노력으로 만들어지네요... 모두 수고하셨습니다!\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //유명 TV 예능 프로그램 보조 출연
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (25+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 2, 3, 0);
				
				TMGC.playMotion("common_1", "유명 TV 예능 프로그램에서 보조 출연중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "유명 TV 예능 프로그램에서 보조 출연중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "유명 TV 예능 프로그램에서 보조 출연중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "유명 TV 예능 프로그램에서 보조 출연중입니다... 잠시만 기다려주세요...");
				
				System.out.println("카메라가 많으니 대본대로 하기가 부끄러워요... 조금 더 노력해야겠어요!\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	public static void debSkill(){
		int tmpNum, tmpLV, tmpEXP, tmpHP, tmpStress;
		tmpNum = TMGC.setrnd(3);
		tmpLV=TMGCSYS.tmgcLV;
		tmpEXP=TMGCSYS.tmgcEXP;
		tmpHP=TMGCSYS.tmgcHP;
		tmpStress=TMGCSYS.tmgcStress;
		
		switch(tmpNum) {
			case 1: //애완견 전문 아마데미 개인기 훈련
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (40+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (15+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (20+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 0, 1, 0);
				
				TMGC.playMotion("common_1", "애완견 전문 아마데미에서 개인기 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "애완견 전문 아마데미에서 개인기 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "애완견 전문 아마데미에서 개인기 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "애완견 전문 아마데미에서 개인기 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("유명 해지려면 더 노력해야겠어요! 힘낼께요 주인님!\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 2: //웹 드라마 촬영 현장 감독 지도 개인기 훈련
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (50+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (20+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (25+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(0, 1, 2, 0);
				
				TMGC.playMotion("common_1", "웹 드라마 촬영 현장에서 감독 지도 개인기 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "웹 드라마 촬영 현장에서 감독 지도 개인기 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "웹 드라마 촬영 현장에서 감독 지도 개인기 훈련중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "웹 드라마 촬영 현장에서 감독 지도 개인기 훈련중입니다... 잠시만 기다려주세요...");
				
				System.out.println("웹 드라마도 많은 분들의 노력으로 만들어지네요... 모두 수고하셨습니다!\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
			case 3: //유명 TV 예능 프로그램 보조 출연
				if(TMGCSYS.tmgcHP>0 && TMGCSYS.tmgcStress<100){
					TMGCSYS.tmgcEXP += (60+TMGCSYS.tmgcLV);
					TMGCSYS.tmgcHP -= (25+TMGCSYS.tmgcFeel);
					TMGCSYS.tmgcStress += (30+TMGCSYS.tmgcFeel);
				}
				
				TMGC.setlevel();
				TMGC.setability(1, 2, 3, 0);
				
				TMGC.playMotion("common_1", "유명 TV 예능 프로그램에서 보조 출연중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal", "유명 TV 예능 프로그램에서 보조 출연중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("normal_reverse", "유명 TV 예능 프로그램에서 보조 출연중입니다... 잠시만 기다려주세요...");
				TMGC.playMotion("common_2", "유명 TV 예능 프로그램에서 보조 출연중입니다... 잠시만 기다려주세요...");
				
				System.out.println("카메라가 많으니 대본대로 하기가 부끄러워요... 조금 더 노력해야겠어요!\n(레벨 : "+tmpLV+"->"+TMGCSYS.tmgcLV+", 경험치 : "+TMGCSYS.tmgcEXP+"/"+(100*TMGCSYS.tmgcLV)+", 체력 : "+tmpHP+"->"+TMGCSYS.tmgcHP+", 스트레스 : "+tmpStress+"->"+TMGCSYS.tmgcStress+")");
				break;
		}
	}
	
	/*
	 ************************************************************************
	 * 
	 * 		3rd Part
	 *		Pro/Ama Section 
	 * 
	 ***********************************************************************
	 */
	
	//프로와 아마추어 판단
	public static void set3rdJobProAma(){
		if(TMGCSYS.tmgcHET>=50){
			//프로
			TMGCSYS.tmgc3ndProAma = "PRO";
			
			switch(TMGCSYS.tmgc2ndJob) {
				case "S":
					TMGCSTORY.playStory("S_1_PRO", 0);
					break;
				case "SH":
					TMGCSTORY.playStory("SH_1_PRO", 0);
					break;
				case "I":
					TMGCSTORY.playStory("I_1_PRO", 0);
					break;
				case "IH":
					TMGCSTORY.playStory("IH_1_PRO", 0);
					break;
				case "D":
					TMGCSTORY.playStory("D_1_PRO", 0);
					break;
				case "DH":
					TMGCSTORY.playStory("DH_1_PRO", 0);
					break;
			}
		}else {
			//아마추어
			TMGCSYS.tmgc3ndProAma = "AMA";
			
			switch(TMGCSYS.tmgc2ndJob) {
			case "S":
				TMGCSTORY.playStory("S_1_AMA", 0);
				break;
			case "SH":
				TMGCSTORY.playStory("SH_1_AMA", 0);
				break;
			case "I":
				TMGCSTORY.playStory("I_1_AMA", 0);
				break;
			case "IH":
				TMGCSTORY.playStory("IH_1_AMA", 0);
				break;
			case "D":
				TMGCSTORY.playStory("D_1_AMA", 0);
				break;
			case "DH":
				TMGCSTORY.playStory("DH_1_AMA", 0);
				break;
		}
		}
	}
	
	/*
	 ************************************************************************
	 * 
	 * 		4th Part
	 *		Finall Pro/Ama Section 
	 * 
	 ***********************************************************************
	 */
	
	//프로와 아마추어 최종 판단
	public static void set4thFinall(){
		String tmgcFinallGrade = "";
		int tmpRndNum=0;
		
		tmpRndNum = TMGC.setrnd(100);
		switch(TMGCSYS.tmgc3ndProAma) {
			case "PRO":
				if(tmpRndNum>=20) {
					tmgcFinallGrade = "PRO";
				}else {
					tmgcFinallGrade = "AMA";
				}
				break;
			case "AMA":
				if(tmpRndNum>=80) {
					tmgcFinallGrade = "PRO";
				}else {
					tmgcFinallGrade = "AMA";
				}
				break;
		}

		switch(TMGCSYS.tmgc2ndJob) {
			case "S":
				TMGCSTORY.playStory("S_1_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
			case "SH":
				TMGCSTORY.playStory("SH_2_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
			case "I":
				TMGCSTORY.playStory("I_1_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
			case "IH":
				TMGCSTORY.playStory("IH_2_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
			case "D":
				TMGCSTORY.playStory("D_1_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
			case "DH":
				TMGCSTORY.playStory("DH_2_"+TMGCSYS.tmgc3ndProAma+"_"+tmgcFinallGrade,0);
				break;
		}
	}
}
