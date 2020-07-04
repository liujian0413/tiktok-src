package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.analysis.C22500a;
import com.p280ss.android.ugc.aweme.app.p1033e.C22970a;
import com.p280ss.android.ugc.aweme.common.p1146g.C25686b;
import com.p280ss.android.ugc.aweme.experiment.EnableALogExperiment;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6923c;
import com.p280ss.android.ugc.aweme.i18n.C30490m;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.FabricInitTask */
public class FabricInitTask implements LegoTask {
    private static final AtomicBoolean FABRIC_INITED = new AtomicBoolean(false);

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public static void maybeFabricInit() {
        if (!FABRIC_INITED.get()) {
            synchronized (FABRIC_INITED) {
                new FabricInitTask().run(C6399b.m19921a());
            }
        }
    }

    public void run(Context context) {
        if (FABRIC_INITED.compareAndSet(false, true) && C25686b.m84432a()) {
            initCrashlyticsWrapper(context);
        }
    }

    private void initCrashlyticsWrapper(Context context) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C22500a(C6384b.m19835a().mo15292a(EnableALogExperiment.class, true, "enable_alog", C6384b.m19835a().mo15295d().enable_alog, true)));
            C6921a.m21553a(context.getApplicationContext(), (List<C6923c>) arrayList);
        } catch (Throwable unused) {
        }
        C6726a.m20844b(C32400e.f84518a);
        C30490m.m99588a();
        new C22970a().run();
    }
}
