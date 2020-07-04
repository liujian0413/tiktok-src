package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BitRate;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44863c;

/* renamed from: com.ss.android.ugc.aweme.feed.j.d */
public final class C28481d {
    /* renamed from: a */
    public static int m93601a(Aweme aweme) {
        int i = 0;
        if (aweme == null || aweme.getVideo() == null) {
            return 0;
        }
        try {
            int b = m93603b(aweme.getVideo().getPlayAddr());
            if (b != -1) {
                i = b;
            }
        } catch (Exception unused) {
        }
        return i;
    }

    /* renamed from: b */
    public static int m93603b(VideoUrlModel videoUrlModel) {
        Integer num;
        if (videoUrlModel == null) {
            return -1;
        }
        C44863c hitBitrate = videoUrlModel.getHitBitrate();
        if (hitBitrate == null) {
            num = null;
        } else {
            num = Integer.valueOf(hitBitrate.getQualityType());
        }
        if (num == null) {
            num = Integer.valueOf(-1);
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static Integer m93602a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null && videoUrlModel.getHitBitrate() != null) {
            return Integer.valueOf(videoUrlModel.getHitBitrate().getBitRate());
        }
        if (videoUrlModel == null || videoUrlModel.getBitRate() == null || videoUrlModel.getBitRate().size() <= 0) {
            return null;
        }
        return Integer.valueOf(((BitRate) videoUrlModel.getBitRate().get(0)).getBitRate());
    }
}
