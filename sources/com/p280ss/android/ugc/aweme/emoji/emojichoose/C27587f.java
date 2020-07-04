package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.f */
public final class C27587f extends C27600n {

    /* renamed from: a */
    private String f72693a;

    public C27587f(String str) {
        this.f72693a = str;
    }

    /* renamed from: a */
    public final View mo70814a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lu, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.du0)).setText(this.f72693a);
        return inflate;
    }
}
