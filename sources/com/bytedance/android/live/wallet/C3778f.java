package com.bytedance.android.live.wallet;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.api.exceptions.ApiException;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.api.C3634i;
import com.bytedance.android.live.wallet.api.C3634i.C3636b;
import com.bytedance.android.live.wallet.api.C3641j;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C3826k;
import com.bytedance.android.live.wallet.monitor.OrderMonitor.Stage;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C7486b;
import p346io.reactivex.p354j.C7489f;

/* renamed from: com.bytedance.android.live.wallet.f */
public final class C3778f implements C3693c {

    /* renamed from: a */
    public C3826k f11235a;

    /* renamed from: b */
    public C7489f<Long> f11236b;

    /* renamed from: com.bytedance.android.live.wallet.f$a */
    static class C3784a {

        /* renamed from: a */
        public static final C3778f f11247a = new C3778f();
    }

    /* renamed from: h */
    public static C3778f m13508h() {
        return C3784a.f11247a;
    }

    /* renamed from: f */
    public final String mo11161f() {
        return this.f11235a.f11410g;
    }

    /* renamed from: a */
    public final C7492s<Long> mo11152a() {
        return this.f11236b.mo19294a(C47549a.m148327a());
    }

    /* renamed from: b */
    public final long mo11155b() {
        if (!m13509i()) {
            return 0;
        }
        return this.f11235a.f11404a;
    }

    /* renamed from: c */
    public final long mo11157c() {
        if (!m13509i()) {
            return 0;
        }
        return this.f11235a.f11406c;
    }

    /* renamed from: d */
    public final long mo11159d() {
        if (!m13509i()) {
            return 0;
        }
        return this.f11235a.f11406c;
    }

    /* renamed from: g */
    public final int mo11162g() {
        if (!m13509i()) {
            return 0;
        }
        return this.f11235a.f11405b;
    }

    /* renamed from: i */
    private static boolean m13509i() {
        return ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c();
    }

    private C3778f() {
        this.f11235a = new C3826k();
        this.f11236b = C7486b.m23223a();
        if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            IWalletService iWalletService = (IWalletService) C3596c.m13172a(IWalletService.class);
            if (((Integer) LiveSettingKeys.TTLIVE_PAY_TYPE.mo10240a()).intValue() == 1 && ((C3641j) C3642b.m13238a(C3641j.class)) != null) {
                C3358ac.m12528e();
                iWalletService.getCJAppId();
                iWalletService.getCJMerchantId();
                String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b());
            }
        }
        final C3634i iVar = (C3634i) C3642b.m13238a(C3634i.class);
        if (iVar != null) {
            iVar.mo11050a((C3636b) new C3636b() {
                /* renamed from: a */
                public final void mo11099a(final String str, String str2) {
                    String str3;
                    final String str4 = "";
                    try {
                        String[] split = new JSONObject(str).getString("developerPayload").split(",");
                        if (split.length > 2) {
                            str3 = split[2];
                        } else {
                            str3 = "";
                        }
                        str4 = str3;
                    } catch (JSONException unused) {
                    }
                    ((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).mtVerify(str4, str).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C7326g<C3479d<Object>>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void accept(C3479d<Object> dVar) throws Exception {
                            String string = new JSONObject(str).getString("purchaseToken");
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(string);
                            if (!TextUtils.isEmpty(string)) {
                                iVar.mo11048a(C3358ac.m12528e(), arrayList, null);
                            }
                        }
                    }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void accept(Throwable th) throws Exception {
                            int i;
                            if (th instanceof ApiException) {
                                i = ((ApiException) th).getErrorCode();
                            } else {
                                i = -13;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("order_id", str4);
                            hashMap.put("error_code", Integer.valueOf(i));
                            hashMap.put("error_msg", th.getMessage());
                            hashMap.put("errorDomain", Stage.VERIFY);
                            C9281a.m27617a(10, 1, 0, hashMap);
                            C9281a.m27619b(10, 1, 0, hashMap);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo11160e() {
        if (m13509i()) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            ((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).getWalletInfo(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a().getSecUid()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C7326g<C3479d<C3826k>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C3479d<C3826k> dVar) throws Exception {
                    C3826k kVar = (C3826k) dVar.data;
                    if (kVar != null) {
                        C3778f.this.f11235a = kVar;
                    }
                    C3778f.this.f11236b.onNext(Long.valueOf(C3778f.this.mo11155b()));
                    C9281a.m27625g(0, SystemClock.uptimeMillis() - uptimeMillis, null);
                }
            }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    int i;
                    HashMap hashMap = new HashMap();
                    hashMap.put("error_msg", th.getMessage());
                    String str = "error_code";
                    if (th instanceof ApiException) {
                        i = ((ApiException) th).getErrorCode();
                    } else {
                        i = -16;
                    }
                    hashMap.put(str, Integer.valueOf(i));
                    C9281a.m27626h(1, SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                    C9281a.m27625g(1, SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo11153a(int i) {
        if (m13509i()) {
            this.f11235a.f11405b = i;
            this.f11236b.onNext(Long.valueOf(mo11155b()));
        }
    }

    /* renamed from: b */
    public final boolean mo11156b(long j) {
        if (m13509i() && this.f11235a.f11404a >= j) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo11158c(long j) {
        if (m13509i() && ((long) this.f11235a.f11405b) >= j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11154a(long j) {
        if (m13509i()) {
            this.f11235a.f11404a = j;
            this.f11236b.onNext(Long.valueOf(mo11155b()));
        }
    }
}
