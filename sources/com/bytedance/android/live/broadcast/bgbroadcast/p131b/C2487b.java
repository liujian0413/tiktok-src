package com.bytedance.android.live.broadcast.bgbroadcast.p131b;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.android.live.broadcast.bgbroadcast.C2483b;
import com.bytedance.android.live.broadcast.bgbroadcast.C2501m;
import com.bytedance.android.live.broadcast.dialog.C2522a;
import com.bytedance.android.live.broadcast.dialog.C2532g;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.C4452v;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.p108b.C2260a;
import com.bytedance.android.p108b.C2260a.C2261a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b */
public final class C2487b extends C2483b implements C2261a {

    /* renamed from: e */
    private C2260a f8069e;

    /* renamed from: f */
    private View f8070f;

    /* renamed from: g */
    private View f8071g;

    /* renamed from: h */
    private C2532g f8072h;

    /* renamed from: i */
    private C2522a f8073i;

    /* renamed from: j */
    private boolean f8074j;

    /* renamed from: k */
    private TextureView f8075k;

    /* renamed from: l */
    private boolean f8076l;

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b.b$a */
    class C2489a implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C2489a() {
        }

        public final void onClick(View view) {
            C2487b.this.mo9062o();
        }
    }

    /* renamed from: a */
    public final void mo8026a(int i, String str) {
    }

    /* renamed from: a */
    public final void mo8027a(Exception exc) {
    }

    /* renamed from: a */
    public final void mo8028a(Object obj) {
    }

    /* renamed from: b */
    public final void mo9033b() {
    }

    /* renamed from: c */
    public final void mo9034c() {
    }

    /* renamed from: g */
    public final boolean mo9038g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo9039h() {
        return false;
    }

    /* renamed from: l */
    public final void mo8031l() {
    }

    /* renamed from: m */
    public final void mo8032m() {
    }

    /* renamed from: n */
    public final void mo8033n() {
    }

    /* renamed from: j */
    public final void mo8029j() {
        if (!this.f8074j) {
            m10354q();
        }
    }

    /* renamed from: q */
    private void m10354q() {
        this.f8071g.setVisibility(0);
        this.f8070f.setVisibility(0);
    }

    /* renamed from: r */
    private void m10355r() {
        this.f8071g.setVisibility(8);
        this.f8070f.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo9036e() {
        this.f8071g.postDelayed(new C2490c(this), 2000);
    }

    /* renamed from: k */
    public final void mo8030k() {
        m10355r();
        this.f8065b.mo8983c(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo9063p() {
        if (this.f8065b.mo8989l() && !this.f8074j) {
            mo9062o();
        }
    }

    /* renamed from: s */
    private void m10356s() {
        if (this.f8073i == null) {
            this.f8073i = new C2522a(this.f8066c);
        }
        if (!this.f8073i.isShowing()) {
            this.f8073i.show();
        }
    }

    /* renamed from: f */
    public final void mo9037f() {
        this.f8074j = true;
        m10355r();
        if (this.f8072h != null && this.f8072h.isShowing()) {
            this.f8072h.dismiss();
        }
    }

    /* renamed from: d */
    public final void mo9035d() {
        super.mo9035d();
        if (this.f8072h != null && this.f8072h.isShowing()) {
            this.f8072h.dismiss();
        }
        this.f8072h = null;
        if (this.f8069e != null) {
            this.f8069e.stop(true);
        }
    }

    /* renamed from: o */
    public final void mo9062o() {
        if (this.f8072h == null) {
            this.f8072h = new C2532g(this.f8066c, this.f8064a.getStreamUrl().mo23050a(), this.f8064a);
        }
        if (!this.f8072h.isShowing()) {
            this.f8072h.show();
        }
    }

    /* renamed from: a */
    public final void mo9029a() {
        super.mo9029a();
        this.f8071g = this.f8066c.findViewById(R.id.k5);
        this.f8070f = this.f8066c.findViewById(R.id.cl2);
        m10354q();
        this.f8075k = (TextureView) this.f8066c.findViewById(R.id.ebx);
        this.f8069e = ((C3450b) C3596c.m13172a(C3450b.class)).createRoomPlayer(this.f8064a.getMultiStreamData(), this.f8064a.getMultiStreamDefaultQualitySdkKey(), this.f8064a.getStreamType(), this.f8064a.getStreamSrConfig(), this.f8075k, (C2261a) this, (Context) this.f8066c);
        this.f8069e.setSeiOpen(!this.f8076l);
        this.f8069e.startWithNewLivePlayer();
        this.f8074j = false;
        C5747j.m18104b().mo14165a(ToolbarButton.PUSH_URL, (C5739a) new C2489a());
    }

    public final void onEvent(C4452v vVar) {
        if (vVar.f12912a == 27) {
            m10356s();
        }
    }

    public C2487b(Room room, C2501m mVar) {
        boolean z;
        super(room, mVar);
        if (room.getOwnerUserId() == ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) {
            z = true;
        } else {
            z = false;
        }
        this.f8076l = z;
    }

    /* renamed from: a */
    public final void mo8025a(int i, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f8075k.getLayoutParams();
        if (i > i2) {
            marginLayoutParams.width = C9738o.m28691a((Context) this.f8066c);
            marginLayoutParams.height = (marginLayoutParams.width * i2) / i;
            marginLayoutParams.topMargin = (int) C9738o.m28708b((Context) this.f8066c, 96.0f);
            this.f8075k.setLayoutParams(marginLayoutParams);
            this.f8065b.mo8977a(i, i2);
        }
    }
}
