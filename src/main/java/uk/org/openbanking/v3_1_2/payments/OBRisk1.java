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

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.
 */
@ApiModel(description = "The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Payments.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-09T18:27:25.589536+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBRisk1 {
    @JsonProperty("PaymentContextCode")
    private PaymentContextCodeEnum paymentContextCode = null;
    @JsonProperty("MerchantCategoryCode")
    private String merchantCategoryCode = null;
    @JsonProperty("MerchantCustomerIdentification")
    private String merchantCustomerIdentification = null;
    @JsonProperty("DeliveryAddress")
    private OBRisk1DeliveryAddress deliveryAddress = null;

    public OBRisk1 paymentContextCode(PaymentContextCodeEnum paymentContextCode) {
        this.paymentContextCode = paymentContextCode;
        return this;
    }

    /**
     * Specifies the payment context
     *
     * @return paymentContextCode
     **/
    @JsonProperty("PaymentContextCode")
    @ApiModelProperty(value = "Specifies the payment context")
    public PaymentContextCodeEnum getPaymentContextCode() {
        return paymentContextCode;
    }

    public void setPaymentContextCode(PaymentContextCodeEnum paymentContextCode) {
        this.paymentContextCode = paymentContextCode;
    }

    public OBRisk1 merchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
        return this;
    }

    /**
     * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
     *
     * @return merchantCategoryCode
     **/
    @JsonProperty("MerchantCategoryCode")
    @ApiModelProperty(value = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")
    @Size(min = 3, max = 4)
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    public OBRisk1 merchantCustomerIdentification(String merchantCustomerIdentification) {
        this.merchantCustomerIdentification = merchantCustomerIdentification;
        return this;
    }

    /**
     * The unique customer identifier of the PSU with the merchant.
     *
     * @return merchantCustomerIdentification
     **/
    @JsonProperty("MerchantCustomerIdentification")
    @ApiModelProperty(value = "The unique customer identifier of the PSU with the merchant.")
    @Size(min = 1, max = 70)
    public String getMerchantCustomerIdentification() {
        return merchantCustomerIdentification;
    }

    public void setMerchantCustomerIdentification(String merchantCustomerIdentification) {
        this.merchantCustomerIdentification = merchantCustomerIdentification;
    }

    public OBRisk1 deliveryAddress(OBRisk1DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    /**
     * Get deliveryAddress
     *
     * @return deliveryAddress
     **/
    @JsonProperty("DeliveryAddress")
    @ApiModelProperty(value = "")
    public OBRisk1DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(OBRisk1DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentContextCode, merchantCategoryCode, merchantCustomerIdentification, deliveryAddress);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRisk1 obRisk1 = (OBRisk1) o;
        return Objects.equals(this.paymentContextCode, obRisk1.paymentContextCode) &&
                Objects.equals(this.merchantCategoryCode, obRisk1.merchantCategoryCode) &&
                Objects.equals(this.merchantCustomerIdentification, obRisk1.merchantCustomerIdentification) &&
                Objects.equals(this.deliveryAddress, obRisk1.deliveryAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRisk1 {\n");

        sb.append("    paymentContextCode: ").append(toIndentedString(paymentContextCode)).append("\n");
        sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
        sb.append("    merchantCustomerIdentification: ").append(toIndentedString(merchantCustomerIdentification)).append("\n");
        sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
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
     * Specifies the payment context
     */
    public enum PaymentContextCodeEnum {
        BILLPAYMENT("BillPayment"),

        ECOMMERCEGOODS("EcommerceGoods"),

        ECOMMERCESERVICES("EcommerceServices"),

        OTHER("Other"),

        PARTYTOPARTY("PartyToParty");

        private String value;

        PaymentContextCodeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static PaymentContextCodeEnum fromValue(String text) {
            for (PaymentContextCodeEnum b : PaymentContextCodeEnum.values()) {
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

