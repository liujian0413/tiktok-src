package android.support.transition;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.transition.z */
final class C0532z {

    /* renamed from: a */
    private static LayoutTransition f2089a;

    /* renamed from: b */
    private static Field f2090b;

    /* renamed from: c */
    private static boolean f2091c;

    /* renamed from: d */
    private static Method f2092d;

    /* renamed from: e */
    private static boolean f2093e;

    /* renamed from: a */
    private static void m2230a(LayoutTransition layoutTransition) {
        if (!f2093e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f2092d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2093e = true;
        }
        if (f2092d != null) {
            try {
                f2092d.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException unused3) {
            }
        }
    }

    /* renamed from: a */
    static void m2231a(ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (f2089a == null) {
            C05331 r0 = new LayoutTransition() {
                public final boolean isChangingLayout() {
                    return true;
                }
            };
            f2089a = r0;
            r0.setAnimator(2, null);
            f2089a.setAnimator(0, null);
            f2089a.setAnimator(1, null);
            f2089a.setAnimator(3, null);
            f2089a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    m2230a(layoutTransition);
                }
                if (layoutTransition != f2089a) {
                    viewGroup.setTag(R.id.dnh, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f2089a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f2091c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f2090b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2091c = true;
        }
        if (f2090b != null) {
            try {
                boolean z3 = f2090b.getBoolean(viewGroup);
                if (z3) {
                    try {
                        f2090b.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(R.id.dnh);
        if (layoutTransition2 != null) {
            viewGroup.setTag(R.id.dnh, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
