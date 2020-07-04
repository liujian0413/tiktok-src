package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.C15334q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.lo */
public class C15848lo<ReferenceT> {

    /* renamed from: a */
    public ReferenceT f44603a;

    /* renamed from: b */
    private final Map<String, CopyOnWriteArrayList<C15742hq<? super ReferenceT>>> f44604b = new HashMap();

    /* renamed from: a */
    public final boolean mo41735a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        mo39809a(uri.getPath(), acl.m45523a(uri));
        return true;
    }

    /* renamed from: a */
    private final synchronized void mo39809a(String str, Map<String, String> map) {
        if (acd.m45776a(2)) {
            String str2 = "Received GMSG: ";
            String valueOf = String.valueOf(str);
            acd.m45438a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 4 + String.valueOf(str4).length());
                sb.append("  ");
                sb.append(str3);
                sb.append(": ");
                sb.append(str4);
                acd.m45438a(sb.toString());
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f44604b.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ago.f40189a.execute(new C15850lq(this, (C15742hq) it.next(), map));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo41734a(String str, C15742hq<? super ReferenceT> hqVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f44604b.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f44604b.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(hqVar);
    }

    /* renamed from: b */
    public final synchronized void mo41736b(String str, C15742hq<? super ReferenceT> hqVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f44604b.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(hqVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo41733a(String str, C15334q<C15742hq<? super ReferenceT>> qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f44604b.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C15742hq hqVar = (C15742hq) it.next();
                if (qVar.mo38687a(hqVar)) {
                    arrayList.add(hqVar);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    /* renamed from: d */
    public final synchronized void mo41737d() {
        this.f44604b.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo41732a(C15742hq hqVar, Map map) {
        hqVar.mo37744a(this.f44603a, map);
    }
}
