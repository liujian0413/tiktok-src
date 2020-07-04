package com.bytedance.scene.p643c;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import com.bytedance.scene.utlity.C12700j;

/* renamed from: com.bytedance.scene.c.d */
public class C12594d extends ContextWrapper {

    /* renamed from: a */
    private Theme f33413a;

    /* renamed from: b */
    public int f33414b;

    /* renamed from: c */
    public Configuration f33415c;

    /* renamed from: d */
    private LayoutInflater f33416d;

    /* renamed from: e */
    private Resources f33417e;

    /* renamed from: f */
    private boolean f33418f;

    public Resources getResources() {
        return m36505a();
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Theme getTheme() {
        if (this.f33413a != null) {
            return this.f33413a;
        }
        m36507b();
        return this.f33413a;
    }

    /* renamed from: a */
    private Resources m36505a() {
        if (this.f33417e == null) {
            if (this.f33415c == null) {
                this.f33417e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f33417e = createConfigurationContext(this.f33415c).getResources();
            }
        }
        return this.f33417e;
    }

    /* renamed from: b */
    private void m36507b() {
        boolean z;
        if (this.f33413a == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f33413a = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f33413a.setTo(theme);
            }
        }
        m36506a(this.f33413a, this.f33414b, z);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public void setTheme(int i) {
        if (this.f33414b != i) {
            this.f33414b = i;
            if (this.f33418f) {
                this.f33413a = null;
                this.f33417e = null;
            }
            m36507b();
        }
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f33416d == null) {
            this.f33416d = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f33416d;
    }

    public C12594d(Context context, int i) {
        super(context);
        this.f33414b = i;
        if (this.f33414b == 0) {
            throw new IllegalArgumentException("themeResId can't be zero");
        }
    }

    public C12594d(Context context, Theme theme) {
        super(context);
        this.f33413a = (Theme) C12700j.m36907a(theme, "theme can't be null");
        this.f33418f = true;
    }

    /* renamed from: a */
    private static void m36506a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }
}
