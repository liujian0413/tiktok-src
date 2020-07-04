package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.livesdk.chatroom.p220ui.LoadingEmptyView;
import com.bytedance.android.livesdk.chatroom.p220ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8812a;
import com.bytedance.android.livesdk.rank.p421c.C8826f;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class NobleUserRankListView extends UserRankListView implements C8812a {

    /* renamed from: n */
    private NobleRankListBottomView f24119n;

    /* renamed from: o */
    private long f24120o;

    /* renamed from: p */
    private boolean f24121p;

    public Fragment getFragment() {
        return this.f24154l;
    }

    /* renamed from: i */
    private void m26502i() {
        C8826f fVar = new C8826f(this, this.f24149g, this.f24120o, this.f24121p);
        this.f24147e = fVar;
    }

    /* renamed from: j */
    private void m26503j() {
        if (this.f24155m != null) {
            this.f24155m.mo21877a();
        }
    }

    /* renamed from: c */
    public final void mo21894c() {
        if (!this.f24121p) {
            this.f24119n.mo21923a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo21931d() {
        inflate(getContext(), R.layout.av8, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo21933f() {
        this.f24143a.setVisibility(8);
        this.f24145c.setVisibility(0);
        this.f24145c.mo10830c();
        if (this.f24147e != null) {
            this.f24147e.mo21897a();
        }
    }

    /* access modifiers changed from: protected */
    public View getErrorView() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.au2, null);
        inflate.setOnClickListener(new C8863d(this));
        return inflate;
    }

    /* renamed from: e */
    public final View mo21932e() {
        int i;
        this.f24143a = (RecyclerView) findViewById(R.id.cne);
        this.f24143a.setLayoutManager(new SSLinearLayoutManager(getContext()));
        this.f24119n = (NobleRankListBottomView) findViewById(R.id.cn7);
        NobleRankListBottomView nobleRankListBottomView = this.f24119n;
        if (this.f24152j == null || ((Boolean) this.f24152j.get("data_is_portrait", Boolean.valueOf(true))).booleanValue()) {
            i = R.drawable.bol;
        } else {
            i = R.drawable.bs5;
        }
        nobleRankListBottomView.setBackgroundResource(i);
        this.f24119n.setDataCenter(this.f24152j);
        this.f24119n.setLoginObserver(this.f24153k);
        if (this.f24121p) {
            this.f24119n.setVisibility(8);
        }
        LayoutInflater.from(getContext()).inflate(R.layout.au2, null).setOnClickListener(new C8862c(this));
        LoadingEmptyView a = new LoadingEmptyView(getContext()).mo13379a(getContext().getString(R.string.f86));
        a.setLayoutParams(new LayoutParams(-1, -1));
        this.f24145c = (LoadingStatusView) findViewById(R.id.dav);
        this.f24145c.setBuilder(C3555a.m13075a(getContext()).mo10839c(getErrorView()).mo10838b((View) a).mo10834a(getResources().getDimensionPixelSize(R.dimen.oa)));
        this.f24145c.mo10830c();
        return this;
    }

    public NobleUserRankListView(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21930b(View view) {
        mo21947h();
    }

    public void setFragment(Fragment fragment) {
        if (fragment != null) {
            this.f24154l = fragment;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21929a(View view) {
        if (this.f24147e != null) {
            this.f24147e.mo21897a();
        }
    }

    /* renamed from: a */
    public final void mo21891a(C1262a aVar) {
        this.f24143a.setAdapter(aVar);
        this.f24143a.setVisibility(0);
        this.f24145c.setVisibility(8);
        m26503j();
    }

    public NobleUserRankListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo21892a(boolean z, C8857f fVar) {
        int i;
        NobleRankListBottomView nobleRankListBottomView = this.f24119n;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        nobleRankListBottomView.setVisibility(i);
        if (z) {
            this.f24119n.mo21925a(fVar);
        }
    }

    public NobleUserRankListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NobleUserRankListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo21928a(Fragment fragment, DataCenter dataCenter, int i, C8986g<IUser> gVar) {
        this.f24154l = fragment;
        this.f24152j = dataCenter;
        this.f24153k = gVar;
        if (this.f24152j != null) {
            Room room = (Room) dataCenter.get("data_room");
            if (room != null) {
                this.f24149g = room.getId();
                this.f24120o = room.getOwner().getId();
            }
            this.f24121p = ((Boolean) dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
        }
        if (getFragment() == null) {
            mo21890a();
            C3166a.m11961b("UserRankListView", "getFragment() == null");
        } else {
            m26502i();
        }
        mo21932e();
    }
}
