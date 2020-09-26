package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanActivateOutputModel
 */
public class SDMerchandisingLoanActivateOutputModel   {
  private String merchandisingLoanActivationActionTaskReference = null;

  private Object merchandisingLoanActivationActionTaskRecord = null;

  private String merchandisingLoanServicingSessionReference = null;

  private Object merchandisingLoanServicingSessionRecord = null;

  private SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecord merchandisingLoanServiceConfigurationRecord = null;

  private String merchandisingLoanServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return merchandisingLoanActivationActionTaskReference
  **/

  public String getMerchandisingLoanActivationActionTaskReference() {
    return merchandisingLoanActivationActionTaskReference;
  }

  public void setMerchandisingLoanActivationActionTaskReference(String merchandisingLoanActivationActionTaskReference) {
    this.merchandisingLoanActivationActionTaskReference = merchandisingLoanActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return merchandisingLoanActivationActionTaskRecord
  **/

  public Object getMerchandisingLoanActivationActionTaskRecord() {
    return merchandisingLoanActivationActionTaskRecord;
  }

  public void setMerchandisingLoanActivationActionTaskRecord(Object merchandisingLoanActivationActionTaskRecord) {
    this.merchandisingLoanActivationActionTaskRecord = merchandisingLoanActivationActionTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return merchandisingLoanServicingSessionRecord
  **/

  public Object getMerchandisingLoanServicingSessionRecord() {
    return merchandisingLoanServicingSessionRecord;
  }

  public void setMerchandisingLoanServicingSessionRecord(Object merchandisingLoanServicingSessionRecord) {
    this.merchandisingLoanServicingSessionRecord = merchandisingLoanServicingSessionRecord;
  }


  /**
   * Get merchandisingLoanServiceConfigurationRecord
   * @return merchandisingLoanServiceConfigurationRecord
  **/

  public SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecord getMerchandisingLoanServiceConfigurationRecord() {
    return merchandisingLoanServiceConfigurationRecord;
  }

  public void setMerchandisingLoanServiceConfigurationRecord(SDMerchandisingLoanActivateOutputModelMerchandisingLoanServiceConfigurationRecord merchandisingLoanServiceConfigurationRecord) {
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

