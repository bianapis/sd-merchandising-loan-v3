package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanRetrieveInputModelMerchandisingLoanOfferedService;
import org.bian.dto.SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanRetrieveInputModel
 */
public class SDMerchandisingLoanRetrieveInputModel   {
  private Object merchandisingLoanRetrieveActionTaskRecord = null;

  private String merchandisingLoanRetrieveActionRequest = null;

  private SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecord merchandisingLoanRetrieveActionRecord = null;

  private SDMerchandisingLoanRetrieveInputModelMerchandisingLoanOfferedService merchandisingLoanOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return merchandisingLoanRetrieveActionRequest
  **/

  public String getMerchandisingLoanRetrieveActionRequest() {
    return merchandisingLoanRetrieveActionRequest;
  }

  public void setMerchandisingLoanRetrieveActionRequest(String merchandisingLoanRetrieveActionRequest) {
    this.merchandisingLoanRetrieveActionRequest = merchandisingLoanRetrieveActionRequest;
  }


  /**
   * Get merchandisingLoanRetrieveActionRecord
   * @return merchandisingLoanRetrieveActionRecord
  **/

  public SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecord getMerchandisingLoanRetrieveActionRecord() {
    return merchandisingLoanRetrieveActionRecord;
  }

  public void setMerchandisingLoanRetrieveActionRecord(SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecord merchandisingLoanRetrieveActionRecord) {
    this.merchandisingLoanRetrieveActionRecord = merchandisingLoanRetrieveActionRecord;
  }


  /**
   * Get merchandisingLoanOfferedService
   * @return merchandisingLoanOfferedService
  **/

  public SDMerchandisingLoanRetrieveInputModelMerchandisingLoanOfferedService getMerchandisingLoanOfferedService() {
    return merchandisingLoanOfferedService;
  }

  public void setMerchandisingLoanOfferedService(SDMerchandisingLoanRetrieveInputModelMerchandisingLoanOfferedService merchandisingLoanOfferedService) {
    this.merchandisingLoanOfferedService = merchandisingLoanOfferedService;
  }


}

