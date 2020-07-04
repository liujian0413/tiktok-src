package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.rxutils.C3298g;
import com.bytedance.android.live.core.rxutils.C3306n;
import com.bytedance.android.live.core.rxutils.C3315q;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.android.livesdk.chatroom.utils.C5348i;
import com.bytedance.android.livesdk.chatroom.utils.LotteryResource;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.live.model.C8397a;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p397k.C8362l;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.schema.C8939m;
import com.bytedance.android.livesdk.schema.interfaces.C8934c;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdk.utils.C9084v;
import com.bytedance.android.livesdk.viewmodel.C9143f;
import com.bytedance.android.livesdk.viewmodel.ILotteryState;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C47563d;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

public final class LotteryBannerWidget extends LiveRecyclableWidget implements OnClickListener {

    /* renamed from: a */
    public C47562b f16223a = new C47562b();

    /* renamed from: b */
    private C47562b f16224b = new C47562b();

    /* renamed from: c */
    private C9143f f16225c;

    /* renamed from: d */
    private boolean f16226d;

    /* renamed from: e */
    private boolean f16227e = true;

    /* renamed from: f */
    private final C7319aa<String> f16228f = C9084v.m27125a((C7561a<Long>) C5462b.f16231a);

    /* renamed from: g */
    private C5461a f16229g = new C5461a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$a */
    public static final class C5461a implements C7321c {

        /* renamed from: a */
        private WeakReference<WebDialogFragment> f16230a = C5680dx.m18038a();

        C5461a() {
        }

        public final boolean isDisposed() {
            if (this.f16230a.get() == null) {
                return true;
            }
            return false;
        }

        public final void dispose() {
            WebDialogFragment webDialogFragment = (WebDialogFragment) this.f16230a.get();
            if (webDialogFragment != null) {
                webDialogFragment.dismissAllowingStateLoss();
            }
            this.f16230a = C5680dx.m18038a();
        }

