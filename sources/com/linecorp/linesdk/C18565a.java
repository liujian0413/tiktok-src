package com.linecorp.linesdk;

import java.util.NoSuchElementException;

/* renamed from: com.linecorp.linesdk.a */
public final class C18565a<R> {

    /* renamed from: c */
    private static final C18565a<?> f50186c = new C18565a<>(LineApiResponseCode.SUCCESS, null, LineApiError.f50177a);

    /* renamed from: a */
    public final LineApiResponseCode f50187a;

    /* renamed from: b */
    public final LineApiError f50188b;

    /* renamed from: d */
    private final R f50189d;

    /* renamed from: b */
    public final R mo48724b() {
        if (this.f50189d != null) {
            return this.f50189d;
        }
        throw new NoSuchElementException("response data is null. Please check result by isSuccess before.");
    }

    /* renamed from: a */
    public final boolean mo48723a() {
        if (this.f50187a == LineApiResponseCode.SUCCESS) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f50187a.hashCode() * 31;
        if (this.f50189d != null) {
            i = this.f50189d.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.f50188b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineApiResponse{errorData=");
        sb.append(this.f50188b);
        sb.append(", responseCode=");
        sb.append(this.f50187a);
        sb.append(", responseData=");
        sb.append(this.f50189d);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> C18565a<T> m60979a(T t) {
        if (t == null) {
            return f50186c;
        }
        return new C18565a<>(LineApiResponseCode.SUCCESS, t, LineApiError.f50177a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18565a aVar = (C18565a) obj;
        if (this.f50187a != aVar.f50187a) {
            return false;
        }
        if (this.f50189d == null ? aVar.f50189d == null : this.f50189d.equals(aVar.f50189d)) {
            return this.f50188b.equals(aVar.f50188b);
        }
        return false;
    }

    /* renamed from: a */
    public static <T> C18565a<T> m60978a(LineApiResponseCode lineApiResponseCode, LineApiError lineApiError) {
        return new C18565a<>(lineApiResponseCode, null, lineApiError);
    }

    private C18565a(LineApiResponseCode lineApiResponseCode, R r, LineApiError lineApiError) {
        this.f50187a = lineApiResponseCode;
        this.f50189d = r;
        this.f50188b = lineApiError;
    }
}
