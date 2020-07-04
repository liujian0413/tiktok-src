package com.p280ss.android.ugc.aweme.commercialize.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.C0991u;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.ugc.aweme.C21781u;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.utils.C43081e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.BaseAdBottomLabelView */
public abstract class BaseAdBottomLabelView extends FrameLayout {

    /* renamed from: a */
    public static final String f66997a = "BaseAdBottomLabelView";

    /* renamed from: b */
    protected TextView f66998b;

    /* renamed from: c */
    protected TextView f66999c;

    /* renamed from: d */
    protected ImageView f67000d;

    /* renamed from: e */
    public int f67001e;

    /* renamed from: f */
    public Context f67002f;

    /* renamed from: g */
    protected Aweme f67003g;

    /* renamed from: h */
    private View f67004h;

    /* renamed from: i */
    private boolean f67005i;

    /* renamed from: j */
    private View f67006j;

    /* renamed from: k */
    private View f67007k;

    /* renamed from: l */
    private ObjectAnimator f67008l;

    /* renamed from: m */
    private ObjectAnimator f67009m;

    /* renamed from: n */
    private String f67010n;

    /* renamed from: o */
    private Runnable f67011o;

    /* renamed from: p */
    private C24723e f67012p;

    /* renamed from: q */
    private Runnable f67013q;

    /* renamed from: r */
    private C19388d f67014r;

    /* renamed from: s */
    private View f67015s;

    /* renamed from: t */
    private boolean f67016t;

    /* renamed from: u */
    private int f67017u;

    /* renamed from: v */
    private long f67018v;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.BaseAdBottomLabelView$a */
    class C25455a implements C19388d {
        /* renamed from: a */
        public final void mo51374a(C19387c cVar, C19384a aVar) {
        }

        /* renamed from: a */
        public final void mo51373a() {
            BaseAdBottomLabelView.this.mo66096a(C25329c.m83243z(BaseAdBottomLabelView.this.f67003g));
        }

        private C25455a() {
        }

        /* renamed from: b */
        public final void mo51377b(C19400e eVar) {
            BaseAdBottomLabelView.this.f67001e = 3;
            BaseAdBottomLabelView.this.mo66114h();
        }

        /* renamed from: c */
        public final void mo51379c(C19400e eVar) {
            BaseAdBottomLabelView.this.f67001e = 2;
            BaseAdBottomLabelView.this.mo66115i();
        }

        /* renamed from: a */
        public final void mo51375a(C19400e eVar) {
            BaseAdBottomLabelView.this.f67001e = 4;
            BaseAdBottomLabelView.this.mo66101b("0%", BaseAdBottomLabelView.this.f67002f.getString(R.string.db6));
        }

        /* renamed from: b */
        public final void mo51378b(C19400e eVar, int i) {
            BaseAdBottomLabelView.this.f67001e = 4;
            BaseAdBottomLabelView.this.mo66100b(BaseAdBottomLabelView.this.f67002f.getString(R.string.agw));
        }

