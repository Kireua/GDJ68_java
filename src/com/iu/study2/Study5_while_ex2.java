package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		//TRPG
		int hp=40; //유저의 hp
		int monsterHp=60;// 몬스터의 HP
		int monsterPower=40;//몬스터의 공격력;

		
		//1. 평타 2.스킬 3.HP회복 4.턴 넘기기
		//평타 : 0~10 미만의 공격이 Monster에게 적용
		//스킬 : 0~30 미만의 공격이 몬스터에게 적용(최대 3번까지만)
		//회복 : 0~40 까지 회복 40이상은 X
		//도망 : 50%확률로 성공, 실패
		
		//Monster
		//1 : 유저 공격 0~40미만의 공격을 유저에게
		
		int runSuccess=0;
		int skillUse=3;
		System.out.println("게임을 시작합니다");
		while(true) {
			
			int nomalAttack = random.nextInt(11);
			int skill = random.nextInt(41);
			int recovery = random.nextInt(41);
			int run = random.nextInt(2);
			int monsterAttack= random.nextInt(15);
	
			System.out.println("행동을 선택하세요");
			System.out.println("1.평타   2.스킬  3.회복  4.도망");
			int select = sc.nextInt();
			
			
			if(select==1) {
				monsterHp-=nomalAttack;
				System.out.println("몬스터 체력: " + monsterHp+" 내 데미지 : "+nomalAttack);
				
			}
			
			else if(select==2) {
				if(skillUse<=0) {
					System.out.println("스킬을 더이상 사용 할 수 없습니다.");
					continue;
				}
				skillUse-=1;
				monsterHp-=skill;
				System.out.println("몬스터 체력: " + monsterHp+" 내 데미지 : "+skill+"  남은 스킬 사용 횟수 : "+skillUse);
				
			}
			
			else if(select==3) {
				hp+=recovery;
				System.out.println("내 HP : " +hp+"  회복량 : "+recovery);
				if(hp>40) {
					hp=40;
				}
			
			}
			
			else if(select==4) {
				if(run==0) { 												//도망 성공
					runSuccess=run;
					System.out.println("도망에 성공하였습니다.");
					break;
				}else {														//도망 실패
					System.out.println("도망에 실패하였습니다.");
				}	
			}
			
			System.out.println("몬스터 턴입니다.");								//몬스터 턴
			hp-=monsterAttack;
			System.out.println("몬스터 공격 데미지 : "+monsterAttack+"   내 HP  : "+hp);
			
			if(monsterHp<=0) {							
				System.out.println("내가 이겼다.");
				break;
			}else if(hp<=0) {
				System.out.println("게임 좆같이 만들었네");
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
				
		
		
		
		
	}

}
