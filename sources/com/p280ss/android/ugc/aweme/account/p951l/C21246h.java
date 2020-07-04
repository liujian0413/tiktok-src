package com.p280ss.android.ugc.aweme.account.p951l;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.l.h */
public final class C21246h {

    /* renamed from: a */
    public String f57055a;

    /* renamed from: b */
    public String f57056b;

    /* renamed from: c */
    public String f57057c;

    /* renamed from: d */
    public String f57058d;

    /* renamed from: e */
    public String f57059e;

    /* renamed from: f */
    public boolean f57060f;

    /* renamed from: g */
    public String f57061g;

    /* renamed from: h */
    public String f57062h;

    /* renamed from: i */
    public int f57063i;

    /* renamed from: j */
    public String f57064j;

    /* renamed from: k */
    public String f57065k;

    /* renamed from: l */
    public String f57066l;

    /* renamed from: m */
    public String f57067m;

    /* renamed from: n */
    private boolean f57068n;

    /* renamed from: o */
    private int f57069o = -1;

    /* renamed from: a */
    public final Map<String, String> mo57171a() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f57055a)) {
            hashMap.put("nickname", this.f57055a);
        }
        if (this.f57056b != null) {
            hashMap.put("signature", this.f57056b);
        }
        if (!TextUtils.isEmpty(this.f57057c)) {
            hashMap.put("unique_id", this.f57057c);
        }
        if (!TextUtils.isEmpty(this.f57058d)) {
            hashMap.put("avatar_uri", this.f57058d);
        }
        if (this.f57068n) {
            hashMap.put("video_icon_virtual_URI", "");
        } else if (!TextUtils.isEmpty(this.f57059e)) {
            hashMap.put("video_icon_virtual_URI", this.f57059e);
        }
        if (!TextUtils.isEmpty(this.f57061g)) {
            hashMap.put("school_name", this.f57061g);
        }
        if (!TextUtils.isEmpty(this.f57062h)) {
            hashMap.put("poi_id", this.f57062h);
        }
        hashMap.put("school_type", String.valueOf(this.f57063i));
        if (!TextUtils.isEmpty(this.f57064j)) {
            hashMap.put("ins_id", this.f57064j);
        }
        if (!TextUtils.isEmpty(this.f57065k)) {
            hashMap.put("google_account", this.f57065k);
        }
        if (!TextUtils.isEmpty(this.f57066l)) {
            hashMap.put("youtube_channel_id", this.f57066l);
        }
        if (!TextUtils.isEmpty(this.f57067m)) {
            hashMap.put("youtube_channel_title", this.f57067m);
        }
        hashMap.put("is_binded_weibo", String.valueOf(this.f57060f ? 1 : 0));
        if (this.f57069o != -1) {
            hashMap.put("secret", String.valueOf(this.f57069o));
        }
        return hashMap;
    }
}
