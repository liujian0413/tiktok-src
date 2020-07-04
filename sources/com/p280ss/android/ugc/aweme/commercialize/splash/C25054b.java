package com.p280ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.commercialize.abtest.AwemeSplashPreloadExperiment;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.p1114a.C24504a.C24506b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25266be;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.feed.panel.C28598b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.main.C32903bh;
import com.p280ss.android.ugc.aweme.splash.SplashAdManagerHolder;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.b */
public class C25054b implements C25064i {

    /* renamed from: a */
    public static volatile boolean f66132a;

    /* renamed from: b */
    public static String f66133b;

    /* renamed from: l */
    private static volatile C25054b f66134l;

    /* renamed from: m */
    private static C25057d f66135m;

    /* renamed from: c */
    public boolean f66136c;

    /* renamed from: d */
    public boolean f66137d = true;

    /* renamed from: e */
    public boolean f66138e = true;

    /* renamed from: f */
    public String f66139f;

    /* renamed from: g */
    public boolean f66140g = true;

    /* renamed from: h */
    public boolean f66141h;

    /* renamed from: i */
    public boolean f66142i;

    /* renamed from: j */
    public boolean f66143j = true;

    /* renamed from: k */
    public boolean f66144k;

    /* renamed from: n */
    private String f66145n;

    /* renamed from: o */
    private boolean f66146o;

    /* renamed from: c */
    public final void mo65557c() {
        this.f66145n = null;
    }

    /* renamed from: d */
    public final String mo65558d() {
        return this.f66145n;
    }

    /* renamed from: f */
    public final boolean mo65559f() {
        return this.f66146o;
    }

    /* renamed from: a */
    public final void mo65550a(Context context, List<Aweme> list) {
        if (m82501i()) {
            for (Aweme r : list) {
                C24976t.m82273r(context, r, "teenage_mode");
            }
        } else if (m82500h()) {
            for (Aweme r2 : list) {
                C24976t.m82273r(context, r2, "low_device");
            }
        } else if (!C6307b.m19566a((Collection<T>) list)) {
            C1592h.m7853a((Callable<TResult>) new C25056c<TResult>(this, list, context));
        }
    }

