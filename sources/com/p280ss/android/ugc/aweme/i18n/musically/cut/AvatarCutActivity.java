package com.p280ss.android.ugc.aweme.i18n.musically.cut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.p482io.C9734a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1306a.C30529a;
import com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1308ui.C30536a;
import com.p280ss.android.ugc.aweme.profile.C36107z;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36011ai;
import com.p280ss.android.ugc.aweme.profile.presenter.C36046t;
import com.p280ss.android.ugc.aweme.qrcode.view.C37121a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p280ss.android.ugc.aweme.shortvideo.adapter.RecycleViewAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.vesdk.VEUtils;
import com.p280ss.android.vesdk.VEUtils.C45234a;
import com.p280ss.android.vesdk.VEUtils.C45235b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity */
public class AvatarCutActivity extends AmeActivity implements OnClickListener, OnTouchListener, C30536a, C36046t, C45234a {

    /* renamed from: w */
    private static final String f80113w = AvatarCutActivity.class.getCanonicalName();

    /* renamed from: A */
    private int f80114A;

    /* renamed from: B */
    private int f80115B;

    /* renamed from: C */
    private int f80116C;

    /* renamed from: D */
    private C30529a f80117D;

    /* renamed from: E */
    private ImmersionBar f80118E;

    /* renamed from: F */
    private RecyclerView f80119F;

    /* renamed from: G */
    private FrameLayout f80120G;

    /* renamed from: H */
    private int f80121H;

    /* renamed from: I */
    private TextView f80122I;

    /* renamed from: J */
    private int f80123J;

    /* renamed from: K */
    private TextView f80124K;

    /* renamed from: L */
    private TextView f80125L;

    /* renamed from: M */
    private int f80126M;

    /* renamed from: N */
    private float f80127N;

    /* renamed from: O */
    private int f80128O;

    /* renamed from: P */
    private C36011ai f80129P;

    /* renamed from: Q */
    private C37121a f80130Q;

    /* renamed from: R */
    private C36107z f80131R;

    /* renamed from: S */
    private float f80132S;

    /* renamed from: T */
    private float f80133T;

    /* renamed from: a */
    public MediaPlayer f80134a;

    /* renamed from: b */
    public TextureView f80135b;

    /* renamed from: c */
    public RelativeLayout f80136c;

    /* renamed from: d */
    public String f80137d;

    /* renamed from: e */
    public int f80138e;

    /* renamed from: f */
    public ImageView f80139f;

    /* renamed from: g */
    public ImageView f80140g;

    /* renamed from: h */
    public int f80141h;

    /* renamed from: i */
    public int f80142i;

    /* renamed from: j */
    public int f80143j;

    /* renamed from: k */
    protected C41654d f80144k;

    /* renamed from: l */
    public View f80145l;

    /* renamed from: m */
    public View f80146m;
    View mStatusBarView;
    FrameLayout mSurfaceViewWrapper;

    /* renamed from: n */
    public Runnable f80147n;

    /* renamed from: o */
    protected String f80148o;

    /* renamed from: p */
    public boolean f80149p;

    /* renamed from: q */
    public volatile boolean f80150q;

    /* renamed from: r */
    public Thread f80151r;

    /* renamed from: s */
    public long f80152s = -1;

    /* renamed from: t */
    public int f80153t;

    /* renamed from: u */
    public Runnable f80154u = new Runnable() {
        public final void run() {
            if (AvatarCutActivity.this.f80151r != null) {
                try {
                    AvatarCutActivity.this.f80151r.join();
                } catch (InterruptedException unused) {
                }
            }
            if (AvatarCutActivity.this.isActive()) {
                if (AvatarCutActivity.this.f80152s > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - AvatarCutActivity.this.f80152s;
                    C6877n.m21446a("aweme_movie_publish", "crop_time", (float) currentTimeMillis);
                    if (!TextUtils.isEmpty(AvatarCutActivity.this.f80148o)) {
                        new File(AvatarCutActivity.this.f80148o);
                        if (currentTimeMillis <= 0) {
                            return;
                        }
                    }
                    AvatarCutActivity.this.f80152s = -1;
                }
                AvatarCutActivity.this.mo80184c();
            }
        }
    };

    /* renamed from: v */
    public int f80155v = 0;

    /* renamed from: x */
    private int f80156x;

    /* renamed from: y */
    private int f80157y;

    /* renamed from: z */
    private int f80158z;

    /* renamed from: m */
    private float m99607m() {
        return 1.2f;
    }

