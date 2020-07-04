package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.live.feedpage.C32516a;
import com.p280ss.android.ugc.aweme.live.feedpage.C32517b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Map;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.b */
public class C28826b {

    /* renamed from: a */
    public static final String f76004a = "b";

    /* renamed from: b */
    public boolean f76005b;

    /* renamed from: c */
    public boolean f76006c;

    /* renamed from: d */
    public boolean f76007d;

    /* renamed from: e */
    public User f76008e;

    /* renamed from: f */
    public View f76009f;

    /* renamed from: g */
    public LiveCircleView f76010g;

    /* renamed from: h */
    public ValueAnimator f76011h;

    /* renamed from: i */
    public ValueAnimator f76012i;

    /* renamed from: j */
    public C7326g<C32517b> f76013j;

    /* renamed from: k */
    private View f76014k;

    /* renamed from: l */
    private AnimatorSet f76015l;

    /* renamed from: m */
    private Class f76016m;

    /* renamed from: n */
    private Aweme f76017n;

    /* renamed from: o */
    private boolean f76018o;

    /* renamed from: p */
    private OnAttachStateChangeListener f76019p = new OnAttachStateChangeListener() {
        public final void onViewDetachedFromWindow(View view) {
            C28826b.this.mo74073b();
        }

        public final void onViewAttachedToWindow(View view) {
            if (C28826b.this.f76007d) {
                C28826b.this.mo74067a();
            }
        }
    };

    /* renamed from: a */
    public final void mo74067a() {
        mo74068a(0);
        mo74074c();
    }

    public C28826b() {
    }

    /* renamed from: b */
    public final void mo74073b() {
        mo74075d();
        mo74068a(8);
    }

    /* renamed from: d */
    public final void mo74075d() {
        if (this.f76015l != null) {
            this.f76015l.cancel();
            this.f76006c = false;
            this.f76005b = false;
        }
    }

