package com.p280ss.android.ugc.aweme.friends.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.SummonFriendLabelViewHolder */
public class SummonFriendLabelViewHolder extends C1293v {

    /* renamed from: a */
    private TextView f78978a;

    public SummonFriendLabelViewHolder(View view) {
        super(view);
        this.f78978a = (TextView) view.findViewById(R.id.dwg);
    }

    /* renamed from: a */
    public final void mo76242a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f78978a.setText(str);
        }
    }
}
