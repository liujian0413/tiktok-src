package com.bytedance.android.livesdkapi.depend.model.live;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Quality;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StreamUrl {
    @C6593c(mo15949a = "id")

    /* renamed from: a */
    public long f25602a;
    @C6593c(mo15949a = "id_str")

    /* renamed from: b */
    public String f25603b;
    @C6593c(mo15949a = "provider")

    /* renamed from: c */
    public int f25604c;
    @C6593c(mo15949a = "rtmp_push_url")

    /* renamed from: d */
    public String f25605d;
    @C6593c(mo15949a = "push_urls")

    /* renamed from: e */
    public List<String> f25606e;
    @C6593c(mo15949a = "rtmp_pull_url")

    /* renamed from: f */
    public String f25607f;
    @C6593c(mo15949a = "flv_pull_url")

    /* renamed from: g */
    public Map<String, String> f25608g;
    @C6593c(mo15949a = "resolution_name")

    /* renamed from: h */
    public Map<String, String> f25609h;
    @C6593c(mo15949a = "flv_pull_url_params")

    /* renamed from: i */
    Map<String, String> f25610i;
    @C6593c(mo15949a = "candidate_resolution")

    /* renamed from: j */
    public List<String> f25611j;
    @C6593c(mo15949a = "default_resolution")

    /* renamed from: k */
    public String f25612k;
    @C6593c(mo15949a = "extra")

    /* renamed from: l */
    public C9383t f25613l;
    @C6593c(mo15949a = "rtmp_pull_url_params")

    /* renamed from: m */
    String f25614m;
    @C6593c(mo15949a = "rtmp_push_url_params")

    /* renamed from: n */
    public String f25615n;
    @C6593c(mo15949a = "live_core_sdk_data")

    /* renamed from: o */
    public LiveCoreSDKData f25616o;

    /* renamed from: p */
    public String f25617p;

    /* renamed from: q */
    public String f25618q;
    public final LinkedList<Quality> qualityList = new LinkedList<>();
    final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();

    /* renamed from: r */
    public String f25619r = null;

    /* renamed from: s */
    public String f25620s = null;
    final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();

    /* renamed from: t */
    Quality f25621t = null;

    /* renamed from: u */
    private Quality f25622u = null;

    /* renamed from: e */
    public final Set<String> mo23054e() {
        return this.qualityMap.keySet();
    }

    /* renamed from: a */
    public final String mo23050a() {
        if (C6319n.m19593a(this.f25617p)) {
            return this.f25605d;
        }
        return this.f25617p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo23053d() {
        mo23051b();
        if (!this.qualityMap.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final String mo23056g() {
        if (this.f25621t == null) {
            return "";
        }
        return this.f25621t.name;
    }

    /* renamed from: h */
    public final String mo23057h() {
        if (this.f25622u == null) {
            return "";
        }
        return this.f25622u.name;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo23055f() {
        if (this.f25616o == null) {
            return false;
        }
        mo23052c();
        if (!this.qualityList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo23052c() {
        this.f25621t = null;
        this.f25622u = null;
        this.qualityList.clear();
        if (this.f25616o != null) {
            if (!C6311g.m19573a(this.f25616o.getQualityList())) {
                for (Quality quality : this.f25616o.getQualityList()) {
                    this.qualityList.add(quality);
                    if (this.f25622u == null) {
                        this.f25622u = quality;
                    }
                }
            }
            this.f25621t = this.f25616o.getDefaultQuality();
            if (this.qualityList.isEmpty()) {
                this.f25622u = this.f25621t;
                this.qualityList.add(this.f25621t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo23051b() {
        Object obj;
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.f25619r = null;
        this.f25620s = null;
        if (!(this.f25611j == null || this.f25609h == null || this.f25608g == null)) {
            for (String str : this.f25611j) {
                String str2 = (String) this.f25609h.get(str);
                if (str2 != null) {
                    String str3 = (String) this.f25608g.get(str);
                    if (str3 != null) {
                        if (this.f25610i == null) {
                            obj = null;
                        } else {
                            obj = (String) this.f25610i.get(str);
                        }
                        this.qualityMap.put(str2, str3);
                        this.sdkParamsMap.put(str2, obj);
                        if (str.equals(this.f25612k)) {
                            this.f25619r = str2;
                        } else if (this.f25619r == null) {
                            this.f25619r = str2;
                        }
                        if (this.f25620s == null) {
                            this.f25620s = str2;
                        }
                    }
                }
            }
        }
        if (this.qualityMap.isEmpty() && !TextUtils.isEmpty(this.f25607f)) {
            this.f25619r = "default";
            this.f25620s = this.f25619r;
            this.qualityMap.put(this.f25619r, this.f25607f);
            this.sdkParamsMap.put(this.f25619r, this.f25614m);
        }
    }
}
