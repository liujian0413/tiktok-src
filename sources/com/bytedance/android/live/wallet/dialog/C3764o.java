package com.bytedance.android.live.wallet.dialog;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.SystemClock;
import android.support.p022v4.util.C0888a;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.ApiException;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.api.C3628c;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C3810a;
import com.bytedance.android.live.wallet.model.C3810a.C3811a;
import com.bytedance.android.live.wallet.model.C3813c;
import com.bytedance.android.live.wallet.model.C3813c.C3815b;
import com.bytedance.android.live.wallet.model.C3820g;
import com.bytedance.android.live.wallet.model.C3820g.C3821a;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.p178b.p179a.C3646c;
import com.bytedance.android.live.wallet.p178b.p180b.C3669a;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9044al;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.wallet.dialog.o */
public final class C3764o extends C3731a implements C3669a {

    /* renamed from: A */
    private final PayChannel[] f11195A = {PayChannel.WEIXIN, PayChannel.ALIPAY};

    /* renamed from: B */
    private OnClickListener f11196B = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            if (C3764o.this.f11212p != null) {
                C3764o.this.mo11263a();
                C8946b.f24427az.mo22118a(C3764o.this.f11212p.name());
                switch (C37706.f11228a[C3764o.this.f11212p.ordinal()]) {
                    case 1:
                        str = "wxpay";
                        break;
                    case 2:
                        str = "alipay";
                        break;
                    default:
                        str = "TEST";
                        break;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("request_page", C3764o.this.f11199c);
                hashMap.put("charge_reason", C3764o.this.f11198b);
                hashMap.put("money", String.valueOf(C3764o.this.f11209m.f25519e + C3764o.this.f11209m.f25520f));
                hashMap.put("pay_method", str);
                if (C3764o.this.f11215s == 1) {
                    hashMap.put("panel_type", "first_recharge");
                } else if (C3764o.this.f11215s == 2) {
                    hashMap.put("panel_type", "small_heart");
                } else {
                    hashMap.put("panel_type", "normal");
                }
                C8443c.m25663a().mo21606a("livesdk_recharge_pay", hashMap, C8438j.class, Room.class);
            }
        }
    };

    /* renamed from: a */
    protected C3811a f11197a = new C3811a() {
        /* renamed from: a */
        public final void mo11250a(C3810a aVar, boolean z) {
            if (z) {
                C3764o.this.f11212p = null;
                C3764o.this.mo11268b();
            } else if (!aVar.mo11241a()) {
                String str = (String) C5864b.f17283c.mo10240a();
                if (!TextUtils.isEmpty(str)) {
                    new C3534a(C3764o.this.getContext()).mo10660b((CharSequence) str).mo10649a(17039370, C3776u.f11234a).mo10657a().show();
                }
            } else {
                C3764o.this.f11212p = aVar.f11335q;
                C3764o.this.mo11268b();
            }
        }
    };

    /* renamed from: b */
    protected String f11198b;

    /* renamed from: c */
    protected String f11199c;

    /* renamed from: d */
    protected TextView f11200d;

    /* renamed from: e */
    protected TextView f11201e;

    /* renamed from: f */
    protected TextView f11202f;

    /* renamed from: g */
    protected TextView f11203g;

    /* renamed from: h */
    protected ProgressBar f11204h;

    /* renamed from: i */
    protected ViewGroup f11205i;

    /* renamed from: j */
    protected View f11206j;

    /* renamed from: k */
    protected View f11207k;

    /* renamed from: l */
    protected C3810a f11208l;

    /* renamed from: m */
    protected ChargeDeal f11209m;

    /* renamed from: n */
    protected C3813c f11210n;

    /* renamed from: o */
    protected C3646c f11211o;

    /* renamed from: p */
    protected PayChannel f11212p;

    /* renamed from: q */
    protected Context f11213q;

    /* renamed from: r */
    protected final Map<Long, C3810a> f11214r = new HashMap();

    /* renamed from: s */
    public int f11215s = 0;

    /* renamed from: t */
    public final Set<PayChannel> f11216t = new C0888a();

    /* renamed from: u */
    private long f11217u;

    /* renamed from: v */
    private long f11218v;

    /* renamed from: w */
    private final C3810a f11219w;

    /* renamed from: x */
    private final C3810a f11220x;

    /* renamed from: y */
    private ProgressDialog f11221y;

    /* renamed from: z */
    private final C47562b f11222z = new C47562b();

    /* renamed from: com.bytedance.android.live.wallet.dialog.o$6 */
    static /* synthetic */ class C37706 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11228a = new int[PayChannel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.bytedance.android.livesdkapi.host.PayChannel[] r0 = com.bytedance.android.livesdkapi.host.PayChannel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11228a = r0
                int[] r0 = f11228a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.WEIXIN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11228a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.ALIPAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11228a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.TEST     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.dialog.C3764o.C37706.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo11113a(C9353b bVar) {
    }

    /* renamed from: a */
    public final void mo11263a() {
        if (this.f11210n != null && this.f11208l != null) {
            this.f11218v = SystemClock.uptimeMillis();
            if (this.f11211o.mo9140c() != null) {
                ((C3669a) this.f11211o.mo9140c()).mo11111a((int) R.string.ehg);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("OrderId", this.f11210n.f11339a);
            hashMap.put("Cost", C9078p.m27100a("%.2f", Float.valueOf(((float) this.f11209m.f25516b) / 100.0f)));
            hashMap.put("ChannelId", String.valueOf(this.f11208l.f11328j));
            hashMap.put("AppId", String.valueOf(((IHostContext) C3596c.m13172a(IHostContext.class)).appId()));
            this.f11222z.mo119661a(((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).getRechargeParam(hashMap).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3774s<Object>(this), (C7326g<? super Throwable>) new C3775t<Object>(this)));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11265a(C3479d dVar) throws Exception {
        m13478a((C3820g) dVar.data, null, this.f11210n.f11339a, String.valueOf(this.f11208l.f11328j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11267a(Throwable th) throws Exception {
        C3166a.m11955a(6, "TTLivePayDialog", th.getStackTrace());
        m13478a(null, th, this.f11210n.f11339a, String.valueOf(this.f11208l.f11328j));
    }

    /* renamed from: a */
    public final void mo11114a(Exception exc) {
        if (exc instanceof ApiServerException) {
            C9049ap.m27028a(((ApiServerException) exc).getPrompt());
        } else {
            C9049ap.m27022a((int) R.string.ed1);
        }
    }

    /* renamed from: a */
    public final void mo11115a(Exception exc, int i) {
        if (exc instanceof ApiServerException) {
            C9049ap.m27028a(((ApiServerException) exc).getPrompt());
        } else {
            C9049ap.m27022a((int) R.string.ed1);
        }
    }

    /* renamed from: d */
    public final void mo11117d() {
        C9049ap.m27022a((int) R.string.f9k);
    }

    /* renamed from: h */
    private void m13483h() {
        this.f11204h.setVisibility(8);
        this.f11202f.setVisibility(8);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11222z.mo119660a();
    }

    /* renamed from: i */
    private void m13484i() {
        this.f11205i.removeAllViews();
        this.f11204h.setVisibility(8);
        this.f11202f.setVisibility(0);
        this.f11206j.setEnabled(false);
    }

    /* renamed from: c */
    public final void mo11116c() {
        if (this.f11221y != null && this.f11221y.isShowing()) {
            this.f11221y.dismiss();
        }
    }

    /* renamed from: e */
    private void m13480e() {
        this.f11217u = SystemClock.uptimeMillis();
        this.f11204h.setVisibility(0);
        this.f11202f.setVisibility(8);
        this.f11206j.setEnabled(false);
        this.f11205i.removeAllViews();
        this.f11222z.mo119661a(((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).createOrderInfo(String.valueOf(this.f11209m.f25515a), "cny").mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3772q<Object>(this), (C7326g<? super Throwable>) new C3773r<Object>(this)));
    }

    /* renamed from: f */
    private void m13481f() {
        PayChannel[] payChannelArr;
        String str = (String) C8946b.f24427az.mo22117a();
        if (C6319n.m19593a(str)) {
            this.f11212p = null;
            return;
        }
        this.f11212p = PayChannel.valueOf(str);
        if (this.f11212p == PayChannel.TEST) {
            this.f11212p = PayChannel.WEIXIN;
        }
        if (this.f11216t.contains(this.f11212p)) {
            this.f11212p = null;
            for (PayChannel payChannel : this.f11195A) {
                if (!this.f11216t.contains(payChannel)) {
                    this.f11212p = payChannel;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m13482g() {
        this.f11200d.setText(C3358ac.m12517a((int) R.string.f9q, Float.valueOf(((float) this.f11209m.f25517c) / 100.0f)));
        TextView textView = this.f11201e;
        StringBuilder sb = new StringBuilder();
        sb.append(C3358ac.m12515a((int) R.string.fbr));
        sb.append(C9078p.m27100a("%.2f", Float.valueOf(((float) this.f11209m.f25516b) / 100.0f)));
        textView.setText(sb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11268b() {
        if (this.f11212p == null) {
            this.f11206j.setEnabled(false);
            for (C3810a aVar : this.f11214r.values()) {
                if (aVar.f11326h != null) {
                    aVar.f11326h.setChecked(false);
                }
            }
        } else {
            Iterator it = this.f11214r.values().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C3810a aVar2 = (C3810a) it.next();
                if (aVar2.f11326h != null) {
                    CheckBox checkBox = aVar2.f11326h;
                    if (aVar2.f11335q != this.f11212p) {
                        z = false;
                    }
                    checkBox.setChecked(z);
                    if (aVar2.f11326h.isChecked()) {
                        this.f11208l = aVar2;
                    }
                }
            }
            this.f11206j.setEnabled(true);
        }
        m13482g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11264a(View view) {
        m13480e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11269b(C3479d dVar) throws Exception {
        m13479a(dVar.data);
    }

    /* renamed from: a */
    public final void mo11266a(ChargeDeal chargeDeal) {
        this.f11209m = chargeDeal;
        if (this.f11200d != null) {
            mo11268b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11270b(Throwable th) throws Exception {
        C3166a.m11955a(6, "TTLivePayDialog", th.getStackTrace());
        m13479a((Object) th);
    }

    /* renamed from: a */
    public final void mo11111a(int i) {
        String a = C3358ac.m12515a(i);
        if (this.f11221y == null) {
            Activity a2 = C3384d.m12589a(this.f11213q);
            if (a2 != null) {
                this.f11221y = C9044al.m27010a(a2, a);
                this.f11221y.setCancelable(false);
                this.f11221y.setCanceledOnTouchOutside(false);
            }
        }
        if (this.f11221y != null && !this.f11221y.isShowing()) {
            this.f11221y.setMessage(a);
            this.f11221y.show();
        }
    }

    /* renamed from: a */
    private C9353b m13475a(C3820g gVar) {
        if (gVar == null || gVar.f11364d == null) {
            return null;
        }
        C3821a aVar = gVar.f11364d;
        C9353b bVar = new C9353b();
        if (this.f11212p == PayChannel.ALIPAY) {
            bVar.f25553h = m13476a(aVar);
        }
        bVar.f25554i = aVar.f11371g;
        bVar.f25557l = aVar.f11370f;
        bVar.f25555j = aVar.f11366b;
        bVar.f25556k = aVar.f11367c;
        bVar.f25559n = aVar.f11372h;
        bVar.f25558m = aVar.f11368d;
        bVar.f25546a = gVar.f11361a;
        bVar.f25548c = this.f11212p;
        bVar.f25552g = String.valueOf(this.f11208l.f11328j);
        bVar.f25550e = this.f11209m.f25519e + this.f11209m.f25520f;
        bVar.f25549d = String.valueOf(this.f11209m.f25515a);
        return bVar;
    }

    /* renamed from: a */
    private static String m13476a(C3821a aVar) {
        String str = aVar.f11374j;
        if (!TextUtils.isEmpty(aVar.f11372h)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&sign=\"");
            sb.append(aVar.f11372h);
            sb.append("\"");
            str = sb.toString();
        }
        if (TextUtils.isEmpty(aVar.f11373i)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("&sign_type=\"");
        sb2.append(aVar.f11373i);
        sb2.append("\"");
        return sb2.toString();
    }

    /* renamed from: a */
    private void m13477a(C3813c cVar) {
        if (cVar != null && cVar.f11342d != null && cVar.f11342d.f11343a != null && !cVar.f11342d.f11343a.isEmpty()) {
            for (C3815b bVar : cVar.f11342d.f11343a) {
                C3810a aVar = (C3810a) this.f11214r.get(Long.valueOf(bVar.f11347a));
                if (aVar != null) {
                    aVar.f11334p = !TextUtils.isEmpty(bVar.f11350d.f11352b);
                    aVar.f11336r = bVar.f11350d.f11352b;
                    aVar.mo11327a(this.f11205i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r5 = 2131494833(0x7f0c07b1, float:1.8613186E38)
            r4.setContentView(r5)
            android.view.Window r5 = r4.getWindow()
            r0 = 0
            r1 = 1
            android.content.Context r2 = r4.getContext()     // Catch:{ Exception -> 0x0022 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x0022 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ Exception -> 0x0022 }
            int r2 = r2.orientation     // Catch:{ Exception -> 0x0022 }
            if (r2 != r1) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            r2 = 0
            goto L_0x0029
        L_0x0022:
            r2 = move-exception
            java.lang.String r3 = "TTLivePayDialog"
            com.bytedance.android.live.core.p147c.C3166a.m11963b(r3, r2)
        L_0x0028:
            r2 = 1
        L_0x0029:
            if (r5 == 0) goto L_0x005a
            r5 = -2
            r3 = -1
            if (r2 == 0) goto L_0x0040
            android.view.Window r2 = r4.getWindow()
            r2.setLayout(r3, r5)
            android.view.Window r5 = r4.getWindow()
            r2 = 80
            r5.setGravity(r2)
            goto L_0x005a
        L_0x0040:
            android.view.Window r2 = r4.getWindow()
            r2.setLayout(r5, r3)
            android.view.Window r5 = r4.getWindow()
            r2 = 2131887048(0x7f1203c8, float:1.9408692E38)
            r5.setWindowAnimations(r2)
            android.view.Window r5 = r4.getWindow()
            r2 = 21
            r5.setGravity(r2)
        L_0x005a:
            java.util.Set<com.bytedance.android.livesdkapi.host.PayChannel> r5 = r4.f11216t
            r5.clear()
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r5 = com.bytedance.android.livesdk.config.C5864b.f17282b
            java.lang.Object r5 = r5.mo10240a()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2 = r5 & 1
            if (r2 <= 0) goto L_0x0076
            java.util.Set<com.bytedance.android.livesdkapi.host.PayChannel> r2 = r4.f11216t
            com.bytedance.android.livesdkapi.host.PayChannel r3 = com.bytedance.android.livesdkapi.host.PayChannel.WEIXIN
            r2.add(r3)
        L_0x0076:
            r2 = 2
            r5 = r5 & r2
            if (r5 <= 0) goto L_0x0081
            java.util.Set<com.bytedance.android.livesdkapi.host.PayChannel> r5 = r4.f11216t
            com.bytedance.android.livesdkapi.host.PayChannel r3 = com.bytedance.android.livesdkapi.host.PayChannel.ALIPAY
            r5.add(r3)
        L_0x0081:
            r5 = 2131302717(0x7f09193d, float:1.8223528E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f11200d = r5
            r5 = 2131302732(0x7f09194c, float:1.8223558E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f11201e = r5
            r5 = 2131302031(0x7f09168f, float:1.8222137E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f11203g = r5
            r5 = 2131300803(0x7f0911c3, float:1.8219646E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
            r4.f11204h = r5
            r5 = 2131299689(0x7f090d69, float:1.8217386E38)
            android.view.View r5 = r4.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r4.f11205i = r5
            r5 = 2131302619(0x7f0918db, float:1.822333E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f11202f = r5
            android.widget.TextView r5 = r4.f11202f
            com.bytedance.android.live.wallet.dialog.p r3 = new com.bytedance.android.live.wallet.dialog.p
            r3.<init>(r4)
            r5.setOnClickListener(r3)
            r5 = 2131296914(0x7f090292, float:1.8211758E38)
            android.view.View r5 = r4.findViewById(r5)
            r4.f11206j = r5
            android.view.View r5 = r4.f11206j
            android.view.View$OnClickListener r3 = r4.f11196B
            r5.setOnClickListener(r3)
            r5 = 2131300737(0x7f091181, float:1.8219512E38)
            android.view.View r5 = r4.findViewById(r5)
            r4.f11207k = r5
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r5 = r4.f11209m
            if (r5 == 0) goto L_0x00ed
            r4.m13482g()
        L_0x00ed:
            android.widget.TextView r5 = r4.f11200d
            r3 = 8
            r5.setVisibility(r3)
            android.view.View r5 = r4.f11207k
            r5.setVisibility(r0)
            int r5 = r4.f11215s
            if (r5 == r1) goto L_0x0101
            int r5 = r4.f11215s
            if (r5 != r2) goto L_0x0114
        L_0x0101:
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r5 = r4.f11209m
            java.lang.String r5 = r5.f25518d
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0114
            android.widget.TextView r5 = r4.f11203g
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r0 = r4.f11209m
            java.lang.String r0 = r0.f25518d
            r5.setText(r0)
        L_0x0114:
            r4.m13480e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.dialog.C3764o.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private void m13479a(Object obj) {
        if (obj instanceof Exception) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", ((Exception) obj).getMessage());
            C9281a.m27624f(1, SystemClock.uptimeMillis() - this.f11217u, hashMap);
            C9281a.m27623e(1, SystemClock.uptimeMillis() - this.f11217u, hashMap);
            m13484i();
            return;
        }
        C3813c cVar = (C3813c) obj;
        this.f11210n = cVar;
        m13483h();
        m13477a(cVar);
        m13481f();
        mo11268b();
        C9281a.m27623e(0, SystemClock.uptimeMillis() - this.f11217u, null);
    }

    /* renamed from: a */
    public final void mo11112a(int i, CheckOrderOriginalResult checkOrderOriginalResult) {
        C8296e eVar = new C8296e(i);
        eVar.f22776a = this.f11215s;
        C9097a.m27146a().mo22267a((Object) eVar);
        if (isShowing()) {
            dismiss();
        }
        C9049ap.m27022a((int) R.string.ed8);
    }

    /* renamed from: a */
    private void m13478a(C3820g gVar, Throwable th, String str, String str2) {
        int i;
        Exception exc;
        if (this.f11211o.mo9140c() != null) {
            ((C3669a) this.f11211o.mo9140c()).mo11116c();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("channel_id", str2);
        if (th != null) {
            m13484i();
            hashMap.put("error_msg", th.getMessage());
            String str3 = "error_code";
            if (th instanceof ApiException) {
                i = ((ApiException) th).getErrorCode();
            } else {
                i = -17;
            }
            hashMap.put(str3, Integer.valueOf(i));
            C9281a.m27627i(1, SystemClock.uptimeMillis() - this.f11218v, hashMap);
            C9281a.m27627i(1, SystemClock.uptimeMillis() - this.f11218v, hashMap);
            if (this.f11211o.mo9140c() != null) {
                C3669a aVar = (C3669a) this.f11211o.mo9140c();
                if (th instanceof Exception) {
                    exc = (Exception) th;
                } else {
                    exc = new Exception(th);
                }
                aVar.mo11114a(exc);
            }
        } else {
            C9353b a = m13475a(gVar);
            if (this.f11211o.mo9140c() != null) {
                ((C3669a) this.f11211o.mo9140c()).mo11113a(a);
            }
            C9281a.m27627i(0, SystemClock.uptimeMillis() - this.f11218v, hashMap);
            C9281a.m27617a(0, 0, SystemClock.uptimeMillis() - this.f11217u, hashMap);
        }
    }

    public C3764o(Context context, C3646c cVar, String str, String str2, int i) {
        Context context2 = context;
        super(context2, R.style.z9);
        C37651 r0 = new C3810a(0, R.drawable.c8s, R.drawable.c8t, C3358ac.m12515a((int) R.string.f9h), PayChannel.ALIPAY) {
            /* renamed from: b */
            public final void mo11242b() {
            }

            /* renamed from: a */
            public final boolean mo11241a() {
                if (!C3764o.this.f11216t.contains(PayChannel.ALIPAY)) {
                    return true;
                }
                return false;
            }
        };
        this.f11219w = r0;
        C37662 r02 = new C3810a(1, R.drawable.c8y, R.drawable.c8z, C3358ac.m12515a((int) R.string.f9w), PayChannel.WEIXIN) {
            /* renamed from: b */
            public final void mo11242b() {
            }

            /* renamed from: a */
            public final boolean mo11241a() {
                if (!C3764o.this.f11216t.contains(PayChannel.WEIXIN)) {
                    return true;
                }
                return false;
            }
        };
        this.f11220x = r02;
        this.f11213q = context2;
        this.f11211o = null;
        this.f11198b = str;
        this.f11199c = str2;
        this.f11215s = i;
        this.f11219w.f11337s = this.f11197a;
        this.f11220x.f11337s = this.f11197a;
        this.f11214r.put(Long.valueOf(this.f11219w.f11328j), this.f11219w);
        this.f11214r.put(Long.valueOf(this.f11220x.f11328j), this.f11220x);
        C3646c cVar2 = new C3646c(C3384d.m12589a(this.f11213q), new C3628c() {
        }, this.f11198b, this.f11199c, this.f11215s);
        this.f11211o = cVar2;
        this.f11211o.mo9142a((C3669a) this);
    }
}
