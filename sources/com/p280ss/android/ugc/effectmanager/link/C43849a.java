package com.p280ss.android.ugc.effectmanager.link;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import com.p280ss.android.ugc.effectmanager.common.C43743j;
import com.p280ss.android.ugc.effectmanager.common.C43743j.C43744a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43724a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.link.model.blackRoom.BlackRoom;
import com.p280ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration;
import com.p280ss.android.ugc.effectmanager.link.model.host.Host;
import com.p280ss.android.ugc.effectmanager.link.p1738a.p1739a.C43851a;
import com.p280ss.android.ugc.effectmanager.link.p1738a.p1740b.C43853a;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.link.a */
public final class C43849a implements C43744a {

    /* renamed from: a */
    public List<Host> f113602a = new ArrayList();

    /* renamed from: b */
    public int f113603b;

    /* renamed from: c */
    public int f113604c;

    /* renamed from: d */
    public boolean f113605d;

    /* renamed from: e */
    public Context f113606e;

    /* renamed from: f */
    public String f113607f;

    /* renamed from: g */
    public List<Host> f113608g = new ArrayList();

    /* renamed from: h */
    public String f113609h;

    /* renamed from: i */
    public boolean f113610i;

    /* renamed from: j */
    private BlackRoom f113611j;

    /* renamed from: k */
    private C43680a f113612k;

    /* renamed from: l */
    private Handler f113613l = new C43743j(this);

    /* renamed from: m */
    private C43850a f113614m;

    /* renamed from: n */
    private volatile boolean f113615n = false;

    /* renamed from: o */
    private boolean f113616o;

    /* renamed from: com.ss.android.ugc.effectmanager.link.a$a */
    class C43850a extends BroadcastReceiver {
        C43850a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (C43849a.this.f113605d) {
                if (!C43849a.this.f113602a.isEmpty() || !C43849a.this.f113610i) {
                    try {
                        C43849a.this.mo106070b();
                    } catch (NullPointerException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private boolean m138901e() {
        if (!this.f113605d || this.f113608g.size() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo106072d() {
        if (this.f113614m != null && this.f113606e != null) {
            this.f113606e.unregisterReceiver(this.f113614m);
        }
    }

    /* renamed from: c */
    public final boolean mo106071c() {
        if (this.f113606e == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f113606e.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: f */
    private void m138902f() {
        if (this.f113616o && this.f113614m == null && m138901e()) {
            this.f113614m = new C43850a();
            this.f113606e.registerReceiver(this.f113614m, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: b */
    public final void mo106070b() {
        if (m138901e() && !this.f113615n && mo106071c()) {
            this.f113612k.f113068a.f113527r.mo105782a((C43724a) new C43853a(this, this.f113613l, "SpeedMeasure"));
            this.f113615n = true;
        }
    }

    /* renamed from: a */
    public final void mo106067a() {
        if (!m138901e()) {
            this.f113609h = ((Host) this.f113608g.get(0)).getItemName();
            return;
        }
        Host host = null;
        int i = 0;
        while (true) {
            if (i >= this.f113602a.size()) {
                break;
            }
            Host host2 = (Host) this.f113602a.get(i);
            if (this.f113611j.checkHostAvailable(host2)) {
                host = host2;
                break;
            }
            i++;
        }
        if (host == null) {
            host = (Host) this.f113608g.get(0);
            mo106070b();
        }
        this.f113609h = host.getItemName();
    }

    /* renamed from: a */
    public final void mo106069a(String str) {
        if (mo106071c()) {
            new StringBuilder("on link api error:").append(str);
            m138900b(str);
        }
    }

    public C43849a(C43680a aVar) {
        this.f113602a.clear();
        this.f113611j = new BlackRoom();
        this.f113612k = aVar;
        this.f113614m = null;
    }

    /* renamed from: a */
    public final void mo106068a(LinkSelectorConfiguration linkSelectorConfiguration) {
        this.f113603b = linkSelectorConfiguration.mSpeedTimeOut;
        this.f113604c = linkSelectorConfiguration.mRepeatTime;
        this.f113605d = linkSelectorConfiguration.mEnableLinkSelector;
        this.f113606e = linkSelectorConfiguration.mContext;
        this.f113607f = linkSelectorConfiguration.mSpeedApi;
        this.f113608g.clear();
        this.f113608g.addAll(linkSelectorConfiguration.mOriginHosts);
        this.f113609h = ((Host) this.f113608g.get(0)).getItemName();
        this.f113616o = linkSelectorConfiguration.mIsNetworkChangeMonitor;
        this.f113610i = linkSelectorConfiguration.mIsLazy;
        m138902f();
    }

    /* renamed from: b */
    private void m138900b(String str) {
        try {
            URI uri = new URL(str.replace(" ", "%20")).toURI();
            Host host = new Host(uri.getHost(), uri.getScheme());
            for (Host host2 : this.f113602a) {
                if (host.hostEquals(host2)) {
                    this.f113611j.lock(host2);
                    mo106067a();
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo105789a(Message message) {
        if (message.what == 31 && (message.obj instanceof C43851a)) {
            C43851a aVar = (C43851a) message.obj;
            C43726c cVar = aVar.f113619c;
            List<Host> list = aVar.f113618b;
            if (cVar == null) {
                StringBuilder sb = new StringBuilder("on sort done = ");
                sb.append(list.size());
                sb.append(" selector:");
                sb.append(this);
                sb.append(" thread:");
                sb.append(Thread.currentThread());
                this.f113602a.clear();
                this.f113602a.addAll(list);
                mo106067a();
            }
            this.f113615n = false;
        }
    }
}
