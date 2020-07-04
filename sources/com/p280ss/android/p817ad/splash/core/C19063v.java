package com.p280ss.android.p817ad.splash.core;

import com.p280ss.android.p817ad.splash.core.p828c.C19009h;
import com.p280ss.android.p817ad.splash.core.p828c.C19014m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.v */
public class C19063v {

    /* renamed from: j */
    private static volatile C19063v f51507j;

    /* renamed from: k */
    private static volatile boolean f51508k;

    /* renamed from: a */
    public volatile C19014m f51509a;

    /* renamed from: b */
    public volatile int f51510b;

    /* renamed from: c */
    public AtomicInteger f51511c;

    /* renamed from: d */
    public AtomicInteger f51512d;

    /* renamed from: e */
    public int f51513e;

    /* renamed from: f */
    public List<Map<String, String>> f51514f;

    /* renamed from: g */
    public volatile long f51515g;

    /* renamed from: h */
    public boolean f51516h;

    /* renamed from: i */
    public boolean f51517i;

    /* renamed from: l */
    private int f51518l;

    /* renamed from: m */
    private volatile boolean f51519m;

    /* renamed from: g */
    private static boolean m62415g() {
        return f51508k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo50650f() {
        this.f51519m = true;
        this.f51509a = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final List<C19009h> mo50646b() {
        if (!mo50648d()) {
            return null;
        }
        return this.f51509a.f51358a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final LinkedHashMap<Long, String> mo50647c() {
        if (!mo50649e()) {
            return null;
        }
        return this.f51509a.f51359b;
    }

    /* renamed from: a */
    public static C19063v m62414a() {
        if (f51507j == null) {
            synchronized (C19063v.class) {
                if (f51507j == null) {
                    f51507j = new C19063v();
                }
            }
        }
        return f51507j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo50648d() {
        if ((!(!this.f51519m) || !m62415g()) || this.f51509a == null || this.f51509a.f51358a == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo50649e() {
        if ((!(!this.f51519m) || !m62415g()) || this.f51509a == null || this.f51509a.f51359b == null) {
            return false;
        }
        return true;
    }

    private C19063v() {
        this.f51510b = -1;
        this.f51511c = new AtomicInteger();
        this.f51512d = new AtomicInteger();
        this.f51513e = 0;
        this.f51514f = Collections.synchronizedList(new ArrayList());
        this.f51515g = 0;
        this.f51516h = false;
        this.f51517i = false;
        this.f51509a = null;
        this.f51517i = false;
        this.f51518l = 0;
        this.f51516h = false;
        this.f51519m = false;
    }

    /* renamed from: h */
    private void m62416h() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map entrySet : this.f51514f) {
                JSONObject jSONObject3 = new JSONObject();
                for (Entry entry : entrySet.entrySet()) {
                    jSONObject3.putOpt((String) entry.getKey(), entry.getValue());
                }
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("udp_addrs", jSONArray);
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            new StringBuilder("UDPClient. sendStopShowingEvent:\n").append(jSONObject2.toString());
        } catch (JSONException unused) {
            jSONObject2 = null;
        }
        C19025f.m62115a(84378473382L, "splash_ad", "splash_init_monitor_all", jSONObject2);
    }

    /* renamed from: a */
    public final void mo50644a(Long l) {
        this.f51515g = l.longValue();
    }

    /* renamed from: a */
    public final void mo50643a(int i) {
        new StringBuilder("UDPClient. setUDPSwitchResult: ").append(i);
        this.f51510b = i;
    }

    /* renamed from: a */
    public final void mo50645a(AtomicInteger atomicInteger) {
        this.f51512d = atomicInteger;
        if (this.f51513e == atomicInteger.get()) {
            m62416h();
        }
    }
}
