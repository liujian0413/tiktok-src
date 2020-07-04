package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.bytedance.android.live.core.rxutils.C3306n;
import com.bytedance.android.livesdk.C3916b;
import com.bytedance.android.livesdk.action.C3866b;
import com.bytedance.android.livesdk.chatroom.widget.C5776a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8683p;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9114c;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9115d;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9116e;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9118g;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9119h;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9120i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public final class CommonGuideWidget extends LiveWidget implements C0067b {

    /* renamed from: a */
    private C5776a f15766a;

    /* renamed from: b */
    private CommonGuideViewModel f15767b;

    /* renamed from: c */
    private Room f15768c;

    /* renamed from: d */
    private C8683p f15769d;

    /* renamed from: e */
    private final C47562b f15770e = new C47562b();

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget$a */
    static final class C5395a<T> implements C7326g<Pair<? extends C9120i, ? extends C9120i>> {

        /* renamed from: a */
        final /* synthetic */ CommonGuideWidget f15771a;

        C5395a(CommonGuideWidget commonGuideWidget) {
            this.f15771a = commonGuideWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Pair<? extends C9120i, ? extends C9120i> pair) {
            this.f15771a.mo13703a((C9120i) pair.component1(), (C9120i) pair.component2());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget$b */
    static final class C5396b implements OnDismissListener {

        /* renamed from: a */
        public static final C5396b f15772a = new C5396b();

        C5396b() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C3916b.m13813a().mo11466c();
        }
    }

    /* renamed from: a */
    private final void m17180a() {
        C5776a aVar = this.f15766a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
        this.f15766a = null;
    }

    public final void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            this.f15768c = (Room) dataCenter.get("data_room", null);
        }
        this.f15767b = (CommonGuideViewModel) getViewModel(CommonGuideViewModel.class, this);
        CommonGuideViewModel commonGuideViewModel = this.f15767b;
        if (commonGuideViewModel != null) {
            this.f15770e.mo119661a(C3306n.m12381a(commonGuideViewModel.f24805a.mo22294a()).mo19325f((C7326g<? super T>) new C5395a<Object>(this)));
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C5776a aVar = this.f15766a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
        if (!this.f15770e.isDisposed()) {
            this.f15770e.dispose();
        }
        this.f15766a = null;
        this.f15767b = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<java.lang.String, java.lang.String> m17181b() {
        /*
            r6 = this;
            r0 = 4
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            java.lang.String r1 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r6.f15768c
            r3 = 0
            if (r2 == 0) goto L_0x0013
            long r4 = r2.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x0014
        L_0x0013:
            r2 = r3
        L_0x0014:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlin.Pair r1 = kotlin.C7579l.m23633a(r1, r2)
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.String r2 = "user_id"
            java.lang.Class<com.bytedance.android.live.user.a> r4 = com.bytedance.android.live.user.C3592a.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.utility.C3596c.m13172a(r4)
            com.bytedance.android.live.user.a r4 = (com.bytedance.android.live.user.C3592a) r4
            if (r4 == 0) goto L_0x003b
            com.bytedance.android.livesdk.user.e r4 = r4.user()
            if (r4 == 0) goto L_0x003b
            long r4 = r4.mo22179b()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x003c
        L_0x003b:
            r4 = r3
        L_0x003c:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r4)
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r6.f15768c
            if (r4 == 0) goto L_0x0056
            long r4 = r4.getOwnerUserId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0057
        L_0x0056:
            r4 = r3
        L_0x0057:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r4)
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "message_type"
            com.bytedance.android.livesdk.message.model.p r4 = r6.f15769d
            if (r4 == 0) goto L_0x006e
            int r3 = r4.f23639a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x006e:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r3)
            r0[r1] = r2
            java.util.Map r0 = kotlin.collections.C7507ae.m23393a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget.m17181b():java.util.Map");
    }

    /* renamed from: a */
    public final <T extends C0063u> T mo149a(Class<T> cls) {
        C7573i.m23587b(cls, "modelClass");
        return (C0063u) new CommonGuideViewModel();
    }

    /* renamed from: a */
    public final void mo13702a(C8683p pVar) {
        C7573i.m23587b(pVar, "message");
        this.f15769d = pVar;
        CommonGuideViewModel commonGuideViewModel = this.f15767b;
        if (commonGuideViewModel != null) {
            commonGuideViewModel.f24805a.mo22295a((C9119h) new C9114c(pVar));
        }
    }

    /* renamed from: a */
    public final void mo13703a(C9120i iVar, C9120i iVar2) {
        if (iVar2 instanceof C9118g) {
            m17180a();
            this.f15766a = new C5776a(this.context, this.f15767b);
            C5776a aVar = this.f15766a;
            if (aVar != null) {
                aVar.show();
            }
            C3916b.m13813a().mo11465b();
            C5776a aVar2 = this.f15766a;
            if (aVar2 != null) {
                aVar2.setOnDismissListener(C5396b.f15772a);
            }
            C8443c.m25663a().mo21606a("commonguide_show", m17181b(), Room.class, C8438j.class);
        } else if (iVar2 instanceof C9115d) {
            m17180a();
            C3866b.m13714a().mo11406a(((C9115d) iVar2).f24811a);
            C8443c.m25663a().mo21606a("commonguide_click", m17181b(), Room.class, C8438j.class);
        } else {
            if (iVar2 instanceof C9116e) {
                m17180a();
            }
        }
    }
}
