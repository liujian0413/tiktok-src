package com.p280ss.android.ugc.aweme.shortvideo.p1582m;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.p022v4.p027os.C0879b;
import android.util.Log;
import com.C1642a;
import com.facebook.common.internal.C13315l;
import com.google.common.base.C17454q;
import com.google.common.base.C17463v;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.google.common.util.concurrent.C18254m;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.funnel.Funnel;
import com.p280ss.android.ugc.aweme.beauty.C23531b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.funnel.C30186a;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photo.publish.C34788e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C38438af;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.C38550bx;
import com.p280ss.android.ugc.aweme.shortvideo.C39358du;
import com.p280ss.android.ugc.aweme.shortvideo.C39359dv;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39362dy;
import com.p280ss.android.ugc.aweme.shortvideo.C39825f;
import com.p280ss.android.ugc.aweme.shortvideo.C39963gj;
import com.p280ss.android.ugc.aweme.shortvideo.C40023l;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseException;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p280ss.android.ugc.aweme.shortvideo.VideoPublishException;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41463q;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41464r.C41465a;
import com.p280ss.android.ugc.aweme.shortvideo.upload.PublishCallbacks;
import com.p280ss.android.ugc.aweme.shortvideo.upload.p1621b.C41444c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41514ab;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import com.p280ss.android.ugc.aweme.utils.C43104eo;
import com.p280ss.android.ugc.aweme.video.C7276d;
import dmt.p1861av.video.C47440an;
import dmt.p1861av.video.C47464k;
import dmt.p1861av.video.C47468m;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.m.b */
public final class C40055b implements C40054a {

    /* renamed from: A */
    private String f104014A;

    /* renamed from: B */
    private ExecutorService f104015B;

    /* renamed from: C */
    private String f104016C;

    /* renamed from: a */
    public PublishCallbacks f104017a;

    /* renamed from: b */
    public final C39825f f104018b;

    /* renamed from: c */
    public SynthetiseResult f104019c;

    /* renamed from: d */
    public C0879b f104020d;

    /* renamed from: e */
    public final C40066d f104021e = new C40066d();

    /* renamed from: f */
    public final C40065c f104022f;

    /* renamed from: g */
    public final C39362dy f104023g;

    /* renamed from: h */
    public boolean f104024h = false;

    /* renamed from: i */
    public long f104025i = 0;

    /* renamed from: j */
    public long f104026j = 0;

    /* renamed from: k */
    public long f104027k = 0;

    /* renamed from: l */
    public long f104028l = 0;

    /* renamed from: m */
    public long f104029m = 0;

    /* renamed from: n */
    public boolean f104030n;

    /* renamed from: o */
    public boolean f104031o;

    /* renamed from: p */
    public C39963gj f104032p;

    /* renamed from: q */
    private String f104033q;

    /* renamed from: r */
    private int f104034r;

    /* renamed from: s */
    private int f104035s;

    /* renamed from: t */
    private C39358du f104036t = new C39358du();

    /* renamed from: u */
    private C39359dv<SynthetiseResult> f104037u;

    /* renamed from: v */
    private C39359dv<VideoCreation> f104038v;

    /* renamed from: w */
    private C18253l<VideoCreation> f104039w;

    /* renamed from: x */
    private long f104040x = 0;

    /* renamed from: y */
    private double f104041y;

    /* renamed from: z */
    private String f104042z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.m.b$a */
    static class C40063a {

        /* renamed from: a */
        C17454q f104063a;

