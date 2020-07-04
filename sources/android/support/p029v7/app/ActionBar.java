package android.support.p029v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.view.C1153b;
import android.support.p029v7.view.C1153b.C1154a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: android.support.v7.app.ActionBar */
public abstract class ActionBar {

    /* renamed from: android.support.v7.app.ActionBar$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: a */
        public int f3703a;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f3703a = layoutParams.f3703a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f3703a = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBarLayout);
            this.f3703a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v7.app.ActionBar$a */
    public static abstract class C1067a {
        /* renamed from: a */
        public abstract int mo4185a();

        /* renamed from: b */
        public abstract Drawable mo4186b();

        /* renamed from: c */
        public abstract CharSequence mo4187c();

        /* renamed from: d */
        public abstract View mo4188d();

        /* renamed from: e */
        public abstract void mo4189e();

        /* renamed from: f */
        public abstract CharSequence mo4190f();
    }

    /* renamed from: a */
    public abstract int mo4165a();

    /* renamed from: a */
    public C1153b mo4166a(C1154a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo4168a(int i) {
    }

    /* renamed from: a */
    public void mo4169a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo4170a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public abstract void mo4171a(boolean z);

    /* renamed from: a */
    public boolean mo4172a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo4173a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo4174b() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo4175b(boolean z);

    /* renamed from: c */
    public boolean mo4177c() {
        return false;
    }

    /* renamed from: d */
    public void mo4178d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo4179d() {
        return false;
    }

    /* renamed from: e */
    public void mo4180e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo4181e() {
        return false;
    }

    /* renamed from: f */
    public void mo4182f(boolean z) {
    }

    /* renamed from: f */
    public boolean mo4183f() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4184g() {
    }

    /* renamed from: c */
    public void mo4176c(boolean z) {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    /* renamed from: a */
    public void mo4167a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }
}
