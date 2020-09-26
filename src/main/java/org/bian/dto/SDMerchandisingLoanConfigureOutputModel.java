package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanConfigureOutputModelMerchandisingLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanConfigureOutputModel
 */
public class SDMerchandisingLoanConfigureOutputModel   {
  private String merchandisingLoanConfigurationActionTaskReference = null;

  private Object merchandisingLoanConfigurationActionTaskRecord = null;

  private SDMerchandisingLoanConfigureOutputModelMerchandisingLoanServiceConfigurationRecord merchandisingLoanServiceConfigurationRecord = null;

  private String merchandisingLoanServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return merchandisingLoanConfigurationActionTaskReference
  **/

  public String getMerchandisingLoanConfigurationActionTaskReference() {
    return merchandisingLoanConfigurationActionTaskReference;
  }

  public void setMerchandisingLoanConfigurationActionTaskReference(String merchandisingLoanConfigurationActionTaskReference) {
    this.merchandisingLoanConfigurationActionTaskReference = merchandisingLoanConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return merchandisingLoanConfigurationActionTaskRecord
  **/

  public Object getMerchandisingLoanConfigurationActionTaskRecord() {
    return merchandisingLoanConfigurationActionTaskRecord;
  }

  public void setMerchandisingLoanConfigurationActionTaskRecord(Object merchandisingLoanConfigurationActionTaskRecord) {
    this.merchandisingLoanConfigurationActionTaskRecord = merchandisingLoanConfigurationActionTaskRecord;
  }


  /**
   * Get merchandisingLoanServiceConfigurationRecord
   * @return merchandisingLoanServiceConfigurationRecord
  **/

  public SDMerchandisingLoanConfigureOutputModelMerchandisingLoanServiceConfigurationRecord getMerchandisingLoanServiceConfigurationRecord() {
    return merchandisingLoanServiceConfigurationRecord;
  }

  public void setMerchandisingLoanServiceConfigurationRecord(SDMerchandisingLoanConfigureOutputModelMerchandisingLoanServiceConfigurationRecord merchandisingLoanServiceConfigurationRecord) {
    this.merchandisingLoanServiceConfigurationRecord = merchandisingLoanServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return merchandisingLoanServicingSessionStatus
  **/

  public String getMerchandisingLoanServicingSessionStatus() {
    return merchandisingLoanServicingSessionStatus;
  }

  public void setMerchandisingLoanServicingSessionStatus(String merchandisingLoanServicingSessionStatus) {
    this.merchandisingLoanServicingSessionStatus = merchandisingLoanServicingSessionStatus;
  }


}

