package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementUpdateOutputModel
 */
public class CRMerchandisingLoanArrangementUpdateOutputModel   {
  private String merchandisingLoanArrangementParameterType = null;

  private String merchandisingLoanArrangementSelectedOption = null;

  private String merchandisingLoanArrangementSchedule = null;

  private String merchandisingLoanArrangementStatus = null;

  private String merchandisingLoanArrangementUpdateActionTaskReference = null;

  private Object merchandisingLoanArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return merchandisingLoanArrangementUpdateActionTaskReference
  **/

  public String getMerchandisingLoanArrangementUpdateActionTaskReference() {
    return merchandisingLoanArrangementUpdateActionTaskReference;
  }

  public void setMerchandisingLoanArrangementUpdateActionTaskReference(String merchandisingLoanArrangementUpdateActionTaskReference) {
    this.merchandisingLoanArrangementUpdateActionTaskReference = merchandisingLoanArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return merchandisingLoanArrangementUpdateActionTaskRecord
  **/

  public Object getMerchandisingLoanArrangementUpdateActionTaskRecord() {
    return merchandisingLoanArrangementUpdateActionTaskRecord;
  }

  public void setMerchandisingLoanArrangementUpdateActionTaskRecord(Object merchandisingLoanArrangementUpdateActionTaskRecord) {
    this.merchandisingLoanArrangementUpdateActionTaskRecord = merchandisingLoanArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

