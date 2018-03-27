package com.ana.customer;

public class SliverCustomer extends Customer {

	public SliverCustomer(int amount) {
		super(amount);
		super.discount=0.1f;;
		
	}
	@Override
	public void print(){
		int total=(int)(amount*(1-discount));
		System.out.println("原價:"+amount+"	"+"打折後:"+total);
	}
}