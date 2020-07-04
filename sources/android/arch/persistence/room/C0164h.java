package android.arch.persistence.room;

import android.arch.persistence.p009a.C0140d;
import android.arch.persistence.p009a.C0141e;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: android.arch.persistence.room.h */
public final class C0164h implements C0140d, C0141e {

    /* renamed from: g */
    static final TreeMap<Integer, C0164h> f366g = new TreeMap<>();

    /* renamed from: a */
    final long[] f367a;

    /* renamed from: b */
    final double[] f368b;

    /* renamed from: c */
    final String[] f369c;

    /* renamed from: d */
    final byte[][] f370d;

    /* renamed from: e */
    final int f371e;

    /* renamed from: f */
    int f372f;

    /* renamed from: h */
    private volatile String f373h;

    /* renamed from: i */
    private final int[] f374i;

    /* renamed from: a */
    public final String mo262a() {
        return this.f373h;
    }

    public final void close() {
    }

    /* renamed from: b */
    public final void mo362b() {
        synchronized (f366g) {
            f366g.put(Integer.valueOf(this.f371e), this);
            m459c();
        }
    }

    /* renamed from: c */
    private static void m459c() {
        if (f366g.size() > 15) {
            int size = f366g.size() - 10;
            Iterator it = f366g.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo288a(int i) {
        this.f374i[i] = 1;
    }

    private C0164h(int i) {
        this.f371e = i;
        int i2 = i + 1;
        this.f374i = new int[i2];
        this.f367a = new long[i2];
        this.f368b = new double[i2];
        this.f369c = new String[i2];
        this.f370d = new byte[i2][];
    }

    /* renamed from: a */
    public final void mo263a(C0140d dVar) {
        for (int i = 1; i <= this.f372f; i++) {
            switch (this.f374i[i]) {
                case 1:
                    dVar.mo288a(i);
                    break;
                case 2:
                    dVar.mo290a(i, this.f367a[i]);
                    break;
                case 3:
                    dVar.mo289a(i, this.f368b[i]);
                    break;
                case 4:
                    dVar.mo291a(i, this.f369c[i]);
                    break;
                case 5:
                    dVar.mo292a(i, this.f370d[i]);
                    break;
            }
        }
    }

    /* renamed from: b */
    private void m458b(String str, int i) {
        this.f373h = str;
        this.f372f = i;
    }

    /* renamed from: a */
    public final void mo289a(int i, double d) {
        this.f374i[i] = 3;
        this.f368b[i] = d;
    }

    /* renamed from: a */
    public final void mo290a(int i, long j) {
        this.f374i[i] = 2;
        this.f367a[i] = j;
    }

    /* renamed from: a */
    public static C0164h m457a(String str, int i) {
        synchronized (f366g) {
            Entry ceilingEntry = f366g.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f366g.remove(ceilingEntry.getKey());
                C0164h hVar = (C0164h) ceilingEntry.getValue();
                hVar.m458b(str, i);
                return hVar;
            }
            C0164h hVar2 = new C0164h(i);
            hVar2.m458b(str, i);
            return hVar2;
        }
    }

    /* renamed from: a */
    public final void mo291a(int i, String str) {
        this.f374i[i] = 4;
        this.f369c[i] = str;
    }

    /* renamed from: a */
    public final void mo292a(int i, byte[] bArr) {
        this.f374i[i] = 5;
        this.f370d[i] = bArr;
    }
}
