package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.bytedance.ies.web.p582a.C11087a;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.C27074a;
import com.p280ss.android.ugc.aweme.framework.ReactInstance;
import com.p280ss.android.ugc.aweme.framework.activity.C29948b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ComponentDidMountMethod */
public final class ComponentDidMountMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27881a f73456a = new C27881a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ComponentDidMountMethod$a */
    public static final class C27881a {
        private C27881a() {
        }

        public /* synthetic */ C27881a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ComponentDidMountMethod$b */
    static final class C27882b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f73457a;

        C27882b(String str) {
            this.f73457a = str;
        }

        public final void run() {
            C29948b reactViewById = ReactInstance.getReactViewById(this.f73457a);
            if (reactViewById != null) {
                reactViewById.mo67487d();
            }
        }
    }

    public ComponentDidMountMethod() {
        this(null, 1, null);
    }

    public ComponentDidMountMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        String str;
        if (this.f73445h != null) {
            C42961az.m136380a(new C27074a());
            return;
        }
        if (jSONObject != null) {
            str = jSONObject.optString("reactId");
        } else {
            str = null;
        }
        UiThreadUtil.runOnUiThread(new C27882b(str));
    }

    private /* synthetic */ ComponentDidMountMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
