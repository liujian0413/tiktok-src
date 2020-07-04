package com.p280ss.android.ugc.aweme.hybrid.monitor;

import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.ApiResultException */
public final class ApiResultException extends Exception implements C30394n {
    private final String type;

    public final String getType() {
        return this.type;
    }

    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_type", this.type);
        String str = "error_message";
        StringBuilder sb = new StringBuilder();
        Throwable cause = getCause();
        if (cause == null) {
            C7573i.m23580a();
        }
        sb.append(cause.getClass().getSimpleName());
        sb.append(": ");
        Throwable cause2 = getCause();
        if (cause2 == null) {
            C7573i.m23580a();
        }
        sb.append(cause2.getMessage());
        jSONObject.put(str, sb.toString());
        return jSONObject;
    }

    public ApiResultException(String str, Throwable th) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(th, "cause");
        super(str, th);
        this.type = str;
    }
}
