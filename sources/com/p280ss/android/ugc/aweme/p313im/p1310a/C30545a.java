package com.p280ss.android.ugc.aweme.p313im.p1310a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26682g;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.C30559f;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.C32015a;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1352a.C32019b;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1352a.C32019b.C32020a;
import com.p280ss.android.ugc.aweme.share.improve.DynamicShareDialog;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38371b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.a.a */
public final class C30545a implements C32019b {

    /* renamed from: f */
    public static final C30548a f80244f = new C30548a(null);

    /* renamed from: a */
    public C32015a f80245a;

    /* renamed from: b */
    public int f80246b;

    /* renamed from: c */
    public int f80247c;

    /* renamed from: d */
    public int f80248d;

    /* renamed from: e */
    public final C30552c f80249e;

    /* renamed from: com.ss.android.ugc.aweme.im.a.a$a */
    public static final class C30548a {
        private C30548a() {
        }

        public /* synthetic */ C30548a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.a.a$b */
    public static final class C30549b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C30545a f80252a;

        /* renamed from: b */
        final /* synthetic */ boolean f80253b;

        public final void onAnimationEnd(Animator animator) {
            if (this.f80253b) {
                View b = C30545a.m99765a(this.f80252a).mo82655b();
                if (b == null) {
                    C7573i.m23580a();
                }
                b.setVisibility(8);
            } else {
                this.f80252a.f80249e.f80258d.setVisibility(8);
            }
            C30545a.m99765a(this.f80252a).mo82654a(this.f80253b);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f80253b) {
                this.f80252a.f80249e.f80258d.setVisibility(0);
                return;
            }
            View b = C30545a.m99765a(this.f80252a).mo82655b();
            if (b == null) {
                C7573i.m23580a();
            }
            b.setVisibility(0);
        }

