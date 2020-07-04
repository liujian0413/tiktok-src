package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.PoiProductAdapter;
import com.p280ss.android.ugc.aweme.poi.bean.PoiDcdProductItem;
import com.p280ss.android.ugc.aweme.poi.model.PoiDcdCar;
import com.p280ss.android.ugc.aweme.poi.model.PoiProductInfo;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductInfoViewHolder */
public class PoiDcdProductInfoViewHolder extends PoiAladingCard<PoiDcdCar> {

    /* renamed from: g */
    public int f91505g;

    /* renamed from: h */
    public PoiDcdProductItem f91506h;

    /* renamed from: i */
    private PoiSimpleBundle f91507i;
    TextView mAllProduct;
    View mAllProductContainer;
    TextView mTitle;

    /* renamed from: a */
    public final void mo68171a() {
        if (this.f91506h != null) {
            m113057a(this.f91506h.productInfo, "slide_left");
        }
    }

    public PoiDcdProductInfoViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88797a(PoiProductInfo poiProductInfo, View view) {
        m113057a(poiProductInfo, "click_more");
    }

    /* renamed from: a */
    private void m113057a(PoiProductInfo poiProductInfo, String str) {
        if (poiProductInfo != null && !TextUtils.isEmpty(poiProductInfo.url)) {
            C35454m.m114523a(this.f91507i, "project_click_more", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("enter_method", str).mo59973a("poi_id", this.f91506h.poiId).mo59973a("content_type", this.f91506h.getSpSource()));
            C35454m.m114522a(this.f91479b, poiProductInfo.url, "poi_page", "click_more");
        }
    }

    /* renamed from: a */
    public final void mo88796a(PoiDcdProductItem poiDcdProductItem, final PoiSimpleBundle poiSimpleBundle) {
        if (!(this.f91506h != null || poiDcdProductItem == null || poiDcdProductItem.productInfo == null)) {
            this.f91506h = poiDcdProductItem;
            this.f91507i = poiSimpleBundle;
            PoiProductInfo poiProductInfo = this.f91506h.productInfo;
            this.mTitle.setText(poiProductInfo.title);
            this.mAllProduct.setText(poiProductInfo.urlTitle);
            if (!C6307b.m19566a((Collection<T>) poiProductInfo.products)) {
                PoiProductAdapter poiProductAdapter = new PoiProductAdapter(poiProductInfo, poiSimpleBundle);
                mo88784a(poiProductInfo.products);
                WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this.itemView.getContext());
                wrapLinearLayoutManager.mo5427b(0);
                mo88785a(!TextUtils.isEmpty(poiProductInfo.url), mo88786b());
                this.f91478a.mo5525a((C1272h) new C1272h() {
                    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                        super.getItemOffsets(rect, view, recyclerView, sVar);
                        rect.right = (int) C9738o.m28708b(recyclerView.getContext(), 6.0f);
                    }
                });
                this.f91478a.mo5528a((C1281m) new C1281m() {
                    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        if (PoiDcdProductInfoViewHolder.this.f91505g != i && i == 0) {
                            C35454m.m114523a(poiSimpleBundle, "project_card_slide", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("poi_id", PoiDcdProductInfoViewHolder.this.f91506h.poiId).mo59973a("content_type", PoiDcdProductInfoViewHolder.this.f91506h.getSpSource()));
                        }
                        PoiDcdProductInfoViewHolder.this.f91505g = i;
                    }
                });
                this.f91478a.setLayoutManager(wrapLinearLayoutManager);
                this.f91478a.setAdapter(poiProductAdapter);
            }
            this.mAllProductContainer.setOnClickListener(new C35042b(this, poiProductInfo));
        }
    }
}
