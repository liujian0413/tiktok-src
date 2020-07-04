package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.LangUtils;

public class BasicHeaderElement implements Cloneable, HeaderElement {
    private final String name;
    private final NameValuePair[] parameters;
    private final String value;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public NameValuePair[] getParameters() {
        return (NameValuePair[]) this.parameters.clone();
    }

    public int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, (Object) this.name), (Object) this.value);
        for (NameValuePair hashCode2 : this.parameters) {
            hashCode = LangUtils.hashCode(hashCode, (Object) hashCode2);
        }
        return hashCode;
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        charArrayBuffer.append(this.name);
        if (this.value != null) {
            charArrayBuffer.append("=");
            charArrayBuffer.append(this.value);
        }
        for (NameValuePair append : this.parameters) {
            charArrayBuffer.append("; ");
            charArrayBuffer.append((Object) append);
        }
        return charArrayBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderElement)) {
            return false;
        }
        BasicHeaderElement basicHeaderElement = (BasicHeaderElement) obj;
        if (!this.name.equals(basicHeaderElement.name) || !LangUtils.equals((Object) this.value, (Object) basicHeaderElement.value) || !LangUtils.equals((Object[]) this.parameters, (Object[]) basicHeaderElement.parameters)) {
            return false;
        }
        return true;
    }

    public NameValuePair getParameterByName(String str) {
        if (str != null) {
            for (NameValuePair nameValuePair : this.parameters) {
                if (nameValuePair.getName().equalsIgnoreCase(str)) {
                    return nameValuePair;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    public BasicHeaderElement(String str, String str2, NameValuePair[] nameValuePairArr) {
        if (str != null) {
            this.name = str;
            this.value = str2;
            if (nameValuePairArr != null) {
                this.parameters = nameValuePairArr;
            } else {
                this.parameters = new NameValuePair[0];
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }
}
