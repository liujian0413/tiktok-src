package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Context;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod */
public final class ShowToastMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23599a f62267c = new C23599a(null);

    /* renamed from: d */
    private final String f62268d = "showToast";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod$a */
    public static final class C23599a {
        private C23599a() {
        }

        public /* synthetic */ C23599a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod$b */
    static final class C23600b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f62269a;

        /* renamed from: b */
        final /* synthetic */ String f62270b;

        C23600b(Context context, String str) {
            this.f62269a = context;
            this.f62270b = str;
        }

        public final void run() {
            C10761a.m31387a(this.f62269a, this.f62270b).mo25750a();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62268d;
    }

    public ShowToastMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        String optString = jSONObject.optString("message");
        Context context = this.f28552b;
        if (context != null) {
            UiThreadUtil.runOnUiThread(new C23600b(context, optString));
        }
    }
}
