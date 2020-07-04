package com.facebook.imagepipeline.p724k;

import android.util.Pair;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13309i;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.k.ag$a.a;
import com.facebook.imagepipeline.p725l.C13783b;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.imagepipeline.k.ag */
public abstract class C13676ag<K, T extends Closeable> implements C13699am<T> {

    /* renamed from: a */
    final Map<K, C13678a> f36315a = new HashMap();

    /* renamed from: b */
    public final C13699am<T> f36316b;

    /* renamed from: com.facebook.imagepipeline.k.ag$a */
    class C13678a {

        /* renamed from: a */
        public final CopyOnWriteArraySet<Pair<C13748k<T>, C13700an>> f36317a = C13309i.m38952b();

        /* renamed from: b */
        public C13737d f36318b;

        /* renamed from: d */
        private final K f36320d;

        /* renamed from: e */
        private T f36321e;

        /* renamed from: f */
        private float f36322f;

        /* renamed from: g */
        private int f36323g;

        /* renamed from: h */
        private a f36324h;

        /* renamed from: com.facebook.imagepipeline.k.ag$a$a */
        class C13680a extends C13728b<T> {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo33254a() {
                try {
                    if (C13783b.m40665b()) {
                        C13783b.m40664a("MultiplexProducer#onCancellation");
                    }
                    C13678a.this.mo33311a((a) this);
                } finally {
                    if (C13783b.m40665b()) {
                        C13783b.m40663a();
                    }
                }
            }

