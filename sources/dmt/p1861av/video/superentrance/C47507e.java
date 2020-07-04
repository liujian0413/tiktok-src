package dmt.p1861av.video.superentrance;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.story.shootvideo.publish.C42026b;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.superentrance.e */
public final class C47507e {

    /* renamed from: a */
    public static final C47507e f121962a = new C47507e();

    /* renamed from: b */
    private static String f121963b;

    /* renamed from: c */
    private static final String f121964c;

    /* renamed from: d */
    private static final String f121965d;

    /* renamed from: e */
    private static final String f121966e;

    /* renamed from: f */
    private static final String f121967f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static C47498b f121968g = new C47498b();

    /* renamed from: h */
    private static SuperEntranceConfig f121969h;

    /* renamed from: i */
    private static boolean f121970i;

    /* renamed from: dmt.av.video.superentrance.e$a */
    public static final class C47508a extends AbsDownloadListener {
        C47508a() {
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            C6907h.m21524a("super_entrance_download", (Map) C22984d.m75611a().mo59973a("download_type", "icon").mo59973a("to_status", "successful").f60753a);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            C6907h.m21524a("super_entrance_download", (Map) C22984d.m75611a().mo59973a("download_type", "icon").mo59973a("to_status", "failed").f60753a);
        }
    }

    /* renamed from: dmt.av.video.superentrance.e$b */
    public static final class C47509b implements C43760j {
        C47509b() {
        }

        /* renamed from: b */
        public final void mo9282b(Effect effect) {
            C7573i.m23587b(effect, "effect");
            C6907h.m21524a("super_entrance_download_start", (Map) C22984d.m75611a().mo59973a("download_type", "prop").f60753a);
        }

        /* renamed from: a */
        public final void mo9280a(Effect effect) {
            C7573i.m23587b(effect, "effect");
            C47507e.f121968g.mo119612a(effect);
            C6907h.m21524a("super_entrance_download", (Map) C22984d.m75611a().mo59973a("download_type", "prop").mo59973a("to_status", "successful").f60753a);
        }

        /* renamed from: a */
        public final void mo9281a(Effect effect, C43726c cVar) {
            C7573i.m23587b(cVar, "e");
            C6907h.m21524a("super_entrance_download", (Map) C22984d.m75611a().mo59973a("download_type", "prop").mo59973a("to_status", "failed").f60753a);
        }
    }

    /* renamed from: dmt.av.video.superentrance.e$c */
    public static final class C47510c extends AbsDownloadListener {
        C47510c() {
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            C6907h.m21524a("super_entrance_download", (Map) C22984d.m75611a().mo59973a("download_type", "placeholder").mo59973a("to_status", "successful").f60753a);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            C6907h.m21524a("super_entrance_download", (Map) C22984d.m75611a().mo59973a("download_type", "placeholder").mo59973a("to_status", "failed").f60753a);
        }
    }

    /* renamed from: dmt.av.video.superentrance.e$d */
    public static final class C47511d extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ String f121971a;

