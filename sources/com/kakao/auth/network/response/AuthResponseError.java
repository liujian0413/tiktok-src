package com.kakao.auth.network.response;

import com.kakao.network.exception.ResponseStatusError;
import com.kakao.network.response.CustomErrorConverter;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseBody.ResponseBodyException;

public class AuthResponseError extends ResponseStatusError {
    public static final CustomErrorConverter<AuthResponseError> CONVERTER = new CustomErrorConverter<AuthResponseError>() {
        public final AuthResponseError convert(int i, String str) {
            return new AuthResponseError(i, new ResponseBody(str));
        }
    };
    private static final long serialVersionUID = 3702596857996303483L;
    private final String error;
    private final String errorDescription;
    private final ResponseBody errorResponse;
    private final int httpStatusCode;

    public String getError() {
        return this.error;
    }

    public int getErrorCode() {
        return -776;
    }

    public String getErrorMsg() {
        return this.errorDescription;
    }

    public ResponseBody getErrorResponse() {
        return this.errorResponse;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AuthResponseError(int i, ResponseBody responseBody) throws ResponseBodyException {
        super(responseBody.toString());
        this.httpStatusCode = i;
        this.errorResponse = responseBody;
        this.error = responseBody.getString("error");
        this.errorDescription = responseBody.optString("error_description", "");
    }
}
