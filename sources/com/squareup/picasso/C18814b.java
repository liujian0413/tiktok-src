package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.C18850u.C18851a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;

/* renamed from: com.squareup.picasso.b */
final class C18814b extends C18850u {

    /* renamed from: a */
    private static final int f50700a = 22;

    /* renamed from: b */
    private final AssetManager f50701b;

    public C18814b(Context context) {
        this.f50701b = context.getAssets();
    }

    /* renamed from: b */
    private static String m61451b(C18846s sVar) {
        return sVar.f50794d.toString().substring(f50700a);
    }

    /* renamed from: a */
    public final boolean mo50006a(C18846s sVar) {
        Uri uri = sVar.f50794d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C18851a mo50005a(C18846s sVar, int i) throws IOException {
        return new C18851a(this.f50701b.open(m61451b(sVar)), LoadedFrom.DISK);
    }
}
