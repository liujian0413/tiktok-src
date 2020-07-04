package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice */
public class MusNotice extends BaseNotice {
    @C6593c(mo15949a = "check_profile")
    private CheckProfileNotice checkProfileNotice;
    @C6593c(mo15949a = "follow_request_approve")
    private FollowApproveNotice followApproveNotice;
    @C6593c(mo15949a = "follow_request")
    private FollowRequestNotice followRequestNotice;
    @C6593c(mo15949a = "live")
    private LiveNotice liveNotice;
    @C6593c(mo15949a = "create_aweme")
    private PostNotice postNotice;
    private C34362j recommendAvatars;
    private TutorialVideoResp tutorialVideo;

    public MusNotice() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final CheckProfileNotice getCheckProfileNotice() {
        return this.checkProfileNotice;
    }

    public final FollowApproveNotice getFollowApproveNotice() {
        return this.followApproveNotice;
    }

    public final FollowRequestNotice getFollowRequestNotice() {
        return this.followRequestNotice;
    }

    public final LiveNotice getLiveNotice() {
        return this.liveNotice;
    }

    public final PostNotice getPostNotice() {
        return this.postNotice;
    }

    public final C34362j getRecommendAvatars() {
        return this.recommendAvatars;
    }

    public final TutorialVideoResp getTutorialVideo() {
        return this.tutorialVideo;
    }

    public final void setCheckProfileNotice(CheckProfileNotice checkProfileNotice2) {
        this.checkProfileNotice = checkProfileNotice2;
    }

    public final void setFollowApproveNotice(FollowApproveNotice followApproveNotice2) {
        this.followApproveNotice = followApproveNotice2;
    }

    public final void setFollowRequestNotice(FollowRequestNotice followRequestNotice2) {
        this.followRequestNotice = followRequestNotice2;
    }

    public final void setLiveNotice(LiveNotice liveNotice2) {
        this.liveNotice = liveNotice2;
    }

    public final void setPostNotice(PostNotice postNotice2) {
        this.postNotice = postNotice2;
    }

    public final void setRecommendAvatars(C34362j jVar) {
        this.recommendAvatars = jVar;
    }

    public final void setTutorialVideo(TutorialVideoResp tutorialVideoResp) {
        this.tutorialVideo = tutorialVideoResp;
    }

    public MusNotice(PostNotice postNotice2, LiveNotice liveNotice2, CheckProfileNotice checkProfileNotice2, FollowRequestNotice followRequestNotice2, FollowApproveNotice followApproveNotice2, C34362j jVar, TutorialVideoResp tutorialVideoResp) {
        this.postNotice = postNotice2;
        this.liveNotice = liveNotice2;
        this.checkProfileNotice = checkProfileNotice2;
        this.followRequestNotice = followRequestNotice2;
        this.followApproveNotice = followApproveNotice2;
        this.recommendAvatars = jVar;
        this.tutorialVideo = tutorialVideoResp;
    }

    public /* synthetic */ MusNotice(PostNotice postNotice2, LiveNotice liveNotice2, CheckProfileNotice checkProfileNotice2, FollowRequestNotice followRequestNotice2, FollowApproveNotice followApproveNotice2, C34362j jVar, TutorialVideoResp tutorialVideoResp, int i, C7571f fVar) {
        PostNotice postNotice3;
        LiveNotice liveNotice3;
        CheckProfileNotice checkProfileNotice3;
        FollowRequestNotice followRequestNotice3;
        FollowApproveNotice followApproveNotice3;
        C34362j jVar2;
        TutorialVideoResp tutorialVideoResp2;
        if ((i & 1) != 0) {
            postNotice3 = null;
        } else {
            postNotice3 = postNotice2;
        }
        if ((i & 2) != 0) {
            liveNotice3 = null;
        } else {
            liveNotice3 = liveNotice2;
        }
        if ((i & 4) != 0) {
            checkProfileNotice3 = null;
        } else {
            checkProfileNotice3 = checkProfileNotice2;
        }
        if ((i & 8) != 0) {
            followRequestNotice3 = null;
        } else {
            followRequestNotice3 = followRequestNotice2;
        }
        if ((i & 16) != 0) {
            followApproveNotice3 = null;
        } else {
            followApproveNotice3 = followApproveNotice2;
        }
        if ((i & 32) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((i & 64) != 0) {
            tutorialVideoResp2 = null;
        } else {
            tutorialVideoResp2 = tutorialVideoResp;
        }
        this(postNotice3, liveNotice3, checkProfileNotice3, followRequestNotice3, followApproveNotice3, jVar2, tutorialVideoResp2);
    }
}
