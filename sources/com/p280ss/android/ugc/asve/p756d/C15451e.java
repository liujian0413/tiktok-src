package com.p280ss.android.ugc.asve.p756d;

import android.content.Context;
import android.os.Process;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import kotlin.C47965i;
import kotlin.Result;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47973b;
import kotlin.p1884io.C47991m;
import kotlin.sequences.C7605h;
import kotlin.text.C48038d;

/* renamed from: com.ss.android.ugc.asve.d.e */
public final class C15451e {
    /* renamed from: a */
    public static final String m45251a(Context context) {
        boolean z;
        C7573i.m23587b(context, "$this$getCurrentProcessName");
        int myPid = Process.myPid();
        CharSequence a = m45252a(context, myPid);
        if (a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a = m45253b(context, myPid);
        }
        return (String) a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r2 == null) goto L_0x003b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m45253b(android.content.Context r2, int r3) {
        /*
            java.lang.String r0 = "$this$getProcessNameFromSystemService"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            java.lang.String r0 = "activity"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch:{ Throwable -> 0x004a }
            if (r2 == 0) goto L_0x0042
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch:{ Throwable -> 0x004a }
            java.util.List r2 = r2.getRunningAppProcesses()     // Catch:{ Throwable -> 0x004a }
            if (r2 == 0) goto L_0x003b
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Throwable -> 0x004a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x004a }
        L_0x001b:
            boolean r0 = r2.hasNext()     // Catch:{ Throwable -> 0x004a }
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r2.next()     // Catch:{ Throwable -> 0x004a }
            r1 = r0
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch:{ Throwable -> 0x004a }
            int r1 = r1.pid     // Catch:{ Throwable -> 0x004a }
            if (r1 != r3) goto L_0x002e
            r1 = 1
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            if (r1 == 0) goto L_0x001b
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch:{ Throwable -> 0x004a }
            if (r0 == 0) goto L_0x003b
            java.lang.String r2 = r0.processName     // Catch:{ Throwable -> 0x004a }
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            java.lang.String r2 = ""
        L_0x003d:
            java.lang.Object r2 = kotlin.Result.m150902constructorimpl(r2)     // Catch:{ Throwable -> 0x004a }
            goto L_0x0053
        L_0x0042:
            kotlin.TypeCastException r2 = new kotlin.TypeCastException     // Catch:{ Throwable -> 0x004a }
            java.lang.String r3 = "null cannot be cast to non-null type android.app.ActivityManager"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x004a }
            throw r2     // Catch:{ Throwable -> 0x004a }
        L_0x004a:
            r2 = move-exception
            java.lang.Object r2 = kotlin.C47965i.m148906a(r2)
            java.lang.Object r2 = kotlin.Result.m150902constructorimpl(r2)
        L_0x0053:
            java.lang.String r3 = ""
            boolean r0 = kotlin.Result.m150908isFailureimpl(r2)
            if (r0 == 0) goto L_0x005c
            r2 = r3
        L_0x005c:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.p756d.C15451e.m45253b(android.content.Context, int):java.lang.String");
    }

    /* renamed from: a */
    private static String m45252a(Context context, int i) {
        Object obj;
        Closeable bufferedReader;
        int i2;
        boolean z;
        C7573i.m23587b(context, "$this$getProcessNameFromSystemFile");
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            File file = new File(sb.toString());
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), C48038d.f122885f), VideoCacheReadBuffersizeExperiment.DEFAULT);
            CharSequence charSequence = (String) C7605h.m23656c(C47991m.m148952a((BufferedReader) bufferedReader));
            int length = charSequence.length() - 1;
            int i3 = 0;
            boolean z2 = false;
            while (i3 <= length) {
                if (!z2) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (charSequence.charAt(i2) <= ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z) {
                        break;
                    }
                    length--;
                } else if (!z) {
                    z2 = true;
                } else {
                    i3++;
                }
            }
            String obj2 = charSequence.subSequence(i3, length + 1).toString();
            C47973b.m148917a(bufferedReader, null);
            obj = Result.m150902constructorimpl(obj2);
        } catch (Throwable th) {
            obj = Result.m150902constructorimpl(C47965i.m148906a(th));
        }
        String str = "";
        if (Result.m150908isFailureimpl(obj)) {
            obj = str;
        }
        return (String) obj;
    }
}
