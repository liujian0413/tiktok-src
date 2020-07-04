package com.p280ss.android.ugc.aweme.feed.guide;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.keyframes.C14005b;
import com.facebook.keyframes.C14027d;
import com.facebook.keyframes.model.C14052j;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.anim.C22544a;
import com.p280ss.android.ugc.aweme.anim.C22549b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.detail.p1159c.C26054a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.m */
public final class C28398m {

    /* renamed from: a */
    public static boolean f74839a;

    /* renamed from: b */
    public final boolean f74840b;

    /* renamed from: c */
    public View f74841c;

    /* renamed from: d */
    public C14052j f74842d;

    /* renamed from: e */
    public C14005b f74843e;

    /* renamed from: f */
    public AnimationImageView f74844f;

    /* renamed from: g */
    public C28404a f74845g;

    /* renamed from: h */
    public Runnable f74846h = new Runnable() {
        public final void run() {
            C6726a.m20843a(new Runnable() {
                public final void run() {
                    C28398m.this.mo72133b();
                }
            }, 5000);
            C28398m.this.f74844f = (AnimationImageView) C28398m.this.f74841c.findViewById(R.id.b9t);
            TextView textView = (TextView) C28398m.this.f74841c.findViewById(R.id.e24);
            if (!C28398m.this.f74840b) {
                C28398m.this.f74843e = new C14027d().mo33683a(C28398m.this.f74842d).mo33682a();
                C28398m.this.f74843e.mo33650a();
                if (C28398m.this.f74845g != null) {
                    C28398m.this.f74845g.mo72138a();
                }
                C28398m.this.f74844f.setLayerType(1, null);
                C28398m.this.f74844f.setImageDrawable(C28398m.this.f74843e);
                C28398m.this.f74844f.setImageAlpha(0);
                return;
            }
            textView.setText(R.string.dh9);
            C28398m.this.f74844f.setAnimation("right_profile_warning.json");
            C28398m.this.f74844f.mo7078b();
            C28398m.this.f74844f.setProgress(0.0f);
            C28398m.this.f74844f.mo7082c(true);
        }
    };

    /* renamed from: i */
    private ViewStub f74847i;

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.m$a */
    public interface C28404a {
        /* renamed from: a */
        void mo72138a();

        /* renamed from: b */
        void mo72139b();
    }

    /* renamed from: c */
    private void m93347c() {
        if (this.f74843e != null) {
            this.f74843e.mo33653b();
            this.f74844f.setImageDrawable(null);
            this.f74843e = null;
        }
    }

    /* renamed from: b */
    public final void mo72133b() {
        if (this.f74841c != null && this.f74841c.getVisibility() == 0) {
            m93347c();
            if (this.f74840b && this.f74844f != null) {
                this.f74844f.clearAnimation();
            }
            this.f74841c.animate().alpha(0.0f).setDuration(100).withEndAction(new Runnable() {
                public final void run() {
                    SharePrefCache.inst().getScrollToProfileGuideState().mo59871a(Integer.valueOf(2));
                    if (C28398m.this.f74845g != null) {
                        C28398m.this.f74845g.mo72139b();
                    }
                    C28398m.this.f74841c.setVisibility(8);
                    C42961az.m136380a(new C26054a(false));
                }
            }).start();
        }
    }

    /* renamed from: a */
    public final void mo72132a() {
        if (this.f74847i != null && (this.f74841c == null || this.f74841c.getVisibility() != 0)) {
            this.f74841c = this.f74847i.inflate();
            this.f74841c.setOnTouchListener(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        return true;
                    }
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    C28398m.this.mo72133b();
                    return true;
                }
            });
            if (this.f74840b) {
                this.f74841c.setAlpha(0.0f);
                this.f74841c.animate().alpha(1.0f).setDuration(100).withEndAction(this.f74846h).start();
            } else {
                C22544a.m74540a().mo59153a(C6399b.m19921a(), "left_profile_warning.json", new C22549b() {
                    /* renamed from: a */
                    public final void mo59157a(C14052j jVar, String str) {
                        C28398m.this.f74842d = jVar;
                        if (C28398m.this.f74842d != null) {
                            C28398m.this.f74841c.setAlpha(0.0f);
                            C28398m.this.f74841c.animate().alpha(1.0f).setDuration(100).withEndAction(C28398m.this.f74846h).start();
                        }
                    }
                });
            }
            if (C6399b.m19944t()) {
                C6907h.m21524a("transition_to_profile_guide_show", (Map) C22984d.m75611a().f60753a);
            }
        }
    }

    public C28398m(ViewStub viewStub) {
        this.f74847i = viewStub;
        this.f74840b = C43127fh.m136806a(viewStub.getContext());
    }
}
