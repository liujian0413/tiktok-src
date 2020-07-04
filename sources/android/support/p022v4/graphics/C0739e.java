package android.support.p022v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p022v4.content.res.FontResourcesParserCompat.C0694b;
import android.support.p022v4.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import android.support.p022v4.p025c.C0658b.C0664b;
import android.support.p022v4.util.C0904k;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: android.support.v4.graphics.e */
final class C0739e extends C0740f {

    /* renamed from: a */
    private static final Class f2770a;

    /* renamed from: b */
    private static final Constructor f2771b;

    /* renamed from: c */
    private static final Method f2772c;

    /* renamed from: d */
    private static final Method f2773d;

    C0739e() {
    }

    /* renamed from: a */
    public static boolean m3141a() {
        if (f2772c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static Object m3143b() {
        try {
            return f2771b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method2 = null;
            method = null;
        }
        f2771b = constructor;
        f2770a = cls;
        f2772c = method;
        f2773d = method2;
    }

    /* renamed from: a */
    private static Typeface m3140a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2770a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2773d.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final Typeface mo2879a(Context context, CancellationSignal cancellationSignal, C0664b[] bVarArr, int i) {
        Object b = m3143b();
        C0904k kVar = new C0904k();
        for (C0664b bVar : bVarArr) {
            Uri uri = bVar.f2559a;
            ByteBuffer byteBuffer = (ByteBuffer) kVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C0744g.m3165a(context, cancellationSignal, uri);
                kVar.put(uri, byteBuffer);
            }
            if (!m3142a(b, byteBuffer, bVar.f2560b, bVar.f2561c, bVar.f2562d)) {
                return null;
            }
        }
        return Typeface.create(m3140a(b), i);
    }

    /* renamed from: a */
    public final Typeface mo2880a(Context context, FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        C0694b[] bVarArr;
        Object b = m3143b();
        for (C0694b bVar : fontFamilyFilesResourceEntry.f2650a) {
            ByteBuffer a = C0744g.m3164a(context, resources, bVar.f2659f);
            if (a == null || !m3142a(b, a, bVar.f2658e, bVar.f2655b, bVar.f2656c)) {
                return null;
            }
        }
        return m3140a(b);
    }

    /* renamed from: a */
    private static boolean m3142a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2772c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
