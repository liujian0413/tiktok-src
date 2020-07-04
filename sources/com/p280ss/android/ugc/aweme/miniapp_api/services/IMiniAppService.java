package com.p280ss.android.ugc.aweme.miniapp_api.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33437a;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33438b;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33439c;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33440d;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33441e;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33442f;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33443g;
import com.p280ss.android.ugc.aweme.miniapp_api.depend.C33444h;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33433h;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService */
public interface IMiniAppService {

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService$a */
    public static class C7166a {

        /* renamed from: a */
        public String f20078a;

        /* renamed from: b */
        public String f20079b;

        /* renamed from: c */
        public String f20080c;

        /* renamed from: d */
        public String f20081d;

        /* renamed from: e */
        public String f20082e;

        /* renamed from: f */
        public C33443g f20083f;

        /* renamed from: g */
        public C33439c f20084g;

        /* renamed from: h */
        public C33442f f20085h;

        /* renamed from: i */
        public C33440d f20086i;

        /* renamed from: j */
        public C33437a f20087j;

        /* renamed from: k */
        public C33438b f20088k;

        /* renamed from: l */
        public C33444h f20089l;

        /* renamed from: m */
        public C33441e f20090m;

        /* renamed from: a */
        public final C7166a mo18634a(C33437a aVar) {
            this.f20087j = aVar;
            return this;
        }

        /* renamed from: b */
        public final C7166a mo18643b(String str) {
            this.f20079b = str;
            return this;
        }

        /* renamed from: c */
        public final C7166a mo18644c(String str) {
            this.f20080c = str;
            return this;
        }

        /* renamed from: d */
        public final C7166a mo18645d(String str) {
            this.f20081d = str;
            return this;
        }

        /* renamed from: e */
        public final C7166a mo18646e(String str) {
            this.f20082e = str;
            return this;
        }

        /* renamed from: a */
        public final C7166a mo18635a(C33438b bVar) {
            this.f20088k = bVar;
            return this;
        }

        /* renamed from: a */
        public final C7166a mo18636a(C33439c cVar) {
            this.f20084g = cVar;
            return this;
        }

        /* renamed from: a */
        public final C7166a mo18637a(C33440d dVar) {
            this.f20086i = dVar;
            return this;
        }

        /* renamed from: a */
        public final C7166a mo18638a(C33441e eVar) {
            this.f20090m = eVar;
            return this;
        }

        /* renamed from: a */
        public final C7166a mo18639a(C33442f fVar) {
            this.f20085h = fVar;
            return this;
        }

        /* renamed from: a */
        public final C7166a mo18640a(C33443g gVar) {
            this.f20083f = gVar;
            return this;
        }

        /* renamed from: a */
        public final C7166a mo18641a(C33444h hVar) {
            this.f20089l = hVar;
            return this;
        }

        /* renamed from: a */
        public final C7166a mo18642a(String str) {
            this.f20078a = str;
            return this;
        }
    }

    String addScene(String str, String str2);

    boolean checkMiniAppEnable(Context context);

    String getJsSdkVersion(Application application);

    void getShareInfo(String str, C33433h hVar);

    void handleActivityImageResult(int i, int i2, Intent intent);

    void initMiniApp();

    void initialize(Application application, C7166a aVar);

    boolean isMinAppAvailable(Context context, String str);

    void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4);

    void logExcitingVideoAd(Context context, String str, long j, String str2);

    void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr);

    boolean openMiniApp(Context context, MicroAppInfo microAppInfo, C33471b bVar);

    boolean openMiniApp(Context context, String str, C33471b bVar);

    void openMircoAppList(Activity activity);

    boolean openShortcut(Context context, Intent intent);

    void preloadMiniApp(String str);

    void preloadMiniApp(String str, int i);

    void remoteMobV3(String str, JSONObject jSONObject);

    String setLaunchModeHostTask(String str);
}