            private C13680a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo33255a(float f) {
                try {
                    if (C13783b.m40665b()) {
                        C13783b.m40664a("MultiplexProducer#onProgressUpdate");
                    }
                    C13678a.this.mo33312a((a) this, f);
                } finally {
                    if (C13783b.m40665b()) {
                        C13783b.m40663a();
                    }
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo33257a(Throwable th) {
                try {
                    if (C13783b.m40665b()) {
                        C13783b.m40664a("MultiplexProducer#onFailure");
                    }
                    C13678a.this.mo33314a((a) this, th);
                } finally {
                    if (C13783b.m40665b()) {
                        C13783b.m40663a();
                    }
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo33256a(T t, int i) {
                try {
                    if (C13783b.m40665b()) {
                        C13783b.m40664a("MultiplexProducer#onNewResult");
                    }
                    C13678a.this.mo33313a(this, t, i);
                } finally {
                    if (C13783b.m40665b()) {
                        C13783b.m40663a();
                    }
                }
            }
        }

        /* renamed from: b */
        public final synchronized List<C13701ao> mo33316b() {
            if (this.f36318b == null) {
                return null;
            }
            return this.f36318b.mo33359a(m40339e());
        }

        /* renamed from: c */
        public final synchronized List<C13701ao> mo33317c() {
            if (this.f36318b == null) {
                return null;
            }
            return this.f36318b.mo33360b(m40340f());
        }

        /* renamed from: d */
        public final synchronized List<C13701ao> mo33318d() {
            if (this.f36318b == null) {
                return null;
            }
            return this.f36318b.mo33358a(m40341g());
        }

        /* renamed from: e */
        private synchronized boolean m40339e() {
            Iterator it = this.f36317a.iterator();
            while (it.hasNext()) {
                if (!((C13700an) ((Pair) it.next()).second).mo33339f()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        private synchronized boolean m40340f() {
            Iterator it = this.f36317a.iterator();
            while (it.hasNext()) {
                if (((C13700an) ((Pair) it.next()).second).mo33341h()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private synchronized Priority m40341g() {
            Priority priority;
            priority = Priority.LOW;
            Iterator it = this.f36317a.iterator();
            while (it.hasNext()) {
                priority = Priority.getHigherPriority(priority, ((C13700an) ((Pair) it.next()).second).mo33340g());
            }
            return priority;
        }

        /* renamed from: a */
        public final void mo33310a() {
            boolean z;
            synchronized (this) {
                boolean z2 = false;
                if (this.f36318b == null) {
                    z = true;
                } else {
                    z = false;
                }
                C13307g.m38943a(z);
                if (this.f36324h == null) {
                    z2 = true;
                }
                C13307g.m38943a(z2);
                if (this.f36317a.isEmpty()) {
                    C13676ag.this.mo33309a(this.f36320d, this);
                    return;
                }
                C13700an anVar = (C13700an) ((Pair) this.f36317a.iterator().next()).second;
                C13737d dVar = new C13737d(anVar.mo33333a(), anVar.mo33335b(), anVar.mo33336c(), anVar.mo33337d(), anVar.mo33338e(), m40339e(), m40340f(), m40341g());
                this.f36318b = dVar;
                this.f36324h = new C13680a();
                C13737d dVar2 = this.f36318b;
                a aVar = this.f36324h;
                C13676ag.this.f36316b.mo33296a(aVar, dVar2);
            }
        }

        /* renamed from: a */
        private static void m40338a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* renamed from: a */
        public final void mo33311a(a aVar) {
            synchronized (this) {
                if (this.f36324h == aVar) {
                    this.f36324h = null;
                    this.f36318b = null;
                    m40338a((Closeable) this.f36321e);
                    this.f36321e = null;
                    mo33310a();
                }
            }
        }

        public C13678a(K k) {
            this.f36320d = k;
        }

        /* renamed from: a */
        private void m40337a(final Pair<C13748k<T>, C13700an> pair, C13700an anVar) {
            anVar.mo33334a(new C13738e() {
                /* renamed from: b */
                public final void mo33319b() {
                    C13737d.m40529a(C13678a.this.mo33316b());
                }

                /* renamed from: c */
                public final void mo33320c() {
                    C13737d.m40530b(C13678a.this.mo33317c());
                }

                /* renamed from: d */
                public final void mo33321d() {
                    C13737d.m40531c(C13678a.this.mo33318d());
                }

                /* renamed from: a */
                public final void mo29896a() {
                    boolean remove;
                    List list;
                    List list2;
                    List list3;
                    C13737d dVar;
                    synchronized (C13678a.this) {
                        remove = C13678a.this.f36317a.remove(pair);
                        list = null;
                        if (!remove) {
                            dVar = null;
                            list3 = null;
                        } else if (C13678a.this.f36317a.isEmpty()) {
                            dVar = C13678a.this.f36318b;
                            list3 = null;
                        } else {
                            List b = C13678a.this.mo33316b();
                            list3 = C13678a.this.mo33318d();
                            list2 = C13678a.this.mo33317c();
                            List list4 = b;
                            dVar = null;
                            list = list4;
                        }
                        list2 = list3;
                    }
                    C13737d.m40529a(list);
                    C13737d.m40531c(list3);
                    C13737d.m40530b(list2);
                    if (dVar != null) {
                        dVar.mo33361i();
                    }
                    if (remove) {
                        ((C13748k) pair.first).mo33352b();
                    }
                }
            });
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((com.facebook.imagepipeline.p724k.C13748k) r0.first).mo33353b(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            if (r3.hasNext() == false) goto L_0x0029;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33312a(com.facebook.imagepipeline.k.ag$a.a r3, float r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.k.ag$a.a<> r0 = r2.f36324h     // Catch:{ all -> 0x002a }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0007:
                r2.f36322f = r4     // Catch:{ all -> 0x002a }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.k.k<T>, com.facebook.imagepipeline.k.an>> r3 = r2.f36317a     // Catch:{ all -> 0x002a }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002a }
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
            L_0x0010:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0029
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0026 }
                com.facebook.imagepipeline.k.k r1 = (com.facebook.imagepipeline.p724k.C13748k) r1     // Catch:{ all -> 0x0026 }
                r1.mo33353b(r4)     // Catch:{ all -> 0x0026 }
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                goto L_0x0010
            L_0x0026:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                throw r3
            L_0x0029:
                return
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13676ag.C13678a.mo33312a(com.facebook.imagepipeline.k.ag$a$a, float):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((com.facebook.imagepipeline.p724k.C13748k) r0.first).mo33355b(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            if (r3.hasNext() == false) goto L_0x003b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33314a(com.facebook.imagepipeline.k.ag$a.a r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.k.ag$a.a<> r0 = r2.f36324h     // Catch:{ all -> 0x003c }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
                return
            L_0x0007:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.k.k<T>, com.facebook.imagepipeline.k.an>> r3 = r2.f36317a     // Catch:{ all -> 0x003c }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x003c }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.k.k<T>, com.facebook.imagepipeline.k.an>> r0 = r2.f36317a     // Catch:{ all -> 0x003c }
                r0.clear()     // Catch:{ all -> 0x003c }
                com.facebook.imagepipeline.k.ag r0 = com.facebook.imagepipeline.p724k.C13676ag.this     // Catch:{ all -> 0x003c }
                K r1 = r2.f36320d     // Catch:{ all -> 0x003c }
                r0.mo33309a(r1, r2)     // Catch:{ all -> 0x003c }
                T r0 = r2.f36321e     // Catch:{ all -> 0x003c }
                m40338a(r0)     // Catch:{ all -> 0x003c }
                r0 = 0
                r2.f36321e = r0     // Catch:{ all -> 0x003c }
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
            L_0x0022:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0038 }
                com.facebook.imagepipeline.k.k r1 = (com.facebook.imagepipeline.p724k.C13748k) r1     // Catch:{ all -> 0x0038 }
                r1.mo33355b(r4)     // Catch:{ all -> 0x0038 }
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                goto L_0x0022
            L_0x0038:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                throw r3
            L_0x003b:
                return
            L_0x003c:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x003c }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13676ag.C13678a.mo33314a(com.facebook.imagepipeline.k.ag$a$a, java.lang.Throwable):void");
        }

        /* JADX INFO: used method not loaded: com.facebook.imagepipeline.k.d.a(java.util.List):null, types can be incorrect */
        /* JADX INFO: used method not loaded: com.facebook.imagepipeline.k.d.b(java.util.List):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            com.facebook.imagepipeline.p724k.C13737d.m40529a(r1);
            com.facebook.imagepipeline.p724k.C13737d.m40531c(r2);
            com.facebook.imagepipeline.p724k.C13737d.m40530b(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            if (r4 == r7.f36321e) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r4 == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            r4 = r7.f36319c.mo33307a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            if (r4 == null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
            if (r5 <= 0.0f) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.mo33353b(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
            r8.mo33354b(r4, r6);
            m40338a((java.io.Closeable) r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
            m40337a(r0, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
            return true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo33315a(com.facebook.imagepipeline.p724k.C13748k<T> r8, com.facebook.imagepipeline.p724k.C13700an r9) {
            /*
                r7 = this;
                android.util.Pair r0 = android.util.Pair.create(r8, r9)
                monitor-enter(r7)
                com.facebook.imagepipeline.k.ag r1 = com.facebook.imagepipeline.p724k.C13676ag.this     // Catch:{ all -> 0x0060 }
                K r2 = r7.f36320d     // Catch:{ all -> 0x0060 }
                com.facebook.imagepipeline.k.ag$a r1 = r1.mo33306a(r2)     // Catch:{ all -> 0x0060 }
                if (r1 == r7) goto L_0x0012
                r8 = 0
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                return r8
            L_0x0012:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.k.k<T>, com.facebook.imagepipeline.k.an>> r1 = r7.f36317a     // Catch:{ all -> 0x0060 }
                r1.add(r0)     // Catch:{ all -> 0x0060 }
                java.util.List r1 = r7.mo33316b()     // Catch:{ all -> 0x0060 }
                java.util.List r2 = r7.mo33318d()     // Catch:{ all -> 0x0060 }
                java.util.List r3 = r7.mo33317c()     // Catch:{ all -> 0x0060 }
                T r4 = r7.f36321e     // Catch:{ all -> 0x0060 }
                float r5 = r7.f36322f     // Catch:{ all -> 0x0060 }
                int r6 = r7.f36323g     // Catch:{ all -> 0x0060 }
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                com.facebook.imagepipeline.p724k.C13737d.m40529a(r1)
                com.facebook.imagepipeline.p724k.C13737d.m40531c(r2)
                com.facebook.imagepipeline.p724k.C13737d.m40530b(r3)
                monitor-enter(r0)
                monitor-enter(r7)     // Catch:{ all -> 0x005d }
                T r1 = r7.f36321e     // Catch:{ all -> 0x005a }
                if (r4 == r1) goto L_0x003b
                r4 = 0
                goto L_0x0043
            L_0x003b:
                if (r4 == 0) goto L_0x0043
                com.facebook.imagepipeline.k.ag r1 = com.facebook.imagepipeline.p724k.C13676ag.this     // Catch:{ all -> 0x005a }
                java.io.Closeable r4 = r1.mo33307a(r4)     // Catch:{ all -> 0x005a }
            L_0x0043:
                monitor-exit(r7)     // Catch:{ all -> 0x005a }
                if (r4 == 0) goto L_0x0054
                r1 = 0
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x004e
                r8.mo33353b(r5)     // Catch:{ all -> 0x005d }
            L_0x004e:
                r8.mo33354b(r4, r6)     // Catch:{ all -> 0x005d }
                m40338a(r4)     // Catch:{ all -> 0x005d }
            L_0x0054:
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                r7.m40337a(r0, r9)
                r8 = 1
                return r8
            L_0x005a:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x005a }
                throw r8     // Catch:{ all -> 0x005d }
            L_0x005d:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                throw r8
            L_0x0060:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13676ag.C13678a.mo33315a(com.facebook.imagepipeline.k.k, com.facebook.imagepipeline.k.an):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (r3.hasNext() == false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            ((com.facebook.imagepipeline.p724k.C13748k) r0.first).mo33354b(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33313a(com.facebook.imagepipeline.k.ag$a.a r3, T r4, int r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.k.ag$a.a<> r0 = r2.f36324h     // Catch:{ all -> 0x004d }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                return
            L_0x0007:
                T r3 = r2.f36321e     // Catch:{ all -> 0x004d }
                m40338a(r3)     // Catch:{ all -> 0x004d }
                r3 = 0
                r2.f36321e = r3     // Catch:{ all -> 0x004d }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.k.k<T>, com.facebook.imagepipeline.k.an>> r3 = r2.f36317a     // Catch:{ all -> 0x004d }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x004d }
                boolean r0 = com.facebook.imagepipeline.p724k.C13728b.m40494b(r5)     // Catch:{ all -> 0x004d }
                if (r0 == 0) goto L_0x0026
                com.facebook.imagepipeline.k.ag r0 = com.facebook.imagepipeline.p724k.C13676ag.this     // Catch:{ all -> 0x004d }
                java.io.Closeable r0 = r0.mo33307a(r4)     // Catch:{ all -> 0x004d }
                r2.f36321e = r0     // Catch:{ all -> 0x004d }
                r2.f36323g = r5     // Catch:{ all -> 0x004d }
                goto L_0x0032
            L_0x0026:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<com.facebook.imagepipeline.k.k<T>, com.facebook.imagepipeline.k.an>> r0 = r2.f36317a     // Catch:{ all -> 0x004d }
                r0.clear()     // Catch:{ all -> 0x004d }
                com.facebook.imagepipeline.k.ag r0 = com.facebook.imagepipeline.p724k.C13676ag.this     // Catch:{ all -> 0x004d }
                K r1 = r2.f36320d     // Catch:{ all -> 0x004d }
                r0.mo33309a(r1, r2)     // Catch:{ all -> 0x004d }
            L_0x0032:
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
            L_0x0033:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x004c
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0049 }
                com.facebook.imagepipeline.k.k r1 = (com.facebook.imagepipeline.p724k.C13748k) r1     // Catch:{ all -> 0x0049 }
                r1.mo33354b(r4, r5)     // Catch:{ all -> 0x0049 }
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                goto L_0x0033
            L_0x0049:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0049 }
                throw r3
            L_0x004c:
                return
            L_0x004d:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13676ag.C13678a.mo33313a(com.facebook.imagepipeline.k.ag$a$a, java.io.Closeable, int):void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo33307a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract K mo33308a(C13700an anVar);

    protected C13676ag(C13699am<T> amVar) {
        this.f36316b = amVar;
    }

    /* renamed from: b */
    private synchronized C13678a m40331b(K k) {
        C13678a aVar;
        aVar = new C13678a<>(k);
        this.f36315a.put(k, aVar);
        return aVar;
    }

    /* renamed from: a */
    public final synchronized C13678a mo33306a(K k) {
        return (C13678a) this.f36315a.get(k);
    }

    /* renamed from: a */
    public final synchronized void mo33309a(K k, C13678a aVar) {
        if (this.f36315a.get(k) == aVar) {
            this.f36315a.remove(k);
        }
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<T> kVar, C13700an anVar) {
        boolean z;
        C13678a a;
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("MultiplexProducer#produceResults");
            }
            Object a2 = mo33308a(anVar);
            do {
                z = false;
                synchronized (this) {
                    a = mo33306a((K) a2);
                    if (a == null) {
                        a = m40331b(a2);
                        z = true;
                    }
                }
            } while (!a.mo33315a(kVar, anVar));
            if (z) {
                a.mo33310a();
            }
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        } catch (Throwable th) {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            throw th;
        }
    }
}
