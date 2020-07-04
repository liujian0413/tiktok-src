package com.p280ss.android.ugc.aweme.poi.preview.view.indicator;

import android.content.Context;
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35143a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.view.indicator.TitleIndicator */
public final class TitleIndicator extends AppCompatTextView {

    /* renamed from: b */
    public C35143a f92171b;

    /* renamed from: c */
    private final TitleIndicator$mInternalPageChangeListener$1 f92172c;

    public TitleIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public TitleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo89617a(ViewPager viewPager, C35143a aVar) {
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        setTextColor(context.getResources().getColor(R.color.sd));
        setTextSize(17.0f);
        this.f92171b = aVar;
        if (viewPager != null && viewPager.getAdapter() != null && this.f92171b != null) {
            setVisibility(0);
            viewPager.removeOnPageChangeListener(this.f92172c);
            viewPager.addOnPageChangeListener(this.f92172c);
            this.f92172c.onPageSelected(viewPager.getCurrentItem());
        }
    }

    public TitleIndicator(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f92172c = new TitleIndicator$mInternalPageChangeListener$1(this);
    }

    public /* synthetic */ TitleIndicator(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
