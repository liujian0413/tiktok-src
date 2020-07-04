package com.p280ss.android.ugc.aweme.account.login.forgetpsw.p959a;

import com.bytedance.sdk.account.p645a.C12714b.C12715a;
import com.google.gson.C6600e;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.model.FindPswByEmailResponse;
import com.p280ss.android.ugc.aweme.account.util.C22329h;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.app.application.C22863b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.a.a */
public final class C21365a {

    /* renamed from: a */
    public static final String f57376a;

    /* renamed from: b */
    public static final String f57377b;

    /* renamed from: c */
    public static final String f57378c;

    /* renamed from: a */
    private static String m71847a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C12715a.f33723a);
        sb.append("api2.musical.ly");
        return sb.toString();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(m71847a());
        sb.append("/aweme/v1/passport/find-password-via-email/");
        f57376a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m71847a());
        sb2.append("/passport/email/send_code/");
        f57377b = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://www.tiktok.com/mail-forgetpwd-new/index.html?aid=");
        sb3.append(C22863b.f60589a);
        f57378c = sb3.toString();
    }

    /* renamed from: a */
    static FindPswByEmailResponse m71846a(String str) throws Exception {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (C22345t.m73962a()) {
            arrayList.add(new C19565e("mix_mode", "1"));
            arrayList.add(new C19565e("email", C22329h.m73928a(str)));
            arrayList.add(new C19565e("type", C22329h.m73928a("4")));
            arrayList.add(new C19565e("next", f57378c));
            str2 = NetworkUtils.executePost(Integer.MAX_VALUE, f57377b, (List<C19565e>) arrayList);
        } else {
            arrayList.add(new C19565e("email", str));
            str2 = NetworkUtils.executePost(Integer.MAX_VALUE, f57376a, (List<C19565e>) arrayList);
        }
        return (FindPswByEmailResponse) new C6600e().mo15974a(str2, FindPswByEmailResponse.class);
    }
}
