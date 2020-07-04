package com.p280ss.android.ugc.aweme.policy.notice.p1478ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.policy.notice.api.C35504a;
import com.p280ss.android.ugc.aweme.policy.notice.api.C35505b;
import com.p280ss.android.ugc.aweme.policy.notice.p1476a.C35500a;
import com.p280ss.android.ugc.aweme.policy.notice.p1477b.C35507a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43222g;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.views.C43374j;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a */
public final class C35513a extends C43374j {

    /* renamed from: f */
    public static final C35514a f93184f = new C35514a(null);

    /* renamed from: a */
    public DmtTextView f93185a;

    /* renamed from: b */
    public DmtTextView f93186b;

    /* renamed from: c */
    public RemoteImageView f93187c;

    /* renamed from: d */
    public boolean f93188d;

    /* renamed from: e */
    public final Handler f93189e = new Handler();

    /* renamed from: g */
    private DmtTextView f93190g;

    /* renamed from: j */
    private DmtTextView f93191j;

    /* renamed from: k */
    private DmtTextView f93192k;

    /* renamed from: l */
    private final int f93193l = this.f93195n.f93160f.size();

    /* renamed from: m */
    private final List<DmtTextView> f93194m = new ArrayList();

    /* renamed from: n */
    private final C35504a f93195n;

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$a */
    public static final class C35514a {
        private C35514a() {
        }

        public /* synthetic */ C35514a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$b */
    static final class C35515b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35513a f93196a;

        /* renamed from: b */
        final /* synthetic */ C35505b f93197b;

        C35515b(C35513a aVar, C35505b bVar) {
            this.f93196a = aVar;
            this.f93197b = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String str = this.f93197b.f93164c;
            int hashCode = str.hashCode();
            if (hashCode != -1052618729) {
                if (hashCode != -172220347) {
                    if (hashCode == 3277 && str.equals("h5")) {
                        Intent intent = new Intent(this.f93196a.getContext(), CrossPlatformActivity.class);
                        intent.setData(Uri.parse(this.f93197b.f93165d));
                        this.f93196a.getContext().startActivity(intent);
                        if (!this.f93197b.f93167f) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!str.equals("callback")) {
                    return;
                }
            } else if (str.equals("native")) {
                C7195s.m22438a().mo18682a(C7203u.m22460a(this.f93197b.f93165d).mo18695a());
                if (!this.f93197b.f93167f) {
                    return;
                }
            } else {
                return;
            }
            this.f93196a.mo90321a(this.f93197b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$c */
    static final class C35516c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35513a f93198a;

        C35516c(C35513a aVar) {
            this.f93198a = aVar;
        }

        public final void run() {
            if (this.f93198a.isShowing()) {
                if (!C43316v.m137250H()) {
                    C43222g K = C43316v.m137450K();
                    C7573i.m23582a((Object) K, "PlayerManager.inst()");
                    if (K.mo104916o()) {
                        C43316v.m137450K().mo104948x();
                        this.f93198a.f93188d = true;
                        return;
                    }
                    this.f93198a.mo71375a();
                    return;
                }
                C44933a a = C44933a.m141791a();
                C7573i.m23582a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
                if (a.mo107442b()) {
                    C44933a.m141791a().mo71672ad();
                    this.f93198a.f93188d = true;
                    return;
                }
                this.f93198a.mo71375a();
            }
        }
    }

    public final void dismiss() {
        super.dismiss();
        if (this.f93188d) {
            if (!C43316v.m137250H()) {
                C43316v.m137450K().mo104946v();
            } else {
                C44933a.m141791a().mo71671ac();
            }
            this.f93188d = false;
        }
    }

    /* renamed from: b */
    private final void m114677b() {
        LayoutParams layoutParams;
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            layoutParams = window2.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.dimAmount = C10730a.f28679f;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setAttributes(layoutParams);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.addFlags(2);
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setWindowAnimations(0);
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    /* renamed from: e */
    private final void m114681e() {
        boolean z;
        m114678b(this.f93195n.f93158d);
        m114679c(this.f93195n.f93159e);
        m114676a(this.f93195n.f93161g);
        int size = this.f93195n.f93160f.size();
        for (int i = 0; i < size; i++) {
            DmtTextView dmtTextView = (DmtTextView) this.f93194m.get(i);
            C35505b bVar = (C35505b) this.f93195n.f93160f.get(i);
            if (i == C7525m.m23462a((Collection<?>) this.f93195n.f93160f).f20878b) {
                z = true;
            } else {
                z = false;
            }
            m114675a(dmtTextView, bVar, z);
        }
    }

    /* renamed from: d */
    private final void m114680d() {
        View findViewById = findViewById(R.id.e3f);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.tv_title)");
        this.f93185a = (DmtTextView) findViewById;
        View findViewById2 = findViewById(R.id.dsf);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.tv_content)");
        this.f93186b = (DmtTextView) findViewById2;
        this.f93190g = (DmtTextView) findViewById(R.id.s8);
        View findViewById3 = findViewById(R.id.ax9);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.icon)");
        this.f93187c = (RemoteImageView) findViewById3;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.cwi);
        this.f93194m.add(this.f93190g);
        if (this.f93193l > 1) {
            this.f93191j = (DmtTextView) findViewById(R.id.s9);
            View findViewById4 = findViewById(R.id.a9u);
            C7573i.m23582a((Object) findViewById4, "findViewById<View>(R.id.divider_line1)");
            findViewById4.setVisibility(0);
            DmtTextView dmtTextView = this.f93191j;
            if (dmtTextView != null) {
                dmtTextView.setVisibility(0);
            }
            this.f93194m.add(this.f93191j);
        }
        if (this.f93193l > 2) {
            this.f93192k = (DmtTextView) findViewById(R.id.s_);
            View findViewById5 = findViewById(R.id.a9v);
            C7573i.m23582a((Object) findViewById5, "findViewById<View>(R.id.divider_line2)");
            findViewById5.setVisibility(0);
            DmtTextView dmtTextView2 = this.f93192k;
            if (dmtTextView2 != null) {
                dmtTextView2.setVisibility(0);
            }
            this.f93194m.add(this.f93192k);
        }
        double b = (double) C9738o.m28709b(getContext());
        Double.isNaN(b);
        double d = b * 0.1d;
        C7573i.m23582a((Object) viewGroup, "rootView");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i = (int) d;
            layoutParams2.setMargins(0, i, 0, i);
            viewGroup.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo71375a() {
        if (!C43316v.m137250H()) {
            C43222g K = C43316v.m137450K();
            C7573i.m23582a((Object) K, "PlayerManager.inst()");
            if (K.mo104916o()) {
                C43316v.m137450K().mo104948x();
                this.f93188d = true;
                return;
            }
        } else {
            C44933a a = C44933a.m141791a();
            C7573i.m23582a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
            if (a.mo107442b()) {
                C44933a.m141791a().mo71672ad();
                this.f93188d = true;
                return;
            }
        }
        this.f93189e.postDelayed(new C35516c(this), 1000);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo71375a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.l0);
        m114677b();
        m114680d();
        m114681e();
    }

