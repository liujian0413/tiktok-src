package com.p280ss.android.ugc.aweme.photo.local;

import android.content.Context;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.facebook.common.internal.C13307g;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator */
public class MediaTypeNavigator extends RelativeLayout {

    /* renamed from: a */
    public ImageView f90636a;

    /* renamed from: b */
    public LinearLayout f90637b;

    /* renamed from: c */
    public int f90638c;

    /* renamed from: d */
    public View f90639d;

    public ImageView getTabIndicator() {
        return this.f90636a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f90636a = (ImageView) findViewById(R.id.b0p);
        this.f90637b = (LinearLayout) findViewById(R.id.dfb);
    }

    public MediaTypeNavigator(Context context) {
        super(context);
    }

    public void setupWithViewPager(final ViewPager viewPager) {
        boolean z;
        C13307g.m38940a(viewPager);
        C13307g.m38940a(viewPager.getAdapter());
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter.getCount() == 2) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38940a(Boolean.valueOf(z));
        this.f90638c = C9738o.m28691a(getContext()) / adapter.getCount();
        LayoutParams layoutParams = (LayoutParams) this.f90636a.getLayoutParams();
        layoutParams.width = this.f90638c;
        this.f90636a.setLayoutParams(layoutParams);
        this.f90637b.removeAllViews();
        int count = adapter.getCount();
        for (final int i = 0; i < count; i++) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.b3l, this.f90637b, false);
            if (i == 0) {
                this.f90639d = textView;
                textView.setSelected(true);
                textView.getPaint().setFakeBoldText(true);
                textView.setText(R.string.fny);
            } else if (i == 1) {
                textView.setText(R.string.bsr);
            }
            textView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    viewPager.setCurrentItem(i);
                }
            });
            this.f90637b.addView(textView);
        }
        viewPager.addOnPageChangeListener(new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageSelected(int i) {
                View childAt = MediaTypeNavigator.this.f90637b.getChildAt(i);
                if (MediaTypeNavigator.this.f90639d != null) {
                    MediaTypeNavigator.this.f90639d.setSelected(false);
                    ((TextView) MediaTypeNavigator.this.f90639d).getPaint().setFakeBoldText(false);
                }
                if (childAt != null) {
                    childAt.setSelected(true);
                    ((TextView) childAt).getPaint().setFakeBoldText(true);
                    MediaTypeNavigator.this.f90639d = childAt;
                }
            }

            public final void onPageScrolled(int i, float f, int i2) {
                float f2 = ((float) MediaTypeNavigator.this.f90638c) * (((float) i) + f);
                if (C43127fh.m136806a(MediaTypeNavigator.this.getContext())) {
                    f2 = -f2;
                }
                MediaTypeNavigator.this.f90636a.setTranslationX(f2);
            }
        });
    }

    public MediaTypeNavigator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaTypeNavigator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
