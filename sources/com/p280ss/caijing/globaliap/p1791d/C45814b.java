package com.p280ss.caijing.globaliap.p1791d;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.base.p1786b.C45779b;
import com.p280ss.base.p1786b.C45780c;
import com.p280ss.caijing.globaliap.p1788a.C45799c;
import com.p280ss.caijing.globaliap.p1788a.C45799c.C45800a;
import com.p280ss.caijing.globaliap.p1790c.C45805a;
import com.p280ss.caijing.globaliap.p1791d.p1792a.C45808a;
import com.p280ss.caijing.globaliap.p1791d.p1792a.C45808a.C45810a;
import com.p280ss.caijing.globaliap.p1791d.p1792a.C45808a.C45812b;
import com.p280ss.caijing.globaliap.p1793e.C45854b;
import com.p280ss.caijing.globaliap.p1793e.C45855c;
import com.p280ss.caijing.globaliap.p1793e.C45855c.C45856a;
import com.p280ss.caijing.globaliap.p1793e.C45855c.C45857b;
import com.p280ss.caijing.globaliap.p1795f.C45863b;
import com.p280ss.caijing.globaliap.p1795f.C45864c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.d.b */
final class C45814b implements Runnable {

    /* renamed from: a */
    C45808a f117178a = new C45808a();

    /* renamed from: b */
    Context f117179b;
    /* access modifiers changed from: 0000 */

    /* renamed from: c */
    public Handler f117180c;
    /* access modifiers changed from: 0000 */

    /* renamed from: d */
    public String f117181d;

    /* renamed from: e */
    String f117182e;

    /* renamed from: f */
    boolean f117183f;

