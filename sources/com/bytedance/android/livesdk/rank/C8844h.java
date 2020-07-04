package com.bytedance.android.livesdk.rank;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.interact.C4811i;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4855f;
import com.bytedance.android.livesdk.chatroom.p220ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.rank.adapter.LinkRankAdapter;
import com.bytedance.android.livesdk.widget.C9239c;
import com.bytedance.common.utility.C6311g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.rank.h */
public final class C8844h extends C9239c {

    /* renamed from: a */
    public long f24044a;

    /* renamed from: c */
    private List<C4855f> f24045c;

    /* renamed from: a */
    public final int mo9100a() {
        return R.layout.ao0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cne);
        View findViewById = findViewById(R.id.ae7);
        if (C6311g.m19573a(this.f24045c)) {
            recyclerView.setVisibility(8);
            findViewById.setVisibility(0);
        } else {
            recyclerView.setLayoutManager(new SSLinearLayoutManager(getContext()));
            recyclerView.setAdapter(new LinkRankAdapter(this.f24045c));
        }
        C4811i.m15840a(this.f24044a);
    }

    public C8844h(Context context, List<C4855f> list) {
        super(context);
        this.f24045c = list;
    }
}
