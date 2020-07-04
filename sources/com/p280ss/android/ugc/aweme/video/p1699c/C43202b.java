package com.p280ss.android.ugc.aweme.video.p1699c;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44950d;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44951e;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g.C44955a;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.video.c.b */
public final class C43202b implements C44953g {

    /* renamed from: a */
    public static final C43202b f111848a = new C43202b();

    /* renamed from: c */
    private static final HashSet<String> f111849c = new HashSet<>();

    private C43202b() {
    }

    /* renamed from: b */
    private static void m136989b(String str) {
        f111849c.add(str);
    }

    /* renamed from: a */
    public final C44951e mo104868a(C44955a aVar) {
        C44950d a = aVar.mo107470a();
        if (a != null) {
            VideoUrlModel videoUrlModel = a.f115620a;
            if (videoUrlModel != null) {
                if (f111849c.contains(videoUrlModel.getSourceId())) {
                    return new C44951e(videoUrlModel.getUri());
                }
                C44951e a2 = aVar.mo107471a(a);
                if (a2 == null) {
                    C7573i.m23580a();
                }
                return a2;
            }
        }
        C44951e a3 = aVar.mo107471a(a);
        if (a3 == null) {
            C7573i.m23580a();
        }
        return a3;
    }

    /* renamed from: a */
    public final Aweme mo104869a(String str) {
        C7573i.m23587b(str, "localVideoPath");
        Aweme aweme = new Aweme();
        Video video = new Video();
        LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
        localVideoUrlModel.setSourceId(str);
        localVideoUrlModel.setUri(str);
        localVideoUrlModel.setUrlList(new ArrayList());
        localVideoUrlModel.getUrlList().add(localVideoUrlModel.getUri());
        localVideoUrlModel.setUrlKey(str);
        video.setPlayAddr(localVideoUrlModel);
        video.setPlayAddrH265(video.getPlayAddr());
        aweme.setVideo(video);
        aweme.setAid(str);
        m136989b(str);
        return aweme;
    }
}
