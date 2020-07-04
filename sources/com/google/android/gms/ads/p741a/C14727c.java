package com.google.android.gms.ads.p741a;

import android.os.Bundle;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.internal.ads.C15499ar;
import com.google.android.gms.internal.ads.C15509as;

/* renamed from: com.google.android.gms.ads.a.c */
public final class C14727c {

    /* renamed from: a */
    public final C15499ar f38068a;

    /* renamed from: com.google.android.gms.ads.a.c$a */
    public static final class C14728a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C15509as f38069a = new C15509as();

        /* renamed from: a */
        public final C14728a mo37389a(String str) {
            this.f38069a.mo39973a(str);
            return this;
        }

        /* renamed from: a */
        public final C14728a mo37388a(Class<? extends Object> cls, Bundle bundle) {
            this.f38069a.mo39972a(cls, bundle);
            return this;
        }

        /* renamed from: b */
        public final C14728a mo37392b(String str) {
            this.f38069a.mo39976b(str);
            return this;
        }

        /* renamed from: a */
        public final C14727c mo37391a() {
            return new C14727c(this);
        }

        /* renamed from: c */
        public final C14728a mo37393c(String str) {
            C15267r.m44385a(str, (Object) "Content URL must be non-null.");
            C15267r.m44387a(str, (Object) "Content URL must be non-empty.");
            C15267r.m44396b(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(512), Integer.valueOf(str.length()));
            this.f38069a.f40975b = str;
            return this;
        }

        /* renamed from: a */
        public final C14728a mo37387a(int i) {
            this.f38069a.f40976c = i;
            return this;
        }

        /* renamed from: a */
        public final C14728a mo37390a(String str, String str2) {
            this.f38069a.mo39974a(str, str2);
            return this;
        }
    }

    private C14727c(C14728a aVar) {
        this.f38068a = new C15499ar(aVar.f38069a);
    }
}
