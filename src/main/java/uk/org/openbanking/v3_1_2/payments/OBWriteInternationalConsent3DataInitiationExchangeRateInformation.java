/*
 * This Source Code Form is subject to the terms of the Mozilla
 * Public License, v. 2.0. If a copy of the MPL was not distributed
 * with this file, You can obtain one at
 *
 * https://mozilla.org/MPL/2.0/.
 */

/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.2
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package uk.org.openbanking.v3_1_2.payments;

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Provides details on the currency exchange rate and contract.
 */
@ApiModel(description = "Provides details on the currency exchange rate and contract.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-09T18:27:25.589536+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBWriteInternationalConsent3DataInitiationExchangeRateInformation {
    @JsonProperty("ExchangeRate")
    private BigDecimal exchangeRate = null;
    @JsonProperty("RateType")
    private RateTypeEnum rateType = null;
    @JsonProperty("UnitCurrency")
    private String unitCurrency = null;
    @JsonProperty("ContractIdentification")
    private String contractIdentification = null;

    public OBWriteInternationalConsent3DataInitiationExchangeRateInformation exchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.
     *
     * @return exchangeRate
     **/
    @JsonProperty("ExchangeRate")
    @ApiModelProperty(value = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.")
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public OBWriteInternationalConsent3DataInitiationExchangeRateInformation rateType(RateTypeEnum rateType) {
        this.rateType = rateType;
        return this;
    }

    /**
     * Specifies the type used to complete the currency exchange.
     *
     * @return rateType
     **/
    @JsonProperty("RateType")
    @ApiModelProperty(value = "Specifies the type used to complete the currency exchange.")
    public RateTypeEnum getRateType() {
        return rateType;
    }

    public void setRateType(RateTypeEnum rateType) {
        this.rateType = rateType;
    }

    public OBWriteInternationalConsent3DataInitiationExchangeRateInformation unitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
        return this;
    }

    /**
     * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP &#x3D; xxxCUR, the unit currency is GBP.
     *
     * @return unitCurrency
     **/
    @JsonProperty("UnitCurrency")
    @ApiModelProperty(value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getUnitCurrency() {
        return unitCurrency;
    }

    public void setUnitCurrency(String unitCurrency) {
        this.unitCurrency = unitCurrency;
    }

    public OBWriteInternationalConsent3DataInitiationExchangeRateInformation contractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
        return this;
    }

    /**
     * Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.
     *
     * @return contractIdentification
     **/
    @JsonProperty("ContractIdentification")
    @ApiModelProperty(value = "Unique and unambiguous reference to the foreign exchange contract agreed between the initiating party/creditor and the debtor agent.")
    @Size(min = 1, max = 256)
    public String getContractIdentification() {
        return contractIdentification;
    }

    public void setContractIdentification(String contractIdentification) {
        this.contractIdentification = contractIdentification;
    }

    @Override
    public int hashCode() {
        return Objects.hash(exchangeRate, rateType, unitCurrency, contractIdentification);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalConsent3DataInitiationExchangeRateInformation obWriteInternationalConsent3DataInitiationExchangeRateInformation = (OBWriteInternationalConsent3DataInitiationExchangeRateInformation) o;
        return Objects.equals(this.exchangeRate, obWriteInternationalConsent3DataInitiationExchangeRateInformation.exchangeRate) &&
                Objects.equals(this.rateType, obWriteInternationalConsent3DataInitiationExchangeRateInformation.rateType) &&
                Objects.equals(this.unitCurrency, obWriteInternationalConsent3DataInitiationExchangeRateInformation.unitCurrency) &&
                Objects.equals(this.contractIdentification, obWriteInternationalConsent3DataInitiationExchangeRateInformation.contractIdentification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalConsent3DataInitiationExchangeRateInformation {\n");

        sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
        sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
        sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
        sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Specifies the type used to complete the currency exchange.
     */
    public enum RateTypeEnum {
        ACTUAL("Actual"),

        AGREED("Agreed"),

        INDICATIVE("Indicative");

        private String value;

        RateTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static RateTypeEnum fromValue(String text) {
            for (RateTypeEnum b : RateTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

