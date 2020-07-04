package com.p280ss.ugc.live.gift.resource.p1827a;

import android.content.Context;
import com.p280ss.ugc.live.gift.resource.C46220c;
import java.io.File;

/* renamed from: com.ss.ugc.live.gift.resource.a.a */
public final class C46210a implements C46211b {

    /* renamed from: a */
    private Context f118803a;

    /* renamed from: b */
    private String f118804b = this.f118803a.getDir("gift_resource", 0).getAbsolutePath();

    public C46210a(Context context) {
        this.f118803a = context;
    }

    /* renamed from: a */
    public final String mo20651a(C46220c cVar) {
        StringBuilder sb = new StringBuilder(this.f118804b);
        sb.append(File.separator);
        sb.append(cVar.f118812a);
        sb.append(File.separator);
        sb.append(cVar.f118815d);
        sb.append(File.separator);
        return sb.toString();
    }
}
