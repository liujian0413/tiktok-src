package com.twitter.sdk.android.core.internal.scribe;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.v */
public class C46931v {
    @C6593c(mo15949a = "event_namespace")

    /* renamed from: a */
    final C46908e f120348a;
    @C6593c(mo15949a = "ts")

    /* renamed from: b */
    final String f120349b;
    @C6593c(mo15949a = "format_version")

    /* renamed from: c */
    final String f120350c = "2";
    @C6593c(mo15949a = "_category_")

    /* renamed from: d */
    final String f120351d;
    @C6593c(mo15949a = "items")

    /* renamed from: e */
    final List<ScribeItem> f120352e;

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.v$a */
    public static class C46932a implements C46910f<C46931v> {

        /* renamed from: a */
        private final C6600e f120353a;

        public C46932a(C6600e eVar) {
            this.f120353a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public byte[] mo118041a(C46931v vVar) throws IOException {
            return this.f120353a.mo15979b((Object) vVar).getBytes("UTF-8");
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.f120348a != null) {
            i = this.f120348a.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        if (this.f120349b != null) {
            i2 = this.f120349b.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f120350c != null) {
            i3 = this.f120350c.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f120351d != null) {
            i4 = this.f120351d.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f120352e != null) {
            i5 = this.f120352e.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("event_namespace=");
        sb.append(this.f120348a);
        sb.append(", ts=");
        sb.append(this.f120349b);
        sb.append(", format_version=");
        sb.append(this.f120350c);
        sb.append(", _category_=");
        sb.append(this.f120351d);
        sb.append(", items=");
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(TextUtils.join(", ", this.f120352e));
        sb2.append("]");
        sb.append(sb2.toString());
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C46931v vVar = (C46931v) obj;
        if (this.f120351d == null ? vVar.f120351d != null : !this.f120351d.equals(vVar.f120351d)) {
            return false;
        }
        if (this.f120348a == null ? vVar.f120348a != null : !this.f120348a.equals(vVar.f120348a)) {
            return false;
        }
        if (this.f120350c == null ? vVar.f120350c != null : !this.f120350c.equals(vVar.f120350c)) {
            return false;
        }
        if (this.f120349b == null ? vVar.f120349b != null : !this.f120349b.equals(vVar.f120349b)) {
            return false;
        }
        if (this.f120352e == null ? vVar.f120352e == null : this.f120352e.equals(vVar.f120352e)) {
            return true;
        }
        return false;
    }

    public C46931v(String str, C46908e eVar, long j, List<ScribeItem> list) {
        this.f120351d = str;
        this.f120348a = eVar;
        this.f120349b = String.valueOf(j);
        this.f120352e = Collections.unmodifiableList(list);
    }
}
