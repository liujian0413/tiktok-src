package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.work.d */
public final class C1456d {

    /* renamed from: a */
    public final Set<C1457a> f5669a = new HashSet();

    /* renamed from: androidx.work.d$a */
    public static final class C1457a {

        /* renamed from: a */
        public final Uri f5670a;

        /* renamed from: b */
        public final boolean f5671b;

        public final int hashCode() {
            return (this.f5670a.hashCode() * 31) + (this.f5671b ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1457a aVar = (C1457a) obj;
            if (this.f5671b != aVar.f5671b || !this.f5670a.equals(aVar.f5670a)) {
                return false;
            }
            return true;
        }

        C1457a(Uri uri, boolean z) {
            this.f5670a = uri;
            this.f5671b = z;
        }
    }

    /* renamed from: a */
    public final int mo6685a() {
        return this.f5669a.size();
    }

    public final int hashCode() {
        return this.f5669a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5669a.equals(((C1456d) obj).f5669a);
    }

    /* renamed from: a */
    public final void mo6686a(Uri uri, boolean z) {
        this.f5669a.add(new C1457a(uri, z));
    }
}
