package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.android.livesdkapi.service.C9515c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.live.C32430a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitLiveServiceTask */
public class InitLiveServiceTask implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public InitLiveServiceTask() {
        ServiceManager.get().bind(C9515c.class, new ServiceProvider<C9515c>() {
            public final /* synthetic */ Object get() {
                return m104933a();
            }

            /* renamed from: a */
            private static C9515c m104933a() {
                return new C32412q(C32430a.m105068e());
            }
        });
    }

    public void run(Context context) {
        try {
            C32430a.m105067d();
        } catch (Exception unused) {
        }
    }
}
