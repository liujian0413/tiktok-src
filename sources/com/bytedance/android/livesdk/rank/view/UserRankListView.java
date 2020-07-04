package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.livesdk.chatroom.p220ui.LoadingEmptyView;
import com.bytedance.android.livesdk.chatroom.p220ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8812a;
import com.bytedance.android.livesdk.rank.p419a.C8811c.C8813b;
import com.bytedance.android.livesdk.rank.p421c.C8821a;
import com.bytedance.android.livesdk.rank.p421c.C8830j;
import com.bytedance.android.livesdk.rank.p421c.C8834n;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Random;

public class UserRankListView extends RelativeLayout implements C8812a {

    /* renamed from: a */
    protected RecyclerView f24143a;

    /* renamed from: b */
    protected UserRankListAnchorView f24144b;

    /* renamed from: c */
    protected LoadingStatusView f24145c;

    /* renamed from: d */
    protected TextView f24146d;

    /* renamed from: e */
    protected C8813b f24147e;

    /* renamed from: f */
    protected boolean f24148f;

    /* renamed from: g */
    protected long f24149g;

    /* renamed from: h */
    protected long f24150h;

    /* renamed from: i */
    protected int f24151i;

    /* renamed from: j */
    protected DataCenter f24152j;

    /* renamed from: k */
    protected C8986g<IUser> f24153k;

    /* renamed from: l */
    protected Fragment f24154l;

    /* renamed from: m */
    protected C8859a f24155m;

    /* renamed from: n */
    private String[] f24156n;

    /* renamed from: o */
    private Random f24157o;

    /* renamed from: p */
    private boolean f24158p = true;

    /* renamed from: com.bytedance.android.livesdk.rank.view.UserRankListView$a */
    public interface C8859a {
        /* renamed from: a */
        void mo21877a();
    }

    /* renamed from: g */
    public final void mo21946g() {
        mo21933f();
    }

    public Fragment getFragment() {
        return this.f24154l;
    }

    /* renamed from: h */
    public final void mo21947h() {
        mo21933f();
    }

    /* renamed from: c */
    public void mo21894c() {
        this.f24144b.mo21937a();
    }

