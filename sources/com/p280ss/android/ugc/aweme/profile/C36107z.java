package com.p280ss.android.ugc.aweme.profile;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.z */
public final class C36107z {

    /* renamed from: a */
    public String f94395a;

    /* renamed from: b */
    public String f94396b;

    /* renamed from: c */
    public String f94397c;

    /* renamed from: d */
    public String f94398d;

    /* renamed from: e */
    public String f94399e;

    /* renamed from: f */
    public boolean f94400f;

    /* renamed from: g */
    public String f94401g;

    /* renamed from: h */
    public String f94402h;

    /* renamed from: i */
    public int f94403i;

    /* renamed from: j */
    public String f94404j;

    /* renamed from: k */
    public String f94405k;

    /* renamed from: l */
    public String f94406l;

    /* renamed from: m */
    public String f94407m;

    /* renamed from: n */
    public String f94408n;

    /* renamed from: o */
    public String f94409o;

    /* renamed from: p */
    private boolean f94410p;

    /* renamed from: q */
    private int f94411q = -1;

    /* renamed from: a */
    public final Map<String, String> mo91866a() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f94395a)) {
            hashMap.put("nickname", this.f94395a);
        }
        if (this.f94396b != null) {
            hashMap.put("signature", this.f94396b);
        }
        if (!TextUtils.isEmpty(this.f94397c)) {
            hashMap.put("unique_id", this.f94397c);
        }
        if (!TextUtils.isEmpty(this.f94398d)) {
            hashMap.put("avatar_uri", this.f94398d);
        }
        if (this.f94410p) {
            hashMap.put("video_icon_virtual_URI", "");
        } else if (!TextUtils.isEmpty(this.f94399e)) {
            hashMap.put("video_icon_virtual_URI", this.f94399e);
        }
        if (!TextUtils.isEmpty(this.f94401g)) {
            hashMap.put("school_name", this.f94401g);
        }
        if (!TextUtils.isEmpty(this.f94402h)) {
            hashMap.put("poi_id", this.f94402h);
        }
        hashMap.put("school_type", String.valueOf(this.f94403i));
        if (!TextUtils.isEmpty(this.f94404j)) {
            hashMap.put("ins_id", this.f94404j);
        }
        if (!TextUtils.isEmpty(this.f94405k)) {
            hashMap.put("google_account", this.f94405k);
        }
        if (!TextUtils.isEmpty(this.f94406l)) {
            hashMap.put("youtube_channel_id", this.f94406l);
        }
        if (!TextUtils.isEmpty(this.f94407m)) {
            hashMap.put("youtube_channel_title", this.f94407m);
        }
        hashMap.put("is_binded_weibo", String.valueOf(this.f94400f ? 1 : 0));
        if (this.f94411q != -1) {
            hashMap.put("secret", String.valueOf(this.f94411q));
        }
        if (this.f94408n != null) {
            hashMap.put("bio_url", this.f94408n);
        }
        if (this.f94409o != null) {
            hashMap.put("bio_email", this.f94409o);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo91867a(String str) {
        this.f94410p = TextUtils.isEmpty(str);
        this.f94399e = str;
    }
}
