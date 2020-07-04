package com.p280ss.android.ugc.aweme.video;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ttnet.p670a.C12925a;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.playerkit.model.C44917a;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import com.p280ss.android.ugc.playerkit.videoview.C44943c;
import java.net.URI;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.p */
public final class C43269p {
    /* renamed from: a */
    public static VideoUrlModel m137254a(Video video) {
        return m137255a(video, C44917a.m141692r().mo105098a());
    }

    /* renamed from: a */
    public static boolean m137257a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return false;
        }
        List<String> urlList = videoUrlModel.getUrlList();
        if (urlList == null || urlList.size() <= 0) {
            return false;
        }
        for (String a : urlList) {
            if (!m137256a(C6399b.m19921a(), a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static VideoUrlModel m137255a(Video video, Type type) {
        if (video == null) {
            return null;
        }
        if (!C43268o.m137250H()) {
            if (C44943c.m141815a(video, type)) {
                return video.getPlayAddrH265();
            }
            return video.getPlayAddrH264();
        } else if (C44943c.m141815a(video, type)) {
            return video.getPlayAddrH265();
        } else {
            return video.getPlayAddrH264();
        }
    }

    /* renamed from: a */
    private static boolean m137256a(Context context, String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("https://")) {
            return false;
        }
        try {
            if (C12925a.m37625a(context).mo24814d(URI.create(str).getHost()) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
