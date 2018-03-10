package com.chao.designpattern;

//抽象产品类
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

//具体产品类
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

//具体产品类
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

//抽象工厂类
interface LaptopFactory{
	public Laptop produce();
	public void afterServices();
}

//具体工厂类
class DellFactory implements LaptopFactory{

	@Override
	public Laptop produce() {
		return new Dell();
	}

	@Override
	public void afterServices() {
		System.out.println("欢迎致电dell售后服务！");
	}
}

//具体工厂
class LenovoFactory implements LaptopFactory{

	@Override
	public Laptop produce() {
		return new Lenovo();
	}

	@Override
	public void afterServices() {
		System.out.println("欢迎致电lenovo售后服务！");
	}
}

//客户
public class FactoryMethod {
	public static void main(String[] args) {
		LaptopFactory factory1 = new DellFactory();
		Laptop computer1 = factory1.produce();
		computer1.getDesprition();
		System.out.println("该电脑的编号为：" + computer1.getId());
		factory1.afterServices();
		
		LaptopFactory factory2 = new LenovoFactory();
		Laptop computer2 = factory2.produce();
		computer2.getDesprition();
		System.out.println("该电脑的编号为：" + computer2.getId());
		factory2.afterServices();
	}
}
