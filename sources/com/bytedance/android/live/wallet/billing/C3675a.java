package com.bytedance.android.live.wallet.billing;

import android.app.Activity;
import android.os.Message;
import android.os.SystemClock;
import android.support.p022v4.util.C0888a;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.wallet.C3642b;
import com.bytedance.android.live.wallet.api.C3626a;
import com.bytedance.android.live.wallet.api.C3627b;
import com.bytedance.android.live.wallet.api.C3629d;
import com.bytedance.android.live.wallet.api.C3634i;
import com.bytedance.android.live.wallet.api.C3634i.C3636b;
import com.bytedance.android.live.wallet.billing.BillingManager.C3674a;
import com.bytedance.android.live.wallet.billing.BillingManager.ConnectionState;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.monitor.OrderMonitor;
import com.bytedance.android.live.wallet.monitor.OrderMonitor.Stage;
import com.bytedance.android.live.wallet.p178b.p180b.C3669a;
import com.bytedance.android.livesdk.p431y.p433b.C9281a;
import com.bytedance.android.livesdkapi.depend.model.C9353b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9433b;
import com.bytedance.android.livesdkapi.host.IHostWallet.C9436e;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.bytedance.android.livesdkapi.p457i.C9476d;
import com.bytedance.android.livesdkapi.p457i.C9486m;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.wallet.billing.a */
public class C3675a implements C6310a {

    /* renamed from: f */
    private static final String f10943f = "a";

    /* renamed from: a */
    public final Set<String> f10944a = new C0888a();

    /* renamed from: b */
    public final LinkedList<C3688b> f10945b = new LinkedList<>();

    /* renamed from: c */
    public final Queue<C3688b> f10946c = new LinkedList();

    /* renamed from: d */
    public final C6309f f10947d;

    /* renamed from: e */
    public boolean f10948e = false;

    /* renamed from: g */
    private final Set<String> f10949g = new C0888a();

    /* renamed from: h */
    private final Set<String> f10950h = new C0888a();

    /* renamed from: i */
    private C3669a f10951i;

    /* renamed from: j */
    private final C3627b f10952j;

    /* renamed from: k */
    private final C3629d f10953k;

    /* renamed from: l */
    private final C3626a f10954l;

    /* renamed from: m */
    private final BillingManager f10955m;

    /* renamed from: n */
    private JSONObject f10956n;

    /* renamed from: o */
    private boolean f10957o = false;

    /* renamed from: p */
    private boolean f10958p = false;

    /* renamed from: q */
    private long f10959q;

    /* renamed from: r */
    private String f10960r = null;

    /* renamed from: s */
    private final C3687a f10961s = new C3687a();

    /* renamed from: t */
    private final C3674a f10962t = new C3674a() {
        /* renamed from: a */
        public final void mo11103a() {
            C3675a.this.mo11135b();
        }
    };

    /* renamed from: com.bytedance.android.live.wallet.billing.a$a */
    static class C3687a {

        /* renamed from: a */
        public Activity f10983a;

        /* renamed from: b */
        public long f10984b;

        /* renamed from: c */
        public String f10985c;

        /* renamed from: d */
        public boolean f10986d;

        /* renamed from: e */
        public boolean f10987e;

        /* renamed from: f */
        public boolean f10988f;

        /* renamed from: g */
        public int f10989g;

        private C3687a() {
        }

