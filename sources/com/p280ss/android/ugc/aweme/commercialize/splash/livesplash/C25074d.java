package com.p280ss.android.ugc.aweme.commercialize.splash.livesplash;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.GlobalContext;
import com.p280ss.android.p817ad.splash.p825c.C18958a;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25054b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25266be;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeData;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28498o;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.main.C32903bh;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.d */
public class C25074d implements C25068a {

    /* renamed from: a */
    public static volatile boolean f66181a;

    /* renamed from: g */
    private static volatile C25074d f66182g;

    /* renamed from: h */
    private static C25069b f66183h;

    /* renamed from: i */
    private static String f66184i;

    /* renamed from: b */
    public boolean f66185b;

    /* renamed from: c */
    public boolean f66186c = true;

    /* renamed from: d */
    public Aweme f66187d;

    /* renamed from: e */
    public boolean f66188e;

    /* renamed from: f */
    public boolean f66189f = true;

    /* renamed from: j */
    private boolean f66190j = true;

    /* renamed from: k */
    private boolean f66191k;

    /* renamed from: l */
    private boolean f66192l;

    /* renamed from: b */
    public final void mo65585b() {
        this.f66187d = null;
    }

    /* renamed from: a */
    public final void mo65577a(Context context, List<Aweme> list) {
        if (context != null && !C6307b.m19566a((Collection<T>) list) && !m82592e() && !m82591d() && !C6307b.m19566a((Collection<T>) list)) {
            C1592h.m7853a((Callable<TResult>) new C25076e<TResult>(this, list, context));
        }
    }

