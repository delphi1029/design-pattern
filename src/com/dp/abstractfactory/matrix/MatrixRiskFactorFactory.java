package com.dp.abstractfactory.matrix;

import com.dp.abstractfactory.Pict;
import com.dp.abstractfactory.RiskFactorFactory;
import com.dp.abstractfactory.RiskFactorRow;

public class MatrixRiskFactorFactory implements RiskFactorFactory {

	@Override
	public RiskFactorRow createRiskFactorRow() {
		return new MartixRiskFactor();
	}

	@Override
	public Pict createPict() {
		return new MatrixPict();
	}

}
