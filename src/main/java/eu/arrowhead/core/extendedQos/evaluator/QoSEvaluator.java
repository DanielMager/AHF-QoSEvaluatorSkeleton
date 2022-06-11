package eu.arrowhead.core.extendedQos.evaluator;

import java.util.List;
import java.util.Map;

import eu.arrowhead.common.dto.shared.OrchestrationResultDTO;

public interface QoSEvaluator {

	// =================================================================================================
	// methods

	// -------------------------------------------------------------------------------------------------
	public List<OrchestrationResultDTO> evaluateServices(List<OrchestrationResultDTO> availableServices,
			Map<String, String> properties);

	// -------------------------------------------------------------------------------------------------
	public String getName();

	// -------------------------------------------------------------------------------------------------
	public String getDescription();

	// -------------------------------------------------------------------------------------------------
	public Map<String, String> getExampleParameters();
}