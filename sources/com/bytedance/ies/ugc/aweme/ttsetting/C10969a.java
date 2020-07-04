package com.bytedance.ies.ugc.aweme.ttsetting;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.ttsetting.TTSettingDataApi.SettingApi;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataBean;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataResponse;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12474e;
import com.bytedance.retrofit2.C12534t;
import com.google.gson.C6600e;
import com.google.gson.C6709k;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a */
public final class C10969a {

    /* renamed from: a */
    public static final C10969a f29672a = new C10969a();

    /* renamed from: b */
    private static ArrayList<Object> f29673b;

    /* renamed from: c */
    private static ArrayList<C10975b> f29674c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile TTSettingData f29675d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile JSONObject f29676e;

    /* renamed from: f */
    private static boolean f29677f;

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a */
    public static final class C10970a implements C12474e<C6709k> {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f29678a;

        /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$a$a */
        static final class C10971a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C10970a f29679a;

            /* renamed from: b */
            final /* synthetic */ C12534t f29680b;

            C10971a(C10970a aVar, C12534t tVar) {
                this.f29679a = aVar;
                this.f29680b = tVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
                if (r2 == null) goto L_0x0016;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    com.bytedance.retrofit2.t r0 = r4.f29680b
                    if (r0 == 0) goto L_0x0009
                    T r0 = r0.f33302b
                    com.google.gson.k r0 = (com.google.gson.C6709k) r0
                    goto L_0x000a
                L_0x0009:
                    r0 = 0
                L_0x000a:
                    com.bytedance.ies.ugc.aweme.ttsetting.a$a r1 = r4.f29679a
                    kotlin.jvm.internal.Ref$ObjectRef r1 = r1.f29678a
                    if (r0 == 0) goto L_0x0016
                    java.lang.String r2 = r0.toString()
                    if (r2 != 0) goto L_0x0018
                L_0x0016:
                    java.lang.String r2 = ""
                L_0x0018:
                    r1.element = r2
                    com.bytedance.ies.ugc.aweme.ttsetting.a$a r1 = r4.f29679a
                    kotlin.jvm.internal.Ref$ObjectRef r1 = r1.f29678a
                    T r1 = r1.element
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 == 0) goto L_0x0030
                    com.bytedance.ies.ugc.aweme.ttsetting.a r0 = com.bytedance.ies.ugc.aweme.ttsetting.C10969a.f29672a
                    r0.mo26460a()
                    return
                L_0x0030:
                    com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataResponse r1 = new com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataResponse
                    com.google.gson.e r2 = new com.google.gson.e
                    r2.<init>()
                    java.lang.Class<com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData> r3 = com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData.class
                    java.lang.Object r0 = r2.mo15970a(r0, r3)
                    java.lang.String r2 = "Gson().fromJson(response…TSettingData::class.java)"
                    kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                    com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData r0 = (com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingData) r0
                    org.json.JSONObject r2 = new org.json.JSONObject
                    com.bytedance.ies.ugc.aweme.ttsetting.a$a r3 = r4.f29679a
                    kotlin.jvm.internal.Ref$ObjectRef r3 = r3.f29678a
                    T r3 = r3.element
                    java.lang.String r3 = (java.lang.String) r3
                    r2.<init>(r3)
                    r1.<init>(r0, r2)
                    android.os.Handler r0 = new android.os.Handler
                    android.os.Looper r2 = android.os.Looper.getMainLooper()
                    r0.<init>(r2)
                    com.bytedance.ies.ugc.aweme.ttsetting.a$a$a$1 r2 = new com.bytedance.ies.ugc.aweme.ttsetting.a$a$a$1
                    r2.<init>(r4, r1)
                    java.lang.Runnable r2 = (java.lang.Runnable) r2
                    r0.post(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.ttsetting.C10969a.C10970a.C10971a.run():void");
            }
        }

        C10970a(ObjectRef objectRef) {
            this.f29678a = objectRef;
        }

