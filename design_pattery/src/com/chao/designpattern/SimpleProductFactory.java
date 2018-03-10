package com.chao.designpattern;

//抽象产品类
interface FreshWaterFish{
	void grow();   //鱼在长大
	void harvset();   //鱼可以被收获了
}

//具体产品类
class Grasscarp implements FreshWaterFish{

	@Override
	public void grow() {
		System.out.println("草鱼正在生长！");
	}

	@Override
	public void harvset() {
		System.out.println("草鱼可以被收获了！");
	}
}

//具体产品类
class Crap implements FreshWaterFish{

	@Override
	public void grow() {
		System.out.println("鲤鱼正在生长！");
	}

	@Override
	public void harvset() {
		System.out.println("鲤鱼可以收获了！");
	}
}

//具体产品类
class Catfish implements FreshWaterFish{

	@Override
	public void grow() {
		System.out.println("鲇鱼正在生长！");	
	}

	@Override
	public void harvset() {
		System.out.println("鲇鱼可以收获了！");
	}
}

//简单工厂类
public class SimpleProductFactory {
	
	public static FreshWaterFish productFish(String fishName){
		switch (fishName) {
		case "grasscarp":
			return new Grasscarp();
		case "crap":
			return new Crap();
		case "catfish":
			return new Catfish();
		default:
			System.out.println("工厂没有生产这种鱼类！");
			return null;
		}
	}
	
	//客户调用
	public static void main(String[] args) {
		FreshWaterFish fish = SimpleProductFactory.productFish("grasscarp");
		if(fish!=null){
			fish.grow();
			fish.harvset();
		}
		
		FreshWaterFish fish2 = SimpleProductFactory.productFish("crap");
		if(fish2!=null){
			fish2.grow();
			fish2.harvset();
		}
		
		FreshWaterFish fish3 = SimpleProductFactory.productFish("yellow");
		if(fish3!=null){
			fish3.grow();
			fish3.harvset();
		}
	}
}


