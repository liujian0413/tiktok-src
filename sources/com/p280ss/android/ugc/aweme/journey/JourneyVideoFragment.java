package com.p280ss.android.ugc.aweme.journey;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.CardView;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.welcome.WelcomeVideoWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.FloatRef;

/* renamed from: com.ss.android.ugc.aweme.journey.JourneyVideoFragment */
public final class JourneyVideoFragment extends AmeBaseFragment {

    /* renamed from: e */
    public ObjectAnimator f84137e;

    /* renamed from: f */
    public long f84138f = System.currentTimeMillis();

    /* renamed from: g */
    public GestureDetector f84139g;

    /* renamed from: h */
    public float f84140h;

    /* renamed from: i */
    public float f84141i;

    /* renamed from: j */
    public View f84142j;

    /* renamed from: k */
    public TextView f84143k;

    /* renamed from: l */
    public String f84144l;

    /* renamed from: m */
    public String f84145m;

    /* renamed from: n */
    public String f84146n;

    /* renamed from: o */
    public boolean f84147o;

    /* renamed from: p */
    private HashMap f84148p;

    /* renamed from: com.ss.android.ugc.aweme.journey.JourneyVideoFragment$a */
    static final class C32217a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JourneyVideoFragment f84149a;

        C32217a(JourneyVideoFragment journeyVideoFragment) {
            this.f84149a = journeyVideoFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f84149a.mo83358a("click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.JourneyVideoFragment$b */
    static final class C32218b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JourneyVideoFragment f84150a;

        C32218b(JourneyVideoFragment journeyVideoFragment) {
            this.f84150a = journeyVideoFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f84150a.f84147o = true;
            this.f84150a.mo83359b("click");
            C42961az.m136380a(new C32256n(null, 1, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.JourneyVideoFragment$c */
    static final class C32219c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JourneyVideoFragment f84151a;

        C32219c(JourneyVideoFragment journeyVideoFragment) {
            this.f84151a = journeyVideoFragment;
        }

        public final void run() {
            this.f84151a.mo83358a("auto");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.JourneyVideoFragment$d */
    public static final class C32220d extends SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ JourneyVideoFragment f84152a;

        C32220d(JourneyVideoFragment journeyVideoFragment) {
            this.f84152a = journeyVideoFragment;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C7573i.m23587b(motionEvent, "e1");
            C7573i.m23587b(motionEvent2, "e2");
            if (motionEvent2.getRawY() - motionEvent.getRawY() < 0.0f && Math.abs(motionEvent2.getRawY() - motionEvent.getRawY()) >= 25.0f && Math.abs(f2) >= 400.0f) {
                if (!this.f84152a.f84147o) {
                    this.f84152a.f84147o = true;
                    this.f84152a.mo83359b("slide_up");
                }
                JourneyVideoFragment.m104506d();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.JourneyVideoFragment$e */
    static final class C32221e implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ JourneyVideoFragment f84153a;

        C32221e(JourneyVideoFragment journeyVideoFragment) {
            this.f84153a = journeyVideoFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C7573i.m23582a((Object) motionEvent, "event");
            switch (motionEvent.getAction()) {
                case 0:
                    this.f84153a.f84140h = motionEvent.getRawY();
                    break;
                case 1:
                    if (Math.abs(JourneyVideoFragment.m104502a(this.f84153a).getTranslationY()) < ((float) (JourneyVideoFragment.m104502a(this.f84153a).getMeasuredHeight() / 3))) {
                        this.f84153a.mo83357a();
                        break;
                    } else {
                        if (!this.f84153a.f84147o) {
                            this.f84153a.mo83359b("slide_up");
                            this.f84153a.f84147o = true;
                        }
                        JourneyVideoFragment.m104506d();
                        break;
                    }
                case 2:
                    this.f84153a.f84141i = ((float) ((int) motionEvent.getRawY())) - this.f84153a.f84140h;
                    if (this.f84153a.f84141i < 0.0f) {
                        JourneyVideoFragment.m104502a(this.f84153a).setTranslationY(this.f84153a.f84141i);
                        break;
                    }
                    break;
            }
            JourneyVideoFragment.m104503b(this.f84153a).onTouchEvent(motionEvent);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.JourneyVideoFragment$f */
    static final class C32222f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JourneyVideoFragment f84154a;

        /* renamed from: b */
        final /* synthetic */ FloatRef f84155b;

        C32222f(JourneyVideoFragment journeyVideoFragment, FloatRef floatRef) {
            this.f84154a = journeyVideoFragment;
            this.f84155b = floatRef;
        }

        public final void run() {
            if (this.f84154a.isViewValid()) {
                int top = JourneyVideoFragment.m104504c(this.f84154a).getTop();
                View a = this.f84154a.mo83356a((int) R.id.aup);
                C7573i.m23582a((Object) a, "header");
                float bottom = ((float) (top - a.getBottom())) - C9738o.m28708b(this.f84154a.getContext(), 24.0f);
                if (bottom < this.f84155b.element) {
                    CardView cardView = (CardView) this.f84154a.mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView, "video_container");
                    cardView.getLayoutParams().height = (int) bottom;
                    CardView cardView2 = (CardView) this.f84154a.mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView2, "video_container");
                    LayoutParams layoutParams = cardView2.getLayoutParams();
                    CardView cardView3 = (CardView) this.f84154a.mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView3, "video_container");
                    layoutParams.width = cardView3.getLayoutParams().height;
                    CardView cardView4 = (CardView) this.f84154a.mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView4, "video_container");
                    CardView cardView5 = (CardView) this.f84154a.mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView5, "video_container");
                    cardView4.setLayoutParams(cardView5.getLayoutParams());
                }
            }
        }
    }

    /* renamed from: e */
    private void m104507e() {
        if (this.f84148p != null) {
            this.f84148p.clear();
        }
    }

    /* renamed from: a */
    public final View mo83356a(int i) {
        if (this.f84148p == null) {
            this.f84148p = new HashMap();
        }
        View view = (View) this.f84148p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f84148p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    public static void m104506d() {
        C42961az.m136380a(new C32256n(null, 1, null));
    }

    public final void onResume() {
        super.onResume();
        this.f84138f = System.currentTimeMillis();
    }

    public final void onStop() {
        if (!this.f84147o) {
            mo83359b("background");
        }
        super.onStop();
    }

    public final void onDestroyView() {
        ObjectAnimator objectAnimator = this.f84137e;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f84137e;
            if (objectAnimator2 == null) {
                C7573i.m23580a();
            }
            objectAnimator2.cancel();
        }
        super.onDestroyView();
        m104507e();
    }

    /* renamed from: a */
    public final void mo83357a() {
        View view = this.f84142j;
        if (view == null) {
            C7573i.m23583a("viewRoot");
        }
        view.clearAnimation();
        View view2 = this.f84142j;
        if (view2 == null) {
            C7573i.m23583a("viewRoot");
        }
        ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{0.0f}).start();
    }

    /* renamed from: a */
    public static final /* synthetic */ View m104502a(JourneyVideoFragment journeyVideoFragment) {
        View view = journeyVideoFragment.f84142j;
        if (view == null) {
            C7573i.m23583a("viewRoot");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ GestureDetector m104503b(JourneyVideoFragment journeyVideoFragment) {
        GestureDetector gestureDetector = journeyVideoFragment.f84139g;
        if (gestureDetector == null) {
            C7573i.m23583a("mGestureDetector");
        }
        return gestureDetector;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m104504c(JourneyVideoFragment journeyVideoFragment) {
        TextView textView = journeyVideoFragment.f84143k;
        if (textView == null) {
            C7573i.m23583a("startWatchingView");
        }
        return textView;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6907h.m21524a("welcomescreen_show", (Map) new HashMap());
    }

    /* renamed from: c */
    private final void m104505c(String str) {
        C6907h.m21524a("start_watching_button_show", (Map) C22984d.m75611a().mo59973a("start_watching_button_show", str).mo59971a("duration", System.currentTimeMillis() - this.f84138f).f60753a);
    }

    /* renamed from: b */
    public final void mo83359b(String str) {
        String str2;
        C7573i.m23587b(str, "enterMethod");
        String str3 = "exit_welcomescreen";
        C22984d a = C22984d.m75611a().mo59973a("enter_method", str).mo59971a("duration", System.currentTimeMillis() - this.f84138f);
        String str4 = "if_send_fake_feed";
        if (C28434i.m93471b()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).f60753a);
    }

    /* renamed from: a */
    public final void mo83358a(String str) {
        if (isViewValid()) {
            TextView textView = this.f84143k;
            if (textView == null) {
                C7573i.m23583a("startWatchingView");
            }
            if (textView.getVisibility() != 0) {
                TextView textView2 = this.f84143k;
                if (textView2 == null) {
                    C7573i.m23583a("startWatchingView");
                }
                textView2.setAlpha(0.0f);
                TextView textView3 = this.f84143k;
                if (textView3 == null) {
                    C7573i.m23583a("startWatchingView");
                }
                textView3.setVisibility(0);
                m104505c(str);
                TextView textView4 = this.f84143k;
                if (textView4 == null) {
                    C7573i.m23583a("startWatchingView");
                }
                this.f84137e = ObjectAnimator.ofFloat(textView4, "alpha", new float[]{0.0f, 1.0f});
                ObjectAnimator objectAnimator = this.f84137e;
                if (objectAnimator == null) {
                    C7573i.m23580a();
                }
                objectAnimator.setDuration(200);
                ObjectAnimator objectAnimator2 = this.f84137e;
                if (objectAnimator2 == null) {
                    C7573i.m23580a();
                }
                objectAnimator2.start();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        float f;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        DmtTextView dmtTextView = (DmtTextView) mo83356a((int) R.id.dab);
        C7573i.m23582a((Object) dmtTextView, "start_watching");
        this.f84143k = dmtTextView;
        if (TextUtils.isEmpty(this.f84144l)) {
            DmtTextView dmtTextView2 = (DmtTextView) mo83356a((int) R.id.title);
            C7573i.m23582a((Object) dmtTextView2, "title");
            dmtTextView2.setText(getString(R.string.clf));
        } else {
            DmtTextView dmtTextView3 = (DmtTextView) mo83356a((int) R.id.title);
            C7573i.m23582a((Object) dmtTextView3, "title");
            dmtTextView3.setText(this.f84144l);
        }
        if (TextUtils.isEmpty(this.f84145m)) {
            DmtTextView dmtTextView4 = (DmtTextView) mo83356a((int) R.id.d1p);
            C7573i.m23582a((Object) dmtTextView4, "second_title");
            dmtTextView4.setText(getString(R.string.cle));
        } else {
            DmtTextView dmtTextView5 = (DmtTextView) mo83356a((int) R.id.d1p);
            C7573i.m23582a((Object) dmtTextView5, "second_title");
            dmtTextView5.setText(this.f84145m);
        }
        if (!TextUtils.isEmpty(this.f84146n)) {
            TextView textView = this.f84143k;
            if (textView == null) {
                C7573i.m23583a("startWatchingView");
            }
            textView.setText(this.f84146n);
        }
        DmtTextView dmtTextView6 = (DmtTextView) mo83356a((int) R.id.d7j);
        C7573i.m23582a((Object) dmtTextView6, "skip");
        dmtTextView6.setAlpha(0.0f);
        DmtTextView dmtTextView7 = (DmtTextView) mo83356a((int) R.id.d7j);
        C7573i.m23582a((Object) dmtTextView7, "skip");
        boolean z = false;
        dmtTextView7.setEnabled(false);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo83356a((int) R.id.cwi);
        C7573i.m23582a((Object) constraintLayout, "root");
        ViewParent parent = constraintLayout.getParent();
        if (parent != null) {
            this.f84142j = (View) parent;
            ((ConstraintLayout) mo83356a((int) R.id.cwi)).setOnClickListener(new C32217a(this));
            TextView textView2 = this.f84143k;
            if (textView2 == null) {
                C7573i.m23583a("startWatchingView");
            }
            textView2.setOnClickListener(new C32218b(this));
            ((ConstraintLayout) mo83356a((int) R.id.cwi)).postDelayed(new C32219c(this), 2000);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo83356a((int) R.id.cwi);
            C7573i.m23582a((Object) constraintLayout2, "root");
            this.f84139g = new GestureDetector(constraintLayout2.getContext(), new C32220d(this));
            FragmentActivity activity = getActivity();
            if (activity != null) {
                if (((NewUserJourneyActivity) activity).f84162e) {
                    ((ConstraintLayout) mo83356a((int) R.id.cwi)).setOnTouchListener(new C32221e(this));
                }
                WidgetManager.m75867a((Fragment) this, (View) (CardView) mo83356a((int) R.id.eac)).mo60152a((View) (CardView) mo83356a((int) R.id.eac), (Widget) new WelcomeVideoWidget());
                int a = C9738o.m28691a(getContext());
                float f2 = (float) a;
                if ((((float) C9738o.m28709b(getContext())) * 1.0f) / f2 < 1.7777778f) {
                    z = true;
                }
                Context context = getContext();
                if (z) {
                    f = 300.0f;
                } else {
                    f = 376.0f;
                }
                float b = C9738o.m28708b(context, f);
                FloatRef floatRef = new FloatRef();
                floatRef.element = b;
                if (f2 < b) {
                    floatRef.element = f2;
                    CardView cardView = (CardView) mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView, "video_container");
                    cardView.getLayoutParams().height = a;
                    CardView cardView2 = (CardView) mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView2, "video_container");
                    LayoutParams layoutParams = cardView2.getLayoutParams();
                    CardView cardView3 = (CardView) mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView3, "video_container");
                    layoutParams.width = cardView3.getLayoutParams().height;
                } else if (z) {
                    CardView cardView4 = (CardView) mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView4, "video_container");
                    cardView4.getLayoutParams().height = (int) b;
                    CardView cardView5 = (CardView) mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView5, "video_container");
                    LayoutParams layoutParams2 = cardView5.getLayoutParams();
                    CardView cardView6 = (CardView) mo83356a((int) R.id.eac);
                    C7573i.m23582a((Object) cardView6, "video_container");
                    layoutParams2.width = cardView6.getLayoutParams().height;
                }
                ((CardView) mo83356a((int) R.id.eac)).post(new C32222f(this, floatRef));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.NewUserJourneyActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.oj, viewGroup, false);
    }
}
