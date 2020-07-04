package com.bytedance.android.livesdk.message.model;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.google.gson.p276a.C6593c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.message.model.cl */
public class C8550cl extends C8538c {
    @C6593c(mo15949a = "action")

    /* renamed from: a */
    public long f23551a;
    @C6593c(mo15949a = "user")

    /* renamed from: b */
    public User f23552b;
    @C6593c(mo15949a = "share_target")

    /* renamed from: c */
    public String f23553c;
    @C6593c(mo15949a = "share_type")

    /* renamed from: d */
    public long f23554d;

    public C8550cl() {
        this.type = MessageType.SOCIAL;
    }

    public boolean canText() {
        if (this.f23552b != null) {
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
    public final String mo21675a() {
        Context e = C3358ac.m12528e();
        String str = "";
        switch ((int) this.f23551a) {
            case 1:
                if (VERSION.SDK_INT >= 24) {
                    return C3358ac.m12518a(e.getResources().getConfiguration().getLocales().get(0), (int) R.string.f5d);
                }
                return e.getResources().getString(R.string.f5d);
            case 3:
                if (VERSION.SDK_INT >= 24) {
                    return C3358ac.m12518a(e.getResources().getConfiguration().getLocales().get(0), (int) R.string.f5o);
                }
                return e.getResources().getString(R.string.f5o);
            default:
                return str;
        }
    }
}
