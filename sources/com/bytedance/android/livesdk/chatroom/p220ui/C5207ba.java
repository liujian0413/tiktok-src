package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.utils.C3389i;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4651eg;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4651eg.C4652a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.p220ui.LinkInRoomVideoListAdapter.C5091b;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.C9239c;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ba */
public final class C5207ba extends C9239c implements C4652a, C5091b {

    /* renamed from: a */
    private C4651eg f15286a;

    /* renamed from: c */
    private LinkInRoomVideoListAdapter f15287c;

    /* renamed from: d */
    private Room f15288d;

    /* renamed from: e */
    private long f15289e;

    /* renamed from: f */
    private TextView f15290f;

    /* renamed from: g */
    private TextView f15291g;

    /* renamed from: h */
    private View f15292h;

    /* renamed from: i */
    private RecyclerView f15293i;

    /* renamed from: j */
    private C9245h f15294j;

    /* renamed from: k */
    private ToggleButton f15295k;

    /* renamed from: a */
    public final int mo9100a() {
        return R.layout.any;
    }

    /* renamed from: b */
    public final void mo12577b() {
        mo13472f();
        this.f15286a.mo12546a(this.f15289e);
        this.f15289e = 0;
    }

    /* renamed from: d */
    public final void mo12580d() {
        mo13472f();
        if (isShowing()) {
            dismiss();
        }
    }

    /* renamed from: c */
    public final void mo12579c() {
        mo13472f();
        this.f15289e = 0;
        C9049ap.m27024a(getContext(), (int) R.string.ev4);
    }

    /* renamed from: e */
    public final void mo12581e() {
        mo13472f();
        this.f15295k.setChecked(true);
        C9049ap.m27024a(getContext(), (int) R.string.exc);
    }

    /* renamed from: f */
    public final void mo13472f() {
        if (this.f15294j != null && this.f15294j.isShowing()) {
            this.f15294j.dismiss();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15286a.f13325c = null;
        if (this.f15294j != null && this.f15294j.isShowing()) {
            this.f15294j.dismiss();
        }
    }

    /* renamed from: g */
    private void m16855g() {
        this.f15290f.setText(C3389i.m12608a(R.string.cw5, Integer.valueOf(this.f15287c.mo13227b())));
        int a = 2 - this.f15287c.mo13225a();
        if (a < 0) {
            a = 0;
        }
        this.f15291g.setText(C3389i.m12608a(R.string.cw4, Integer.valueOf(a)));
        if (this.f15287c.getItemCount() > 0) {
            this.f15292h.setVisibility(8);
            this.f15293i.setVisibility(0);
            return;
        }
        this.f15292h.setVisibility(0);
        this.f15293i.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo12574a(long j) {
        mo13472f();
        this.f15287c.mo13226a(j);
        m16855g();
    }

    /* renamed from: b */
    public final void mo12578b(long j) {
        mo13472f();
        this.f15287c.mo13228b(j);
        m16855g();
    }

    /* renamed from: a */
    private void m16852a(int i) {
        if (this.f15294j == null) {
            this.f15294j = new C9249a(getContext(), 2).mo22718b(i).mo22716a(false).mo22720b();
        }
        if (!this.f15294j.isShowing()) {
            this.f15294j.show();
        }
    }

    /* renamed from: c */
    public final void mo13231c(long j) {
        if (this.f25336b) {
            C9036ae.m26994a(this.f15288d, "click_agree_connection", "agree_connection", true);
            m16852a((int) R.string.ev8);
            if (!this.f15286a.f13323a) {
                this.f15286a.mo12558d();
                this.f15289e = j;
                return;
            }
            this.f15286a.mo12546a(j);
        }
    }

    /* renamed from: d */
    public final void mo13232d(long j) {
        if (this.f25336b) {
            new C9249a(getContext(), 0).mo22710a((int) R.string.cvx).mo22718b((int) R.string.cvw).mo22722b(0, (int) R.string.cvu, (OnClickListener) new C5209bc(this, j)).mo22722b(1, (int) R.string.ecm, C5210bd.f15299a).mo22729d();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15293i = (RecyclerView) findViewById(R.id.cqp);
        this.f15293i.mo5525a((C1272h) new InteractListItemDecoration());
        this.f15293i.setLayoutManager(new SSLinearLayoutManager(getContext(), 0, false));
        this.f15293i.setAdapter(this.f15287c);
        this.f15295k = (ToggleButton) findViewById(R.id.dkz);
        this.f15295k.setOnCheckedChangeListener(new C5208bb(this));
        this.f15290f = (TextView) findViewById(R.id.title);
        this.f15291g = (TextView) findViewById(R.id.a7m);
        this.f15292h = findViewById(R.id.ae7);
        m16855g();
    }

    /* renamed from: a */
    public final void mo12576a(Throwable th) {
        mo13472f();
        C9076n.m27096a(getContext(), th, (int) R.string.ev3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13471b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m16852a((int) R.string.eug);
        this.f15286a.mo12561e();
        C9036ae.m26994a(this.f15288d, "shutdown_connection", "connection", true);
    }

    /* renamed from: a */
    public final void mo12575a(long j, Throwable th) {
        mo13472f();
        C9076n.m27096a(getContext(), th, (int) R.string.ev4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13470a(CompoundButton compoundButton, boolean z) {
        if (!z) {
            if (this.f15287c.getItemCount() <= 0) {
                m16852a((int) R.string.eug);
                this.f15286a.mo12561e();
                C9036ae.m26994a(this.f15288d, "shutdown_connection", "connection", true);
                return;
            }
            C9249a aVar = new C9249a(getContext(), 0);
            aVar.mo22710a((int) R.string.cww);
            aVar.mo22718b((int) R.string.cwy);
            aVar.mo22722b(0, (int) R.string.cwv, (OnClickListener) new C5211be(this)).mo22722b(1, (int) R.string.ecm, (OnClickListener) new C5212bf(compoundButton)).mo22716a(false).mo22729d();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m16854a(CompoundButton compoundButton, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        compoundButton.setChecked(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13469a(long j, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m16852a((int) R.string.euy);
        this.f15286a.mo12553b(j);
        C9036ae.m26994a(this.f15288d, "shutdown_connection", "anchor_connection", true);
    }

    public C5207ba(Context context, Room room, List<C4854e> list, C4651eg egVar) {
        super(context);
        this.f15288d = room;
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4854e eVar = (C4854e) it.next();
            if (eVar == null || eVar.f13871d == null || 1 == eVar.f13875h) {
                it.remove();
            }
        }
        this.f15287c = new LinkInRoomVideoListAdapter(this, list, 0);
        this.f15286a = egVar;
        this.f15286a.f13325c = this;
    }
}
