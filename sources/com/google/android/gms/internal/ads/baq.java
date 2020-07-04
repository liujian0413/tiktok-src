package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class baq {

    /* renamed from: a */
    private static final Logger f41326a = Logger.getLogger(baq.class.getName());

    /* renamed from: b */
    private static final Unsafe f41327b = m48152c();

    /* renamed from: c */
    private static final Class<?> f41328c = awg.m47419b();

    /* renamed from: d */
    private static final boolean f41329d = m48160d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f41330e = m48160d(Integer.TYPE);

    /* renamed from: f */
    private static final C15558d f41331f;

    /* renamed from: g */
    private static final boolean f41332g = m48167g();

    /* renamed from: h */
    private static final boolean f41333h = m48165f();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f41334i = ((long) m48146b(byte[].class));

    /* renamed from: j */
    private static final long f41335j = ((long) m48146b(boolean[].class));

    /* renamed from: k */
    private static final long f41336k = ((long) m48151c(boolean[].class));

    /* renamed from: l */
    private static final long f41337l = ((long) m48146b(int[].class));

    /* renamed from: m */
    private static final long f41338m = ((long) m48151c(int[].class));

    /* renamed from: n */
    private static final long f41339n = ((long) m48146b(long[].class));

    /* renamed from: o */
    private static final long f41340o = ((long) m48151c(long[].class));

    /* renamed from: p */
    private static final long f41341p = ((long) m48146b(float[].class));

    /* renamed from: q */
    private static final long f41342q = ((long) m48151c(float[].class));

    /* renamed from: r */
    private static final long f41343r = ((long) m48146b(double[].class));

    /* renamed from: s */
    private static final long f41344s = ((long) m48151c(double[].class));

    /* renamed from: t */
    private static final long f41345t = ((long) m48146b(Object[].class));

    /* renamed from: u */
    private static final long f41346u = ((long) m48151c(Object[].class));

    /* renamed from: v */
    private static final long f41347v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final boolean f41348w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.ads.baq$a */
    static final class C15555a extends C15558d {
        C15555a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo40445a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: a */
        public final byte mo40444a(Object obj, long j) {
            if (baq.f41348w) {
                return baq.m48172k(obj, j);
            }
            return baq.m48173l(obj, j);
        }

        /* renamed from: a */
        public final void mo40446a(Object obj, long j, byte b) {
            if (baq.f41348w) {
                baq.m48153c(obj, j, b);
            } else {
                baq.m48158d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo40451b(Object obj, long j) {
            if (baq.f41348w) {
                return baq.m48174m(obj, j);
            }
            return baq.m48175n(obj, j);
        }

        /* renamed from: a */
        public final void mo40449a(Object obj, long j, boolean z) {
            if (baq.f41348w) {
                baq.m48159d(obj, j, z);
            } else {
                baq.m48162e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo40452c(Object obj, long j) {
            return Float.intBitsToFloat(mo40456e(obj, j));
        }

        /* renamed from: a */
        public final void mo40448a(Object obj, long j, float f) {
            mo40454a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo40453d(Object obj, long j) {
            return Double.longBitsToDouble(mo40457f(obj, j));
        }

        /* renamed from: a */
        public final void mo40447a(Object obj, long j, double d) {
            mo40455a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo40450a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.baq$b */
    static final class C15556b extends C15558d {
        C15556b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo40445a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final byte mo40444a(Object obj, long j) {
            if (baq.f41348w) {
                return baq.m48172k(obj, j);
            }
            return baq.m48173l(obj, j);
        }

        /* renamed from: a */
        public final void mo40446a(Object obj, long j, byte b) {
            if (baq.f41348w) {
                baq.m48153c(obj, j, b);
            } else {
                baq.m48158d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo40451b(Object obj, long j) {
            if (baq.f41348w) {
                return baq.m48174m(obj, j);
            }
            return baq.m48175n(obj, j);
        }

        /* renamed from: a */
        public final void mo40449a(Object obj, long j, boolean z) {
            if (baq.f41348w) {
                baq.m48159d(obj, j, z);
            } else {
                baq.m48162e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo40452c(Object obj, long j) {
            return Float.intBitsToFloat(mo40456e(obj, j));
        }

        /* renamed from: a */
        public final void mo40448a(Object obj, long j, float f) {
            mo40454a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo40453d(Object obj, long j) {
            return Double.longBitsToDouble(mo40457f(obj, j));
        }

        /* renamed from: a */
        public final void mo40447a(Object obj, long j, double d) {
            mo40455a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo40450a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.baq$c */
    static final class C15557c extends C15558d {
        C15557c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo40445a(long j, byte b) {
            this.f41349a.putByte(j, b);
        }

        /* renamed from: a */
        public final byte mo40444a(Object obj, long j) {
            return this.f41349a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo40446a(Object obj, long j, byte b) {
            this.f41349a.putByte(obj, j, b);
        }

        /* renamed from: b */
        public final boolean mo40451b(Object obj, long j) {
            return this.f41349a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public final void mo40449a(Object obj, long j, boolean z) {
            this.f41349a.putBoolean(obj, j, z);
        }

        /* renamed from: c */
        public final float mo40452c(Object obj, long j) {
            return this.f41349a.getFloat(obj, j);
        }

        /* renamed from: a */
        public final void mo40448a(Object obj, long j, float f) {
            this.f41349a.putFloat(obj, j, f);
        }

        /* renamed from: d */
        public final double mo40453d(Object obj, long j) {
            return this.f41349a.getDouble(obj, j);
        }

        /* renamed from: a */
        public final void mo40447a(Object obj, long j, double d) {
            this.f41349a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo40450a(byte[] bArr, long j, long j2, long j3) {
            this.f41349a.copyMemory(bArr, baq.f41334i + j, null, j2, j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.baq$d */
    static abstract class C15558d {

        /* renamed from: a */
        Unsafe f41349a;

        C15558d(Unsafe unsafe) {
            this.f41349a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo40444a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo40445a(long j, byte b);

        /* renamed from: a */
        public abstract void mo40446a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo40447a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo40448a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo40449a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo40450a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public abstract boolean mo40451b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo40452c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo40453d(Object obj, long j);

        /* renamed from: e */
        public final int mo40456e(Object obj, long j) {
            return this.f41349a.getInt(obj, j);
        }

        /* renamed from: a */
        public final void mo40454a(Object obj, long j, int i) {
            this.f41349a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final long mo40457f(Object obj, long j) {
            return this.f41349a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void mo40455a(Object obj, long j, long j2) {
            this.f41349a.putLong(obj, j, j2);
        }
    }

    private baq() {
    }

    /* renamed from: a */
    static boolean m48145a() {
        return f41333h;
    }

    /* renamed from: b */
    static boolean m48150b() {
        return f41332g;
    }

    /* renamed from: a */
    static <T> T m48133a(Class<T> cls) {
        try {
            return f41327b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static int m48146b(Class<?> cls) {
        if (f41333h) {
            return f41331f.f41349a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: c */
    private static int m48151c(Class<?> cls) {
        if (f41333h) {
            return f41331f.f41349a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m48131a(Object obj, long j) {
        return f41331f.mo40456e(obj, j);
    }

    /* renamed from: a */
    static void m48139a(Object obj, long j, int i) {
        f41331f.mo40454a(obj, j, i);
    }

    /* renamed from: b */
    static long m48147b(Object obj, long j) {
        return f41331f.mo40457f(obj, j);
    }

    /* renamed from: a */
    static void m48140a(Object obj, long j, long j2) {
        f41331f.mo40455a(obj, j, j2);
    }

    /* renamed from: c */
    static boolean m48155c(Object obj, long j) {
        return f41331f.mo40451b(obj, j);
    }

    /* renamed from: a */
    static void m48142a(Object obj, long j, boolean z) {
        f41331f.mo40449a(obj, j, z);
    }

    /* renamed from: d */
    static float m48156d(Object obj, long j) {
        return f41331f.mo40452c(obj, j);
    }

    /* renamed from: a */
    static void m48138a(Object obj, long j, float f) {
        f41331f.mo40448a(obj, j, f);
    }

    /* renamed from: e */
    static double m48161e(Object obj, long j) {
        return f41331f.mo40453d(obj, j);
    }

    /* renamed from: a */
    static void m48137a(Object obj, long j, double d) {
        f41331f.mo40447a(obj, j, d);
    }

    /* renamed from: f */
    static Object m48164f(Object obj, long j) {
        return f41331f.f41349a.getObject(obj, j);
    }

    /* renamed from: a */
    static void m48141a(Object obj, long j, Object obj2) {
        f41331f.f41349a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m48130a(byte[] bArr, long j) {
        return f41331f.mo40444a((Object) bArr, f41334i + j);
    }

    /* renamed from: a */
    static void m48143a(byte[] bArr, long j, byte b) {
        f41331f.mo40446a((Object) bArr, f41334i + j, b);
    }

    /* renamed from: a */
    static void m48144a(byte[] bArr, long j, long j2, long j3) {
        f41331f.mo40450a(bArr, j, j2, j3);
    }

    /* renamed from: a */
    static void m48135a(long j, byte b) {
        f41331f.mo40445a(j, b);
    }

    /* renamed from: a */
    static long m48132a(ByteBuffer byteBuffer) {
        return f41331f.mo40457f(byteBuffer, f41347v);
    }

    /* renamed from: c */
    static Unsafe m48152c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C15559bar());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static boolean m48165f() {
        if (f41327b == null) {
            return false;
        }
        try {
            Class cls = f41327b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (awg.m47418a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            f41326a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m48167g() {
        if (f41327b == null) {
            return false;
        }
        try {
            Class cls = f41327b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m48169h() == null) {
                return false;
            }
            if (awg.m47418a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            f41326a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m48160d(Class<?> cls) {
        if (!awg.m47418a()) {
            return false;
        }
        try {
            Class<?> cls2 = f41328c;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: h */
    private static Field m48169h() {
        if (awg.m47418a()) {
            Field a = m48134a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m48134a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    private static Field m48134a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m48172k(Object obj, long j) {
        return (byte) (m48131a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m48173l(Object obj, long j) {
        return (byte) (m48131a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m48153c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m48139a(obj, j2, ((255 & b) << i) | (m48131a(obj, j2) & ((NormalGiftView.ALPHA_255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m48158d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m48139a(obj, j2, ((255 & b) << i) | (m48131a(obj, j2) & ((NormalGiftView.ALPHA_255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m48174m(Object obj, long j) {
        return m48172k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m48175n(Object obj, long j) {
        return m48173l(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m48159d(Object obj, long j, boolean z) {
        m48153c(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m48162e(Object obj, long j, boolean z) {
        m48158d(obj, j, z ? (byte) 1 : 0);
    }

    static {
        C15558d dVar = null;
        if (f41327b != null) {
            if (!awg.m47418a()) {
                dVar = new C15557c(f41327b);
            } else if (f41329d) {
                dVar = new C15556b(f41327b);
            } else if (f41330e) {
                dVar = new C15555a(f41327b);
            }
        }
        f41331f = dVar;
        Field h = m48169h();
        f41347v = (h == null || f41331f == null) ? -1 : f41331f.f41349a.objectFieldOffset(h);
    }
}
