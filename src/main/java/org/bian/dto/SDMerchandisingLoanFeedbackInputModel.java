package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanFeedbackInputModelMerchandisingLoanFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanFeedbackInputModel
 */
public class SDMerchandisingLoanFeedbackInputModel   {
  private Object merchandisingLoanFeedbackActionTaskRecord = null;

  private SDMerchandisingLoanFeedbackInputModelMerchandisingLoanFeedbackActionRecord merchandisingLoanFeedbackActionRecord = null;


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

  public SDMerchandisingLoanFeedbackInputModelMerchandisingLoanFeedbackActionRecord getMerchandisingLoanFeedbackActionRecord() {
    return merchandisingLoanFeedbackActionRecord;
  }

  public void setMerchandisingLoanFeedbackActionRecord(SDMerchandisingLoanFeedbackInputModelMerchandisingLoanFeedbackActionRecord merchandisingLoanFeedbackActionRecord) {
    this.merchandisingLoanFeedbackActionRecord = merchandisingLoanFeedbackActionRecord;
  }


}

