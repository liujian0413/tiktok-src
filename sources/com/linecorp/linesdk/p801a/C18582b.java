package com.linecorp.linesdk.p801a;

import java.util.Collections;
import java.util.List;

/* renamed from: com.linecorp.linesdk.a.b */
public final class C18582b {

    /* renamed from: a */
    public final long f50215a;

    /* renamed from: b */
    public final List<String> f50216b;

    /* renamed from: c */
    private final String f50217c;

    public final int hashCode() {
        return (((Integer.valueOf(this.f50217c).intValue() * 31) + ((int) (this.f50215a ^ (this.f50215a >>> 32)))) * 31) + this.f50216b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessTokenVerificationResult{expiresInMillis=");
        sb.append(this.f50215a);
        sb.append(", channelId=");
        sb.append(this.f50217c);
        sb.append(", permissions=");
        sb.append(this.f50216b);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18582b bVar = (C18582b) obj;
        if (this.f50217c.equals(bVar.f50217c) && this.f50215a == bVar.f50215a) {
            return this.f50216b.equals(bVar.f50216b);
        }
        return false;
    }

    public C18582b(String str, long j, List<String> list) {
        this.f50217c = str;
        this.f50215a = j;
        this.f50216b = Collections.unmodifiableList(list);
    }
}
