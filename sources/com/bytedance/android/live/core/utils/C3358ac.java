package com.bytedance.android.live.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.utils.ac */
public final class C3358ac {
    /* renamed from: a */
    public static Resources m12513a() {
        Context e = m12528e();
        if (e == null) {
            return null;
        }
        return e.getResources();
    }

    /* renamed from: c */
    public static int m12523c() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* renamed from: b */
    public static int m12520b() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: e */
    public static Context m12528e() {
        IHostContext iHostContext = (IHostContext) C3596c.m13172a(IHostContext.class);
        if (iHostContext != null) {
            return iHostContext.context();
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m12529f() {
        if (m12513a() == null || m12513a().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final int m12525d() {
        int i;
        Context e = m12528e();
        if (e == null) {
            i = 0;
        } else {
            i = e.getResources().getIdentifier("status_bar_height", "dimen", "android");
        }
        if (i > 0) {
            return e.getResources().getDimensionPixelSize(i);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m12511a(Activity activity) {
        return m12522b(activity).heightPixels;
    }

    /* renamed from: b */
    public static float m12519b(float f) {
        return TypedValue.applyDimension(2, f, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: e */
    public static float m12527e(int i) {
        return ((float) i) / Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public static int m12510a(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static Drawable m12524c(int i) {
        Context e = m12528e();
        if (e == null || e.getResources() == null) {
            return null;
        }
        return e.getResources().getDrawable(i);
    }

    /* renamed from: d */
    public static int m12526d(int i) {
        Context e = m12528e();
        if (e == null || e.getResources() == null) {
            return 0;
        }
        return (int) e.getResources().getDimension(i);
    }

    /* renamed from: b */
    public static int m12521b(int i) {
        Context e = m12528e();
        if (e == null || e.getResources() == null) {
            return 0;
        }
        return e.getResources().getColor(i);
    }

    /* renamed from: f */
    public static String[] m12530f(int i) {
        Context e = m12528e();
        if (e == null) {
            return new String[0];
        }
        return e.getResources().getStringArray(i);
    }

    /* renamed from: a */
    public static Bitmap m12514a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawCircle((float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2), (float) (bitmap.getWidth() / 2), paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* renamed from: b */
    private static DisplayMetrics m12522b(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (VERSION.SDK_INT >= 17) {
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            try {
                Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            } catch (Exception unused) {
            }
        }
        return displayMetrics;
    }

    /* renamed from: a */
    public static String m12515a(int i) {
        Context e = m12528e();
        if (e == null) {
            return null;
        }
        return e.getString(i);
    }

    /* renamed from: a */
    public static int m12512a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            if (!str.startsWith("#")) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(str);
                str = sb.toString();
            }
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static String m12517a(int i, Object... objArr) {
        Context e = m12528e();
        if (e == null) {
            return null;
        }
        return e.getString(i, objArr);
    }

    /* renamed from: a */
    public static String m12518a(Locale locale, int i) {
        return m12515a(i);
    }

    /* renamed from: a */
    public static String m12516a(int i, int i2, Object... objArr) {
        Context e = m12528e();
        if (e == null) {
            return null;
        }
        return e.getResources().getQuantityString(i, i2, objArr);
    }
}
