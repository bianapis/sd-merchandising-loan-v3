package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanRetrieveInputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecord
 */
public class SDMerchandisingLoanRetrieveInputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecord   {
  private String merchandisingLoanServiceVersion = null;


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


}

