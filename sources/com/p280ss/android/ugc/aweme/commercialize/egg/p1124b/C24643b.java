package com.p280ss.android.ugc.aweme.commercialize.egg.p1124b;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.p702a.C13460a;
import com.facebook.fresco.animation.p707c.C13480a;
import com.facebook.fresco.animation.p707c.C13485b;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.splash.C41747l.C41750a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b */
public final class C24643b extends C24642a {

    /* renamed from: j */
    public static final C24644a f64988j = new C24644a(null);

    /* renamed from: a */
    public SimpleDraweeView f64989a;

    /* renamed from: b */
    public long f64990b;

    /* renamed from: c */
    public boolean f64991c;

    /* renamed from: k */
    private final Handler f64992k = new Handler();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$a */
    public static final class C24644a {
        private C24644a() {
        }

        public /* synthetic */ C24644a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$b */
    public static final class C24645b extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ C24643b f64993a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$b$a */
        public static final class C24646a implements C13485b {

            /* renamed from: a */
            final /* synthetic */ C24645b f64994a;

            /* renamed from: a */
            public final void mo33033a(C13480a aVar) {
                C7573i.m23587b(aVar, "drawable");
            }

            /* renamed from: a */
            public final void mo33034a(C13480a aVar, int i) {
                C7573i.m23587b(aVar, "drawable");
            }

            /* renamed from: c */
            public final void mo33036c(C13480a aVar) {
                C7573i.m23587b(aVar, "drawable");
            }

            C24646a(C24645b bVar) {
                this.f64994a = bVar;
            }

            /* renamed from: b */
            public final void mo33035b(C13480a aVar) {
                C7573i.m23587b(aVar, "drawable");
                this.f64994a.f64993a.mo64515d();
            }
        }

        C24645b(C24643b bVar) {
            this.f64993a = bVar;
        }

