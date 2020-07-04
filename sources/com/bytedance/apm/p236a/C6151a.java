package com.bytedance.apm.p236a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.C6159b;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p236a.p237b.C6152a;
import com.bytedance.apm.p236a.p461a.C9547a;
import com.bytedance.apm.p236a.p462c.C9552b;
import com.bytedance.apm.util.C6292i;
import com.bytedance.apm.util.C9642e;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.p066a.p067a.p070b.p071a.C2076a;
import com.bytedance.services.slardar.config.C6480a;
import com.bytedance.services.slardar.config.IConfigManager;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.a */
public final class C6151a implements C6480a {

    /* renamed from: a */
    private static volatile Context f18103a;

    /* renamed from: b */
    private static boolean f18104b;

    /* renamed from: c */
    private static volatile C9554e f18105c;

    public final void onReady() {
    }

    /* renamed from: a */
    public static void m19091a(Context context) {
        f18103a = context;
        f18105c = new C9548b();
        ((IConfigManager) C6446c.m20127a(IConfigManager.class)).registerConfigListener(new C6151a());
    }

    /* renamed from: a */
    private static String m19089a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
        if (lastIndexOf == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".zip");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, lastIndexOf));
        sb2.append(".zip");
        return sb2.toString();
    }

    /* renamed from: b */
    private static C9547a m19096b(List<String> list) {
        String str;
        C9547a aVar = new C9547a();
        JSONObject j = C6174c.m19152j();
        if (j != null) {
            aVar.f26127b = j.optString("aid");
            aVar.f26126a = j.optString("device_id");
        }
        if (C9552b.m28307a(f18103a).contains(":")) {
            str = C9552b.m28307a(f18103a);
        } else {
            str = "main";
        }
        aVar.f26128c = str;
        aVar.f26129d = list;
        aVar.f26130e = j;
        return aVar;
    }

    /* renamed from: a */
    private static String m19090a(List<String> list) {
        File file = new File((String) list.get(0));
        File file2 = new File(file.getParent(), m19089a(file.getName()));
        if (file2.exists()) {
            file2.delete();
        }
        try {
            C9642e.m28531a(list, file2.getAbsolutePath());
            return file2.getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m19095a(C9547a aVar) {
        if (TextUtils.isEmpty(aVar.f26127b) || TextUtils.isEmpty(aVar.f26126a) || TextUtils.isEmpty(aVar.f26128c) || aVar.f26129d == null || aVar.f26129d.size() == 0) {
            return false;
        }
        return true;
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        f18104b = jSONObject.optBoolean("enable_active_upload_alog", false);
    }

    /* renamed from: a */
    public static void m19092a(String str, long j, long j2, String str2, C2076a aVar) {
        if (f18103a != null && !TextUtils.isEmpty(str) && new File(str).exists()) {
            m19093a(str, j, j2, str2, (C6153c) null);
        }
    }

    /* renamed from: a */
    private static void m19093a(String str, long j, long j2, String str2, C6153c cVar) {
        List list;
        if (f18105c != null) {
            list = f18105c.mo23656a(f18103a, str, j, j2);
        } else {
            list = null;
        }
        if (!C6292i.m19525a(list)) {
            C9547a b = m19096b(list);
            if (!m19095a(b)) {
                C6159b.m19102a("apm_event_stats_alog_fail", 5, (JSONObject) null);
                return;
            }
            String a = m19090a(b.f26129d);
            if (TextUtils.isEmpty(a)) {
                C6152a.m19098a(b.f26127b, b.f26126a, b.f26128c, b.f26129d, str2, b.f26130e);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a);
                C6152a.m19098a(b.f26127b, b.f26126a, b.f26128c, arrayList, str2, b.f26130e);
                new File(a).delete();
            }
        } else {
            C6159b.m19102a("apm_event_stats_alog_fail", 4, (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static void m19094a(String str, long j, long j2, String str2, C6154d dVar, C6153c cVar) {
        C6159b.m19102a("apm_event_stats_alog", 0, (JSONObject) null);
        if (f18103a == null) {
            C6159b.m19102a("apm_event_stats_alog_fail", 0, (JSONObject) null);
        } else if (TextUtils.isEmpty(str)) {
            C6159b.m19102a("apm_event_stats_alog_fail", 1, (JSONObject) null);
        } else if (!new File(str).exists()) {
            C6159b.m19102a("apm_event_stats_alog_fail", 2, (JSONObject) null);
        } else {
            if (dVar != null) {
                dVar.mo14820a();
            } else {
                C6159b.m19102a("apm_event_stats_alog_fail", 3, (JSONObject) null);
            }
            m19093a(str, j, j2, str2, cVar);
        }
    }
}
