package com.bytedance.android.livesdk.chatroom.interact.p218f;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.app.dataholder.C3915g;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.event.C4451u;
import com.bytedance.android.livesdk.chatroom.interact.C4488an.C4489a;
import com.bytedance.android.livesdk.chatroom.interact.C4490ao;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioGuestAdapter;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioGuestAdapter.AudioGuestViewHolder;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioGuestAdapter.C4470a;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4527a;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a.C4765a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4855f;
import com.bytedance.android.livesdk.chatroom.p220ui.C5203az;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p410o.C8735f;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.C8844h;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.avframework.livestreamv2.interact.controller.SEIHelper;
import com.p280ss.avframework.livestreamv2.interact.controller.SEIHelper.Callback;
import com.p280ss.avframework.livestreamv2.interact.model.Region;
import com.p280ss.avframework.livestreamv2.interact.model.SEI;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p346io.reactivex.C7498y;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.f.a */
public final class C4778a implements C4470a, C4489a, C4765a, Callback {

    /* renamed from: a */
    public Context f13538a;

    /* renamed from: b */
    public Room f13539b;

    /* renamed from: c */
    public boolean f13540c;

    /* renamed from: d */
    public DataCenter f13541d;

    /* renamed from: e */
    private FrameLayout f13542e;

    /* renamed from: f */
    private View f13543f;

    /* renamed from: g */
    private ImageView f13544g;

    /* renamed from: h */
    private TextView f13545h;

    /* renamed from: i */
    private RecyclerView f13546i;

    /* renamed from: j */
    private LinkInRoomAudioGuestAdapter f13547j;

    /* renamed from: k */
    private C4764a f13548k;

    /* renamed from: l */
    private SEIHelper f13549l;

    /* renamed from: m */
    private boolean f13550m;

    /* renamed from: n */
    private C4490ao f13551n;

    /* renamed from: o */
    private C8844h f13552o;

    /* renamed from: p */
    private Map<String, Boolean> f13553p = new HashMap(9);

    /* renamed from: q */
    private C3915g<Integer> f13554q = new C4783b(this);