    /* renamed from: a */
    public final String mo65576a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f66184i);
        sb.append(str);
        String sb2 = sb.toString();
        if (new File(sb2).exists()) {
            return sb2;
        }
        return null;
    }

    /* renamed from: e */
    private static boolean m82592e() {
        return TimeLockRuler.isTeenModeON();
    }

    private C25074d() {
    }

    /* renamed from: d */
    private static boolean m82591d() {
        if (f66183h != null) {
            return f66183h.mo65579a();
        }
        return false;
    }

    /* renamed from: a */
    public static C25074d m82584a() {
        if (f66182g == null) {
            synchronized (C25074d.class) {
                if (f66182g == null) {
                    f66184i = m82586a(GlobalContext.getContext());
                    f66183h = new C25069b(f66184i);
                    f66182g = new C25074d();
                }
            }
        }
        return f66182g;
    }

    /* renamed from: c */
    public final boolean mo65586c() {
        if (!C30199h.m98861a().getEnableLiveSplash().booleanValue() || m82592e() || m82591d()) {
            return false;
        }
        if (f66183h.mo65580b()) {
            C6907h.m21524a("livesdk_topview_show_failed", (Map) C22984d.m75611a().mo59973a("ad_show_fail_type", "12").f60753a);
            return false;
        } else if (AwemeAppData.m65765a().f60327g) {
            C6907h.m21524a("livesdk_topview_show_failed", (Map) C22984d.m75611a().mo59973a("ad_show_fail_type", "13").f60753a);
            return false;
        } else if (this.f66188e && !this.f66191k) {
            C6907h.m21524a("livesdk_topview_show_failed", (Map) C22984d.m75611a().mo59973a("ad_show_fail_type", "13").f60753a);
            return false;
        } else if (!C6399b.m19944t() && C32903bh.m106495a() && !f66181a) {
            C6907h.m21524a("livesdk_topview_show_failed", (Map) C22984d.m75611a().mo59973a("ad_show_fail_type", "9").f60753a);
            return false;
        } else if (!this.f66186c) {
            C6907h.m21524a("livesdk_topview_show_failed", (Map) C22984d.m75611a().mo59973a("ad_show_fail_type", "2").f60753a);
            return false;
        } else if (!this.f66188e && !this.f66192l && !AwemeAppData.m65765a().f60333m) {
            C6907h.m21524a("livesdk_topview_show_failed", (Map) C22984d.m75611a().mo59973a("ad_show_fail_type", "2").f60753a);
            return false;
        } else if (this.f66185b) {
            C6907h.m21524a("livesdk_topview_show_failed", (Map) C22984d.m75611a().mo59973a("ad_show_fail_type", "2").f60753a);
            return false;
        } else {
            Aweme d = f66183h.mo65582d();
            if (C25072c.m82581g(d)) {
                LiveAwesomeData i = C25072c.m82583i(d);
                if (i != null) {
                    C6907h.m21524a("livesdk_topview_show_failed", (Map) C22984d.m75611a().mo59971a("anchor_id", i.uid).mo59973a("topview_video_id", d.getAid()).mo59973a("ad_show_fail_type", "5").f60753a);
                }
                return false;
            } else if (!C25069b.m82562b(d)) {
                LiveAwesomeData i2 = C25072c.m82583i(d);
                if (i2 != null) {
                    C6907h.m21524a("livesdk_topview_show_failed", (Map) C22984d.m75611a().mo59971a("anchor_id", i2.uid).mo59973a("topview_video_id", d.getAid()).mo59973a("ad_show_fail_type", "1").f60753a);
                }
                return false;
            } else {
                this.f66187d = d;
                f66183h.mo65581c();
                return true;
            }
        }
    }

    /* renamed from: a */
    public final void mo65584a(Intent intent) {
        if (intent == null) {
            this.f66191k = false;
        } else {
            this.f66191k = C25266be.m83036a(intent);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ Object m82590b(Aweme aweme) throws Exception {
        LiveAwesomeData i = C25072c.m82583i(aweme);
        if (i != null) {
            C6907h.m21524a("livesdk_topview_receive", (Map) C22984d.m75611a().mo59971a("anchor_id", i.uid).mo59973a("topview_video_id", aweme.getAid()).f60753a);
        }
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m82585a(Aweme aweme) throws Exception {
        LiveAwesomeData i = C25072c.m82583i(aweme);
        if (i != null) {
            C6907h.m21524a("livesdk_topview_start_download", (Map) C22984d.m75611a().mo59971a("anchor_id", i.uid).mo59973a("topview_video_id", aweme.getAid()).f60753a);
        }
        return null;
    }

    /* renamed from: b */
    static final /* synthetic */ Object m82589b(C18958a aVar) throws Exception {
        if (aVar.mo50379w() == 1) {
            String x = aVar.mo50380x();
            C25054b.m82490a();
            C24976t.m82156b(GlobalContext.getContext(), C25054b.m82496c(x), C25054b.m82490a().mo65549a("11", (String) null));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_show_fail_type", "11");
            C24958f.m81905a().mo65266a("splash_ad").mo65276b("show_failed").mo65264a(Long.valueOf(aVar.mo50375n())).mo65286h(aVar.mo50376p()).mo65265a((Object) hashMap).mo65278b();
        }
        return null;
    }

    /* renamed from: a */
    private static String m82586a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(context.getPackageName());
        sb.append("/liveSplashCache/");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m82588a(C18958a aVar) {
        String str;
        StringBuilder sb = new StringBuilder("postSplashShowFailedLog() called with: iSplashAdModel = ");
        if (aVar == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str = "not null";
        }
        sb.append(str);
        if (aVar != null) {
            C1592h.m7855a((Callable<TResult>) new C25078g<TResult>(aVar), (Executor) C6907h.m21516a());
        }
    }

    /* renamed from: a */
    private void m82587a(final Context context, final Aweme aweme) {
        VideoUrlModel videoUrlModel;
        if (!C25072c.m82581g(aweme) && C25072c.m82582h(aweme) != null) {
            C250751 r0 = new IDownloadListener() {
                public final void onCanceled(DownloadInfo downloadInfo) {
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                }

                public final void onFirstStart(DownloadInfo downloadInfo) {
                }

                public final void onFirstSuccess(DownloadInfo downloadInfo) {
                }

                public final void onPause(DownloadInfo downloadInfo) {
                }

                public final void onPrepare(DownloadInfo downloadInfo) {
                }

                public final void onProgress(DownloadInfo downloadInfo) {
                }

                public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                }

                public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                }

                public final void onStart(DownloadInfo downloadInfo) {
                }

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    String str;
                    Aweme aweme = aweme;
                    String str2 = "ttlive_cny_aweme_download";
                    if (downloadInfo == null) {
                        str = "";
                    } else {
                        str = downloadInfo.getErrorBytesLog();
                    }
                    C28498o.m93665a(aweme, str2, true, str);
                    C1592h.m7855a((Callable<TResult>) new C25080i<TResult>(aweme, downloadInfo), (Executor) C6907h.m21516a());
                    if (C7163a.m22363a()) {
                        Context context = context;
                        StringBuilder sb = new StringBuilder("Download Success with AwemeId = ");
                        sb.append(aweme.getAid());
                        C10761a.m31410e(context, sb.toString()).mo25750a();
                    }
                }

                /* renamed from: a */
                static final /* synthetic */ Object m82599a(Aweme aweme, DownloadInfo downloadInfo) throws Exception {
                    LiveAwesomeData i = C25072c.m82583i(aweme);
                    if (i == null) {
                        return null;
                    }
                    C6907h.m21524a("livesdk_topview_pre_download", (Map) C22984d.m75611a().mo59971a("anchor_id", i.uid).mo59973a("topview_video_id", aweme.getAid()).f60753a);
                    return null;
                }
            };
            Video video = aweme.getVideo();
            if (video != null) {
                if (C30199h.m98861a().getAwesomeSplashForceUseH264().booleanValue()) {
                    videoUrlModel = video.getPlayAddrH264();
                } else {
                    videoUrlModel = video.getPlayAddr();
                }
                if (videoUrlModel != null) {
                    videoUrlModel.setSourceId(aweme.getAid());
                    StringBuilder sb = new StringBuilder();
                    sb.append(f66184i);
                    sb.append(videoUrlModel.getSourceId());
                    if (!new File(sb.toString()).exists()) {
                        List urlList = videoUrlModel.getUrlList();
                        if (!C6307b.m19566a((Collection<T>) urlList)) {
                            String str = (String) urlList.get(0);
                            if (!TextUtils.isEmpty(str)) {
                                ArrayList arrayList = new ArrayList(urlList);
                                arrayList.remove(str);
                                int a = C20269b.m66720a(str, f66184i);
                                if (!Downloader.getInstance(context).isDownloading(a)) {
                                    DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(a);
                                    if (downloadInfo != null) {
                                        downloadInfo.getStatus();
                                    }
                                    String fileHash = videoUrlModel.getFileHash();
                                    C28498o.m93665a(aweme, "ttlive_cny_aweme_download", false, (String) null);
                                    C1592h.m7855a((Callable<TResult>) new C25077f<TResult>(aweme), (Executor) C6907h.m21516a());
                                    Downloader.with(context).url(str).backUpUrls(arrayList).savePath(f66184i).md5(fileHash).name(aweme.getAid()).showNotification(false).mainThreadListener(r0).download();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r6v0, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo65583a(java.util.List<com.p280ss.android.ugc.aweme.feed.model.Aweme> r6, android.content.Context r7) throws java.lang.Exception {
        /*
            r5 = this;
            java.util.Iterator r0 = r6.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r1
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.b r3 = f66183h
            if (r3 == 0) goto L_0x0018
            com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25069b.m82561a(r1)
        L_0x0018:
            java.lang.String r3 = "ttlive_cny_aweme_receive"
            r4 = 0
            com.p280ss.android.ugc.aweme.feed.p1234j.C28498o.m93665a(r1, r3, r4, r2)
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.h r2 = new com.ss.android.ugc.aweme.commercialize.splash.livesplash.h
            r2.<init>(r1)
            java.util.concurrent.ExecutorService r3 = com.p280ss.android.ugc.aweme.common.C6907h.m21516a()
            bolts.C1592h.m7855a(r2, r3)
            r5.m82587a(r7, r1)
            goto L_0x0004
        L_0x002e:
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.b r7 = f66183h
            if (r7 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.b r7 = f66183h
            r7.mo65578a(r6)
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25074d.mo65583a(java.util.List, android.content.Context):java.lang.Object");
    }
}
