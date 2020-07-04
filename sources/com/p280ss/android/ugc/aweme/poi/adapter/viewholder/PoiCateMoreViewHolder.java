package com.p280ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.poi.adapter.C35012a;
import com.p280ss.android.ugc.aweme.poi.bean.PoiCategoryMore;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder */
public class PoiCateMoreViewHolder extends C1293v {
    View mDivider;
    TextView mTxtMore;

    public PoiCateMoreViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo88790a(PoiCategoryMore poiCategoryMore, boolean z, int i, C35012a aVar) {
        View view = this.itemView;
        final C35012a aVar2 = aVar;
        final PoiCategoryMore poiCategoryMore2 = poiCategoryMore;
        final boolean z2 = z;
        final int i2 = i;
        C350191 r1 = new OnClickListener() {
            public final void onClick(View view) {
                int i;
                ClickInstrumentation.onClick(view);
                if (aVar2 != null) {
                    C35012a aVar = aVar2;
                    String str = poiCategoryMore2.aid;
                    String str2 = poiCategoryMore2.relatedId;
                    boolean z = z2;
                    if (z2) {
                        i = i2;
                    } else {
                        i = poiCategoryMore2.targetPosition;
                    }
                    aVar.mo88780a(str, str2, z, i);
                }
            }
        };
        view.setOnClickListener(r1);
        if (poiCategoryMore.showDividerLine) {
            this.mDivider.setVisibility(0);
        } else {
            this.mDivider.setVisibility(8);
        }
    }
}
