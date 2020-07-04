package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C6319n;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C39608b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.C42061c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a */
public final class C39621a extends C39608b {

    /* renamed from: t */
    public String f102933t;

    /* renamed from: u */
    private PoiStruct f102934u;

    /* renamed from: b */
    public final int mo98738b() {
        return R.string.ak_;
    }

    /* renamed from: f */
    public final boolean mo98744f() {
        if (this.f102934u != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo98746h() {
        super.mo98746h();
        this.f102934u = null;
    }

    /* renamed from: k */
    private static String m126797k() {
        StringBuilder sb = new StringBuilder("pi_start");
        sb.append(UUID.randomUUID().toString());
        sb.append("pi_end");
        return sb.toString();
    }

    /* renamed from: j */
    public final InteractStickerStruct mo98758j() {
        InteractStickerStruct a = super.mo98728a(1);
        if (a == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_sticker_id", this.f102933t);
        a.setAttr(C35563c.f93220B.getRetrofitFactoryGson().mo15979b((Object) hashMap));
        a.setIndex(0);
        a.setPoiStruct(this.f102934u);
        return a;
    }

    /* renamed from: a */
    public final InteractStickerBaseView mo98727a(Context context) {
        return PoiStickerView.m126788a(context);
    }

    /* renamed from: b */
    private String m126796b(String str) {
        return str.replaceAll("pi_start(.*?)pi_end", m126797k());
    }

    /* renamed from: a */
    public final void mo98756a(PoiStruct poiStruct) {
        m126795a(poiStruct, true, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo98757b(InteractStickerStruct interactStickerStruct) {
        super.mo98734a(interactStickerStruct);
        this.f102894i.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo98734a(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct != null) {
            this.f102934u = interactStickerStruct.getPoiStruct();
            m126795a(this.f102934u, false, true);
            this.f102933t = (String) ((HashMap) C35563c.f93220B.getRetrofitFactoryGson().mo15975a(interactStickerStruct.getAttr(), new C6597a<HashMap<String, String>>() {
            }.type)).get("poi_sticker_id");
        }
        if (this.f102894i != null) {
            this.f102894i.postDelayed(new C39623b(this, interactStickerStruct), 300);
        }
    }

    /* renamed from: a */
    public final void mo98735a(String str) {
        if (!C6319n.m19593a(str)) {
            if (str.contains("pi_start") && str.contains("pi_end")) {
                super.mo98735a(m126796b(str));
            } else if (str.endsWith(File.separator)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(m126797k());
                super.mo98735a(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(m126797k());
                super.mo98735a(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final boolean mo98737a(InteractStickerBaseView interactStickerBaseView) {
        if (!(interactStickerBaseView instanceof PoiStickerView)) {
            return false;
        }
        boolean a = super.mo98737a(interactStickerBaseView);
        this.f102934u = null;
        return a;
    }

    /* renamed from: a */
    public final void mo98731a(Context context, C42061c cVar, FrameLayout frameLayout) {
        super.mo98731a(context, cVar, frameLayout);
    }

    /* renamed from: a */
    private void m126795a(PoiStruct poiStruct, boolean z, boolean z2) {
        this.f102934u = poiStruct;
        if (!TextUtils.isEmpty(poiStruct.getPoiName())) {
            mo98740b(z2);
            if (this.f102894i instanceof PoiStickerView) {
                ((PoiStickerView) this.f102894i).setPoiContentTxt(poiStruct.getPoiName());
            }
            if (z) {
                this.f102894i.setVisibility(0);
            }
        }
    }
}
