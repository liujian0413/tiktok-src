package android.support.p022v4.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.p022v4.content.res.FontResourcesParserCompat.C0694b;
import android.support.p022v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import android.support.p022v4.p025c.C0658b;
import android.support.p022v4.p025c.C0658b.C0664b;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: android.support.v4.graphics.TypefaceCompatApi26Impl */
public class TypefaceCompatApi26Impl extends C0726d {

    /* renamed from: a */
    protected final Class f2717a;

    /* renamed from: b */
    protected final Constructor f2718b;

    /* renamed from: c */
    protected final Method f2719c;

    /* renamed from: d */
    protected final Method f2720d;

    /* renamed from: e */
    protected final Method f2721e;

    /* renamed from: f */
    protected final Method f2722f;

    /* renamed from: g */
    protected final Method f2723g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo2882a(Class cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: a */
    private boolean m3045a() {
        if (this.f2719c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static Class m3051c() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: b */
    private Object m3048b() {
        try {
            return this.f2718b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public TypefaceCompatApi26Impl() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor constructor;
        Class cls = null;
        try {
            Class c = m3051c();
            constructor = m3049b(c);
            method5 = m3052c(c);
            method4 = m3054d(c);
            method3 = m3055e(c);
            method2 = m3056f(c);
            method = mo2882a(c);
            cls = c;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f2717a = cls;
        this.f2718b = constructor;
        this.f2719c = method5;
        this.f2720d = method4;
        this.f2721e = method3;
        this.f2722f = method2;
        this.f2723g = method;
    }

    /* renamed from: b */
    private static Constructor m3049b(Class cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: c */
    private void m3053c(Object obj) {
        try {
            this.f2722f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    private static Method m3055e(Class cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: f */
    private static Method m3056f(Class cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: b */
    private boolean m3050b(Object obj) {
        try {
            return ((Boolean) this.f2721e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static Method m3052c(Class cls) throws NoSuchMethodException {
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
    }

    /* renamed from: d */
    private static Method m3054d(Class cls) throws NoSuchMethodException {
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo2881a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2717a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2723g.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final Typeface mo2879a(Context context, CancellationSignal cancellationSignal, C0664b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        Throwable th2;
        if (bVarArr.length <= 0) {
            return null;
        }
        if (!m3045a()) {
            C0664b a = mo2945a(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(a.f2559a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Builder(openFileDescriptor.getFileDescriptor()).setWeight(a.f2561c).setItalic(a.f2562d).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    th = r12;
                    th2 = th4;
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map a2 = C0658b.m2844a(context, bVarArr, cancellationSignal);
            Object b = m3048b();
            boolean z = false;
            for (C0664b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) a2.get(bVar.f2559a);
                if (byteBuffer != null) {
                    if (!m3047a(b, byteBuffer, bVar.f2560b, bVar.f2561c, bVar.f2562d ? 1 : 0)) {
                        m3053c(b);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m3053c(b);
                return null;
            } else if (!m3050b(b)) {
                return null;
            } else {
                return Typeface.create(mo2881a(b), i);
            }
        }
        if (openFileDescriptor != null) {
            if (th != null) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th5) {
                    C6497a.m20181a(th, th5);
                }
            } else {
                openFileDescriptor.close();
            }
        }
        throw th2;
        throw th2;
    }

    /* renamed from: a */
    public final Typeface mo2880a(Context context, FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        C0694b[] bVarArr;
        if (!m3045a()) {
            return super.mo2880a(context, fontFamilyFilesResourceEntry, resources, i);
        }
        Object b = m3048b();
        for (C0694b bVar : fontFamilyFilesResourceEntry.f2650a) {
            if (!m3046a(context, b, bVar.f2654a, bVar.f2658e, bVar.f2655b, bVar.f2656c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(bVar.f2657d))) {
                m3053c(b);
                return null;
            }
        }
        if (!m3050b(b)) {
            return null;
        }
        return mo2881a(b);
    }

    /* renamed from: a */
    private boolean m3047a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f2720d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final Typeface mo2878a(Context context, Resources resources, int i, String str, int i2) {
        if (!m3045a()) {
            return super.mo2878a(context, resources, i, str, i2);
        }
        Object b = m3048b();
        if (!m3046a(context, b, str, 0, -1, -1, null)) {
            m3053c(b);
            return null;
        } else if (!m3050b(b)) {
            return null;
        } else {
            return mo2881a(b);
        }
    }

    /* renamed from: a */
    private boolean m3046a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2719c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
