package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDcdCar;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductViewHolder */
public class PoiDcdProductViewHolder extends C1293v {
    public RemoteImageView mImage;
    public TextView mName;
    public TextView mPrice;
    public TextView mSalesPromotion;
    public TextView mSubmitButton;

    public PoiDcdProductViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo88799a(PoiDcdCar poiDcdCar, String str, PoiSimpleBundle poiSimpleBundle) {
        if (poiDcdCar != null) {
            if (poiDcdCar.imageUrl != null) {
                C23323e.m76524b(this.mImage, poiDcdCar.imageUrl);
            }
            this.mName.setText(poiDcdCar.name);
            this.mPrice.setText(poiDcdCar.price);
            if (!TextUtils.isEmpty(poiDcdCar.onSale)) {
                this.mSalesPromotion.setVisibility(0);
                this.mSalesPromotion.setText(poiDcdCar.onSale);
            } else {
                this.mSalesPromotion.setVisibility(4);
            }
            this.mSubmitButton.setText(poiDcdCar.buttonText);
            this.mSubmitButton.setOnClickListener(new C35043c(this, poiDcdCar, poiSimpleBundle, str));
            this.itemView.setOnClickListener(new C35044d(this, poiDcdCar, poiSimpleBundle, str));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88798a(PoiDcdCar poiDcdCar, PoiSimpleBundle poiSimpleBundle, String str, View view) {
        if (!TextUtils.isEmpty(poiDcdCar.url)) {
            C35454m.m114522a(this.itemView.getContext(), poiDcdCar.url, "poi_page", "click_card");
            C35454m.m114523a(poiSimpleBundle, "project_click_card", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("product_id", poiDcdCar.extId).mo59973a("poi_id", poiSimpleBundle.getPoiId()).mo59973a("content_type", str));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo88800b(PoiDcdCar poiDcdCar, PoiSimpleBundle poiSimpleBundle, String str, View view) {
        if (!TextUtils.isEmpty(poiDcdCar.buttonUrl)) {
            C35454m.m114522a(this.itemView.getContext(), poiDcdCar.buttonUrl, "poi_page", "click_button");
            C35454m.m114523a(poiSimpleBundle, "project_click_price", C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("product_id", poiDcdCar.extId).mo59973a("poi_id", poiSimpleBundle.getPoiId()).mo59973a("content_type", str));
        }
    }
}
