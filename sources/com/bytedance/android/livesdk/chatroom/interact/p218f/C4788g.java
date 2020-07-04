package com.bytedance.android.livesdk.chatroom.interact.p218f;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3389i;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.interact.C4483ai;
import com.bytedance.android.livesdk.chatroom.interact.C4488an;
import com.bytedance.android.livesdk.chatroom.interact.C4488an.C4489a;
import com.bytedance.android.livesdk.chatroom.interact.C4811i;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a;
import com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a.C4765a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4855f;
import com.bytedance.android.livesdk.chatroom.utils.C5340c;
import com.bytedance.android.livesdk.chatroom.widget.C5802f;
import com.bytedance.android.livesdk.chatroom.widget.C5802f.C5807a;
import com.bytedance.android.livesdk.p410o.C8735f;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.C8844h;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.LiveInteractFunction;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.avframework.livestreamv2.interact.controller.SEIHelper;
import com.p280ss.avframework.livestreamv2.interact.controller.SEIHelper.Callback;
import com.p280ss.avframework.livestreamv2.interact.model.Region;
import com.p280ss.avframework.livestreamv2.interact.model.SEI;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p346io.reactivex.C7498y;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.f.g */
public final class C4788g implements C4489a, C4765a, C5807a, Callback {

    /* renamed from: a */
    public Context f13570a;

    /* renamed from: b */
    public Room f13571b;

    /* renamed from: c */
    public boolean f13572c;

    /* renamed from: d */
    public SEI f13573d;

    /* renamed from: e */
    public DataCenter f13574e;

    /* renamed from: f */
    private FrameLayout f13575f;

    /* renamed from: g */
    private FrameLayout f13576g;

    /* renamed from: h */
    private TextView f13577h;

    /* renamed from: i */
    private List<C5802f> f13578i = new ArrayList();

    /* renamed from: j */
    private C5802f f13579j;

    /* renamed from: k */
    private C4764a f13580k;

    /* renamed from: l */
    private C8844h f13581l;

    /* renamed from: m */
    private int f13582m;

    /* renamed from: n */
    private int f13583n;

    /* renamed from: o */
    private int f13584o;

    /* renamed from: p */
    private int f13585p;

    /* renamed from: q */
    private int f13586q;

    /* renamed from: r */
    private C4488an f13587r;

    /* renamed from: s */
    private SEIHelper f13588s;

    /* renamed from: t */
    private boolean f13589t;

    /* renamed from: u */
    private boolean f13590u = true;

