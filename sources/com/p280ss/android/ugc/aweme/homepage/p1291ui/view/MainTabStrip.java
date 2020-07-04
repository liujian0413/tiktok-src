package com.p280ss.android.ugc.aweme.homepage.p1291ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.p308ui.FlippableViewPager;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.feed.event.C28334q;
import com.p280ss.android.ugc.aweme.feed.event.C28335r;
import com.p280ss.android.ugc.aweme.feed.event.C28340w;
import com.p280ss.android.ugc.aweme.homepage.experiment.FollowDotColorExperiment;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.task.SaveTabJobTask;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.login.p1371a.C32646b;
import com.p280ss.android.ugc.aweme.main.experiment.C33002a;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import com.p280ss.android.ugc.aweme.main.experiment.JumpToFollowTabExperiment;
import com.p280ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42970bd;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.MainTabStrip */
public class MainTabStrip extends LinearLayout {

    /* renamed from: a */
    public AnimatorSet f79679a;

    /* renamed from: b */
    TextView f79680b;

    /* renamed from: c */
    TextView f79681c;

    /* renamed from: d */
    TextView f79682d;

    /* renamed from: e */
    View f79683e;

    /* renamed from: f */
    View f79684f;

    /* renamed from: g */
    public boolean f79685g;

    /* renamed from: h */
    public boolean f79686h;

    /* renamed from: i */
    public View f79687i;

    /* renamed from: j */
    private FlippableViewPager f79688j;

    /* renamed from: k */
    private C30311b f79689k;

    /* renamed from: l */
    private Context f79690l;

    /* renamed from: m */
    private int f79691m;

    /* renamed from: n */
    private Paint f79692n;

    /* renamed from: o */
    private int f79693o;

    /* renamed from: p */
    private int f79694p;

    /* renamed from: q */
    private int f79695q;

    /* renamed from: r */
    private int f79696r;

    /* renamed from: s */
    private TextView[] f79697s;

    /* renamed from: t */
    private boolean[] f79698t;

    /* renamed from: u */
    private boolean f79699u;

