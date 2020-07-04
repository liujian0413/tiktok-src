package com.p280ss.android.ugc.aweme.activity;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.activity.p983f2.F2Info;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.activity.b */
public final class C22370b {
    @C6593c(mo15949a = "status_code")

    /* renamed from: a */
    public final int f59682a;
    @C6593c(mo15949a = "status_msg")

    /* renamed from: b */
    public final String f59683b;
    @C6593c(mo15949a = "config_version_id")

    /* renamed from: c */
    public final int f59684c;
    @C6593c(mo15949a = "heartbeat_interval")

    /* renamed from: d */
    public final int f59685d;
    @C6593c(mo15949a = "button_display_strategy")

    /* renamed from: e */
    public final boolean f59686e;
    @C6593c(mo15949a = "android_activity_url")

    /* renamed from: f */
    public final String f59687f;
    @C6593c(mo15949a = "android_wish_activity_url")

    /* renamed from: g */
    public final String f59688g;
    @C6593c(mo15949a = "wallet_url")

    /* renamed from: h */
    public final String f59689h;
    @C6593c(mo15949a = "zip_file_path")

    /* renamed from: i */
    public final List<String> f59690i;
    @C6593c(mo15949a = "zip_file_md5")

    /* renamed from: j */
    public final String f59691j;
    @C6593c(mo15949a = "share_forbidden_strategy")

    /* renamed from: k */
    public final int f59692k;
    @C6593c(mo15949a = "fresh_start_time")

    /* renamed from: l */
    public final long f59693l;
    @C6593c(mo15949a = "fresh_end_time")

    /* renamed from: m */
    public final long f59694m;
    @C6593c(mo15949a = "standard_time")

    /* renamed from: n */
    public final long f59695n;
    @C6593c(mo15949a = "f2_info")

    /* renamed from: o */
    public final F2Info f59696o;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22370b) {
                C22370b bVar = (C22370b) obj;
                if ((this.f59682a == bVar.f59682a) && C7573i.m23585a((Object) this.f59683b, (Object) bVar.f59683b)) {
                    if (this.f59684c == bVar.f59684c) {
                        if (this.f59685d == bVar.f59685d) {
                            if ((this.f59686e == bVar.f59686e) && C7573i.m23585a((Object) this.f59687f, (Object) bVar.f59687f) && C7573i.m23585a((Object) this.f59688g, (Object) bVar.f59688g) && C7573i.m23585a((Object) this.f59689h, (Object) bVar.f59689h) && C7573i.m23585a((Object) this.f59690i, (Object) bVar.f59690i) && C7573i.m23585a((Object) this.f59691j, (Object) bVar.f59691j)) {
                                if (this.f59692k == bVar.f59692k) {
                                    if (this.f59693l == bVar.f59693l) {
                                        if (this.f59694m == bVar.f59694m) {
                                            if (!(this.f59695n == bVar.f59695n) || !C7573i.m23585a((Object) this.f59696o, (Object) bVar.f59696o)) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f59682a * 31;
        String str = this.f59683b;
        int i2 = 0;
        int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f59684c) * 31) + this.f59685d) * 31;
        boolean z = this.f59686e;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f59687f;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f59688g;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f59689h;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list = this.f59690i;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.f59691j;
        int hashCode6 = (((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f59692k) * 31;
        long j = this.f59693l;
        int i4 = (hashCode6 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f59694m;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f59695n;
        int i6 = (i5 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        F2Info f2Info = this.f59696o;
        if (f2Info != null) {
            i2 = f2Info.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewYearHeartBeatResp(statusCode=");
        sb.append(this.f59682a);
        sb.append(", statusMsg=");
        sb.append(this.f59683b);
        sb.append(", configVersionId=");
        sb.append(this.f59684c);
        sb.append(", heartBeatInterval=");
        sb.append(this.f59685d);
        sb.append(", buttonDisplayStrategy=");
        sb.append(this.f59686e);
        sb.append(", activityUrl=");
        sb.append(this.f59687f);
        sb.append(", wishActivityUrl=");
        sb.append(this.f59688g);
        sb.append(", walletUrl=");
        sb.append(this.f59689h);
        sb.append(", zipFilePath=");
        sb.append(this.f59690i);
        sb.append(", zipFileMd5=");
        sb.append(this.f59691j);
        sb.append(", shareForbiddenStrategy=");
        sb.append(this.f59692k);
        sb.append(", freshStartTime=");
        sb.append(this.f59693l);
        sb.append(", freshEndTime=");
        sb.append(this.f59694m);
        sb.append(", standardTime=");
        sb.append(this.f59695n);
        sb.append(", f2Info=");
        sb.append(this.f59696o);
        sb.append(")");
        return sb.toString();
    }
}
