package com.bytedance.android.livesdk.sign;

import android.app.Activity;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.sign.a */
public final class C8950a implements C11093e {

    /* renamed from: a */
    private Activity f24506a;

    /* renamed from: b */
    private C8951a f24507b;

    /* renamed from: com.bytedance.android.livesdk.sign.a$a */
    public interface C8951a {
        /* renamed from: s */
        void mo22122s();
    }

    public C8950a(Activity activity, C8951a aVar) {
        this.f24506a = activity;
        this.f24507b = aVar;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        Activity activity = this.f24506a;
        TTLiveSDKContext.getHostService().mo22370k();
        activity.startActivity(null);
        if (this.f24507b != null) {
            this.f24507b.mo22122s();
        }
    }
}
