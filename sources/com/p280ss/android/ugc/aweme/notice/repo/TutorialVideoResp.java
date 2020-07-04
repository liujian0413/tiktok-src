package com.p280ss.android.ugc.aweme.notice.repo;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp */
public final class TutorialVideoResp extends BaseResponse {
    @C6593c(mo15949a = "unread_count")
    private final int count;
    @C6593c(mo15949a = "tutorial_video_info")
    private final TutorialVideoInfo info;

    public static /* synthetic */ TutorialVideoResp copy$default(TutorialVideoResp tutorialVideoResp, TutorialVideoInfo tutorialVideoInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tutorialVideoInfo = tutorialVideoResp.info;
        }
        if ((i2 & 2) != 0) {
            i = tutorialVideoResp.count;
        }
        return tutorialVideoResp.copy(tutorialVideoInfo, i);
    }

    public final TutorialVideoInfo component1() {
        return this.info;
    }

    public final int component2() {
        return this.count;
    }

    public final TutorialVideoResp copy(TutorialVideoInfo tutorialVideoInfo, int i) {
        C7573i.m23587b(tutorialVideoInfo, "info");
        return new TutorialVideoResp(tutorialVideoInfo, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TutorialVideoResp) {
                TutorialVideoResp tutorialVideoResp = (TutorialVideoResp) obj;
                if (C7573i.m23585a((Object) this.info, (Object) tutorialVideoResp.info)) {
                    if (this.count == tutorialVideoResp.count) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getCount() {
        return this.count;
    }

    public final TutorialVideoInfo getInfo() {
        return this.info;
    }

    public final int hashCode() {
        TutorialVideoInfo tutorialVideoInfo = this.info;
        return ((tutorialVideoInfo != null ? tutorialVideoInfo.hashCode() : 0) * 31) + this.count;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TutorialVideoResp(info=");
        sb.append(this.info);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(")");
        return sb.toString();
    }

    public TutorialVideoResp(TutorialVideoInfo tutorialVideoInfo, int i) {
        C7573i.m23587b(tutorialVideoInfo, "info");
        this.info = tutorialVideoInfo;
        this.count = i;
    }
}
