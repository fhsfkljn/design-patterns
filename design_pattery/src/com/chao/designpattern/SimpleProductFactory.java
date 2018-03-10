package com.chao.designpattern;

//�����Ʒ��
interface FreshWaterFish{
	void grow();   //���ڳ���
	void harvset();   //����Ա��ջ���
}

//�����Ʒ��
class Grasscarp implements FreshWaterFish{

	@Override
	public void grow() {
		System.out.println("��������������");
	}

	@Override
	public void harvset() {
		System.out.println("������Ա��ջ��ˣ�");
	}
}

//�����Ʒ��
class Crap implements FreshWaterFish{

	@Override
	public void grow() {
		System.out.println("��������������");
	}

	@Override
	public void harvset() {
		System.out.println("��������ջ��ˣ�");
	}
}

//�����Ʒ��
class Catfish implements FreshWaterFish{

	@Override
	public void grow() {
		System.out.println("��������������");	
	}

	@Override
	public void harvset() {
		System.out.println("��������ջ��ˣ�");
	}
}

//�򵥹�����
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
			System.out.println("����û�������������࣡");
			return null;
		}
	}
	
	//�ͻ�����
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


