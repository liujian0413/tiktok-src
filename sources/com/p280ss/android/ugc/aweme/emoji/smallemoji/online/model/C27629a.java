package com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.model.a */
public final class C27629a extends BaseResponse {
    @C6593c(mo15949a = "android_emoji_resource")

    /* renamed from: a */
    public final OnlineSmallEmojiRes f72808a;
    @C6593c(mo15949a = "android_emoji_status")

    /* renamed from: b */
    public final int f72809b;
    @C6593c(mo15949a = "ios_emoji_resource")

    /* renamed from: c */
    public final OnlineSmallEmojiRes f72810c;
    @C6593c(mo15949a = "ios_emoji_status")

    /* renamed from: d */
    public final int f72811d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27629a) {
                C27629a aVar = (C27629a) obj;
                if (C7573i.m23585a((Object) this.f72808a, (Object) aVar.f72808a)) {
                    if ((this.f72809b == aVar.f72809b) && C7573i.m23585a((Object) this.f72810c, (Object) aVar.f72810c)) {
                        if (this.f72811d == aVar.f72811d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        OnlineSmallEmojiRes onlineSmallEmojiRes = this.f72808a;
        int i = 0;
        int hashCode = (((onlineSmallEmojiRes != null ? onlineSmallEmojiRes.hashCode() : 0) * 31) + this.f72809b) * 31;
        OnlineSmallEmojiRes onlineSmallEmojiRes2 = this.f72810c;
        if (onlineSmallEmojiRes2 != null) {
            i = onlineSmallEmojiRes2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f72811d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnlineSmallEmojiResponse(resources=");
        sb.append(this.f72808a);
        sb.append(", emojiStatus=");
        sb.append(this.f72809b);
        sb.append(", iosResources=");
        sb.append(this.f72810c);
        sb.append(", iosEmojiStatus=");
        sb.append(this.f72811d);
        sb.append(")");
        return sb.toString();
    }
}