        public final void onFailure(String str, Throwable th) {
            String str2;
            C24638b bVar = this.f64993a.f64984f;
            if (bVar != null) {
                bVar.mo64489b();
            }
            C24643b bVar2 = this.f64993a;
            if (th != null) {
                str2 = th.getMessage();
            } else {
                str2 = null;
            }
            bVar2.mo64512a(str2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            try {
                this.f64993a.f64991c = true;
                C24638b bVar = this.f64993a.f64984f;
                if (bVar != null) {
                    bVar.mo64485a();
                }
                this.f64993a.mo64514c();
                if (animatable != null && (animatable instanceof C13480a)) {
                    C13480a aVar = (C13480a) animatable;
                    aVar.mo33016a((C13460a) new C41750a(aVar.f35749a, this.f64993a.f64985g));
                    aVar.mo33017a((C13485b) new C24646a(this));
                    animatable.start();
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("frescoOpenGifSplashError: e = ");
                sb.append(th);
                C42880h.m136156a(sb.toString());
                C6921a.m21559a(th);
                this.f64993a.mo64512a(th.getMessage());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$c */
    static final class C24647c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24638b f64995a;

        /* renamed from: b */
        final /* synthetic */ SimpleDraweeView f64996b;

        /* renamed from: c */
        final /* synthetic */ C24643b f64997c;

        /* renamed from: d */
        final /* synthetic */ String f64998d;

        C24647c(C24638b bVar, SimpleDraweeView simpleDraweeView, C24643b bVar2, String str) {
            this.f64995a = bVar;
            this.f64996b = simpleDraweeView;
            this.f64997c = bVar2;
            this.f64998d = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.f64997c.f64990b);
            C24638b bVar = this.f64995a;
            C7573i.m23582a((Object) view, "v");
            bVar.mo64486a(view, currentTimeMillis);
            this.f64997c.mo64515d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$d */
    static final class C24648d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24638b f64999a;

        /* renamed from: b */
        final /* synthetic */ C24643b f65000b;

        C24648d(C24638b bVar, C24643b bVar2) {
            this.f64999a = bVar;
            this.f65000b = bVar2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C24638b bVar = this.f64999a;
            View view2 = this.f65000b.f64989a;
            C7573i.m23582a((Object) view, "v");
            bVar.mo64487a(view2, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.b.b$e */
    static final class C24649e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24643b f65001a;

        C24649e(C24643b bVar) {
            this.f65001a = bVar;
        }

        public final void run() {
            this.f65001a.mo64515d();
        }
    }

    /* renamed from: e */
    private final C13400c<C13648f> m80798e() {
        return new C24645b<>(this);
    }

    /* renamed from: b */
    public final void mo64513b() {
        this.f64991c = false;
        this.f64992k.removeCallbacksAndMessages(null);
        mo64515d();
        if (this.f64989a != null) {
            this.f64987i.removeView(this.f64989a);
            this.f64989a = null;
        }
    }

    /* renamed from: d */
    public final void mo64515d() {
        this.f64991c = false;
        this.f64987i.setVisibility(8);
        SimpleDraweeView simpleDraweeView = this.f64989a;
        if (simpleDraweeView != null) {
            simpleDraweeView.setVisibility(8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64511a() {
        /*
            r6 = this;
            boolean r0 = r6.f64991c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.ugc.aweme.commercialize.egg.b r0 = r6.f64983e
            if (r0 != 0) goto L_0x0012
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = r6.f64984f
            if (r0 == 0) goto L_0x0011
            r0.mo64489b()
            return
        L_0x0011:
            return
        L_0x0012:
            java.lang.String r1 = r0.f64975a
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0024
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            if (r2 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = r6.f64984f
            if (r0 == 0) goto L_0x002e
            r0.mo64489b()
        L_0x002e:
            java.lang.String r0 = "materialUrl为空"
            r6.mo64512a(r0)
            return
        L_0x0034:
            boolean r2 = r0.f64978d
            android.net.Uri r5 = android.net.Uri.parse(r1)
            boolean r5 = com.p280ss.android.ugc.aweme.base.C23323e.m76518a(r5)
            if (r2 == 0) goto L_0x0055
            if (r2 == 0) goto L_0x0045
            if (r5 == 0) goto L_0x0045
            goto L_0x0055
        L_0x0045:
            r6.f64991c = r4
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = r6.f64984f
            if (r0 == 0) goto L_0x004e
            r0.mo64489b()
        L_0x004e:
            java.lang.String r0 = "preload失败"
            r6.mo64512a(r0)
            goto L_0x00cf
        L_0x0055:
            android.content.Context r2 = r6.f64982d
            r6.m80796a(r2, r1)
            com.ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout r1 = r6.f64987i
            r1.setVisibility(r4)
            com.facebook.drawee.view.SimpleDraweeView r1 = r6.f64989a
            if (r1 == 0) goto L_0x0066
            r1.setVisibility(r4)
        L_0x0066:
            com.facebook.drawee.view.SimpleDraweeView r1 = r6.f64989a
            if (r1 == 0) goto L_0x00c6
            com.facebook.drawee.view.SimpleDraweeView r1 = r6.f64989a
            if (r1 == 0) goto L_0x0071
            r1.bringToFront()
        L_0x0071:
            java.lang.String r0 = r0.f64976b
            int r1 = r0.hashCode()
            r2 = 102340(0x18fc4, float:1.43409E-40)
            if (r1 == r2) goto L_0x008b
            r2 = 3645340(0x379f9c, float:5.10821E-39)
            if (r1 == r2) goto L_0x0082
            goto L_0x00b8
        L_0x0082:
            java.lang.String r1 = "webp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b8
            goto L_0x0093
        L_0x008b:
            java.lang.String r1 = "gif"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b8
        L_0x0093:
            com.facebook.drawee.view.SimpleDraweeView r0 = r6.f64989a
            if (r0 == 0) goto L_0x00a2
            com.facebook.drawee.c.a r0 = r0.getController()
            if (r0 == 0) goto L_0x00a2
            android.graphics.drawable.Animatable r0 = r0.mo32721j()
            goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            if (r0 == 0) goto L_0x00ae
            boolean r1 = r0.isRunning()
            if (r1 != 0) goto L_0x00ae
            r0.start()
        L_0x00ae:
            boolean r0 = r6.f64986h
            if (r0 == 0) goto L_0x00bf
            r0 = 5000(0x1388, double:2.4703E-320)
            r6.m80795a(r0)
            goto L_0x00bf
        L_0x00b8:
            r6.f64991c = r3
            r0 = 3000(0xbb8, double:1.482E-320)
            r6.m80795a(r0)
        L_0x00bf:
            long r0 = java.lang.System.currentTimeMillis()
            r6.f64990b = r0
            return
        L_0x00c6:
            r6.f64991c = r4
            com.ss.android.ugc.aweme.commercialize.egg.a.b r0 = r6.f64984f
            if (r0 == 0) goto L_0x00d0
            r0.mo64489b()
        L_0x00cf:
            return
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.egg.p1124b.C24643b.mo64511a():void");
    }

    public C24643b(CommerceEggLayout commerceEggLayout) {
        C7573i.m23587b(commerceEggLayout, "eggLayout");
        super(commerceEggLayout);
    }

    /* renamed from: a */
    private static SimpleDraweeView m80794a(Context context) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setHierarchy(new C13439b(context.getResources()).mo32927e(C13423b.f35595c).mo32908a());
        return simpleDraweeView;
    }

    /* renamed from: a */
    private final void m80795a(long j) {
        this.f64992k.removeCallbacksAndMessages(null);
        this.f64992k.postDelayed(new C24649e(this), j);
    }

    /* renamed from: a */
    private final void m80796a(Context context, String str) {
        if (this.f64989a == null) {
            this.f64989a = m80794a(context);
            this.f64987i.addView(this.f64989a);
        }
        SimpleDraweeView simpleDraweeView = this.f64989a;
        if (simpleDraweeView != null) {
            C24638b bVar = this.f64984f;
            if (bVar != null) {
                bVar.mo64490b(simpleDraweeView, this.f64987i);
            }
            m80797a(simpleDraweeView, str);
            C24638b bVar2 = this.f64984f;
            if (bVar2 != null) {
                if (bVar2.mo64491c()) {
                    simpleDraweeView.setOnClickListener(new C24647c(bVar2, simpleDraweeView, this, str));
                } else {
                    simpleDraweeView.setOnClickListener(null);
                    simpleDraweeView.setClickable(false);
                }
            }
        }
        C24638b bVar3 = this.f64984f;
        if (bVar3 != null) {
            if (bVar3.mo64492d()) {
                this.f64987i.setOnClickListener(new C24648d(bVar3, this));
            } else {
                this.f64987i.setOnClickListener(null);
                this.f64987i.setClickable(false);
            }
        }
    }

    /* renamed from: a */
    private final void m80797a(SimpleDraweeView simpleDraweeView, String str) {
        simpleDraweeView.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32711a(str).mo32743a((C13401d<? super INFO>) m80798e())).mo32751c(true)).mo32730f());
    }
}
