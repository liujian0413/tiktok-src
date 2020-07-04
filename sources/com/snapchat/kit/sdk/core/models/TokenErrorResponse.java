package com.snapchat.kit.sdk.core.models;

import com.google.gson.p276a.C6593c;
import java.util.Objects;

public class TokenErrorResponse {
    @C6593c(mo15949a = "error")
    protected String mError;
    @C6593c(mo15949a = "error_description")
    protected String mErrorDescription;
    @C6593c(mo15949a = "message")
    protected String mMessage;

    public final String getError() {
        return this.mError;
    }

    public final String getErrorDescription() {
        return this.mErrorDescription;
    }

    public final String getMessage() {
        return this.mMessage;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.mError == null) {
            i = 0;
        } else {
            i = this.mError.hashCode() * 37;
        }
        int i4 = i + 17;
        if (this.mErrorDescription == null) {
            i2 = 0;
        } else {
            i2 = this.mErrorDescription.hashCode() * 37;
        }
        int i5 = i4 + i2;
        if (this.mMessage != null) {
            i3 = this.mMessage.hashCode() * 37;
        }
        return i5 + i3;
    }

    public TokenErrorResponse(String str) {
        this.mError = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof TokenErrorResponse)) {
            return false;
        }
        TokenErrorResponse tokenErrorResponse = (TokenErrorResponse) obj;
        if (!Objects.equals(this.mError, tokenErrorResponse.mError) || !Objects.equals(this.mErrorDescription, tokenErrorResponse.mErrorDescription) || !Objects.equals(this.mMessage, tokenErrorResponse.mMessage)) {
            return false;
        }
        return true;
    }
}
