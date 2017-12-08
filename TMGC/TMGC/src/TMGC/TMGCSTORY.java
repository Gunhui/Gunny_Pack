/*
 *	Project My Puppy Story
 *	Story Mode Class
 *	
 *	Team N1 _ Oh EunSeok, Kim MinYeong, Yoon GeonHui
 *	Since 17.09.12
 *	
 *	Version 0.2.0 Official
 *	Last update : 17.10.22
 */
package TMGC;
import java.util.*;

public class TMGCSTORY {
	public static void playStory(String motionJob, int motionDelay){
    	Scanner scanStory = new Scanner(System.in);
    	String tmpText = "";
    	int tmpTime=0;
    	
    	switch(motionJob){
    	case "Intro_1":
	    	System.out.print(
		    				"□\n"
		    			+	"□ 프롤로그...\n"
		    			+	"□\n"
		    			+	"□\n"
		     			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 어느 날 학교 수업을 마치고 집으로 돌아가던 길, 전봇대 옆 버려진 박스에서 \"끼잉..낑\"하는 소리가 들려왔다.\n"
		    			+	"□ 궁금해진 나는 그 박스를 열어 확인 해 보니 갓 태어난 강아지가 버려져있었다.\n"
		    			+	"□\n"
		    			+	"□ 그것을 그냥 지나치지 못하는 나는 어쩔줄 몰라하며 우선 집에 데려와 몇일 간 페이스북과 주변 친구와 함께\n"
		    			+	"□ 주인을 찾아보았지만, 도무지 나타나지 않아 어쩔 수 없이 내가 키우기로 마음 먹었다.\n"
		    			+	"□ 이왕 키우기로 했으니 이 강아지를 누구보다 잘 키워 나가기로 다짐하였다.\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
		    	break;
    		case "S_1":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 우리 "+TMGCSYS.tmgcName+"은(는) 남들보다 힘과 체력이 뛰어나니\n"
		    			+	"□ 어떤 싸움에서도 지지않는 투기견으로 키워 봐야겠다!\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
		    	break;
    		case "SH_1":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□	"+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 우리 "+TMGCSYS.tmgcName+"은(는) 남들보다 힘, 체력하며 센스도 워낙 뛰어나니\n"
		    			+	"□ 어떠한 전쟁에서 어떤 작전을 임무 받아도 모두 수행 할 수 있는 군견으로 키워봐야 겠다!\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
		    	break;
    		case "I_1":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 우리 "+TMGCSYS.tmgcName+"은(는) 남들보다 지능과 책임감이 강하니\n"
		    			+	"□ 도움이 필요한 분들께 없어서는 안될 안내견으로 키워봐야 겠다!\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			    	break;
    		case "IH_1":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 우리 "+TMGCSYS.tmgcName+"은(는) 남들보다 후각과 지능이 뛰어나니까\n"
		    			+	"□ 어떠한 장애물이든 빨리 확인해 위험 요소를 제거 해주는 탐지견으로 키워 봐야겠다!\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			    	break;
    		case "D_1":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 양치기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 우리 "+TMGCSYS.tmgcName+"은(는) 남들보다 활발하기도 하고 책임감도 있으니까\n"
		    			+	"□ 양과 같은 가축들을 관리할 수 있는 양치기견으로 키워봐야 겠다!\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			    	break;
    		case "DH_1":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 우리 "+TMGCSYS.tmgcName+"은(는) 남들보다 스타성도 뛰어나고 개인기도 많으니까\n"
		    			+	"□ 대중들에게 인정받고 활동하는 스타견으로 키워봐야 겠다!\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_1_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 전문 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음... 생각보다 우리 "+TMGCSYS.tmgcName+"(이)가 진짜 소질이 있는 것 같네...\n"
		    			+	"□ 이제 진짜 투기장을 가서 실전에서 경험하러 가볼까!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_1_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 일반 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음... 이 정도면 뭐... 잘 자라왔어... 실전을 이용하여 더 키워보자!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_1_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 특수 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음... 생각보다 우리 "+TMGCSYS.tmgcName+"(이)가 진짜 소질이 있는 것 같네...\n"
		    			+	"□ 군부대로 가서 실제 작전에 몸 담아보자!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_1_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음...이 정도면 뭐... 잘 자라왔어~\n"
		    			+	"□ 실제 작전을 통해서 경험을 더 길러보자!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 특수 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음... 생각보다 우리 "+TMGCSYS.tmgcName+"(이)가 진짜 소질이 있는 것 같네...\n"
		    			+	"□ 이제 몸이 불편하신분들에게 도움 드리러 가자!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음...이 정도면 뭐... 잘 자라왔어~\n"
		    			+	"□ 도움이 필요하신 분들을 찾아 뵈면서 더 지켜보자!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_1_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 지뢰 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음... 생각보다 우리 "+TMGCSYS.tmgcName+"(이)가 진짜 소질이 있는 것 같네...\n"
		    			+ "□ 군부대로 가서 지뢰나 찾아볼까?\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_1_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 공항 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음...이 정도면 뭐 잘 자라왔어~\n"
		    			+	"□ 우리 "+TMGCSYS.tmgcName+"(이)에게 맞는 공항에 일자리나 찾으러 가볼까?\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 매일유업 목장 관리견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음... 생각보다 우리 "+TMGCSYS.tmgcName+"(이)가 진짜 소질이 있는 것 같네...\n"
		    			+ "□ 매일유업의 목장 관리견도 하시겠다, 확인하러 가볼까 !\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 양치기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음... 이 정도면 뭐... 잘 자라왔어~\n"
		    			+ "□ 할아버지 목장에서 일 해보면서 더 배워 나가자!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_1_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 한류 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음... 생각보다 우리 "+TMGCSYS.tmgcName+"(이)가 진짜 끼가 많네...\n"
		    			+	"□ 소속사도 알아보고 이제는 무대에도 올려 보내야겠군...\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_1_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 음... 이 정도면 뭐 잘 자라왔어~ 여러 무대를 서면서 대중들에게 인지도를 차근차근 쌓아나가보자!\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 게임이 시작됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_2_PRO_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 전문 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 역시 우리 "+TMGCSYS.tmgcName+"! 정말 잘 자라줬어!\n"
		    			+	"□ 어떤 실전에서든 이겨오고 이젠 너의 이름만 들어도 다른 투기견들이 벌벌 떤다더라...\n"
		    			+	"□\n"
		    			+	"□ 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_2_PRO_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 일반 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 여태껏 잘해줘서 정말 고맙다!\n"
		    			+	"□ 너가 정말 자랑스러워♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_1_AMA_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 전문 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 이야~ 우리 "+TMGCSYS.tmgcName+"!\n"
		    			+	"□ 역시 끝까지 포기하지 않고 잘 따라와서 너무 고마워! 진짜 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "S_1_AMA_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 일반 투기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 괜찮아~ 괜찮아! 여태껏 잘 자라줘서 고마워! 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_2_PRO_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 특수 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 역시 우리 "+TMGCSYS.tmgcName+"(이)야~ 정말 잘 자라와줬구나!\n"
		    			+	"□ 큰 전쟁에 나가 이러한 업적도 세우고... 기특해 죽겠어~ 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_2_PRO_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 잘해줘서 정말 고맙다!\n"
		    			+	"□ 너가 정말 자랑스러워♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_2_AMA_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 특수 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 이야~ 우리 "+TMGCSYS.tmgcName+"...\n"
		    			+	"□ 끝까지 포기하지 않고 잘 따라와서 너무 고마워! 진짜 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "SH_2_AMA_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 군견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 괜찮아~ 괜찮아! 정말 잘 해왔어!\n"
		    			+	"□ 여태껏 잘 자라줘서 고마워! 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_PRO_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 특수 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 역시 우리 "+TMGCSYS.tmgcName+", 정말 잘 자라와줬구나 ㅎㅎ\n"
		    			+	"□ 이제는 도움이 필요한 곳 마다 열심히 노력해줘! 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_PRO_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 여태껏 정말 수고 많았다!\n"
		    			+	"□ 너가 정말 자랑스러워♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_AMA_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 전문 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 이야~ 우리 "+TMGCSYS.tmgcName+", 끝까지 잘 따라와줘서 너무 고마워!\n"
		    			+	"□ 진짜 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "I_1_AMA_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 안내견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 괜찮아~ 괜찮아! 정말 잘 해왔어!\n"
		    			+	"□ 여태껏 잘 자라와서 고마워~ 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_2_PRO_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 지뢰 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 역시 우리 "+TMGCSYS.tmgcName+"! 정말 잘 자라와줬구나!\n"
		    			+	"□ 공항이든 경찰특공대에서든... 필요한 곳 마다 항상 도움이 되도록 해!\n"
		    			+	"□\n"
		    			+	"□ 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_2_PRO_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 공항 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 여태껏 정말 수고 많았어!\n"
		    			+	"□ 너가 정말 자랑스러워♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_2_AMA_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 지뢰 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 이야~ 우리 "+TMGCSYS.tmgcName+"!\n"
		    			+	"□ 끝까지 포기하지 않고 잘 따라와줘서 너무 고마워! 진짜 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "IH_2_AMA_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 공항 탐지견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 괜찮아~ 괜찮아! 여태껏 잘 자라와서 고마워!\n"
		    			+	"□ 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_PRO_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 매일유업 목장 관리견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 역시 우리 "+TMGCSYS.tmgcName+"! 정말 잘 자라와줬구나!\n"
		    			+	"□ 할아버지께서 없어서는 안된다네! 기특해 죽겠어 아주...\n"
		    			+	"□\n"
		    			+	"□그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_PRO_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 양치기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 괜찮아~ 괜찮아! 여태껏 잘 자라와서 고마워!\n"
		    			+	"□ 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_AMA_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 매일유업 목장 관리견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 이야~ 우리 "+TMGCSYS.tmgcName+"!\n"
		    			+	"□ 끝까지 포기하지 않고 잘 따라와줘서 너무 고마워! 진짜 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "D_1_AMA_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 양치기견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 괜찮아~ 괜찮아! 여태껏 잘 자라와서 고마워!\n"
		    			+	"□ 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_2_PRO_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 한류 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 역시 우리 "+TMGCSYS.tmgcName+"! 정말 잘 자라와줬구나!\n"
		    			+	"□ 대중들에게 인정도 받고, 명예 훈장도 받고... 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_2_PRO_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 마무리가 약간 아쉽긴 하지만 여태껏 정말 수고 많았어!\n"
		    			+	"□ 너가 정말 자랑스러워♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_2_AMA_PRO":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 한류 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 이야~ 우리 "+TMGCSYS.tmgcName+"!\n"
		    			+	"□ 끝까지 포기하지 않고 잘 따라와줘서 너무 고마워! 진짜 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    		case "DH_2_AMA_AMA":
		    	System.out.print(
		    				"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"는 스타견\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ "+TMGCSYS.tmgcName+"의 주인\n"
		    			+	"□ 괜찮아~ 괜찮아! 정말 잘 해왔어!\n"
		    			+	"□ 여태껏 잘 자라와서 고마워! 그동안 수고 많았다♥\n"
		    			+	"□\n"
		    			+	"□\n"
		    			+	"□ 10초 후에 Ending Credit이 표시됩니다...\n"
		    			+	"□\n"
		    			+	"□ ");
	    		for(tmpTime=0;tmpTime<11;tmpTime++) {
	    			System.out.print("["+(10-tmpTime)+"초] ");
	    			TMGC.setsleep(10);
	    		}
			   	break;
    	}
    	int tmpClear;
		for(tmpClear=0;tmpClear<7;tmpClear++) {
			System.out.println("");
		}
		TMGC.setsleep(motionDelay);
    }
    
    public static void playEndingCredit(){
    	String[] tmgcCredits = new String[91];
    	int tmpNum=0, tmpNum2nd=0;
    	
    	tmgcCredits[0]=	"□■■□□□□■□□■■□□";
		tmgcCredits[1]=	"□■□■□□□■□□□■□□";
		tmgcCredits[2]=	"□■□□■□□■□□□■□□";
		tmgcCredits[3]=	"□■□□□■□■□□□■□□";
		tmgcCredits[4]=	"□■□□□□■■□□■■■□";
    								
    	tmgcCredits[8] = "My Puppy Story";
    	tmgcCredits[9] = "made by Team N1";
    	
    	tmgcCredits[13] = "■ Producer";
    	tmgcCredits[14] = "     Oh EunSeok";
    	
    	tmgcCredits[18] = "■ Director";
    	tmgcCredits[19] = "     Members of Team N1";
		
    	tmgcCredits[23] = "■ Game Designer";
    	tmgcCredits[24] = "     Kim MinYeong";
		
    	tmgcCredits[28] = "■ Senario Writer";
    	tmgcCredits[29] = "     Yoon GeonHui";
		
    	tmgcCredits[33] = "■ Game Design Assistant";
    	tmgcCredits[34] = "     Kim KiJong (Professor)";
		
    	tmgcCredits[38] = "■ Early Game Concept by";
    	tmgcCredits[39] = "     Members of Team N1";
		
    	tmgcCredits[42] = "■ Lead Engineer & Module System Programmer";
    	tmgcCredits[43] = "     Oh EunSeok";
		
    	tmgcCredits[47] = "■ Main Scripter";
    	tmgcCredits[48] = "     Kim MinYeong";
		
    	tmgcCredits[52] = "■ Script Engine Designer";
    	tmgcCredits[53] = "     Oh EunSeok";
		
    	tmgcCredits[57] = "■ Function System Programmer";
    	tmgcCredits[58] = "     Oh EunSeok";
    	tmgcCredits[59] = "     Kim MinYeong";
    	tmgcCredits[60] = "     Yoon GeonHui";
		
    	tmgcCredits[64] = "■ Game Level Designer";
    	tmgcCredits[65] = "     Oh EunSeok";
    	tmgcCredits[66] = "     Kim MinYeong";
		
    	tmgcCredits[70] = "■ Special Thanks to:";
		
    	tmgcCredits[71] = "     ■ Programing Advisor";
    	tmgcCredits[72] = "          Kim KiJong (Professor)";
    	tmgcCredits[73] = "          Lee MinGi";
    	tmgcCredits[74] = "          Kim TaeHyun";
    	tmgcCredits[75] = "          Lee MoonHui";
		
    	tmgcCredits[79] = "          And You!";
		
    	tmgcCredits[83] = "Thanks to playing.";
		
    	tmgcCredits[87] = "Presented by Team N1.";
    	tmgcCredits[88] = "(C) Team N1, All rights reserved.";
    	
    	for(tmpNum=0;tmpNum<=90;tmpNum++) {
    		if(tmgcCredits[tmpNum]!=null) {
    			System.out.print("		"+tmgcCredits[tmpNum]+"\n");
    			TMGC.setsleep(1);
    		}else{
    			for(tmpNum2nd=0;tmpNum2nd<10;tmpNum2nd++) {
    				System.out.print("\n");
    				TMGC.setsleep(1);
    			}
    		}
    	}
    }
}
