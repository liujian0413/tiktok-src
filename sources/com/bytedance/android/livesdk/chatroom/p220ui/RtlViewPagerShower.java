package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower */
public class RtlViewPagerShower extends LinearLayout {

    /* renamed from: a */
    private ArrayList<ImageView> f15174a = new ArrayList<>();

    /* renamed from: b */
    private int f15175b = -1;

    /* renamed from: c */
    private Drawable f15176c;

    /* renamed from: d */
    private Drawable f15177d;

    /* renamed from: e */
    private final LayoutParams f15178e = new LayoutParams(-2, -2);

    /* renamed from: f */
    private int f15179f = -1;

    public void setMargin(int i) {
        this.f15179f = i;
    }

    /* renamed from: a */
    public final void mo13410a(int i) {
        if (this.f15174a != null && !this.f15174a.isEmpty()) {
            if (this.f15175b >= 0 && this.f15175b < this.f15174a.size()) {
                if (this.f15176c != null) {
                    ((ImageView) this.f15174a.get(this.f15175b)).setImageDrawable(this.f15176c);
                } else {
                    ((ImageView) this.f15174a.get(this.f15175b)).setImageResource(R.drawable.c0a);
                }
            }
            if (i >= 0 && i < this.f15174a.size()) {
                if (this.f15177d != null) {
                    ((ImageView) this.f15174a.get(i)).setImageDrawable(this.f15177d);
                } else {
                    ((ImageView) this.f15174a.get(i)).setImageResource(R.drawable.c0_);
                }
                this.f15175b = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo13412a(Drawable drawable, Drawable drawable2) {
        this.f15176c = drawable;
        this.f15177d = drawable2;
    }

    public RtlViewPagerShower(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo13411a(int i, int i2) {
        removeAllViews();
        this.f15174a.clear();
        for (int i3 = 0; i3 < i; i3++) {
            ImageView imageView = new ImageView(getContext());
            if (this.f15176c != null) {
                imageView.setImageDrawable(this.f15176c);
            } else {
                imageView.setImageResource(R.drawable.c0a);
            }
            addView(imageView);
            this.f15174a.add(imageView);
        }
        mo13410a(i2);
    }

    public RtlViewPagerShower(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
