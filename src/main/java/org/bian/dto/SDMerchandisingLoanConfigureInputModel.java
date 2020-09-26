package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanConfigureInputModel
 */
public class SDMerchandisingLoanConfigureInputModel   {
  private Object merchandisingLoanConfigurationActionTaskRecord = null;

  private String merchandisingLoanServicingSessionReference = null;

  private String merchandisingLoanServiceReference = null;

  private SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecord merchandisingLoanServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return merchandisingLoanServicingSessionReference
  **/

  public String getMerchandisingLoanServicingSessionReference() {
    return merchandisingLoanServicingSessionReference;
  }

  public void setMerchandisingLoanServicingSessionReference(String merchandisingLoanServicingSessionReference) {
    this.merchandisingLoanServicingSessionReference = merchandisingLoanServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return merchandisingLoanServiceReference
  **/

  public String getMerchandisingLoanServiceReference() {
    return merchandisingLoanServiceReference;
  }

  public void setMerchandisingLoanServiceReference(String merchandisingLoanServiceReference) {
    this.merchandisingLoanServiceReference = merchandisingLoanServiceReference;
  }


  /**
   * Get merchandisingLoanServiceConfigurationRecord
   * @return merchandisingLoanServiceConfigurationRecord
  **/

  public SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecord getMerchandisingLoanServiceConfigurationRecord() {
    return merchandisingLoanServiceConfigurationRecord;
  }

  public void setMerchandisingLoanServiceConfigurationRecord(SDMerchandisingLoanConfigureInputModelMerchandisingLoanServiceConfigurationRecord merchandisingLoanServiceConfigurationRecord) {
    this.merchandisingLoanServiceConfigurationRecord = merchandisingLoanServiceConfigurationRecord;
  }


}

