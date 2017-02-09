package com.kodonho.designpattern.factorymethod;

// 제품(Product)이 포장된 상태
public abstract class Packed {
	Product product;
	public void setProduct(Product product){
		this.product = product;
	}
}
