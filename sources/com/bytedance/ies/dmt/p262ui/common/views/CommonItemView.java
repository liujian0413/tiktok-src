package com.bytedance.ies.dmt.p262ui.common.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p022v4.view.p028a.C0945c;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.common.views.C10784a.C10785a;
import com.bytedance.ies.dmt.p262ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.setting.checkable.DmtSettingSwitch;
import com.bytedance.ies.dmt.p262ui.widget.setting.checkable.DmtSettingSwitch.C10815a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.common.views.CommonItemView */
public class CommonItemView extends RelativeLayout {

    /* renamed from: a */
    public TextView f28904a;

    /* renamed from: b */
    public SimpleDraweeView f28905b;

    /* renamed from: c */
    public BadgeView f28906c;

    /* renamed from: d */
    public boolean f28907d;

    /* renamed from: e */
    public int f28908e;

    /* renamed from: f */
    private boolean f28909f;

    /* renamed from: g */
    private boolean f28910g;

    /* renamed from: h */
    private TextView f28911h;

    /* renamed from: i */
    private TextView f28912i;

    /* renamed from: j */
    private ImageView f28913j;

    /* renamed from: k */
    private ViewGroup f28914k;

    /* renamed from: l */
    private ViewGroup f28915l;

    /* renamed from: m */
    private DmtSettingSwitch f28916m;

    /* renamed from: n */
    private CharSequence f28917n;

    /* renamed from: o */
    private CharSequence f28918o;

    /* renamed from: p */
    private CharSequence f28919p;

    /* renamed from: q */
    private CharSequence f28920q;

    /* renamed from: r */
    private boolean f28921r;

    /* renamed from: s */
    private boolean f28922s;

    /* renamed from: t */
    private boolean f28923t;

    /* renamed from: u */
    private int f28924u;

    /* renamed from: v */
    private int f28925v;

    /* renamed from: w */
    private int f28926w;

    /* renamed from: x */
    private int f28927x;

    /* renamed from: y */
    private int f28928y;

    /* renamed from: z */
    private int f28929z;

    public SimpleDraweeView getIvwLeft() {
        return this.f28905b;
    }

    public ImageView getIvwRight() {
        return this.f28913j;
    }

    public int getResLeft() {
        return this.f28925v;
    }

    public int getResRight() {
        return this.f28926w;
    }

    public CharSequence getTextDesc() {
        return this.f28919p;
    }

    public CharSequence getTextLeft() {
        return this.f28917n;
    }

    public CharSequence getTextRight() {
        return this.f28918o;
    }

    public TextView getTvwDesc() {
        return this.f28912i;
    }

    public TextView getTvwLeft() {
        return this.f28904a;
    }

    public TextView getTvwRight() {
        return this.f28911h;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo25778c() {
        if (this.f28916m == null) {
            return false;
        }
        return this.f28916m.f29185b;
    }

    /* renamed from: l */
    private boolean m31491l() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (accessibilityManager != null) {
            return accessibilityManager.isEnabled();
        }
        return false;
    }

    /* renamed from: d */
    private void m31482d() {
        this.f28915l = (ViewGroup) findViewById(R.id.bt3);
        this.f28914k = (ViewGroup) findViewById(R.id.bt6);
        this.f28904a = (TextView) this.f28915l.findViewById(R.id.e4z);
        this.f28905b = (SimpleDraweeView) this.f28915l.findViewById(R.id.bds);
        if (VERSION.SDK_INT >= 23) {
            this.f28904a.setBreakStrategy(0);
        }
        m31484e();
    }

    /* renamed from: e */
    private void m31484e() {
        if (this.f28924u == 1) {
            m31487h();
        } else {
            m31486g();
        }
        if (this.f28925v == 0) {
            this.f28905b.setVisibility(8);
        } else {
            this.f28905b.setVisibility(0);
            this.f28905b.setImageResource(this.f28925v);
        }
        this.f28904a.setText(this.f28917n);
        this.f28904a.setTextColor(this.f28927x);
        m31485f();
    }

    /* renamed from: m */
    private void m31492m() {
        if (m31491l()) {
            if (VERSION.SDK_INT < 21) {
                AccessibilityNodeInfo createAccessibilityNodeInfo = createAccessibilityNodeInfo();
                if (createAccessibilityNodeInfo != null && C0945c.m3986a(createAccessibilityNodeInfo).mo3684i()) {
                    this.f28916m.announceForAccessibility(this.f28920q);
                }
                return;
            }
            if (isAccessibilityFocused()) {
                this.f28916m.announceForAccessibility(this.f28920q);
            }
        }
    }

