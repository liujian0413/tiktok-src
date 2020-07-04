package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.bb */
final /* synthetic */ class C40490bb implements OnClickListener {

    /* renamed from: a */
    private final C4034810 f105233a;

    /* renamed from: b */
    private final Map f105234b;

    /* renamed from: c */
    private final FaceStickerBean f105235c;

    C40490bb(C4034810 r1, Map map, FaceStickerBean faceStickerBean) {
        this.f105233a = r1;
        this.f105234b = map;
        this.f105235c = faceStickerBean;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f105233a.mo100336a(this.f105234b, this.f105235c, dialogInterface, i);
    }
}
