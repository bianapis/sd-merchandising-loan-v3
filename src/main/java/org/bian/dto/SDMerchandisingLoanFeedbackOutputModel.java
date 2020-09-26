package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanFeedbackOutputModelMerchandisingLoanFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanFeedbackOutputModel
 */
public class SDMerchandisingLoanFeedbackOutputModel   {
  private String merchandisingLoanFeedbackActionTaskReference = null;

  private Object merchandisingLoanFeedbackActionTaskRecord = null;

  private SDMerchandisingLoanFeedbackOutputModelMerchandisingLoanFeedbackActionRecord merchandisingLoanFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return merchandisingLoanFeedbackActionTaskReference
  **/

  public String getMerchandisingLoanFeedbackActionTaskReference() {
    return merchandisingLoanFeedbackActionTaskReference;
  }

  public void setMerchandisingLoanFeedbackActionTaskReference(String merchandisingLoanFeedbackActionTaskReference) {
    this.merchandisingLoanFeedbackActionTaskReference = merchandisingLoanFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return merchandisingLoanFeedbackActionTaskRecord
  **/

  public Object getMerchandisingLoanFeedbackActionTaskRecord() {
    return merchandisingLoanFeedbackActionTaskRecord;
  }

  public void setMerchandisingLoanFeedbackActionTaskRecord(Object merchandisingLoanFeedbackActionTaskRecord) {
    this.merchandisingLoanFeedbackActionTaskRecord = merchandisingLoanFeedbackActionTaskRecord;
  }


  /**
   * Get merchandisingLoanFeedbackActionRecord
   * @return merchandisingLoanFeedbackActionRecord
  **/

  public SDMerchandisingLoanFeedbackOutputModelMerchandisingLoanFeedbackActionRecord getMerchandisingLoanFeedbackActionRecord() {
    return merchandisingLoanFeedbackActionRecord;
  }

  public void setMerchandisingLoanFeedbackActionRecord(SDMerchandisingLoanFeedbackOutputModelMerchandisingLoanFeedbackActionRecord merchandisingLoanFeedbackActionRecord) {
    this.merchandisingLoanFeedbackActionRecord = merchandisingLoanFeedbackActionRecord;
  }


}

