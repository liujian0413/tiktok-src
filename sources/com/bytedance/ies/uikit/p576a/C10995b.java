package com.bytedance.ies.uikit.p576a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.ies.uikit.a.b */
public final class C10995b {

    /* renamed from: a */
    public static String f29725a;

    /* renamed from: b */
    public final C10997a f29726b;

    /* renamed from: c */
    public boolean f29727c;

    /* renamed from: d */
    public boolean f29728d;

    /* renamed from: e */
    public int f29729e;

    /* renamed from: f */
    private boolean f29730f;

    /* renamed from: g */
    private boolean f29731g;

    /* renamed from: h */
    private View f29732h;

    /* renamed from: i */
    private View f29733i;

    /* renamed from: j */
    private View f29734j;

    /* renamed from: com.bytedance.ies.uikit.a.b$a */
    public static class C10997a {

        /* renamed from: a */
        public final int f29735a;

        /* renamed from: b */
        public final int f29736b;

        /* renamed from: c */
        public final boolean f29737c;

        /* renamed from: d */
        public final int f29738d;

        /* renamed from: e */
        public final int f29739e;

        /* renamed from: f */
        private final boolean f29740f;

        /* renamed from: g */
        private final boolean f29741g;

        /* renamed from: h */
        private final boolean f29742h;

        /* renamed from: i */
        private final float f29743i;

        /* renamed from: a */
        public final boolean mo26550a() {
            if (this.f29743i >= 600.0f || this.f29742h) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private int m32219b(Context context) {
            String str;
            Resources resources = context.getResources();
            if (VERSION.SDK_INT < 14 || !m32221d(context)) {
                return 0;
            }
            if (this.f29742h) {
                str = "navigation_bar_height";
            } else {
                str = "navigation_bar_height_landscape";
            }
            return m32218a(resources, str);
        }

        /* renamed from: c */
        private int m32220c(Context context) {
            Resources resources = context.getResources();
            if (VERSION.SDK_INT < 14 || !m32221d(context)) {
                return 0;
            }
            return m32218a(resources, "navigation_bar_width");
        }

        /* renamed from: a */
        private static float m32216a(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (VERSION.SDK_INT >= 16) {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            return Math.min(((float) displayMetrics.widthPixels) / displayMetrics.density, ((float) displayMetrics.heightPixels) / displayMetrics.density);
        }

        /* renamed from: d */
        private static boolean m32221d(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier != 0) {
                boolean z = resources.getBoolean(identifier);
                if ("1".equals(C10995b.f29725a)) {
                    z = false;
                } else if ("0".equals(C10995b.f29725a)) {
                    z = true;
                }
                return z;
            } else if (!ViewConfiguration.get(context).hasPermanentMenuKey()) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        private static int m32217a(Context context) {
            if (VERSION.SDK_INT < 14) {
                return 0;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843499, typedValue, true);
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        /* renamed from: a */
        private static int m32218a(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        private C10997a(Activity activity, boolean z, boolean z2) {
            boolean z3;
            Resources resources = activity.getResources();
            boolean z4 = false;
            if (resources.getConfiguration().orientation == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f29742h = z3;
            this.f29743i = m32216a(activity);
            this.f29735a = m32218a(resources, "status_bar_height");
            this.f29736b = m32217a((Context) activity);
            this.f29738d = m32219b(activity);
            this.f29739e = m32220c(activity);
            if (this.f29738d > 0) {
                z4 = true;
            }
            this.f29737c = z4;
            this.f29740f = z;
            this.f29741g = z2;
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
                declaredMethod.setAccessible(true);
                f29725a = (String) declaredMethod.invoke(null, new Object[]{"qemu.hw.mainkeys"});
            } catch (Throwable unused) {
                f29725a = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo26546a(int i) {
        mo26548b(i);
        m32211c(i);
    }

    /* renamed from: c */
    private void m32211c(int i) {
        if (this.f29731g) {
            this.f29733i.setBackgroundColor(i);
        }
    }

    /* renamed from: a */
    public final void mo26547a(boolean z) {
        this.f29727c = true;
        if (this.f29730f) {
            this.f29732h.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo26548b(int i) {
        if (this.f29730f) {
            this.f29732h.setBackgroundColor(i);
        }
    }

    /* renamed from: b */
    public final void mo26549b(boolean z) {
        this.f29728d = false;
        if (this.f29731g) {
            this.f29733i.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m32209a(Context context, ViewGroup viewGroup, View view) {
        this.f29732h = new View(context);
        LayoutParams layoutParams = new LayoutParams(-1, this.f29726b.f29735a);
        layoutParams.gravity = 48;
        if (this.f29731g && !this.f29726b.mo26550a()) {
            layoutParams.rightMargin = this.f29726b.f29739e;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            ((LayoutParams) view.getLayoutParams()).topMargin = this.f29726b.f29735a;
        }
        this.f29732h.setLayoutParams(layoutParams);
        this.f29732h.setBackgroundColor(-16777216);
        this.f29732h.setVisibility(8);
        viewGroup.addView(this.f29732h);
    }

    /* renamed from: b */
    private void m32210b(Context context, ViewGroup viewGroup, View view) {
        LayoutParams layoutParams;
        this.f29733i = new View(context);
        if (this.f29726b.mo26550a()) {
            layoutParams = new LayoutParams(-1, this.f29726b.f29738d);
            layoutParams.gravity = 80;
            if (view.getLayoutParams() instanceof LayoutParams) {
                ((LayoutParams) view.getLayoutParams()).bottomMargin = this.f29726b.f29738d;
            }
        } else {
            layoutParams = new LayoutParams(this.f29726b.f29739e, -1);
            layoutParams.gravity = 5;
        }
        this.f29733i.setLayoutParams(layoutParams);
        this.f29733i.setBackgroundColor(-16777216);
        this.f29733i.setVisibility(8);
        viewGroup.addView(this.f29733i);
    }

    /* JADX INFO: finally extract failed */
    public C10995b(Activity activity, View view, int i) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        this.f29734j = view;
        if (VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.f29730f = obtainStyledAttributes.getBoolean(0, false);
                this.f29731g = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (!((attributes.flags & 67108864) == 0 && (attributes.flags & Integer.MIN_VALUE) == 0) && (i & 1) == 0) {
                    this.f29730f = true;
                }
                if ((attributes.flags & 134217728) != 0) {
                    this.f29731g = true;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f29726b = new C10997a(activity, this.f29730f, this.f29731g);
        if (!this.f29726b.f29737c) {
            this.f29731g = false;
        }
        if (this.f29730f) {
            m32209a(activity, viewGroup, view);
        }
        if (this.f29731g) {
            m32210b(activity, viewGroup, view);
        }
        this.f29729e = i;
    }
}
