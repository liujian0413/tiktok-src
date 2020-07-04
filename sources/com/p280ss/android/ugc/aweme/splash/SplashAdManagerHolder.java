package com.p280ss.android.ugc.aweme.splash;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.GlobalContext;
import com.p280ss.android.p817ad.splash.C18945a;
import com.p280ss.android.p817ad.splash.C18957c;
import com.p280ss.android.p817ad.splash.C19109d;
import com.p280ss.android.p817ad.splash.C19119f;
import com.p280ss.android.p817ad.splash.C19121g;
import com.p280ss.android.p817ad.splash.C19141h;
import com.p280ss.android.p817ad.splash.C19149k;
import com.p280ss.android.p817ad.splash.C19151m;
import com.p280ss.android.p817ad.splash.C19153o;
import com.p280ss.android.p817ad.splash.C19154p;
import com.p280ss.android.p817ad.splash.C19155q;
import com.p280ss.android.p817ad.splash.C19155q.C19156a;
import com.p280ss.android.p817ad.splash.C19157r;
import com.p280ss.android.p817ad.splash.C19158s;
import com.p280ss.android.p817ad.splash.core.p831f.C19039g;
import com.p280ss.android.p817ad.splash.core.p831f.C19039g.C19040a;
import com.p280ss.android.p817ad.splash.p823a.C18946a;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.abtest.NormalSplashDownloadExperiment;
import com.p280ss.android.ugc.aweme.commercialize.abtest.SplashUdpStopAppIdExperiment;
import com.p280ss.android.ugc.aweme.commercialize.log.C24956e.C24957a;
import com.p280ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25054b;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25063h;
import com.p280ss.android.ugc.aweme.commercialize.splash.SplashAdApi;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25288bq;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25293bu;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.experiment.p1209a.C27686a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.lancet.SplashNetworkException;
import com.p280ss.android.ugc.aweme.legacy.download.C32335d;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7132f;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.net.C34108z;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p339sp.SharedPreferencesManager;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.utils.C43056dh;
import com.p280ss.android.ugc.aweme.utils.C43102em;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder */
public class SplashAdManagerHolder {

    /* renamed from: a */
    static boolean f108626a;

    /* renamed from: b */
    private static volatile boolean f108627b;

    /* renamed from: c */
    private static volatile C19151m f108628c;

    /* renamed from: d */
    private static boolean f108629d;

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder$SplashAdEventListenerImpl */
    static class SplashAdEventListenerImpl implements C19119f {

        /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder$SplashAdEventListenerImpl$MobJobTask */
        class MobJobTask implements LegoTask {
            JSONObject extJson;
            long extValue;
            String label;
            String tag;
            long value;

            public ProcessType process() {
                return C32337d.m104906a(this);
            }

            public WorkType type() {
                return WorkType.BOOT_FINISH;
            }

            public void run(Context context) {
                C6921a.m21555a("MobJobTask");
                C6907h.m21519a(context, this.tag, this.label, String.valueOf(this.value), this.extValue, this.extJson);
            }

            MobJobTask(String str, String str2, long j, long j2, JSONObject jSONObject) {
                this.tag = str;
                this.label = str2;
                this.value = j;
                this.extValue = j2;
                this.extJson = jSONObject;
            }
        }

        private SplashAdEventListenerImpl() {
        }

        /* renamed from: a */
        public final void mo50827a(C18946a aVar) {
            new C24957a().mo65247b(aVar.f51063b).mo65243a(aVar.f51062a).mo65248c(aVar.f51064c).mo65242a(aVar.f51065d).mo65249d(aVar.f51066e).mo65246b(aVar.f51067f).mo65244a(aVar.f51068g).mo65245a().mo65241a();
        }

