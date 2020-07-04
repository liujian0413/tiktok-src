package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.Vibrator;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.DefaultItemAnimator;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p562b.C10743b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.BaseMaskLayerOptionsAdapter;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.C28927a.C28928a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.C28932e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.MaskLayerItemDecoration;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.experiment.CorrelatedVideosSearchExperiment;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.shortvideo.C38457aq;
import com.p280ss.android.ugc.aweme.similarvideo.api.SimilarVideoSearchApi;
import com.p280ss.android.ugc.aweme.similarvideo.p1628a.C41714a;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout */
public class DisLikeAwemeLayout extends FrameLayout implements C6310a, C28343z<C28318an>, C28519d {

    /* renamed from: n */
    public static int f75613n = 0;

    /* renamed from: o */
    private static final float f75614o = ((float) C28928a.m95142a());

    /* renamed from: x */
    private static boolean f75615x = false;

    /* renamed from: A */
    private int f75616A;

    /* renamed from: B */
    private int f75617B;

    /* renamed from: C */
    private int f75618C;

    /* renamed from: D */
    private boolean f75619D;

    /* renamed from: a */
    public Context f75620a;

    /* renamed from: b */
    public C28932e f75621b;

    /* renamed from: c */
    public RecyclerView f75622c;

    /* renamed from: d */
    public View f75623d;

    /* renamed from: e */
    public Aweme f75624e;

    /* renamed from: f */
    public View f75625f;

    /* renamed from: g */
    public View f75626g;

    /* renamed from: h */
    public View f75627h;

    /* renamed from: i */
    public TextView f75628i;

    /* renamed from: j */
    protected C6309f f75629j;

    /* renamed from: k */
    public boolean f75630k;

    /* renamed from: l */
    public String f75631l;

    /* renamed from: m */
    public boolean f75632m;

    /* renamed from: p */
    private View f75633p;

    /* renamed from: q */
    private Activity f75634q;

    /* renamed from: r */
    private BaseMaskLayerOptionsAdapter f75635r;

    /* renamed from: s */
    private TextView f75636s;

    /* renamed from: t */
    private RemoteImageView f75637t;

    /* renamed from: u */
    private LinearLayout f75638u;

    /* renamed from: v */
    private ValueAnimator f75639v;

    /* renamed from: w */
    private AnimatorListenerAdapter f75640w;

    /* renamed from: y */
    private C41714a f75641y;

    /* renamed from: z */
    private Exception f75642z;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64929a(Object obj) {
    }

    public C1262a getAdapter() {
        return this.f75635r;
    }

    /* renamed from: e */
    private void m94462e() {
        if (this.f75635r != null) {
            this.f75635r.mo74216a(this.f75624e, this.f75631l);
        }
    }

    /* renamed from: f */
    private void m94463f() {
        if (this.f75624e != null) {
            C23397p.m76735a().mo60807a(this.f75629j, new Callable() {
                public final Object call() throws Exception {
                    try {
                        return SimilarVideoSearchApi.m132829a(DisLikeAwemeLayout.this.f75624e.getAid());
                    } catch (ExecutionException e) {
                        throw C22838j.m75277a(e);
                    }
                }
            }, 0);
        }
    }

