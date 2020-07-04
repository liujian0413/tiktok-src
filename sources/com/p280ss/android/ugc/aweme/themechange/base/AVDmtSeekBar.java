package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtSeekBar */
public final class AVDmtSeekBar extends FilterBeautySeekBar {

    /* renamed from: c */
    private ClipDrawable f109581c;

    public AVDmtSeekBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setProgress(int i) {
        super.setProgress(i);
        if (this.f109581c != null) {
            ClipDrawable clipDrawable = this.f109581c;
            if (clipDrawable == null) {
                C7573i.m23580a();
            }
            clipDrawable.setLevel(i * 100);
        }
    }

    /* renamed from: a */
    private final void m134016a(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            i = (int) obtainStyledAttributes.getDimension(29, 0.0f);
            i3 = (int) obtainStyledAttributes.getDimension(38, 0.0f);
            i2 = (int) obtainStyledAttributes.getDimension(37, 0.0f);
        } else {
            i2 = 0;
            i = 0;
            i3 = 0;
        }
        int d = C42111b.m134055d();
        setThumb(C38501ax.m123067a(d, d, 0, i3, i2));
        int color = getResources().getColor(R.color.a76);
        this.f109581c = new ClipDrawable(C38501ax.m123066a(color, color, 0, i), 3, 1);
        ClipDrawable clipDrawable = this.f109581c;
        if (clipDrawable == null) {
            C7573i.m23580a();
        }
        clipDrawable.setLevel(getProgress() * 100);
        int a = C42111b.f109618a.mo103542a(false, false, false, false, true);
        Drawable a2 = C38501ax.m123066a(a, a, 0, i);
        Drawable[] drawableArr = new Drawable[2];
        C7573i.m23582a((Object) a2, "bgDrawable");
        drawableArr[0] = a2;
        ClipDrawable clipDrawable2 = this.f109581c;
        if (clipDrawable2 == null) {
            C7573i.m23580a();
        }
        drawableArr[1] = clipDrawable2;
        setProgressDrawable(new LayerDrawable(drawableArr));
    }

    public AVDmtSeekBar(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m134016a(context, attributeSet);
    }

    public /* synthetic */ AVDmtSeekBar(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
