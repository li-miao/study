//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.06 时间 11:51:56 AM CST 
//

package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "success", "message", "errorCode", "errorMessage", "systime", "requestIP", "data" })
@XmlRootElement(name = "root")
public class Root {

    @XmlElement(required = true)
    protected String success;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String errorCode;
    @XmlElement(required = true)
    protected String errorMessage;
    @XmlElement(required = true)
    protected String systime;
    @XmlElement(required = true)
    protected String requestIP;
    @XmlElement(required = true)
    protected Root.Data data;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String value) {
        this.success = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    public String getSystime() {
        return systime;
    }

    public void setSystime(String value) {
        this.systime = value;
    }

    public String getRequestIP() {
        return requestIP;
    }

    public void setRequestIP(String value) {
        this.requestIP = value;
    }

    public Root.Data getData() {
        return data;
    }

    public void setData(Root.Data value) {
        this.data = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "fastPay", "orderNo", "wapPayUrl", "alipay", "unionPay", "creditpayDTO", "icbcabcpay", "cmbPay", "depDate",
            "weixinWapPay", "weixinJsPay", "paymentNo", "aliwappay", "vip", "ok", "tenpay" })
    public static class Data {

        @XmlElement(required = true)
        protected String fastPay;
        @XmlElement(required = true)
        protected String orderNo;
        @XmlElement(required = true)
        protected String wapPayUrl;
        @XmlElement(required = true)
        protected String alipay;
        @XmlElement(required = true)
        protected String unionPay;
        @XmlElement(required = true)
        protected Root.Data.CreditpayDTO creditpayDTO;
        @XmlElement(required = true)
        protected String icbcabcpay;
        @XmlElement(required = true)
        protected String cmbPay;
        @XmlElement(required = true)
        protected String depDate;
        @XmlElement(required = true)
        protected String weixinWapPay;
        @XmlElement(required = true)
        protected String weixinJsPay;
        @XmlElement(required = true)
        protected String paymentNo;
        @XmlElement(required = true)
        protected String aliwappay;
        @XmlElement(required = true)
        protected String vip;
        @XmlElement(required = true)
        protected String ok;
        @XmlElement(required = true)
        protected String tenpay;

        public String getFastPay() {
            return fastPay;
        }

        public void setFastPay(String value) {
            this.fastPay = value;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String value) {
            this.orderNo = value;
        }

        public String getWapPayUrl() {
            return wapPayUrl;
        }

        public void setWapPayUrl(String value) {
            this.wapPayUrl = value;
        }

        public String getAlipay() {
            return alipay;
        }

        public void setAlipay(String value) {
            this.alipay = value;
        }

        public String getUnionPay() {
            return unionPay;
        }

        public void setUnionPay(String value) {
            this.unionPay = value;
        }

        public Root.Data.CreditpayDTO getCreditpayDTO() {
            return creditpayDTO;
        }

        public void setCreditpayDTO(Root.Data.CreditpayDTO value) {
            this.creditpayDTO = value;
        }

        public String getIcbcabcpay() {
            return icbcabcpay;
        }

        public void setIcbcabcpay(String value) {
            this.icbcabcpay = value;
        }

        public String getCmbPay() {
            return cmbPay;
        }

        public void setCmbPay(String value) {
            this.cmbPay = value;
        }

        public String getDepDate() {
            return depDate;
        }

        public void setDepDate(String value) {
            this.depDate = value;
        }

        public String getWeixinWapPay() {
            return weixinWapPay;
        }

        public void setWeixinWapPay(String value) {
            this.weixinWapPay = value;
        }

        public String getWeixinJsPay() {
            return weixinJsPay;
        }

        public void setWeixinJsPay(String value) {
            this.weixinJsPay = value;
        }

        public String getPaymentNo() {
            return paymentNo;
        }

        public void setPaymentNo(String value) {
            this.paymentNo = value;
        }

        public String getAliwappay() {
            return aliwappay;
        }

        public void setAliwappay(String value) {
            this.aliwappay = value;
        }

        public String getVip() {
            return vip;
        }

        public void setVip(String value) {
            this.vip = value;
        }

        public String getOk() {
            return ok;
        }

        public void setOk(String value) {
            this.ok = value;
        }

        public String getTenpay() {
            return tenpay;
        }

        public void setTenpay(String value) {
            this.tenpay = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "orgAirport", "tripType", "dstAirport", "orgCode", "priceSum", "dstCode", "tseq" })
        public static class CreditpayDTO {

            @XmlElement(required = true)
            protected String orgAirport;
            @XmlElement(required = true)
            protected String tripType;
            @XmlElement(required = true)
            protected String dstAirport;
            @XmlElement(required = true)
            protected String orgCode;
            @XmlElement(required = true)
            protected String priceSum;
            @XmlElement(required = true)
            protected String dstCode;
            @XmlElement(required = true)
            protected String tseq;

            public String getOrgAirport() {
                return orgAirport;
            }

            public void setOrgAirport(String value) {
                this.orgAirport = value;
            }

            public String getTripType() {
                return tripType;
            }

            public void setTripType(String value) {
                this.tripType = value;
            }

            public String getDstAirport() {
                return dstAirport;
            }

            public void setDstAirport(String value) {
                this.dstAirport = value;
            }

            public String getOrgCode() {
                return orgCode;
            }

            public void setOrgCode(String value) {
                this.orgCode = value;
            }

            public String getPriceSum() {
                return priceSum;
            }

            public void setPriceSum(String value) {
                this.priceSum = value;
            }

            public String getDstCode() {
                return dstCode;
            }

            public void setDstCode(String value) {
                this.dstCode = value;
            }

            public String getTseq() {
                return tseq;
            }

            public void setTseq(String value) {
                this.tseq = value;
            }

        }

    }

}
