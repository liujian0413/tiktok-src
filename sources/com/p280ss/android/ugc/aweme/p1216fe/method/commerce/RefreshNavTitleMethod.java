package com.p280ss.android.ugc.aweme.p1216fe.method.commerce;

import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.RefreshNavTitleMethod */
public final class RefreshNavTitleMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27965a f73667a = new C27965a(null);

    /* renamed from: b */
    private final C27966b f73668b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.RefreshNavTitleMethod$a */
    public static final class C27965a {
        private C27965a() {
        }

        public /* synthetic */ C27965a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.RefreshNavTitleMethod$b */
    public interface C27966b {
        /* renamed from: c_ */
        void mo71438c_(String str);
    }

    public RefreshNavTitleMethod(C27966b bVar) {
        C7573i.m23587b(bVar, "eventObserver");
        this.f73668b = bVar;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("title");
            if (optString != null) {
                this.f73668b.mo71438c_(optString);
            }
        }
    }
}
