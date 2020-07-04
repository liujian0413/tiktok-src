package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.message.model.y */
public class C8695y extends C8538c {
    @C6593c(mo15949a = "digg_count")

    /* renamed from: a */
    public int f23695a;
    @C6593c(mo15949a = "duration")

    /* renamed from: b */
    public int f23696b;
    @C6593c(mo15949a = "color")

    /* renamed from: c */
    public int f23697c;
    @C6593c(mo15949a = "user")

    /* renamed from: d */
    public User f23698d;
    @C6593c(mo15949a = "icon")

    /* renamed from: e */
    public String f23699e;

    public C8695y() {
        this.type = MessageType.DIGG;
    }

    public boolean canText() {
        if (this.f23698d != null) {
            return true;
        }
        return false;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f26000j == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m26002a() {
        return TTLiveSDKContext.getHostService().mo22360a().context().getResources().getString(R.string.f5b);
    }

    /* renamed from: b */
    public final boolean mo21694b() {
        IUser a = TTLiveSDKContext.getHostService().mo22367h().mo22165a();
        if (a == null || this.f23698d == null || a.getId() != this.f23698d.getId()) {
            return false;
        }
        return true;
    }
}
