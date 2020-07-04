package android.arch.paging;

import android.support.p029v7.util.C1143a;
import android.support.p029v7.util.C1143a.C1145a;
import android.support.p029v7.util.C1143a.C1146b;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.util.C1151b;

/* renamed from: android.arch.paging.j */
final class C0110j {

    /* renamed from: android.arch.paging.j$a */
    static class C0112a implements C1151b {

        /* renamed from: a */
        private final int f242a;

        /* renamed from: b */
        private final C1151b f243b;

        private C0112a(int i, C1151b bVar) {
            this.f242a = i;
            this.f243b = bVar;
        }

        /* renamed from: a */
        public final void mo253a(int i, int i2) {
            this.f243b.mo253a(i + this.f242a, i2);
        }

        /* renamed from: b */
        public final void mo255b(int i, int i2) {
            this.f243b.mo255b(i + this.f242a, i2);
        }

        /* renamed from: c */
        public final void mo256c(int i, int i2) {
            this.f243b.mo256c(i + this.f242a, i2 + this.f242a);
        }

        /* renamed from: a */
        public final void mo254a(int i, int i2, Object obj) {
            this.f243b.mo254a(i + this.f242a, i2, obj);
        }
    }

    /* renamed from: a */
    static <T> C1146b m280a(C0108i<T> iVar, C0108i<T> iVar2, C1147c<T> cVar) {
        final int c = iVar.mo241c();
        final int size = (iVar.size() - c) - iVar.mo242d();
        final int size2 = (iVar2.size() - iVar2.mo241c()) - iVar2.mo242d();
        final C0108i<T> iVar3 = iVar;
        final C0108i<T> iVar4 = iVar2;
        final C1147c<T> cVar2 = cVar;
        C01111 r0 = new C1145a() {
            /* renamed from: a */
            public final int mo248a() {
                return size;
            }

            /* renamed from: b */
            public final int mo250b() {
                return size2;
            }

            /* renamed from: a */
            public final Object mo249a(int i, int i2) {
                Object obj = iVar3.get(i + c);
                C0108i iVar = iVar4;
                Object obj2 = iVar.get(i2 + iVar.f228a);
                if (obj == null || obj2 == null) {
                    return null;
                }
                return cVar2.mo4551c(obj, obj2);
            }

            /* renamed from: b */
            public final boolean mo251b(int i, int i2) {
                Object obj = iVar3.get(i + c);
                C0108i iVar = iVar4;
                Object obj2 = iVar.get(i2 + iVar.f228a);
                if (obj == obj2) {
                    return true;
                }
                if (obj == null || obj2 == null) {
                    return false;
                }
                return cVar2.mo4549a(obj, obj2);
            }

            /* renamed from: c */
            public final boolean mo252c(int i, int i2) {
                Object obj = iVar3.get(i + c);
                C0108i iVar = iVar4;
                Object obj2 = iVar.get(i2 + iVar.f228a);
                if (obj == obj2) {
                    return true;
                }
                if (obj == null || obj2 == null) {
                    return false;
                }
                return cVar2.mo4550b(obj, obj2);
            }
        };
        return C1143a.m5067a(r0, true);
    }

    /* renamed from: a */
    static <T> void m281a(C1151b bVar, C0108i<T> iVar, C0108i<T> iVar2, C1146b bVar2) {
        int d = iVar.mo242d();
        int d2 = iVar2.mo242d();
        int c = iVar.mo241c();
        int c2 = iVar2.mo241c();
        if (d == 0 && d2 == 0 && c == 0 && c2 == 0) {
            bVar2.mo4547a(bVar);
            return;
        }
        if (d > d2) {
            int i = d - d2;
            bVar.mo255b(iVar.size() - i, i);
        } else if (d < d2) {
            bVar.mo253a(iVar.size(), d2 - d);
        }
        if (c > c2) {
            bVar.mo255b(0, c - c2);
        } else if (c < c2) {
            bVar.mo253a(0, c2 - c);
        }
        if (c2 != 0) {
            bVar2.mo4547a((C1151b) new C0112a(c2, bVar));
        } else {
            bVar2.mo4547a(bVar);
        }
    }
}
