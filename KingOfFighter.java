import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Scanner;


/**
 * Exercise looping
 * @author kshing
 * @version 1.0
 * @date Jan 19, 2020 8:57:54 PM
 * @copyright kshing
 * @remark TODO
 *
 */
public class KingOfFighter {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		Scanner input = new Scanner(System.in);
		
		//play music
		File sound1 = new File("JAVAmusic/GEM.wav");
		AudioClip sound_choose = Applet.newAudioClip(sound1.toURL());
		sound_choose.play();
		
		//Let user select his/her name
		System.out.print("Please enter your name:");
		String userName = input.next();
		String comName = "monster";
		System.out.println(userName + " VS." + comName);
		
		
		sound_choose.stop();
		sound1 = new File("JAVAmusic/GEM1.wav");
		sound_choose = Applet.newAudioClip(sound1.toURL());
		sound_choose.play();
		
		
		//Initialize parameters of both user and computer
		int hp1 = 100, hp2 = 100;
		int attack1 = 0, attack2 = 0;
		
		
		//loop for simulating procedure of battle between user and computer
		while(hp1 > 0 && hp2 > 0) {
			//generate random value of attack for both user and computer
			attack1 = (int)(Math.random() * 100) % 11 + 5;  //range of value of attack:5~15
			attack2 = (int)(Math.random() * 100) % 11 + 5;
			
			//assume user perform attack first
			hp2 -= attack1;
			System.out.println(userName + "attack " + comName + "with " + attack1);
			if(attack1 >= 0 && attack1 <=5) {
				System.out.println("slight hurt is " + comName);
			}else if(attack1 >= 10) {
				System.out.println("Strong hurt is " + comName);	
			}
			
			Thread.sleep(1000);
			
			hp1 -= attack2;	
			System.out.println(comName + "attack " + userName + "with " + attack2);
			if(attack2 >= 0 && attack2 <=5) {
				System.out.println("slight hurt is " + userName);
			}else if(attack2 >= 10) {
				System.out.println("Strong hurt is " + userName);	
			}
		}
		
		//print result of battle
		System.out.println("KO!");
		System.out.println("player\tHP");
		System.out.println(userName+'\t'+hp1);
		System.out.println(comName+'\t'+hp2);
		
		
		
		
		System.out.println("Press Enter to continue");
		input.nextLine();
		
		input.close();
		
				
		
		
		
		
		
	}
	
	
	
	
}
