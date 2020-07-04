package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27866a;
import kotlin.jvm.internal.C7571f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod */
public final class OpenBrowserMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27902a f73507a = new C27902a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$a */
    public static final class C27902a {
        private C27902a() {
        }

        public /* synthetic */ C27902a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$b */
    static final class C27903b implements C25372a {

        /* renamed from: a */
        final /* synthetic */ Context f73508a;

        C27903b(Context context) {
            this.f73508a = context;
        }

        /* renamed from: a */
        public final void mo61517a(boolean z) {
            String str;
            C24961b a = C24958f.m81905a().mo65266a("draw_ad");
            if (z) {
                str = "deeplink_success";
            } else {
                str = "deeplink_failed";
            }
            a.mo65276b(str).mo65270a(this.f73508a);
        }
    }

    public OpenBrowserMethod() {
        this(null, 1, null);
    }

    public OpenBrowserMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private final boolean m91412a(JSONObject jSONObject) throws JSONException {
        Context context = (Context) this.f73443f.get();
        String string = jSONObject.getString("url");
        if (context != null && jSONObject.optBoolean("use_external_browser", false)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            intent.addFlags(268435456);
            intent.addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                context.startActivity(intent);
                return true;
            }
        }
        jSONObject.put("type", C22912d.f60641a);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", string);
        jSONObject.put("args", jSONObject2);
        C27866a.m91289a(context, jSONObject);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074 A[Catch:{ Exception -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a A[Catch:{ Exception -> 0x0088 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64209a(org.json.JSONObject r8, com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a r9) {
        /*
            r7 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            java.lang.String r0 = "iReturn"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.lang.ref.WeakReference r0 = r7.f73443f
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            java.lang.String r2 = "url"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ Exception -> 0x0088 }
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x0088 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0088 }
            if (r3 == 0) goto L_0x0024
        L_0x0022:
            r8 = 0
            goto L_0x0072
        L_0x0024:
            java.lang.String r3 = "url"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x0088 }
            if (r2 == 0) goto L_0x0080
            java.lang.String r3 = r2.toLowerCase()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r4 = "http://"
            r5 = 0
            r6 = 2
            boolean r4 = kotlin.text.C7634n.m23721b(r3, r4, false)     // Catch:{ Exception -> 0x0088 }
            if (r4 != 0) goto L_0x006e
            java.lang.String r4 = "https://"
            boolean r3 = kotlin.text.C7634n.m23721b(r3, r4, false)     // Catch:{ Exception -> 0x0088 }
            if (r3 == 0) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            goto L_0x0022
        L_0x004a:
            boolean r8 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83463a(r0, r2, r1)     // Catch:{ Exception -> 0x0088 }
            if (r8 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.commercialize.log.f$b r2 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r3 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r2 = r2.mo65266a(r3)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r3 = "open_url_app"
            com.ss.android.ugc.aweme.commercialize.log.f$b r2 = r2.mo65276b(r3)     // Catch:{ Exception -> 0x0088 }
            r2.mo65270a(r0)     // Catch:{ Exception -> 0x0088 }
            com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$b r2 = new com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod$b     // Catch:{ Exception -> 0x0088 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0088 }
            com.ss.android.ugc.aweme.commercialize.utils.n$a r2 = (com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a) r2     // Catch:{ Exception -> 0x0088 }
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83440a(r2)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0072
        L_0x006e:
            boolean r8 = r7.m91412a(r8)     // Catch:{ Exception -> 0x0088 }
        L_0x0072:
            if (r8 == 0) goto L_0x007a
            java.lang.String r8 = ""
            r9.mo71363a(r8)     // Catch:{ Exception -> 0x0088 }
            return
        L_0x007a:
            java.lang.String r8 = ""
            r9.mo71362a(r1, r8)     // Catch:{ Exception -> 0x0088 }
            return
        L_0x0080:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x0088 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r0)     // Catch:{ Exception -> 0x0088 }
            throw r8     // Catch:{ Exception -> 0x0088 }
        L_0x0088:
            java.lang.String r8 = ""
            r9.mo71362a(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.OpenBrowserMethod.mo64209a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ OpenBrowserMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
