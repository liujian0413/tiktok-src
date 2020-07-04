package android.support.p022v4.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.TypefaceCompatApi28Impl */
public class TypefaceCompatApi28Impl extends TypefaceCompatApi26Impl {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Typeface mo2881a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2717a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2723g.invoke(null, new Object[]{newInstance, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Method mo2882a(Class cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
