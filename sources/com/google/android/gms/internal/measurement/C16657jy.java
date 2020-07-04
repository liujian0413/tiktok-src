package com.google.android.gms.internal.measurement;

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

/* renamed from: com.google.android.gms.internal.measurement.jy */
final class C16657jy {

    /* renamed from: a */
    private static final Logger f46536a = Logger.getLogger(C16657jy.class.getName());

    /* renamed from: b */
    private static final Unsafe f46537b = m54563c();

    /* renamed from: c */
    private static final Class<?> f46538c = C16539fu.m53896b();

    /* renamed from: d */
    private static final boolean f46539d = m54571d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f46540e = m54571d(Integer.TYPE);

    /* renamed from: f */
    private static final C16661d f46541f;

    /* renamed from: g */
    private static final boolean f46542g = m54578g();

    /* renamed from: h */
    private static final boolean f46543h = m54576f();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final long f46544i = ((long) m54557b(byte[].class));

    /* renamed from: j */
    private static final long f46545j = ((long) m54557b(boolean[].class));

    /* renamed from: k */
    private static final long f46546k = ((long) m54562c(boolean[].class));

    /* renamed from: l */
    private static final long f46547l = ((long) m54557b(int[].class));

    /* renamed from: m */
    private static final long f46548m = ((long) m54562c(int[].class));

    /* renamed from: n */
    private static final long f46549n = ((long) m54557b(long[].class));

    /* renamed from: o */
    private static final long f46550o = ((long) m54562c(long[].class));

    /* renamed from: p */
    private static final long f46551p = ((long) m54557b(float[].class));

    /* renamed from: q */
    private static final long f46552q = ((long) m54562c(float[].class));

    /* renamed from: r */
    private static final long f46553r = ((long) m54557b(double[].class));

    /* renamed from: s */
    private static final long f46554s = ((long) m54562c(double[].class));

    /* renamed from: t */
    private static final long f46555t = ((long) m54557b(Object[].class));

    /* renamed from: u */
    private static final long f46556u = ((long) m54562c(Object[].class));

    /* renamed from: v */
    private static final long f46557v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final boolean f46558w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.measurement.jy$a */
    static final class C16658a extends C16661d {
        C16658a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo43092a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: a */
        public final byte mo43091a(Object obj, long j) {
            if (C16657jy.f46558w) {
                return C16657jy.m54583k(obj, j);
            }
            return C16657jy.m54584l(obj, j);
        }

