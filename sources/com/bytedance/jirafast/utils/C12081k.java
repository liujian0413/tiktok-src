package com.bytedance.jirafast.utils;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.jirafast.C11999a;
import com.bytedance.jirafast.models.C12009a;
import com.bytedance.jirafast.models.C12011c;
import com.bytedance.jirafast.models.C12012d;
import com.bytedance.jirafast.net.C12013a;
import com.bytedance.jirafast.net.C12014b;
import com.bytedance.jirafast.net.C12015c;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.bytedance.jirafast.utils.k */
public final class C12081k {

    /* renamed from: a */
    protected C6309f f32163a;

    /* renamed from: b */
    protected OkHttpClient f32164b;

    /* renamed from: com.bytedance.jirafast.utils.k$a */
    static class C12083a {

        /* renamed from: a */
        public static C12081k f32166a = new C12081k();
    }

    /* renamed from: a */
    public static C12081k m35238a() {
        return C12083a.f32166a;
    }

    /* renamed from: b */
    private C6310a m35240b() {
        return new C6310a() {
            public final void handleMsg(Message message) {
            }
        };
    }

    /* renamed from: c */
    private static OkHttpClient m35241c() {
        return new OkHttpClient();
    }

    private C12081k() {
        this.f32164b = m35241c();
        this.f32163a = new C6309f(m35240b());
    }

    /* renamed from: a */
    private static String m35239a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo29756a(C12012d dVar) {
        C12011c cVar;
        C12014b bVar = new C12014b(this.f32164b);
        StringBuilder sb = new StringBuilder("");
        String str = "";
        if (dVar.f31950e != null && dVar.f31950e.size() > 0) {
            List a = bVar.mo29662a(dVar.f31950e);
            for (int i = 0; i < dVar.f31950e.size(); i++) {
                if (((C12009a) a.get(i)).f31930b != null) {
                    StringBuilder sb2 = new StringBuilder(",\"");
                    sb2.append(new File((String) dVar.f31950e.get(i)).getName());
                    sb2.append("\":\"");
                    sb2.append((String) ((C12009a) a.get(i)).f31930b.getUrlList().get(0));
                    sb2.append("\"");
                    sb.append(sb2.toString());
                }
            }
        }
        C12015c cVar2 = new C12015c(this.f32164b);
        if (dVar.f31949d != null && dVar.f31949d.size() > 0) {
            List a2 = cVar2.mo29663a(dVar.f31949d);
            String str2 = str;
            for (int i2 = 0; i2 < dVar.f31949d.size(); i2++) {
                if (((C12009a) a2.get(i2)).f31930b != null) {
                    StringBuilder sb3 = new StringBuilder(",\"");
                    sb3.append(new File((String) dVar.f31949d.get(i2)).getName());
                    sb3.append("\":\"");
                    sb3.append((String) ((C12009a) a2.get(i2)).f31930b.getUrlList().get(0));
                    sb3.append("\"");
                    sb.append(sb3.toString());
                    str2 = ((C12009a) a2.get(i2)).f31930b.getUri();
                }
            }
            str = str2;
        }
        String sb4 = sb.toString();
        if (!sb4.equals("")) {
            sb4 = sb4.substring(1);
        }
        StringBuilder sb5 = new StringBuilder("{");
        sb5.append(sb4);
        sb5.append("}");
        try {
            cVar = (C12011c) C12013a.m35082a().fastback(dVar.f31946a, 1, URLEncoder.encode(dVar.f31947b, "UTF-8"), URLEncoder.encode(dVar.f31948c, "UTF-8"), URLEncoder.encode(sb5.toString(), "UTF-8"), URLEncoder.encode(str, "UTF-8"), C12072c.m35216a(), "Android", m35239a(C11999a.m35070a())).get();
        } catch (Throwable unused) {
            cVar = null;
        }
        if (cVar == null) {
            return "Failure to submit, please try again.";
        }
        if (cVar.f31944a == 0) {
            return "";
        }
        if (TextUtils.isEmpty(cVar.f31945b)) {
            return "Failure to submit, please try again.";
        }
        return cVar.f31945b;
    }
}