    /* renamed from: v */
    private OnLayoutChangeListener f13591v = new OnLayoutChangeListener() {
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 != i8 && C4788g.this.f13573d != null) {
                C4788g.this.onSeiUpdated(C4788g.this.f13573d);
            }
        }
    };

    /* renamed from: w */
    private OnClickListener f13592w = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            C4788g.this.mo12730b();
            if (C4788g.this.mo12729a()) {
                if (C4788g.this.f13574e != null) {
                    C4788g.this.f13574e.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(0));
                }
                Room room = C4788g.this.f13571b;
                String str2 = "click_connection_banner";
                if (C4788g.this.f13572c) {
                    str = "anchor_connection";
                } else {
                    str = "guest_connection";
                }
                C9036ae.m26994a(room, str2, str, C4788g.this.f13572c);
            }
        }
    };

    /* renamed from: x */
    private OnClickListener f13593x = new OnClickListener() {
        public final void onClick(View view) {
            C4788g.this.mo12730b();
            if (C4788g.this.mo12729a()) {
                C9036ae.m26994a(C4788g.this.f13571b, "click_connection_banner", "guest_connection", false);
                if (!C4788g.this.f13572c && ((Integer) C3913e.m13800a().f11699b).intValue() == 0 && C5340c.m17020c(C4788g.this.f13570a)) {
                    C8735f.m26105a((Activity) C4788g.this.f13570a).mo21743a(new C8721d() {
                        /* renamed from: b */
                        public final void mo9568b(String... strArr) {
                            C3517a.m12960a(C4788g.this.f13570a, (int) R.string.exa);
                        }

                        /* renamed from: a */
                        public final void mo9567a(String... strArr) {
                            if (C4788g.this.f13574e != null) {
                                C4788g.this.f13574e.lambda$put$1$DataCenter("cmd_interact_state_change", new C4450t(1));
                            }
                        }
                    }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
                }
            }
        }
    };

    /* renamed from: a */
    public final void mo12182a(long j, int i, boolean z) {
    }

    /* renamed from: a */
    public final void mo12183a(long j, long j2) {
    }

    /* renamed from: b */
    public final void mo12186b(List<C4854e> list) {
    }

    public final void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
    }

    /* renamed from: a */
    public final boolean mo12729a() {
        if (!this.f13572c) {
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.f13570a, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.ev9)).mo22192c("interact").mo22188a(0).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
                return false;
            } else if (TTLiveSDKContext.getHostService().mo22367h().mo22178a(LiveInteractFunction.INTERACT)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private void m15711f() {
        for (C5802f removeView : this.f13578i) {
            this.f13575f.removeView(removeView);
        }
        this.f13578i.clear();
    }

    /* renamed from: e */
    private void m15710e() {
        int size = this.f13578i.size();
        for (int i = 0; i < size; i++) {
            C5802f fVar = (C5802f) this.f13578i.get(i);
            LayoutParams layoutParams = (LayoutParams) fVar.getLayoutParams();
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = ((this.f13584o + this.f13583n) * i) + this.f13585p;
            layoutParams.rightMargin = this.f13586q;
            layoutParams.width = this.f13582m;
            layoutParams.height = this.f13583n;
            fVar.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    public final void mo12732c() {
        this.f13589t = false;
        this.f13575f.removeOnLayoutChangeListener(this.f13591v);
        if (this.f13581l != null && this.f13581l.isShowing()) {
            this.f13581l.dismiss();
        }
        this.f13587r.mo12253b();
        this.f13575f.removeAllViews();
        C9097a.m27146a().mo22267a((Object) new C4483ai(false));
        this.f13574e.lambda$put$1$DataCenter("cmd_interact_player_view_change", new C4483ai(false));
    }

    /* renamed from: b */
    public final void mo12730b() {
        if (!this.f13572c) {
            C4811i.m15843b("connection_request");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12733d() {
        int i;
        int size = this.f13578i.size();
        float f = 2.14748365E9f;
        for (int i2 = 0; i2 < size; i2++) {
            C5802f fVar = (C5802f) this.f13578i.get(i2);
            if (fVar != null && fVar.getY() < f) {
                f = fVar.getY();
            }
        }
        if (2.14748365E9f == f || f < 10.0f) {
            i = this.f13585p;
        } else {
            i = (int) (((this.f13575f.getY() + ((float) this.f13575f.getHeight())) - f) + ((float) this.f13584o));
        }
        LayoutParams layoutParams = (LayoutParams) this.f13577h.getLayoutParams();
        layoutParams.bottomMargin = i;
        this.f13577h.setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    private void m15712g() {
        if (!C5340c.m17018a(this.f13570a)) {
            this.f13577h.setVisibility(4);
            return;
        }
        int d = this.f13580k.mo12699d();
        if (this.f13572c) {
            this.f13577h.setText(C3389i.m12608a(R.string.cw5, Integer.valueOf(d)));
            this.f13577h.setOnClickListener(this.f13592w);
            this.f13577h.setVisibility(0);
        } else {
            int intValue = ((Integer) C3913e.m13800a().f11699b).intValue();
            if (intValue == 0) {
                this.f13577h.setText(R.string.cvm);
                this.f13577h.setOnClickListener(this.f13593x);
                this.f13577h.setVisibility(0);
            } else if (intValue != 2) {
                this.f13577h.setText(C3389i.m12608a(R.string.cw5, Integer.valueOf(d)));
                this.f13577h.setOnClickListener(this.f13592w);
                this.f13577h.setVisibility(0);
            } else {
                this.f13577h.setText(R.string.etx);
                this.f13577h.setOnClickListener(this.f13593x);
                this.f13577h.setVisibility(8);
            }
        }
        this.f13575f.post(new C4793h(this));
    }

    /* renamed from: a */
    public final void mo12254a(int i) {
        m15712g();
    }

    /* renamed from: b */
    private void m15709b(C5802f fVar) {
        this.f13575f.addView(fVar);
        this.f13578i.add(fVar);
    }

    public final boolean isVersionSupported(int i) {
        if (!this.f13590u || i != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo12726a(C5802f fVar) {
        if (fVar == this.f13579j) {
            this.f13579j = null;
        }
        this.f13575f.removeView(fVar);
        this.f13578i.remove(fVar);
        m15710e();
        m15712g();
    }

    /* renamed from: a */
    public final void mo12727a(String str) {
        if (this.f13590u && this.f13589t) {
            this.f13588s.updateSei(str);
        }
    }

    public final void onSeiUpdated(SEI sei) {
        if (this.f13590u && this.f13589t) {
            this.f13573d = sei;
            m15711f();
            List<Region> gridList = sei.getGridList();
            if (gridList == null || gridList.size() <= 0) {
                m15712g();
                return;
            }
            int width = this.f13575f.getWidth();
            int height = this.f13575f.getHeight();
            int width2 = sei.getWidth();
            int height2 = sei.getHeight();
            long id = this.f13571b.getOwner().getId();
            for (Region region : gridList) {
                if (!(region == null || region.getUserId() == id)) {
                    C5802f b = m15708b(region.getUserId(), 0, false);
                    if (b != null) {
                        b.setLayoutParams(SEIHelper.getSeiLayoutParams(width, height, width2, height2, region));
                        b.getPresenter().mo12352a(region.getStatus());
                        m15709b(b);
                    }
                }
            }
            m15712g();
        }
    }

    /* renamed from: b */
    public final void mo12731b(boolean z) {
        this.f13590u = z;
        m15711f();
        if (this.f13576g != null) {
            this.f13576g.removeAllViews();
        }
    }

    /* renamed from: a */
    public final void mo12184a(List<C4854e> list) {
        if (!this.f13590u) {
            ArrayList arrayList = new ArrayList();
            for (C4854e eVar : list) {
                Iterator it = this.f13578i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5802f fVar = (C5802f) it.next();
                    if (eVar.f13870c == fVar.getPresenter().mo12357d()) {
                        arrayList.add(fVar);
                        this.f13578i.remove(fVar);
                        break;
                    }
                }
            }
            arrayList.addAll(this.f13578i);
            this.f13578i = arrayList;
            m15710e();
            m15712g();
        }
    }

    /* renamed from: a */
    public final void mo12728a(boolean z) {
        C9097a.m27146a().mo22267a((Object) new C4483ai(true));
        this.f13574e.lambda$put$1$DataCenter("cmd_interact_player_view_change", new C4483ai(true));
        this.f13590u = z;
        this.f13589t = true;
        this.f13577h = (TextView) LayoutInflater.from(this.f13575f.getContext()).inflate(R.layout.ax2, this.f13575f, false);
        this.f13577h.setVisibility(4);
        this.f13575f.addView(this.f13577h);
        this.f13580k.mo12689a((C4765a) this);
        this.f13587r.mo12251a();
        C4811i.m15841a("connection_request");
        m15712g();
        this.f13575f.addOnLayoutChangeListener(this.f13591v);
    }

    /* renamed from: b */
    private C5802f m15707b(long j, int i) {
        for (C5802f fVar : this.f13578i) {
            if (j > 0 && fVar.getPresenter().mo12356c() == j) {
                return fVar;
            }
            if (i > 0 && fVar.getPresenter().mo12357d() == i) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo12725a(int i, SurfaceView surfaceView) {
        if (!this.f13590u && this.f13589t) {
            boolean z = false;
            if (i == C3912d.m13795a().f11709d) {
                surfaceView.setLayoutParams(new LayoutParams(-1, -1));
                this.f13576g.removeAllViews();
                this.f13576g.addView(surfaceView);
                this.f13576g.setVisibility(0);
                return;
            }
            C5802f b = m15707b(0, i);
            if (b != null) {
                mo12726a(b);
                z = true;
            }
            C5802f b2 = m15708b(0, i, true);
            if (b2 != null) {
                if (this.f13572c && !z) {
                    b2.mo14307a();
                } else if (!this.f13572c && i == C3912d.m13795a().f11713h) {
                    if (!z) {
                        b2.mo14307a();
                    }
                    this.f13579j = b2;
                }
                if (surfaceView != null) {
                    surfaceView.setLayoutParams(new LayoutParams(this.f13582m, this.f13583n));
                    surfaceView.setZOrderMediaOverlay(true);
                    b2.mo14309a(surfaceView);
                }
                m15709b(b2);
                mo12184a(this.f13580k.f13511a);
            }
        }
    }

    /* renamed from: a */
    public final void mo12181a(long j, int i) {
        if (!this.f13590u && this.f13589t) {
            C5802f b = m15707b(j, i);
            if (b != null) {
                b.mo14310b();
                long id = this.f13571b.getOwner().getId();
                if (!(b.getPresenter() == null || b.getPresenter().mo12359g() == null || b.getPresenter().mo12356c() == id || TTLiveSDKContext.getHostService().mo22367h().mo22179b() == this.f13571b.getOwnerUserId())) {
                    C4854e g = b.getPresenter().mo12359g();
                    C3517a.m12962a(this.f13570a, this.f13570a.getString(R.string.ev0, new Object[]{g.f13871d.getNickName()}));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12185a(List<C4855f> list, long j) {
        if (this.f13589t) {
            if (this.f13581l != null && this.f13581l.isShowing()) {
                this.f13581l.dismiss();
            }
            this.f13581l = new C8844h(this.f13570a, list);
            this.f13581l.f24044a = j;
            this.f13581l.show();
        }
    }

    /* renamed from: b */
    private C5802f m15708b(long j, int i, boolean z) {
        if (j <= 0 && i <= 0) {
            return null;
        }
        C5802f fVar = new C5802f(this.f13570a, this.f13587r.mo12252b(j, i), this, this.f13574e);
        fVar.f17115d = !z;
        return fVar;
    }

    public C4788g(Room room, boolean z, FrameLayout frameLayout, FrameLayout frameLayout2, C4764a aVar) {
        this.f13570a = frameLayout2.getContext();
        this.f13571b = room;
        this.f13572c = z;
        this.f13575f = frameLayout2;
        this.f13576g = frameLayout;
        this.f13580k = aVar;
        this.f13588s = new SEIHelper(this);
        this.f13587r = new C4488an(room, aVar, this);
        Resources resources = this.f13570a.getResources();
        this.f13582m = resources.getDimensionPixelSize(R.dimen.qv);
        this.f13583n = resources.getDimensionPixelSize(R.dimen.qu);
        this.f13584o = (int) C9738o.m28708b(this.f13570a, 4.0f);
        this.f13585p = (int) C9738o.m28708b(this.f13570a, 52.0f);
        this.f13586q = (int) C9738o.m28708b(this.f13570a, 12.0f);
    }
}
