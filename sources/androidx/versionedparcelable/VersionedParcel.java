package androidx.versionedparcelable;

import android.os.Parcelable;
import com.C1642a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.lang.reflect.InvocationTargetException;

public abstract class VersionedParcel {

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6640a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6641a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6643a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6647a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6649a(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract VersionedParcel mo6653b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo6656b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo6658c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo6659c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo6660d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract byte[] mo6661e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract <T extends Parcelable> T mo6662f();

    /* renamed from: a */
    public final void mo6650a(byte[] bArr, int i) {
        mo6659c(2);
        mo6649a(bArr);
    }

    /* renamed from: a */
    public final void mo6648a(String str, int i) {
        mo6659c(7);
        mo6647a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final <T extends C1447b> T mo6663g() {
        String d = mo6660d();
        if (d == null) {
            return null;
        }
        return m7249a(d, mo6653b());
    }

    /* renamed from: c */
    private static <T extends C1447b> Class m7253c(T t) throws ClassNotFoundException {
        return m7250a(t.getClass());
    }

    /* renamed from: a */
    private static Class m7250a(Class<? extends C1447b> cls) throws ClassNotFoundException {
        return Class.forName(C1642a.m8034a("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }

    /* renamed from: b */
    private void m7252b(C1447b bVar) {
        try {
            mo6647a(m7250a(bVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6645a(C1447b bVar) {
        if (bVar == null) {
            mo6647a((String) null);
            return;
        }
        m7252b(bVar);
        VersionedParcel b = mo6653b();
        m7251a((T) bVar, b);
        b.mo6640a();
    }

    /* renamed from: a */
    public final void mo6642a(int i, int i2) {
        mo6659c(i2);
        mo6641a(i);
    }

    /* renamed from: b */
    public final int mo6651b(int i, int i2) {
        if (!mo6656b(i2)) {
            return i;
        }
        return mo6658c();
    }

    /* renamed from: b */
    public final <T extends Parcelable> T mo6652b(T t, int i) {
        if (!mo6656b(i)) {
            return t;
        }
        return mo6662f();
    }

    /* renamed from: a */
    private static <T extends C1447b> T m7249a(String str, VersionedParcel versionedParcel) {
        try {
            return (C1447b) Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", new Class[]{VersionedParcel.class}).invoke(null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    public final <T extends C1447b> T mo6654b(T t, int i) {
        if (!mo6656b(1)) {
            return t;
        }
        return mo6663g();
    }

    /* renamed from: a */
    private static <T extends C1447b> void m7251a(T t, VersionedParcel versionedParcel) {
        try {
            m7253c(t).getDeclaredMethod(C38347c.f99550e, new Class[]{t.getClass(), VersionedParcel.class}).invoke(null, new Object[]{t, versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    public final String mo6655b(String str, int i) {
        if (!mo6656b(7)) {
            return str;
        }
        return mo6660d();
    }

    /* renamed from: a */
    public final void mo6644a(Parcelable parcelable, int i) {
        mo6659c(i);
        mo6643a(parcelable);
    }

    /* renamed from: b */
    public final byte[] mo6657b(byte[] bArr, int i) {
        if (!mo6656b(2)) {
            return bArr;
        }
        return mo6661e();
    }

    /* renamed from: a */
    public final void mo6646a(C1447b bVar, int i) {
        mo6659c(1);
        mo6645a(bVar);
    }
}