        /* renamed from: a */
        public final void mo43093a(Object obj, long j, byte b) {
            if (C16657jy.f46558w) {
                C16657jy.m54564c(obj, j, b);
            } else {
                C16657jy.m54569d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo43098b(Object obj, long j) {
            if (C16657jy.f46558w) {
                return C16657jy.m54585m(obj, j);
            }
            return C16657jy.m54586n(obj, j);
        }

        /* renamed from: a */
        public final void mo43096a(Object obj, long j, boolean z) {
            if (C16657jy.f46558w) {
                C16657jy.m54570d(obj, j, z);
            } else {
                C16657jy.m54573e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo43099c(Object obj, long j) {
            return Float.intBitsToFloat(mo43103e(obj, j));
        }

        /* renamed from: a */
        public final void mo43095a(Object obj, long j, float f) {
            mo43101a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo43100d(Object obj, long j) {
            return Double.longBitsToDouble(mo43104f(obj, j));
        }

        /* renamed from: a */
        public final void mo43094a(Object obj, long j, double d) {
            mo43102a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo43097a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.jy$b */
    static final class C16659b extends C16661d {
        C16659b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo43092a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final byte mo43091a(Object obj, long j) {
            if (C16657jy.f46558w) {
                return C16657jy.m54583k(obj, j);
            }
            return C16657jy.m54584l(obj, j);
        }

        /* renamed from: a */
        public final void mo43093a(Object obj, long j, byte b) {
            if (C16657jy.f46558w) {
                C16657jy.m54564c(obj, j, b);
            } else {
                C16657jy.m54569d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo43098b(Object obj, long j) {
            if (C16657jy.f46558w) {
                return C16657jy.m54585m(obj, j);
            }
            return C16657jy.m54586n(obj, j);
        }

        /* renamed from: a */
        public final void mo43096a(Object obj, long j, boolean z) {
            if (C16657jy.f46558w) {
                C16657jy.m54570d(obj, j, z);
            } else {
                C16657jy.m54573e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo43099c(Object obj, long j) {
            return Float.intBitsToFloat(mo43103e(obj, j));
        }

        /* renamed from: a */
        public final void mo43095a(Object obj, long j, float f) {
            mo43101a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo43100d(Object obj, long j) {
            return Double.longBitsToDouble(mo43104f(obj, j));
        }

        /* renamed from: a */
        public final void mo43094a(Object obj, long j, double d) {
            mo43102a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo43097a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.jy$c */
    static final class C16660c extends C16661d {
        C16660c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo43092a(long j, byte b) {
            this.f46559a.putByte(j, b);
        }

        /* renamed from: a */
        public final byte mo43091a(Object obj, long j) {
            return this.f46559a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo43093a(Object obj, long j, byte b) {
            this.f46559a.putByte(obj, j, b);
        }

        /* renamed from: b */
        public final boolean mo43098b(Object obj, long j) {
            return this.f46559a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public final void mo43096a(Object obj, long j, boolean z) {
            this.f46559a.putBoolean(obj, j, z);
        }

        /* renamed from: c */
        public final float mo43099c(Object obj, long j) {
            return this.f46559a.getFloat(obj, j);
        }

        /* renamed from: a */
        public final void mo43095a(Object obj, long j, float f) {
            this.f46559a.putFloat(obj, j, f);
        }

        /* renamed from: d */
        public final double mo43100d(Object obj, long j) {
            return this.f46559a.getDouble(obj, j);
        }

        /* renamed from: a */
        public final void mo43094a(Object obj, long j, double d) {
            this.f46559a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo43097a(byte[] bArr, long j, long j2, long j3) {
            this.f46559a.copyMemory(bArr, C16657jy.f46544i + j, null, j2, j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.jy$d */
    static abstract class C16661d {

        /* renamed from: a */
        Unsafe f46559a;

        C16661d(Unsafe unsafe) {
            this.f46559a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo43091a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo43092a(long j, byte b);

        /* renamed from: a */
        public abstract void mo43093a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo43094a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo43095a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo43096a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo43097a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public abstract boolean mo43098b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo43099c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo43100d(Object obj, long j);

        /* renamed from: e */
        public final int mo43103e(Object obj, long j) {
            return this.f46559a.getInt(obj, j);
        }

        /* renamed from: a */
        public final void mo43101a(Object obj, long j, int i) {
            this.f46559a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final long mo43104f(Object obj, long j) {
            return this.f46559a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void mo43102a(Object obj, long j, long j2) {
            this.f46559a.putLong(obj, j, j2);
        }
    }

    private C16657jy() {
    }

    /* renamed from: a */
    static boolean m54556a() {
        return f46543h;
    }

    /* renamed from: b */
    static boolean m54561b() {
        return f46542g;
    }

    /* renamed from: a */
    static <T> T m54544a(Class<T> cls) {
        try {
            return f46537b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static int m54557b(Class<?> cls) {
        if (f46543h) {
            return f46541f.f46559a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: c */
    private static int m54562c(Class<?> cls) {
        if (f46543h) {
            return f46541f.f46559a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m54542a(Object obj, long j) {
        return f46541f.mo43103e(obj, j);
    }

    /* renamed from: a */
    static void m54550a(Object obj, long j, int i) {
        f46541f.mo43101a(obj, j, i);
    }

    /* renamed from: b */
    static long m54558b(Object obj, long j) {
        return f46541f.mo43104f(obj, j);
    }

    /* renamed from: a */
    static void m54551a(Object obj, long j, long j2) {
        f46541f.mo43102a(obj, j, j2);
    }

    /* renamed from: c */
    static boolean m54566c(Object obj, long j) {
        return f46541f.mo43098b(obj, j);
    }

    /* renamed from: a */
    static void m54553a(Object obj, long j, boolean z) {
        f46541f.mo43096a(obj, j, z);
    }

    /* renamed from: d */
    static float m54567d(Object obj, long j) {
        return f46541f.mo43099c(obj, j);
    }

    /* renamed from: a */
    static void m54549a(Object obj, long j, float f) {
        f46541f.mo43095a(obj, j, f);
    }

    /* renamed from: e */
    static double m54572e(Object obj, long j) {
        return f46541f.mo43100d(obj, j);
    }

    /* renamed from: a */
    static void m54548a(Object obj, long j, double d) {
        f46541f.mo43094a(obj, j, d);
    }

    /* renamed from: f */
    static Object m54575f(Object obj, long j) {
        return f46541f.f46559a.getObject(obj, j);
    }

    /* renamed from: a */
    static void m54552a(Object obj, long j, Object obj2) {
        f46541f.f46559a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m54541a(byte[] bArr, long j) {
        return f46541f.mo43091a((Object) bArr, f46544i + j);
    }

    /* renamed from: a */
    static void m54554a(byte[] bArr, long j, byte b) {
        f46541f.mo43093a((Object) bArr, f46544i + j, b);
    }

    /* renamed from: a */
    static void m54555a(byte[] bArr, long j, long j2, long j3) {
        f46541f.mo43097a(bArr, j, j2, j3);
    }

    /* renamed from: a */
    static void m54546a(long j, byte b) {
        f46541f.mo43092a(j, b);
    }

    /* renamed from: a */
    static long m54543a(ByteBuffer byteBuffer) {
        return f46541f.mo43104f(byteBuffer, f46557v);
    }

    /* renamed from: c */
    static Unsafe m54563c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C16662jz());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static boolean m54576f() {
        if (f46537b == null) {
            return false;
        }
        try {
            Class cls = f46537b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C16539fu.m53895a()) {
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
            f46536a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m54578g() {
        if (f46537b == null) {
            return false;
        }
        try {
            Class cls = f46537b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m54580h() == null) {
                return false;
            }
            if (C16539fu.m53895a()) {
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
            f46536a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m54571d(Class<?> cls) {
        if (!C16539fu.m53895a()) {
            return false;
        }
        try {
            Class<?> cls2 = f46538c;
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
    private static Field m54580h() {
        if (C16539fu.m53895a()) {
            Field a = m54545a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m54545a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    private static Field m54545a(Class<?> cls, String str) {
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
    public static byte m54583k(Object obj, long j) {
        return (byte) (m54542a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m54584l(Object obj, long j) {
        return (byte) (m54542a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m54564c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m54550a(obj, j2, ((255 & b) << i) | (m54542a(obj, j2) & ((NormalGiftView.ALPHA_255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m54569d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m54550a(obj, j2, ((255 & b) << i) | (m54542a(obj, j2) & ((NormalGiftView.ALPHA_255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m54585m(Object obj, long j) {
        return m54583k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m54586n(Object obj, long j) {
        return m54584l(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m54570d(Object obj, long j, boolean z) {
        m54564c(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m54573e(Object obj, long j, boolean z) {
        m54569d(obj, j, z ? (byte) 1 : 0);
    }

    static {
        C16661d dVar = null;
        if (f46537b != null) {
            if (!C16539fu.m53895a()) {
                dVar = new C16660c(f46537b);
            } else if (f46539d) {
                dVar = new C16659b(f46537b);
            } else if (f46540e) {
                dVar = new C16658a(f46537b);
            }
        }
        f46541f = dVar;
        Field h = m54580h();
        f46557v = (h == null || f46541f == null) ? -1 : f46541f.f46559a.objectFieldOffset(h);
    }
}
