package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.R$styleable;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar */
public class ImTextTitleBar extends FrameLayout {

    /* renamed from: a */
    public C31980a f83578a;

    /* renamed from: b */
    private boolean f83579b;

    /* renamed from: c */
    private String f83580c;

    /* renamed from: d */
    private String f83581d;

    /* renamed from: e */
    private String f83582e;

    /* renamed from: f */
    private Drawable f83583f;

    /* renamed from: g */
    private Drawable f83584g;

    /* renamed from: h */
    private float f83585h;

    /* renamed from: i */
    private float f83586i;

    /* renamed from: j */
    private float f83587j;

    /* renamed from: k */
    private int f83588k;

    /* renamed from: l */
    private int f83589l;

    /* renamed from: m */
    private int f83590m;

    /* renamed from: n */
    private DmtTextView f83591n;

    /* renamed from: o */
    private DmtTextView f83592o;

    /* renamed from: p */
    private View f83593p;

    /* renamed from: q */
    private DmtTextView f83594q;

    /* renamed from: r */
    private DmtTextView f83595r;

    /* renamed from: s */
    private AutoRTLImageView f83596s;

    /* renamed from: t */
    private AutoRTLImageView f83597t;

    /* renamed from: u */
    private ViewGroup f83598u;

    /* renamed from: v */
    private ViewGroup f83599v;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar$a */
    public interface C31980a {
        /* renamed from: a */
        void mo18096a();

        /* renamed from: b */
        void mo18097b();
    }

    public DmtTextView getLeftTextView() {
        return this.f83591n;
    }

    public View getLeftView() {
        return this.f83598u;
    }

    public DmtTextView getRightTexView() {
        return this.f83592o;
    }

    public View getRightView() {
        return this.f83599v;
    }

    /* renamed from: a */
    private void m103870a() {
        int i;
        int i2;
        int a = C9738o.m28691a(getContext());
        if (this.f83598u.getVisibility() == 8 && this.f83599v.getVisibility() == 8) {
            i = a - ((int) C9738o.m28708b(getContext(), 32.0f));
        } else {
            int i3 = 0;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            if (this.f83598u.getVisibility() != 8) {
                this.f83598u.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = this.f83598u.getMeasuredWidth();
            } else {
                i2 = 0;
            }
            if (this.f83599v.getVisibility() != 8) {
                this.f83599v.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = this.f83599v.getMeasuredWidth();
            }
            i = a - (Math.max(i2, i3) * 2);
        }
        if (this.f83595r.getVisibility() == 0) {
            LayoutParams layoutParams = this.f83593p.getLayoutParams();
            layoutParams.width = i;
            this.f83593p.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = this.f83594q.getLayoutParams();
            layoutParams2.width = -2;
            this.f83594q.setLayoutParams(layoutParams2);
            return;
        }
        LayoutParams layoutParams3 = this.f83594q.getLayoutParams();
        layoutParams3.width = i;
        this.f83594q.setLayoutParams(layoutParams3);
    }

    public void setOnTitlebarClickListener(C31980a aVar) {
        this.f83578a = aVar;
    }

    public ImTextTitleBar(Context context) {
        this(context, null);
    }

    public void setTitle(String str) {
        this.f83582e = str;
        this.f83594q.setText(str);
    }

    public void setLeftIcon(int i) {
        setLeftIcon(getContext().getResources().getDrawable(i));
    }

    public void setLeftText(int i) {
        setLeftText(C6399b.m19921a().getResources().getString(i));
    }

    public void setLeftTextColor(int i) {
        this.f83588k = i;
        if (this.f83591n != null) {
            this.f83591n.setTextColor(this.f83588k);
        }
    }

    public void setRightIcon(int i) {
        setRightIcon(getContext().getResources().getDrawable(i));
    }

    public void setRightText(int i) {
        setRightText(C6399b.m19921a().getResources().getString(i));
    }

    public void setRightTextColor(int i) {
        this.f83589l = i;
        if (this.f83592o != null) {
            this.f83592o.setTextColor(this.f83589l);
        }
    }

    public void setTitle(int i) {
        setTitle(C6399b.m19921a().getResources().getString(i));
    }

    public void setTitleTextColor(int i) {
        this.f83590m = i;
        this.f83594q.setTextColor(this.f83590m);
    }

    public void setTitleTextSize(float f) {
        this.f83587j = f;
        this.f83594q.setTextSize(0, f);
    }

    public void setLeftTextSize(float f) {
        this.f83585h = f;
        if (this.f83591n != null) {
            this.f83591n.setTextSize(0, this.f83585h);
            m103870a();
        }
    }

    public void setRightTextSize(float f) {
        this.f83586i = f;
        if (this.f83592o != null) {
            this.f83592o.setTextSize(0, this.f83586i);
            m103870a();
        }
    }

    public void setTitle(CharSequence charSequence) {
        String str;
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        this.f83582e = str;
        this.f83594q.setText(charSequence);
    }

    public void setTitleCount(String str) {
        if (this.f83595r.getVisibility() != 0) {
            this.f83595r.setVisibility(0);
        }
        this.f83595r.setText(str);
        m103870a();
    }

