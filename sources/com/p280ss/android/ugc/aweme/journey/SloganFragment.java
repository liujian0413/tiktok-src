package com.p280ss.android.ugc.aweme.journey;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.journey.SloganFragment */
public final class SloganFragment extends AmeBaseFragment {

    /* renamed from: e */
    public long f84165e = System.currentTimeMillis();

    /* renamed from: f */
    public View f84166f;

    /* renamed from: g */
    public TextView f84167g;

    /* renamed from: h */
    public View f84168h;

    /* renamed from: i */
    public boolean f84169i;

    /* renamed from: j */
    private HashMap f84170j;

    /* renamed from: com.ss.android.ugc.aweme.journey.SloganFragment$a */
    static final class C32224a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SloganFragment f84171a;

        /* renamed from: b */
        final /* synthetic */ float f84172b;

        /* renamed from: c */
        final /* synthetic */ float f84173c;

        C32224a(SloganFragment sloganFragment, float f, float f2) {
            this.f84171a = sloganFragment;
            this.f84172b = f;
            this.f84173c = f2;
        }

        public final void run() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f84171a.mo83372d(), "translationY", new float[]{this.f84172b, ((float) (-this.f84171a.mo83373e().getHeight())) + this.f84172b + ((float) this.f84171a.mo83372d().getHeight())});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f84171a.mo83371a(), "translationY", new float[]{((float) this.f84171a.mo83373e().getHeight()) - this.f84173c, -this.f84173c});
            C7573i.m23582a((Object) ofFloat, "obanim");
            ofFloat.setDuration(420);
            C7573i.m23582a((Object) ofFloat2, "obanim2");
            ofFloat2.setDuration(420);
            ofFloat2.setStartDelay(100);
            ofFloat.addListener(new AnimatorListener(this) {

                /* renamed from: a */
                final /* synthetic */ C32224a f84174a;

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                {
                    this.f84174a = r1;
                }

                public final void onAnimationStart(Animator animator) {
                    this.f84174a.f84171a.mo83372d().setAlpha(1.0f);
                }
            });
            ofFloat2.addListener(new AnimatorListener(this) {

                /* renamed from: a */
                final /* synthetic */ C32224a f84175a;

                /* renamed from: com.ss.android.ugc.aweme.journey.SloganFragment$a$2$a */
                static final class C32227a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C322262 f84176a;

                    C32227a(C322262 r1) {
                        this.f84176a = r1;
                    }

                    public final void run() {
                        this.f84176a.f84175a.f84171a.f84169i = true;
                        this.f84176a.f84175a.f84171a.mo83374f();
                        C42961az.m136380a(new C32256n(null, 1, null));
                    }
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                {
                    this.f84175a = r1;
                }

                public final void onAnimationStart(Animator animator) {
                    this.f84175a.f84171a.mo83371a().setAlpha(1.0f);
                }

                public final void onAnimationEnd(Animator animator) {
                    new Handler().postDelayed(new C32227a(this), 1500);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
        }
    }

    /* renamed from: a */
    private View m104525a(int i) {
        if (this.f84170j == null) {
            this.f84170j = new HashMap();
        }
        View view = (View) this.f84170j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f84170j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    private void m104526g() {
        if (this.f84170j != null) {
            this.f84170j.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m104526g();
    }

    /* renamed from: a */
    public final View mo83371a() {
        View view = this.f84166f;
        if (view == null) {
            C7573i.m23583a("logoView");
        }
        return view;
    }

    /* renamed from: d */
    public final TextView mo83372d() {
        TextView textView = this.f84167g;
        if (textView == null) {
            C7573i.m23583a("sloganView");
        }
        return textView;
    }

    /* renamed from: e */
    public final View mo83373e() {
        View view = this.f84168h;
        if (view == null) {
            C7573i.m23583a("rootView");
        }
        return view;
    }

    /* renamed from: f */
    public final void mo83374f() {
        String str;
        String str2 = "exit_slogan_page";
        C22984d a = C22984d.m75611a().mo59970a("is_background", af_() ^ true ? 1 : 0).mo59971a("stay_time", System.currentTimeMillis() - this.f84165e);
        String str3 = "if_send_fake_feed";
        if (C28434i.m93471b()) {
            str = "1";
        } else {
            str = "0";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6907h.m21524a("show_slogan_page", (Map) new HashMap());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) m104525a(R.id.bvu);
        C7573i.m23582a((Object) imageView, "logo_icon");
        this.f84166f = imageView;
        DmtTextView dmtTextView = (DmtTextView) m104525a(R.id.d7v);
        C7573i.m23582a((Object) dmtTextView, "slogan");
        this.f84167g = dmtTextView;
        FrameLayout frameLayout = (FrameLayout) m104525a(R.id.d7w);
        C7573i.m23582a((Object) frameLayout, "slogan_root");
        this.f84168h = frameLayout;
        float b = C9738o.m28708b(view.getContext(), 60.0f);
        float b2 = C9738o.m28708b(view.getContext(), 46.0f);
        TextView textView = this.f84167g;
        if (textView == null) {
            C7573i.m23583a("sloganView");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.cli));
        sb.append("\n");
        sb.append(getString(R.string.clj));
        textView.setText(sb.toString());
        View view2 = this.f84166f;
        if (view2 == null) {
            C7573i.m23583a("logoView");
        }
        view2.postDelayed(new C32224a(this, b, b2), 1000);
        this.f84165e = System.currentTimeMillis();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b3o, viewGroup, false);
    }
}
