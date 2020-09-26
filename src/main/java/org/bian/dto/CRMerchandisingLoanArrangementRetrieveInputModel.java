package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceAnalysis;
import org.bian.dto.CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementRetrieveInputModel
 */
public class CRMerchandisingLoanArrangementRetrieveInputModel   {
  private Object merchandisingLoanArrangementRetrieveActionTaskRecord = null;

  private String merchandisingLoanArrangementRetrieveActionRequest = null;

  private CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceReportRecord merchandisingLoanArrangementInstanceReportRecord = null;

  private CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceAnalysis merchandisingLoanArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return merchandisingLoanArrangementRetrieveActionTaskRecord
  **/

  public Object getMerchandisingLoanArrangementRetrieveActionTaskRecord() {
    return merchandisingLoanArrangementRetrieveActionTaskRecord;
  }

  public void setMerchandisingLoanArrangementRetrieveActionTaskRecord(Object merchandisingLoanArrangementRetrieveActionTaskRecord) {
    this.merchandisingLoanArrangementRetrieveActionTaskRecord = merchandisingLoanArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return merchandisingLoanArrangementRetrieveActionRequest
  **/

  public String getMerchandisingLoanArrangementRetrieveActionRequest() {
    return merchandisingLoanArrangementRetrieveActionRequest;
  }

  public void setMerchandisingLoanArrangementRetrieveActionRequest(String merchandisingLoanArrangementRetrieveActionRequest) {
    this.merchandisingLoanArrangementRetrieveActionRequest = merchandisingLoanArrangementRetrieveActionRequest;
  }


  /**
   * Get merchandisingLoanArrangementInstanceReportRecord
   * @return merchandisingLoanArrangementInstanceReportRecord
  **/

  public CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceReportRecord getMerchandisingLoanArrangementInstanceReportRecord() {
    return merchandisingLoanArrangementInstanceReportRecord;
  }

  public void setMerchandisingLoanArrangementInstanceReportRecord(CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceReportRecord merchandisingLoanArrangementInstanceReportRecord) {
    this.merchandisingLoanArrangementInstanceReportRecord = merchandisingLoanArrangementInstanceReportRecord;
  }


  /**
   * Get merchandisingLoanArrangementInstanceAnalysis
   * @return merchandisingLoanArrangementInstanceAnalysis
  **/

  public CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceAnalysis getMerchandisingLoanArrangementInstanceAnalysis() {
    return merchandisingLoanArrangementInstanceAnalysis;
  }

  public void setMerchandisingLoanArrangementInstanceAnalysis(CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceAnalysis merchandisingLoanArrangementInstanceAnalysis) {
    this.merchandisingLoanArrangementInstanceAnalysis = merchandisingLoanArrangementInstanceAnalysis;
  }


}

