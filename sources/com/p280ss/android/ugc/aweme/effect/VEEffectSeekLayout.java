package com.p280ss.android.ugc.aweme.effect;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.google.common.base.C17440n;
import com.google.common.collect.C17777bq;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41406s;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41407t;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.tools.effect.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.ss.android.ugc.aweme.effect.VEEffectSeekLayout */
public class VEEffectSeekLayout extends RelativeLayout {

    /* renamed from: a */
    public C41406s f72184a;

    /* renamed from: b */
    private VEEffectSeekBar f72185b;

    /* renamed from: c */
    private ImageView f72186c;

    /* renamed from: d */
    private TextView f72187d;

    /* renamed from: e */
    private TextView f72188e;

    /* renamed from: f */
    private ImageView f72189f;

    /* renamed from: g */
    private LayoutParams f72190g;

    /* renamed from: h */
    private int f72191h;

    /* renamed from: i */
    private ArrayList<EffectPointModel> f72192i;

    /* renamed from: j */
    private RelativeLayout f72193j;

    /* renamed from: k */
    private RelativeLayout f72194k;

    /* renamed from: l */
    private int f72195l;

    /* renamed from: m */
    private int f72196m;

    /* renamed from: n */
    private int f72197n;

    /* renamed from: o */
    private int f72198o;

    /* renamed from: com.ss.android.ugc.aweme.effect.VEEffectSeekLayout$a */
    class C27352a implements OnTouchListener {

        /* renamed from: b */
        private RelativeLayout f72202b;

        /* renamed from: c */
        private LayoutParams f72203c = ((LayoutParams) this.f72202b.getLayoutParams());

