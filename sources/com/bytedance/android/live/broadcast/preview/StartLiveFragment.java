package com.bytedance.android.live.broadcast.preview;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.constraint.ConstraintLayout;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.broadcast.model.C2755e;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.p134e.C2567e.C2568a;
import com.bytedance.android.live.broadcast.widget.PreviewBeautyWidget;
import com.bytedance.android.live.broadcast.widget.PreviewBroadcastHelpWidget;
import com.bytedance.android.live.broadcast.widget.PreviewCloseWidget;
import com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget;
import com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget;
import com.bytedance.android.live.broadcast.widget.PreviewDouPlusWidget;
import com.bytedance.android.live.broadcast.widget.PreviewLocationWidget;
import com.bytedance.android.live.broadcast.widget.PreviewReverseCameraWidget;
import com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget;
import com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget;
import com.bytedance.android.live.broadcast.widget.StartLiveWidget;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9349d;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C9430a;
import com.bytedance.android.livesdkapi.plugin.PluginType;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public final class StartLiveFragment extends BaseFragment {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f8768a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "mCommodityMarginTopVideo", "getMCommodityMarginTopVideo()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "mCommodityMarginTopGame", "getMCommodityMarginTopGame()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "broadcastHelpWidget", "getBroadcastHelpWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewBroadcastHelpWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "previewBeautyWidget", "getPreviewBeautyWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewBeautyWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "previewCoverPickerWidget", "getPreviewCoverPickerWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewCoverPickerWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "previewSelectTitleWidget", "getPreviewSelectTitleWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewSelectTitleWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "previewLocationWidget", "getPreviewLocationWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewLocationWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "previewDouPlusWidget", "getPreviewDouPlusWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewDouPlusWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "previewCloseWidget", "getPreviewCloseWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewCloseWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "previewReverseCameraWidget", "getPreviewReverseCameraWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewReverseCameraWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "selectLiveTypeWidget", "getSelectLiveTypeWidget()Lcom/bytedance/android/live/broadcast/widget/SelectLiveTypeWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "startLiveWidget", "getStartLiveWidget()Lcom/bytedance/android/live/broadcast/widget/StartLiveWidget;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(StartLiveFragment.class), "previewCommodityWidget", "getPreviewCommodityWidget()Lcom/bytedance/android/live/broadcast/widget/PreviewCommodityWidget;"))};

    /* renamed from: f */
    public static final C2773a f8769f = new C2773a(null);

    /* renamed from: A */
    private final C7541d f8770A = C7546e.m23569a(C2789o.f8808a);

    /* renamed from: B */
    private HashMap f8771B;

    /* renamed from: b */
    public C9349d f8772b;

    /* renamed from: c */
    public final Handler f8773c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public int f8774d;

    /* renamed from: e */
    public C9245h f8775e;

    /* renamed from: g */
    private WidgetManager f8776g;

    /* renamed from: h */
    private C7321c f8777h;

    /* renamed from: i */
    private View f8778i;

    /* renamed from: j */
    private final C7541d f8779j = C7546e.m23569a(C2780f.f8799a);

    /* renamed from: k */
    private final C7541d f8780k = C7546e.m23569a(C2779e.f8798a);

    /* renamed from: l */
    private final C7541d f8781l = C7546e.m23569a(new C2796v(this));

    /* renamed from: m */
    private final C7541d f8782m = C7546e.m23569a(new C2775c(this));

    /* renamed from: q */
    private final C7541d f8783q = C7546e.m23569a(C2774b.f8793a);

    /* renamed from: r */
    private final C7541d f8784r = C7546e.m23569a(C2787m.f8806a);

    /* renamed from: s */
    private final C7541d f8785s = C7546e.m23569a(C2790p.f8809a);

    /* renamed from: t */
    private final C7541d f8786t = C7546e.m23569a(C2794t.f8813a);

    /* renamed from: u */
    private final C7541d f8787u = C7546e.m23569a(C2792r.f8811a);

    /* renamed from: v */
    private final C7541d f8788v = C7546e.m23569a(C2791q.f8810a);

    /* renamed from: w */
    private final C7541d f8789w = C7546e.m23569a(C2788n.f8807a);

    /* renamed from: x */
    private final C7541d f8790x = C7546e.m23569a(C2793s.f8812a);

    /* renamed from: y */
    private final C7541d f8791y = C7546e.m23569a(C2795u.f8814a);

    /* renamed from: z */
    private final C7541d f8792z = C7546e.m23569a(new C2797w(this));

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$a */
    public static final class C2773a {
        private C2773a() {
        }

        public /* synthetic */ C2773a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$b */
    static final class C2774b extends Lambda implements C7561a<PreviewBroadcastHelpWidget> {

        /* renamed from: a */
        public static final C2774b f8793a = new C2774b();

        C2774b() {
            super(0);
        }

        /* renamed from: a */
        private static PreviewBroadcastHelpWidget m11079a() {
            return new PreviewBroadcastHelpWidget();
        }

        public final /* synthetic */ Object invoke() {
            return m11079a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$c */
    static final class C2775c extends Lambda implements C7561a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ StartLiveFragment f8794a;

        C2775c(StartLiveFragment startLiveFragment) {
            this.f8794a = startLiveFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveEventViewModel invoke() {
            Context context = this.f8794a.getContext();
            if (context != null) {
                return (StartLiveEventViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveEventViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$d */
    public static final class C2776d implements C9430a {

        /* renamed from: a */
        final /* synthetic */ StartLiveFragment f8795a;

        /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$d$a */
        static final class C2777a implements OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C2776d f8796a;

            C2777a(C2776d dVar) {
                this.f8796a = dVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                if (!LiveCameraResManager.INST.isLoadedRes()) {
                    if (this.f8796a.f8795a.f8772b != null) {
                        C9349d dVar = this.f8796a.f8795a.f8772b;
                        if (dVar != null) {
                            dVar.mo9581a();
                        }
                    } else if (this.f8796a.f8795a.getActivity() != null) {
                        FragmentActivity activity = this.f8796a.f8795a.getActivity();
                        if (activity == null) {
                            C7573i.m23580a();
                        }
                        activity.finish();
                    }
                }
            }
        }

        /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$d$b */
        static final class C2778b<T> implements C0053p<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C2776d f8797a;

            C2778b(C2776d dVar) {
                this.f8797a = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(Boolean bool) {
                if (bool == null || !bool.booleanValue()) {
                    if (this.f8797a.f8795a.f8774d > 3) {
                        if (this.f8797a.f8795a.mo8989l()) {
                            C9049ap.m27022a((int) R.string.f3w);
                        }
                        C9245h hVar = this.f8797a.f8795a.f8775e;
                        if (hVar != null && hVar.isShowing()) {
                            C9245h hVar2 = this.f8797a.f8795a.f8775e;
                            if (hVar2 != null) {
                                hVar2.dismiss();
                            } else {
                                return;
                            }
                        }
                    } else {
                        LiveCameraResManager.INST.loadResources();
                        this.f8797a.f8795a.f8774d++;
                    }
                    return;
                }
                C9245h hVar3 = this.f8797a.f8795a.f8775e;
                if (hVar3 != null && hVar3.isShowing()) {
                    C9245h hVar4 = this.f8797a.f8795a.f8775e;
                    if (hVar4 != null) {
                        hVar4.dismiss();
                    }
                }
                this.f8797a.f8795a.mo9472a();
            }
        }

        C2776d(StartLiveFragment startLiveFragment) {
            this.f8795a = startLiveFragment;
        }

        /* renamed from: a */
        public final void mo8840a(String str) {
            C7573i.m23587b(str, "packageName");
            if (!C2913i.m11397a(this.f8795a.getContext())) {
                C3517a.m12960a(this.f8795a.getContext(), (int) R.string.efr);
            } else if (NetworkUtils.m19550d(this.f8795a.getContext()) == NetworkType.MOBILE_2G) {
                C3517a.m12960a(this.f8795a.getContext(), (int) R.string.f8e);
            } else {
                PluginType.LiveResource.preload();
                PluginType.LiveResource.load(this.f8795a.getContext(), true);
                if (this.f8795a.getContext() != null && !LiveCameraResManager.INST.isLoadedRes()) {
                    PluginType.LiveResource.preload();
                    if (this.f8795a.f8775e == null) {
                        this.f8795a.f8775e = new C9249a(this.f8795a.getContext(), 2).mo22713a((OnDismissListener) new C2777a(this)).mo22729d();
                    }
                    LiveCameraResManager.INST.isLoadedRes.observe(this.f8795a, new C2778b(this));
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$e */
    static final class C2779e extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C2779e f8798a = new C2779e();

        C2779e() {
            super(0);
        }

        /* renamed from: a */
        private static int m11083a() {
            return C3358ac.m12510a(104.0f);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m11083a());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$f */
    static final class C2780f extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C2780f f8799a = new C2780f();

        C2780f() {
            super(0);
        }

        /* renamed from: a */
        private static int m11084a() {
            return C3358ac.m12510a(181.0f);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m11084a());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$g */
    static final class C2781g<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ StartLiveFragment f8800a;

        C2781g(StartLiveFragment startLiveFragment) {
            this.f8800a = startLiveFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            StartLiveFragment startLiveFragment = this.f8800a;
            if (num == null) {
                num = Integer.valueOf(0);
            }
            startLiveFragment.mo9473a(num.intValue());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$h */
    static final class C2782h<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ StartLiveFragment f8801a;

        C2782h(StartLiveFragment startLiveFragment) {
            this.f8801a = startLiveFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            this.f8801a.mo9476b();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$i */
    static final class C2783i<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ StartLiveFragment f8802a;

        C2783i(StartLiveFragment startLiveFragment) {
            this.f8802a = startLiveFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                C9349d dVar = this.f8802a.f8772b;
                if (dVar != null) {
                    C7573i.m23582a((Object) num, "it");
                    dVar.mo9583a(num.intValue());
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$j */
    static final class C2784j<T> implements C0053p<LiveMode> {

        /* renamed from: a */
        final /* synthetic */ StartLiveFragment f8803a;

        C2784j(StartLiveFragment startLiveFragment) {
            this.f8803a = startLiveFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveMode liveMode) {
            this.f8803a.mo9475a(liveMode);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$k */
    static final class C2785k<T> implements C7326g<C3479d<C2755e>> {

        /* renamed from: a */
        final /* synthetic */ StartLiveFragment f8804a;

        C2785k(StartLiveFragment startLiveFragment) {
            this.f8804a = startLiveFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C2755e> dVar) {
            this.f8804a.mo9474a(dVar);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$l */
    static final class C2786l<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C2786l f8805a = new C2786l();

        C2786l() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m11090a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m11090a(Throwable th) {
            C7573i.m23582a((Object) th, "throwable");
            C3166a.m11955a(6, "StartLiveFragment", th.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$m */
    static final class C2787m extends Lambda implements C7561a<PreviewBeautyWidget> {

        /* renamed from: a */
        public static final C2787m f8806a = new C2787m();

        C2787m() {
            super(0);
        }

        /* renamed from: a */
        private static PreviewBeautyWidget m11091a() {
            return new PreviewBeautyWidget();
        }

        public final /* synthetic */ Object invoke() {
            return m11091a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$n */
    static final class C2788n extends Lambda implements C7561a<PreviewCloseWidget> {

        /* renamed from: a */
        public static final C2788n f8807a = new C2788n();

        C2788n() {
            super(0);
        }

        /* renamed from: a */
        private static PreviewCloseWidget m11092a() {
            return new PreviewCloseWidget();
        }

        public final /* synthetic */ Object invoke() {
            return m11092a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$o */
    static final class C2789o extends Lambda implements C7561a<PreviewCommodityWidget> {

        /* renamed from: a */
        public static final C2789o f8808a = new C2789o();

        C2789o() {
            super(0);
        }

        /* renamed from: a */
        private static PreviewCommodityWidget m11093a() {
            return new PreviewCommodityWidget();
        }

        public final /* synthetic */ Object invoke() {
            return m11093a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$p */
    static final class C2790p extends Lambda implements C7561a<PreviewCoverPickerWidget> {

        /* renamed from: a */
        public static final C2790p f8809a = new C2790p();

        C2790p() {
            super(0);
        }

        /* renamed from: a */
        private static PreviewCoverPickerWidget m11094a() {
            return new PreviewCoverPickerWidget();
        }

        public final /* synthetic */ Object invoke() {
            return m11094a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$q */
    static final class C2791q extends Lambda implements C7561a<PreviewDouPlusWidget> {

        /* renamed from: a */
        public static final C2791q f8810a = new C2791q();

        C2791q() {
            super(0);
        }

        /* renamed from: a */
        private static PreviewDouPlusWidget m11095a() {
            return new PreviewDouPlusWidget();
        }

        public final /* synthetic */ Object invoke() {
            return m11095a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$r */
    static final class C2792r extends Lambda implements C7561a<PreviewLocationWidget> {

        /* renamed from: a */
        public static final C2792r f8811a = new C2792r();

        C2792r() {
            super(0);
        }

        /* renamed from: a */
        private static PreviewLocationWidget m11096a() {
            return new PreviewLocationWidget();
        }

        public final /* synthetic */ Object invoke() {
            return m11096a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$s */
    static final class C2793s extends Lambda implements C7561a<PreviewReverseCameraWidget> {

        /* renamed from: a */
        public static final C2793s f8812a = new C2793s();

        C2793s() {
            super(0);
        }

        /* renamed from: a */
        private static PreviewReverseCameraWidget m11097a() {
            return new PreviewReverseCameraWidget();
        }

        public final /* synthetic */ Object invoke() {
            return m11097a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$t */
    static final class C2794t extends Lambda implements C7561a<PreviewSelectTitleWidget> {

        /* renamed from: a */
        public static final C2794t f8813a = new C2794t();

        C2794t() {
            super(0);
        }

        /* renamed from: a */
        private static PreviewSelectTitleWidget m11098a() {
            return new PreviewSelectTitleWidget();
        }

        public final /* synthetic */ Object invoke() {
            return m11098a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$u */
    static final class C2795u extends Lambda implements C7561a<SelectLiveTypeWidget> {

        /* renamed from: a */
        public static final C2795u f8814a = new C2795u();

        C2795u() {
            super(0);
        }

        /* renamed from: a */
        private static SelectLiveTypeWidget m11099a() {
            return new SelectLiveTypeWidget();
        }

        public final /* synthetic */ Object invoke() {
            return m11099a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$v */
    static final class C2796v extends Lambda implements C7561a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ StartLiveFragment f8815a;

        C2796v(StartLiveFragment startLiveFragment) {
            this.f8815a = startLiveFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveViewModel invoke() {
            Context context = this.f8815a.getContext();
            if (context != null) {
                return (StartLiveViewModel) C0069x.m159a((FragmentActivity) context).mo147a(StartLiveViewModel.class);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$w */
    static final class C2797w extends Lambda implements C7561a<StartLiveWidget> {

        /* renamed from: a */
        final /* synthetic */ StartLiveFragment f8816a;

        C2797w(StartLiveFragment startLiveFragment) {
            this.f8816a = startLiveFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public StartLiveWidget invoke() {
            return new StartLiveWidget(this.f8816a);
        }
    }

    /* renamed from: b */
    private View m11055b(int i) {
        if (this.f8771B == null) {
            this.f8771B = new HashMap();
        }
        View view = (View) this.f8771B.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f8771B.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    private final int m11056d() {
        return ((Number) this.f8779j.getValue()).intValue();
    }

    /* renamed from: e */
    private final int m11057e() {
        return ((Number) this.f8780k.getValue()).intValue();
    }

    /* renamed from: f */
    private final StartLiveViewModel m11058f() {
        return (StartLiveViewModel) this.f8781l.getValue();
    }

    /* renamed from: g */
    private final StartLiveEventViewModel m11059g() {
        return (StartLiveEventViewModel) this.f8782m.getValue();
    }

    /* renamed from: h */
    private final PreviewBroadcastHelpWidget m11060h() {
        return (PreviewBroadcastHelpWidget) this.f8783q.getValue();
    }

    /* renamed from: i */
    private final PreviewBeautyWidget m11061i() {
        return (PreviewBeautyWidget) this.f8784r.getValue();
    }

    /* renamed from: j */
    private final PreviewCoverPickerWidget m11062j() {
        return (PreviewCoverPickerWidget) this.f8785s.getValue();
    }

    /* renamed from: k */
    private final PreviewSelectTitleWidget m11063k() {
        return (PreviewSelectTitleWidget) this.f8786t.getValue();
    }

    /* renamed from: m */
    private final PreviewLocationWidget m11064m() {
        return (PreviewLocationWidget) this.f8787u.getValue();
    }

    /* renamed from: n */
    private final PreviewDouPlusWidget m11065n() {
        return (PreviewDouPlusWidget) this.f8788v.getValue();
    }

    /* renamed from: o */
    private final PreviewCloseWidget m11066o() {
        return (PreviewCloseWidget) this.f8789w.getValue();
    }

    /* renamed from: p */
    private final PreviewReverseCameraWidget m11067p() {
        return (PreviewReverseCameraWidget) this.f8790x.getValue();
    }

    /* renamed from: q */
    private final SelectLiveTypeWidget m11068q() {
        return (SelectLiveTypeWidget) this.f8791y.getValue();
    }

    /* renamed from: r */
    private final StartLiveWidget m11069r() {
        return (StartLiveWidget) this.f8792z.getValue();
    }

    /* renamed from: s */
    private final PreviewCommodityWidget m11070s() {
        return (PreviewCommodityWidget) this.f8770A.getValue();
    }

    /* renamed from: t */
    private static void m11071t() {
        C8443c.m25663a();
    }

    /* renamed from: u */
    private void m11072u() {
        if (this.f8771B != null) {
            this.f8771B.clear();
        }
    }

    /* renamed from: a */
    public final void mo9472a() {
        m11061i().mo9808b();
    }

    /* renamed from: b */
    public final void mo9476b() {
        C9349d dVar = this.f8772b;
        if (dVar != null) {
            dVar.mo9581a();
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C9245h hVar = this.f8775e;
        if (hVar != null && hVar.isShowing()) {
            C9245h hVar2 = this.f8775e;
            if (hVar2 != null) {
                hVar2.dismiss();
            }
        }
        m11072u();
    }

    public final void onResume() {
        super.onResume();
        C8947c<Long> cVar = C8946b.f24494x;
        C7573i.m23582a((Object) cVar, "LivePluginProperties.CURRENT_PREVIEW_START_TIME");
        cVar.mo22120b(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* renamed from: c */
    public final boolean mo9477c() {
        boolean isInstalled = PluginType.LiveResource.isInstalled();
        if (isInstalled) {
            PluginType.LiveResource.load(getContext(), true);
            LiveCameraResManager.INST.loadResources();
            mo9472a();
        } else if (!C2912h.m11396a(getContext())) {
            C3517a.m12960a(getContext(), (int) R.string.efr);
            return false;
        } else if (NetworkUtils.m19550d(getContext()) == NetworkType.MOBILE_2G) {
            C3517a.m12960a(getContext(), (int) R.string.f8e);
            return false;
        } else {
            PluginType.LiveResource.checkInstall(getContext(), new C2776d(this));
        }
        return isInstalled;
    }

    public final void onStop() {
        super.onStop();
        C8947c<Long> cVar = C8946b.f24494x;
        C7573i.m23582a((Object) cVar, "LivePluginProperties.CURRENT_PREVIEW_START_TIME");
        if (((Number) cVar.mo22119b()).longValue() > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C8947c<Long> cVar2 = C8946b.f24494x;
            C7573i.m23582a((Object) cVar2, "LivePluginProperties.CURRENT_PREVIEW_START_TIME");
            Object b = cVar2.mo22119b();
            C7573i.m23582a(b, "LivePluginProperties.CUR…EW_START_TIME.commonValue");
            long longValue = (elapsedRealtime - ((Number) b).longValue()) / 1000;
            if (longValue > 0) {
                Map hashMap = new HashMap();
                hashMap.put("duration", String.valueOf(longValue));
                C8443c.m25663a().mo21606a("livesdk_live_takepage_stay_duration", hashMap, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo9474a(C3479d<C2755e> dVar) {
        if (dVar != null) {
            m11058f().mo9592a().postValue(dVar.data);
        }
    }

    /* renamed from: a */
    public final void mo9473a(int i) {
        switch (i) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) m11055b(R.id.cj5);
                C7573i.m23582a((Object) frameLayout, "preview_room_info_container");
                frameLayout.setVisibility(0);
                FrameLayout frameLayout2 = (FrameLayout) m11055b(R.id.da2);
                C7573i.m23582a((Object) frameLayout2, "start_live_container");
                frameLayout2.setVisibility(0);
                FrameLayout frameLayout3 = (FrameLayout) m11055b(R.id.d2d);
                C7573i.m23582a((Object) frameLayout3, "select_live_type_container");
                frameLayout3.setVisibility(0);
                return;
            case 1:
                return;
            case 2:
                FrameLayout frameLayout4 = (FrameLayout) m11055b(R.id.cj5);
                C7573i.m23582a((Object) frameLayout4, "preview_room_info_container");
                frameLayout4.setVisibility(4);
                FrameLayout frameLayout5 = (FrameLayout) m11055b(R.id.da2);
                C7573i.m23582a((Object) frameLayout5, "start_live_container");
                frameLayout5.setVisibility(4);
                FrameLayout frameLayout6 = (FrameLayout) m11055b(R.id.d2d);
                C7573i.m23582a((Object) frameLayout6, "select_live_type_container");
                frameLayout6.setVisibility(4);
                break;
        }
    }

    /* renamed from: a */
    public final void mo9475a(LiveMode liveMode) {
        boolean z;
        View view = this.f8778i;
        boolean z2 = true;
        if (view != null) {
            if (liveMode != LiveMode.VIDEO) {
                z = true;
            } else {
                z = false;
            }
            view.setClickable(z);
        }
        C9349d dVar = this.f8772b;
        if (dVar != null) {
            if (liveMode == LiveMode.VIDEO) {
                z2 = false;
            }
            dVar.mo9584a(z2);
        }
        FrameLayout frameLayout = (FrameLayout) m11055b(R.id.a0q);
        C7573i.m23582a((Object) frameLayout, "commodity_container");
        LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (liveMode == LiveMode.VIDEO) {
                FrameLayout frameLayout2 = (FrameLayout) m11055b(R.id.csj);
                C7573i.m23582a((Object) frameLayout2, "reverse_camera_container");
                frameLayout2.setVisibility(0);
                FrameLayout frameLayout3 = (FrameLayout) m11055b(R.id.ky);
                C7573i.m23582a((Object) frameLayout3, "beauty_container");
                frameLayout3.setVisibility(0);
                FrameLayout frameLayout4 = (FrameLayout) m11055b(R.id.ox);
                C7573i.m23582a((Object) frameLayout4, "broadcast_help_container");
                frameLayout4.setVisibility(4);
                layoutParams2.topMargin = m11056d();
            } else if (liveMode == LiveMode.THIRD_PARTY) {
                FrameLayout frameLayout5 = (FrameLayout) m11055b(R.id.csj);
                C7573i.m23582a((Object) frameLayout5, "reverse_camera_container");
                frameLayout5.setVisibility(4);
                FrameLayout frameLayout6 = (FrameLayout) m11055b(R.id.ky);
                C7573i.m23582a((Object) frameLayout6, "beauty_container");
                frameLayout6.setVisibility(4);
                FrameLayout frameLayout7 = (FrameLayout) m11055b(R.id.ox);
                C7573i.m23582a((Object) frameLayout7, "broadcast_help_container");
                frameLayout7.setVisibility(0);
                layoutParams2.topMargin = m11057e();
            }
            FrameLayout frameLayout8 = (FrameLayout) m11055b(R.id.a0q);
            C7573i.m23582a((Object) frameLayout8, "commodity_container");
            frameLayout8.setLayoutParams(layoutParams2);
            Map hashMap = new HashMap();
            String str = "live_type";
            if (liveMode == null) {
                C7573i.m23580a();
            }
            hashMap.put(str, C2568a.m10552a(liveMode));
            C8443c.m25663a().mo21606a("livesdk_pm_live_takepage_show", hashMap, new Object[0]);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        C9349d dVar = this.f8772b;
        if (dVar != null) {
            dVar.mo9585b();
        }
        m11071t();
        WidgetManager of = WidgetManager.m32095of((Fragment) this, view);
        C7573i.m23582a((Object) of, "WidgetManager.of(this, view)");
        this.f8776g = of;
        WidgetManager widgetManager = this.f8776g;
        if (widgetManager == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager.load(R.id.ox, m11060h());
        FrameLayout frameLayout = (FrameLayout) m11055b(R.id.ox);
        C7573i.m23582a((Object) frameLayout, "broadcast_help_container");
        frameLayout.setVisibility(8);
        WidgetManager widgetManager2 = this.f8776g;
        if (widgetManager2 == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager2.load(R.id.dos, m11063k());
        WidgetManager widgetManager3 = this.f8776g;
        if (widgetManager3 == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager3.load(R.id.doo, m11062j());
        WidgetManager widgetManager4 = this.f8776g;
        if (widgetManager4 == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager4.load(R.id.doq, m11064m());
        WidgetManager widgetManager5 = this.f8776g;
        if (widgetManager5 == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager5.load(R.id.dop, m11065n());
        WidgetManager widgetManager6 = this.f8776g;
        if (widgetManager6 == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager6.load(R.id.xs, m11066o());
        WidgetManager widgetManager7 = this.f8776g;
        if (widgetManager7 == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager7.load(R.id.csj, m11067p());
        WidgetManager widgetManager8 = this.f8776g;
        if (widgetManager8 == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager8.load(R.id.d2d, m11068q());
        WidgetManager widgetManager9 = this.f8776g;
        if (widgetManager9 == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager9.load(R.id.da2, m11069r());
        WidgetManager widgetManager10 = this.f8776g;
        if (widgetManager10 == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager10.load(R.id.ky, m11061i());
        WidgetManager widgetManager11 = this.f8776g;
        if (widgetManager11 == null) {
            C7573i.m23583a("widgetManager");
        }
        widgetManager11.load(R.id.a0q, m11070s());
        m11063k().mo9845a(this.f8778i);
        m11062j().mo9827a((BaseFragment) this);
        C0043i iVar = this;
        m11059g().mo9471e().observe(iVar, new C2781g(this));
        m11059g().mo9467a().observe(iVar, new C2782h(this));
        m11058f().mo9598e().observe(iVar, new C2783i(this));
        m11058f().mo9597d().observe(iVar, new C2784j(this));
        this.f8777h = C2515f.m10417f().mo9076c().mo9169d().getPreviewRoomCreateInfo().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C2785k<Object>(this), (C7326g<? super Throwable>) C2786l.f8805a);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m11062j().onActivityResult(i, i2, intent);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        this.f8778i = layoutInflater.inflate(R.layout.aqt, viewGroup, false);
        return this.f8778i;
    }
}