    /* renamed from: a */
    public final boolean mo65552a(String str, boolean z) {
        if (m82501i() || AwemeAppData.m65765a().f60334n || m82500h()) {
            return false;
        }
        Aweme d = m82497d(str);
        if (d == null) {
            return false;
        }
        if (C25352e.m83340al(d)) {
            C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("5", C24506b.f64680a));
            C25063h.m82541a(false, d, "5");
            C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
            return false;
        } else if (!C28598b.m93921a(C6399b.m19921a(), d)) {
            C24976t.m82138ay(AwemeApplication.m21341a(), d);
            C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
            return false;
        } else if (this.f66143j && z && SplashAdManagerHolder.m132892a(C6399b.m19921a(), false)) {
            C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("10", m82499g()));
            C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
            C25063h.m82541a(false, d, "10");
            return false;
        } else if (AwemeAppData.m65765a().f60327g) {
            C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("2", m82499g()));
            C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
            C25063h.m82541a(false, d, "2");
            return false;
        } else if (!this.f66141h && C25352e.m83344ap(d)) {
            C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("7", m82499g()));
            C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
            C25063h.m82541a(false, d, "7");
            return false;
        } else if (this.f66141h && !this.f66142i) {
            C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("2", m82499g()));
            C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
            C25063h.m82541a(false, d, "2");
            return false;
        } else if (!C6399b.m19944t() && C32903bh.m106495a() && !f66132a) {
            C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("9", m82499g()));
            C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
            C25063h.m82541a(false, d, "9");
            return false;
        } else if (!this.f66137d) {
            C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("2", m82499g()));
            C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
            C25063h.m82541a(false, d, "2");
            return false;
        } else if (!this.f66141h && !this.f66144k && !AwemeAppData.m65765a().f60333m) {
            C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("2", m82499g()));
            C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
            C25063h.m82541a(false, d, "2");
            return false;
        } else if (!this.f66138e) {
            C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("6", C24506b.f64680a));
            C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
            C25063h.m82541a(false, d, "6");
            return false;
        } else {
            AwemeSplashInfo m = C25352e.m83230m(d);
            if (m == null) {
                C24976t.m82138ay(AwemeApplication.m21341a(), d);
                C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
                return false;
            } else if (m82495a(m)) {
                C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("4", C24506b.f64680a));
                C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
                C25063h.m82541a(false, d, "4");
                return false;
            } else if (!m82494a(d)) {
                C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
                return false;
            } else if (m.getHotShowType() != 1 || !this.f66136c) {
                C24976t.m82058a((Context) AwemeApplication.m21341a(), d, true, z);
                if (z) {
                    this.f66139f = str;
                    this.f66145n = str;
                }
                C25063h.m82541a(true, d, null);
                return true;
            } else {
                C24976t.m82156b((Context) AwemeApplication.m21341a(), d, mo65549a("2", m82499g()));
                C24976t.m82058a((Context) AwemeApplication.m21341a(), d, false, z);
                C25063h.m82541a(false, d, "2");
                return false;
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo65549a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_show_fail_type", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("ad_show_fail_type2_reason", str2);
            }
            jSONObject2.put("awemelaunch", this.f66143j ? "1" : "2");
            jSONObject.put("ad_extra_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: i */
    private static boolean m82501i() {
        return TimeLockRuler.isTeenModeON();
    }

    private C25054b() {
    }

    /* renamed from: e */
    public static void m82498e() {
        if (f66135m != null) {
            f66135m.mo65562a();
        }
    }

    /* renamed from: h */
    private static boolean m82500h() {
        if (f66135m != null) {
            return f66135m.mo65566b();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo65554b() {
        C25060e.m82535a(!TextUtils.isEmpty(this.f66139f));
        this.f66139f = null;
    }

    /* renamed from: a */
    public static C25054b m82490a() {
        if (f66134l == null) {
            synchronized (C25054b.class) {
                if (f66134l == null) {
                    f66133b = m82491a((Context) AwemeApplication.m21341a());
                    f66135m = new C25057d(f66133b);
                    f66134l = new C25054b();
                }
            }
        }
        return f66134l;
    }

    /* renamed from: g */
    private String m82499g() {
        if (AwemeAppData.m65765a().f60331k) {
            return "1";
        }
        if (AwemeAppData.m65765a().f60332l) {
            return "2";
        }
        if (!this.f66137d || (!this.f66141h && !this.f66144k && !AwemeAppData.m65765a().f60333m)) {
            return "3";
        }
        if (this.f66136c) {
            return "4";
        }
        if (!this.f66142i) {
            return "5";
        }
        return C24506b.f64680a;
    }

    /* renamed from: b */
    public final void mo65556b(boolean z) {
        this.f66146o = true;
    }

    /* renamed from: a */
    private static boolean m82495a(AwemeSplashInfo awemeSplashInfo) {
        return awemeSplashInfo.isInvalidAd();
    }

    /* renamed from: c */
    public static Aweme m82496c(String str) {
        return f66135m.mo65561a(str);
    }

    /* renamed from: d */
    private static Aweme m82497d(String str) {
        return f66135m.mo65565b(str);
    }

    /* renamed from: a */
    public static void m82492a(boolean z) {
        if (f66135m != null) {
            f66135m.mo65564a(z);
        }
    }

    /* renamed from: a */
    public final void mo65551a(Intent intent) {
        if (intent == null) {
            this.f66142i = false;
        } else {
            this.f66142i = C25266be.m83036a(intent);
        }
    }

    /* renamed from: b */
    public final Long mo65553b(String str) {
        if (str == null) {
            return null;
        }
        Aweme d = m82497d(str);
        if (C25352e.m83231n(d) && d.getAwemeRawAd().getSplashInfo().isDisableHotStartShow()) {
            return d.getAwemeRawAd().getAdId();
        }
        return null;
    }

    /* renamed from: a */
    private static String m82491a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(context.getPackageName());
        sb.append("/awemeSplashCache/");
        return sb.toString();
    }

    /* renamed from: a */
    private boolean m82494a(Aweme aweme) {
        Video video = aweme.getVideo();
        if (video == null) {
            C24976t.m82138ay(AwemeApplication.m21341a(), aweme);
            return false;
        }
        VideoUrlModel playAddr = video.getPlayAddr();
        if (playAddr == null || C6307b.m19566a((Collection<T>) playAddr.getUrlList())) {
            C24976t.m82138ay(AwemeApplication.m21341a(), aweme);
            return false;
        } else if (!TextUtils.isEmpty(mo65548a(aweme.getAid()))) {
            return true;
        } else {
            C24976t.m82156b((Context) AwemeApplication.m21341a(), aweme, mo65549a("1", C24506b.f64680a));
            return false;
        }
    }

    /* renamed from: a */
    public final String mo65548a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f66133b);
        sb.append(str);
        String sb2 = sb.toString();
        if (new File(sb2).exists()) {
            return sb2;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo65555b(Context context, List<String> list) {
        if (!m82501i() && !m82500h() && f66135m != null && !C6307b.m19566a((Collection<T>) list)) {
            boolean z = false;
            for (String a : list) {
                Aweme a2 = f66135m.mo65561a(a);
                if (a2 != null) {
                    C24976t.m82132as(context, a2);
                    if ((!z || C6384b.m19835a().mo15287a(AwemeSplashPreloadExperiment.class, true, "awesome_splash_preload_optimize", C6384b.m19835a().mo15295d().awesome_splash_preload_optimize, 0) == 0) && m82493a(context, a2)) {
                        z = true;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m82493a(final Context context, final Aweme aweme) {
        VideoUrlModel videoUrlModel;
        if (C25352e.m83340al(aweme)) {
            C24976t.m82273r(context, aweme, "past_data");
            return false;
        }
        AwemeSplashInfo m = C25352e.m83230m(aweme);
        if (m == null) {
            C24976t.m82273r(context, aweme, "splash_info_null");
            return false;
        }
        int preloadType = m.getPreloadType();
        if (!C6900g.m21454b().mo16943d()) {
            C24976t.m82273r(context, aweme, "no_network");
            return false;
        } else if (C6900g.m21454b().mo16942c() || preloadType != 1) {
            C250551 r0 = new IDownloadListener() {
                public final void onFirstSuccess(DownloadInfo downloadInfo) {
                }

                public final void onPause(DownloadInfo downloadInfo) {
                }

                public final void onProgress(DownloadInfo downloadInfo) {
                }

                public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
                }

                public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
                }

                public final void onCanceled(DownloadInfo downloadInfo) {
                    C24976t.m82137ax(context, aweme);
                }

                public final void onFirstStart(DownloadInfo downloadInfo) {
                    C24976t.m82136aw(context, aweme);
                }

                public final void onPrepare(DownloadInfo downloadInfo) {
                    C24976t.m82135av(context, aweme);
                }

                public final void onStart(DownloadInfo downloadInfo) {
                    C24976t.m82134au(context, aweme);
                }

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    C24976t.m82133at(context, aweme);
                    C25063h.m82542a(true, aweme, (String) null, Integer.valueOf(-1));
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    int i;
                    String str;
                    if (baseException == null) {
                        i = 0;
                    } else {
                        i = baseException.getErrorCode();
                    }
                    if (baseException == null) {
                        str = "";
                    } else {
                        str = baseException.getErrorMessage();
                    }
                    C24976t.m82046a(context, aweme, i, str);
                    if (i == 1034) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C25054b.f66133b);
                        sb.append(aweme.getAid());
                        File file = new File(sb.toString());
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                    C25063h.m82542a(false, aweme, str, Integer.valueOf(i));
                }
            };
            Video video = aweme.getVideo();
            if (video == null) {
                C24976t.m82273r(context, aweme, "video_null");
                return false;
            }
            if (C30199h.m98861a().getAwesomeSplashForceUseH264().booleanValue()) {
                videoUrlModel = video.getPlayAddrH264();
            } else {
                videoUrlModel = video.getPlayAddr();
            }
            if (videoUrlModel == null) {
                C24976t.m82273r(context, aweme, "video_url_model_null");
                return false;
            }
            videoUrlModel.setSourceId(aweme.getAid());
            StringBuilder sb = new StringBuilder();
            sb.append(f66133b);
            sb.append(videoUrlModel.getSourceId());
            if (new File(sb.toString()).exists()) {
                C24976t.m82273r(context, aweme, "video_exists");
                return false;
            }
            List urlList = videoUrlModel.getUrlList();
            if (C6307b.m19566a((Collection<T>) urlList)) {
                C24976t.m82273r(context, aweme, "video_url_list_null");
                return false;
            }
            String str = (String) urlList.get(0);
            if (TextUtils.isEmpty(str)) {
                C24976t.m82273r(context, aweme, "video_url_first_null");
                return false;
            }
            ArrayList arrayList = new ArrayList(urlList);
            arrayList.remove(str);
            int a = C20269b.m66720a(str, f66133b);
            if (Downloader.getInstance(context).isDownloading(a)) {
                C24976t.m82273r(context, aweme, "is_downloading");
                return false;
            }
            DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(a);
            int i = 100;
            if (downloadInfo != null) {
                i = downloadInfo.getStatus();
            }
            C24976t.m82266p(context, aweme, i);
            Downloader.with(context).url(str).backUpUrls(arrayList).savePath(f66133b).md5(videoUrlModel.getFileHash()).name(aweme.getAid()).showNotification(false).mainThreadListener(r0).download();
            return true;
        } else {
            C24976t.m82273r(context, aweme, "wifi_only");
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r10v0, types: [java.util.List, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo65547a(java.util.List<com.p280ss.android.ugc.aweme.feed.model.Aweme> r10, android.content.Context r11) throws java.lang.Exception {
        /*
            r9 = this;
            java.util.Iterator r0 = r10.iterator()
            r1 = 0
        L_0x0005:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r2
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82131ar(r11, r2)
            if (r1 == 0) goto L_0x0030
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.abtest.AwemeSplashPreloadExperiment> r4 = com.p280ss.android.ugc.aweme.commercialize.abtest.AwemeSplashPreloadExperiment.class
            r5 = 1
            java.lang.String r6 = "awesome_splash_preload_optimize"
            com.bytedance.ies.abmock.b r7 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r7 = r7.mo15295d()
            int r7 = r7.awesome_splash_preload_optimize
            r8 = 0
            int r3 = r3.mo15287a(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L_0x0037
        L_0x0030:
            boolean r3 = r9.m82493a(r11, r2)
            if (r3 == 0) goto L_0x0037
            r1 = 1
        L_0x0037:
            com.p280ss.android.ugc.aweme.commercialize.utils.C25301by.m83139a(r2)
            com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo r3 = r2.getMicroAppInfo()
            if (r3 == 0) goto L_0x0005
            com.ss.android.ugc.aweme.lego.a$f r3 = com.p280ss.android.ugc.aweme.lego.C7121a.m22248b()
            com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadManager$1 r4 = new com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadManager$1
            r4.<init>(r9, r2)
            com.ss.android.ugc.aweme.lego.a$f r2 = r3.mo18559a(r4)
            r2.mo18560a()
            goto L_0x0005
        L_0x0051:
            com.ss.android.ugc.aweme.commercialize.splash.d r11 = f66135m
            if (r11 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.commercialize.splash.d r11 = f66135m
            r11.mo65563a(r10)
        L_0x005a:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.splash.C25054b.mo65547a(java.util.List, android.content.Context):java.lang.Object");
    }
}
