package com.p280ss.android.ugc.aweme.services.video;

import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVNationalTask;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1656b.p1657a.C42012a;
import java.util.List;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.services.video.IAVPublishService */
public interface IAVPublishService {
    void addChallenge(Challenge challenge);

    void addNationalTask(AVNationalTask aVNationalTask);

    void cancelRestoreOnMain();

    List<AVChallenge> getChallenges();

    AVMusic getCurMusic();

    int getMusicChooseType();

    String getPublishingDraftKey();

    String getShootWay();

    boolean isPublishFinished();

    boolean isPublishing();

    boolean isUnKnown();

    boolean needRestore();

    C42012a queryKnowFriends(int i, int i2) throws Exception;

    void removeChallenges();

    void setCurMusic(MusicModel musicModel);

    void setFakeMusic(MusicModel musicModel);

    void setMusicChooseType(int i);

    void setPublishStatus(int i);

    void tryRestorePublish(FragmentActivity fragmentActivity, C7562b<Boolean, Void> bVar);
}
