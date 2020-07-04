package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16579hf;
import com.google.android.gms.internal.measurement.C16579hf.C16580a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.hf */
public abstract class C16579hf<MessageType extends C16579hf<MessageType, BuilderType>, BuilderType extends C16580a<MessageType, BuilderType>> extends C16535fq<MessageType, BuilderType> {
    private static Map<Object, C16579hf<?, ?>> zzbyf = new ConcurrentHashMap();
    protected C16652jt zzbyd = C16652jt.m54507a();
    private int zzbye = -1;

    /* renamed from: com.google.android.gms.internal.measurement.hf$a */
    public static abstract class C16580a<MessageType extends C16579hf<MessageType, BuilderType>, BuilderType extends C16580a<MessageType, BuilderType>> extends C16536fr<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f46403a;

        /* renamed from: b */
        private final MessageType f46404b;

        /* renamed from: c */
        private boolean f46405c = false;

        protected C16580a(MessageType messagetype) {
            this.f46404b = messagetype;
            this.f46403a = (C16579hf) messagetype.mo42928a(C16584e.f46410d, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo42940b() {
            if (this.f46405c) {
                MessageType messagetype = (C16579hf) this.f46403a.mo42928a(C16584e.f46410d, (Object) null, (Object) null);
                m54164a(messagetype, this.f46403a);
                this.f46403a = messagetype;
                this.f46405c = false;
            }
        }

        /* renamed from: f */
        public final boolean mo42931f() {
            return C16579hf.m54152a(this.f46403a, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public MessageType mo42941c() {
            if (this.f46405c) {
                return this.f46403a;
            }
            MessageType messagetype = this.f46403a;
            C16628iw.m54340a().mo43002a(messagetype).mo42997c(messagetype);
            this.f46405c = true;
            return this.f46403a;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public MessageType mo42942d() {
            MessageType messagetype = (C16579hf) mo42941c();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo42928a(C16584e.f46407a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C16628iw.m54340a().mo43002a(messagetype).mo42998d(messagetype);
                    if (booleanValue) {
                        messagetype.mo42928a(C16584e.f46408b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzxc(messagetype);
        }

        /* renamed from: a */
        public final BuilderType mo42729a(MessageType messagetype) {
            mo42940b();
            m54164a(this.f46403a, messagetype);
            return this;
        }

        /* renamed from: a */
        private static void m54164a(MessageType messagetype, MessageType messagetype2) {
            C16628iw.m54340a().mo43002a(messagetype).mo42996b(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final /* synthetic */ C16536fr mo42728a() {
            return (C16580a) clone();
        }

        /* renamed from: l */
        public final /* synthetic */ C16615ij mo42937l() {
            return this.f46404b;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C16580a aVar = (C16580a) ((C16579hf) this.f46404b).mo42928a(C16584e.f46411e, (Object) null, (Object) null);
            aVar.mo42729a((MessageType) (C16579hf) mo42941c());
            return aVar;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.hf$b */
    public static class C16581b<T extends C16579hf<T, ?>> extends C16537fs<T> {

        /* renamed from: a */
        private final T f46406a;

        public C16581b(T t) {
            this.f46406a = t;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo42943a(C16554gi giVar, C16565gt gtVar) throws zzuv {
            return C16579hf.m54147a(this.f46406a, giVar, gtVar);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.hf$c */
    public static abstract class C16582c<MessageType extends C16582c<MessageType, BuilderType>, BuilderType> extends C16579hf<MessageType, BuilderType> implements C16617il {
        protected C16570gx<Object> zzbyj = C16570gx.m54110a();
    }

    /* renamed from: com.google.android.gms.internal.measurement.hf$d */
    public static class C16583d<ContainingType extends C16615ij, Type> extends C16562gq<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.measurement.hf$e */
    public static final class C16584e {

        /* renamed from: a */
        public static final int f46407a = 1;

        /* renamed from: b */
        public static final int f46408b = 2;

        /* renamed from: c */
        public static final int f46409c = 3;

        /* renamed from: d */
        public static final int f46410d = 4;

        /* renamed from: e */
        public static final int f46411e = 5;

        /* renamed from: f */
        public static final int f46412f = 6;

        /* renamed from: g */
        public static final int f46413g = 7;

        /* renamed from: h */
        public static final int f46414h = 1;

        /* renamed from: i */
        public static final int f46415i = 2;

        /* renamed from: j */
        public static final int f46416j = 1;

        /* renamed from: k */
        public static final int f46417k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f46418l = {f46407a, f46408b, f46409c, f46410d, f46411e, f46412f, f46413g};

        /* renamed from: m */
        private static final /* synthetic */ int[] f46419m = {f46414h, f46415i};

        /* renamed from: n */
        private static final /* synthetic */ int[] f46420n = {f46416j, f46417k};

        /* renamed from: a */
        public static int[] m54176a() {
            return (int[]) f46418l.clone();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo42928a(int i, Object obj, Object obj2);

    public String toString() {
        return C16618im.m54278a(this, super.toString());
    }

    public int hashCode() {
        if (this.zzbti != 0) {
            return this.zzbti;
        }
        this.zzbti = C16628iw.m54340a().mo43002a(this).mo42990a(this);
        return this.zzbti;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C16579hf) mo42928a(C16584e.f46412f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C16628iw.m54340a().mo43002a(this).mo42994a(this, (C16579hf) obj);
    }

    /* renamed from: f */
    public final boolean mo42931f() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo42928a(C16584e.f46407a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C16628iw.m54340a().mo43002a(this).mo42998d(this);
        if (booleanValue) {
            mo42928a(C16584e.f46408b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    /* renamed from: g */
    public final BuilderType mo42932g() {
        BuilderType buildertype = (C16580a) mo42928a(C16584e.f46411e, (Object) null, (Object) null);
        buildertype.mo42729a(this);
        return buildertype;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo42727e() {
        return this.zzbye;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo42725a(int i) {
        this.zzbye = i;
    }

    /* renamed from: a */
    public final void mo42929a(zztv zztv) throws IOException {
        C16628iw.m54340a().mo43001a(getClass()).mo42993a(this, (C16675kl) C16560go.m54029a(zztv));
    }

    /* renamed from: h */
    public final int mo42933h() {
        if (this.zzbye == -1) {
            this.zzbye = C16628iw.m54340a().mo43002a(this).mo42995b(this);
        }
        return this.zzbye;
    }

    /* renamed from: a */
    static <T extends C16579hf<?, ?>> T m54148a(Class<T> cls) {
        T t = (C16579hf) zzbyf.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C16579hf) zzbyf.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C16579hf) ((C16579hf) C16657jy.m54544a(cls)).mo42928a(C16584e.f46412f, (Object) null, (Object) null);
            if (t != null) {
                zzbyf.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    protected static <T extends C16579hf<?, ?>> void m54151a(Class<T> cls, T t) {
        zzbyf.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m54149a(C16615ij ijVar, String str, Object[] objArr) {
        return new C16630iy(ijVar, str, objArr);
    }

    /* renamed from: a */
    static Object m54150a(Method method, Object obj, Object... objArr) {
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
    protected static final <T extends C16579hf<T, ?>> boolean m54152a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo42928a(C16584e.f46407a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return C16628iw.m54340a().mo43002a(t).mo42998d(t);
    }

    /* renamed from: i */
    protected static <E> C16590hl<E> m54153i() {
        return C16629ix.m54343d();
    }

    /* renamed from: a */
    static <T extends C16579hf<T, ?>> T m54147a(T t, C16554gi giVar, C16565gt gtVar) throws zzuv {
        T t2 = (C16579hf) t.mo42928a(C16584e.f46410d, (Object) null, (Object) null);
        try {
            C16628iw.m54340a().mo43002a(t2).mo42992a(t2, C16557gl.m53978a(giVar), gtVar);
            C16628iw.m54340a().mo43002a(t2).mo42997c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzuv) {
                throw ((zzuv) e.getCause());
            }
            throw new zzuv(e.getMessage()).zzg(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzuv) {
                throw ((zzuv) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: j */
    public final /* synthetic */ C16616ik mo42935j() {
        C16580a aVar = (C16580a) mo42928a(C16584e.f46411e, (Object) null, (Object) null);
        aVar.mo42729a(this);
        return aVar;
    }

    /* renamed from: k */
    public final /* synthetic */ C16616ik mo42936k() {
        return (C16580a) mo42928a(C16584e.f46411e, (Object) null, (Object) null);
    }

    /* renamed from: l */
    public final /* synthetic */ C16615ij mo42937l() {
        return (C16579hf) mo42928a(C16584e.f46412f, (Object) null, (Object) null);
    }
}
