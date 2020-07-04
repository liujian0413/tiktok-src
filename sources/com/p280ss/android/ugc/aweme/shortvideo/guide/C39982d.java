package com.p280ss.android.ugc.aweme.shortvideo.guide;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.facebook.drawee.controller.C13400c;
import com.facebook.fresco.animation.p707c.C13480a;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.guide.p1576a.C39977a;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.guide.d */
public final class C39982d implements C39990e {

    /* renamed from: a */
    public View f103875a;

    /* renamed from: b */
    public View f103876b;

    /* renamed from: c */
    public TextView f103877c;

    /* renamed from: d */
    public boolean f103878d;

    /* renamed from: e */
    public Runnable f103879e = new Runnable() {
        public final void run() {
            Animation a = C39977a.m127862a(0.0f, 1.0f, 200);
            a.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C39982d.this.f103878d = true;
                    C39982d.this.f103876b.postDelayed(C39982d.this.f103879e, 3000);
                }
            });
            C39982d.this.f103877c.startAnimation(a);
        }
    };

    /* renamed from: f */
    public Runnable f103880f = new Runnable() {
        public final void run() {
            Animation a = C39977a.m127862a(1.0f, 0.0f, 300);
            a.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    C39982d.this.f103878d = false;
                }

                public final void onAnimationEnd(Animation animation) {
                    C39982d.this.mo98266a(true);
                }
            });
            C39982d.this.f103876b.startAnimation(a);
        }
    };

    /* renamed from: g */
    private FaceStickerBean f103881g;

    /* renamed from: h */
    private FrameLayout f103882h;

    /* renamed from: i */
    private RemoteImageView f103883i;

    public C39982d(FaceStickerBean faceStickerBean) {
        this.f103881g = faceStickerBean;
    }

    /* renamed from: a */
    public final void mo98266a(boolean z) {
        if (this.f103881g != null && !TextUtils.isEmpty(this.f103881g.getExtra())) {
            this.f103876b.removeCallbacks(this.f103880f);
            this.f103876b.removeCallbacks(this.f103879e);
            this.f103882h.removeView(this.f103875a);
        }
    }

    /* renamed from: a */
    public final void mo98265a(FrameLayout frameLayout) {
        if (this.f103881g != null && !TextUtils.isEmpty(this.f103881g.getExtra())) {
            ExtraParams extraParams = (ExtraParams) C35574k.m114859a().mo70085S().mo15974a(this.f103881g.getExtra(), ExtraParams.class);
            if (extraParams != null && extraParams.isGifValid()) {
                this.f103882h = frameLayout;
                this.f103875a = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.aat, frameLayout, false);
                this.f103882h.addView(this.f103875a, 0);
                this.f103876b = this.f103875a.findViewById(R.id.als);
                this.f103877c = (TextView) this.f103875a.findViewById(R.id.db6);
                this.f103877c.setText(R.string.a5k);
                this.f103883i = (RemoteImageView) this.f103875a.findViewById(R.id.db7);
                LayoutParams layoutParams = (LayoutParams) this.f103883i.getLayoutParams();
                if (2 == extraParams.gifType) {
                    layoutParams.width = (int) C9738o.m28708b(frameLayout.getContext(), 192.0f);
                    layoutParams.height = (int) C9738o.m28708b(frameLayout.getContext(), 252.0f);
                    this.f103883i.setLayoutParams(layoutParams);
                }
                FrameLayout frameLayout2 = (FrameLayout) this.f103882h.findViewById(R.id.daz);
                if (frameLayout2 != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f103876b.getLayoutParams();
                    layoutParams2.height = C39805en.m127452e(frameLayout.getContext()) - frameLayout2.getHeight();
                    this.f103876b.setLayoutParams(layoutParams2);
                }
                this.f103876b.post(this.f103879e);
                this.f103875a.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (C39982d.this.f103878d) {
                            C39982d.this.f103876b.post(C39982d.this.f103880f);
                        }
                    }
                });
                C39980b.m127865b(this.f103883i, this.f103881g.getHintIcon(), new C13400c<C13648f>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void onFinalImageSet(String str, C13648f fVar, final Animatable animatable) {
                        long j;
                        if (animatable instanceof C13480a) {
                            C13480a aVar = (C13480a) animatable;
                            aVar.mo33015a(2);
                            animatable.start();
                            j = aVar.mo33018b();
                        } else {
                            j = 0;
                        }
                        if (j > 0 && C39982d.this.f103875a != null) {
                            C39982d.this.f103875a.postDelayed(new Runnable() {
                                public final void run() {
                                    if (animatable.isRunning()) {
                                        animatable.stop();
                                        C39982d.this.f103875a.callOnClick();
                                    }
                                }
                            }, j);
                        }
                    }
                });
            }
        }
    }
}
