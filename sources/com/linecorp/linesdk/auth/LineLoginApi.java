package com.linecorp.linesdk.auth;

import android.content.Context;
import android.content.Intent;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.auth.LineAuthenticationConfig.C18591a;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import com.linecorp.linesdk.p801a.C18583c;
import java.util.Collections;
import java.util.List;

public class LineLoginApi {
    /* renamed from: a */
    public static LineLoginResult m61018a(Intent intent) {
        if (intent == null) {
            return new LineLoginResult(LineApiResponseCode.INTERNAL_ERROR, new LineApiError("Callback intent is null"));
        }
        return LineAuthenticationActivity.m61022a(intent);
    }

    /* renamed from: a */
    public static Intent m61017a(Context context, String str) {
        return m61016a(context, new C18591a(str).mo48758a(), Collections.emptyList());
    }

    /* renamed from: a */
    private static Intent m61016a(Context context, LineAuthenticationConfig lineAuthenticationConfig, List<String> list) {
        if (!lineAuthenticationConfig.f50238e) {
            C18583c.m61010a(context);
        }
        return LineAuthenticationActivity.m61021a(context, lineAuthenticationConfig, list);
    }
}
