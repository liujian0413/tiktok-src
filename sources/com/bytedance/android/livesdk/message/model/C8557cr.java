package com.bytedance.android.livesdk.message.model;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.http.legacy.p877d.C19576d;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.message.model.cr */
public class C8557cr extends C8538c {
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public User f23586a;
    @C6593c(mo15949a = "goods_order")

    /* renamed from: b */
    public C8558a f23587b;

    /* renamed from: com.bytedance.android.livesdk.message.model.cr$a */
    public static class C8558a {
        @C6593c(mo15949a = "goods_room_order")

        /* renamed from: a */
        public long f23588a;
        @C6593c(mo15949a = "order_num")

        /* renamed from: b */
        public long f23589b;
        @C6593c(mo15949a = "order_money")

        /* renamed from: c */
        public long f23590c;
        @C6593c(mo15949a = "order_id")

        /* renamed from: d */
        public String f23591d;
    }

    public boolean canText() {
        return true;
    }

    public C8557cr() {
        this.type = MessageType.GOODS_ORDER;
    }

    public int hashCode() {
        return C19576d.m64494a(17, (Object) Long.valueOf(this.baseMessage.f25994d));
    }

    /* renamed from: a */
    public final String mo21684a() {
        StringBuilder sb = new StringBuilder();
        Context context = ((IHostContext) C3596c.m13172a(IHostContext.class)).context();
        if (context == null) {
            return sb.toString();
        }
        if (this.f23586a != null) {
            sb.append(this.f23586a.getNickName());
        }
        if (this.f23587b != null) {
            sb.append(context.getString(R.string.f9b, new Object[]{Long.valueOf(this.f23587b.f23588a)}));
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8557cr) || this.baseMessage.f25994d != ((C8557cr) obj).baseMessage.f25994d) {
            return false;
        }
        return true;
    }
}
