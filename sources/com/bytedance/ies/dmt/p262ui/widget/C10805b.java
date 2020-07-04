package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.ies.dmt.ui.widget.b */
public final class C10805b {

    /* renamed from: a */
    public Drawable f29117a;

    /* renamed from: b */
    public CharSequence f29118b;

    /* renamed from: c */
    public CharSequence f29119c;

    /* renamed from: d */
    public ButtonStyle f29120d;

    /* renamed from: e */
    public int f29121e;

    /* renamed from: f */
    public String f29122f;

    /* renamed from: g */
    public OnClickListener f29123g;

    /* renamed from: h */
    public String f29124h;

    /* renamed from: i */
    public OnClickListener f29125i;

    /* renamed from: j */
    public boolean f29126j;

    /* renamed from: k */
    public boolean f29127k;

    /* renamed from: l */
    public boolean f29128l;

    /* renamed from: m */
    boolean f29129m;

    /* renamed from: n */
    public boolean f29130n;

    /* renamed from: o */
    public boolean f29131o;

    /* renamed from: p */
    public boolean f29132p;

    /* renamed from: q */
    public boolean f29133q;

    /* renamed from: r */
    public int f29134r;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.b$a */
    public static class C10806a {

        /* renamed from: a */
        public C10805b f29135a = new C10805b();

        /* renamed from: b */
        private Context f29136b;

        /* renamed from: a */
        public final C10806a mo25989a(boolean z) {
            this.f29135a.f29129m = z;
            return this;
        }

        /* renamed from: b */
        public final C10806a mo25992b(boolean z) {
            this.f29135a.f29130n = true;
            return this;
        }

        /* renamed from: d */
        public final C10806a mo25994d(int i) {
            this.f29135a.f29134r = i;
            return this;
        }

        /* renamed from: a */
        public final C10806a mo25987a(CharSequence charSequence) {
            this.f29135a.f29119c = charSequence;
            this.f29135a.f29128l = true;
            return this;
        }

        /* renamed from: b */
        public final C10806a mo25991b(String str) {
            this.f29135a.f29119c = str;
            this.f29135a.f29128l = true;
            return this;
        }

        /* renamed from: c */
        public final C10806a mo25993c(int i) {
            this.f29135a.f29119c = this.f29136b.getString(i);
            this.f29135a.f29128l = true;
            return this;
        }

        public C10806a(Context context) {
            this.f29136b = context.getApplicationContext();
        }

        /* renamed from: a */
        public final C10806a mo25985a(int i) {
            this.f29135a.f29117a = this.f29136b.getResources().getDrawable(i);
            this.f29135a.f29126j = true;
            return this;
        }

        /* renamed from: b */
        public final C10806a mo25990b(int i) {
            this.f29135a.f29118b = this.f29136b.getString(i);
            if (!TextUtils.isEmpty(this.f29135a.f29118b)) {
                this.f29135a.f29127k = true;
                return this;
            }
            throw new IllegalArgumentException("title should not be empty string!");
        }

        /* renamed from: a */
        public final C10806a mo25988a(String str) {
            this.f29135a.f29118b = str;
            this.f29135a.f29127k = true;
            return this;
        }

        /* renamed from: a */
        public final C10806a mo25986a(ButtonStyle buttonStyle, int i, OnClickListener onClickListener) {
            this.f29135a.f29120d = buttonStyle;
            this.f29135a.f29122f = this.f29136b.getString(i);
            this.f29135a.f29123g = onClickListener;
            this.f29135a.f29131o = true;
            return this;
        }
    }
}
