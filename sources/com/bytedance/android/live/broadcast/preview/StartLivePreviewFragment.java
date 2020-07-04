package com.bytedance.android.live.broadcast.preview;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.support.p022v4.view.animation.LinearOutSlowInInterpolator;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.broadcast.effect.C2581a;
import com.bytedance.android.live.broadcast.effect.C2615d;
import com.bytedance.android.live.broadcast.effect.C2619g;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.C2636q;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.monitor.C2760c;
import com.bytedance.android.live.broadcast.monitor.C2761d;
import com.bytedance.android.live.broadcast.monitor.C2762e;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.stream.C2967c;
import com.bytedance.android.live.broadcast.stream.C2977d.C2978a;
import com.bytedance.android.live.broadcast.stream.monitor.C2980a;
import com.bytedance.android.live.broadcast.stream.p141a.C2947a;
import com.bytedance.android.live.broadcast.stream.p141a.C2953b;
import com.bytedance.android.live.broadcast.stream.p141a.C2954c.C2955a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2948a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2951d;
import com.bytedance.android.live.broadcast.stream.p143b.C2965a;
import com.bytedance.android.live.broadcast.stream.p143b.C2966b;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p368g.p370b.C7853a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9349d;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9350e;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9351f.C9352a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.FileNotFoundException;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class StartLivePreviewFragment extends BaseFragment implements C9352a {

    /* renamed from: j */
    private static int f8988j = 720;

    /* renamed from: k */
    private static int f8989k = 1280;

    /* renamed from: a */
    public C2947a f8990a;

    /* renamed from: b */
    public View f8991b;

    /* renamed from: c */
    public C2619g f8992c;

    /* renamed from: d */
    public C2581a f8993d;

    /* renamed from: e */
    public C2951d f8994e;

    /* renamed from: f */
    public GestureDetector f8995f;

    /* renamed from: g */
    public int f8996g = 1;

    /* renamed from: h */
    public boolean f8997h;

    /* renamed from: i */
    public C7321c f8998i;

    /* renamed from: l */
    private SurfaceView f8999l;

    /* renamed from: m */
    private C2429a f9000m;

    /* renamed from: q */
    private TextView f9001q;

    /* renamed from: r */
    private AnimationSet f9002r;

    /* renamed from: s */
    private AnimationSet f9003s;

    /* renamed from: t */
    private int f9004t;

    /* renamed from: u */
    private GestureDetectLayout f9005u;

    /* renamed from: v */
    private C9350e f9006v;

    /* renamed from: w */
    private boolean f9007w;

    /* renamed from: x */
    private C9349d f9008x = new C9349d() {
        /* renamed from: a */
        public final void mo9584a(boolean z) {
        }

        /* renamed from: b */
        public final void mo9585b() {
        }

        /* renamed from: a */
        public final void mo9581a() {
            StartLivePreviewFragment.this.getActivity().finish();
        }

        /* renamed from: a */
        public final int mo9580a(String[] strArr) {
            if (StartLivePreviewFragment.this.f8994e != null) {
                StartLivePreviewFragment.this.f8994e.mo9712a(strArr);
            }
            return 0;
        }

        /* renamed from: b */
        public final void mo9586b(float f) {
            if (StartLivePreviewFragment.this.f8993d != null) {
                StartLivePreviewFragment.this.f8993d.mo9196a(f);
            }
        }

        /* renamed from: c */
        public final void mo9588c(float f) {
            if (StartLivePreviewFragment.this.f8993d != null) {
                StartLivePreviewFragment.this.f8993d.mo9199b(f);
            }
        }

        /* renamed from: d */
        public final void mo9589d(float f) {
            if (StartLivePreviewFragment.this.f8993d != null) {
                StartLivePreviewFragment.this.f8993d.mo9200c(f);
            }
        }

        /* renamed from: a */
        public final int mo9578a(String str) {
            try {
                if (StartLivePreviewFragment.this.f8994e != null) {
                    StartLivePreviewFragment.this.f8994e.mo9710a(str, false);
                }
                return 0;
            } catch (FileNotFoundException e) {
                C3166a.m11963b("StartLivePreviewFragment", (Throwable) e);
                return -1;
            }
        }

        /* renamed from: a */
        public final void mo9582a(float f) {
            if (((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a != 0.0f && StartLivePreviewFragment.this.f8993d != null) {
                StartLivePreviewFragment.this.f8993d.mo9201d(f / ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a);
            }
        }

        /* renamed from: b */
        public final void mo9587b(int i) {
            boolean z;
            if (StartLivePreviewFragment.this.f8993d != null && StartLivePreviewFragment.this.f8992c != null) {
                int b = StartLivePreviewFragment.this.f8992c.mo9250b();
                float a = C2619g.m10718a(C2624k.m10736a().f8419b, i);
                if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo10240a()).booleanValue()) {
                    if (!C6311g.m19573a(C2624k.m10736a().f8419b) && i >= 0 && i < C2624k.m10736a().f8419b.size()) {
                        C9355c b2 = C2515f.m10417f().mo9075b().mo9212a().mo9322b(C2663f.m10856a("beautyTag", (FilterModel) C2624k.m10736a().f8419b.get(i)));
                        if (!(b2 == null || b2.f25570i == null)) {
                            C2421c a2 = C2515f.m10417f().mo9074a();
                            a2.mo8892a(C2418b.f7953d, b2);
                            Float c = a2.mo8899c(b2.f25570i.f25589b);
                            if (c == null) {
                                c = Float.valueOf(C2636q.m10771a(b2, b2.f25570i.f25588a));
                            }
                            int i2 = (int) a;
                            if (c.floatValue() > C2636q.m10771a(b2, i2)) {
                                a2.mo8891a(b2.f25570i.f25589b, C2636q.m10771a(b2, i2));
                            }
                        }
                    }
                } else if (StartLivePreviewFragment.this.f8993d.f8290d > (((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * a) / 100.0f) {
                    StartLivePreviewFragment.this.f8993d.mo9201d(a / 100.0f);
                }
                StartLivePreviewFragment.this.f8992c.mo9244a(i);
                StartLivePreviewFragment startLivePreviewFragment = StartLivePreviewFragment.this;
                if (i < b) {
                    z = true;
                } else {
                    z = false;
                }
                startLivePreviewFragment.mo9569a(z);
            }
        }

        /* renamed from: a */
        public final void mo9583a(int i) {
            if (i != StartLivePreviewFragment.this.f8996g) {
                StartLivePreviewFragment.this.f8996g = i;
                if (StartLivePreviewFragment.this.f8990a != null) {
                    StartLivePreviewFragment.this.f8990a.mo9681b();
                }
            }
        }

        /* renamed from: a */
        public final int mo9579a(String str, String str2, float f) {
            try {
                if (StartLivePreviewFragment.this.f8994e != null) {
                    StartLivePreviewFragment.this.f8994e.mo9708a(str, str2, f);
                }
                return 0;
            } catch (FileNotFoundException e) {
                C3166a.m11963b("StartLivePreviewFragment", (Throwable) e);
                return -1;
            }
        }
    };

    /* renamed from: y */
    private OnTouchListener f9009y = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            StartLivePreviewFragment.this.f8995f.onTouchEvent(motionEvent);
            return false;
        }
    };

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLivePreviewFragment$a */
    final class C2823a extends SimpleOnGestureListener {
        private C2823a() {
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z = false;
            if (motionEvent == null || motionEvent2 == null) {
                return false;
            }
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) <= 200.0f || Math.abs(f) <= 100.0f) {
                return false;
            }
            if (x > 0.0f) {
                z = true;
            }
            if (StartLivePreviewFragment.this.f8992c != null) {
                if (z) {
                    StartLivePreviewFragment.this.f8992c.mo9255f();
                } else {
                    StartLivePreviewFragment.this.f8992c.mo9254e();
                }
                StartLivePreviewFragment.this.mo9569a(z);
            }
            return true;
        }
    }

    /* renamed from: a */
    public static StartLivePreviewFragment m11290a() {
        return new StartLivePreviewFragment();
    }

    /* renamed from: g */
    private void m11295g() {
        this.f8995f = new GestureDetector(getActivity(), new C2823a());
        this.f9005u.mo22438a(this.f9009y);
    }

    public void onPause() {
        if (this.f9006v != null) {
            this.f9006v.mo9515i();
        }
        if (this.f9000m != null) {
            this.f9000m.mo8928c();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (this.f9000m != null) {
            this.f9000m.mo8927b();
        }
        if (this.f9006v == null) {
            this.f9007w = true;
        } else {
            this.f9006v.mo9514h();
        }
    }

    /* renamed from: b */
    public final void mo9570b() {
        if (this.f8990a != null) {
            this.f8990a.mo9676a();
            this.f8990a = null;
        }
        if (this.f8992c != null) {
            this.f8992c.mo9256g();
        }
        if (this.f9000m != null) {
            this.f9000m.mo8928c();
            this.f9000m.mo8929d();
            this.f9000m = null;
        }
        getActivity().finish();
    }

    /* renamed from: c */
    public final void mo9571c() {
        if (!this.f8997h) {
            this.f8997h = true;
            this.f8992c = C2515f.m10417f().mo9075b().mo9215c();
            this.f8992c.mo9246a(this.f8990a);
            this.f8993d = new C2615d();
            this.f8994e = new C2951d();
            if (this.f8990a != null) {
                this.f8990a.mo9677a((C2948a) this.f8994e);
            }
            m11293e();
        }
    }

    /* renamed from: d */
    private void m11292d() {
        this.f9004t = C3358ac.m12523c();
        this.f8991b = getView().findViewById(R.id.akn);
        this.f9005u = (GestureDetectLayout) getView().findViewById(R.id.c_e);
        this.f8999l = (SurfaceView) getView().findViewById(R.id.dds);
        this.f9001q = (TextView) getView().findViewById(R.id.ako);
    }

    /* renamed from: e */
    private void m11293e() {
        this.f9006v = ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).createStartLiveFragment();
        this.f9006v.mo9491a(this.f9008x);
        this.f9006v.mo9481a(10);
        C0633q a = getActivity().getSupportFragmentManager().mo2645a();
        a.mo2599b(R.id.a20, this.f9006v.mo9516j());
        a.mo2606d();
        ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).startLiveManager().mo9651a(this);
        if (this.f9007w) {
            this.f9006v.mo9514h();
        }
    }

    public void onDestroy() {
        if (this.f8990a != null) {
            this.f8990a.mo9676a();
            this.f8990a = null;
        }
        if (this.f8992c != null) {
            this.f8992c.mo9256g();
        }
        if (this.f8998i != null && !this.f8998i.isDisposed()) {
            this.f8998i.dispose();
        }
        if (this.f9000m != null) {
            this.f9000m.mo8929d();
            this.f9000m = null;
        }
        ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).startLiveManager().mo9652b(this);
        super.onDestroy();
    }

    /* renamed from: f */
    private void m11294f() {
        int i;
        if (((Integer) C8946b.f24477g.mo22119b()).intValue() == 0) {
            i = 2;
        } else {
            i = 1;
        }
        this.f8996g = i;
        LiveCameraResManager.INST.getModelFilePath();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent == null || !C6319n.m19594a(intent.getStringExtra("orientation"), "landscape")) {
                f8988j = 720;
                f8989k = 1280;
            } else {
                f8988j = 1280;
                f8989k = 720;
            }
        }
        this.f9000m = new C2967c(new C2978a(getContext()).mo9759a(C3358ac.m12515a((int) R.string.fdg)).mo9755a((C2965a) new C2761d()).mo9756a((C2966b) new C2762e()).mo9757a((C2980a) new C2760c()).mo9777j(i).mo9767c(LiveCameraResManager.INST.getModelFilePath()).mo9758a((Object) LiveCameraResManager.INST.getResourceFinder(getContext())).mo9752a(f8988j, f8989k).mo9778k(0).mo9762a());
        this.f8990a = new C2953b(this.f8999l, this.f9000m);
        this.f8990a.mo9678a((C2955a) new C2955a() {
            /* renamed from: a */
            public final void mo9572a(int i, int i2, String str) {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo9573a(Integer num) throws Exception {
                StartLivePreviewFragment.this.mo9571c();
            }

            /* renamed from: b */
            public final void mo9574b(int i, int i2, String str) {
                if (!StartLivePreviewFragment.this.f8997h) {
                    StartLivePreviewFragment.this.f8998i = C7492s.m23301b(Integer.valueOf(1)).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C2905bw<Object>(this), C2906bx.f9131a);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo9569a(boolean z) {
        String str = "";
        if (this.f8992c != null) {
            str = this.f8992c.mo9253d();
        }
        if (!TextUtils.isEmpty(str)) {
            this.f9001q.setText(str);
            if (z) {
                if (this.f9002r == null) {
                    this.f9002r = m11291b(true);
                } else {
                    this.f8991b.clearAnimation();
                }
                this.f8991b.startAnimation(this.f9002r);
                return;
            }
            if (this.f9003s == null) {
                this.f9003s = m11291b(false);
            } else {
                this.f8991b.clearAnimation();
            }
            this.f8991b.startAnimation(this.f9003s);
        }
    }

    /* renamed from: b */
    private AnimationSet m11291b(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int width = (this.f9004t - this.f9001q.getWidth()) / 2;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new LinearOutSlowInInterpolator());
        alphaAnimation.setDuration(300);
        if (z) {
            f = (float) (-width);
        } else {
            f = (float) width;
        }
        float f6 = 50.0f;
        if (z) {
            f2 = -50.0f;
        } else {
            f2 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new LinearOutSlowInInterpolator());
        translateAnimation.setDuration(300);
        if (z) {
            f3 = -50.0f;
        } else {
            f3 = 50.0f;
        }
        if (z) {
            f4 = 50.0f;
        } else {
            f4 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f3, f4, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300);
        translateAnimation2.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500);
        alphaAnimation2.setInterpolator(new FastOutSlowInInterpolator());
        alphaAnimation2.setDuration(300);
        if (!z) {
            f6 = -50.0f;
        }
        if (z) {
            f5 = (float) width;
        } else {
            f5 = (float) (-width);
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, f5, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500);
        translateAnimation3.setInterpolator(new FastOutSlowInInterpolator());
        translateAnimation3.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                StartLivePreviewFragment.this.f8991b.setVisibility(4);
            }

            public final void onAnimationStart(Animation animation) {
                StartLivePreviewFragment.this.f8991b.setVisibility(0);
            }
        });
        return animationSet;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent != null && C6319n.m19594a(intent.getStringExtra("orientation"), "landscape")) {
                activity.setRequestedOrientation(0);
            }
        }
        m11292d();
        m11294f();
        m11295g();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.al_, viewGroup, false);
    }
}