        /* renamed from: d */
        private int f72204d;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f72203c.setMargins(Math.round(VEEffectSeekLayout.this.mo70420a(motionEvent.getRawX(), this.f72204d)), 0, 0, 0);
                    this.f72202b.setLayoutParams(this.f72203c);
                    if (VEEffectSeekLayout.this.f72184a != null) {
                        VEEffectSeekLayout.this.f72184a.mo70613a(VEEffectSeekLayout.this.mo70421a(this.f72202b, this.f72204d), this.f72204d, 1);
                        break;
                    }
                    break;
                case 1:
                case 3:
                    if (VEEffectSeekLayout.this.f72184a != null) {
                        VEEffectSeekLayout.this.f72184a.mo70613a(VEEffectSeekLayout.this.mo70421a(this.f72202b, this.f72204d), this.f72204d, 2);
                        break;
                    }
                    break;
                case 2:
                    this.f72203c.setMargins(Math.round(VEEffectSeekLayout.this.mo70420a(motionEvent.getRawX(), this.f72204d)), 0, 0, 0);
                    this.f72202b.setLayoutParams(this.f72203c);
                    if (this.f72204d == 1) {
                        VEEffectSeekLayout.this.setStartTime(VEEffectSeekLayout.this.getCursorPosition());
                    }
                    if (VEEffectSeekLayout.this.f72184a != null) {
                        VEEffectSeekLayout.this.f72184a.mo70613a(VEEffectSeekLayout.this.mo70421a(this.f72202b, this.f72204d), this.f72204d, 3);
                        break;
                    }
                    break;
            }
            return true;
        }

        C27352a(RelativeLayout relativeLayout, int i) {
            this.f72202b = relativeLayout;
            this.f72204d = i;
        }
    }

    public ArrayList<EffectPointModel> getEffectPointModels() {
        return this.f72192i;
    }

    public RelativeLayout getSelelctLayout() {
        return this.f72194k;
    }

    public ImageView getTvSelelct() {
        return this.f72189f;
    }

    public void setOnPalyComplateListener(C41407t tVar) {
    }

    /* renamed from: a */
    public final void mo70422a() {
        this.f72192i.clear();
    }

    public int getCursorPosition() {
        return mo70421a(this.f72193j, 1);
    }

    public int getSelectPosition() {
        return mo70421a(this.f72194k, 2);
    }

    public int getCursorOffsetTime() {
        return (int) ((((float) ((int) C9738o.m28708b(getContext(), 21.0f))) / ((float) C27421d.f72341b)) * ((float) this.f72196m));
    }

    public void setOnCursorSeekListener(C41406s sVar) {
        this.f72184a = sVar;
    }

    public VEEffectSeekLayout(Context context) {
        this(context, null);
    }

    public void setNormalColor(int i) {
        this.f72185b.setNormalColor(i);
    }

    public void setOverlayColor(int i) {
        this.f72185b.setOverlayColor(i);
    }

    /* renamed from: d */
    private EffectPointModel m89687d(final int i) {
        try {
            return (EffectPointModel) C17777bq.m59103d(this.f72192i, new C17440n<EffectPointModel>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public boolean apply(EffectPointModel effectPointModel) {
                    if (effectPointModel.getIndex() == i) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo70428b(int i) {
        this.f72197n = i;
        mo70429b(this.f72197n, 1);
    }

    /* renamed from: e */
    private int m89688e(int i) {
        if (i == 1) {
            return (int) C9738o.m28708b(getContext(), 4.0f);
        }
        return (int) C9738o.m28708b(getContext(), 30.0f);
    }

    /* renamed from: a */
    public final void mo70423a(int i) {
        this.f72192i.remove(m89687d(i));
        this.f72185b.setEffectPointModels(this.f72192i);
    }

    public void setEffectPointModels(List<EffectPointModel> list) {
        this.f72192i.clear();
        this.f72192i.addAll(list);
        this.f72185b.setEffectPointModels(this.f72192i);
    }

    public void setStartTime(int i) {
        if (i > this.f72196m - getCursorOffsetTime()) {
            i = this.f72196m;
        }
        this.f72188e.setText(m89686c(i));
    }

    public void setVideoDuration(int i) {
        if (this.f72185b != null) {
            this.f72196m = i;
            this.f72185b.setTime(i);
            this.f72187d.setText(m89686c(i));
        }
    }

    /* renamed from: c */
    private static String m89686c(int i) {
        StringBuilder sb = new StringBuilder();
        double d = (double) i;
        Double.isNaN(d);
        sb.append((int) Math.floor(d / 1000.0d));
        String sb2 = sb.toString();
        if (sb2.length() < 2) {
            StringBuilder sb3 = new StringBuilder("0");
            sb3.append(sb2);
            sb2 = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder("00:");
        sb4.append(sb2);
        return sb4.toString();
    }

    private void setPadding(RelativeLayout relativeLayout) {
        int i = this.f72198o;
        if (relativeLayout.getChildAt(0) != null) {
            View childAt = relativeLayout.getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getLeft() <= i) {
                layoutParams.addRule(9);
            } else if (childAt.getRight() > C9738o.m28691a(getContext()) - i) {
                layoutParams.addRule(11);
            } else {
                layoutParams.addRule(14);
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo70427a(boolean z) {
        this.f72185b.mo70412a(z);
    }

    public VEEffectSeekLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo70425a(int i, long j) {
        m89687d(i).setEndPoint((int) j);
        this.f72185b.setEffectPointModels(this.f72192i);
    }

    /* renamed from: a */
    public final int mo70421a(RelativeLayout relativeLayout, int i) {
        int i2 = 0;
        if (relativeLayout == null) {
            return 0;
        }
        int left = (int) ((((float) (relativeLayout.getLeft() - this.f72198o)) / ((float) C27421d.f72341b)) * ((float) this.f72196m));
        int e = (int) ((((float) m89688e(i)) / ((float) C27421d.f72341b)) * ((float) this.f72196m));
        if (left >= 0) {
            if (left > this.f72196m - e) {
                i2 = this.f72196m;
            } else {
                i2 = left;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final float mo70420a(float f, int i) {
        int e = m89688e(i);
        if (f < ((float) this.f72198o)) {
            return (float) (-this.f72191h);
        }
        if (f > ((float) (((int) C9738o.m28708b(getContext(), (float) (this.f72195l - 16))) - e))) {
            return ((C9738o.m28708b(getContext(), (float) this.f72195l) - ((float) (this.f72198o * 2))) - ((float) e)) + ((float) this.f72191h);
        }
        float f2 = f - ((float) this.f72198o);
        return f2 + (((float) this.f72191h) * (((2.0f * f2) / ((C9738o.m28708b(getContext(), (float) this.f72195l) - ((float) (this.f72198o * 2))) - ((float) e))) - 4.0f));
    }

    /* renamed from: b */
    public final void mo70429b(int i, int i2) {
        int e = C27421d.f72341b - m89688e(i2);
        int i3 = (int) ((((float) i) / ((float) this.f72196m)) * ((float) e));
        if (i3 >= e) {
            i3 = this.f72191h + e;
        }
        if (i3 <= 0) {
            i3 = -this.f72191h;
        }
        if (i2 == 2) {
            LayoutParams layoutParams = (LayoutParams) this.f72194k.getLayoutParams();
            if (i >= this.f72196m) {
                i3 = e;
            }
            layoutParams.setMargins(i3, 0, 0, 0);
            this.f72194k.setLayoutParams(layoutParams);
        } else if (i2 == 1) {
            LayoutParams layoutParams2 = (LayoutParams) this.f72193j.getLayoutParams();
            layoutParams2.setMargins(i3, 0, 0, 0);
            this.f72193j.setLayoutParams(layoutParams2);
        }
        setStartTime(i);
    }

    /* renamed from: a */
    private void m89685a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ha, this, true);
        this.f72192i = new ArrayList<>();
        this.f72185b = (VEEffectSeekBar) inflate.findViewById(R.id.acx);
        this.f72186c = (ImageView) inflate.findViewById(R.id.dsq);
        this.f72187d = (TextView) inflate.findViewById(R.id.du4);
        this.f72188e = (TextView) inflate.findViewById(R.id.e2d);
        this.f72189f = (ImageView) inflate.findViewById(R.id.e1m);
        this.f72193j = (RelativeLayout) inflate.findViewById(R.id.cue);
        this.f72194k = (RelativeLayout) inflate.findViewById(R.id.cv1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EffectSeekLayout);
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.f72185b.setNormalColor(color);
        this.f72193j.setOnTouchListener(new C27352a(this.f72193j, 1));
        this.f72194k.setOnTouchListener(new C27352a(this.f72194k, 2));
        this.f72190g = (LayoutParams) this.f72193j.getLayoutParams();
        this.f72190g.setMargins(-this.f72191h, 0, 0, 0);
        this.f72193j.setLayoutParams(this.f72190g);
        this.f72186c.setImageDrawable(C38501ax.m123066a(C42111b.f109618a.mo103547c(), -1, 1, (int) C9738o.m28708b(getContext(), 2.0f)));
        inflate.findViewById(R.id.nj).setBackground(C38501ax.m123066a(C42111b.f109618a.mo103546b(false), 0, (int) C9738o.m28708b(getContext(), 1.0f), 0));
        View findViewById = inflate.findViewById(R.id.acy);
        LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
        int i = this.f72198o;
        layoutParams.rightMargin = i;
        layoutParams.leftMargin = i;
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo70424a(int i, int i2) {
        if (!this.f72192i.isEmpty()) {
            m89687d(i).setEndPoint(i2);
            this.f72185b.setEffectPointModels(this.f72192i);
        }
        mo70428b(i2);
    }

    public VEEffectSeekLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72195l = C9738o.m28714c(context, (float) C9738o.m28691a(context));
        this.f72191h = (int) C9738o.m28708b(context, 0.0f);
        if (attributeSet != null) {
            this.f72198o = Math.round(context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView).getDimension(6, 0.0f));
        }
        m89685a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo70426a(int i, long j, int i2, boolean z) {
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setIndex(i);
        int i3 = (int) j;
        effectPointModel.setStartPoint(i3);
        effectPointModel.setEndPoint(i3);
        effectPointModel.setSelectColor(i2);
        effectPointModel.setFromEnd(z);
        this.f72192i.add(effectPointModel);
        this.f72185b.setEffectPointModels(this.f72192i);
    }
}
