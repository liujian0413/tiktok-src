package com.squareup.picasso;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.squareup.picasso.C18850u.C18851a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;

/* renamed from: com.squareup.picasso.j */
final class C18834j extends C18827g {
    C18834j(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final boolean mo50006a(C18846s sVar) {
        return "file".equals(sVar.f50794d.getScheme());
    }

    /* renamed from: a */
    private static int m61512a(Uri uri) throws IOException {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return NormalGiftView.ALPHA_180;
        }
        if (attributeInt == 6) {
            return 90;
        }
        if (attributeInt != 8) {
            return 0;
        }
        return 270;
    }

    /* renamed from: a */
    public final C18851a mo50005a(C18846s sVar, int i) throws IOException {
        return new C18851a(null, mo50025b(sVar), LoadedFrom.DISK, m61512a(sVar.f50794d));
    }
}
