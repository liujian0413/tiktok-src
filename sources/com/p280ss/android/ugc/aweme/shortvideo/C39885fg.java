package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40188c;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40190e;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40190e.C40191a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.EmbaddedWindowInfo;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.tools.C42148ao;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42582r;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fg */
public final class C39885fg implements C40188c, C42161ba {

    /* renamed from: a */
    VideoRecordNewActivity f103631a;

    /* renamed from: b */
    ASCameraView f103632b;

    /* renamed from: c */
    long f103633c;

    public C39885fg(VideoRecordNewActivity videoRecordNewActivity, ASCameraView aSCameraView) {
        this.f103631a = videoRecordNewActivity;
        this.f103632b = aSCameraView;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42148ao.class) {
            return null;
        }
        return new C42159az<T>() {
            /* renamed from: a */
            public final void mo96096a(Object obj, T t) {
                List<EmbaddedWindowInfo> list;
                C39885fg.this.f103633c = System.currentTimeMillis();
                ShortVideoContext shortVideoContext = C39885fg.this.f103631a.f107286a;
                C40191a a = C40190e.m128435f().mo99991a(shortVideoContext.f99775k.mo96314c().getPath()).mo99994b(shortVideoContext.f99775k.mo96315d().getPath()).mo99990a(C39885fg.this.f103632b.getMediaController()).mo99992a(shortVideoContext.f99706K);
                VideoRecordNewActivity videoRecordNewActivity = C39885fg.this.f103631a;
                String path = shortVideoContext.f99775k.mo96314c().getPath();
                Integer valueOf = Integer.valueOf((int) shortVideoContext.f99777m);
                Integer valueOf2 = Integer.valueOf(shortVideoContext.f99773i);
                Integer valueOf3 = Integer.valueOf(shortVideoContext.f99774j);
                if (shortVideoContext.mo96142d()) {
                    list = shortVideoContext.f99707L;
                } else {
                    list = null;
                }
                a.mo99995c(C38566l.m123252a(true, false, (Context) videoRecordNewActivity, path, valueOf, valueOf2, valueOf3, list)).mo99993a((C40188c) C39885fg.this);
            }
        };
    }

    /* renamed from: a */
    public final void mo99305a(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder("MultiEditLog: concat statusCode");
        sb.append(i);
        C41530am.m132280a(sb.toString());
        C42156aw awVar = this.f103631a.f107337w;
        VideoRecordNewActivity videoRecordNewActivity = this.f103631a;
        C42582r rVar = new C42582r(this.f103633c, str, str2, i);
        awVar.mo103594a((Object) videoRecordNewActivity, (C42155av) rVar);
    }
}
