package com.p280ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import bolts.C1592h;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.live.p1363c.C32474d;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.video.C43310q;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver */
public class NetWorkStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private NetworkType f67651a = NetworkType.UNKNOWN;

    /* renamed from: b */
    private static void m84463b() {
        C43310q.m137424b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo66602a() throws Exception {
        C6900g.m21454b().mo16941a(((ConnectivityManager) AwemeApplication.m21341a().getSystemService("connectivity")).getActiveNetworkInfo());
        NetworkType a = C6900g.m21454b().mo15136a();
        if (a != this.f67651a) {
            m84463b();
        }
        this.f67651a = a;
        if (!C6399b.m19944t()) {
            ServiceManager.get().getService(IPluginService.class);
        }
        C32474d.f84720a = true;
        return null;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                C1592h.m7855a((Callable<TResult>) new C25707b<TResult>(this), (Executor) C7258h.m22730c()).mo6876a(C25708c.f67653a, C1592h.f5958b);
            } catch (Exception unused) {
            }
        }
    }
}
