package com.p280ss.optimizer.live.sdk.base;

import android.text.TextUtils;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.optimizer.live.sdk.base.a */
public final class C45883a {

    /* renamed from: a */
    private final String f117293a;

    /* renamed from: b */
    private final C45884b f117294b;

    /* renamed from: c */
    private final List<Pair<String, String>> f117295c;

    /* renamed from: a */
    public final JSONObject mo111162a(String str) throws Exception {
        return m143973b(str);
    }

    C45883a(C45885c cVar) {
        this.f117293a = cVar.f117297b;
        this.f117294b = cVar.f117298c;
        this.f117295c = cVar.f117299d;
    }

    /* renamed from: b */
    private JSONObject m143973b(String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f117293a);
        sb.append(str);
        return new JSONObject(this.f117294b.mo14420a(m143972a(sb.toString(), this.f117295c)));
    }

    /* renamed from: a */
    private static String m143971a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final JSONObject mo111163a(String str, Object obj) throws Exception {
        return m143974b(str, obj);
    }

    /* renamed from: a */
    private static String m143972a(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) >= 0) {
            sb.append("&");
        } else if (list.size() > 0) {
            sb.append("?");
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append("&");
            }
            Pair pair = (Pair) list.get(i);
            sb.append((String) pair.first);
            sb.append('=');
            sb.append(m143971a((String) pair.second, "UTF-8"));
        }
        return sb.toString();
    }

    /* renamed from: b */
    private JSONObject m143974b(String str, Object obj) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f117293a);
        sb.append(str);
        return new JSONObject(this.f117294b.mo14421a(m143972a(sb.toString(), this.f117295c), obj.toString().getBytes("UTF-8"), "gzip", "application/json; charset=utf-8"));
    }
}
