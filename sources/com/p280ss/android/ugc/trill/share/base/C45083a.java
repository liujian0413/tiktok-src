package com.p280ss.android.ugc.trill.share.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import bolts.C1592h;
import com.C1642a;
import com.aweme.storage.C1913c;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.livesdk.browser.C3947a;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.ads.AdError;
import com.google.common.base.C17457s;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.p294e.C6806b;
import com.p280ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.DownloadMessageMonitorUtils;
import com.p280ss.android.ugc.aweme.app.DownloadMessageMonitorUtils.ForbidType;
import com.p280ss.android.ugc.aweme.app.download.C22968d;
import com.p280ss.android.ugc.aweme.app.p305g.C22983b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28442a;
import com.p280ss.android.ugc.aweme.feed.panel.C28633q;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.C28687a;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28689b;
import com.p280ss.android.ugc.aweme.feedback.runtime.behavior.C29096c.C29097a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.initializer.C32132j;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p280ss.android.ugc.aweme.share.C37974ak;
import com.p280ss.android.ugc.aweme.share.C38251s;
import com.p280ss.android.ugc.aweme.share.experiment.WhatsappNeedShareLinkExperiment;
import com.p280ss.android.ugc.aweme.share.experiment.WhatsppShareTypeExperiment;
import com.p280ss.android.ugc.aweme.share.libra.LongVideoDownloadOptimize;
import com.p280ss.android.ugc.aweme.share.libra.MTEndWatermarkExperiment;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39874g;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39876i;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39877j;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39881n;
import com.p280ss.android.ugc.aweme.shortvideo.festival.VideoProcess;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41564p;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41647a;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41647a.C41651a;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.C43167r;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.local.C43247a;
import com.p280ss.android.ugc.aweme.video.p1700d.C43207b;
import com.p280ss.android.ugc.aweme.watermark.C43419l;
import com.p280ss.android.ugc.aweme.watermark.C43427r;
import com.p280ss.android.ugc.trill.share.base.C45104i.C45105a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.trill.share.base.a */
public final class C45083a {

    /* renamed from: B */
    public static boolean f115853B;

    /* renamed from: A */
    public boolean f115854A;

    /* renamed from: C */
    public C17457s<IWaterMarkService> f115855C;

    /* renamed from: D */
    public String f115856D;

    /* renamed from: E */
    public String f115857E;

    /* renamed from: F */
    public boolean f115858F;

    /* renamed from: G */
    C43427r f115859G;

    /* renamed from: H */
    private final String f115860H;

    /* renamed from: I */
    private final String f115861I;

    /* renamed from: J */
    private String f115862J;

    /* renamed from: K */
    private int f115863K;

    /* renamed from: L */
    private boolean f115864L;

    /* renamed from: M */
    private C25652b f115865M;

    /* renamed from: N */
    private int f115866N;

    /* renamed from: O */
    private C43419l f115867O;

    /* renamed from: P */
    private Handler f115868P;

    /* renamed from: Q */
    private long f115869Q;

    /* renamed from: R */
    private String f115870R;

    /* renamed from: S */
    private String f115871S;

    /* renamed from: T */
    private JSONObject f115872T;

    /* renamed from: U */
    private Runnable f115873U;

    /* renamed from: a */
    public final String f115874a;

    /* renamed from: b */
    public String f115875b;

    /* renamed from: c */
    public String f115876c;

    /* renamed from: d */
    public int f115877d;

    /* renamed from: e */
    public int f115878e;

    /* renamed from: f */
    public C41647a f115879f;

    /* renamed from: g */
    public String f115880g;

    /* renamed from: h */
    public String f115881h;

    /* renamed from: i */
    public String f115882i;

    /* renamed from: j */
    protected Context f115883j;

    /* renamed from: k */
    public C28689b f115884k;

    /* renamed from: l */
    public String f115885l;

    /* renamed from: m */
    public UrlModel f115886m;

    /* renamed from: n */
    public boolean f115887n;

    /* renamed from: o */
    public int f115888o;

    /* renamed from: p */
    public Comment f115889p;

    /* renamed from: q */
    public Aweme f115890q;

    /* renamed from: r */
    public C39876i f115891r;

    /* renamed from: s */
    public long f115892s;

    /* renamed from: t */
    public long f115893t;

    /* renamed from: u */
    public C45104i f115894u;

    /* renamed from: v */
    public C43247a f115895v;

    /* renamed from: w */
    public C45096c f115896w;

    /* renamed from: x */
    public C45095b f115897x;

    /* renamed from: y */
    public boolean f115898y;

    /* renamed from: z */
    public boolean f115899z;

    /* renamed from: com.ss.android.ugc.trill.share.base.a$a */
    public static class C45094a {

        /* renamed from: a */
        public UrlModel f115913a;

        /* renamed from: b */
        public String f115914b;

        /* renamed from: c */
        public boolean f115915c;

