package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.C6607f;
import com.google.gson.C6717s;
import com.google.gson.JsonSyntaxException;
import com.twitter.sdk.android.core.models.C46944a;
import com.twitter.sdk.android.core.models.C46945b;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import retrofit2.C48516l;

public class TwitterApiException extends TwitterException {
    private final C46944a apiError;
    private final int code;
    private final C48516l response;
    private final C46971s twitterRateLimit;

    public C48516l getResponse() {
        return this.response;
    }

    public int getStatusCode() {
        return this.code;
    }

    public C46971s getTwitterRateLimit() {
        return this.twitterRateLimit;
    }

    public int getErrorCode() {
        if (this.apiError == null) {
            return 0;
        }
        return this.apiError.f120379b;
    }

    public String getErrorMessage() {
        if (this.apiError == null) {
            return null;
        }
        return this.apiError.f120378a;
    }

    public TwitterApiException(C48516l lVar) {
        this(lVar, readApiError(lVar), readApiRateLimit(lVar), lVar.mo123307a());
    }

    static String createExceptionMessage(int i) {
        StringBuilder sb = new StringBuilder("HTTP request failed, Status: ");
        sb.append(i);
        return sb.toString();
    }

    public static C46971s readApiRateLimit(C48516l lVar) {
        return new C46971s(lVar.mo123309c());
    }

    public static C46944a readApiError(C48516l lVar) {
        try {
            String readUtf8 = lVar.f123665c.source().buffer().clone().readUtf8();
            if (!TextUtils.isEmpty(readUtf8)) {
                return parseApiError(readUtf8);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    static C46944a parseApiError(String str) {
        try {
            C46945b bVar = (C46945b) new C6607f().mo15985a((C6717s) new SafeListAdapter()).mo15985a((C6717s) new SafeMapAdapter()).mo15992f().mo15974a(str, C46945b.class);
            if (!bVar.f120380a.isEmpty()) {
                return (C46944a) bVar.f120380a.get(0);
            }
        } catch (JsonSyntaxException unused) {
            new StringBuilder("Invalid json: ").append(str);
        }
        return null;
    }

    TwitterApiException(C48516l lVar, C46944a aVar, C46971s sVar, int i) {
        super(createExceptionMessage(i));
        this.apiError = aVar;
        this.twitterRateLimit = sVar;
        this.code = i;
        this.response = lVar;
    }
}
