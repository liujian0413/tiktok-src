package com.p280ss.android.ugc.aweme.favorites.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder;
import com.p280ss.android.ugc.aweme.favorites.adapter.C27733b;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27702g;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27705i;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.poi.model.PoiBundle;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListItemViewHolder */
public final class PoiCollectListItemViewHolder extends JediSimpleViewHolder<C27733b> {

    /* renamed from: f */
    public final View f73376f;

    /* renamed from: g */
    private SimplePoiInfoStruct f73377g;

    /* renamed from: j */
    private C27705i f73378j;

    /* renamed from: k */
    private PoiItemViewHolder f73379k = new PoiItemViewHolder(this.f73376f, C32630h.m105696b(this.f73376f.getContext()).mo83993a());

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListItemViewHolder$a */
    static final class C27829a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SimplePoiInfoStruct f73380a;

        /* renamed from: b */
        final /* synthetic */ PoiCollectListItemViewHolder f73381b;

        C27829a(SimplePoiInfoStruct simplePoiInfoStruct, PoiCollectListItemViewHolder poiCollectListItemViewHolder) {
            this.f73380a = simplePoiInfoStruct;
            this.f73381b = poiCollectListItemViewHolder;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            PoiBundle poiBundle = new PoiBundle();
            poiBundle.poiId = this.f73380a.getPoiId();
            poiBundle.poiName = this.f73380a.getPoiName();
            poiBundle.from = "collection_poi";
            poiBundle.clickMethod = "click_collection_poi";
            poiBundle.isCoupon = "0";
            View view2 = this.f73381b.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            SmartRouter.buildRoute(view2.getContext(), "//poi/detail").withParam("poi_bundle", (Serializable) poiBundle).open();
            String poiId = this.f73380a.getPoiId();
            String str = "collection_poi";
            String str2 = "";
            if (((C27733b) this.f73381b.mo29309o()).f73161a == 0) {
                z = true;
            } else {
                z = false;
            }
            C27752a.m90976a(poiId, str, str2, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListItemViewHolder$b */
    static final class C27830b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27705i f73382a;

        /* renamed from: b */
        final /* synthetic */ PoiCollectListItemViewHolder f73383b;

        C27830b(C27705i iVar, PoiCollectListItemViewHolder poiCollectListItemViewHolder) {
            this.f73382a = iVar;
            this.f73383b = poiCollectListItemViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            View view2 = this.f73383b.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            C35454m.m114522a(view2.getContext(), this.f73382a.f73034b, "collection_poi", "");
        }
    }

    /* renamed from: p */
    private final void m91238p() {
        boolean z;
        SimplePoiInfoStruct simplePoiInfoStruct = this.f73377g;
        if (simplePoiInfoStruct != null) {
            this.f73379k.mo67995a(-1, simplePoiInfoStruct);
            String poiId = simplePoiInfoStruct.getPoiId();
            if (((C27733b) mo29309o()).f73161a == 0) {
                z = true;
            } else {
                z = false;
            }
            C27752a.m90969a(1, poiId, z);
            this.f73376f.setOnClickListener(new C27829a(simplePoiInfoStruct, this));
        }
    }

    /* renamed from: q */
    private final void m91239q() {
        boolean z;
        C27705i iVar = this.f73378j;
        if (iVar != null) {
            this.f73379k.mo67994a(-1, iVar);
            String str = iVar.f73039g;
            if (((C27733b) mo29309o()).f73161a == 0) {
                z = true;
            } else {
                z = false;
            }
            C27752a.m90970a(1, str, z, iVar.f73035c, iVar.f73036d);
            this.f73376f.setOnClickListener(new C27830b(iVar, this));
        }
    }

    public PoiCollectListItemViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        this.f73376f = view;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(C27733b bVar) {
        C7573i.m23587b(bVar, "item");
        if (bVar.f73162b instanceof C27702g) {
            if (((C27702g) bVar.f73162b).f73029a == 1) {
                this.f73377g = ((C27702g) bVar.f73162b).f73030b;
                m91238p();
                return;
            }
            this.f73378j = ((C27702g) bVar.f73162b).f73031c;
            m91239q();
        }
    }
}