    /* renamed from: f */
    private void m31485f() {
        if (this.f28919p == null) {
            if (this.f28912i != null) {
                this.f28912i.setVisibility(8);
            }
            return;
        }
        if (this.f28912i == null) {
            this.f28912i = new DmtTextView(getContext());
            this.f28912i.setLineSpacing(C9738o.m28708b(getContext(), 2.0f), 1.0f);
            this.f28912i.setTextSize(1, 13.0f);
            this.f28912i.setTextColor(this.f28929z);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.topMargin = (int) C9738o.m28708b(getContext(), 6.0f);
            layoutParams.addRule(3, R.id.bt3);
            addView(this.f28912i, layoutParams);
            if (VERSION.SDK_INT >= 23) {
                this.f28912i.setBreakStrategy(0);
            }
        }
        this.f28912i.setText(this.f28919p);
        this.f28912i.setVisibility(0);
        this.f28910g = true;
    }

    /* renamed from: j */
    private void m31489j() {
        if (!this.f28917n.equals(this.f28904a.getText())) {
            this.f28906c.mo1061a();
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f28917n);
        spannableStringBuilder.append(" ");
        C10784a aVar = new C10784a();
        aVar.f28931a = new C10785a() {
            /* renamed from: a */
            public final void mo25799a(int i, int i2) {
                int i3;
                if (CommonItemView.this.f28907d) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) CommonItemView.this.f28906c.getLayoutParams();
                    int b = (int) C9738o.m28708b(CommonItemView.this.getContext(), 1.0f);
                    Layout layout = CommonItemView.this.f28904a.getLayout();
                    if (layout != null && layout.getLineCount() > 0) {
                        i = (int) layout.getLineWidth(layout.getLineCount() - 1);
                    }
                    if (CommonItemView.this.f28908e == 1) {
                        i2 += (CommonItemView.this.f28904a.getLineHeight() - CommonItemView.this.f28906c.getMeasuredHeight()) / 2;
                        i = (int) (((float) i) + C9738o.m28708b(CommonItemView.this.getContext(), 4.0f));
                    }
                    if (CommonItemView.this.f28905b.getVisibility() == 0) {
                        if (VERSION.SDK_INT >= 17) {
                            i3 = i + ((MarginLayoutParams) CommonItemView.this.f28905b.getLayoutParams()).getMarginEnd();
                        } else {
                            i3 = i + ((MarginLayoutParams) CommonItemView.this.f28905b.getLayoutParams()).rightMargin;
                        }
                        i = i3 + CommonItemView.this.f28905b.getMeasuredWidth();
                    }
                    marginLayoutParams.leftMargin = i + b;
                    if (VERSION.SDK_INT >= 17) {
                        marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
                    }
                    marginLayoutParams.topMargin = (int) (CommonItemView.this.f28904a.getY() + ((float) i2));
                    CommonItemView.this.f28906c.requestLayout();
                }
            }
        };
        spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        this.f28904a.setText(spannableStringBuilder);
    }

    /* renamed from: k */
    private void m31490k() {
        Context context;
        int i;
        if (m31491l()) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f28917n)) {
                sb.append(this.f28917n);
            }
            if (!TextUtils.isEmpty(this.f28918o)) {
                sb.append(this.f28918o);
            }
            if (this.f28916m != null && this.f28916m.getVisibility() == 0) {
                if (this.f28916m.f29185b) {
                    context = getContext();
                    i = R.string.cqn;
                } else {
                    context = getContext();
                    i = R.string.cqf;
                }
                sb.append(context.getString(i));
            }
            if (!TextUtils.isEmpty(this.f28919p)) {
                sb.append(this.f28919p);
            }
            this.f28920q = sb.toString();
            setContentDescription(this.f28920q);
        }
    }

    /* renamed from: n */
    private void m31493n() {
        if (this.f28910g && this.f28912i != null && this.f28912i.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f28912i.getLayoutParams();
            if (this.f28905b.getVisibility() != 0) {
                marginLayoutParams.leftMargin = 0;
            } else {
                MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f28905b.getLayoutParams();
                marginLayoutParams.leftMargin = marginLayoutParams2.rightMargin + marginLayoutParams2.width;
            }
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginStart(marginLayoutParams.leftMargin);
            }
            this.f28910g = false;
        }
    }

    /* renamed from: g */
    private void m31486g() {
        if (this.f28916m != null) {
            this.f28916m.setVisibility(8);
        }
        if (this.f28918o == null && this.f28926w == 0) {
            this.f28914k.setVisibility(8);
            return;
        }
        if (!this.f28923t && this.f28913j == null) {
            this.f28913j = new AutoRTLImageView(getContext());
            this.f28913j.setId(R.id.bdt);
            int b = (int) C9738o.m28708b(getContext(), 20.0f);
            LayoutParams layoutParams = new LayoutParams(b, b);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.addRule(21);
            } else {
                layoutParams.addRule(11);
            }
            this.f28914k.addView(this.f28913j, layoutParams);
        }
        if (!this.f28923t && this.f28913j != null) {
            if (this.f28926w != 0) {
                this.f28913j.setImageResource(this.f28926w);
                this.f28913j.setVisibility(0);
            } else {
                this.f28913j.setVisibility(8);
            }
        }
        if (this.f28918o != null && this.f28911h == null) {
            this.f28911h = new DmtTextView(getContext());
            this.f28911h.setId(R.id.e4y);
            LayoutParams layoutParams2 = new LayoutParams(-2, -2);
            layoutParams2.addRule(15);
            if (VERSION.SDK_INT >= 17) {
                layoutParams2.addRule(16, R.id.bdt);
            } else {
                layoutParams2.addRule(0, R.id.bdt);
            }
            this.f28911h.setTextColor(this.f28928y);
            this.f28911h.setEllipsize(TruncateAt.END);
            this.f28911h.setMaxLines(1);
            this.f28911h.setTextSize(1, 15.0f);
            this.f28914k.addView(this.f28911h, layoutParams2);
        }
        if (this.f28918o != null) {
            this.f28911h.setText(this.f28918o);
            this.f28911h.setVisibility(0);
        } else if (this.f28911h != null) {
            this.f28911h.setVisibility(8);
        }
        this.f28914k.setVisibility(0);
    }

    /* renamed from: h */
    private void m31487h() {
        if (this.f28913j != null) {
            this.f28913j.setVisibility(8);
        }
        if (this.f28911h != null) {
            this.f28911h.setVisibility(8);
        }
        if (this.f28916m == null) {
            this.f28916m = new DmtSettingSwitch(getContext());
            this.f28916m.setId(R.id.dec);
            LayoutParams layoutParams = new LayoutParams((int) C9738o.m28708b(getContext(), 36.0f), -2);
            layoutParams.addRule(15);
            this.f28916m.setTrackRadius((int) C9738o.m28708b(getContext(), 42.0f));
            this.f28916m.setEnableTouch(false);
            this.f28916m.setTrackPadding((int) C9738o.m28708b(getContext(), 3.0f));
            this.f28916m.setThumbDrawable(getResources().getDrawable(R.drawable.cnu));
            this.f28916m.setTrackTintList(m31481d(getContext()));
            this.f28914k.addView(this.f28916m, layoutParams);
        }
        this.f28914k.setVisibility(0);
        this.f28916m.setVisibility(0);
    }

    /* renamed from: i */
    private void m31488i() {
        LayoutParams layoutParams = (LayoutParams) this.f28906c.getLayoutParams();
        if (VERSION.SDK_INT >= 17) {
            layoutParams.addRule(21);
        } else {
            layoutParams.addRule(11);
        }
        layoutParams.addRule(10);
        int measuredHeight = this.f28914k.getMeasuredHeight();
        if (measuredHeight == 0) {
            measuredHeight = this.f28904a.getLineHeight();
        }
        if (this.f28908e == 3) {
            layoutParams.topMargin = (measuredHeight - this.f28906c.getMeasuredHeight()) / 2;
        } else {
            layoutParams.topMargin = 0;
        }
        if (this.f28924u == 1) {
            layoutParams.rightMargin = (int) (((float) m31471a(this.f28914k)) + C9738o.m28708b(getContext(), 8.0f));
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(layoutParams.rightMargin);
            }
        } else {
            if (this.f28913j == null || this.f28913j.getVisibility() != 0) {
                layoutParams.rightMargin = 0;
            } else {
                layoutParams.rightMargin = this.f28913j.getMeasuredWidth();
            }
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(layoutParams.rightMargin);
            }
            if (this.f28911h != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f28911h.getLayoutParams();
                marginLayoutParams.rightMargin = (int) C9738o.m28708b(getContext(), 10.0f);
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
                }
                this.f28909f = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo25777b() {
        this.f28907d = false;
        if (this.f28906c != null) {
            this.f28906c.mo25770b();
            if ((this.f28908e == 3 || this.f28908e == 2) && this.f28911h != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f28911h.getLayoutParams();
                marginLayoutParams.rightMargin = 0;
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginEnd(marginLayoutParams.rightMargin);
                }
                this.f28909f = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo25776a() {
        if (this.f28906c == null) {
            this.f28906c = new BadgeView(getContext());
            addView(this.f28906c, new LayoutParams(-2, -2));
        }
        if (this.f28908e == 3 || this.f28908e == 2) {
            m31488i();
        } else {
            m31489j();
        }
        this.f28907d = true;
    }

    public CommonItemView(Context context) {
        this(context, null);
    }

    public void setLeftIcon(int i) {
        m31474a(this.f28917n, i);
    }

    public void setLeftText(CharSequence charSequence) {
        m31474a(charSequence, this.f28925v);
    }

    public void setOnCheckedChangeListener(C10815a aVar) {
        this.f28916m.setOnCheckedChangeListener(aVar);
    }

    public void setRightIconRes(int i) {
        m31478b(this.f28918o, i);
    }

    public void setRightText(CharSequence charSequence) {
        m31478b(charSequence, this.f28926w);
    }

    public void setDesc(CharSequence charSequence) {
        this.f28919p = charSequence;
        m31485f();
        m31490k();
    }

    public void setLeftIconImageUrl(String str) {
        this.f28905b.setVisibility(0);
        this.f28905b.setImageURI(str);
        this.f28909f = true;
    }

    /* renamed from: a */
    private static int m31469a(Context context) {
        int i;
        if (C6394b.m19907b(context)) {
            i = R.color.aut;
        } else {
            i = R.color.aus;
        }
        return m31470a(context, i);
    }

    /* renamed from: b */
    private static int m31475b(Context context) {
        int i;
        if (C6394b.m19907b(context)) {
            i = R.color.auv;
        } else {
            i = R.color.m1;
        }
        return m31470a(context, i);
    }

    /* renamed from: c */
    private static int m31479c(Context context) {
        int i;
        if (C6394b.m19907b(context)) {
            i = R.color.auv;
        } else {
            i = R.color.m1;
        }
        return m31470a(context, i);
    }

    /* renamed from: d */
    private static ColorStateList m31481d(Context context) {
        int i;
        Resources resources = context.getResources();
        if (C6394b.m19907b(context)) {
            i = R.color.jt;
        } else {
            i = R.color.js;
        }
        return resources.getColorStateList(i);
    }

    public void setChecked(boolean z) {
        if (this.f28916m != null) {
            boolean z2 = this.f28916m.f29185b;
            this.f28916m.setChecked(z);
            m31490k();
            if (z2 != z) {
                m31492m();
            }
        }
    }

    /* renamed from: a */
    private static int m31471a(ViewGroup viewGroup) {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = i3 + childAt.getMeasuredWidth();
            if (VERSION.SDK_INT >= 17) {
                i2 = marginLayoutParams.getMarginStart();
                i = marginLayoutParams.getMarginEnd();
            } else {
                i2 = marginLayoutParams.leftMargin;
                i = marginLayoutParams.rightMargin;
            }
            i3 = measuredWidth + i2 + i;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m31472a(i, i2);
        super.onMeasure(i, i2);
    }

    public CommonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m31470a(Context context, int i) {
        return context.getResources().getColor(i);
    }

    /* renamed from: b */
    private void m31476b(int i, int i2) {
        if (this.f28909f) {
            if (this.f28914k.getVisibility() == 8) {
                this.f28915l.getLayoutParams().width = -1;
                this.f28909f = false;
                return;
            }
            int size = (MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            if (this.f28924u == 1) {
                m31480c(i2, size);
            } else {
                m31483d(i2, size);
            }
            this.f28909f = false;
        }
    }

    /* renamed from: c */
    private void m31480c(int i, int i2) {
        this.f28914k.measure(MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i);
        this.f28915l.getLayoutParams().width = i2 - m31471a(this.f28914k);
    }

    /* renamed from: a */
    private void m31472a(int i, int i2) {
        if (this.f28909f || this.f28910g) {
            m31476b(i, i2);
            m31493n();
            if (this.f28907d) {
                mo25776a();
            }
            return;
        }
        if (this.f28907d) {
            mo25776a();
        }
    }

    /* renamed from: b */
    private void m31478b(CharSequence charSequence, int i) {
        this.f28918o = charSequence;
        this.f28926w = i;
        if (this.f28924u != 1) {
            m31486g();
            this.f28909f = true;
            m31490k();
        }
    }

    /* renamed from: a */
    private void m31473a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.b0t, this, true);
        m31477b(context, attributeSet);
        m31482d();
    }

    /* renamed from: b */
    private void m31477b(Context context, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CommonItemView);
        this.f28917n = obtainStyledAttributes.getString(4);
        this.f28918o = obtainStyledAttributes.getString(7);
        this.f28919p = obtainStyledAttributes.getString(0);
        this.f28925v = obtainStyledAttributes.getResourceId(3, 0);
        if (C6394b.m19907b(context)) {
            i = R.drawable.cmk;
        } else {
            i = R.drawable.cml;
        }
        this.f28926w = obtainStyledAttributes.getResourceId(6, i);
        this.f28927x = obtainStyledAttributes.getColor(5, m31469a(getContext()));
        this.f28928y = obtainStyledAttributes.getColor(8, m31475b(getContext()));
        this.f28929z = obtainStyledAttributes.getColor(1, m31479c(getContext()));
        this.f28921r = obtainStyledAttributes.getBoolean(12, true);
        this.f28922s = obtainStyledAttributes.getBoolean(11, true);
        this.f28907d = obtainStyledAttributes.getBoolean(10, false);
        this.f28923t = obtainStyledAttributes.getBoolean(2, false);
        this.f28924u = obtainStyledAttributes.getInt(9, 0);
        this.f28908e = obtainStyledAttributes.getInt(13, 0);
        obtainStyledAttributes.recycle();
        if (this.f28921r) {
            int b = (int) C9738o.m28708b(context, 16.0f);
            setPadding(b, b, b, b);
        }
        if (this.f28922s) {
            setBackground(C10774c.m31449e(context));
        }
    }

    /* renamed from: d */
    private void m31483d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        this.f28915l.measure(makeMeasureSpec, i);
        this.f28914k.measure(makeMeasureSpec, i);
        int measuredWidth = this.f28915l.getMeasuredWidth();
        int a = m31471a(this.f28914k);
        if (measuredWidth + a <= i2) {
            this.f28915l.getLayoutParams().width = measuredWidth;
            this.f28914k.getLayoutParams().width = i2 - measuredWidth;
            return;
        }
        double d = (double) i2;
        Double.isNaN(d);
        int i3 = (int) (0.204d * d);
        if (a <= i3) {
            this.f28914k.getLayoutParams().width = i3;
            this.f28915l.getLayoutParams().width = i2 - i3;
        } else if (measuredWidth <= i3) {
            this.f28914k.getLayoutParams().width = i2 - i3;
            this.f28915l.getLayoutParams().width = i3;
        } else {
            Double.isNaN(d);
            int i4 = (int) (0.372d * d);
            if (measuredWidth <= i4) {
                this.f28915l.getLayoutParams().width = i4;
                this.f28914k.getLayoutParams().width = i2 - i4;
            } else if (a <= i4) {
                this.f28915l.getLayoutParams().width = i2 - i4;
                this.f28914k.getLayoutParams().width = i4;
            } else {
                Double.isNaN(d);
                int i5 = (int) (d * 0.29d);
                this.f28915l.getLayoutParams().width = i2 - i5;
                this.f28914k.getLayoutParams().width = i5;
            }
        }
    }

    /* renamed from: a */
    private void m31474a(CharSequence charSequence, int i) {
        this.f28925v = i;
        this.f28905b.setImageResource(this.f28925v);
        if (!(this.f28925v == 0 || this.f28905b.getVisibility() == 0)) {
            this.f28905b.setVisibility(0);
        }
        this.f28917n = charSequence;
        this.f28904a.setText(this.f28917n);
        if (this.f28907d) {
            mo25776a();
        }
        this.f28909f = true;
        m31490k();
    }

    public CommonItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28909f = true;
        this.f28910g = true;
        this.f28921r = true;
        this.f28922s = true;
        this.f28924u = -1;
        m31473a(context, attributeSet);
    }
}
