package com.bytedance.android.livesdk.action;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.action.d */
public abstract class C3868d<R> {

    /* renamed from: a */
    public C3869a f11569a;

    /* renamed from: b */
    private boolean f11570b = true;

    /* renamed from: com.bytedance.android.livesdk.action.d$a */
    public interface C3869a<R> {
        /* renamed from: a */
        void mo11403a(R r);
    }

    /* renamed from: a */
    private void m13721a() {
        this.f11570b = false;
    }

    /* renamed from: a */
    public abstract void mo11405a(Map<String, Object> map) throws Exception;

    /* renamed from: a */
    public final void mo11412a(Throwable th) {
        m13721a();
    }

    /* renamed from: a */
    public final void mo11410a(R r) {
        if (this.f11570b && this.f11569a != null) {
            this.f11569a.mo11403a(r);
        }
        m13721a();
    }

    /* renamed from: a */
    public final void mo11411a(String str, C3869a aVar) throws Exception {
        this.f11569a = aVar;
        Uri parse = Uri.parse(str);
        if (parse != null) {
            HashMap hashMap = new HashMap();
            for (String str2 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str2);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(queryParameter)) {
                    hashMap.put(str2, queryParameter);
                }
            }
            mo11405a((Map<String, Object>) hashMap);
        }
    }
}
