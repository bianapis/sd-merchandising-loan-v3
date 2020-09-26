package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementInitiateOutputModel
 */
public class CRMerchandisingLoanArrangementInitiateOutputModel   {
  private String merchandisingLoanArrangementInstanceReference = null;

  private String merchandisingLoanArrangementInitiateActionReference = null;

  private Object merchandisingLoanArrangementInitiateActionRecord = null;

  private String merchandisingLoanArrangementInstanceStatus = null;

  private String merchandisingLoanArrangementParameterType = null;

  private String merchandisingLoanArrangementSelectedOption = null;

  private String merchandisingLoanArrangementSchedule = null;

  private String merchandisingLoanArrangementStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Merchandising Loan Arrangement instance 
   * @return merchandisingLoanArrangementInstanceReference
  **/

  public String getMerchandisingLoanArrangementInstanceReference() {
    return merchandisingLoanArrangementInstanceReference;
  }

  public void setMerchandisingLoanArrangementInstanceReference(String merchandisingLoanArrangementInstanceReference) {
    this.merchandisingLoanArrangementInstanceReference = merchandisingLoanArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return merchandisingLoanArrangementInitiateActionReference
  **/

  public String getMerchandisingLoanArrangementInitiateActionReference() {
    return merchandisingLoanArrangementInitiateActionReference;
  }

  public void setMerchandisingLoanArrangementInitiateActionReference(String merchandisingLoanArrangementInitiateActionReference) {
    this.merchandisingLoanArrangementInitiateActionReference = merchandisingLoanArrangementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return merchandisingLoanArrangementInitiateActionRecord
  **/

  public Object getMerchandisingLoanArrangementInitiateActionRecord() {
    return merchandisingLoanArrangementInitiateActionRecord;
  }

  public void setMerchandisingLoanArrangementInitiateActionRecord(Object merchandisingLoanArrangementInitiateActionRecord) {
    this.merchandisingLoanArrangementInitiateActionRecord = merchandisingLoanArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Merchandising Loan Arrangement instance (e.g. initialised, pending, active) 
   * @return merchandisingLoanArrangementInstanceStatus
  **/

  public String getMerchandisingLoanArrangementInstanceStatus() {
    return merchandisingLoanArrangementInstanceStatus;
  }

  public void setMerchandisingLoanArrangementInstanceStatus(String merchandisingLoanArrangementInstanceStatus) {
    this.merchandisingLoanArrangementInstanceStatus = merchandisingLoanArrangementInstanceStatus;
  }


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


}

