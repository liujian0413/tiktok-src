package com.zhihu.matisse.internal.p1856ui.widget;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.res.C0700e;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.CheckRadioView */
public class CheckRadioView extends AppCompatImageView {

    /* renamed from: a */
    private Drawable f121531a;

    /* renamed from: b */
    private int f121532b;

    /* renamed from: c */
    private int f121533c;

    /* renamed from: a */
    private void m147900a() {
        this.f121532b = C0700e.m2983b(getResources(), R.color.azx, getContext().getTheme());
        this.f121533c = C0700e.m2983b(getResources(), R.color.azw, getContext().getTheme());
        setChecked(false);
    }

    public CheckRadioView(Context context) {
        super(context);
        m147900a();
    }

    public void setColor(int i) {
        if (this.f121531a == null) {
            this.f121531a = getDrawable();
        }
        this.f121531a.setColorFilter(i, Mode.SRC_IN);
    }

    public void setChecked(boolean z) {
        if (z) {
            setImageResource(R.drawable.afb);
            this.f121531a = getDrawable();
            if (this.f121531a != null) {
                this.f121531a.setColorFilter(this.f121532b, Mode.SRC_IN);
            }
        } else {
            setImageResource(R.drawable.afa);
            this.f121531a = getDrawable();
            if (this.f121531a != null) {
                this.f121531a.setColorFilter(this.f121533c, Mode.SRC_IN);
            }
        }
    }

    public CheckRadioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m147900a();
    }
}
