package com.p280ss.android.ugc.aweme.miniapp.impl;

import android.content.Context;
import com.bytedance.framwork.core.monitor.C6379c;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33440d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.e */
public class C33395e implements C33440d {

    /* renamed from: a */
    public static final String f87238a = "e";

    /* renamed from: a */
    public final void mo85607a(String str) {
        AppLog.onActivityCreate(str);
    }

    /* renamed from: b */
    public final void mo85611b(String str, JSONObject jSONObject) {
        C6759a.m20910a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo85609a(String str, JSONObject jSONObject) {
        C6877n.m21447a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo85605a(Context context, String str, int i) {
        AppLog.onPause(context, str, i);
    }

    /* renamed from: b */
    public final void mo85610b(Context context, String str, int i) {
        AppLog.onResume(context, str, i);
    }

    /* renamed from: a */
    public final void mo85608a(String str, int i, JSONObject jSONObject) {
        C6379c.m19823a(str, i, jSONObject);
    }

    /* renamed from: a */
    public final void mo85606a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        try {
            TeaAgent.onEvent((Context) null, str, str2, str3, j, j2, jSONObject);
        } catch (Exception unused) {
        }
    }
}
