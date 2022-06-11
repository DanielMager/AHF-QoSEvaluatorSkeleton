package eu.arrowhead.core.extendedQos.evaluator.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import eu.arrowhead.common.dto.shared.OrchestrationResultDTO;
import eu.arrowhead.core.extendedQos.evaluator.QoSEvaluator;

@Component
public class QoSEvaluatorImpl implements QoSEvaluator {

	// =================================================================================================
	// members

	protected Logger logger = LogManager.getLogger(QoSEvaluatorImpl.class);

	// =================================================================================================
	// methods

	// -------------------------------------------------------------------------------------------------
	@Override
	public List<OrchestrationResultDTO> evaluateServices(List<OrchestrationResultDTO> availableServices,
			Map<String, String> properties) {
		logger.debug("evaluateServices started...");
		
		// Process available services with given properties as you wish...
		
		return availableServices;
	}

	// -------------------------------------------------------------------------------------------------
	@Override
	public String getName() {
		return "qosEvaluatorSkeleton";
	}

	// -------------------------------------------------------------------------------------------------
	@Override
	public String getDescription() {
		return "Description of what this evaluator does, how it works, which parameters it utilizes, etc.";
	}

	// -------------------------------------------------------------------------------------------------
	@Override
	public Map<String, String> getExampleParameters() {
		// return key-value-pairs of parameters this evaluator needs and/or may utilize for evaluation
		return new HashMap<>();
	}
}
