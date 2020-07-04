package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.view.View;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.app.dataholder.C3915g;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7938a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7939b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.C7494t;
import p346io.reactivex.p348d.C7326g;

public class LiveGiftTopWidget extends LiveRecyclableWidget implements C3915g<KVData> {

    /* renamed from: a */
    private final GiftViewModel f21441a;

    /* renamed from: b */
    private View f21442b;

    /* renamed from: c */
    private View f21443c;

    /* renamed from: d */
    private LiveGiftGroupView f21444d;

    /* renamed from: e */
    private LiveNobleGiftView f21445e;

    /* renamed from: f */
    private LiveFirstChargeView f21446f;

    /* renamed from: g */
    private LiveTopDefaultView f21447g;

    /* renamed from: h */
    private boolean f21448h;

    /* renamed from: i */
    private View f21449i;

    public int getLayoutId() {
        return R.layout.all;
    }

    public void onUnload() {
        this.f21441a.mo20783a((C0043i) this);
    }

    public LiveGiftTopWidget(GiftViewModel giftViewModel) {
        this.f21441a = giftViewModel;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20768a(View view) {
        this.f21441a.mo20792a(new C7938a(1, null));
    }

    /* renamed from: b */
    private void m24298b(View view) {
        if (view != null) {
            if (this.f21449i != null) {
                this.f21449i.setVisibility(8);
            }
            this.f21449i = view;
            this.f21449i.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20770a(C8296e eVar) throws Exception {
        this.f21448h = false;
        if (this.f21446f.getVisibility() == 0) {
            Boolean.valueOf(true);
            m24298b((View) this.f21447g);
        }
    }

    public void onInit(Object[] objArr) {
        this.f21442b = findViewById(R.id.ar3);
        this.f21444d = (LiveGiftGroupView) findViewById(R.id.aqw);
        this.f21445e = (LiveNobleGiftView) findViewById(R.id.c4u);
        this.f21446f = (LiveFirstChargeView) findViewById(R.id.al8);
        this.f21447g = (LiveTopDefaultView) findViewById(R.id.a6w);
        this.f21443c = findViewById(R.id.xf);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo20769a(C7939b bVar) {
        if (bVar != null) {
            boolean c = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c();
            switch (bVar.f21493a) {
                case 1:
                    break;
                case 2:
                case 3:
                    if (this.f21444d.mo20765a(bVar)) {
                        m24298b((View) this.f21444d);
                        return;
                    }
                    break;
            }
            if (this.f21445e.mo20773a(bVar)) {
                m24298b((View) this.f21445e);
            } else if (this.f21448h) {
                m24298b((View) this.f21446f);
            } else {
                Boolean.valueOf(c);
            }
        }
    }

    /* renamed from: a */
    public final void mo9832a(KVData kVData) {
        if (kVData != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -1688481778 && key.equals("data_first_charge_in_room")) {
                c = 0;
            }
            if (c == 0) {
                kVData.getData();
                this.f21448h = false;
                if (this.f21446f.getVisibility() == 0) {
                    Boolean.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c());
                    m24298b((View) this.f21447g);
                }
            }
        }
    }

    public void onLoad(Object[] objArr) {
        this.f21444d.mo20764a(this.f21441a, (Room) this.dataCenter.get("data_room", null));
        this.f21447g.setViewModel(this.f21441a);
        this.dataCenter.get("data_first_charge_in_room", null);
        Boolean.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c());
        ((C3245ad) C9097a.m27146a().mo22266a(C8296e.class).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C7929b<Object>(this));
        this.dataCenter.observe("data_first_charge_in_room", new C7930c(this));
        this.f21441a.mo20784a((C0043i) this, (C0053p<C7939b>) new C7931d<C7939b>(this));
        this.f21443c.setOnClickListener(new C7932e(this));
    }
}
