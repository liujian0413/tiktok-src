package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Looper;
import android.support.p022v4.view.C0961c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.notice.api.C34295a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a;
import com.p280ss.android.ugc.aweme.wiki.AddWikiActivity;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.OptFirstFrameTask */
public class OptFirstFrameTask implements LegoTask {
    public static boolean enableFirstFrameOpt = true;

    private void preloadInstance(Object obj) {
    }

    public ProcessType process() {
        return ProcessType.MAIN;
    }

    public WorkType type() {
        return WorkType.BACKGROUND;
    }

    public void run(Context context) {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        new AddWikiActivity();
        new C0961c(context);
        if (!C6399b.m19944t()) {
            C7167b.m22380b().mo18647a();
        }
        preloadInstance(C37703a.f98219b);
        C25789b.m84762i();
        ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enablePreUploadByUser();
        C34295a.m110941a();
    }
}
