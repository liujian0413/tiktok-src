package com.p280ss.android.ugc.aweme.filter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.p280ss.android.ugc.aweme.filter.EffectFilterAdapter.FilterViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.EffectPhotoEditFilterAdapter */
public class EffectPhotoEditFilterAdapter extends EffectFilterAdapter {
    public EffectPhotoEditFilterAdapter(C29240bc bcVar) {
        super(bcVar);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        super.mo58033a(vVar, i);
        m95630b(vVar, i);
    }

    /* renamed from: b */
    private void m95630b(C1293v vVar, int i) {
        int i2;
        View view;
        if (mo58029a(i) == 1) {
            View view2 = ((FilterViewHolder) vVar).itemView;
            if (i == 0) {
                view = view2.findViewById(R.id.ahr);
            } else {
                view = view2.findViewById(R.id.ahr);
                if (((C29296g) mo62312a().get(i)).f77266a == this.f76906a) {
                    i2 = 0;
                    view.setVisibility(i2);
                }
            }
            i2 = 8;
            view.setVisibility(i2);
        }
    }

    public void onBindViewHolder(C1293v vVar, int i, List list) {
        super.onBindViewHolder(vVar, i, list);
        if (list.isEmpty()) {
            onBindViewHolder(vVar, i);
        } else {
            m95630b(vVar, i);
        }
    }
}
