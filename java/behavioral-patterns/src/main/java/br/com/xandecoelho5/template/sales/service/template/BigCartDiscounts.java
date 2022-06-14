package br.com.xandecoelho5.template.sales.service.template;

import br.com.xandecoelho5.template.sales.model.Cart;

public class BigCartDiscounts extends BestOfferTemplate {

	public BigCartDiscounts(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return regularItemsPrice > 1000;
	}

	@Override
	protected void calibrateVariables() {
		priceFactor = 0.9d;
	}

}
