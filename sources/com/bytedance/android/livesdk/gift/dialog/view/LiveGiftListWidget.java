package com.bytedance.android.livesdk.gift.dialog.view;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.p220ui.RtlViewPagerShower;
import com.bytedance.android.livesdk.chatroom.p220ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.gift.dialog.C7897b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7939b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.model.p390a.C8141h;
import com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class LiveGiftListWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    public int f21371a;

    /* renamed from: b */
    private final GiftViewModel f21372b;

    /* renamed from: c */
    private final List<C8135b> f21373c = new ArrayList();

    /* renamed from: d */
    private RecyclerView f21374d;

    /* renamed from: e */
    private LiveGiftDialogAdapter f21375e;

    /* renamed from: f */
    private RtlViewPagerShower f21376f;

    /* renamed from: g */
    private View f21377g;

    /* renamed from: h */
    private int f21378h;

    /* renamed from: i */
    private int f21379i;

    /* renamed from: j */
    private long f21380j;

    /* renamed from: k */
    private int f21381k = -1;

    /* renamed from: com.bytedance.android.livesdk.gift.dialog.view.LiveGiftListWidget$a */
    class C7909a extends SSGridLayoutManager {

        /* renamed from: K */
        public boolean f21384K = true;

        /* renamed from: e */
        public final boolean mo5438e() {
            if (!super.mo5438e() || !this.f21384K) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo5441f() {
            if (!super.mo5441f() || !this.f21384K) {
                return false;
            }
            return true;
        }

        public C7909a(Context context, int i, int i2, boolean z) {
            super(context, 2, 0, false);
        }
    }

    public int getLayoutId() {
        return R.layout.alk;
    }

    public void onUnload() {
        this.f21372b.mo20783a((C0043i) this);
    }

    /* renamed from: a */
    private void m24251a() {
        C79071 r0 = new GridPagerSnapHelper() {
            /* renamed from: a */
            public final View mo20745a(C1273i iVar) {
                View a = super.mo20745a(iVar);
                if (a == null) {
                    return null;
                }
                LiveGiftListWidget.this.f21371a = C1273i.m6060c(a);
                LiveGiftListWidget.this.mo20742a(LiveGiftListWidget.this.f21371a);
                return a;
            }

            /* renamed from: a */
            public final int mo20744a(C1273i iVar, int i, int i2) {
                LiveGiftListWidget.this.f21371a = super.mo20744a(iVar, i, i2);
                LiveGiftListWidget.this.mo20742a(LiveGiftListWidget.this.f21371a);
                return LiveGiftListWidget.this.f21371a;
            }
        };
        r0.mo22743a(2).mo22746b(4);
        r0.mo22748a(this.f21374d);
        this.f21374d.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    LiveGiftListWidget.this.mo20742a(LiveGiftListWidget.this.f21371a);
                    super.onScrollStateChanged(recyclerView, i);
                }
            }
        });
    }

    public LiveGiftListWidget(GiftViewModel giftViewModel) {
        this.f21372b = giftViewModel;
    }

    public void onInit(Object[] objArr) {
        this.f21374d = (RecyclerView) findViewById(R.id.bn1);
        this.f21376f = (RtlViewPagerShower) findViewById(R.id.c_0);
        this.f21377g = findViewById(R.id.c4k);
    }

    /* renamed from: a */
    private C1293v m24250a(C8135b bVar) {
        if (this.f21374d == null || this.f21375e == null || bVar == null) {
            return null;
        }
        C8135b a = this.f21375e.mo20732a(bVar.mo21275p());
        if (a == null) {
            return null;
        }
        return this.f21374d.mo5575f(this.f21375e.mo20731a(a));
    }

    /* renamed from: a */
    private void m24252a(List<? extends C8135b> list) {
        if (list != null) {
            this.f21375e.mo20735b();
            this.f21375e.mo20733a();
            this.f21375e.mo20734a(list);
            this.f21375e.notifyDataSetChanged();
            this.f21373c.clear();
            this.f21373c.addAll(list);
            int i = 8;
            if (!C6311g.m19573a(list)) {
                this.f21378h = 0;
                this.f21376f.setVisibility(0);
                this.f21379i = ((list.size() - 1) / 8) + 1;
                this.f21376f.mo13411a(this.f21379i, this.f21378h);
                this.f21377g.setVisibility(8);
                this.f21374d.setVisibility(0);
                RtlViewPagerShower rtlViewPagerShower = this.f21376f;
                if (this.f21379i > 1) {
                    i = 0;
                }
                rtlViewPagerShower.setVisibility(i);
                return;
            }
            this.f21377g.setVisibility(0);
            this.f21374d.setVisibility(8);
            this.f21376f.setVisibility(8);
        }
    }

    /* renamed from: b */
    private void m24253b(int i) {
        C7897b.m24199a((Room) this.dataCenter.get("data_room", null), i, this.f21381k);
        if (this.f21381k == 5) {
            int i2 = (i - 1) * 8;
            int i3 = i2 + 7;
            while (i2 <= i3 && i2 >= 0 && i2 < this.f21373c.size()) {
                C8135b bVar = (C8135b) this.f21373c.get(i2);
                if ((bVar instanceof C8141h) && (bVar.f22206d instanceof Prop)) {
                    Prop prop = (Prop) bVar.f22206d;
                    if (prop.propType == 4) {
                        C7897b.m24196a(prop.count);
                        return;
                    }
                }
                i2++;
            }
        }
    }

    public void onLoad(Object[] objArr) {
        this.f21372b.mo20784a((C0043i) this, (C0053p<C7939b>) new C7919g<C7939b>(this));
        this.f21375e = new LiveGiftDialogAdapter(this.context, this.f21372b);
        this.f21374d.setAdapter(this.f21375e);
        RecyclerView recyclerView = this.f21374d;
        C7909a aVar = new C7909a(this.context, 2, 0, false);
        recyclerView.setLayoutManager(aVar);
        this.f21374d.setHasFixedSize(true);
        this.f21374d.setItemViewCacheSize(16);
        m24251a();
        this.f21376f.setMargin(0);
        this.f21376f.mo13412a(this.context.getResources().getDrawable(R.drawable.bqc), this.context.getResources().getDrawable(R.drawable.bqd));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20743a(com.bytedance.android.livesdk.gift.dialog.viewmodel.C7939b r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r7.f21493a
            switch(r0) {
                case 1: goto L_0x005a;
                case 2: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x007a
        L_0x000a:
            com.bytedance.android.livesdk.gift.model.a.b r0 = r7.f21494b
            if (r0 == 0) goto L_0x007a
            long r1 = r0.mo21275p()
            long r3 = r6.f21380j
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x004e
            android.support.v7.widget.RecyclerView$v r1 = r6.m24250a(r0)
            boolean r2 = r1 instanceof com.bytedance.android.livesdk.gift.dialog.view.LiveGiftViewHolder
            if (r2 == 0) goto L_0x004d
            T r2 = r0.f22206d
            boolean r2 = r2 instanceof com.bytedance.android.livesdk.gift.model.C8149d
            r3 = 0
            if (r2 == 0) goto L_0x002f
            T r0 = r0.f22206d
            com.bytedance.android.livesdk.gift.model.d r0 = (com.bytedance.android.livesdk.gift.model.C8149d) r0
            int r0 = r0.f22235f
        L_0x002d:
            r3 = r0
            goto L_0x0040
        L_0x002f:
            T r2 = r0.f22206d
            boolean r2 = r2 instanceof com.bytedance.android.livesdk.gift.model.Prop
            if (r2 == 0) goto L_0x0040
            T r0 = r0.f22206d
            com.bytedance.android.livesdk.gift.model.Prop r0 = (com.bytedance.android.livesdk.gift.model.Prop) r0
            com.bytedance.android.livesdk.gift.model.d r0 = r0.gift
            if (r0 == 0) goto L_0x0040
            int r0 = r0.f22235f
            goto L_0x002d
        L_0x0040:
            int r7 = r7.mo20809d()
            int r3 = r3 * r7
            if (r3 <= 0) goto L_0x004d
            com.bytedance.android.livesdk.gift.dialog.view.LiveGiftViewHolder r1 = (com.bytedance.android.livesdk.gift.dialog.view.LiveGiftViewHolder) r1
            r1.mo20747a(r3)
        L_0x004d:
            return
        L_0x004e:
            com.bytedance.android.livesdk.gift.dialog.view.LiveGiftDialogAdapter r7 = r6.f21375e
            r7.notifyDataSetChanged()
            long r0 = r0.mo21275p()
            r6.f21380j = r0
            goto L_0x007a
        L_0x005a:
            java.util.List r0 = r7.mo20805b()
            r6.m24252a(r0)
            com.bytedance.android.livesdk.gift.model.GiftPage r7 = r7.mo20807c()
            r0 = 1
            if (r7 == 0) goto L_0x006b
            int r7 = r7.pageType
            goto L_0x006c
        L_0x006b:
            r7 = 1
        L_0x006c:
            int r1 = r6.f21381k
            if (r7 == r1) goto L_0x007a
            r1 = 0
            r6.f21380j = r1
            r6.f21381k = r7
            r6.m24253b(r0)
            return
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.view.LiveGiftListWidget.mo20743a(com.bytedance.android.livesdk.gift.dialog.viewmodel.b):void");
    }

    /* renamed from: a */
    public final void mo20742a(int i) {
        int i2 = i / 8;
        if (i2 >= 0 && i2 < this.f21379i) {
            if (i2 != this.f21378h) {
                m24253b(i2 + 1);
            }
            this.f21378h = i2;
            this.f21376f.mo13410a(this.f21378h);
        }
    }
}
