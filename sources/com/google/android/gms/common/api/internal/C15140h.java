package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.h */
public final class C15140h<L> {

    /* renamed from: a */
    private volatile L f39187a;

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    public static final class C15141a<L> {

        /* renamed from: a */
        private final L f39188a;

        /* renamed from: b */
        private final String f39189b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15141a)) {
                return false;
            }
            C15141a aVar = (C15141a) obj;
            return this.f39188a == aVar.f39188a && this.f39189b.equals(aVar.f39189b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f39188a) * 31) + this.f39189b.hashCode();
        }
    }

    /* renamed from: a */
    public final void mo38430a() {
        this.f39187a = null;
    }
}
