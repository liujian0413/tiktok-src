package com.p280ss.android.push.daemon;

import android.os.Build.VERSION;
import com.p280ss.android.push.daemon.p898a.C20009a;
import com.p280ss.android.push.daemon.p898a.C20011b;
import com.p280ss.android.push.daemon.p898a.C20012c;

/* renamed from: com.ss.android.push.daemon.f */
public interface C20017f {

    /* renamed from: com.ss.android.push.daemon.f$a */
    public static class C20018a {

        /* renamed from: a */
        private static C20017f f54161a;

        /* renamed from: a */
        static C20017f m65949a() {
            if (f54161a != null) {
                return f54161a;
            }
            int i = VERSION.SDK_INT;
            if (i >= 26) {
                f54161a = new C20009a();
            } else if (i >= 23) {
                f54161a = new C20012c();
            } else {
                f54161a = new C20011b();
            }
            return f54161a;
        }
    }

    /* renamed from: a */
    void mo53591a();
}
