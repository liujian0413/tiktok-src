package com.bytedance.android.livesdk.fansclub;

import android.content.Context;
import android.support.p022v4.view.animation.C0957c;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class JoinFansPortraitNotifyView extends RelativeLayout {

    /* renamed from: k */
    private static final Interpolator f17445k = C0957c.m4073a(0.42f, 0.0f, 0.58f, 1.0f);

    /* renamed from: a */
    public View f17446a;

    /* renamed from: b */
    public C5903f f17447b;

    /* renamed from: c */
    public C5902e f17448c;

    /* renamed from: d */
    private View f17449d;

    /* renamed from: e */
    private VHeadView f17450e;

    /* renamed from: f */
    private TextView f17451f;

    /* renamed from: g */
    private View f17452g;

    /* renamed from: h */
    private View f17453h;

    /* renamed from: i */
    private float f17454i;

    /* renamed from: j */
    private int f17455j;

    public void setAnchorView(C5902e eVar) {
        this.f17448c = eVar;
    }

    public void setJoinMessagePresenter(C5903f fVar) {
        this.f17447b = fVar;
    }

    /* renamed from: a */
    private void m18415a(Context context) {
        this.f17454i = C9738o.m28708b(getContext(), 20.0f);
        this.f17455j = (int) C9738o.m28708b(getContext(), 40.0f);
        View.inflate(context, R.layout.apm, this);
        this.f17449d = findViewById(R.id.bfc);
        this.f17446a = findViewById(R.id.bfb);
        this.f17450e = (VHeadView) findViewById(R.id.b64);
        this.f17451f = (TextView) findViewById(R.id.e4l);
        this.f17452g = findViewById(R.id.bfa);
        this.f17453h = findViewById(R.id.bfe);
        C9738o.m28712b((View) this, 4);
    }

    public JoinFansPortraitNotifyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18415a(context);
    }

    public JoinFansPortraitNotifyView(Context context, boolean z) {
        super(context);
        m18415a(context);
    }

    public JoinFansPortraitNotifyView(Context context, boolean z, C5903f fVar) {
        super(context);
        m18415a(context);
        this.f17447b = fVar;
    }
}
