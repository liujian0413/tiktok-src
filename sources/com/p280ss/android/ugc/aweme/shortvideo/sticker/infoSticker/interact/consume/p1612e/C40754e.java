package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1612e;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1611d.C40723e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40783g;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e */
public final class C40754e extends C40748a {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e$a */
    static final class C40755a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40754e f105971a;

        /* renamed from: b */
        final /* synthetic */ View f105972b;

        C40755a(C40754e eVar, View view) {
            this.f105971a = eVar;
            this.f105972b = view;
        }

        public final void run() {
            this.f105971a.mo100983a(this.f105972b);
        }
    }

    /* renamed from: a */
    public final float[] mo100985a() {
        List a = mo100974a(0, this.f105957c);
        if (a == null || C6307b.m19566a((Collection<T>) a) || a.get(0) == null) {
            return null;
        }
        Object obj = a.get(0);
        if (obj == null) {
            C7573i.m23580a();
        }
        RectF a2 = mo100973a((NormalTrackTimeStamp) obj);
        float[] fArr = {a2.left, a2.top, a2.right, a2.top, a2.left, a2.bottom, a2.right, a2.bottom};
        Matrix matrix = new Matrix();
        Object obj2 = a.get(0);
        if (obj2 == null) {
            C7573i.m23580a();
        }
        matrix.postRotate(((NormalTrackTimeStamp) obj2).getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
        matrix.mapPoints(fArr);
        return fArr;
    }

    /* renamed from: a */
    public final void mo100983a(View view) {
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            List a = C40707a.m130162a(this.f105957c);
            if (a != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) a.get(0);
                if (normalTrackTimeStamp != null) {
                    RectF a2 = mo100973a(normalTrackTimeStamp);
                    view.setPivotX(((float) view.getWidth()) / 2.0f);
                    view.setPivotY(((float) view.getHeight()) / 2.0f);
                    view.setTranslationX(a2.left + ((a2.width() - ((float) view.getWidth())) / 2.0f));
                    view.setTranslationY(a2.top + ((a2.height() - ((float) view.getHeight())) / 2.0f));
                    view.setScaleX(a2.width() / ((float) view.getWidth()));
                    view.setScaleY(a2.width() / ((float) view.getWidth()));
                    view.setRotation(normalTrackTimeStamp.getRotation());
                    view.setVisibility(0);
                    view.invalidate();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo100974a(long j, InteractStickerStruct interactStickerStruct) {
        C7573i.m23587b(interactStickerStruct, "stickerStruct");
        return C40707a.m130162a(interactStickerStruct);
    }

    /* renamed from: a */
    public final void mo100984a(View view, float f) {
        C7573i.m23587b(view, "view");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.post(new C40755a(this, view));
        } else {
            mo100983a(view);
        }
    }

    public C40754e(Context context, C40783g gVar, InteractStickerStruct interactStickerStruct, C41850e eVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(gVar, "view");
        C7573i.m23587b(interactStickerStruct, "stickerStruct");
        super(context, gVar, interactStickerStruct, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100975a(int i, float f, float f2, C40723e eVar) {
        C7573i.m23587b(eVar, "poiPopListener");
        eVar.mo100904a(this.f105956b.mo101010a(f, f2));
    }

    /* renamed from: a */
    public final boolean mo100894a(long j, int i, float f, float f2) {
        User user;
        C41850e eVar = this.f105958d;
        if (eVar != null) {
            user = eVar.f108850c;
        } else {
            user = null;
        }
        if (!C43122ff.m136787r(user)) {
            return false;
        }
        return super.mo100894a(j, i, f, f2);
    }
}
