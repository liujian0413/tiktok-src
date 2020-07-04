package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40723e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40781e;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c */
public final class C40750c extends C40748a {

    /* renamed from: e */
    public PoiStruct f105961e = new PoiStruct();

    /* renamed from: f */
    public float[] f105962f;

    /* renamed from: b */
    private float[] m130271b() {
        NormalTrackTimeStamp b = C40707a.m130165b(this.f105957c);
        if (b == null) {
            return null;
        }
        RectF a = mo100973a(b);
        float[] fArr = {a.left, a.top, a.right, a.top, a.left, a.bottom, a.right, a.bottom};
        C7163a.m22363a();
        Matrix matrix = new Matrix();
        matrix.postRotate(b.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
        matrix.mapPoints(fArr);
        return fArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0162  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100976a() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r9.f105961e
            java.lang.String r0 = r0.getPoiId()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.ss.android.ugc.aweme.sticker.e r0 = r9.f105958d
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.f108853f
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x001f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 != 0) goto L_0x0064
            android.content.Context r2 = r9.f105955a
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r9.f105961e
            java.lang.String r3 = r0.getPoiId()
            com.ss.android.ugc.aweme.sticker.e r0 = r9.f105958d
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.f108853f
            r4 = r0
            goto L_0x0033
        L_0x0032:
            r4 = r1
        L_0x0033:
            com.ss.android.ugc.aweme.sticker.e r0 = r9.f105958d
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r0.f108854g
            r5 = r0
            goto L_0x003c
        L_0x003b:
            r5 = r1
        L_0x003c:
            com.ss.android.ugc.aweme.sticker.e r0 = r9.f105958d
            if (r0 == 0) goto L_0x0047
            long r6 = r0.f108855h
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.sticker.e r0 = r9.f105958d
            if (r0 == 0) goto L_0x0057
            long r7 = r0.f108856i
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            goto L_0x0058
        L_0x0057:
            r0 = r1
        L_0x0058:
            if (r0 != 0) goto L_0x005d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x005d:
            long r7 = r0.longValue()
            com.p280ss.android.ugc.aweme.commercialize.log.C24932ae.m81789c(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            java.lang.String r0 = "poi_prop_label_click"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f105958d
            if (r4 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x0077
            java.lang.String r4 = r4.f108844d
            goto L_0x0078
        L_0x0077:
            r4 = r1
        L_0x0078:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f105958d
            if (r4 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x0089
            java.lang.String r4 = r4.f108843c
            goto L_0x008a
        L_0x0089:
            r4 = r1
        L_0x008a:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f105958d
            if (r4 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x009b
            java.lang.String r4 = r4.f108845e
            goto L_0x009c
        L_0x009b:
            r4 = r1
        L_0x009c:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f105958d
            if (r4 == 0) goto L_0x00ad
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x00ad
            java.lang.String r4 = r4.f108842b
            goto L_0x00ae
        L_0x00ad:
            r4 = r1
        L_0x00ae:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "prop_id"
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f105958d
            if (r4 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x00bf
            java.lang.String r4 = r4.f108841a
            goto L_0x00c0
        L_0x00bf:
            r4 = r1
        L_0x00c0:
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "poi_id"
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r9.f105961e
            java.lang.String r4 = r4.getPoiId()
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.lang.String r3 = "poi_type"
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r9.f105961e
            long r4 = r4.poiType
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59971a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r2)
            android.content.Context r0 = r9.f105955a
            java.lang.String r2 = "//poi/detail"
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r0, r2)
            java.lang.String r2 = "poi_bundle"
            com.ss.android.ugc.aweme.poi.model.e r3 = new com.ss.android.ugc.aweme.poi.model.e
            r3.<init>()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r9.f105961e
            java.lang.String r4 = r4.getPoiId()
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89342c(r4)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r9.f105961e
            java.lang.String r4 = r4.poiName
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89350k(r4)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r9.f105961e
            java.lang.String r4 = r4.typeCode
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89349j(r4)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r9.f105961e
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89336a(r4)
            java.lang.String r4 = "click_poi_prop"
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89354o(r4)
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f105958d
            if (r4 == 0) goto L_0x011f
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x011f
            java.lang.String r4 = r4.f108842b
            goto L_0x0120
        L_0x011f:
            r4 = r1
        L_0x0120:
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89352m(r4)
            java.lang.String r4 = "0"
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89360u(r4)
            java.lang.String r4 = "click_poi_prop"
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89356q(r4)
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f105958d
            if (r4 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x013b
            java.lang.String r4 = r4.f108844d
            goto L_0x013c
        L_0x013b:
            r4 = r1
        L_0x013c:
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89355p(r4)
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f105958d
            if (r4 == 0) goto L_0x014b
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x014b
            java.lang.String r4 = r4.f108843c
            goto L_0x014c
        L_0x014b:
            r4 = r1
        L_0x014c:
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89351l(r4)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r9.f105961e
            int r4 = r4.getPoiSubTitleType()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.ss.android.ugc.aweme.poi.model.e r3 = r3.mo89363x(r4)
            com.ss.android.ugc.aweme.sticker.e r4 = r9.f105958d
            if (r4 == 0) goto L_0x0168
            com.ss.android.ugc.aweme.sticker.d r4 = r4.f108861n
            if (r4 == 0) goto L_0x0168
            java.lang.String r1 = r4.f108845e
        L_0x0168:
            com.ss.android.ugc.aweme.poi.model.e r1 = r3.mo89359t(r1)
            com.ss.android.ugc.aweme.poi.model.PoiBundle r1 = r1.mo89331a()
            java.io.Serializable r1 = (java.io.Serializable) r1
            com.bytedance.router.SmartRoute r0 = r0.withParam(r2, r1)
            r0.open()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e.C40750c.mo100976a():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo100974a(long j, InteractStickerStruct interactStickerStruct) {
        C7573i.m23587b(interactStickerStruct, "stickerStruct");
        return C40707a.m130162a(interactStickerStruct);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100975a(int i, float f, float f2, C40723e eVar) {
        C7573i.m23587b(eVar, "poiPopListener");
        eVar.mo100904a(this.f105956b.mo101010a(f, f2));
    }

    public C40750c(Context context, C40781e eVar, InteractStickerStruct interactStickerStruct, C41850e eVar2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(eVar, "view");
        C7573i.m23587b(interactStickerStruct, "stickerStruct");
        super(context, eVar, interactStickerStruct, eVar2);
        this.f105961e.fromStickerPoiStruct(interactStickerStruct.getPoiStruct());
        this.f105962f = m130271b();
    }
}
