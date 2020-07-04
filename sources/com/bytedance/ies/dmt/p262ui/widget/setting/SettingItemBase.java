package com.bytedance.ies.dmt.p262ui.widget.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.setting.SettingItemBase */
public abstract class SettingItemBase extends RelativeLayout {

    /* renamed from: a */
    private boolean f29167a;

    /* renamed from: e */
    protected String f29168e;

    /* renamed from: f */
    protected View f29169f;

    /* renamed from: g */
    protected RelativeLayout f29170g;

    /* renamed from: h */
    protected FrameLayout f29171h;

    /* renamed from: i */
    protected ViewGroup f29172i;

    /* renamed from: j */
    protected FrameLayout f29173j;

    /* renamed from: k */
    protected TextView f29174k;

    /* renamed from: l */
    protected TextView f29175l;

    /* renamed from: m */
    protected View f29176m;

    /* renamed from: n */
    protected ImageView f29177n;

    /* renamed from: o */
    protected C10813a f29178o;

    /* renamed from: p */
    protected int f29179p;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.setting.SettingItemBase$a */
    public interface C10813a {
        void OnSettingItemClick(View view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26012a(Context context, AttributeSet attributeSet) {
    }

    public FrameLayout getDecorLayout() {
        return this.f29173j;
    }

    /* access modifiers changed from: protected */
    public abstract int getRightLayoutId();

    public TextView getTxtRight() {
        return null;
    }

    public void setRightTxt(String str) {
        this.f29168e = str;
    }

    public SettingItemBase(Context context) {
        this(context, null);
    }

    public void setStartText(String str) {
        this.f29174k.setText(str);
    }

    public void setOnSettingItemClickListener(C10813a aVar) {
        this.f29178o = aVar;
        this.f29170g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (SettingItemBase.this.f29178o != null) {
                    SettingItemBase.this.f29178o.OnSettingItemClick(SettingItemBase.this.f29169f);
                }
            }
        });
    }

    public void setRightLayoutVisibility(int i) {
        ((ViewGroup) findViewById(R.id.cta)).setVisibility(i);
    }

    public void setSubText(String str) {
        this.f29175l.setVisibility(0);
        this.f29175l.setText(str);
    }

    public void setStartIcon(int i) {
        if (getContext() != null && getContext().getResources() != null) {
            m31689a(this.f29177n, i);
        }
    }

    public void setStartTextColor(int i) {
        if (getContext() != null) {
            this.f29174k.setTextColor(C0683b.m2912c(getContext(), i));
        }
    }

    public void setSubTextColor(int i) {
        if (getContext() != null) {
            this.f29175l.setTextColor(C0683b.m2912c(getContext(), i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26011a(Context context) {
        this.f29169f = View.inflate(context, R.layout.b0y, this);
        this.f29170g = (RelativeLayout) this.f29169f.findViewById(R.id.cwn);
        this.f29174k = (TextView) this.f29169f.findViewById(R.id.dwq);
        this.f29175l = (TextView) this.f29169f.findViewById(R.id.dwp);
        this.f29172i = (ViewGroup) this.f29169f.findViewById(R.id.cv6);
        this.f29173j = (FrameLayout) this.f29169f.findViewById(R.id.amk);
        this.f29177n = (ImageView) this.f29169f.findViewById(R.id.b_k);
        this.f29176m = this.f29169f.findViewById(R.id.e7n);
        this.f29171h = (FrameLayout) findViewById(R.id.ct8);
        int rightLayoutId = getRightLayoutId();
        if (rightLayoutId != 0) {
            LayoutInflater.from(context).inflate(rightLayoutId, this.f29171h, true);
        }
    }

    /* renamed from: a */
    private static void m31689a(ImageView imageView, int i) {
        imageView.setImageResource(i);
    }

    public SettingItemBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26017b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingItem);
        this.f29170g.setBackground(C10774c.m31449e(context));
        this.f29174k.setText(obtainStyledAttributes.getString(6));
        this.f29174k.setTextColor(obtainStyledAttributes.getColor(9, C10774c.m31444a(context)));
        String string = obtainStyledAttributes.getString(5);
        if (!TextUtils.isEmpty(string)) {
            this.f29175l.setText(string);
            this.f29174k.setMaxLines(1);
            this.f29170g.getLayoutParams().height = (int) C9738o.m28708b(getContext(), 70.0f);
        } else {
            this.f29175l.setVisibility(8);
        }
        this.f29179p = obtainStyledAttributes.getColor(7, C10774c.m31447c(context));
        this.f29175l.setTextColor(this.f29179p);
        if (obtainStyledAttributes.hasValue(4)) {
            m31689a(this.f29177n, obtainStyledAttributes.getResourceId(4, -1));
        } else {
            this.f29177n.setVisibility(8);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f29172i.getLayoutParams();
            int b = (int) C9738o.m28708b(context, 16.0f);
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(b);
            } else {
                marginLayoutParams.leftMargin = b;
            }
        }
        int i = 0;
        if (!obtainStyledAttributes.getBoolean(3, false)) {
            this.f29176m.setVisibility(8);
        }
        this.f29176m.setBackgroundColor(C10774c.m31448d(context));
        this.f29168e = obtainStyledAttributes.getString(1);
        this.f29167a = obtainStyledAttributes.getBoolean(2, false);
        if (this.f29167a) {
            i = 8;
        }
        setRightLayoutVisibility(i);
        obtainStyledAttributes.recycle();
    }

    public SettingItemBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo26011a(context);
        mo26017b(context, attributeSet);
        mo26012a(context, attributeSet);
    }
}
