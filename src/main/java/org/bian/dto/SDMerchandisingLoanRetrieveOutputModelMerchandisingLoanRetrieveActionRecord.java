package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanActivityAnalysis;
import org.bian.dto.SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecord
 */
public class SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecord   {
  private SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanActivityAnalysis merchandisingLoanActivityAnalysis = null;

  private SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanPerformanceAnalysis merchandisingLoanPerformanceAnalysis = null;

  private SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get merchandisingLoanActivityAnalysis
   * @return merchandisingLoanActivityAnalysis
  **/

  public SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanActivityAnalysis getMerchandisingLoanActivityAnalysis() {
    return merchandisingLoanActivityAnalysis;
  }

  public void setMerchandisingLoanActivityAnalysis(SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanActivityAnalysis merchandisingLoanActivityAnalysis) {
    this.merchandisingLoanActivityAnalysis = merchandisingLoanActivityAnalysis;
  }


  /**
   * Get merchandisingLoanPerformanceAnalysis
   * @return merchandisingLoanPerformanceAnalysis
  **/

  public SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanPerformanceAnalysis getMerchandisingLoanPerformanceAnalysis() {
    return merchandisingLoanPerformanceAnalysis;
  }

  public void setMerchandisingLoanPerformanceAnalysis(SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanPerformanceAnalysis merchandisingLoanPerformanceAnalysis) {
    this.merchandisingLoanPerformanceAnalysis = merchandisingLoanPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDMerchandisingLoanRetrieveOutputModelMerchandisingLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

