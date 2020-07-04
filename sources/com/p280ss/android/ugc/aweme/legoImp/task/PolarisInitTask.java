package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.polaris.depend.C12422c;
import com.bytedance.polaris.depend.C12424e;
import com.bytedance.polaris.depend.C12426g;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.depend.C12431k.C12433a;
import com.bytedance.polaris.depend.C12434l;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.money.growth.C33633c.C33634a;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.C42717b.C42718a;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.PolarisDependImpl.C42712a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PolarisInitTask */
public class PolarisInitTask implements LegoTask {
    private static volatile boolean sIsPolarisInit;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public static boolean isPolarisInit() {
        if (!C12428i.m36148a() || !sIsPolarisInit) {
            return false;
        }
        return true;
    }

    public static synchronized void ensuareInit() {
        synchronized (PolarisInitTask.class) {
            if (!isPolarisInit()) {
                new PolarisInitTask().run(C6399b.m19921a());
            }
        }
    }

    public void run(Context context) {
        if (!isPolarisInit() && C33634a.m108554b().mo86015a()) {
            C12428i.m36146a(new C12433a((Application) C6399b.m19921a()).mo30341a((C12424e) C42712a.m135605a()).mo30340a((C12422c) C42712a.m135605a()).mo30342a((C12426g) C42718a.m135616a()).mo30343a(C12434l.f33001b).mo30344a());
            sIsPolarisInit = true;
        }
    }
}
