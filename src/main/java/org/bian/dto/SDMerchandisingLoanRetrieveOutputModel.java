package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedService;
import org.bian.dto.SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanRetrieveOutputModel
 */
public class SDMerchandisingLoanRetrieveOutputModel   {
  private String merchandisingLoanRetrieveActionTaskReference = null;

  private Object merchandisingLoanRetrieveActionTaskRecord = null;

  private String merchandisingLoanRetrieveActionResponse = null;

  private SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecord merchandisingLoanRetrieveActionRecord = null;

  private SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedService merchandisingLoanOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return merchandisingLoanRetrieveActionTaskReference
  **/

  public String getMerchandisingLoanRetrieveActionTaskReference() {
    return merchandisingLoanRetrieveActionTaskReference;
  }

  public void setMerchandisingLoanRetrieveActionTaskReference(String merchandisingLoanRetrieveActionTaskReference) {
    this.merchandisingLoanRetrieveActionTaskReference = merchandisingLoanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return merchandisingLoanRetrieveActionTaskRecord
  **/

  public Object getMerchandisingLoanRetrieveActionTaskRecord() {
    return merchandisingLoanRetrieveActionTaskRecord;
  }

  public void setMerchandisingLoanRetrieveActionTaskRecord(Object merchandisingLoanRetrieveActionTaskRecord) {
    this.merchandisingLoanRetrieveActionTaskRecord = merchandisingLoanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return merchandisingLoanRetrieveActionResponse
  **/

  public String getMerchandisingLoanRetrieveActionResponse() {
    return merchandisingLoanRetrieveActionResponse;
  }

  public void setMerchandisingLoanRetrieveActionResponse(String merchandisingLoanRetrieveActionResponse) {
    this.merchandisingLoanRetrieveActionResponse = merchandisingLoanRetrieveActionResponse;
  }


  /**
   * Get merchandisingLoanRetrieveActionRecord
   * @return merchandisingLoanRetrieveActionRecord
  **/

  public SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecord getMerchandisingLoanRetrieveActionRecord() {
    return merchandisingLoanRetrieveActionRecord;
  }

  public void setMerchandisingLoanRetrieveActionRecord(SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecord merchandisingLoanRetrieveActionRecord) {
    this.merchandisingLoanRetrieveActionRecord = merchandisingLoanRetrieveActionRecord;
  }


  /**
   * Get merchandisingLoanOfferedService
   * @return merchandisingLoanOfferedService
  **/

  public SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedService getMerchandisingLoanOfferedService() {
    return merchandisingLoanOfferedService;
  }

  public void setMerchandisingLoanOfferedService(SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanOfferedService merchandisingLoanOfferedService) {
    this.merchandisingLoanOfferedService = merchandisingLoanOfferedService;
  }


}

