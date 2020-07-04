package com.p280ss.android.ugc.aweme.discover.p1185ui.search;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.discover.C26608c;
import com.p280ss.android.ugc.aweme.discover.abtest.MixSearchArrangement;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.C27076c;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.a */
public final class C27063a implements C26608c {

    /* renamed from: a */
    public static final C27063a f71397a = new C27063a();

    /* renamed from: b */
    private static WeakReference<InterceptCrossPlatformWebView> f71398b;

    /* renamed from: c */
    private static boolean f71399c;

    /* renamed from: d */
    private static String f71400d = "";

    private C27063a() {
    }

    /* renamed from: b */
    public static boolean m88826b() {
        return f71399c;
    }

    /* renamed from: c */
    public static String m88827c() {
        return f71400d;
    }

    /* renamed from: d */
    private static WeakReference<InterceptCrossPlatformWebView> m88828d() {
        return f71398b;
    }

    /* renamed from: a */
    public final boolean mo68292a() {
        if (m88828d() != null) {
            WeakReference d = m88828d();
            if (d == null) {
                C7573i.m23580a();
            }
            if (d.get() != null && C6384b.m19835a().mo15287a(MixSearchArrangement.class, true, "mix_search_arrangement", C6384b.m19835a().mo15295d().mix_search_arrangement, 0) == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m88823a(WeakReference<InterceptCrossPlatformWebView> weakReference) {
        f71398b = weakReference;
    }

    /* renamed from: a */
    public static void m88822a(String str) {
        C7573i.m23587b(str, "<set-?>");
        f71400d = str;
    }

    /* renamed from: a */
    public static void m88824a(boolean z) {
        f71399c = z;
    }

    /* renamed from: b */
    public static void m88825b(String str) {
        InterceptCrossPlatformWebView interceptCrossPlatformWebView;
        C7573i.m23587b(str, "type");
        WeakReference<InterceptCrossPlatformWebView> weakReference = f71398b;
        String str2 = null;
        if (weakReference != null) {
            interceptCrossPlatformWebView = (InterceptCrossPlatformWebView) weakReference.get();
        } else {
            interceptCrossPlatformWebView = null;
        }
        if (interceptCrossPlatformWebView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", str);
                WeakReference<InterceptCrossPlatformWebView> weakReference2 = f71398b;
                if (weakReference2 != null) {
                    InterceptCrossPlatformWebView interceptCrossPlatformWebView2 = (InterceptCrossPlatformWebView) weakReference2.get();
                    if (interceptCrossPlatformWebView2 != null) {
                        String a = C27076c.m88869a();
                        WeakReference<InterceptCrossPlatformWebView> weakReference3 = f71398b;
                        if (weakReference3 != null) {
                            InterceptCrossPlatformWebView interceptCrossPlatformWebView3 = (InterceptCrossPlatformWebView) weakReference3.get();
                            if (interceptCrossPlatformWebView3 != null) {
                                str2 = interceptCrossPlatformWebView3.getReactId();
                            }
                        }
                        interceptCrossPlatformWebView2.mo67473a(a, jSONObject, str2);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f A[Catch:{ Exception -> 0x00af }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68291a(com.p280ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            java.lang.String r0 = "enterFrom"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r0 = "from_rn_search"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r7 = android.text.TextUtils.equals(r7, r0)
            if (r7 != 0) goto L_0x001c
            return
        L_0x001c:
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.ui.search.InterceptCrossPlatformWebView> r7 = f71398b
            r0 = 0
            if (r7 == 0) goto L_0x0028
            java.lang.Object r7 = r7.get()
            com.ss.android.ugc.aweme.discover.ui.search.InterceptCrossPlatformWebView r7 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.InterceptCrossPlatformWebView) r7
            goto L_0x0029
        L_0x0028:
            r7 = r0
        L_0x0029:
            if (r7 == 0) goto L_0x00b0
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00af }
            r7.<init>()     // Catch:{ Exception -> 0x00af }
            java.lang.String r1 = "reactId"
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.ui.search.InterceptCrossPlatformWebView> r2 = f71398b     // Catch:{ Exception -> 0x00af }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.discover.ui.search.InterceptCrossPlatformWebView r2 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.InterceptCrossPlatformWebView) r2     // Catch:{ Exception -> 0x00af }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r2.getReactId()     // Catch:{ Exception -> 0x00af }
            goto L_0x0044
        L_0x0043:
            r2 = r0
        L_0x0044:
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00af }
            java.lang.String r1 = "awemeId"
            java.lang.String r2 = r5.getAid()     // Catch:{ Exception -> 0x00af }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00af }
            java.lang.String r1 = "star"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r2 = r5.getStatistics()     // Catch:{ Exception -> 0x00af }
            java.lang.String r3 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x00af }
            int r2 = r2.getDiggCount()     // Catch:{ Exception -> 0x00af }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00af }
            java.lang.String r1 = "comment"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r2 = r5.getStatistics()     // Catch:{ Exception -> 0x00af }
            java.lang.String r3 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Exception -> 0x00af }
            int r2 = r2.getCommentCount()     // Catch:{ Exception -> 0x00af }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00af }
            java.lang.String r1 = "share"
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r5 = r5.getStatistics()     // Catch:{ Exception -> 0x00af }
            java.lang.String r2 = "aweme.statistics"
            kotlin.jvm.internal.C7573i.m23582a(r5, r2)     // Catch:{ Exception -> 0x00af }
            int r5 = r5.getShareCount()     // Catch:{ Exception -> 0x00af }
            r7.put(r1, r5)     // Catch:{ Exception -> 0x00af }
            java.lang.String r5 = "from"
            r7.put(r5, r6)     // Catch:{ Exception -> 0x00af }
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.ui.search.InterceptCrossPlatformWebView> r5 = f71398b     // Catch:{ Exception -> 0x00af }
            if (r5 == 0) goto L_0x00b0
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.discover.ui.search.InterceptCrossPlatformWebView r5 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.InterceptCrossPlatformWebView) r5     // Catch:{ Exception -> 0x00af }
            if (r5 == 0) goto L_0x00b0
            java.lang.String r1 = com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.C27076c.m88872b()     // Catch:{ Exception -> 0x00af }
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.discover.ui.search.InterceptCrossPlatformWebView> r2 = f71398b     // Catch:{ Exception -> 0x00af }
            if (r2 == 0) goto L_0x00ab
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x00af }
            com.ss.android.ugc.aweme.discover.ui.search.InterceptCrossPlatformWebView r2 = (com.p280ss.android.ugc.aweme.discover.p1185ui.search.InterceptCrossPlatformWebView) r2     // Catch:{ Exception -> 0x00af }
            if (r2 == 0) goto L_0x00ab
            java.lang.String r0 = r2.getReactId()     // Catch:{ Exception -> 0x00af }
        L_0x00ab:
            r5.mo67473a(r1, r7, r0)     // Catch:{ Exception -> 0x00af }
            goto L_0x00b0
        L_0x00af:
        L_0x00b0:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r5 = "exit"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.equals(r6, r5)
            if (r5 == 0) goto L_0x00bf
            com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.C27089d.m88891b()
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27063a.mo68291a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):void");
    }
}
