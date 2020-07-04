package com.p280ss.android.ugc.aweme.shortvideo;

import com.C1642a;
import com.google.common.base.C17454q;
import com.google.common.base.C17463v;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.beauty.C23531b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.photo.publish.C34788e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.upload.p1621b.C41444c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C43104eo;
import com.p280ss.android.ugc.aweme.video.C7276d;
import dmt.p1861av.video.C47440an;
import dmt.p1861av.video.C47468m;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gj */
public final class C39963gj {

    /* renamed from: a */
    public long f103793a;

    /* renamed from: b */
    private double f103794b;

    /* renamed from: c */
    private C17454q f103795c;

    /* renamed from: d */
    private C39825f f103796d;

    /* renamed from: e */
    private String f103797e;

    /* renamed from: f */
    private int f103798f;

    /* renamed from: g */
    private String f103799g;

    /* renamed from: h */
    private String f103800h = C34788e.m112190b(this.f103798f);

    /* renamed from: i */
    private Object f103801i;

    /* renamed from: j */
    private C41444c f103802j;

    /* renamed from: a */
    public final void mo99398a(boolean z) {
        String str;
        String str2;
        this.f103795c = C17454q.m58005b((C17463v) C43104eo.f111724a);
        String str3 = "video_publish_start";
        C22984d a = C22984d.m75611a().mo59973a("resolution", this.f103797e);
        String str4 = "is_hardcode";
        if (C36964i.m118920a()) {
            str = "1";
        } else {
            str = "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C36964i.m118929e());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C36964i.m118931g());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f103794b);
        C22984d a2 = a.mo59973a(str4, str).mo59973a("bite_rate", sb.toString()).mo59973a("video_quality", sb2.toString()).mo59973a("_perf_monitor", "1").mo59973a("fps", sb3.toString());
        String str5 = "is_click_publish";
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C6907h.m21524a(str3, (Map) a2.mo59973a(str5, str2).f60753a);
    }

    public C39963gj(Object obj, C39825f fVar, int i, C41444c cVar) {
        this.f103796d = fVar;
        this.f103798f = i;
        this.f103801i = obj;
        this.f103802j = cVar;
        this.f103799g = C34788e.m112189a(this.f103798f, obj);
        if (this.f103798f == 0) {
            this.f103794b = (double) ((VideoPublishEditModel) obj).videoFps();
        }
        if ("upload".equals(this.f103799g)) {
            this.f103797e = C36964i.m118933i();
        } else {
            this.f103797e = C36964i.m118932h();
        }
    }

    /* renamed from: a */
    public final void mo99399a(boolean z, String str, String str2, boolean z2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (this.f103795c.f48412a) {
            this.f103795c.mo44943d();
        }
        this.f103793a = this.f103795c.mo44941a(TimeUnit.MILLISECONDS);
        String a = C1642a.m8035a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) ((this.f103796d.mo88207b(this.f103801i) * 1000) / this.f103793a)) / 1024.0f)});
        String a2 = C1642a.m8035a(Locale.US, "%d", new Object[]{Long.valueOf(this.f103793a)});
        StringBuilder sb = new StringBuilder();
        sb.append(z ? 1 : 0);
        C22984d a3 = C22984d.m75611a().mo59973a("duration", a2).mo59973a("status", sb.toString()).mo59973a("fail_info", str).mo59973a("resolution", this.f103797e);
        String str9 = "record_code_type";
        if (C36964i.m118920a()) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        C22984d a4 = a3.mo59973a(str9, str3);
        String str10 = "compose_code_type";
        if (C36964i.m118926b()) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C36964i.m118929e());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C36964i.m118931g());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f103794b);
        C22984d a5 = a4.mo59973a(str10, str4).mo59973a("bite_rate", sb2.toString()).mo59973a("video_quality", sb3.toString()).mo59973a("upload_speed", a).mo59973a("_perf_monitor", "1").mo59973a("fps", sb4.toString()).mo59973a("content_source", this.f103799g).mo59973a("content_type", this.f103800h);
        if (!z) {
            a5.mo59973a("error_code", str2);
        }
        if (C34788e.m112191c(this.f103798f)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f103801i;
            int c = C47440an.m148111c(videoPublishEditModel.mOutputFile);
            float b = (float) C47440an.m148110b(videoPublishEditModel.mOutputFile);
            String str11 = null;
            if (C7276d.m22812b(videoPublishEditModel.mOutputFile)) {
                str11 = C1642a.m8035a(Locale.US, "%d", new Object[]{Long.valueOf(new File(videoPublishEditModel.mOutputFile).length() / 1024)});
            }
            C22984d a6 = a5.mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("filter_id_list", videoPublishEditModel.mCurFilterIds).mo59973a("prop_list", videoPublishEditModel.mStickerID);
            String str12 = "is_click_publish";
            if (z2) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            C22984d a7 = a6.mo59973a(str12, str5).mo59973a("effect_list", videoPublishEditModel.getEditEffectList()).mo59973a("info_sticker_list", videoPublishEditModel.getInfoStickerList());
            String str13 = "video_edit_page_filter";
            if (videoPublishEditModel.mSelectedId == 0) {
                str6 = "0";
            } else {
                str6 = "1";
            }
            C22984d a8 = a7.mo59973a(str13, str6).mo59970a("file_bitrate", c);
            String str14 = "compose_coding";
            if (videoPublishEditModel.isSyntheticHardEncode) {
                str7 = "hardcoding";
            } else {
                str7 = "softcoding";
            }
            C22984d a9 = a8.mo59973a(str14, str7);
            String str15 = "is_reencode";
            if (C47468m.m148190b(videoPublishEditModel)) {
                str8 = "1";
            } else {
                str8 = "0";
            }
            a9.mo59973a(str15, str8).mo59973a("file_size", str11).mo59972a("beautify_used", (Object) Boolean.valueOf(videoPublishEditModel.faceBeautyOpen)).mo59973a("beautify_info", C35574k.m114859a().mo70085S().mo15979b((Object) C23531b.m77285a())).mo59972a("file_fps", (Object) Float.valueOf(b));
            if (this.f103802j != null) {
                a5.mo59971a("synthetic_dur_ms", this.f103802j.mo102097a()).mo59971a("upload_wait_time_ms", this.f103802j.mo102098b());
            }
        }
        C6907h.m21524a("video_publish_end", (Map) a5.f60753a);
        StringBuilder sb5 = new StringBuilder("PublishDurationMonitor VideoUploadDurationInMs: ");
        sb5.append(this.f103793a);
        C41530am.m132285d(sb5.toString());
    }
}
