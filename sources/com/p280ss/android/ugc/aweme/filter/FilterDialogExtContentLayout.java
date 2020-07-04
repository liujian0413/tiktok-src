package com.p280ss.android.ugc.aweme.filter;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.filter.C29251bk.C29252a;
import com.p280ss.android.ugc.aweme.tools.filter.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterDialogExtContentLayout */
public class FilterDialogExtContentLayout extends LinearLayout implements OnClickListener, OnTouchListener {

    /* renamed from: a */
    private ViewGroup f77002a;

    /* renamed from: b */
    private Map<TextView, Boolean> f77003b;

    /* renamed from: c */
    private Context f77004c;

    /* renamed from: d */
    private int f77005d;

    /* renamed from: e */
    private C29252a f77006e;

    /* renamed from: f */
    private int f77007f;

    /* renamed from: g */
    private C29199ad f77008g;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m95697b();
    }

    /* renamed from: b */
    private void m95697b() {
        this.f77003b = new LinkedHashMap();
        int childCount = this.f77002a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f77002a.getChildAt(i);
            if (childAt instanceof TextView) {
                childAt.setOnClickListener(this);
                childAt.setOnTouchListener(this);
                this.f77003b.put((TextView) childAt, Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: a */
    private void m95695a() {
        if (!isInEditMode()) {
            this.f77002a = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.a6b, this, true).findViewById(R.id.ak9);
        }
    }

    public void setExtContentType(int i) {
        this.f77005d = i;
    }

    public void setItemInterceptor(C29199ad adVar) {
        this.f77008g = adVar;
    }

    public void setOnFilterExtItemSelectedListener(C29252a aVar) {
        this.f77006e = aVar;
    }

    public FilterDialogExtContentLayout(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int a = m95694a(view);
        if (a >= 0) {
            m95696a(a, true);
        }
    }

    /* renamed from: a */
    private int m95694a(View view) {
        int id = view.getId();
        int i = 0;
        for (Entry key : this.f77003b.entrySet()) {
            TextView textView = (TextView) key.getKey();
            if (textView != null && textView.getId() == id) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    private static void m95699c(View view) {
        if (view != null) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(100);
            view.startAnimation(scaleAnimation);
        }
    }

    /* renamed from: b */
    private static void m95698b(View view) {
        if (view != null) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(100);
            view.startAnimation(scaleAnimation);
        }
    }

    public FilterDialogExtContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m95698b(view);
        } else if (motionEvent.getAction() == 1) {
            m95699c(view);
        }
        return false;
    }

    /* renamed from: a */
    private void m95696a(int i, boolean z) {
        if (this.f77008g == null || !this.f77008g.mo74796a(this.f77005d, true)) {
            int i2 = 0;
            for (Entry entry : this.f77003b.entrySet()) {
                if (i != i2) {
                    TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R$styleable.LineStickerLayer1);
                    ((TextView) entry.getKey()).setBackground(obtainStyledAttributes.getDrawable(8));
                    obtainStyledAttributes.recycle();
                    TypedArray obtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(R$styleable.Reverse_Color);
                    ((TextView) entry.getKey()).setTextColor(obtainStyledAttributes2.getColor(20, 0));
                    entry.setValue(Boolean.valueOf(false));
                    obtainStyledAttributes2.recycle();
                } else if (!((Boolean) entry.getValue()).booleanValue()) {
                    TypedArray obtainStyledAttributes3 = getContext().getTheme().obtainStyledAttributes(R$styleable.LineStickerLayer1);
                    ((TextView) entry.getKey()).setBackground(obtainStyledAttributes3.getDrawable(7));
                    obtainStyledAttributes3.recycle();
                    ((TextView) entry.getKey()).setTextColor(this.f77004c.getResources().getColor(R.color.aut));
                    entry.setValue(Boolean.valueOf(true));
                    this.f77007f = i;
                } else {
                    return;
                }
                i2++;
            }
        }
    }

    public FilterDialogExtContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f77007f = -1;
        this.f77004c = context;
        m95695a();
    }
}
