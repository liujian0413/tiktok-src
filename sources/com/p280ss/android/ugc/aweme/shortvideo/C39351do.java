package com.p280ss.android.ugc.aweme.shortvideo;

import com.C1642a;
import com.google.common.base.C17454q;
import com.google.common.base.C17463v;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.photo.publish.C34788e;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.utils.C43104eo;
import dmt.p1861av.video.C47440an;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.do */
public final class C39351do {

    /* renamed from: a */
    private double f102225a;

    /* renamed from: b */
    private C17454q f102226b;

    /* renamed from: c */
    private String f102227c;

    /* renamed from: d */
    private String f102228d = "video";

    /* renamed from: e */
    private Object f102229e;

    /* renamed from: f */
    private String f102230f;

    /* renamed from: g */
    private boolean f102231g;

    /* renamed from: a */
    public final void mo97918a() {
        if (this.f102231g) {
            this.f102226b = C17454q.m58005b((C17463v) C43104eo.f111724a);
        }
    }

    /* renamed from: a */
    public final void mo97919a(boolean z) {
        String str;
        if (this.f102226b != null) {
            String a = C1642a.m8035a(Locale.US, "%d", new Object[]{Long.valueOf(this.f102226b.mo44941a(TimeUnit.MILLISECONDS))});
            StringBuilder sb = new StringBuilder();
            sb.append(z ? 1 : 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C36964i.m118929e());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f102225a);
            C22984d a2 = C22984d.m75611a().mo59973a("duration", a).mo59973a("status", sb.toString()).mo59973a("bite_rate", sb2.toString()).mo59973a("fps", sb3.toString()).mo59973a("content_source", this.f102227c).mo59973a("content_type", this.f102228d).mo59973a("shoot_way", this.f102230f);
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f102229e;
            C22984d a3 = a2.mo59973a("creation_id", videoPublishEditModel.creationId).mo59970a("file_bitrate", C47440an.m148111c(videoPublishEditModel.mOutputFile));
            String str2 = "is_download_video";
            if (videoPublishEditModel.isSaveLocal()) {
                str = "1";
            } else {
                str = "0";
            }
            a3.mo59973a(str2, str).mo59973a("filter_id_list", videoPublishEditModel.mCurFilterIds).mo59973a("prop_list", videoPublishEditModel.mStickerID).mo59973a("effect_list", videoPublishEditModel.getEditEffectList()).mo59973a("info_sticker_list", videoPublishEditModel.getInfoStickerList());
            C6907h.m21524a("pre_release_time", (Map) a2.f60753a);
        }
    }

    public C39351do(Object obj, String str, boolean z) {
        this.f102229e = obj;
        this.f102227c = C34788e.m112189a(0, obj);
        this.f102230f = str;
        this.f102225a = (double) ((VideoPublishEditModel) obj).videoFps();
        this.f102231g = z;
    }
}
