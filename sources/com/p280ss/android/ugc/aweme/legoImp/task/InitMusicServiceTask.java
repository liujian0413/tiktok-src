package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.experiment.UseDownloaderInMusic;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitMusicServiceTask */
public final class InitMusicServiceTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    private final int getStrategy() {
        if (C6903bc.m21491j().mo59910b()) {
            return 3;
        }
        return 2;
    }

    private final void initMusicDownloadStrategy() {
        int i = 1;
        if (C6399b.m19945u()) {
            if (C6384b.m19835a().mo15292a(UseDownloaderInMusic.class, true, "use_download_in_music", C6384b.m19835a().mo15295d().use_download_in_music, false)) {
                i = getStrategy();
            }
        } else if (C6399b.m19946v()) {
            if (C6384b.m19835a().mo15292a(UseDownloaderInMusic.class, true, "use_download_in_music", C6384b.m19835a().mo15295d().use_download_in_music, false)) {
                C6903bc.m21491j();
                i = getStrategy();
            }
        } else if (C6399b.m19947w()) {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Integer musicDownloadUseTtnet = a.getMusicDownloadUseTtnet();
            if (musicDownloadUseTtnet != null && musicDownloadUseTtnet.intValue() == 1) {
                C6903bc.m21491j();
                i = getStrategy();
            }
        }
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).initMusicDownloadStrategy(i);
    }

    public final void run(Context context) {
        C7573i.m23587b(context, "context");
        ((IMusicService) ServiceManager.get().getService(IMusicService.class)).initService();
        initMusicDownloadStrategy();
    }
}
