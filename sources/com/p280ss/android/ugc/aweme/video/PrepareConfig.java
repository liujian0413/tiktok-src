package com.p280ss.android.ugc.aweme.video;

import com.p280ss.android.ugc.playerkit.model.C44918b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.PrepareConfig */
public enum PrepareConfig implements C44918b {
    Normal(true, "prepare_time", "first_frame_time"),
    Local(true, "prepare_time", "first_frame_time"),
    Story(false, "story_prepare_time", "story_first_frame_time");
    
    private static Map<String, String> sKeysBitRatedMap;
    String mFirstFrameKey;
    boolean mLoop;
    String mPrepareKey;

    public final boolean isLoop() {
        return this.mLoop;
    }

    public final String getFirstFrameKey() {
        if (VideoBitRateABManager.m22786c().mo19004e()) {
            return (String) sKeysBitRatedMap.get(this.mFirstFrameKey);
        }
        return this.mFirstFrameKey;
    }

    public final String getPrepareKey() {
        if (VideoBitRateABManager.m22786c().mo19004e()) {
            return (String) sKeysBitRatedMap.get(this.mPrepareKey);
        }
        return this.mPrepareKey;
    }

    static {
        HashMap hashMap = new HashMap();
        sKeysBitRatedMap = hashMap;
        hashMap.put("prepare_time", "video_bitrate_prepare_time");
        sKeysBitRatedMap.put("story_prepare_time", "story_video_bitrate_prepare_time");
        sKeysBitRatedMap.put("first_frame_time", "aweme_video_bitrate_first_frame_log");
        sKeysBitRatedMap.put("story_first_frame_time", "story_video_bitrate_first_frame_time");
    }

    private PrepareConfig(boolean z, String str, String str2) {
        this.mLoop = z;
        this.mPrepareKey = str;
        this.mFirstFrameKey = str2;
    }
}
