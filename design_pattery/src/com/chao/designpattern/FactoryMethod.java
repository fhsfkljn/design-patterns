package com.chao.designpattern;

//�����Ʒ��
abstract class Laptop{
	private String brand;
	
	public Laptop(String brand){
		this.brand = brand;
	}
	
	abstract public String getId();
	
	public void getDesprition(){
		System.out.println("this is a " + brand + "Laptop!");
	}
}

//�����Ʒ��
class Dell extends Laptop{
	private static final String brand = "DELL";
	private static int initId;
	
	public Dell() {
		super(brand);
		initId = 100;
	}

	@Override
	public String getId() {
		return  "DELL----" + (initId++);
	}
}

//�����Ʒ��
class Lenovo extends Laptop{
	private static final String brand = "LENOVO";
	private static int initId;
	
	public Lenovo() {
		super(brand);
		initId = 200;
	}

	@Override
	public String getId() {
		return  "LENOVO----" + (initId++);
	}
}

//���󹤳���
interface LaptopFactory{
	public Laptop produce();
	public void afterServices();
}

//���幤����
class DellFactory implements LaptopFactory{

	@Override
	public Laptop produce() {
		return new Dell();
	}

	@Override
	public void afterServices() {
		System.out.println("��ӭ�µ�dell�ۺ����");
	}
}

//���幤��
class LenovoFactory implements LaptopFactory{

	@Override
	public Laptop produce() {
		return new Lenovo();
	}

	@Override
	public void afterServices() {
		System.out.println("��ӭ�µ�lenovo�ۺ����");
	}
}

//�ͻ�
public class FactoryMethod {
	public static void main(String[] args) {
		LaptopFactory factory1 = new DellFactory();
		Laptop computer1 = factory1.produce();
		computer1.getDesprition();
		System.out.println("�õ��Եı��Ϊ��" + computer1.getId());
		factory1.afterServices();
		
		LaptopFactory factory2 = new LenovoFactory();
		Laptop computer2 = factory2.produce();
		computer2.getDesprition();
		System.out.println("�õ��Եı��Ϊ��" + computer2.getId());
		factory2.afterServices();
	}
}