        C40063a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo99512a() {
            this.f104063a = C17454q.m58005b((C17463v) C43104eo.f111724a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo99513b() {
            if (this.f104063a.f48412a) {
                this.f104063a.mo44943d();
                C6907h.m21524a("url_upload", (Map) C22984d.m75611a().mo59973a("duration", C1642a.m8035a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) this.f104063a.mo44941a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f60753a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.m.b$b */
    static class C40064b {

        /* renamed from: a */
        C17454q f104064a;

        C40064b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo99514a() {
            this.f104064a = C17454q.m58005b((C17463v) C43104eo.f111724a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo99515b() {
            if (this.f104064a.f48412a) {
                this.f104064a.mo44943d();
                C6907h.m21524a("get_video_key", (Map) C22984d.m75611a().mo59973a("duration", C1642a.m8035a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) this.f104064a.mo44941a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f60753a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.m.b$c */
    class C40065c {

        /* renamed from: a */
        C39825f f104065a;

        /* renamed from: b */
        int f104066b;

        /* renamed from: c */
        String f104067c;

        /* renamed from: d */
        int f104068d;

        /* renamed from: e */
        C17454q f104069e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo99517a(boolean z) {
            C41530am.m132280a("PublishDurationMonitor LOG_START");
            this.f104069e = C17454q.m58005b((C17463v) C43104eo.f111724a);
            C6907h.m21524a("click_publish_button", (Map) new C22984d().mo59970a("compose_finish", z ? 1 : 0).f60753a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo99516a(Object obj, boolean z, boolean z2) {
            if (this.f104069e.f48412a) {
                m128066b(obj, z, z2);
                this.f104069e.mo44943d();
            }
        }

        /* renamed from: b */
        private void m128066b(Object obj, boolean z, boolean z2) {
            String str;
            long j;
            int i;
            long j2;
            VideoPublishEditModel videoPublishEditModel;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            Object obj2 = obj;
            C41530am.m132280a("PublishDurationMonitor LOG_END");
            long a = this.f104069e.mo44941a(TimeUnit.MILLISECONDS);
            float f = (float) a;
            C6893q.m21447a("type_av_compose_upload", C6869c.m21381a().mo16884a("speed", Float.valueOf((((float) this.f104065a.mo88207b(obj2)) * 1.0f) / f)).mo16886a("processTime", Long.valueOf(a)).mo16888b());
            String a2 = C1642a.m8035a(Locale.US, "%d", new Object[]{Long.valueOf(a)});
            String a3 = C34788e.m112189a(this.f104068d, obj2);
            if ("upload".equals(a3)) {
                str = C36964i.m118933i();
            } else {
                str = C36964i.m118932h();
            }
            String str8 = null;
            if (obj2 instanceof VideoPublishEditModel) {
                videoPublishEditModel = (VideoPublishEditModel) obj2;
                i = C47440an.m148111c(videoPublishEditModel.mOutputFile);
                if (C7276d.m22812b(videoPublishEditModel.mOutputFile)) {
                    j = new File(videoPublishEditModel.mOutputFile).length() / 1024;
                    str8 = C1642a.m8035a(Locale.US, "%d", new Object[]{Long.valueOf(j)});
                } else {
                    j = 0;
                }
                j2 = videoPublishEditModel.userClickPublishTime;
            } else {
                videoPublishEditModel = null;
                j2 = 0;
                i = 0;
                j = 0;
            }
            C22984d dVar = new C22984d();
            if (videoPublishEditModel != null) {
                dVar.mo59972a("is_fast_import", (Object) Boolean.valueOf(videoPublishEditModel.isFastImport));
                dVar.mo59973a("edit_filter_id", videoPublishEditModel.mCurFilterIds);
                dVar.mo59971a("file_size", j);
                dVar.mo59970a("file_bitrate", i);
                dVar.mo59973a("info_sticker_list", videoPublishEditModel.getInfoStickerList());
                dVar.mo59973a("effect_list", videoPublishEditModel.mStickerID);
            }
            C22984d a4 = dVar.mo59973a("old_user_view_publish_duration", a2).mo59973a("content_type", C34788e.m112190b(this.f104068d)).mo59970a("video_type", this.f104068d).mo59970a("video_upload_type", this.f104066b).mo59973a("content_source", a3);
            String str9 = "is_hardcode";
            if (C36964i.m118920a()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            long j3 = j;
            float f2 = f;
            String str10 = str8;
            a4.mo59973a(str9, str2).mo59973a("resolution", str).mo59971a("encode_video_duration", C40055b.this.f104026j - C40055b.this.f104025i).mo59971a("upload_video_duration", C40055b.this.f104028l - C40055b.this.f104027k);
            if (j2 > 0) {
                dVar.mo59971a("user_view_publish_duration", C40055b.this.f104029m - j2);
                dVar.mo59970a("and_user_click_time", 0).mo59971a("and_start_synthetise_time", C40055b.this.f104025i - j2).mo59971a("and_end_synthetise_time", C40055b.this.f104026j - j2).mo59971a("and_start_upload_time", C40055b.this.f104027k - j2).mo59971a("and_end_upload_time", C40055b.this.f104028l - j2).mo59971a("and_end_create_aweme_time", C40055b.this.f104029m - j2);
            }
            C6907h.m21524a("tool_performance_publish_duration", (Map) dVar.f60753a);
            C22984d a5 = new C22984d().mo59973a("duration", a2);
            String str11 = "upload_while_compose";
            if (C40055b.m128028a(this.f104066b)) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C22984d a6 = a5.mo59973a(str11, str3).mo59973a("shoot_way", this.f104067c).mo59973a("content_type", C34788e.m112190b(this.f104068d)).mo59970a("video_type", this.f104068d).mo59970a("video_upload_type", this.f104066b).mo59973a("content_source", a3);
            String str12 = "is_hardcode";
            if (C36964i.m118920a()) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            C22984d a7 = a6.mo59973a(str12, str4);
            String str13 = "is_download_video";
            if (z) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            C22984d a8 = a7.mo59973a(str13, str5).mo59973a("resolution", str);
            if (C34788e.m112191c(this.f104068d)) {
                VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj2;
                C22984d a9 = a8.mo59970a("file_bitrate", i).mo59973a("filter_id_list", videoPublishEditModel2.mCurFilterIds).mo59973a("effect_list", videoPublishEditModel2.getEditEffectList()).mo59973a("info_sticker_list", videoPublishEditModel2.getInfoStickerList());
                String str14 = "compose_coding";
                if (z2) {
                    str6 = "hardcoding";
                } else {
                    str6 = "softcoding";
                }
                C22984d a10 = a9.mo59973a(str14, str6);
                String str15 = "is_reencode";
                if (C47468m.m148190b(videoPublishEditModel2)) {
                    str7 = "1";
                } else {
                    str7 = "0";
                }
                a10.mo59973a(str15, str7).mo59973a("creation_id", videoPublishEditModel2.creationId).mo59972a("save_watermark", (Object) Boolean.valueOf(videoPublishEditModel2.isSaveLocalWithWaterMark())).mo59973a("file_size", str10).mo59972a("upload_speed", (Object) Float.valueOf((((float) j3) * 1000.0f) / f2)).mo59972a("checkFastImport", (Object) Boolean.valueOf(C47468m.m148191c(videoPublishEditModel2))).mo59973a("prop_list", videoPublishEditModel2.mStickerID).mo59972a("beautify_used", (Object) Boolean.valueOf(videoPublishEditModel2.faceBeautyOpen)).mo59973a("beautify_info", C35574k.m114859a().mo70085S().mo15979b((Object) C23531b.m77285a())).mo59970a("file_fps", C47440an.m148110b(videoPublishEditModel2.mOutputFile));
                if (C40055b.this.f104019c.unableRemuxCode != 0) {
                    a8.mo59970a("notRemuxErrorcode", C40055b.this.f104019c.unableRemuxCode);
                }
                if (C40055b.this.f104019c != null) {
                    a8.mo59970a("synthetise_cpu_encode", C40055b.this.f104019c.synthetiseCPUEncode);
                }
                if (videoPublishEditModel2.uploadSpeedInfo != null) {
                    C47464k.m148178a(videoPublishEditModel2);
                    a8.mo59971a("upload_probe_speed", videoPublishEditModel2.uploadSpeedInfo.getSpeed()).mo59970a("used_compiler_setting_group", videoPublishEditModel2.uploadSpeedInfo.getUsedCompilerSettingGroup());
                }
                if (videoPublishEditModel2.compileProbeResult != null) {
                    a8.mo59970a("pre_code", videoPublishEditModel2.compileProbeResult.getStatus().getVeCode()).mo59970a("pre_tools_code", videoPublishEditModel2.compileProbeResult.getStatus().getToolsCode());
                    if (videoPublishEditModel2.compileProbeResult.getData() != null) {
                        a8.mo59970a("pre_crf", videoPublishEditModel2.compileProbeResult.getData().getCrf()).mo59972a("pre_bitrate", (Object) Float.valueOf(videoPublishEditModel2.compileProbeResult.getData().getVideoBitrate())).mo59970a("pre_duration", videoPublishEditModel2.compileProbeResult.getData().getDurationMs());
                    }
                }
                if (this.f104065a instanceof C38438af) {
                    C41444c cVar = ((C38438af) this.f104065a).f99930l;
                    a8.mo59971a("synthetic_dur_ms", cVar.mo102097a()).mo59971a("upload_wait_time_ms", cVar.mo102098b());
                }
                long j4 = -1;
                if (C40055b.this.f104032p != null) {
                    j4 = C40055b.this.f104032p.f103793a;
                } else if (this.f104065a instanceof C38438af) {
                    j4 = ((C38438af) this.f104065a).mo96359b();
                }
                if (j4 > 0) {
                    a8.mo59971a("upload_dur_ms", j4);
                }
            }
            C6907h.m21524a("publish_finish", (Map) a8.f60753a);
            StringBuilder sb = new StringBuilder("PublishDurationMonitor publish_finish ");
            sb.append(a2);
            C41530am.m132285d(sb.toString());
        }

        C40065c(C39825f fVar, int i, String str, int i2) {
            this.f104065a = fVar;
            this.f104066b = i;
            this.f104067c = str;
            this.f104068d = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.m.b$d */
    static class C40066d {

        /* renamed from: a */
        C17454q f104071a;

        C40066d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo99518a() {
            this.f104071a = C17454q.m58005b((C17463v) C43104eo.f111724a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final synchronized void mo99519b() {
            if (this.f104071a.f48412a) {
                long a = this.f104071a.mo44941a(TimeUnit.MILLISECONDS);
                this.f104071a.mo44943d();
                if (C35563c.f93231M.mo93305a(Property.QuietlySynthetic)) {
                    C6907h.onEvent(MobClick.obtain().setLabelName("edit_page").setEventName("composite_length").setValue(String.valueOf(a)));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m128028a(int i) {
        return i == 1;
    }

    public final String toString() {
        return "PublisherImpl2";
    }

    /* renamed from: a */
    public final void mo99505a(boolean z, Throwable th, String str, Object obj) {
        String str2;
        String str3;
        int i;
        this.f104026j = SystemClock.uptimeMillis();
        long j = 0;
        this.f104040x = this.f104040x > 0 ? C43104eo.f111724a.mo44952a() - this.f104040x : 0;
        double d = (double) this.f104040x;
        Double.isNaN(d);
        String a = C1642a.m8035a(Locale.US, "%d", new Object[]{Integer.valueOf((int) (d / 1000000.0d))});
        StringBuilder sb = new StringBuilder();
        sb.append(z ? 1 : 0);
        C22984d a2 = C22984d.m75611a().mo59973a("duration", a).mo59973a("status", sb.toString());
        String str4 = "resolution";
        if ("upload".equals(this.f104014A)) {
            str2 = C36964i.m118933i();
        } else {
            str2 = C36964i.m118932h();
        }
        C22984d a3 = a2.mo59973a(str4, str2);
        String str5 = "is_hardcode";
        String str6 = C36964i.m118920a() ? "1" : "0";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C36964i.m118929e());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C36964i.m118931g());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f104041y);
        C22984d a4 = a3.mo59973a(str5, str6).mo59973a("bite_rate", sb2.toString()).mo59973a("video_quality", sb3.toString()).mo59973a("_perf_monitor", "1").mo59973a("fps", sb4.toString()).mo59973a("current_page", str);
        String str7 = "fail_info";
        if (th == null) {
            str3 = null;
        } else {
            str3 = th.toString();
        }
        a4.mo59973a(str7, str3);
        if (th instanceof SynthetiseException) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(((SynthetiseException) th).getCode());
            a4.mo59973a("error_code", sb5.toString());
        }
        if (C34788e.m112191c(this.f104034r)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (C7276d.m22812b(videoPublishEditModel.mOutputFile)) {
                j = new File(videoPublishEditModel.mOutputFile).length();
                i = C47440an.m148111c(videoPublishEditModel.mOutputFile);
            } else {
                i = 0;
            }
            this.f104030n = videoPublishEditModel.isSyntheticHardEncode;
            a4.mo59973a("compose_coding", videoPublishEditModel.isSyntheticHardEncode ? "hardcoding" : "softcoding").mo59970a("file_bitrate", i).mo59973a("file_size", C1642a.m8035a(Locale.US, "%d", new Object[]{Long.valueOf(j / 1024)}));
            if (C7276d.m22812b(videoPublishEditModel.getLocalTempPath())) {
                j += new File(videoPublishEditModel.getLocalTempPath()).length();
            }
            if (C7276d.m22812b(videoPublishEditModel.getLocalFinalPath())) {
                j += new File(videoPublishEditModel.getLocalFinalPath()).length();
            }
            C41463q.m132133a(this.f104042z, j);
            C41465a a5 = C41463q.m132131a();
            if (a5 != null) {
                a4.mo59970a("init_available_size_mb", (int) a5.f107859a).mo59970a("max_publish_usage_mb", (int) a5.f107860b).mo59973a("available_size_detail", a5.f107861c);
            }
            a4.mo59973a("creation_id", videoPublishEditModel.creationId).mo59973a("filter_id_list", videoPublishEditModel.mCurFilterIds).mo59973a("effect_list", videoPublishEditModel.getEditEffectList()).mo59973a("info_sticker_list", videoPublishEditModel.getInfoStickerList()).mo59973a("prop_list", videoPublishEditModel.mStickerID).mo59972a("beautify_used", (Object) Boolean.valueOf(videoPublishEditModel.faceBeautyOpen)).mo59973a("beautify_info", C35574k.m114859a().mo70085S().mo15979b((Object) C23531b.m77285a())).mo59973a("content_type", videoPublishEditModel.getAvetParameter().getContentType()).mo59973a("content_source", videoPublishEditModel.getAvetParameter().getContentSource());
        }
        C6907h.m21524a("video_compose_end", (Map) a4.f60753a);
        StringBuilder sb6 = new StringBuilder("uploadSynthetiseEndEvent: ");
        sb6.append(a);
        C41530am.m132285d(sb6.toString());
    }

    /* renamed from: a */
    public final void mo99504a(boolean z, String str) {
        this.f104028l = SystemClock.uptimeMillis();
        if (!m128028a(this.f104035s)) {
            this.f104032p.mo99399a(z, str, null, true);
        }
    }

    /* renamed from: a */
    public final void mo99502a(final Object obj, final boolean z) {
        if (this.f104039w == null) {
            this.f104039w = this.f104018b.mo88202a(obj, this.f104019c);
            if (this.f104039w == null) {
                StringBuilder sb = new StringBuilder("publish_illegal_parallel Type:");
                sb.append(this.f104034r);
                sb.append(" UploadType:");
                sb.append(this.f104035s);
                sb.append(" impl_type:2");
                C41530am.m132283b(sb.toString());
                C6893q.m21447a("publish_illegal_parallel", new C6869c().mo16885a("type", Integer.valueOf(this.f104034r)).mo16885a("upload_type", Integer.valueOf(this.f104035s)).mo16885a("impl_type", Integer.valueOf(2)).mo16888b());
                return;
            }
            C39362dy dyVar = this.f104023g;
            StringBuilder sb2 = new StringBuilder("createVideo() synthetiseResult = ");
            sb2.append(this.f104019c);
            dyVar.mo97948a(sb2.toString());
            final C40064b bVar = new C40064b();
            bVar.mo99514a();
            C18246h.m60214a(this.f104039w, (C18245g<? super V>) new C18245g<VideoCreation>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(VideoCreation videoCreation) {
                    bVar.mo99515b();
                    C40055b.this.f104023g.mo97948a("create video finished.");
                }

                public final void onFailure(Throwable th) {
                    C40055b.this.f104023g.mo97948a("create video failed.");
                    C39360dw.m125725a().mo97926a(9);
                    if (C40055b.this.f104017a != null) {
                        C40055b.this.f104017a.onError(new VideoPublishException(th, "身份授权"));
                    }
                }
            }, this.f104015B == null ? C23364n.f61448a : this.f104015B);
            C6907h.m21524a("publish_start", (Map) C22984d.m75611a().mo59973a("shoot_entrance", this.f104033q).mo59973a("is_photo", this.f104034r == 5 ? "1" : "0").f60753a);
        }
        C18246h.m60214a(this.f104039w, (C18245g<? super V>) new C18245g<VideoCreation>() {
            public final void onFailure(Throwable th) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(VideoCreation videoCreation) {
                C40055b.this.mo99501a(obj, videoCreation, z);
            }
        }, this.f104015B == null ? C23364n.f61448a : this.f104015B);
        if (!z) {
            this.f104031o = this.f104018b.mo88492d(obj);
            if (this.f104017a != null) {
                this.f104017a.onProgressUpdate(this.f104036t.mo97922a(2, 0), m128032e(obj));
            }
        }
    }

    /* renamed from: a */
    public final void mo99501a(final Object obj, final VideoCreation videoCreation, boolean z) {
        if (this.f104038v == null) {
            C39362dy dyVar = this.f104023g;
            StringBuilder sb = new StringBuilder("uploadVideo() synthetiseResult = ");
            sb.append(this.f104019c);
            dyVar.mo97948a(sb.toString());
            m128037m(obj);
            this.f104038v = this.f104018b.mo88205a(obj, videoCreation);
            C18246h.m60214a((C18253l<V>) this.f104038v, (C18245g<? super V>) new C18245g<VideoCreation>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(VideoCreation videoCreation) {
                    try {
                        C40055b.this.mo99503a(true, new C6869c().mo16887a("resultCode", C35563c.f93239b.mo15979b((Object) videoCreation)).mo16887a("args", C35563c.f93239b.mo15979b(obj)).mo16887a("result", C35563c.f93239b.mo15979b((Object) videoCreation)));
                    } catch (Exception e) {
                        C40055b.m128027a((Throwable) e);
                    }
                    C40055b.this.mo99504a(true, "");
                }

                public final void onFailure(Throwable th) {
                    try {
                        C40055b.this.mo99503a(false, new C6869c().mo16887a("throwable", Log.getStackTraceString(th)).mo16887a("args", C35563c.f93239b.mo15979b(obj)).mo16887a("result", C35563c.f93239b.mo15979b((Object) videoCreation)));
                    } catch (Exception e) {
                        C40055b.m128027a((Throwable) e);
                    }
                    C39360dw.m125725a().mo97926a(9);
                    C40055b.this.mo99504a(false, th.toString());
                    if (C40055b.this.f104017a != null) {
                        C40055b.this.f104017a.onError(new VideoPublishException(th, "上传视频"));
                    }
                }
            }, this.f104015B == null ? C23364n.f61448a : this.f104015B);
        }
        if (!z) {
            C18246h.m60214a((C18253l<V>) this.f104038v, (C18245g<? super V>) new C18245g<VideoCreation>() {
                public final void onFailure(Throwable th) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(VideoCreation videoCreation) {
                    C40055b.this.mo99500a(obj, videoCreation);
                }
            }, this.f104015B == null ? C23364n.f61448a : this.f104015B);
            this.f104038v.mo97924b(new C40072h(this, obj), C23364n.f61448a);
        }
    }

    /* renamed from: a */
    public final void mo99503a(boolean z, C6869c cVar) {
        try {
            String stackTraceString = Log.getStackTraceString(new Exception());
            C30186a.f79437a.mo60635a("upload_video_end");
            Funnel funnel = C30186a.f79437a;
            StringBuilder sb = new StringBuilder("upload_video_end");
            sb.append(z ? "_success" : "_failure");
            funnel.mo60635a(sb.toString());
            C6893q.m21447a("aweme_upload_video_funnel", m128024a(cVar).mo16887a("type", "upload_video_end").mo16885a("status", Integer.valueOf(z ^ true ? 1 : 0)).mo16887a("extra", C30186a.f79437a.mo60636a()).mo16887a("stack_trace", stackTraceString).mo16888b());
            m128026a("upload_video_end", stackTraceString);
        } catch (Exception e) {
            m128027a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo99500a(final Object obj, final VideoCreation videoCreation) {
        C39362dy dyVar = this.f104023g;
        StringBuilder sb = new StringBuilder("createAweme() synthetiseResult = ");
        sb.append(this.f104019c);
        sb.append(" \nargs ");
        sb.append(obj);
        dyVar.mo97948a(sb.toString());
        if (this.f104017a != null) {
            this.f104017a.onProgressUpdate(this.f104036t.mo97922a(3, 0), m128032e(obj));
        }
        final C40063a aVar = new C40063a();
        aVar.mo99512a();
        C18246h.m60214a(this.f104018b.mo88203a(obj, videoCreation, this.f104019c), (C18245g<? super V>) new C18245g<C38455ap>() {
            public final void onFailure(Throwable th) {
                C39360dw.m125725a().mo97926a(9);
                if (C40055b.this.f104017a != null) {
                    C40055b.this.f104017a.onError(new VideoPublishException(th, "上传视频信息"));
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C38455ap apVar) {
                C40055b.this.f104029m = SystemClock.uptimeMillis();
                apVar.materialId = videoCreation.materialId;
                C35563c.f93259v.mo83148a("mus_af_post_video", null);
                aVar.mo99513b();
                if (C40055b.this.f104017a != null) {
                    C39360dw.m125725a().mo97926a(10);
                    C40055b.this.f104017a.onSuccess(apVar, C40055b.m128032e(obj));
                    C40055b.this.f104022f.mo99516a(obj, C40055b.this.f104031o, C40055b.this.f104030n);
                }
            }
        }, this.f104015B == null ? C23364n.f61448a : this.f104015B);
    }

    /* renamed from: c */
    private void m128029c() {
        this.f104018b.mo88206a();
    }

    /* renamed from: f */
    private C6869c m128033f() {
        return m128024a((C6869c) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo99506b() {
        m128030d();
        this.f104015B.shutdown();
    }

    /* renamed from: a */
    public final void mo99494a() {
        if (this.f104015B == null || this.f104015B.isShutdown()) {
            m128030d();
        } else {
            this.f104015B.execute(new C40071g(this));
        }
    }

    /* renamed from: d */
    private void m128030d() {
        C41530am.m132285d("Publisher cancelSynthetise");
        if (C39360dw.m125725a().mo97940j()) {
            C6907h.m21524a("user_cancel_publish", (Map) C22984d.m75611a().mo59973a("publish_id", this.f104016C).mo59970a("video_type", this.f104034r).mo59970a("video_upload_type", this.f104035s).mo59973a("cancel_step", "user").f60753a);
            this.f104020d.mo3280c();
            this.f104021e.mo99519b();
            C39360dw.m125725a().mo97926a(10);
        }
    }

    /* renamed from: e */
    private void m128031e() {
        String str;
        String str2;
        this.f104025i = SystemClock.uptimeMillis();
        String str3 = "video_compose_start";
        C22984d a = C22984d.m75611a();
        String str4 = "resolution";
        if ("upload".equals(this.f104014A)) {
            str = C36964i.m118933i();
        } else {
            str = C36964i.m118932h();
        }
        C22984d a2 = a.mo59973a(str4, str);
        String str5 = "is_hardcode";
        if (C36964i.m118920a()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C36964i.m118929e());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C36964i.m118931g());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f104041y);
        C6907h.m21524a(str3, (Map) a2.mo59973a(str5, str2).mo59973a("bite_rate", sb.toString()).mo59973a("video_quality", sb2.toString()).mo59973a("_perf_monitor", "1").mo59973a("fps", sb3.toString()).f60753a);
        this.f104040x = C43104eo.f111724a.mo44952a();
        C41530am.m132285d("Publisher uploadSynthetiseStartEvent");
    }

    /* renamed from: c */
    public final Bitmap mo99497c(Object obj) {
        return this.f104018b.mo88209c(obj);
    }

    /* renamed from: e */
    public static boolean m128032e(Object obj) {
        if (obj instanceof BaseShortVideoContext) {
            return ((BaseShortVideoContext) obj).isPoiOrderRate();
        }
        if (obj instanceof PhotoContext) {
            return ((PhotoContext) obj).isPoiOrderRate();
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void mo99510i(Object obj) {
        this.f104023g.mo97948a("prePublish()");
        if (this.f104037u == null) {
            m128025a(obj, true, false);
        }
        mo99502a(obj, true);
    }

    /* renamed from: b */
    public final void mo99496b(Object obj) {
        if (this.f104015B != null) {
            this.f104015B.execute(new C40068d(this, obj));
        } else {
            mo99509h(obj);
        }
    }

    /* renamed from: d */
    public final void mo99498d(Object obj) {
        if (this.f104015B != null) {
            this.f104015B.execute(new C40069e(this, obj));
        } else {
            mo99508g(obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo99507f(Object obj) {
        int a = this.f104036t.mo97922a(1, this.f104038v.mo97925d());
        if (this.f104017a != null) {
            this.f104017a.onProgressUpdate(a, m128032e(obj));
        }
    }

    /* renamed from: a */
    private C6869c m128024a(C6869c cVar) {
        if (cVar == null) {
            cVar = new C6869c();
        }
        cVar.mo16885a("video_type", Integer.valueOf(this.f104034r)).mo16887a("item_type", this.f104018b.getClass().getSimpleName());
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void mo99508g(Object obj) {
        this.f104023g.mo97948a("startPublish()::fast publish for review video");
        this.f104024h = true;
        this.f104022f.mo99517a(false);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel.isSaveLocalWithWaterMark()) {
            m128025a(obj, false, true);
            return;
        }
        this.f104019c = new SynthetiseResult();
        VideoCreation videoCreation = new VideoCreation();
        videoCreation.setMaterialId(videoPublishEditModel.reviewVideoId);
        mo99500a(obj, videoCreation);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void mo99509h(final Object obj) {
        Executor executor;
        this.f104023g.mo97948a("startPublish()");
        m128029c();
        this.f104024h = true;
        if (this.f104037u == null) {
            this.f104023g.mo97948a("startPublish() synthetise()");
            m128025a(obj, false, false);
            this.f104022f.mo99517a(false);
            return;
        }
        boolean isDone = this.f104037u.isDone();
        if (isDone) {
            this.f104023g.mo97948a("synthetise() already done");
        } else {
            this.f104023g.mo97948a("synthetise() not finished.");
        }
        this.f104022f.mo99517a(isDone);
        this.f104021e.mo99519b();
        C39359dv<SynthetiseResult> dvVar = this.f104037u;
        C400561 r1 = new C18245g<SynthetiseResult>() {
            public final void onFailure(Throwable th) {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(SynthetiseResult synthetiseResult) {
                if (!C40055b.this.f104020d.mo3278a()) {
                    if (!(C40055b.this.f104017a == null || synthetiseResult.outputFile == null)) {
                        C40055b.this.f104017a.onSynthetiseSuccess(synthetiseResult.outputFile);
                    }
                    C40055b.this.mo99502a(obj, false);
                }
            }
        };
        if (this.f104015B == null) {
            executor = C23364n.f61448a;
        } else {
            executor = this.f104015B;
        }
        C18246h.m60214a((C18253l<V>) dvVar, (C18245g<? super V>) r1, executor);
    }

    /* renamed from: m */
    private void m128037m(Object obj) {
        this.f104027k = SystemClock.uptimeMillis();
        if (!m128028a(this.f104035s)) {
            this.f104032p = new C39963gj(obj, this.f104018b, this.f104034r, null);
            this.f104032p.mo99398a(true);
            try {
                String stackTraceString = Log.getStackTraceString(new Exception());
                C30186a.f79437a.mo60635a("upload_video_start");
                C6893q.m21447a("aweme_upload_video_funnel", m128033f().mo16887a("type", "upload_video_start").mo16887a("extra", C30186a.f79437a.mo60636a()).mo16887a("stack_trace", stackTraceString).mo16888b());
                m128026a("upload_video_start", stackTraceString);
            } catch (Exception e) {
                m128027a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public static void m128027a(Throwable th) {
        try {
            C6893q.m21447a("aweme_upload_video_funnel", new C6869c().mo16887a("type", "pure_exception").mo16887a("exception", Log.getStackTraceString(th)).mo16888b());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo99495a(Object obj) {
        if (this.f104015B != null) {
            this.f104015B.execute(new C40067c(this, obj));
        } else {
            mo99510i(obj);
        }
    }

    /* renamed from: a */
    private void m128026a(String str, String str2) throws JSONException {
        JSONObject optJSONObject = C30186a.f79437a.mo60637b().optJSONObject("events");
        if (optJSONObject.optInt("upload_video_start") < optJSONObject.optInt("upload_video_end")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_abnormal_counting");
            C6893q.m21447a("aweme_upload_video_funnel", m128033f().mo16887a("type", sb.toString()).mo16887a("extra", C30186a.f79437a.mo60636a()).mo16887a("stack_trace", str2).mo16888b());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo99499a(C39359dv dvVar, Object obj) {
        if (this.f104017a != null) {
            this.f104017a.onProgressUpdate(this.f104036t.mo97922a(0, dvVar.mo97925d()), m128032e(obj));
        }
    }

    /* renamed from: a */
    private void m128025a(final Object obj, final boolean z, final boolean z2) {
        Executor executor;
        Executor executor2;
        if (C34788e.m112191c(this.f104034r)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            this.f104041y = (double) videoPublishEditModel.videoFps();
            this.f104042z = videoPublishEditModel.creationId;
        }
        this.f104014A = C34788e.m112189a(this.f104034r, obj);
        C39360dw.m125725a().mo97926a(2);
        C41463q.m132134a(this.f104042z, C34788e.m112190b(this.f104034r));
        C39359dv<SynthetiseResult> a = this.f104018b.mo96357a(obj, this.f104020d, z2);
        this.f104021e.mo99518a();
        C43072du.m136630a("compose_start");
        m128031e();
        this.f104037u = a;
        C6907h.m21524a("av_memory_log", (Map) C22984d.m75611a().mo59971a("dalvikPss", C41514ab.m132244a().f107964b).mo59971a("nativePss", C41514ab.m132244a().f107965c).mo59971a("otherPss", C41514ab.m132244a().f107967e).mo59971a("totalPss", C41514ab.m132244a().f107966d).f60753a);
        C400572 r1 = new C18245g<SynthetiseResult>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(SynthetiseResult synthetiseResult) {
                try {
                    if (C40055b.this.f104024h) {
                        C40055b.this.mo99505a(true, null, "homepage_follow", obj);
                    } else {
                        C40055b.this.mo99505a(true, null, "video_post_page", obj);
                    }
                    C6907h.m21524a("av_memory_log", (Map) C22984d.m75611a().mo59973a("synthetise_start", "success").mo59971a("dalvikPss", C41514ab.m132244a().f107964b).mo59971a("nativePss", C41514ab.m132244a().f107965c).mo59971a("otherPss", C41514ab.m132244a().f107967e).mo59971a("totalPss", C41514ab.m132244a().f107966d).f60753a);
                    C40055b.this.f104019c = synthetiseResult;
                    C39362dy dyVar = C40055b.this.f104023g;
                    StringBuilder sb = new StringBuilder("synthetise() finished, result = ");
                    sb.append(synthetiseResult);
                    dyVar.mo97948a(sb.toString());
                    C40055b.this.f104021e.mo99519b();
                    C43072du.m136637b("compose_success");
                    if (!C40055b.this.f104020d.mo3278a()) {
                        if (!z2) {
                            C40055b.this.mo99502a(obj, z);
                            return;
                        }
                        C40055b.this.f104031o = C40055b.this.f104018b.mo88492d(obj);
                        VideoCreation videoCreation = new VideoCreation();
                        videoCreation.setMaterialId(((VideoPublishEditModel) obj).reviewVideoId);
                        C40055b.this.mo99500a(obj, videoCreation);
                    }
                } catch (Exception e) {
                    C6893q.m21447a("aweme_synthetise_error_log", C6869c.m21381a().mo16887a("exception", C13315l.m38963c(e)).mo16888b());
                }
            }

            public final void onFailure(Throwable th) {
                C40055b.this.f104023g.mo97948a("synthetise failed");
                C6907h.m21524a("av_memory_log", (Map) C22984d.m75611a().mo59973a("synthetise_start", "failed").mo59971a("dalvikPss", C41514ab.m132244a().f107964b).mo59971a("nativePss", C41514ab.m132244a().f107965c).mo59971a("otherPss", C41514ab.m132244a().f107967e).mo59971a("totalPss", C41514ab.m132244a().f107966d).f60753a);
                C39360dw.m125725a().mo97926a(9);
                if (C40055b.this.f104024h) {
                    C40055b.this.mo99505a(false, th, "homepage_follow", obj);
                } else {
                    C40055b.this.mo99505a(false, th, "video_post_page", obj);
                }
                if (C40055b.this.f104017a != null) {
                    C40055b.this.f104017a.onError(new VideoPublishException(th, "合成"));
                }
            }
        };
        if (this.f104015B == null) {
            executor = C18254m.m60217a();
        } else {
            executor = this.f104015B;
        }
        C18246h.m60214a((C18253l<V>) a, (C18245g<? super V>) r1, executor);
        C40070f fVar = new C40070f(this, a, obj);
        if (this.f104015B == null) {
            executor2 = C18254m.m60217a();
        } else {
            executor2 = this.f104015B;
        }
        a.mo97924b(fVar, executor2);
    }

    public C40055b(C39825f fVar, int i, int i2, String str, C40023l<C38455ap> lVar) {
        this.f104018b = fVar;
        this.f104033q = str;
        this.f104034r = i;
        this.f104035s = i2;
        StringBuilder sb = new StringBuilder();
        sb.append(C6789d.m21080d());
        sb.append("-");
        sb.append(SystemClock.uptimeMillis());
        this.f104016C = sb.toString();
        fVar.f103511c = this.f104016C;
        this.f104017a = new PublishCallbacks();
        this.f104017a.add(new C38550bx(lVar));
        this.f104020d = new C0879b();
        C40065c cVar = new C40065c(this.f104018b, this.f104035s, this.f104033q, this.f104034r);
        this.f104022f = cVar;
        this.f104023g = new C39362dy(this);
        if (C35563c.f93231M.mo93305a(Property.EnablePublishThreadOpt)) {
            C41530am.m132285d("Publisher create mPublishExecutor");
            this.f104015B = C40073i.m128071a();
        }
        C39362dy dyVar = this.f104023g;
        StringBuilder sb2 = new StringBuilder("new Publisher() type = ");
        sb2.append(i);
        dyVar.mo97948a(sb2.toString());
    }
}