        C30549b(C30545a aVar, boolean z) {
            this.f80252a = aVar;
            this.f80253b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.a.a$c */
    static final class C30550c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C30545a f80254a;

        C30550c(C30545a aVar) {
            this.f80254a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                float f = floatValue / ((float) this.f80254a.f80246b);
                this.f80254a.f80249e.f80258d.setAlpha(f);
                View b = C30545a.m99765a(this.f80254a).mo82655b();
                if (b == null) {
                    C7573i.m23580a();
                }
                b.setAlpha(1.0f - f);
                LayoutParams layoutParams = this.f80254a.f80249e.f80257c.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.height = (int) floatValue;
                    marginLayoutParams.topMargin = (int) (((float) this.f80254a.f80247c) * f);
                    marginLayoutParams.bottomMargin = (int) (f * ((float) this.f80254a.f80248d));
                    this.f80254a.f80249e.f80257c.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: a */
    private final boolean m99766a() {
        return this.f80249e.f80256b instanceof DynamicShareDialog;
    }

    /* renamed from: a */
    public static final /* synthetic */ C32015a m99765a(C30545a aVar) {
        C32015a aVar2 = aVar.f80245a;
        if (aVar2 == null) {
            C7573i.m23583a("realImChannel");
        }
        return aVar2;
    }

    /* renamed from: b */
    private static Aweme m99767b(SharePackage sharePackage) {
        String string = sharePackage.f20186l.getString("aid", "");
        if (string == null) {
            string = "";
        }
        return ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(string);
    }

    /* renamed from: a */
    public final void mo80288a(C32015a aVar) {
        C7573i.m23587b(aVar, "channel");
        this.f80245a = aVar;
    }

    public C30545a(C30552c cVar) {
        C7573i.m23587b(cVar, "provider");
        this.f80249e = cVar;
        View findViewById = this.f80249e.f80256b.findViewById(R.id.dn6);
        if (findViewById != null) {
            findViewById.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C30545a f80250a;

                {
                    this.f80250a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    View b = C30545a.m99765a(this.f80250a).mo82655b();
                    if (b == null || b.getVisibility() != 0) {
                        this.f80250a.f80249e.f80256b.cancel();
                    } else {
                        this.f80250a.mo80293a(true);
                    }
                }
            });
        }
        this.f80249e.f80257c.post(new Runnable(this) {

            /* renamed from: a */
            final /* synthetic */ C30545a f80251a;

            {
                this.f80251a = r1;
            }

            public final void run() {
                LayoutParams layoutParams = this.f80251a.f80249e.f80257c.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    this.f80251a.f80246b = this.f80251a.f80249e.f80257c.getHeight();
                    this.f80251a.f80247c = marginLayoutParams.topMargin;
                    this.f80251a.f80248d = marginLayoutParams.bottomMargin;
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        });
        C30559f.m99813a(this.f80249e.f80256b);
    }

    /* renamed from: b */
    private final boolean m99768b(boolean z) {
        C32015a aVar = this.f80245a;
        if (aVar == null) {
            C7573i.m23583a("realImChannel");
        }
        View b = aVar.mo82655b();
        if (b == null) {
            C7573i.m23580a();
        }
        if ((!z || b.getVisibility() != 0) && (z || b.getVisibility() == 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final void m99769c(boolean z) {
        C30552c cVar = this.f80249e;
        cVar.f80258d.setVisibility(8);
        if (z) {
            C32015a aVar = this.f80245a;
            if (aVar == null) {
                C7573i.m23583a("realImChannel");
            }
            aVar.mo82657d();
            cVar.f80257c.setVisibility(0);
            cVar.f80259e.setVisibility(0);
        } else {
            cVar.f80257c.setVisibility(8);
            cVar.f80259e.setVisibility(8);
        }
        C32015a aVar2 = this.f80245a;
        if (aVar2 == null) {
            C7573i.m23583a("realImChannel");
        }
        aVar2.mo82654a(z);
    }

    /* renamed from: d */
    private final void m99770d(boolean z) {
        ValueAnimator valueAnimator;
        int i = 0;
        if (z) {
            C32015a aVar = this.f80245a;
            if (aVar == null) {
                C7573i.m23583a("realImChannel");
            }
            aVar.mo82657d();
            valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, (float) this.f80246b});
            C7573i.m23582a((Object) valueAnimator, "ValueAnimator.ofFloat(0F…nChannelHeight.toFloat())");
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{(float) this.f80246b, 0.0f});
            C7573i.m23582a((Object) valueAnimator, "ValueAnimator.ofFloat(or…nnelHeight.toFloat(), 0F)");
        }
        View view = this.f80249e.f80259e;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        this.f80249e.f80256b.setCancelable(z);
        valueAnimator.addListener(new C30549b(this, z));
        valueAnimator.addUpdateListener(new C30550c(this));
        valueAnimator.setDuration(150);
        valueAnimator.start();
    }

    /* renamed from: a */
    public final void mo80291a(C38380c cVar) {
        C7573i.m23587b(cVar, "config");
        this.f80249e.mo80300a(cVar.f99636i);
        this.f80249e.f80261g = cVar.f99640m;
    }

    /* renamed from: a */
    public final void mo80293a(boolean z) {
        C30545a aVar;
        if (m99768b(z)) {
            aVar = this;
        } else {
            aVar = null;
        }
        C30545a aVar2 = aVar;
        if (aVar2 != null) {
            if (aVar2.m99766a()) {
                aVar2.m99769c(z);
            } else {
                aVar2.m99770d(z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo80294a(SharePackage sharePackage) {
        C7573i.m23587b(sharePackage, "sharePackage");
        if (C25352e.m83220c(m99767b(sharePackage))) {
            C10761a.m31399c(this.f80249e.f80255a, (int) R.string.e4).mo25750a();
            return false;
        }
        C38371b bVar = this.f80249e.f80261g;
        if (bVar != null) {
            return bVar.mo95709b(sharePackage);
        }
        return C32020a.m103998a(this, sharePackage);
    }

    /* renamed from: a */
    public final void mo80289a(IMContact iMContact, boolean z) {
        boolean z2;
        C7573i.m23587b(iMContact, "contact");
        C32015a aVar = this.f80245a;
        if (aVar == null) {
            C7573i.m23583a("realImChannel");
        }
        Collection c = aVar.mo82656c();
        if (c == null || c.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        mo80293a(z2);
    }

    /* renamed from: a */
    public final void mo80290a(SharePackage sharePackage, boolean z) {
        C7573i.m23587b(sharePackage, "sharePackage");
        C30551b.m99778a(this.f80249e.f80256b);
        if (C7573i.m23585a((Object) sharePackage.f20181g, (Object) "live")) {
            C10761a.m31383a(C6399b.m19921a(), (int) R.string.bpe).mo25750a();
        }
        Bundle bundle = sharePackage.f20186l;
        if (!C7573i.m23585a((Object) bundle.getString("is_star"), (Object) "1")) {
            bundle = null;
        }
        if (bundle != null) {
            C26682g gVar = C26682g.f70355a;
            String string = bundle.getString("author_id", "");
            C7573i.m23582a((Object) string, "it.getString(SharePackage.KEY_AUTHOR_ID, \"\")");
            gVar.mo68416a(string, 3);
        }
        C38371b bVar = this.f80249e.f80261g;
        if (bVar != null) {
            bVar.mo95707a(sharePackage);
        }
    }

    /* renamed from: a */
    public final void mo80292a(String str, SharePackage sharePackage) {
        C7573i.m23587b(str, "channel");
        C7573i.m23587b(sharePackage, "sharePackage");
        Aweme b = m99767b(sharePackage);
        if (C25352e.m83221d(b)) {
            C24976t.m82017W(this.f80249e.f80255a, b);
        }
        if (C7573i.m23585a((Object) str, (Object) "chat_merge")) {
            C30551b.m99778a(this.f80249e.f80256b);
        }
        C38371b bVar = this.f80249e.f80261g;
        if (bVar != null) {
            bVar.mo95708a(str, sharePackage);
        }
    }
}
