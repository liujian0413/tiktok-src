package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.v */
public class C8691v extends C8538c {
    @C6593c(mo15949a = "content")

    /* renamed from: a */
    public String f23679a;
    @C6593c(mo15949a = "after_content")

    /* renamed from: b */
    public String f23680b;
    @C6593c(mo15949a = "user_side_content")

    /* renamed from: c */
    public String f23681c;
    @C6593c(mo15949a = "after_display_text")

    /* renamed from: d */
    public C9505f f23682d;
    @C6593c(mo15949a = "duration")

    /* renamed from: e */
    public int f23683e;
    @C6593c(mo15949a = "message_type")

    /* renamed from: f */
    public int f23684f;
    @C6593c(mo15949a = "extra")

    /* renamed from: g */
    public C8692w f23685g;
    @C6593c(mo15949a = "trace_id")

    /* renamed from: h */
    public String f23686h;
    @C6593c(mo15949a = "rank")

    /* renamed from: i */
    public int f23687i;
    @C6593c(mo15949a = "rich_content")

    /* renamed from: j */
    public String f23688j;
    @C6593c(mo15949a = "content_type")

    /* renamed from: k */
    public long f23689k;
    @C6593c(mo15949a = "city_code")

    /* renamed from: l */
    public String f23690l;
    @C6593c(mo15949a = "style")

    /* renamed from: m */
    public String f23691m;

    public C8691v() {
        this.type = MessageType.DAILY_RANK;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DailyRankMessage{content='");
        sb.append(this.f23679a);
        sb.append('\'');
        sb.append(", afterContent='");
        sb.append(this.f23680b);
        sb.append('\'');
        sb.append(", userSideContent='");
        sb.append(this.f23681c);
        sb.append('\'');
        sb.append(", afterDisplayText=");
        sb.append(this.f23682d);
        sb.append(", duration=");
        sb.append(this.f23683e);
        sb.append(", messageType=");
        sb.append(this.f23684f);
        sb.append(", extra=");
        sb.append(this.f23685g);
        sb.append(", traceId='");
        sb.append(this.f23686h);
        sb.append('\'');
        sb.append(", rank=");
        sb.append(this.f23687i);
        sb.append(", contentForDy='");
        sb.append(this.f23688j);
        sb.append('\'');
        sb.append(", contentType=");
        sb.append(this.f23689k);
        sb.append(", cityCode='");
        sb.append(this.f23690l);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
