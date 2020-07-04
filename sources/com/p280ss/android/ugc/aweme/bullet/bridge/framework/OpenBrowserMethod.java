package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27866a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod */
public final class OpenBrowserMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23593a f62254c = new C23593a(null);

    /* renamed from: d */
    private final String f62255d = "openBrowser";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod$a */
    public static final class C23593a {
        private C23593a() {
        }

        public /* synthetic */ C23593a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod$b */
    static final class C23594b implements C25372a {

        /* renamed from: a */
        final /* synthetic */ OpenBrowserMethod f62256a;

        C23594b(OpenBrowserMethod openBrowserMethod) {
            this.f62256a = openBrowserMethod;
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
            a.mo65276b(str).mo65270a(this.f62256a.f28552b);
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62255d;
    }

    public OpenBrowserMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    private final boolean m77464a(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("url");
        if (this.f28552b != null && jSONObject.optBoolean("use_external_browser", false)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            intent.addFlags(268435456);
            intent.addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveActivity = this.f28552b.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                this.f28552b.startActivity(intent);
                return true;
            }
        }
        jSONObject.put("type", C22912d.f60641a);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", string);
        jSONObject.put("args", jSONObject2);
        C27866a.m91289a(this.f28552b, jSONObject);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078 A[Catch:{ Exception -> 0x0086 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61491a(org.json.JSONObject r7, com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a r8) {
        /*
            r6 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            java.lang.String r0 = "iReturn"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            r0 = 0
            java.lang.String r1 = "url"
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0086 }
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x0086 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0086 }
            if (r2 == 0) goto L_0x001c
        L_0x001a:
            r7 = 0
            goto L_0x0070
        L_0x001c:
            java.lang.String r2 = "url"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ Exception -> 0x0086 }
            if (r1 == 0) goto L_0x007e
            java.lang.String r2 = r1.toLowerCase()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = "http://"
            r4 = 0
            r5 = 2
            boolean r3 = kotlin.text.C7634n.m23721b(r2, r3, false)     // Catch:{ Exception -> 0x0086 }
            if (r3 != 0) goto L_0x006c
            java.lang.String r3 = "https://"
            boolean r2 = kotlin.text.C7634n.m23721b(r2, r3, false)     // Catch:{ Exception -> 0x0086 }
            if (r2 == 0) goto L_0x003f
            goto L_0x006c
        L_0x003f:
            android.content.Context r7 = r6.f28552b     // Catch:{ Exception -> 0x0086 }
            if (r7 != 0) goto L_0x0044
            goto L_0x001a
        L_0x0044:
            android.content.Context r7 = r6.f28552b     // Catch:{ Exception -> 0x0086 }
            boolean r7 = com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83463a(r7, r1, r0)     // Catch:{ Exception -> 0x0086 }
            if (r7 == 0) goto L_0x0070
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = com.p280ss.android.ugc.aweme.commercialize.log.C24958f.m81905a()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65266a(r2)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = "open_url_app"
            com.ss.android.ugc.aweme.commercialize.log.f$b r1 = r1.mo65276b(r2)     // Catch:{ Exception -> 0x0086 }
            android.content.Context r2 = r6.f28552b     // Catch:{ Exception -> 0x0086 }
            r1.mo65270a(r2)     // Catch:{ Exception -> 0x0086 }
            com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod$b r1 = new com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod$b     // Catch:{ Exception -> 0x0086 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0086 }
            com.ss.android.ugc.aweme.commercialize.utils.n$a r1 = (com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a) r1     // Catch:{ Exception -> 0x0086 }
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83440a(r1)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0070
        L_0x006c:
            boolean r7 = r6.m77464a(r7)     // Catch:{ Exception -> 0x0086 }
        L_0x0070:
            if (r7 == 0) goto L_0x0078
            java.lang.String r7 = ""
            r8.mo61494a(r7)     // Catch:{ Exception -> 0x0086 }
            return
        L_0x0078:
            java.lang.String r7 = ""
            r8.mo61493a(r0, r7)     // Catch:{ Exception -> 0x0086 }
            return
        L_0x007e:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x0086 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r7.<init>(r1)     // Catch:{ Exception -> 0x0086 }
            throw r7     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            java.lang.String r7 = ""
            r8.mo61493a(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod.mo61491a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridge$a):void");
    }
}
