package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0053p;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4414af;
import com.bytedance.android.livesdk.chatroom.event.C4430av;
import com.bytedance.android.livesdk.chatroom.model.C4914l;
import com.bytedance.android.livesdk.chatroom.model.C4916m;
import com.bytedance.android.livesdk.chatroom.model.C4923s;
import com.bytedance.android.livesdk.chatroom.p209bl.PlatformMessageHelper;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.presenter.C5025j;
import com.bytedance.android.livesdk.chatroom.presenter.C5025j.C5026a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.message.model.C8691v;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdk.rank.C8851m;
import com.bytedance.android.livesdk.rank.DailyRankDialog;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.rank.p420b.C8819c;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdk.widget.C9241e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.p457i.C9483j;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class DailyRankWidget extends LiveRecyclableWidget implements C0053p<KVData>, OnClickListener, C5026a {

    /* renamed from: A */
    private boolean f15774A = false;

    /* renamed from: B */
    private boolean f15775B;

    /* renamed from: C */
    private int f15776C = 0;

    /* renamed from: D */
    private CharSequence f15777D;

    /* renamed from: E */
    private String f15778E;

    /* renamed from: F */
    private int f15779F = -1;

    /* renamed from: G */
    private final C47562b f15780G = new C47562b();

    /* renamed from: H */
    private AnimatorSet f15781H;

    /* renamed from: a */
    public View f15782a;

    /* renamed from: b */
    public View f15783b;

    /* renamed from: c */
    public View f15784c;

    /* renamed from: d */
    public TextView f15785d;

    /* renamed from: e */
    public View f15786e;

    /* renamed from: f */
    public TextView f15787f;

    /* renamed from: g */
    public View f15788g;

    /* renamed from: h */
    public boolean f15789h;

    /* renamed from: i */
    public C5403b f15790i;

    /* renamed from: j */
    public C5403b f15791j;

    /* renamed from: k */
    public int f15792k = 0;

    /* renamed from: l */
    public CharSequence f15793l;

    /* renamed from: m */
    public int f15794m = -1;

    /* renamed from: n */
    public AnimatorSet f15795n;

    /* renamed from: o */
    public AnimatorSet f15796o;

    /* renamed from: p */
    public boolean f15797p = true;

    /* renamed from: q */
    public boolean f15798q = true;

    /* renamed from: r */
    private TextView f15799r;

    /* renamed from: s */
    private TextView f15800s;

    /* renamed from: t */
    private ImageView f15801t;

    /* renamed from: u */
    private DailyRankDialog f15802u;

    /* renamed from: v */
    private DailyRankDialog f15803v;

    /* renamed from: w */
    private C5025j f15804w;

    /* renamed from: x */
    private Room f15805x;

    /* renamed from: y */
    private boolean f15806y;

    /* renamed from: z */
    private boolean f15807z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$a */
    class C5400a implements OnGlobalLayoutListener {

        /* renamed from: a */
        public View f15813a;

        /* renamed from: b */
        public View f15814b;

        /* renamed from: c */
        public Runnable f15815c;

        /* renamed from: e */
        private int f15817e;

        /* renamed from: f */
        private int f15818f;

        /* renamed from: g */
        private boolean f15819g;

        /* renamed from: h */
        private int f15820h = NormalGiftView.MASK_TRANSLATE_VALUE;

        public final void onGlobalLayout() {
            int height = this.f15813a.getHeight();
            int width = this.f15813a.getWidth();
            if (VERSION.SDK_INT >= 16) {
                this.f15813a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                this.f15813a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            this.f15813a.setVisibility(8);
            if (this.f15819g) {
                m17216a(width, height);
            } else {
                m17217b(width, height);
            }
        }

        /* renamed from: a */
        private void m17216a(int i, int i2) {
            if (DailyRankWidget.this.isViewValid()) {
                if (this.f15817e <= 0 || this.f15817e >= i || this.f15818f <= 0 || this.f15818f >= i2) {
                    DailyRankWidget.this.mo13712c();
                    DailyRankWidget.this.mo13706a(8);
                    DailyRankWidget.this.f15788g.setVisibility(0);
                    if (this.f15815c != null) {
                        this.f15815c.run();
                    }
                    return;
                }
                int i3 = i - this.f15817e;
                int i4 = i2 - this.f15818f;
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 10});
                ofInt.addUpdateListener(new C5578ac(this, i3, i4));
                ofInt.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (DailyRankWidget.this.isViewValid()) {
                            C5400a.this.f15813a.setVisibility(0);
                            C5400a.this.f15814b.getLayoutParams().width = -2;
                            C5400a.this.f15814b.getLayoutParams().height = -2;
                        }
                        if (C5400a.this.f15815c != null) {
                            C5400a.this.f15815c.run();
                        }
                    }
                });
                ofInt.setDuration((long) this.f15820h).start();
            }
        }

        /* renamed from: b */
        private void m17217b(int i, int i2) {
            if (DailyRankWidget.this.isViewValid()) {
                if (this.f15817e <= 0 || this.f15817e <= i || this.f15818f <= 0 || this.f15818f <= i2) {
                    DailyRankWidget.this.f15788g.setVisibility(8);
                    DailyRankWidget.this.mo13706a(0);
                    DailyRankWidget.this.mo13710b();
                    if (this.f15815c != null) {
                        this.f15815c.run();
                    }
                    return;
                }
                int i3 = this.f15817e - i;
                int i4 = this.f15818f - i2;
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 10});
                ofInt.addUpdateListener(new C5579ad(this, i3, i4));
                ofInt.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (DailyRankWidget.this.isViewValid()) {
                            C5400a.this.f15813a.setVisibility(0);
                            C5400a.this.f15814b.getLayoutParams().width = -2;
                            C5400a.this.f15814b.getLayoutParams().height = -2;
                        }
                        if (C5400a.this.f15815c != null) {
                            C5400a.this.f15815c.run();
                        }
                    }
                });
                ofInt.setDuration((long) this.f15820h).start();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13717a(int i, int i2, ValueAnimator valueAnimator) {
            float intValue = ((float) ((Integer) valueAnimator.getAnimatedValue()).intValue()) / 10.0f;
            int i3 = this.f15817e - ((int) (((float) i) * intValue));
            int i4 = this.f15818f - ((int) (((float) i2) * intValue));
            this.f15814b.getLayoutParams().width = i3;
            this.f15814b.getLayoutParams().height = i4;
            this.f15814b.requestLayout();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ void mo13718b(int i, int i2, ValueAnimator valueAnimator) {
            float intValue = ((float) ((Integer) valueAnimator.getAnimatedValue()).intValue()) / 10.0f;
            int i3 = this.f15817e + ((int) (((float) i) * intValue));
            int i4 = this.f15818f + ((int) (((float) i2) * intValue));
            this.f15814b.getLayoutParams().width = i3;
            this.f15814b.getLayoutParams().height = i4;
            this.f15814b.requestLayout();
        }

        C5400a(int i, int i2, View view, View view2, boolean z, Runnable runnable) {
            this.f15817e = i;
            this.f15818f = i2;
            this.f15813a = view;
            this.f15814b = view2;
            this.f15819g = z;
            this.f15815c = runnable;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$b */
    static class C5403b {

        /* renamed from: a */
        TextView f15823a;

        /* renamed from: b */
        View f15824b;

        /* renamed from: c */
        CharSequence f15825c;

        /* renamed from: d */
        CharSequence f15826d;

        /* renamed from: e */
        public int f15827e = -1;

        /* renamed from: f */
        ObjectAnimator f15828f;

        /* renamed from: g */
        ObjectAnimator f15829g;

        /* renamed from: h */
        ObjectAnimator f15830h;

        /* renamed from: i */
        public C5409a f15831i;

        /* renamed from: j */
        long f15832j;

        /* renamed from: k */
        int f15833k;

        /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget$b$a */
        interface C5409a {
        }

        /* renamed from: c */
        private void m17220c() {
            m17221d();
        }

        /* renamed from: g */
        private void m17224g() {
            m17223f();
            if (this.f15824b != null) {
                this.f15824b.setVisibility(8);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo13725b() {
            m17224g();
            this.f15823a = null;
            this.f15824b = null;
            this.f15825c = null;
            this.f15826d = null;
            this.f15827e = -1;
            this.f15828f = null;
            this.f15829g = null;
        }

        /* renamed from: d */
        private void m17221d() {
            this.f15828f = ObjectAnimator.ofFloat(this.f15823a, "alpha", new float[]{1.0f, 0.0f, 0.0f});
            this.f15828f.setDuration(480);
            this.f15828f.removeAllListeners();
            this.f15828f.addListener(new AnimatorListener() {
                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationCancel(Animator animator) {
                    C5403b.this.f15823a.setAlpha(1.0f);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (C5403b.this.f15823a != null) {
                        C5403b.this.f15823a.setTranslationX(0.0f);
                        if (C5403b.this.f15827e == 1) {
                            C5403b.this.mo13724a(C5403b.this.f15826d);
                            C5403b.this.f15823a.setText(C5403b.this.f15826d);
                            C5403b.this.f15827e = 2;
                        } else if (C5403b.this.f15827e == 2) {
                            C5403b.this.mo13724a(C5403b.this.f15825c);
                            C5403b.this.f15823a.setText(C5403b.this.f15825c);
                            C5403b.this.f15827e = -1;
                            C5403b.this.mo13726b((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                        } else {
                            return;
                        }
                        if (C5403b.this.f15830h != null) {
                            C5403b.this.f15830h.cancel();
                        }
                        C5403b.this.f15830h = ObjectAnimator.ofFloat(C5403b.this.f15823a, "alpha", new float[]{0.0f, 1.0f, 1.0f});
                        C5403b.this.f15830h.setDuration(480);
                        C5403b.this.f15830h.removeAllListeners();
                        C5403b.this.f15830h.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                if (C5403b.this.f15827e == 2) {
                                    C5403b.this.mo13722a();
                                }
                            }
                        });
                        C5403b.this.f15830h.start();
                    }
                }
            });
        }

        /* renamed from: e */
        private int m17222e() {
            float f;
            if (TextUtils.isEmpty(this.f15825c) || TextUtils.isEmpty(this.f15826d)) {
                f = 0.0f;
            } else {
                f = this.f15823a.getPaint().measureText(this.f15825c.toString());
            }
            if (f == 0.0f) {
                return 0;
            }
            return -((int) (this.f15823a.getPaint().measureText(this.f15826d.toString()) - f));
        }

        /* renamed from: f */
        private void m17223f() {
            this.f15827e = -1;
            if (this.f15829g != null) {
                this.f15829g.removeAllListeners();
                this.f15829g.cancel();
                this.f15829g = null;
            }
            if (this.f15828f != null) {
                this.f15828f.removeAllListeners();
                this.f15828f.cancel();
                this.f15828f = null;
            }
            if (this.f15830h != null) {
                this.f15830h.removeAllListeners();
                this.f15830h.cancel();
                this.f15830h = null;
            }
            this.f15831i = null;
            if (this.f15823a != null) {
                this.f15823a.clearAnimation();
                this.f15823a.setText(this.f15825c);
                this.f15823a.setAlpha(1.0f);
                this.f15823a.setTranslationX(0.0f);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo13722a() {
            int i;
            long j;
            if (this.f15833k > 0) {
                i = 0;
            } else {
                i = this.f15833k;
            }
            this.f15833k = i;
            this.f15829g = ObjectAnimator.ofFloat(this.f15823a, "translationX", new float[]{0.0f, (float) this.f15833k});
            if (this.f15832j <= 0) {
                j = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
            } else {
                j = this.f15832j;
            }
            this.f15832j = j;
            long min = Math.min(this.f15832j, (long) (Math.abs(this.f15833k) * 60));
            final long j2 = this.f15832j - min;
            this.f15829g.setDuration(min);
            this.f15829g.removeAllListeners();
            this.f15829g.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C5403b.this.f15827e = 3;
                }

                public final void onAnimationCancel(Animator animator) {
                    if (C5403b.this.f15823a != null) {
                        C5403b.this.f15823a.setTranslationX(0.0f);
                    }
                    C5403b.this.f15831i = null;
                }

                public final void onAnimationEnd(Animator animator) {
                    C5403b.this.f15827e = 2;
                    if (C5403b.this.f15831i == null) {
                        C5403b.this.mo13726b(j2);
                    } else if (C5403b.this.f15824b != null) {
                        C5403b.this.f15824b.postDelayed(new Runnable() {
                            public final void run() {
                            }
                        }, j2);
                    }
                }
            });
            if (this.f15829g != null) {
                this.f15829g.start();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo13723a(long j) {
            this.f15832j = j * 1000;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo13727b(CharSequence charSequence) {
            this.f15826d = charSequence;
            this.f15833k = m17222e();
        }

        /* renamed from: a */
        public final void mo13724a(CharSequence charSequence) {
            int i;
            LayoutParams layoutParams = (LayoutParams) this.f15823a.getLayoutParams();
            if (TextUtils.isEmpty(charSequence)) {
                i = -2;
            } else {
                i = (int) this.f15823a.getPaint().measureText(charSequence.toString());
            }
            layoutParams.width = i;
            this.f15823a.setLayoutParams(layoutParams);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo13726b(long j) {
            if (((this.f15828f != null && !this.f15828f.isRunning()) || j != 0) && !TextUtils.isEmpty(this.f15826d)) {
                if ((this.f15827e == -1 || this.f15827e == 2) && this.f15824b != null) {
                    if (this.f15827e == -1) {
                        this.f15827e = 1;
                    }
                    m17220c();
                    this.f15824b.postDelayed(new Runnable() {
                        public final void run() {
                            if (C5403b.this.f15828f != null) {
                                C5403b.this.f15828f.start();
                            }
                        }
                    }, j);
                }
            }
        }

        C5403b(TextView textView, View view) {
            this.f15823a = textView;
            this.f15824b = view;
            m17220c();
        }
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.awq;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13709a(C8819c cVar) throws Exception {
        if (cVar != null) {
            if (cVar.f23967b) {
                m17197c(cVar.f23966a);
            } else if (this.f15802u != null) {
                this.f15802u.mo21872a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo13047a(C8852a aVar) {
        if (isViewValid() && aVar != null) {
            this.f15775B = aVar.f24078k;
            if (aVar.f24078k) {
                C9738o.m28712b(this.f15784c, 8);
                return;
            }
            this.f15778E = aVar.f24084q == null ? null : aVar.f24084q.f24103g;
            LiveSettingKeys.AWEME_HOUR_RANK_ENTRANCE_STYLE.mo10240a();
            if (aVar.f24069b != null && !C6319n.m19593a(aVar.f24069b.f24100d)) {
                this.f15793l = aVar.f24069b.f24100d;
                this.f15777D = aVar.f24069b.f24100d;
                if (aVar.f24084q != null) {
                    this.f15792k = aVar.f24084q.f24099c;
                    this.f15777D = aVar.f24084q.f24100d;
                }
                mo13707a(aVar.f24069b.f24099c, this.f15792k, true);
            }
        }
    }

    /* renamed from: i */
    private void m17202i() {
        if (isViewValid() && this.f15802u != null) {
            this.f15802u.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo13710b() {
        if (this.f15774A) {
            this.f15799r.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo13712c() {
        if (this.f15774A) {
            this.f15799r.setVisibility(8);
        }
    }

    /* renamed from: h */
    private boolean m17201h() {
        if (C8851m.m26480c(this.f15806y)) {
            return true;
        }
        C4923s sVar = (C4923s) LiveSettingKeys.LIVE_RANK_CONFIG.mo10240a();
        if (sVar == null || !sVar.f14075b) {
            return false;
        }
        return true;
    }

    public DailyRankWidget() {
        ((Integer) LiveSettingKeys.LIVE_ENABLE_GUARD.mo10240a()).intValue();
    }

    /* renamed from: a */
    public static boolean m17194a() {
        if (((Integer) LiveSettingKeys.LIVE_DAILY_RANK.mo10240a()).intValue() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m17198d() {
        if (this.contentView != null) {
            this.f15801t = (ImageView) this.contentView.findViewById(R.id.cnh);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f15801t.getLayoutParams();
            C9738o.m28712b((View) this.f15801t, 8);
            this.f15801t.setLayoutParams(layoutParams);
            getContext();
        }
    }

    /* renamed from: f */
    private void m17199f() {
        if (isViewValid() && this.f15785d != null) {
            this.f15784c.setVisibility(8);
            this.f15788g.setVisibility(8);
            this.f15790i = new C5403b(this.f15785d, this.f15784c);
            this.f15791j = new C5403b(this.f15787f, this.f15786e);
            if (m17194a()) {
                this.f15804w.mo13043b();
            }
        }
    }

    /* renamed from: g */
    private void m17200g() {
        if (this.f15795n != null) {
            this.f15795n.removeAllListeners();
            this.f15795n.cancel();
            this.f15795n = null;
        }
        if (this.f15796o != null) {
            this.f15796o.removeAllListeners();
            this.f15796o.cancel();
            this.f15796o = null;
        }
        if (this.f15784c != null) {
            this.f15784c.setScaleY(1.0f);
        }
        if (this.f15786e != null) {
            this.f15786e.setScaleY(1.0f);
        }
    }

    public void onUnload() {
        this.f15804w.mo8963a();
        m17200g();
        this.f15794m = -1;
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        if (this.f15802u != null) {
            try {
                this.f15802u.dismiss();
            } catch (IllegalStateException unused) {
            }
            this.f15802u = null;
        }
        this.f15789h = false;
        this.f15799r.setVisibility(8);
        if (this.f15790i != null) {
            this.f15790i.mo13725b();
            this.f15790i = null;
        }
        if (this.f15791j != null) {
            this.f15791j.mo13725b();
            this.f15791j = null;
        }
        this.f15793l = null;
        this.f15777D = null;
        this.f15776C = 0;
        this.f15792k = 0;
        this.f15780G.mo119660a();
        if (this.f15781H != null) {
            this.f15781H.cancel();
            this.f15781H = null;
        }
    }

    public void onEvent(C4430av avVar) {
        if (isViewValid() && this.f15802u != null) {
            this.f15802u.dismiss();
        }
    }

    /* renamed from: a */
    private void m17193a(String str) {
        new C9241e(this.context).mo22694a(str).mo22695b(new C5576aa(this)).mo22693a(C5577ab.f16639a).show();
    }

    /* renamed from: b */
    private void m17195b(int i) {
        if (this.f15802u != null) {
            this.f15802u.dismiss();
        } else {
            this.f15802u = DailyRankDialog.m26361a(this.f15805x, this.f15806y, this.f15807z, this.dataCenter, i);
        }
        this.f15802u.f23902f = i;
        this.f15802u.show(((FragmentActivity) this.context).getSupportFragmentManager(), DailyRankDialog.f23895a);
    }

    /* renamed from: c */
    private void m17197c(int i) {
        if (this.f15803v != null) {
            this.f15803v.dismiss();
        } else {
            this.f15803v = DailyRankDialog.m26361a(this.f15805x, this.f15806y, this.f15807z, this.dataCenter, i);
        }
        this.f15803v.f23902f = i;
        this.f15803v.show(((FragmentActivity) this.context).getSupportFragmentManager(), DailyRankDialog.f23895a);
        if (this.f15802u != null) {
            this.f15802u.mo21872a(true);
        }
    }

    public void onClick(View view) {
        String str;
        if (isViewValid()) {
            int id = view.getId();
            if (id == R.id.a5y) {
                m17195b(0);
            } else if (id == R.id.buw) {
                m17195b(1);
            } else {
                if (id == R.id.at8) {
                    if (this.f15806y) {
                        str = "https://hotsoon.snssdk.com/falcon/live_inroom/page/guard_list/index.html?room_id=%s&anchor_id=%s&user_id=%s&source=%s&is_first_consume=%s";
                    } else {
                        str = "https://hotsoon.snssdk.com/falcon/live_inroom/page/guard/index.html?room_id=%s&anchor_id=%s&user_id=%s&source=%s&is_first_consume=%s";
                    }
                    m17196b(str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -774172322) {
                if (hashCode == 1433895618 && key.equals("cmd_send_gift")) {
                    c = 0;
                }
            } else if (key.equals("cmd_dismiss_dialog_end")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    m17202i();
                    return;
                case 1:
                    if (isViewValid() && this.f15802u != null) {
                        this.f15802u.dismiss();
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo13706a(int i) {
        if (this.f15775B) {
            C9738o.m28712b(this.f15784c, 8);
        } else {
            C9738o.m28712b(this.f15784c, i);
        }
    }

    public void onInit(Object... objArr) {
        this.f15783b = this.contentView.findViewById(R.id.a5z);
        this.f15784c = this.contentView.findViewById(R.id.a5y);
        this.f15785d = (TextView) this.contentView.findViewById(R.id.a5x);
        this.f15786e = this.contentView.findViewById(R.id.buw);
        this.f15787f = (TextView) this.contentView.findViewById(R.id.buv);
        this.f15788g = this.contentView.findViewById(R.id.a61);
        this.f15800s = (TextView) this.contentView.findViewById(R.id.a60);
        this.f15782a = this.contentView.findViewById(R.id.a5w);
        this.f15784c.setOnClickListener(this);
        this.f15786e.setOnClickListener(this);
        this.f15799r = (TextView) this.contentView.findViewById(R.id.at8);
        m17198d();
        if (C9290a.f25466a) {
            this.f15799r.setVisibility(8);
            Drawable[] compoundDrawables = this.f15785d.getCompoundDrawables();
            if (compoundDrawables != null && compoundDrawables.length > 0 && VERSION.SDK_INT >= 19) {
                for (Drawable drawable : compoundDrawables) {
                    if (drawable != null) {
                        drawable.setAutoMirrored(true);
                    }
                }
            }
        }
        this.f15799r.setOnClickListener(this);
    }

    public void onLoad(Object... objArr) {
        this.f15805x = (Room) this.dataCenter.get("data_room");
        this.f15806y = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f15807z = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f15804w = new C5025j();
        this.f15804w.f14293a = this.f15805x.getOwner().getId();
        this.f15804w.f14294b = this.f15805x.getId();
        this.f15804w.mo9142a((C5026a) this);
        this.dataCenter.observe("cmd_send_gift", this);
        this.dataCenter.observe("cmd_dismiss_dialog_end", this);
        this.f15780G.mo119661a(C9097a.m27146a().mo22266a(C4430av.class).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C7326g<C4430av>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C4430av avVar) throws Exception {
                DailyRankWidget.this.onEvent(avVar);
            }
        }));
        this.f15780G.mo119661a(C9097a.m27146a().mo22266a(C8819c.class).mo19325f((C7326g<? super T>) new C5756y<Object>(this)));
        m17199f();
        if (this.f15774A && !this.f15806y) {
            this.f15804w.mo13044d();
        }
        mo13710b();
        LiveSettingKeys.AWEME_HOUR_RANK_ENTRANCE_STYLE.mo10240a();
    }

    /* renamed from: b */
    private void m17196b(String str) {
        int i;
        int i2;
        if (this.f15774A) {
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.context, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f67)).mo22192c("guard").mo22188a(0).mo22190a()).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19189a((C7498y<? super T>) new C8986g<Object>());
            } else if (!TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.GUARD)) {
                String a = C1642a.m8035a(Locale.US, str, new Object[]{Long.valueOf(this.f15805x.getId()), Long.valueOf(this.f15805x.getOwner().getId()), Long.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b()), "", String.valueOf(C9281a.m27615a(TTLiveSDKContext.getHostService().mo22367h().mo22165a()))});
                float f = this.context.getResources().getDisplayMetrics().density;
                boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
                if (booleanValue) {
                    i = (int) (((float) this.context.getResources().getDisplayMetrics().widthPixels) / f);
                } else {
                    i = (int) (((float) this.context.getResources().getDisplayMetrics().heightPixels) / f);
                }
                int i3 = i;
                C9097a a2 = C9097a.m27146a();
                String str2 = "guard";
                if (booleanValue) {
                    i2 = 80;
                } else {
                    i2 = 5;
                }
                C4414af afVar = new C4414af(a, str2, i2, i3, i3, 0, 0);
                a2.mo22267a((Object) afVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo13045a(C4914l lVar) {
        C4916m mVar;
        if (isViewValid() && lVar != null && this.f15774A && lVar.f14048c != 0) {
            Map map = (Map) C8946b.f24423av.mo22117a();
            try {
                mVar = (C4916m) C2317a.m9932a().mo15974a((String) map.get(Long.valueOf(this.f15805x.getOwnerUserId())), C4916m.class);
            } catch (Exception e) {
                C3166a.m11966e("DailyRankWidget", e.toString());
                mVar = null;
            }
            if (mVar == null) {
                mVar = new C4916m();
            }
            if (lVar.f14048c == 1) {
                if (!mVar.f14053a && (lVar.f14050e.f14051a * 1000) - System.currentTimeMillis() < 604800000) {
                    int d = C9048ao.m27021d((lVar.f14050e.f14051a * 1000) - System.currentTimeMillis());
                    if (d >= 0) {
                        m17193a(C3358ac.m12517a((int) R.string.etb, Integer.valueOf(d)));
                        mVar.f14053a = true;
                        map.put(Long.valueOf(this.f15805x.getOwnerUserId()), C2317a.m9932a().mo15979b((Object) mVar));
                    }
                } else if ((lVar.f14050e.f14051a * 1000) - System.currentTimeMillis() > 604800000) {
                    mVar.mo12895a();
                    map.put(Long.valueOf(this.f15805x.getOwnerUserId()), C2317a.m9932a().mo15979b((Object) mVar));
                }
            } else if (lVar.f14048c == 2) {
                int i = mVar.f14055c;
                if (i < 3 && System.currentTimeMillis() - mVar.f14054b > 604800000) {
                    m17193a(C3358ac.m12517a((int) R.string.etc, Long.valueOf(lVar.f14049d), Long.valueOf(lVar.f14047b), lVar.mo12894a()));
                    mVar.f14054b = System.currentTimeMillis();
                    mVar.f14055c = i + 1;
                    map.put(Long.valueOf(this.f15805x.getOwnerUserId()), C2317a.m9932a().mo15979b((Object) mVar));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13046a(final C8691v vVar) {
        boolean z;
        boolean z2;
        final Spannable spannable;
        CharSequence charSequence;
        if (isViewValid() && vVar != null) {
            if (!TextUtils.isEmpty(vVar.f23690l)) {
                this.f15778E = vVar.f23690l;
            }
            C9483j jVar = (C9483j) LiveSettingKeys.AWEME_HOUR_RANK_ENTRANCE_STYLE.mo10240a();
            if (jVar == null || (jVar.f25963a == 0 && vVar.f23689k == 0)) {
                z = true;
            } else {
                z = false;
            }
            if (jVar == null || jVar.f25963a <= 0 || vVar.f23689k != 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            int i = vVar.f23684f;
            if (i != 6) {
                switch (i) {
                    case 1:
                        break;
                    case 2:
                    case 3:
                        PlatformMessageHelper.INSTANCE.add(vVar);
                        break;
                }
            }
            if (vVar.baseMessage != null && !this.f15789h) {
                if (z || z2) {
                    String str = vVar.f23691m;
                    if (z2) {
                        str = "2";
                    }
                    if (TextUtils.equals(str, "1")) {
                        if ((!TextUtils.isEmpty(vVar.f23679a) || vVar.supportDisplayText()) && vVar.f23683e > 0) {
                            if (vVar.f23682d != null) {
                                spannable = C4374z.m14749a(vVar.f23682d, vVar.f23680b);
                            } else {
                                spannable = new SpannableString(vVar.f23680b);
                            }
                            if (vVar.supportDisplayText()) {
                                charSequence = C4374z.m14749a(vVar.baseMessage.f26000j, vVar.f23679a);
                            } else {
                                charSequence = new SpannableString(vVar.f23679a);
                            }
                            if (!TextUtils.equals(spannable, C4374z.f12668a)) {
                                this.f15793l = spannable;
                            }
                            if (m17201h()) {
                                this.f15790i.mo13727b(charSequence);
                                this.f15790i.mo13723a((long) vVar.f23683e);
                                mo13707a(vVar.f23687i, this.f15792k, false);
                                return;
                            }
                            this.f15789h = true;
                            this.f15783b.setVisibility(8);
                            mo13712c();
                            this.f15800s.setText(charSequence);
                            ViewTreeObserver viewTreeObserver = this.f15788g.getViewTreeObserver();
                            C5400a aVar = new C5400a(this.f15782a.getWidth(), this.f15782a.getHeight(), this.f15788g, this.f15782a, true, null);
                            viewTreeObserver.addOnGlobalLayoutListener(aVar);
                            this.f15788g.setVisibility(0);
                            this.f15788g.postDelayed(new Runnable() {
                                public final void run() {
                                    if (DailyRankWidget.this.isViewValid()) {
                                        if (!TextUtils.equals(spannable, C4374z.f12668a)) {
                                            DailyRankWidget.this.f15793l = spannable;
                                            DailyRankWidget.this.mo13707a(vVar.f23687i, DailyRankWidget.this.f15792k, false);
                                        }
                                        DailyRankWidget.this.f15788g.setVisibility(8);
                                        ViewTreeObserver viewTreeObserver = DailyRankWidget.this.f15783b.getViewTreeObserver();
                                        C5400a aVar = new C5400a(DailyRankWidget.this.f15782a.getWidth(), DailyRankWidget.this.f15782a.getHeight(), DailyRankWidget.this.f15783b, DailyRankWidget.this.f15782a, false, new Runnable() {
                                            public final void run() {
                                                DailyRankWidget.this.mo13710b();
                                            }
                                        });
                                        viewTreeObserver.addOnGlobalLayoutListener(aVar);
                                        DailyRankWidget.this.f15783b.setVisibility(0);
                                        DailyRankWidget.this.f15789h = false;
                                    }
                                }
                            }, (long) (vVar.f23683e * 1000));
                            this.f15788g.setOnClickListener(new C5757z(this, vVar));
                            try {
                                new JSONObject().put("trace_id", vVar.f23686h);
                                C8448g.m25682a(this.context);
                            } catch (JSONException unused) {
                            }
                        }
                    } else if (TextUtils.equals(str, "2")) {
                        CharSequence charSequence2 = C4374z.f12668a;
                        if (vVar.supportDisplayText()) {
                            charSequence2 = C4374z.m14749a(vVar.baseMessage.f26000j, vVar.f23679a);
                        } else if (!TextUtils.isEmpty(vVar.f23679a)) {
                            charSequence2 = new SpannableString(vVar.f23679a);
                        }
                        if (!TextUtils.equals(charSequence2, C4374z.f12668a)) {
                            this.f15790i.mo13727b((CharSequence) null);
                            this.f15788g.setVisibility(8);
                            this.f15793l = charSequence2;
                            mo13707a(vVar.f23687i, this.f15792k, false);
                        }
                    }
                    if (!z2) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13711b(DialogInterface dialogInterface, int i) {
        m17196b("https://hotsoon.snssdk.com/falcon/live_inroom/page/guard/index.html?charge=1&room_id=%s&anchor_id=%s&user_id=%s&source=%s");
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13708a(C8691v vVar, View view) {
        this.f15804w.mo13043b();
        m17195b(0);
        try {
            new JSONObject().put("trace_id", vVar.f23686h);
            C8448g.m25682a(this.context);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo13707a(int i, int i2, boolean z) {
        this.f15784c.setVisibility(0);
        this.f15785d.setText(this.f15793l);
    }
}