        /* renamed from: a */
        public final void mo107653a(Aweme aweme, boolean z, boolean z2) {
            this.f115915c = z;
            if (z || C28687a.m94368c(aweme) || z2) {
                this.f115913a = aweme.getVideo().getPlayAddrH264();
                if (this.f115913a != null) {
                    String h = C43122ff.m136777h(aweme.getAuthor());
                    if (z2) {
                        this.f115915c = false;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f115913a.getUri());
                        sb.append(h);
                        sb.append("tag_no_water");
                        this.f115914b = C6306c.m19561a(sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f115913a.getUri());
                        sb2.append(h);
                        this.f115914b = C6306c.m19561a(sb2.toString());
                    }
                }
            } else if (!MTEndWatermarkExperiment.INSTANCE.enable() || !aweme.getVideo().hasEndWaterMark()) {
                this.f115913a = aweme.getVideo().getDownloadAddr();
                this.f115914b = C6306c.m19561a(aweme.getVideo().getDownloadAddr().getUri());
            } else {
                this.f115913a = aweme.getVideo().getSuffixLogoDownloadAddr();
                this.f115914b = C6306c.m19561a(aweme.getVideo().getSuffixLogoDownloadAddr().getUri());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.a$b */
    public class C45095b {

        /* renamed from: a */
        public long f115916a;

        /* renamed from: c */
        private String f115918c = m142231c(this.f115920e);

        /* renamed from: d */
        private int f115919d;

        /* renamed from: e */
        private String f115920e;

        /* renamed from: f */
        private int f115921f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C45095b mo107654a(String str) {
            this.f115920e = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C45095b mo107659b(boolean z) {
            this.f115921f = z ? 1 : 0;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C45095b mo107655a(boolean z) {
            this.f115919d = z ? 1 : 0;
            return this;
        }

        public C45095b() {
        }

        /* renamed from: c */
        private static String m142231c(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(TeaAgent.getServerDeviceId());
            sb.append(System.currentTimeMillis());
            return C6306c.m19561a(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo107660b(String str) {
            long currentTimeMillis = System.currentTimeMillis();
            C45100e eVar = new C45100e(this, str, currentTimeMillis, currentTimeMillis - this.f115916a);
            C1592h.m7853a((Callable<TResult>) eVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo107657a(long j) {
            this.f115916a = j;
            C6907h.m21524a("download_start", (Map) new C22984d().mo59971a("start_download", this.f115916a).mo59973a("download_id", this.f115918c).mo59970a("is_buffer", 0).mo59970a("is_self_video", this.f115921f).mo59970a("is_server_watermark", this.f115919d).mo59973a("aweme_id", C45083a.this.f115890q.getAid()).mo59973a("download_url", C45083a.this.f115885l).f60753a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Void mo107656a(String str, long j, long j2) throws Exception {
            String d = C42973bg.m136432d(str);
            String str2 = str;
            long length = new File(str).length();
            mo107658a(j, length, 0, "");
            boolean equals = TextUtils.equals(d, "20");
            String str3 = "aweme_download_error_rate";
            C6869c cVar = new C6869c();
            String str4 = "Download_Rate";
            long j3 = 0;
            if (j2 != 0) {
                j3 = length / j2;
            }
            C6877n.m21444a(str3, 0, cVar.mo16886a(str4, Long.valueOf(j3)).mo16886a("Download_duration", Long.valueOf(j2)).mo16886a("file_size", Long.valueOf(length)).mo16887a("errorDesc", "success").mo16885a("errorCode", Integer.valueOf(-1)).mo16887a("url", C45083a.this.f115885l).mo16882a("isMp4", Boolean.valueOf(equals)).mo16888b());
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo107658a(long j, long j2, int i, String str) {
            C22984d a = new C22984d().mo59971a("end_download", System.currentTimeMillis()).mo59973a("download_id", this.f115918c).mo59971a("package_size", j2).mo59971a("duration", j - this.f115916a).mo59970a("is_buffer", 0).mo59970a("is_self_video", this.f115921f).mo59973a("aweme_id", C45083a.this.f115890q.getAid()).mo59973a("download_url", C45083a.this.f115885l).mo59970a("is_server_watermark", this.f115919d);
            if (j2 == -1) {
                a.mo59970a("error_code", i).mo59973a("error_message", str);
            }
            C6907h.m21524a("download_end", (Map) a.f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.base.a$c */
    public class C45096c extends AbsDownloadListener {

        /* renamed from: b */
        private C45095b f115923b;

        public final void onStart(DownloadInfo downloadInfo) {
            C45083a.this.f115899z = true;
            this.f115923b.mo107657a(System.currentTimeMillis());
        }

        public final void onCanceled(DownloadInfo downloadInfo) {
            C45083a.this.f115899z = false;
            if (C45083a.this.f115898y) {
                C7276d.m22816c(C45083a.this.f115876c);
                C45083a.this.mo107642g();
                C45083a.this.f115898y = false;
            }
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            int curBytes = (int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f);
            if (C45083a.this.f115883j != null) {
                C45083a.this.f115878e = C45083a.this.f115891r.mo99298a(VideoProcess.VIDEO_DOWNLOAD_TYPE, curBytes);
                C45083a.this.mo107643h();
            }
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            C45083a.this.f115899z = false;
            if (C45083a.this.f115898y) {
                C7276d.m22816c(C45083a.this.f115876c);
                C45083a.this.mo107642g();
                C45083a.this.f115898y = false;
                return;
            }
            C45083a.this.mo107635a(C45083a.this.f115890q.getAid(), C45083a.this.f115890q.getAwemeType());
            String targetFilePath = downloadInfo.getTargetFilePath();
            if (targetFilePath != null) {
                C45083a.this.f115875b = targetFilePath;
                if (targetFilePath.length() != 0) {
                    File file = new File(targetFilePath);
                    if (this.f115923b.f115916a != 0) {
                        C45083a.this.f115892s = System.currentTimeMillis() - this.f115923b.f115916a;
                        C45083a.this.f115893t = file.length() / C45083a.this.f115892s;
                        C29097a.m95452a().mo74527a("download_success");
                        this.f115923b.mo107660b(targetFilePath);
                        if (!C45083a.this.f115858F && !C45083a.this.f115887n) {
                            C37974ak.m121281a(targetFilePath, Long.valueOf(C45083a.this.f115892s), C45083a.this.f115885l, false, Integer.valueOf(-1), "success", Boolean.valueOf(C38251s.m122194a(C45083a.this.f115890q, C45083a.this.f115881h)));
                            C37974ak.m121282a(C45083a.this.f115890q.getAid(), C45083a.this.f115882i, C45083a.this.f115881h, "short", C37974ak.m121278a(C45083a.this.f115886m), 0);
                        }
                    }
                    C45083a.this.mo107631a();
                    if (file.length() >= 2000 || !C30199h.m98861a().getSupportFilterErrorFile().booleanValue()) {
                        C45083a.this.mo107638c();
                    } else {
                        C45083a.this.mo107642g();
                        if (C45083a.this.f115885l.startsWith("http://")) {
                            C45083a.this.f115885l = C45083a.this.f115885l.replace("http://", "https://");
                            if (C45083a.this.f115895v == null) {
                                C45083a.this.f115895v = new C43247a();
                            }
                            if (C45083a.this.f115896w == null) {
                                C45083a.this.f115896w = new C45096c(C45083a.this.f115897x);
                            }
                            C45083a.this.f115895v.mo105001a((AbsDownloadListener) C45083a.this.f115896w);
                            C45083a.this.f115885l = C22968d.m75564a(C45083a.this.f115890q, C45083a.this.f115885l);
                            C43247a aVar = C45083a.this.f115895v;
                            Context context = C45083a.this.f115883j;
                            String aid = C45083a.this.f115890q.getAid();
                            String str = C45083a.this.f115885l;
                            StringBuilder sb = new StringBuilder();
                            sb.append(C45083a.this.f115880g);
                            sb.append(".mp4");
                            aVar.mo105000a(context, aid, str, sb.toString(), C45083a.this.f115874a);
                            return;
                        }
                        C45083a.this.f115877d = 3;
                        onFailed(null, new BaseException(-1, "下载被劫持"));
                    }
                }
            }
        }

        public C45096c(C45095b bVar) {
            this.f115923b = bVar;
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            boolean z;
            BaseException baseException2 = baseException;
            C45083a.this.f115899z = false;
            if (baseException2 == null) {
                C45083a.this.mo107639d();
            } else if (C45083a.this.f115883j != null) {
                if (C45083a.this.f115898y) {
                    C7276d.m22816c(C45083a.this.f115876c);
                    C45083a.this.mo107642g();
                    C45083a.this.f115898y = false;
                    return;
                }
                DownloadMessageMonitorUtils.m74933a(C45083a.this.f115890q, baseException2, C45083a.this.f115885l);
                this.f115923b.mo107658a(System.currentTimeMillis(), -1, baseException.getErrorCode(), baseException.getErrorMessage());
                Long valueOf = Long.valueOf(System.currentTimeMillis() - this.f115923b.f115916a);
                String str = C45083a.this.f115885l;
                if (C45083a.this.f115858F || C45083a.this.f115887n) {
                    z = true;
                } else {
                    z = false;
                }
                C37974ak.m121281a(null, valueOf, str, z, Integer.valueOf(baseException.getErrorCode()), baseException.getErrorMessage(), Boolean.valueOf(C38251s.m122194a(C45083a.this.f115890q, C45083a.this.f115881h)));
                if (C45083a.this.f115877d < 3) {
                    C45083a.this.f115877d++;
                    if (C45083a.this.f115886m != null && !C6307b.m19566a((Collection<T>) C45083a.this.f115886m.getUrlList())) {
                        C45083a.this.f115885l = C6806b.m21144a().mo16627a((String) C45083a.this.f115886m.getUrlList().get(C45083a.this.f115877d % C45083a.this.f115886m.getUrlList().size()));
                    }
                    C45083a.this.f115885l = C43207b.m136999a(C45083a.this.f115885l);
                    if (C45083a.this.f115895v == null) {
                        C45083a.this.f115895v = new C43247a();
                    }
                    if (C45083a.this.f115896w == null) {
                        C45083a.this.f115896w = new C45096c(C45083a.this.f115897x);
                    }
                    C45083a.this.f115895v.mo105001a((AbsDownloadListener) C45083a.this.f115896w);
                    C45083a.this.f115885l = C22968d.m75564a(C45083a.this.f115890q, C45083a.this.f115885l);
                    C43247a aVar = C45083a.this.f115895v;
                    Context context = C45083a.this.f115883j;
                    String aid = C45083a.this.f115890q.getAid();
                    String str2 = C45083a.this.f115885l;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C45083a.this.f115880g);
                    sb.append(".mp4");
                    aVar.mo105000a(context, aid, str2, sb.toString(), C45083a.this.f115874a);
                    return;
                }
                C45083a.this.mo107639d();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(baseException.getErrorMessage());
                sb2.append("    ***  重试次数 *** :");
                sb2.append(C45083a.this.f115877d);
                String sb3 = sb2.toString();
                if (C45101f.m142239a(AwemeApplication.m21341a())) {
                    C6877n.m21444a("aweme_download_error_rate", 1, C6869c.m21381a().mo16885a("errorCode", Integer.valueOf(baseException.getErrorCode())).mo16887a("errorDes", sb3).mo16888b());
                }
                C29097a.m95452a().mo74528a("download_error", String.valueOf(baseException.getErrorCode()));
                C22983b.m75610a("aweme_movie_download_log", "", sb3, C45083a.this.f115885l);
            }
        }
    }

    /* renamed from: c */
    public final void mo107638c() {
        m142205m();
    }

    /* renamed from: g */
    public final void mo107642g() {
        C7276d.m22816c(this.f115875b);
    }

    /* renamed from: m */
    private void m142205m() {
        C1592h.m7855a((Callable<TResult>) new C45099d<TResult>(this), (Executor) C7258h.m22730c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ Void mo107645j() throws Exception {
        ((IWaterMarkService) this.f115855C.mo44946a()).prepareDataForI18n(this.f115867O);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ Void mo107646k() throws Exception {
        ((IWaterMarkService) this.f115855C.mo44946a()).prepareDataForI18n(this.f115867O);
        return null;
    }

    /* renamed from: h */
    public final void mo107643h() {
        if (this.f115878e >= 100) {
            this.f115878e = 100;
        } else if (this.f115878e < 0) {
            this.f115878e = 0;
        }
        C6726a.m20844b(this.f115873U);
    }

    /* renamed from: l */
    private boolean m142204l() {
        if (!C7276d.m22826g()) {
            C10761a.m31399c(this.f115883j, (int) R.string.djg).mo25750a();
            return false;
        } else if (C7276d.m22827h() >= 20971520) {
            return true;
        } else {
            C10761a.m31399c(this.f115883j, (int) R.string.djh).mo25750a();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo107631a() {
        C6907h.onEvent(MobClick.obtain().setEventName(this.f115870R).setLabelName(this.f115871S).setValue(String.valueOf(System.currentTimeMillis() - this.f115869Q)).setJsonObject(this.f115872T));
    }

    /* renamed from: b */
    public final void mo107637b() {
        if (this.f115883j instanceof Activity) {
            if (!((Activity) this.f115883j).isFinishing()) {
                if (VERSION.SDK_INT >= 17 && ((Activity) this.f115883j).isDestroyed()) {
                    return;
                }
            } else {
                return;
            }
        }
        if (this.f115879f != null && this.f115879f.isShowing()) {
            this.f115879f.dismiss();
        }
    }

    /* renamed from: d */
    public final void mo107639d() {
        this.f115899z = false;
        this.f115854A = false;
        if (this.f115868P.hasMessages(1)) {
            this.f115868P.removeMessages(1);
        }
        if (this.f115898y) {
            C7276d.m22816c(this.f115876c);
            mo107642g();
        }
        C6726a.m20844b(new Runnable() {
            public final void run() {
                C45083a.this.mo107642g();
                C28633q.f75451d = false;
                if (C45083a.this.f115884k != null) {
                    C45083a.this.f115884k.mo63021b();
                }
                if (C45083a.this.f115883j != null) {
                    C45083a.this.mo107637b();
                    if (C45083a.this.f115888o == -113) {
                        C10761a.m31399c(C45083a.this.f115883j, (int) R.string.dsi).mo25750a();
                        return;
                    }
                    C10761a.m31399c(C45083a.this.f115883j, (int) R.string.dj0).mo25750a();
                }
            }
        });
    }

    /* renamed from: e */
    public final void mo107640e() {
        this.f115899z = false;
        this.f115854A = false;
        if (this.f115868P.hasMessages(1)) {
            this.f115868P.removeMessages(1);
        }
        if (this.f115898y) {
            C7276d.m22816c(this.f115876c);
            mo107642g();
            this.f115898y = false;
            return;
        }
        mo107642g();
        C6726a.m20844b(new Runnable() {
            public final void run() {
                C45083a.this.mo107637b();
                C28633q.f75451d = false;
                if (C45083a.this.f115883j != null && C45083a.this.f115884k != null) {
                    C45083a.this.f115884k.mo63020a(C45083a.this.f115876c);
                }
            }
        });
    }

    /* renamed from: f */
    public final boolean mo107641f() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f115861I);
        sb.append(this.f115880g);
        sb.append("_mute.mp4");
        this.f115862J = sb.toString();
        int a = C38251s.m122192a(this.f115876c, this.f115862J);
        C7276d.m22816c(this.f115876c);
        boolean z = true;
        if (a != 0) {
            String str = this.f115876c;
            Long valueOf = Long.valueOf(this.f115892s);
            String str2 = this.f115885l;
            if (!this.f115858F && !this.f115887n) {
                z = false;
            }
            C37974ak.m121280a(str, valueOf, str2, z, Integer.valueOf(a));
            C7276d.m22816c(this.f115862J);
            return false;
        }
        this.f115876c = this.f115862J;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ Void mo107644i() throws Exception {
        m142199a("download_time", "add_watermark");
        if (this.f115883j == null) {
            return null;
        }
        C7276d.m22803a(this.f115860H, false);
        if (this.f115858F || this.f115887n) {
            this.f115894u = new C45105a(this.f115890q, this.f115880g).mo107667a(this.f115858F).mo107669b(this.f115887n).mo107670c(true).mo107668a();
            this.f115894u.mo107665a();
            C29097a.m95452a().mo74527a("water_mark_start");
            m142206n();
        } else {
            C7276d.m22820d(this.f115875b, this.f115876c);
            if (!C38251s.m122194a(this.f115890q, this.f115881h) || mo107641f()) {
                mo107640e();
            } else {
                mo107639d();
                return null;
            }
        }
        return null;
    }

    /* renamed from: n */
    private void m142206n() {
        this.f115899z = false;
        this.f115854A = true;
        this.f115867O.mo105329b(this.f115892s).mo105324a(this.f115893t);
        if (this.f115864L && this.f115889p != null) {
            File commentShareFile = C24217a.m79549a().getCommentShareFile(this.f115883j);
            if (commentShareFile != null) {
                this.f115867O.mo105337e(true);
                this.f115867O.mo105336e(commentShareFile.getPath());
                this.f115867O.mo105338f(C24217a.m79549a().getCommentShareis1To1(this.f115890q.getVideo().getHeight(), this.f115890q.getVideo().getWidth()));
            }
        }
        if (!this.f115887n || !MTEndWatermarkExperiment.INSTANCE.enable()) {
            this.f115866N = 1;
        } else {
            this.f115866N = 2;
        }
        C37974ak.m121282a(this.f115890q.getAid(), this.f115882i, this.f115881h, "short", null, this.f115866N);
        ((IWaterMarkService) this.f115855C.mo44946a()).waterMark(this.f115867O);
    }

    /* renamed from: c */
    private static boolean m142203c(Aweme aweme) {
        if (aweme == null || !C6903bc.m21487f().mo84747b(aweme) || aweme.getVideoControl() == null || aweme.getVideoControl().preventDownloadType != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo107632a(Aweme aweme) {
        mo107634a(aweme, false);
    }

    /* renamed from: b */
    public static boolean m142202b(Aweme aweme) {
        boolean z;
        boolean a = C6384b.m19835a().mo15292a(WhatsappNeedShareLinkExperiment.class, true, "whatsapp_need_share_link", C6384b.m19835a().mo15295d().whatsapp_need_share_link, false);
        if (C6384b.m19835a().mo15287a(WhatsppShareTypeExperiment.class, true, "whatsapp_share_type", C6384b.m19835a().mo15295d().whatsapp_share_type, 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (!a || aweme == null) {
            return false;
        }
        boolean a2 = C28687a.m94364a(aweme, false);
        C45094a aVar = new C45094a();
        aVar.mo107653a(aweme, a2, false);
        if (C37974ak.m121278a(aVar.f115913a) != null || a2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m142199a(String str, String str2) {
        m142200a(str, str2, (JSONObject) null);
    }

    private C45083a(Context context, boolean z) {
        this.f115855C = new C17457s<IWaterMarkService>() {

            /* renamed from: a */
            IWaterMarkService f115900a;

            /* access modifiers changed from: private */
            /* renamed from: b */
            public IWaterMarkService mo44946a() {
                if (this.f115900a == null) {
                    this.f115900a = (IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class);
                }
                return this.f115900a;
            }
        };
        this.f115856D = "";
        this.f115857E = "";
        this.f115868P = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                if (1 == message.what && C45083a.this.f115879f != null && C45083a.this.f115879f.isShowing()) {
                    C45083a.this.f115879f.f108227b = new C41651a() {
                        /* renamed from: a */
                        public final void mo102300a() {
                            String str;
                            C45083a.this.f115898y = true;
                            C45083a.f115853B = true;
                            if (C45083a.this.f115899z) {
                                if (C45083a.this.f115895v != null) {
                                    C45083a.this.f115895v.mo105002b(C45083a.this.f115883j);
                                }
                                C29097a.m95452a().mo74527a("download_cancel");
                            } else {
                                if (C45083a.this.f115854A) {
                                    ((IWaterMarkService) C45083a.this.f115855C.mo44946a()).cancelWaterMark();
                                }
                                C29097a.m95452a().mo74527a("water_mark_cancel");
                            }
                            C45083a.this.mo107639d();
                            String str2 = "download_cancel";
                            C22984d a = new C22984d().mo59973a("enter_from", C45083a.this.f115856D);
                            String str3 = "group_id";
                            if (C45083a.this.f115890q == null) {
                                str = "";
                            } else {
                                str = C45083a.this.f115890q.getAid();
                            }
                            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
                        }
                    };
                    C45083a.this.f115879f.mo102289b((int) C9738o.m28708b(C45083a.this.f115883j, 180.0f));
                    C45083a.this.f115879f.mo102288a(true, 0.0f, C45083a.this.f115883j);
                }
            }
        };
        this.f115869Q = -1;
        this.f115873U = new Runnable() {
            public final void run() {
                if (C45083a.this.f115879f != null && C45083a.this.f115879f.isShowing()) {
                    C45083a.this.f115879f.mo102287a(C45083a.this.f115878e);
                }
            }
        };
        this.f115859G = new C43427r() {
            /* renamed from: a */
            public final void mo105352a(int i) {
                if (C45083a.this.f115883j != null) {
                    C45083a.this.f115878e = C45083a.this.f115891r.mo99298a(VideoProcess.VIDEO_WATER_TYPE, i);
                    C45083a.this.mo107643h();
                }
            }

            /* renamed from: a */
            public final void mo105353a(String str) {
                C45083a.this.f115854A = false;
                if (C45083a.this.f115898y) {
                    C45083a.this.f115898y = false;
                    return;
                }
                if (C45083a.this.f115894u != null) {
                    C45083a.this.f115894u.mo107666a(1);
                }
                C29097a.m95452a().mo74527a("water_mark_success");
                if (!C38251s.m122194a(C45083a.this.f115890q, C45083a.this.f115881h) || C45083a.this.mo107641f()) {
                    C45083a.this.mo107640e();
                } else {
                    C45083a.this.mo107639d();
                }
            }

            /* renamed from: b */
            public final void mo105354b(int i) {
                C45083a.this.f115854A = false;
                C45083a.this.f115888o = i;
                if (C45083a.this.f115894u != null) {
                    C45083a.this.f115894u.mo107666a(0);
                }
                C29097a.m95452a().mo74527a("water_mark_error");
                DownloadMessageMonitorUtils.m74936a(C45083a.this.f115875b, C45083a.this.f115876c, C45083a.this.f115890q);
                if (C45083a.this.f115898y) {
                    C7276d.m22816c(C45083a.this.f115876c);
                    C45083a.this.mo107642g();
                    C45083a.this.f115898y = false;
                    return;
                }
                C45083a.this.mo107639d();
            }
        };
        this.f115883j = context;
        this.f115887n = z;
        this.f115874a = C41564p.m132375b(context);
        this.f115860H = C41564p.m132382c(context);
        this.f115861I = C41564p.m132387d(context);
        this.f115865M = new C25652b();
        this.f115865M.mo66536a(new C28442a());
    }

    /* renamed from: a */
    public final void mo107634a(Aweme aweme, boolean z) {
        mo107633a(aweme, (String) null, z);
    }

    /* renamed from: a */
    public final void mo107636a(boolean z, Aweme aweme) {
        if (this.f115858F || this.f115887n || this.f115864L) {
            this.f115867O = new C43419l();
            this.f115867O.mo105327a(this.f115875b).mo105330b(this.f115876c).mo105325a(new C32132j(this.f115890q.getAuthor()), this.f115890q.getVideo()).mo105328a(this.f115858F).mo105331b(this.f115887n).mo105333c(false).mo105332c(C39881n.m127622a().mo99303c()).mo105326a(this.f115859G).mo105335d(C6399b.m19944t()).mo105334d(this.f115885l);
        }
        if (z) {
            C1913c.m8857a("share");
            C7276d.m22803a(this.f115874a, false);
            m142199a("download_time", "download");
            C6877n.m21447a("ug_save_video_start", new JSONObject());
            this.f115885l = C43207b.m136999a(this.f115885l);
            this.f115897x = new C45095b().mo107654a(this.f115880g).mo107659b(C28687a.m94363a(aweme)).mo107655a(aweme.getVideo().isHasWaterMark());
            this.f115899z = true;
            if (this.f115895v == null) {
                this.f115895v = new C43247a();
            }
            if (this.f115896w == null) {
                this.f115896w = new C45096c(this.f115897x);
            }
            this.f115895v.mo105001a((AbsDownloadListener) this.f115896w);
            this.f115885l = C22968d.m75564a(aweme, this.f115885l);
            C43247a aVar = this.f115895v;
            Context context = this.f115883j;
            String aid = aweme.getAid();
            String str = this.f115885l;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f115880g);
            sb.append(".mp4");
            aVar.mo105000a(context, aid, str, sb.toString(), this.f115874a);
            C29097a.m95452a().mo74527a("download_start");
            if (this.f115879f != null && this.f115879f.isShowing()) {
                this.f115879f.f108227b = new C41651a() {
                    /* renamed from: a */
                    public final void mo102300a() {
                        String str;
                        if (C45083a.this.f115895v != null) {
                            C45083a.this.f115898y = true;
                            C29097a.m95452a().mo74527a("download_cancel");
                            C45083a.this.f115895v.mo104998a(C45083a.this.f115883j);
                            C45083a.this.mo107637b();
                            String str2 = "download_cancel";
                            C22984d a = new C22984d().mo59973a("enter_from", "share_event").mo59970a("is_long_item", C32718a.m105910b(C45083a.this.f115883j) ? 1 : 0);
                            String str3 = "group_id";
                            if (C45083a.this.f115890q == null) {
                                str = "";
                            } else {
                                str = C45083a.this.f115890q.getAid();
                            }
                            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("download_method", C45083a.this.f115857E).f60753a);
                        }
                    }
                };
                this.f115879f.mo102288a(true, 1.0f, this.f115883j);
            }
            if (this.f115858F || this.f115887n) {
                C1592h.m7855a((Callable<TResult>) new C45098c<TResult>(this), (Executor) C7258h.m22730c());
            }
        } else {
            this.f115891r = new C39877j(false, true);
            mo107638c();
        }
    }

    /* renamed from: a */
    public final void mo107635a(String str, int i) {
        if (!this.f115864L || C24217a.m79549a().shouldAddShareCount()) {
            switch (this.f115863K) {
                case 0:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(0));
                    this.f115882i = "homepage_hot";
                    return;
                case 1:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(1));
                    this.f115882i = "homepage_follow";
                    return;
                case 2:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(2));
                    this.f115882i = "homepage_fresh";
                    return;
                case 1000:
                case AdError.SERVER_ERROR_CODE /*2000*/:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(3));
                    this.f115882i = "personal_homepage";
                    return;
                case 1001:
                case AdError.INTERNAL_ERROR_CODE /*2001*/:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(4));
                    this.f115882i = "personal_collection";
                    return;
                case 3002:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(5));
                    this.f115882i = "challenge_hot";
                    return;
                case 3003:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(9));
                    this.f115882i = "challenge";
                    return;
                case 4000:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(6));
                    this.f115882i = "music_hot";
                    return;
                case 4001:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(8));
                    this.f115882i = "music_new";
                    return;
                case 5000:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(7));
                    this.f115882i = "found";
                    return;
                case 8000:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(20));
                    this.f115882i = "window_follow";
                    return;
                default:
                    this.f115865M.mo56976a(str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i));
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m142200a(String str, String str2, JSONObject jSONObject) {
        this.f115869Q = System.currentTimeMillis();
        this.f115870R = str;
        this.f115871S = str2;
        this.f115872T = null;
    }

    /* renamed from: b */
    private void m142201b(final Aweme aweme, String str, boolean z) {
        boolean z2;
        boolean z3;
        final boolean z4;
        boolean z5;
        double d;
        String str2;
        String str3;
        this.f115890q = aweme;
        if (!this.f115887n || !C28687a.m94364a(aweme, true)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f115887n = z2;
        if (this.f115887n || C28687a.m94364a(aweme, false) || this.f115864L) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f115858F = z3;
        if (C39874g.m127612b()) {
            this.f115858F = true;
        }
        C45094a aVar = new C45094a();
        aVar.mo107653a(aweme, this.f115858F, z);
        this.f115858F = aVar.f115915c;
        this.f115880g = aVar.f115914b;
        this.f115886m = aVar.f115913a;
        if (this.f115886m == null || C6307b.m19566a((Collection<T>) this.f115886m.getUrlList())) {
            DownloadMessageMonitorUtils.m74932a(ForbidType.DOWNLOAD_URL, aweme);
            return;
        }
        if (this.f115886m != null && !C6307b.m19566a((Collection<T>) this.f115886m.getUrlList())) {
            this.f115885l = C6806b.m21144a().mo16627a((String) this.f115886m.getUrlList().get(0));
            if (C43167r.m136906c(this.f115890q)) {
                this.f115885l = C6806b.m21144a().mo16627a((String) this.f115886m.getUrlList().get(this.f115886m.getUrlList().size() - 1));
                if (this.f115885l.contains("ratio")) {
                    this.f115885l = this.f115885l.replaceAll("(ratio=[^&]*)", "ratio=default");
                } else {
                    Builder buildUpon = Uri.parse(this.f115885l).buildUpon();
                    buildUpon.appendQueryParameter("ratio", "default");
                    this.f115885l = buildUpon.toString();
                }
            }
        }
        if (this.f115864L && this.f115889p != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f115861I);
            sb.append(this.f115880g);
            sb.append(this.f115889p.getCid());
            sb.append("_comment.mp4");
            this.f115876c = sb.toString();
        } else if (!this.f115887n) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f115861I);
            sb2.append(this.f115880g);
            sb2.append(".mp4");
            this.f115876c = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f115861I);
            sb3.append(this.f115880g);
            sb3.append("_ins.mp4");
            this.f115876c = sb3.toString();
        }
        if (C7276d.m22812b(this.f115876c)) {
            mo107640e();
            return;
        }
        if (this.f115879f == null) {
            this.f115879f = C41647a.m132569a(this.f115883j, this.f115883j.getResources().getString(R.string.diz), str);
            String str4 = "download_process_popup_show";
            C22984d a = new C22984d().mo59973a("enter_from", this.f115856D).mo59970a("is_long_item", C32718a.m105910b(this.f115883j) ? 1 : 0);
            String str5 = "group_id";
            if (this.f115890q == null) {
                str3 = "";
            } else {
                str3 = this.f115890q.getAid();
            }
            C6907h.m21524a(str4, (Map) a.mo59973a(str5, str3).mo59973a("download_method", this.f115857E).f60753a);
        }
        this.f115879f.mo102287a(0);
        C28633q.f75451d = true;
        if (this.f115884k != null) {
            this.f115884k.mo63019a();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f115874a);
        sb4.append(this.f115880g);
        sb4.append(".mp4");
        String sb5 = sb4.toString();
        this.f115875b = sb5;
        if (!C7276d.m22812b(sb5) || f115853B) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((this.f115858F || this.f115864L) && !z) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f115891r = new C39877j(z4, z5);
        String str6 = "";
        if (this.f115886m != null) {
            double size = (double) this.f115886m.getSize();
            Double.isNaN(size);
            d = (size / 1024.0d) / 1024.0d;
            if (d > 0.0d) {
                str6 = C1642a.m8034a("%.2f", new Object[]{Double.valueOf(d)});
                this.f115879f.setMessage(this.f115883j.getString(R.string.avk, new Object[]{str6}));
            } else {
                this.f115879f.setMessage(this.f115883j.getString(R.string.avx));
            }
        } else {
            d = 0.0d;
        }
        if (C6900g.m21454b().mo16942c() || d <= 5.0d) {
            mo107636a(z4, aweme);
            return;
        }
        C3534a a2 = C3947a.m13858a(this.f115883j);
        DmtTextView dmtTextView = new DmtTextView(this.f115883j);
        dmtTextView.setMaxLines(2);
        dmtTextView.setTypeface(dmtTextView.getTypeface(), 1);
        dmtTextView.setTextColor(this.f115883j.getResources().getColor(R.color.a_c));
        dmtTextView.setText(R.string.ava);
        dmtTextView.setTextSize(2, 17.0f);
        int b = (int) C9738o.m28708b(this.f115883j, 24.0f);
        dmtTextView.setPadding(b, b, b, 0);
        a2.mo10653a((View) dmtTextView);
        a2.mo10660b((CharSequence) this.f115883j.getString(R.string.avn, new Object[]{str6}));
        a2.mo10656a(false);
        a2.mo10649a((int) R.string.avb, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str;
                String str2 = "download_warning_popup_continue";
                C22984d a = new C22984d().mo59973a("enter_from", C45083a.this.f115856D).mo59970a("is_long_item", C32718a.m105910b(C45083a.this.f115883j) ? 1 : 0);
                String str3 = "group_id";
                if (C45083a.this.f115890q == null) {
                    str = "";
                } else {
                    str = C45083a.this.f115890q.getAid();
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("download_method", C45083a.this.f115857E).f60753a);
                C45083a.this.mo107636a(z4, aweme);
            }
        });
        a2.mo10659b((int) R.string.av_, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str;
                String str2 = "download_warning_popup_cancel";
                C22984d a = new C22984d().mo59973a("enter_from", C45083a.this.f115856D).mo59970a("is_long_item", C32718a.m105910b(C45083a.this.f115883j) ? 1 : 0);
                String str3 = "group_id";
                if (C45083a.this.f115890q == null) {
                    str = "";
                } else {
                    str = C45083a.this.f115890q.getAid();
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59973a("download_method", C45083a.this.f115857E).f60753a);
                C45083a.this.mo107637b();
            }
        });
        String str7 = "download_warning_popup_cancel";
        C22984d a3 = new C22984d().mo59973a("enter_from", this.f115856D).mo59970a("is_long_item", C32718a.m105910b(this.f115883j) ? 1 : 0);
        String str8 = "group_id";
        if (this.f115890q == null) {
            str2 = "";
        } else {
            str2 = this.f115890q.getAid();
        }
        C6907h.m21524a(str7, (Map) a3.mo59973a(str8, str2).mo59973a("download_method", this.f115857E).f60753a);
        a2.mo10657a().show();
    }

    /* renamed from: a */
    public final void mo107633a(Aweme aweme, String str, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        if (z || C28687a.m94366b(aweme)) {
            if (z) {
                if (!C28687a.m94367c(this.f115883j, aweme)) {
                    DownloadMessageMonitorUtils.m74932a(ForbidType.AUDITING, aweme);
                    return;
                }
            } else if (!C28687a.m94362a(this.f115883j, aweme)) {
                DownloadMessageMonitorUtils.m74932a(ForbidType.AUDITING, aweme);
                return;
            }
            if (aweme == null || aweme.getVideo() == null || aweme.getAuthor() == null) {
                DownloadMessageMonitorUtils.m74932a(ForbidType.AWEME, aweme);
            } else if (!m142204l()) {
                DownloadMessageMonitorUtils.m74932a(ForbidType.SDCARD, aweme);
            } else if (!C45102g.m142240a(this.f115883j)) {
                C10761a.m31392b(this.f115883j, (int) R.string.cjs, 1).mo25750a();
                DownloadMessageMonitorUtils.m74932a(ForbidType.NETWORK, aweme);
            } else if (m142203c(aweme) || LongVideoDownloadOptimize.INSTANCE.enable()) {
                m142201b(aweme, str, z);
            } else {
                this.f115890q = aweme;
                if (!this.f115887n || !C28687a.m94364a(aweme, true)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f115887n = z2;
                if (this.f115887n || C28687a.m94364a(aweme, false) || this.f115864L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f115858F = z3;
                if (C39874g.m127612b()) {
                    this.f115858F = true;
                }
                C45094a aVar = new C45094a();
                aVar.mo107653a(aweme, this.f115858F, z);
                this.f115858F = aVar.f115915c;
                this.f115880g = aVar.f115914b;
                this.f115886m = aVar.f115913a;
                if (this.f115886m == null || C6307b.m19566a((Collection<T>) this.f115886m.getUrlList())) {
                    DownloadMessageMonitorUtils.m74932a(ForbidType.DOWNLOAD_URL, aweme);
                    return;
                }
                if (this.f115886m != null && !C6307b.m19566a((Collection<T>) this.f115886m.getUrlList())) {
                    this.f115885l = C6806b.m21144a().mo16627a((String) this.f115886m.getUrlList().get(0));
                    if (C43167r.m136906c(this.f115890q)) {
                        this.f115885l = C6806b.m21144a().mo16627a((String) this.f115886m.getUrlList().get(this.f115886m.getUrlList().size() - 1));
                        if (this.f115885l.contains("ratio")) {
                            this.f115885l = this.f115885l.replaceAll("(ratio=[^&]*)", "ratio=default");
                        } else {
                            Builder buildUpon = Uri.parse(this.f115885l).buildUpon();
                            buildUpon.appendQueryParameter("ratio", "default");
                            this.f115885l = buildUpon.toString();
                        }
                    }
                }
                if (this.f115864L && this.f115889p != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f115861I);
                    sb.append(this.f115880g);
                    sb.append(this.f115889p.getCid());
                    sb.append("_comment.mp4");
                    this.f115876c = sb.toString();
                } else if (!this.f115887n) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f115861I);
                    sb2.append(this.f115880g);
                    sb2.append(".mp4");
                    this.f115876c = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f115861I);
                    sb3.append(this.f115880g);
                    sb3.append("_ins.mp4");
                    this.f115876c = sb3.toString();
                }
                if (C7276d.m22812b(this.f115876c)) {
                    mo107640e();
                    return;
                }
                if (this.f115879f == null) {
                    this.f115879f = C41647a.m132569a(this.f115883j, this.f115883j.getResources().getString(R.string.diz), str);
                    String str3 = "download_process_popup_show";
                    C22984d a = new C22984d().mo59973a("enter_from", this.f115856D).mo59970a("is_long_item", C32718a.m105910b(this.f115883j) ? 1 : 0);
                    String str4 = "group_id";
                    if (this.f115890q == null) {
                        str2 = "";
                    } else {
                        str2 = this.f115890q.getAid();
                    }
                    C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).mo59973a("download_method", this.f115857E).f60753a);
                }
                this.f115879f.mo102287a(0);
                C28633q.f75451d = true;
                if (this.f115884k != null) {
                    this.f115884k.mo63019a();
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f115874a);
                sb4.append(this.f115880g);
                sb4.append(".mp4");
                String sb5 = sb4.toString();
                this.f115875b = sb5;
                if (!C7276d.m22812b(sb5) || f115853B) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((this.f115858F || this.f115864L) && !z) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f115891r = new C39877j(z4, z5);
                if (this.f115858F || this.f115887n || this.f115864L) {
                    this.f115867O = new C43419l();
                    this.f115867O.mo105327a(this.f115875b).mo105330b(this.f115876c).mo105325a(new C32132j(this.f115890q.getAuthor()), this.f115890q.getVideo()).mo105328a(this.f115858F).mo105331b(this.f115887n).mo105333c(false).mo105332c(C39881n.m127622a().mo99303c()).mo105326a(this.f115859G).mo105335d(C6399b.m19944t()).mo105334d(this.f115885l);
                }
                if (z4) {
                    C1913c.m8857a("share");
                    C7276d.m22803a(this.f115874a, false);
                    m142199a("download_time", "download");
                    C6877n.m21447a("ug_save_video_start", new JSONObject());
                    this.f115885l = C43207b.m136999a(this.f115885l);
                    this.f115897x = new C45095b().mo107654a(this.f115880g).mo107659b(C28687a.m94363a(aweme)).mo107655a(aweme.getVideo().isHasWaterMark());
                    this.f115899z = true;
                    if (this.f115895v == null) {
                        this.f115895v = new C43247a();
                    }
                    if (this.f115896w == null) {
                        this.f115896w = new C45096c(this.f115897x);
                    }
                    this.f115895v.mo105001a((AbsDownloadListener) this.f115896w);
                    this.f115885l = C22968d.m75564a(aweme, this.f115885l);
                    C43247a aVar2 = this.f115895v;
                    Context context = this.f115883j;
                    String aid = aweme.getAid();
                    String str5 = this.f115885l;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this.f115880g);
                    sb6.append(".mp4");
                    aVar2.mo105000a(context, aid, str5, sb6.toString(), this.f115874a);
                    C29097a.m95452a().mo74527a("download_start");
                    if (this.f115858F || this.f115887n) {
                        C1592h.m7855a((Callable<TResult>) new C45097b<TResult>(this), (Executor) C7258h.m22730c());
                    }
                } else {
                    this.f115891r = new C39877j(false, true);
                    mo107638c();
                }
                this.f115868P.sendEmptyMessageDelayed(1, 30000);
            }
        } else {
            C10761a.m31403c(this.f115883j, this.f115883j.getString(R.string.b9o)).mo25750a();
            DownloadMessageMonitorUtils.m74932a(ForbidType.AUDITING, aweme);
        }
    }

    public C45083a(Context context, boolean z, int i, String str) {
        this(context, false);
        this.f115863K = i;
        this.f115881h = str;
    }

    public C45083a(Context context, boolean z, int i, String str, boolean z2) {
        this(context, z);
        this.f115863K = i;
        this.f115881h = str;
        this.f115864L = z2;
    }
}
