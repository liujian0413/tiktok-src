package com.p280ss.android.ugc.aweme.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.util.p1691a.C42867a;

/* renamed from: com.ss.android.ugc.aweme.util.a */
public final class C42866a {

    /* renamed from: a */
    private static AppEventsLogger f111365a;

    /* renamed from: c */
    private static void m136082c() {
        if (C42867a.m136095a()) {
            C42867a.m136096b();
        }
    }

    /* renamed from: d */
    private static void m136084d() {
        int c = C42867a.m136097c() + 1;
        if (c == 5) {
            c = 0;
        }
        C42867a.m136091a(c);
    }

    /* renamed from: a */
    public static void m136073a() {
        if (!C42867a.m136098d()) {
            C42867a.m136099e();
            m136080b("fb_mobile_achievement_unlocked", null, null);
            return;
        }
        if (C42867a.m136100f()) {
            m136080b("2d_rr_user", null, null);
            m136076a("d2_rr_user", null, null);
            C42867a.m136101g();
        }
    }

    /* renamed from: b */
    private static synchronized AppEventsLogger m136078b() {
        AppEventsLogger appEventsLogger;
        synchronized (C42866a.class) {
            if (f111365a == null) {
                if (!C13499h.m39710a()) {
                    C13499h.m39707a("597615686992125");
                    try {
                        C13499h.m39703a((Context) AwemeApplication.m21341a());
                    } catch (FacebookException e) {
                        if (C7163a.m22363a()) {
                            throw e;
                        }
                    }
                }
                f111365a = AppEventsLogger.m38356a((Context) AwemeApplication.m21341a());
                if (C7163a.m22363a()) {
                    C13499h.m39709a(true);
                    C13499h.m39706a(LoggingBehavior.APP_EVENTS);
                }
            }
            appEventsLogger = f111365a;
        }
        return appEventsLogger;
    }

    /* renamed from: f */
    private static void m136087f(String str) {
        m136080b("fb_mobile_add_to_wishlist", "product", str);
    }

    /* renamed from: h */
    private static void m136089h(String str) {
        m136080b("fb_mobile_rate", "product", str);
    }

    /* renamed from: a */
    public static void m136074a(String str) {
        m136080b("Login", null, null);
        m136076a("login", "product", str);
    }

    /* renamed from: g */
    private static void m136088g(String str) {
        m136076a("like", "product", str);
        m136080b("fb_mobile_add_to_cart", "product", str);
    }

    /* renamed from: i */
    private static void m136090i(String str) {
        m136076a("follow", "product", str);
        m136080b("Subscribe", "product", str);
    }

    /* renamed from: b */
    public static void m136079b(String str) {
        AppsFlyerLib.getInstance().trackEvent(C6399b.m19921a(), "mus_af_post_video", null);
        m136076a("UPV", "product", str);
        m136080b("fb_mobile_purchase", "product", str);
    }

    /* renamed from: c */
    public static void m136083c(String str) {
        AppsFlyerLib.getInstance().trackEvent(C6399b.m19921a(), str, null);
    }

    /* renamed from: d */
    private static void m136085d(String str) {
        m136076a("Video_content", "product", str);
        m136080b("fb_mobile_content_view", "product", str);
    }

    /* renamed from: e */
    private static void m136086e(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("fb_success", 1);
        m136081b("fb_mobile_search", "product", str, bundle);
        m136077a("search", "product", str, bundle);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m136075a(java.lang.String r1, java.lang.String r2) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -2090153577: goto L_0x0059;
                case -1617792023: goto L_0x004f;
                case -1101213402: goto L_0x0045;
                case -906336856: goto L_0x003b;
                case 70775934: goto L_0x0030;
                case 109413407: goto L_0x0026;
                case 1263148345: goto L_0x001c;
                case 2026292779: goto L_0x0012;
                case 2026292783: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0063
        L_0x0008:
            java.lang.String r0 = "mus_af_like_video_5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 3
            goto L_0x0064
        L_0x0012:
            java.lang.String r0 = "mus_af_like_video_1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 2
            goto L_0x0064
        L_0x001c:
            java.lang.String r0 = "mus_af_comment"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 0
            goto L_0x0064
        L_0x0026:
            java.lang.String r0 = "shoot"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 7
            goto L_0x0064
        L_0x0030:
            java.lang.String r0 = "start_upload"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 8
            goto L_0x0064
        L_0x003b:
            java.lang.String r0 = "search"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 5
            goto L_0x0064
        L_0x0045:
            java.lang.String r0 = "collect_video"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 4
            goto L_0x0064
        L_0x004f:
            java.lang.String r0 = "video_view"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 6
            goto L_0x0064
        L_0x0059:
            java.lang.String r0 = "mus_af_follow"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 1
            goto L_0x0064
        L_0x0063:
            r1 = -1
        L_0x0064:
            r0 = 0
            switch(r1) {
                case 0: goto L_0x0090;
                case 1: goto L_0x008c;
                case 2: goto L_0x0085;
                case 3: goto L_0x0081;
                case 4: goto L_0x007d;
                case 5: goto L_0x0079;
                case 6: goto L_0x0075;
                case 7: goto L_0x006f;
                case 8: goto L_0x0069;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x0094
        L_0x0069:
            java.lang.String r1 = "fb_mobile_initiated_checkout"
            m136080b(r1, r0, r0)
            goto L_0x0094
        L_0x006f:
            java.lang.String r1 = "fb_mobile_add_payment_info"
            m136080b(r1, r0, r0)
            return
        L_0x0075:
            m136085d(r2)
            return
        L_0x0079:
            m136086e(r2)
            return
        L_0x007d:
            m136087f(r2)
            return
        L_0x0081:
            m136084d()
            return
        L_0x0085:
            m136082c()
            m136088g(r2)
            return
        L_0x008c:
            m136090i(r2)
            return
        L_0x0090:
            m136089h(r2)
            return
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.util.C42866a.m136075a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public static void m136080b(String str, String str2, String str3) {
        m136081b(str, str2, str3, new Bundle());
    }

    /* renamed from: a */
    public static void m136076a(String str, String str2, String str3) {
        m136077a(str, str2, str3, new Bundle());
    }

    /* renamed from: b */
    private static void m136081b(String str, String str2, String str3, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("fb_content_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(str, "fb_mobile_search")) {
                bundle.putString("fb_search_string", str3);
            } else {
                bundle.putString("fb_content_id", str3);
            }
        }
        m136078b().mo32284a(str, bundle);
    }

    /* renamed from: a */
    private static void m136077a(String str, String str2, String str3, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("content_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(str, "search")) {
                bundle.putString("search_term", str3);
            } else {
                bundle.putString("item_id", str3);
            }
        }
        FirebaseAnalytics.getInstance(AwemeApplication.m21341a()).mo47131a(str, bundle);
    }
}