    /* renamed from: i */
    private void m26529i() {
        if (this.f24155m != null) {
            this.f24155m.mo21877a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21931d() {
        inflate(getContext(), R.layout.aqv, this);
    }

    /* renamed from: a */
    public final void mo21890a() {
        this.f24143a.setVisibility(8);
        this.f24145c.setVisibility(0);
        this.f24145c.mo10832e();
        m26529i();
    }

    /* renamed from: b */
    public final void mo21893b() {
        this.f24143a.setVisibility(8);
        this.f24145c.setVisibility(0);
        this.f24145c.mo10831d();
        m26529i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo21933f() {
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
        inflate.setOnClickListener(new C8877n(this));
        return inflate;
    }

    private View getEmptyView() {
        Context context;
        int i;
        int i2;
        if (this.f24148f) {
            context = getContext();
            i = R.string.eqq;
        } else {
            context = getContext();
            i = R.string.eqr;
        }
        String string = context.getString(i);
        if (22 == this.f24151i) {
            if (this.f24152j != null) {
                i2 = ((Integer) this.f24152j.get("data_member_count", Integer.valueOf(-1))).intValue();
            } else {
                i2 = -1;
            }
            if (i2 > 0) {
                string = C3358ac.m12517a((int) R.string.f97, C3385e.m12593c((long) i2));
            } else {
                string = getContext().getString(R.string.f98);
            }
        }
        LoadingEmptyView a = new LoadingEmptyView(getContext()).mo13379a(string);
        a.setLayoutParams(new LayoutParams(-1, -1));
        return a;
    }

    /* renamed from: e */
    public View mo21932e() {
        int i;
        this.f24143a = (RecyclerView) findViewById(R.id.cne);
        this.f24143a.setLayoutManager(new SSLinearLayoutManager(getContext()));
        this.f24144b = (UserRankListAnchorView) findViewById(R.id.cn7);
        UserRankListAnchorView userRankListAnchorView = this.f24144b;
        if (this.f24152j == null || ((Boolean) this.f24152j.get("data_is_portrait", Boolean.valueOf(true))).booleanValue()) {
            i = R.drawable.boc;
        } else {
            i = R.drawable.bs5;
        }
        userRankListAnchorView.setBackgroundResource(i);
        this.f24144b.setOwnerId(this.f24150h);
        this.f24144b.setDataCenter(this.f24152j);
        this.f24144b.setLoginObserver(this.f24153k);
        LayoutInflater.from(getContext()).inflate(R.layout.au2, null).setOnClickListener(new C8876m(this));
        this.f24145c = (LoadingStatusView) findViewById(R.id.dav);
        this.f24145c.setBuilder(C3555a.m13075a(getContext()).mo10839c(getErrorView()).mo10838b(getEmptyView()).mo10834a(getResources().getDimensionPixelSize(R.dimen.oa)));
        this.f24145c.mo10830c();
        this.f24146d = (TextView) findViewById(R.id.b2p);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo21945d(View view) {
        mo21947h();
    }

    public void setFetchCompleteListener(C8859a aVar) {
        this.f24155m = aVar;
    }

    public void setFragment(Fragment fragment) {
        if (fragment != null) {
            this.f24154l = fragment;
        }
    }

    public UserRankListView(Context context) {
        super(context);
        mo21931d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo21944c(View view) {
        if (this.f24147e != null) {
            this.f24147e.mo21897a();
        }
    }

    /* renamed from: a */
    public void mo21891a(C1262a aVar) {
        if (getFragment() == null) {
            this.f24143a.setVisibility(8);
            this.f24145c.setVisibility(0);
            this.f24145c.mo10832e();
            C3166a.m11961b("UserRankListView", "getFragment() == null");
            return;
        }
        try {
            this.f24143a.setAdapter(aVar);
        } catch (Exception unused) {
            C3166a.m11961b("UserRankListView", "setAdapter error");
        }
        this.f24143a.setVisibility(0);
        this.f24145c.setVisibility(8);
        m26529i();
    }

    /* renamed from: a */
    private void m26528a(int i) {
        if (i == 7 || i == 9) {
            C8834n nVar = new C8834n(this, this.f24152j, this.f24149g, this.f24150h, this.f24148f, i);
            this.f24147e = nVar;
        } else if (i == 17) {
            C8821a aVar = new C8821a(this, this.f24152j, this.f24149g, this.f24150h, this.f24148f);
            this.f24147e = aVar;
        } else if (i != 22) {
            C8821a aVar2 = new C8821a(this, this.f24152j, this.f24149g, this.f24150h, this.f24148f);
            this.f24147e = aVar2;
        } else {
            C8830j jVar = new C8830j(this, this.f24152j, this.f24149g, this.f24150h, this.f24148f);
            this.f24147e = jVar;
        }
    }

    public UserRankListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo21931d();
    }

    /* renamed from: a */
    public void mo21892a(boolean z, C8857f fVar) {
        int i;
        UserRankListAnchorView userRankListAnchorView = this.f24144b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        userRankListAnchorView.setVisibility(i);
        if (z) {
            this.f24144b.mo21939a(fVar, this.f24151i);
        }
    }

    public UserRankListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo21931d();
    }

    public UserRankListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo21931d();
    }

    /* renamed from: a */
    public void mo21928a(Fragment fragment, DataCenter dataCenter, int i, C8986g<IUser> gVar) {
        this.f24154l = fragment;
        this.f24152j = dataCenter;
        this.f24151i = i;
        this.f24153k = gVar;
        this.f24156n = C3358ac.m12513a().getStringArray(R.array.ag);
        this.f24157o = new Random();
        if (this.f24152j != null) {
            this.f24148f = ((Boolean) dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
            Room room = (Room) dataCenter.get("data_room");
            if (room != null) {
                this.f24149g = room.getId();
                this.f24150h = room.getOwnerUserId();
            }
            this.f24158p = ((Boolean) dataCenter.get("data_is_portrait")).booleanValue();
        }
        m26528a(this.f24151i);
        mo21932e();
    }
}
