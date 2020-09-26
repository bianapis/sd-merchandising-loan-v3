package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementRetrieveOutputModelMerchandisingLoanArrangementInstanceAnalysis
 */
public class CRMerchandisingLoanArrangementRetrieveOutputModelMerchandisingLoanArrangementInstanceAnalysis   {
  private String merchandisingLoanArrangementInstanceAnalysisData = null;

  private String merchandisingLoanArrangementInstanceAnalysisReportType = null;

  private Object merchandisingLoanArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return merchandisingLoanArrangementInstanceAnalysisData
  **/

  public String getMerchandisingLoanArrangementInstanceAnalysisData() {
    return merchandisingLoanArrangementInstanceAnalysisData;
  }

  public void setMerchandisingLoanArrangementInstanceAnalysisData(String merchandisingLoanArrangementInstanceAnalysisData) {
    this.merchandisingLoanArrangementInstanceAnalysisData = merchandisingLoanArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return merchandisingLoanArrangementInstanceAnalysisReportType
  **/

  public String getMerchandisingLoanArrangementInstanceAnalysisReportType() {
    return merchandisingLoanArrangementInstanceAnalysisReportType;
  }

  public void setMerchandisingLoanArrangementInstanceAnalysisReportType(String merchandisingLoanArrangementInstanceAnalysisReportType) {
    this.merchandisingLoanArrangementInstanceAnalysisReportType = merchandisingLoanArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return merchandisingLoanArrangementInstanceAnalysisReport
  **/

  public Object getMerchandisingLoanArrangementInstanceAnalysisReport() {
    return merchandisingLoanArrangementInstanceAnalysisReport;
  }

  public void setMerchandisingLoanArrangementInstanceAnalysisReport(Object merchandisingLoanArrangementInstanceAnalysisReport) {
    this.merchandisingLoanArrangementInstanceAnalysisReport = merchandisingLoanArrangementInstanceAnalysisReport;
  }


}

