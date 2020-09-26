package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecord;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedService
 */
public class SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedService   {
  private String merchandisingLoanServiceReference = null;

  private SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecord merchandisingLoanServiceRecord = null;


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
   * Get merchandisingLoanServiceRecord
   * @return merchandisingLoanServiceRecord
  **/

  public SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecord getMerchandisingLoanServiceRecord() {
    return merchandisingLoanServiceRecord;
  }

  public void setMerchandisingLoanServiceRecord(SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedServiceMerchandisingLoanServiceRecord merchandisingLoanServiceRecord) {
    this.merchandisingLoanServiceRecord = merchandisingLoanServiceRecord;
  }


}

