package com.linecorp.linesdk.p801a;

import android.content.Context;
import com.linecorp.p798a.p799a.p800a.C18559b;

/* renamed from: com.linecorp.linesdk.a.c */
public final class C18583c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C18559b f50218a = new C18559b("com.linecorp.linesdk.sharedpreference.encryptionsalt");

    /* renamed from: b */
    private static volatile boolean f50219b = false;

    /* renamed from: com.linecorp.linesdk.a.c$a */
    static class C18584a implements Runnable {

        /* renamed from: a */
        private final Context f50220a;

        public final void run() {
            C18583c.f50218a.mo48694a(this.f50220a);
        }

        C18584a(Context context) {
            this.f50220a = context;
        }
    }

    /* renamed from: a */
    public static C18559b m61009a() {
        return f50218a;
    }

    /* renamed from: a */
    public static void m61010a(Context context) {
        if (!f50219b) {
            f50219b = true;
            C18585d.m61012a().execute(new C18584a(context.getApplicationContext()));
        }
    }
}
