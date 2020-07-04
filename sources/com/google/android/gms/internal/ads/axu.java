package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu;
import com.google.android.gms.internal.ads.axu.C15546a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class axu<MessageType extends axu<MessageType, BuilderType>, BuilderType extends C15546a<MessageType, BuilderType>> extends awc<MessageType, BuilderType> {
    private static Map<Object, axu<?, ?>> zzfzc = new ConcurrentHashMap();
    protected bal zzfza = bal.m48096a();
    private int zzfzb = -1;

    /* renamed from: com.google.android.gms.internal.ads.axu$a */
    public static abstract class C15546a<MessageType extends axu<MessageType, BuilderType>, BuilderType extends C15546a<MessageType, BuilderType>> extends awd<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f41195a;

        /* renamed from: b */
        private final MessageType f41196b;

        /* renamed from: c */
        private boolean f41197c = false;

        protected C15546a(MessageType messagetype) {
            this.f41196b = messagetype;
            this.f41195a = (axu) messagetype.mo39285a(C15550e.f41202d, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo40291c() {
            if (this.f41197c) {
                MessageType messagetype = (axu) this.f41195a.mo39285a(C15550e.f41202d, (Object) null, (Object) null);
                m47717a(messagetype, this.f41195a);
                this.f41195a = messagetype;
                this.f41197c = false;
            }
        }

        /* renamed from: i */
        public final boolean mo40284i() {
            return axu.m47704a(this.f41195a, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MessageType mo40292d() {
            if (this.f41197c) {
                return this.f41195a;
            }
            MessageType messagetype = this.f41195a;
            azo.m47917a().mo40357a(messagetype).mo40352c(messagetype);
            this.f41197c = true;
            return this.f41195a;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public MessageType mo40293e() {
            MessageType messagetype = (axu) mo40292d();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo39285a(C15550e.f41199a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = azo.m47917a().mo40357a(messagetype).mo40353d(messagetype);
                    if (booleanValue) {
                        messagetype.mo39285a(C15550e.f41200b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzcgf(messagetype);
        }

        /* renamed from: a */
        public final BuilderType mo40084a(MessageType messagetype) {
            mo40291c();
            m47717a(this.f41195a, messagetype);
            return this;
        }

        /* renamed from: a */
        private static void m47717a(MessageType messagetype, MessageType messagetype2) {
            azo.m47917a().mo40357a(messagetype).mo40351b(messagetype, messagetype2);
        }

        /* renamed from: b */
        private final BuilderType m47719b(byte[] bArr, int i, int i2, axi axi) throws zzcdx {
            mo40291c();
            try {
                azo.m47917a().mo40357a(this.f41195a).mo40348a(this.f41195a, bArr, 0, i2 + 0, new awj(axi));
                return this;
            } catch (zzcdx e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw zzcdx.zzatu();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final BuilderType mo40085a(awx awx, axi axi) throws IOException {
            mo40291c();
            try {
                azo.m47917a().mo40357a(this.f41195a).mo40346a(this.f41195a, axa.m47526a(awx), axi);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: a */
        public final /* synthetic */ awd mo40086a(byte[] bArr, int i, int i2, axi axi) throws zzcdx {
            return m47719b(bArr, 0, i2, axi);
        }

        /* renamed from: b */
        public final /* synthetic */ awd mo40088b() {
            return (C15546a) clone();
        }

        /* renamed from: o */
        public final /* synthetic */ aza mo40288o() {
            return this.f41196b;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C15546a aVar = (C15546a) ((axu) this.f41196b).mo39285a(C15550e.f41203e, (Object) null, (Object) null);
            aVar.mo40084a((MessageType) (axu) mo40292d());
            return aVar;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.axu$b */
    public static class C15547b<T extends axu<T, ?>> extends awe<T> {

        /* renamed from: a */
        private final T f41198a;

        public C15547b(T t) {
            this.f41198a = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.axu$c */
    public static abstract class C15548c<MessageType extends C15548c<MessageType, BuilderType>, BuilderType> extends axu<MessageType, BuilderType> implements azc {
        protected axm<Object> zzfzg = axm.m47658a();
    }

    /* renamed from: com.google.android.gms.internal.ads.axu$d */
    public static class C15549d<ContainingType extends aza, Type> extends axf<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.ads.axu$e */
    public static final class C15550e {

        /* renamed from: a */
        public static final int f41199a = 1;

        /* renamed from: b */
        public static final int f41200b = 2;

        /* renamed from: c */
        public static final int f41201c = 3;

        /* renamed from: d */
        public static final int f41202d = 4;

        /* renamed from: e */
        public static final int f41203e = 5;

        /* renamed from: f */
        public static final int f41204f = 6;

        /* renamed from: g */
        public static final int f41205g = 7;

        /* renamed from: h */
        public static final int f41206h = 1;

        /* renamed from: i */
        public static final int f41207i = 2;

        /* renamed from: j */
        public static final int f41208j = 1;

        /* renamed from: k */
        public static final int f41209k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f41210l = {f41199a, f41200b, f41201c, f41202d, f41203e, f41204f, f41205g};

        /* renamed from: m */
        private static final /* synthetic */ int[] f41211m = {f41206h, f41207i};

        /* renamed from: n */
        private static final /* synthetic */ int[] f41212n = {f41208j, f41209k};

        /* renamed from: a */
        public static int[] m47731a() {
            return (int[]) f41210l.clone();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo39285a(int i, Object obj, Object obj2);

    public String toString() {
        return aze.m47846a(this, super.toString());
    }

    public int hashCode() {
        if (this.zzfuc != 0) {
            return this.zzfuc;
        }
        this.zzfuc = azo.m47917a().mo40357a(this).mo40343a(this);
        return this.zzfuc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((axu) mo39285a(C15550e.f41204f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return azo.m47917a().mo40357a(this).mo40349a(this, (axu) obj);
    }

    /* renamed from: i */
    public final boolean mo40284i() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo39285a(C15550e.f41199a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = azo.m47917a().mo40357a(this).mo40353d(this);
        if (booleanValue) {
            mo39285a(C15550e.f41200b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final int mo40083h() {
        return this.zzfzb;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo40080a(int i) {
        this.zzfzb = i;
    }

    /* renamed from: a */
    public final void mo40281a(zzccv zzccv) throws IOException {
        azo.m47917a().mo40356a(getClass()).mo40347a(this, (bbe) axd.m47577a(zzccv));
    }

    /* renamed from: j */
    public final int mo40285j() {
        if (this.zzfzb == -1) {
            this.zzfzb = azo.m47917a().mo40357a(this).mo40350b(this);
        }
        return this.zzfzb;
    }

    /* renamed from: a */
    static <T extends axu<?, ?>> T m47700a(Class<T> cls) {
        T t = (axu) zzfzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (axu) zzfzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (axu) ((axu) baq.m48133a(cls)).mo39285a(C15550e.f41204f, (Object) null, (Object) null);
            if (t != null) {
                zzfzc.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    protected static <T extends axu<?, ?>> void m47703a(Class<T> cls, T t) {
        zzfzc.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m47701a(aza aza, String str, Object[] objArr) {
        return new azq(aza, str, objArr);
    }

    /* renamed from: a */
    static Object m47702a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static final <T extends axu<T, ?>> boolean m47704a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo39285a(C15550e.f41199a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return azo.m47917a().mo40357a(t).mo40353d(t);
    }

    /* renamed from: k */
    protected static aya m47705k() {
        return axv.m47733d();
    }

    /* renamed from: l */
    protected static <E> ayc<E> m47706l() {
        return azp.m47920d();
    }

    /* renamed from: a */
    private static <T extends axu<T, ?>> T m47694a(T t, awx awx, axi axi) throws zzcdx {
        T t2 = (axu) t.mo39285a(C15550e.f41202d, (Object) null, (Object) null);
        try {
            azo.m47917a().mo40357a(t2).mo40346a(t2, axa.m47526a(awx), axi);
            azo.m47917a().mo40357a(t2).mo40352c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzcdx) {
                throw ((zzcdx) e.getCause());
            }
            throw new zzcdx(e.getMessage()).zzk(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzcdx) {
                throw ((zzcdx) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    private static <T extends axu<T, ?>> T m47698a(T t, byte[] bArr, int i, int i2, axi axi) throws zzcdx {
        T t2 = (axu) t.mo39285a(C15550e.f41202d, (Object) null, (Object) null);
        try {
            azo.m47917a().mo40357a(t2).mo40348a(t2, bArr, 0, i2, new awj(axi));
            azo.m47917a().mo40357a(t2).mo40352c(t2);
            if (t2.zzfuc == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzcdx) {
                throw ((zzcdx) e.getCause());
            }
            throw new zzcdx(e.getMessage()).zzk(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzcdx.zzatu().zzk(t2);
        }
    }

    /* renamed from: a */
    protected static <T extends axu<T, ?>> T m47695a(T t, zzcce zzcce) throws zzcdx {
        boolean z;
        T a = m47696a(t, zzcce, axi.m47629a());
        boolean z2 = false;
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo39285a(C15550e.f41199a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                z = azo.m47917a().mo40357a(a).mo40353d(a);
                if (booleanValue) {
                    a.mo39285a(C15550e.f41200b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                throw new zzcgf(a).zzavo().zzk(a);
            }
        }
        if (a != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) a.mo39285a(C15550e.f41199a, (Object) null, (Object) null)).byteValue();
            if (byteValue2 == 1) {
                z2 = true;
            } else if (byteValue2 != 0) {
                z2 = azo.m47917a().mo40357a(a).mo40353d(a);
                if (booleanValue2) {
                    a.mo39285a(C15550e.f41200b, (Object) z2 ? a : null, (Object) null);
                }
            }
            if (!z2) {
                throw new zzcgf(a).zzavo().zzk(a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static <T extends axu<T, ?>> T m47696a(T t, zzcce zzcce, axi axi) throws zzcdx {
        T a;
        try {
            awx zzarg = zzcce.zzarg();
            a = m47694a(t, zzarg, axi);
            zzarg.mo40132a(0);
            return a;
        } catch (zzcdx e) {
            throw e.zzk(a);
        } catch (zzcdx e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    protected static <T extends axu<T, ?>> T m47697a(T t, byte[] bArr) throws zzcdx {
        boolean z = false;
        T a = m47698a(t, bArr, 0, bArr.length, axi.m47629a());
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo39285a(C15550e.f41199a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = azo.m47917a().mo40357a(a).mo40353d(a);
                if (booleanValue) {
                    a.mo39285a(C15550e.f41200b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                throw new zzcgf(a).zzavo().zzk(a);
            }
        }
        return a;
    }

    /* renamed from: a */
    protected static <T extends axu<T, ?>> T m47699a(T t, byte[] bArr, axi axi) throws zzcdx {
        boolean z = false;
        T a = m47698a(t, bArr, 0, bArr.length, axi);
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo39285a(C15550e.f41199a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = azo.m47917a().mo40357a(a).mo40353d(a);
                if (booleanValue) {
                    a.mo39285a(C15550e.f41200b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                throw new zzcgf(a).zzavo().zzk(a);
            }
        }
        return a;
    }

    /* renamed from: m */
    public final /* synthetic */ azb mo40286m() {
        C15546a aVar = (C15546a) mo39285a(C15550e.f41203e, (Object) null, (Object) null);
        aVar.mo40084a(this);
        return aVar;
    }

    /* renamed from: n */
    public final /* synthetic */ azb mo40287n() {
        return (C15546a) mo39285a(C15550e.f41203e, (Object) null, (Object) null);
    }

    /* renamed from: o */
    public final /* synthetic */ aza mo40288o() {
        return (axu) mo39285a(C15550e.f41204f, (Object) null, (Object) null);
    }
}
