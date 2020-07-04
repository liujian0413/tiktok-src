package com.bytedance.android.live.wallet.dialog;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.p022v4.util.C0888a;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C3810a;
import com.bytedance.android.live.wallet.model.C3810a.C3811a;
import com.bytedance.android.live.wallet.model.C3817d;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.p178b.p179a.C3646c;
import com.bytedance.android.live.wallet.p178b.p180b.C3669a;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9044al;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.live.wallet.dialog.d */
public final class C3740d extends C3731a implements C3669a {

    /* renamed from: a */
    public C3646c f11129a;

    /* renamed from: b */
    protected C3811a f11130b = new C3811a() {
        /* renamed from: a */
        public final void mo11250a(C3810a aVar, boolean z) {
            if (z) {
                C3740d.this.f11140l = null;
                C3740d.this.mo11244a();
            } else if (!aVar.mo11241a()) {
                String str = (String) C5864b.f17283c.mo10240a();
                if (!TextUtils.isEmpty(str)) {
                    new C3534a(C3740d.this.getContext()).mo10660b((CharSequence) str).mo10649a(17039370, C3751h.f11162a).mo10657a().show();
                }
            } else {
                C3740d.this.f11140l = aVar.f11335q;
                C3740d.this.mo11244a();
            }
        }
    };

    /* renamed from: c */
    protected String f11131c;

    /* renamed from: d */
    protected String f11132d;

    /* renamed from: e */
    protected TextView f11133e;

    /* renamed from: f */
    protected TextView f11134f;

    /* renamed from: g */
    protected TextView f11135g;

    /* renamed from: h */
    protected ProgressBar f11136h;

    /* renamed from: i */
    protected ViewGroup f11137i;

    /* renamed from: j */
    protected View f11138j;

    /* renamed from: k */
    protected ChargeDeal f11139k;

    /* renamed from: l */
    protected PayChannel f11140l;

    /* renamed from: m */
    protected Context f11141m;

    /* renamed from: n */
    protected final Map<Long, C3810a> f11142n = new HashMap();

    /* renamed from: o */
    public final Set<PayChannel> f11143o = new C0888a();

    /* renamed from: p */
    private ProgressDialog f11144p;

    /* renamed from: q */
    private final C3810a f11145q;

    /* renamed from: r */
    private final C3810a f11146r;

    /* renamed from: s */
    private final C3810a f11147s;

    /* renamed from: t */
    private final boolean f11148t;

    /* renamed from: u */
    private final C47562b f11149u = new C47562b();

    /* renamed from: v */
    private final PayChannel[] f11150v = {PayChannel.WEIXIN, PayChannel.ALIPAY};

