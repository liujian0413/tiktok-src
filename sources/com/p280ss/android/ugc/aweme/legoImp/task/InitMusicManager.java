package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p280ss.android.ugc.p1716b.C43659c;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitMusicManager */
public class InitMusicManager implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    static final /* synthetic */ String lambda$run$0$InitMusicManager(IShortVideoConfig iShortVideoConfig) {
        StringBuilder sb = new StringBuilder();
        sb.append(iShortVideoConfig.musicDir());
        sb.append("cache/");
        return sb.toString();
    }

    static final /* synthetic */ String lambda$run$1$InitMusicManager(IShortVideoConfig iShortVideoConfig) {
        StringBuilder sb = new StringBuilder();
        sb.append(iShortVideoConfig.musicDir());
        sb.append("download/");
        return sb.toString();
    }

    public void run(Context context) {
        IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
        C43659c.m138324a().mo105613a(context, new C32406k(shortVideoConfig), new C32407l(shortVideoConfig));
        C43659c.m138324a().mo105611a(false);
    }
}
