package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecordMerchandisingLoanServicePoliciesandGuidelines
 */
public class SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecordMerchandisingLoanServicePoliciesandGuidelines   {
  private String merchandisingLoanServiceEligibility = null;

  private String merchandisingLoanServiceIntendedUses = null;

  private String merchandisingLoanServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return merchandisingLoanServiceEligibility
  **/

  public String getMerchandisingLoanServiceEligibility() {
    return merchandisingLoanServiceEligibility;
  }

  public void setMerchandisingLoanServiceEligibility(String merchandisingLoanServiceEligibility) {
    this.merchandisingLoanServiceEligibility = merchandisingLoanServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return merchandisingLoanServiceIntendedUses
  **/

  public String getMerchandisingLoanServiceIntendedUses() {
    return merchandisingLoanServiceIntendedUses;
  }

  public void setMerchandisingLoanServiceIntendedUses(String merchandisingLoanServiceIntendedUses) {
    this.merchandisingLoanServiceIntendedUses = merchandisingLoanServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return merchandisingLoanServicePricingandTerms
  **/

  public String getMerchandisingLoanServicePricingandTerms() {
    return merchandisingLoanServicePricingandTerms;
  }

  public void setMerchandisingLoanServicePricingandTerms(String merchandisingLoanServicePricingandTerms) {
    this.merchandisingLoanServicePricingandTerms = merchandisingLoanServicePricingandTerms;
  }


}

