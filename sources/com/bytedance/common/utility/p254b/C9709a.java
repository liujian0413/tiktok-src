package com.bytedance.common.utility.p254b;

import android.os.AsyncTask;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.common.utility.b.a */
public final class C9709a {

    /* renamed from: a */
    static final C9711a f26434a;

    /* renamed from: com.bytedance.common.utility.b.a$a */
    static class C9711a {
        private C9711a() {
        }

        /* renamed from: a */
        public <T> void mo24062a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.execute(tArr);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.bytedance.common.utility.b.a$b */
    static class C9712b extends C9711a {
        private C9712b() {
            super();
        }

        /* renamed from: a */
        public final <T> void mo24062a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.executeOnExecutor(C9714c.m28650a(), tArr);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f26434a = new C9712b();
        } else {
            f26434a = new C9711a();
        }
    }

    /* renamed from: a */
    public static <T> void m28647a(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
        f26434a.mo24062a(asyncTask, tArr);
    }
}