    /* renamed from: c */
    public final void mo74074c() {
        this.f76007d = m94870a(this.f76008e);
        if (!this.f76007d) {
            mo74073b();
            if (!(this.f76013j == null || this.f76008e == null)) {
                try {
                    this.f76013j.accept(new C32517b(Long.parseLong(this.f76008e.getUid()), 0));
                } catch (Exception unused) {
                }
            }
        } else if (this.f76006c) {
            if (this.f76013j != null) {
                mo74070a(this.f76008e, this.f76013j);
            }
        } else {
            if (this.f76011h == null) {
                this.f76011h = ValueAnimator.ofInt(new int[]{0, 800});
                this.f76011h.setRepeatCount(-1);
                this.f76011h.setRepeatMode(1);
                this.f76011h.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float f;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (animatedFraction <= 0.5f) {
                            f = 1.0f - ((animatedFraction / 0.5f) * 0.08f);
                        } else {
                            f = 0.92f + (((animatedFraction - 0.5f) / 0.5f) * 0.08f);
                        }
                        if (C28826b.this.f76009f != null) {
                            C28826b.this.f76009f.setScaleX(f);
                            C28826b.this.f76009f.setScaleY(f);
                        }
                        if (intValue >= 730 && intValue < 740 && !C28826b.this.f76005b) {
                            C28826b.this.f76005b = true;
                            C28826b.this.f76012i.start();
                        }
                    }
                });
            }
            if (this.f76012i == null) {
                this.f76012i = ValueAnimator.ofInt(new int[]{0, 800});
                this.f76012i.setRepeatCount(-1);
                this.f76012i.setRepeatMode(1);
                this.f76012i.setDuration(800);
                this.f76012i.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (intValue >= 0 && intValue <= 640) {
                            float f = (((float) intValue) * 1.0f) / 640.0f;
                            if (C28826b.this.f76010g != null) {
                                C28826b.this.f76010g.setFraction(f);
                            }
                        }
                    }
                });
                this.f76012i.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: b */
                    private int f76024b;

                    public final void onAnimationRepeat(Animator animator) {
                        this.f76024b++;
                        if (C28826b.this.f76013j != null && this.f76024b >= 10) {
                            this.f76024b = 0;
                            C28826b.this.mo74070a(C28826b.this.f76008e, C28826b.this.f76013j);
                        }
                    }
                });
            }
            if (this.f76015l == null) {
                this.f76015l = new AnimatorSet();
                this.f76015l.setDuration(800);
                this.f76015l.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationCancel(Animator animator) {
                        if (C28826b.this.f76012i != null) {
                            C28826b.this.f76012i.cancel();
                        }
                        if (C28826b.this.f76011h != null) {
                            C28826b.this.f76011h.cancel();
                        }
                        C28826b.this.f76006c = false;
                        C28826b.this.f76005b = false;
                    }
                });
            }
            this.f76015l.play(this.f76011h);
            this.f76006c = true;
            this.f76015l.start();
            if (this.f76013j != null) {
                mo74070a(this.f76008e, this.f76013j);
            }
        }
    }

    /* renamed from: a */
    private boolean m94870a(User user) {
        if (user == null) {
            return this.f76007d;
        }
        if (!C25072c.m82575a(this.f76017n)) {
            boolean isLive = user.isLive();
            if (isLive && !C43122ff.m136767b() && ((!user.isSecret() || C43122ff.m136786q(user)) && isLive && C41983b.m133444a() && !user.isBlock())) {
                return true;
            }
            return false;
        } else if (!this.f76018o) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo74068a(int i) {
        if (i == 0) {
            if (this.f76010g != null) {
                this.f76010g.setVisibility(0);
            }
            if (this.f76009f != null) {
                this.f76009f.setVisibility(0);
                if (!(this.f76014k == null || this.f76009f == this.f76014k)) {
                    this.f76014k.setVisibility(8);
                }
            }
        } else {
            if (this.f76010g != null) {
                this.f76010g.setVisibility(8);
            }
            if (!(this.f76009f == null || this.f76009f == this.f76014k)) {
                this.f76009f.setVisibility(8);
            }
            if (this.f76014k != null) {
                this.f76014k.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo74070a(User user, C7326g<C32517b> gVar) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            long parseLong = Long.parseLong(user.getUid());
            C32516a liveStateManager = BusinessComponentServiceUtils.getLiveStateManager();
            Class cls = this.f76016m;
            C28864c cVar = new C28864c(this, parseLong, user, gVar);
            liveStateManager.mo83745a(cls, user, cVar);
        }
    }

    /* renamed from: a */
    public final void mo74071a(User user, Class cls, C7326g<C32517b> gVar) {
        mo74072a(user, cls, gVar, null, false);
    }

    public C28826b(boolean z, View view, View view2, LiveCircleView liveCircleView) {
        int i;
        this.f76009f = view;
        this.f76014k = view2;
        this.f76010g = liveCircleView;
        this.f76007d = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        liveCircleView.setVisibility(i);
        view.addOnAttachStateChangeListener(this.f76019p);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74069a(long j, User user, C7326g gVar, Map map) throws Exception {
        long j2;
        if (map != null) {
            Long l = (Long) map.get(Long.valueOf(j));
            long j3 = 0;
            if ((l == null || l.longValue() == 0) && !C25072c.m82575a(this.f76017n)) {
                l = Long.valueOf(0);
                user.roomId = 0;
                mo74073b();
            } else {
                if (l != null) {
                    j2 = l.longValue();
                } else {
                    j2 = 0;
                }
                user.roomId = j2;
            }
            if (gVar != null) {
                if (l != null) {
                    j3 = l.longValue();
                }
                gVar.accept(new C32517b(j, j3));
            }
        }
    }

    /* renamed from: a */
    public final void mo74072a(User user, Class cls, C7326g<C32517b> gVar, Aweme aweme, boolean z) {
        this.f76017n = aweme;
        this.f76018o = z;
        this.f76008e = user;
        this.f76013j = gVar;
        this.f76016m = cls;
        this.f76007d = m94870a(user);
        this.f76009f.removeOnAttachStateChangeListener(this.f76019p);
        this.f76009f.addOnAttachStateChangeListener(this.f76019p);
        if (this.f76007d) {
            mo74067a();
        } else {
            mo74073b();
        }
    }
}
