package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.C46870h;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.x */
final class C46934x extends C46911g<C46931v> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo118046b() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder("se");
        sb.append("_");
        sb.append(randomUUID.toString());
        sb.append("_");
        sb.append(this.f120294c.mo117970a());
        sb.append(".tap");
        return sb.toString();
    }

    C46934x(Context context, C46910f<C46931v> fVar, C46870h hVar, C46928s sVar, int i) throws IOException {
        super(context, fVar, hVar, sVar, i);
    }
}