        /* renamed from: a */
        public final void mo11141a() {
            this.f10983a = null;
            this.f10984b = 0;
            this.f10985c = null;
            this.f10986d = false;
            this.f10987e = false;
            this.f10988f = false;
            this.f10989g = 0;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.billing.a$b */
    static class C3688b {

        /* renamed from: a */
        public final C9486m f10990a;

        /* renamed from: b */
        public int f10991b;

        /* renamed from: c */
        public String f10992c;

        public final String toString() {
            return super.toString();
        }

        private C3688b(C9486m mVar) {
            this.f10990a = mVar;
        }
    }

    /* renamed from: a */
    public final void mo11132a(C3669a aVar, Activity activity, ChargeDeal chargeDeal, JSONObject jSONObject, String str) {
        if (!this.f10957o && chargeDeal != null && !TextUtils.isEmpty(chargeDeal.f25521g) && this.f10960r == null) {
            this.f10951i = aVar;
            this.f10956n = jSONObject;
            this.f10960r = chargeDeal.f25521g;
            this.f10961s.f10983a = activity;
            this.f10961s.f10984b = chargeDeal.f25515a;
            this.f10961s.f10989g = chargeDeal.f25519e;
            if (this.f10951i != null) {
                this.f10951i.mo11111a((int) R.string.ehg);
            }
            this.f10959q = SystemClock.uptimeMillis();
            if (str == null) {
                str = "";
            }
            this.f10952j.mo11039a(chargeDeal.f25515a, PayChannel.GOOGLE, str).mo19280a((C7326g<? super T>) new C7326g<C9353b>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C9353b bVar) throws Exception {
                    if (C3675a.this.f10947d != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 1003;
                        obtain.obj = bVar;
                        C3675a.this.f10947d.sendMessage(obtain);
                    }
                }
            }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    if (C3675a.this.f10947d != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 1003;
                        if (!(th instanceof Exception)) {
                            th = new Exception(th);
                        }
                        obtain.obj = th;
                        C3675a.this.f10947d.sendMessage(obtain);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo11130a() {
        this.f10960r = null;
        this.f10961s.mo11141a();
        this.f10957o = true;
        this.f10958p = false;
        this.f10948e = false;
        this.f10945b.clear();
        this.f10946c.clear();
        this.f10947d.removeCallbacksAndMessages(null);
        this.f10955m.mo11126a(this.f10962t);
        this.f10951i = null;
    }

    /* renamed from: a */
    public final void mo11131a(C3669a aVar) {
        if (this.f10951i == aVar) {
            this.f10960r = null;
            this.f10961s.mo11141a();
            this.f10951i = null;
            this.f10956n = new JSONObject();
        }
    }

    /* renamed from: a */
    public final void mo11134a(String str) {
        if (TextUtils.equals(str, this.f10960r)) {
            this.f10961s.f10988f = true;
            if (this.f10961s.f10987e) {
                this.f10960r = null;
                int i = this.f10961s.f10989g;
                this.f10961s.mo11141a();
                if (this.f10951i != null) {
                    this.f10951i.mo11116c();
                }
                this.f10951i.mo11112a(i, (CheckOrderOriginalResult) null);
                C19282c.m63184a(C3358ac.m12528e(), "recharge_pay_result", "google_pay_success", -1, -1, this.f10956n);
                OrderMonitor.m13576a();
            }
        }
    }

    /* renamed from: b */
    public final void mo11135b() {
        if (!this.f10957o) {
            if (!this.f10946c.isEmpty()) {
                mo11137d();
            }
            C9436e a = this.f10955m.mo11123a();
            if (a.mo23186a() == 0) {
                this.f10945b.clear();
                if (a.mo23187b() != null) {
                    this.f10945b.addAll(m13302a(a.mo23187b()));
                    mo11136c();
                }
            }
        }
    }

    /* renamed from: e */
    private void m13311e() {
        if (this.f10961s.f10983a != null && this.f10960r != null) {
            int a = this.f10955m.mo11122a(this.f10961s.f10983a, this.f10960r);
            if (a != 0) {
                C19282c.m63184a(C3358ac.m12528e(), "recharge_pay_result", "fail_google_pay_fail", -1, (long) a, this.f10956n);
                OrderMonitor.m13580a(Stage.GOOGLE_PAY, String.valueOf(a), "launchFailed", (JSONObject) null);
                m13305a(1, this.f10961s.f10985c, this.f10961s.f10984b, a, "launchFailed", Stage.GOOGLE_PAY);
                m13308a(this.f10960r, null, R.string.ejh);
                return;
            }
            this.f10961s.f10983a = null;
            if (this.f10951i != null) {
                this.f10951i.mo11116c();
            }
        }
    }

    /* renamed from: c */
    public final void mo11136c() {
        if (!this.f10958p && !this.f10945b.isEmpty()) {
            final C3688b bVar = null;
            while (bVar == null && !this.f10945b.isEmpty()) {
                bVar = (C3688b) this.f10945b.poll();
            }
            if (bVar != null) {
                this.f10958p = true;
                if (this.f10949g.contains(bVar.f10990a.f25973d)) {
                    m13307a(Message.obtain(this.f10947d, 1002, Pair.create(bVar, Boolean.valueOf(true))));
                    return;
                }
                if (bVar.f10992c == null && this.f10960r != null && TextUtils.equals(bVar.f10990a.f25970a, this.f10960r)) {
                    bVar.f10992c = this.f10961s.f10985c;
                }
                this.f10953k.mo11040a(bVar.f10990a.f25974e, bVar.f10990a.f25975f, bVar.f10992c).mo19280a((C7326g<? super T>) new C7326g<C3479d<C9476d>>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(C3479d<C9476d> dVar) {
                        if (C3675a.this.f10947d != null) {
                            Message obtain = Message.obtain();
                            obtain.what = 1002;
                            obtain.obj = Pair.create(bVar, Boolean.valueOf(((C9476d) dVar.data).f25942a));
                            C3675a.this.f10947d.handleMessage(obtain);
                        }
                    }
                }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Throwable th) {
                        if (C3675a.this.f10947d != null) {
                            Message obtain = Message.obtain();
                            obtain.what = 1002;
                            C3688b bVar = bVar;
                            if (!(th instanceof Exception)) {
                                th = new Exception();
                            }
                            obtain.obj = Pair.create(bVar, th);
                            C3675a.this.f10947d.handleMessage(obtain);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: d */
    public final void mo11137d() {
        if (!this.f10948e && !this.f10946c.isEmpty()) {
            final C3688b bVar = null;
            while (bVar == null && !this.f10946c.isEmpty()) {
                bVar = (C3688b) this.f10946c.poll();
            }
            if (bVar != null) {
                this.f10948e = true;
                final JSONObject jSONObject = this.f10956n;
                C36859 r2 = new C9433b() {
                    /* renamed from: a */
                    public final void mo11139a(int i, String str) {
                        C3675a.this.f10948e = false;
                        if (i == 0) {
                            C3675a.this.f10944a.add(str);
                            C3675a.this.mo11134a(bVar.f10990a.f25970a);
                        } else {
                            C3688b bVar = bVar;
                            int i2 = bVar.f10991b + 1;
                            bVar.f10991b = i2;
                            if (i2 < 3) {
                                C3675a.this.f10946c.offer(bVar);
                            } else {
                                C19282c.m63184a(C3358ac.m12528e(), "recharge_pay_result", "fail_google_consume_fail", -1, -1, jSONObject);
                                OrderMonitor.m13580a(Stage.CONSUME, String.valueOf(i), (String) null, (JSONObject) null);
                                C3675a.this.f10947d.postDelayed(new Runnable() {
                                    public final void run() {
                                        bVar.f10991b = 0;
                                        C3675a.this.f10946c.offer(bVar);
                                        C3675a.this.mo11137d();
                                    }
                                }, 60000);
                                C3675a.this.mo11134a(bVar.f10990a.f25970a);
                            }
                        }
                        C3675a.this.mo11137d();
                    }
                };
                if (this.f10944a.contains(bVar.f10990a.f25973d)) {
                    r2.mo11139a(0, bVar.f10990a.f25973d);
                } else {
                    this.f10955m.mo11127a(bVar.f10990a.f25973d, (C9433b) r2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11133a(CheckOrderOriginalResult checkOrderOriginalResult) {
        m13303a(checkOrderOriginalResult.getRetry() + 1);
    }

    /* renamed from: a */
    private static List<C3688b> m13302a(List<C9486m> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C9486m bVar : list) {
            arrayList.add(new C3688b(bVar));
        }
        return arrayList;
    }

    public void handleMsg(Message message) {
        if (!this.f10957o) {
            switch (message.what) {
                case 1002:
                    m13307a(message);
                    return;
                case 1003:
                    m13309b(message);
                    return;
                case LiveRoomStruct.ROOM_LONGTIME_NO_NET /*1004*/:
                    m13310c(message);
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m13303a(final int i) {
        if (this.f10960r != null && this.f10961s.f10986d) {
            final String str = this.f10961s.f10985c;
            if (this.f10950h.contains(this.f10961s.f10985c)) {
                m13310c(Message.obtain(this.f10947d, LiveRoomStruct.ROOM_LONGTIME_NO_NET, new CheckOrderOriginalResult().setRetry(i).setOrderId(str).setStatus(1)));
                return;
            }
            this.f10954l.mo11038a(str).mo19280a((C7326g<? super T>) new C7326g<CheckOrderOriginalResult>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(CheckOrderOriginalResult checkOrderOriginalResult) throws Exception {
                    if (C3675a.this.f10947d != null) {
                        Message obtain = Message.obtain();
                        obtain.what = LiveRoomStruct.ROOM_LONGTIME_NO_NET;
                        obtain.obj = checkOrderOriginalResult.setOrderId(str).setRetry(i);
                        C3675a.this.f10947d.handleMessage(obtain);
                    }
                }
            }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) throws Exception {
                    Exception exc;
                    CheckOrderOriginalResult orderId = new CheckOrderOriginalResult().setRetry(i).setOrderId(str);
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = new Exception();
                    }
                    orderId.setException(exc).setStatus(-1);
                }
            });
        }
    }

    /* renamed from: b */
    private void m13309b(Message message) {
        String str;
        if (message.obj instanceof Exception) {
            C19282c.m63184a(C3358ac.m12528e(), "recharge_pay_result", "fail_google_create_order_fail", -1, -1, this.f10956n);
            OrderMonitor.m13578a(Stage.CREATE_ORDER, (Exception) message.obj);
            OrderMonitor.m13582a(PayChannel.GOOGLE, (Exception) message.obj);
            m13306a(this.f10959q, 1, PayChannel.GOOGLE, this.f10961s.f10984b, (Throwable) message.obj);
            m13308a(this.f10960r, (Exception) message.obj, 0);
            return;
        }
        C9353b bVar = (C9353b) message.obj;
        if (bVar == null || TextUtils.isEmpty(bVar.f25546a)) {
            C19282c.m63184a(C3358ac.m12528e(), "recharge_pay_result", "fail_google_create_order_fail", -1, -1, this.f10956n);
            OrderMonitor.m13580a(Stage.CREATE_ORDER, "0", "invalid order", (JSONObject) null);
            OrderMonitor.m13583a(PayChannel.GOOGLE, "invalide order");
            long j = this.f10959q;
            PayChannel payChannel = PayChannel.GOOGLE;
            long j2 = this.f10961s.f10984b;
            StringBuilder sb = new StringBuilder();
            if (bVar == null) {
                str = "orderInfo";
            } else {
                str = "orderId";
            }
            sb.append(str);
            sb.append("was null");
            m13306a(j, 1, payChannel, j2, (Throwable) new RuntimeException(sb.toString()));
            m13308a(this.f10960r, null, R.string.ejj);
            return;
        }
        OrderMonitor.m13584a(PayChannel.GOOGLE, (JSONObject) null);
        m13306a(this.f10959q, 0, PayChannel.GOOGLE, this.f10961s.f10984b, (Throwable) null);
        this.f10961s.f10985c = bVar.f25546a;
        m13311e();
    }

    /* renamed from: c */
    private void m13310c(Message message) {
        String str;
        CheckOrderOriginalResult checkOrderOriginalResult = (CheckOrderOriginalResult) message.obj;
        if (this.f10960r != null && TextUtils.equals(checkOrderOriginalResult.getOrderId(), this.f10961s.f10985c)) {
            if (checkOrderOriginalResult.getException() == null && checkOrderOriginalResult.getStatus() == 1) {
                this.f10950h.add(checkOrderOriginalResult.getOrderId());
                this.f10961s.f10987e = true;
                if (this.f10961s.f10988f) {
                    m13304a(0, this.f10961s.f10985c, checkOrderOriginalResult.getRetry(), 0, "");
                    mo11134a(this.f10960r);
                }
            } else if (checkOrderOriginalResult.getRetry() < 5) {
                this.f10947d.postDelayed(new C3689b(this, checkOrderOriginalResult), 2000);
            } else {
                C19282c.m63184a(C3358ac.m12528e(), "recharge_pay_result", "fail_google_check_fail", -1, -1, this.f10956n);
                int i = -11;
                if (checkOrderOriginalResult.getException() != null) {
                    OrderMonitor.m13578a(Stage.CHECK_ORDER, checkOrderOriginalResult.getException());
                    if (checkOrderOriginalResult.getException() instanceof ApiServerException) {
                        i = ((ApiServerException) checkOrderOriginalResult.getException()).getErrorCode();
                    }
                    str = checkOrderOriginalResult.getException().getMessage();
                } else {
                    OrderMonitor.m13580a(Stage.CHECK_ORDER, String.valueOf(checkOrderOriginalResult.getStatus()), (String) null, (JSONObject) null);
                    str = "check order failed";
                }
                m13304a(1, this.f10961s.f10985c, checkOrderOriginalResult.getRetry(), i, str);
                m13308a(this.f10960r, checkOrderOriginalResult.getException(), R.string.ejk);
            }
        }
    }

    /* renamed from: a */
    private void m13307a(Message message) {
        String str;
        int i;
        this.f10958p = false;
        Pair pair = (Pair) message.obj;
        final C3688b bVar = (C3688b) pair.first;
        if ((pair.second instanceof Exception) || pair.second == null || !((Boolean) pair.second).booleanValue()) {
            int i2 = bVar.f10991b + 1;
            bVar.f10991b = i2;
            if (i2 < 3) {
                this.f10945b.offer(bVar);
            } else {
                C19282c.m63184a(C3358ac.m12528e(), "recharge_pay_result", "fail_google_verify_fail", -1, -1, this.f10956n);
                int i3 = -13;
                Exception exc = null;
                if (pair.second instanceof Exception) {
                    if (pair.second instanceof ApiServerException) {
                        i3 = ((ApiServerException) pair.second).getErrorCode();
                    }
                    String message2 = ((Exception) pair.second).getMessage();
                    OrderMonitor.m13578a(Stage.VERIFY, (Exception) pair.second);
                    i = i3;
                    str = message2;
                } else {
                    OrderMonitor.m13580a(Stage.VERIFY, "0", "verify false", (JSONObject) null);
                    str = "verify false";
                    i = -13;
                }
                m13305a(1, this.f10961s.f10985c, this.f10961s.f10984b, i, str, Stage.VERIFY);
                this.f10947d.postDelayed(new Runnable() {
                    public final void run() {
                        bVar.f10991b = 0;
                        C3675a.this.f10945b.offer(bVar);
                        C3675a.this.mo11136c();
                    }
                }, 60000);
                String str2 = bVar.f10990a.f25970a;
                if (pair.second instanceof Exception) {
                    exc = (Exception) pair.second;
                }
                m13308a(str2, exc, R.string.ejl);
            }
        } else {
            bVar.f10991b = 0;
            this.f10946c.offer(bVar);
            if (this.f10955m.f10935a == ConnectionState.CONNECTED) {
                mo11137d();
            } else {
                this.f10955m.mo11129b(this.f10962t);
            }
            this.f10949g.add(bVar.f10990a.f25973d);
            if (this.f10960r != null) {
                this.f10961s.f10986d = TextUtils.equals(this.f10960r, bVar.f10990a.f25970a);
                if (this.f10961s.f10986d) {
                    m13305a(0, this.f10961s.f10985c, this.f10961s.f10984b, 0, "", Stage.VERIFY);
                    m13303a(0);
                }
            }
        }
        mo11136c();
    }

    /* renamed from: a */
    private void m13308a(String str, Exception exc, int i) {
        if (TextUtils.equals(str, this.f10960r)) {
            this.f10960r = null;
            this.f10961s.mo11141a();
            if (this.f10951i != null) {
                this.f10951i.mo11116c();
                this.f10951i.mo11115a(exc, i);
            }
        }
    }

    public C3675a(C3629d dVar, C3627b bVar, C3626a aVar, BillingManager billingManager) {
        this.f10952j = bVar;
        this.f10953k = dVar;
        this.f10954l = aVar;
        this.f10955m = billingManager;
        this.f10947d = new C6309f(this);
        C3634i iVar = (C3634i) C3642b.m13238a(C3634i.class);
        if (iVar != null) {
            iVar.mo11050a((C3636b) new C3636b() {
                /* renamed from: a */
                public final void mo11099a(String str, String str2) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        String optString = jSONObject.optString("productId");
                        String optString2 = jSONObject.optString("orderId");
                        long optLong = jSONObject.optLong("purchaseTime");
                        String optString3 = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                        LinkedList<C3688b> linkedList = C3675a.this.f10945b;
                        C9486m mVar = new C9486m(optString, optString2, optLong, optString3, str, str2);
                        linkedList.offer(new C3688b(mVar));
                        C3675a.this.mo11136c();
                    } catch (JSONException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static void m13304a(int i, String str, int i2, int i3, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("error_code", Integer.valueOf(i3));
        hashMap.put("error_msg", str2);
        hashMap.put("times", Integer.valueOf(i2));
        if (i == 0) {
            C9281a.m27617a(20, i, 0, hashMap);
            return;
        }
        C9281a.m27617a(20, i, 0, hashMap);
        C9281a.m27619b(20, i, 0, hashMap);
    }

    /* renamed from: a */
    private static void m13306a(long j, int i, PayChannel payChannel, long j2, Throwable th) {
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", Long.valueOf(j2));
        hashMap.put("channel", payChannel.getValue());
        if (i == 0) {
            C9281a.m27623e(i, uptimeMillis, hashMap);
            C9281a.m27617a(0, i, uptimeMillis, hashMap);
            return;
        }
        int i2 = -1;
        String str = "";
        if (th != null) {
            str = th.getMessage();
        }
        if (th instanceof ApiServerException) {
            i2 = ((ApiServerException) th).getErrorCode();
        }
        hashMap.put("error_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str);
        C9281a.m27623e(i, uptimeMillis, hashMap);
        C9281a.m27624f(i, uptimeMillis, hashMap);
    }

    /* renamed from: a */
    private static void m13305a(int i, String str, long j, int i2, String str2, Stage stage) {
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", Long.valueOf(j));
        hashMap.put("order_id", str);
        hashMap.put("error_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str2);
        hashMap.put("errorDomain", stage.getDomain());
        if (i == 0) {
            C9281a.m27617a(10, i, 0, hashMap);
            return;
        }
        C9281a.m27617a(10, i, 0, hashMap);
        C9281a.m27619b(10, i, 0, hashMap);
    }
}
