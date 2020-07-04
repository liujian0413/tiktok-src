package com.squareup.picasso;

import android.content.Context;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.squareup.picasso.C18850u.C18851a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.g */
class C18827g extends C18850u {

    /* renamed from: a */
    final Context f50733a;

    C18827g(Context context) {
        this.f50733a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final InputStream mo50025b(C18846s sVar) throws FileNotFoundException {
        return this.f50733a.getContentResolver().openInputStream(sVar.f50794d);
    }

    /* renamed from: a */
    public boolean mo50006a(C18846s sVar) {
        return C38347c.f99553h.equals(sVar.f50794d.getScheme());
    }

    /* renamed from: a */
    public C18851a mo50005a(C18846s sVar, int i) throws IOException {
        return new C18851a(mo50025b(sVar), LoadedFrom.DISK);
    }
}
