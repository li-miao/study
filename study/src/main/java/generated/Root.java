//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.08.27 时间 05:12:19 PM CST 
//

package generated;

import java.util.ArrayList;
import java.util.List;

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
    protected long systime;
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

    public long getSystime() {
        return systime;
    }

    public void setSystime(long value) {
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
    @XmlType(name = "", propOrder = { "ok", "contacts" })
    public static class Data {

        @XmlElement(required = true)
        protected String ok;
        protected List<Root.Data.Contacts> contacts;

        public String getOk() {
            return ok;
        }

        public void setOk(String value) {
            this.ok = value;
        }

        public List<Root.Data.Contacts> getContacts() {
            if (contacts == null) {
                contacts = new ArrayList<Root.Data.Contacts>();
            }
            return this.contacts;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "name", "mobile", "id" })
        public static class Contacts {

            @XmlElement(required = true)
            protected String name;
            protected long mobile;
            protected int id;

            public String getName() {
                return name;
            }

            public void setName(String value) {
                this.name = value;
            }

            public long getMobile() {
                return mobile;
            }

            public void setMobile(long value) {
                this.mobile = value;
            }

            public int getId() {
                return id;
            }

            public void setId(int value) {
                this.id = value;
            }

        }

    }

}
