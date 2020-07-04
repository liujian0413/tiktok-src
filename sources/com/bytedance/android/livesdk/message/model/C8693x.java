package com.bytedance.android.livesdk.message.model;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9379p;
import com.google.gson.p276a.C6593c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.x */
public class C8693x extends C8538c {
    @C6593c(mo15949a = "extra")

    /* renamed from: a */
    public String f23693a;

    /* renamed from: com.bytedance.android.livesdk.message.model.x$a */
    class C8694a {
        @C6593c(mo15949a = "deco_list")

        /* renamed from: a */
        public List<C9379p> f23694a;
    }

    public C8693x() {
        this.type = MessageType.MODIFY_DECORATION;
    }

    /* renamed from: a */
    public final List<C9379p> mo21693a() {
        if (TextUtils.isEmpty(this.f23693a)) {
            return new ArrayList(0);
        }
        try {
            return ((C8694a) C9178j.m27302j().mo22372a().mo15974a(this.f23693a, C8694a.class)).f23694a;
        } catch (Exception unused) {
            return new ArrayList(0);
        }
    }
}
