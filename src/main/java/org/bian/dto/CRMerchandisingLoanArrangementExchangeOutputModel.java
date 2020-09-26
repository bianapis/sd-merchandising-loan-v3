package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementExchangeOutputModel
 */
public class CRMerchandisingLoanArrangementExchangeOutputModel   {
  private String merchandisingLoanArrangementParameterType = null;

  private String merchandisingLoanArrangementSelectedOption = null;

  private String merchandisingLoanArrangementSchedule = null;

  private String merchandisingLoanArrangementStatus = null;

  private String merchandisingLoanArrangementExchangeActionTaskReference = null;

  private Object merchandisingLoanArrangementExchangeActionTaskRecord = null;

  private String merchandisingLoanArrangementExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between arrangements according to the type of business services within Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementParameterType
  **/

  public String getMerchandisingLoanArrangementParameterType() {
    return merchandisingLoanArrangementParameterType;
  }

  public void setMerchandisingLoanArrangementParameterType(String merchandisingLoanArrangementParameterType) {
    this.merchandisingLoanArrangementParameterType = merchandisingLoanArrangementParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementSelectedOption
  **/

  public String getMerchandisingLoanArrangementSelectedOption() {
    return merchandisingLoanArrangementSelectedOption;
  }

  public void setMerchandisingLoanArrangementSelectedOption(String merchandisingLoanArrangementSelectedOption) {
    this.merchandisingLoanArrangementSelectedOption = merchandisingLoanArrangementSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to fulfill Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementSchedule
  **/

  public String getMerchandisingLoanArrangementSchedule() {
    return merchandisingLoanArrangementSchedule;
  }

  public void setMerchandisingLoanArrangementSchedule(String merchandisingLoanArrangementSchedule) {
    this.merchandisingLoanArrangementSchedule = merchandisingLoanArrangementSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementStatus
  **/

  public String getMerchandisingLoanArrangementStatus() {
    return merchandisingLoanArrangementStatus;
  }

  public void setMerchandisingLoanArrangementStatus(String merchandisingLoanArrangementStatus) {
    this.merchandisingLoanArrangementStatus = merchandisingLoanArrangementStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Merchandising Loan Arrangement instance exchange service call 
   * @return merchandisingLoanArrangementExchangeActionTaskReference
  **/

  public String getMerchandisingLoanArrangementExchangeActionTaskReference() {
    return merchandisingLoanArrangementExchangeActionTaskReference;
  }

  public void setMerchandisingLoanArrangementExchangeActionTaskReference(String merchandisingLoanArrangementExchangeActionTaskReference) {
    this.merchandisingLoanArrangementExchangeActionTaskReference = merchandisingLoanArrangementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return merchandisingLoanArrangementExchangeActionTaskRecord
  **/

  public Object getMerchandisingLoanArrangementExchangeActionTaskRecord() {
    return merchandisingLoanArrangementExchangeActionTaskRecord;
  }

  public void setMerchandisingLoanArrangementExchangeActionTaskRecord(Object merchandisingLoanArrangementExchangeActionTaskRecord) {
    this.merchandisingLoanArrangementExchangeActionTaskRecord = merchandisingLoanArrangementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return merchandisingLoanArrangementExchangeActionResponse
  **/

  public String getMerchandisingLoanArrangementExchangeActionResponse() {
    return merchandisingLoanArrangementExchangeActionResponse;
  }

  public void setMerchandisingLoanArrangementExchangeActionResponse(String merchandisingLoanArrangementExchangeActionResponse) {
    this.merchandisingLoanArrangementExchangeActionResponse = merchandisingLoanArrangementExchangeActionResponse;
  }


}

