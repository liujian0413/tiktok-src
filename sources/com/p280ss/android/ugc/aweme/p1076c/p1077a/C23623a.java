package com.p280ss.android.ugc.aweme.p1076c.p1077a;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.apm.C6159b;
import com.bytedance.apm.p236a.C6154d;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p471b.p472a.C9661a;
import com.bytedance.p471b.p472a.C9666b;
import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.agilelogger.ALog;
import com.p280ss.android.agilelogger.C19159a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.c.a.a */
public final class C23623a {

    /* renamed from: a */
    public static final C23623a f62303a = new C23623a();

    /* renamed from: b */
    private static ArrayList<String> f62304b = new ArrayList<>();

    /* renamed from: c */
    private static HashMap<String, ArrayList<C23626b>> f62305c = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.c.a.a$a */
    static final class C23624a implements Runnable {

        /* renamed from: a */
        public static final C23624a f62306a = new C23624a();

        C23624a() {
        }

        public final void run() {
            String str;
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - 10800;
            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
            C19159a aVar = ALog.f19201a;
            if (aVar != null) {
                str = aVar.f51790d;
            } else {
                str = null;
            }
            C6159b.m19104a(str, currentTimeMillis, currentTimeMillis2, "Network", (C6154d) C236251.f62307a);
        }
    }

    private C23623a() {
    }

    static {
        m77526b();
    }

    /* renamed from: a */
    public static void m77524a() {
        String str = "fantasyLog";
        try {
            C9661a a = C9661a.m28558a();
            C7573i.m23582a((Object) a, "FTwoManager.getInstance()");
            C9666b b = a.mo24004b();
            C7573i.m23582a((Object) b, "FTwoManager.getInstance().service");
            ALog.m20862b(str, b.mo24005a());
            for (Entry value : f62305c.entrySet()) {
                ArrayList<C23626b> arrayList = (ArrayList) value.getValue();
                if (!C6307b.m19566a((Collection<T>) arrayList)) {
                    for (C23626b bVar : arrayList) {
                        ALog.m20862b("Network", bVar.toString());
                    }
                }
            }
            f62305c.clear();
            new Handler().postDelayed(C23624a.f62306a, 60000);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static void m77526b() {
        List list;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            list = a.getApiAlogWhiteList();
        } catch (Exception unused) {
            list = null;
        }
        if (C6307b.m19566a((Collection<T>) list)) {
            Collection collection = f62304b;
            String[] stringArray = C6399b.m19921a().getResources().getStringArray(R.array.e);
            C7573i.m23582a((Object) stringArray, "AppContextManager.getApp…rray.api_alog_white_list)");
            C7525m.m23479a(collection, (T[]) stringArray);
        } else if (list != null) {
            f62304b = (ArrayList) list;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
        }
    }

    /* renamed from: a */
    public static void m77525a(String str, List<C12461b> list) {
        C7573i.m23587b(str, "url");
        Uri parse = Uri.parse(str);
        if (!TextUtils.isEmpty(parse.getQueryParameter("device_id")) && !TextUtils.isEmpty(parse.getQueryParameter("aid")) && list != null) {
            StringBuilder sb = new StringBuilder("URL: ");
            sb.append(str);
            sb.append("\r\nHEADER");
            sb.append(list.toString());
            ALog.m20862b("API_URL_HEADER", sb.toString());
        }
    }
}
