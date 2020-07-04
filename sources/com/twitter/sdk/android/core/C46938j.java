package com.twitter.sdk.android.core;

import com.google.gson.p276a.C6593c;
import com.twitter.sdk.android.core.C46820a;

/* renamed from: com.twitter.sdk.android.core.j */
public class C46938j<T extends C46820a> {
    @C6593c(mo15949a = "auth_token")

    /* renamed from: a */
    public final T f120356a;
    @C6593c(mo15949a = "id")

    /* renamed from: b */
    public final long f120357b;

    public int hashCode() {
        int i;
        if (this.f120356a != null) {
            i = this.f120356a.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + ((int) (this.f120357b ^ (this.f120357b >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C46938j jVar = (C46938j) obj;
        if (this.f120357b != jVar.f120357b) {
            return false;
        }
        if (this.f120356a != null) {
            return this.f120356a.equals(jVar.f120356a);
        }
        if (jVar.f120356a == null) {
            return true;
        }
        return false;
    }

    public C46938j(T t, long j) {
        if (t != null) {
            this.f120356a = t;
            this.f120357b = j;
            return;
        }
        throw new IllegalArgumentException("AuthToken must not be null.");
    }
}
