package com.p280ss.android.ugc.aweme.tools.beauty;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.BeautyProgressBar */
public final class BeautyProgressBar extends FilterBeautySeekBar {

    /* renamed from: c */
    public boolean f109694c;

    /* renamed from: d */
    private int f109695d;

    /* renamed from: e */
    private int f109696e;

    public final int getMaxValue() {
        return this.f109696e;
    }

    public final int getMinValue() {
        return this.f109695d;
    }

    public final int getProgress() {
        String str;
        int progress = super.getProgress();
        if (this.f109694c) {
            float f = (float) progress;
            if (f >= ((float) getMax()) / 2.0f) {
                str = String.valueOf((int) (((((float) this.f109696e) / (((float) getMax()) / 2.0f)) * f) - ((float) this.f109696e)));
            } else {
                str = String.valueOf((int) ((((-((float) this.f109695d)) / (((float) getMax()) / 2.0f)) * f) + ((float) this.f109695d)));
            }
        } else {
            str = String.valueOf((int) (((((float) (this.f109696e - this.f109695d)) / ((float) getMax())) * ((float) progress)) + ((float) this.f109695d)));
        }
        this.f77341a = str;
        return progress;
    }

    public final void setDoubleDirection(boolean z) {
        this.f109694c = z;
    }

    public final void setMaxValue(int i) {
        this.f109696e = i;
    }

    public final void setMinValue(int i) {
        this.f109695d = i;
    }

    public BeautyProgressBar(Context context) {
        super(context);
        m134125a(context);
    }

    /* renamed from: a */
    private final void m134125a(Context context) {
        if (context != null) {
            if (C6399b.m19946v()) {
                Paint paint = this.f77342b;
                C7573i.m23582a((Object) paint, "mPaint");
                paint.setColor(context.getResources().getColor(R.color.az3));
            } else {
                Paint paint2 = this.f77342b;
                C7573i.m23582a((Object) paint2, "mPaint");
                paint2.setColor(context.getResources().getColor(R.color.r7));
            }
            Paint paint3 = this.f77342b;
            C7573i.m23582a((Object) paint3, "mPaint");
            paint3.setFakeBoldText(true);
        }
    }

    public BeautyProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m134125a(context);
    }

    public BeautyProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m134125a(context);
    }
}
