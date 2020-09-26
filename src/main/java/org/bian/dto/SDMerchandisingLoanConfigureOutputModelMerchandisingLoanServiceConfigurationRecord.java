package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement;
import org.bian.dto.SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup;
import org.bian.dto.SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanConfigureOutputModelMerchandisingLoanServiceConfigurationRecord
 */
public class SDMerchandisingLoanConfigureOutputModelMerchandisingLoanServiceConfigurationRecord   {
  private String merchandisingLoanServiceConfigurationSettingDescription = null;

  private SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup merchandisingLoanServiceConfigurationSetup = null;

  private SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription merchandisingLoanServiceSubscription = null;

  private SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement merchandisingLoanServiceAgreement = null;

  private String merchandisingLoanServiceStatus = null;


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

  public SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup getMerchandisingLoanServiceConfigurationSetup() {
    return merchandisingLoanServiceConfigurationSetup;
  }

  public void setMerchandisingLoanServiceConfigurationSetup(SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup merchandisingLoanServiceConfigurationSetup) {
    this.merchandisingLoanServiceConfigurationSetup = merchandisingLoanServiceConfigurationSetup;
  }


  /**
   * Get merchandisingLoanServiceSubscription
   * @return merchandisingLoanServiceSubscription
  **/

  public SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription getMerchandisingLoanServiceSubscription() {
    return merchandisingLoanServiceSubscription;
  }

  public void setMerchandisingLoanServiceSubscription(SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription merchandisingLoanServiceSubscription) {
    this.merchandisingLoanServiceSubscription = merchandisingLoanServiceSubscription;
  }


  /**
   * Get merchandisingLoanServiceAgreement
   * @return merchandisingLoanServiceAgreement
  **/

  public SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement getMerchandisingLoanServiceAgreement() {
    return merchandisingLoanServiceAgreement;
  }

  public void setMerchandisingLoanServiceAgreement(SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement merchandisingLoanServiceAgreement) {
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

