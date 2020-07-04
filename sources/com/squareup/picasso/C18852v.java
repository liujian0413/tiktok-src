package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.squareup.picasso.C18850u.C18851a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;

/* renamed from: com.squareup.picasso.v */
final class C18852v extends C18850u {

    /* renamed from: a */
    private final Context f50841a;

    C18852v(Context context) {
        this.f50841a = context;
    }

    /* renamed from: a */
    public final boolean mo50006a(C18846s sVar) {
        if (sVar.f50795e != 0) {
            return true;
        }
        return "android.resource".equals(sVar.f50794d.getScheme());
    }

    /* renamed from: a */
    public final C18851a mo50005a(C18846s sVar, int i) throws IOException {
        Resources a = C18807ad.m61429a(this.f50841a, sVar);
        return new C18851a(m61586a(a, C18807ad.m61426a(a, sVar), sVar), LoadedFrom.DISK);
    }

    /* renamed from: a */
    private static Bitmap m61586a(Resources resources, int i, C18846s sVar) {
        Options c = m61580c(sVar);
        if (m61579a(c)) {
            BitmapFactory.decodeResource(resources, i, c);
            m61578a(sVar.f50798h, sVar.f50799i, c, sVar);
        }
        return BitmapFactory.decodeResource(resources, i, c);
    }
}
