package com.bytedance.android.livesdk.message.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.message.model.t */
public class C8688t extends C8538c {
    @C6593c(mo15949a = "action")

    /* renamed from: a */
    public int f23670a;
    @C6593c(mo15949a = "tips")

    /* renamed from: b */
    public String f23671b;
    @C6593c(mo15949a = "extra")

    /* renamed from: c */
    public C8689a f23672c;

    /* renamed from: com.bytedance.android.livesdk.message.model.t$a */
    public static class C8689a {
        @C6593c(mo15949a = "ban_info_url")

        /* renamed from: a */
        public String f23673a;
        @C6593c(mo15949a = "reason_no")

        /* renamed from: b */
        public long f23674b;
        @C6593c(mo15949a = "title")

        /* renamed from: c */
        public C9505f f23675c;
        @C6593c(mo15949a = "violation_reason")

        /* renamed from: d */
        public C9505f f23676d;
        @C6593c(mo15949a = "display_text")

        /* renamed from: e */
        public C9505f f23677e;
    }

    public C8688t() {
        this.type = MessageType.CONTROL;
    }

    public boolean canText() {
        if (!C6319n.m19593a(mo21691a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo21691a() {
        Context e = C3358ac.m12528e();
        Resources resources = e.getResources();
        switch (this.f23670a) {
            case 1:
                if (VERSION.SDK_INT >= 24) {
                    return C3358ac.m12518a(e.getResources().getConfiguration().getLocales().get(0), (int) R.string.eyp);
                }
                return resources.getString(R.string.eyp);
            case 2:
                if (VERSION.SDK_INT >= 24) {
                    return C3358ac.m12518a(e.getResources().getConfiguration().getLocales().get(0), (int) R.string.f2z);
                }
                return resources.getString(R.string.f2z);
            default:
                return "";
        }
    }
}
