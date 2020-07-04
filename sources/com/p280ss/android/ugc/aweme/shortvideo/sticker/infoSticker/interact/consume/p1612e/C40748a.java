package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e;

import android.content.Context;
import android.graphics.RectF;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1563c.C39515a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40720b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40723e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40769a;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.a */
public abstract class C40748a implements C40720b {

    /* renamed from: a */
    public final Context f105955a;

    /* renamed from: b */
    public final C40769a f105956b;

    /* renamed from: c */
    public final InteractStickerStruct f105957c;

    /* renamed from: d */
    public C41850e f105958d;

    /* renamed from: e */
    private final String f105959e = "BaseStickerPresenter";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<NormalTrackTimeStamp> mo100974a(long j, InteractStickerStruct interactStickerStruct);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo100975a(int i, float f, float f2, C40723e eVar);

    /* renamed from: a */
    public final void mo100893a(C41850e eVar) {
        C7573i.m23587b(eVar, "interactStickerParams");
        this.f105958d = eVar;
    }

    /* renamed from: a */
    public final RectF mo100973a(NormalTrackTimeStamp normalTrackTimeStamp) {
        float f;
        float f2;
        float f3;
        Object obj;
        C7573i.m23587b(normalTrackTimeStamp, "location");
        float f4 = 0.0f;
        if (this.f105958d == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        C41850e eVar = this.f105958d;
        if (eVar != null) {
            f = eVar.f108848a;
        } else {
            f = 0.0f;
        }
        float width = f * normalTrackTimeStamp.getWidth();
        C41850e eVar2 = this.f105958d;
        if (eVar2 != null) {
            f2 = eVar2.f108849b;
        } else {
            f2 = 0.0f;
        }
        float height = f2 * normalTrackTimeStamp.getHeight();
        if (C7163a.m22363a()) {
            StringBuilder sb = new StringBuilder("videoWidth=");
            C41850e eVar3 = this.f105958d;
            Float f5 = null;
            if (eVar3 != null) {
                obj = Float.valueOf(eVar3.f108848a);
            } else {
                obj = null;
            }
            sb.append(obj);
            StringBuilder sb2 = new StringBuilder("videoHeight=");
            C41850e eVar4 = this.f105958d;
            if (eVar4 != null) {
                f5 = Float.valueOf(eVar4.f108849b);
            }
            sb2.append(f5);
        }
        C41850e eVar5 = this.f105958d;
        if (eVar5 != null) {
            f3 = eVar5.f108848a;
        } else {
            f3 = 0.0f;
        }
        float x = (f3 * normalTrackTimeStamp.getX()) - (width / 2.0f);
        C41850e eVar6 = this.f105958d;
        if (eVar6 != null) {
            f4 = eVar6.f108849b;
        }
        float y = (f4 * normalTrackTimeStamp.getY()) - (height / 2.0f);
        C7163a.m22363a();
        return new RectF(x, y, width + x, height + y);
    }

    public C40748a(Context context, C40769a aVar, InteractStickerStruct interactStickerStruct, C41850e eVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "view");
        C7573i.m23587b(interactStickerStruct, "stickerStruct");
        this.f105955a = context;
        this.f105956b = aVar;
        this.f105957c = interactStickerStruct;
        this.f105958d = eVar;
    }

    /* renamed from: a */
    public boolean mo100894a(long j, int i, float f, float f2) {
        List<NormalTrackTimeStamp> a = mo100974a(j, this.f105957c);
        if (a == null) {
            return false;
        }
        ArrayList<RectF> arrayList = new ArrayList<>();
        if (a != null) {
            for (NormalTrackTimeStamp normalTrackTimeStamp : a) {
                if (normalTrackTimeStamp == null) {
                    C7573i.m23580a();
                }
                arrayList.add(mo100973a(normalTrackTimeStamp));
            }
        }
        int i2 = 0;
        for (RectF rectF : arrayList) {
            if (!(a == null || a.get(i2) == null)) {
                Object obj = a.get(i2);
                if (obj == null) {
                    C7573i.m23580a();
                }
                if (C39515a.m126217b(rectF, f, f2, ((NormalTrackTimeStamp) obj).getRotation())) {
                    return true;
                }
            }
            i2++;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo100895a(long j, int i, float f, float f2, C40723e eVar) {
        C7573i.m23587b(eVar, "poiPopListener");
        if (!mo100894a(j, i, f, f2)) {
            return false;
        }
        mo100975a(i, f, f2, eVar);
        return true;
    }
}
