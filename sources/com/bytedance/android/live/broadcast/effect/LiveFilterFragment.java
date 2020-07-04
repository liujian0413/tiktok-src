package com.bytedance.android.live.broadcast.effect;

import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.p136b.C2590b;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class LiveFilterFragment extends BaseFragment {

    /* renamed from: a */
    private C2585a f8281a;

    /* renamed from: b */
    private List<FilterModel> f8282b;

    /* renamed from: c */
    private C2590b f8283c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9194a(int i) {
        if (this.f8281a != null) {
            this.f8281a.mo8810a(i);
        }
    }

    /* renamed from: a */
    private void m10598a(View view) {
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.co7);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        if (!(this.f8283c == null || this.f8283c.f8323b == null)) {
            recyclerView.mo5525a(this.f8283c.f8323b);
        }
        recyclerView.setAdapter(new LiveFilterAdapter(getContext(), this.f8282b, new C2618f(this), this.f8283c));
        recyclerView.post(new Runnable() {
            public final void run() {
                recyclerView.mo5541b(((Integer) C8946b.f24361M.mo22117a()).intValue());
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.apw, viewGroup, false);
        m10598a(inflate);
        return inflate;
    }

    /* renamed from: a */
    public static LiveFilterFragment m10597a(C2585a aVar, List<FilterModel> list, C2590b bVar) {
        LiveFilterFragment liveFilterFragment = new LiveFilterFragment();
        liveFilterFragment.f8281a = aVar;
        Bundle bundle = new Bundle();
        if (list == null) {
            list = new ArrayList<>();
        }
        liveFilterFragment.f8282b = list;
        liveFilterFragment.f8283c = bVar;
        liveFilterFragment.setArguments(bundle);
        return liveFilterFragment;
    }
}