    /* renamed from: v */
    private Rect f79700v;

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.MainTabStrip$a */
    class C30310a implements AnimatorUpdateListener {
        C30310a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            MainTabStrip.this.mo79819a(0, ((Float) valueAnimator.getAnimatedValue()).floatValue(), MainTabStrip.this.f79687i);
            MainTabStrip.this.mo79820a(0, 0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            MainTabStrip.this.mo79820a(0, 1, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.MainTabStrip$b */
    public interface C30311b {
        /* renamed from: a */
        boolean mo79847a(int i);
    }

    /* renamed from: a */
    public final void mo79823a(boolean z, int i) {
        if ((!C6399b.m19946v() || !C42970bd.m136414c()) && z != this.f79698t[i]) {
            this.f79696r = i;
            this.f79698t[i] = z;
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo79820a(int i, int i2, float f) {
        View b = m99076b(i2);
        if (b != null && b.getVisibility() == 0) {
            if (i2 == i) {
                b.setAlpha(1.0f - (f * 0.39999998f));
            } else if (i2 == i + 1) {
                b.setAlpha((f * 0.39999998f) + 0.6f);
            } else {
                b.setAlpha(0.6f);
            }
        }
    }

    /* renamed from: a */
    public final void mo79821a(View view) {
        if (this.f79688j != null && view != null) {
            mo79819a(this.f79688j.getCurrentItemCompat(), 0.0f, view);
        }
    }

    /* renamed from: a */
    public final void mo79819a(int i, float f, View view) {
        if (C23487o.m77147a(view)) {
            View b = m99076b(i);
            View b2 = m99076b(i + 1);
            if (b != null && b.getVisibility() == 0 && b2 != null && b2.getVisibility() == 0) {
                float x = (b.getX() + ((float) (b.getWidth() / 2))) - ((float) (view.getWidth() / 2));
                view.setX(getX() + x + (f * (((b2.getX() + ((float) (b2.getWidth() / 2))) - ((float) (view.getWidth() / 2))) - x)));
            } else if (C23487o.m77147a(b)) {
                view.setX(((getX() + b.getX()) + ((float) (b.getWidth() / 2))) - ((float) (view.getWidth() / 2)));
            }
        }
    }

    /* renamed from: a */
    public final void mo79822a(FlippableViewPager flippableViewPager, final View view, boolean z) {
        this.f79688j = flippableViewPager;
        this.f79686h = z;
        this.f79687i = view;
        if (view != null) {
            view.setVisibility(this.f79686h ? 0 : 8);
        }
        flippableViewPager.f61696a = this.f79686h;
        if (this.f79686h) {
            m99082i();
        }
        this.f79688j.addOnPageChangeListener(new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageSelected(int i) {
                if (MainTabStrip.this.f79686h) {
                    MainTabStrip.this.mo79819a(i, 0.0f, view);
                }
                switch (i) {
                    case 0:
                        MainTabStrip.this.mo79818a((int) R.id.duo);
                        return;
                    case 1:
                        MainTabStrip.this.mo79818a((int) R.id.dvr);
                        MainTabStrip.this.mo79823a(false, 2);
                        return;
                    case 2:
                        MainTabStrip.this.mo79818a((int) R.id.dv1);
                        break;
                }
            }

            public final void onPageScrolled(int i, float f, int i2) {
                if (MainTabStrip.this.f79686h) {
                    MainTabStrip.this.mo79820a(i, 0, f);
                    MainTabStrip.this.mo79820a(i, 1, f);
                    MainTabStrip.this.mo79820a(i, 2, f);
                    MainTabStrip.this.mo79819a(i, f, view);
                }
            }
        });
    }

    /* renamed from: f */
    public final boolean mo79829f() {
        return this.f79698t[0];
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42961az.m136383d(this);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C42961az.m136382c(this);
    }

    /* renamed from: c */
    public final void mo79826c() {
        this.f79688j.setCurrentItem(0, false);
        m99080d(2);
    }

    /* renamed from: d */
    public final void mo79827d() {
        this.f79688j.setCurrentItem(1, false);
        m99080d(1);
    }

    /* renamed from: g */
    public final void mo79830g() {
        setVisibility(8);
        C23487o.m77140a(this.f79687i, 8);
    }

    /* renamed from: h */
    private void m99081h() {
        this.f79680b.getPaint().setFakeBoldText(true);
        this.f79681c.getPaint().setFakeBoldText(true);
        this.f79682d.getPaint().setFakeBoldText(true);
    }

    /* renamed from: i */
    private void m99082i() {
        if (this.f79683e != null) {
            this.f79683e.setVisibility(4);
        }
        if (this.f79684f != null) {
            this.f79684f.setVisibility(4);
        }
    }

    /* renamed from: j */
    private void m99083j() {
        if (C6399b.m19946v() && C6384b.m19835a().mo15287a(JumpToFollowTabExperiment.class, true, "jump_to_follow_tab", C6384b.m19835a().mo15295d().jump_to_follow_tab, 0) != 1 && !C43122ff.m136767b() && !C6903bc.m21484c().mo59243c() && C6861a.m21337f().isLogin()) {
            if (C6861a.m21337f().getCurUser().getFollowingCount() >= ((Integer) SharePrefCache.inst().getFollowUserThreshold().mo59877d()).intValue()) {
                C6857a.m21312e().mo16818a();
                C6857a.m21312e().mo16824b();
                mo79826c();
                return;
            }
            mo79827d();
        }
    }

    /* renamed from: b */
    public final void mo79824b() {
        this.f79685g = false;
        if (this.f79679a != null && this.f79679a.isRunning()) {
            this.f79679a.cancel();
            mo79819a(0, 1.0f, this.f79687i);
            mo79820a(0, 0, 1.0f);
            mo79820a(0, 1, 1.0f);
        }
    }

    /* renamed from: e */
    public final void mo79828e() {
        if (this.f79688j != null) {
            if (this.f79688j.getAdapter().getCount() > 2) {
                setTabMode(6);
            } else {
                setTabMode(5);
            }
            switch (this.f79688j.getCurrentItemCompat()) {
                case 0:
                    mo79818a((int) R.id.duo);
                    return;
                case 1:
                    mo79818a((int) R.id.dvr);
                    return;
                case 2:
                    mo79818a((int) R.id.dv1);
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo79817a() {
        if (C23487o.m77147a(this.f79687i) && this.f79679a != null && !this.f79679a.isRunning()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.3f});
            ofFloat.setDuration(400);
            ofFloat.addUpdateListener(new C30310a());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.3f, 1.0f});
            ofFloat2.setDuration(900);
            ofFloat2.addUpdateListener(new C30310a());
            this.f79679a.play(ofFloat).before(ofFloat2);
            this.f79679a.start();
            this.f79679a.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (MainTabStrip.this.f79685g) {
                        MainTabStrip.this.f79679a.start();
                    }
                }
            });
        }
    }

