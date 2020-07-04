package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import com.google.gson.JsonParseException;
import com.p280ss.android.ugc.aweme.base.api.exceptions.local.JSONParseException;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.an */
public final class C31868an {
    /* renamed from: a */
    public static RuntimeException m103554a(ExecutionException executionException) throws Exception {
        Throwable cause = executionException.getCause();
        if (cause instanceof ApiServerException) {
            return (ApiServerException) cause;
        }
        if (cause instanceof JsonParseException) {
            return new JSONParseException(cause);
        }
        throw ((Exception) cause);
    }
}
