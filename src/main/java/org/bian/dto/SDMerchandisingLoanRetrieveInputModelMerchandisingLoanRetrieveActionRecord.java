package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanActivityAnalysis;
import org.bian.dto.SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecord
 */
public class SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecord   {
  private SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanActivityAnalysis merchandisingLoanActivityAnalysis = null;

  private SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanPerformanceAnalysis merchandisingLoanPerformanceAnalysis = null;

  private SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get merchandisingLoanActivityAnalysis
   * @return merchandisingLoanActivityAnalysis
  **/

  public SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanActivityAnalysis getMerchandisingLoanActivityAnalysis() {
    return merchandisingLoanActivityAnalysis;
  }

  public void setMerchandisingLoanActivityAnalysis(SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanActivityAnalysis merchandisingLoanActivityAnalysis) {
    this.merchandisingLoanActivityAnalysis = merchandisingLoanActivityAnalysis;
  }


  /**
   * Get merchandisingLoanPerformanceAnalysis
   * @return merchandisingLoanPerformanceAnalysis
  **/

  public SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanPerformanceAnalysis getMerchandisingLoanPerformanceAnalysis() {
    return merchandisingLoanPerformanceAnalysis;
  }

  public void setMerchandisingLoanPerformanceAnalysis(SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordMerchandisingLoanPerformanceAnalysis merchandisingLoanPerformanceAnalysis) {
    this.merchandisingLoanPerformanceAnalysis = merchandisingLoanPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDMerchandisingLoanRetrieveInputModelMerchandisingLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

