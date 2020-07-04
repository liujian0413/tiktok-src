package com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiRes */
public final class OnlineSmallEmojiRes implements Serializable {
    @C6593c(mo15949a = "create_time")
    private final String createTime;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private final int f72806id;
    @C6593c(mo15949a = "md5")
    private final String md5;
    @C6593c(mo15949a = "resource_url")
    private final String resourceUrl;
    @C6593c(mo15949a = "update_time")
    private final String updateTime;

    public static /* synthetic */ OnlineSmallEmojiRes copy$default(OnlineSmallEmojiRes onlineSmallEmojiRes, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = onlineSmallEmojiRes.f72806id;
        }
        if ((i2 & 2) != 0) {
            str = onlineSmallEmojiRes.createTime;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = onlineSmallEmojiRes.updateTime;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = onlineSmallEmojiRes.resourceUrl;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = onlineSmallEmojiRes.md5;
        }
        return onlineSmallEmojiRes.copy(i, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.f72806id;
    }

    public final String component2() {
        return this.createTime;
    }

    public final String component3() {
        return this.updateTime;
    }

    public final String component4() {
        return this.resourceUrl;
    }

    public final String component5() {
        return this.md5;
    }

    public final OnlineSmallEmojiRes copy(int i, String str, String str2, String str3, String str4) {
        OnlineSmallEmojiRes onlineSmallEmojiRes = new OnlineSmallEmojiRes(i, str, str2, str3, str4);
        return onlineSmallEmojiRes;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnlineSmallEmojiRes) {
                OnlineSmallEmojiRes onlineSmallEmojiRes = (OnlineSmallEmojiRes) obj;
                if (!(this.f72806id == onlineSmallEmojiRes.f72806id) || !C7573i.m23585a((Object) this.createTime, (Object) onlineSmallEmojiRes.createTime) || !C7573i.m23585a((Object) this.updateTime, (Object) onlineSmallEmojiRes.updateTime) || !C7573i.m23585a((Object) this.resourceUrl, (Object) onlineSmallEmojiRes.resourceUrl) || !C7573i.m23585a((Object) this.md5, (Object) onlineSmallEmojiRes.md5)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final int getId() {
        return this.f72806id;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getResourceUrl() {
        return this.resourceUrl;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final int hashCode() {
        int i = this.f72806id * 31;
        String str = this.createTime;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.updateTime;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.resourceUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.md5;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnlineSmallEmojiRes(id=");
        sb.append(this.f72806id);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", resourceUrl=");
        sb.append(this.resourceUrl);
        sb.append(", md5=");
        sb.append(this.md5);
        sb.append(")");
        return sb.toString();
    }

    public OnlineSmallEmojiRes(int i, String str, String str2, String str3, String str4) {
        this.f72806id = i;
        this.createTime = str;
        this.updateTime = str2;
        this.resourceUrl = str3;
        this.md5 = str4;
    }

    public /* synthetic */ OnlineSmallEmojiRes(int i, String str, String str2, String str3, String str4, int i2, C7571f fVar) {
        int i3;
        if ((i2 & 1) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        this(i3, str, str2, str3, str4);
    }
}
