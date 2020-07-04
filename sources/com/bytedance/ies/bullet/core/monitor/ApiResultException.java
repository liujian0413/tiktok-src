package com.bytedance.ies.bullet.core.monitor;

import com.bytedance.ies.bullet.core.model.p543b.C10406a;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

public final class ApiResultException extends Exception implements C10406a {
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
