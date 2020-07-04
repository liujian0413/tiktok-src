package com.bytedance.common.p477a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* renamed from: com.bytedance.common.a.c */
final class C9672c {

    /* renamed from: a */
    public ConcurrentMap<String, C9670b> f26390a = new ConcurrentHashMap();

    /* renamed from: b */
    public ConcurrentMap<String, C9670b> f26391b = new ConcurrentHashMap();

    /* renamed from: c */
    public String f26392c;

    /* renamed from: d */
    public int f26393d = -2;

    /* renamed from: e */
    public boolean f26394e;

    /* renamed from: f */
    private ConcurrentSkipListSet<String> f26395f = new ConcurrentSkipListSet<>();

    /* renamed from: g */
    private Context f26396g;

    /* renamed from: h */
    private BroadcastReceiver f26397h = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                int b = C9679i.m28600b(context);
                boolean z = false;
                String str = null;
                if (b == 1) {
                    C9672c.m28571b((Map<String, C9670b>) C9672c.this.f26390a);
                    str = C9679i.m28602c(context);
                    if (str != null && !str.equals(C9672c.this.f26392c)) {
                        C9672c.m28570a((Map<String, C9670b>) C9672c.this.f26391b);
                        C9672c.this.f26391b.clear();
                        C9672c.this.f26392c = str;
                        z = true;
                    }
                    if (!z && C9672c.this.f26393d != b) {
                        C9672c.m28570a((Map<String, C9670b>) C9672c.this.f26391b);
                    }
                }
                StringBuilder sb = new StringBuilder("connectivity change: ");
                sb.append(b);
                sb.append(" clear: ");
                sb.append(z);
                sb.append(", bssid:");
                sb.append(str);
                C9676f.m28592a(sb.toString());
                if (C9679i.m28598a(context)) {
                    C9672c.m28571b((Map<String, C9670b>) C9672c.this.f26391b);
                    if (C9672c.this.f26393d != b) {
                        C9672c.m28570a((Map<String, C9670b>) C9672c.this.f26390a);
                    }
                }
                C9672c.this.f26393d = b;
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo24032a() {
        return this.f26390a.size();
    }

    /* renamed from: c */
    private ConcurrentMap<String, C9670b> m28572c() {
        if (C9679i.m28600b(this.f26396g) == 0) {
            return this.f26390a;
        }
        return this.f26391b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo24035b() {
        m28571b((Map<String, C9670b>) this.f26390a);
        this.f26390a.clear();
        m28571b((Map<String, C9670b>) this.f26391b);
        this.f26391b.clear();
        this.f26395f.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo24036b(String str) {
        return this.f26395f.contains(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo24037c(String str) {
        this.f26395f.add(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo24038d(String str) {
        this.f26395f.remove(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C9670b mo24033a(String str) {
        return (C9670b) m28572c().get(str);
    }

    /* renamed from: a */
    static void m28570a(Map<String, C9670b> map) {
        if (!(map == null || map == null)) {
            try {
                for (Entry entry : map.entrySet()) {
                    C9675e a = C9674d.m28580a();
                    if (a != null) {
                        ((C9670b) entry.getValue()).mo24028a();
                        a.mo24040a((String) entry.getKey());
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    static void m28571b(Map<String, C9670b> map) {
        if (!(map == null || map == null)) {
            try {
                for (Entry entry : map.entrySet()) {
                    if (entry != null) {
                        ((C9670b) entry.getValue()).mo24028a();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24034a(String str, C9670b bVar) {
        try {
            C9670b bVar2 = (C9670b) m28572c().get(str);
            if (bVar2 != null) {
                bVar2.mo24028a();
            }
        } catch (Throwable unused) {
        }
        m28572c().put(str, bVar);
    }

    C9672c(Context context, boolean z) {
        this.f26396g = context;
        this.f26394e = z;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this.f26397h, intentFilter);
    }
}