    public void setEnableAnimation(boolean z) {
        this.f79699u = z;
    }

    public void setTabOnClickListener(C30311b bVar) {
        this.f79689k = bVar;
    }

    public MainTabStrip(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private boolean m99079c(int i) {
        return this.f79698t[i];
    }

    public void setShowDot(boolean z) {
        mo79823a(z, 0);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onFollowFeedHideRedDotEvent(C28335r rVar) {
        if (rVar != null && this.f79688j != null) {
            setShowDot(rVar.f74663a);
        }
    }

    /* renamed from: b */
    private View m99076b(int i) {
        if (i == 0) {
            return this.f79680b;
        }
        if (i == 1) {
            return this.f79681c;
        }
        if (i == 2) {
            return this.f79682d;
        }
        return null;
    }

    /* renamed from: d */
    private static void m99080d(int i) {
        if (C6399b.m19946v()) {
            C7121a.m22248b().mo18559a(new SaveTabJobTask(i)).mo18560a();
        }
    }

    @C7709l
    public void onLoginEvent(C32646b bVar) {
        m99083j();
        animate().alpha(1.0f).setDuration(500).withStartAction(new Runnable() {
            public final void run() {
                MainTabStrip.this.setVisibility(0);
            }
        }).start();
    }

    /* renamed from: a */
    private void m99072a(Context context) {
        setOrientation(0);
        this.f79680b = m99071a(context, (int) R.string.b5l, (int) R.id.duo);
        this.f79683e = m99077b(context);
        this.f79681c = m99071a(context, (int) R.string.b5n, (int) R.id.dvr);
        this.f79684f = m99077b(context);
        this.f79682d = m99071a(context, (int) R.string.b5m, (int) R.id.dv1);
    }

    /* renamed from: b */
    private View m99077b(Context context) {
        View view = new View(context);
        view.setBackgroundColor(context.getResources().getColor(R.color.yv));
        LayoutParams layoutParams = new LayoutParams(C23486n.m77122a(1.0d), C23486n.m77122a(5.0d));
        layoutParams.gravity = 16;
        addView(view, layoutParams);
        return view;
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onFeedsShowRedDotEvent(C28334q qVar) {
        if (qVar != null && this.f79688j != null && this.f79688j.getCurrentItemCompat() != qVar.f74662a && !m99079c(qVar.f74662a)) {
            mo79823a(true, qVar.f74662a);
            C42970bd.m136412a(qVar.f74662a);
        }
    }

    public void setTabMode(int i) {
        switch (i) {
            case 5:
                this.f79682d.setVisibility(8);
                this.f79684f.setVisibility(8);
                break;
            case 6:
                this.f79682d.setVisibility(0);
                this.f79684f.setVisibility(0);
                break;
        }
        this.f79691m = i;
    }

    public void setTitle(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            try {
                if (strArr.length > 2) {
                    this.f79680b.setText(strArr[0]);
                    this.f79681c.setText(strArr[1]);
                    this.f79682d.setText(strArr[2]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private void m99078c(Context context) {
        this.f79692n = new Paint();
        this.f79692n.setAntiAlias(true);
        this.f79692n.setStyle(Style.FILL);
        if (C6384b.m19835a().mo15292a(FollowDotColorExperiment.class, true, "following_red_dot_reverse", C6384b.m19835a().mo15295d().following_red_dot_reverse, false)) {
            this.f79694p = getResources().getColor(R.color.a71);
        } else {
            this.f79694p = getResources().getColor(R.color.a79);
        }
        this.f79693o = context.getResources().getDimensionPixelSize(R.dimen.n8);
    }

    /* renamed from: b */
    public final void mo79825b(View view) {
        if (this.f79689k != null) {
            int id = view.getId();
            if (id == R.id.duo) {
                m99075a("homepage_follow", 0);
                m99080d(2);
            } else if (id == R.id.dvr) {
                m99075a("homepage_hot", 1);
                m99080d(1);
                mo79823a(false, 2);
            } else if (id == R.id.dv1 && this.f79682d.getVisibility() == 0) {
                m99075a("homepage_fresh", 2);
                m99080d(3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextView textView = this.f79697s[this.f79696r];
        if (this.f79698t[this.f79696r]) {
            this.f79692n.setColor(this.f79694p);
            if (textView != null) {
                textView.getPaint().getTextBounds(textView.getText().toString(), 0, textView.getText().toString().length(), this.f79700v);
                int x = ((int) textView.getX()) + ((textView.getWidth() - this.f79700v.width()) / 2) + (this.f79693o / 2) + this.f79700v.width();
                if (this.f79682d.getVisibility() != 0) {
                    x += 2;
                }
                canvas.drawCircle((float) x, (float) ((((int) textView.getY()) + ((textView.getHeight() - this.f79700v.height()) / 2)) - 1), (float) (this.f79693o / 2), this.f79692n);
            }
        }
    }

    /* renamed from: a */
    public final void mo79818a(int i) {
        if (!this.f79686h) {
            if (i == R.id.duo) {
                if (this.f79691m == 6) {
                    m99074a(this.f79682d, 4);
                    m99073a(this.f79683e, 2);
                    m99073a(this.f79684f, 1);
                }
                m99074a(this.f79680b, 3);
                m99074a(this.f79681c, 4);
            } else if (i == R.id.dvr) {
                if (this.f79691m == 6) {
                    m99074a(this.f79682d, 4);
                    m99073a(this.f79683e, 0);
                    m99073a(this.f79684f, 2);
                }
                m99074a(this.f79680b, 4);
                m99074a(this.f79681c, 3);
            } else {
                if (i == R.id.dv1 && this.f79682d.getVisibility() == 0) {
                    if (this.f79691m == 6) {
                        m99074a(this.f79682d, 3);
                        m99073a(this.f79683e, 1);
                        m99073a(this.f79684f, 0);
                    }
                    m99074a(this.f79680b, 4);
                    m99074a(this.f79681c, 4);
                }
            }
        }
    }

    /* renamed from: a */
    private void m99075a(String str, int i) {
        if (!this.f79689k.mo79847a(i) && this.f79688j != null) {
            C42961az.m136380a(new C28340w(str));
            this.f79688j.setCurrentItem(i, this.f79686h);
        }
    }

    public MainTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f79679a = new AnimatorSet();
        this.f79693o = 0;
        this.f79694p = 0;
        this.f79685g = true;
        this.f79686h = false;
        this.f79697s = new TextView[5];
        this.f79698t = new boolean[5];
        this.f79699u = true;
        this.f79700v = new Rect();
        m99072a(context);
        this.f79690l = context;
        this.f79691m = 6;
        m99078c(context);
        m99081h();
        this.f79695q = C33002a.m106650a();
        if (this.f79695q == 2 || C33003b.m106651a()) {
            this.f79680b.setVisibility(8);
            this.f79683e.setVisibility(8);
        } else {
            this.f79680b.setVisibility(0);
            this.f79683e.setVisibility(0);
        }
        this.f79697s[0] = this.f79680b;
        this.f79697s[2] = this.f79681c;
    }

    /* renamed from: a */
    private void m99073a(View view, int i) {
        float f;
        if (i == 0) {
            f = -C9738o.m28708b(this.f79690l, 4.0f);
        } else if (i == 2) {
            f = C9738o.m28708b(this.f79690l, 4.0f);
        } else {
            f = 0.0f;
        }
        if (this.f79699u) {
            ObjectAnimator.ofFloat(view, "translationX", new float[]{view.getTranslationX(), f}).setDuration(200).start();
            return;
        }
        view.setTranslationX(f);
    }

    /* renamed from: a */
    private void m99074a(TextView textView, int i) {
        ObjectAnimator objectAnimator;
        float f;
        TextView textView2 = textView;
        ObjectAnimator objectAnimator2 = null;
        float f2 = 1.0f;
        if (i == 3) {
            if (this.f79699u) {
                objectAnimator2 = ObjectAnimator.ofFloat(textView2, "scaleX", new float[]{textView.getScaleX(), 1.25f, 1.125f}).setDuration(300);
                objectAnimator2.setInterpolator(new TimeInterpolator() {
                    public final float getInterpolation(float f) {
                        return f < 0.33333334f ? f * 1.5f : (f * 0.75f) + 0.25f;
                    }
                });
                objectAnimator = ObjectAnimator.ofFloat(textView2, "scaleY", new float[]{textView.getScaleY(), 1.25f, 1.125f}).setDuration(300);
                objectAnimator.setInterpolator(new TimeInterpolator() {
                    public final float getInterpolation(float f) {
                        return f < 0.33333334f ? f * 1.5f : (f * 0.75f) + 0.25f;
                    }
                });
            } else {
                objectAnimator = null;
            }
            f = 1.0f;
            f2 = 1.125f;
        } else {
            f = 0.6f;
            if (this.f79699u) {
                objectAnimator2 = ObjectAnimator.ofFloat(textView2, "scaleX", new float[]{textView.getScaleX(), 1.0f}).setDuration(200);
                objectAnimator = ObjectAnimator.ofFloat(textView2, "scaleY", new float[]{textView.getScaleY(), 1.0f}).setDuration(200);
            } else {
                objectAnimator = null;
            }
        }
        if (this.f79699u) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(textView2, "alpha", new float[]{textView.getAlpha(), f}).setDuration(200);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{duration, objectAnimator2, objectAnimator});
            animatorSet.start();
            return;
        }
        textView2.setScaleX(f2);
        textView2.setScaleY(f2);
        textView2.setAlpha(f);
    }

    /* renamed from: a */
    private TextView m99071a(Context context, int i, int i2) {
        DmtTextView dmtTextView = new DmtTextView(context);
        dmtTextView.setId(i2);
        dmtTextView.setText(i);
        dmtTextView.setGravity(17);
        dmtTextView.setLines(1);
        dmtTextView.setPadding(C23486n.m77122a(12.0d), 0, C23486n.m77122a(12.0d), 0);
        dmtTextView.setMinWidth(C23486n.m77122a(53.0d));
        dmtTextView.setTextColor(context.getResources().getColor(R.color.zg));
        dmtTextView.setAlpha(0.6f);
        dmtTextView.setTextSize(1, 17.0f);
        dmtTextView.setFontType(C10834d.f29337g);
        if (MainTabStripSwipeSwitchExperiment.INSTANCE.getEnableSwipeMode()) {
            dmtTextView.setShadowLayer(C9738o.m28708b(context, 2.0f), 0.0f, C9738o.m28708b(context, 2.0f), Color.parseColor("#26000000"));
        }
        addView(dmtTextView, new LayoutParams(-2, C23486n.m77122a(58.0d)));
        dmtTextView.setOnClickListener(new C30336m(this));
        return dmtTextView;
    }
}
