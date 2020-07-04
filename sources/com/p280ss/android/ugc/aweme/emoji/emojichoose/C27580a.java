package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.a */
public final class C27580a extends C27600n {
    /* renamed from: a */
    public final View mo70814a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.m2, viewGroup, false);
        inflate.findViewById(R.id.e3).setOnClickListener(new C27581b(context));
        return inflate;
    }
}
