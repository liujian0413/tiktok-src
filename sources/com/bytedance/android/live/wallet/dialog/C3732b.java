package com.bytedance.android.live.wallet.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3777e;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.IWalletService.C3597a;
import com.bytedance.android.live.wallet.api.C3628c;
import com.bytedance.android.live.wallet.model.C3810a;
import com.bytedance.android.live.wallet.model.C3819f;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.p178b.p179a.C3646c;
import com.bytedance.android.live.wallet.p178b.p180b.C3669a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.wallet.dialog.b */
public final class C3732b extends C3752i implements C3669a {

    /* renamed from: A */
    private C7321c f11108A;

    /* renamed from: B */
    private OnClickListener f11109B = new C3739c(this);

    /* renamed from: a */
    C3646c f11110a;

    /* renamed from: b */
    ProgressBar f11111b;

    /* renamed from: c */
    View f11112c;

    /* renamed from: d */
    ImageView f11113d;

    /* renamed from: e */
    TextView f11114e;

    /* renamed from: f */
    TextView f11115f;

    /* renamed from: g */
    ImageView f11116g;

    /* renamed from: h */
    Activity f11117h;

    /* renamed from: i */
    public C3597a f11118i;

    /* renamed from: j */
    C3777e f11119j;

    /* renamed from: k */
    public final C3810a f11120k;

    /* renamed from: z */
    private String f11121z;

    /* renamed from: a */
    public final void mo11111a(int i) {
    }

    /* renamed from: a */
    public final void mo11113a(C9353b bVar) {
    }

    /* renamed from: c */
    public final void mo11116c() {
    }

