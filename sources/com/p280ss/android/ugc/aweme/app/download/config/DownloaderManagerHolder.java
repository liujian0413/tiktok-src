package com.p280ss.android.ugc.aweme.app.download.config;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.uikit.dialog.C11029b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRouter;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.download.api.C19371a;
import com.p280ss.android.download.api.model.C19391a.C19392a;
import com.p280ss.android.download.api.model.C19394c;
import com.p280ss.android.download.api.model.C19398d;
import com.p280ss.android.download.api.p857a.C19372a;
import com.p280ss.android.download.api.p857a.C19373b;
import com.p280ss.android.download.api.p857a.C19375d;
import com.p280ss.android.download.api.p857a.C19376e;
import com.p280ss.android.download.api.p857a.C19377f;
import com.p280ss.android.download.api.p857a.C19378g;
import com.p280ss.android.download.api.p857a.C19379h;
import com.p280ss.android.download.api.p857a.C19381j;
import com.p280ss.android.download.api.p857a.C19382k;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.p848c.p849a.C19235b;
import com.p280ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener;
import com.p280ss.android.socialbase.downloader.downloader.C20279f;
import com.p280ss.android.socialbase.downloader.network.C20347f;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.commercialize.log.C24943am;
import com.p280ss.android.ugc.aweme.commercialize.log.C24955d;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.C24988a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.experiment.DownloaderTTNetExperiment;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder */
public class DownloaderManagerHolder {

    /* renamed from: a */
    public static JSONObject f60710a;

    /* renamed from: b */
    public static boolean f60711b = false;

    /* renamed from: c */
    private static volatile boolean f60712c;

    /* renamed from: d */
    private static Boolean f60713d;

    /* renamed from: e */
    private static DownloaderManagerApi f60714e;

    /* renamed from: f */
    private static final int f60715f = Runtime.getRuntime().availableProcessors();

    /* renamed from: g */
    private static final int f60716g = Math.max(2, Math.min(f60715f - 1, 4));

