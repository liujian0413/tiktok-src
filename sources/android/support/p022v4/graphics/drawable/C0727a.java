package android.support.p022v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.graphics.drawable.a */
public final class C0727a {

    /* renamed from: a */
    private static Method f2741a;

    /* renamed from: b */
    private static boolean f2742b;

    /* renamed from: c */
    private static Method f2743c;

    /* renamed from: d */
    private static boolean f2744d;

    /* renamed from: a */
    public static void m3101a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: b */
    public static boolean m3110b(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: c */
    public static int m3112c(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m3113d(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: e */
    public static ColorFilter m3114e(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: h */
    public static <T extends Drawable> T m3117h(Drawable drawable) {
        if (drawable instanceof C0733f) {
            return ((C0733f) drawable).mo2904a();
        }
        return drawable;
    }

    /* renamed from: g */
    public static Drawable m3116g(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (VERSION.SDK_INT >= 21) {
            if (!(drawable instanceof C0732e)) {
                return new C0737h(drawable);
            }
            return drawable;
        } else if (!(drawable instanceof C0732e)) {
            return new C0734g(drawable);
        } else {
            return drawable;
        }
    }

    /* renamed from: i */
    public static int m3118i(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (VERSION.SDK_INT < 17) {
            return 0;
        }
        if (!f2744d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f2743c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2744d = true;
        }
        if (f2743c != null) {
            try {
                return ((Integer) f2743c.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                f2743c = null;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static void m3115f(Drawable drawable) {
        if (VERSION.SDK_INT >= 23 || VERSION.SDK_INT < 21) {
            drawable.clearColorFilter();
        } else {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m3115f(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof C0733f) {
                m3115f(((C0733f) drawable).mo2904a());
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Drawable child = drawableContainerState.getChild(i);
                        if (child != null) {
                            m3115f(child);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3103a(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
            return;
        }
        if (drawable instanceof C0732e) {
            ((C0732e) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m3105a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
            return;
        }
        if (drawable instanceof C0732e) {
            ((C0732e) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: b */
    public static boolean m3111b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!f2742b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f2741a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f2742b = true;
        }
        if (f2741a != null) {
            try {
                f2741a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception unused2) {
                f2741a = null;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m3106a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static void m3108a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
            return;
        }
        if (drawable instanceof C0732e) {
            ((C0732e) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m3109a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: a */
    public static void m3102a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m3104a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m3107a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }
}
