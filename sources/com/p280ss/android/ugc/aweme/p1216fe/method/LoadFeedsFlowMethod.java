package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.C27987b;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.C27987b.C27988a;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.api.C27986a;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.p1221b.C27989a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod */
public final class LoadFeedsFlowMethod extends BaseCommonJavaMethod implements C27986a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f73482a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LoadFeedsFlowMethod.class), "bridgeModel", "getBridgeModel()Lcom/ss/android/ugc/aweme/fe/method/feeds/FeedsFEBridgeOptimizedModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LoadFeedsFlowMethod.class), "parser", "getParser()Lcom/google/gson/Gson;"))};

    /* renamed from: c */
    public static final C27892a f73483c = new C27892a(null);

    /* renamed from: b */
    public String f73484b;

    /* renamed from: d */
    private final C7541d f73485d;

    /* renamed from: i */
    private final C7541d f73486i;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod$a */
    public static final class C27892a {
        private C27892a() {
        }

        public /* synthetic */ C27892a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod$b */
    static final class C27893b extends Lambda implements C7561a<C27987b> {

        /* renamed from: a */
        final /* synthetic */ LoadFeedsFlowMethod f73487a;

        C27893b(LoadFeedsFlowMethod loadFeedsFlowMethod) {
            this.f73487a = loadFeedsFlowMethod;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C27987b invoke() {
            return C27988a.m91591a(new C27989a(), this.f73487a.f73484b, this.f73487a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod$c */
    static final class C27894c extends Lambda implements C7561a<C6600e> {

        /* renamed from: a */
        public static final C27894c f73488a = new C27894c();

        C27894c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m91385a();
        }

        /* renamed from: a */
        private static C6600e m91385a() {
            return new C6607f().mo15986a(Boolean.TYPE, new LoadFeedsFlowMethod$parser$2$1()).mo15992f();
        }
    }

    public LoadFeedsFlowMethod() {
        this(null, 1, null);
    }

    /* renamed from: c */
    private final C27987b m91377c() {
        return (C27987b) this.f73485d.getValue();
    }

    /* renamed from: d */
    private final C6600e m91378d() {
        return (C6600e) this.f73486i.getValue();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        m91380f();
    }

    /* renamed from: f */
    private final void m91380f() {
        Context context;
        WeakReference weakReference = this.f73443f;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.ov, null);
        }
    }

    /* renamed from: e */
    private final void m91379e() {
        Context context;
        WeakReference weakReference = this.f73443f;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.ov, m91377c());
        }
    }

    public LoadFeedsFlowMethod(C11087a aVar) {
        super(aVar);
        this.f73485d = C7546e.m23569a(new C27893b(this));
        this.f73486i = C7546e.m23569a(C27894c.f73488a);
        this.f73484b = "";
    }

    /* renamed from: b */
    public final BaseCommonJavaMethod mo71360b(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "contextRef");
        Context context = (Context) weakReference.get();
        if (context instanceof C0043i) {
            ((C0043i) context).getLifecycle().mo55a(this);
        }
        BaseCommonJavaMethod b = super.mo71360b(weakReference);
        C7573i.m23582a((Object) b, "super.attach(contextRef)");
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r3 == null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64209a(org.json.JSONObject r8, com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x0072
            java.lang.String r2 = "react_id"
            boolean r2 = r8.has(r2)
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = "has_more"
            boolean r2 = r8.has(r2)
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = "aweme_list"
            boolean r2 = r8.has(r2)
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = "page"
            boolean r2 = r8.has(r2)
            if (r2 == 0) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r8 = 0
        L_0x002b:
            if (r8 == 0) goto L_0x0072
            java.lang.String r2 = "react_id"
            java.lang.String r2 = r8.optString(r2)
            java.lang.String r3 = "optString(FIELD_REACT_ID)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r7.f73484b = r2
            com.ss.android.ugc.aweme.fe.method.feeds.b r2 = r7.m91377c()
            com.google.gson.e r3 = r7.m91378d()
            java.lang.String r4 = "aweme_list"
            java.lang.String r4 = r8.optString(r4)
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme[]> r5 = com.p280ss.android.ugc.aweme.feed.model.Aweme[].class
            java.lang.Object r3 = r3.mo15974a(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme[] r3 = (com.p280ss.android.ugc.aweme.feed.model.Aweme[]) r3
            if (r3 == 0) goto L_0x0058
            java.util.List r3 = kotlin.collections.C7519g.m23447d((T[]) r3)
            if (r3 != 0) goto L_0x005c
        L_0x0058:
            java.util.List r3 = kotlin.collections.C7525m.m23461a()
        L_0x005c:
            java.lang.String r4 = "page"
            int r4 = r8.optInt(r4, r1)
            java.lang.String r5 = "has_more"
            boolean r5 = r8.optBoolean(r5, r1)
            java.lang.String r6 = "insert_before"
            boolean r8 = r8.optBoolean(r6, r1)
            r2.mo71450a(r3, r4, r5, r8)
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            r7.m91379e()
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r1 = "code"
            if (r0 == 0) goto L_0x0082
            int r0 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78750c
            goto L_0x0084
        L_0x0082:
            int r0 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78751d
        L_0x0084:
            r8.put(r1, r0)
            r9.mo71365a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.LoadFeedsFlowMethod.mo64209a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ LoadFeedsFlowMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }

    /* renamed from: b */
    public final void mo71383b(String str, JSONObject jSONObject, int i) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(jSONObject, "params");
        mo71359a(str, jSONObject, 3);
    }
}
