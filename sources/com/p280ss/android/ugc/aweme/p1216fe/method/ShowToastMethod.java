package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.web.p582a.C11087a;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShowToastMethod */
public final class ShowToastMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27932a f73597a = new C27932a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShowToastMethod$a */
    public static final class C27932a {
        private C27932a() {
        }

        public /* synthetic */ C27932a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShowToastMethod$b */
    static final class C27933b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f73598a;

        /* renamed from: b */
        final /* synthetic */ String f73599b;

        C27933b(Context context, String str) {
            this.f73598a = context;
            this.f73599b = str;
        }

        public final void run() {
            C10761a.m31387a(this.f73598a, this.f73599b).mo25750a();
        }
    }

    public ShowToastMethod() {
        this(null, 1, null);
    }

    public ShowToastMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("message");
        } else {
            str = null;
        }
        UiThreadUtil.runOnUiThread(new C27933b((Context) this.f73443f.get(), str));
    }

    private /* synthetic */ ShowToastMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
