package com.p280ss.android.ugc.aweme.qrcode.p1494a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.DeepLinkHandlerActivity;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37073c;
import com.p280ss.android.ugc.aweme.router.C7195s;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.i */
public final class C37017i implements C37012d {
    /* renamed from: a */
    public final String mo93443a() {
        return "web";
    }

    /* renamed from: a */
    public final boolean mo59069a(String str, int i) {
        if (C37073c.m119203c(str)) {
            C7195s.m22438a().mo18682a(str);
            return true;
        } else if (!C37073c.m119206f(str)) {
            return false;
        } else {
            Context a = C6399b.m19921a();
            Intent intent = new Intent(a, DeepLinkHandlerActivity.class);
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            a.startActivity(intent);
            return true;
        }
    }
}
