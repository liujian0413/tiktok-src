package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13309i;
import com.facebook.common.memory.C13318c;
import com.facebook.common.memory.C13320e;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.p686c.C13286a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class BasePool<V> implements C13320e<V> {

    /* renamed from: a */
    final C13318c f36589a;

    /* renamed from: b */
    final C13803ad f36590b;

    /* renamed from: c */
    final SparseArray<C13808e<V>> f36591c;

    /* renamed from: d */
    final Set<V> f36592d;

    /* renamed from: e */
    final C13795a f36593e;

    /* renamed from: f */
    final C13795a f36594f;

    /* renamed from: g */
    private final Class<?> f36595g = getClass();

    /* renamed from: h */
    private boolean f36596h;

    /* renamed from: i */
    private final C13804ae f36597i;

    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            StringBuilder sb = new StringBuilder("Invalid size: ");
            sb.append(obj.toString());
            super(sb.toString());
        }
    }

    public static class InvalidValueException extends RuntimeException {
        public InvalidValueException(Object obj) {
            StringBuilder sb = new StringBuilder("Invalid value: ");
            sb.append(obj.toString());
            super(sb.toString());
        }
    }

    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i, int i2, int i3, int i4) {
            StringBuilder sb = new StringBuilder("Pool hard cap violation? Hard cap = ");
            sb.append(i);
            sb.append(" Used size = ");
            sb.append(i2);
            sb.append(" Free size = ");
            sb.append(i3);
            sb.append(" Request size = ");
            sb.append(i4);
            super(sb.toString());
        }
    }

    public static class SizeTooLargeException extends InvalidSizeException {
        public SizeTooLargeException(Object obj) {
            super(obj);
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.BasePool$a */
    static class C13795a {

        /* renamed from: a */
        int f36598a;

        /* renamed from: b */
        int f36599b;

        C13795a() {
        }

        /* renamed from: a */
        public final void mo33398a() {
            this.f36598a = 0;
            this.f36599b = 0;
        }

        /* renamed from: a */
        public final void mo33399a(int i) {
            this.f36598a++;
            this.f36599b += i;
        }

        /* renamed from: b */
        public final void mo33400b(int i) {
            if (this.f36599b < i || this.f36598a <= 0) {
                C13286a.m38865d("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f36599b), Integer.valueOf(this.f36598a));
                return;
            }
            this.f36598a--;
            this.f36599b -= i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract V mo33391b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo33392b(V v);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo33393c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo33394c(V v);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo33395d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33390a() {
        this.f36589a.mo29905a(this);
    }

    /* renamed from: b */
    private synchronized void mo33449b() {
        boolean z;
        if (m40696g()) {
            if (this.f36594f.f36599b != 0) {
                z = false;
                C13307g.m38947b(z);
            }
        }
        z = true;
        C13307g.m38947b(z);
    }

    /* renamed from: c */
    private synchronized void m40690c() {
        SparseIntArray sparseIntArray = this.f36590b.f36641c;
        if (sparseIntArray != null) {
            m40689b(sparseIntArray);
            this.f36596h = false;
            return;
        }
        this.f36596h = true;
    }

    /* renamed from: f */
    private synchronized void m40693f() {
        if (m40696g()) {
            mo33446f(this.f36590b.f36640b);
        }
    }

    /* renamed from: g */
    private synchronized boolean m40696g() {
        boolean z;
        if (this.f36593e.f36599b + this.f36594f.f36599b > this.f36590b.f36640b) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    private List<C13808e<V>> m40691d() {
        ArrayList arrayList = new ArrayList(this.f36591c.size());
        int size = this.f36591c.size();
        for (int i = 0; i < size; i++) {
            C13808e eVar = (C13808e) this.f36591c.valueAt(i);
            int i2 = eVar.f36650a;
            int i3 = eVar.f36651b;
            int i4 = eVar.f36653d;
            if (eVar.mo33436b() > 0) {
                arrayList.add(eVar);
            }
            this.f36591c.setValueAt(i, new C13808e(mo33395d(i2), i3, i4, this.f36590b.f36644f));
        }
        return arrayList;
    }

    /* renamed from: e */
    private void m40692e() {
        int i;
        List list;
        synchronized (this) {
            if (this.f36590b.f36644f) {
                list = m40691d();
            } else {
                list = new ArrayList(this.f36591c.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i2 = 0; i2 < this.f36591c.size(); i2++) {
                    C13808e eVar = (C13808e) this.f36591c.valueAt(i2);
                    if (eVar.mo33436b() > 0) {
                        list.add(eVar);
                    }
                    sparseIntArray.put(this.f36591c.keyAt(i2), eVar.f36653d);
                }
                m40687a(sparseIntArray);
            }
            this.f36594f.mo33398a();
            m40698h();
        }
        for (i = 0; i < list.size(); i++) {
            C13808e eVar2 = (C13808e) list.get(i);
            while (true) {
                Object d = eVar2.mo33439d();
                if (d == null) {
                    break;
                }
                mo33392b((V) d);
            }
        }
    }

    /* renamed from: h */
    private void m40698h() {
        if (C13286a.m38846a(2)) {
            C13286a.m38838a(this.f36595g, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f36593e.f36598a), Integer.valueOf(this.f36593e.f36599b), Integer.valueOf(this.f36594f.f36598a), Integer.valueOf(this.f36594f.f36599b));
        }
    }

    /* renamed from: a */
    public final void mo32580a(MemoryTrimType memoryTrimType) {
        m40692e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo33396d(V v) {
        C13307g.m38940a(v);
        return true;
    }

    /* renamed from: g */
    private synchronized C13808e<V> m40695g(int i) {
        return (C13808e) this.f36591c.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized V mo33389a(C13808e<V> eVar) {
        return eVar.mo33438c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C13808e<V> mo33397e(int i) {
        return new C13808e<>(mo33395d(i), Integer.MAX_VALUE, 0, this.f36590b.f36644f);
    }

    /* renamed from: b */
    private void m40689b(SparseIntArray sparseIntArray) {
        this.f36591c.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            this.f36591c.put(keyAt, new C13808e(mo33395d(keyAt), sparseIntArray.valueAt(i), 0, this.f36590b.f36644f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return r0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.facebook.imagepipeline.memory.C13808e<V> m40697h(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<com.facebook.imagepipeline.memory.e<V>> r0 = r3.f36591c     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002f }
            com.facebook.imagepipeline.memory.e r0 = (com.facebook.imagepipeline.memory.C13808e) r0     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            boolean r1 = r3.f36596h     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            r0 = 2
            boolean r0 = com.facebook.common.p686c.C13286a.m38846a(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0022
            java.lang.Class<?> r0 = r3.f36595g     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "creating new bucket %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002f }
            com.facebook.common.p686c.C13286a.m38835a(r0, r1, r2)     // Catch:{ all -> 0x002f }
        L_0x0022:
            com.facebook.imagepipeline.memory.e r0 = r3.mo33397e(r4)     // Catch:{ all -> 0x002f }
            android.util.SparseArray<com.facebook.imagepipeline.memory.e<V>> r1 = r3.f36591c     // Catch:{ all -> 0x002f }
            r1.put(r4, r0)     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return r0
        L_0x002d:
            monitor-exit(r3)
            return r0
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.m40697h(int):com.facebook.imagepipeline.memory.e");
    }

    /* renamed from: i */
    private synchronized boolean m40699i(int i) {
        int i2 = this.f36590b.f36639a;
        if (i > i2 - this.f36593e.f36599b) {
            return false;
        }
        int i3 = this.f36590b.f36640b;
        if (i > i3 - (this.f36593e.f36599b + this.f36594f.f36599b)) {
            mo33446f(i3 - i);
        }
        if (i > i2 - (this.f36593e.f36599b + this.f36594f.f36599b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private synchronized void m40687a(SparseIntArray sparseIntArray) {
        C13307g.m38940a(sparseIntArray);
        this.f36591c.clear();
        SparseIntArray sparseIntArray2 = this.f36590b.f36641c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f36591c.put(keyAt, new C13808e(mo33395d(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f36590b.f36644f));
            }
            this.f36596h = false;
            return;
        }
        this.f36596h = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void mo33446f(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.BasePool$a r0 = r7.f36593e     // Catch:{ all -> 0x008c }
            int r0 = r0.f36599b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.BasePool$a r1 = r7.f36594f     // Catch:{ all -> 0x008c }
            int r1 = r1.f36599b     // Catch:{ all -> 0x008c }
            int r0 = r0 + r1
            int r0 = r0 - r8
            com.facebook.imagepipeline.memory.BasePool$a r1 = r7.f36594f     // Catch:{ all -> 0x008c }
            int r1 = r1.f36599b     // Catch:{ all -> 0x008c }
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x008c }
            if (r0 > 0) goto L_0x0017
            monitor-exit(r7)
            return
        L_0x0017:
            r1 = 2
            boolean r2 = com.facebook.common.p686c.C13286a.m38846a(r1)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x003a
            java.lang.Class<?> r2 = r7.f36595g     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.BasePool$a r5 = r7.f36593e     // Catch:{ all -> 0x008c }
            int r5 = r5.f36599b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.BasePool$a r6 = r7.f36594f     // Catch:{ all -> 0x008c }
            int r6 = r6.f36599b     // Catch:{ all -> 0x008c }
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x008c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008c }
            com.facebook.common.p686c.C13286a.m38837a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008c }
        L_0x003a:
            r7.m40698h()     // Catch:{ all -> 0x008c }
            r2 = 0
        L_0x003e:
            android.util.SparseArray<com.facebook.imagepipeline.memory.e<V>> r3 = r7.f36591c     // Catch:{ all -> 0x008c }
            int r3 = r3.size()     // Catch:{ all -> 0x008c }
            if (r2 >= r3) goto L_0x0069
            if (r0 <= 0) goto L_0x0069
            android.util.SparseArray<com.facebook.imagepipeline.memory.e<V>> r3 = r7.f36591c     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r3.valueAt(r2)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.e r3 = (com.facebook.imagepipeline.memory.C13808e) r3     // Catch:{ all -> 0x008c }
        L_0x0050:
            if (r0 <= 0) goto L_0x0066
            java.lang.Object r4 = r3.mo33439d()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0066
            r7.mo33392b((V) r4)     // Catch:{ all -> 0x008c }
            int r4 = r3.f36650a     // Catch:{ all -> 0x008c }
            int r0 = r0 - r4
            com.facebook.imagepipeline.memory.BasePool$a r4 = r7.f36594f     // Catch:{ all -> 0x008c }
            int r5 = r3.f36650a     // Catch:{ all -> 0x008c }
            r4.mo33400b(r5)     // Catch:{ all -> 0x008c }
            goto L_0x0050
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0069:
            r7.m40698h()     // Catch:{ all -> 0x008c }
            boolean r0 = com.facebook.common.p686c.C13286a.m38846a(r1)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x008a
            java.lang.Class<?> r0 = r7.f36595g     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "trimToSize: TargetSize = %d; Final Size = %d"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.BasePool$a r2 = r7.f36593e     // Catch:{ all -> 0x008c }
            int r2 = r2.f36599b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r7.f36594f     // Catch:{ all -> 0x008c }
            int r3 = r3.f36599b     // Catch:{ all -> 0x008c }
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x008c }
            com.facebook.common.p686c.C13286a.m38836a(r0, r1, r8, r2)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r7)
            return
        L_0x008c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.mo33446f(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r0 = mo33391b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5.f36593e.mo33400b(r2);
        r2 = m40697h(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r2 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r2.mo33441f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        com.facebook.common.internal.C13315l.m38960a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.facebook.common.internal.C13307g.m38947b(r5.f36592d.add(r0));
        m40693f();
        m40698h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (com.facebook.common.p686c.C13286a.m38846a(2) == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        com.facebook.common.p686c.C13286a.m38836a(r5.f36595g, "get (alloc) (object, size) = (%x, %s)", (java.lang.Object) java.lang.Integer.valueOf(java.lang.System.identityHashCode(r0)), (java.lang.Object) java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo32581a(int r6) {
        /*
            r5 = this;
            r5.mo33449b()
            int r6 = r5.mo33393c(r6)
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.e r0 = r5.m40697h(r6)     // Catch:{ all -> 0x00c1 }
            r1 = 2
            if (r0 == 0) goto L_0x004e
            java.lang.Object r2 = r5.mo33389a(r0)     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x004e
            java.util.Set<V> r6 = r5.f36592d     // Catch:{ all -> 0x00c1 }
            boolean r6 = r6.add(r2)     // Catch:{ all -> 0x00c1 }
            com.facebook.common.internal.C13307g.m38947b(r6)     // Catch:{ all -> 0x00c1 }
            int r6 = r5.mo33394c((V) r2)     // Catch:{ all -> 0x00c1 }
            int r0 = r5.mo33395d(r6)     // Catch:{ all -> 0x00c1 }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f36593e     // Catch:{ all -> 0x00c1 }
            r3.mo33399a(r0)     // Catch:{ all -> 0x00c1 }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f36594f     // Catch:{ all -> 0x00c1 }
            r3.mo33400b(r0)     // Catch:{ all -> 0x00c1 }
            r5.m40698h()     // Catch:{ all -> 0x00c1 }
            boolean r0 = com.facebook.common.p686c.C13286a.m38846a(r1)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x004c
            java.lang.Class<?> r0 = r5.f36595g     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "get (reuse) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r2)     // Catch:{ all -> 0x00c1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00c1 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00c1 }
            com.facebook.common.p686c.C13286a.m38836a(r0, r1, r3, r6)     // Catch:{ all -> 0x00c1 }
        L_0x004c:
            monitor-exit(r5)     // Catch:{ all -> 0x00c1 }
            return r2
        L_0x004e:
            int r2 = r5.mo33395d(r6)     // Catch:{ all -> 0x00c1 }
            boolean r3 = r5.m40699i(r2)     // Catch:{ all -> 0x00c1 }
            if (r3 == 0) goto L_0x00af
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f36593e     // Catch:{ all -> 0x00c1 }
            r3.mo33399a(r2)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0062
            r0.mo33440e()     // Catch:{ all -> 0x00c1 }
        L_0x0062:
            monitor-exit(r5)     // Catch:{ all -> 0x00c1 }
            r0 = 0
            java.lang.Object r3 = r5.mo33391b(r6)     // Catch:{ Throwable -> 0x006a }
            r0 = r3
            goto L_0x007e
        L_0x006a:
            r3 = move-exception
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.BasePool$a r4 = r5.f36593e     // Catch:{ all -> 0x00ac }
            r4.mo33400b(r2)     // Catch:{ all -> 0x00ac }
            com.facebook.imagepipeline.memory.e r2 = r5.m40697h(r6)     // Catch:{ all -> 0x00ac }
            if (r2 == 0) goto L_0x007a
            r2.mo33441f()     // Catch:{ all -> 0x00ac }
        L_0x007a:
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            com.facebook.common.internal.C13315l.m38960a(r3)
        L_0x007e:
            monitor-enter(r5)
            java.util.Set<V> r2 = r5.f36592d     // Catch:{ all -> 0x00a9 }
            boolean r2 = r2.add(r0)     // Catch:{ all -> 0x00a9 }
            com.facebook.common.internal.C13307g.m38947b(r2)     // Catch:{ all -> 0x00a9 }
            r5.m40693f()     // Catch:{ all -> 0x00a9 }
            r5.m40698h()     // Catch:{ all -> 0x00a9 }
            boolean r1 = com.facebook.common.p686c.C13286a.m38846a(r1)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x00a7
            java.lang.Class<?> r1 = r5.f36595g     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "get (alloc) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00a9 }
            com.facebook.common.p686c.C13286a.m38836a(r1, r2, r3, r6)     // Catch:{ all -> 0x00a9 }
        L_0x00a7:
            monitor-exit(r5)     // Catch:{ all -> 0x00a9 }
            return r0
        L_0x00a9:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a9 }
            throw r6
        L_0x00ac:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            throw r6
        L_0x00af:
            com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException r6 = new com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException     // Catch:{ all -> 0x00c1 }
            com.facebook.imagepipeline.memory.ad r0 = r5.f36590b     // Catch:{ all -> 0x00c1 }
            int r0 = r0.f36639a     // Catch:{ all -> 0x00c1 }
            com.facebook.imagepipeline.memory.BasePool$a r1 = r5.f36593e     // Catch:{ all -> 0x00c1 }
            int r1 = r1.f36599b     // Catch:{ all -> 0x00c1 }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f36594f     // Catch:{ all -> 0x00c1 }
            int r3 = r3.f36599b     // Catch:{ all -> 0x00c1 }
            r6.<init>(r0, r1, r3, r2)     // Catch:{ all -> 0x00c1 }
            throw r6     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c1 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.mo32581a(int):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo32582a(V v) {
        C13307g.m38940a(v);
        int c = mo33394c(v);
        int d = mo33395d(c);
        synchronized (this) {
            C13808e g = m40695g(c);
            if (!this.f36592d.remove(v)) {
                C13286a.m38859c(this.f36595g, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c));
                mo33392b(v);
            } else {
                if (g != null && !g.mo33435a() && !m40696g()) {
                    if (mo33396d(v)) {
                        g.mo33434a(v);
                        this.f36594f.mo33399a(d);
                        this.f36593e.mo33400b(d);
                        if (C13286a.m38846a(2)) {
                            C13286a.m38836a(this.f36595g, "release (reuse) (object, size) = (%x, %s)", (Object) Integer.valueOf(System.identityHashCode(v)), (Object) Integer.valueOf(c));
                        }
                    }
                }
                if (g != null) {
                    g.mo33441f();
                }
                if (C13286a.m38846a(2)) {
                    C13286a.m38836a(this.f36595g, "release (free) (object, size) = (%x, %s)", (Object) Integer.valueOf(System.identityHashCode(v)), (Object) Integer.valueOf(c));
                }
                mo33392b(v);
                this.f36593e.mo33400b(d);
            }
            m40698h();
        }
    }

    public BasePool(C13318c cVar, C13803ad adVar, C13804ae aeVar) {
        this.f36589a = (C13318c) C13307g.m38940a(cVar);
        this.f36590b = (C13803ad) C13307g.m38940a(adVar);
        this.f36597i = (C13804ae) C13307g.m38940a(aeVar);
        this.f36591c = new SparseArray<>();
        if (this.f36590b.f36644f) {
            m40690c();
        } else {
            m40687a(new SparseIntArray(0));
        }
        this.f36592d = C13309i.m38950a();
        this.f36594f = new C13795a();
        this.f36593e = new C13795a();
    }
}
