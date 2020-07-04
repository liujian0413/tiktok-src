package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25386z;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40723e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40769a;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.b */
public final class C40749b extends C40748a {

    /* renamed from: e */
    private final BusinessExtraData f105960e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo100974a(long j, InteractStickerStruct interactStickerStruct) {
        C7573i.m23587b(interactStickerStruct, "stickerStruct");
        return C40707a.m130160a(j, interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100975a(int i, float f, float f2, C40723e eVar) {
        String str;
        C7573i.m23587b(eVar, "poiPopListener");
        BusinessExtraData businessExtraData = this.f105960e;
        if (businessExtraData != null) {
            str = businessExtraData.getSchemaUrlOpenFirst();
        } else {
            str = null;
        }
        if (!C33447f.m108191d(str) || (VERSION.SDK_INT >= 21 && !C6399b.m19944t())) {
            eVar.mo100904a(this.f105956b.mo101010a(f, f2));
        }
    }

    /* renamed from: a */
    public final boolean mo100894a(long j, int i, float f, float f2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        NormalTrackTimeStamp normalTrackTimeStamp;
        BusinessExtraData businessExtraData = this.f105960e;
        RectF rectF = null;
        if (businessExtraData != null) {
            charSequence = businessExtraData.getStickerId();
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        BusinessExtraData businessExtraData2 = this.f105960e;
        if (businessExtraData2 != null) {
            charSequence2 = businessExtraData2.getSchemaUrlOpenFirst();
        } else {
            charSequence2 = null;
        }
        if (TextUtils.isEmpty(charSequence2)) {
            return false;
        }
        BusinessExtraData businessExtraData3 = this.f105960e;
        if (businessExtraData3 != null) {
            str = businessExtraData3.getStickerId();
        } else {
            str = null;
        }
        if (!C25386z.m83539a(str)) {
            return super.mo100894a(j, i, f, f2);
        }
        boolean a = super.mo100894a(j, i, f, f2);
        if (a) {
            List a2 = mo100974a(j, this.f105957c);
            if (a2 != null) {
                normalTrackTimeStamp = (NormalTrackTimeStamp) a2.get(0);
            } else {
                normalTrackTimeStamp = null;
            }
            if (normalTrackTimeStamp != null) {
                rectF = mo100973a(normalTrackTimeStamp);
            }
            if (rectF != null) {
                C25386z.m83538a(rectF, f, f2);
            }
        }
        return a;
    }

    public C40749b(Context context, C40769a aVar, InteractStickerStruct interactStickerStruct, C41850e eVar, BusinessExtraData businessExtraData) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "view");
        C7573i.m23587b(interactStickerStruct, "stickerStruct");
        super(context, aVar, interactStickerStruct, eVar);
        this.f105960e = businessExtraData;
    }
}
