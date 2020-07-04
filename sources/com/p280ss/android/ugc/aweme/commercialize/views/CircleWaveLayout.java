package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout */
public class CircleWaveLayout extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    public static final String f67020a = "CircleWaveLayout";

    /* renamed from: b */
    public ScaleFadeCircleView f67021b;

    /* renamed from: c */
    public boolean f67022c;

    /* renamed from: d */
    public boolean f67023d;

    /* renamed from: e */
    protected C13401d<C13648f> f67024e;

    /* renamed from: f */
    private ScaleFadeCircleView f67025f;

    /* renamed from: g */
    private CircleImageView f67026g;

    /* renamed from: h */
    private Aweme f67027h;

    /* renamed from: a */
    public final void mo66128a() {
        this.f67025f.mo66229a();
        postDelayed(new Runnable() {
            public final void run() {
                CircleWaveLayout.this.f67021b.mo66229a();
            }
        }, 750);
    }

    /* renamed from: d */
    private void m83759d() {
        C24671f.m80851a().mo64677h(getContext(), this.f67027h);
        C24671f.m80851a().mo64668b(getContext(), this.f67027h);
    }

    /* renamed from: b */
    public final void mo66129b() {
        if (this.f67022c && this.f67023d) {
            C24671f.m80851a().mo64678i(getContext(), this.f67027h);
        }
    }

    /* renamed from: c */
    private void m83758c() {
        this.f67025f = (ScaleFadeCircleView) findViewById(R.id.ale);
        this.f67021b = (ScaleFadeCircleView) findViewById(R.id.d1s);
        this.f67026g = (CircleImageView) findViewById(R.id.w2);
        this.f67026g.setOnClickListener(this);
        setOnClickListener(this);
    }

    public CircleWaveLayout(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.w2) {
            C24671f.m80853c().mo64683a(getContext(), this.f67027h);
            m83759d();
        }
    }

    public CircleWaveLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleWaveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67024e = new C13400c<C13648f>() {
            public final void onRelease(String str) {
                super.onRelease(str);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onIntermediateImageSet(String str, C13648f fVar) {
                super.onIntermediateImageSet(str, fVar);
            }

            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                CircleWaveLayout.this.f67023d = false;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                if (CircleWaveLayout.this.f67022c) {
                    CircleWaveLayout.this.setVisibility(0);
                    CircleWaveLayout.this.mo66128a();
                    CircleWaveLayout.this.f67023d = true;
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.id, this);
        m83758c();
    }
}