    /* renamed from: a */
    public final void mo61679a(AvatarUri avatarUri) {
    }

    /* renamed from: a */
    public final void mo66086a(User user, int i) {
    }

    /* renamed from: a */
    public final void mo61680a(Exception exc) {
    }

    /* renamed from: a */
    public final void mo66087a(Exception exc, int i) {
    }

    /* renamed from: a */
    public final void mo61681a(String str) {
    }

    /* renamed from: a */
    public final void mo66088a(String str, boolean z) {
    }

    /* renamed from: b */
    public final void mo80183b(String str) {
    }

    /* renamed from: c */
    public final void mo80184c() {
        m99604j();
    }

    /* renamed from: e */
    public final void mo80186e() {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo66089a(boolean z) {
        if (z) {
            m99614t();
        }
    }

    public void onBackPressed() {
        this.f80124K.performClick();
    }

    public void onStop() {
        super.onStop();
        mo80180b();
    }

    /* renamed from: n */
    private float m99608n() {
        return (3.0f / m99607m()) * ((float) this.f80126M);
    }

    /* renamed from: o */
    private float m99609o() {
        return (6.0f / m99607m()) * ((float) this.f80126M);
    }

    /* renamed from: d */
    public final void mo80185d() {
        m99605k();
        mo80177a();
    }

    /* renamed from: j */
    private void m99604j() {
        this.f80144k.dismiss();
        m99613s();
        this.f80117D.mo80251b(this.f80148o);
        this.f80117D.mo80253d();
    }

    /* renamed from: p */
    private static boolean m99610p() {
        return ((Boolean) SharePrefCache.inst().getLongVideoPermitted().mo59877d()).booleanValue();
    }

    /* renamed from: r */
    private void m99612r() {
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = C10994a.m32204a((Context) this);
        }
    }

