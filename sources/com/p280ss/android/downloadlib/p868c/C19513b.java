package com.p280ss.android.downloadlib.p868c;

import android.os.AsyncTask;
import com.p280ss.android.downloadlib.C19507c;

/* renamed from: com.ss.android.downloadlib.c.b */
public final class C19513b {

    /* renamed from: a */
    static final C19515a f52809a = new C19516b();

    /* renamed from: com.ss.android.downloadlib.c.b$a */
    static class C19515a {
        private C19515a() {
        }

        /* renamed from: a */
        public <T> void mo51641a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.execute(tArr);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.ss.android.downloadlib.c.b$b */
    static class C19516b extends C19515a {
        private C19516b() {
            super();
        }

        /* renamed from: a */
        public final <T> void mo51641a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.executeOnExecutor(C19507c.m64274a().f52806a, tArr);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static <T> void m64281a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
        f52809a.mo51641a(asyncTask, tArr);
    }
}
