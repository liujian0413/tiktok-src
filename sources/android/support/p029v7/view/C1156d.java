package android.support.p029v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.view.d */
public final class C1156d extends ContextWrapper {

    /* renamed from: a */
    public int f4153a;

    /* renamed from: b */
    private Theme f4154b;

    /* renamed from: c */
    private LayoutInflater f4155c;

    /* renamed from: d */
    private Configuration f4156d;

    /* renamed from: e */
    private Resources f4157e;

    public C1156d() {
        super(null);
    }

    public final Resources getResources() {
        return m5142a();
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Theme getTheme() {
        if (this.f4154b != null) {
            return this.f4154b;
        }
        if (this.f4153a == 0) {
            this.f4153a = R.style.lz;
        }
        m5144b();
        return this.f4154b;
    }

    /* renamed from: a */
    private Resources m5142a() {
        if (this.f4157e == null) {
            if (this.f4156d == null) {
                this.f4157e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f4157e = createConfigurationContext(this.f4156d).getResources();
            }
        }
        return this.f4157e;
    }

    /* renamed from: b */
    private void m5144b() {
        boolean z;
        if (this.f4154b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f4154b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4154b.setTo(theme);
            }
        }
        m5143a(this.f4154b, this.f4153a, z);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void setTheme(int i) {
        if (this.f4153a != i) {
            this.f4153a = i;
            m5144b();
        }
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4155c == null) {
            this.f4155c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4155c;
    }

    public C1156d(Context context, int i) {
        super(context);
        this.f4153a = i;
    }

    /* renamed from: a */
    private static void m5143a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }
}
