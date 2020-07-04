package com.p280ss.android.ugc.aweme.filter;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.filter.PhotoEditFilterAdapter */
public class PhotoEditFilterAdapter extends FilterAdapter {
    public PhotoEditFilterAdapter(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void onBindViewHolder(C29149a aVar, int i) {
        View view;
        super.onBindViewHolder(aVar, i);
        int i2 = 8;
        if (i == 0) {
            aVar.f76939c.findViewById(R.id.a0r).setVisibility(0);
            view = aVar.f76939c.findViewById(R.id.ahr);
        } else {
            aVar.f76939c.findViewById(R.id.a0r).setVisibility(8);
            view = aVar.f76939c.findViewById(R.id.ahr);
            if (mo4535a(i).f77266a == this.f76934c) {
                i2 = 0;
            }
        }
        view.setVisibility(i2);
    }
}
