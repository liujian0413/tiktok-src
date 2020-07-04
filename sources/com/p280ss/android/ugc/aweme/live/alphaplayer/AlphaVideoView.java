package com.p280ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import android.content.res.TypedArray;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import com.p280ss.android.ugc.aweme.live.alphaplayer.C32462f.C32463a;
import com.p280ss.android.ugc.aweme.live.alphaplayer.DataSource.ScaleType;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.AlphaVideoView */
public class AlphaVideoView extends GLSurfaceView {

    /* renamed from: a */
    public volatile boolean f84609a;

    /* renamed from: b */
    public C32462f f84610b;

    /* renamed from: c */
    public C32461e f84611c;

    /* renamed from: d */
    public Surface f84612d;

    /* renamed from: e */
    private float f84613e;

    /* renamed from: f */
    private float f84614f;

    /* renamed from: g */
    private ScaleType f84615g;

    /* renamed from: h */
    private C32463a f84616h = new C32463a() {
        /* renamed from: a */
        public final void mo83671a() {
            if (AlphaVideoView.this.f84612d != null) {
                AlphaVideoView.this.f84612d.release();
            }
            AlphaVideoView.this.f84609a = false;
            AlphaVideoView.this.f84612d = null;
        }

        /* renamed from: a */
        public final void mo83672a(Surface surface) {
            if (AlphaVideoView.this.f84612d != null) {
                AlphaVideoView.this.f84612d.release();
            }
            AlphaVideoView.this.f84612d = surface;
            AlphaVideoView.this.f84609a = true;
            AlphaVideoView.this.f84611c.mo83680a(AlphaVideoView.this.f84612d);
            AlphaVideoView.this.f84611c.mo83678a();
        }
    };

    public ScaleType getScaleType() {
        return this.f84615g;
    }

    /* renamed from: a */
    public final void mo83661a() {
        this.f84610b.mo83711a();
    }

    /* renamed from: b */
    public final void mo83663b() {
        this.f84610b.mo83716b();
    }

    /* renamed from: d */
    private void m105076d() {
        if (this.f84610b != null) {
            this.f84610b.mo83714a(this.f84616h);
        }
    }

    /* renamed from: c */
    public final void mo83664c() {
        if (this.f84616h != null) {
            this.f84616h.mo83671a();
        }
    }

    public void setPlayerController(C32461e eVar) {
        this.f84611c = eVar;
    }

    public void setScaleType(ScaleType scaleType) {
        this.f84615g = scaleType;
        if (this.f84610b != null) {
            this.f84610b.mo83713a(scaleType);
        }
    }

    public void setVideoRenderer(C32465h hVar) {
        this.f84610b = hVar;
        setRenderer(hVar);
        m105076d();
        setRenderMode(0);
    }

    /* renamed from: b */
    private void m105075b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.AlphaVideoView);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                this.f84610b.mo83715a(string);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m105074a(AttributeSet attributeSet) {
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(-3);
        m105075b(attributeSet);
        m105076d();
        setZOrderOnTop(true);
        setPreserveEGLContextOnPause(true);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo83662a(this.f84613e, this.f84614f);
    }

    public AlphaVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            m105074a(attributeSet);
        }
    }

    /* renamed from: a */
    public final void mo83662a(float f, float f2) {
        if (f > 0.0f && f2 > 0.0f) {
            this.f84613e = f;
            this.f84614f = f2;
        }
        if (this.f84610b != null) {
            final float measuredWidth = (float) getMeasuredWidth();
            final float measuredHeight = (float) getMeasuredHeight();
            final float f3 = f;
            final float f4 = f2;
            C324351 r1 = new Runnable() {
                public final void run() {
                    AlphaVideoView.this.f84610b.mo83712a(measuredWidth, measuredHeight, f3, f4);
                }
            };
            queueEvent(r1);
        }
    }
}
