package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.C35012a;
import com.p280ss.android.ugc.aweme.poi.bean.PoiCategoryTitle;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder */
public class PoiCateTitleViewHolder extends C1293v {

    /* renamed from: a */
    private Context f91492a;
    View mMoreArrow;
    View mMoreTxt;
    TextView mTxtTitle;

    public PoiCateTitleViewHolder(View view) {
        super(view);
        this.f91492a = view.getContext();
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo88792a(PoiCategoryTitle poiCategoryTitle, final PoiSimpleBundle poiSimpleBundle, final C35012a aVar) {
        if (poiCategoryTitle != null) {
            if (poiCategoryTitle.isAweme) {
                this.mTxtTitle.setText(R.string.cxl);
            } else {
                this.mTxtTitle.setText(R.string.cxm);
            }
            if (poiCategoryTitle.showMore) {
                this.mMoreTxt.setVisibility(0);
                this.mMoreArrow.setVisibility(0);
                this.mTxtTitle.setTextSize(17.0f);
                this.mTxtTitle.setTextColor(this.f91492a.getResources().getColor(R.color.sd));
                this.itemView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (aVar != null) {
                            aVar.mo88780a(poiSimpleBundle.getAwemeId(), poiSimpleBundle.getPoiId(), false, 1);
                        }
                    }
                });
                return;
            }
            this.mMoreTxt.setVisibility(8);
            this.mMoreArrow.setVisibility(8);
            this.mTxtTitle.setTextSize(13.0f);
            this.mTxtTitle.setTextColor(this.f91492a.getResources().getColor(R.color.a20));
        }
    }
}
