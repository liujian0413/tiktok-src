package com.p280ss.caijing.globaliap.p1791d;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.base.mvp.C45785d;
import com.p280ss.base.mvp.p1787a.C45782a;
import com.p280ss.base.p1785a.C45774b;
import com.p280ss.base.p1785a.C45776c;
import com.p280ss.base.p1785a.C45777d;
import com.p280ss.caijing.globaliap.p1788a.C45796a;
import com.p280ss.caijing.globaliap.p1788a.C45798b;
import com.p280ss.caijing.globaliap.p1788a.C45799c;
import com.p280ss.caijing.globaliap.p1788a.C45799c.C45800a;
import com.p280ss.caijing.globaliap.p1790c.C45805a;
import com.p280ss.caijing.globaliap.p1791d.C45829e.C45836b;
import com.p280ss.caijing.globaliap.p1791d.C45829e.C45838d;
import com.p280ss.caijing.globaliap.p1791d.C45829e.C45839e;
import com.p280ss.caijing.globaliap.p1791d.C45829e.C45840f;
import com.p280ss.caijing.globaliap.p1791d.C45847i.C45848a;
import com.p280ss.caijing.globaliap.p1795f.C45862a;
import com.p280ss.caijing.globaliap.p1795f.C45863b;
import com.p280ss.caijing.globaliap.p1795f.C45864c;
import com.p280ss.caijing.globaliap.pay.C45872c;
import com.p280ss.caijing.globaliap.pay.C45874e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.d.d */
public final class C45818d extends C45785d implements C45782a {

    /* renamed from: a */
    public String f117190a;

    /* renamed from: b */
    public C45829e f117191b;

    /* renamed from: c */
    public C45823e f117192c;

    /* renamed from: d */
    boolean f117193d;

    /* renamed from: e */
    String f117194e;

    /* renamed from: f */
    String f117195f;

    /* renamed from: g */
    String f117196g;

    /* renamed from: h */
    long f117197h;

    /* renamed from: i */
    public WeakReference<Activity> f117198i;

    /* renamed from: j */
    private Handler f117199j = new Handler();

    /* renamed from: k */
    private C45820b f117200k;

