package com.bytedance.sdk.account.bdplatform.impl.p658a;

import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.sdk.account.bdplatform.p655a.C12751a.C12752a;
import com.bytedance.sdk.account.bdplatform.p655a.C12755b;
import com.bytedance.sdk.account.bdplatform.p656b.C12758a;
import com.bytedance.sdk.account.bdplatform.p656b.C12759b;
import com.bytedance.sdk.account.bdplatform.p656b.C12764e;
import com.bytedance.sdk.account.bdplatform.p657c.C12765a;
import com.bytedance.sdk.account.p650b.p653c.C12745c.C12746a;
import com.bytedance.sdk.account.p650b.p654d.C12748a;
import com.bytedance.sdk.account.p650b.p654d.C12749b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.sdk.account.bdplatform.impl.a.b */
public final class C12779b implements C12752a {

    /* renamed from: a */
    C12755b f33814a;

    /* renamed from: b */
    private Context f33815b;

    /* renamed from: a */
    private static Set<String> m37104a(String str) {
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            if (str.contains(",")) {
                hashSet.addAll(Arrays.asList(str.split(",")));
            } else {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private String m37105c(C12746a aVar) {
        StringBuilder sb = new StringBuilder();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(m37104a(aVar.f33741f));
        hashSet.addAll(m37104a(aVar.f33742g));
        hashSet.addAll(m37104a(aVar.f33743h));
        for (String append : hashSet) {
            sb.append(append);
            sb.append(",");
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final C12764e mo31254b(C12746a aVar) {
        try {
            return C12778a.m37102b(this.f33814a.mo31270a(new Builder().scheme(WebKitApi.SCHEME_HTTPS).authority(this.f33814a.mo31275c()).path("/passport/open/authorize/ticket/").appendQueryParameter("client_key", aVar.f33738c).appendQueryParameter("scope", m37105c(aVar)).build().toString()));
        } catch (Throwable th) {
            C12764e eVar = new C12764e();
            eVar.f33784f = C12765a.m37077a(this.f33814a, th);
            return eVar;
        }
    }

    /* renamed from: a */
    public final C12759b mo31253a(C12746a aVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("client_key", aVar.f33738c);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.f33741f);
        if (!TextUtils.isEmpty(aVar.f33742g)) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(aVar.f33742g);
        }
        if (!TextUtils.isEmpty(aVar.f33743h)) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(aVar.f33743h);
        }
        hashMap.put("scope", sb.toString());
        try {
            return C12778a.m37103c(this.f33814a.mo31271a(new Builder().scheme(WebKitApi.SCHEME_HTTPS).authority(this.f33814a.mo31276d()).path("/oauth/auth_info/").build().toString(), hashMap));
        } catch (Throwable th) {
            C12759b bVar = new C12759b();
            bVar.f33784f = C12765a.m37077a(this.f33814a, th);
            return bVar;
        }
    }

    public C12779b(Context context, C12755b bVar) {
        this.f33814a = bVar;
        this.f33815b = context;
    }

    /* renamed from: a */
    public final C12758a mo31252a(C12746a aVar, String str) {
        List a = C12749b.m37038a(this.f33815b, aVar.getCallerPackage());
        HashMap hashMap = new HashMap(6);
        hashMap.put("client_key", aVar.f33738c);
        hashMap.put("response_type", "code");
        hashMap.put("scope", aVar.f33741f);
        hashMap.put("state", aVar.f33736a);
        hashMap.put("from", aVar.f33739d);
        hashMap.put("ticket", str);
        hashMap.put("app_identity", C12748a.m37035a(aVar.getCallerPackage()));
        hashMap.put("signature", C12749b.m37037a(a));
        if (TextUtils.equals("wap_to_native", aVar.f33739d) && !TextUtils.isEmpty(aVar.f33737b)) {
            hashMap.put("redirect_uri", aVar.f33737b);
        }
        try {
            return C12778a.m37100a(this.f33814a.mo31271a(new Builder().scheme(WebKitApi.SCHEME_HTTPS).authority(this.f33814a.mo31276d()).path("/oauth/authorize/").build().toString(), hashMap));
        } catch (Throwable th) {
            new C12758a().f33784f = C12765a.m37077a(this.f33814a, th);
            return null;
        }
    }
}
