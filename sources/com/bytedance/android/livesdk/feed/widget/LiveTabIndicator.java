package com.bytedance.android.livesdk.feed.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.tab.p365c.C7776a;
import com.bytedance.android.livesdkapi.view.C9520d;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveTabIndicator extends HorizontalScrollView {

    /* renamed from: a */
    private C7831a f21130a;

    /* renamed from: b */
    LinearLayout f21131b;

    /* renamed from: c */
    private boolean f21132c = true;

    /* renamed from: d */
    private Map<Long, Boolean> f21133d = new HashMap();

    /* renamed from: e */
    private List<C5989f> f21134e;

    /* renamed from: f */
    private C7832b f21135f;

    /* renamed from: com.bytedance.android.livesdk.feed.widget.LiveTabIndicator$a */
    public interface C7831a {
        /* renamed from: a */
        void mo14683a(C5989f fVar);
    }

    /* renamed from: com.bytedance.android.livesdk.feed.widget.LiveTabIndicator$b */
    class C7832b implements OnLayoutChangeListener {

        /* renamed from: a */
        public List<C5989f> f21136a;

        C7832b(List<C5989f> list) {
            this.f21136a = list;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            LiveTabIndicator.this.mo20520a(this.f21136a);
            LiveTabIndicator.this.removeOnLayoutChangeListener(this);
        }
    }

    /* renamed from: b */
    private void mo20511b() {
        getParentViewPager();
    }

    /* renamed from: c */
    private void mo20512c() {
        getParentViewPager();
    }

    public int getLayoutId() {
        return R.layout.axg;
    }

    private C9520d getParentViewPager() {
        ViewParent viewParent = this;
        while (viewParent != null && !(viewParent instanceof C9520d)) {
            viewParent = viewParent.getParent();
        }
        return (C9520d) viewParent;
    }

    /* renamed from: a */
    private void mo20510a() {
        inflate(getContext(), getLayoutId(), this);
        setHorizontalScrollBarEnabled(false);
        this.f21131b = (LinearLayout) findViewById(R.id.a1m);
    }

    /* access modifiers changed from: protected */
    public int getItemGap() {
        if (this.f21134e.size() > 5 || this.f21134e.size() <= 1) {
            return (int) C9738o.m28708b(getContext(), 30.0f);
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        int i = 0;
        for (C5989f fVar : this.f21134e) {
            float measureText = textPaint.measureText(fVar.f17752b);
            float f = (float) i;
            if (measureText <= 0.0f) {
                measureText = 0.0f;
            }
            i = (int) (f + measureText);
        }
        int width = getWidth();
        int[] leftAndRightPadding = getLeftAndRightPadding();
        return (((width - leftAndRightPadding[0]) - leftAndRightPadding[1]) - i) / (this.f21134e.size() - 1);
    }

    /* access modifiers changed from: protected */
    public int[] getLeftAndRightPadding() {
        if (this.f21134e.size() == 1) {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
            int a = (int) ((((float) C9738o.m28691a(getContext())) - textPaint.measureText(((C5989f) this.f21134e.get(0)).f17752b)) / 2.0f);
            return new int[]{a, a};
        } else if (this.f21134e.size() == 2) {
            int a2 = C9738o.m28691a(getContext());
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
            float f = (float) (a2 / 2);
            int measureText = (int) ((f - textPaint2.measureText(((C5989f) this.f21134e.get(1)).f17752b)) / 2.0f);
            return new int[]{(int) ((f - textPaint2.measureText(((C5989f) this.f21134e.get(0)).f17752b)) / 2.0f), measureText};
        } else {
            int b = (int) C9738o.m28708b(getContext(), 30.0f);
            return new int[]{b, b};
        }
    }

    public void setOnTabClickListener(C7831a aVar) {
        this.f21130a = aVar;
    }

    public LiveTabIndicator(Context context) {
        super(context);
        mo20510a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            mo20511b();
        } else if (motionEvent.getAction() != 2) {
            mo20512c();
        } else if (onInterceptTouchEvent) {
            mo20511b();
        }
        return onInterceptTouchEvent;
    }

    /* renamed from: a */
    private void m24010a(int i) {
        int childCount = this.f21131b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (i2 != i) {
                ((C7776a) this.f21131b.getChildAt(i2)).setChecked(false);
                C5989f fVar = (C5989f) this.f21134e.get(i2);
                fVar.f17761k = false;
                this.f21133d.put(Long.valueOf(fVar.f17751a), Boolean.valueOf(false));
            }
        }
    }

    public void setTitles(List<C5989f> list) {
        if (getWidth() != 0) {
            mo20520a(list);
            return;
        }
        if (this.f21135f == null) {
            this.f21135f = new C7832b(list);
        }
        this.f21135f.f21136a = list;
        removeOnLayoutChangeListener(this.f21135f);
        addOnLayoutChangeListener(this.f21135f);
    }

    /* renamed from: a */
    public final void mo20519a(C5989f fVar) {
        int childCount = this.f21131b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C7776a aVar = (C7776a) this.f21131b.getChildAt(i);
            long j = ((C5989f) this.f21134e.get(i)).f17751a;
            if (j == fVar.f17751a) {
                aVar.setChecked(true);
                this.f21133d.put(Long.valueOf(j), Boolean.valueOf(true));
                ((C5989f) this.f21134e.get(i)).f17761k = true;
            } else {
                aVar.setChecked(false);
                this.f21133d.put(Long.valueOf(j), Boolean.valueOf(false));
                ((C5989f) this.f21134e.get(i)).f17761k = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo20520a(List<C5989f> list) {
        if (this.f21131b != null) {
            this.f21131b.removeAllViews();
            if (!C6307b.m19566a((Collection<T>) list)) {
                this.f21134e = list;
                for (int i = 0; i < list.size(); i++) {
                    C5989f fVar = (C5989f) list.get(i);
                    if (i == 0 && this.f21132c) {
                        this.f21133d.put(Long.valueOf(fVar.f17751a), Boolean.valueOf(true));
                        this.f21132c = false;
                    }
                    this.f21131b.addView(m24008a(fVar, i));
                }
                if (list.size() == 1) {
                    setVisibility(8);
                }
            }
        }
    }

    public LiveTabIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo20510a();
    }

    /* renamed from: a */
    private C7776a m24008a(C5989f fVar, int i) {
        C7776a aVar = new C7776a(getContext());
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        int[] leftAndRightPadding = getLeftAndRightPadding();
        int itemGap = getItemGap();
        if (i == 0) {
            layoutParams.setMargins(leftAndRightPadding[0], 0, 0, 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(leftAndRightPadding[0]);
                layoutParams.setMarginEnd(0);
            }
        } else if (i == this.f21134e.size() - 1) {
            layoutParams.setMargins(itemGap, 0, leftAndRightPadding[1], 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(itemGap);
                layoutParams.setMarginEnd(leftAndRightPadding[1]);
            }
        } else {
            layoutParams.setMargins(itemGap, 0, 0, 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(itemGap);
                layoutParams.setMarginEnd(0);
            }
        }
        aVar.setLayoutParams(layoutParams);
        aVar.setGravity(17);
        if (VERSION.SDK_INT >= 17) {
            aVar.setTextAlignment(4);
        }
        aVar.setTextColor(getResources().getColorStateList(R.color.anw));
        aVar.setText(fVar.f17752b);
        if (this.f21133d.containsKey(Long.valueOf(fVar.f17751a))) {
            aVar.setChecked(((Boolean) this.f21133d.get(Long.valueOf(fVar.f17751a))).booleanValue());
        }
        aVar.mo20453a(1, 16.0f);
        aVar.setOnClickListener(new C7833a(this, i, fVar, aVar));
        return aVar;
    }

    public LiveTabIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo20510a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20518a(int i, C5989f fVar, C7776a aVar, View view) {
        m24010a(i);
        fVar.f17761k = true;
        aVar.setChecked(true);
        this.f21133d.put(Long.valueOf(fVar.f17751a), Boolean.valueOf(true));
        if (this.f21130a != null) {
            this.f21130a.mo14683a(fVar);
        }
    }

    public LiveTabIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo20510a();
    }
}
