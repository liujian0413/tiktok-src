package android.arch.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.arch.lifecycle.w */
public final class C0065w {

    /* renamed from: a */
    private final C0067b f113a;

    /* renamed from: b */
    private final C0070y f114b;

    /* renamed from: android.arch.lifecycle.w$a */
    public static class C0066a extends C0068c {

        /* renamed from: a */
        private static C0066a f115a;

        /* renamed from: b */
        private Application f116b;

        private C0066a(Application application) {
            this.f116b = application;
        }

        /* renamed from: a */
        public static C0066a m152a(Application application) {
            if (f115a == null) {
                f115a = new C0066a(application);
            }
            return f115a;
        }

        /* renamed from: a */
        public final <T extends C0063u> T mo149a(Class<T> cls) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.mo149a(cls);
            }
            try {
                return (C0063u) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f116b});
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder("Cannot create an instance of ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder("Cannot create an instance of ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (InstantiationException e3) {
                StringBuilder sb3 = new StringBuilder("Cannot create an instance of ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb4 = new StringBuilder("Cannot create an instance of ");
                sb4.append(cls);
                throw new RuntimeException(sb4.toString(), e4);
            }
        }
    }

    /* renamed from: android.arch.lifecycle.w$b */
    public interface C0067b {
        /* renamed from: a */
        <T extends C0063u> T mo149a(Class<T> cls);
    }

    /* renamed from: android.arch.lifecycle.w$c */
    public static class C0068c implements C0067b {
        /* renamed from: a */
        public <T extends C0063u> T mo149a(Class<T> cls) {
            try {
                return (C0063u) cls.newInstance();
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder("Cannot create an instance of ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder("Cannot create an instance of ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
    }

    /* renamed from: a */
    public final <T extends C0063u> T mo147a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return mo148a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C0065w(C0070y yVar, C0067b bVar) {
        this.f113a = bVar;
        this.f114b = yVar;
    }

    /* renamed from: a */
    public final <T extends C0063u> T mo148a(String str, Class<T> cls) {
        T a = this.f114b.mo150a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        T a2 = this.f113a.mo149a(cls);
        this.f114b.mo152a(str, a2);
        return a2;
    }
}
