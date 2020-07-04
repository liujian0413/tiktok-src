package com.p280ss.android.ugc.aweme.net.rxjava;

import com.bytedance.retrofit2.C12534t;

/* renamed from: com.ss.android.ugc.aweme.net.rxjava.HttpException */
public final class HttpException extends RuntimeException {
    private final int code;
    private final transient C12534t<?> response;

    public final int code() {
        return this.code;
    }

    public final C12534t<?> response() {
        return this.response;
    }

    public HttpException(C12534t<?> tVar) {
        super(getMessage(tVar));
        this.code = tVar.mo30510a();
        this.response = tVar;
    }

    private static String getMessage(C12534t<?> tVar) {
        checkNotNull(tVar, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(tVar.mo30510a());
        return sb.toString();
    }

    private static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
