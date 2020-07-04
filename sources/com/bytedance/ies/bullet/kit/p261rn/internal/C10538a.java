package com.bytedance.ies.bullet.kit.p261rn.internal;

import android.text.TextUtils;
import com.bytedance.ies.bullet.core.common.C10349c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1884io.C47973b;
import kotlin.p1884io.C47991m;
import kotlin.text.C48038d;

/* renamed from: com.bytedance.ies.bullet.kit.rn.internal.a */
public final class C10538a {

    /* renamed from: a */
    public static final C10538a f28261a = new C10538a();

    /* renamed from: com.bytedance.ies.bullet.kit.rn.internal.a$a */
    static final class C10539a extends Lambda implements C7562b<File, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f28262a;

        C10539a(String str) {
            this.f28262a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m30912a((File) obj));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
            if (r0 == null) goto L_0x0027;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m30912a(java.io.File r5) {
            /*
                r4 = this;
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r5, r0)
                java.lang.String r5 = r5.getName()
                java.lang.String r0 = "name"
                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                java.lang.String r0 = r4.f28262a
                r1 = 0
                r2 = 0
                if (r0 == 0) goto L_0x0027
                java.lang.String r3 = r4.f28262a
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0020
                r3 = 1
                goto L_0x0021
            L_0x0020:
                r3 = 0
            L_0x0021:
                if (r3 != 0) goto L_0x0024
                goto L_0x0025
            L_0x0024:
                r0 = r1
            L_0x0025:
                if (r0 != 0) goto L_0x0029
            L_0x0027:
                java.lang.String r0 = ".jsbundle"
            L_0x0029:
                r3 = 2
                boolean r5 = kotlin.text.C7634n.m23723c(r5, r0, false)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p261rn.internal.C10538a.C10539a.m30912a(java.io.File):boolean");
        }
    }

    private C10538a() {
    }

    /* renamed from: a */
    public static C10541c m30909a(File file) {
        String str;
        boolean z;
        Closeable bufferedReader;
        Throwable th;
        Throwable th2;
        if (file != null) {
            try {
                str = file.getName();
            } catch (Throwable unused) {
                return null;
            }
        } else {
            str = null;
        }
        if (!TextUtils.equals("bundle_info.json", str) || !new File(str).exists()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str), C48038d.f122880a), VideoCacheReadBuffersizeExperiment.DEFAULT);
        try {
            String b = C47991m.m148954b((BufferedReader) bufferedReader);
            C47973b.m148917a(bufferedReader, null);
            if (b != null) {
                return C10541c.f28267d.mo25327a(b);
            }
            return null;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            th = r1;
            th2 = th4;
        }
        C47973b.m148917a(bufferedReader, th);
        throw th2;
    }

    /* renamed from: a */
    public static String m30911a(File file, String str) {
        C7573i.m23587b(file, "dir");
        File a = C10349c.m30637a(file, new C10539a(str));
        if (a != null) {
            if (!a.exists()) {
                a = null;
            }
            if (a != null) {
                return a.getPath();
            }
        }
        return null;
    }
}
