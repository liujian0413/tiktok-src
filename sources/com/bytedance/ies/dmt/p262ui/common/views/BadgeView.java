package com.bytedance.ies.dmt.p262ui.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.common.views.BadgeView */
public class BadgeView extends DmtTextView {

    /* renamed from: b */
    private int f28900b;

    /* renamed from: c */
    private int f28901c;

    /* renamed from: d */
    private int f28902d;

    /* renamed from: e */
    private CharSequence f28903e;

    /* renamed from: a */
    public final void mo1061a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public final void mo25770b() {
        setVisibility(8);
    }

    /* renamed from: c */
    private void m31463c() {
        int measuredHeight = getMeasuredHeight();
        if (this.f28902d != measuredHeight) {
            this.f28902d = measuredHeight;
            m31461a(this.f28902d, this.f28900b);
        }
    }

    /* renamed from: e */
    private void m31465e() {
        int i;
        int i2;
        if (this.f28901c == 2) {
            i2 = (int) C9738o.m28708b(getContext(), 4.0f);
            i = i2;
        } else {
            i2 = 0;
            i = 0;
        }
        super.setPadding(i2, 0, i, 0);
    }

    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31464d() {
        /*
            r3 = this;
            int r0 = r3.f28901c
            switch(r0) {
                case 1: goto L_0x0028;
                case 2: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.Context r0 = r3.getContext()
            r1 = 1086324736(0x40c00000, float:6.0)
            float r0 = com.bytedance.common.utility.C9738o.m28708b(r0, r1)
            int r0 = (int) r0
        L_0x0010:
            r1 = r0
            goto L_0x0034
        L_0x0012:
            android.content.Context r0 = r3.getContext()
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = com.bytedance.common.utility.C9738o.m28708b(r0, r1)
            int r0 = (int) r0
            int r1 = r3.getMeasuredWidth()
            if (r1 >= r0) goto L_0x0024
            goto L_0x0010
        L_0x0024:
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x0034
        L_0x0028:
            android.content.Context r0 = r3.getContext()
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = com.bytedance.common.utility.C9738o.m28708b(r0, r1)
            int r0 = (int) r0
            goto L_0x0010
        L_0x0034:
            r3.setMeasuredDimension(r0, r1)
            r3.m31463c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p262ui.common.views.BadgeView.m31464d():void");
    }

    public BadgeView(Context context) {
        this(context, null);
    }

    public void setCount(int i) {
        setText(String.valueOf(i));
    }

    public void setBadgeColor(int i) {
        this.f28900b = i;
        m31461a(this.f28902d, this.f28900b);
    }

    /* renamed from: a */
    public final void mo25769a(AttributeSet attributeSet) {
        super.mo25769a(attributeSet);
        m31462b(attributeSet);
        setTextSize(1, 12.0f);
        setGravity(17);
    }

    /* renamed from: b */
    private void m31462b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BadgeView);
        this.f28900b = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(R.color.a2x));
        setMode(obtainStyledAttributes.getInt(1, 0));
        obtainStyledAttributes.recycle();
    }

    public void setMode(int i) {
        if (this.f28901c != i) {
            this.f28901c = i;
            if (this.f28901c != 2) {
                this.f28903e = getText();
                setText("");
            } else if (TextUtils.isEmpty(getText()) && !TextUtils.isEmpty(this.f28903e)) {
                setText(this.f28903e);
            }
            m31465e();
            m31464d();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m31464d();
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(1, 12.0f);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m31461a(int i, int i2) {
        float b = (float) ((int) C9738o.m28708b(getContext(), (float) i));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{b, b, b, b, b, b, b, b}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        setBackground(shapeDrawable);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        CharSequence charSequence2;
        if (this.f28901c != 2 || TextUtils.isEmpty(charSequence)) {
            this.f28903e = charSequence;
            charSequence2 = "";
        } else {
            try {
                Integer valueOf = Integer.valueOf(charSequence.toString());
                if (valueOf.intValue() > 99) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("99+");
                    spannableStringBuilder.setSpan(new C10786b("+"), 2, 3, 17);
                    charSequence2 = spannableStringBuilder;
                } else if (valueOf.intValue() < 0) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence;
                }
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder("Excepted a int but get ");
                sb.append(charSequence);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        super.setText(charSequence2, bufferType);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28901c = -1;
        mo25769a(attributeSet);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        m31465e();
    }
}
