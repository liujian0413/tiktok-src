package p1896pl.droidsonroids.relinker;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;

/* renamed from: pl.droidsonroids.relinker.e */
final class C48461e {
    /* renamed from: a */
    static void m150151a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.loadLibrary(str);
        C7110b.m22204a(uptimeMillis, str);
    }

    /* renamed from: b */
    static void m150152b(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        C7110b.m22204a(uptimeMillis, str);
    }
}
