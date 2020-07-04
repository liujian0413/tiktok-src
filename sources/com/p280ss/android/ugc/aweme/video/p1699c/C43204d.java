package com.p280ss.android.ugc.aweme.video.p1699c;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LongVideo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44950d;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44951e;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g.C44955a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.c.d */
public final class C43204d implements C44953g {
    /* renamed from: a */
    public final C44951e mo104868a(C44955a aVar) {
        C44950d a = aVar.mo107470a();
        VideoUrlModel videoUrlModel = a.f115620a;
        if (m136993a(videoUrlModel.getSourceId(), videoUrlModel.getDuration())) {
            return aVar.mo107471a(a);
        }
        String a2 = C24671f.m80857g().mo65548a(videoUrlModel.getSourceId());
        if (!TextUtils.isEmpty(a2)) {
            return new C44951e(a2);
        }
        String a3 = C24671f.m80858h().mo65576a(videoUrlModel.getSourceId());
        if (!TextUtils.isEmpty(a3)) {
            return new C44951e(a3);
        }
        return aVar.mo107471a(a);
    }

    /* renamed from: a */
    private static boolean m136993a(String str, double d) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
        if (awemeById == null) {
            return false;
        }
        List<LongVideo> longVideos = awemeById.getLongVideos();
        if (longVideos == null || longVideos.isEmpty()) {
            return false;
        }
        for (LongVideo longVideo : longVideos) {
            if (longVideo != null) {
                Video video = longVideo.getVideo();
                if (video != null && ((double) video.getDuration()) == d) {
                    return true;
                }
            }
        }
        return false;
    }
}
