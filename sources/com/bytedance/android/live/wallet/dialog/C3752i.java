package com.bytedance.android.live.wallet.dialog;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.util.C0888a;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C3810a;
import com.bytedance.android.live.wallet.model.C3810a.C3811a;
import com.bytedance.android.live.wallet.model.C3817d;
import com.bytedance.android.live.wallet.model.C3818e;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.live.wallet.dialog.i */
public class C3752i extends C3731a {

    /* renamed from: a */
    private final C3810a f11163a;

    /* renamed from: b */
    private final C3810a f11164b;

    /* renamed from: c */
    private final C3810a f11165c;

    /* renamed from: d */
    private final boolean f11166d;

    /* renamed from: e */
    private final C47562b f11167e = new C47562b();

    /* renamed from: f */
    private final PayChannel[] f11168f = {PayChannel.WEIXIN, PayChannel.ALIPAY};

    /* renamed from: g */
    private OnClickListener f11169g = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            if (C3752i.this.f11180v != null) {
                C9097a.m27146a().mo22267a((Object) new C3818e(C3752i.this.f11179u, C3752i.this.f11180v));
                C8946b.f24427az.mo22118a(C3752i.this.f11180v.name());
                switch (C37586.f11189a[C3752i.this.f11180v.ordinal()]) {
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
                hashMap.put("request_page", C3752i.this.f11172n);
                hashMap.put("charge_reason", C3752i.this.f11171m);
                hashMap.put("money", String.valueOf(C3752i.this.f11179u.f25519e + C3752i.this.f11179u.f25520f));
                hashMap.put("pay_method", str);
                C8443c.m25663a().mo21606a("livesdk_recharge_pay", hashMap, C8438j.class, Room.class);
            }
        }
    };

    /* renamed from: l */
    protected C3811a f11170l = new C3811a() {
        /* renamed from: a */
        public final void mo11250a(C3810a aVar, boolean z) {
            if (z) {
                C3752i.this.f11180v = null;
                C3752i.this.mo11258g();
            } else if (!aVar.mo11241a()) {
                String str = (String) C5864b.f17283c.mo10240a();
                if (!TextUtils.isEmpty(str)) {
                    new C3534a(C3752i.this.getContext()).mo10660b((CharSequence) str).mo10649a(17039370, C3762m.f11193a).mo10657a().show();
                }
            } else {
                C3752i.this.f11180v = aVar.f11335q;
                C3752i.this.mo11258g();
            }
        }
    };

    /* renamed from: m */
    protected String f11171m;

    /* renamed from: n */
    protected String f11172n;

    /* renamed from: o */
    protected TextView f11173o;

    /* renamed from: p */
    protected TextView f11174p;

    /* renamed from: q */
    protected TextView f11175q;

    /* renamed from: r */
    protected ProgressBar f11176r;

    /* renamed from: s */
    protected ViewGroup f11177s;

    /* renamed from: t */
    protected View f11178t;

    /* renamed from: u */
    protected ChargeDeal f11179u;

    /* renamed from: v */
    protected PayChannel f11180v;

    /* renamed from: w */
    protected Context f11181w;

    /* renamed from: x */
    protected final Map<Long, C3810a> f11182x = new HashMap();

    /* renamed from: y */
    public final Set<PayChannel> f11183y = new C0888a();

    /* renamed from: com.bytedance.android.live.wallet.dialog.i$6 */
    static /* synthetic */ class C37586 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11189a = new int[PayChannel.values().length];

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
                f11189a = r0
                int[] r0 = f11189a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.WEIXIN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11189a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.ALIPAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11189a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.FIRE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11189a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdkapi.host.PayChannel r1 = com.bytedance.android.livesdkapi.host.PayChannel.TEST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.dialog.C3752i.C37586.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11235b() {
    }

    /* renamed from: d */
    private void mo11117d() {
        this.f11176r.setVisibility(8);
        this.f11175q.setVisibility(8);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11167e.mo119660a();
    }

    /* renamed from: e */
    private void mo11237e() {
        this.f11176r.setVisibility(8);
        this.f11175q.setVisibility(0);
        this.f11178t.setEnabled(false);
    }

    /* renamed from: c */
    private void mo11116c() {
        this.f11176r.setVisibility(0);
        this.f11175q.setVisibility(8);
        this.f11178t.setEnabled(false);
        this.f11177s.removeAllViews();
        this.f11167e.mo119661a(((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).fetchOptionList().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C3760k<Object>(this), (C7326g<? super Throwable>) new C3761l<Object>(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11231a() {
        this.f11173o.setText(C3358ac.m12517a((int) R.string.f9q, Float.valueOf(((float) this.f11179u.f25517c) / 100.0f)));
        TextView textView = this.f11174p;
        StringBuilder sb = new StringBuilder();
        sb.append(C3358ac.m12515a((int) R.string.fbr));
        sb.append(C9078p.m27100a("%.2f", Float.valueOf(((float) this.f11179u.f25516b) / 100.0f)));
        textView.setText(sb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo11258g() {
        if (this.f11180v == null) {
            this.f11178t.setEnabled(false);
            for (C3810a aVar : this.f11182x.values()) {
                if (aVar.f11326h != null) {
                    aVar.f11326h.setChecked(false);
                }
            }
        } else {
            Iterator it = this.f11182x.values().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C3810a aVar2 = (C3810a) it.next();
                if (aVar2.f11326h != null) {
                    CheckBox checkBox = aVar2.f11326h;
                    if (aVar2.f11335q != this.f11180v) {
                        z = false;
                    }
                    checkBox.setChecked(z);
                }
            }
            this.f11178t.setEnabled(true);
        }
        mo11231a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11257b(View view) {
        mo11116c();
    }

    /* renamed from: a */
    public final void mo11255a(ChargeDeal chargeDeal) {
        this.f11179u = chargeDeal;
        if (this.f11173o != null) {
            mo11258g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11256a(Throwable th) throws Exception {
        C3166a.m11955a(6, "PayDialog", th.getStackTrace());
        mo11237e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11254a(C3478c cVar) throws Exception {
        mo11117d();
        mo11235b();
        for (C3817d dVar : cVar.f10296b) {
            C3810a aVar = (C3810a) this.f11182x.get(Long.valueOf(dVar.f11353a));
            if (aVar != null) {
                if (dVar.f11356d) {
                    aVar.f11333o = dVar.f11354b;
                    aVar.f11334p = dVar.f11355c;
                    aVar.mo11327a(this.f11177s);
                } else {
                    this.f11182x.remove(Long.valueOf(dVar.f11353a));
                }
            }
        }
        String str = (String) C8946b.f24427az.mo22117a();
        if (C6319n.m19593a(str)) {
            this.f11180v = null;
        } else if (PayChannel.valueOf(str) != PayChannel.FIRE || this.f11163a.mo11241a()) {
            this.f11180v = PayChannel.valueOf(str);
            if (this.f11180v == PayChannel.FIRE || this.f11180v == PayChannel.TEST) {
                this.f11180v = PayChannel.WEIXIN;
            }
            if (this.f11183y.contains(this.f11180v)) {
                this.f11180v = null;
                PayChannel[] payChannelArr = this.f11168f;
                int length = payChannelArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    PayChannel payChannel = payChannelArr[i];
                    if (!this.f11183y.contains(payChannel)) {
                        this.f11180v = payChannel;
                        break;
                    }
                    i++;
                }
            }
        } else {
            this.f11180v = null;
        }
        mo11258g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aoo);
        Window window = getWindow();
        boolean z = true;
        try {
            if (getContext().getResources().getConfiguration().orientation != 1) {
                z = false;
            }
        } catch (Exception e) {
            C3166a.m11963b("PayDialog", (Throwable) e);
        }
        if (window != null) {
            if (z) {
                getWindow().setLayout(-1, -2);
                getWindow().setGravity(80);
            } else {
                getWindow().setLayout(-2, -1);
                getWindow().setWindowAnimations(R.style.zg);
                getWindow().setGravity(21);
            }
        }
        this.f11183y.clear();
        int intValue = ((Integer) C5864b.f17282b.mo10240a()).intValue();
        if ((intValue & 1) > 0) {
            this.f11183y.add(PayChannel.WEIXIN);
        }
        if ((intValue & 2) > 0) {
            this.f11183y.add(PayChannel.ALIPAY);
        }
        this.f11173o = (TextView) findViewById(R.id.dzw);
        this.f11174p = (TextView) findViewById(R.id.e0a);
        this.f11176r = (ProgressBar) findViewById(R.id.cl8);
        this.f11177s = (ViewGroup) findViewById(R.id.bs4);
        this.f11175q = (TextView) findViewById(R.id.dx9);
        this.f11175q.setOnClickListener(new C3759j(this));
        this.f11178t = findViewById(R.id.r3);
        this.f11178t.setOnClickListener(this.f11169g);
        if (this.f11179u != null) {
            mo11231a();
        }
        if (!this.f11166d) {
            this.f11182x.remove(Long.valueOf(this.f11163a.f11328j));
        }
        mo11116c();
    }

    public C3752i(Context context, boolean z, String str, String str2) {
        super(context, R.style.z9);
        C37531 r0 = new C3810a(0, R.drawable.c8w, R.drawable.c8x, C3358ac.m12515a((int) R.string.f9o), PayChannel.FIRE) {
            /* renamed from: a */
            public final boolean mo11241a() {
                if (((long) C3752i.this.f11179u.f25519e) <= ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11159d() / 10) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final void mo11242b() {
                String a = C3358ac.m12515a((int) R.string.f9i);
                Locale locale = Locale.US;
                double c = (double) ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11157c();
                Double.isNaN(c);
                StringBuilder sb = new StringBuilder(C1642a.m8035a(locale, a, new Object[]{Double.valueOf(c / 100.0d)}));
                if (((long) C3752i.this.f11179u.f25519e) > ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11159d() / 10) {
                    sb.append(C3752i.this.f11181w.getString(R.string.f9p));
                }
                this.f11332n = sb.toString();
                this.f11323e.setText(this.f11332n);
                this.f11323e.setVisibility(0);
            }
        };
        this.f11163a = r0;
        C37542 r02 = new C3810a(1, R.drawable.c8s, R.drawable.c8t, C3358ac.m12515a((int) R.string.f9h), PayChannel.ALIPAY) {
            /* renamed from: b */
            public final void mo11242b() {
            }

            /* renamed from: a */
            public final boolean mo11241a() {
                if (!C3752i.this.f11183y.contains(PayChannel.ALIPAY)) {
                    return true;
                }
                return false;
            }
        };
        this.f11164b = r02;
        C37553 r03 = new C3810a(2, R.drawable.c8y, R.drawable.c8z, C3358ac.m12515a((int) R.string.f9w), PayChannel.WEIXIN) {
            /* renamed from: b */
            public final void mo11242b() {
            }

            /* renamed from: a */
            public final boolean mo11241a() {
                if (!C3752i.this.f11183y.contains(PayChannel.WEIXIN)) {
                    return true;
                }
                return false;
            }
        };
        this.f11165c = r03;
        this.f11181w = context;
        this.f11166d = false;
        this.f11171m = str;
        this.f11172n = str2;
        this.f11163a.f11337s = this.f11170l;
        this.f11164b.f11337s = this.f11170l;
        this.f11165c.f11337s = this.f11170l;
        this.f11182x.put(Long.valueOf(this.f11163a.f11328j), this.f11163a);
        this.f11182x.put(Long.valueOf(this.f11164b.f11328j), this.f11164b);
        this.f11182x.put(Long.valueOf(this.f11165c.f11328j), this.f11165c);
    }
}
