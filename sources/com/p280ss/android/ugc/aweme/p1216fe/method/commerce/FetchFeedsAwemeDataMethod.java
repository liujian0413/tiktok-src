package com.p280ss.android.ugc.aweme.p1216fe.method.commerce;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42996by;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.FetchFeedsAwemeDataMethod */
public final class FetchFeedsAwemeDataMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27959a f73661a = new C27959a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.FetchFeedsAwemeDataMethod$a */
    public static final class C27959a {
        private C27959a() {
        }

        public /* synthetic */ C27959a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        String str;
        if (jSONObject != null) {
            try {
                str = jSONObject.optString("item_id");
            } catch (Exception unused) {
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            aVar.mo71363a((Object) new JSONObject().put("aweme", C42996by.m136485a(C24436a.m80356a().getAwemeById(str))));
        }
    }
}
