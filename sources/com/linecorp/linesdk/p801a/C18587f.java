package com.linecorp.linesdk.p801a;

import java.util.Collections;
import java.util.List;

/* renamed from: com.linecorp.linesdk.a.f */
public final class C18587f {

    /* renamed from: a */
    public final C18586e f50225a;

    /* renamed from: b */
    public final List<String> f50226b;

    public final int hashCode() {
        return (this.f50225a.hashCode() * 31) + this.f50226b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IssueAccessTokenResult{accessToken=");
        sb.append("#####");
        sb.append(", permissions=");
        sb.append(this.f50226b);
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
        C18587f fVar = (C18587f) obj;
        if (!this.f50225a.equals(fVar.f50225a)) {
            return false;
        }
        return this.f50226b.equals(fVar.f50226b);
    }

    public C18587f(C18586e eVar, List<String> list) {
        this.f50225a = eVar;
        this.f50226b = Collections.unmodifiableList(list);
    }
}
