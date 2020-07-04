package com.bytedance.android.live.wallet.p178b.p179a;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.p022v4.util.ArrayMap;
import com.bytedance.android.live.api.exceptions.local.ApiLocalException;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3642b;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.LiveBillingActivityProxy;
import com.bytedance.android.live.wallet.LiveBillingActivityProxy.C3598a;
import com.bytedance.android.live.wallet.api.C3634i;
import com.bytedance.android.live.wallet.api.C3634i.C3635a;
import com.bytedance.android.live.wallet.api.C3634i.C3638d;
import com.bytedance.android.live.wallet.api.C3634i.C3639e;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C3822h;
import com.bytedance.android.live.wallet.model.C3823i;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.monitor.OrderMonitor;
import com.bytedance.android.live.wallet.monitor.OrderMonitor.Stage;
import com.bytedance.android.live.wallet.p177a.C3601a;
import com.bytedance.android.live.wallet.p178b.p180b.C3671c;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdkapi.depend.model.C9343a;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal.HsSkuDetail;
import com.bytedance.android.livesdkapi.depend.model.p446b.C9354a;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.wallet.b.a.d */
public final class C3648d extends C3645b<C3671c> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f10874a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C3648d.class), "api", "getApi()Lcom/bytedance/android/live/wallet/api/WalletApi;"))};

    /* renamed from: h */
    public static final C3649a f10875h = new C3649a(null);

    /* renamed from: b */
    public C3646c f10876b;

    /* renamed from: c */
    public C7321c f10877c;

    /* renamed from: d */
    public String f10878d;

    /* renamed from: e */
    public C7321c f10879e;

    /* renamed from: f */
    public Handler f10880f;

    /* renamed from: g */
    public final Activity f10881g;

    /* renamed from: i */
    private final C7541d f10882i;

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$a */
    public static final class C3649a {
        private C3649a() {
        }

        public /* synthetic */ C3649a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$b */
    static final class C3650b extends Lambda implements C7561a<WalletApi> {

        /* renamed from: a */
        public static final C3650b f10883a = new C3650b();

        C3650b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m13261a();
        }

        /* renamed from: a */
        private static WalletApi m13261a() {
            return (WalletApi) C3458e.m12798a().mo10440a(WalletApi.class);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$c */
    static final class C3651c implements C3638d {

        /* renamed from: a */
        final /* synthetic */ C3648d f10884a;

        C3651c(C3648d dVar) {
            this.f10884a = dVar;
        }

        /* renamed from: a */
        public final void mo11100a(boolean z) {
            if (!z) {
                C3671c cVar = (C3671c) this.f10884a.mo9140c();
                if (cVar != null) {
                    cVar.mo11116c();
                }
                this.f10884a.f10880f.removeMessages(111);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$d */
    static final class C3652d<T> implements C7326g<C3479d<C9354a>> {

        /* renamed from: a */
        final /* synthetic */ C3648d f10885a;

        /* renamed from: b */
        final /* synthetic */ long f10886b;

        /* renamed from: c */
        final /* synthetic */ PayChannel f10887c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f10888d;

        C3652d(C3648d dVar, long j, PayChannel payChannel, ChargeDeal chargeDeal) {
            this.f10885a = dVar;
            this.f10886b = j;
            this.f10887c = payChannel;
            this.f10888d = chargeDeal;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C9354a> dVar) {
            C3648d.m13249a(this.f10886b, 0, this.f10887c, this.f10888d.f25515a, (Throwable) null);
            Object obj = dVar.data;
            C7573i.m23582a(obj, "orderInfoResponse.data");
            final String str = ((C9354a) obj).f25560a;
            LiveBillingActivityProxy.m13177a(new C3598a(this) {

                /* renamed from: a */
                final /* synthetic */ C3652d f10889a;

                {
                    this.f10889a = r1;
                }

                /* renamed from: a */
                public final void mo11024a(int i, int i2, String str) {
                    int i3;
                    String str2;
                    String str3;
                    Integer num;
                    int i4 = i2;
                    Integer num2 = null;
                    LiveBillingActivityProxy.m13177a(null);
                    if (i == C3639e.f10853a) {
                        String str4 = str;
                        C7573i.m23582a((Object) str4, "orderId");
                        long j = this.f10889a.f10888d.f25515a;
                        if (str == null) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        C3648d.m13247a(0, str4, j, i2, str3);
                        C3671c cVar = (C3671c) this.f10889a.f10885a.mo9140c();
                        if (cVar != null) {
                            cVar.mo11111a(0);
                        }
                        C3648d dVar = this.f10889a.f10885a;
                        String str5 = str;
                        C7573i.m23582a((Object) str5, "orderId");
                        ChargeDeal chargeDeal = this.f10889a.f10888d;
                        if (chargeDeal != null) {
                            num = Integer.valueOf(chargeDeal.f25519e);
                        } else {
                            num = null;
                        }
                        int intValue = num.intValue();
                        ChargeDeal chargeDeal2 = this.f10889a.f10888d;
                        if (chargeDeal2 != null) {
                            num2 = Integer.valueOf(chargeDeal2.f25520f);
                        }
                        dVar.mo11105a(0, str5, intValue + num2.intValue());
                        return;
                    }
                    if (i4 == C3639e.f10855c) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    if (i4 == C3639e.f10855c) {
                        C19282c.m63183a(C3358ac.m12528e(), "recharge_pay_result", "cancel", -1, 1);
                        StringBuilder sb = new StringBuilder("response code: ");
                        sb.append(1);
                        OrderMonitor.m13580a(Stage.GOOGLE_PAY, "1", (String) null, OrderMonitor.m13575a(1, this.f10889a.f10888d.f25515a, this.f10889a.f10888d.f25521g, str, "", 0, sb.toString()));
                        C3671c cVar2 = (C3671c) this.f10889a.f10885a.mo9140c();
                        if (cVar2 != null) {
                            cVar2.mo11117d();
                        }
                    } else {
                        C19282c.m63183a(C3358ac.m12528e(), "recharge_pay_result", "fail_google_pay_fail", -1, (long) i4);
                        StringBuilder sb2 = new StringBuilder("response code: ");
                        sb2.append(i4);
                        OrderMonitor.m13580a(Stage.GOOGLE_PAY, String.valueOf(i2), (String) null, OrderMonitor.m13575a(2, this.f10889a.f10888d.f25515a, this.f10889a.f10888d.f25521g, str, "", 0, sb2.toString()));
                        C3671c cVar3 = (C3671c) this.f10889a.f10885a.mo9140c();
                        if (cVar3 != null) {
                            cVar3.mo11115a((Exception) null, (int) R.string.ejk);
                        }
                    }
                    String str6 = str;
                    C7573i.m23582a((Object) str6, "orderId");
                    long j2 = this.f10889a.f10888d.f25515a;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    C3648d.m13247a(i3, str6, j2, i2, str2);
                }
            });
            Object obj2 = dVar.data;
            C7573i.m23582a(obj2, "orderInfoResponse.data");
            JSONObject jSONObject = new JSONObject(((C9354a) obj2).f25561b);
            Bundle bundle = new Bundle();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                bundle.putString(str2, jSONObject.optString(str2));
            }
            ((IWalletService) C3596c.m13172a(IWalletService.class)).openBillingProxyActivity(this.f10885a.f10881g, bundle);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$e */
    static final class C3654e<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C3648d f10891a;

        /* renamed from: b */
        final /* synthetic */ long f10892b;

        /* renamed from: c */
        final /* synthetic */ PayChannel f10893c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f10894d;

        C3654e(C3648d dVar, long j, PayChannel payChannel, ChargeDeal chargeDeal) {
            this.f10891a = dVar;
            this.f10892b = j;
            this.f10893c = payChannel;
            this.f10894d = chargeDeal;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C3648d.m13249a(this.f10892b, 1, this.f10893c, this.f10894d.f25515a, th);
            C3671c cVar = (C3671c) this.f10891a.mo9140c();
            if (cVar != null) {
                cVar.mo11116c();
            }
            C19282c.m63183a(C3358ac.m12528e(), "recharge_pay_result", "fail_google_create_order_fail", -1, -1);
            if (!(th instanceof Exception)) {
                th = null;
            }
            Exception exc = (Exception) th;
            if (exc == null) {
                exc = new Exception();
            }
            OrderMonitor.m13578a(Stage.CREATE_ORDER, exc);
            OrderMonitor.m13582a(PayChannel.GOOGLE, exc);
            C3671c cVar2 = (C3671c) this.f10891a.mo9140c();
            if (cVar2 != null) {
                cVar2.mo11115a(exc, 0);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$f */
    static final class C3655f<T> implements C7326g<C3479d<C9353b>> {

        /* renamed from: a */
        final /* synthetic */ C3648d f10895a;

        /* renamed from: b */
        final /* synthetic */ long f10896b;

        /* renamed from: c */
        final /* synthetic */ PayChannel f10897c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f10898d;

        C3655f(C3648d dVar, long j, PayChannel payChannel, ChargeDeal chargeDeal) {
            this.f10895a = dVar;
            this.f10896b = j;
            this.f10897c = payChannel;
            this.f10898d = chargeDeal;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C9353b> dVar) {
            C9353b bVar;
            CharSequence charSequence;
            boolean z;
            CharSequence charSequence2;
            C3648d.m13249a(this.f10896b, 0, this.f10897c, this.f10898d.f25515a, (Throwable) null);
            C3671c cVar = (C3671c) this.f10895a.mo9140c();
            if (cVar != null) {
                cVar.mo11116c();
            }
            if (dVar != null) {
                bVar = (C9353b) dVar.data;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                C9353b bVar2 = (C9353b) dVar.data;
                if (bVar2 != null) {
                    charSequence = bVar2.f25546a;
                } else {
                    charSequence = null;
                }
                CharSequence charSequence3 = charSequence;
                boolean z2 = true;
                if (charSequence3 == null || C7634n.m23713a(charSequence3)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C9353b bVar3 = (C9353b) dVar.data;
                    if (bVar3 != null) {
                        charSequence2 = bVar3.f25547b;
                    } else {
                        charSequence2 = null;
                    }
                    CharSequence charSequence4 = charSequence2;
                    if (charSequence4 != null && !C7634n.m23713a(charSequence4)) {
                        z2 = false;
                    }
                    if (!z2) {
                        OrderMonitor.m13584a(this.f10897c, (JSONObject) null);
                        C9353b bVar4 = (C9353b) dVar.data;
                        if (bVar4 != null) {
                            bVar4.f25548c = this.f10897c;
                        }
                        C3671c cVar2 = (C3671c) this.f10895a.mo9140c();
                        if (cVar2 != null) {
                            cVar2.mo11113a((C9353b) dVar.data);
                            return;
                        }
                    }
                }
            }
            OrderMonitor.m13581a(this.f10897c, 0, "invalid order", (JSONObject) null);
            C3671c cVar3 = (C3671c) this.f10895a.mo9140c();
            if (cVar3 != null) {
                cVar3.mo11114a(new Exception(C3358ac.m12515a((int) R.string.ejj)));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$g */
    static final class C3656g<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C3648d f10899a;

        /* renamed from: b */
        final /* synthetic */ long f10900b;

        /* renamed from: c */
        final /* synthetic */ PayChannel f10901c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f10902d;

        /* renamed from: e */
        final /* synthetic */ ObjectRef f10903e;

        C3656g(C3648d dVar, long j, PayChannel payChannel, ChargeDeal chargeDeal, ObjectRef objectRef) {
            this.f10899a = dVar;
            this.f10900b = j;
            this.f10901c = payChannel;
            this.f10902d = chargeDeal;
            this.f10903e = objectRef;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            int i;
            String str;
            PayChannel payChannel;
            C3648d.m13249a(this.f10900b, 1, this.f10901c, this.f10902d.f25515a, th);
            if (th != null) {
                C3166a.m11958a((String) this.f10903e.element, th);
            }
            if (th instanceof ApiServerException) {
                payChannel = this.f10901c;
                ApiServerException apiServerException = (ApiServerException) th;
                i = apiServerException.getErrorCode();
                str = apiServerException.getErrorMsg();
            } else {
                payChannel = this.f10901c;
                i = 0;
                if (th != null) {
                    str = th.toString();
                } else {
                    str = null;
                }
            }
            OrderMonitor.m13581a(payChannel, i, str, (JSONObject) null);
            C3671c cVar = (C3671c) this.f10899a.mo9140c();
            if (cVar != null) {
                cVar.mo11116c();
            }
            C3671c cVar2 = (C3671c) this.f10899a.mo9140c();
            if (cVar2 != null) {
                if (!(th instanceof Exception)) {
                    th = null;
                }
                Exception exc = (Exception) th;
                if (exc == null) {
                    exc = new Exception();
                }
                cVar2.mo11114a(exc);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$h */
    static final class C3657h<T> implements C7326g<C3479d<Object>> {

        /* renamed from: a */
        final /* synthetic */ C3648d f10904a;

        /* renamed from: b */
        final /* synthetic */ long f10905b;

        /* renamed from: c */
        final /* synthetic */ PayChannel f10906c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f10907d;

        C3657h(C3648d dVar, long j, PayChannel payChannel, ChargeDeal chargeDeal) {
            this.f10904a = dVar;
            this.f10905b = j;
            this.f10906c = payChannel;
            this.f10907d = chargeDeal;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<Object> dVar) {
            C3648d.m13249a(this.f10905b, 0, this.f10906c, this.f10907d.f25515a, (Throwable) null);
            C3671c cVar = (C3671c) this.f10904a.mo9140c();
            if (cVar != null) {
                cVar.mo11116c();
            }
            C3671c cVar2 = (C3671c) this.f10904a.mo9140c();
            if (cVar2 != null) {
                cVar2.mo11112a(this.f10907d.f25519e, (CheckOrderOriginalResult) null);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$i */
    static final class C3658i<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C3648d f10908a;

        /* renamed from: b */
        final /* synthetic */ long f10909b;

        /* renamed from: c */
        final /* synthetic */ PayChannel f10910c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f10911d;

        C3658i(C3648d dVar, long j, PayChannel payChannel, ChargeDeal chargeDeal) {
            this.f10908a = dVar;
            this.f10909b = j;
            this.f10910c = payChannel;
            this.f10911d = chargeDeal;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C3648d.m13249a(this.f10909b, 1, this.f10910c, this.f10911d.f25515a, th);
            C3671c cVar = (C3671c) this.f10908a.mo9140c();
            if (cVar != null) {
                cVar.mo11116c();
            }
            C3671c cVar2 = (C3671c) this.f10908a.mo9140c();
            if (cVar2 != null) {
                if (!(th instanceof Exception)) {
                    th = null;
                }
                Exception exc = (Exception) th;
                if (exc == null) {
                    exc = new Exception();
                }
                cVar2.mo11115a(exc, 0);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$j */
    static final class C3659j<T> implements C7326g<C3474a<C3822h, C3823i>> {

        /* renamed from: a */
        public static final C3659j f10912a = new C3659j();

        C3659j() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m13270a((C3474a) obj);
        }

        /* renamed from: a */
        private static void m13270a(C3474a<C3822h, C3823i> aVar) {
            Object obj;
            List<T> list = aVar.f10296b;
            C7573i.m23582a((Object) list, "res.data");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C3822h hVar = (C3822h) obj;
                C7573i.m23582a((Object) hVar, "rechargeBean");
                if (C7573i.m23585a((Object) hVar.f11375a, (Object) "GooglePay")) {
                    break;
                }
            }
            if (((C3822h) obj) == null) {
                new ApiLocalException(-18, new RuntimeException("no google deals"));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$k */
    static final class C3660k<T> implements C7326g<C3474a<C3822h, C3823i>> {

        /* renamed from: a */
        final /* synthetic */ C3648d f10913a;

        /* renamed from: b */
        final /* synthetic */ long f10914b;

        /* renamed from: com.bytedance.android.live.wallet.b.a.d$k$a */
        public static final class C3661a implements C3635a {

            /* renamed from: a */
            final /* synthetic */ C9343a f10915a;

            /* renamed from: b */
            final /* synthetic */ long f10916b;

            /* renamed from: c */
            final /* synthetic */ C3660k f10917c;

            /* renamed from: d */
            final /* synthetic */ C3474a f10918d;

            /* renamed from: a */
            public final void mo11097a() {
                C3648d.m13248a(this.f10916b, 1, -10, "onFailed");
                List a = this.f10917c.f10913a.mo11104a(this.f10918d, (C9343a) null);
                C3671c cVar = (C3671c) this.f10917c.f10913a.mo9140c();
                if (cVar != null) {
                    cVar.mo11121f();
                }
                C3671c cVar2 = (C3671c) this.f10917c.f10913a.mo9140c();
                if (cVar2 != null) {
                    String str = this.f10917c.f10913a.f10878d;
                    if (str == null) {
                        str = "";
                    }
                    cVar2.mo11118a(str, a);
                }
            }

            /* renamed from: a */
            public final void mo11098a(Bundle bundle) {
                Integer num;
                int i;
                if (bundle != null) {
                    num = Integer.valueOf(bundle.getInt("RESPONSE_CODE"));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 0) {
                    C9343a a = C3648d.m13245a(this.f10915a, bundle);
                    C3648d.m13248a(this.f10916b, 0, num.intValue(), null);
                    List a2 = this.f10917c.f10913a.mo11104a(this.f10918d, a);
                    C3671c cVar = (C3671c) this.f10917c.f10913a.mo9140c();
                    if (cVar != null) {
                        cVar.mo11121f();
                    }
                    C3671c cVar2 = (C3671c) this.f10917c.f10913a.mo9140c();
                    if (cVar2 != null) {
                        String str = this.f10917c.f10913a.f10878d;
                        if (str == null) {
                            str = "";
                        }
                        cVar2.mo11118a(str, a2);
                    }
                    return;
                }
                C3648d dVar = this.f10917c.f10913a;
                long j = this.f10916b;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -10;
                }
                C3648d.m13248a(j, 1, i, null);
                List a3 = this.f10917c.f10913a.mo11104a(this.f10918d, (C9343a) null);
                C3671c cVar3 = (C3671c) this.f10917c.f10913a.mo9140c();
                if (cVar3 != null) {
                    cVar3.mo11121f();
                }
                C3671c cVar4 = (C3671c) this.f10917c.f10913a.mo9140c();
                if (cVar4 != null) {
                    String str2 = this.f10917c.f10913a.f10878d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    cVar4.mo11118a(str2, a3);
                }
            }

            C3661a(C9343a aVar, long j, C3660k kVar, C3474a aVar2) {
                this.f10915a = aVar;
                this.f10916b = j;
                this.f10917c = kVar;
                this.f10918d = aVar2;
            }
        }

        C3660k(C3648d dVar, long j) {
            this.f10913a = dVar;
            this.f10914b = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3474a<C3822h, C3823i> aVar) {
            Object obj;
            C7573i.m23587b(aVar, "allList");
            C3648d.m13250a(this.f10914b, 0, (Throwable) null);
            List<T> list = aVar.f10296b;
            C7573i.m23582a((Object) list, "allList.data");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C3822h hVar = (C3822h) obj;
                C7573i.m23582a((Object) hVar, "rechargeBean");
                if (C7573i.m23585a((Object) hVar.f11375a, (Object) "GooglePay")) {
                    break;
                }
            }
            C3822h hVar2 = (C3822h) obj;
            if (hVar2 != null) {
                C9343a aVar2 = new C9343a();
                aVar2.f25539a = hVar2.f11384j;
                C3634i iVar = (C3634i) C3642b.m13238a(C3634i.class);
                List<ChargeDeal> list2 = aVar2.f25539a;
                C7573i.m23582a((Object) list2, "this.chargeDeals");
                Iterable<ChargeDeal> iterable = list2;
                Collection arrayList = new ArrayList(C7525m.m23469a((Iterable) iterable, 10));
                for (ChargeDeal chargeDeal : iterable) {
                    C7573i.m23582a((Object) chargeDeal, "it");
                    arrayList.add(chargeDeal.f25521g);
                }
                List h = C7525m.m23516h((Iterable) (List) arrayList);
                long uptimeMillis = SystemClock.uptimeMillis();
                if (iVar != null) {
                    C3661a aVar3 = new C3661a(aVar2, uptimeMillis, this, aVar);
                    iVar.mo11049a(this.f10913a.f10881g, h, "inapp", aVar3);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$l */
    static final class C3662l<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C3648d f10919a;

        /* renamed from: b */
        final /* synthetic */ long f10920b;

        C3662l(C3648d dVar, long j) {
            this.f10919a = dVar;
            this.f10920b = j;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
            if (r2 == null) goto L_0x003b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(java.lang.Throwable r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof com.bytedance.android.live.api.exceptions.ApiException
                if (r0 == 0) goto L_0x0021
                com.bytedance.android.livesdk.log.h r0 = new com.bytedance.android.livesdk.log.h
                r0.<init>()
                java.lang.String r1 = "errorCode"
                r2 = r4
                com.bytedance.android.live.api.exceptions.ApiException r2 = (com.bytedance.android.live.api.exceptions.ApiException) r2
                int r2 = r2.getErrorCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                com.bytedance.android.livesdk.log.h r0 = r0.mo21613a(r1, r2)
                java.lang.String r1 = "errorDesc"
                java.lang.String r2 = r4.getMessage()
                goto L_0x003d
            L_0x0021:
                com.bytedance.android.livesdk.log.h r0 = new com.bytedance.android.livesdk.log.h
                r0.<init>()
                java.lang.String r1 = "errorCode"
                r2 = -1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                com.bytedance.android.livesdk.log.h r0 = r0.mo21613a(r1, r2)
                java.lang.String r1 = "errorDesc"
                if (r4 == 0) goto L_0x003b
                java.lang.String r2 = r4.getMessage()
                if (r2 != 0) goto L_0x003d
            L_0x003b:
                java.lang.String r2 = ""
            L_0x003d:
                com.bytedance.android.livesdk.log.h r0 = r0.mo21613a(r1, r2)
                java.lang.String r1 = "hotsoon_iap_productslist_failure_rate"
                r2 = 1
                r0.mo21616a(r1, r2)
                long r0 = r3.f10920b
                com.bytedance.android.live.wallet.p178b.p179a.C3648d.m13250a(r0, r2, r4)
                com.bytedance.android.live.wallet.b.a.d r0 = r3.f10919a
                com.bytedance.ies.a.a r0 = r0.mo9140c()
                com.bytedance.android.live.wallet.b.b.c r0 = (com.bytedance.android.live.wallet.p178b.p180b.C3671c) r0
                if (r0 == 0) goto L_0x0059
                r0.mo11121f()
            L_0x0059:
                boolean r0 = r4 instanceof java.lang.Exception
                if (r0 == 0) goto L_0x006e
                com.bytedance.android.live.wallet.b.a.d r0 = r3.f10919a
                com.bytedance.ies.a.a r0 = r0.mo9140c()
                com.bytedance.android.live.wallet.b.b.c r0 = (com.bytedance.android.live.wallet.p178b.p180b.C3671c) r0
                if (r0 == 0) goto L_0x006e
                java.lang.Exception r4 = (java.lang.Exception) r4
                r1 = 0
                r0.mo11119b(r4, r1)
                return
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p178b.p179a.C3648d.C3662l.accept(java.lang.Throwable):void");
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$m */
    public static final class C3663m extends Handler {

        /* renamed from: a */
        final /* synthetic */ C3648d f10921a;

        C3663m(C3648d dVar) {
            this.f10921a = dVar;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null && message.what == 111) {
                C3671c cVar = (C3671c) this.f10921a.mo9140c();
                if (cVar != null) {
                    cVar.mo11116c();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$n */
    static final class C3664n<T> implements C7326g<CheckOrderOriginalResult> {

        /* renamed from: a */
        final /* synthetic */ C3648d f10922a;

        /* renamed from: b */
        final /* synthetic */ C7563m f10923b;

        /* renamed from: c */
        final /* synthetic */ int f10924c;

        /* renamed from: d */
        final /* synthetic */ String f10925d;

        /* renamed from: e */
        final /* synthetic */ int f10926e;

        C3664n(C3648d dVar, C7563m mVar, int i, String str, int i2) {
            this.f10922a = dVar;
            this.f10923b = mVar;
            this.f10924c = i;
            this.f10925d = str;
            this.f10926e = i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(CheckOrderOriginalResult checkOrderOriginalResult) {
            if (checkOrderOriginalResult.getData().f11289a != 1) {
                this.f10923b.invoke(new RuntimeException("query status was fail"), Integer.valueOf(checkOrderOriginalResult.getData().f11289a));
                return;
            }
            C3671c cVar = (C3671c) this.f10922a.mo9140c();
            if (cVar != null) {
                cVar.mo11116c();
            }
            C3671c cVar2 = (C3671c) this.f10922a.mo9140c();
            if (cVar2 != null) {
                cVar2.mo11112a(this.f10924c, (CheckOrderOriginalResult) null);
            }
            C19282c.m63183a(C3358ac.m12528e(), "recharge_pay_result", "google_pay_success", -1, -1);
            C3648d.m13246a(0, this.f10925d, this.f10926e, 0, "");
            OrderMonitor.m13576a();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$o */
    static final class C3665o<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C7563m f10927a;

        C3665o(C7563m mVar) {
            this.f10927a = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            Throwable th2;
            C7563m mVar = this.f10927a;
            if (!(th instanceof Exception)) {
                th2 = null;
            } else {
                th2 = th;
            }
            Exception exc = (Exception) th2;
            if (exc == null) {
                exc = new Exception(th);
            }
            mVar.invoke(exc, Integer.valueOf(0));
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a.d$p */
    static final class C3666p extends Lambda implements C7563m<Exception, Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C3648d f10928a;

        /* renamed from: b */
        final /* synthetic */ int f10929b;

        /* renamed from: c */
        final /* synthetic */ String f10930c;

        /* renamed from: d */
        final /* synthetic */ int f10931d;

        C3666p(C3648d dVar, int i, String str, int i2) {
            this.f10928a = dVar;
            this.f10929b = i;
            this.f10930c = str;
            this.f10931d = i2;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m13277a((Exception) obj, ((Number) obj2).intValue());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
            if (r4 == null) goto L_0x005b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Object m13277a(java.lang.Exception r8, int r9) {
            /*
                r7 = this;
                int r0 = r7.f10929b
                r1 = 5
                if (r0 >= r1) goto L_0x001b
                com.bytedance.android.live.wallet.b.a.d r8 = r7.f10928a
                android.os.Handler r8 = r8.f10880f
                com.bytedance.android.live.wallet.b.a.d$p$1 r9 = new com.bytedance.android.live.wallet.b.a.d$p$1
                r9.<init>(r7)
                java.lang.Runnable r9 = (java.lang.Runnable) r9
                r0 = 2000(0x7d0, double:9.88E-321)
                boolean r8 = r8.postDelayed(r9, r0)
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                return r8
            L_0x001b:
                android.content.Context r0 = com.bytedance.android.live.core.utils.C3358ac.m12528e()
                java.lang.String r1 = "recharge_pay_result"
                java.lang.String r2 = "fail_google_check_fail"
                r3 = -1
                r5 = -1
                com.p280ss.android.common.p288d.C19282c.m63183a(r0, r1, r2, r3, r5)
                r0 = 0
                if (r8 == 0) goto L_0x0033
                com.bytedance.android.live.wallet.monitor.OrderMonitor$Stage r9 = com.bytedance.android.live.wallet.monitor.OrderMonitor.Stage.CHECK_ORDER
                com.bytedance.android.live.wallet.monitor.OrderMonitor.m13578a(r9, r8)
                goto L_0x003c
            L_0x0033:
                com.bytedance.android.live.wallet.monitor.OrderMonitor$Stage r1 = com.bytedance.android.live.wallet.monitor.OrderMonitor.Stage.CHECK_ORDER
                java.lang.String r9 = java.lang.String.valueOf(r9)
                com.bytedance.android.live.wallet.monitor.OrderMonitor.m13580a(r1, r9, r0, r0)
            L_0x003c:
                r9 = 1
                java.lang.String r1 = r7.f10930c
                int r2 = r7.f10929b
                boolean r3 = r8 instanceof com.bytedance.android.live.api.exceptions.server.ApiServerException
                if (r3 != 0) goto L_0x0047
                r3 = r0
                goto L_0x0048
            L_0x0047:
                r3 = r8
            L_0x0048:
                com.bytedance.android.live.api.exceptions.server.ApiServerException r3 = (com.bytedance.android.live.api.exceptions.server.ApiServerException) r3
                if (r3 == 0) goto L_0x0051
                int r3 = r3.getErrorCode()
                goto L_0x0053
            L_0x0051:
                r3 = -11
            L_0x0053:
                if (r8 == 0) goto L_0x005b
                java.lang.String r4 = r8.getMessage()
                if (r4 != 0) goto L_0x005d
            L_0x005b:
                java.lang.String r4 = "check order failed"
            L_0x005d:
                com.bytedance.android.live.wallet.p178b.p179a.C3648d.m13246a(r9, r1, r2, r3, r4)
                com.bytedance.android.live.wallet.b.a.d r9 = r7.f10928a
                com.bytedance.ies.a.a r9 = r9.mo9140c()
                com.bytedance.android.live.wallet.b.b.c r9 = (com.bytedance.android.live.wallet.p178b.p180b.C3671c) r9
                if (r9 == 0) goto L_0x006d
                r9.mo11116c()
            L_0x006d:
                com.bytedance.android.live.wallet.b.a.d r9 = r7.f10928a
                com.bytedance.ies.a.a r9 = r9.mo9140c()
                com.bytedance.android.live.wallet.b.b.c r9 = (com.bytedance.android.live.wallet.p178b.p180b.C3671c) r9
                if (r9 == 0) goto L_0x0080
                r0 = 2131827787(0x7f111c4b, float:1.9288496E38)
                r9.mo11115a(r8, r0)
                kotlin.n r8 = kotlin.C7581n.f20898a
                return r8
            L_0x0080:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p178b.p179a.C3648d.C3666p.m13277a(java.lang.Exception, int):java.lang.Object");
        }
    }

    /* renamed from: d */
    private WalletApi m13254d() {
        return (WalletApi) this.f10882i.getValue();
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        C3646c cVar = this.f10876b;
        if (cVar != null) {
            cVar.mo8963a();
        }
        C7321c cVar2 = this.f10877c;
        if (cVar2 != null && !cVar2.isDisposed()) {
            C7321c cVar3 = this.f10877c;
            if (cVar3 != null) {
                cVar3.dispose();
            }
        }
        this.f10880f.removeCallbacksAndMessages(null);
        C3634i iVar = (C3634i) C3642b.m13238a(C3634i.class);
        if (iVar != null) {
            iVar.mo11053c();
        }
    }

    /* renamed from: a */
    public final void mo11106a(ChargeDeal chargeDeal, PayChannel payChannel, String str) {
        ChargeDeal chargeDeal2 = chargeDeal;
        PayChannel payChannel2 = payChannel;
        C7573i.m23587b(chargeDeal2, "deal");
        C7573i.m23587b(payChannel2, "channel");
        C7573i.m23587b(str, "email");
        if (payChannel2 != PayChannel.GOOGLE) {
            C3671c cVar = (C3671c) mo9140c();
            if (cVar != null) {
                cVar.mo11111a((int) R.string.ehg);
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        switch (C3668e.f10934b[payChannel.ordinal()]) {
            case 1:
                C3671c cVar2 = (C3671c) mo9140c();
                if (cVar2 != null) {
                    cVar2.mo11111a((int) R.string.ehg);
                }
                this.f10880f.sendEmptyMessageDelayed(111, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                C3634i iVar = (C3634i) C3642b.m13238a(C3634i.class);
                if (iVar != null) {
                    iVar.mo11051a((C3638d) new C3651c(this));
                }
                WalletApi walletApi = (WalletApi) C3458e.m12798a().mo10440a(WalletApi.class);
                long j = chargeDeal2.f25515a;
                String str2 = this.f10878d;
                if (str2 == null) {
                    str2 = "";
                }
                C7492s a = walletApi.createPreOrder(j, 2, 0, str2).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
                long j2 = uptimeMillis;
                PayChannel payChannel3 = payChannel;
                ChargeDeal chargeDeal3 = chargeDeal;
                C3652d dVar = new C3652d(this, j2, payChannel3, chargeDeal3);
                C7326g gVar = dVar;
                C3654e eVar = new C3654e(this, j2, payChannel3, chargeDeal3);
                a.mo19280a(gVar, (C7326g<? super Throwable>) eVar);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                ObjectRef objectRef = new ObjectRef();
                objectRef.element = "";
                String str3 = "";
                switch (C3668e.f10933a[payChannel.ordinal()]) {
                    case 1:
                        objectRef.element = "onecard";
                        str3 = "12";
                        break;
                    case 2:
                        objectRef.element = "mastercard";
                        str3 = "11";
                        break;
                    case 3:
                        objectRef.element = "visa";
                        str3 = "11";
                        break;
                    case 4:
                        objectRef.element = "paybymobile";
                        str3 = "14";
                        break;
                }
                C7492s a2 = m13254d().createOrder(chargeDeal2.f25515a, str3, str, this.f10878d, (String) objectRef.element).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
                long j3 = uptimeMillis;
                PayChannel payChannel4 = payChannel;
                ObjectRef objectRef2 = objectRef;
                ChargeDeal chargeDeal4 = chargeDeal;
                C3655f fVar = new C3655f(this, j3, payChannel4, chargeDeal4);
                C7326g gVar2 = fVar;
                C3656g gVar3 = new C3656g(this, j3, payChannel4, chargeDeal4, objectRef2);
                a2.mo19280a(gVar2, (C7326g<? super Throwable>) gVar3);
                return;
            case 6:
                C7492s a3 = m13254d().flameChangeDiamond(String.valueOf(chargeDeal2.f25515a), "9").mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
                long j4 = uptimeMillis;
                PayChannel payChannel5 = payChannel;
                ChargeDeal chargeDeal5 = chargeDeal;
                C3657h hVar = new C3657h(this, j4, payChannel5, chargeDeal5);
                C7326g gVar4 = hVar;
                C3658i iVar2 = new C3658i(this, j4, payChannel5, chargeDeal5);
                a3.mo19280a(gVar4, (C7326g<? super Throwable>) iVar2);
                break;
        }
    }

    /* renamed from: a */
    public final void mo11105a(int i, String str, int i2) {
        C7321c cVar = this.f10879e;
        if (cVar != null && !cVar.isDisposed()) {
            C7321c cVar2 = this.f10879e;
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
        C7563m pVar = new C3666p(this, i, str, i2);
        C7492s a = new C3601a().mo11038a(str).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
        C3664n nVar = new C3664n(this, pVar, i2, str, i);
        this.f10879e = a.mo19280a((C7326g<? super T>) nVar, (C7326g<? super Throwable>) new C3665o<Object>(pVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r10 == null) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bytedance.android.live.wallet.model.C3822h> mo11104a(com.bytedance.android.live.network.response.C3474a<com.bytedance.android.live.wallet.model.C3822h, com.bytedance.android.live.wallet.model.C3823i> r9, com.bytedance.android.livesdkapi.depend.model.C9343a r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x0013
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r2 = r10.f25539a
            if (r2 == 0) goto L_0x0013
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r1
            if (r2 != r1) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r2 == 0) goto L_0x0062
            java.util.List<T> r3 = r9.f10296b
            java.lang.String r4 = "allList.data"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0023:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.bytedance.android.live.wallet.model.h r6 = (com.bytedance.android.live.wallet.model.C3822h) r6
            java.lang.String r7 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            java.lang.String r6 = r6.f11375a
            java.lang.String r7 = "GooglePay"
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r7)
            if (r6 == 0) goto L_0x0023
            goto L_0x0042
        L_0x0041:
            r4 = r5
        L_0x0042:
            com.bytedance.android.live.wallet.model.h r4 = (com.bytedance.android.live.wallet.model.C3822h) r4
            if (r4 == 0) goto L_0x004c
            if (r10 == 0) goto L_0x004a
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r5 = r10.f25539a
        L_0x004a:
            r4.f11384j = r5
        L_0x004c:
            if (r10 == 0) goto L_0x0062
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r10 = r10.f25539a
            if (r10 == 0) goto L_0x0062
            java.lang.Object r10 = r10.get(r0)
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r10 = (com.bytedance.android.livesdkapi.depend.model.ChargeDeal) r10
            if (r10 == 0) goto L_0x0062
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal$HsSkuDetail r10 = r10.f25525k
            if (r10 == 0) goto L_0x0062
            java.lang.String r10 = r10.f25534f
            if (r10 != 0) goto L_0x006d
        L_0x0062:
            R r10 = r9.f10297c
            java.lang.String r3 = "allList.extra"
            kotlin.jvm.internal.C7573i.m23582a(r10, r3)
            com.bytedance.android.live.wallet.model.i r10 = (com.bytedance.android.live.wallet.model.C3823i) r10
            java.lang.String r10 = r10.f11388a
        L_0x006d:
            r8.f10878d = r10
            java.util.List<T> r9 = r9.f10296b
            java.lang.String r10 = "allList.data"
            kotlin.jvm.internal.C7573i.m23582a(r9, r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.Iterator r9 = r9.iterator()
        L_0x0083:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x00c5
            java.lang.Object r3 = r9.next()
            r4 = r3
            com.bytedance.android.live.wallet.model.h r4 = (com.bytedance.android.live.wallet.model.C3822h) r4
            java.lang.String r5 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            java.lang.String r5 = r4.f11375a
            java.lang.String r6 = "Huoli"
            boolean r5 = kotlin.jvm.internal.C7573i.m23585a(r5, r6)
            if (r5 == 0) goto L_0x00a4
            boolean r4 = m13255e()
            goto L_0x00bf
        L_0x00a4:
            java.lang.String r5 = r4.f11375a
            java.lang.String r6 = "GooglePay"
            boolean r5 = kotlin.jvm.internal.C7573i.m23585a(r5, r6)
            if (r5 == 0) goto L_0x00b0
            r4 = r2
            goto L_0x00bf
        L_0x00b0:
            java.util.List<java.lang.String> r4 = r4.f11381g
            if (r4 == 0) goto L_0x00be
            java.lang.String r5 = r8.f10878d
            boolean r4 = r4.contains(r5)
            if (r4 != r1) goto L_0x00be
            r4 = 1
            goto L_0x00bf
        L_0x00be:
            r4 = 0
        L_0x00bf:
            if (r4 == 0) goto L_0x0083
            r10.add(r3)
            goto L_0x0083
        L_0x00c5:
            java.util.List r10 = (java.util.List) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p178b.p179a.C3648d.mo11104a(com.bytedance.android.live.network.response.a, com.bytedance.android.livesdkapi.depend.model.a):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r0 == null) goto L_0x001d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m13255e() {
        /*
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.C3596c.m13172a(r0)
            java.lang.String r1 = "ServiceManager.getServic…alletService::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            java.util.Map r0 = r0.getHostWalletSetting()
            if (r0 == 0) goto L_0x001d
            java.lang.String r1 = "show_exchange_score"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x001f
        L_0x001d:
            java.lang.String r0 = "0"
        L_0x001f:
            java.lang.String r1 = "1"
            kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p178b.p179a.C3648d.m13255e():boolean");
    }

    /* renamed from: b */
    public final void mo11107b() {
        C3671c cVar = (C3671c) mo9140c();
        if (cVar != null) {
            cVar.mo11120e();
        }
        C7321c cVar2 = this.f10877c;
        if (cVar2 != null && !cVar2.isDisposed()) {
            C7321c cVar3 = this.f10877c;
            if (cVar3 != null) {
                cVar3.dispose();
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f10877c = m13254d().vigoChargeDeals().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19316d((C7326g<? super T>) C3659j.f10912a).mo19280a((C7326g<? super T>) new C3660k<Object>(this, uptimeMillis), (C7326g<? super Throwable>) new C3662l<Object>(this, uptimeMillis));
    }

    public C3648d(Activity activity) {
        C7573i.m23587b(activity, "activity");
        this.f10881g = activity;
        C3634i iVar = (C3634i) C3642b.m13238a(C3634i.class);
        C8984e user = ((C3592a) C3596c.m13172a(C3592a.class)).user();
        C7573i.m23582a((Object) user, "ServiceManager.getServic…rvice::class.java).user()");
        if (user.mo22182c()) {
            C8984e user2 = ((C3592a) C3596c.m13172a(C3592a.class)).user();
            C7573i.m23582a((Object) user2, "ServiceManager.getServic…rvice::class.java).user()");
            long b = user2.mo22179b();
            if (iVar != null) {
                iVar.mo11047a(this.f10881g, String.valueOf(b));
            }
        }
        this.f10880f = new C3663m(this);
        this.f10882i = C7546e.m23569a(C3650b.f10883a);
    }

    /* renamed from: a */
    public static C9343a m13245a(C9343a aVar, Bundle bundle) {
        Iterable iterable;
        HsSkuDetail hsSkuDetail;
        List<ChargeDeal> list = aVar.f25539a;
        C9343a aVar2 = new C9343a();
        List<HsSkuDetail> list2 = null;
        if (bundle != null) {
            iterable = bundle.getStringArrayList("DETAILS_LIST");
        } else {
            iterable = null;
        }
        if (iterable != null) {
            Iterable<String> iterable2 = iterable;
            Collection arrayList = new ArrayList(C7525m.m23469a((Iterable) iterable2, 10));
            for (String jSONObject : iterable2) {
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObject);
                    hsSkuDetail = new HsSkuDetail(jSONObject2.optString("productId"), jSONObject2.optString("type"), jSONObject2.optString("price"), jSONObject2.optString("title"), jSONObject2.optString("description"), jSONObject2.optString("price_currency_code"));
                } catch (Exception unused) {
                    hsSkuDetail = null;
                }
                arrayList.add(hsSkuDetail);
            }
            List e = C7525m.m23510e((List) arrayList);
            if (e != null) {
                list2 = C7525m.m23516h((Iterable) e);
            }
        }
        ArrayMap arrayMap = new ArrayMap();
        if (list2 != null && !list2.isEmpty()) {
            for (HsSkuDetail hsSkuDetail2 : list2) {
                arrayMap.put(hsSkuDetail2.f25529a, hsSkuDetail2);
            }
        }
        List<ChargeDeal> arrayList2 = new ArrayList<>();
        C7573i.m23582a((Object) list, "remoteList");
        Iterable<ChargeDeal> iterable3 = list;
        Collection arrayList3 = new ArrayList(C7525m.m23469a((Iterable) iterable3, 10));
        for (ChargeDeal chargeDeal : iterable3) {
            C7573i.m23582a((Object) chargeDeal, "chargeDeal");
            HsSkuDetail hsSkuDetail3 = (HsSkuDetail) arrayMap.get(chargeDeal.f25521g);
            if (hsSkuDetail3 != null) {
                chargeDeal.f25525k = hsSkuDetail3;
                arrayList2.add(chargeDeal);
            }
            arrayList3.add(C7581n.f20898a);
        }
        aVar2.f25539a = arrayList2;
        return aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r7 == null) goto L_0x003b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13250a(long r4, int r6, java.lang.Throwable r7) {
        /*
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r4
            if (r6 != 0) goto L_0x000f
            java.util.Map r4 = kotlin.collections.C7507ae.m23387a()
            com.bytedance.android.livesdk.p431y.p433b.C9281a.m27618a(r6, r0, r4)
            return
        L_0x000f:
            r4 = 2
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            r5 = 0
            java.lang.String r2 = "error_code"
            boolean r3 = r7 instanceof com.bytedance.android.live.api.exceptions.server.ApiServerException
            if (r3 != 0) goto L_0x001b
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = r7
        L_0x001c:
            com.bytedance.android.live.api.exceptions.server.ApiServerException r3 = (com.bytedance.android.live.api.exceptions.server.ApiServerException) r3
            if (r3 == 0) goto L_0x0025
            int r3 = r3.getErrorCode()
            goto L_0x0026
        L_0x0025:
            r3 = -1
        L_0x0026:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r3)
            r4[r5] = r2
            r5 = 1
            java.lang.String r2 = "error_msg"
            if (r7 == 0) goto L_0x003b
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto L_0x003d
        L_0x003b:
            java.lang.String r7 = ""
        L_0x003d:
            kotlin.Pair r7 = kotlin.C7579l.m23633a(r2, r7)
            r4[r5] = r7
            java.util.Map r4 = kotlin.collections.C7507ae.m23393a(r4)
            com.bytedance.android.livesdk.p431y.p433b.C9281a.m27618a(r6, r0, r4)
            com.bytedance.android.livesdk.p431y.p433b.C9281a.m27620b(r6, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p178b.p179a.C3648d.m13250a(long, int, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public static void m13248a(long j, int i, int i2, String str) {
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (i == 0) {
            C9281a.m27621c(i, uptimeMillis, C7507ae.m23387a());
            return;
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = C7579l.m23633a("error_code", Integer.valueOf(i2));
        String str2 = "error_msg";
        if (str == null) {
            str = "";
        }
        pairArr[1] = C7579l.m23633a(str2, str);
        Map a = C7507ae.m23393a(pairArr);
        C9281a.m27621c(i, uptimeMillis, a);
        C9281a.m27622d(i, uptimeMillis, a);
    }

    /* renamed from: a */
    public static void m13246a(int i, String str, int i2, int i3, String str2) {
        Map a = C7507ae.m23393a(C7579l.m23633a("times", Integer.valueOf(i2)), C7579l.m23633a("order_id", str), C7579l.m23633a("error_code", Integer.valueOf(i3)), C7579l.m23633a("error_msg", str2));
        if (i == 0) {
            C9281a.m27617a(20, i, 0, a);
            return;
        }
        C9281a.m27617a(20, i, 0, a);
        C9281a.m27619b(20, i, 0, a);
    }

    /* renamed from: a */
    public static void m13247a(int i, String str, long j, int i2, String str2) {
        Map a = C7507ae.m23393a(C7579l.m23633a("product_id", Long.valueOf(j)), C7579l.m23633a("order_id", str), C7579l.m23633a("error_code", Integer.valueOf(i2)), C7579l.m23633a("error_msg", str2));
        if (i == 0) {
            C9281a.m27617a(10, i, 0, a);
            return;
        }
        C9281a.m27617a(10, i, 0, a);
        C9281a.m27619b(10, i, 0, a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008f, code lost:
        if (r8 == null) goto L_0x0091;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13249a(long r5, int r7, com.bytedance.android.livesdkapi.host.PayChannel r8, long r9, java.lang.Throwable r11) {
        /*
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r5
            r5 = 1
            r6 = 2
            r2 = 0
            if (r7 != 0) goto L_0x004d
            kotlin.Pair[] r11 = new kotlin.Pair[r6]
            java.lang.String r3 = "product_id"
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
            r11[r2] = r3
            java.lang.String r3 = "channel"
            java.lang.String r4 = r8.getValue()
            kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
            r11[r5] = r3
            java.util.Map r11 = kotlin.collections.C7507ae.m23393a(r11)
            com.bytedance.android.livesdk.p431y.p433b.C9281a.m27623e(r7, r0, r11)
            kotlin.Pair[] r6 = new kotlin.Pair[r6]
            java.lang.String r11 = "product_id"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            kotlin.Pair r9 = kotlin.C7579l.m23633a(r11, r9)
            r6[r2] = r9
            java.lang.String r9 = "channel"
            java.lang.String r8 = r8.getValue()
            kotlin.Pair r8 = kotlin.C7579l.m23633a(r9, r8)
            r6[r5] = r8
            java.util.Map r5 = kotlin.collections.C7507ae.m23393a(r6)
            com.bytedance.android.livesdk.p431y.p433b.C9281a.m27617a(r2, r7, r0, r5)
            return
        L_0x004d:
            r3 = 4
            kotlin.Pair[] r3 = new kotlin.Pair[r3]
            java.lang.String r4 = "product_id"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            kotlin.Pair r9 = kotlin.C7579l.m23633a(r4, r9)
            r3[r2] = r9
            java.lang.String r9 = "channel"
            java.lang.String r8 = r8.getValue()
            kotlin.Pair r8 = kotlin.C7579l.m23633a(r9, r8)
            r3[r5] = r8
            java.lang.String r5 = "error_code"
            boolean r8 = r11 instanceof com.bytedance.android.live.api.exceptions.server.ApiServerException
            if (r8 != 0) goto L_0x0070
            r8 = 0
            goto L_0x0071
        L_0x0070:
            r8 = r11
        L_0x0071:
            com.bytedance.android.live.api.exceptions.server.ApiServerException r8 = (com.bytedance.android.live.api.exceptions.server.ApiServerException) r8
            if (r8 == 0) goto L_0x007a
            int r8 = r8.getErrorCode()
            goto L_0x007c
        L_0x007a:
            r8 = -14
        L_0x007c:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            kotlin.Pair r5 = kotlin.C7579l.m23633a(r5, r8)
            r3[r6] = r5
            r5 = 3
            java.lang.String r6 = "error_msg"
            if (r11 == 0) goto L_0x0091
            java.lang.String r8 = r11.getMessage()
            if (r8 != 0) goto L_0x0093
        L_0x0091:
            java.lang.String r8 = ""
        L_0x0093:
            kotlin.Pair r6 = kotlin.C7579l.m23633a(r6, r8)
            r3[r5] = r6
            java.util.Map r5 = kotlin.collections.C7507ae.m23393a(r3)
            com.bytedance.android.livesdk.p431y.p433b.C9281a.m27623e(r7, r0, r5)
            com.bytedance.android.livesdk.p431y.p433b.C9281a.m27624f(r7, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p178b.p179a.C3648d.m13249a(long, int, com.bytedance.android.livesdkapi.host.PayChannel, long, java.lang.Throwable):void");
    }
}
