package com.dp.abstractfactory.bullet;

import com.dp.abstractfactory.Pict;
import com.dp.abstractfactory.RiskFactorRow;
import com.dp.abstractfactory.RiskFactorFactory;

public class BulletRiskFactorFactory implements RiskFactorFactory {

	@Override
	public RiskFactorRow createRiskFactorRow() {
		return new BulletRiskFactorRow();
	}

	@Override
	public Pict createPict() {
		return new BulletPict();
	}

}
