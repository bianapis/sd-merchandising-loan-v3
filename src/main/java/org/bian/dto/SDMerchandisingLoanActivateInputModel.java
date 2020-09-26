package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanActivateInputModel
 */
public class SDMerchandisingLoanActivateInputModel   {
  private Object merchandisingLoanActivationActionTaskRecord = null;

  private String merchandisingLoanCenterReference = null;

  private String merchandisingLoanServiceReference = null;

  private SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecord merchandisingLoanServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return merchandisingLoanCenterReference
  **/

  public String getMerchandisingLoanCenterReference() {
    return merchandisingLoanCenterReference;
  }

  public void setMerchandisingLoanCenterReference(String merchandisingLoanCenterReference) {
    this.merchandisingLoanCenterReference = merchandisingLoanCenterReference;
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

  public SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecord getMerchandisingLoanServiceConfigurationRecord() {
    return merchandisingLoanServiceConfigurationRecord;
  }

  public void setMerchandisingLoanServiceConfigurationRecord(SDMerchandisingLoanActivateInputModelMerchandisingLoanServiceConfigurationRecord merchandisingLoanServiceConfigurationRecord) {
    this.merchandisingLoanServiceConfigurationRecord = merchandisingLoanServiceConfigurationRecord;
  }


}

