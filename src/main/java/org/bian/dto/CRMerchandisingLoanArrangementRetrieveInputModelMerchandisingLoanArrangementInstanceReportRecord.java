package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceReportRecord
 */
public class CRMerchandisingLoanArrangementRetrieveInputModelMerchandisingLoanArrangementInstanceReportRecord   {
  private String merchandisingLoanArrangementInstanceReportReference = null;

  private String merchandisingLoanArrangementInstanceReportType = null;

  private String merchandisingLoanArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return merchandisingLoanArrangementInstanceReportReference
  **/

  public String getMerchandisingLoanArrangementInstanceReportReference() {
    return merchandisingLoanArrangementInstanceReportReference;
  }

  public void setMerchandisingLoanArrangementInstanceReportReference(String merchandisingLoanArrangementInstanceReportReference) {
    this.merchandisingLoanArrangementInstanceReportReference = merchandisingLoanArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return merchandisingLoanArrangementInstanceReportParameters
  **/

  public String getMerchandisingLoanArrangementInstanceReportParameters() {
    return merchandisingLoanArrangementInstanceReportParameters;
  }

  public void setMerchandisingLoanArrangementInstanceReportParameters(String merchandisingLoanArrangementInstanceReportParameters) {
    this.merchandisingLoanArrangementInstanceReportParameters = merchandisingLoanArrangementInstanceReportParameters;
  }


}

