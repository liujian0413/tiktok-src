package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceOnAttachTask */
public class PreloadInstanceOnAttachTask implements LegoTask {
    private void preloadInstance(Object obj) {
    }

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        C6857a.m21312e().mo16822a("method_init_abtest_keva", false);
        C6857a.m21312e().mo16827b("method_init_abtest_keva", false);
        C6857a.m21312e().mo16822a("method_init_abtest", false);
        preloadInstance(C6903bc.m21494m().mo18803bo());
        C6857a.m21312e().mo16827b("method_init_abtest", false);
        ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getSysRegion();
    }
}