        /* renamed from: a */
        public final void mo51376a(C19400e eVar, int i) {
            long j;
            BaseAdBottomLabelView.this.f67001e = 4;
            StringBuilder sb = new StringBuilder();
            long j2 = 0;
            if ((eVar.f52502d >> 20) >= 0) {
                j = eVar.f52502d >> 20;
            } else {
                j = 0;
            }
            sb.append(String.valueOf(j));
            sb.append("M/");
            if ((eVar.f52501c >> 20) >= 0) {
                j2 = eVar.f52501c >> 20;
            }
            sb.append(String.valueOf(j2));
            sb.append("M");
            String sb2 = sb.toString();
            BaseAdBottomLabelView baseAdBottomLabelView = BaseAdBottomLabelView.this;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(BaseAdBottomLabelView.this.f67002f.getString(R.string.avy));
            sb3.append(i);
            sb3.append("%");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder("(");
            sb5.append(sb2);
            sb5.append(")");
            baseAdBottomLabelView.mo66097a(sb4, sb5.toString());
            BaseAdBottomLabelView.this.mo66107g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo66092a(int i, int i2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo66098a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo66102b();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract boolean mo66103c();

    public int getDefaultColor() {
        return this.f67017u;
    }

    /* access modifiers changed from: 0000 */
    public abstract int getLayoutId();

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: 0000 */
    public abstract void setLabelVisibility(int i);

    /* renamed from: q */
    private boolean mo66259q() {
        if (this.f67003g == null || !this.f67003g.isAd()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private boolean m83715r() {
        if (this.f67001e == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private boolean m83716s() {
        if (this.f67001e == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private boolean m83717t() {
        if (this.f67001e == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo66104d() {
        if (!this.f67016t) {
            mo66126o();
            this.f67016t = true;
        }
    }

    public C19388d getStatusChangeListener() {
        if (this.f67014r == null) {
            this.f67014r = new C25455a();
        }
        return this.f67014r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo66120n() {
        C24671f.m80851a().mo64679j(this.f67002f, this.f67003g);
    }

    /* renamed from: w */
    private void m83720w() {
        if (mo66103c() && !m83721x()) {
            mo66092a(Color.parseColor(C25329c.m83242y(this.f67003g)), 0);
            this.f67005i = true;
        }
    }

    /* renamed from: x */
    private boolean m83721x() {
        if (m83717t() || m83715r() || m83716s()) {
            return true;
        }
        return false;
    }

    public int getBackGroundColor() {
        int i = this.f67017u;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public int getShowSeconds() {
        if (m83721x()) {
            return 0;
        }
        return this.f67003g.getAwemeRawAd().getShowButtonSeconds() * 1000;
    }

    /* renamed from: k */
    public void mo66117k() {
        this.f67005i = false;
        if (this.f67011o != null) {
            removeCallbacks(this.f67011o);
        }
        if (this.f67013q != null) {
            removeCallbacks(this.f67013q);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ void mo66118l() {
        if (mo66103c() && !m83721x()) {
            mo66092a(Color.parseColor(C25329c.m83242y(this.f67003g)), (int) C34943c.f91128x);
            this.f67005i = true;
        }
    }

    /* renamed from: p */
    private void mo66127p() {
        if (this.f67008l != null) {
            this.f67008l.cancel();
            this.f67006j.clearAnimation();
        }
        if (this.f67009m != null) {
            this.f67009m.cancel();
            this.f67007k.clearAnimation();
        }
        if (this.f67006j != null) {
            this.f67006j.setBackgroundDrawable(null);
        }
        if (this.f67007k != null) {
            this.f67007k.setBackgroundDrawable(null);
        }
    }

    /* renamed from: u */
    private void m83718u() {
        if (this.f67012p.mo64705a() && !mo66102b()) {
            C24671f.m80851a().mo64679j(this.f67002f, this.f67003g);
        }
        if (this.f67004h != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f67004h.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f67004h.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: v */
    private void m83719v() {
        int colorChangeSeconds = getColorChangeSeconds();
        if (this.f67013q != null) {
            removeCallbacks(this.f67013q);
        }
        if (this.f67013q == null) {
            this.f67013q = new C25573d(this);
        }
        long j = (long) colorChangeSeconds;
        if (this.f67018v >= j) {
            m83720w();
        } else {
            postDelayed(this.f67013q, j - this.f67018v);
        }
    }

    /* access modifiers changed from: 0000 */
    public int getColorChangeSeconds() {
        if (this.f67003g == null || !this.f67003g.isAd() || this.f67003g.getAwemeRawAd().getAnimationType() != 3) {
            return getShowSeconds();
        }
        return Math.max(getShowSeconds(), this.f67003g.getAwemeRawAd().getShowButtonColorSeconds() * 1000);
    }

    /* renamed from: j */
    public void mo66116j() {
        if (this.f67011o != null) {
            removeCallbacks(this.f67011o);
        }
        int showSeconds = getShowSeconds();
        if (this.f67011o == null) {
            this.f67011o = new C25538c(this);
        }
        long j = (long) showSeconds;
        if (this.f67018v >= j) {
            m83718u();
        } else {
            postDelayed(this.f67011o, j - this.f67018v);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ void mo66119m() {
        if (this.f67012p.mo64705a() && !mo66102b()) {
            mo66099b((View) this, (Runnable) new C25575f(this));
        }
        C24671f.m80855e().mo65851a(this.f67004h, 0, C34943c.f91128x, true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!TextUtils.isEmpty(this.f67010n)) {
            C6903bc.m21491j().mo59909a().mo51669a(this.f67010n, hashCode());
            this.f67010n = null;
        }
        mo66127p();
    }

    /* renamed from: o */
    private void mo66126o() {
        this.f67004h = View.inflate(getContext(), getLayoutId(), this);
        this.f67006j = this.f67004h.findViewById(R.id.aaq);
        this.f67007k = this.f67004h.findViewById(R.id.aar);
        this.f66998b = (TextView) this.f67004h.findViewById(R.id.btz);
        this.f66999c = (TextView) this.f67004h.findViewById(R.id.btx);
        this.f67000d = (ImageView) this.f67004h.findViewById(R.id.aap);
        this.f67015s = this.f67004h.findViewById(R.id.aax);
        C43081e.m136670a(this);
    }

    /* renamed from: e */
    public final void mo66105e() {
        if (mo66098a() && !C6399b.m19944t() && !C25329c.m83210L(this.f67003g)) {
            setDownloadUrl(C25329c.m83241x(this.f67003g));
            C6903bc.m21491j().mo59909a().mo51666a(this.f67002f, hashCode(), getStatusChangeListener(), C6903bc.m21491j().mo59908a(this.f67002f, this.f67003g.getAwemeRawAd()));
        }
    }

    /* renamed from: f */
    public final void mo66106f() {
        if (mo66098a() && !m83715r() && !m83716s()) {
            mo66104d();
            mo66127p();
            this.f67006j.setVisibility(0);
            this.f67006j.setBackgroundResource(R.drawable.c0);
            int a = C9738o.m28691a(this.f67002f);
            this.f67008l = ObjectAnimator.ofFloat(this.f67006j, "translationX", new float[]{(float) (-a), (float) a});
            this.f67008l.setDuration(1500);
            this.f67008l.setRepeatCount(0);
            this.f67008l.start();
        }
    }

    /* renamed from: g */
    public final void mo66107g() {
        if (mo66098a()) {
            mo66092a(this.f67017u, 0);
            mo66104d();
            if (this.f67008l == null || !this.f67008l.isRunning()) {
                this.f67006j.setBackgroundResource(R.drawable.bbu);
                this.f67007k.setBackgroundResource(R.drawable.bbu);
                int a = C9738o.m28691a(this.f67002f);
                float f = (float) (-a);
                float f2 = (float) a;
                this.f67008l = ObjectAnimator.ofFloat(this.f67006j, "translationX", new float[]{f, f2});
                this.f67008l.setDuration(4000);
                this.f67008l.setRepeatCount(-1);
                this.f67008l.start();
                this.f67009m = ObjectAnimator.ofFloat(this.f67007k, "translationX", new float[]{f, f2});
                this.f67009m.setDuration(4000);
                this.f67009m.setStartDelay(1000);
                this.f67009m.setRepeatCount(-1);
                this.f67009m.start();
            }
        }
    }

    /* renamed from: h */
    public void mo66114h() {
        mo66104d();
        mo66127p();
        this.f67006j.setVisibility(8);
        this.f67007k.setVisibility(8);
        this.f66999c.setVisibility(0);
        this.f66999c.setText(R.string.cqz);
        this.f66999c.setTextColor(C0683b.m2912c(this.f67002f, R.color.az3));
        this.f66998b.setVisibility(8);
        this.f67000d.setVisibility(8);
        mo66092a(Color.parseColor(C25329c.m83242y(this.f67003g)), 0);
    }

    /* renamed from: i */
    public void mo66115i() {
        mo66104d();
        mo66127p();
        this.f67006j.setVisibility(8);
        this.f67007k.setVisibility(8);
        this.f66999c.setVisibility(0);
        this.f66999c.setText(R.string.a5i);
        this.f66999c.setTextColor(C0683b.m2912c(this.f67002f, R.color.az3));
        this.f66998b.setVisibility(8);
        this.f67000d.setVisibility(8);
        mo66092a(Color.parseColor(C25329c.m83242y(this.f67003g)), 0);
    }

    /* access modifiers changed from: 0000 */
    public void setDefaultColor(int i) {
        this.f67017u = i;
    }

    public void setDownloadUrl(String str) {
        this.f67010n = str;
    }

    public BaseAdBottomLabelView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public final void mo66100b(String str) {
        mo66104d();
        mo66092a(this.f67017u, 0);
        this.f67006j.setVisibility(8);
        this.f67007k.setVisibility(8);
        this.f66999c.setVisibility(0);
        this.f66999c.setText(str);
        this.f66999c.setTextColor(C0683b.m2912c(this.f67002f, R.color.a5h));
        this.f66998b.setVisibility(8);
        this.f67000d.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo66093a(long j) {
        if (mo66098a()) {
            this.f67018v = j;
            mo66104d();
            if (!mo66102b()) {
                mo66116j();
            }
            if (mo66103c() && !m83721x() && !this.f67005i) {
                m83719v();
            }
            this.f67018v = 0;
        }
    }

    /* renamed from: a */
    public final void mo66096a(String str) {
        mo66104d();
        mo66127p();
        this.f67001e = 0;
        this.f67006j.setVisibility(8);
        this.f67007k.setVisibility(8);
        this.f66999c.setTextColor(C0683b.m2912c(this.f67002f, R.color.az3));
        this.f66999c.setText(str);
        this.f66998b.setVisibility(8);
        this.f67000d.setVisibility(0);
    }

    public BaseAdBottomLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m83711a(String str, boolean z) {
        mo66104d();
        this.f67001e = 1;
        this.f67006j.setVisibility(8);
        this.f67007k.setVisibility(8);
        this.f66999c.setVisibility(0);
        this.f66999c.setText(str);
        this.f66999c.setTextColor(C0683b.m2912c(this.f67002f, R.color.az3));
        this.f66998b.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo66101b(String str, String str2) {
        mo66104d();
        clearAnimation();
        mo66092a(this.f67017u, 0);
        this.f67006j.setVisibility(0);
        this.f67007k.setVisibility(0);
        this.f66999c.setVisibility(0);
        this.f66999c.setText(str);
        this.f66998b.setVisibility(0);
        this.f66998b.setText(str2);
        this.f67000d.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66099b(View view, Runnable runnable) {
        if (runnable != null && view != null && C0991u.m4170G(view)) {
            if (!C23487o.m77156c(view) || C6405d.m19987h() || C21781u.m72809a(view.getContext()) == 2) {
                view.postDelayed(new C25574e(this, view, runnable), 100);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public final void mo66095a(Aweme aweme, C24723e eVar) {
        this.f67012p = eVar;
        this.f67003g = aweme;
        if (!mo66098a()) {
            setLabelVisibility(8);
            return;
        }
        if (mo66259q()) {
            mo66104d();
            setLabelVisibility(0);
            String a = C24671f.m80855e().mo65850a(getContext(), aweme, false);
            if (aweme.isAppAd()) {
                mo66096a(a);
            } else {
                boolean c = mo66103c();
                if (c) {
                    a = this.f67002f.getString(R.string.u8, new Object[]{a});
                }
                m83711a(a, c);
            }
        } else {
            setLabelVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo66097a(String str, String str2) {
        mo66104d();
        this.f67006j.setVisibility(0);
        this.f67007k.setVisibility(0);
        this.f66999c.setVisibility(0);
        this.f66999c.setText(str);
        this.f66999c.setTextColor(C0683b.m2912c(this.f67002f, R.color.a5h));
        this.f66998b.setVisibility(0);
        this.f66998b.setText(str2);
        this.f66998b.setTextColor(C0683b.m2912c(this.f67002f, R.color.a5h));
        this.f67000d.setVisibility(8);
    }

    public BaseAdBottomLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67002f = context;
    }
}
