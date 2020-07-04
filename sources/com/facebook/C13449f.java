package com.facebook;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.facebook.appevents.C13187j;
import com.facebook.internal.C13945q;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.facebook.f */
public abstract class C13449f extends Button {

    /* renamed from: a */
    public OnClickListener f35659a;

    /* renamed from: b */
    public OnClickListener f35660b;

    /* renamed from: c */
    private String f35661c;

    /* renamed from: d */
    private String f35662d;

    /* renamed from: e */
    private boolean f35663e;

    /* renamed from: f */
    private int f35664f;

    /* renamed from: g */
    private int f35665g;

    /* renamed from: h */
    private C13945q f35666h;

    /* access modifiers changed from: protected */
    public abstract int getDefaultRequestCode();

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return 0;
    }

    public int getRequestCode() {
        return getDefaultRequestCode();
    }

    /* renamed from: a */
    private void mo33834a() {
        super.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C13449f.this.mo32946a(C13449f.this.getContext());
                if (C13449f.this.f35660b != null) {
                    C13449f.this.f35660b.onClick(view);
                    return;
                }
                if (C13449f.this.f35659a != null) {
                    C13449f.this.f35659a.onClick(view);
                }
            }
        });
    }

    public int getCompoundPaddingLeft() {
        if (this.f35663e) {
            return this.f35664f;
        }
        return super.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (this.f35663e) {
            return this.f35665g;
        }
        return super.getCompoundPaddingRight();
    }

    public Fragment getFragment() {
        if (this.f35666h != null) {
            return this.f35666h.f36900a;
        }
        return null;
    }

    public android.app.Fragment getNativeFragment() {
        if (this.f35666h != null) {
            return this.f35666h.f36901b;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Activity getActivity() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0018
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L_0x0018:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "Unable to get Activity."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C13449f.getActivity():android.app.Activity");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            m39517b(getContext());
        }
    }

    /* access modifiers changed from: protected */
    public void setInternalOnClickListener(OnClickListener onClickListener) {
        this.f35660b = onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f35659a = onClickListener;
    }

    public void setFragment(android.app.Fragment fragment) {
        this.f35666h = new C13945q(fragment);
    }

    /* renamed from: b */
    private void m39517b(Context context) {
        new C13187j(context).mo32364a(this.f35661c);
    }

    public void setFragment(Fragment fragment) {
        this.f35666h = new C13945q(fragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo32945a(String str) {
        return (int) Math.ceil((double) getPaint().measureText(str));
    }

    /* renamed from: a */
    public final void mo32946a(Context context) {
        new C13187j(context).mo32364a(this.f35662d);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        if ((getGravity() & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int compoundPaddingRight = getCompoundPaddingRight();
            int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - mo32945a(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
            this.f35664f = compoundPaddingLeft - min;
            this.f35665g = compoundPaddingRight + min;
            this.f35663e = true;
        }
        super.onDraw(canvas);
        this.f35663e = false;
    }

    /* renamed from: a */
    public final void mo32948a(View view) {
        if (this.f35659a != null) {
            this.f35659a.onClick(view);
        }
    }

    /* renamed from: d */
    private void m39520d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
        try {
            setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private void m39518b(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(C0683b.m2912c(context, R.color.jv));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: c */
    private void m39519c(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
        try {
            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
            setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(4, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m39521e(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
        try {
            setTextColor(obtainStyledAttributes.getColorStateList(0));
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
            try {
                setGravity(obtainStyledAttributes2.getInt(0, 17));
                obtainStyledAttributes2.recycle();
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
                try {
                    setTextSize(0, (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0));
                    setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes3.getInt(1, 1)));
                    setText(obtainStyledAttributes3.getString(2));
                } finally {
                    obtainStyledAttributes3.recycle();
                }
            } catch (Throwable th) {
                obtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32947a(Context context, AttributeSet attributeSet, int i, int i2) {
        m39518b(context, attributeSet, i, i2);
        m39519c(context, attributeSet, i, i2);
        m39520d(context, attributeSet, i, i2);
        m39521e(context, attributeSet, i, i2);
        mo33834a();
    }

    protected C13449f(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, null, 0);
        int defaultStyleResource = getDefaultStyleResource();
        if (defaultStyleResource == 0) {
            defaultStyleResource = R.style.s5;
        }
        mo32947a(context, null, 0, defaultStyleResource);
        this.f35661c = str;
        this.f35662d = str2;
        setClickable(true);
        setFocusable(true);
    }
}
