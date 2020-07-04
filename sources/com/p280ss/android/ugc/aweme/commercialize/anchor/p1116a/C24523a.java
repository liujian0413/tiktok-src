package com.p280ss.android.ugc.aweme.commercialize.anchor.p1116a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.a */
public final class C24523a {

    /* renamed from: a */
    public static final C24523a f64726a = new C24523a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.a$a */
    public static final class C24524a {

        /* renamed from: a */
        public final String f64727a;

        /* renamed from: b */
        public final String f64728b;

        /* renamed from: c */
        public final String f64729c;

        /* renamed from: d */
        public final String f64730d;

        /* renamed from: e */
        public final String f64731e;

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f64731e, (java.lang.Object) r3.f64731e) != false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x003d
                boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commercialize.anchor.p1116a.C24523a.C24524a
                if (r0 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.commercialize.anchor.a.a$a r3 = (com.p280ss.android.ugc.aweme.commercialize.anchor.p1116a.C24523a.C24524a) r3
                java.lang.String r0 = r2.f64727a
                java.lang.String r1 = r3.f64727a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f64728b
                java.lang.String r1 = r3.f64728b
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f64729c
                java.lang.String r1 = r3.f64729c
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f64730d
                java.lang.String r1 = r3.f64730d
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x003b
                java.lang.String r0 = r2.f64731e
                java.lang.String r3 = r3.f64731e
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r3 = 0
                return r3
            L_0x003d:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.anchor.p1116a.C24523a.C24524a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f64727a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f64728b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f64729c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f64730d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f64731e;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode4 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PreviewArticleInfo(id=");
            sb.append(this.f64727a);
            sb.append(", startPage=");
            sb.append(this.f64728b);
            sb.append(", enterFrom=");
            sb.append(this.f64729c);
            sb.append(", scene=");
            sb.append(this.f64730d);
            sb.append(", webUrl=");
            sb.append(this.f64731e);
            sb.append(")");
            return sb.toString();
        }

        public C24524a(String str, String str2, String str3, String str4, String str5) {
            C7573i.m23587b(str, "id");
            this.f64727a = str;
            this.f64728b = str2;
            this.f64729c = str3;
            this.f64730d = str4;
            this.f64731e = str5;
        }
    }

    private C24523a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[Catch:{ Exception -> 0x0042 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[Catch:{ Exception -> 0x0042 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p280ss.android.ugc.aweme.commercialize.anchor.p1116a.C24523a.C24524a m80527a(java.lang.String r8) {
        /*
            java.lang.String r0 = "infoString"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0042 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r8 = "micro_app_id"
            java.lang.String r3 = r1.optString(r8)     // Catch:{ Exception -> 0x0042 }
            r8 = r3
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ Exception -> 0x0042 }
            if (r8 == 0) goto L_0x001f
            int r8 = r8.length()     // Catch:{ Exception -> 0x0042 }
            if (r8 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r8 = 0
            goto L_0x0020
        L_0x001f:
            r8 = 1
        L_0x0020:
            if (r8 == 0) goto L_0x0023
            return r0
        L_0x0023:
            com.ss.android.ugc.aweme.commercialize.anchor.a.a$a r8 = new com.ss.android.ugc.aweme.commercialize.anchor.a.a$a     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "article_start_page_url"
            java.lang.String r4 = r1.optString(r2)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "enterFrom"
            java.lang.String r5 = r1.optString(r2)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "scene"
            java.lang.String r6 = r1.optString(r2)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = "article_web_url"
            java.lang.String r7 = r1.optString(r2)     // Catch:{ Exception -> 0x0042 }
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0042 }
            return r8
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.anchor.p1116a.C24523a.m80527a(java.lang.String):com.ss.android.ugc.aweme.commercialize.anchor.a.a$a");
    }

    /* renamed from: a */
    public static final void m80528a(Context context, C24524a aVar) {
        IMiniAppService a = C7167b.m22380b().mo18647a();
        if (a != null && aVar != null) {
            String a2 = C33447f.m108188a(aVar.f64728b, aVar.f64727a, false, aVar.f64731e);
            C33471b bVar = new C33471b();
            bVar.f87400b = aVar.f64729c;
            bVar.f87401c = aVar.f64730d;
            a.openMiniApp(context, a2, bVar);
        }
    }

    /* renamed from: a */
    public static final void m80529a(Context context, String str) {
        if (str != null && context != null) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.putExtra("hide_nav_bar", true);
            intent.putExtra("hide_status_bar", false);
            intent.putExtra("status_bar_color", "FFFFFF");
            intent.putExtra("status_font_dark", true);
            intent.putExtra("bundle_webview_background", C6399b.m19921a().getResources().getColor(R.color.az3));
            intent.putExtra("need_bottom_out", true);
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }
    }
}
