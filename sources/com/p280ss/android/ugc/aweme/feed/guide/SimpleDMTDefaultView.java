package com.p280ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.SimpleDMTDefaultView */
public class SimpleDMTDefaultView extends FrameLayout {

    /* renamed from: a */
    private DmtTextView f74767a;

    /* renamed from: b */
    private DmtTextView f74768b;

    /* renamed from: c */
    private AutoCenterDmtIconButton f74769c;

    /* renamed from: d */
    private ImageView f74770d;

    /* renamed from: a */
    public final SimpleDMTDefaultView mo72078a() {
        this.f74770d.setVisibility(8);
        return this;
    }

    /* renamed from: b */
    public final SimpleDMTDefaultView mo72083b() {
        this.f74769c.mo72029a(ButtonStyle.SOLID, -1, "");
        this.f74769c.setVisibility(8);
        return this;
    }

    /* renamed from: c */
    private void m93282c() {
        LayoutInflater.from(getContext()).inflate(R.layout.aaj, this, true);
        this.f74767a = (DmtTextView) findViewById(R.id.e3f);
        this.f74768b = (DmtTextView) findViewById(R.id.dt5);
        this.f74769c = (AutoCenterDmtIconButton) findViewById(R.id.awv);
        this.f74770d = (ImageView) findViewById(R.id.az_);
    }

    public SimpleDMTDefaultView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public final SimpleDMTDefaultView mo72084b(int i) {
        this.f74769c.setMinimumWidth(i);
        return this;
    }

    /* renamed from: c */
    public final SimpleDMTDefaultView mo72085c(int i) {
        this.f74767a.setText(i);
        return this;
    }

    /* renamed from: d */
    public final SimpleDMTDefaultView mo72086d(int i) {
        this.f74768b.setText(i);
        return this;
    }

    /* renamed from: e */
    public final SimpleDMTDefaultView mo72087e(int i) {
        setPadding(0, i, 0, 0);
        return this;
    }

    /* renamed from: h */
    public final SimpleDMTDefaultView mo72090h(int i) {
        this.f74767a.setTextSize(20.0f);
        return this;
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo72079a(int i) {
        this.f74770d.setImageResource(R.drawable.axg);
        this.f74770d.setVisibility(0);
        return this;
    }

    /* renamed from: f */
    public final SimpleDMTDefaultView mo72088f(int i) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f74768b.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.f74768b.setLayoutParams(marginLayoutParams);
        return this;
    }

    /* renamed from: g */
    public final SimpleDMTDefaultView mo72089g(int i) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f74769c.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.f74769c.setLayoutParams(marginLayoutParams);
        return this;
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo72080a(OnClickListener onClickListener) {
        this.f74769c.setOnClickListener(onClickListener);
        return this;
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo72082a(String str) {
        this.f74767a.setText(str);
        return this;
    }

    public SimpleDMTDefaultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleDMTDefaultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m93282c();
    }

    /* renamed from: a */
    public final SimpleDMTDefaultView mo72081a(ButtonStyle buttonStyle, int i, int i2) {
        this.f74769c.setVisibility(0);
        this.f74769c.mo72028a(buttonStyle, i, i2);
        return this;
    }
}
