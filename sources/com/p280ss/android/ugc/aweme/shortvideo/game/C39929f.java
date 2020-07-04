package com.p280ss.android.ugc.aweme.shortvideo.game;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.p280ss.android.ugc.aweme.shortvideo.game.p1574a.C39923b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.game.f */
public final class C39929f implements C39935l {

    /* renamed from: a */
    private C39923b f103714a;

    /* renamed from: b */
    private View f103715b;

    /* renamed from: c */
    private FrameLayout f103716c;

    /* renamed from: d */
    private LottieAnimationView f103717d;

    /* renamed from: e */
    private ImageView f103718e;

    /* renamed from: c */
    public final void mo99353c() {
        this.f103717d.mo7085f();
        this.f103717d.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo99348a() {
        if (this.f103717d == null) {
            m127725e();
        }
        this.f103716c.removeAllViews();
        this.f103716c.addView(this.f103715b);
        this.f103715b.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo99354d() {
        this.f103717d.mo7085f();
        this.f103715b.setVisibility(8);
        this.f103716c.removeView(this.f103715b);
    }

    /* renamed from: b */
    public final void mo99351b() {
        if (this.f103717d == null) {
            m127725e();
        }
        this.f103717d.setVisibility(0);
        this.f103717d.setImageAssetsFolder("start_anim/");
        this.f103717d.setAnimation("game_btn.json");
        this.f103717d.mo7078b();
    }

    /* renamed from: e */
    private void m127725e() {
        this.f103715b = LayoutInflater.from(this.f103716c.getContext()).inflate(R.layout.a4l, this.f103716c, false);
        this.f103717d = (LottieAnimationView) this.f103715b.findViewById(R.id.i3);
        this.f103718e = (ImageView) this.f103715b.findViewById(R.id.azt);
        this.f103718e.setOnClickListener(new C39930g(this));
        this.f103717d.setOnClickListener(new C39931h(this));
    }

    /* renamed from: a */
    public final void mo99350a(C39923b bVar) {
        this.f103714a = bVar;
    }

    public C39929f(FrameLayout frameLayout) {
        this.f103716c = frameLayout;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99349a(View view) {
        if (this.f103714a != null) {
            this.f103714a.mo99337a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo99352b(View view) {
        if (this.f103714a != null) {
            this.f103714a.mo99338b();
        }
    }
}