    /* renamed from: b */
    private void m114678b(String str) {
        C7573i.m23587b(str, "title");
        DmtTextView dmtTextView = this.f93185a;
        if (dmtTextView == null) {
            C7573i.m23583a("mTitleView");
        }
        dmtTextView.setFontType(C10834d.f29332b);
        DmtTextView dmtTextView2 = this.f93185a;
        if (dmtTextView2 == null) {
            C7573i.m23583a("mTitleView");
        }
        dmtTextView2.setText(str);
    }

    /* renamed from: a */
    public final void mo90321a(C35505b bVar) {
        new C35507a().mo90315a(this.f93195n.f93155a, this.f93195n.f93156b, this.f93195n.f93157c, bVar.f93166e);
        C42961az.m136380a(new C35500a());
        dismiss();
    }

    /* renamed from: c */
    private void m114679c(String str) {
        C7573i.m23587b(str, "body");
        CharSequence a = C7634n.m23711a(str, "\n", "\n\n", false);
        SpannableString spannableString = new SpannableString(a);
        Matcher matcher = Pattern.compile("\n\n").matcher(a);
        while (matcher.find()) {
            spannableString.setSpan(new AbsoluteSizeSpan(7, true), matcher.start() + 1, matcher.end(), 33);
        }
        DmtTextView dmtTextView = this.f93186b;
        if (dmtTextView == null) {
            C7573i.m23583a("mBodyView");
        }
        dmtTextView.setText(spannableString);
    }

    /* renamed from: a */
    private void m114676a(String str) {
        DmtTextView dmtTextView = this.f93185a;
        if (dmtTextView == null) {
            C7573i.m23583a("mTitleView");
        }
        ViewGroup.LayoutParams layoutParams = dmtTextView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (TextUtils.isEmpty(str)) {
                RemoteImageView remoteImageView = this.f93187c;
                if (remoteImageView == null) {
                    C7573i.m23583a("mIcon");
                }
                remoteImageView.setVisibility(8);
                layoutParams2.topMargin = C23486n.m77122a(24.0d);
                DmtTextView dmtTextView2 = this.f93185a;
                if (dmtTextView2 == null) {
                    C7573i.m23583a("mTitleView");
                }
                dmtTextView2.setLayoutParams(layoutParams2);
                return;
            }
            RemoteImageView remoteImageView2 = this.f93187c;
            if (remoteImageView2 == null) {
                C7573i.m23583a("mIcon");
            }
            remoteImageView2.setVisibility(0);
            RemoteImageView remoteImageView3 = this.f93187c;
            if (remoteImageView3 == null) {
                C7573i.m23583a("mIcon");
            }
            C23323e.m76525b(remoteImageView3, str, C23486n.m77122a(48.0d), C23486n.m77122a(48.0d));
            layoutParams2.topMargin = C23486n.m77122a(16.0d);
            DmtTextView dmtTextView3 = this.f93185a;
            if (dmtTextView3 == null) {
                C7573i.m23583a("mTitleView");
            }
            dmtTextView3.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public C35513a(Context context, C35504a aVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "mPolicyNotice");
        super(context, (int) R.style.uu, false, true);
        this.f93195n = aVar;
    }

    /* renamed from: a */
    private final void m114675a(DmtTextView dmtTextView, C35505b bVar, boolean z) {
        if (dmtTextView != null) {
            dmtTextView.setText(bVar.f93162a);
        }
        if (bVar.f93163b) {
            if (dmtTextView != null) {
                dmtTextView.setFontType(C10834d.f29332b);
            }
            if (dmtTextView != null) {
                Context context = getContext();
                C7573i.m23582a((Object) context, "context");
                dmtTextView.setTextColor(context.getResources().getColor(R.color.ab1));
            }
        } else if (dmtTextView != null) {
            dmtTextView.setFontType(C10834d.f29331a);
        }
        if (z) {
            if (dmtTextView != null) {
                dmtTextView.setBackgroundResource(R.drawable.q5);
            }
        } else if (dmtTextView != null) {
            dmtTextView.setBackgroundResource(R.drawable.q4);
        }
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(new C35515b(this, bVar));
        }
    }
}