    /* renamed from: i */
    private void m13412i() {
        m13410b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11235b() {
        this.f11120k.mo11327a(this.f11177s);
    }

    /* renamed from: h */
    private void m13411h() {
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        m13410b(true);
    }

    /* renamed from: d */
    public final void mo11117d() {
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.f11112c.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo11237e() {
        if (this.f11118i != null) {
            this.f11118i.mo11022a(this, this.f11119j);
        }
        dismiss();
    }

    public final void show() {
        if (this.f11119j != null && this.f11179u != null) {
            super.show();
        }
    }

    /* renamed from: j */
    private void m13413j() {
        this.f11112c.setVisibility(8);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        C9049ap.m27022a((int) R.string.ed1);
    }

    public final void dismiss() {
        super.dismiss();
        if (this.f11108A != null && !this.f11108A.isDisposed()) {
            this.f11108A.dispose();
        }
    }

    /* renamed from: f */
    public final void mo11238f() {
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        m13410b(false);
        this.f11116g.setImageResource(R.drawable.c9s);
        this.f11115f.setText(R.string.ejk);
        this.f11114e.setText(R.string.f9d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11231a() {
        if (this.f11179u != null) {
            this.f11173o.setText(C3358ac.m12517a((int) R.string.f9q, Float.valueOf(((float) this.f11179u.f25517c) / 100.0f)));
            if (this.f11180v == null || this.f11180v == PayChannel.DIAMOND) {
                this.f11174p.setText(String.valueOf(this.f11179u.f25519e));
                if (this.f11113d != null) {
                    this.f11113d.setVisibility(0);
                }
            } else {
                TextView textView = this.f11174p;
                StringBuilder sb = new StringBuilder();
                sb.append(C3358ac.m12515a((int) R.string.fbr));
                sb.append(C9078p.m27100a("%.2f", Float.valueOf(((float) this.f11179u.f25516b) / 100.0f)));
                textView.setText(sb);
                if (this.f11113d != null) {
                    this.f11113d.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11114a(Exception exc) {
        m13413j();
    }

    /* renamed from: a */
    public final void mo11233a(C3777e eVar) {
        String str;
        this.f11119j = eVar;
        if (this.f11119j.mo11042b() == 10001) {
            str = "card_ticket";
        } else {
            str = "guard";
        }
        this.f11171m = str;
    }

    /* renamed from: a */
    private void m13409a(boolean z) {
        if (z) {
            m13411h();
        } else {
            m13412i();
        }
        if (this.f11119j != null) {
            this.f11119j.mo11041a().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C7326g<C3479d<C3819f>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C3479d<C3819f> dVar) throws Exception {
                    if (((C3819f) dVar.data).f11360a == 0) {
                        C3732b.this.mo11237e();
                    } else {
                        C3732b.this.mo11238f();
                    }
                }
            }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    C3732b.this.mo11238f();
                }
            });
        }
    }

    /* renamed from: b */
    private void m13410b(boolean z) {
        this.f11112c.setVisibility(0);
        if (z) {
            this.f11111b.setVisibility(0);
            this.f11114e.setVisibility(8);
            this.f11115f.setVisibility(8);
            this.f11116g.setVisibility(8);
            return;
        }
        this.f11111b.setVisibility(8);
        this.f11115f.setVisibility(0);
        this.f11116g.setVisibility(0);
        this.f11114e.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11232a(View view) {
        String str;
        String str2;
        if (this.f11180v != null) {
            C8946b.f24427az.mo22118a(this.f11180v.name());
            switch (this.f11180v) {
                case WEIXIN:
                    str = "weixin";
                    str2 = "wxpay";
                    break;
                case ALIPAY:
                    str = "Alipay";
                    str2 = "alipay";
                    break;
                case FIRE:
                    str = "balance";
                    str2 = "balance";
                    break;
                default:
                    str = "TEST";
                    str2 = "TEST";
                    break;
            }
            new HashMap().put("lable", str);
            HashMap hashMap = new HashMap();
            hashMap.put("lable", String.valueOf(this.f11179u.f25519e));
            C8443c.m25663a().mo21606a("recharge_list", hashMap, C8438j.class, Room.class);
            if (!TextUtils.equals("balance", str2)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("request_page", this.f11121z);
                hashMap2.put("charge_reason", this.f11171m);
                hashMap2.put("money", String.valueOf(this.f11179u.f25519e + this.f11179u.f25520f));
                hashMap2.put("pay_method", str2);
                C8443c.m25663a().mo21606a("livesdk_recharge_pay", hashMap2, C8438j.class, Room.class);
            }
            if (this.f11179u != null && this.f11180v != null) {
                if (this.f11180v == PayChannel.DIAMOND) {
                    m13409a(true);
                    return;
                }
                this.f11110a.mo11102a(this.f11179u, this.f11180v);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11111b = (ProgressBar) findViewById(R.id.ecj);
        this.f11112c = findViewById(R.id.a16);
        this.f11114e = (TextView) findViewById(R.id.dsb);
        this.f11113d = (ImageView) findViewById(R.id.b8i);
        this.f11115f = (TextView) findViewById(R.id.dsc);
        this.f11116g = (ImageView) findViewById(R.id.b7t);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f11174p.getLayoutParams();
        marginLayoutParams.topMargin = C3358ac.m12510a(34.0f);
        this.f11174p.setLayoutParams(marginLayoutParams);
        this.f11108A = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11152a().mo19325f((C7326g<? super T>) new C7326g<Long>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Long l) throws Exception {
                if (C3732b.this.f11120k != null) {
                    C3732b.this.f11120k.mo11328c();
                }
            }
        });
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
        C3646c cVar = new C3646c(this.f11117h, new C3628c() {
        }, this.f11171m, this.f11121z, 0);
        this.f11110a = cVar;
        this.f11110a.mo9142a((C3669a) this);
        this.f11173o.setVisibility(8);
        this.f11178t.setOnClickListener(this.f11109B);
        this.f11182x.put(Long.valueOf(this.f11120k.f11328j), this.f11120k);
        this.f11120k.f11337s = this.f11170l;
        HashMap hashMap = new HashMap();
        if (this.f11179u != null) {
            hashMap.put("money", String.valueOf(this.f11179u.f25519e + this.f11179u.f25520f));
        }
        hashMap.put("request_page", this.f11121z);
        if (this.f11119j != null) {
            hashMap.put("charge_reason", this.f11171m);
        }
        C8443c.m25663a().mo21606a("livesdk_check_out_show", hashMap, C8438j.class, Room.class);
    }

    /* renamed from: a */
    public final boolean mo11234a(String str) {
        try {
            mo11255a((ChargeDeal) C2317a.m9932a().mo15974a(str, ChargeDeal.class));
            if (this.f11179u != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C3166a.m11963b("ConsumeDialog", (Throwable) e);
            return false;
        }
    }

    public C3732b(Activity activity, String str) {
        super(activity, false, "", str);
        C37331 r2 = new C3810a(-1, R.drawable.c8u, R.drawable.c8v, C3358ac.m12515a((int) R.string.f9l), PayChannel.DIAMOND) {
            /* renamed from: a */
            public final boolean mo11241a() {
                if (((long) C3732b.this.f11179u.f25519e) <= ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b()) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final void mo11242b() {
                if (mo11241a()) {
                    this.f11332n = C3358ac.m12517a((int) R.string.ei9, Long.valueOf(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b()));
                } else {
                    this.f11332n = C3358ac.m12515a((int) R.string.ei8);
                }
                this.f11323e.setText(this.f11332n);
                this.f11323e.setVisibility(0);
            }
        };
        this.f11120k = r2;
        this.f11121z = str;
        this.f11117h = activity;
    }

    /* renamed from: a */
    public final void mo11112a(int i, CheckOrderOriginalResult checkOrderOriginalResult) {
        ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22185e().mo19128a();
        m13410b(false);
        this.f11116g.setImageResource(R.drawable.c9t);
        this.f11115f.setText(R.string.ed8);
        this.f11114e.setText(R.string.faa);
        m13409a(false);
    }

    /* renamed from: a */
    public final void mo11115a(Exception exc, int i) {
        m13413j();
    }
}
