package com.p280ss.android.ugc.gamora.bottomtab;

/* renamed from: com.ss.android.ugc.gamora.bottomtab.f */
public interface C43870f {

    /* renamed from: com.ss.android.ugc.gamora.bottomtab.f$a */
    public static final class C43871a {

        /* renamed from: a */
        public final boolean f113664a;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C43871a) {
                    if (this.f113664a == ((C43871a) obj).f113664a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f113664a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExtraInfo(isInitial=");
            sb.append(this.f113664a);
            sb.append(")");
            return sb.toString();
        }

        public C43871a(boolean z) {
            this.f113664a = z;
        }
    }

    /* renamed from: a */
    boolean mo94782a(C43866b bVar, C43871a aVar);

    /* renamed from: b */
    boolean mo94783b(C43866b bVar, C43871a aVar);
}
