package IdolTrainning;

import java.util.ArrayList;

public class Human {
	String name;//	이름
	int age;//	나이
    int height; //	키
    int vocalStat;	//	노래실력
    int danceStat;//	춤실력
    int hp=5;//	체력
    int condition=2;//	컨디션
    ArrayList<String> title = new ArrayList<>();
    
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getTitle() {
		return title;
	}

	public void setTitle(ArrayList<String> title) {
		this.title = title;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getVocalStat() {
		return vocalStat;
	}
	public void setVocalStat(int vocalStat) {
		this.vocalStat = vocalStat;
	}
	public int getDanceStat() {
		return danceStat;
	}
	public void setDanceStat(int danceStat) {
		this.danceStat = danceStat;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getCondition() {
		return condition;
	}
	public void setCondition(int condition) {
		this.condition = condition;
	}
    	
}
