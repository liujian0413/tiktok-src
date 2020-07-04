package com.facebook.datasource;

import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13310j;
import com.facebook.common.p685b.C13275a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.datasource.g */
public final class C13354g<T> implements C13310j<C13346c<T>> {

    /* renamed from: a */
    public final List<C13310j<C13346c<T>>> f35281a;

    /* renamed from: b */
    public final boolean f35282b;

    /* renamed from: com.facebook.datasource.g$a */
    class C13355a extends C13341a<T> {

        /* renamed from: b */
        private ArrayList<C13346c<T>> f35284b;

        /* renamed from: c */
        private int f35285c;

        /* renamed from: d */
        private int f35286d;

        /* renamed from: e */
        private AtomicInteger f35287e;

        /* renamed from: f */
        private Throwable f35288f;

        /* renamed from: com.facebook.datasource.g$a$a */
        class C13356a implements C13349e<T> {

            /* renamed from: b */
            private int f35290b;

            public final void onCancellation(C13346c<T> cVar) {
            }

            public final void onFailure(C13346c<T> cVar) {
                C13355a.this.mo32657b(this.f35290b, cVar);
            }

            public final void onProgressUpdate(C13346c<T> cVar) {
                if (this.f35290b == 0) {
                    C13355a.this.mo32636a(cVar.mo32643f());
                }
            }

            public final void onNewResult(C13346c<T> cVar) {
                if (cVar.mo32640c()) {
                    C13355a.this.mo32656a(this.f35290b, cVar);
                    return;
                }
                if (cVar.mo32639b()) {
                    C13355a.this.mo32657b(this.f35290b, cVar);
                }
            }

            public C13356a(int i) {
                this.f35290b = i;
            }
        }

        /* renamed from: i */
        private synchronized C13346c<T> m39104i() {
            return m39098a(this.f35285c);
        }

        /* renamed from: j */
        private void m39105j() {
            if (this.f35287e.incrementAndGet() == this.f35286d && this.f35288f != null) {
                mo32638a(this.f35288f);
            }
        }

        /* renamed from: d */
        public final synchronized T mo32641d() {
            if (C13354g.this.f35282b) {
                m39103h();
            }
            C13346c i = m39104i();
            if (i == null) {
                return null;
            }
            return i.mo32641d();
        }