        C47511d(String str) {
            this.f121971a = str;
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            C6907h.m21524a("super_entrance_download", (Map) C22984d.m75611a().mo59973a("download_type", this.f121971a).mo59973a("to_status", "successful").f60753a);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            C6907h.m21524a("super_entrance_download", (Map) C22984d.m75611a().mo59973a("download_type", this.f121971a).mo59973a("to_status", "failed").f60753a);
        }
    }

    private C47507e() {
    }

    /* renamed from: a */
    public static String m148257a() {
        return f121967f;
    }

    /* renamed from: d */
    private static String m148261d() {
        Effect a = f121968g.mo119611a();
        if (a == null) {
            return "";
        }
        String unzipPath = a.getUnzipPath();
        C7573i.m23582a((Object) unzipPath, "effect.unzipPath");
        return unzipPath;
    }

    /* renamed from: e */
    private static SuperEntranceConfig m148262e() {
        if (f121970i) {
            return f121969h;
        }
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            f121969h = a.getSuperEntranceConfig();
        } catch (Exception unused) {
        }
        f121970i = true;
        return f121969h;
    }

    /* renamed from: c */
    public static boolean m148260c() {
        Integer num;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            num = a.getFirstInstallTime();
        } catch (Exception unused) {
            num = Integer.valueOf((int) (System.currentTimeMillis() / 1000));
        }
        float currentTimeMillis = ((float) System.currentTimeMillis()) / 1000.0f;
        C7573i.m23582a((Object) num, "firstInstallTime");
        if ((currentTimeMillis - ((float) num.intValue())) / 86400.0f >= 7.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r1 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo119629b() {
        /*
            r2 = this;
            java.lang.String r0 = f121964c
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.C38527bf.m123172a(r0)
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = f121964c
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = m148262e()
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = r1.getVideoMd5()
            if (r1 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r1 = ""
        L_0x0018:
            boolean r0 = m148259a(r0, r1)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = f121965d
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.C38527bf.m123172a(r0)
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = f121965d
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = m148262e()
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = r1.getLoopVideoMd5()
            if (r1 != 0) goto L_0x0036
        L_0x0034:
            java.lang.String r1 = ""
        L_0x0036:
            boolean r0 = m148259a(r0, r1)
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = f121966e
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.C38527bf.m123172a(r0)
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = f121967f
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.C38527bf.m123172a(r0)
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = m148261d()
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.C38527bf.m123172a(r0)
            if (r0 == 0) goto L_0x0058
            r0 = 1
            return r0
        L_0x0058:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p1861av.video.superentrance.C47507e.mo119629b():boolean");
    }

    static {
        StringBuilder sb = new StringBuilder();
        Application application = C35563c.f93238a;
        C7573i.m23582a((Object) application, "AVEnv.application");
        sb.append(application.getFilesDir().toString());
        sb.append(File.separator);
        sb.append("superentrance");
        f121963b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f121963b);
        sb2.append(File.separator);
        sb2.append("babydemo.mp4");
        f121964c = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f121963b);
        sb3.append(File.separator);
        sb3.append("loop_babydemo.mp4");
        f121965d = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f121963b);
        sb4.append(File.separator);
        sb4.append("plusicon.png");
        f121966e = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(f121963b);
        sb5.append(File.separator);
        sb5.append("videobackimg.png");
        f121967f = sb5.toString();
    }

    /* renamed from: b */
    public final void mo119628b(Context context) {
        C7573i.m23587b(context, "context");
        SuperEntranceConfig e = m148262e();
        if (e != null) {
            String effectId = e.getEffectId();
            C47505d dVar = new C47505d(context);
            C7573i.m23582a((Object) effectId, "stickerId");
            dVar.mo119625a(effectId, new C47509b());
        }
    }

    /* renamed from: c */
    public final void mo119630c(Context context) {
        C7573i.m23587b(context, "context");
        SuperEntranceConfig e = m148262e();
        if (e != null) {
            String plusIconUrl = e.getPlusIconUrl();
            String plusIconMd5 = e.getPlusIconMd5();
            String str = f121966e;
            C7573i.m23582a((Object) plusIconMd5, "iconMd5");
            if (m148259a(str, plusIconMd5)) {
                C6907h.m21524a("super_entrance_download_start", (Map) C22984d.m75611a().mo59973a("download_type", "icon").f60753a);
                Downloader.with(context).url(plusIconUrl).name("plusicon.png").savePath(f121963b).force(true).mainThreadListener(new C47508a()).download();
            }
        }
    }

    /* renamed from: d */
    public final void mo119631d(Context context) {
        C7573i.m23587b(context, "context");
        SuperEntranceConfig e = m148262e();
        if (e != null) {
            String videoBackImgUrl = e.getVideoBackImgUrl();
            String videoBackImgMd5 = e.getVideoBackImgMd5();
            String str = f121967f;
            C7573i.m23582a((Object) videoBackImgMd5, "iconMd5");
            if (m148259a(str, videoBackImgMd5)) {
                C6907h.m21524a("super_entrance_download_start", (Map) C22984d.m75611a().mo59973a("download_type", "placeholder").f60753a);
                Downloader.with(context).url(videoBackImgUrl).name("videobackimg.png").savePath(f121963b).force(true).mainThreadListener(new C47510c()).download();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r1 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r1 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r4 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        if (r4 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.aweme.feed.model.Video m148255a(boolean r4) {
        /*
            com.ss.android.ugc.aweme.feed.model.Video r0 = new com.ss.android.ugc.aweme.feed.model.Video
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r4 == 0) goto L_0x0012
            java.lang.String r2 = f121965d
            r1.add(r2)
            goto L_0x0017
        L_0x0012:
            java.lang.String r2 = f121964c
            r1.add(r2)
        L_0x0017:
            java.util.List r1 = (java.util.List) r1
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = new com.ss.android.ugc.aweme.feed.model.VideoUrlModel
            r2.<init>()
            r3 = 0
            r2.setH265(r3)
            r2.setUrlList(r1)
            if (r4 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = m148262e()
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = r1.getLoopVideoMd5()
            if (r1 != 0) goto L_0x0043
        L_0x0033:
            java.lang.String r1 = ""
            goto L_0x0043
        L_0x0036:
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = m148262e()
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = r1.getVideoMd5()
            if (r1 != 0) goto L_0x0043
            goto L_0x0033
        L_0x0043:
            r2.setUrlKey(r1)
            if (r4 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = m148262e()
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r1.getLoopVideoMd5()
            if (r1 != 0) goto L_0x0064
        L_0x0054:
            java.lang.String r1 = ""
            goto L_0x0064
        L_0x0057:
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = m148262e()
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r1.getVideoMd5()
            if (r1 != 0) goto L_0x0064
            goto L_0x0054
        L_0x0064:
            r2.setUri(r1)
            r0.setPlayAddr(r2)
            if (r4 == 0) goto L_0x007b
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r4 = m148262e()
            if (r4 == 0) goto L_0x0078
            java.lang.String r4 = r4.getLoopVideoMd5()
            if (r4 != 0) goto L_0x0088
        L_0x0078:
            java.lang.String r4 = ""
            goto L_0x0088
        L_0x007b:
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r4 = m148262e()
            if (r4 == 0) goto L_0x0078
            java.lang.String r4 = r4.getVideoMd5()
            if (r4 != 0) goto L_0x0088
            goto L_0x0078
        L_0x0088:
            r0.setSourceId(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p1861av.video.superentrance.C47507e.m148255a(boolean):com.ss.android.ugc.aweme.feed.model.Video");
    }

    /* renamed from: a */
    public final void mo119627a(Context context) {
        C7573i.m23587b(context, "context");
        SuperEntranceConfig e = m148262e();
        if (e != null) {
            String str = f121964c;
            String videoMd5 = e.getVideoMd5();
            C7573i.m23582a((Object) videoMd5, "config.videoMd5");
            String videoUrl = e.getVideoUrl();
            C7573i.m23582a((Object) videoUrl, "config.videoUrl");
            Context context2 = context;
            m148258a(context2, str, videoMd5, "babydemo.mp4", videoUrl, false);
            String str2 = f121965d;
            String loopVideoMd5 = e.getLoopVideoMd5();
            C7573i.m23582a((Object) loopVideoMd5, "config.loopVideoMd5");
            String loopVideoUrl = e.getLoopVideoUrl();
            C7573i.m23582a((Object) loopVideoUrl, "config.loopVideoUrl");
            m148258a(context2, str2, loopVideoMd5, "loop_babydemo.mp4", loopVideoUrl, true);
        }
    }

    /* renamed from: a */
    private static boolean m148259a(String str, String str2) {
        if (!C38527bf.m123172a(str)) {
            return true;
        }
        String a = C42026b.m133581a(new File(str));
        CharSequence charSequence = str2;
        if (TextUtils.isEmpty(charSequence) || TextUtils.equals(a, charSequence)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m148258a(Context context, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        if (z) {
            str5 = "splash_loop";
        } else {
            str5 = "splash_once";
        }
        if (m148259a(str, str2)) {
            C6907h.m21524a("super_entrance_download_start", (Map) C22984d.m75611a().mo59973a("download_type", str5).f60753a);
            Downloader.with(context).url(str4).name(str3).savePath(f121963b).force(true).mainThreadListener(new C47511d(str5)).download();
        }
    }
}
