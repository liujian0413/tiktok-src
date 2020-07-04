package com.p280ss.android.ugc.aweme.bullet.bridge.common;

import android.text.TextUtils;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27870d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetNativeItemMethod */
public final class GetNativeItemMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23573a f62185c = new C23573a(null);

    /* renamed from: d */
    private final String f62186d = "getNativeItem";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.GetNativeItemMethod$a */
    public static final class C23573a {
        private C23573a() {
        }

        public /* synthetic */ C23573a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62186d;
    }

    public GetNativeItemMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        try {
            String a = C27870d.m91297a().mo71348a(jSONObject.getString("key"), "");
            if (!TextUtils.isEmpty(a)) {
                aVar.mo61494a((Object) a);
            } else {
                aVar.mo61493a(-1, "");
            }
        } catch (Exception unused) {
            aVar.mo61493a(-1, "");
        }
    }
}
