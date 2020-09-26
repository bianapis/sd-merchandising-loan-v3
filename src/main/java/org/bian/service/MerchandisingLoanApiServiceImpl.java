/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class MerchandisingLoanApiServiceImpl implements MerchandisingLoanApiService {

	public SDMerchandisingLoanActivateOutputModel activate(SDMerchandisingLoanActivateInputModel request){
		return JsonReader.read("activate-SDMerchandisingLoanActivateOutputModel.json",new TypeReference<SDMerchandisingLoanActivateOutputModel>(){});
	}
	
	public SDMerchandisingLoanConfigureOutputModel configure(String sdReferenceId, SDMerchandisingLoanConfigureInputModel request){
		return JsonReader.read("configure-SDMerchandisingLoanConfigureOutputModel.json",new TypeReference<SDMerchandisingLoanConfigureOutputModel>(){});
	}
	
	public CRMerchandisingLoanArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRMerchandisingLoanArrangementControlInputModel request){
		return JsonReader.read("control-CRMerchandisingLoanArrangementControlOutputModel.json",new TypeReference<CRMerchandisingLoanArrangementControlOutputModel>(){});
	}
	
	public BQBillingExchangeOutputModel exchangeBilling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBillingExchangeInputModel request){
		return JsonReader.read("exchange-BQBillingExchangeOutputModel.json",new TypeReference<BQBillingExchangeOutputModel>(){});
	}
	
	public BQFeesExchangeOutputModel exchangeFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesExchangeInputModel request){
		return JsonReader.read("exchange-BQFeesExchangeOutputModel.json",new TypeReference<BQFeesExchangeOutputModel>(){});
	}
	
	public BQLienExchangeOutputModel exchangeLien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLienExchangeInputModel request){
		return JsonReader.read("exchange-BQLienExchangeOutputModel.json",new TypeReference<BQLienExchangeOutputModel>(){});
	}
	
	public BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentsExchangeOutputModel.json",new TypeReference<BQPaymentsExchangeOutputModel>(){});
	}
	
	public BQSweepExchangeOutputModel exchangeSweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSweepExchangeInputModel request){
		return JsonReader.read("exchange-BQSweepExchangeOutputModel.json",new TypeReference<BQSweepExchangeOutputModel>(){});
	}
	
	public CRMerchandisingLoanArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRMerchandisingLoanArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRMerchandisingLoanArrangementExchangeOutputModel.json",new TypeReference<CRMerchandisingLoanArrangementExchangeOutputModel>(){});
	}
	
	public CRMerchandisingLoanArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRMerchandisingLoanArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRMerchandisingLoanArrangementExecuteOutputModel.json",new TypeReference<CRMerchandisingLoanArrangementExecuteOutputModel>(){});
	}
	
	public SDMerchandisingLoanFeedbackOutputModel feedback(String sdReferenceId, SDMerchandisingLoanFeedbackInputModel request){
		return JsonReader.read("feedback-SDMerchandisingLoanFeedbackOutputModel.json",new TypeReference<SDMerchandisingLoanFeedbackOutputModel>(){});
	}
	
	public CRMerchandisingLoanArrangementInitiateOutputModel initiate(String sdReferenceId, CRMerchandisingLoanArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRMerchandisingLoanArrangementInitiateOutputModel.json",new TypeReference<CRMerchandisingLoanArrangementInitiateOutputModel>(){});
	}
	
	public BQBillingInitiateOutputModel initiateBilling(String sdReferenceId, String crReferenceId, BQBillingInitiateInputModel request){
		return JsonReader.read("initiate-BQBillingInitiateOutputModel.json",new TypeReference<BQBillingInitiateOutputModel>(){});
	}
	
	public BQCollateralInitiateOutputModel initiateCollateral(String sdReferenceId, String crReferenceId, BQCollateralInitiateInputModel request){
		return JsonReader.read("initiate-BQCollateralInitiateOutputModel.json",new TypeReference<BQCollateralInitiateOutputModel>(){});
	}
	
	public BQDepositsInitiateOutputModel initiateDeposits(String sdReferenceId, String crReferenceId, BQDepositsInitiateInputModel request){
		return JsonReader.read("initiate-BQDepositsInitiateOutputModel.json",new TypeReference<BQDepositsInitiateOutputModel>(){});
	}
	
	public BQFeesInitiateOutputModel initiateFees(String sdReferenceId, String crReferenceId, BQFeesInitiateInputModel request){
		return JsonReader.read("initiate-BQFeesInitiateOutputModel.json",new TypeReference<BQFeesInitiateOutputModel>(){});
	}
	
	public BQFinancialInstrumentInitiateOutputModel initiateFinancialinstrument(String sdReferenceId, String crReferenceId, BQFinancialInstrumentInitiateInputModel request){
		return JsonReader.read("initiate-BQFinancialInstrumentInitiateOutputModel.json",new TypeReference<BQFinancialInstrumentInitiateOutputModel>(){});
	}
	
	public BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request){
		return JsonReader.read("initiate-BQIssuedDeviceInitiateOutputModel.json",new TypeReference<BQIssuedDeviceInitiateOutputModel>(){});
	}
	
	public BQLienInitiateOutputModel initiateLien(String sdReferenceId, String crReferenceId, BQLienInitiateInputModel request){
		return JsonReader.read("initiate-BQLienInitiateOutputModel.json",new TypeReference<BQLienInitiateOutputModel>(){});
	}
	
	public BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request){
		return JsonReader.read("initiate-BQPaymentsInitiateOutputModel.json",new TypeReference<BQPaymentsInitiateOutputModel>(){});
	}
	
	public BQSweepInitiateOutputModel initiateSweep(String sdReferenceId, String crReferenceId, BQSweepInitiateInputModel request){
		return JsonReader.read("initiate-BQSweepInitiateOutputModel.json",new TypeReference<BQSweepInitiateOutputModel>(){});
	}
	
	public BQWithdrawalsInitiateOutputModel initiateWithdrawals(String sdReferenceId, String crReferenceId, BQWithdrawalsInitiateInputModel request){
		return JsonReader.read("initiate-BQWithdrawalsInitiateOutputModel.json",new TypeReference<BQWithdrawalsInitiateOutputModel>(){});
	}
	
	public BQCollateralRequestOutputModel requestCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralRequestInputModel request){
		return JsonReader.read("request-BQCollateralRequestOutputModel.json",new TypeReference<BQCollateralRequestOutputModel>(){});
	}
	
	public BQFeesRequestOutputModel requestFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesRequestInputModel request){
		return JsonReader.read("request-BQFeesRequestOutputModel.json",new TypeReference<BQFeesRequestOutputModel>(){});
	}
	
	public CRMerchandisingLoanArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRMerchandisingLoanArrangementRequestInputModel request){
		return JsonReader.read("request-CRMerchandisingLoanArrangementRequestOutputModel.json",new TypeReference<CRMerchandisingLoanArrangementRequestOutputModel>(){});
	}
	
	public CRMerchandisingLoanArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRMerchandisingLoanArrangementRetrieveOutputModel.json",new TypeReference<CRMerchandisingLoanArrangementRetrieveOutputModel>(){});
	}
	
	public BQBillingRetrieveOutputModel retrieveBilling(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBillingRetrieveOutputModel.json",new TypeReference<BQBillingRetrieveOutputModel>(){});
	}
	
	public BQCollateralRetrieveOutputModel retrieveCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCollateralRetrieveOutputModel.json",new TypeReference<BQCollateralRetrieveOutputModel>(){});
	}
	
	public BQDepositsRetrieveOutputModel retrieveDeposits(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDepositsRetrieveOutputModel.json",new TypeReference<BQDepositsRetrieveOutputModel>(){});
	}
	
	public BQFeesRetrieveOutputModel retrieveFees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFeesRetrieveOutputModel.json",new TypeReference<BQFeesRetrieveOutputModel>(){});
	}
	
	public BQFinancialAccountingRetrieveOutputModel retrieveFinancialaccounting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFinancialAccountingRetrieveOutputModel.json",new TypeReference<BQFinancialAccountingRetrieveOutputModel>(){});
	}
	
	public BQFinancialInstrumentRetrieveOutputModel retrieveFinancialinstrument(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFinancialInstrumentRetrieveOutputModel.json",new TypeReference<BQFinancialInstrumentRetrieveOutputModel>(){});
	}
	
	public BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInterestRetrieveOutputModel.json",new TypeReference<BQInterestRetrieveOutputModel>(){});
	}
	
	public BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQIssuedDeviceRetrieveOutputModel.json",new TypeReference<BQIssuedDeviceRetrieveOutputModel>(){});
	}
	
	public BQLienRetrieveOutputModel retrieveLien(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLienRetrieveOutputModel.json",new TypeReference<BQLienRetrieveOutputModel>(){});
	}
	
	public BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentsRetrieveOutputModel.json",new TypeReference<BQPaymentsRetrieveOutputModel>(){});
	}
	
	public BQSweepRetrieveOutputModel retrieveSweep(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSweepRetrieveOutputModel.json",new TypeReference<BQSweepRetrieveOutputModel>(){});
	}
	
	public BQWithdrawalsRetrieveOutputModel retrieveWithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQWithdrawalsRetrieveOutputModel.json",new TypeReference<BQWithdrawalsRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDMerchandisingLoanRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDMerchandisingLoanRetrieveOutputModel.json",new TypeReference<SDMerchandisingLoanRetrieveOutputModel>(){});
	}
	
	public CRMerchandisingLoanArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRMerchandisingLoanArrangementUpdateInputModel request){
		return JsonReader.read("update-CRMerchandisingLoanArrangementUpdateOutputModel.json",new TypeReference<CRMerchandisingLoanArrangementUpdateOutputModel>(){});
	}
	
	public BQBillingUpdateOutputModel updateBilling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBillingUpdateInputModel request){
		return JsonReader.read("update-BQBillingUpdateOutputModel.json",new TypeReference<BQBillingUpdateOutputModel>(){});
	}
	
	public BQCollateralUpdateOutputModel updateCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralUpdateInputModel request){
		return JsonReader.read("update-BQCollateralUpdateOutputModel.json",new TypeReference<BQCollateralUpdateOutputModel>(){});
	}
	
	public BQDepositsUpdateOutputModel updateDeposits(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsUpdateInputModel request){
		return JsonReader.read("update-BQDepositsUpdateOutputModel.json",new TypeReference<BQDepositsUpdateOutputModel>(){});
	}
	
	public BQFeesUpdateOutputModel updateFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesUpdateInputModel request){
		return JsonReader.read("update-BQFeesUpdateOutputModel.json",new TypeReference<BQFeesUpdateOutputModel>(){});
	}
	
	public BQFinancialAccountingUpdateOutputModel updateFinancialaccounting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialAccountingUpdateInputModel request){
		return JsonReader.read("update-BQFinancialAccountingUpdateOutputModel.json",new TypeReference<BQFinancialAccountingUpdateOutputModel>(){});
	}
	
	public BQFinancialInstrumentUpdateOutputModel updateFinancialinstrument(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialInstrumentUpdateInputModel request){
		return JsonReader.read("update-BQFinancialInstrumentUpdateOutputModel.json",new TypeReference<BQFinancialInstrumentUpdateOutputModel>(){});
	}
	
	public BQInterestUpdateOutputModel updateInterest(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInterestUpdateInputModel request){
		return JsonReader.read("update-BQInterestUpdateOutputModel.json",new TypeReference<BQInterestUpdateOutputModel>(){});
	}
	
	public BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request){
		return JsonReader.read("update-BQIssuedDeviceUpdateOutputModel.json",new TypeReference<BQIssuedDeviceUpdateOutputModel>(){});
	}
	
	public BQLienUpdateOutputModel updateLien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLienUpdateInputModel request){
		return JsonReader.read("update-BQLienUpdateOutputModel.json",new TypeReference<BQLienUpdateOutputModel>(){});
	}
	
	public BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request){
		return JsonReader.read("update-BQPaymentsUpdateOutputModel.json",new TypeReference<BQPaymentsUpdateOutputModel>(){});
	}
	
	public BQSweepUpdateOutputModel updateSweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSweepUpdateInputModel request){
		return JsonReader.read("update-BQSweepUpdateOutputModel.json",new TypeReference<BQSweepUpdateOutputModel>(){});
	}
	
	public BQWithdrawalsUpdateOutputModel updateWithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalsUpdateInputModel request){
		return JsonReader.read("update-BQWithdrawalsUpdateOutputModel.json",new TypeReference<BQWithdrawalsUpdateOutputModel>(){});
	}
	
}
