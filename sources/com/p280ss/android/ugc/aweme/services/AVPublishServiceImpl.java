package com.p280ss.android.ugc.aweme.services;

import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVNationalTask;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1656b.p1657a.C42012a;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1656b.p1657a.C42013b;
import com.p280ss.android.ugc.aweme.tools.C42130a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.services.AVPublishServiceImpl */
public class AVPublishServiceImpl implements IAVPublishService {
    public List<AVChallenge> getChallenges() {
        return C39360dw.m125725a().f102247b;
    }

    public int getMusicChooseType() {
        return C39360dw.m125725a().f102250e;
    }

    public String getShootWay() {
        return C39360dw.m125725a().f102249d;
    }

    public boolean needRestore() {
        return C39360dw.m125725a().f102254i;
    }

    public void removeChallenges() {
        C39360dw.m125725a().mo97936f();
    }

    public AVMusic getCurMusic() {
        return C39360dw.m125725a().mo97931b();
    }

    public String getPublishingDraftKey() {
        return C39360dw.m125725a().mo97935e();
    }

    public boolean isPublishFinished() {
        return C39360dw.m125725a().mo97938h();
    }

    public boolean isPublishing() {
        return C39360dw.m125725a().mo97940j();
    }

    public boolean isUnKnown() {
        return C39360dw.m125725a().mo97937g();
    }

    public void cancelRestoreOnMain() {
        C39360dw.m125725a().f102254i = false;
        C39360dw.m125725a();
        C39360dw.m125726a(C38505a.m123085b());
        C38505a.m123073a();
    }

    public void addNationalTask(AVNationalTask aVNationalTask) {
        C39360dw.m125725a().f102248c = aVNationalTask;
    }

    public void setMusicChooseType(int i) {
        C39360dw.m125725a().f102250e = i;
    }

    public void setPublishStatus(int i) {
        C39360dw.m125725a().mo97926a(i);
    }

    public void addChallenge(Challenge challenge) {
        C39360dw.m125725a().mo97927a(C35563c.f93246i.mo103842a(challenge));
    }

    public void setCurMusic(MusicModel musicModel) {
        C39360dw.m125725a().mo97928a(C35563c.f93246i.mo103843a(musicModel));
    }

    public void setFakeMusic(MusicModel musicModel) {
        C39360dw.m125725a().f102246a = C35563c.f93246i.mo103843a(musicModel);
    }

    public C42012a queryKnowFriends(int i, int i2) throws Exception {
        return C42013b.m133557a(i, i2);
    }

    public void tryRestorePublish(FragmentActivity fragmentActivity, C7562b<Boolean, Void> bVar) {
        if (!isPublishing()) {
            if (((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isPublishServiceRunning(fragmentActivity)) {
                C42880h.m136156a("continue publish");
                C41530am.m132285d("PublishServiceImpl continue publish");
                fragmentActivity.bindService(new Intent(fragmentActivity, ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().getShortVideoPublishServiceClass()), C35563c.f93240c.mo83124a(fragmentActivity), 1);
                return;
            }
            C1592h.m7855a(AVPublishServiceImpl$$Lambda$0.$instance, (Executor) C42130a.m134090a()).mo6876a((C1591g<TResult, TContinuationResult>) new AVPublishServiceImpl$$Lambda$1<TResult,TContinuationResult>(bVar), C1592h.f5958b);
        }
    }
}
