package com.bytedance.android.livesdk.rank.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.livesdk.p414p.C8751d;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.rank.C8850l;
import com.bytedance.android.livesdk.rank.view.NobleUserRankListView;
import com.bytedance.android.livesdk.rank.view.UserRankListView;
import com.bytedance.android.livesdk.rank.view.UserRankListView.C8859a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.ies.sdk.widgets.DataCenter;

public class UserRankListContainerFragment extends BaseFragment {

    /* renamed from: a */
    public DataCenter f24033a;

    /* renamed from: b */
    public C8986g<IUser> f24034b;

    /* renamed from: c */
    protected boolean f24035c;

    /* renamed from: d */
    protected long f24036d;

    /* renamed from: e */
    protected long f24037e;

    /* renamed from: f */
    public int f24038f;

    /* renamed from: g */
    public C8859a f24039g;

    /* renamed from: h */
    private int f24040h;

    /* renamed from: i */
    private UserRankListView f24041i;

    /* renamed from: j */
    private boolean f24042j;

    /* renamed from: k */
    private int f24043k;

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: b */
    public final void mo21912b() {
        if (this.f24041i != null) {
            this.f24041i.mo21947h();
        }
    }

    /* renamed from: a */
    public final void mo21911a() {
        if (!this.f24042j && this.f24041i != null) {
            C8850l.m26469a(hashCode(), this.f24040h);
            this.f24042j = true;
            this.f24041i.mo21946g();
        }
    }

    /* renamed from: c */
    private UserRankListView m26451c() {
        if (!(this.f24033a == null || ((Integer) this.f24033a.get("data_xt_broadcast_type", Integer.valueOf(-1))).intValue() == 3)) {
            C8751d dVar = (C8751d) C9178j.m27302j().mo22378g().mo22355a(C8751d.class);
            if (dVar != null) {
                return dVar.mo21756a(getContext());
            }
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f24035c = arguments.getBoolean("broadcaster");
            this.f24036d = arguments.getLong("room_id");
            this.f24037e = arguments.getLong("owner_id");
            this.f24040h = arguments.getInt("rank_type");
            this.f24043k = arguments.getInt("tab_index", 0);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        UserRankListView userRankListView;
        int i = this.f24040h;
        if (i != 7 && i != 9 && i != 17 && i != 22) {
            switch (i) {
                case -2:
                    userRankListView = new NobleUserRankListView(getContext());
                    break;
                case -1:
                    userRankListView = m26451c();
                    if (userRankListView == null) {
                        return new View(getContext());
                    }
                    break;
                default:
                    userRankListView = new UserRankListView(getContext());
                    break;
            }
        } else {
            userRankListView = new UserRankListView(getContext());
        }
        userRankListView.mo21928a(this, this.f24033a, this.f24040h, this.f24034b);
        this.f24041i = userRankListView;
        if (this.f24038f == this.f24043k) {
            mo21911a();
            this.f24041i.setFetchCompleteListener(this.f24039g);
        }
        userRankListView.setLayoutParams(new LayoutParams(-1, -1));
        return userRankListView;
    }

    /* renamed from: a */
    public static UserRankListContainerFragment m26450a(long j, long j2, boolean z, int i, int i2, C8859a aVar) {
        UserRankListContainerFragment userRankListContainerFragment = new UserRankListContainerFragment();
        Bundle bundle = new Bundle(4);
        bundle.putBoolean("broadcaster", z);
        bundle.putLong("room_id", j);
        bundle.putLong("owner_id", j2);
        bundle.putInt("rank_type", i);
        bundle.putInt("tab_index", i2);
        userRankListContainerFragment.setArguments(bundle);
        userRankListContainerFragment.f24039g = aVar;
        return userRankListContainerFragment;
    }
}