    /* renamed from: g */
    private C45812b f117184g = new C45812b() {
        /* renamed from: b */
        public final void mo111033b() {
            new StringBuilder("bind failed:").append(Thread.currentThread().getName());
            C45863b.m143925a(false);
            C45844f.m143859b(C45814b.this.f117181d);
        }

        /* renamed from: a */
        public final void mo111032a() {
            new StringBuilder("bind success:").append(Thread.currentThread().getName());
            if (C45814b.this.f117180c != null) {
                C45814b.this.f117180c.post(C45814b.this.f117185h);
            } else {
                C45844f.m143859b(C45814b.this.f117181d);
            }
            C45863b.m143925a(true);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Runnable f117185h = new Runnable() {
        /* renamed from: a */
        private void m143808a() {
            C45814b.this.f117178a.mo111026a();
            C45814b.this.f117180c.getLooper().quit();
        }

        /* renamed from: b */
        private ArrayList<C45847i> m143809b() {
            int i;
            ArrayList<C45847i> arrayList = new ArrayList<>();
            String str = null;
            do {
                try {
                    Bundle a = C45814b.this.f117178a.mo111025a("inapp", str);
                    Object obj = a.get("RESPONSE_CODE");
                    if (obj == null) {
                        i = 0;
                    } else if (obj instanceof Integer) {
                        i = ((Integer) obj).intValue();
                    } else if (obj instanceof Long) {
                        i = (int) ((Long) obj).longValue();
                    } else {
                        StringBuilder sb = new StringBuilder("Unexpected type for bundle response code: ");
                        sb.append(obj.getClass().getName());
                        throw new RuntimeException(sb.toString());
                    }
                    if (i == 0 && a.containsKey("INAPP_PURCHASE_ITEM_LIST") && a.containsKey("INAPP_PURCHASE_DATA_LIST")) {
                        if (a.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                            ArrayList stringArrayList = a.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            ArrayList stringArrayList2 = a.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            if (stringArrayList != null && stringArrayList2 != null && !stringArrayList.isEmpty() && stringArrayList.size() == stringArrayList2.size()) {
                                for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                                    try {
                                        arrayList.add(C45845g.m143861a((String) stringArrayList.get(i2), (String) stringArrayList2.get(i2)));
                                    } catch (C45817c unused) {
                                    }
                                }
                            }
                            str = a.getString("INAPP_CONTINUATION_TOKEN");
                        }
                    }
                    return null;
                } catch (RemoteException e) {
                    C6497a.m20185b(e);
                }
            } while (!TextUtils.isEmpty(str));
            return arrayList;
        }

        public final void run() {
            new StringBuilder("mCheckAllPurchasesRunnable run:").append(Thread.currentThread().getName());
            C45864c.m143930a("caijing_iap_consume_task_start_check", new HashMap());
            ArrayList b = m143809b();
            if (b == null || b.isEmpty()) {
                m143808a();
                C45863b.m143917a(0);
                C45844f.m143859b(C45814b.this.f117181d);
                return;
            }
            new StringBuilder("unconsumedPurchaseList length:").append(b.size());
            C45863b.m143917a(b.size());
            Iterator it = b.iterator();
            while (it.hasNext()) {
                C45847i iVar = (C45847i) it.next();
                C45814b bVar = C45814b.this;
                String str = iVar.f117262l;
                String str2 = iVar.f117261k;
                C45799c cVar = new C45799c();
                if (TextUtils.isEmpty(str2)) {
                    str2 = bVar.f117182e;
                }
                cVar.f117149e = str2;
                cVar.f117145a = iVar.f117259i;
                cVar.f117148d = iVar.f117260j;
                cVar.f117151g = iVar.f117256f;
                cVar.f117152h = iVar.f117258h;
                cVar.f117150f = iVar.f117253c;
                cVar.f117147c = iVar.f117252b;
                if (TextUtils.isEmpty(str)) {
                    str = bVar.f117181d;
                }
                cVar.f117146b = str;
                cVar.f117153i = iVar.f117257g;
                try {
                    C45855c cVar2 = new C45856a().mo111070a("https://tp-paymva.snssdk.com/gateway-u").mo111071a(cVar.mo111066a()).f117275a;
                    try {
                        C45814b bVar2 = C45814b.this;
                        try {
                            String a = C45846h.m143867a(cVar.mo111066a());
                            if (!C45779b.m143736c(bVar2.f117179b, "gpay_ords", C45780c.m143737a(iVar.f117253c))) {
                                C45846h.m143870a(bVar2.f117179b, iVar.f117253c, a);
                            }
                        } catch (JSONException unused) {
                            C45863b.m143918a("save confirm order failed");
                        }
                        boolean a2 = C45814b.m143803a(C45814b.this.f117179b, cVar2.mo111069a(), iVar);
                        if (C45814b.this.f117183f && a2) {
                            int a3 = C45814b.this.f117178a.mo111024a(iVar.f117253c);
                            HashMap hashMap = new HashMap();
                            hashMap.put("result", Integer.valueOf(a3).toString());
                            C45864c.m143930a("caijing_iap_consume_task_consume_result", hashMap);
                        }
                    } catch (C45854b unused2) {
                        C45863b.m143918a("connection exception");
                    } catch (RemoteException unused3) {
                        C45863b.m143918a("remote exception");
                    }
                } catch (JSONException unused4) {
                    C45863b.m143918a("json exception");
                }
            }
            m143808a();
            C45844f.m143859b(C45814b.this.f117181d);
        }
    };

    public final void run() {
        new StringBuilder("GooglePayConsumeTask run:").append(Thread.currentThread().getName());
        Looper.prepare();
        this.f117180c = new Handler(Looper.myLooper());
        C45864c.m143930a("caijing_iap_consume_task_start", new HashMap());
        C45808a aVar = this.f117178a;
        Context context = this.f117179b;
        C45812b bVar = this.f117184g;
        if (aVar.mo111027b()) {
            bVar.mo111032a();
        } else {
            aVar.f117167b = false;
            aVar.f117172g = bVar;
            aVar.f117169d = context.getApplicationContext();
            aVar.f117170e.execute(new C45810a(aVar, 0));
        }
        Looper.loop();
    }

    /* renamed from: a */
    static boolean m143803a(Context context, C45857b bVar, C45847i iVar) {
        boolean z;
        if (bVar.f117276a == 200) {
            try {
                JSONObject jSONObject = new JSONObject(bVar.f117277b);
                new C45799c();
                C45800a a = C45799c.m143782a(jSONObject);
                if (a.mo111017a()) {
                    C45846h.m143871a(context, iVar.f117253c);
                    try {
                        C45863b.m143927b(iVar.f117261k, true, false);
                        z = true;
                    } catch (JSONException unused) {
                        z = true;
                    }
                } else {
                    C45863b.m143927b(iVar.f117261k, false, false);
                    z = false;
                }
                try {
                    if (!a.mo111018b()) {
                        return z;
                    }
                    C45805a.m143792a(iVar.f117255e, iVar.f117254d);
                    C45863b.m143922a(iVar.f117261k, false, "GooglePayConsumeTask");
                    return false;
                } catch (JSONException unused2) {
                }
            } catch (JSONException unused3) {
            }
        }
        z = false;
        C45863b.m143927b(iVar.f117261k, false, true);
        return z;
    }

    C45814b(Context context, String str, String str2, boolean z) {
        this.f117179b = context.getApplicationContext();
        this.f117182e = str;
        this.f117181d = str2;
        this.f117183f = z;
        C45844f.m143858a(str2);
    }
}