    /* renamed from: r */
    private OnClickListener f13555r = new OnClickListener() {
        public final void onClick(View view) {
            if (!C4778a.this.f13540c) {
                if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                    TTLiveSDKContext.getHostService().mo22367h().mo22167a(C4778a.this.f13538a, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.ev9)).mo22192c("interact").mo22188a(0).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
                    return;
                } else if (TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.INTERACT)) {
                    return;
                }
            }
            C4778a.this.f13541d.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(0));
            C9036ae.m26994a(C4778a.this.f13539b, "click_connection_banner", "guest_connection", C4778a.this.f13540c);
        }
    };

    /* renamed from: s */
    private OnClickListener f13556s = new OnClickListener() {
        public final void onClick(View view) {
            C4778a.this.mo12713d();
        }
    };

    /* renamed from: t */
    private OnClickListener f13557t = new OnClickListener() {
        public final void onClick(View view) {
            boolean z;
            int i;
            if (((Integer) C3913e.m13800a().f11699b).intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            C9249a a = new C9249a(C4778a.this.f13538a).mo22716a(false);
            if (z) {
                i = R.string.f11;
            } else {
                i = R.string.f12;
            }
            a.mo22718b(i).mo22722b(0, (int) R.string.edq, (DialogInterface.OnClickListener) new C4786e(this, z)).mo22722b(1, (int) R.string.ecm, C4787f.f13569a).mo22729d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo12719a(boolean z, DialogInterface dialogInterface, int i) {
            int i2;
            dialogInterface.dismiss();
            if (C4778a.this.f13541d != null) {
                DataCenter dataCenter = C4778a.this.f13541d;
                String str = "cmd_interact_state_change";
                if (z) {
                    i2 = 5;
                } else {
                    i2 = 9;
                }
                dataCenter.lambda$put$1$DataCenter(str, new C4450t(i2));
            }
            if (!z) {
                C9036ae.m26994a(C4778a.this.f13539b, "shutdown_connection", "guest_cancel", false);
            }
        }
    };

    /* renamed from: u */
    private C4527a f13558u;

    /* renamed from: v */
    private C5203az f13559v;

    /* renamed from: a */
    public final void mo12181a(long j, int i) {
    }

    /* renamed from: a */
    public final void mo12182a(long j, int i, boolean z) {
    }

    public final boolean isVersionSupported(int i) {
        return i == 3;
    }

    /* renamed from: a */
    public final void mo12184a(List<C4854e> list) {
        ArrayList arrayList = new ArrayList(8);
        if (list.size() > 0 && list.size() <= 9) {
            this.f13551n.mo12256b(((C4854e) list.get(0)).f13871d.getId(), ((C4854e) list.get(0)).f13879l != 0);
            for (int i = 0; i < 8; i++) {
                C4854e eVar = new C4854e();
                eVar.f13870c = -1;
                arrayList.add(eVar);
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((C4854e) list.get(i2)).f13878k > 0 && ((C4854e) list.get(i2)).f13878k < 9) {
                    arrayList.set(((C4854e) list.get(i2)).f13878k - 1, list.get(i2));
                }
            }
            this.f13547j.mo12226a((List<C4854e>) arrayList);
            this.f13547j.f13017a = list;
        }
    }

    /* renamed from: a */
    public final void mo12185a(List<C4855f> list, long j) {
        if (this.f13550m) {
            if (this.f13552o != null && this.f13552o.isShowing()) {
                this.f13552o.dismiss();
            }
            this.f13552o = new C8844h(this.f13538a, list);
            this.f13552o.f24044a = j;
            this.f13552o.show();
        }
    }

    /* renamed from: g */
    private void m15684g() {
        C8735f.m26105a((Activity) this.f13538a).mo21743a(new C8721d() {
            /* renamed from: a */
            public final void mo9567a(String... strArr) {
                C4778a.this.f13541d.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(1));
            }

            /* renamed from: b */
            public final void mo9568b(String... strArr) {
                C3517a.m12960a(C4778a.this.f13538a, (int) R.string.exa);
            }
        }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
    }

    /* renamed from: e */
    private void m15682e() {
        ArrayList arrayList = new ArrayList(8);
        for (int i = 0; i < 8; i++) {
            C4854e eVar = new C4854e();
            eVar.f13870c = -1;
            arrayList.add(eVar);
        }
        this.f13547j = new LinkInRoomAudioGuestAdapter(arrayList, this);
        this.f13546i.setAdapter(this.f13547j);
    }

    /* renamed from: b */
    public final void mo12710b() {
        this.f13550m = false;
        if (this.f13559v != null && this.f13559v.isShowing()) {
            this.f13559v.dismiss();
        }
        if (this.f13558u != null) {
            this.f13558u.mo8963a();
        }
        this.f13542e.removeAllViews();
        C4451u uVar = new C4451u(false);
        C9097a.m27146a().mo22267a((Object) uVar);
        this.f13541d.lambda$put$1$DataCenter("cmd_interact_audio", uVar);
        C3913e.m13800a().mo11453b(this.f13554q);
    }

    /* renamed from: f */
    private void m15683f() {
        String str;
        HashMap hashMap = new HashMap();
        if (this.f13539b != null) {
            String str2 = "room_type";
            if (this.f13539b.getStreamType() == LiveMode.AUDIO) {
                str = "radio";
            } else {
                str = "video";
            }
            hashMap.put(str2, str);
        }
        hashMap.put("audience_connection_type", "voice");
        C8443c.m25663a().mo21606a("audience_connection_apply", hashMap, new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("click"), C8438j.class, Room.class);
    }

    /* renamed from: a */
    public final void mo12707a() {
        C4451u uVar = new C4451u(true);
        C9097a.m27146a().mo22267a((Object) uVar);
        this.f13541d.lambda$put$1$DataCenter("cmd_interact_audio", uVar);
        this.f13550m = true;
        this.f13543f = LayoutInflater.from(this.f13542e.getContext()).inflate(R.layout.aym, this.f13542e, false);
        this.f13543f.setVisibility(4);
        this.f13544g = (ImageView) this.f13543f.findViewById(R.id.efh);
        this.f13545h = (TextView) this.f13543f.findViewById(R.id.efi);
        this.f13546i = (RecyclerView) LayoutInflater.from(this.f13542e.getContext()).inflate(R.layout.ayl, this.f13542e, false);
        this.f13546i.setLayoutManager(new GridLayoutManager(this.f13542e.getContext(), 4));
        m15682e();
        this.f13542e.addView(this.f13543f);
        LayoutParams layoutParams = new LayoutParams(-2, -2, 1);
        layoutParams.topMargin = C3358ac.m12526d(R.dimen.sd);
        this.f13542e.addView(this.f13546i, layoutParams);
        this.f13548k.mo12689a((C4765a) this);
        mo12712c();
        C3913e.m13800a().mo11451a(this.f13554q);
    }

    /* renamed from: c */
    public final void mo12712c() {
        String str;
        int d = this.f13548k.mo12699d();
        List<C4854e> list = this.f13548k.f13512b;
        if (this.f13540c) {
            if (d > 0) {
                str = C3358ac.m12517a((int) R.string.f1_, Integer.valueOf(d));
                C5343e.m17043b(this.f13544g, ((C4854e) list.get(d - 1)).f13871d.getAvatarThumb());
            } else {
                str = C3358ac.m12515a((int) R.string.f19);
                C5343e.m17029a(this.f13544g, (int) R.drawable.c2w);
            }
            this.f13545h.setText(str);
            this.f13543f.setOnClickListener(this.f13555r);
            this.f13543f.setVisibility(0);
        } else if (1 == ((Integer) C3913e.m13800a().f11699b).intValue()) {
            this.f13545h.setText(R.string.f0p);
            C5343e.m17029a(this.f13544g, (int) R.drawable.c3n);
            this.f13543f.setOnClickListener(this.f13557t);
            this.f13543f.setVisibility(0);
        } else if (2 == ((Integer) C3913e.m13800a().f11699b).intValue()) {
            this.f13545h.setText(R.string.f0y);
            C5343e.m17029a(this.f13544g, (int) R.drawable.c3o);
            this.f13543f.setOnClickListener(this.f13557t);
            this.f13543f.setVisibility(0);
        } else {
            this.f13545h.setText(R.string.cvm);
            C5343e.m17029a(this.f13544g, (int) R.drawable.c2w);
            this.f13543f.setOnClickListener(this.f13556s);
            this.f13543f.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo12713d() {
        if (!this.f13540c) {
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.f13538a, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.ev9)).mo22192c("interact").mo22188a(0).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
                return;
            } else if (TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.INTERACT)) {
                return;
            }
        }
        C9036ae.m26994a(this.f13539b, "click_connection_banner", "guest_connection", false);
        if (!this.f13540c && ((Integer) C3913e.m13800a().f11699b).intValue() == 0) {
            new C9249a(this.f13538a).mo22718b((int) R.string.f10).mo22722b(0, (int) R.string.edq, (DialogInterface.OnClickListener) new C4784c(this)).mo22722b(1, (int) R.string.ecm, C4785d.f13566a).mo22729d();
            m15683f();
        }
    }

    /* renamed from: b */
    public final void mo12186b(List<C4854e> list) {
        mo12712c();
    }

    /* renamed from: a */
    public final void mo12254a(int i) {
        mo12712c();
    }

    /* renamed from: b */
    public final void mo12235b(int i) {
        if (!this.f13540c) {
            mo12713d();
        }
    }

    public final void onSeiUpdated(SEI sei) {
        if (sei != null && sei.getGridList() != null && !sei.getGridList().isEmpty()) {
            List gridList = sei.getGridList();
            int size = gridList.size();
            String[] strArr = new String[size];
            boolean[] zArr = new boolean[size];
            for (int i = 0; i < size; i++) {
                Region region = (Region) gridList.get(i);
                strArr[i] = String.valueOf(region.getInteractId());
                zArr[i] = region.isTalking();
            }
            onTalkStateUpdated(strArr, zArr);
        }
    }

    /* renamed from: a */
    public final void mo12234a(C4854e eVar) {
        if (this.f13540c) {
            if (this.f13558u == null) {
                this.f13558u = new C4527a(this.f13539b, true, this.f13548k);
            }
            this.f13559v = new C5203az(this.f13538a, this.f13541d, eVar, this.f13558u);
            this.f13559v.show();
            return;
        }
        if (this.f13541d != null) {
            this.f13541d.lambda$put$1$DataCenter("cmd_send_gift", eVar.f13871d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12708a(Integer num) {
        mo12712c();
    }

    /* renamed from: a */
    public final void mo12709a(String str) {
        if (this.f13550m) {
            this.f13549l.updateSei(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12711b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m15684g();
    }

    /* renamed from: a */
    public final void mo12233a(int i, boolean z) {
        if (this.f13546i.mo5575f(i) instanceof AudioGuestViewHolder) {
            ((AudioGuestViewHolder) this.f13546i.mo5575f(i)).mo12230a(z);
        }
    }

    /* renamed from: a */
    public final void mo12183a(long j, long j2) {
        this.f13547j.mo12225a(j, j2);
    }

    public final void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
        for (int i = 0; i < strArr.length; i++) {
            this.f13553p.put(strArr[i], Boolean.valueOf(zArr[i]));
        }
        long a = (long) this.f13548k.mo12683a(this.f13539b.getOwner().getId());
        if (this.f13553p.containsKey(String.valueOf(a)) && this.f13551n != null) {
            this.f13551n.mo12255a(a, ((Boolean) this.f13553p.get(String.valueOf(a))).booleanValue());
        }
        this.f13547j.mo12227a(this.f13553p);
    }

    public C4778a(Room room, boolean z, FrameLayout frameLayout, C4764a aVar, Context context, C4490ao aoVar, DataCenter dataCenter) {
        this.f13538a = context;
        this.f13539b = room;
        this.f13540c = z;
        this.f13542e = frameLayout;
        this.f13548k = aVar;
        this.f13549l = new SEIHelper(this);
        this.f13551n = aoVar;
        this.f13541d = dataCenter;
    }
}
