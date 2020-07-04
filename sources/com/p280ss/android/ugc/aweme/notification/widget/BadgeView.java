package com.p280ss.android.ugc.aweme.notification.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView.BufferType;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.widget.BadgeView */
public class BadgeView extends DmtTextView {

    /* renamed from: b */
    public boolean f90420b;

    public int getBadgeGravity() {
        return ((LayoutParams) getLayoutParams()).gravity;
    }

    public Integer getBadgeCount() {
        if (getText() == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(getText().toString()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public int[] getBadgeMargin() {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        return new int[]{layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin};
    }

    /* renamed from: a */
    private void m111932a() {
        if (!(getLayoutParams() instanceof LayoutParams)) {
            setLayoutParams(new LayoutParams(-2, -2, 53));
        }
        setTextColor(getContext().getResources().getColor(R.color.a1e));
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(1, 12.0f);
        mo87943a(9, getContext().getResources().getColor(R.color.a1d));
        setGravity(17);
        setHideOnNull(true);
        setBadgeCount(0);
    }

    public void setBadgeMargin(int i) {
        m111933a(i, i, i, i);
    }

    public BadgeView(Context context) {
        this(context, null);
    }

    public void setBadgeGravity(int i) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.gravity = i;
        setLayoutParams(layoutParams);
    }

    public void setHideOnNull(boolean z) {
        this.f90420b = z;
        setText(getText());
    }

    /* renamed from: a */
    private int m111930a(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    private static String m111931a(int i) {
        if (i < 0) {
            return " ";
        }
        if (i > 99) {
            return "99+";
        }
        if (i <= 0 || i > 99) {
            return null;
        }
        return String.valueOf(i);
    }

    public void setBadgeCount(int i) {
        String a = m111931a(i);
        if (!TextUtils.isEmpty(a)) {
            if (a.length() == 1) {
                if (" ".equals(a)) {
                    setLayoutParams(new LayoutParams(m111930a(6.0f), m111930a(6.0f)));
                } else {
                    setLayoutParams(new LayoutParams(m111930a(18.0f), m111930a(18.0f)));
                }
            } else if (a.length() == 2) {
                setLayoutParams(new LayoutParams(m111930a(24.5f), m111930a(18.0f)));
            } else if (a.length() == 3) {
                setLayoutParams(new LayoutParams(m111930a(31.0f), m111930a(18.0f)));
            }
        }
        setText(a);
    }

    public void setTargetView(View view) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (view != null) {
            if (view.getParent() instanceof FrameLayout) {
                ((FrameLayout) view.getParent()).addView(this);
            } else if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeView(view);
                FrameLayout frameLayout = new FrameLayout(getContext());
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                frameLayout.setLayoutParams(layoutParams);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(frameLayout, indexOfChild, layoutParams);
                frameLayout.addView(view);
                frameLayout.addView(this);
            } else {
                view.getParent();
            }
        }
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (!this.f90420b || (charSequence != null && !charSequence.toString().equalsIgnoreCase("0"))) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        super.setText(charSequence, bufferType);
    }

    /* renamed from: a */
    public final void mo87943a(int i, int i2) {
        float a = (float) m111930a((float) i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{a, a, a, a, a, a, a, a}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        setBackground(shapeDrawable);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f90420b = true;
        m111932a();
    }

    /* renamed from: a */
    private void m111933a(int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.leftMargin = m111930a((float) i);
        layoutParams.topMargin = m111930a((float) i2);
        layoutParams.rightMargin = m111930a((float) i3);
        layoutParams.bottomMargin = m111930a((float) i4);
        setLayoutParams(layoutParams);
    }
}