        /* renamed from: a */
        public final void mo50828a(String str, String str2, long j, long j2, JSONObject jSONObject) {
            String str3;
            StringBuilder sb = new StringBuilder("onEvent :  tag = ");
            String str4 = str;
            sb.append(str);
            sb.append(" label = ");
            String str5 = str2;
            sb.append(str2);
            sb.append(" value = ");
            sb.append(j);
            sb.append(" ext_value = 0");
            sb.append(" extJson = ");
            if (jSONObject == null) {
                str3 = "";
            } else {
                str3 = jSONObject.toString();
            }
            sb.append(str3);
            C7132f b = C7121a.m22248b();
            MobJobTask mobJobTask = new MobJobTask(str, str2, j, 0, jSONObject);
            b.mo18559a(mobJobTask).mo18560a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder$a */
    static class C41734a implements C19154p {
        private C41734a() {
        }

        /* renamed from: a */
        public final void mo50855a(ImageView imageView, String str, int i, C19141h hVar) {
            C25054b.m82490a().f66140g = false;
            if (!C19132j.m62736a(str)) {
                if (((long) i) == 1) {
                    imageView.setImageDrawable(C41747l.m132941a(C6399b.m19921a(), str, hVar));
                    return;
                }
                Context a = C6399b.m19921a();
                Bitmap a2 = SplashAdManagerHolder.m132884a(str, C9738o.m28691a(a), C9738o.m28709b(a));
                if (a2 != null) {
                    imageView.setImageBitmap(a2);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder$b */
    static class C41735b implements C19158s {

        /* renamed from: a */
        SplashAdApi f108632a;

        /* renamed from: b */
        SplashAdApi f108633b;

        private C41735b() {
            this.f108632a = (SplashAdApi) C22838j.m75276a(Api.f60502b, null).create(SplashAdApi.class);
            this.f108633b = (SplashAdApi) C22838j.m75278b(Api.f60502b).mo30492a(SplashAdApi.class);
        }

        /* renamed from: a */
        public final C19039g mo50858a(String str) {
            String a = C34108z.m109785a(C6399b.m19921a());
            try {
                StringBuilder sb = new StringBuilder("TrackUrlResponse_sendTrackUrl trackUrl = ");
                sb.append(str);
                C6921a.m21555a(sb.toString());
                return new C19040a().mo50536a(this.f108633b.executeGet(0, str, a).execute().mo30510a()).mo50537a(a).mo50538a();
            } catch (Exception e) {
                C6921a.m21559a((Throwable) new SplashNetworkException(e));
                return new C19040a().mo50536a(-1).mo50537a(a).mo50538a();
            }
        }

        /* renamed from: b */
        public final C19155q mo50863b(String str) {
            try {
                StringBuilder sb = new StringBuilder("SplashAdResponse_sendStockUrl");
                sb.append(str);
                C6921a.m21555a(sb.toString());
                try {
                    return new C19155q(new C19156a().mo50857a(true).mo50856a(new JSONObject((String) this.f108632a.executeGet(0, str).execute().f33302b)));
                } catch (JSONException unused) {
                    return null;
                }
            } catch (Exception e) {
                C6921a.m21559a((Throwable) new SplashNetworkException(e));
                return null;
            }
        }

        /* renamed from: a */
        public final boolean mo50862a(String str, boolean z) {
            C7121a.m22248b().mo18559a(new SplashAdManagerHolder$SplashNetWorkImpl$1(this, str)).mo18560a();
            return false;
        }

        /* renamed from: a */
        public final C19155q mo50860a(String str, String str2) {
            String str3;
            if (C19132j.m62736a(str)) {
                return null;
            }
            try {
                String a = SplashAdManagerHolder.m132888a(str);
                StringBuilder sb = new StringBuilder("SplashAdResponse_loadAdMessage url = ");
                sb.append(a);
                C6921a.m21555a(sb.toString());
                str3 = (String) this.f108632a.executeGet(0, a).execute().f33302b;
            } catch (Exception e) {
                C6921a.m21559a((Throwable) new SplashNetworkException(e));
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            try {
                return new C19155q(new C19156a().mo50857a(!TextUtils.isEmpty(str3)).mo50856a(new JSONObject(str3)));
            } catch (JSONException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final boolean mo50861a(String str, String str2, C19109d dVar) {
            if (C19132j.m62736a(str) || C19132j.m62736a(str2)) {
                return false;
            }
            if (new File(str2).exists()) {
                return true;
            }
            if (C6384b.m19835a().mo15287a(NormalSplashDownloadExperiment.class, true, "normal_splash_download_optimize", C6384b.m19835a().mo15295d().normal_splash_download_optimize, 0) == 0) {
                return SplashAdManagerHolder.m132893a(str, str2, dVar);
            }
            return SplashAdManagerHolder.m132896b(str, str2, dVar);
        }

        /* renamed from: a */
        public final C19155q mo50859a(String str, int i, HashMap<String, String> hashMap, JSONObject jSONObject) {
            try {
                StringBuilder sb = new StringBuilder("SplashAdResponse_sendSplashAckUrl url path = ");
                sb.append(str);
                C6921a.m21555a(sb.toString());
                return m132919b(str, 3, null, jSONObject);
            } catch (Exception e) {
                C6921a.m21559a((Throwable) new SplashNetworkException(e));
                return null;
            }
        }

        /* renamed from: b */
        private C19155q m132919b(String str, int i, HashMap<String, String> hashMap, JSONObject jSONObject) throws Exception {
            String str2;
            StringBuilder sb = new StringBuilder();
            sb.append(Api.f60502b);
            sb.append(str);
            String sb2 = sb.toString();
            switch (i) {
                case 1:
                    str2 = (String) this.f108632a.executeGet(0, sb2).execute().f33302b;
                    break;
                case 2:
                    str2 = (String) this.f108632a.executePost(0, sb2, (Map<String, String>) hashMap).execute().f33302b;
                    break;
                case 3:
                    str2 = (String) this.f108632a.executePost(0, sb2, (TypedOutput) new TypedByteArray("application/json", jSONObject.toString().getBytes("UTF-8"), new String[0])).execute().f33302b;
                    break;
                default:
                    return null;
            }
            return new C19155q(new C19156a().mo50857a(true).mo50856a(new JSONObject(str2)));
        }
    }

    /* renamed from: a */
    public static boolean m132893a(String str, String str2, C19109d dVar) {
        File file = new File(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(".tmp");
        String sb2 = sb.toString();
        try {
            if (m132891a(-1, str, sb2)) {
                File file2 = new File(sb2);
                if (file2.renameTo(file)) {
                    C25063h.m82543a(true, Long.valueOf(dVar.f51685a), dVar.f51686b, (String) null);
                    return true;
                }
                if (file2.exists()) {
                    file2.delete();
                }
                C25063h.m82543a(false, Long.valueOf(dVar.f51685a), dVar.f51686b, (String) null);
                return false;
            }
        } catch (Throwable th) {
            C25063h.m82543a(false, Long.valueOf(dVar.f51685a), dVar.f51686b, th.getMessage());
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m132892a(Context context, boolean z) {
        boolean z2 = false;
        if (context == null) {
            return false;
        }
        if (z) {
            f108629d = false;
        }
        if (!((IAVService) ServiceManager.get().getService(IAVService.class)).getSuperEntranceService().shouldStartSuperEntrance(context)) {
            return false;
        }
        if (!z) {
            return f108629d;
        }
        if (Keva.getRepo("splash_keva_repo").getBoolean("key_super_entrance_has_show", false)) {
            return false;
        }
        if (f108626a && f108628c.mo50588h()) {
            z2 = true;
        }
        f108629d = z2;
        return z2;
    }

    /* renamed from: a */
    public static C18957c m132885a() {
        return new C18945a() {
            /* renamed from: c */
            public final String mo50333c() {
                return C6399b.m19929e();
            }

            /* renamed from: e */
            public final String mo50335e() {
                return C6399b.m19934j();
            }

            /* renamed from: g */
            public final String mo50337g() {
                return C6399b.m19941q();
            }

            /* renamed from: j */
            public final String mo50340j() {
                return AppLog.getInstallId();
            }

            /* renamed from: l */
            public final String mo50342l() {
                return C43102em.m136719a();
            }

            /* renamed from: b */
            public final String mo50332b() {
                return String.valueOf(C6399b.m19935k());
            }

            /* renamed from: d */
            public final String mo50334d() {
                return String.valueOf(C6399b.m19933i());
            }

            /* renamed from: f */
            public final String mo50336f() {
                return String.valueOf(C6399b.m19932h());
            }

            /* renamed from: n */
            public final String mo50344n() {
                if (C6399b.m19944t()) {
                    return C6399b.m19934j();
                }
                return null;
            }

            /* renamed from: h */
            public final String mo50338h() {
                StringBuilder sb = new StringBuilder();
                sb.append(C6399b.m19939o());
                return sb.toString();
            }

            /* renamed from: k */
            public final String mo50341k() {
                if (!C43056dh.m136600a()) {
                    return "";
                }
                String serverDeviceId = AppLog.getServerDeviceId();
                if (serverDeviceId == null) {
                    serverDeviceId = "";
                }
                return serverDeviceId;
            }

            /* renamed from: m */
            public final String mo50343m() {
                HashMap hashMap = new HashMap();
                AppLog.getSSIDs(hashMap);
                return (String) hashMap.get("openudid");
            }
        };
    }

    /* renamed from: c */
    static final /* synthetic */ boolean m132898c() {
        if (!C6861a.m21337f().isLogin()) {
            return false;
        }
        return ((IPluginService) ServiceManager.get().getService(IPluginService.class)).mo26457a("com.ss.android.ugc.aweme.miniapp");
    }

    /* renamed from: d */
    private static String m132899d() {
        String str;
        try {
            str = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAdvertisingIdOb();
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: e */
    private static String m132901e() {
        String str;
        try {
            str = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAndroidId();
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public static long m132894b() {
        long b = C22977g.f60742b.mo59966b("splash_ad_preload");
        if (b != 60000 && b != 0) {
            return b;
        }
        try {
            return C30199h.m98861a().getSplashPreloadDelay().longValue();
        } catch (NullValueException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static C19149k m132895b(Context context) {
        m132897c(context);
        return C19121g.m62652b(context);
    }

    /* renamed from: a */
    public static C19151m m132886a(Context context) {
        m132897c(context);
        return f108628c;
    }

    /* renamed from: f */
    private static boolean m132903f(Context context) {
        return SharedPreferencesManager.getInstance().getSharedPreferences(context, "file_splash_ad_preload").getBoolean("key_splash_ad_preload_delay", true);
    }

    /* renamed from: c */
    private static void m132897c(Context context) {
        if (!f108627b) {
            synchronized (SplashAdManagerHolder.class) {
                if (!f108627b) {
                    m132900d(context);
                    f108628c = C19121g.m62650a(context);
                    m132889a(context.getApplicationContext(), f108628c);
                    f108627b = true;
                }
            }
        }
    }

    /* renamed from: d */
    private static void m132900d(Context context) {
        HashMap hashMap = new HashMap();
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser != null) {
            hashMap.put("user_mode", m132887a(curUser));
            hashMap.put("user_period", Integer.toString(curUser.getUserPeriod()));
        }
        C25288bq.m83090a(context, hashMap);
    }

    /* renamed from: e */
    private static String m132902e(Context context) throws Exception {
        System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append("/Android/data/");
        sb.append(context.getPackageName());
        sb.append("/splashCache/");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m132887a(User user) {
        int i;
        int intValue = ((Integer) SharePrefCache.inst().getPersonalizationMode().mo59877d()).intValue();
        if (user.getUserMode() != -1) {
            i = user.getUserMode();
        } else {
            i = 0;
        }
        if (intValue == 2 || intValue == 0) {
            return Integer.toString(i | 4);
        }
        return Integer.toString(i);
    }

    /* renamed from: a */
    public static String m132888a(String str) {
        String str2;
        String curUserId = C21115b.m71197a().getCurUserId();
        if (!TextUtils.isEmpty(curUserId)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&user_id=");
            sb.append(curUserId);
            str = sb.toString();
        }
        if (C6399b.m19944t()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("&gaid=");
            sb2.append(URLEncoder.encode(m132899d()));
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append("&android_id=");
            sb4.append(URLEncoder.encode(m132901e()));
            str = sb4.toString();
            if (C6399b.m19944t() || C27686a.m90835a()) {
                str2 = RawURLGetter.m81764a();
            } else {
                str2 = C34108z.m109785a(C6399b.m19921a());
            }
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append("&ad_user_agent=");
                sb5.append(URLEncoder.encode(str2));
                str = sb5.toString();
            }
        }
        if (!C6399b.m19944t()) {
            String str3 = "0";
            String str4 = "0";
            LocationBundle a = C32630h.m105696b(C6399b.m19921a()).mo83993a();
            if (a != null) {
                str3 = String.valueOf(a.latitude);
                str4 = String.valueOf(a.longitude);
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append("&longitude=");
            sb6.append(str4);
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(sb7);
            sb8.append("&latitude=");
            sb8.append(str3);
            String sb9 = sb8.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            sb10.append("&mac_address=");
            sb10.append(C25293bu.m83101a());
            str = sb10.toString();
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(Api.f60502b);
        sb11.append(str);
        return sb11.toString();
    }

    /* renamed from: a */
    private static void m132889a(Context context, C19151m mVar) {
        long j;
        boolean z;
        long j2;
        try {
            j = C30199h.m98861a().getSplashStockDelayMillisTime().longValue();
            try {
                long b = C22977g.f60742b.mo59966b("splash_stock");
                if (b != 60000) {
                    j = b;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 2000;
        }
        boolean f = m132903f(context);
        C19153o oVar = C41751m.f108641a;
        int k = C6399b.m19935k();
        if (C7163a.m22363a()) {
            int a = C6384b.m19835a().mo15287a(SplashUdpStopAppIdExperiment.class, true, "splash_udp_stop_app_id", C6384b.m19835a().mo15295d().splash_udp_stop_app_id, 0);
            if (a != 0) {
                k = a;
            }
        }
        if (((Boolean) C23060u.m75742a().mo60090t().mo59877d()).booleanValue() || C7163a.m22363a()) {
            z = true;
        } else {
            z = false;
        }
        C19151m a2 = mVar.mo50573c(z).mo50561a((C19154p) new C41734a()).mo50562a((C19158s) new C41735b()).mo50565a(C7213d.m22500a().mo18750aM()).mo50558a(TimeUnit.DAYS.toMillis(10)).mo50572c(j).mo50557a(2).mo50583f(true).mo50559a((C19119f) new SplashAdEventListenerImpl());
        if (f) {
            j2 = C40413c.f105051b;
        } else {
            j2 = m132894b();
        }
        a2.mo50568b(j2).mo50560a(oVar).mo50564a(new JSONArray(C30199h.m98861a().getSplashSwitchServerList()), false, k).mo50569b(false).mo50579e(C30199h.m98861a().getUseNewSplashView().booleanValue());
        m132890a(context, mVar, f);
        C25288bq.m83091a(mVar);
        try {
            mVar.mo50563a(m132902e(context), true);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
        boolean t = C6399b.m19944t();
        boolean t2 = C6399b.m19944t();
        if (((Boolean) C23060u.m75742a().mo60088r().mo59877d()).booleanValue()) {
            t = true;
        }
        if (((Boolean) C23060u.m75742a().mo60089s().mo59877d()).booleanValue()) {
            t2 = true;
        }
        C19157r g = C19121g.m62653c(context).mo50574c(R.drawable.bjt).mo50570b(R.style.m_).mo50580e(R.drawable.bju).mo50578d(R.string.dwl).mo50584f(R.string.dwk).mo50587h(t ? 1 : 0).mo50586g(t2 ? 1 : 0);
        if (C6399b.m19944t()) {
            g.mo50566a(false, 0);
        } else {
            g.mo50566a(true, 0);
        }
    }

    /* renamed from: a */
    private static int m132883a(Options options, int i, int i2) {
        int i3 = options.outWidth / 2;
        int i4 = options.outHeight / 2;
        int i5 = 1;
        while (i3 / i5 >= i && i4 / i5 >= i2) {
            i5 *= 2;
        }
        return i5;
    }

    /* renamed from: a */
    public static Bitmap m132884a(String str, int i, int i2) {
        Bitmap bitmap;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            return BitmapFactory.decodeFile(str);
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m132883a(options, i, i2);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        try {
            bitmap = BitmapFactory.decodeFile(str, options);
        } catch (Exception unused) {
            bitmap = decodeFile;
        }
        return bitmap;
    }

    /* renamed from: b */
    public static boolean m132896b(final String str, String str2, final C19109d dVar) {
        C417333 r0 = new IDownloadListener() {
            public final void onCanceled(DownloadInfo downloadInfo) {
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
                C25063h.m82544b(true, Long.valueOf(dVar.f51685a), dVar.f51686b, null);
            }

            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                C25063h.m82544b(false, Long.valueOf(dVar.f51685a), dVar.f51686b, baseException.getErrorMessage());
            }
        };
        int lastIndexOf = str2.lastIndexOf("/") + 1;
        Downloader.with(GlobalContext.getContext()).url(str).savePath(str2.substring(0, lastIndexOf)).name(str2.substring(lastIndexOf)).showNotification(false).subThreadListener(r0).download();
        return false;
    }

    /* renamed from: a */
    private static void m132890a(Context context, final C19151m mVar, boolean z) {
        if (z) {
            C7121a.m22248b().mo18559a(new LegoTask() {
                public final ProcessType process() {
                    return C32337d.m104906a(this);
                }

                public final WorkType type() {
                    return WorkType.BOOT_FINISH;
                }

                public final void run(Context context) {
                    mVar.mo50568b(SplashAdManagerHolder.m132894b());
                }
            });
            SharedPreferencesManager.getInstance().getSharedPreferences(context, "file_splash_ad_preload").edit().putBoolean("key_splash_ad_preload_delay", false).apply();
        }
    }

    /* renamed from: a */
    private static boolean m132891a(int i, String str, String str2) throws Throwable {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        int lastIndexOf = str2.lastIndexOf("/") + 1;
        String substring = str2.substring(lastIndexOf);
        return C32335d.m104902a(C6399b.m19921a(), -1, str, null, str2.substring(0, lastIndexOf), "", substring, null, null);
    }
}
