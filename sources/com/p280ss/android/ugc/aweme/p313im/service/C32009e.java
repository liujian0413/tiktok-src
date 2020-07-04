package com.p280ss.android.ugc.aweme.p313im.service;

import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.service.e */
public interface C32009e {

    /* renamed from: com.ss.android.ugc.aweme.im.service.e$a */
    public interface C32010a {
        /* renamed from: a */
        void mo67696a(C32012c cVar);

        /* renamed from: b */
        void mo67697b(C32012c cVar);

        /* renamed from: c */
        void mo67698c(C32012c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.e$b */
    public static final class C32011b {

        /* renamed from: a */
        public final String f83727a;

        /* renamed from: b */
        public final long f83728b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C32011b) {
                    C32011b bVar = (C32011b) obj;
                    if (C7573i.m23585a((Object) this.f83727a, (Object) bVar.f83727a)) {
                        if (this.f83728b == bVar.f83728b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f83727a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            long j = this.f83728b;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IMAweme(aid=");
            sb.append(this.f83727a);
            sb.append(", index=");
            sb.append(this.f83728b);
            sb.append(")");
            return sb.toString();
        }

        public C32011b(String str, long j) {
            C7573i.m23587b(str, "aid");
            this.f83727a = str;
            this.f83728b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.e$c */
    public static final class C32012c {

        /* renamed from: a */
        public final List<C32011b> f83729a;

        /* renamed from: b */
        public final boolean f83730b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C32012c) {
                    C32012c cVar = (C32012c) obj;
                    if (C7573i.m23585a((Object) this.f83729a, (Object) cVar.f83729a)) {
                        if (this.f83730b == cVar.f83730b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            List<C32011b> list = this.f83729a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            boolean z = this.f83730b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IMResponse(data=");
            sb.append(this.f83729a);
            sb.append(", hasMore=");
            sb.append(this.f83730b);
            sb.append(")");
            return sb.toString();
        }

        public C32012c(List<C32011b> list, boolean z) {
            C7573i.m23587b(list, "data");
            this.f83729a = list;
            this.f83730b = z;
        }
    }

    /* renamed from: a */
    void mo80540a();

    /* renamed from: a */
    void mo80541a(long j);

    /* renamed from: a */
    void mo80542a(C32010a aVar);

    /* renamed from: a */
    void mo80543a(String str);

    /* renamed from: b */
    void mo80544b();

    /* renamed from: b */
    void mo80545b(long j);
}
