package chapter08;

// Product : price
// Computer 200, TV 100, Audio 50 

public class ProductEx1 {
	public static void main(String[] args)  {
		System.out.println(new Computer());
		
		Buyer buyer = new Buyer();
		buyer.buy(new Computer());
		buyer.buy(new Computer());
		buyer.summary();
		buyer.buy(new Computer());
		buyer.buy(new Computer());
		buyer.buy(new Computer());
		buyer.buy(new Computer());
		buyer.summary();
	}
}

class Product {
	int price;

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
}

class Computer extends Product{
	public Computer() {
		price=200;
	}
	
}

class TV extends Product{
	public TV() {
		price=100;
	}
}

class Audio extends Product{
	public Audio() {
		price=50;
	}
}

class Buyer{
	int money = 1000;
	Product[] cart = new Product[10];
	int cnt;
	
	void buy(Product product) {
		if(money < product.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		cart[cnt++] = product;
		money -= product.price;
	}
	
	void summary() {
		// 잔액 : xxxx  제품의 합계 : xxxx 
		int sum = 0;
		String cartText ="";
		for(int i=0; i<cnt; i++) {
			sum += cart[i].price;
			cartText += cart[i] + " ";
		}
		System.out.println("현재 잔액은" + money + "원 이고 제품의 합계는 " + sum + "원 입니다");
		System.out.println("장바구니 [" + cartText + "]");
		// 현재 장바구니에는 [xxx,xxx,xxx]가 있습니다
	}
	
}