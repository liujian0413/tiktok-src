package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.p555c.C10702a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.sdk.webview.C20145l;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.b */
public final class C25913b {
    /* renamed from: c */
    public static final String m85207c(C10903d dVar) {
        return m85201a(dVar, null);
    }

    /* renamed from: a */
    public static final boolean m85203a(C10903d dVar) {
        C7573i.m23587b(dVar, "$this$shouldCheckBundleInfo");
        if (dVar.f29512g == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static File m85208d(C10903d dVar) {
        if (TextUtils.isEmpty(dVar.f29509d) || TextUtils.equals(TEVideoRecorder.FACE_BEAUTY_NULL, dVar.f29509d)) {
            return null;
        }
        String serverDeviceId = AppLog.getServerDeviceId();
        String j = C6399b.m19934j();
        Context a = C6399b.m19921a();
        String[] strArr = new String[1];
        AwemeAppData a2 = C19936f.m65765a();
        C7573i.m23582a((Object) a2, "BaseAppData.inst()");
        C20145l g = a2.mo53441g();
        if (g == null) {
            C7573i.m23580a();
        }
        strArr[0] = g.mo53916a();
        C10702a a3 = C10702a.m31260a(a, j, serverDeviceId, strArr);
        C7573i.m23582a((Object) a3, "iesOfflineCache");
        return new File(a3.mo25588a(), dVar.f29509d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041 A[Catch:{ Exception -> 0x0085, Throwable -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.model.RNBundleInfo m85204b(com.bytedance.ies.geckoclient.model.C10903d r7) {
        /*
            java.lang.String r0 = "$this$offlineBundleInfo"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            r0 = 0
            java.io.File r7 = m85208d(r7)     // Catch:{ Throwable -> 0x009d }
            if (r7 == 0) goto L_0x003e
            boolean r1 = r7.exists()     // Catch:{ Throwable -> 0x009d }
            if (r1 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r7 = r0
        L_0x0014:
            if (r7 == 0) goto L_0x003e
            java.io.File[] r7 = r7.listFiles()     // Catch:{ Throwable -> 0x009d }
            if (r7 == 0) goto L_0x003e
            int r1 = r7.length     // Catch:{ Throwable -> 0x009d }
            r2 = 0
        L_0x001e:
            if (r2 >= r1) goto L_0x0036
            r3 = r7[r2]     // Catch:{ Throwable -> 0x009d }
            java.lang.String r4 = "bundle_info.json"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Throwable -> 0x009d }
            java.lang.String r5 = r3.getName()     // Catch:{ Throwable -> 0x009d }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Throwable -> 0x009d }
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch:{ Throwable -> 0x009d }
            if (r4 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0036:
            r3 = r0
        L_0x0037:
            if (r3 == 0) goto L_0x003e
            java.lang.String r7 = r3.getAbsolutePath()     // Catch:{ Throwable -> 0x009d }
            goto L_0x003f
        L_0x003e:
            r7 = r0
        L_0x003f:
            if (r7 == 0) goto L_0x009d
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x009d }
            r1.<init>(r7)     // Catch:{ Throwable -> 0x009d }
            boolean r1 = r1.exists()     // Catch:{ Throwable -> 0x009d }
            if (r1 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r7 = r0
        L_0x004e:
            if (r7 == 0) goto L_0x009d
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x009d }
            r1.<init>(r7)     // Catch:{ Throwable -> 0x009d }
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ Throwable -> 0x009d }
            java.nio.charset.Charset r7 = kotlin.text.C48038d.f122880a     // Catch:{ Throwable -> 0x009d }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x009d }
            r2.<init>(r1, r7)     // Catch:{ Throwable -> 0x009d }
            java.io.Reader r2 = (java.io.Reader) r2     // Catch:{ Throwable -> 0x009d }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x009d }
            r1 = 8192(0x2000, float:1.14794E-41)
            r7.<init>(r2, r1)     // Catch:{ Throwable -> 0x009d }
            java.io.Closeable r7 = (java.io.Closeable) r7     // Catch:{ Throwable -> 0x009d }
            r1 = r7
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            java.io.Reader r1 = (java.io.Reader) r1     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            java.lang.String r1 = kotlin.p1884io.C47991m.m148954b(r1)     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            kotlin.p1884io.C47973b.m148917a(r7, r0)     // Catch:{ Throwable -> 0x009d }
            if (r1 == 0) goto L_0x009d
            com.google.gson.e r7 = new com.google.gson.e     // Catch:{ Exception -> 0x0085 }
            r7.<init>()     // Catch:{ Exception -> 0x0085 }
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo> r2 = com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.model.RNBundleInfo.class
            java.lang.Object r7 = r7.mo15974a(r1, r2)     // Catch:{ Exception -> 0x0085 }
            com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo r7 = (com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.model.RNBundleInfo) r7     // Catch:{ Exception -> 0x0085 }
            goto L_0x008c
        L_0x0085:
            r7 = move-exception
            com.ss.android.ugc.aweme.fe.b.e r1 = com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27873e.f73441a     // Catch:{ Throwable -> 0x009d }
            r1.mo71353a(r7)     // Catch:{ Throwable -> 0x009d }
            r7 = r0
        L_0x008c:
            if (r7 == 0) goto L_0x009d
            r0 = r7
            goto L_0x009d
        L_0x0090:
            r1 = move-exception
            r2 = r0
            goto L_0x0099
        L_0x0093:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x0099:
            kotlin.p1884io.C47973b.m148917a(r7, r2)     // Catch:{ Throwable -> 0x009d }
            throw r1     // Catch:{ Throwable -> 0x009d }
        L_0x009d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25913b.m85204b(com.bytedance.ies.geckoclient.model.d):com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m85205b(com.bytedance.ies.geckoclient.model.C10903d r8, java.lang.String r9) {
        /*
            java.lang.String r9 = "$this$getOfflineGeckoPath"
            kotlin.jvm.internal.C7573i.m23587b(r8, r9)
            java.io.File r9 = m85208d(r8)
            r0 = 0
            if (r9 == 0) goto L_0x0041
            boolean r1 = r9.exists()
            if (r1 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r9 = r0
        L_0x0014:
            if (r9 == 0) goto L_0x0041
            java.io.File[] r9 = r9.listFiles()
            if (r9 == 0) goto L_0x0041
            int r1 = r9.length
            r2 = 0
            r3 = 0
        L_0x001f:
            if (r3 >= r1) goto L_0x0039
            r4 = r9[r3]
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "name"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.String r6 = "gecko_activate_done"
            r7 = 2
            boolean r5 = kotlin.text.C7634n.m23723c(r5, r6, false)
            if (r5 == 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x0039:
            r4 = r0
        L_0x003a:
            if (r4 == 0) goto L_0x0041
            java.lang.String r9 = r4.getAbsolutePath()
            goto L_0x0042
        L_0x0041:
            r9 = r0
        L_0x0042:
            if (r9 == 0) goto L_0x0076
            java.io.File r1 = new java.io.File
            r1.<init>(r9)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r9 = r0
        L_0x0051:
            if (r9 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.app.g.c r0 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()
            java.lang.String r1 = "gecko_channel"
            java.lang.String r8 = r8.f29508c
            com.ss.android.ugc.aweme.app.g.c r8 = r0.mo16887a(r1, r8)
            java.lang.String r0 = "file_path"
            com.ss.android.ugc.aweme.app.g.c r8 = r8.mo16887a(r0, r9)
            org.json.JSONObject r8 = r8.mo16888b()
            java.lang.String r0 = "rn_get_offline_bundle"
            r1 = r9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            com.p280ss.android.ugc.aweme.app.C6877n.m21444a(r0, r1, r8)
            return r9
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25913b.m85205b(com.bytedance.ies.geckoclient.model.d, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m85201a(com.bytedance.ies.geckoclient.model.C10903d r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "$this$getOfflineBundlePath"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.io.File r0 = m85208d(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x0051
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x0051
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L_0x001f:
            if (r4 >= r2) goto L_0x0049
            r5 = r0[r4]
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "name"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            r7 = r10
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0038
            java.lang.String r7 = ".jsbundle"
            goto L_0x003e
        L_0x0038:
            if (r10 != 0) goto L_0x003d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x003d:
            r7 = r10
        L_0x003e:
            r8 = 2
            boolean r6 = kotlin.text.C7634n.m23723c(r6, r7, false)
            if (r6 == 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x0049:
            r5 = r1
        L_0x004a:
            if (r5 == 0) goto L_0x0051
            java.lang.String r10 = r5.getAbsolutePath()
            goto L_0x0052
        L_0x0051:
            r10 = r1
        L_0x0052:
            if (r10 == 0) goto L_0x0086
            java.io.File r0 = new java.io.File
            r0.<init>(r10)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r10 = r1
        L_0x0061:
            if (r10 == 0) goto L_0x0086
            com.ss.android.ugc.aweme.app.g.c r0 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()
            java.lang.String r1 = "gecko_channel"
            java.lang.String r9 = r9.f29508c
            com.ss.android.ugc.aweme.app.g.c r9 = r0.mo16887a(r1, r9)
            java.lang.String r0 = "file_path"
            com.ss.android.ugc.aweme.app.g.c r9 = r9.mo16887a(r0, r10)
            org.json.JSONObject r9 = r9.mo16888b()
            java.lang.String r0 = "rn_get_offline_bundle"
            r1 = r10
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            com.p280ss.android.ugc.aweme.app.C6877n.m21444a(r0, r1, r9)
            return r10
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25913b.m85201a(com.bytedance.ies.geckoclient.model.d, java.lang.String):java.lang.String");
    }
}
