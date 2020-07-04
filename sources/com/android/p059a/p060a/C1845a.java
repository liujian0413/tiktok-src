package com.android.p059a.p060a;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.android.a.a.a */
public abstract class C1845a {

    /* renamed from: com.android.a.a.a$a */
    public static final class C1847a {

        /* renamed from: a */
        private final Context f6650a;

        /* renamed from: a */
        public final C1845a mo7357a() {
            if (this.f6650a != null) {
                return new C1848b(this.f6650a);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        private C1847a(Context context) {
            this.f6650a = context;
        }
    }

    /* renamed from: a */
    public abstract void mo7353a(C1851c cVar);

    /* renamed from: a */
    public abstract boolean mo7354a();

    /* renamed from: b */
    public abstract void mo7355b();

    /* renamed from: c */
    public abstract C1852d mo7356c() throws RemoteException;

    /* renamed from: a */
    public static C1847a m8609a(Context context) {
        return new C1847a(context);
    }
}
