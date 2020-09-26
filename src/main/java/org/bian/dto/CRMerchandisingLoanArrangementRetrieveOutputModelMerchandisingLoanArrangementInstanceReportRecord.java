package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementRetrieveOutputModelMerchandisingLoanArrangementInstanceReportRecord
 */
public class CRMerchandisingLoanArrangementRetrieveOutputModelMerchandisingLoanArrangementInstanceReportRecord   {
  private String merchandisingLoanArrangementInstanceReportData = null;

  private String merchandisingLoanArrangementInstanceReportType = null;

  private Object merchandisingLoanArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return merchandisingLoanArrangementInstanceReportData
  **/

  public String getMerchandisingLoanArrangementInstanceReportData() {
    return merchandisingLoanArrangementInstanceReportData;
  }

  public void setMerchandisingLoanArrangementInstanceReportData(String merchandisingLoanArrangementInstanceReportData) {
    this.merchandisingLoanArrangementInstanceReportData = merchandisingLoanArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return merchandisingLoanArrangementInstanceReportType
  **/

  public String getMerchandisingLoanArrangementInstanceReportType() {
    return merchandisingLoanArrangementInstanceReportType;
  }

  public void setMerchandisingLoanArrangementInstanceReportType(String merchandisingLoanArrangementInstanceReportType) {
    this.merchandisingLoanArrangementInstanceReportType = merchandisingLoanArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return merchandisingLoanArrangementInstanceReport
  **/

  public Object getMerchandisingLoanArrangementInstanceReport() {
    return merchandisingLoanArrangementInstanceReport;
  }

  public void setMerchandisingLoanArrangementInstanceReport(Object merchandisingLoanArrangementInstanceReport) {
    this.merchandisingLoanArrangementInstanceReport = merchandisingLoanArrangementInstanceReport;
  }


}

