package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceAnalysis
 */
public class CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceAnalysis   {
  private String merchandisingLoanArrangementInstanceAnalysisReference = null;

  private String merchandisingLoanArrangementInstanceAnalysisReportType = null;

  private String merchandisingLoanArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return merchandisingLoanArrangementInstanceAnalysisReference
  **/

  public String getMerchandisingLoanArrangementInstanceAnalysisReference() {
    return merchandisingLoanArrangementInstanceAnalysisReference;
  }

  public void setMerchandisingLoanArrangementInstanceAnalysisReference(String merchandisingLoanArrangementInstanceAnalysisReference) {
    this.merchandisingLoanArrangementInstanceAnalysisReference = merchandisingLoanArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return merchandisingLoanArrangementInstanceAnalysisParameters
  **/

  public String getMerchandisingLoanArrangementInstanceAnalysisParameters() {
    return merchandisingLoanArrangementInstanceAnalysisParameters;
  }

  public void setMerchandisingLoanArrangementInstanceAnalysisParameters(String merchandisingLoanArrangementInstanceAnalysisParameters) {
    this.merchandisingLoanArrangementInstanceAnalysisParameters = merchandisingLoanArrangementInstanceAnalysisParameters;
  }


}

