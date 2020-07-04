package com.bytedance.android.live.wallet.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3693c;
import com.bytedance.android.live.wallet.C3701d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.adapter.ReChargeListAdapter.C3624b;
import com.bytedance.android.live.wallet.adapter.RechargePagerAdapter;
import com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip;
import com.bytedance.android.live.wallet.dialog.WorldPayInputDialogFragment.C3730a;
import com.bytedance.android.live.wallet.model.C3822h;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.p178b.p179a.C3648d;
import com.bytedance.android.live.wallet.p178b.p180b.C3671c;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.utils.C9053at;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdkapi.depend.live.C9334h;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;

public final class RechargeDialog extends LiveDialogFragment implements C3671c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f11073a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RechargeDialog.class), "mIsVertical", "getMIsVertical()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RechargeDialog.class), "mIsAnchor", "getMIsAnchor()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RechargeDialog.class), "mChargeReason", "getMChargeReason()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RechargeDialog.class), "mRequestPage", "getMRequestPage()Ljava/lang/String;"))};

    /* renamed from: i */
    public static final C3714a f11074i = new C3714a(null);

    /* renamed from: o */
    private static final int f11075o = 72;

    /* renamed from: b */
    public Activity f11076b;

    /* renamed from: c */
    public RechargePagerAdapter f11077c;

    /* renamed from: d */
    public ProgressDialog f11078d;

    /* renamed from: e */
    public C3648d f11079e;

    /* renamed from: f */
    public ChargeDeal f11080f;

    /* renamed from: g */
    public PayChannel f11081g;

    /* renamed from: h */
    public C3701d f11082h;

    /* renamed from: k */
    private final C7541d f11083k = C7546e.m23569a(new C3721g(this));

    /* renamed from: l */
    private final C7541d f11084l = C7546e.m23569a(new C3720f(this));

    /* renamed from: m */
    private final C7541d f11085m = C7546e.m23569a(new C3719e(this));

    /* renamed from: n */
    private final C7541d f11086n = C7546e.m23569a(new C3722h(this));

    /* renamed from: p */
    private HashMap f11087p;

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$a */
    public static final class C3714a {
        private C3714a() {
        }

        public /* synthetic */ C3714a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static RechargeDialog m13397a(Activity activity, Bundle bundle, DataCenter dataCenter, C3701d dVar, C9334h hVar) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(bundle, "bundle");
            RechargeDialog rechargeDialog = new RechargeDialog();
            rechargeDialog.f11076b = activity;
            rechargeDialog.f11082h = dVar;
            rechargeDialog.setArguments(bundle);
            return rechargeDialog;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$b */
    static final class C3715b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11088a;

        C3715b(RechargeDialog rechargeDialog) {
            this.f11088a = rechargeDialog;
        }

        public final void onClick(View view) {
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(this.f11088a.getContext(), C3979c.m13952b("https://api.hypstar.com/hotsoon/in_app/charge_agreement/").mo11550a(C3358ac.m12515a((int) R.string.ed0)));
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$c */
    public static final class C3716c implements C3624b {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11089a;

        /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$c$a */
        static final class C3717a implements C3730a {

            /* renamed from: a */
            final /* synthetic */ C3716c f11090a;

            /* renamed from: b */
            final /* synthetic */ ChargeDeal f11091b;

            /* renamed from: c */
            final /* synthetic */ PayChannel f11092c;

            C3717a(C3716c cVar, ChargeDeal chargeDeal, PayChannel payChannel) {
                this.f11090a = cVar;
                this.f11091b = chargeDeal;
                this.f11092c = payChannel;
            }

            /* renamed from: a */
            public final void mo11225a(String str) {
                C7573i.m23587b(str, "email");
                C3648d dVar = this.f11090a.f11089a.f11079e;
                if (dVar != null) {
                    dVar.mo11106a(this.f11091b, this.f11092c, str);
                }
            }
        }

        C3716c(RechargeDialog rechargeDialog) {
            this.f11089a = rechargeDialog;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ce, code lost:
            if (r5 == null) goto L_0x00d0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11066a(com.bytedance.android.livesdkapi.host.PayChannel r8, com.bytedance.android.livesdkapi.depend.model.ChargeDeal r9, int r10) {
            /*
                r7 = this;
                java.lang.String r0 = "channel"
                kotlin.jvm.internal.C7573i.m23587b(r8, r0)
                java.lang.String r0 = "deal"
                kotlin.jvm.internal.C7573i.m23587b(r9, r0)
                com.bytedance.android.live.wallet.dialog.RechargeDialog r0 = r7.f11089a
                r0.f11080f = r9
                int[] r0 = com.bytedance.android.live.wallet.dialog.C3763n.f11194a
                int r1 = r8.ordinal()
                r0 = r0[r1]
                r1 = 1
                switch(r0) {
                    case 1: goto L_0x006f;
                    case 2: goto L_0x002f;
                    case 3: goto L_0x002f;
                    case 4: goto L_0x002f;
                    case 5: goto L_0x002f;
                    case 6: goto L_0x001b;
                    default: goto L_0x001a;
                }
            L_0x001a:
                goto L_0x0082
            L_0x001b:
                com.bytedance.android.live.wallet.dialog.RechargeDialog r8 = r7.f11089a
                com.bytedance.android.livesdkapi.host.PayChannel r10 = com.bytedance.android.livesdkapi.host.PayChannel.HUOLI
                r8.f11081g = r10
                com.bytedance.android.live.wallet.dialog.RechargeDialog r8 = r7.f11089a
                com.bytedance.android.live.wallet.b.a.d r8 = r8.f11079e
                if (r8 == 0) goto L_0x0082
                com.bytedance.android.livesdkapi.host.PayChannel r10 = com.bytedance.android.livesdkapi.host.PayChannel.HUOLI
                java.lang.String r0 = ""
                r8.mo11106a(r9, r10, r0)
                goto L_0x0082
            L_0x002f:
                com.bytedance.android.live.wallet.dialog.RechargeDialog r0 = r7.f11089a
                r0.f11081g = r8
                if (r10 != r1) goto L_0x0063
                com.bytedance.android.live.wallet.dialog.RechargeDialog$c$a r10 = new com.bytedance.android.live.wallet.dialog.RechargeDialog$c$a
                r10.<init>(r7, r9, r8)
                com.bytedance.android.live.wallet.dialog.WorldPayInputDialogFragment$a r10 = (com.bytedance.android.live.wallet.dialog.WorldPayInputDialogFragment.C3730a) r10
                com.bytedance.android.live.wallet.dialog.WorldPayInputDialogFragment r8 = com.bytedance.android.live.wallet.dialog.WorldPayInputDialogFragment.m13407a(r10)
                com.bytedance.android.live.wallet.dialog.RechargeDialog r10 = r7.f11089a
                android.app.Activity r10 = r10.f11076b
                boolean r0 = r10 instanceof android.support.p022v4.app.FragmentActivity
                if (r0 != 0) goto L_0x0049
                r10 = 0
            L_0x0049:
                android.support.v4.app.FragmentActivity r10 = (android.support.p022v4.app.FragmentActivity) r10
                if (r10 == 0) goto L_0x0082
                android.support.v4.app.j r10 = r10.getSupportFragmentManager()
                if (r10 == 0) goto L_0x0082
                android.support.v4.app.q r10 = r10.mo2645a()
                android.support.v4.app.Fragment r8 = (android.support.p022v4.app.Fragment) r8
                java.lang.String r0 = "VIGO_PAY_INPUT_DIALOG_FRAGMENT_TAG"
                android.support.v4.app.q r8 = r10.mo2588a(r8, r0)
                r8.mo2606d()
                goto L_0x0082
            L_0x0063:
                com.bytedance.android.live.wallet.dialog.RechargeDialog r10 = r7.f11089a
                com.bytedance.android.live.wallet.b.a.d r10 = r10.f11079e
                if (r10 == 0) goto L_0x0082
                java.lang.String r0 = ""
                r10.mo11106a(r9, r8, r0)
                goto L_0x0082
            L_0x006f:
                com.bytedance.android.live.wallet.dialog.RechargeDialog r8 = r7.f11089a
                com.bytedance.android.livesdkapi.host.PayChannel r10 = com.bytedance.android.livesdkapi.host.PayChannel.GOOGLE
                r8.f11081g = r10
                com.bytedance.android.live.wallet.dialog.RechargeDialog r8 = r7.f11089a
                com.bytedance.android.live.wallet.b.a.d r8 = r8.f11079e
                if (r8 == 0) goto L_0x0082
                com.bytedance.android.livesdkapi.host.PayChannel r10 = com.bytedance.android.livesdkapi.host.PayChannel.GOOGLE
                java.lang.String r0 = ""
                r8.mo11106a(r9, r10, r0)
            L_0x0082:
                int r8 = r9.f25519e
                int r9 = r9.f25520f
                int r8 = r8 + r9
                com.bytedance.android.livesdk.log.c r9 = com.bytedance.android.livesdk.log.C8443c.m25663a()
                java.lang.String r10 = "livesdk_recharge_click"
                r0 = 5
                kotlin.Pair[] r0 = new kotlin.Pair[r0]
                java.lang.String r2 = "money"
                java.lang.String r8 = java.lang.String.valueOf(r8)
                kotlin.Pair r8 = kotlin.C7579l.m23633a(r2, r8)
                r2 = 0
                r0[r2] = r8
                java.lang.String r8 = "request_page"
                com.bytedance.android.live.wallet.dialog.RechargeDialog r3 = r7.f11089a
                java.lang.String r3 = r3.mo11222b()
                kotlin.Pair r8 = kotlin.C7579l.m23633a(r8, r3)
                r0[r1] = r8
                java.lang.String r8 = "charge_style"
                java.lang.String r3 = "window"
                kotlin.Pair r8 = kotlin.C7579l.m23633a(r8, r3)
                r3 = 2
                r0[r3] = r8
                r8 = 3
                java.lang.String r4 = "pay_method"
                com.bytedance.android.live.wallet.dialog.RechargeDialog r5 = r7.f11089a
                com.bytedance.android.livesdkapi.host.PayChannel r5 = r5.f11081g
                com.bytedance.android.livesdkapi.host.PayChannel r6 = com.bytedance.android.livesdkapi.host.PayChannel.GOOGLE
                if (r5 != r6) goto L_0x00c4
                java.lang.String r5 = "google_pay"
                goto L_0x00d2
            L_0x00c4:
                com.bytedance.android.live.wallet.dialog.RechargeDialog r5 = r7.f11089a
                com.bytedance.android.livesdkapi.host.PayChannel r5 = r5.f11081g
                if (r5 == 0) goto L_0x00d0
                java.lang.String r5 = r5.getValue()
                if (r5 != 0) goto L_0x00d2
            L_0x00d0:
                java.lang.String r5 = ""
            L_0x00d2:
                kotlin.Pair r4 = kotlin.C7579l.m23633a(r4, r5)
                r0[r8] = r4
                r8 = 4
                java.lang.String r4 = "charge_reason"
                com.bytedance.android.live.wallet.dialog.RechargeDialog r5 = r7.f11089a
                java.lang.String r5 = r5.mo11220a()
                kotlin.Pair r4 = kotlin.C7579l.m23633a(r4, r5)
                r0[r8] = r4
                java.util.Map r8 = kotlin.collections.C7507ae.m23393a(r0)
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Class<com.bytedance.android.livesdk.log.b.j> r3 = com.bytedance.android.livesdk.log.p405b.C8438j.class
                r0[r2] = r3
                java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r2 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                r0[r1] = r2
                r9.mo21606a(r10, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.dialog.RechargeDialog.C3716c.mo11066a(com.bytedance.android.livesdkapi.host.PayChannel, com.bytedance.android.livesdkapi.depend.model.ChargeDeal, int):void");
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$d */
    static final class C3718d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11093a;

        C3718d(RechargeDialog rechargeDialog) {
            this.f11093a = rechargeDialog;
        }

        public final void onClick(View view) {
            C3648d dVar = this.f11093a.f11079e;
            if (dVar != null) {
                dVar.mo11107b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$e */
    static final class C3719e extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11094a;

        C3719e(RechargeDialog rechargeDialog) {
            this.f11094a = rechargeDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            Bundle arguments = this.f11094a.getArguments();
            if (arguments != null) {
                String string = arguments.getString(IWalletService.KEY_BUNDLE_CHARGE_REASON);
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$f */
    static final class C3720f extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11095a;

        C3720f(RechargeDialog rechargeDialog) {
            this.f11095a = rechargeDialog;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m13401a());
        }

        /* renamed from: a */
        private boolean m13401a() {
            Bundle arguments = this.f11095a.getArguments();
            if (arguments != null) {
                return arguments.getBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, false);
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$g */
    static final class C3721g extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11096a;

        C3721g(RechargeDialog rechargeDialog) {
            this.f11096a = rechargeDialog;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m13402a());
        }

        /* renamed from: a */
        private boolean m13402a() {
            Activity activity = this.f11096a.f11076b;
            if (activity != null) {
                Resources resources = activity.getResources();
                if (resources != null) {
                    Configuration configuration = resources.getConfiguration();
                    if (configuration != null && configuration.orientation == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$h */
    static final class C3722h extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11097a;

        C3722h(RechargeDialog rechargeDialog) {
            this.f11097a = rechargeDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            Bundle arguments = this.f11097a.getArguments();
            if (arguments != null) {
                String string = arguments.getString(IWalletService.KEY_BUNDLE_REQUEST_PAGE);
                if (string != null) {
                    return string;
                }
            }
            return "live_detail";
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$i */
    static final class C3723i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11098a;

        C3723i(RechargeDialog rechargeDialog) {
            this.f11098a = rechargeDialog;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                com.bytedance.android.live.wallet.dialog.RechargeDialog r0 = r3.f11098a
                android.view.View r0 = r0.getView()
                if (r0 == 0) goto L_0x0018
                r1 = 2131299652(0x7f090d44, float:1.8217311E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                if (r0 == 0) goto L_0x0018
                int r0 = r0.getHeight()
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                if (r0 == 0) goto L_0x003f
                com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.sharedpref.C8946b.f24449bc
                java.lang.String r2 = "LivePluginProperties.REC…RGE_DIALOG_CONTENT_HEIGHT"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.Object r1 = r1.mo22117a()
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 != 0) goto L_0x002b
                goto L_0x0031
            L_0x002b:
                int r1 = r1.intValue()
                if (r1 == r0) goto L_0x003f
            L_0x0031:
                com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.sharedpref.C8946b.f24449bc
                java.lang.String r2 = "LivePluginProperties.REC…RGE_DIALOG_CONTENT_HEIGHT"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.mo22118a(r0)
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.dialog.RechargeDialog.C3723i.run():void");
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$j */
    static final class C3724j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11099a;

        C3724j(RechargeDialog rechargeDialog) {
            this.f11099a = rechargeDialog;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                com.bytedance.android.live.wallet.dialog.RechargeDialog r0 = r3.f11099a
                android.view.View r0 = r0.getView()
                if (r0 == 0) goto L_0x0018
                r1 = 2131299652(0x7f090d44, float:1.8217311E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                if (r0 == 0) goto L_0x0018
                int r0 = r0.getHeight()
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                if (r0 == 0) goto L_0x003f
                com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.sharedpref.C8946b.f24449bc
                java.lang.String r2 = "LivePluginProperties.REC…RGE_DIALOG_CONTENT_HEIGHT"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.Object r1 = r1.mo22117a()
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 != 0) goto L_0x002b
                goto L_0x0031
            L_0x002b:
                int r1 = r1.intValue()
                if (r1 == r0) goto L_0x003f
            L_0x0031:
                com.bytedance.android.livesdk.sharedpref.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.sharedpref.C8946b.f24449bc
                java.lang.String r2 = "LivePluginProperties.REC…RGE_DIALOG_CONTENT_HEIGHT"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.mo22118a(r0)
            L_0x003f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.dialog.RechargeDialog.C3724j.run():void");
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$k */
    static final class C3725k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11100a;

        C3725k(RechargeDialog rechargeDialog) {
            this.f11100a = rechargeDialog;
        }

        public final void run() {
            Boolean bool;
            C8947c<Boolean> cVar = C8946b.f24397aV;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.SHOWED_PAY_CHANNEL_SCROLL_TIP");
            if (!((Boolean) cVar.mo22117a()).booleanValue()) {
                View view = this.f11100a.getView();
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

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$l */
    static final class C3726l<T> implements C7326g<C8296e> {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11101a;

        C3726l(RechargeDialog rechargeDialog) {
            this.f11101a = rechargeDialog;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C8296e eVar) {
            this.f11101a.onEvent(eVar);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$m */
    static final class C3727m<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11102a;

        C3727m(RechargeDialog rechargeDialog) {
            this.f11102a = rechargeDialog;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            this.f11102a.m13377b((View) null);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$n */
    static final class C3728n<T> implements C7326g<IUser> {

        /* renamed from: a */
        final /* synthetic */ RechargeDialog f11103a;

        C3728n(RechargeDialog rechargeDialog) {
            this.f11103a = rechargeDialog;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(IUser iUser) {
            this.f11103a.mo11221a(iUser);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.dialog.RechargeDialog$o */
    static final class C3729o<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C3729o f11104a = new C3729o();

        C3729o() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: a */
    public static final RechargeDialog m13373a(Activity activity, Bundle bundle, DataCenter dataCenter, C3701d dVar, C9334h hVar) {
        return C3714a.m13397a(activity, bundle, dataCenter, dVar, hVar);
    }

    /* renamed from: i */
    private boolean m13379i() {
        return ((Boolean) this.f11083k.getValue()).booleanValue();
    }

    /* renamed from: j */
    private boolean m13380j() {
        return ((Boolean) this.f11084l.getValue()).booleanValue();
    }

    /* renamed from: l */
    private void m13382l() {
        if (this.f11087p != null) {
            this.f11087p.clear();
        }
    }

    /* renamed from: a */
    public final String mo11220a() {
        return (String) this.f11085m.getValue();
    }

    /* renamed from: b */
    public final String mo11222b() {
        return (String) this.f11086n.getValue();
    }

    /* renamed from: d */
    public final void mo11117d() {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m13382l();
    }

    /* renamed from: a */
    public final void mo11113a(C9353b bVar) {
        if (bVar != null) {
            int i = bVar.f25548c == PayChannel.ONECARD ? R.string.ff6 : bVar.f25548c == PayChannel.BOKU ? R.string.ff7 : R.string.ff3;
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(getContext(), C3979c.m13952b(bVar.f25547b).mo11550a(C3358ac.m12515a(i)));
        }
    }

    /* renamed from: a */
    public final void mo11118a(String str, List<? extends C3822h> list) {
        LayoutParams layoutParams;
        int i;
        int i2;
        Object obj;
        C7573i.m23587b(str, "currencyCode");
        C7573i.m23587b(list, "rechargeList");
        if (this.f11076b instanceof FragmentActivity) {
            View view = getView();
            int i3 = 0;
            if (view != null) {
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bsm);
                if (linearLayout != null) {
                    linearLayout.setVisibility(list.size() > 1 ? 0 : 8);
                }
            }
            RtlViewPager rtlViewPager = null;
            if (list.isEmpty()) {
                mo11119b(null, 0);
                return;
            }
            if (m13379i()) {
                View view2 = getView();
                if (view2 != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.br4);
                    if (linearLayout2 != null) {
                        LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = -2;
                            View view3 = getView();
                            if (view3 != null) {
                                LinearLayout linearLayout3 = (LinearLayout) view3.findViewById(R.id.br4);
                                if (linearLayout3 != null) {
                                    linearLayout3.setLayoutParams(layoutParams2);
                                }
                            }
                        }
                    }
                }
            }
            Iterable<C3822h> iterable = list;
            Collection arrayList = new ArrayList(C7525m.m23469a((Iterable) iterable, 10));
            for (C3822h hVar : iterable) {
                if (C7573i.m23585a((Object) hVar.f11375a, (Object) "Pay by mobile")) {
                    List<ChargeDeal> list2 = hVar.f11384j;
                    if (list2 != null) {
                        Iterable iterable2 = list2;
                        Collection arrayList2 = new ArrayList();
                        for (Object next : iterable2) {
                            ChargeDeal chargeDeal = (ChargeDeal) next;
                            if (chargeDeal != null) {
                                obj = chargeDeal.f25521g;
                            } else {
                                obj = null;
                            }
                            if (C7573i.m23585a(obj, (Object) str)) {
                                arrayList2.add(next);
                            }
                        }
                        i2 = ((List) arrayList2).size();
                        arrayList.add(Integer.valueOf(i2));
                    }
                } else {
                    List<ChargeDeal> list3 = hVar.f11384j;
                    if (list3 != null) {
                        i2 = list3.size();
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                i2 = 0;
                arrayList.add(Integer.valueOf(i2));
            }
            Integer num = (Integer) C7525m.m23524n((List) arrayList);
            if (num != null) {
                i3 = num.intValue();
            }
            if (i3 > 6) {
                View view4 = getView();
                if (view4 != null) {
                    RtlViewPager rtlViewPager2 = (RtlViewPager) view4.findViewById(R.id.ed4);
                    if (rtlViewPager2 != null) {
                        View view5 = getView();
                        if (view5 != null) {
                            RtlViewPager rtlViewPager3 = (RtlViewPager) view5.findViewById(R.id.ed4);
                            if (rtlViewPager3 != null) {
                                layoutParams = rtlViewPager3.getLayoutParams();
                                if (layoutParams != null) {
                                    if (i3 % 3 == 0) {
                                        i = i3 / 3;
                                    } else {
                                        i = (i3 / 3) + 1;
                                    }
                                    layoutParams.height = C3358ac.m12510a((float) (f11075o * i));
                                    rtlViewPager2.setLayoutParams(layoutParams);
                                }
                            }
                        }
                        layoutParams = null;
                        rtlViewPager2.setLayoutParams(layoutParams);
                    }
                }
            }
            if (m13379i()) {
                View view6 = getView();
                if (view6 != null) {
                    LinearLayout linearLayout4 = (LinearLayout) view6.findViewById(R.id.br4);
                    if (linearLayout4 != null) {
                        linearLayout4.post(new C3724j(this));
                    }
                }
            }
            RechargePagerAdapter rechargePagerAdapter = this.f11077c;
            if (rechargePagerAdapter != null) {
                rechargePagerAdapter.mo11069a(str);
            }
            RechargePagerAdapter rechargePagerAdapter2 = this.f11077c;
            if (rechargePagerAdapter2 != null) {
                rechargePagerAdapter2.mo11070a(list);
            }
            RechargePagerAdapter rechargePagerAdapter3 = this.f11077c;
            if (rechargePagerAdapter3 != null) {
                rechargePagerAdapter3.notifyDataSetChanged();
            }
            View view7 = getView();
            if (view7 != null) {
                RtlViewPager rtlViewPager4 = (RtlViewPager) view7.findViewById(R.id.ed4);
                if (rtlViewPager4 != null) {
                    rtlViewPager4.setOffscreenPageLimit(list.size());
                }
            }
            View view8 = getView();
            if (view8 != null) {
                WalletPagerSlidingTabStrip walletPagerSlidingTabStrip = (WalletPagerSlidingTabStrip) view8.findViewById(R.id.bq3);
                if (walletPagerSlidingTabStrip != null) {
                    View view9 = getView();
                    if (view9 != null) {
                        rtlViewPager = (RtlViewPager) view9.findViewById(R.id.ed4);
                    }
                    walletPagerSlidingTabStrip.setViewPager(rtlViewPager);
                }
            }
            View view10 = getView();
            if (view10 != null) {
                WalletPagerSlidingTabStrip walletPagerSlidingTabStrip2 = (WalletPagerSlidingTabStrip) view10.findViewById(R.id.bq3);
                if (walletPagerSlidingTabStrip2 != null) {
                    walletPagerSlidingTabStrip2.post(new C3725k(this));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11115a(Exception exc, int i) {
        m13378b(exc);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r7 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11221a(com.bytedance.android.live.base.model.user.IUser r14) {
        /*
            r13 = this;
            boolean r0 = r13.m13380j()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002d
            if (r14 == 0) goto L_0x000f
            long r3 = r14.getPayScores()
            goto L_0x0011
        L_0x000f:
            r3 = 1
        L_0x0011:
            r5 = 0
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 > 0) goto L_0x002d
            com.bytedance.android.live.core.setting.l<com.bytedance.android.livesdkapi.i.b> r14 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2
            java.lang.String r0 = "LiveSettingKeys.LIVE_FIR…_CHARGE_REWARD_PACKAGE_V2"
            kotlin.jvm.internal.C7573i.m23582a(r14, r0)
            java.lang.Object r14 = r14.mo10240a()
            if (r14 == 0) goto L_0x002d
            android.view.View r14 = r13.getView()
            if (r14 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r14 = 1
            goto L_0x002e
        L_0x002d:
            r14 = 0
        L_0x002e:
            r0 = 8
            r3 = 2131298209(0x7f0907a1, float:1.8214385E38)
            if (r14 == 0) goto L_0x0156
            android.view.View r4 = r13.getView()
            if (r4 == 0) goto L_0x0156
            android.view.View r4 = r4.findViewById(r3)
            if (r4 == 0) goto L_0x0156
            int r4 = r4.getVisibility()
            if (r4 != r0) goto L_0x0156
            com.bytedance.android.live.core.setting.l<com.bytedance.android.livesdkapi.i.b> r4 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2
            java.lang.String r5 = "LiveSettingKeys.LIVE_FIR…_CHARGE_REWARD_PACKAGE_V2"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.Object r4 = r4.mo10240a()
            com.bytedance.android.livesdkapi.i.b r4 = (com.bytedance.android.livesdkapi.p457i.C9473b) r4
            android.view.View r5 = r13.getView()
            r6 = 0
            if (r5 == 0) goto L_0x0065
            r7 = 2131298148(0x7f090764, float:1.821426E38)
            android.view.View r5 = r5.findViewById(r7)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x0066
        L_0x0065:
            r5 = r6
        L_0x0066:
            java.lang.String r7 = "value"
            kotlin.jvm.internal.C7573i.m23582a(r4, r7)
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r7 = r4.f25930b
            java.lang.String r8 = "value.chargeDeal"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal$CurrencyPrice> r7 = r7.f25522h
            java.lang.String r8 = "value.chargeDeal.currencyPrice"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x007f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x009c
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal$CurrencyPrice r9 = (com.bytedance.android.livesdkapi.depend.model.ChargeDeal.CurrencyPrice) r9
            java.lang.String r10 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            java.lang.String r9 = r9.f25526a
            java.lang.String r10 = "USD"
            boolean r9 = kotlin.jvm.internal.C7573i.m23585a(r9, r10)
            if (r9 == 0) goto L_0x007f
            goto L_0x009d
        L_0x009c:
            r8 = r6
        L_0x009d:
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal$CurrencyPrice r8 = (com.bytedance.android.livesdkapi.depend.model.ChargeDeal.CurrencyPrice) r8
            if (r8 == 0) goto L_0x00a5
            java.lang.String r7 = r8.f25528c
            if (r7 != 0) goto L_0x00a7
        L_0x00a5:
            java.lang.String r7 = ""
        L_0x00a7:
            android.view.View r8 = r13.getView()
            if (r8 == 0) goto L_0x00c8
            r9 = 2131302521(0x7f091879, float:1.822313E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x00c8
            r9 = 2131827848(0x7f111c88, float:1.928862E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            java.lang.String r1 = com.bytedance.android.live.core.utils.C3358ac.m12517a(r9, r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r8.setText(r1)
        L_0x00c8:
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 2131827730(0x7f111c12, float:1.928838E38)
            java.lang.String r8 = com.bytedance.android.live.core.utils.C3358ac.m12515a(r8)
            r7.append(r8)
            java.lang.String r8 = "x"
            r7.append(r8)
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r8 = r4.f25930b
            java.lang.String r9 = "value.chargeDeal"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            int r8 = r8.f25519e
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r9 = r4.f25930b
            java.lang.String r10 = "value.chargeDeal"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            int r9 = r9.f25520f
            int r8 = r8 + r9
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r1.<init>(r7)
            android.text.Spannable r1 = (android.text.Spannable) r1
            r7 = 2131234617(0x7f080f39, float:1.8085405E38)
            android.view.View r1 = r13.m13371a(r6, r1, r7)
            if (r1 == 0) goto L_0x0111
            if (r5 == 0) goto L_0x0111
            r5.addView(r1)
        L_0x0111:
            java.util.List<com.bytedance.android.livesdkapi.i.b$a> r1 = r4.f25929a
            java.lang.String r4 = "value.firstChargeRewards"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x011e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0156
            java.lang.Object r4 = r1.next()
            com.bytedance.android.livesdkapi.i.b$a r4 = (com.bytedance.android.livesdkapi.p457i.C9473b.C9474a) r4
            java.lang.String r6 = "firstChargeReward"
            kotlin.jvm.internal.C7573i.m23582a(r4, r6)
            com.bytedance.android.live.base.model.ImageModel r8 = r4.f25934d
            java.lang.Class<com.bytedance.android.live.room.l> r6 = com.bytedance.android.live.room.C3495l.class
            com.bytedance.android.live.base.b r6 = com.bytedance.android.live.utility.C3596c.m13172a(r6)
            com.bytedance.android.live.room.l r6 = (com.bytedance.android.live.room.C3495l) r6
            com.bytedance.android.livesdkapi.message.f r4 = r4.f25931a
            java.lang.String r7 = ""
            android.text.Spannable r9 = r6.parsePatternAndGetSpannable(r4, r7)
            java.lang.String r4 = "ServiceManager.getServic…irstChargeReward.msg, \"\")"
            kotlin.jvm.internal.C7573i.m23582a(r9, r4)
            r10 = 0
            r11 = 4
            r12 = 0
            r7 = r13
            android.view.View r4 = r7.m13371a(r8, r9, -1)
            if (r4 == 0) goto L_0x011e
            if (r5 == 0) goto L_0x011e
            r5.addView(r4)
            goto L_0x011e
        L_0x0156:
            android.view.View r1 = r13.getView()
            if (r1 == 0) goto L_0x0169
            android.view.View r1 = r1.findViewById(r3)
            if (r1 == 0) goto L_0x0169
            if (r14 == 0) goto L_0x0165
            r0 = 0
        L_0x0165:
            r1.setVisibility(r0)
            return
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.dialog.RechargeDialog.mo11221a(com.bytedance.android.live.base.model.user.IUser):void");
    }

    public final void dismiss() {
        C3648d dVar = this.f11079e;
        if (dVar != null) {
            dVar.mo8963a();
        }
        super.dismiss();
    }

    /* renamed from: k */
    private final void m13381k() {
        if (this.f11076b != null) {
            Activity activity = this.f11076b;
            if (activity == null) {
                C7573i.m23580a();
            }
            this.f11079e = new C3648d(activity);
            C3648d dVar = this.f11079e;
            if (dVar != null) {
                dVar.mo9142a(this);
            }
        }
    }

    /* renamed from: c */
    public final void mo11116c() {
        ProgressDialog progressDialog = this.f11078d;
        if (progressDialog != null && progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.f11078d;
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

    /* renamed from: a */
    public final void mo11114a(Exception exc) {
        m13378b(exc);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m13379i();
        setStyle(1, R.style.xv);
    }

    public final void onEvent(C8296e eVar) {
        if (eVar != null && eVar.f22778c) {
            m13374a(eVar.f22777b, (CheckOrderOriginalResult) null, false);
        }
    }

    /* renamed from: b */
    private final void m13378b(Exception exc) {
        Context context = this.f11076b;
        if (exc == null) {
            exc = new Exception();
        }
        C9076n.m27096a(context, (Throwable) exc, (int) R.string.ed1);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C3648d dVar = this.f11079e;
        if (dVar != null) {
            dVar.mo8963a();
        }
        if (this.f11082h != null) {
            C3701d dVar2 = this.f11082h;
            if (dVar2 == null) {
                C7573i.m23580a();
            }
            dVar2.mo11208a(dialogInterface);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m13377b(View view) {
        if (view == null) {
            view = getView();
        }
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.dtd);
            if (textView != null) {
                C3693c walletCenter = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter();
                C7573i.m23582a((Object) walletCenter, "ServiceManager.getServic…          .walletCenter()");
                textView.setText(String.valueOf(walletCenter.mo11155b()));
            }
        }
    }

    /* renamed from: a */
    public final void mo11111a(int i) {
        if (this.f11078d == null) {
            ProgressDialog a = C9053at.m27042a(this.f11076b);
            a.setCancelable(false);
            a.setCanceledOnTouchOutside(false);
            this.f11078d = a;
        }
        ProgressDialog progressDialog = this.f11078d;
        if (progressDialog != null && !progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this.f11078d;
            if (progressDialog2 != null) {
                progressDialog2.show();
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C7573i.m23582a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            if (m13379i()) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (m13379i()) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-2, -1);
            }
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    private final void m13375a(View view) {
        int i;
        View findViewById = view.findViewById(R.id.ap3);
        if (findViewById != null) {
            if (C3519c.m12965a(getContext())) {
                i = R.drawable.bpu;
            } else {
                i = R.drawable.bpt;
            }
            findViewById.setBackgroundResource(i);
        }
        Drawable c = C3358ac.m12524c(R.drawable.c41);
        int a = C3358ac.m12510a(16.0f);
        c.setBounds(0, 0, a, a);
        TextView textView = (TextView) view.findViewById(R.id.dtd);
        if (textView != null) {
            textView.setCompoundDrawables(c, null, null, null);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.a8p);
        C7573i.m23582a((Object) textView2, "rootView.diamond_protocol");
        textView2.setVisibility(8);
        ((TextView) view.findViewById(R.id.a8p)).setOnClickListener(new C3715b(this));
        RtlViewPager rtlViewPager = (RtlViewPager) view.findViewById(R.id.ed4);
        C7573i.m23582a((Object) rtlViewPager, "rootView.view_pager");
        rtlViewPager.setOverScrollMode(2);
        this.f11077c = new RechargePagerAdapter(C7525m.m23461a(), new C3716c(this));
        RtlViewPager rtlViewPager2 = (RtlViewPager) view.findViewById(R.id.ed4);
        if (rtlViewPager2 != null) {
            rtlViewPager2.setAdapter(this.f11077c);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aub, null);
        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.auc, null);
        inflate.setOnClickListener(new C3718d(this));
        ((LoadingStatusView) view.findViewById(R.id.dav)).setBuilder(C3555a.m13075a(getContext()).mo10837b((int) R.string.eiy).mo10839c(inflate).mo10836a(inflate2));
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
        if (exc != null) {
            C9076n.m27095a(getContext(), exc);
        }
        RechargePagerAdapter rechargePagerAdapter = this.f11077c;
        if (rechargePagerAdapter != null) {
            rechargePagerAdapter.mo11070a(C7525m.m23461a());
        }
        RechargePagerAdapter rechargePagerAdapter2 = this.f11077c;
        if (rechargePagerAdapter2 != null) {
            rechargePagerAdapter2.notifyDataSetChanged();
        }
        View view2 = getView();
        if (view2 != null) {
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.br4);
            if (linearLayout != null) {
                linearLayout.post(new C3723i(this));
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        Fragment fragment = this;
        ((C3245ad) C9097a.m27146a().mo22266a(C8296e.class).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a(fragment))).mo10182a((C7326g<? super T>) new C3726l<Object>(this));
        ((C3245ad) ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11152a().mo19297a((C7494t<T, ? extends R>) C3255e.m12294a(fragment))).mo10182a((C7326g<? super T>) new C3727m<Object>(this));
        C8984e user = ((C3592a) C3596c.m13172a(C3592a.class)).user();
        C7573i.m23582a((Object) user, "ServiceManager.getServic…rvice::class.java).user()");
        mo11221a(user.mo22165a());
        ((C3245ad) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22186f().mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a(fragment))).mo10183a(new C3728n(this), C3729o.f11104a);
        ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22185e().mo19128a();
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
        C3648d dVar = this.f11079e;
        if (dVar != null) {
            dVar.mo11107b();
        }
    }

    /* renamed from: a */
    public final void mo11112a(int i, CheckOrderOriginalResult checkOrderOriginalResult) {
        m13374a(i, (CheckOrderOriginalResult) null, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final View m13371a(ImageModel imageModel, Spannable spannable, int i) {
        if (getContext() == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LayoutParams(-2, C3358ac.m12510a(16.0f)));
        ImageView imageView = new ImageView(linearLayout.getContext());
        int a = C3358ac.m12510a(14.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        if (i != -1) {
            imageView.setImageResource(i);
        } else {
            C5343e.m17030a(imageView, imageModel);
        }
        TextView textView = new TextView(linearLayout.getContext());
        textView.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        textView.setLayoutParams(layoutParams2);
        textView.setTextColor(C3358ac.m12521b((int) R.color.as5));
        textView.setGravity(17);
        int a2 = C3358ac.m12510a(8.0f);
        textView.setPadding(a2 / 2, 0, a2, 0);
        textView.setText(spannable);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.aou, viewGroup, false);
        if (m13379i()) {
            C8947c<Integer> cVar = C8946b.f24449bc;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.REC…RGE_DIALOG_CONTENT_HEIGHT");
            Integer num = (Integer) cVar.mo22117a();
            if ((num == null || num.intValue() != 0) && inflate != null) {
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.br4);
                if (linearLayout != null) {
                    LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if (layoutParams != null) {
                        C7573i.m23582a((Object) num, "height");
                        layoutParams.height = num.intValue();
                        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.br4);
                        if (linearLayout2 != null) {
                            linearLayout2.setLayoutParams(layoutParams);
                        }
                    }
                }
            }
        }
        C7573i.m23582a((Object) inflate, "rootView");
        m13375a(inflate);
        m13381k();
        C8443c.m25663a().mo21606a("livesdk_recharge_show", C7507ae.m23393a(C7579l.m23633a("request_page", mo11222b()), C7579l.m23633a("charge_reason", mo11220a()), C7579l.m23633a("charge_style", "window")), C8438j.class, Room.class);
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ee, code lost:
        if (r3 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13374a(int r7, com.bytedance.android.live.wallet.model.CheckOrderOriginalResult r8, boolean r9) {
        /*
            r6 = this;
            if (r9 == 0) goto L_0x000e
            com.bytedance.android.livesdk.v.a r8 = com.bytedance.android.livesdk.p427v.C9097a.m27146a()
            com.bytedance.android.livesdk.h.e r9 = new com.bytedance.android.livesdk.h.e
            r9.<init>(r7)
            r8.mo22267a(r9)
        L_0x000e:
            java.lang.Class<com.bytedance.android.live.user.a> r7 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.utility.C3596c.m13172a(r7)
            com.bytedance.android.live.user.a r7 = (com.bytedance.android.live.user.C3592a) r7
            com.bytedance.android.livesdk.user.e r7 = r7.user()
            java.lang.String r8 = "ServiceManager.getServic…)\n                .user()"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            com.bytedance.android.live.base.model.user.IUser r7 = r7.mo22165a()
            java.lang.String r8 = "ServiceManager.getServic…      .user().currentUser"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            long r7 = r7.getPayScores()
            r0 = 0
            r9 = 1
            r2 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0036
            r7 = 1
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            r8 = 0
            if (r7 == 0) goto L_0x0060
            com.bytedance.android.live.core.setting.l<com.bytedance.android.livesdkapi.i.a> r7 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE
            java.lang.String r0 = "LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            java.lang.Object r7 = r7.mo10240a()
            if (r7 == 0) goto L_0x0060
            android.app.Activity r7 = r6.f11076b
            android.content.Context r7 = (android.content.Context) r7
            android.app.Activity r0 = r6.f11076b
            if (r0 == 0) goto L_0x005c
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x005c
            r8 = 2131828111(0x7f111d8f, float:1.9289154E38)
            java.lang.String r8 = r0.getString(r8)
        L_0x005c:
            com.bytedance.android.live.uikit.p176d.C3517a.m12962a(r7, r8)
            goto L_0x0078
        L_0x0060:
            android.app.Activity r7 = r6.f11076b
            android.content.Context r7 = (android.content.Context) r7
            android.app.Activity r0 = r6.f11076b
            if (r0 == 0) goto L_0x0075
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0075
            r8 = 2131827549(0x7f111b5d, float:1.9288014E38)
            java.lang.String r8 = r0.getString(r8)
        L_0x0075:
            com.bytedance.android.live.uikit.p176d.C3517a.m12962a(r7, r8)
        L_0x0078:
            android.view.View r7 = r6.getView()
            if (r7 == 0) goto L_0x008c
            r8 = 2131298209(0x7f0907a1, float:1.8214385E38)
            android.view.View r7 = r7.findViewById(r8)
            if (r7 == 0) goto L_0x008c
            r8 = 8
            r7.setVisibility(r8)
        L_0x008c:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r7 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.utility.C3596c.m13172a(r7)
            com.bytedance.android.live.wallet.IWalletService r7 = (com.bytedance.android.live.wallet.IWalletService) r7
            com.bytedance.android.live.wallet.c r7 = r7.walletCenter()
            r7.mo11160e()
            java.lang.Class<com.bytedance.android.live.user.a> r7 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.utility.C3596c.m13172a(r7)
            com.bytedance.android.live.user.a r7 = (com.bytedance.android.live.user.C3592a) r7
            com.bytedance.android.livesdk.user.e r7 = r7.user()
            io.reactivex.aa r7 = r7.mo22185e()
            r7.mo19128a()
            com.bytedance.android.live.wallet.b.a.d r7 = r6.f11079e
            if (r7 == 0) goto L_0x00b5
            r7.mo11107b()
        L_0x00b5:
            com.bytedance.android.livesdk.log.c r7 = com.bytedance.android.livesdk.log.C8443c.m25663a()
            java.lang.String r8 = "livesdk_recharge_success"
            r0 = 6
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            java.lang.String r1 = "money"
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r3 = r6.f11080f
            if (r3 == 0) goto L_0x00c7
            int r3 = r3.f25520f
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r4 = r6.f11080f
            if (r4 == 0) goto L_0x00cf
            int r4 = r4.f25519e
            goto L_0x00d0
        L_0x00cf:
            r4 = 0
        L_0x00d0:
            int r3 = r3 + r4
            java.lang.String r3 = java.lang.String.valueOf(r3)
            kotlin.Pair r1 = kotlin.C7579l.m23633a(r1, r3)
            r0[r2] = r1
            java.lang.String r1 = "pay_method"
            com.bytedance.android.livesdkapi.host.PayChannel r3 = r6.f11081g
            com.bytedance.android.livesdkapi.host.PayChannel r4 = com.bytedance.android.livesdkapi.host.PayChannel.GOOGLE
            if (r3 != r4) goto L_0x00e6
            java.lang.String r3 = "google_pay"
            goto L_0x00f2
        L_0x00e6:
            com.bytedance.android.livesdkapi.host.PayChannel r3 = r6.f11081g
            if (r3 == 0) goto L_0x00f0
            java.lang.String r3 = r3.getValue()
            if (r3 != 0) goto L_0x00f2
        L_0x00f0:
            java.lang.String r3 = ""
        L_0x00f2:
            kotlin.Pair r1 = kotlin.C7579l.m23633a(r1, r3)
            r0[r9] = r1
            java.lang.String r1 = "charge_style"
            java.lang.String r3 = "window"
            kotlin.Pair r1 = kotlin.C7579l.m23633a(r1, r3)
            r3 = 2
            r0[r3] = r1
            r1 = 3
            java.lang.String r4 = "charge_reason"
            java.lang.String r5 = r6.mo11220a()
            kotlin.Pair r4 = kotlin.C7579l.m23633a(r4, r5)
            r0[r1] = r4
            r1 = 4
            java.lang.String r4 = "request_page"
            java.lang.String r5 = r6.mo11222b()
            kotlin.Pair r4 = kotlin.C7579l.m23633a(r4, r5)
            r0[r1] = r4
            r1 = 5
            java.lang.String r4 = "growth_deepevent"
            java.lang.String r5 = "1"
            kotlin.Pair r4 = kotlin.C7579l.m23633a(r4, r5)
            r0[r1] = r4
            java.util.Map r0 = kotlin.collections.C7507ae.m23393a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Class<com.bytedance.android.livesdk.log.b.j> r3 = com.bytedance.android.livesdk.log.p405b.C8438j.class
            r1[r2] = r3
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r2 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r1[r9] = r2
            r7.mo21606a(r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.dialog.RechargeDialog.m13374a(int, com.bytedance.android.live.wallet.model.CheckOrderOriginalResult, boolean):void");
    }
}
