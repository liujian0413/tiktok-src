package com.fasterxml.jackson.core;

import java.io.Serializable;

public class JsonLocation implements Serializable {

    /* renamed from: NA */
    public static final JsonLocation f37797NA;
    private static final long serialVersionUID = 1;
    final int _columnNr;
    final int _lineNr;
    final Object _sourceRef;
    final long _totalBytes;
    final long _totalChars;

    public long getByteOffset() {
        return this._totalBytes;
    }

    public long getCharOffset() {
        return this._totalChars;
    }

    public int getColumnNr() {
        return this._columnNr;
    }

    public int getLineNr() {
        return this._lineNr;
    }

    public Object getSourceRef() {
        return this._sourceRef;
    }

    static {
        JsonLocation jsonLocation = new JsonLocation("N/A", -1, -1, -1, -1);
        f37797NA = jsonLocation;
    }

    public int hashCode() {
        int i;
        if (this._sourceRef == null) {
            i = 1;
        } else {
            i = this._sourceRef.hashCode();
        }
        return (((i ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        if (this._sourceRef == null) {
            sb.append("UNKNOWN");
        } else {
            sb.append(this._sourceRef.toString());
        }
        sb.append("; line: ");
        sb.append(this._lineNr);
        sb.append(", column: ");
        sb.append(this._columnNr);
        sb.append(']');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        if (this._sourceRef == null) {
            if (jsonLocation._sourceRef != null) {
                return false;
            }
        } else if (!this._sourceRef.equals(jsonLocation._sourceRef)) {
            return false;
        }
        if (this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && getByteOffset() == jsonLocation.getByteOffset()) {
            return true;
        }
        return false;
    }

    public JsonLocation(Object obj, long j, int i, int i2) {
        this(obj, -1, j, i, i2);
    }

    public JsonLocation(Object obj, long j, long j2, int i, int i2) {
        this._sourceRef = obj;
        this._totalBytes = j;
        this._totalChars = j2;
        this._lineNr = i;
        this._columnNr = i2;
    }
}