    public void setLeftIcon(Drawable drawable) {
        this.f83583f = drawable;
        if (this.f83591n != null) {
            this.f83591n.setVisibility(8);
        }
        if (this.f83596s == null) {
            this.f83596s = new AutoRTLImageView(getContext());
            this.f83596s.setScaleType(ScaleType.CENTER_INSIDE);
            this.f83598u.addView(this.f83596s);
            this.f83598u.setVisibility(0);
        } else {
            this.f83596s.setVisibility(0);
        }
        this.f83598u.setContentDescription(getContext().getResources().getString(R.string.pp));
        this.f83596s.setImageDrawable(this.f83583f);
        m103870a();
    }

    public void setLeftText(String str) {
        this.f83580c = str;
        if (this.f83596s != null) {
            this.f83596s.setVisibility(8);
        }
        if (this.f83591n == null) {
            this.f83591n = new DmtTextView(getContext());
            this.f83598u.addView(this.f83591n);
            this.f83598u.setVisibility(0);
            this.f83591n.setTextColor(this.f83588k);
            this.f83591n.setTextSize(0, this.f83585h);
        } else {
            this.f83591n.setVisibility(0);
        }
        this.f83591n.setText(this.f83580c);
        this.f83598u.setContentDescription(this.f83580c);
        m103870a();
    }

    public void setRightIcon(Drawable drawable) {
        this.f83584g = drawable;
        if (this.f83592o != null) {
            this.f83592o.setVisibility(8);
        }
        if (this.f83597t == null) {
            this.f83597t = new AutoRTLImageView(getContext());
            this.f83597t.setScaleType(ScaleType.CENTER_INSIDE);
            this.f83599v.addView(this.f83597t);
            this.f83599v.setVisibility(0);
        } else {
            this.f83597t.setVisibility(0);
        }
        this.f83599v.setContentDescription(getContext().getResources().getString(R.string.bn1));
        this.f83597t.setImageDrawable(this.f83584g);
        m103870a();
    }

    public void setRightText(String str) {
        this.f83581d = str;
        if (this.f83597t != null) {
            this.f83597t.setVisibility(8);
        }
        if (this.f83592o == null) {
            this.f83592o = new DmtTextView(getContext());
            this.f83599v.addView(this.f83592o);
            this.f83599v.setVisibility(0);
            this.f83592o.setTextSize(0, this.f83586i);
            this.f83592o.setTextColor(this.f83589l);
        } else {
            this.f83592o.setVisibility(0);
        }
        this.f83599v.setContentDescription(this.f83581d);
        this.f83592o.setText(this.f83581d);
        m103870a();
    }

    /* renamed from: a */
    private void m103871a(Context context) {
        inflate(context, R.layout.a7f, this);
        this.f83598u = (ViewGroup) findViewById(R.id.bl4);
        this.f83599v = (ViewGroup) findViewById(R.id.ct9);
        this.f83593p = findViewById(R.id.dke);
        this.f83594q = (DmtTextView) findViewById(R.id.dkn);
        this.f83595r = (DmtTextView) findViewById(R.id.a3m);
        if (!TextUtils.isEmpty(this.f83580c)) {
            setLeftText(this.f83580c);
            setLeftTextColor(this.f83588k);
            setLeftTextSize(this.f83585h);
        } else if (this.f83583f != null) {
            setLeftIcon(this.f83583f);
        } else if (this.f83579b) {
            setLeftIcon(getContext().getResources().getDrawable(R.drawable.cmw));
        }
        if (!TextUtils.isEmpty(this.f83581d)) {
            setRightText(this.f83581d);
            setRightTextColor(this.f83589l);
            setRightTextSize(this.f83586i);
        } else if (this.f83584g != null) {
            setRightIcon(this.f83584g);
        }
        if (!TextUtils.isEmpty(this.f83582e)) {
            setTitle(this.f83582e);
            setTitleTextColor(this.f83590m);
            setTitleTextSize(this.f83587j);
        }
        this.f83598u.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ImTextTitleBar.this.f83578a != null) {
                    ImTextTitleBar.this.f83578a.mo18096a();
                }
            }
        });
        this.f83599v.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ImTextTitleBar.this.f83578a != null) {
                    ImTextTitleBar.this.f83578a.mo18097b();
                }
            }
        });
        C31878ax.m103576a(this.f83598u);
        C31878ax.m103576a(this.f83599v);
    }

    public ImTextTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m103872a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ImTextTitleBar);
        this.f83579b = obtainStyledAttributes.getBoolean(11, true);
        this.f83580c = obtainStyledAttributes.getString(2);
        this.f83581d = obtainStyledAttributes.getString(6);
        this.f83582e = obtainStyledAttributes.getString(8);
        if (TextUtils.isEmpty(this.f83580c)) {
            this.f83583f = obtainStyledAttributes.getDrawable(1);
        }
        this.f83588k = obtainStyledAttributes.getColor(0, context.getResources().getColor(R.color.vm));
        this.f83585h = obtainStyledAttributes.getDimension(3, C9738o.m28708b(context, 16.0f));
        if (TextUtils.isEmpty(this.f83581d)) {
            this.f83584g = obtainStyledAttributes.getDrawable(5);
        }
        this.f83589l = obtainStyledAttributes.getColor(4, context.getResources().getColor(R.color.vm));
        this.f83586i = obtainStyledAttributes.getDimension(7, C9738o.m28708b(context, 16.0f));
        this.f83590m = obtainStyledAttributes.getColor(9, context.getResources().getColor(R.color.vk));
        this.f83587j = obtainStyledAttributes.getDimension(10, C9738o.m28708b(context, 17.0f));
        obtainStyledAttributes.recycle();
    }

    public ImTextTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f83579b = true;
        m103872a(context, attributeSet);
        m103871a(context);
    }
}