        /* renamed from: c */
        public final synchronized boolean mo32640c() {
            boolean z;
            if (C13354g.this.f35282b) {
                m39103h();
            }
            C13346c i = m39104i();
            if (i == null || !i.mo32640c()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            if (r0 == null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            if (r1 >= r0.size()) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            m39100a((com.facebook.datasource.C13346c) r0.get(r1));
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
            return true;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo32644g() {
            /*
                r3 = this;
                com.facebook.datasource.g r0 = com.facebook.datasource.C13354g.this
                boolean r0 = r0.f35282b
                if (r0 == 0) goto L_0x0009
                r3.m39103h()
            L_0x0009:
                monitor-enter(r3)
                boolean r0 = super.mo32644g()     // Catch:{ all -> 0x002f }
                r1 = 0
                if (r0 != 0) goto L_0x0013
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                return r1
            L_0x0013:
                java.util.ArrayList<com.facebook.datasource.c<T>> r0 = r3.f35284b     // Catch:{ all -> 0x002f }
                r2 = 0
                r3.f35284b = r2     // Catch:{ all -> 0x002f }
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x002d
            L_0x001b:
                int r2 = r0.size()
                if (r1 >= r2) goto L_0x002d
                java.lang.Object r2 = r0.get(r1)
                com.facebook.datasource.c r2 = (com.facebook.datasource.C13346c) r2
                m39100a(r2)
                int r1 = r1 + 1
                goto L_0x001b
            L_0x002d:
                r0 = 1
                return r0
            L_0x002f:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C13354g.C13355a.mo32644g():boolean");
        }

        /* renamed from: h */
        private void m39103h() {
            if (this.f35287e == null) {
                synchronized (this) {
                    if (this.f35287e == null) {
                        this.f35287e = new AtomicInteger(0);
                        int size = C13354g.this.f35281a.size();
                        this.f35286d = size;
                        this.f35285c = size;
                        this.f35284b = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            C13346c cVar = (C13346c) ((C13310j) C13354g.this.f35281a.get(i)).mo29879b();
                            this.f35284b.add(cVar);
                            cVar.mo32633a(new C13356a(i), C13275a.m38815a());
                            if (cVar.mo32640c()) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private static void m39100a(C13346c<T> cVar) {
            if (cVar != null) {
                cVar.mo32644g();
            }
        }

        public C13355a() {
            if (!C13354g.this.f35282b) {
                m39103h();
            }
        }

        /* renamed from: a */
        private synchronized C13346c<T> m39098a(int i) {
            if (this.f35284b == null || i >= this.f35284b.size()) {
                return null;
            }
            return (C13346c) this.f35284b.get(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            return null;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized com.facebook.datasource.C13346c<T> m39101b(int r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.util.ArrayList<com.facebook.datasource.c<T>> r0 = r2.f35284b     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x0018
                java.util.ArrayList<com.facebook.datasource.c<T>> r0 = r2.f35284b     // Catch:{ all -> 0x001a }
                int r0 = r0.size()     // Catch:{ all -> 0x001a }
                if (r3 >= r0) goto L_0x0018
                java.util.ArrayList<com.facebook.datasource.c<T>> r0 = r2.f35284b     // Catch:{ all -> 0x001a }
                java.lang.Object r3 = r0.set(r3, r1)     // Catch:{ all -> 0x001a }
                com.facebook.datasource.c r3 = (com.facebook.datasource.C13346c) r3     // Catch:{ all -> 0x001a }
                monitor-exit(r2)
                return r3
            L_0x0018:
                monitor-exit(r2)
                return r1
            L_0x001a:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C13354g.C13355a.m39101b(int):com.facebook.datasource.c");
        }

        /* renamed from: c */
        private synchronized C13346c<T> m39102c(int i, C13346c<T> cVar) {
            if (cVar == m39104i()) {
                return null;
            }
            if (cVar != m39098a(i)) {
                return cVar;
            }
            return m39101b(i);
        }

        /* renamed from: b */
        public final void mo32657b(int i, C13346c<T> cVar) {
            m39100a(m39102c(i, cVar));
            if (i == 0) {
                this.f35288f = cVar.mo32642e();
            }
            m39105j();
        }

        /* renamed from: a */
        public final void mo32656a(int i, C13346c<T> cVar) {
            boolean z;
            m39099a(i, cVar, cVar.mo32639b());
            if (cVar == m39104i()) {
                if (i != 0 || !cVar.mo32639b()) {
                    z = false;
                } else {
                    z = true;
                }
                mo32637a(null, z);
            }
            m39105j();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
            if (r0 <= r4) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
            m39100a(m39101b(r0));
            r0 = r0 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m39099a(int r4, com.facebook.datasource.C13346c<T> r5, boolean r6) {
            /*
                r3 = this;
                monitor-enter(r3)
                int r0 = r3.f35285c     // Catch:{ all -> 0x0031 }
                int r1 = r3.f35285c     // Catch:{ all -> 0x0031 }
                com.facebook.datasource.c r2 = r3.m39098a(r4)     // Catch:{ all -> 0x0031 }
                if (r5 != r2) goto L_0x002f
                int r5 = r3.f35285c     // Catch:{ all -> 0x0031 }
                if (r4 != r5) goto L_0x0010
                goto L_0x002f
            L_0x0010:
                com.facebook.datasource.c r5 = r3.m39104i()     // Catch:{ all -> 0x0031 }
                if (r5 == 0) goto L_0x001f
                if (r6 == 0) goto L_0x001d
                int r5 = r3.f35285c     // Catch:{ all -> 0x0031 }
                if (r4 >= r5) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r4 = r1
                goto L_0x0021
            L_0x001f:
                r3.f35285c = r4     // Catch:{ all -> 0x0031 }
            L_0x0021:
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            L_0x0022:
                if (r0 <= r4) goto L_0x002e
                com.facebook.datasource.c r5 = r3.m39101b(r0)
                m39100a(r5)
                int r0 = r0 + -1
                goto L_0x0022
            L_0x002e:
                return
            L_0x002f:
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                return
            L_0x0031:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C13354g.C13355a.m39099a(int, com.facebook.datasource.c, boolean):void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C13346c<T> mo29879b() {
        return new C13355a();
    }

    public final int hashCode() {
        return this.f35281a.hashCode();
    }

    public final String toString() {
        return C13303f.m38930a((Object) this).mo32569a("list", (Object) this.f35281a).toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13354g)) {
            return false;
        }
        return C13303f.m38932a(this.f35281a, ((C13354g) obj).f35281a);
    }

    /* renamed from: a */
    public static <T> C13354g<T> m39096a(List<C13310j<C13346c<T>>> list, boolean z) {
        return new C13354g<>(list, false);
    }

    private C13354g(List<C13310j<C13346c<T>>> list, boolean z) {
        C13307g.m38944a(!list.isEmpty(), (Object) "List of suppliers is empty!");
        this.f35281a = list;
        this.f35282b = z;
    }
}
