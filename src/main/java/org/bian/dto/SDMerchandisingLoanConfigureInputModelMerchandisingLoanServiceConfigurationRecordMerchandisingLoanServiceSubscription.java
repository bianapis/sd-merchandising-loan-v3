package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription
 */
public class SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription   {
  private String merchandisingLoanServiceSubscriberReference = null;

  private String merchandisingLoanServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return merchandisingLoanServiceSubscriberReference
  **/

  public String getMerchandisingLoanServiceSubscriberReference() {
    return merchandisingLoanServiceSubscriberReference;
  }

  public void setMerchandisingLoanServiceSubscriberReference(String merchandisingLoanServiceSubscriberReference) {
    this.merchandisingLoanServiceSubscriberReference = merchandisingLoanServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return merchandisingLoanServiceSubscriberAccessProfile
  **/

  public String getMerchandisingLoanServiceSubscriberAccessProfile() {
    return merchandisingLoanServiceSubscriberAccessProfile;
  }

  public void setMerchandisingLoanServiceSubscriberAccessProfile(String merchandisingLoanServiceSubscriberAccessProfile) {
    this.merchandisingLoanServiceSubscriberAccessProfile = merchandisingLoanServiceSubscriberAccessProfile;
  }


}

