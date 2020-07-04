package com.p280ss.caijing.globaliap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.base.p1786b.C45780c;
import com.p280ss.caijing.globaliap.p1790c.C45805a;
import com.p280ss.caijing.globaliap.p1795f.C45864c;
import com.p280ss.caijing.globaliap.pay.C45872c;
import com.p280ss.caijing.globaliap.pay.PayActivity;
import java.util.Map;

/* renamed from: com.ss.caijing.globaliap.e */
public final class C45849e {
    /* renamed from: a */
    public static void m143886a() {
        C45805a.f117164a = null;
    }

    /* renamed from: a */
    public static void m143890a(C45801b bVar) {
        C45864c.f117278a = bVar;
    }

    /* renamed from: a */
    public static void m143891a(C45804c cVar) {
        C45805a.f117164a = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m143887a(android.content.Context r6) {
        /*
            java.lang.Class<com.ss.caijing.globaliap.e> r0 = com.p280ss.caijing.globaliap.C45849e.class
            monitor-enter(r0)
            if (r6 != 0) goto L_0x0007
            monitor-exit(r0)
            return
        L_0x0007:
            android.content.Context r1 = r6.getApplicationContext()     // Catch:{ all -> 0x008f }
            com.p280ss.caijing.globaliap.pay.C45872c.m143947a(r1)     // Catch:{ all -> 0x008f }
            com.ss.caijing.globaliap.b.a r1 = com.p280ss.caijing.globaliap.p1789b.C45802a.m143788a()     // Catch:{ all -> 0x008f }
            com.ss.caijing.globaliap.d.a r2 = new com.ss.caijing.globaliap.d.a     // Catch:{ all -> 0x008f }
            android.content.Context r6 = r6.getApplicationContext()     // Catch:{ all -> 0x008f }
            r2.<init>(r6)     // Catch:{ all -> 0x008f }
            java.util.Queue<com.ss.caijing.globaliap.b.b> r6 = r1.f117157a     // Catch:{ all -> 0x008f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x008f }
        L_0x0021:
            boolean r3 = r6.hasNext()     // Catch:{ all -> 0x008f }
            r4 = 1
            if (r3 == 0) goto L_0x003d
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x008f }
            com.ss.caijing.globaliap.b.b r3 = (com.p280ss.caijing.globaliap.p1789b.C45803b) r3     // Catch:{ all -> 0x008f }
            java.lang.String r3 = r3.mo111022a()     // Catch:{ all -> 0x008f }
            java.lang.String r5 = r2.mo111022a()     // Catch:{ all -> 0x008f }
            boolean r3 = android.text.TextUtils.equals(r3, r5)     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0021
            goto L_0x005f
        L_0x003d:
            java.util.Queue<com.ss.caijing.globaliap.b.b> r6 = r1.f117158b     // Catch:{ all -> 0x008f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x008f }
        L_0x0043:
            boolean r3 = r6.hasNext()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x008f }
            com.ss.caijing.globaliap.b.b r3 = (com.p280ss.caijing.globaliap.p1789b.C45803b) r3     // Catch:{ all -> 0x008f }
            java.lang.String r3 = r3.mo111022a()     // Catch:{ all -> 0x008f }
            java.lang.String r5 = r2.mo111022a()     // Catch:{ all -> 0x008f }
            boolean r3 = android.text.TextUtils.equals(r3, r5)     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            goto L_0x005f
        L_0x005e:
            r4 = 0
        L_0x005f:
            if (r4 != 0) goto L_0x0070
            java.util.concurrent.locks.Lock r6 = r1.f117159c     // Catch:{ all -> 0x008f }
            r6.lock()     // Catch:{ all -> 0x008f }
            java.util.Queue<com.ss.caijing.globaliap.b.b> r6 = r1.f117158b     // Catch:{ all -> 0x008f }
            r6.add(r2)     // Catch:{ all -> 0x008f }
            java.util.concurrent.locks.Lock r6 = r1.f117159c     // Catch:{ all -> 0x008f }
            r6.unlock()     // Catch:{ all -> 0x008f }
        L_0x0070:
            com.ss.caijing.globaliap.b.a r6 = com.p280ss.caijing.globaliap.p1789b.C45802a.m143788a()     // Catch:{ all -> 0x008f }
            boolean r6 = r6.isAlive()     // Catch:{ all -> 0x008f }
            if (r6 != 0) goto L_0x008d
            android.content.Context r6 = com.p280ss.caijing.globaliap.pay.C45872c.m143951b()     // Catch:{ all -> 0x008f }
            int r6 = com.p280ss.caijing.globaliap.pay.C45873d.m143954a(r6)     // Catch:{ all -> 0x008f }
            com.ss.caijing.globaliap.b.a r1 = com.p280ss.caijing.globaliap.p1789b.C45802a.m143788a()     // Catch:{ all -> 0x008f }
            com.ss.caijing.globaliap.b.a r6 = r1.mo111019a(r6)     // Catch:{ all -> 0x008f }
            r6.start()     // Catch:{ all -> 0x008f }
        L_0x008d:
            monitor-exit(r0)
            return
        L_0x008f:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.caijing.globaliap.C45849e.m143887a(android.content.Context):void");
    }

    /* renamed from: a */
    public static synchronized void m143888a(Context context, String str) {
        synchronized (C45849e.class) {
            m143889a(context, str, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m143889a(android.content.Context r2, java.lang.String r3, boolean r4) {
        /*
            java.lang.Class<com.ss.caijing.globaliap.e> r4 = com.p280ss.caijing.globaliap.C45849e.class
            monitor-enter(r4)
            if (r2 == 0) goto L_0x0019
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0019
        L_0x000c:
            java.lang.String r0 = com.p280ss.caijing.globaliap.pay.C45873d.m143957b(r2)     // Catch:{ all -> 0x0016 }
            r1 = 0
            com.p280ss.caijing.globaliap.p1791d.C45844f.m143857a(r2, r0, r3, r1)     // Catch:{ all -> 0x0016 }
            monitor-exit(r4)
            return
        L_0x0016:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
        L_0x0019:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.caijing.globaliap.C45849e.m143889a(android.content.Context, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    public static synchronized boolean m143892a(Activity activity, String str, Map<String, String> map, int i, Bundle bundle) {
        synchronized (C45849e.class) {
            if (!C45872c.m143948a(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" is not available");
                return false;
            }
            String a = C45872c.m143946a();
            if (TextUtils.isEmpty(a)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a);
                sb2.append(" is null");
                return false;
            }
            C45872c.m143947a(activity.getApplicationContext());
            C45872c.m143950a(a, POIService.KEY_ORDER, C45780c.m143738a(map));
            C45872c.m143949a(a, "order_extras", bundle);
            C45872c.m143950a(a, "app_id", (String) map.get("app_id"));
            C45872c.m143950a(a, "merchant_id", (String) map.get("merchant_id"));
            C45872c.m143950a(a, "total_amount", (String) map.get("total_amount"));
            C45872c.m143950a(a, "uid", (String) map.get("uid"));
            Intent intent = new Intent(activity, PayActivity.class);
            intent.putExtra("processId", a);
            activity.startActivityForResult(intent, i);
            activity.overridePendingTransition(0, 0);
            return true;
        }
    }
}