    /* renamed from: w */
    private OnClickListener f11151w = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            if (C3740d.this.f11140l != null) {
                C3740d.this.f11129a.mo11102a(C3740d.this.f11139k, C3740d.this.f11140l);
                C8946b.f24427az.mo22118a(C3740d.this.f11140l.name());
                switch (C37477.f11158a[C3740d.this.f11140l.ordinal()]) {
                    case 1:
                        str = "wxpay";
                        break;
                    case 2:
                        str = "alipay";
                        break;
                    case 3:
                        str = "balance";
                        break;
                    default:
                        str = "TEST";
                        break;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("request_page", C3740d.this.f11132d);
                hashMap.put("charge_reason", C3740d.this.f11131c);
                hashMap.put("money", String.valueOf(C3740d.this.f11139k.f25519e + C3740d.this.f11139k.f25520f));
                hashMap.put("pay_method", str);
                C8443c.m25663a().mo21606a("livesdk_recharge_pay", hashMap, C8438j.class, Room.class);
            }
        }
    };

    /* renamed from: com.bytedance.android.live.wallet.dialog.d$7 */
    static /* synthetic */ class C37477 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11158a = new int[PayChannel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.bytedance.android.livesdkapi.host.PayChannel[] r0 = com.bytedance.android.livesdkapi.host.PayChannel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11158a = r0
                int[] r0 = f11158a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.WEIXIN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11158a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.ALIPAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11158a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.FIRE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11158a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.TEST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.dialog.C3740d.C37477.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo11113a(C9353b bVar) {
    }

    /* renamed from: d */
    public final void mo11117d() {
    }

    /* renamed from: f */
    private void m13436f() {
        this.f11136h.setVisibility(8);
        this.f11135g.setVisibility(8);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11149u.mo119660a();
    }

    /* renamed from: g */
    private void m13437g() {
        this.f11136h.setVisibility(8);
        this.f11135g.setVisibility(0);
        this.f11138j.setEnabled(false);
    }

    /* renamed from: c */
    public final void mo11116c() {
        if (this.f11144p != null && this.f11144p.isShowing()) {
            this.f11144p.dismiss();
        }
    }

    /* renamed from: b */
    private void m13434b() {
        this.f11136h.setVisibility(0);
        this.f11135g.setVisibility(8);
        this.f11138j.setEnabled(false);
        this.f11137i.removeAllViews();
        this.f11149u.mo119661a(((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).fetchOptionList().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C3749f<Object>(this), (C7326g<? super Throwable>) new C3750g<Object>(this)));
    }

    /* renamed from: e */
    private void m13435e() {
        this.f11133e.setText(C3358ac.m12517a((int) R.string.f9q, Float.valueOf(((float) this.f11139k.f25517c) / 100.0f)));
        TextView textView = this.f11134f;
        StringBuilder sb = new StringBuilder();
        sb.append(C3358ac.m12515a((int) R.string.fbr));
        sb.append(C9078p.m27100a("%.2f", Float.valueOf(((float) this.f11139k.f25516b) / 100.0f)));
        textView.setText(sb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11244a() {
        if (this.f11140l == null) {
            this.f11138j.setEnabled(false);
            for (C3810a aVar : this.f11142n.values()) {
                if (aVar.f11326h != null) {
                    aVar.f11326h.setChecked(false);
                }
            }
        } else {
            Iterator it = this.f11142n.values().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C3810a aVar2 = (C3810a) it.next();
                if (aVar2.f11326h != null) {
                    CheckBox checkBox = aVar2.f11326h;
                    if (aVar2.f11335q != this.f11140l) {
                        z = false;
                    }
                    checkBox.setChecked(z);
                }
            }
            this.f11138j.setEnabled(true);
        }
        m13435e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11245a(View view) {
        m13434b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11247a(Throwable th) throws Exception {
        C3166a.m11955a(6, "JsbPayDialog", th.getStackTrace());
        m13437g();
    }

    /* renamed from: b */
    private static JSONObject m13433b(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "pay");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("channel_param", i);
            jSONObject.put("args", jSONObject2);
        } catch (JSONException unused) {
        }
        return jSONObject;
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
    public final void mo11111a(int i) {
        String a = C3358ac.m12515a(i);
        if (this.f11144p == null) {
            Activity a2 = C3384d.m12589a(this.f11141m);
            if (a2 != null) {
                this.f11144p = C9044al.m27010a(a2, a);
                this.f11144p.setCancelable(false);
                this.f11144p.setCanceledOnTouchOutside(false);
            }
        }
        if (this.f11144p != null && !this.f11144p.isShowing()) {
            this.f11144p.setMessage(a);
            this.f11144p.show();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11246a(C3478c cVar) throws Exception {
        m13436f();
        for (C3817d dVar : cVar.f10296b) {
            C3810a aVar = (C3810a) this.f11142n.get(Long.valueOf(dVar.f11353a));
            if (aVar != null) {
                if (dVar.f11356d) {
                    aVar.f11333o = dVar.f11354b;
                    aVar.f11334p = dVar.f11355c;
                    aVar.mo11327a(this.f11137i);
                } else {
                    this.f11142n.remove(Long.valueOf(dVar.f11353a));
                }
            }
        }
        String str = (String) C8946b.f24427az.mo22117a();
        if (C6319n.m19593a(str)) {
            this.f11140l = null;
        } else if (PayChannel.valueOf(str) != PayChannel.FIRE || this.f11145q.mo11241a()) {
            this.f11140l = PayChannel.valueOf(str);
            if (this.f11140l == PayChannel.FIRE || this.f11140l == PayChannel.TEST) {
                this.f11140l = PayChannel.WEIXIN;
            }
            if (this.f11143o.contains(this.f11140l)) {
                this.f11140l = null;
                PayChannel[] payChannelArr = this.f11150v;
                int length = payChannelArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    PayChannel payChannel = payChannelArr[i];
                    if (!this.f11143o.contains(payChannel)) {
                        this.f11140l = payChannel;
                        break;
                    }
                    i++;
                }
            }
        } else {
            this.f11140l = null;
        }
        mo11244a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r10 = 2131494833(0x7f0c07b1, float:1.8613186E38)
            r9.setContentView(r10)
            android.view.Window r10 = r9.getWindow()
            r0 = 0
            r1 = 1
            android.content.Context r2 = r9.getContext()     // Catch:{ Exception -> 0x0022 }
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
            java.lang.String r3 = "JsbPayDialog"
            com.bytedance.android.live.core.p147c.C3166a.m11963b(r3, r2)
        L_0x0028:
            r2 = 1
        L_0x0029:
            if (r10 == 0) goto L_0x005a
            r10 = -2
            r3 = -1
            if (r2 == 0) goto L_0x0040
            android.view.Window r2 = r9.getWindow()
            r2.setLayout(r3, r10)
            android.view.Window r10 = r9.getWindow()
            r2 = 80
            r10.setGravity(r2)
            goto L_0x005a
        L_0x0040:
            android.view.Window r2 = r9.getWindow()
            r2.setLayout(r10, r3)
            android.view.Window r10 = r9.getWindow()
            r2 = 2131887048(0x7f1203c8, float:1.9408692E38)
            r10.setWindowAnimations(r2)
            android.view.Window r10 = r9.getWindow()
            r2 = 21
            r10.setGravity(r2)
        L_0x005a:
            com.bytedance.android.live.wallet.b.a.c r10 = new com.bytedance.android.live.wallet.b.a.c
            android.content.Context r2 = r9.f11141m
            android.app.Activity r4 = com.bytedance.android.live.core.utils.C3384d.m12589a(r2)
            com.bytedance.android.live.wallet.dialog.d$5 r5 = new com.bytedance.android.live.wallet.dialog.d$5
            r5.<init>()
            java.lang.String r6 = r9.f11131c
            java.lang.String r7 = r9.f11132d
            r8 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f11129a = r10
            com.bytedance.android.live.wallet.b.a.c r10 = r9.f11129a
            r10.mo9142a(r9)
            java.util.Set<com.bytedance.android.livesdkapi.host.PayChannel> r10 = r9.f11143o
            r10.clear()
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r10 = com.bytedance.android.livesdk.config.C5864b.f17282b
            java.lang.Object r10 = r10.mo10240a()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r2 = r10 & 1
            if (r2 <= 0) goto L_0x0093
            java.util.Set<com.bytedance.android.livesdkapi.host.PayChannel> r2 = r9.f11143o
            com.bytedance.android.livesdkapi.host.PayChannel r3 = com.bytedance.android.livesdkapi.host.PayChannel.WEIXIN
            r2.add(r3)
        L_0x0093:
            r2 = 2
            r10 = r10 & r2
            if (r10 <= 0) goto L_0x009e
            java.util.Set<com.bytedance.android.livesdkapi.host.PayChannel> r10 = r9.f11143o
            com.bytedance.android.livesdkapi.host.PayChannel r3 = com.bytedance.android.livesdkapi.host.PayChannel.ALIPAY
            r10.add(r3)
        L_0x009e:
            r10 = 2131302717(0x7f09193d, float:1.8223528E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.f11133e = r10
            r10 = 2131302732(0x7f09194c, float:1.8223558E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.f11134f = r10
            r10 = 2131300803(0x7f0911c3, float:1.8219646E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10
            r9.f11136h = r10
            r10 = 2131299689(0x7f090d69, float:1.8217386E38)
            android.view.View r10 = r9.findViewById(r10)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r9.f11137i = r10
            r10 = 2131302619(0x7f0918db, float:1.822333E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.f11135g = r10
            android.widget.TextView r10 = r9.f11135g
            com.bytedance.android.live.wallet.dialog.e r3 = new com.bytedance.android.live.wallet.dialog.e
            r3.<init>(r9)
            r10.setOnClickListener(r3)
            r10 = 2131296914(0x7f090292, float:1.8211758E38)
            android.view.View r10 = r9.findViewById(r10)
            r9.f11138j = r10
            android.view.View r10 = r9.f11138j
            android.view.View$OnClickListener r3 = r9.f11151w
            r10.setOnClickListener(r3)
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r10 = r9.f11139k
            if (r10 == 0) goto L_0x00f6
            r9.m13435e()
        L_0x00f6:
            boolean r10 = r9.f11148t
            if (r10 != 0) goto L_0x0107
            java.util.Map<java.lang.Long, com.bytedance.android.live.wallet.model.a> r10 = r9.f11142n
            com.bytedance.android.live.wallet.model.a r3 = r9.f11145q
            long r3 = r3.f11328j
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10.remove(r3)
        L_0x0107:
            r9.m13434b()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r3 = r9.f11139k
            int r3 = r3.f25519e
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r4 = r9.f11139k
            int r4 = r4.f25520f
            int r3 = r3 + r4
            java.lang.String r4 = "money"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r10.put(r4, r3)
            java.lang.String r3 = "request_page"
            java.lang.String r4 = r9.f11132d
            r10.put(r3, r4)
            java.lang.String r3 = "charge_reason"
            java.lang.String r4 = r9.f11131c
            r10.put(r3, r4)
            com.bytedance.android.livesdk.log.c r3 = com.bytedance.android.livesdk.log.C8443c.m25663a()
            java.lang.String r4 = "livesdk_check_out_show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class<com.bytedance.android.livesdk.log.b.j> r5 = com.bytedance.android.livesdk.log.p405b.C8438j.class
            r2[r0] = r5
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r0 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r2[r1] = r0
            r3.mo21606a(r4, r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.dialog.C3740d.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo11112a(int i, CheckOrderOriginalResult checkOrderOriginalResult) {
        C9097a.m27146a().mo22267a((Object) new C8296e(i));
        if (isShowing()) {
            dismiss();
        }
        C9049ap.m27022a((int) R.string.ed8);
        ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11543a("H5_payStatus", m13433b(1));
    }

    /* renamed from: a */
    public final void mo11115a(Exception exc, int i) {
        if (exc instanceof ApiServerException) {
            C9049ap.m27028a(((ApiServerException) exc).getPrompt());
        } else {
            C9049ap.m27022a((int) R.string.ed1);
        }
        ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11543a("H5_payStatus", m13433b(2));
    }

    public C3740d(Context context, boolean z, String str, String str2, ChargeDeal chargeDeal) {
        Context context2 = context;
        super(context, R.style.z9);
        C37411 r0 = new C3810a(0, R.drawable.c8w, R.drawable.c8x, C3358ac.m12515a((int) R.string.f9o), PayChannel.FIRE) {
            /* renamed from: a */
            public final boolean mo11241a() {
                if (((long) C3740d.this.f11139k.f25519e) <= ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11159d() / 10) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final void mo11242b() {
                String a = C3358ac.m12515a((int) R.string.f9i);
                double c = (double) ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11157c();
                Double.isNaN(c);
                StringBuilder sb = new StringBuilder(C9078p.m27100a(a, Double.valueOf(c / 100.0d)));
                if (((long) C3740d.this.f11139k.f25519e) > ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11159d() / 10) {
                    sb.append(C3740d.this.f11141m.getString(R.string.f9p));
                }
                this.f11332n = sb.toString();
                this.f11323e.setText(this.f11332n);
                this.f11323e.setVisibility(0);
            }
        };
        this.f11145q = r0;
        C37422 r02 = new C3810a(1, R.drawable.c8s, R.drawable.c8t, C3358ac.m12515a((int) R.string.f9h), PayChannel.ALIPAY) {
            /* renamed from: b */
            public final void mo11242b() {
            }

            /* renamed from: a */
            public final boolean mo11241a() {
                if (!C3740d.this.f11143o.contains(PayChannel.ALIPAY)) {
                    return true;
                }
                return false;
            }
        };
        this.f11146r = r02;
        C37433 r03 = new C3810a(2, R.drawable.c8y, R.drawable.c8z, C3358ac.m12515a((int) R.string.f9w), PayChannel.WEIXIN) {
            /* renamed from: b */
            public final void mo11242b() {
            }

            /* renamed from: a */
            public final boolean mo11241a() {
                if (!C3740d.this.f11143o.contains(PayChannel.WEIXIN)) {
                    return true;
                }
                return false;
            }
        };
        this.f11147s = r03;
        this.f11141m = context2;
        this.f11148t = false;
        this.f11131c = str;
        this.f11132d = str2;
        this.f11139k = chargeDeal;
        this.f11145q.f11337s = this.f11130b;
        this.f11146r.f11337s = this.f11130b;
        this.f11147s.f11337s = this.f11130b;
        this.f11142n.put(Long.valueOf(this.f11145q.f11328j), this.f11145q);
        this.f11142n.put(Long.valueOf(this.f11146r.f11328j), this.f11146r);
        this.f11142n.put(Long.valueOf(this.f11147s.f11328j), this.f11147s);
    }
}
