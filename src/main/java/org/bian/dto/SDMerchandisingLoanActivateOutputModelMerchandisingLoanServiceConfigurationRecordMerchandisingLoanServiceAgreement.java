package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement
 */
public class SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement   {
  private String merchandisingLoanServiceAgreementReference = null;

  private String merchandisingLoanServiceUserReference = null;

  private String merchandisingLoanServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return merchandisingLoanServiceAgreementReference
  **/

  public String getMerchandisingLoanServiceAgreementReference() {
    return merchandisingLoanServiceAgreementReference;
  }

  public void setMerchandisingLoanServiceAgreementReference(String merchandisingLoanServiceAgreementReference) {
    this.merchandisingLoanServiceAgreementReference = merchandisingLoanServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return merchandisingLoanServiceUserReference
  **/

  public String getMerchandisingLoanServiceUserReference() {
    return merchandisingLoanServiceUserReference;
  }

  public void setMerchandisingLoanServiceUserReference(String merchandisingLoanServiceUserReference) {
    this.merchandisingLoanServiceUserReference = merchandisingLoanServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return merchandisingLoanServiceAgreementTermsandConditions
  **/

  public String getMerchandisingLoanServiceAgreementTermsandConditions() {
    return merchandisingLoanServiceAgreementTermsandConditions;
  }

  public void setMerchandisingLoanServiceAgreementTermsandConditions(String merchandisingLoanServiceAgreementTermsandConditions) {
    this.merchandisingLoanServiceAgreementTermsandConditions = merchandisingLoanServiceAgreementTermsandConditions;
  }


}

