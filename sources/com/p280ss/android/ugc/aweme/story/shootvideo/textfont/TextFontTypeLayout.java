package com.p280ss.android.ugc.aweme.story.shootvideo.textfont;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.MaskBlurLightTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textfont.TextFontTypeLayout */
public class TextFontTypeLayout extends FrameLayout implements C42036a {

    /* renamed from: a */
    private MaskBlurLightTextView f109165a;

    /* renamed from: b */
    private View f109166b;

    /* renamed from: c */
    private ImageView f109167c;

    /* renamed from: d */
    private ObjectAnimator f109168d;

    /* renamed from: e */
    private C42038c f109169e;

    /* renamed from: f */
    private C42036a f109170f;

    /* renamed from: g */
    private Drawable f109171g;

    /* renamed from: h */
    private Drawable f109172h;

    public C42038c getFontData() {
        return this.f109169e;
    }

    public void setBackground(Drawable drawable) {
    }

    /* renamed from: a */
    public final boolean mo103196a() {
        if (this.f109169e == null || !this.f109169e.mo103219c()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m133591e() {
        if (this.f109168d != null) {
            this.f109168d.cancel();
        }
        this.f109168d = null;
        this.f109167c.setRotation(0.0f);
        this.f109167c.setImageDrawable(C0683b.m2903a(getContext(), (int) R.drawable.als));
    }

    /* renamed from: f */
    private void m133592f() {
        if (this.f109169e != null) {
            Typeface b = C42039d.m133620a().mo103227b(this.f109169e.f109191i);
            if (b != null) {
                this.f109165a.setTypeface(b);
            }
            if (this.f109169e.mo103218b()) {
                this.f109165a.setMaskBlurColor(-6400);
            }
        }
    }

    /* renamed from: b */
    public final void mo103197b() {
        if (this.f109169e != null) {
            switch (this.f109169e.f109194l) {
                case 1:
                    this.f109167c.setVisibility(4);
                    return;
                case 2:
                    this.f109167c.setVisibility(0);
                    m133591e();
                    break;
                case 3:
                    this.f109167c.setVisibility(0);
                    m133590d();
                    return;
            }
        }
    }

    /* renamed from: d */
    private void m133590d() {
        this.f109167c.setImageDrawable(C0683b.m2903a(getContext(), (int) R.drawable.b16));
        this.f109168d = ObjectAnimator.ofFloat(this.f109167c, "rotation", new float[]{0.0f, 360.0f});
        this.f109168d.setDuration(800);
        this.f109168d.setRepeatMode(1);
        this.f109168d.setRepeatCount(-1);
        this.f109168d.start();
    }

    /* renamed from: c */
    public final boolean mo103198c() {
        if (this.f109169e == null || TextUtils.isEmpty(this.f109169e.f109185c)) {
            return false;
        }
        if (this.f109169e.mo103219c()) {
            return true;
        }
        if (this.f109169e.mo103220d()) {
            mo103197b();
            return false;
        } else if (!C42044g.m133656a(getContext())) {
            C10761a.m31403c(getContext(), "检查网络后重试!").mo25750a();
            return false;
        } else {
            C42039d.m133620a();
            C42039d.m133623a(this.f109169e, getContext(), true);
            this.f109169e.f109194l = 3;
            mo103197b();
            return false;
        }
    }

    public void setDownloadCallback(C42036a aVar) {
        this.f109170f = aVar;
    }

    public TextFontTypeLayout(Context context) {
        this(context, null);
    }

    public void setBackground(int i) {
        Drawable drawable;
        if (i != 1) {
            drawable = this.f109172h;
        } else {
            drawable = this.f109171g;
        }
        this.f109166b.setBackground(drawable);
    }

    private void setFontData(C42038c cVar) {
        if (cVar != null) {
            this.f109169e = cVar;
            if (!TextUtils.isEmpty(this.f109169e.f109186d)) {
                this.f109165a.setText(this.f109169e.f109186d);
            }
        }
    }

    /* renamed from: a */
    public final void mo103193a(C42038c cVar) {
        if (cVar != null) {
            setFontData(cVar);
            m133592f();
            mo103197b();
            this.f109169e.f109195m = this;
        }
    }

    /* renamed from: a */
    public final void mo103195a(boolean z) {
        if (this.f109169e != null) {
            C42039d.m133627d(this.f109169e.f109189g);
            this.f109169e.f109194l = 2;
            mo103197b();
        }
        if (this.f109170f != null) {
            this.f109170f.mo103195a(z);
        }
        if (z) {
            C10761a.m31387a(getContext(), getContext().getResources().getString(R.string.b9k)).mo25750a();
        }
    }

    public TextFontTypeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(R.layout.abh, this);
        this.f109165a = (MaskBlurLightTextView) inflate.findViewById(R.id.dko);
        this.f109167c = (ImageView) inflate.findViewById(R.id.daq);
        this.f109166b = inflate.findViewById(R.id.e6f);
        int b = (int) C9738o.m28708b(getContext(), 4.0f);
        this.f109171g = C38501ax.m123066a(-1, 16777215, (int) C9738o.m28708b(getContext(), 2.0f), b);
        this.f109172h = C38501ax.m123066a(889192447, 16777215, 1, b);
    }

    /* renamed from: a */
    public final void mo103194a(C42038c cVar, boolean z, boolean z2) {
        mo103197b();
        if (!this.f109169e.mo103219c()) {
            if (z2) {
                C10761a.m31387a(getContext(), getContext().getResources().getString(R.string.b9k)).mo25750a();
            }
            return;
        }
        if (this.f109170f != null) {
            this.f109170f.mo103194a(this.f109169e, this.f109169e.mo103219c(), z2);
        }
        m133592f();
    }
}
