package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRMerchandisingLoanArrangementControlInputModelMerchandisingLoanArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementControlInputModel
 */
public class CRMerchandisingLoanArrangementControlInputModel   {
  private String merchandisingLoanServicingSessionReference = null;

  private String merchandisingLoanArrangementInstanceReference = null;

  private String merchandisingLoanArrangementParameterType = null;

  private String merchandisingLoanArrangementSelectedOption = null;

  private String merchandisingLoanArrangementType = null;

  private String merchandisingLoanArrangementReference = null;

  private String merchandisingLoanArrangementSchedule = null;

  private String merchandisingLoanArrangementStatus = null;

  private String merchandisingLoanArrangementCurrency = null;

  private String merchandisingLoanArrangementRegulationReference = null;

  private String merchandisingLoanArrangementRegulationType = null;

  private String merchandisingLoanArrangementJurisdiction = null;

  private String merchandisingLoanArrangementBookingLocation = null;

  private String merchandisingLoanArrangementAccountType = null;

  private String merchandisingLoanArrangementAccountReference = null;

  private Object merchandisingLoanArrangementControlActionTaskRecord = null;

  private CRMerchandisingLoanArrangementControlInputModelMerchandisingLoanArrangementControlActionRequest merchandisingLoanArrangementControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return merchandisingLoanServicingSessionReference
  **/

  public String getMerchandisingLoanServicingSessionReference() {
    return merchandisingLoanServicingSessionReference;
  }

  public void setMerchandisingLoanServicingSessionReference(String merchandisingLoanServicingSessionReference) {
    this.merchandisingLoanServicingSessionReference = merchandisingLoanServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementType
  **/

  public String getMerchandisingLoanArrangementType() {
    return merchandisingLoanArrangementType;
  }

  public void setMerchandisingLoanArrangementType(String merchandisingLoanArrangementType) {
    this.merchandisingLoanArrangementType = merchandisingLoanArrangementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementReference
  **/

  public String getMerchandisingLoanArrangementReference() {
    return merchandisingLoanArrangementReference;
  }

  public void setMerchandisingLoanArrangementReference(String merchandisingLoanArrangementReference) {
    this.merchandisingLoanArrangementReference = merchandisingLoanArrangementReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged in Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementCurrency
  **/

  public String getMerchandisingLoanArrangementCurrency() {
    return merchandisingLoanArrangementCurrency;
  }

  public void setMerchandisingLoanArrangementCurrency(String merchandisingLoanArrangementCurrency) {
    this.merchandisingLoanArrangementCurrency = merchandisingLoanArrangementCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined in Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementRegulationReference
  **/

  public String getMerchandisingLoanArrangementRegulationReference() {
    return merchandisingLoanArrangementRegulationReference;
  }

  public void setMerchandisingLoanArrangementRegulationReference(String merchandisingLoanArrangementRegulationReference) {
    this.merchandisingLoanArrangementRegulationReference = merchandisingLoanArrangementRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementRegulationType
  **/

  public String getMerchandisingLoanArrangementRegulationType() {
    return merchandisingLoanArrangementRegulationType;
  }

  public void setMerchandisingLoanArrangementRegulationType(String merchandisingLoanArrangementRegulationType) {
    this.merchandisingLoanArrangementRegulationType = merchandisingLoanArrangementRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Merchandising Loan Arrangement in case of legal dispute. 
   * @return merchandisingLoanArrangementJurisdiction
  **/

  public String getMerchandisingLoanArrangementJurisdiction() {
    return merchandisingLoanArrangementJurisdiction;
  }

  public void setMerchandisingLoanArrangementJurisdiction(String merchandisingLoanArrangementJurisdiction) {
    this.merchandisingLoanArrangementJurisdiction = merchandisingLoanArrangementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Merchandising Loan Arrangement, are entered. 
   * @return merchandisingLoanArrangementBookingLocation
  **/

  public String getMerchandisingLoanArrangementBookingLocation() {
    return merchandisingLoanArrangementBookingLocation;
  }

  public void setMerchandisingLoanArrangementBookingLocation(String merchandisingLoanArrangementBookingLocation) {
    this.merchandisingLoanArrangementBookingLocation = merchandisingLoanArrangementBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementAccountType
  **/

  public String getMerchandisingLoanArrangementAccountType() {
    return merchandisingLoanArrangementAccountType;
  }

  public void setMerchandisingLoanArrangementAccountType(String merchandisingLoanArrangementAccountType) {
    this.merchandisingLoanArrangementAccountType = merchandisingLoanArrangementAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Merchandising Loan Arrangement 
   * @return merchandisingLoanArrangementAccountReference
  **/

  public String getMerchandisingLoanArrangementAccountReference() {
    return merchandisingLoanArrangementAccountReference;
  }

  public void setMerchandisingLoanArrangementAccountReference(String merchandisingLoanArrangementAccountReference) {
    this.merchandisingLoanArrangementAccountReference = merchandisingLoanArrangementAccountReference;
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
   * Get merchandisingLoanArrangementControlActionRequest
   * @return merchandisingLoanArrangementControlActionRequest
  **/

  public CRMerchandisingLoanArrangementControlInputModelMerchandisingLoanArrangementControlActionRequest getMerchandisingLoanArrangementControlActionRequest() {
    return merchandisingLoanArrangementControlActionRequest;
  }

  public void setMerchandisingLoanArrangementControlActionRequest(CRMerchandisingLoanArrangementControlInputModelMerchandisingLoanArrangementControlActionRequest merchandisingLoanArrangementControlActionRequest) {
    this.merchandisingLoanArrangementControlActionRequest = merchandisingLoanArrangementControlActionRequest;
  }


}

