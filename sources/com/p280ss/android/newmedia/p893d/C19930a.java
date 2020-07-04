package com.p280ss.android.newmedia.p893d;

import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.util.thread.ApiThread;
import com.bytedance.ies.util.thread.ApiThread.Priority;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.d.a */
public abstract class C19930a extends ApiThread {
    protected C19930a() {
        this((String) null, Priority.NORMAL);
    }

    protected C19930a(Priority priority) {
        this((String) null, priority);
    }

    protected C19930a(String str) {
        this(str, Priority.NORMAL);
    }

    public static boolean isApiSuccess(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        try {
            return isApiSuccess(new JSONObject(str));
        } catch (JSONException unused) {
            return false;
        }
    }

    public static boolean isApiSuccess(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !"success".equals(jSONObject.optString("message"))) {
            return false;
        }
        return true;
    }

    protected C19930a(boolean z) {
        Priority priority;
        if (z) {
            priority = Priority.LOW;
        } else {
            priority = Priority.NORMAL;
        }
        this((String) null, priority);
    }

    protected C19930a(String str, Priority priority) {
        super(str, priority);
    }

    public static boolean getHasMore(JSONObject jSONObject, boolean z) {
        return optBoolean(jSONObject, "has_more", z);
    }

    protected C19930a(String str, boolean z) {
        Priority priority;
        if (z) {
            priority = Priority.LOW;
        } else {
            priority = Priority.NORMAL;
        }
        this(str, priority);
    }

    public static boolean optBoolean(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt > 0) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }
}
