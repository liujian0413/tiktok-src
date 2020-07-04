package com.kakao.auth.callback;

import com.kakao.auth.AuthService.AgeAuthStatus;
import com.kakao.network.ErrorResult;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.exception.KakaoException.ErrorType;

public class AccountErrorResult extends ErrorResult {
    private final AgeAuthStatus status;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Exception getException() {
        return this.exception;
    }

    public AgeAuthStatus getStatus() {
        return this.status;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AccountErrorResult{status=");
        sb.append(this.status);
        sb.append(", errorMessage='");
        sb.append(this.errorMessage);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public AccountErrorResult(int i) {
        super((Exception) new KakaoException(ErrorType.UNSPECIFIED_ERROR, "Age Authentication failure"));
        this.status = AgeAuthStatus.valueOf(i);
    }

    public AccountErrorResult(int i, Exception exc) {
        super(exc);
        if (exc == null || !(exc instanceof KakaoException) || ((KakaoException) exc).getErrorType() != ErrorType.CANCELED_OPERATION) {
            this.status = AgeAuthStatus.valueOf(i);
        } else {
            this.status = AgeAuthStatus.CANCELED_OPERATION;
        }
    }
}
