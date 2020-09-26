package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFeesRequestOutputModel
 */
public class BQFeesRequestOutputModel   {
  private String feesPreconditions = null;

  private String feesFeatureSchedule = null;

  private String businessService = null;

  private String feesPostconditions = null;

  private String feesServiceType = null;

  private String feesServiceDescription = null;

  private String feesServiceInputsandOuputs = null;

  private String feesServiceWorkProduct = null;

  private String feesRequestActionTaskReference = null;

  private Object feesRequestActionTaskRecord = null;

  private String feesRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return feesPreconditions
  **/

  public String getFeesPreconditions() {
    return feesPreconditions;
  }

  public void setFeesPreconditions(String feesPreconditions) {
    this.feesPreconditions = feesPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return feesFeatureSchedule
  **/

  public String getFeesFeatureSchedule() {
    return feesFeatureSchedule;
  }

  public void setFeesFeatureSchedule(String feesFeatureSchedule) {
    this.feesFeatureSchedule = feesFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Merchandising Loan Arrangement specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return feesPostconditions
  **/

  public String getFeesPostconditions() {
    return feesPostconditions;
  }

  public void setFeesPostconditions(String feesPostconditions) {
    this.feesPostconditions = feesPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return feesServiceType
  **/

  public String getFeesServiceType() {
    return feesServiceType;
  }

  public void setFeesServiceType(String feesServiceType) {
    this.feesServiceType = feesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return feesServiceDescription
  **/

  public String getFeesServiceDescription() {
    return feesServiceDescription;
  }

  public void setFeesServiceDescription(String feesServiceDescription) {
    this.feesServiceDescription = feesServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return feesServiceInputsandOuputs
  **/

  public String getFeesServiceInputsandOuputs() {
    return feesServiceInputsandOuputs;
  }

  public void setFeesServiceInputsandOuputs(String feesServiceInputsandOuputs) {
    this.feesServiceInputsandOuputs = feesServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return feesServiceWorkProduct
  **/

  public String getFeesServiceWorkProduct() {
    return feesServiceWorkProduct;
  }

  public void setFeesServiceWorkProduct(String feesServiceWorkProduct) {
    this.feesServiceWorkProduct = feesServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fees instance request service call 
   * @return feesRequestActionTaskReference
  **/

  public String getFeesRequestActionTaskReference() {
    return feesRequestActionTaskReference;
  }

  public void setFeesRequestActionTaskReference(String feesRequestActionTaskReference) {
    this.feesRequestActionTaskReference = feesRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return feesRequestActionTaskRecord
  **/

  public Object getFeesRequestActionTaskRecord() {
    return feesRequestActionTaskRecord;
  }

  public void setFeesRequestActionTaskRecord(Object feesRequestActionTaskRecord) {
    this.feesRequestActionTaskRecord = feesRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fees service request record 
   * @return feesRequestRecordReference
  **/

  public String getFeesRequestRecordReference() {
    return feesRequestRecordReference;
  }

  public void setFeesRequestRecordReference(String feesRequestRecordReference) {
    this.feesRequestRecordReference = feesRequestRecordReference;
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

