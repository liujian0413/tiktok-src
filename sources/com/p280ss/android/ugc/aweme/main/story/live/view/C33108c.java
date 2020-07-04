package com.p280ss.android.ugc.aweme.main.story.live.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.view.c */
public final class C33108c extends AbsLiveStoryItemView {

    /* renamed from: i */
    private String f86128i;

    /* renamed from: j */
    private boolean f86129j;

    public final void onClick(View view) {
        String str;
        if (this.f86129j) {
            str = "toplist_homepage_follow";
        } else {
            str = this.f86124h;
        }
        C41989d.m133491b(str);
        Bundle bundle = new Bundle();
        bundle.putString("request_id", this.f86123g);
        bundle.putString("style", "head");
        bundle.putString("position", "live_merge");
        bundle.putString("toplist_page", str);
        bundle.putInt("tab_type", 0);
        C41990e.m133500a(getContext(), bundle);
    }

    public C33108c(Context context, boolean z) {
        String str;
        super(context, z);
        if (z) {
            str = "homepage_follow";
        } else {
            str = "homepage_hot";
        }
        this.f86128i = str;
        this.f86129j = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo64480a(Context context, boolean z) {
        int i;
        LayoutInflater from = LayoutInflater.from(context);
        if (z) {
            i = R.layout.x5;
        } else {
            i = R.layout.x6;
        }
        return from.inflate(i, this, true);
    }
}
