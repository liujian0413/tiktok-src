package com.bytedance.android.livesdk.gift.assets;

import android.content.Context;
import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.p1827a.C46211b;
import java.io.File;

/* renamed from: com.bytedance.android.livesdk.gift.assets.a */
public final class C7864a implements C46211b {

    /* renamed from: a */
    private Context f21252a;

    /* renamed from: b */
    private String f21253b = this.f21252a.getDir("assets", 0).getAbsolutePath();

    public C7864a(Context context) {
        this.f21252a = context;
    }

    /* renamed from: a */
    public final String mo20651a(C46220c cVar) {
        StringBuilder sb = new StringBuilder(this.f21253b);
        sb.append(File.separator);
        sb.append(cVar.f118815d);
        sb.append(File.separator);
        return sb.toString();
    }
}
