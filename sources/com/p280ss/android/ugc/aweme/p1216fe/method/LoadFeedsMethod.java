package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.C27976a;
import com.p280ss.android.ugc.aweme.p1216fe.method.feeds.C27976a.C27977a;
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

/* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod */
public final class LoadFeedsMethod extends BaseCommonJavaMethod implements C27986a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f73490a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LoadFeedsMethod.class), "bridgeModel", "getBridgeModel()Lcom/ss/android/ugc/aweme/fe/method/feeds/FeedsFEBridgeModel;"))};

    /* renamed from: c */
    public static final C27895a f73491c = new C27895a(null);

    /* renamed from: b */
    public String f73492b;

    /* renamed from: d */
    private final C7541d f73493d;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod$a */
    public static final class C27895a {
        private C27895a() {
        }

        public /* synthetic */ C27895a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod$b */
    static final class C27896b extends Lambda implements C7561a<C27976a> {

        /* renamed from: a */
        final /* synthetic */ LoadFeedsMethod f73494a;

        C27896b(LoadFeedsMethod loadFeedsMethod) {
            this.f73494a = loadFeedsMethod;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C27976a invoke() {
            return C27977a.m91578a(new C27989a(), this.f73494a.f73492b, this.f73494a);
        }
    }

    public LoadFeedsMethod() {
        this(null, 1, null);
    }

    /* renamed from: c */
    private final C27976a m91389c() {
        return (C27976a) this.f73493d.getValue();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        m91389c().mo71446a();
        m91391e();
    }

    /* renamed from: e */
    private final void m91391e() {
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

    /* renamed from: d */
    private final void m91390d() {
        Context context;
        WeakReference weakReference = this.f73443f;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.ov, m91389c());
        }
    }

    public LoadFeedsMethod(C11087a aVar) {
        super(aVar);
        this.f73493d = C7546e.m23569a(new C27896b(this));
        this.f73492b = "";
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

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64209a(org.json.JSONObject r6, com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0061
            java.lang.String r2 = "base_url"
            boolean r2 = r6.has(r2)
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = "react_id"
            boolean r2 = r6.has(r2)
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = "page"
            boolean r2 = r6.has(r2)
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = "size"
            boolean r2 = r6.has(r2)
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = "clear"
            boolean r2 = r6.optBoolean(r2, r1)
            if (r2 != 0) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r6 = 0
        L_0x0033:
            if (r6 == 0) goto L_0x0061
            java.lang.String r1 = "react_id"
            java.lang.String r1 = r6.optString(r1)
            java.lang.String r2 = "optString(FIELD_REACT_ID)"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r5.f73492b = r1
            java.lang.String r1 = "base_url"
            java.lang.String r1 = r6.optString(r1)
            java.lang.String r2 = "page"
            int r2 = r6.optInt(r2)
            java.lang.String r3 = "size"
            int r6 = r6.optInt(r3)
            com.ss.android.ugc.aweme.fe.method.feeds.a r3 = r5.m91389c()
            java.lang.String r4 = "baseUrl"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            r3.mo71448a(r1, r2, r6)
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            r5.m91390d()
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r1 = "code"
            if (r0 == 0) goto L_0x0071
            int r0 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78750c
            goto L_0x0073
        L_0x0071:
            int r0 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78751d
        L_0x0073:
            r6.put(r1, r0)
            r7.mo71365a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.LoadFeedsMethod.mo64209a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ LoadFeedsMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }

    /* renamed from: b */
    public final void mo71383b(String str, JSONObject jSONObject, int i) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(jSONObject, "params");
        mo71359a(str, jSONObject, 3);
    }
}