    /* renamed from: h */
    private static ExecutorService f60717h = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18994a("downloader-db").mo18993a(f60716g).mo18996a());

    /* renamed from: com.ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder$DownloaderManagerApi */
    interface DownloaderManagerApi {
        @C6457h
        C18253l<String> doGet(@C6463n int i, @C6450ac String str);
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m75532a(Context context, String str) {
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute(context, str).addFlags(536870912).withCallback(new OpenResultCallback() {
            public final void onSuccess() {
                zArr[0] = true;
            }

            public final void onFail(String str, String str2) {
                zArr[0] = false;
            }
        }).open();
        return zArr[0];
    }

    /* renamed from: a */
    public static boolean m75533a(C19398d dVar) {
        long j;
        if (!dVar.f52473d || !TextUtils.equals(dVar.f52472c, "click")) {
            return false;
        }
        Object obj = dVar.f52480k;
        AwemeRawAd awemeRawAd = null;
        if (obj instanceof AwemeRawAd) {
            awemeRawAd = (AwemeRawAd) obj;
        } else if (obj instanceof C24988a) {
            C24988a aVar = (C24988a) obj;
            awemeRawAd = aVar.f65881a;
            m75529a(aVar, dVar.f52477h);
        }
        long longValue = awemeRawAd != null ? awemeRawAd.getCreativeId().longValue() : 0;
        if (longValue == 0) {
            longValue = dVar.f52474e;
        }
        if (awemeRawAd == null || awemeRawAd.getGroupId() == null) {
            j = dVar.f52476g;
        } else {
            j = awemeRawAd.getGroupId().longValue();
        }
        C24955d.m81895a(dVar.f52470a, dVar.f52471b, String.valueOf(longValue), dVar.f52475f, j, dVar.f52477h);
        m75528a(dVar, awemeRawAd);
        return true;
    }

    /* renamed from: a */
    public static void m75531a(String str, Map<String, Object> map, C19381j jVar) throws Exception {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a = C10191k.m30270a(str, (Map<String, String>) linkedHashMap);
        String str2 = (String) a.first;
        String str3 = (String) a.second;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (map != null && map.size() > 0) {
            for (Entry entry : map.entrySet()) {
                linkedHashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        C12534t execute = ((INetworkApi) RetrofitUtils.m37898a(str2, INetworkApi.class)).doPost(40960, str3, linkedHashMap, linkedHashMap2, null, null).execute();
        if (jVar != null && execute != null && !execute.mo30512c()) {
            new Throwable((String) execute.f33302b);
        }
    }

    /* renamed from: a */
    public static C19535g m75524a() {
        m75527a((Context) AwemeApplication.m21341a());
        return C19535g.m64381a((Context) AwemeApplication.m21341a());
    }

    /* renamed from: b */
    public static C19235b m75534b() {
        return m75524a().mo51671b();
    }

    /* renamed from: d */
    public static boolean m75538d() {
        boolean z;
        if (f60713d == null) {
            if (!C6399b.m19946v() || !C6384b.m19835a().mo15292a(DownloaderTTNetExperiment.class, false, "downloader_use_ttnet_ab", C6384b.m19835a().mo15295d().downloader_use_ttnet_ab, false)) {
                z = false;
            } else {
                z = true;
            }
            f60713d = Boolean.valueOf(z);
        }
        return f60713d.booleanValue();
    }

    /* renamed from: c */
    public static JSONObject m75537c() {
        String str = (String) SharePrefCache.inst().getDownloadSdkConfig().mo59877d();
        if (f60710a == null || !f60711b) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    f60710a = new JSONObject(str);
                    f60711b = true;
                } else {
                    f60710a = new JSONObject();
                }
                f60710a.put("download_completed_event_tag", "draw_ad");
                f60710a.put("landing_page_progressbar_visible", 1);
                f60710a.put("is_enable_show_retry_download_dialog", 1);
            } catch (JSONException unused) {
                f60710a = new JSONObject();
            }
        }
        return f60710a;
    }

    /* renamed from: a */
    public static void m75525a(final Activity activity) {
        C42951au.m136341a(activity, R.string.lb, R.string.w_, null, R.string.afp, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C42969bc.m136401a(activity);
            }
        }).show();
    }

    /* renamed from: a */
    public static Dialog m75523a(final C19394c cVar) {
        if (cVar == null) {
            return null;
        }
        C11030a aVar = new C11030a(cVar.f52450a);
        aVar.mo26640a((CharSequence) cVar.f52451b).mo26647b((CharSequence) cVar.f52452c).mo26641a((CharSequence) cVar.f52453d, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (cVar.f52457h != null) {
                    cVar.f52457h.mo51398a(dialogInterface);
                }
            }
        }).mo26648b((CharSequence) cVar.f52454e, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (cVar.f52457h != null) {
                    cVar.f52457h.mo51399b(dialogInterface);
                }
            }
        }).mo26636a((OnCancelListener) new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                if (cVar.f52457h != null) {
                    cVar.f52457h.mo51400c(dialogInterface);
                }
            }
        });
        if (cVar.f52456g != null) {
            aVar.mo26638a(cVar.f52456g);
        }
        C11029b b = aVar.mo26649b();
        b.setCanceledOnTouchOutside(cVar.f52455f);
        return b;
    }

    /* renamed from: a */
    public static void m75527a(Context context) {
        if (!f60712c) {
            synchronized (DownloaderManagerHolder.class) {
                if (!f60712c) {
                    m75535b(context);
                    f60712c = true;
                }
            }
        }
    }

    /* renamed from: b */
    private static void m75535b(Context context) {
        C20347f fVar;
        C19371a a = C19535g.m64381a(context).f52842a.mo51347a((C19377f) new C19377f() {
            /* renamed from: a */
            public final void mo51360a(Activity activity, int i, String[] strArr, int[] iArr) {
            }

            /* renamed from: a */
            public final boolean mo51362a(Context context, String str) {
                if (context == null || C0683b.m2909b(context, str) != 0) {
                    return false;
                }
                return true;
            }

            /* renamed from: a */
            public final void mo51361a(Activity activity, String[] strArr, C19382k kVar) {
                DownloaderManagerHolder.m75526a(activity, strArr, kVar);
            }
        }).mo51345a((C19375d) new C19375d() {
            public final void onEvent(C19398d dVar) {
                DownloaderManagerHolder.m75536b(dVar);
            }

            /* renamed from: a */
            public final void mo51357a(C19398d dVar) {
                if (!DownloaderManagerHolder.m75533a(dVar)) {
                    C6759a.m20910a(dVar.f52482m, dVar.f52483n);
                }
            }
        }).mo51349a((C19379h) new C19379h() {
            /* renamed from: a */
            public final Dialog mo51364a(C19394c cVar) {
                return DownloaderManagerHolder.m75523a(cVar);
            }

            /* renamed from: a */
            public final void mo51365a(Context context, String str, Drawable drawable, int i) {
                C10761a.m31410e(context, str).mo25750a();
            }
        }).mo51346a((C19376e) new C19376e() {
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
                return;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo51359a(java.lang.String r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5, com.p280ss.android.download.api.p857a.C19381j r6) {
                /*
                    r2 = this;
                    r6 = -1
                    int r0 = r3.hashCode()     // Catch:{ Throwable -> 0x0031 }
                    r1 = 70454(0x11336, float:9.8727E-41)
                    if (r0 == r1) goto L_0x001a
                    r1 = 2461856(0x2590a0, float:3.449795E-39)
                    if (r0 == r1) goto L_0x0010
                    goto L_0x0023
                L_0x0010:
                    java.lang.String r0 = "POST"
                    boolean r3 = r3.equals(r0)     // Catch:{ Throwable -> 0x0031 }
                    if (r3 == 0) goto L_0x0023
                    r6 = 1
                    goto L_0x0023
                L_0x001a:
                    java.lang.String r0 = "GET"
                    boolean r3 = r3.equals(r0)     // Catch:{ Throwable -> 0x0031 }
                    if (r3 == 0) goto L_0x0023
                    r6 = 0
                L_0x0023:
                    r3 = 0
                    switch(r6) {
                        case 0: goto L_0x002c;
                        case 1: goto L_0x0028;
                        default: goto L_0x0027;
                    }     // Catch:{ Throwable -> 0x0031 }
                L_0x0027:
                    goto L_0x0030
                L_0x0028:
                    com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder.m75531a(r4, r5, r3)     // Catch:{ Throwable -> 0x0031 }
                    goto L_0x0030
                L_0x002c:
                    com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder.m75530a(r4, r3)     // Catch:{ Throwable -> 0x0031 }
                    goto L_0x0031
                L_0x0030:
                    return
                L_0x0031:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder.C229598.mo51359a(java.lang.String, java.lang.String, java.util.Map, com.ss.android.download.api.a.j):void");
            }
        }).mo51344a((C19373b) new C19373b() {
        }).mo51352a((IAppDownloadMonitorListener) new C22962b()).mo51348a((C19378g) new C19378g() {
            /* renamed from: a */
            public final JSONObject mo51363a() {
                return DownloaderManagerHolder.m75537c();
            }
        }).mo51343a((C19372a) new C19372a() {
            /* renamed from: a */
            public final boolean mo51355a() {
                return C6405d.m19987h();
            }
        }).mo51351a(new C19392a().mo51385b(String.valueOf(C6399b.m19935k())).mo51383a(C6399b.m19929e()).mo51386c(C6399b.m19941q()).mo51387d(C6399b.m19934j()).mo51388e(String.valueOf(C6399b.m19933i())).mo51384a()).mo51354a("com.ss.android.ugc.aweme.fileprovider").mo51350a(C22965d.f60731a);
        int optInt = m75537c().optInt("download_exp_switch_temp", 0);
        C20279f fVar2 = new C20279f(context);
        if (m75538d()) {
            fVar = new C22966e();
        } else {
            fVar = new C22963c();
        }
        a.mo51353a(fVar2.mo54345a(fVar).mo54346a(C7258h.m22730c()).mo54348b(f60717h).mo54343a(optInt));
    }

    /* renamed from: b */
    public static void m75536b(C19398d dVar) {
        long j;
        long j2;
        if (!dVar.f52473d) {
            C6907h.m21523a(dVar.f52470a, dVar.f52471b, dVar.f52472c, String.valueOf(dVar.f52474e), dVar.f52476g, dVar.f52477h);
        } else if (!m75533a(dVar)) {
            Object obj = dVar.f52480k;
            AwemeRawAd awemeRawAd = null;
            if (obj instanceof AwemeRawAd) {
                awemeRawAd = (AwemeRawAd) obj;
            } else if (obj instanceof C24988a) {
                C24988a aVar = (C24988a) obj;
                awemeRawAd = aVar.f65881a;
                m75529a(aVar, dVar.f52477h);
            }
            if (awemeRawAd != null) {
                j = awemeRawAd.getCreativeId().longValue();
            } else {
                j = 0;
            }
            if (j == 0) {
                j = dVar.f52474e;
            }
            if (awemeRawAd == null || awemeRawAd.getGroupId() == null) {
                j2 = dVar.f52476g;
            } else {
                j2 = awemeRawAd.getGroupId().longValue();
            }
            long j3 = j2;
            if (TextUtils.equals("click", dVar.f52472c)) {
                C24976t.m82069a(C6399b.m19921a(), dVar.f52471b, dVar.f52472c, String.valueOf(j), j3, dVar.f52477h);
            } else {
                C6907h.m21519a(C6399b.m19921a(), dVar.f52471b, dVar.f52472c, String.valueOf(j), j3, dVar.f52477h);
            }
            if (TextUtils.equals(dVar.f52472c, "click")) {
                m75528a(dVar, awemeRawAd);
            }
        }
    }

    /* renamed from: a */
    private static void m75528a(C19398d dVar, AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || !awemeRawAd.isClickTrackUrlListValid()) {
            C24943am.m81843a(dVar);
        } else {
            C24943am.f65779a.mo65217a(awemeRawAd);
        }
    }

    /* renamed from: a */
    private static void m75529a(C24988a aVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(aVar.f65882b) && !jSONObject.has("refer")) {
                    jSONObject.put("refer", aVar.f65882b);
                }
                if (aVar.f65883c != null) {
                    Object opt = jSONObject.opt("ad_extra_data");
                    if (opt instanceof JSONObject) {
                        jSONObject2 = (JSONObject) opt;
                    } else if (opt instanceof String) {
                        jSONObject2 = new JSONObject((String) opt);
                    } else {
                        jSONObject2 = new JSONObject();
                    }
                    Iterator keys = aVar.f65883c.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        jSONObject2.put(str, aVar.f65883c.opt(str));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m75530a(String str, C19381j jVar) throws Exception {
        if (f60714e == null) {
            f60714e = (DownloaderManagerApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(DownloaderManagerApi.class);
        }
        String str2 = (String) f60714e.doGet(40960, str).get();
        if (jVar != null) {
            TextUtils.isEmpty(str2);
        }
    }

    /* renamed from: a */
    public static void m75526a(final Activity activity, String[] strArr, final C19382k kVar) {
        if (activity != null) {
            final int i = 0;
            boolean z = true;
            while (true) {
                if (i >= strArr.length) {
                    i = 0;
                    break;
                }
                if (C0683b.m2909b((Context) activity, strArr[0]) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                }
                i++;
            }
            if (kVar != null) {
                if (z) {
                    kVar.mo51367a();
                } else {
                    C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
                        /* renamed from: a */
                        public final void mo53549a(String[] strArr, int[] iArr) {
                            if (iArr.length > 0) {
                                if (iArr[0] == -1) {
                                    if (!ActivityCompat.m2242a(activity, strArr[i])) {
                                        DownloaderManagerHolder.m75525a(activity);
                                    }
                                    kVar.mo51368a(strArr[i]);
                                } else if (iArr[0] == 0) {
                                    kVar.mo51367a();
                                }
                            }
                        }
                    });
                }
            }
        }
    }
}
