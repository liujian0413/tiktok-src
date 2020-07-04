package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15021d;
import com.google.android.gms.common.internal.C15265q;

/* renamed from: com.google.android.gms.common.api.internal.cd */
public final class C15110cd<O extends C15021d> {

    /* renamed from: a */
    private final boolean f39065a;

    /* renamed from: b */
    private final int f39066b;

    /* renamed from: c */
    private final C15017a<O> f39067c;

    /* renamed from: d */
    private final O f39068d;

    private C15110cd(C15017a<O> aVar, O o) {
        this.f39067c = aVar;
        this.f39068d = o;
        this.f39066b = C15265q.m44379a(this.f39067c, this.f39068d);
    }

    private C15110cd(C15017a<O> aVar) {
        this.f39065a = true;
        this.f39067c = aVar;
        this.f39066b = System.identityHashCode(this);
    }

    /* renamed from: a */
    public static <O extends C15021d> C15110cd<O> m43846a(C15017a<O> aVar, O o) {
        return new C15110cd<>(aVar, o);
    }

    /* renamed from: a */
    public static <O extends C15021d> C15110cd<O> m43845a(C15017a<O> aVar) {
        return new C15110cd<>(aVar);
    }

    /* renamed from: a */
    public final String mo38366a() {
        return this.f39067c.f38879b;
    }

    public final int hashCode() {
        return this.f39066b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15110cd)) {
            return false;
        }
        C15110cd cdVar = (C15110cd) obj;
        return !this.f39065a && !cdVar.f39065a && C15265q.m44381a(this.f39067c, cdVar.f39067c) && C15265q.m44381a(this.f39068d, cdVar.f39068d);
    }
}
