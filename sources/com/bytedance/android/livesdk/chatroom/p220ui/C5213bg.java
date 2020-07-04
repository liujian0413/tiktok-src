package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3389i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4669ew;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4669ew.C4673a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.C9239c;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bg */
public final class C5213bg extends C9239c implements C4673a {

    /* renamed from: a */
    private TextView f15302a;

    /* renamed from: c */
    private TextView f15303c;

    /* renamed from: d */
    private RecyclerView f15304d;

    /* renamed from: e */
    private View f15305e;

    /* renamed from: f */
    private C9245h f15306f;

    /* renamed from: g */
    private LinkInRoomVideoListAdapter f15307g;

    /* renamed from: h */
    private C4669ew f15308h;

    /* renamed from: i */
    private Room f15309i;

    /* renamed from: a */
    public final int mo9100a() {
        return R.layout.anz;
    }

    /* renamed from: b */
    public final void mo12610b() {
        m16875f();
        dismiss();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15308h.f13357c = null;
    }

    /* renamed from: f */
    private void m16875f() {
        if (this.f15306f != null && this.f15306f.isShowing()) {
            this.f15306f.dismiss();
        }
    }

    /* renamed from: e */
    private void m16874e() {
        if (this.f15306f == null) {
            this.f15306f = new C9249a(getContext(), 2).mo22716a(false).mo22720b();
        }
        if (!this.f15306f.isShowing()) {
            this.f15306f.show();
        }
    }

    /* renamed from: d */
    private void m16873d() {
        if (this.f25336b) {
            int intValue = ((Integer) C3913e.m13800a().f11699b).intValue();
            if (2 == intValue) {
                C9249a aVar = new C9249a(getContext(), 0);
                aVar.mo22710a((int) R.string.cvv).mo22718b((int) R.string.cwp);
                aVar.mo22722b(0, (int) R.string.cvu, (OnClickListener) new C5215bi(this)).mo22722b(1, (int) R.string.ecm, C5216bj.f15312a).mo22729d();
            } else if (1 == intValue) {
                C9249a aVar2 = new C9249a(getContext(), 0);
                aVar2.mo22710a((int) R.string.cwo).mo22718b((int) R.string.cwp);
                aVar2.mo22722b(0, (int) R.string.ecm, (OnClickListener) new C5217bk(this)).mo22722b(1, (int) R.string.cwr, C5218bl.f15314a).mo22729d();
            } else {
                dismiss();
                this.f15308h.mo12593d();
            }
        }
    }

    /* renamed from: c */
    public final void mo12612c() {
        m16875f();
        this.f15302a.setTextColor(getContext().getResources().getColor(R.color.ag7));
        this.f15302a.setText(C3358ac.m12515a((int) R.string.cvm));
        this.f15302a.setBackgroundResource(R.drawable.brk);
        this.f15307g.mo13228b(TTLiveSDKContext.getHostService().mo22367h().mo22179b());
        if (this.f15307g.getItemCount() > 0) {
            this.f15305e.setVisibility(8);
            this.f15304d.setVisibility(0);
        } else {
            this.f15305e.setVisibility(0);
            this.f15304d.setVisibility(8);
        }
        this.f15303c.setText(C3389i.m12608a(R.string.cw5, Integer.valueOf(this.f15307g.getItemCount())));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13478a(View view) {
        m16873d();
    }

    /* renamed from: b */
    public final void mo12611b(Throwable th) {
        m16875f();
        C9076n.m27096a(getContext(), th, (int) R.string.ewg);
    }

    /* renamed from: a */
    public final void mo12609a(Throwable th) {
        m16875f();
        C9076n.m27096a(getContext(), th, (int) R.string.ewk);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        super.onCreate(bundle);
        this.f15304d = (RecyclerView) findViewById(R.id.cqp);
        this.f15304d.mo5525a((C1272h) new InteractListItemDecoration());
        this.f15304d.setLayoutManager(new SSLinearLayoutManager(getContext(), 0, false));
        this.f15304d.setAdapter(this.f15307g);
        this.f15303c = (TextView) findViewById(R.id.title);
        this.f15303c.setText(C3389i.m12608a(R.string.cw5, Integer.valueOf(this.f15307g.getItemCount())));
        this.f15302a = (TextView) findViewById(R.id.aa);
        int intValue = ((Integer) C3913e.m13800a().f11699b).intValue();
        this.f15307g.mo13227b();
        int i4 = R.string.cwt;
        switch (intValue) {
            case 1:
                i4 = R.string.cvn;
                break;
            case 2:
                i4 = R.string.cvu;
                break;
        }
        this.f15302a.setText(i4);
        TextView textView = this.f15302a;
        if (intValue != 0) {
            i = C3358ac.m12521b((int) R.color.aqh);
        } else {
            i = C3358ac.m12521b((int) R.color.aqg);
        }
        textView.setTextColor(i);
        TextView textView2 = this.f15302a;
        if (intValue != 0) {
            i2 = R.drawable.brl;
        } else {
            i2 = R.drawable.brk;
        }
        textView2.setBackgroundResource(i2);
        TextView textView3 = this.f15302a;
        if (intValue != 0) {
            i3 = R.color.aoc;
        } else {
            i3 = R.color.az3;
        }
        textView3.setTextColor(C3358ac.m12521b(i3));
        this.f15302a.setOnClickListener(new C5214bh(this));
        this.f15305e = findViewById(R.id.ae7);
        if (this.f15307g.getItemCount() > 0) {
            this.f15305e.setVisibility(8);
            this.f15304d.setVisibility(0);
            return;
        }
        this.f15305e.setVisibility(0);
        this.f15304d.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo13480d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f15308h.mo12603k();
        m16874e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13479b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f15308h.mo12604l();
        m16874e();
        C9036ae.m26994a(this.f15309i, "shutdown_connection", "guest_cancel", false);
    }

    public C5213bg(Context context, Room room, List<C4854e> list, C4669ew ewVar) {
        super(context);
        this.f15309i = room;
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
        this.f15307g = new LinkInRoomVideoListAdapter(null, list, 1);
        this.f15308h = ewVar;
        this.f15308h.f13357c = this;
    }
}
