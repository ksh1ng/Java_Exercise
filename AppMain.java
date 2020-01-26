import java.util.Date;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * 
 *  后宫选妃
 * @author kshing
 * @version 1.0
 * @date Jan 24, 2020 11:15:29 PM
 * @copyright kshing
 * @remark TODO
 *
 */
public class AppMain {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// 野生角色
		String[] newNameArray = {"湊", "柱間", "扉間", "培恩", "自來也"};
		int newNameCount = newNameArray.length;
		
		//後攻娘娘的姓名array, 預留5個空間
		String[] nnNameArray = {
				"鳴人", "佐助", "鼬", "斑", "卡卡西", 
				"", "", "", "", ""
				};
		
		//level array
		String[] levelNames = {"貴人", "嬪妃", "貴妃", "皇貴妃", "皇后"};
		//對應每個娘娘的level
		int[] level = new int[10];
		//對應每個娘娘的好感度
		int[] favor = new int[10];
		//initialize the number of 娘娘 to 5
		int nnCount = 5;
		int gameDays = 1; //default10 days
		
		
		//set default favor value
		for(int i = 0; i <nnCount; i++) {
			favor[i] = 100;
		}
		
		//遊戲主界面
		JOptionPane.showMessageDialog(null, "歡迎陛下", "歡迎來到XXX選妃遊戲", 0, new ImageIcon("images/title.png"));
		while(gameDays <= 10) {
//			System.out.println("遊戲進行到第" + gameDays + "天");
//			System.out.println("1. 皇帝下旨選妃\t\t (增加) ");
//			System.out.println("2. 翻牌寵幸\t\t （修改狀態)");
//			System.out.println("3. 打入冷宮\t\t （刪除)");
//			System.out.println("4. 朕的愛妃呢\t\t (查找、修改狀態)");
//			System.out.print("陛下請選擇: ");
//			int choice = input.nextInt();
		
			//改成pane輸出
			String strMenu = "1. 皇帝下旨選妃\n";
			strMenu += "2. 翻牌寵幸\n";
			strMenu += "3. 打入冷宮\n";
			strMenu += "4. 朕的愛妃呢\n";
			strMenu += "陛下請選擇: ";
			
			Object objResult = JOptionPane.showInputDialog(null, strMenu, "遊戲進行到第" + gameDays + "天",
										0,new ImageIcon("images/title.png"), 
										new String[]{"1", "2", "3", "4"}, 1);
										
			// integer.parseInt將用戶的選擇(1-4 string)轉成Int
			switch (objResult.toString()) {
			case "1": 
				if(nnCount == nnNameArray.length) {
					System.out.println("後宮已人滿為患>>添加失敗!");
					break;
				}
//				System.out.print("請輸入新進娘娘的名諱");
//				String newName = input.next();
				
				objResult = JOptionPane.showInputDialog(null, "請選擇秀女", "選妃", 0, 
											new ImageIcon("images/選妃.png"), 
											newNameArray, null);
				if(objResult == null) {//用戶選擇了取消
					continue; //不選妃了,做其他事情
				}
				JOptionPane.showMessageDialog(null, objResult.toString(), "選中的嬪妃",
											  0, new ImageIcon("images/" + objResult.toString() + ".png"));
				
				
				
				//update related arrays
				nnNameArray[nnCount] = objResult.toString();
				favor[nnCount] = 100;
				
				//因為有新進娘娘,所以其他娘娘好感度-10
				for (int i = 0; i < nnCount; i++) {
					favor[i] -= 10;
				}
				nnCount++;
				break;

			case "2": //被翻牌的+20, others -20
//				System.out.println("請輸入娘娘的名諱:");
//				String name = input.next();
				
				objResult = JOptionPane.showInputDialog(null, "陛下請選擇", "翻牌", 0, 
														new ImageIcon("images/翻牌.png"),
														nnNameArray, null);
				
				if (objResult == null) {
					continue;
					
				}
				String name = objResult.toString();
				
				//Search
				int searchIndex = -1;
				
				for (int i = 0; i < nnCount; i++) {
					if(name.compareTo(nnNameArray[i]) == 0) {
						searchIndex = i;
						break;
					}
				}
				if(searchIndex == -1) {
					System.out.println("陛下,不要活在夢中,要面對現實!");
					break;
				}
				//If searched: 當前的娘娘好感度+20並升1級,其他人好感度-10
				favor[searchIndex] += 20;
				
				if(level[searchIndex] + 1 == levelNames.length) {
					System.out.println(nnNameArray[searchIndex] + "娘娘已經母儀天下,升級失敗!");
					//punishment
					favor[searchIndex] += 10;
					
				}else {
					level[searchIndex] ++;
					
					
				}
				
				for (int i = 0; i < nnCount; i++) {
					if(i == searchIndex) {
						continue;
					}
					favor[i] -= 10;
				}
				
//				System.out.println("寵幸"+ nnNameArray[searchIndex] + ",好感度+10, 升級為" + 
//									levelNames[level[searchIndex]] + ", 其他娘娘好感度-10!");
				JOptionPane.showMessageDialog(null, "寵幸"+ nnNameArray[searchIndex] + ",好感度+10, 升級為" + 
									          levelNames[level[searchIndex]] + ", 其他娘娘好感度-10!", 
									          "翻牌的結果", 0, new ImageIcon("images/" + nnNameArray[searchIndex] + ".png"));
				break;
				
				
			case "3":
			case "4":
			default:
				System.out.println("必須輸入1-4之間的整數");
				continue;
			}
		
		//print list
//		System.out.println("姓名\tlevel\tfavor\n");	
//		for (int i = 0; i < nnCount; i++) {
//			System.out.println(nnNameArray[i] + "\t" + levelNames[level[i]] + "\t" + favor[i]);
//		}
		
		//如果有3個以上的妃子好感度都低於60,遊戲強制退出
		int badCount = 0;
		
		for(int i = 0; i < nnCount; i++) {
			if (favor[i] < 60) {
				badCount ++;
			}
		}  
		
		String resultValue = "後宮有3個以上的娘娘好感度低於60, 發生暴亂!\n";
		resultValue += new Date().toLocaleString();
		if(badCount >= 3) {
			JOptionPane.showMessageDialog(null, resultValue,
					                      "突發事件, 發生暴亂", 0, new ImageIcon("images/暴亂.png"));
			System.exit(0);
		}
		
		
			
		//每日結算
		String result = "時光飛逝,又過了一天,後宮的情況如下: \n";
		for (int i = 0; i < nnCount; i++) {
			result += String.format("%-4s   %2s   %d\n", nnNameArray[i], levelNames[level[i]], favor[i]);
		}
		JOptionPane.showMessageDialog(null, result, "每日結算", 0, new ImageIcon("images/結算.png"));
		gameDays ++;
		
		
		}
		
		
		
		
		
		
		
	}

}
