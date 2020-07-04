package com.p280ss.android.ugc.aweme.shortvideo.guide;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.utils.C43041d;
import com.p280ss.android.ugc.aweme.utils.C43143j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.guide.a */
public final class C39974a implements C39990e {

    /* renamed from: a */
    public View f103857a;

    /* renamed from: b */
    private TextView f103858b;

    /* renamed from: c */
    private RemoteImageView f103859c;

    /* renamed from: d */
    private View f103860d;

    /* renamed from: e */
    private FrameLayout f103861e;

    /* renamed from: f */
    private FaceStickerBean f103862f;

    /* renamed from: g */
    private Runnable f103863g = new Runnable() {
        public final void run() {
            Animation a = C43143j.m136845a(1.0f, 0.0f, 300);
            a.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C39974a.this.mo98266a(true);
                }
            });
            C39974a.this.f103857a.startAnimation(a);
        }
    };

    public C39974a(FaceStickerBean faceStickerBean) {
        this.f103862f = faceStickerBean;
    }

    /* renamed from: a */
    public final void mo98266a(boolean z) {
        if (this.f103862f != null && !TextUtils.isEmpty(this.f103862f.getHint())) {
            this.f103858b.removeCallbacks(this.f103863g);
            this.f103861e.removeView(this.f103860d);
        }
    }

    /* renamed from: a */
    public final void mo98265a(FrameLayout frameLayout) {
        boolean z;
        this.f103861e = frameLayout;
        if (this.f103862f != null && !TextUtils.isEmpty(this.f103862f.getHint())) {
            int i = 0;
            this.f103860d = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.aav, frameLayout, false);
            this.f103861e.addView(this.f103860d);
            this.f103857a = this.f103860d.findViewById(R.id.als);
            this.f103858b = (TextView) this.f103860d.findViewById(R.id.db6);
            String hint = this.f103862f.getHint();
            Activity a = C43041d.m136566a(frameLayout.getContext());
            if (a instanceof FragmentActivity) {
                EffectStickerViewModel effectStickerViewModel = (EffectStickerViewModel) C0069x.m159a((FragmentActivity) a).mo147a(EffectStickerViewModel.class);
                ShortVideoContext d = effectStickerViewModel.mo101285a().mo101195d();
                if (!d.mo96142d() && !d.mo96144e()) {
                    File e = d.f99775k.mo96317e();
                    boolean z2 = true;
                    if (e == null || e.getPath().startsWith(C39810eq.f103484t)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        C10761a.m31403c(frameLayout.getContext(), frameLayout.getContext().getString(R.string.ob)).mo25750a();
                        return;
                    }
                    String a2 = C35574k.m114859a().mo70086a().mo103850a(d.f99769e);
                    AVMusic f = effectStickerViewModel.mo101285a().mo101197f();
                    if (f != null && f.strongBeatUrl != null && !TextUtils.isEmpty(a2) && !new File(a2).exists()) {
                        C10761a.m31399c(frameLayout.getContext(), (int) R.string.oa).mo25750a();
                    } else if (e == null) {
                        this.f103858b.setText(hint);
                        this.f103859c = (RemoteImageView) this.f103860d.findViewById(R.id.db7);
                        if (this.f103862f.getHintIcon() == null || C23477d.m77081a((Collection<T>) this.f103862f.getHintIcon().getUrlList())) {
                            z2 = false;
                        }
                        RemoteImageView remoteImageView = this.f103859c;
                        if (!z2) {
                            i = 8;
                        }
                        C23487o.m77140a((View) remoteImageView, i);
                        if (z2) {
                            C23323e.m76524b(this.f103859c, this.f103862f.getHintIcon());
                        }
                        this.f103857a.startAnimation(C43143j.m136845a(0.0f, 1.0f, 300));
                        this.f103857a.postDelayed(this.f103863g, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                    }
                }
            }
        }
    }
}
