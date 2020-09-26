package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup
 */
public class SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup   {
  private String merchandisingLoanServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return merchandisingLoanServiceConfigurationParameter
  **/

  public String getMerchandisingLoanServiceConfigurationParameter() {
    return merchandisingLoanServiceConfigurationParameter;
  }

  public void setMerchandisingLoanServiceConfigurationParameter(String merchandisingLoanServiceConfigurationParameter) {
    this.merchandisingLoanServiceConfigurationParameter = merchandisingLoanServiceConfigurationParameter;
  }


}

