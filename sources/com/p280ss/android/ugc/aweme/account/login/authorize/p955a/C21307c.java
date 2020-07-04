package com.p280ss.android.ugc.aweme.account.login.authorize.p955a;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12712g;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.a.c */
public final class C21307c extends C12706a<C12712g> {

    /* renamed from: a */
    private final WeakReference<C21305a> f57263a;

    public C21307c(C21305a aVar) {
        this.f57263a = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onResponse(C12712g gVar) {
        if (gVar.f33701a) {
            if (this.f57263a.get() != null) {
                ((C21305a) this.f57263a.get()).mo57310a(gVar.f33711g, gVar.f33711g.f34083f);
            }
        } else if (this.f57263a.get() != null) {
            String str = gVar.f33721q;
            if (gVar.f33705e != null) {
                JSONObject optJSONObject = gVar.f33705e.optJSONObject("data");
                if (TextUtils.isEmpty(str) && optJSONObject != null && optJSONObject.has("profile_key")) {
                    str = optJSONObject.optString("profile_key", "");
                }
            }
            ((C21305a) this.f57263a.get()).mo57309a(gVar.f33702b, gVar.f33703c, gVar.f33713i, str, gVar);
        }
    }
}
