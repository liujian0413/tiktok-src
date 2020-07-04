package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4527a;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4527a.C4528a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.common.C5857c;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.az */
public final class C5203az extends C5857c implements OnClickListener, C4528a {

    /* renamed from: a */
    public C4854e f15271a;

    /* renamed from: b */
    public C4527a f15272b;

    /* renamed from: c */
    private DataCenter f15273c;

    /* renamed from: d */
    private Room f15274d = ((Room) this.f15273c.get("data_room"));

    /* renamed from: e */
    private Context f15275e;

    /* renamed from: g */
    private C9245h f15276g;

    /* renamed from: h */
    private TextView f15277h;

    /* renamed from: i */
    private TextView f15278i;

    /* renamed from: j */
    private TextView f15279j;

    /* renamed from: k */
    private TextView f15280k;

    /* renamed from: l */
    private TextView f15281l;

    /* renamed from: m */
    private TextView f15282m;

    /* renamed from: a */
    public final void mo12379a() {
        m16843i();
        dismiss();
    }

    /* renamed from: b */
    public final void mo12381b() {
        m16843i();
        dismiss();
    }

    /* renamed from: c */
    public final void mo12383c() {
        m16843i();
        dismiss();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15272b.mo9142a(this);
    }

    public final void onDetachedFromWindow() {
        this.f15272b.mo8963a();
        super.onDetachedFromWindow();
    }

    /* renamed from: e */
    private void m16839e() {
        mo13461a((int) R.string.f17);
        this.f15272b.mo12373b(this.f15271a.f13871d.getId());
    }

    /* renamed from: f */
    private void m16840f() {
        mo13461a((int) R.string.f14);
        this.f15272b.mo12368a(this.f15271a.f13871d.getId());
    }

    /* renamed from: g */
    private void m16841g() {
        dismiss();
        C9097a.m27146a().mo22267a((Object) new UserProfileEvent(this.f15271a.f13871d));
    }

    /* renamed from: i */
    private void m16843i() {
        if (this.f15276g != null && this.f15276g.isShowing()) {
            this.f15276g.dismiss();
        }
    }

    /* renamed from: j */
    private void m16844j() {
        dismiss();
        if (this.f15273c != null) {
            this.f15273c.lambda$put$1$DataCenter("cmd_send_gift", this.f15271a.f13871d);
        }
    }

    /* renamed from: h */
    private void m16842h() {
        new C9249a(this.f15275e).mo22718b((int) R.string.f0z).mo22716a(false).mo22722b(0, (int) R.string.edq, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C5203az.this.mo13461a((int) R.string.euy);
                C5203az.this.f15272b.mo12376c(C5203az.this.f15271a.f13871d.getId());
            }
        }).mo22722b(1, (int) R.string.ecm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo22729d();
    }

    /* renamed from: d */
    private void m16838d() {
        this.f15277h = (TextView) findViewById(R.id.d6s);
        this.f15278i = (TextView) findViewById(R.id.sz);
        this.f15279j = (TextView) findViewById(R.id.a9a);
        this.f15280k = (TextView) findViewById(R.id.d31);
        this.f15281l = (TextView) findViewById(R.id.d6k);
        this.f15282m = (TextView) findViewById(R.id.sp);
        this.f15277h.setOnClickListener(this);
        this.f15278i.setOnClickListener(this);
        this.f15279j.setOnClickListener(this);
        this.f15280k.setOnClickListener(this);
        this.f15281l.setOnClickListener(this);
        this.f15282m.setOnClickListener(this);
        if (this.f15271a.f13879l == 0) {
            this.f15277h.setVisibility(0);
            this.f15278i.setVisibility(8);
        } else if (this.f15271a.f13879l == 1) {
            this.f15277h.setVisibility(8);
            this.f15278i.setVisibility(8);
        } else {
            if (this.f15271a.f13879l == 2) {
                this.f15277h.setVisibility(8);
                this.f15278i.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo12380a(Throwable th) {
        m16843i();
        C9076n.m27096a(getContext(), th, (int) R.string.ev3);
    }

    /* renamed from: b */
    public final void mo12382b(Throwable th) {
        m16843i();
        C9076n.m27096a(getContext(), th, (int) R.string.ev5);
    }

    /* renamed from: c */
    public final void mo12384c(Throwable th) {
        m16843i();
        C9076n.m27096a(getContext(), th, (int) R.string.ev7);
    }

    /* renamed from: a */
    public final void mo13461a(int i) {
        if (this.f15276g == null) {
            this.f15276g = new C9249a(getContext(), 2).mo22718b(i).mo22716a(false).mo22720b();
        }
        if (!this.f15276g.isShowing()) {
            this.f15276g.show();
        }
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.d6s) {
            m16840f();
        } else if (id == R.id.sz) {
            m16839e();
        } else if (id == R.id.a9a) {
            m16842h();
        } else if (id == R.id.d31) {
            m16844j();
        } else if (id == R.id.d6k) {
            m16841g();
        } else {
            if (id == R.id.sp) {
                dismiss();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(R.layout.anx, null));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        m16838d();
    }

    public C5203az(Context context, DataCenter dataCenter, C4854e eVar, C4527a aVar) {
        super(context, true);
        this.f15273c = dataCenter;
        this.f15275e = context;
        this.f15271a = eVar;
        this.f15272b = aVar;
    }
}
