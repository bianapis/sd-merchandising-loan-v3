package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecordMerchandisingLoanServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecord
 */
public class SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecord   {
  private String merchandisingLoanServiceType = null;

  private String merchandisingLoanServiceVersion = null;

  private String merchandisingLoanServiceDescription = null;

  private SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecordMerchandisingLoanServicePoliciesandGuidelines merchandisingLoanServicePoliciesandGuidelines = null;

  private String merchandisingLoanServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return merchandisingLoanServiceType
  **/

  public String getMerchandisingLoanServiceType() {
    return merchandisingLoanServiceType;
  }

  public void setMerchandisingLoanServiceType(String merchandisingLoanServiceType) {
    this.merchandisingLoanServiceType = merchandisingLoanServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return merchandisingLoanServiceVersion
  **/

  public String getMerchandisingLoanServiceVersion() {
    return merchandisingLoanServiceVersion;
  }

  public void setMerchandisingLoanServiceVersion(String merchandisingLoanServiceVersion) {
    this.merchandisingLoanServiceVersion = merchandisingLoanServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return merchandisingLoanServiceDescription
  **/

  public String getMerchandisingLoanServiceDescription() {
    return merchandisingLoanServiceDescription;
  }

  public void setMerchandisingLoanServiceDescription(String merchandisingLoanServiceDescription) {
    this.merchandisingLoanServiceDescription = merchandisingLoanServiceDescription;
  }


  /**
   * Get merchandisingLoanServicePoliciesandGuidelines
   * @return merchandisingLoanServicePoliciesandGuidelines
  **/

  public SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecordMerchandisingLoanServicePoliciesandGuidelines getMerchandisingLoanServicePoliciesandGuidelines() {
    return merchandisingLoanServicePoliciesandGuidelines;
  }

  public void setMerchandisingLoanServicePoliciesandGuidelines(SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecordMerchandisingLoanServicePoliciesandGuidelines merchandisingLoanServicePoliciesandGuidelines) {
    this.merchandisingLoanServicePoliciesandGuidelines = merchandisingLoanServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return merchandisingLoanServiceSchedule
  **/

  public String getMerchandisingLoanServiceSchedule() {
    return merchandisingLoanServiceSchedule;
  }

  public void setMerchandisingLoanServiceSchedule(String merchandisingLoanServiceSchedule) {
    this.merchandisingLoanServiceSchedule = merchandisingLoanServiceSchedule;
  }


}

