package com.bytedance.android.live.wallet.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3693c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.adapter.ReChargeListAdapter.C3624b;
import com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip;
import com.bytedance.android.live.wallet.dialog.WorldPayInputDialogFragment;
import com.bytedance.android.live.wallet.dialog.WorldPayInputDialogFragment.C3730a;
import com.bytedance.android.live.wallet.model.C3822h;
import com.bytedance.android.live.wallet.p178b.p179a.C3648d;
import com.bytedance.android.live.wallet.p178b.p180b.C3671c;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdk.utils.C9053at;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.json.JSONObject;
import p346io.reactivex.C7494t;
import p346io.reactivex.p348d.C7326g;

public final class MyDiamondFragment extends BaseFragment implements C3671c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f11259a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MyDiamondFragment.class), "extJson", "getExtJson()Lorg/json/JSONObject;"))};

    /* renamed from: g */
    public static final C3787a f11260g = new C3787a(null);

    /* renamed from: b */
    public C3648d f11261b;

    /* renamed from: c */
    public ProgressDialog f11262c;

    /* renamed from: d */
    public List<? extends C3822h> f11263d;

    /* renamed from: e */
    public ChargeDeal f11264e;

    /* renamed from: f */
    public PayChannel f11265f;

    /* renamed from: h */
    private boolean f11266h;

    /* renamed from: i */
    private final C7541d f11267i = C7546e.m23569a(C3788b.f11270a);

    /* renamed from: j */
    private TextView f11268j;

    /* renamed from: k */
    private HashMap f11269k;

    /* renamed from: com.bytedance.android.live.wallet.fragment.MyDiamondFragment$a */
    public static final class C3787a {
        private C3787a() {
        }

        public /* synthetic */ C3787a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MyDiamondFragment m13546a(Bundle bundle) {
            MyDiamondFragment myDiamondFragment = new MyDiamondFragment();
            if (bundle != null) {
                myDiamondFragment.setArguments(bundle);
            }
            return myDiamondFragment;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.fragment.MyDiamondFragment$b */
    static final class C3788b extends Lambda implements C7561a<JSONObject> {

        /* renamed from: a */
        public static final C3788b f11270a = new C3788b();

        C3788b() {
            super(0);
        }

        /* renamed from: a */
        private static JSONObject m13547a() {
            return new JSONObject();
        }

        public final /* synthetic */ Object invoke() {
            return m13547a();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.fragment.MyDiamondFragment$c */
    static final class C3789c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyDiamondFragment f11271a;

        C3789c(MyDiamondFragment myDiamondFragment) {
            this.f11271a = myDiamondFragment;
        }

        public final void onClick(View view) {
            C3648d dVar = this.f11271a.f11261b;
            if (dVar != null) {
                dVar.mo11107b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.fragment.MyDiamondFragment$d */
    static final class C3790d implements OnClickListener {

        /* renamed from: a */
        public static final C3790d f11272a = new C3790d();

        C3790d() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.fragment.MyDiamondFragment$e */
    static final class C3791e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyDiamondFragment f11273a;

        C3791e(MyDiamondFragment myDiamondFragment) {
            this.f11273a = myDiamondFragment;
        }

        public final void onClick(View view) {
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(this.f11273a.getContext(), C3979c.m13952b("https://m.helo-app.com/magic/page/ejs/5cf7382f4a9c33022159d5a6?appType=Helo"));
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.fragment.MyDiamondFragment$f */
    static final class C3792f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyDiamondFragment f11274a;

        C3792f(MyDiamondFragment myDiamondFragment) {
            this.f11274a = myDiamondFragment;
        }

        public final void onClick(View view) {
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(this.f11274a.getContext(), C3979c.m13952b("https://webcast-helo.sgsnssdk.com/falcon/webcast_helo/page/record/recharge/index.html").mo11550a(C3358ac.m12515a((int) R.string.faq)));
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.fragment.MyDiamondFragment$g */
    static final class C3793g<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ MyDiamondFragment f11275a;

        /* renamed from: b */
        final /* synthetic */ View f11276b;

        C3793g(MyDiamondFragment myDiamondFragment, View view) {
            this.f11275a = myDiamondFragment;
            this.f11276b = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            MyDiamondFragment myDiamondFragment = this.f11275a;
            View view = this.f11276b;
            C7573i.m23582a((Object) view, "rootView");
            myDiamondFragment.mo11277a(view);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.fragment.MyDiamondFragment$h */
    public static final class C3794h implements C3624b {

        /* renamed from: a */
        final /* synthetic */ MyDiamondFragment f11277a;

        /* renamed from: com.bytedance.android.live.wallet.fragment.MyDiamondFragment$h$a */
        static final class C3795a implements C3730a {

            /* renamed from: a */
            final /* synthetic */ C3794h f11278a;

            /* renamed from: b */
            final /* synthetic */ ChargeDeal f11279b;

            /* renamed from: c */
            final /* synthetic */ PayChannel f11280c;

            C3795a(C3794h hVar, ChargeDeal chargeDeal, PayChannel payChannel) {
                this.f11278a = hVar;
                this.f11279b = chargeDeal;
                this.f11280c = payChannel;
            }

            /* renamed from: a */
            public final void mo11225a(String str) {
                C7573i.m23587b(str, "email");
                C3648d dVar = this.f11278a.f11277a.f11261b;
                if (dVar != null) {
                    dVar.mo11106a(this.f11279b, this.f11280c, str);
                }
            }
        }

        C3794h(MyDiamondFragment myDiamondFragment) {
            this.f11277a = myDiamondFragment;
        }

        /* renamed from: a */
        public final void mo11066a(PayChannel payChannel, ChargeDeal chargeDeal, int i) {
            String str;
            C7573i.m23587b(payChannel, "channel");
            C7573i.m23587b(chargeDeal, "deal");
            this.f11277a.f11264e = chargeDeal;
            this.f11277a.f11265f = payChannel;
            Map hashMap = new HashMap();
            hashMap.put("money", String.valueOf(chargeDeal.f25519e + chargeDeal.f25520f));
            hashMap.put("request_page", "my_profile");
            String str2 = "pay_method";
            if (payChannel == PayChannel.GOOGLE) {
                str = "google_pay";
            } else {
                str = payChannel.getValue();
            }
            C7573i.m23582a((Object) str, "if (channel == PayChanne…l.value\n                }");
            hashMap.put(str2, str);
            C8443c.m25663a().mo21606a("livesdk_recharge_click", hashMap, new Object[0]);
            switch (C3800a.f11288a[payChannel.ordinal()]) {
                case 1:
                    C3648d dVar = this.f11277a.f11261b;
                    if (dVar != null) {
                        dVar.mo11106a(chargeDeal, PayChannel.GOOGLE, "");
                        break;
                    } else {
                        return;
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                    if (i == 1) {
                        this.f11277a.getChildFragmentManager().mo2645a().mo2588a((Fragment) WorldPayInputDialogFragment.m13407a(new C3795a(this, chargeDeal, payChannel)), "VIGO_PAY_INPUT_DIALOG_FRAGMENT_TAG").mo2606d();
                        return;
                    }
                    C3648d dVar2 = this.f11277a.f11261b;
                    if (dVar2 != null) {
                        dVar2.mo11106a(chargeDeal, payChannel, "");
                        break;
                    } else {
                        return;
                    }
                case 6:
                    C3648d dVar3 = this.f11277a.f11261b;
                    if (dVar3 != null) {
                        dVar3.mo11106a(chargeDeal, PayChannel.HUOLI, "");
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.fragment.MyDiamondFragment$i */
    static final class C3796i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MyDiamondFragment f11281a;

        C3796i(MyDiamondFragment myDiamondFragment) {
            this.f11281a = myDiamondFragment;
        }

        public final void run() {
            Boolean bool;
            C8947c<Boolean> cVar = C8946b.f24397aV;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.SHOWED_PAY_CHANNEL_SCROLL_TIP");
            if (!((Boolean) cVar.mo22117a()).booleanValue()) {
                View view = this.f11281a.getView();
                if (view != null) {
                    WalletPagerSlidingTabStrip walletPagerSlidingTabStrip = (WalletPagerSlidingTabStrip) view.findViewById(R.id.bq3);
                    if (walletPagerSlidingTabStrip != null) {
                        bool = Boolean.valueOf(walletPagerSlidingTabStrip.mo11165a());
                        C8947c<Boolean> cVar2 = C8946b.f24397aV;
                        C7573i.m23582a((Object) cVar2, "LivePluginProperties.SHOWED_PAY_CHANNEL_SCROLL_TIP");
                        cVar2.mo22118a(bool);
                    }
                }
                bool = null;
                C8947c<Boolean> cVar22 = C8946b.f24397aV;
                C7573i.m23582a((Object) cVar22, "LivePluginProperties.SHOWED_PAY_CHANNEL_SCROLL_TIP");
                cVar22.mo22118a(bool);
            }
        }
    }

    /* renamed from: a */
    public static final MyDiamondFragment m13531a(Bundle bundle) {
        return C3787a.m13546a(bundle);
    }

    /* renamed from: a */
    private void m13532a() {
        if (this.f11269k != null) {
            this.f11269k.clear();
        }
    }

    /* renamed from: d */
    public final void mo11117d() {
    }

    /* renamed from: c */
    public final void mo11116c() {
        ProgressDialog progressDialog = this.f11262c;
        if (progressDialog != null && progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.f11262c;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
        }
    }

    /* renamed from: e */
    public final void mo11120e() {
        View view = getView();
        if (view != null) {
            LoadingStatusView loadingStatusView = (LoadingStatusView) view.findViewById(R.id.dav);
            if (loadingStatusView != null) {
                loadingStatusView.mo10830c();
            }
        }
    }

    /* renamed from: f */
    public final void mo11121f() {
        View view = getView();
        if (view != null) {
            LoadingStatusView loadingStatusView = (LoadingStatusView) view.findViewById(R.id.dav);
            if (loadingStatusView != null) {
                loadingStatusView.mo10828a();
            }
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C3648d dVar = this.f11261b;
        if (dVar != null) {
            dVar.mo8963a();
        }
        this.f11261b = null;
        m13532a();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo11114a(Exception exc) {
        mo11115a(exc, 0);
    }

    /* renamed from: a */
    public final void mo11111a(int i) {
        if (this.f11262c == null) {
            FragmentActivity activity = getActivity();
            if (activity != null && !activity.isFinishing()) {
                ProgressDialog a = C9053at.m27042a(getActivity());
                a.setCancelable(false);
                a.setCanceledOnTouchOutside(false);
                this.f11262c = a;
            }
        }
        ProgressDialog progressDialog = this.f11262c;
        if (progressDialog != null && !progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.f11262c;
            if (progressDialog2 != null) {
                progressDialog2.show();
            }
        }
    }

    /* renamed from: a */
    public final void mo11277a(View view) {
        C7573i.m23587b(view, "view");
        TextView textView = this.f11268j;
        if (textView != null) {
            C3693c walletCenter = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter();
            C7573i.m23582a((Object) walletCenter, "ServiceManager.getServic…          .walletCenter()");
            textView.setText(String.valueOf(walletCenter.mo11155b()));
        }
    }

    /* renamed from: b */
    private final void m13533b(View view) {
        this.f11268j = (TextView) view.findViewById(R.id.dwm);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aub, (LoadingStatusView) view.findViewById(R.id.dav), false);
        inflate.setOnClickListener(new C3789c(this));
        ((LoadingStatusView) view.findViewById(R.id.dav)).setBuilder(C3555a.m13075a(getContext()).mo10837b((int) R.string.eiy).mo10839c(inflate).mo10834a(getResources().getDimensionPixelSize(R.dimen.oa)));
        TextView textView = (TextView) view.findViewById(R.id.dpi);
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            C7573i.m23582a((Object) paint, "paint");
            paint.setFlags(8);
            TextPaint paint2 = textView.getPaint();
            C7573i.m23582a((Object) paint2, "paint");
            paint2.setAntiAlias(true);
            textView.setOnClickListener(C3790d.f11272a);
        }
        view.findViewById(R.id.dug);
        View findViewById = view.findViewById(R.id.a8p);
        View findViewById2 = view.findViewById(R.id.cox);
        findViewById.setOnClickListener(new C3791e(this));
        findViewById2.setOnClickListener(new C3792f(this));
    }

    /* renamed from: a */
    public final void mo11113a(C9353b bVar) {
        int i;
        if (bVar != null) {
            if (bVar.f25548c == PayChannel.ONECARD) {
                i = R.string.ff6;
            } else if (bVar.f25548c == PayChannel.BOKU) {
                i = R.string.ff7;
            } else {
                i = R.string.ff3;
            }
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(getContext(), C3979c.m13952b(bVar.f25547b).mo11550a(C3358ac.m12515a(i)));
        }
    }

    /* renamed from: b */
    public final void mo11119b(Exception exc, int i) {
        View view = getView();
        if (view != null) {
            LoadingStatusView loadingStatusView = (LoadingStatusView) view.findViewById(R.id.dav);
            if (loadingStatusView != null) {
                loadingStatusView.mo10832e();
            }
        }
        if (exc instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) exc;
            if (!TextUtils.isEmpty(apiServerException.getPrompt())) {
                C3517a.m12962a(getContext(), apiServerException.getPrompt());
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C7573i.m23582a((Object) activity, "this");
            this.f11261b = new C3648d(activity);
        }
        C3648d dVar = this.f11261b;
        if (dVar != null) {
            dVar.mo9142a(this);
        }
        C3648d dVar2 = this.f11261b;
        if (dVar2 != null) {
            dVar2.mo11107b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        if (r1 == null) goto L_0x00c1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11112a(int r6, com.bytedance.android.live.wallet.model.CheckOrderOriginalResult r7) {
        /*
            r5 = this;
            java.lang.Class<com.bytedance.android.live.user.a> r7 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.utility.C3596c.m13172a(r7)
            com.bytedance.android.live.user.a r7 = (com.bytedance.android.live.user.C3592a) r7
            com.bytedance.android.livesdk.user.e r7 = r7.user()
            java.lang.String r0 = "ServiceManager.getServic…rvice::class.java).user()"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            com.bytedance.android.live.base.model.user.IUser r7 = r7.mo22165a()
            java.lang.String r0 = "ServiceManager.getServic….java).user().currentUser"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            long r0 = r7.getPayScores()
            r7 = 0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0045
            android.support.v4.app.j r0 = r5.getChildFragmentManager()
            java.lang.String r1 = "FIRST_RECHARGE_TAG"
            android.support.v4.app.Fragment r0 = r0.mo2644a(r1)
            if (r0 == 0) goto L_0x0045
            android.content.Context r0 = r5.getContext()
            r1 = 2131828111(0x7f111d8f, float:1.9289154E38)
            java.lang.String r1 = r5.getString(r1)
            com.bytedance.android.live.uikit.p176d.C3517a.m12962a(r0, r1)
            goto L_0x0053
        L_0x0045:
            android.content.Context r0 = r5.getContext()
            r1 = 2131827549(0x7f111b5d, float:1.9288014E38)
            java.lang.String r1 = r5.getString(r1)
            com.bytedance.android.live.uikit.p176d.C3517a.m12962a(r0, r1)
        L_0x0053:
            com.bytedance.android.livesdk.v.a r0 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            com.bytedance.android.livesdk.h.e r1 = new com.bytedance.android.livesdk.h.e
            r1.<init>(r6)
            r0.mo22267a(r1)
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r6 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r6 = com.bytedance.android.live.utility.C3596c.m13172a(r6)
            com.bytedance.android.live.wallet.IWalletService r6 = (com.bytedance.android.live.wallet.IWalletService) r6
            com.bytedance.android.live.wallet.c r6 = r6.walletCenter()
            r6.mo11160e()
            com.bytedance.android.live.wallet.b.a.d r6 = r5.f11261b
            if (r6 == 0) goto L_0x0075
            r6.mo11107b()
        L_0x0075:
            android.view.View r6 = r5.getView()
            if (r6 == 0) goto L_0x008b
            r0 = 2131298209(0x7f0907a1, float:1.8214385E38)
            android.view.View r6 = r6.findViewById(r0)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x008b
            r0 = 8
            r6.setVisibility(r0)
        L_0x008b:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r0 = "money"
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r1 = r5.f11264e
            if (r1 == 0) goto L_0x009b
            int r1 = r1.f25520f
            goto L_0x009c
        L_0x009b:
            r1 = 0
        L_0x009c:
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r2 = r5.f11264e
            if (r2 == 0) goto L_0x00a3
            int r2 = r2.f25519e
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            int r1 = r1 + r2
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r6.put(r0, r1)
            java.lang.String r0 = "pay_method"
            com.bytedance.android.livesdkapi.host.PayChannel r1 = r5.f11265f
            com.bytedance.android.livesdkapi.host.PayChannel r2 = com.bytedance.android.livesdkapi.host.PayChannel.GOOGLE
            if (r1 != r2) goto L_0x00b7
            java.lang.String r1 = "google_pay"
            goto L_0x00c3
        L_0x00b7:
            com.bytedance.android.livesdkapi.host.PayChannel r1 = r5.f11265f
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = r1.getValue()
            if (r1 != 0) goto L_0x00c3
        L_0x00c1:
            java.lang.String r1 = ""
        L_0x00c3:
            r6.put(r0, r1)
            java.lang.String r0 = "request_page"
            java.lang.String r1 = "my_profile"
            r6.put(r0, r1)
            com.bytedance.android.livesdk.log.c r0 = com.bytedance.android.livesdk.log.C8443c.m25663a()
            java.lang.String r1 = "livesdk_recharge_success"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r0.mo21606a(r1, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.fragment.MyDiamondFragment.mo11112a(int, com.bytedance.android.live.wallet.model.CheckOrderOriginalResult):void");
    }

    /* renamed from: a */
    public final void mo11115a(Exception exc, int i) {
        if (exc instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) exc;
            if (!TextUtils.isEmpty(apiServerException.getPrompt())) {
                C3517a.m12962a(getContext(), apiServerException.getPrompt());
                return;
            }
        }
        if (i != 0) {
            C3517a.m12960a(getContext(), i);
        } else {
            C3517a.m12960a(getContext(), (int) R.string.ejk);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0238 A[LOOP:3: B:66:0x012b->B:141:0x0238, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0186 A[EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  
    EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  
    EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0186 A[EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  
    EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0186 A[EDGE_INSN: B:153:0x0186->B:90:0x0186 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0197  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11118a(java.lang.String r18, java.util.List<com.bytedance.android.live.wallet.model.C3822h> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "currencyCode"
            kotlin.jvm.internal.C7573i.m23587b(r1, r3)
            java.lang.String r3 = "vigoRechargeList"
            kotlin.jvm.internal.C7573i.m23587b(r2, r3)
            boolean r3 = r0.f11266h
            r4 = 1
            if (r3 != 0) goto L_0x0041
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r2 = r2.iterator()
        L_0x0022:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r2.next()
            r6 = r5
            com.bytedance.android.live.wallet.model.h r6 = (com.bytedance.android.live.wallet.model.C3822h) r6
            java.lang.String r6 = r6.f11375a
            java.lang.String r7 = "Huoli"
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r7)
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x0022
            r3.add(r5)
            goto L_0x0022
        L_0x003e:
            r2 = r3
            java.util.List r2 = (java.util.List) r2
        L_0x0041:
            android.view.View r3 = r17.getView()
            r5 = 0
            if (r3 == 0) goto L_0x0056
            r6 = 2131299646(0x7f090d3e, float:1.82173E38)
            android.view.View r3 = r3.findViewById(r6)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            if (r3 == 0) goto L_0x0056
            r3.setVisibility(r5)
        L_0x0056:
            android.view.View r3 = r17.getView()
            r6 = 2131299614(0x7f090d1e, float:1.8217234E38)
            if (r3 == 0) goto L_0x0074
            android.view.View r3 = r3.findViewById(r6)
            com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip r3 = (com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip) r3
            if (r3 == 0) goto L_0x0074
            int r7 = r2.size()
            if (r7 <= r4) goto L_0x006f
            r7 = 0
            goto L_0x0071
        L_0x006f:
            r7 = 8
        L_0x0071:
            r3.setVisibility(r7)
        L_0x0074:
            boolean r3 = r2.isEmpty()
            r7 = 0
            if (r3 == 0) goto L_0x007f
            r0.mo11119b(r7, r5)
            return
        L_0x007f:
            r0.f11263d = r2
            android.view.View r3 = r17.getView()
            r8 = 2131303243(0x7f091b4b, float:1.8224595E38)
            if (r3 == 0) goto L_0x00a3
            android.view.View r3 = r3.findViewById(r8)
            com.bytedance.android.live.uikit.rtl.RtlViewPager r3 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r3
            if (r3 == 0) goto L_0x00a3
            com.bytedance.android.live.wallet.adapter.RechargePagerAdapter r9 = new com.bytedance.android.live.wallet.adapter.RechargePagerAdapter
            com.bytedance.android.live.wallet.fragment.MyDiamondFragment$h r10 = new com.bytedance.android.live.wallet.fragment.MyDiamondFragment$h
            r10.<init>(r0)
            com.bytedance.android.live.wallet.adapter.ReChargeListAdapter$b r10 = (com.bytedance.android.live.wallet.adapter.ReChargeListAdapter.C3624b) r10
            r9.<init>(r2, r10)
            android.support.v4.view.PagerAdapter r9 = (android.support.p022v4.view.PagerAdapter) r9
            r3.setAdapter(r9)
        L_0x00a3:
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r9 = r3.iterator()
            r10 = 0
            r11 = 0
        L_0x00ac:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00c6
            java.lang.Object r12 = r9.next()
            int r13 = r10 + 1
            if (r10 >= 0) goto L_0x00bd
            kotlin.collections.C7525m.m23465b()
        L_0x00bd:
            com.bytedance.android.live.wallet.model.h r12 = (com.bytedance.android.live.wallet.model.C3822h) r12
            int r12 = r12.f11387m
            if (r12 != r4) goto L_0x00c4
            r11 = r10
        L_0x00c4:
            r10 = r13
            goto L_0x00ac
        L_0x00c6:
            java.util.Iterator r3 = r3.iterator()
            boolean r9 = r3.hasNext()
            if (r9 != 0) goto L_0x00d3
            r9 = r7
            goto L_0x0186
        L_0x00d3:
            java.lang.Object r9 = r3.next()
            boolean r10 = r3.hasNext()
            if (r10 != 0) goto L_0x00df
            goto L_0x0186
        L_0x00df:
            r10 = r9
            com.bytedance.android.live.wallet.model.h r10 = (com.bytedance.android.live.wallet.model.C3822h) r10
            java.lang.String r12 = r10.f11375a
            java.lang.String r13 = "Pay by mobile"
            boolean r12 = kotlin.jvm.internal.C7573i.m23585a(r12, r13)
            if (r12 == 0) goto L_0x0123
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r10 = r10.f11384j
            if (r10 == 0) goto L_0x0121
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.Iterator r10 = r10.iterator()
        L_0x00fd:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x011a
            java.lang.Object r13 = r10.next()
            r14 = r13
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r14 = (com.bytedance.android.livesdkapi.depend.model.ChargeDeal) r14
            if (r14 == 0) goto L_0x010f
            java.lang.String r14 = r14.f25521g
            goto L_0x0110
        L_0x010f:
            r14 = r7
        L_0x0110:
            boolean r14 = kotlin.jvm.internal.C7573i.m23585a(r14, r1)
            if (r14 == 0) goto L_0x00fd
            r12.add(r13)
            goto L_0x00fd
        L_0x011a:
            java.util.List r12 = (java.util.List) r12
            int r10 = r12.size()
            goto L_0x012b
        L_0x0121:
            r10 = 0
            goto L_0x012b
        L_0x0123:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r10 = r10.f11384j
            if (r10 == 0) goto L_0x0121
            int r10 = r10.size()
        L_0x012b:
            java.lang.Object r12 = r3.next()
            r13 = r12
            com.bytedance.android.live.wallet.model.h r13 = (com.bytedance.android.live.wallet.model.C3822h) r13
            java.lang.String r14 = r13.f11375a
            java.lang.String r15 = "Pay by mobile"
            boolean r14 = kotlin.jvm.internal.C7573i.m23585a(r14, r15)
            if (r14 == 0) goto L_0x0174
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r13 = r13.f11384j
            if (r13 == 0) goto L_0x0172
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Collection r14 = (java.util.Collection) r14
            java.util.Iterator r13 = r13.iterator()
        L_0x014d:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x016b
            java.lang.Object r15 = r13.next()
            r7 = r15
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r7 = (com.bytedance.android.livesdkapi.depend.model.ChargeDeal) r7
            if (r7 == 0) goto L_0x015f
            java.lang.String r7 = r7.f25521g
            goto L_0x0160
        L_0x015f:
            r7 = 0
        L_0x0160:
            boolean r7 = kotlin.jvm.internal.C7573i.m23585a(r7, r1)
            if (r7 == 0) goto L_0x0169
            r14.add(r15)
        L_0x0169:
            r7 = 0
            goto L_0x014d
        L_0x016b:
            java.util.List r14 = (java.util.List) r14
            int r7 = r14.size()
            goto L_0x017c
        L_0x0172:
            r7 = 0
            goto L_0x017c
        L_0x0174:
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r7 = r13.f11384j
            if (r7 == 0) goto L_0x0172
            int r7 = r7.size()
        L_0x017c:
            if (r10 >= r7) goto L_0x0180
            r10 = r7
            r9 = r12
        L_0x0180:
            boolean r7 = r3.hasNext()
            if (r7 != 0) goto L_0x0238
        L_0x0186:
            com.bytedance.android.live.wallet.model.h r9 = (com.bytedance.android.live.wallet.model.C3822h) r9
            if (r9 == 0) goto L_0x0193
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r1 = r9.f11384j
            if (r1 == 0) goto L_0x0193
            int r1 = r1.size()
            goto L_0x0194
        L_0x0193:
            r1 = 0
        L_0x0194:
            r3 = 6
            if (r1 <= r3) goto L_0x01d1
            android.view.View r3 = r17.getView()
            if (r3 == 0) goto L_0x01d1
            android.view.View r3 = r3.findViewById(r8)
            com.bytedance.android.live.uikit.rtl.RtlViewPager r3 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r3
            if (r3 == 0) goto L_0x01d1
            android.view.View r7 = r17.getView()
            if (r7 == 0) goto L_0x01cd
            android.view.View r7 = r7.findViewById(r8)
            com.bytedance.android.live.uikit.rtl.RtlViewPager r7 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r7
            if (r7 == 0) goto L_0x01cd
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            if (r7 == 0) goto L_0x01cd
            int r9 = r1 % 3
            if (r9 != 0) goto L_0x01c0
            int r1 = r1 / 3
            goto L_0x01c3
        L_0x01c0:
            int r1 = r1 / 3
            int r1 = r1 + r4
        L_0x01c3:
            int r1 = r1 * 72
            float r1 = (float) r1
            int r1 = com.bytedance.android.live.core.utils.C3358ac.m12510a(r1)
            r7.height = r1
            goto L_0x01ce
        L_0x01cd:
            r7 = 0
        L_0x01ce:
            r3.setLayoutParams(r7)
        L_0x01d1:
            android.view.View r1 = r17.getView()
            if (r1 == 0) goto L_0x01e6
            android.view.View r1 = r1.findViewById(r8)
            com.bytedance.android.live.uikit.rtl.RtlViewPager r1 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r1
            if (r1 == 0) goto L_0x01e6
            int r2 = r2.size()
            r1.setOffscreenPageLimit(r2)
        L_0x01e6:
            android.view.View r1 = r17.getView()
            if (r1 == 0) goto L_0x020d
            android.view.View r1 = r1.findViewById(r6)
            com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip r1 = (com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip) r1
            if (r1 == 0) goto L_0x020d
            android.view.View r2 = r17.getView()
            if (r2 == 0) goto L_0x0204
            android.view.View r2 = r2.findViewById(r8)
            r7 = r2
            com.bytedance.android.live.uikit.rtl.RtlViewPager r7 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r7
            r16 = r7
            goto L_0x0206
        L_0x0204:
            r16 = 0
        L_0x0206:
            r2 = r16
            android.support.v4.view.ViewPager r2 = (android.support.p022v4.view.ViewPager) r2
            r1.setViewPager(r2)
        L_0x020d:
            android.view.View r1 = r17.getView()
            if (r1 == 0) goto L_0x021e
            android.view.View r1 = r1.findViewById(r8)
            com.bytedance.android.live.uikit.rtl.RtlViewPager r1 = (com.bytedance.android.live.uikit.rtl.RtlViewPager) r1
            if (r1 == 0) goto L_0x021e
            r1.setCurrentItem(r11, r5)
        L_0x021e:
            android.view.View r1 = r17.getView()
            if (r1 == 0) goto L_0x0237
            android.view.View r1 = r1.findViewById(r6)
            com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip r1 = (com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip) r1
            if (r1 == 0) goto L_0x0237
            com.bytedance.android.live.wallet.fragment.MyDiamondFragment$i r2 = new com.bytedance.android.live.wallet.fragment.MyDiamondFragment$i
            r2.<init>(r0)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.post(r2)
            return
        L_0x0237:
            return
        L_0x0238:
            r7 = 0
            goto L_0x012b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.fragment.MyDiamondFragment.mo11118a(java.lang.String, java.util.List):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 666) {
            ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
            C3648d dVar = this.f11261b;
            if (dVar != null) {
                dVar.mo11107b();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.apy, viewGroup, false);
        Map hashMap = new HashMap();
        hashMap.put("request_page", "wallet");
        C8443c.m25663a().mo21606a("livesdk_diamond_page_show", hashMap, new Object[0]);
        C7573i.m23582a((Object) inflate, "rootView");
        m13533b(inflate);
        mo11277a(inflate);
        ((C3245ad) ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11152a().mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10182a((C7326g<? super T>) new C3793g<Object>(this, inflate));
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
        return inflate;
    }
}
