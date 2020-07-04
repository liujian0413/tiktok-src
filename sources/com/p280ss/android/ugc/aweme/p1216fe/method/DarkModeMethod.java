package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C43097ei;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.DarkModeMethod */
public final class DarkModeMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27883a f73458a = new C27883a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DarkModeMethod$a */
    public static final class C27883a {
        private C27883a() {
        }

        public /* synthetic */ C27883a(C7571f fVar) {
            this();
        }
    }

    public DarkModeMethod() {
        this(null, 1, null);
    }

    public DarkModeMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("enable");
        } else {
            str = null;
        }
        try {
            Object obj = this.f73443f.get();
            if (obj != null) {
                CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) obj;
                C43097ei.f111719a.mo104758a(crossPlatformActivity, crossPlatformActivity.getWindow(), TextUtils.equals(str, "true"));
                aVar.mo71363a((Object) new C6711m());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
        } catch (Exception unused) {
            aVar.mo71362a(0, "");
        }
    }

    private /* synthetic */ DarkModeMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
