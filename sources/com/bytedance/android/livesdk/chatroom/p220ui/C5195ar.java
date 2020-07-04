package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.livesdk.chatroom.api.C4258b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter.C4474a;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4610cy;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4610cy.C4613a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.message.model.C8508bd;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdk.utils.C9038ag;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.C9239c;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ar */
public final class C5195ar extends C9239c implements C4474a, C4613a, OnMessageListener {

    /* renamed from: a */
    private C4610cy f15249a;

    /* renamed from: c */
    private LinkInRoomAudioWaitingListAdapter f15250c;

    /* renamed from: d */
    private Room f15251d;

    /* renamed from: e */
    private long f15252e;

    /* renamed from: f */
    private boolean f15253f;

    /* renamed from: g */
    private boolean f15254g;

    /* renamed from: h */
    private boolean f15255h;

    /* renamed from: i */
    private final C47562b f15256i = new C47562b();

    /* renamed from: j */
    private TextView f15257j;

    /* renamed from: k */
    private TextView f15258k;

    /* renamed from: l */
    private View f15259l;

    /* renamed from: m */
    private RecyclerView f15260m;

    /* renamed from: n */
    private C9245h f15261n;

    /* renamed from: o */
    private ToggleButton f15262o;

    /* renamed from: a */
    public final int mo9100a() {
        return R.layout.aot;
    }

