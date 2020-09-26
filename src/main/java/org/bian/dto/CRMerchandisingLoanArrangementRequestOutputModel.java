package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementRequestOutputModel
 */
public class CRMerchandisingLoanArrangementRequestOutputModel   {
  private String merchandisingLoanArrangementParameterType = null;

  private String merchandisingLoanArrangementSelectedOption = null;

  private String merchandisingLoanArrangementSchedule = null;

  private String merchandisingLoanArrangementStatus = null;

  private String merchandisingLoanArrangementRequestActionTaskReference = null;

  private Object merchandisingLoanArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Merchandising Loan Arrangement instance request service call 
   * @return merchandisingLoanArrangementRequestActionTaskReference
  **/

  public String getMerchandisingLoanArrangementRequestActionTaskReference() {
    return merchandisingLoanArrangementRequestActionTaskReference;
  }

  public void setMerchandisingLoanArrangementRequestActionTaskReference(String merchandisingLoanArrangementRequestActionTaskReference) {
    this.merchandisingLoanArrangementRequestActionTaskReference = merchandisingLoanArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return merchandisingLoanArrangementRequestActionTaskRecord
  **/

  public Object getMerchandisingLoanArrangementRequestActionTaskRecord() {
    return merchandisingLoanArrangementRequestActionTaskRecord;
  }

  public void setMerchandisingLoanArrangementRequestActionTaskRecord(Object merchandisingLoanArrangementRequestActionTaskRecord) {
    this.merchandisingLoanArrangementRequestActionTaskRecord = merchandisingLoanArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

