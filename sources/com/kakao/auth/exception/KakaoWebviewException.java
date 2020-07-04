package com.kakao.auth.exception;

public class KakaoWebviewException extends Throwable {
    private final String message;

    public String getMessage() {
        return this.message;
    }

    public KakaoWebviewException(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("code = ");
        sb.append(i);
        if (str != null) {
            sb.append(", msg = ");
            sb.append(str);
        }
        if (str2 != null) {
            sb.append(", url = ");
            sb.append(str2);
        }
        this.message = sb.toString();
    }
}
