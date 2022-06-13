package br.com.xandecoelho5.iterator.cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cart implements Iterable<Product> {
	private final List<Product> products;
	
	@Override
	public Iterator<Product> iterator() {
		return products.iterator();
	}

	public Cart(Product... products) {
		this.products = Arrays.asList(products);
	}
}