    /* renamed from: a */
    public final void mo73785a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f75627h, "alpha", new float[]{1.0f, 0.75f});
        ofFloat.setDuration(150);
        ofFloat.start();
    }

    /* renamed from: c */
    private void m94460c() {
        this.f75625f.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.f75625f.setVisibility(8);
        this.f75628i = (TextView) findViewById(R.id.al4);
        this.f75627h = findViewById(R.id.al0);
        this.f75627h.setVisibility(8);
        this.f75627h.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    DisLikeAwemeLayout.this.mo73785a();
                }
                return false;
            }
        });
        this.f75627h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                if (DisLikeAwemeLayout.this.f75621b != null) {
                    DisLikeAwemeLayout.this.f75621b.mo67761a(false);
                }
                C6903bc.m21503v().mo58108a(DisLikeAwemeLayout.this.f75620a, DisLikeAwemeLayout.this.f75624e);
                String str2 = "similar_videos";
                C22984d a = new C22984d().mo59973a("enter_from", DisLikeAwemeLayout.this.f75631l);
                String str3 = "group_id";
                if (DisLikeAwemeLayout.this.f75624e == null) {
                    str = "";
                } else {
                    str = DisLikeAwemeLayout.this.f75624e.getAid();
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("action_type", "click").f60753a);
            }
        });
        this.f75637t = (RemoteImageView) findViewById(R.id.cxy);
        this.f75626g = findViewById(R.id.al1);
        this.f75626g.setVisibility(8);
    }

    /* renamed from: g */
    private void m94464g() {
        this.f75623d.setVisibility(0);
        this.f75626g.setVisibility(8);
        this.f75626g.setAlpha(0.0f);
        this.f75627h.setVisibility(8);
        this.f75627h.setAlpha(0.0f);
        this.f75625f.setVisibility(0);
        this.f75625f.setAlpha(1.0f);
        this.f75639v = ValueAnimator.ofInt(new int[]{0, 100});
        this.f75639v.setDuration(300);
        this.f75639v.setRepeatCount(-1);
        this.f75640w = new AnimatorListenerAdapter() {
            public final void onAnimationRepeat(Animator animator) {
                String str = ClassUtils.PACKAGE_SEPARATOR;
                if (DisLikeAwemeLayout.f75613n == 0) {
                    str = ClassUtils.PACKAGE_SEPARATOR;
                } else if (DisLikeAwemeLayout.f75613n == 1) {
                    str = "..";
                } else if (DisLikeAwemeLayout.f75613n == 2) {
                    str = "...";
                }
                DisLikeAwemeLayout.this.f75628i.setText(str);
                DisLikeAwemeLayout.f75613n = (DisLikeAwemeLayout.f75613n + 1) % 3;
            }
        };
        this.f75639v.addListener(this.f75640w);
        this.f75639v.start();
    }

    /* renamed from: b */
    private void m94458b() {
        this.f75633p = findViewById(R.id.a9g);
        this.f75622c = (RecyclerView) findViewById(R.id.d4b);
        this.f75636s = (TextView) findViewById(R.id.d4c);
        this.f75623d = findViewById(R.id.a9o);
        this.f75623d.setVisibility(8);
        this.f75625f = findViewById(R.id.al2);
        this.f75638u = (LinearLayout) findViewById(R.id.bxd);
        if (C28928a.m95144b()) {
            LayoutParams layoutParams = new LayoutParams(this.f75622c.getLayoutParams());
            layoutParams.gravity = 17;
            layoutParams.topMargin = 0;
            this.f75622c.setLayoutParams(layoutParams);
        } else {
            C23487o.m77150b((View) this.f75636s, 0);
            if (C6399b.m19944t()) {
                this.f75636s.setTextColor(C0683b.m2912c(this.f75620a, R.color.yk));
            }
        }
        setOnClickListener(new C28898h(this));
    }

    /* renamed from: d */
    private void m94461d() {
        double d;
        if (C28928a.m95144b()) {
            this.f75622c.setLayoutManager(new WrapLinearLayoutManager(this.f75620a, 1, false));
            this.f75622c.mo5525a((C1272h) new MaskLayerItemDecoration(1, 16));
        } else {
            this.f75622c.setLayoutManager(new WrapLinearLayoutManager(this.f75620a, 0, false));
            this.f75622c.mo5525a((C1272h) new MaskLayerItemDecoration(0, 12));
        }
        this.f75622c.setItemAnimator(new DefaultItemAnimator());
        this.f75635r = BusinessComponentServiceUtils.getMaskLayerOptionsAdapter(this.f75620a);
        this.f75635r.mo74217a(this.f75621b);
        this.f75622c.setAdapter(this.f75635r);
        if (C6399b.m19944t()) {
            d = 230.0d;
        } else {
            d = 210.0d;
        }
        this.f75618C = C23486n.m77122a(d);
        this.f75616A = C23486n.m77122a(60.0d);
        this.f75617B = this.f75620a.getResources().getDisplayMetrics().heightPixels - this.f75616A;
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f75631l;
    }

    public void setInDislikeMode(boolean z) {
        this.f75632m = z;
    }

    public void setListener(C28932e eVar) {
        this.f75621b = eVar;
    }

    public DisLikeAwemeLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo73787a(View view) {
        if (this.f75621b != null && this.f75632m) {
            this.f75621b.mo67761a(false);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f75632m) {
            return false;
        }
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void handleMsg(Message message) {
        if (getVisibility() == 0 || this.f75630k) {
            if (message != null && message.what == 1) {
                f75615x = true;
                if (this.f75641y != null) {
                    m94457a(this.f75641y.f108582a, this.f75641y.f108583b);
                    this.f75641y = null;
                } else if (this.f75642z != null) {
                    m94457a(false, (UrlModel) null);
                }
            }
            if (message.obj instanceof Exception) {
                this.f75642z = (Exception) message.obj;
                if (f75615x) {
                    m94457a(false, (UrlModel) null);
                }
                return;
            }
            if (message.obj instanceof C41714a) {
                this.f75641y = (C41714a) message.obj;
                if (f75615x) {
                    m94457a(this.f75641y.f108582a, this.f75641y.f108583b);
                    this.f75641y = null;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo73788b(boolean z) {
        ObjectAnimator objectAnimator;
        m94459b(0.0f, 0.0f);
        this.f75630k = false;
        f75615x = false;
        if (this.f75629j.hasMessages(1)) {
            this.f75629j.removeMessages(1);
        }
        if (this.f75639v != null) {
            this.f75639v.removeListener(this.f75640w);
            this.f75639v.cancel();
            this.f75639v = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f75633p, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(150);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f75638u, "alpha", new float[]{1.0f, 0.0f});
        ofFloat2.setDuration(200);
        if (this.f75619D) {
            objectAnimator = ObjectAnimator.ofFloat(this.f75638u, "translationY", new float[]{0.0f, f75614o});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f75638u, "translationY", new float[]{f75614o, 0.0f});
        }
        objectAnimator.setDuration(250);
        if (!C28928a.m95144b()) {
            objectAnimator.setInterpolator(new C10743b());
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(objectAnimator);
        animatorSet.start();
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                DisLikeAwemeLayout.this.f75622c.setVisibility(8);
                DisLikeAwemeLayout.this.f75623d.setVisibility(8);
                DisLikeAwemeLayout.this.f75625f.setVisibility(8);
                DisLikeAwemeLayout.this.f75627h.setVisibility(8);
                DisLikeAwemeLayout.this.f75626g.setVisibility(8);
                DisLikeAwemeLayout.this.setVisibility(8);
                super.onAnimationEnd(animator);
            }
        });
    }

    public DisLikeAwemeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m94459b(float f, float f2) {
        if (this.f75633p == null && getChildCount() == 0) {
            m94456a(f, f2);
        }
    }

    /* renamed from: a */
    private void m94456a(float f, float f2) {
        View.inflate(this.f75620a, R.layout.ln, this);
        m94458b();
        m94460c();
        m94461d();
    }

    /* renamed from: a */
    private void m94457a(final boolean z, UrlModel urlModel) {
        String str;
        f75615x = false;
        if (this.f75639v != null) {
            this.f75639v.removeListener(this.f75640w);
            this.f75639v.cancel();
            this.f75639v = null;
        }
        if (z) {
            String str2 = "similar_videos";
            C22984d a = new C22984d().mo59973a("enter_from", this.f75631l);
            String str3 = "group_id";
            if (this.f75624e == null) {
                str = "";
            } else {
                str = this.f75624e.getAid();
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("action_type", "show").f60753a);
        }
        if (z) {
            if (urlModel != null) {
                C23323e.m76524b(this.f75637t, urlModel);
            } else {
                this.f75637t.setImageResource(R.drawable.bgu);
            }
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f75625f, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                DisLikeAwemeLayout.this.f75625f.setVisibility(8);
                if (z) {
                    DisLikeAwemeLayout.this.f75627h.setAlpha(0.0f);
                    DisLikeAwemeLayout.this.f75627h.setVisibility(0);
                    return;
                }
                DisLikeAwemeLayout.this.f75626g.setAlpha(0.0f);
                DisLikeAwemeLayout.this.f75626g.setVisibility(0);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f75627h, "alpha", new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(200);
            animatorSet.play(ofFloat).before(ofFloat2);
        } else {
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f75626g, "alpha", new float[]{0.0f, 1.0f});
            ofFloat3.setDuration(200);
            animatorSet.play(ofFloat).before(ofFloat3);
        }
        animatorSet.start();
    }

    public DisLikeAwemeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75619D = true;
        this.f75620a = context;
        this.f75634q = (Activity) this.f75620a;
        this.f75629j = new C6309f(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public final void mo73786a(float f, float f2, String str, Aweme aweme) {
        boolean z;
        int i;
        ObjectAnimator objectAnimator;
        if (this.f75634q != null) {
            Vibrator vibrator = (Vibrator) this.f75634q.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(15);
            }
        }
        this.f75624e = aweme;
        this.f75631l = str;
        if (TextUtils.equals(str, "homepage_follow")) {
            z = false;
        } else {
            z = C6384b.m19835a().mo15292a(CorrelatedVideosSearchExperiment.class, true, "correlated_videos_search", C6384b.m19835a().mo15295d().correlated_videos_search, false);
        }
        if ((!C6399b.m19944t() && z) || C28928a.m95144b()) {
            f = (float) ((getContext().getResources().getDisplayMetrics().heightPixels / 2) + C23486n.m77122a(105.0d));
            f2 = (float) ((getContext().getResources().getDisplayMetrics().heightPixels / 2) + C23486n.m77122a(105.0d));
        }
        this.f75630k = true;
        m94459b(f, f2);
        m94462e();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f75638u.getLayoutParams());
        if (C28928a.m95144b()) {
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.gravity = 17;
        } else {
            int i2 = (int) f2;
            int i3 = i2 - this.f75618C;
            if (i3 < this.f75616A) {
                this.f75619D = false;
            } else {
                if (i3 > this.f75617B - this.f75618C) {
                    i2 = this.f75617B - this.f75618C;
                } else {
                    i2 = i3;
                }
                this.f75619D = true;
            }
            layoutParams.setMargins(0, i2, 0, 0);
        }
        this.f75638u.setLayoutParams(layoutParams);
        this.f75622c.setVisibility(0);
        setVisibility(0);
        if (C28928a.m95144b()) {
            i = C34943c.f91127w;
        } else {
            i = C34943c.f91128x;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f75633p, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(150);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f75638u, "alpha", new float[]{0.0f, 1.0f});
        long j = (long) i;
        ofFloat2.setDuration(j);
        if (this.f75619D) {
            objectAnimator = ObjectAnimator.ofFloat(this.f75638u, "translationY", new float[]{f75614o, 0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f75638u, "translationY", new float[]{0.0f, f75614o});
        }
        objectAnimator.setDuration(j);
        if (!C28928a.m95144b()) {
            objectAnimator.setInterpolator(new OvershootInterpolator(1.04f));
        } else {
            objectAnimator.setInterpolator(new C38457aq(0.25f, 0.1f, 0.25f, 1.0f));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(objectAnimator).with(ofFloat2);
        animatorSet.start();
        if (C28899i.m95084a(this.f75620a) && this.f75624e != null && !this.f75624e.isAd() && z && !C6399b.m19944t()) {
            m94464g();
            f75615x = false;
            this.f75629j.sendEmptyMessageDelayed(1, 1000);
            m94463f();
        }
    }
}
