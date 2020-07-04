package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.poi.model.PoiPhoto;
import com.p280ss.android.ugc.aweme.poi.preview.C35142b;
import com.p280ss.android.ugc.aweme.poi.utils.C35470z;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder */
public class PoiBannerViewHolder extends C1293v {

    /* renamed from: a */
    private PoiPhoto f91483a;

    /* renamed from: b */
    private C35018a f91484b;
    RemoteImageView mSdCover;
    DmtTextView mWaterMark;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder$a */
    public interface C35018a {
        /* renamed from: a */
        void mo88789a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo88787a(View view) {
        if (this.f91484b != null) {
            this.f91484b.mo88789a();
        }
    }

    public PoiBannerViewHolder(View view, C35018a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f91484b = aVar;
    }

    /* renamed from: a */
    public final void mo88788a(PoiPhoto poiPhoto, String str) {
        String str2;
        if (poiPhoto != null) {
            this.f91483a = poiPhoto;
            UrlModel picMedium = this.f91483a.getPicMedium();
            if (picMedium == null || C6307b.m19566a((Collection<T>) picMedium.getUrlList())) {
                str2 = null;
            } else {
                str2 = (String) picMedium.getUrlList().get(0);
            }
            C23323e.m76513a(this.mSdCover, picMedium, (C13842b) new C35470z(str, str2, C35142b.m113367b()));
            if (!TextUtils.isEmpty(poiPhoto.uploadImageWaterMark)) {
                this.mWaterMark.setVisibility(0);
                this.mWaterMark.setText(poiPhoto.uploadImageWaterMark);
            } else {
                this.mWaterMark.setVisibility(8);
            }
            this.itemView.setOnClickListener(new C35041a(this));
        }
    }
}
