package com.p280ss.android.ugc.aweme.favorites.viewholder;

import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.C27076c;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.b */
public final class C27834b implements C27833a {

    /* renamed from: a */
    public static final C27834b f73392a = new C27834b();

    /* renamed from: b */
    private static WeakReference<CrossPlatformWebView> f73393b;

    /* renamed from: c */
    private static boolean f73394c;

    /* renamed from: d */
    private static String f73395d = "";

    private C27834b() {
    }

    /* renamed from: b */
    public static WeakReference<CrossPlatformWebView> m91252b() {
        return f73393b;
    }

    /* renamed from: a */
    public final boolean mo71317a() {
        if (m91252b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m91250a(WeakReference<CrossPlatformWebView> weakReference) {
        f73393b = weakReference;
    }

    /* renamed from: a */
    public static void m91251a(boolean z) {
        f73394c = z;
    }

    /* renamed from: a */
    public static void m91249a(String str) {
        CrossPlatformWebView crossPlatformWebView;
        C7573i.m23587b(str, "type");
        WeakReference<CrossPlatformWebView> weakReference = f73393b;
        String str2 = null;
        if (weakReference != null) {
            crossPlatformWebView = (CrossPlatformWebView) weakReference.get();
        } else {
            crossPlatformWebView = null;
        }
        if (crossPlatformWebView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", str);
                WeakReference<CrossPlatformWebView> weakReference2 = f73393b;
                if (weakReference2 != null) {
                    CrossPlatformWebView crossPlatformWebView2 = (CrossPlatformWebView) weakReference2.get();
                    if (crossPlatformWebView2 != null) {
                        String a = C27076c.m88869a();
                        WeakReference<CrossPlatformWebView> weakReference3 = f73393b;
                        if (weakReference3 != null) {
                            CrossPlatformWebView crossPlatformWebView3 = (CrossPlatformWebView) weakReference3.get();
                            if (crossPlatformWebView3 != null) {
                                str2 = crossPlatformWebView3.getReactId();
                            }
                        }
                        crossPlatformWebView2.mo67473a(a, jSONObject, str2);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0078 A[Catch:{ Exception -> 0x0098 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71316a(com.p280ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r7 = "aweme"
            kotlin.jvm.internal.C7573i.m23587b(r5, r7)
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView> r7 = f73393b
            r0 = 0
            if (r7 == 0) goto L_0x0011
            java.lang.Object r7 = r7.get()
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r7 = (com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r7
            goto L_0x0012
        L_0x0011:
            r7 = r0
        L_0x0012:
            if (r7 == 0) goto L_0x0099
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x0098 }
            r7.<init>()     // Catch:{ Exception -> 0x0098 }
            java.lang.String r1 = "reactId"
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView> r2 = f73393b     // Catch:{ Exception -> 0x0098 }
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0098 }
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = (com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r2     // Catch:{ Exception -> 0x0098 }
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = r2.getReactId()     // Catch:{ Exception -> 0x0098 }
            goto L_0x002d
        L_0x002c:
            r2 = r0
        L_0x002d:
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0098 }
            java.lang.String r1 = "awemeId"
            java.lang.String r2 = r5.getAid()     // Catch:{ Exception -> 0x0098 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0098 }
            java.lang.String r1 = "star"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r2 = r5.getStatistics()     // Catch:{ Exception -> 0x0098 }
            java.lang.String r3 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x0098 }
            int r2 = r2.getDiggCount()     // Catch:{ Exception -> 0x0098 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0098 }
            java.lang.String r1 = "comment"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r2 = r5.getStatistics()     // Catch:{ Exception -> 0x0098 }
            java.lang.String r3 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x0098 }
            int r2 = r2.getCommentCount()     // Catch:{ Exception -> 0x0098 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x0098 }
            java.lang.String r1 = "share"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r5 = r5.getStatistics()     // Catch:{ Exception -> 0x0098 }
            java.lang.String r2 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r5, r2)     // Catch:{ Exception -> 0x0098 }
            int r5 = r5.getShareCount()     // Catch:{ Exception -> 0x0098 }
            r7.put(r1, r5)     // Catch:{ Exception -> 0x0098 }
            java.lang.String r5 = "from"
            r7.put(r5, r6)     // Catch:{ Exception -> 0x0098 }
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView> r5 = f73393b     // Catch:{ Exception -> 0x0098 }
            if (r5 == 0) goto L_0x0099
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x0098 }
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r5 = (com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r5     // Catch:{ Exception -> 0x0098 }
            if (r5 == 0) goto L_0x0099
            java.lang.String r1 = com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.C27076c.m88872b()     // Catch:{ Exception -> 0x0098 }
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView> r2 = f73393b     // Catch:{ Exception -> 0x0098 }
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0098 }
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r2 = (com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r2     // Catch:{ Exception -> 0x0098 }
            if (r2 == 0) goto L_0x0094
            java.lang.String r0 = r2.getReactId()     // Catch:{ Exception -> 0x0098 }
        L_0x0094:
            r5.mo67473a(r1, r7, r0)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0099
        L_0x0098:
        L_0x0099:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r5 = "exit"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.equals(r6, r5)
            if (r5 == 0) goto L_0x00a8
            com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.C27089d.m88891b()
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewholder.C27834b.mo71316a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):void");
    }
}
