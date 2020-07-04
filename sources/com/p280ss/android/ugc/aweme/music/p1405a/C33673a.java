package com.p280ss.android.ugc.aweme.music.p1405a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p280ss.android.ugc.aweme.detail.C26065h;
import com.p280ss.android.ugc.aweme.detail.C26067i;
import com.p280ss.android.ugc.aweme.detail.C26094j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.music.a.a */
public final class C33673a implements C26065h {

    /* renamed from: a */
    public final ViewGroup f87901a;

    /* renamed from: b */
    public final C26067i f87902b;

    /* renamed from: c */
    public final C26094j f87903c;

    /* renamed from: d */
    public final C26094j f87904d;

    /* renamed from: e */
    public final ScrollableLayout f87905e;

    /* renamed from: f */
    public boolean f87906f;

    /* renamed from: g */
    public boolean f87907g;

    /* renamed from: h */
    public boolean f87908h;

    /* renamed from: i */
    public final Context f87909i;

    /* renamed from: j */
    public final ViewGroup f87910j;

    /* renamed from: k */
    private boolean f87911k = true;

    /* renamed from: com.ss.android.ugc.aweme.music.a.a$a */
    static final class C33675a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C33673a f87913a;

        C33675a(C33673a aVar) {
            this.f87913a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m108683a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108683a() {
            this.f87913a.f87903c.mo67673c(new C7561a<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C33675a f87914a;

                {
                    this.f87914a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    m108684a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m108684a() {
                    this.f87914a.f87913a.f87902b.mo67577a(C26069a.f68880a);
                    this.f87914a.f87913a.f87906f = false;
                    this.f87914a.f87913a.f87908h = false;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.a$b */
    static final class C33677b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C33673a f87915a;

        C33677b(C33673a aVar) {
            this.f87915a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m108685a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108685a() {
            this.f87915a.f87904d.mo67577a(new C7561a<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C33677b f87916a;

                {
                    this.f87916a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    m108686a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m108686a() {
                    this.f87916a.f87915a.f87906f = true;
                    this.f87916a.f87915a.f87907g = false;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.a.a$c */
    public static final class C33679c implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C33673a f87917a;

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        C33679c(C33673a aVar) {
            this.f87917a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            if (!this.f87917a.f87906f) {
                this.f87917a.f87902b.mo67577a(C26069a.f68880a);
            }
        }
    }

    /* renamed from: g */
    private boolean m108672g() {
        return this.f87911k;
    }

    /* renamed from: c */
    public final void mo67574c() {
        m108674i();
    }

    /* renamed from: d */
    public final void mo67575d() {
        m108673h();
    }

    /* renamed from: a */
    public final void mo67570a() {
        this.f87902b.mo67579b(C26070b.f68881a);
    }

    /* renamed from: b */
    public final void mo67573b() {
        View findViewById = this.f87901a.findViewById(R.id.da8);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.f87902b.mo67577a(C26069a.f68880a);
    }

    /* renamed from: e */
    public final void mo86086e() {
        this.f87901a.clearAnimation();
        if (!this.f87906f) {
            this.f87902b.mo67579b(C26070b.f68881a);
        }
        this.f87901a.startAnimation(AnimationUtils.loadAnimation(this.f87909i, R.anim.co));
    }

    /* renamed from: f */
    public final void mo86087f() {
        this.f87901a.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f87909i, R.anim.cp);
        loadAnimation.setAnimationListener(new C33679c(this));
        this.f87901a.startAnimation(loadAnimation);
    }

    /* renamed from: h */
    private void m108673h() {
        if (m108672g() && !this.f87906f && !this.f87907g) {
            this.f87901a.clearAnimation();
            this.f87902b.mo67579b(C26070b.f68881a);
            this.f87907g = true;
            this.f87903c.mo67577a(new C33677b(this));
        }
    }

    /* renamed from: i */
    private void m108674i() {
        if (m108672g()) {
            C25765b helper = this.f87905e.getHelper();
            C7573i.m23582a((Object) helper, "scrollLayout.helper");
            if (helper.mo66886a() && this.f87906f && !this.f87908h) {
                this.f87901a.clearAnimation();
                this.f87908h = true;
                this.f87904d.mo67673c(new C33675a(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo67571a(int i) {
        m108674i();
    }

    /* renamed from: a */
    public final void mo67572a(boolean z) {
        this.f87901a.setVisibility(8);
        this.f87911k = false;
    }

    public C33673a(Context context, ViewGroup viewGroup) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(viewGroup, "viewGroup");
        this.f87909i = context;
        this.f87910j = viewGroup;
        View findViewById = this.f87910j.findViewById(R.id.da5);
        C7573i.m23582a((Object) findViewById, "this.viewGroup.findViewById(R.id.start_record)");
        this.f87901a = (ViewGroup) findViewById;
        this.f87902b = new C33680b(this.f87909i, this.f87901a);
        this.f87903c = new C33681c(this.f87909i, this.f87901a);
        this.f87904d = new C33700d(this.f87909i, this.f87901a);
        View findViewById2 = this.f87910j.findViewById(R.id.czg);
        C7573i.m23582a((Object) findViewById2, "this.viewGroup.findViewById(R.id.scroll_layout)");
        this.f87905e = (ScrollableLayout) findViewById2;
        this.f87901a.setOnTouchListener(new OnTouchListener(this) {

            /* renamed from: a */
            final /* synthetic */ C33673a f87912a;

            {
                this.f87912a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C7573i.m23582a((Object) motionEvent, "event");
                switch (motionEvent.getAction()) {
                    case 0:
                        this.f87912a.mo86086e();
                        break;
                    case 1:
                        this.f87912a.mo86087f();
                        break;
                }
                return false;
            }
        });
    }
}
