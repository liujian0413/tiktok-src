package com.p280ss.android.ugc.aweme.video;

import android.content.Context;
import bolts.C1592h;
import com.bytedance.common.utility.p482io.C9734a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.language.C32330k;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.requestcombine.C7194d;
import com.p280ss.android.ugc.aweme.requestcombine.model.RateSettingCombineModel;
import com.p280ss.android.ugc.aweme.setting.AsyncSettingsExperiment;
import com.p280ss.android.ugc.aweme.setting.C7208as;
import com.p280ss.android.ugc.aweme.setting.C7208as.C7209a;
import com.p280ss.android.ugc.aweme.video.api.BitRateSettingsApi;
import com.p280ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.video.VideoBitRateABManager */
public final class VideoBitRateABManager implements C7194d, C7209a {

    /* renamed from: d */
    private static final VideoBitRateABManager f20344d = new VideoBitRateABManager();

    /* renamed from: f */
    private static HashSet<String> f20345f;

    /* renamed from: a */
    public RateSettingsResponse f20346a;

    /* renamed from: b */
    public volatile boolean f20347b;

    /* renamed from: c */
    public boolean f20348c;

    /* renamed from: e */
    private Boolean f20349e;

    /* renamed from: com.ss.android.ugc.aweme.video.VideoBitRateABManager$RequestConfigTask */
    class RequestConfigTask implements LegoTask {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        private void request() {
            try {
                VideoBitRateABManager.this.mo19002a(BitRateSettingsApi.m136951a());
            } catch (Exception unused) {
            }
        }

        private RequestConfigTask() {
        }

        public void run(Context context) {
            C6921a.m21555a("RequestConfigTask");
            synchronized (VideoBitRateABManager.this) {
                if (!VideoBitRateABManager.this.f20348c) {
                    request();
                }
            }
        }
    }

    /* renamed from: c */
    public static VideoBitRateABManager m22786c() {
        return f20344d;
    }

    /* renamed from: a */
    public final void mo18677a() {
        m22789j();
    }

    /* renamed from: b */
    public final void mo18707b() {
        m22788i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ Object mo19006g() throws Exception {
        m22787h();
        return null;
    }

    /* renamed from: d */
    public final void mo19003d() {
        if (!C6903bc.m21502u().mo93733b()) {
            mo18707b();
        }
    }

    /* renamed from: e */
    public final boolean mo19004e() {
        if (!C43220a.m137076e() || !this.f20347b) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m22791l() {
        C7121a.m22248b().mo18559a(new RequestConfigTask()).mo18560a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ Object mo19005f() throws Exception {
        mo19002a(((RateSettingCombineModel) C6903bc.m21502u().mo93730a("/aweme/v1/rate/settings/")).getRateSetting());
        return null;
    }

    private VideoBitRateABManager() {
        C7208as.m22479a().mo18703a(2, (C7209a) this);
        if (C43220a.m137076e()) {
            C1592h.m7853a((Callable<TResult>) new C43189af<TResult>(this));
            C6903bc.m21502u().mo93732a((C7194d) this);
        }
    }

    /* renamed from: i */
    private void m22788i() {
        boolean e = C43220a.m137076e();
        if (this.f20349e == null || e != this.f20349e.booleanValue()) {
            this.f20349e = Boolean.valueOf(e);
            if (e) {
                m22789j();
            }
            return;
        }
        if (e && !this.f20348c) {
            m22789j();
        }
    }

    /* renamed from: j */
    private void m22789j() {
        if (C6903bc.m21502u().mo93733b()) {
            RateSettingCombineModel rateSettingCombineModel = (RateSettingCombineModel) C6903bc.m21502u().mo93730a("/aweme/v1/rate/settings/");
            if (rateSettingCombineModel != null && rateSettingCombineModel.getHttpCode() == 200 && rateSettingCombineModel.getRateSetting().status_code == 0) {
                m22790k();
            } else {
                if (rateSettingCombineModel == null || rateSettingCombineModel.getHttpCode() != 509) {
                    m22791l();
                }
            }
        } else {
            m22791l();
        }
    }

    /* renamed from: k */
    private void m22790k() {
        if (C6384b.m19835a().mo15292a(AsyncSettingsExperiment.class, true, "is_async_setting", C6384b.m19835a().mo15295d().is_async_setting, true)) {
            C1592h.m7853a((Callable<TResult>) new C43190ag<TResult>(this));
        } else {
            mo19002a(((RateSettingCombineModel) C6903bc.m21502u().mo93730a("/aweme/v1/rate/settings/")).getRateSetting());
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f20345f = hashSet;
        hashSet.add("DE");
        f20345f.add("FR");
        f20345f.add("GB");
        f20345f.add("BR");
        f20345f.add("RU");
        f20345f.add("AE");
        f20345f.add("SA");
        f20345f.add("IT");
        f20345f.add("MX");
        f20345f.add("ES");
        f20345f.add("TR");
        f20345f.add("PL");
        f20345f.add("BD");
        f20345f.add("IN");
    }

    /* renamed from: h */
    private void m22787h() {
        String str;
        Throwable th;
        String str2;
        String str3 = null;
        try {
            str = C7285c.m22838a(C6399b.m19921a(), "bitrate_manager_sp_rate_setting", 0).getString("bitrate_manager_sp_rate_setting", null);
            if (str == null) {
                try {
                    if (!C6399b.m19946v() || f20345f.contains(C32330k.m104885g())) {
                        str2 = C32330k.m104885g().toLowerCase();
                    } else {
                        str2 = "us";
                    }
                    Context a = C6399b.m19921a();
                    StringBuilder sb = new StringBuilder("rate_settings/");
                    sb.append(str2);
                    sb.append(".json");
                    str3 = m22784a(a, sb.toString());
                } catch (Throwable th2) {
                    th = th2;
                    C2077a.m9161a(th, str);
                }
            } else {
                str3 = str;
            }
            m22785b((RateSettingsResponse) new C6600e().mo15974a(str3, RateSettingsResponse.class));
        } catch (Throwable th3) {
            Throwable th4 = th3;
            str = str3;
            th = th4;
            C2077a.m9161a(th, str);
        }
    }

    /* renamed from: a */
    public final void mo18678a(Throwable th) {
        m22791l();
    }

    /* renamed from: b */
    private void m22785b(RateSettingsResponse rateSettingsResponse) {
        if (rateSettingsResponse != null && rateSettingsResponse.isValid()) {
            try {
                synchronized (this) {
                    this.f20346a = rateSettingsResponse;
                    C7285c.m22838a(C6399b.m19921a(), "bitrate_manager_sp_rate_setting", 0).edit().putString("bitrate_manager_sp_rate_setting", new C6600e().mo15979b((Object) rateSettingsResponse)).apply();
                }
                this.f20347b = true;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo19002a(RateSettingsResponse rateSettingsResponse) {
        if (rateSettingsResponse != null) {
            try {
                if (rateSettingsResponse.isValid()) {
                    m22785b(rateSettingsResponse);
                    this.f20348c = true;
                    C7208as.m22479a().mo18704a(2, true);
                    return;
                }
            } catch (Exception e) {
                C6921a.m21554a(e);
                return;
            }
        }
        C7208as.m22479a().mo18704a(2, false);
    }

    /* renamed from: a */
    private static String m22784a(Context context, String str) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                C9734a.m28682a((Closeable) inputStream);
                return str2;
            } catch (IOException unused) {
                C9734a.m28682a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                C9734a.m28682a((Closeable) inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C9734a.m28682a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C9734a.m28682a((Closeable) inputStream);
            throw th;
        }
    }
}