    /* renamed from: com.ss.caijing.globaliap.d.d$a */
    public class C45819a implements C45836b {
        /* renamed from: b */
        public final void mo111009b() {
            C45818d.this.f117192c.mo111044a(C45874e.m143959a(199, "bind google service error"));
            C45863b.m143921a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), false);
        }

        /* renamed from: a */
        public final void mo111008a() {
            String b = C45872c.m143952b(C45818d.this.f117190a, POIService.KEY_ORDER, null);
            if (TextUtils.isEmpty(b)) {
                C45818d.this.f117192c.mo111044a(C45874e.m143960a("order is null"));
                return;
            }
            try {
                C45796a aVar = new C45796a();
                aVar.f117137a = b;
                C45798b bVar = new C45798b();
                bVar.mo111015a(aVar);
                C45774b.m143724a((C45777d<Result>) bVar).mo110973a((C45776c<Result>) new C45821c<Result>(C45818d.this, 0));
            } catch (JSONException unused) {
                C45818d.this.f117192c.mo111044a(C45874e.m143960a("order parse failed"));
            }
            C45863b.m143921a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), true);
        }

        private C45819a() {
        }

        public /* synthetic */ C45819a(C45818d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$b */
    class C45820b implements Runnable {

        /* renamed from: b */
        private C45776c<JSONObject> f117203b;

        /* renamed from: c */
        private C45847i f117204c;

        public final void run() {
            C45818d.this.mo111038a(this.f117204c, this.f117203b);
        }

        private C45820b(C45847i iVar, C45776c<JSONObject> cVar) {
            this.f117204c = iVar;
            this.f117203b = cVar;
        }

        /* synthetic */ C45820b(C45818d dVar, C45847i iVar, C45776c cVar, byte b) {
            this(iVar, cVar);
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$c */
    class C45821c implements C45776c<JSONObject> {
        /* renamed from: a */
        public final void mo110976a() {
            C45818d.this.f117192c.mo111044a(C45874e.m143964c());
            C45862a.m143915a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), C45872c.m143952b(C45818d.this.f117190a, "merchant_id", ""), C45872c.m143952b(C45818d.this.f117190a, "total_amount", ""), false);
        }

        private C45821c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00c9 A[Catch:{ JSONException -> 0x0183 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x012d A[Catch:{ JSONException -> 0x0183 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo110977a(java.lang.Object r10) {
            /*
                r9 = this;
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                com.ss.caijing.globaliap.d.d r0 = com.p280ss.caijing.globaliap.p1791d.C45818d.this
                com.ss.caijing.globaliap.d.e r0 = r0.f117191b
                if (r0 == 0) goto L_0x01b5
                com.ss.caijing.globaliap.d.d r0 = com.p280ss.caijing.globaliap.p1791d.C45818d.this
                java.lang.String r0 = r0.f117190a
                java.lang.String r1 = "app_id"
                java.lang.String r2 = ""
                java.lang.String r3 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r0, r1, r2)
                com.ss.caijing.globaliap.d.d r0 = com.p280ss.caijing.globaliap.p1791d.C45818d.this
                java.lang.String r0 = r0.f117190a
                java.lang.String r1 = "uid"
                java.lang.String r2 = ""
                java.lang.String r4 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r0, r1, r2)
                r0 = 0
                com.ss.caijing.globaliap.a.a r1 = new com.ss.caijing.globaliap.a.a     // Catch:{ JSONException -> 0x0183 }
                r1.<init>()     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.a.a$a r1 = new com.ss.caijing.globaliap.a.a$a     // Catch:{ JSONException -> 0x0183 }
                r1.<init>()     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r2 = "response"
                org.json.JSONObject r10 = r10.getJSONObject(r2)     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r2 = "code"
                java.lang.String r2 = r10.getString(r2)     // Catch:{ JSONException -> 0x0183 }
                r1.f117265g = r2     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r2 = "msg"
                java.lang.String r2 = r10.optString(r2)     // Catch:{ JSONException -> 0x0183 }
                r1.f117266h = r2     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r2 = "trade_info"
                org.json.JSONObject r2 = r10.optJSONObject(r2)     // Catch:{ JSONException -> 0x0183 }
                if (r2 == 0) goto L_0x0072
                java.lang.String r5 = "trade_no"
                java.lang.String r5 = r2.getString(r5)     // Catch:{ JSONException -> 0x0183 }
                r1.f117138a = r5     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r5 = "product_id"
                java.lang.String r5 = r2.getString(r5)     // Catch:{ JSONException -> 0x0183 }
                r1.f117139b = r5     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r5 = "trade_amount"
                long r5 = r2.getLong(r5)     // Catch:{ JSONException -> 0x0183 }
                r1.f117141d = r5     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r2 = r1.f117138a     // Catch:{ JSONException -> 0x0183 }
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0183 }
                if (r2 != 0) goto L_0x00c2
                java.lang.String r2 = r1.f117139b     // Catch:{ JSONException -> 0x0183 }
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0183 }
                if (r2 == 0) goto L_0x0072
                goto L_0x00c2
            L_0x0072:
                java.lang.String r2 = "merchant_info"
                org.json.JSONObject r2 = r10.optJSONObject(r2)     // Catch:{ JSONException -> 0x0183 }
                if (r2 == 0) goto L_0x0093
                java.lang.String r5 = "merchant_id"
                java.lang.String r5 = r2.getString(r5)     // Catch:{ JSONException -> 0x0183 }
                r1.f117140c = r5     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r5 = "app_id"
                java.lang.String r2 = r2.getString(r5)     // Catch:{ JSONException -> 0x0183 }
                r1.f117143f = r2     // Catch:{ JSONException -> 0x0183 }
                android.content.Context r2 = com.p280ss.caijing.globaliap.pay.C45872c.m143951b()     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r5 = r1.f117143f     // Catch:{ JSONException -> 0x0183 }
                com.p280ss.caijing.globaliap.pay.C45873d.m143956a(r2, r5)     // Catch:{ JSONException -> 0x0183 }
            L_0x0093:
                java.lang.String r2 = "user_info"
                org.json.JSONObject r2 = r10.optJSONObject(r2)     // Catch:{ JSONException -> 0x0183 }
                if (r2 == 0) goto L_0x00a3
                java.lang.String r5 = "uid"
                java.lang.String r2 = r2.getString(r5)     // Catch:{ JSONException -> 0x0183 }
                r1.f117142e = r2     // Catch:{ JSONException -> 0x0183 }
            L_0x00a3:
                java.lang.String r2 = "paytype_info"
                org.json.JSONObject r10 = r10.optJSONObject(r2)     // Catch:{ JSONException -> 0x0183 }
                if (r10 == 0) goto L_0x00c2
                java.lang.String r2 = "googlepay_iap"
                org.json.JSONObject r10 = r10.optJSONObject(r2)     // Catch:{ JSONException -> 0x0183 }
                if (r10 == 0) goto L_0x00c2
                java.lang.String r2 = "retry_sleep_time"
                int r10 = r10.getInt(r2)     // Catch:{ JSONException -> 0x0183 }
                android.content.Context r2 = com.p280ss.caijing.globaliap.pay.C45872c.m143951b()     // Catch:{ JSONException -> 0x0183 }
                int r10 = r10 * 1000
                com.p280ss.caijing.globaliap.pay.C45873d.m143955a(r2, r10)     // Catch:{ JSONException -> 0x0183 }
            L_0x00c2:
                boolean r10 = r1.mo111067c()     // Catch:{ JSONException -> 0x0183 }
                r2 = 1
                if (r10 == 0) goto L_0x012d
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r5 = r1.f117139b     // Catch:{ JSONException -> 0x0183 }
                r10.f117194e = r5     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r5 = r1.f117138a     // Catch:{ JSONException -> 0x0183 }
                r10.f117195f = r5     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r5 = r1.f117140c     // Catch:{ JSONException -> 0x0183 }
                r10.f117196g = r5     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                long r5 = r1.f117141d     // Catch:{ JSONException -> 0x0183 }
                r10.f117197h = r5     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r5 = r10.f117195f     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r6 = r10.f117196g     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                long r7 = r10.f117197h     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r10 = com.p280ss.caijing.globaliap.p1791d.C45845g.m143862a(r3, r4, r5, r6, r7)     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r1 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.e r1 = r1.f117191b     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r3 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r3 = r3.f117194e     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r4 = "inapp"
                com.ss.caijing.globaliap.d.d$d r5 = new com.ss.caijing.globaliap.d.d$d     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r6 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                r5.<init>(r6, r0)     // Catch:{ JSONException -> 0x0183 }
                r1.mo111054a(r3, r4, r10, r5)     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r10 = r10.f117190a     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r1 = "app_id"
                java.lang.String r3 = ""
                java.lang.String r10 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r10, r1, r3)     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r1 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r1 = r1.f117190a     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r3 = "merchant_id"
                java.lang.String r4 = ""
                java.lang.String r1 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r1, r3, r4)     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r3 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r3 = r3.f117190a     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r4 = "total_amount"
                java.lang.String r5 = ""
                java.lang.String r3 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r3, r4, r5)     // Catch:{ JSONException -> 0x0183 }
                com.p280ss.caijing.globaliap.p1795f.C45862a.m143915a(r10, r1, r3, r2)     // Catch:{ JSONException -> 0x0183 }
                return
            L_0x012d:
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d$e r10 = r10.f117192c     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r1 = r1.f117266h     // Catch:{ JSONException -> 0x0183 }
                android.os.Bundle r3 = new android.os.Bundle     // Catch:{ JSONException -> 0x0183 }
                r3.<init>()     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r4 = "pay_result_code"
                r3.putInt(r4, r2)     // Catch:{ JSONException -> 0x0183 }
                android.os.Bundle r2 = new android.os.Bundle     // Catch:{ JSONException -> 0x0183 }
                r2.<init>()     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r4 = "pay_result_detail_code"
                r5 = 4
                r2.putInt(r4, r5)     // Catch:{ JSONException -> 0x0183 }
                boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0183 }
                if (r4 != 0) goto L_0x0153
                java.lang.String r4 = "pay_result_msg"
                r2.putString(r4, r1)     // Catch:{ JSONException -> 0x0183 }
            L_0x0153:
                java.lang.String r1 = "pay_result_extra"
                r3.putBundle(r1, r2)     // Catch:{ JSONException -> 0x0183 }
                r10.mo111044a(r3)     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r10 = r10.f117190a     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r1 = "app_id"
                java.lang.String r2 = ""
                java.lang.String r10 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r10, r1, r2)     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r1 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r1 = r1.f117190a     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r2 = "merchant_id"
                java.lang.String r3 = ""
                java.lang.String r1 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r1, r2, r3)     // Catch:{ JSONException -> 0x0183 }
                com.ss.caijing.globaliap.d.d r2 = com.p280ss.caijing.globaliap.p1791d.C45818d.this     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r2 = r2.f117190a     // Catch:{ JSONException -> 0x0183 }
                java.lang.String r3 = "total_amount"
                java.lang.String r4 = ""
                java.lang.String r2 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r2, r3, r4)     // Catch:{ JSONException -> 0x0183 }
                com.p280ss.caijing.globaliap.p1795f.C45862a.m143915a(r10, r1, r2, r0)     // Catch:{ JSONException -> 0x0183 }
                return
            L_0x0183:
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this
                com.ss.caijing.globaliap.d.d$e r10 = r10.f117192c
                android.os.Bundle r1 = com.p280ss.caijing.globaliap.pay.C45874e.m143964c()
                r10.mo111044a(r1)
                com.ss.caijing.globaliap.d.d r10 = com.p280ss.caijing.globaliap.p1791d.C45818d.this
                java.lang.String r10 = r10.f117190a
                java.lang.String r1 = "app_id"
                java.lang.String r2 = ""
                java.lang.String r10 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r10, r1, r2)
                com.ss.caijing.globaliap.d.d r1 = com.p280ss.caijing.globaliap.p1791d.C45818d.this
                java.lang.String r1 = r1.f117190a
                java.lang.String r2 = "merchant_id"
                java.lang.String r3 = ""
                java.lang.String r1 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r1, r2, r3)
                com.ss.caijing.globaliap.d.d r2 = com.p280ss.caijing.globaliap.p1791d.C45818d.this
                java.lang.String r2 = r2.f117190a
                java.lang.String r3 = "total_amount"
                java.lang.String r4 = ""
                java.lang.String r2 = com.p280ss.caijing.globaliap.pay.C45872c.m143952b(r2, r3, r4)
                com.p280ss.caijing.globaliap.p1795f.C45862a.m143915a(r10, r1, r2, r0)
            L_0x01b5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.caijing.globaliap.p1791d.C45818d.C45821c.mo110977a(java.lang.Object):void");
        }

        /* synthetic */ C45821c(C45818d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$d */
    class C45822d implements C45839e {
        /* renamed from: a */
        public final void mo111041a() {
            C45818d.this.f117192c.mo111044a(C45874e.m143959a(199, ""));
            C45863b.m143926b(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), false);
        }

        private C45822d() {
        }

        /* renamed from: a */
        public final void mo111042a(Bundle bundle) {
            int i;
            boolean z;
            int i2;
            String b = C45872c.m143952b(C45818d.this.f117190a, "app_id", "");
            if (bundle != null) {
                i = bundle.getInt("RESPONSE_CODE", -1);
            } else {
                i = -1;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("app_id", b);
            hashMap.put("resultCode", Integer.toString(i));
            C45864c.m143930a("caijing_iap_google_fetch_intent_code", hashMap);
            Activity activity = (Activity) C45818d.this.f117198i.get();
            if (C45818d.this.f117193d || activity == null) {
                if (C45818d.this.f117192c != null) {
                    C45818d.this.f117192c.mo111044a(C45874e.m143962b());
                    C45863b.m143926b(b, false);
                }
                return;
            }
            boolean z2 = true;
            if (bundle == null || bundle.getInt("RESPONSE_CODE", -1) != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                try {
                    PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("BUY_INTENT");
                    if (pendingIntent != null) {
                        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), 0, 0, 0);
                        C45818d.this.f117192c.mo111045b();
                        String str = C45818d.this.f117196g;
                        long j = C45818d.this.f117197h;
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("params_for_special", "caijing_pay_casher");
                        hashMap2.put("app_id", b);
                        hashMap2.put("merchant_id", str);
                        hashMap2.put("amount", Long.valueOf(j).toString());
                        hashMap2.put("platform", "googlepay");
                        C45864c.m143930a("caijing_iap_charge_request", hashMap2);
                        C45863b.m143926b(b, true);
                        return;
                    }
                    throw new C45817c("pendingIntent from gp is null");
                } catch (SendIntentException e) {
                    throw new C45817c((Exception) e);
                } catch (C45817c unused) {
                    C45818d.this.f117192c.mo111044a(C45874e.m143959a(120, "fetch intent:exception"));
                    C45863b.m143926b(b, false);
                }
            } else {
                if (bundle == null || bundle.getInt("RESPONSE_CODE", -1) != 7) {
                    z2 = false;
                }
                if (z2) {
                    C45818d.this.f117191b.mo111053a(C45818d.this.f117194e, "inapp", (C45840f) new C45826h(C45818d.this, 0));
                    C45863b.m143926b(b, false);
                    return;
                }
                int i3 = bundle.getInt("RESPONSE_CODE", -1);
                if (i3 == -1) {
                    i2 = 3;
                } else {
                    i2 = i3 + 100;
                }
                C45818d.this.f117192c.mo111044a(C45874e.m143959a(i2, ""));
                C45863b.m143926b(b, false);
            }
        }

        /* synthetic */ C45822d(C45818d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$e */
    public interface C45823e {
        /* renamed from: a */
        void mo111043a();

        /* renamed from: a */
        void mo111044a(Bundle bundle);

        /* renamed from: b */
        void mo111045b();
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$f */
    class C45824f implements C45776c<JSONObject> {

        /* renamed from: b */
        private int f117208b;

        /* renamed from: c */
        private C45847i f117209c;

        /* renamed from: a */
        public final void mo110976a() {
            m143826a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), "");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo110977a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            if (C45818d.this.f117191b != null) {
                String b = C45872c.m143952b(C45818d.this.f117190a, "app_id", "");
                new C45799c();
                try {
                    C45800a a = C45799c.m143782a(jSONObject);
                    if (a.mo111067c()) {
                        C45818d.m143810a(C45818d.this, a, this.f117209c);
                        C45818d.this.f117191b.mo111052a(this.f117209c.f117253c, (C45838d) new C45825g(C45818d.this, 0));
                        C45863b.m143924a(b, true, true, this.f117208b + 1);
                        C45863b.m143928c(b, true);
                    } else if (a.mo111018b()) {
                        C45805a.m143792a(this.f117209c.f117255e, this.f117209c.f117254d);
                        C45818d.m143810a(C45818d.this, a, this.f117209c);
                        C45818d.this.f117192c.mo111044a(C45845g.m143860a(this.f117209c));
                        C45863b.m143924a(b, true, false, this.f117208b + 1);
                        C45863b.m143922a(b, true, "GooglePayModel");
                    } else {
                        m143826a(b, a.f117266h);
                    }
                } catch (JSONException unused) {
                    m143826a(b, "server error:json");
                }
            }
        }

        private C45824f(C45847i iVar) {
            this.f117209c = iVar;
        }

        /* renamed from: a */
        private void m143826a(String str, String str2) {
            this.f117208b++;
            if (this.f117208b < 5) {
                C45818d.m143811a(C45818d.this, this.f117209c, (C45776c) this);
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                C45818d.this.f117192c.mo111044a(C45874e.m143964c());
            } else {
                C45818d.this.f117192c.mo111044a(C45874e.m143963b(str2));
            }
            C45863b.m143924a(str, true, false, this.f117208b + 1);
        }

        /* synthetic */ C45824f(C45818d dVar, C45847i iVar, byte b) {
            this(iVar);
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$g */
    class C45825g implements C45838d {
        /* renamed from: a */
        public final void mo111046a() {
            C45818d.this.f117192c.mo111043a();
            C45863b.m143920a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), -1, true);
        }

        private C45825g() {
        }

        /* renamed from: a */
        public final void mo111047a(int i) {
            C45818d.this.f117192c.mo111043a();
            C45863b.m143920a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), i, true);
        }

        /* synthetic */ C45825g(C45818d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$h */
    class C45826h implements C45840f {
        private C45826h() {
        }

        /* renamed from: a */
        public final void mo111048a(int i) {
            C45818d.this.f117192c.mo111044a(C45874e.m143959a(i + 100, "unknow product"));
            C45863b.m143919a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), i);
        }

        /* renamed from: a */
        public final void mo111049a(C45847i iVar) {
            int i;
            if (iVar != null) {
                C45818d.this.mo111039a(iVar, C45818d.this.mo111037a(iVar));
                C45818d.this.mo111038a(iVar, (C45776c<JSONObject>) new C45827i<JSONObject>(C45818d.this, iVar, 0));
            } else {
                C45818d.this.f117192c.mo111044a(C45874e.m143959a(198, ""));
            }
            String b = C45872c.m143952b(C45818d.this.f117190a, "app_id", "");
            if (iVar != null) {
                i = iVar.f117251a;
            } else {
                i = -1;
            }
            C45863b.m143919a(b, i);
        }

        /* synthetic */ C45826h(C45818d dVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$i */
    class C45827i implements C45776c<JSONObject> {

        /* renamed from: b */
        private int f117213b;

        /* renamed from: c */
        private C45847i f117214c;

        /* renamed from: a */
        public final void mo110976a() {
            m143833a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), "network error");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo110977a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            if (C45818d.this.f117191b != null) {
                String b = C45872c.m143952b(C45818d.this.f117190a, "app_id", "");
                new C45799c();
                try {
                    C45800a a = C45799c.m143782a(jSONObject);
                    if (a.mo111018b()) {
                        C45805a.m143792a(this.f117214c.f117255e, this.f117214c.f117254d);
                        C45818d.m143810a(C45818d.this, a, this.f117214c);
                        C45818d.this.f117192c.mo111044a(C45845g.m143860a(this.f117214c));
                        C45863b.m143924a(b, false, false, this.f117213b + 1);
                        C45863b.m143922a(b, false, "GooglePayModel");
                    } else if (a.mo111017a()) {
                        C45818d.m143810a(C45818d.this, a, this.f117214c);
                        C45818d.this.f117191b.mo111052a(this.f117214c.f117253c, (C45838d) new C45828j(C45818d.this, 0));
                        C45863b.m143928c(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), false);
                        C45863b.m143924a(b, false, true, this.f117213b + 1);
                    } else {
                        m143833a(b, a.f117266h);
                    }
                } catch (JSONException unused) {
                    m143833a(b, "server error");
                }
            }
        }

        private C45827i(C45847i iVar) {
            this.f117214c = iVar;
        }

        /* renamed from: a */
        private void m143833a(String str, String str2) {
            this.f117213b++;
            if (this.f117213b < 5) {
                C45818d.m143811a(C45818d.this, this.f117214c, (C45776c) this);
                return;
            }
            C45818d.this.f117192c.mo111044a(C45874e.m143959a(196, str2));
            C45863b.m143924a(str, false, false, this.f117213b + 1);
        }

        /* synthetic */ C45827i(C45818d dVar, C45847i iVar, byte b) {
            this(iVar);
        }
    }

    /* renamed from: com.ss.caijing.globaliap.d.d$j */
    class C45828j implements C45838d {
        /* renamed from: a */
        public final void mo111046a() {
            C45818d.this.f117192c.mo111044a(C45874e.m143959a(195, "consume last order failed"));
            C45863b.m143920a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), -1, false);
        }

        private C45828j() {
        }

        /* renamed from: a */
        public final void mo111047a(int i) {
            if (i == 0) {
                C45818d.this.f117191b.mo111054a(C45818d.this.f117194e, "inapp", C45845g.m143862a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), C45872c.m143952b(C45818d.this.f117190a, "uid", ""), C45818d.this.f117195f, C45818d.this.f117196g, C45818d.this.f117197h), new C45822d(C45818d.this, 0));
                String b = C45872c.m143952b(C45818d.this.f117190a, "app_id", "");
                HashMap hashMap = new HashMap();
                hashMap.put("app_id", b);
                C45864c.m143930a("caijing_iap_google_restart_current_process", hashMap);
            } else {
                C45818d.this.f117192c.mo111044a(C45874e.m143959a(i + 100, ""));
            }
            C45863b.m143920a(C45872c.m143952b(C45818d.this.f117190a, "app_id", ""), i, false);
        }

        /* synthetic */ C45828j(C45818d dVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo110995a() {
        this.f117193d = true;
        if (this.f117191b != null) {
            this.f117191b.mo111050a();
            this.f117191b = null;
        }
        if (this.f117200k != null) {
            this.f117199j.removeCallbacks(this.f117200k);
            this.f117200k = null;
        }
    }

    public C45818d(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C45799c mo111037a(C45847i iVar) {
        String b = C45872c.m143952b(this.f117190a, "app_id", "");
        String b2 = C45872c.m143952b(this.f117190a, "uid", "");
        C45799c cVar = new C45799c();
        cVar.f117149e = b;
        cVar.f117145a = iVar.f117259i;
        cVar.f117148d = iVar.f117260j;
        cVar.f117151g = iVar.f117256f;
        cVar.f117152h = iVar.f117258h;
        cVar.f117150f = iVar.f117253c;
        cVar.f117147c = iVar.f117252b;
        cVar.f117146b = b2;
        cVar.f117153i = iVar.f117257g;
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo111038a(C45847i iVar, C45776c<JSONObject> cVar) {
        C45798b bVar = new C45798b();
        try {
            bVar.mo111015a(mo111037a(iVar));
            C45774b.m143724a((C45777d<Result>) bVar).mo110973a(cVar);
        } catch (JSONException unused) {
            this.f117192c.mo111044a(C45874e.m143962b());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo111039a(C45847i iVar, C45799c cVar) {
        try {
            C45846h.m143870a(mo110998b(), iVar.f117253c, C45846h.m143867a(cVar.mo111066a()));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m143811a(C45818d dVar, C45847i iVar, C45776c cVar) {
        dVar.f117200k = new C45820b(dVar, iVar, cVar, 0);
        dVar.f117199j.postDelayed(dVar.f117200k, 2000);
    }

    /* renamed from: a */
    static /* synthetic */ void m143810a(C45818d dVar, C45800a aVar, C45847i iVar) {
        String b = C45872c.m143952b(dVar.f117190a, "app_id", "");
        if (aVar.mo111017a()) {
            C45846h.m143871a(dVar.mo110998b(), iVar.f117253c);
            C45863b.m143929d(b, true);
            return;
        }
        C45863b.m143929d(b, false);
    }

    /* renamed from: a */
    public final void mo110996a(int i, int i2, Bundle bundle) {
        C45847i iVar;
        boolean z;
        if (bundle == null) {
            this.f117192c.mo111044a(C45874e.m143959a(120, "handle result: data is null"));
            return;
        }
        String b = C45872c.m143952b(this.f117190a, "app_id", "");
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (i == 1001) {
            try {
                int intExtra = intent.getIntExtra("RESPONSE_CODE", 0);
                if (i2 == -1 && intExtra == 0) {
                    String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
                    String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
                    if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
                        throw new C45817c("purchaseData or dataSignature is null");
                    }
                    iVar = C45845g.m143861a(stringExtra, stringExtra2);
                } else {
                    StringBuilder sb = new StringBuilder("resultCode:");
                    sb.append(i2);
                    sb.append(",responseCode:");
                    sb.append(intExtra);
                    iVar = new C45848a().mo111065a(intExtra).f117264a;
                }
            } catch (C45817c unused) {
                this.f117192c.mo111044a(C45874e.m143959a(120, "google buy failed:exception"));
                C45862a.m143914a(C45872c.m143952b(this.f117190a, "app_id", ""), this.f117196g, this.f117197h, false, false);
                return;
            }
        } else {
            iVar = null;
        }
        if (iVar == null) {
            this.f117192c.mo111044a(C45874e.m143962b());
            return;
        }
        int i3 = iVar.f117251a;
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", b);
        hashMap.put("resultCode", Integer.toString(i3));
        C45864c.m143930a("caijing_iap_google_page_result", hashMap);
        if (iVar.f117251a == 0) {
            String str = this.f117195f;
            String str2 = this.f117196g;
            long j = this.f117197h;
            iVar.f117252b = str;
            iVar.f117259i = str2;
            iVar.f117260j = j;
            mo111039a(iVar, mo111037a(iVar));
            mo111038a(iVar, (C45776c<JSONObject>) new C45824f<JSONObject>(this, iVar, 0));
            C45862a.m143914a(b, this.f117196g, this.f117197h, true, false);
        } else if (iVar.f117251a == 7) {
            this.f117192c.mo111044a(C45874e.m143959a(iVar.f117251a + 100, ""));
            C45862a.m143914a(b, this.f117196g, this.f117197h, false, false);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("app_id", b);
            C45864c.m143930a("caijing_iap_unconsumed_but_open_goole", hashMap2);
        } else {
            new StringBuilder("google buy failed:").append(iVar.f117251a);
            this.f117192c.mo111044a(C45874e.m143959a(iVar.f117251a + 100, ""));
            if (iVar.f117251a == 1) {
                z = true;
            } else {
                z = false;
            }
            C45862a.m143914a(b, this.f117196g, this.f117197h, false, z);
        }
    }
}