    /* renamed from: u */
    private void m99615u() {
        if (this.f80130Q != null && this.f80130Q.isShowing()) {
            this.f80130Q.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo80180b() {
        if (this.f80134a != null) {
            if (this.f80134a.isPlaying()) {
                this.f80134a.stop();
            }
            this.f80134a.release();
            this.f80134a = null;
        }
    }

    public void onDestroy() {
        if (this.f80118E != null) {
            this.f80118E.destroy();
        }
        try {
            this.f80151r.join();
        } catch (Exception unused) {
        }
        super.onDestroy();
        this.f80136c.removeCallbacks(this.f80147n);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onResume", true);
        super.onResume();
        if (this.f80149p) {
            C6726a.m20844b(this.f80154u);
            this.f80149p = false;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        this.f80118E = ImmersionBar.with((Activity) this);
        if (getContentResolver() != null) {
            this.f80118E.init();
        }
        C23487o.m77155c((Activity) this);
    }

    /* renamed from: g */
    private void m99601g() {
        this.f80117D = new C30529a();
        this.f80117D.f94183c = this;
        this.f80117D.mo80246a((Activity) this, (Fragment) null);
        this.f80129P = new C36011ai();
        this.f80131R = new C36107z();
        this.f80129P.f94200a = this;
    }

    /* renamed from: i */
    private void m99603i() {
        C9738o.m28709b((Context) this);
        int a = C9738o.m28691a((Context) this);
        LayoutParams layoutParams = this.mSurfaceViewWrapper.getLayoutParams();
        layoutParams.height = a;
        layoutParams.width = a;
        this.mSurfaceViewWrapper.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f80135b.getLayoutParams();
        double d = (double) a;
        Double.isNaN(d);
        double d2 = d * 1.0d;
        double d3 = (double) this.f80157y;
        Double.isNaN(d3);
        double d4 = d2 * d3;
        double d5 = (double) this.f80156x;
        Double.isNaN(d5);
        layoutParams2.height = (int) (d4 / d5);
        this.f80135b.setLayoutParams(layoutParams2);
    }

    /* renamed from: l */
    private void m99606l() {
        this.f80124K = (TextView) findViewById(R.id.jn);
        this.f80124K.setOnClickListener(this);
        this.f80125L = (TextView) findViewById(R.id.c44);
        this.f80125L.setOnClickListener(this);
    }

    /* renamed from: s */
    private void m99613s() {
        if (this.f80130Q == null) {
            this.f80130Q = C37121a.m119327a(this, getString(R.string.fpg));
            this.f80130Q.setIndeterminate(false);
            this.f80130Q.mo93591a(getResources().getDrawable(R.drawable.un));
            return;
        }
        if (!this.f80130Q.isShowing()) {
            this.f80130Q.show();
            this.f80130Q.mo93590a();
        }
    }

    /* renamed from: t */
    private void m99614t() {
        if (this.f80130Q != null && this.f80130Q.isShowing()) {
            this.f80130Q.setMessage(getString(R.string.fow));
            this.f80130Q.mo93592b();
            new Handler().postDelayed(new C30513a(this), 500);
        }
    }

    /* renamed from: a */
    public final void mo80177a() {
        if (this.f80134a != null) {
            if (this.f80134a.isPlaying()) {
                this.f80134a.pause();
            }
            if (this.f80147n != null) {
                this.f80136c.removeCallbacks(this.f80147n);
            }
            this.f80147n = new Runnable() {
                public final void run() {
                    if (AvatarCutActivity.this.f80134a != null) {
                        if (AvatarCutActivity.this.f80134a.isPlaying()) {
                            AvatarCutActivity.this.f80134a.pause();
                        }
                        AvatarCutActivity.this.f80147n = null;
                        AvatarCutActivity.this.mo80177a();
                    }
                }
            };
            this.f80134a.seekTo(this.f80141h);
            this.f80136c.postDelayed(this.f80147n, (long) this.f80142i);
            this.f80134a.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo80187f() {
        m99615u();
        Intent intent = new Intent();
        intent.putExtra("mp4", this.f80148o);
        intent.putExtra("dir", ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().shortVideoRootDir());
        setResult(-1, intent);
        finish();
    }

    /* renamed from: q */
    private void m99611q() {
        float f;
        final float f2 = 1.0f;
        if (this.f80153t % NormalGiftView.ALPHA_180 == 0) {
            f = (((float) this.f80156x) * 1.0f) / ((float) this.f80157y);
        } else {
            f2 = (((float) this.f80156x) * 1.0f) / ((float) this.f80157y);
            f = 1.0f;
        }
        final float f3 = f - f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                AvatarCutActivity.this.f80135b.setRotation(((float) AvatarCutActivity.this.f80153t) + (90.0f * animatedFraction));
                AvatarCutActivity.this.f80135b.setScaleX(f2 + (f3 * animatedFraction));
                AvatarCutActivity.this.f80135b.setScaleY(f2 + (f3 * animatedFraction));
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AvatarCutActivity.this.f80153t += 90;
                if (AvatarCutActivity.this.f80153t >= 360) {
                    AvatarCutActivity.this.f80153t = 0;
                }
            }
        });
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    /* renamed from: k */
    private void m99605k() {
        int i;
        if (((int) this.f80140g.getX()) == this.f80123J && ((int) this.f80139f.getX()) == this.f80143j - this.f80138e && this.f80158z <= 6000) {
            i = this.f80158z;
        } else {
            i = (int) ((((this.f80140g.getX() - this.f80139f.getX()) - ((float) this.f80138e)) / ((float) this.f80126M)) * m99607m() * 1000.0f);
        }
        if (i >= 2500) {
            int x = (int) (((((float) this.f80155v) + this.f80139f.getX()) + ((float) this.f80138e)) - ((float) this.f80143j));
            if (x < 0) {
                x = 0;
            }
            double d = (double) this.f80127N;
            Double.isNaN(d);
            double d2 = d * 1000.0d;
            double d3 = (double) x;
            Double.isNaN(d3);
            double d4 = d2 * d3;
            double d5 = (double) this.f80121H;
            Double.isNaN(d5);
            int i2 = (int) (d4 / d5);
            if (i < 3000) {
                i = 3000;
            }
            if (i > this.f80158z) {
                i = this.f80158z;
            }
            if (i + i2 > this.f80158z) {
                i2 = this.f80158z - i;
            }
            this.f80142i = i;
            m99597b(this.f80142i);
            this.f80141h = i2;
        }
    }

    /* renamed from: h */
    private void m99602h() {
        this.f80140g = new ImageView(this);
        this.f80140g.setPadding(0, 0, this.f80128O, 0);
        this.f80140g.setScaleType(ScaleType.FIT_XY);
        this.f80136c.addView(this.f80140g);
        this.f80140g.setImageResource(R.drawable.b70);
        int b = (int) (((float) this.f80126M) + C9738o.m28708b((Context) this, 4.0f));
        double d = (double) b;
        Double.isNaN(d);
        this.f80138e = (int) ((d * 3.0d) / 26.0d);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f80138e + this.f80128O, b);
        layoutParams.topMargin = (int) C9738o.m28708b((Context) this, 5.0f);
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        int i = 5;
        if (this.f80116C < 5) {
            i = this.f80116C;
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        double d3 = d2 * 1.0d;
        double d4 = (double) this.f80126M;
        Double.isNaN(d4);
        double d5 = d3 * d4;
        double d6 = (double) this.f80143j;
        Double.isNaN(d6);
        layoutParams.leftMargin = (int) (d5 + d6);
        if (((float) this.f80142i) < this.f80127N * 5.0f * 1000.0f) {
            layoutParams.leftMargin -= (int) Math.ceil((double) ((((this.f80127N * 1000.0f) - ((float) Math.round(((float) this.f80142i) % (this.f80127N * 1000.0f)))) / (this.f80127N * 1000.0f)) * ((float) layoutParams.height)));
        }
        this.f80123J = layoutParams.leftMargin;
        if (m99610p() && this.f80142i >= 6000) {
            layoutParams.leftMargin = Math.round(((((float) this.f80126M) * 1.0f) / m99607m()) * 6.0f) + this.f80143j;
        }
        this.f80140g.setLayoutParams(layoutParams);
        this.f80140g.setTag("right");
        this.f80139f = new ImageView(this);
        this.f80139f.setPadding(this.f80128O, 0, 0, 0);
        this.f80139f.setScaleType(ScaleType.FIT_XY);
        this.f80136c.addView(this.f80139f);
        this.f80139f.setImageResource(R.drawable.b70);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f80138e + this.f80128O, b);
        layoutParams2.addRule(10);
        layoutParams2.addRule(9);
        layoutParams2.topMargin = (int) C9738o.m28708b((Context) this, 5.0f);
        layoutParams2.leftMargin = this.f80143j - this.f80138e;
        this.f80139f.setLayoutParams(layoutParams2);
        this.f80139f.setOnTouchListener(this);
        this.f80140g.setOnTouchListener(this);
        this.f80139f.setTag("left");
        this.f80119F.post(new Runnable() {
            public final void run() {
                AvatarCutActivity.this.f80145l = new View(AvatarCutActivity.this);
                AvatarCutActivity.this.f80146m = new View(AvatarCutActivity.this);
                AvatarCutActivity.this.f80136c.addView(AvatarCutActivity.this.f80145l);
                AvatarCutActivity.this.f80136c.addView(AvatarCutActivity.this.f80146m);
                AvatarCutActivity.this.f80145l.setBackgroundColor(AvatarCutActivity.this.getResources().getColor(R.color.a79));
                AvatarCutActivity.this.f80146m.setBackgroundColor(AvatarCutActivity.this.getResources().getColor(R.color.a79));
                AvatarCutActivity.this.mo80179a(AvatarCutActivity.this.f80143j - AvatarCutActivity.this.f80138e, (int) ((AvatarCutActivity.this.f80140g.getX() - AvatarCutActivity.this.f80139f.getX()) + ((float) AvatarCutActivity.this.f80140g.getWidth())));
            }
        });
    }

    /* renamed from: d */
    private float m99600d(int i) {
        return C9738o.m28708b((Context) this, (float) i);
    }

    /* renamed from: b */
    public final void mo80182b(Exception exc) {
        m99615u();
        C6921a.m21554a(exc);
    }

    /* renamed from: c */
    private int m99599c(int i) {
        int round = Math.round(this.f80127N * 1000.0f);
        return ((i + round) - 1) / round;
    }

    /* renamed from: a */
    public final void mo80178a(final int i) {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                if (AvatarCutActivity.this.isViewValid() && AvatarCutActivity.this.f80144k != null && AvatarCutActivity.this.f80144k.isShowing()) {
                    AvatarCutActivity.this.f80144k.setProgress(i);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo80181b(AvatarUri avatarUri) {
        this.f80131R.mo91867a(avatarUri.uri);
        this.f80129P.mo91643a(this.f80131R.mo91866a());
    }

    /* renamed from: b */
    private void m99597b(int i) {
        int i2;
        if (((float) i) <= this.f80127N * 5.0f * 1000.0f) {
            double d = (double) i;
            Double.isNaN(d);
            i2 = (int) Math.round(d / 1000.0d);
        } else {
            i2 = (int) (this.f80127N * 5.0f);
        }
        if (i2 < 3) {
            i2 = 3;
        }
        if (((float) i2) > this.f80127N * 5.0f) {
            i2 = Math.round(this.f80127N * 5.0f);
        }
        this.f80122I.setText(getResources().getString(R.string.a3w, new Object[]{Integer.valueOf(i2)}));
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == this.f80124K.getId()) {
            finish();
        } else if (view.getId() == this.f80125L.getId()) {
            this.f80136c.removeCallbacks(this.f80147n);
            this.f80147n = null;
            try {
                if (this.f80134a.isPlaying()) {
                    this.f80134a.pause();
                }
            } catch (Exception unused) {
            }
            this.f80152s = System.currentTimeMillis();
            this.f80144k = C41654d.m132586b(this, getResources().getString(R.string.dtv));
            this.f80144k.setIndeterminate(false);
            m99605k();
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
                    AvatarCutActivity avatarCutActivity = AvatarCutActivity.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append(shortVideoConfig.cacheDir());
                    sb.append(UUID.randomUUID());
                    sb.append(".webp");
                    avatarCutActivity.f80148o = sb.toString();
                    C9734a.m28684b(shortVideoConfig.shortVideoRootDir());
                    C9734a.m28684b(shortVideoConfig.cacheDir());
                    C9734a.m28684b(shortVideoConfig.tempDir());
                    C45235b bVar = new C45235b();
                    bVar.f116389a = AvatarCutActivity.this.f80137d;
                    bVar.f116390b = AvatarCutActivity.this.f80148o;
                    bVar.f116400l = AvatarCutActivity.this.f80141h;
                    bVar.f116400l = AvatarCutActivity.this.f80141h;
                    bVar.f116401m = AvatarCutActivity.this.f80142i;
                    bVar.f116396h = -1;
                    bVar.f116397i = 240;
                    bVar.f116395g = 10;
                    int convertVideo2Webp = VEUtils.convertVideo2Webp(bVar, AvatarCutActivity.this);
                    FFMpegManager.m64569a().mo51832c();
                    C6726a.m20844b(AvatarCutActivity.this.f80154u);
                    if (convertVideo2Webp != 0) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("errorCode", convertVideo2Webp);
                        } catch (JSONException unused) {
                        }
                        C6877n.m21444a("aweme_video_clip_success_rate", 1, jSONObject);
                    } else {
                        C6877n.m21444a("aweme_video_clip_success_rate", 0, (JSONObject) null);
                    }
                    AvatarCutActivity.this.f80149p = true;
                    AvatarCutActivity.this.f80150q = true;
                }
            });
        } else {
            if (view.getId() == R.id.cwv) {
                m99611q();
            }
        }
    }

    /* renamed from: a */
    private void m99595a(MotionEvent motionEvent) {
        float rawX = this.f80133T + (motionEvent.getRawX() - this.f80132S);
        if (rawX > ((float) this.f80123J)) {
            rawX = (float) this.f80123J;
        }
        if ((rawX - this.f80139f.getX()) - ((float) this.f80138e) < m99608n()) {
            rawX = ((float) this.f80138e) + this.f80139f.getX() + m99608n();
        } else if ((rawX - this.f80139f.getX()) - ((float) this.f80138e) > m99609o()) {
            rawX = ((float) this.f80138e) + this.f80139f.getX() + m99609o();
        }
        this.f80140g.animate().x(rawX).y(this.f80140g.getY()).setDuration(0).start();
        mo80179a((int) this.f80139f.getX(), (int) ((rawX - this.f80139f.getX()) + ((float) this.f80139f.getWidth())));
    }

    /* renamed from: b */
    private void m99598b(MotionEvent motionEvent) {
        float rawX = this.f80133T + (motionEvent.getRawX() - this.f80132S);
        if ((this.f80140g.getX() - rawX) - ((float) this.f80138e) < m99608n()) {
            rawX = (this.f80140g.getX() - ((float) this.f80138e)) - m99608n();
        } else if ((this.f80140g.getX() - rawX) - ((float) this.f80138e) > m99609o()) {
            rawX = (this.f80140g.getX() - ((float) this.f80138e)) - m99609o();
        }
        if (rawX < ((float) (this.f80143j - this.f80138e))) {
            rawX = (float) (this.f80143j - this.f80138e);
        }
        this.f80139f.animate().x(rawX).y(this.f80139f.getY()).setDuration(0).start();
        mo80179a((int) rawX, (int) ((this.f80140g.getX() - rawX) + ((float) this.f80139f.getWidth())));
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b7);
        m99612r();
        this.f80126M = C9738o.m28691a((Context) this) / 6;
        this.f80128O = (int) C9738o.m28708b((Context) this, 2.0f);
        this.f80137d = getIntent().getStringExtra("file_path");
        this.f80136c = (RelativeLayout) findViewById(R.id.nk);
        this.f80119F = (RecyclerView) findViewById(R.id.cqd);
        this.f80122I = (TextView) findViewById(R.id.e3_);
        this.f80120G = (FrameLayout) findViewById(R.id.cwv);
        this.f80135b = (TextureView) findViewById(R.id.ddp);
        this.f80135b.setSurfaceTextureListener(new SurfaceTextureListener() {
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                AvatarCutActivity.this.mo80180b();
                return true;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Uri parse = Uri.parse(AvatarCutActivity.this.f80137d);
                AvatarCutActivity.this.f80134a = MediaPlayer.create(AvatarCutActivity.this, parse);
                if (AvatarCutActivity.this.f80134a == null) {
                    C10761a.m31399c((Context) AvatarCutActivity.this, (int) R.string.cus).mo25750a();
                    AvatarCutActivity.this.finish();
                    return;
                }
                AvatarCutActivity.this.f80134a.setAudioStreamType(3);
                AvatarCutActivity.this.f80134a.setSurface(new Surface(surfaceTexture));
                AvatarCutActivity.this.f80134a.start();
                AvatarCutActivity.this.f80134a.setOnCompletionListener(new OnCompletionListener() {
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        AvatarCutActivity.this.mo80177a();
                    }
                });
                AvatarCutActivity.this.f80134a.setOnErrorListener(new OnErrorListener() {
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        if (AvatarCutActivity.this.f80134a != null) {
                            AvatarCutActivity.this.f80134a.release();
                            AvatarCutActivity.this.f80134a = null;
                        }
                        return false;
                    }
                });
            }
        });
        int[] a = FFMpegManager.m64569a().mo51828a(this.f80137d);
        if (a[0] == 0) {
            this.f80158z = a[1];
            this.f80142i = this.f80158z;
            this.f80156x = a[2];
            this.f80157y = a[3];
            this.f80127N = m99607m();
            this.f80116C = m99599c(this.f80158z);
            this.f80114A = a[4];
            this.f80115B = a[5];
            m99596a(this.f80137d, this.f80116C, this.f80114A, this.f80115B);
            m99603i();
            m99606l();
            m99602h();
            m99601g();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", false);
            return;
        }
        C10761a.m31399c((Context) this, (int) R.string.csd).mo25750a();
        FFMpegManager.m64569a().mo51829b();
        finish();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity", "onCreate", false);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str = (String) view.getTag();
        if (str == null) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f80132S = motionEvent.getRawX();
                if (!str.equals("left")) {
                    this.f80133T = this.f80140g.getX();
                    break;
                } else {
                    this.f80133T = this.f80139f.getX();
                    break;
                }
            case 1:
                mo80185d();
                break;
            case 2:
                if (str.equals("left")) {
                    m99598b(motionEvent);
                } else {
                    m99595a(motionEvent);
                }
                m99605k();
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo80179a(int i, int i2) {
        int i3 = i + this.f80128O;
        int i4 = i2 - (this.f80128O * 2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, (int) m99600d(2));
        layoutParams.addRule(10);
        layoutParams.addRule(9);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = (int) m99600d(5);
        this.f80145l.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, (int) m99600d(2));
        layoutParams2.addRule(10);
        layoutParams2.addRule(9);
        layoutParams2.leftMargin = i3;
        layoutParams2.topMargin = ((int) m99600d(7)) + this.f80121H;
        this.f80146m.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    private void m99596a(String str, int i, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f80119F.getLayoutParams();
        layoutParams.width = C9738o.m28691a((Context) this);
        this.f80143j = this.f80126M >> 1;
        layoutParams.leftMargin = 0;
        this.f80121H = this.f80126M;
        layoutParams.height = this.f80121H;
        this.f80119F.setLayoutParams(layoutParams);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this, 0, false);
        this.f80119F.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    AvatarCutActivity.this.mo80185d();
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                AvatarCutActivity.this.f80155v += i;
            }
        });
        this.f80119F.setLayoutManager(wrapLinearLayoutManager);
        RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(this, this.f80121H, this.f80142i, m99607m(), this.f80138e, str, i2, i3, this.f80116C);
        this.f80119F.setAdapter(recycleViewAdapter);
        this.f80119F.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                AvatarCutActivity.this.f80155v += i;
                AvatarCutActivity.this.mo80185d();
            }
        });
    }
}
