package com.google.android.play.core.splitinstall;

import com.C1642a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.play.core.splitinstall.e */
public final class C17135e {

    /* renamed from: a */
    public final List<String> f47857a;

    /* renamed from: b */
    public final List<Locale> f47858b;

    /* renamed from: com.google.android.play.core.splitinstall.e$a */
    public static class C17136a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<String> f47859a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<Locale> f47860b;

        private C17136a() {
            this.f47859a = new ArrayList();
            this.f47860b = new ArrayList();
        }

        /* synthetic */ C17136a(byte b) {
            this();
        }

        /* renamed from: a */
        public final C17136a mo44410a(String str) {
            this.f47859a.add(str);
            return this;
        }

        /* renamed from: a */
        public final C17136a mo44411a(Locale locale) {
            this.f47860b.add(locale);
            return this;
        }

        /* renamed from: a */
        public final C17135e mo44412a() {
            return new C17135e(this, 0);
        }
    }

    private C17135e(C17136a aVar) {
        this.f47857a = new ArrayList(aVar.f47859a);
        this.f47858b = new ArrayList(aVar.f47860b);
    }

    /* synthetic */ C17135e(C17136a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public static C17136a m56792a() {
        return new C17136a(0);
    }

    public final String toString() {
        return C1642a.m8034a("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.f47857a, this.f47858b});
    }
}