        /* renamed from: a */
        public final void mo13933a(WebDialogFragment webDialogFragment) {
            C7573i.m23587b(webDialogFragment, "obj");
            if (!isDisposed()) {
                dispose();
            }
            this.f16230a = new WeakReference<>(webDialogFragment);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$b */
    static final class C5462b extends Lambda implements C7561a<Long> {

        /* renamed from: a */
        public static final C5462b f16231a = new C5462b();

        C5462b() {
            super(0);
        }

        /* renamed from: a */
        private static long m17688a() {
            C3338l<C8397a> lVar = LiveConfigSettingKeys.LOTTERY_CONFIG;
            C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.LOTTERY_CONFIG");
            return ((C8397a) lVar.mo10240a()).f23017f;
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(m17688a());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$c */
    static final class C5463c<T> implements C7326g<Pair<? extends ILotteryState, ? extends ILotteryState>> {

        /* renamed from: a */
        final /* synthetic */ LotteryBannerWidget f16232a;

        C5463c(LotteryBannerWidget lotteryBannerWidget) {
            this.f16232a = lotteryBannerWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Pair<? extends ILotteryState, ? extends ILotteryState> pair) {
            ILotteryState iLotteryState = (ILotteryState) pair.component1();
            ILotteryState iLotteryState2 = (ILotteryState) pair.component2();
            if (iLotteryState != null) {
                this.f16232a.f16223a.mo119660a();
            }
            this.f16232a.mo13930a(iLotteryState2);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$d */
    static final class C5464d<T> implements C7326g<C5730p> {

        /* renamed from: a */
        final /* synthetic */ LotteryBannerWidget f16233a;

        C5464d(LotteryBannerWidget lotteryBannerWidget) {
            this.f16233a = lotteryBannerWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C5730p pVar) {
            this.f16233a.mo13929a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$e */
    static final /* synthetic */ class C5465e extends FunctionReference implements C7562b<Long, String> {

        /* renamed from: a */
        public static final C5465e f16234a = new C5465e();

        C5465e() {
            super(1);
        }

        public final String getName() {
            return "second2SimpleString";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C9048ao.class);
        }

        public final String getSignature() {
            return "second2SimpleString(J)Ljava/lang/String;";
        }

        /* renamed from: a */
        private static String m17691a(long j) {
            return C9048ao.m27017a(j);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m17691a(((Number) obj).longValue());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$f */
    static final class C5466f<T> implements C7326g<Pair<? extends C1757f, ? extends C8362l>> {

        /* renamed from: a */
        final /* synthetic */ LotteryBannerWidget f16235a;

        /* renamed from: b */
        final /* synthetic */ LottieAnimationView f16236b;

        /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$f$a */
        public static final class C5468a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C5466f f16239a;

            /* renamed from: b */
            final /* synthetic */ IntRef f16240b;

            /* renamed from: c */
            final /* synthetic */ C7561a f16241c;

            public final void onAnimationEnd(Animator animator) {
                if (this.f16240b.element > 0) {
                    this.f16240b.element--;
                    this.f16241c.invoke();
                    return;
                }
                this.f16239a.f16236b.mo7079b((AnimatorListener) this);
            }

            C5468a(C5466f fVar, IntRef intRef, C7561a aVar) {
                this.f16239a = fVar;
                this.f16240b = intRef;
                this.f16241c = aVar;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$f$b */
        static final class C5469b extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C5466f f16242a;

            /* renamed from: b */
            final /* synthetic */ C8362l f16243b;

            /* renamed from: c */
            final /* synthetic */ C1757f f16244c;

            C5469b(C5466f fVar, C8362l lVar, C1757f fVar2) {
                this.f16242a = fVar;
                this.f16243b = lVar;
                this.f16244c = fVar2;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m17694a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m17694a() {
                C8362l lVar = this.f16243b;
                C1757f fVar = this.f16244c;
                LottieAnimationView lottieAnimationView = this.f16242a.f16236b;
                C7573i.m23582a((Object) lottieAnimationView, "lottieView");
                C5348i.m17059a(lVar, fVar, lottieAnimationView);
            }
        }

        C5466f(LotteryBannerWidget lotteryBannerWidget, LottieAnimationView lottieAnimationView) {
            this.f16235a = lotteryBannerWidget;
            this.f16236b = lottieAnimationView;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Pair<? extends C1757f, ? extends C8362l> pair) {
            C7561a bVar = new C5469b(this, (C8362l) pair.component2(), (C1757f) pair.component1());
            IntRef intRef = new IntRef();
            intRef.element = 2;
            final C5468a aVar = new C5468a(this, intRef, bVar);
            this.f16236b.mo7076a((AnimatorListener) aVar);
            LotteryBannerWidget lotteryBannerWidget = this.f16235a;
            C7321c a = C47563d.m148349a((C7323a) new C7323a(this) {

                /* renamed from: a */
                final /* synthetic */ C5466f f16237a;

                {
                    this.f16237a = r1;
                }

                /* renamed from: a */
                public final void mo8975a() {
                    this.f16237a.f16236b.mo7079b((AnimatorListener) aVar);
                }
            });
            C7573i.m23582a((Object) a, "Disposables.fromAction {…matorListener(listener) }");
            lotteryBannerWidget.mo13931a(a);
            bVar.invoke();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$g */
    static final class C5470g<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C5470g f16245a = new C5470g();

        C5470g() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m17695a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m17695a(Throwable th) {
            C8444d.m25673b();
            C7573i.m23582a((Object) th, "t");
            C8444d.m11969a(5, th.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LotteryBannerWidget$h */
    static final class C5471h<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ ILotteryState f16246a;

        C5471h(ILotteryState iLotteryState) {
            this.f16246a = iLotteryState;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(m17696a((Long) obj));
        }

        /* renamed from: a */
        private long m17696a(Long l) {
            C7573i.m23587b(l, "it");
            return ((LotteryWaiting) this.f16246a).getLocalDrawTime() - (System.currentTimeMillis() / 1000);
        }
    }

    public final int getLayoutId() {
        return R.layout.axl;
    }

    public final void onUnload() {
        C8444d.m25673b();
        C8444d.m11971b("ttlive_lottery", "onUnload");
        this.f16225c = null;
        this.f16223a.dispose();
        this.f16223a = new C47562b();
        this.f16224b.dispose();
        this.f16224b = new C47562b();
    }

    /* renamed from: a */
    public final void mo13929a() {
        C9143f fVar = this.f16225c;
        if (fVar != null) {
            ILotteryState iLotteryState = fVar.f24846a;
            if (iLotteryState != null) {
                String str = null;
                if (iLotteryState instanceof LotteryWaiting) {
                    C5680dx.m18040c();
                    if (this.f16226d) {
                        C3338l<C8397a> lVar = LiveConfigSettingKeys.LOTTERY_CONFIG;
                        if (lVar != null) {
                            C8397a aVar = (C8397a) lVar.mo10240a();
                            if (aVar != null) {
                                str = aVar.f23014c;
                            }
                        }
                    } else {
                        C3338l<C8397a> lVar2 = LiveConfigSettingKeys.LOTTERY_CONFIG;
                        if (lVar2 != null) {
                            C8397a aVar2 = (C8397a) lVar2.mo10240a();
                            if (aVar2 != null) {
                                str = aVar2.f23015d;
                            }
                        }
                    }
                } else {
                    str = "";
                }
                try {
                    Uri parse = Uri.parse(str);
                    C7573i.m23582a((Object) parse, "Uri.parse(uriString)");
                    Uri a = C5348i.m17057a(parse, iLotteryState);
                    boolean z = false;
                    C8934c handler = C9178j.m27302j().mo22380i().getHandler(a);
                    if (handler instanceof C8939m) {
                        BaseDialogFragment a2 = ((C8939m) handler).mo22086a(this.context, a);
                        if ((a2 instanceof WebDialogFragment) && (iLotteryState instanceof LotteryWaiting)) {
                            this.f16229g.mo13933a((WebDialogFragment) a2);
                            mo13931a((C7321c) this.f16229g);
                        }
                        if (a2 != null) {
                            z = true;
                        }
                    }
                    if (!z) {
                        C9178j.m27302j().mo22380i().handle(this.context, a);
                    }
                } catch (Throwable th) {
                    C8444d.m25673b();
                    C8444d.m11969a(5, th.getStackTrace());
                }
            }
        }
    }

    /* renamed from: b */
    private final boolean m17683b(C7321c cVar) {
        return this.f16224b.mo119661a(cVar);
    }

    /* renamed from: a */
    public final boolean mo13931a(C7321c cVar) {
        return this.f16223a.mo119661a(cVar);
    }

    public final void onClick(View view) {
        C8444d.m25673b();
        C8444d.m11971b("ttlive_lottery", "banner onClick");
        mo13929a();
    }

    public final void onInit(Object[] objArr) {
        C7321c a = this.f16228f.mo19122a(C3315q.m12390a()).mo19128a();
        C7573i.m23582a((Object) a, "lotteryAssetRoot.onError…mpat.never()).subscribe()");
        m17683b(a);
    }

    public final void onLoad(Object[] objArr) {
        C8444d.m25673b();
        C8444d.m11971b("ttlive_lottery", "onLoad");
        Object obj = this.dataCenter.get("data_is_anchor", Boolean.valueOf(false));
        C7573i.m23582a(obj, "dataCenter.get(WidgetCon…nt.DATA_IS_ANCHOR, false)");
        this.f16226d = ((Boolean) obj).booleanValue();
        Object obj2 = this.dataCenter.get("data_is_portrait", Boolean.valueOf(true));
        C7573i.m23582a(obj2, "dataCenter.get(WidgetCon…t.DATA_IS_PORTRAIT, true)");
        this.f16227e = ((Boolean) obj2).booleanValue();
        this.f16225c = (C9143f) this.dataCenter.get("data_lottery_data_model", null);
        C9143f fVar = this.f16225c;
        if (fVar != null) {
            C7321c f = C3306n.m12381a(fVar.mo22346b()).mo19325f((C7326g<? super T>) new C5463c<Object>(this));
            C7573i.m23582a((Object) f, "stateChanged().diff().su…Changed(to)\n            }");
            m17683b(f);
        }
        C7321c f2 = C9097a.m27146a().mo22266a(C5730p.class).mo19325f((C7326g<? super T>) new C5464d<Object>(this));
        C7573i.m23582a((Object) f2, "RxBus.getInstance().regi…doClickBanner()\n        }");
        m17683b(f2);
        this.contentView.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo13930a(ILotteryState iLotteryState) {
        int i;
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("banner onStateChanged to=");
        sb.append(iLotteryState);
        C8444d.m11970a("ttlive_lottery", sb.toString());
        View view = this.contentView;
        C7573i.m23582a((Object) view, "contentView");
        boolean z = iLotteryState instanceof LotteryWaiting;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (z) {
            TextView textView = (TextView) findViewById(R.id.a3e);
            C7492s d = C3298g.f10030a.mo10214a(0, 1, TimeUnit.SECONDS).mo19317d((C7327h<? super T, ? extends R>) new C5471h<Object,Object>(iLotteryState));
            C7573i.m23582a((Object) d, "timer");
            C7573i.m23582a((Object) textView, "countDownView");
            m17682a(d, C3306n.m12382a(textView), C5465e.f16234a);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.bw4);
            Context context = this.context;
            C7573i.m23582a((Object) context, "context");
            C7321c a = C5348i.m17058a(context, this.f16228f, LotteryResource.Banner).mo19129a((C7326g<? super T>) new C5466f<Object>(this, lottieAnimationView), (C7326g<? super Throwable>) C5470g.f16245a);
            C7573i.m23582a((Object) a, "loadLottie(context, lott…                       })");
            mo13931a(a);
            C5680dx.m18039b();
        }
    }

    /* renamed from: a */
    private final <S, T> void m17682a(C7492s<S> sVar, C7498y<T> yVar, C7562b<? super S, ? extends T> bVar) {
        mo13931a(C3306n.m12380a(sVar, yVar, bVar));
    }
}
