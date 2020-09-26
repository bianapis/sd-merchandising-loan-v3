package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementControlOutputModel
 */
public class CRMerchandisingLoanArrangementControlOutputModel   {
  private String merchandisingLoanArrangementParameterType = null;

  private String merchandisingLoanArrangementSelectedOption = null;

  private String merchandisingLoanArrangementSchedule = null;

  private String merchandisingLoanArrangementStatus = null;

  private String merchandisingLoanArrangementControlActionTaskReference = null;

  private Object merchandisingLoanArrangementControlActionTaskRecord = null;

  private String merchandisingLoanArrangementControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Merchandising Loan Arrangement instance control processing service call 
   * @return merchandisingLoanArrangementControlActionTaskReference
  **/

  public String getMerchandisingLoanArrangementControlActionTaskReference() {
    return merchandisingLoanArrangementControlActionTaskReference;
  }

  public void setMerchandisingLoanArrangementControlActionTaskReference(String merchandisingLoanArrangementControlActionTaskReference) {
    this.merchandisingLoanArrangementControlActionTaskReference = merchandisingLoanArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return merchandisingLoanArrangementControlActionTaskRecord
  **/

  public Object getMerchandisingLoanArrangementControlActionTaskRecord() {
    return merchandisingLoanArrangementControlActionTaskRecord;
  }

  public void setMerchandisingLoanArrangementControlActionTaskRecord(Object merchandisingLoanArrangementControlActionTaskRecord) {
    this.merchandisingLoanArrangementControlActionTaskRecord = merchandisingLoanArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return merchandisingLoanArrangementControlActionResponse
  **/

  public String getMerchandisingLoanArrangementControlActionResponse() {
    return merchandisingLoanArrangementControlActionResponse;
  }

  public void setMerchandisingLoanArrangementControlActionResponse(String merchandisingLoanArrangementControlActionResponse) {
    this.merchandisingLoanArrangementControlActionResponse = merchandisingLoanArrangementControlActionResponse;
  }


}

