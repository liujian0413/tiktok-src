package android.support.design.widget;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import java.lang.reflect.Method;

/* renamed from: android.support.design.widget.f */
public final class C0388f {

    /* renamed from: a */
    private static Method f1673a;

    /* renamed from: b */
    private static boolean f1674b;

    /* renamed from: a */
    public static boolean m1724a(DrawableContainer drawableContainer, ConstantState constantState) {
        return m1725b(drawableContainer, constantState);
    }

    /* renamed from: b */
    private static boolean m1725b(DrawableContainer drawableContainer, ConstantState constantState) {
        if (!f1674b) {
            try {
                Method declaredMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainerState.class});
                f1673a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f1674b = true;
        }
        if (f1673a != null) {
            try {
                f1673a.invoke(drawableContainer, new Object[]{constantState});
                return true;
            } catch (Exception unused2) {
            }
        }
        return false;
    }
}
