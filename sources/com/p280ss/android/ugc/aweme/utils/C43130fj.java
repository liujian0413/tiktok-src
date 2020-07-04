package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.ttuploader.TTVideoInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.fj */
public final class C43130fj {
    /* renamed from: a */
    public static final VideoCreation m136813a(TTVideoInfo tTVideoInfo) {
        int i;
        C7573i.m23587b(tTVideoInfo, "info");
        int i2 = 0;
        try {
            JSONObject jSONObject = new JSONObject(tTVideoInfo.mVideoMediaInfo);
            i = jSONObject.getInt("width");
            try {
                i2 = jSONObject.getInt("height");
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            i = 0;
        }
        VideoCreation videoHeight = new VideoCreation().setMaterialId(tTVideoInfo.mVideoId).setCoverUri(tTVideoInfo.mCoverUri).setVideoWidth(i).setVideoHeight(i2);
        C7573i.m23582a((Object) videoHeight, "VideoCreation().setMater…tVideoHeight(videoHeight)");
        return videoHeight;
    }

    /* renamed from: a */
    public static final void m136814a(VideoCreation videoCreation, LinkedHashMap<String, String> linkedHashMap) {
        C7573i.m23587b(videoCreation, "result");
        C7573i.m23587b(linkedHashMap, "fieldmap");
        StringBuilder sb = new StringBuilder();
        sb.append(videoCreation.videoWidth);
        linkedHashMap.put("video_width", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(videoCreation.videoHeight);
        linkedHashMap.put("video_height", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(videoCreation.mCoverUri);
        linkedHashMap.put("video_cover_uri", sb3.toString());
    }
}