    public final void onPointerCaptureChanged(boolean z) {
    }

    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
    }

    /* renamed from: a */
    public final void mo12519a(Throwable th) {
        m16821g();
        C9076n.m27096a(getContext(), th, (int) R.string.ev3);
    }

    /* renamed from: d */
    public final void mo12523d() {
        m16821g();
        dismiss();
    }

    /* renamed from: b */
    public final void mo12520b() {
        m16821g();
        this.f15249a.mo12475a(this.f15252e);
        this.f15252e = 0;
    }

    /* renamed from: g */
    private void m16821g() {
        if (this.f15261n != null && this.f15261n.isShowing()) {
            this.f15261n.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo12521c() {
        m16821g();
        this.f15262o.setChecked(true);
        C9049ap.m27024a(getContext(), (int) R.string.exc);
    }

    /* renamed from: e */
    public final void mo12525e() {
        m16821g();
        this.f15262o.setChecked(true);
        C9049ap.m27024a(getContext(), (int) R.string.exc);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15254g = true;
        C9038ag.m26996a().addMessageListener(MessageType.LINK_MIC.getIntType(), this);
    }

    public final void onDetachedFromWindow() {
        this.f15254g = false;
        if (C9038ag.m26996a() != null) {
            C9038ag.m26996a().removeMessageListener(this);
        }
        this.f15249a.f13267c = null;
        this.f15256i.mo119660a();
        if (this.f15261n != null && this.f15261n.isShowing()) {
            this.f15261n.dismiss();
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: f */
    private void m16820f() {
        this.f15257j.setText(C3358ac.m12517a((int) R.string.ev6, Integer.valueOf(this.f15250c.mo12238b())));
        int a = 8 - this.f15250c.mo12236a();
        if (a < 0) {
            a = 0;
        }
        this.f15258k.setText(C3358ac.m12517a((int) R.string.exk, Integer.valueOf(a)));
        if (this.f15250c.getItemCount() > 0) {
            this.f15259l.setVisibility(8);
            this.f15260m.setVisibility(0);
            return;
        }
        this.f15259l.setVisibility(0);
        this.f15260m.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo12522c(long j) {
        m16821g();
        this.f15250c.mo12237a(j);
        m16820f();
    }

    /* renamed from: d */
    public final void mo12524d(long j) {
        m16821g();
        this.f15250c.mo12239b(j);
        m16820f();
    }

    /* renamed from: a */
    private static List<C4854e> m16816a(List<C4854e> list) {
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
        return list;
    }

    /* renamed from: b */
    public final void mo12244b(long j) {
        new C9249a(getContext()).mo22718b((int) R.string.f0z).mo22716a(false).mo22722b(0, (int) R.string.edq, (OnClickListener) new C5197at(this, j)).mo22722b(1, (int) R.string.ecm, C5198au.f15266a).mo22729d();
    }

    /* renamed from: a */
    private void m16817a(int i) {
        if (this.f15261n == null) {
            this.f15261n = new C9249a(getContext(), 2).mo22718b(i).mo22716a(false).mo22720b();
        }
        if (!this.f15261n.isShowing()) {
            this.f15261n.show();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13451b(Throwable th) throws Exception {
        C3166a.m11955a(6, "LinkInRoomAudioWaitingDialog", th.getStackTrace());
        this.f15253f = false;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15260m = (RecyclerView) findViewById(R.id.cqp);
        this.f15260m.setLayoutManager(new SSLinearLayoutManager(getContext(), 0, false));
        this.f15260m.setAdapter(this.f15250c);
        this.f15262o = (ToggleButton) findViewById(R.id.dkz);
        this.f15262o.setOnCheckedChangeListener(new C5196as(this));
        this.f15257j = (TextView) findViewById(R.id.title);
        this.f15258k = (TextView) findViewById(R.id.a7m);
        this.f15259l = findViewById(R.id.ae7);
        m16820f();
    }

    public final void onMessage(IMessage iMessage) {
        if (this.f15254g && ((C8508bd) iMessage).f23319a == 7 && !this.f15253f) {
            this.f15253f = true;
            this.f15256i.mo119661a(C4258b.m14404a((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class), this.f15251d.getId(), 4).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C5199av<Object>(this), (C7326g<? super Throwable>) new C5200aw<Object>(this)));
        }
    }

    /* renamed from: a */
    public final void mo12243a(long j) {
        if (this.f15254g) {
            C9036ae.m26994a(this.f15251d, "click_agree_connection", "agree_connection", true);
            m16817a((int) R.string.ev8);
            if (!this.f15249a.f13265a) {
                this.f15249a.mo12514r();
                this.f15252e = j;
                return;
            }
            this.f15249a.mo12475a(j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13449a(C3478c cVar) throws Exception {
        this.f15253f = false;
        this.f15250c = new LinkInRoomAudioWaitingListAdapter(this, m16816a(cVar.f10296b), this.f15255h);
        this.f15260m.setAdapter(this.f15250c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13450b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m16817a((int) R.string.eug);
        this.f15249a.mo12515s();
        C9036ae.m26994a(this.f15251d, "shutdown_connection", "connection", true);
    }

    /* renamed from: a */
    public final void mo12518a(long j, Throwable th) {
        m16821g();
        C9076n.m27096a(getContext(), th, (int) R.string.ev4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13448a(CompoundButton compoundButton, boolean z) {
        if (!z) {
            if (this.f15250c.getItemCount() <= 0) {
                m16817a((int) R.string.eug);
                this.f15249a.mo12515s();
                C9036ae.m26994a(this.f15251d, "shutdown_connection", "connection", true);
                return;
            }
            C9249a aVar = new C9249a(getContext(), 0);
            aVar.mo22710a((int) R.string.cww);
            aVar.mo22718b((int) R.string.cwy);
            aVar.mo22722b(0, (int) R.string.cwv, (OnClickListener) new C5201ax(this)).mo22722b(1, (int) R.string.ecm, (OnClickListener) new C5202ay(compoundButton)).mo22716a(false).mo22729d();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m16819a(CompoundButton compoundButton, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        compoundButton.setChecked(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13447a(long j, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m16817a((int) R.string.euy);
        this.f15249a.mo12483b(j);
        C9036ae.m26994a(this.f15251d, "shutdown_connection", "guest_connection", true);
    }

    public C5195ar(Context context, boolean z, Room room, List<C4854e> list, C4610cy cyVar) {
        super(context);
        this.f15255h = z;
        this.f15251d = room;
        this.f15250c = new LinkInRoomAudioWaitingListAdapter(this, m16816a(list), z);
        this.f15249a = cyVar;
        this.f15249a.f13267c = this;
    }
}
