package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.common.widget.AbstractLoadingLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.LoadMoreLoadingLayout */
public class LoadMoreLoadingLayout extends AbstractLoadingLayout {

    /* renamed from: f */
    private int f69552f;

    public LoadMoreLoadingLayout(Context context) {
        this(context, null);
    }

    public LoadMoreLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 1073741824), MeasureSpec.makeMeasureSpec((int) C9738o.m28708b(getContext(), (float) this.f69552f), 1073741824));
    }

    /* renamed from: a */
    public final void mo66618a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        super.mo66618a(i, i2);
        if (this.f67668a != null) {
            View view = this.f67668a;
            if (i2 == 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            view.setVisibility(i5);
        }
        View view2 = this.f67669b;
        int i6 = 8;
        if (i2 == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        View view3 = this.f67671d;
        if (i2 == 2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = this.f67670c;
        if (i2 == 3) {
            i6 = 0;
        }
        view4.setVisibility(i6);
        if (i2 == 0) {
            this.f69552f = 0;
        } else {
            this.f69552f = 45;
        }
        requestLayout();
    }

    public LoadMoreLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69552f = 45;
        mo66618a(0, 0);
    }

    public void addView(View view, int i, int i2) {
        int i3;
        super.addView(view, i, i2);
        if (this.f67668a == view) {
            View view2 = this.f67668a;
            if (this.f67672e == 0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view2.setVisibility(i3);
        }
    }

    /* renamed from: b */
    public final View mo66620b(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, i);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(C0683b.m2912c(context, R.color.a5m));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.c47);
        appCompatTextView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
            }
        });
        return appCompatTextView;
    }

    /* renamed from: c */
    public final View mo66621c(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, i);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(C0683b.m2912c(context, R.color.a5m));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.c48);
        appCompatTextView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
            }
        });
        return appCompatTextView;
    }

    /* renamed from: a */
    public final View mo66617a(Context context, AttributeSet attributeSet, int i) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, attributeSet, i);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setTextColor(C0683b.m2912c(context, R.color.a53));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(R.string.c49);
        ProgressBar progressBar = new ProgressBar(context, attributeSet, i);
        progressBar.setId(R.id.bty);
        progressBar.setIndeterminate(true);
        progressBar.setIndeterminateDrawable(context.getResources().getDrawable(R.drawable.b_p));
        int b = (int) C9738o.m28708b(context, 15.0f);
        LayoutParams layoutParams = new LayoutParams(b, b);
        layoutParams.setMargins(0, 0, (int) C9738o.m28708b(context, 5.0f), 0);
        progressBar.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        linearLayout.setGravity(16);
        linearLayout.addView(progressBar);
        linearLayout.addView(appCompatTextView);
        return linearLayout;
    }
}
