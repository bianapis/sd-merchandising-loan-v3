package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecord
 */
public class SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecord   {
  private String merchandisingLoanServiceConfigurationSettingReference = null;

  private String merchandisingLoanServiceConfigurationSettingType = null;

  private SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup merchandisingLoanServiceConfigurationSetup = null;


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

  public SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup getMerchandisingLoanServiceConfigurationSetup() {
    return merchandisingLoanServiceConfigurationSetup;
  }

  public void setMerchandisingLoanServiceConfigurationSetup(SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup merchandisingLoanServiceConfigurationSetup) {
    this.merchandisingLoanServiceConfigurationSetup = merchandisingLoanServiceConfigurationSetup;
  }


}

