package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42925am;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RequestAddressBookPermission */
public final class RequestAddressBookPermission extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27914a f73532a = new C27914a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RequestAddressBookPermission$a */
    public static final class C27914a {
        private C27914a() {
        }

        public /* synthetic */ C27914a(C7571f fVar) {
            this();
        }
    }

    public RequestAddressBookPermission() {
        this(null, 1, null);
    }

    public RequestAddressBookPermission(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (C42925am.m136275c(AwemeApplication.m21341a())) {
            aVar.mo71364a("", 1, "");
        } else {
            aVar.mo71362a(0, "");
        }
    }

    private /* synthetic */ RequestAddressBookPermission(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
