package com.facebook;

public class FacebookGraphResponseException extends FacebookException {
    private final GraphResponse graphResponse;

    public final GraphResponse getGraphResponse() {
        return this.graphResponse;
    }

    public final String toString() {
        FacebookRequestError facebookRequestError;
        if (this.graphResponse != null) {
            facebookRequestError = this.graphResponse.f34704d;
        } else {
            facebookRequestError = null;
        }
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.f34653c);
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.f34654d);
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.f34656f);
            sb.append(", message: ");
            sb.append(facebookRequestError.mo31780a());
            sb.append("}");
        }
        return sb.toString();
    }

    public FacebookGraphResponseException(GraphResponse graphResponse2, String str) {
        super(str);
        this.graphResponse = graphResponse2;
    }
}
