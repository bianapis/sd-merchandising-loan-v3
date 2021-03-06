/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface MerchandisingLoanApiService {

	SDMerchandisingLoanActivateOutputModel activate(SDMerchandisingLoanActivateInputModel request);
	
	SDMerchandisingLoanConfigureOutputModel configure(String sdReferenceId, SDMerchandisingLoanConfigureInputModel request);
	
	CRMerchandisingLoanArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRMerchandisingLoanArrangementControlInputModel request);
	
	BQBillingExchangeOutputModel exchangeBilling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBillingExchangeInputModel request);
	
	BQFeesExchangeOutputModel exchangeFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesExchangeInputModel request);
	
	BQLienExchangeOutputModel exchangeLien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLienExchangeInputModel request);
	
	BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request);
	
	BQSweepExchangeOutputModel exchangeSweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSweepExchangeInputModel request);
	
	CRMerchandisingLoanArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRMerchandisingLoanArrangementExchangeInputModel request);
	
	CRMerchandisingLoanArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRMerchandisingLoanArrangementExecuteInputModel request);
	
	SDMerchandisingLoanFeedbackOutputModel feedback(String sdReferenceId, SDMerchandisingLoanFeedbackInputModel request);
	
	CRMerchandisingLoanArrangementInitiateOutputModel initiate(String sdReferenceId, CRMerchandisingLoanArrangementInitiateInputModel request);
	
	BQBillingInitiateOutputModel initiateBilling(String sdReferenceId, String crReferenceId, BQBillingInitiateInputModel request);
	
	BQCollateralInitiateOutputModel initiateCollateral(String sdReferenceId, String crReferenceId, BQCollateralInitiateInputModel request);
	
	BQDepositsInitiateOutputModel initiateDeposits(String sdReferenceId, String crReferenceId, BQDepositsInitiateInputModel request);
	
	BQFeesInitiateOutputModel initiateFees(String sdReferenceId, String crReferenceId, BQFeesInitiateInputModel request);
	
	BQFinancialInstrumentInitiateOutputModel initiateFinancialinstrument(String sdReferenceId, String crReferenceId, BQFinancialInstrumentInitiateInputModel request);
	
	BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request);
	
	BQLienInitiateOutputModel initiateLien(String sdReferenceId, String crReferenceId, BQLienInitiateInputModel request);
	
	BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request);
	
	BQSweepInitiateOutputModel initiateSweep(String sdReferenceId, String crReferenceId, BQSweepInitiateInputModel request);
	
	BQWithdrawalsInitiateOutputModel initiateWithdrawals(String sdReferenceId, String crReferenceId, BQWithdrawalsInitiateInputModel request);
	
	BQCollateralRequestOutputModel requestCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralRequestInputModel request);
	
	BQFeesRequestOutputModel requestFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesRequestInputModel request);
	
	CRMerchandisingLoanArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRMerchandisingLoanArrangementRequestInputModel request);
	
	CRMerchandisingLoanArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQBillingRetrieveOutputModel retrieveBilling(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCollateralRetrieveOutputModel retrieveCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDepositsRetrieveOutputModel retrieveDeposits(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFeesRetrieveOutputModel retrieveFees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFinancialAccountingRetrieveOutputModel retrieveFinancialaccounting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFinancialInstrumentRetrieveOutputModel retrieveFinancialinstrument(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQLienRetrieveOutputModel retrieveLien(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSweepRetrieveOutputModel retrieveSweep(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQWithdrawalsRetrieveOutputModel retrieveWithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDMerchandisingLoanRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRMerchandisingLoanArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRMerchandisingLoanArrangementUpdateInputModel request);
	
	BQBillingUpdateOutputModel updateBilling(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBillingUpdateInputModel request);
	
	BQCollateralUpdateOutputModel updateCollateral(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCollateralUpdateInputModel request);
	
	BQDepositsUpdateOutputModel updateDeposits(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsUpdateInputModel request);
	
	BQFeesUpdateOutputModel updateFees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFeesUpdateInputModel request);
	
	BQFinancialAccountingUpdateOutputModel updateFinancialaccounting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialAccountingUpdateInputModel request);
	
	BQFinancialInstrumentUpdateOutputModel updateFinancialinstrument(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFinancialInstrumentUpdateInputModel request);
	
	BQInterestUpdateOutputModel updateInterest(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInterestUpdateInputModel request);
	
	BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request);
	
	BQLienUpdateOutputModel updateLien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLienUpdateInputModel request);
	
	BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request);
	
	BQSweepUpdateOutputModel updateSweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSweepUpdateInputModel request);
	
	BQWithdrawalsUpdateOutputModel updateWithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQWithdrawalsUpdateInputModel request);
	
}
