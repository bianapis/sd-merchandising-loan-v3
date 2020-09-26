package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup
 */
public class SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecordMerchandisingLoanServiceConfigurationSetup   {
  private String merchandisingLoanServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return merchandisingLoanServiceConfigurationParameter
  **/

  public String getMerchandisingLoanServiceConfigurationParameter() {
    return merchandisingLoanServiceConfigurationParameter;
  }

  public void setMerchandisingLoanServiceConfigurationParameter(String merchandisingLoanServiceConfigurationParameter) {
    this.merchandisingLoanServiceConfigurationParameter = merchandisingLoanServiceConfigurationParameter;
  }


}

