package com.bytedance.frameworks.baselib.network.http.parser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

public class MimeType implements Externalizable {
    private C10173b parameters;
    private String primaryType;
    private String subType;

    public C10173b getParameters() {
        return this.parameters;
    }

    public String getPrimaryType() {
        return this.primaryType;
    }

    public String getSubType() {
        return this.subType;
    }

    public MimeType() {
        this.primaryType = "application";
        this.subType = "*";
        this.parameters = new C10173b();
    }

    public String getBaseType() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.primaryType);
        sb.append("/");
        sb.append(this.subType);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getBaseType());
        sb.append(this.parameters.toString());
        return sb.toString();
    }

    public MimeType(String str) throws MimeTypeParseException {
        parse(str);
    }

    public String getParameter(String str) {
        return this.parameters.mo24867a(str);
    }

    public void removeParameter(String str) {
        this.parameters.mo24869b(str);
    }

    public boolean match(String str) throws MimeTypeParseException {
        return match(new MimeType(str));
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(toString());
        objectOutput.flush();
    }

    private static boolean isTokenChar(char c) {
        if (c <= ' ' || c >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c) >= 0) {
            return false;
        }
        return true;
    }

    private boolean isValidToken(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!isTokenChar(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        try {
            parse(objectInput.readUTF());
        } catch (MimeTypeParseException e) {
            throw new IOException(e.toString());
        }
    }

    public void setPrimaryType(String str) throws MimeTypeParseException {
        if (isValidToken(this.primaryType)) {
            this.primaryType = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new MimeTypeParseException("Primary type is invalid.");
    }

    public void setSubType(String str) throws MimeTypeParseException {
        if (isValidToken(this.subType)) {
            this.subType = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new MimeTypeParseException("Sub type is invalid.");
    }

    public boolean match(MimeType mimeType) {
        if (!this.primaryType.equals(mimeType.getPrimaryType()) || (!this.subType.equals("*") && !mimeType.getSubType().equals("*") && !this.subType.equals(mimeType.getSubType()))) {
            return false;
        }
        return true;
    }

    private void parse(String str) throws MimeTypeParseException {
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0 && indexOf2 < 0) {
            throw new MimeTypeParseException("Unable to find a sub type.");
        } else if (indexOf >= 0 || indexOf2 < 0) {
            if (indexOf >= 0 && indexOf2 < 0) {
                this.primaryType = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
                this.subType = str.substring(indexOf + 1).trim().toLowerCase(Locale.ENGLISH);
                this.parameters = new C10173b();
            } else if (indexOf < indexOf2) {
                this.primaryType = str.substring(0, indexOf).trim().toLowerCase(Locale.ENGLISH);
                this.subType = str.substring(indexOf + 1, indexOf2).trim().toLowerCase(Locale.ENGLISH);
                this.parameters = new C10173b(str.substring(indexOf2));
            } else {
                throw new MimeTypeParseException("Unable to find a sub type.");
            }
            if (!isValidToken(this.primaryType)) {
                throw new MimeTypeParseException("Primary type is invalid.");
            } else if (!isValidToken(this.subType)) {
                throw new MimeTypeParseException("Sub type is invalid.");
            }
        } else {
            throw new MimeTypeParseException("Unable to find a sub type.");
        }
    }

    public void setParameter(String str, String str2) {
        this.parameters.mo24868a(str, str2);
    }

    public MimeType(String str, String str2) throws MimeTypeParseException {
        if (isValidToken(str)) {
            this.primaryType = str.toLowerCase(Locale.ENGLISH);
            if (isValidToken(str2)) {
                this.subType = str2.toLowerCase(Locale.ENGLISH);
                this.parameters = new C10173b();
                return;
            }
            throw new MimeTypeParseException("Sub type is invalid.");
        }
        throw new MimeTypeParseException("Primary type is invalid.");
    }
}
