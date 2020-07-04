package com.p280ss.android.message.push.connection.p887a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.ss.android.message.push.connection.a.g */
final class C19881g {
    /* renamed from: a */
    static ExecutorService m65652a(ThreadFactory threadFactory) {
        return C7258h.m22730c();
    }

    /* renamed from: a */
    static boolean m65653a(Context context) {
        try {
            return C6900g.m21454b().mo16943d();
        } catch (Exception unused) {
            return false;
        }
    }
}