        /* renamed from: a */
        public final void mo26463a(C12466b<C6709k> bVar, C12534t<C6709k> tVar) {
            C7258h.m22732e().submit(new C10971a(this, tVar));
        }

        /* renamed from: a */
        public final void mo26464a(C12466b<C6709k> bVar, Throwable th) {
            C7573i.m23587b(bVar, "call");
            C7573i.m23587b(th, "t");
            C10969a.f29672a.mo26460a();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.a$b */
    static final class C10973b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f29683a;

        C10973b(String str) {
            this.f29683a = str;
        }

        public final void run() {
            C10969a.f29675d = (TTSettingData) new C6600e().mo15974a(this.f29683a, TTSettingData.class);
            C10969a.f29676e = new JSONObject(this.f29683a);
            new Handler(Looper.getMainLooper()).post(C109741.f29684a);
        }
    }

    private C10969a() {
    }

    /* renamed from: c */
    private static boolean m32158c() {
        if (!TextUtils.isEmpty(Keva.getRepo("TTSettingData").getString("settingData", ""))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m32156b() {
        ArrayList<Object> arrayList = f29673b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                TTSettingData tTSettingData = f29675d;
                if (tTSettingData != null) {
                    TTSettingDataBean data = tTSettingData.getData();
                    if (data != null) {
                        data.getApp();
                    }
                }
            }
        }
        f29673b = null;
        ArrayList<C10975b> arrayList2 = f29674c;
        if (arrayList2 != null) {
            for (C10975b a : arrayList2) {
                a.mo26470a(m32152a(f29676e));
            }
        }
        f29674c = null;
    }

    /* renamed from: d */
    private static void m32159d() {
        f29677f = true;
        ArrayList<Object> arrayList = f29673b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
                new Exception("no data to show");
            }
        }
        f29673b = null;
        ArrayList<C10975b> arrayList2 = f29674c;
        if (arrayList2 != null) {
            for (C10975b a : arrayList2) {
                a.mo26469a((Throwable) new Exception("no data to show"));
            }
        }
        f29674c = null;
    }

    /* renamed from: a */
    public final void mo26460a() {
        String string = Keva.getRepo("TTSettingData").getString("settingData", "");
        if (TextUtils.isEmpty(string)) {
            m32159d();
            return;
        }
        C7573i.m23582a((Object) string, "settingResponse");
        m32157b(string);
    }

    /* renamed from: b */
    private static void m32157b(String str) {
        C7258h.m22732e().submit(new C10973b(str));
    }

    /* renamed from: a */
    private static JSONObject m32152a(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                return optJSONObject.optJSONObject("app");
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m32155a(C10975b bVar) {
        C7573i.m23587b(bVar, "callback");
        JSONObject jSONObject = f29676e;
        if (jSONObject != null) {
            bVar.mo26470a(m32152a(jSONObject));
        } else if (f29677f) {
            bVar.mo26469a((Throwable) new Exception("no data to show"));
        } else {
            ArrayList<C10975b> arrayList = f29674c;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            f29674c = arrayList;
            if (arrayList != null) {
                arrayList.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo26462a(String str) {
        C7573i.m23587b(str, "host");
        IRetrofit createNewRetrofit = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(str);
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = "";
        ((SettingApi) createNewRetrofit.create(SettingApi.class)).getResponse(m32158c(), 1, 1).enqueue(new C10970a(objectRef));
    }

    /* renamed from: a */
    public final void mo26461a(TTSettingDataResponse tTSettingDataResponse, String str) {
        f29675d = tTSettingDataResponse.getTtSettingData();
        f29676e = tTSettingDataResponse.getTtSettingDataJSONObject();
        Keva repo = Keva.getRepo("TTSettingData");
        if (!TextUtils.isEmpty(str)) {
            repo.storeString("settingData", str);
            repo.storeLong("last_get_setting_time", System.currentTimeMillis());
            m32156b();
            return;
        }
        String string = repo.getString("settingData", "");
        if (TextUtils.isEmpty(string)) {
            m32159d();
            return;
        }
        C7573i.m23582a((Object) string, "settingResponseFromKeva");
        m32157b(string);
    }
}
