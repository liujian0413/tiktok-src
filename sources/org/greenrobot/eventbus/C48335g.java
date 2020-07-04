package org.greenrobot.eventbus;

import android.os.Looper;

/* renamed from: org.greenrobot.eventbus.g */
public interface C48335g {

    /* renamed from: org.greenrobot.eventbus.g$a */
    public static class C48336a implements C48335g {

        /* renamed from: a */
        private final Looper f123410a;

        /* renamed from: a */
        public final boolean mo121776a() {
            if (this.f123410a == Looper.myLooper()) {
                return true;
            }
            return false;
        }

        public C48336a(Looper looper) {
            this.f123410a = looper;
        }

        /* renamed from: a */
        public final C48340k mo121775a(C7705c cVar) {
            return new C48331e(cVar, this.f123410a, 10);
        }
    }

    /* renamed from: a */
    C48340k mo121775a(C7705c cVar);

    /* renamed from: a */
    boolean mo121776a();
}
