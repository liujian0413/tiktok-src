package com.bytedance.ies.dmt.p262ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItemBase */
public abstract class EffectiveSettingItemBase extends ConstraintLayout {

    /* renamed from: A */
    protected ImageView f29145A;

    /* renamed from: B */
    protected C10811a f29146B;

    /* renamed from: l */
    protected String f29147l;

    /* renamed from: m */
    protected String f29148m;

    /* renamed from: n */
    protected float f29149n;

    /* renamed from: o */
    protected int f29150o;

    /* renamed from: p */
    protected String f29151p;

    /* renamed from: q */
    protected float f29152q;

    /* renamed from: r */
    protected int f29153r;

    /* renamed from: s */
    protected int f29154s;

    /* renamed from: t */
    protected boolean f29155t;

    /* renamed from: u */
    protected boolean f29156u;

    /* renamed from: v */
    protected FrameLayout f29157v;

    /* renamed from: w */
    protected FrameLayout f29158w;

    /* renamed from: x */
    protected TextView f29159x;

    /* renamed from: y */
    protected TextView f29160y;

    /* renamed from: z */
    protected View f29161z;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItemBase$a */
    public interface C10811a {
        /* renamed from: a */
        void mo26010a(View view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25996a(Context context, AttributeSet attributeSet) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo20984b();

    public FrameLayout getDecorLayout() {
        return this.f29158w;
    }

    /* access modifiers changed from: protected */
    public int getRightLayoutId() {
        return -1;
    }

    public TextView getTxtRight() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m31679a(getContext());
    }

    /* renamed from: c */
    private void m31682c() {
        setBackground(C10774c.m31449e(getContext()));
        this.f29159x = (TextView) findViewById(R.id.dwq);
        this.f29160y = (TextView) findViewById(R.id.dwp);
        this.f29158w = (FrameLayout) findViewById(R.id.amk);
        this.f29145A = (ImageView) findViewById(R.id.b_k);
        this.f29161z = findViewById(R.id.e7n);
        this.f29157v = (FrameLayout) findViewById(R.id.cta);
        this.f29159x.setText(this.f29148m);
        this.f29159x.setTextSize(this.f29149n);
        this.f29159x.setTextColor(this.f29150o);
        if (!TextUtils.isEmpty(this.f29151p)) {
            this.f29160y.setText(this.f29151p);
            this.f29159x.setMaxLines(1);
            if (getLayoutParams() != null) {
                getLayoutParams().height = (int) C9738o.m28708b(getContext(), 70.0f);
            }
        } else {
            this.f29160y.setVisibility(8);
        }
        this.f29160y.setTextSize(this.f29152q);
        this.f29160y.setTextColor(this.f29153r);
        if (this.f29154s != -1) {
            m31680a(this.f29145A, this.f29154s);
        } else {
            this.f29145A.setVisibility(8);
        }
        if (!this.f29155t) {
            this.f29161z.setVisibility(8);
        }
        this.f29161z.setBackgroundColor(C10774c.m31448d(getContext()));
        int rightLayoutId = getRightLayoutId();
        if (-1 != rightLayoutId) {
            this.f29157v.removeAllViews();
            LayoutInflater.from(getContext()).inflate(rightLayoutId, this.f29157v, true);
        }
        if (this.f29156u) {
            this.f29157v.setVisibility(8);
        }
    }

    public void setRightTxt(String str) {
        this.f29147l = str;
    }

    public EffectiveSettingItemBase(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m31679a(Context context) {
        m31682c();
        mo20984b();
    }

    public void setRightLayoutVisibility(int i) {
        this.f29157v.setVisibility(i);
    }

    public void setStartText(String str) {
        this.f29159x.setText(str);
    }

    public void setOnSettingItemClickListener(C10811a aVar) {
        this.f29146B = aVar;
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (EffectiveSettingItemBase.this.f29146B != null) {
                    EffectiveSettingItemBase.this.f29146B.mo26010a(EffectiveSettingItemBase.this);
                }
            }
        });
    }

    public void setSubText(String str) {
        this.f29160y.setVisibility(0);
        this.f29160y.setText(str);
    }

    public void setStartIcon(int i) {
        if (getContext() != null && getContext().getResources() != null) {
            m31680a(this.f29145A, i);
        }
    }

    public void setStartTextColor(int i) {
        if (getContext() != null) {
            this.f29159x.setTextColor(C0683b.m2912c(getContext(), i));
        }
    }

    public void setSubTextColor(int i) {
        if (getContext() != null) {
            this.f29160y.setTextColor(C0683b.m2912c(getContext(), i));
        }
    }

    /* renamed from: a */
    private static void m31680a(ImageView imageView, int i) {
        imageView.setImageResource(i);
    }

    /* renamed from: b */
    private void m31681b(Context context, AttributeSet attributeSet) {
        m31683c(context, attributeSet);
        mo25996a(context, attributeSet);
    }

    public EffectiveSettingItemBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private void m31683c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingItem);
        this.f29148m = obtainStyledAttributes.getString(6);
        this.f29149n = obtainStyledAttributes.getDimension(10, 15.0f);
        this.f29150o = obtainStyledAttributes.getColor(9, C10774c.m31444a(context));
        this.f29151p = obtainStyledAttributes.getString(5);
        this.f29152q = obtainStyledAttributes.getDimension(8, 13.0f);
        this.f29153r = obtainStyledAttributes.getColor(7, C10774c.m31447c(context));
        if (obtainStyledAttributes.hasValue(4)) {
            this.f29154s = obtainStyledAttributes.getResourceId(4, -1);
        }
        this.f29155t = obtainStyledAttributes.getBoolean(3, false);
        this.f29147l = obtainStyledAttributes.getString(1);
        this.f29156u = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }

    public EffectiveSettingItemBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29154s = -1;
        m31681b(context, attributeSet);
    }
}
