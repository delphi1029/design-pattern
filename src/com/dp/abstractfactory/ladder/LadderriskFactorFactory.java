package com.dp.abstractfactory.ladder;

import com.dp.abstractfactory.Pict;
import com.dp.abstractfactory.RiskFactorRow;
import com.dp.abstractfactory.RiskFactorFactory;

public class LadderriskFactorFactory implements RiskFactorFactory {

	@Override
	public RiskFactorRow createRiskFactorRow() {
		return new LadderRiskFactorRow();
	}

	@Override
	public Pict createPict() {
		return new LadderPict();
	}

}
