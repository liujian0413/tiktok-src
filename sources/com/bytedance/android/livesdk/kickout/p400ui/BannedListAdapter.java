package com.bytedance.android.livesdk.kickout.p400ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.recyclerview.LoadMoreRecyclerViewAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.kickout.ui.BannedListAdapter */
public class BannedListAdapter extends LoadMoreRecyclerViewAdapter {

    /* renamed from: c */
    public boolean f22937c;

    /* renamed from: d */
    private Context f22938d;

    /* renamed from: e */
    private List<User> f22939e = new ArrayList();

    /* renamed from: f */
    private String f22940f;

    /* renamed from: g */
    private long f22941g;

    /* renamed from: h */
    private long f22942h;

    /* renamed from: com.bytedance.android.livesdk.kickout.ui.BannedListAdapter$a */
    static class C8372a extends C1293v {

        /* renamed from: a */
        private TextView f22943a;

        public C8372a(View view) {
            super(view);
            this.f22943a = (TextView) view.findViewById(R.id.dqs);
        }

        /* renamed from: a */
        public final void mo21524a(String str) {
            int i;
            TextView textView = this.f22943a;
            if (str.equals("activity_kick_out")) {
                i = R.string.en6;
            } else {
                i = R.string.en5;
            }
            textView.setText(i);
        }
    }

    /* renamed from: c */
    public final int mo10843c() {
        if (this.f22937c) {
            return this.f22939e.size() + 1;
        }
        return this.f22939e.size();
    }

    /* renamed from: a */
    public final void mo21523a(Collection<? extends User> collection) {
        if (collection != null && collection.size() > 0) {
            this.f22939e.addAll(collection);
        }
    }

    /* renamed from: a */
    public final int mo10840a(int i) {
        if (!this.f22937c || i != this.f22939e.size()) {
            return super.mo10840a(i);
        }
        return MessageCenter.MSG_SDK_TO_CLIENT_END_GAME_REQ;
    }

    /* renamed from: a */
    public final void mo21522a(long j) {
        int size = this.f22939e.size() - 1;
        while (size >= 0) {
            User user = (User) this.f22939e.get(size);
            if (user == null || user.getId() != j) {
                size--;
            } else {
                this.f22939e.remove(size);
                notifyDataSetChanged();
                return;
            }
        }
    }

    /* renamed from: a */
    public final C1293v mo10841a(ViewGroup viewGroup, int i) {
        if (i == 4099) {
            return new C8372a(LayoutInflater.from(this.f22938d).inflate(R.layout.ard, viewGroup, false));
        }
        BannedViewHolder bannedViewHolder = new BannedViewHolder(this.f22938d, LayoutInflater.from(this.f22938d).inflate(R.layout.are, viewGroup, false), this.f22940f, this.f22941g, this.f22942h);
        return bannedViewHolder;
    }

    /* renamed from: a */
    public final void mo10842a(C1293v vVar, int i) {
        if (getItemViewType(i) == 4099) {
            C8372a aVar = (C8372a) vVar;
            if (aVar != null) {
                aVar.mo21524a(this.f22940f);
            }
            return;
        }
        BannedViewHolder bannedViewHolder = (BannedViewHolder) vVar;
        if (bannedViewHolder != null) {
            bannedViewHolder.mo21526a(this.f22939e, i);
        }
    }

    public BannedListAdapter(Context context, String str, long j, long j2) {
        this.f22938d = context;
        this.f22940f = str;
        this.f22941g = j;
        this.f22942h = j2;
    }
}
