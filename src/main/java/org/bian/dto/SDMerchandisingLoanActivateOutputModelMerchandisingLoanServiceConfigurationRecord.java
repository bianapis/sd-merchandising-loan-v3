package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup;
import org.bian.dto.SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement;
import org.bian.dto.SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecord
 */
public class SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecord   {
  private String merchandisingLoanServiceConfigurationSettingReference = null;

  private String merchandisingLoanServiceConfigurationSettingDescription = null;

  private SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup merchandisingLoanServiceConfigurationSetup = null;

  private SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription merchandisingLoanServiceSubscription = null;

  private SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement merchandisingLoanServiceAgreement = null;

  private String merchandisingLoanServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return merchandisingLoanServiceConfigurationSettingReference
  **/

  public String getMerchandisingLoanServiceConfigurationSettingReference() {
    return merchandisingLoanServiceConfigurationSettingReference;
  }

  public void setMerchandisingLoanServiceConfigurationSettingReference(String merchandisingLoanServiceConfigurationSettingReference) {
    this.merchandisingLoanServiceConfigurationSettingReference = merchandisingLoanServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return merchandisingLoanServiceConfigurationSettingDescription
  **/

  public String getMerchandisingLoanServiceConfigurationSettingDescription() {
    return merchandisingLoanServiceConfigurationSettingDescription;
  }

  public void setMerchandisingLoanServiceConfigurationSettingDescription(String merchandisingLoanServiceConfigurationSettingDescription) {
    this.merchandisingLoanServiceConfigurationSettingDescription = merchandisingLoanServiceConfigurationSettingDescription;
  }


  /**
   * Get merchandisingLoanServiceConfigurationSetup
   * @return merchandisingLoanServiceConfigurationSetup
  **/

  public SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup getMerchandisingLoanServiceConfigurationSetup() {
    return merchandisingLoanServiceConfigurationSetup;
  }

  public void setMerchandisingLoanServiceConfigurationSetup(SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup merchandisingLoanServiceConfigurationSetup) {
    this.merchandisingLoanServiceConfigurationSetup = merchandisingLoanServiceConfigurationSetup;
  }


  /**
   * Get merchandisingLoanServiceSubscription
   * @return merchandisingLoanServiceSubscription
  **/

  public SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription getMerchandisingLoanServiceSubscription() {
    return merchandisingLoanServiceSubscription;
  }

  public void setMerchandisingLoanServiceSubscription(SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription merchandisingLoanServiceSubscription) {
    this.merchandisingLoanServiceSubscription = merchandisingLoanServiceSubscription;
  }


  /**
   * Get merchandisingLoanServiceAgreement
   * @return merchandisingLoanServiceAgreement
  **/

  public SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement getMerchandisingLoanServiceAgreement() {
    return merchandisingLoanServiceAgreement;
  }

  public void setMerchandisingLoanServiceAgreement(SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement merchandisingLoanServiceAgreement) {
    this.merchandisingLoanServiceAgreement = merchandisingLoanServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return merchandisingLoanServiceStatus
  **/

  public String getMerchandisingLoanServiceStatus() {
    return merchandisingLoanServiceStatus;
  }

  public void setMerchandisingLoanServiceStatus(String merchandisingLoanServiceStatus) {
    this.merchandisingLoanServiceStatus = merchandisingLoanServiceStatus;
  }


}

