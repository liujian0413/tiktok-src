package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;

public class BasicHeader implements Cloneable, Header {
    private final String name;
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

    public HeaderElement[] getElements() throws ParseException {
        if (this.value != null) {
            return BasicHeaderValueParser.parseElements(this.value, (HeaderValueParser) null);
        }
        return new HeaderElement[0];
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatHeader(null, this).toString();
    }

    public BasicHeader(String str, String str2) {
        if (str != null) {
            this.name = str;
            this.value = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
