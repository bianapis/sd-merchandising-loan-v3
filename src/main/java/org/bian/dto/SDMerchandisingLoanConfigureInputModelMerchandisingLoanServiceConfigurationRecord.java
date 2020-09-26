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
 * SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecord
 */
public class SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecord   {
  private String merchandisingLoanServiceConfigurationSettingReference = null;

  private String merchandisingLoanServiceConfigurationSettingType = null;

  private SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup merchandisingLoanServiceConfigurationSetup = null;

  private SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceSubscription merchandisingLoanServiceSubscription = null;

  private SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceAgreement merchandisingLoanServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return merchandisingLoanServiceConfigurationSettingType
  **/

  public String getMerchandisingLoanServiceConfigurationSettingType() {
    return merchandisingLoanServiceConfigurationSettingType;
  }

  public void setMerchandisingLoanServiceConfigurationSettingType(String merchandisingLoanServiceConfigurationSettingType) {
    this.merchandisingLoanServiceConfigurationSettingType = merchandisingLoanServiceConfigurationSettingType;
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


}

