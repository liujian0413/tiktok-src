package com.bytedance.android.livesdk.chatroom.interact.p217e;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.chatroom.api.C4258b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C4450t;
import com.bytedance.android.livesdk.chatroom.interact.data.C4762d;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4854e;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4855f;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.e.a */
public final class C4764a implements OnMessageListener {

    /* renamed from: a */
    public List<C4854e> f13511a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public List<C4854e> f13512b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c */
    private IMessageManager f13513c;

    /* renamed from: d */
    private boolean f13514d;

    /* renamed from: e */
    private boolean f13515e;

    /* renamed from: f */
    private boolean f13516f;

    /* renamed from: g */
    private Room f13517g;

    /* renamed from: h */
    private boolean f13518h;

    /* renamed from: i */
    private List<C4765a> f13519i = new ArrayList();

    /* renamed from: j */
    private DataCenter f13520j;

    /* renamed from: k */
    private final C47562b f13521k = new C47562b();

    /* renamed from: l */
    private List<C4854e> f13522l = Collections.synchronizedList(new ArrayList());

    /* renamed from: m */
    private Map<Integer, Boolean> f13523m = new ConcurrentHashMap();

    /* renamed from: n */
    private C0053p<KVData> f13524n = new C4766b(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.e.a$a */
    public interface C4765a {
        /* renamed from: a */
        void mo12181a(long j, int i);

        /* renamed from: a */
        void mo12182a(long j, int i, boolean z);

        /* renamed from: a */
        void mo12183a(long j, long j2);

        /* renamed from: a */
        void mo12184a(List<C4854e> list);

        /* renamed from: a */
        void mo12185a(List<C4855f> list, long j);

        /* renamed from: b */
        void mo12186b(List<C4854e> list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12690a(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            m15643a((C4450t) kVData.getData());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12687a(long j, C3478c cVar) throws Exception {
        this.f13516f = false;
        for (C4765a a : this.f13519i) {
            a.mo12185a(cVar.f10296b, j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12688a(C3478c cVar) throws Exception {
        this.f13515e = false;
        List list = cVar.f10296b;
        if (!list.isEmpty()) {
            int size = this.f13511a.size();
            for (int i = 0; i < size; i++) {
                C4854e eVar = (C4854e) this.f13511a.get(i);
                eVar.f13880m = true;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C4854e eVar2 = (C4854e) it.next();
                    if (m15647a(eVar, eVar2)) {
                        this.f13511a.set(i, eVar2);
                        it.remove();
                        break;
                    }
                }
            }
            Iterator it2 = this.f13511a.iterator();
            while (it2.hasNext()) {
                C4854e eVar3 = (C4854e) it2.next();
                if (eVar3.f13880m) {
                    it2.remove();
                    m15644a(eVar3);
                }
            }
            this.f13511a.addAll(list);
            for (C4854e eVar4 : this.f13511a) {
                this.f13523m.put(Integer.valueOf(eVar4.f13870c), Boolean.valueOf(eVar4.f13868a == 0));
            }
            for (C4765a a : this.f13519i) {
                a.mo12184a(this.f13511a);
            }
        }
    }

    /* renamed from: a */
    public final void mo12686a(int i) {
        this.f13523m.put(Integer.valueOf(i), Boolean.TRUE);
    }

    /* renamed from: d */
    public final int mo12699d() {
        return this.f13512b.size();
    }

    /* renamed from: b */
    public final void mo12692b() {
        this.f13518h = false;
        this.f13520j.removeObserver("cmd_interact_state_change", this.f13524n);
        this.f13521k.mo119660a();
        if (this.f13513c != null) {
            this.f13513c.removeMessageListener(this);
        }
    }

    /* renamed from: g */
    private void m15651g() {
        if (!this.f13514d) {
            this.f13514d = true;
            this.f13521k.mo119661a(C4258b.m14404a((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class), this.f13517g.getId(), 1).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C4770f<Object>(this), (C7326g<? super Throwable>) new C4771g<Object>(this)));
        }
    }

    /* renamed from: c */
    public final void mo12696c() {
        if (!this.f13515e) {
            this.f13515e = true;
            this.f13521k.mo119661a(C4258b.m14404a((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class), this.f13517g.getId(), 2).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C4772h<Object>(this), (C7326g<? super Throwable>) new C4773i<Object>(this)));
        }
    }

    /* renamed from: e */
    public final void mo12703e() {
        C4762d dVar = new C4762d();
        dVar.f13508g = 100101;
        dVar.f13505d = String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b());
        dVar.f13506e = String.valueOf(C3912d.m13795a().f11713h);
        dVar.f13503b = "0";
        dVar.f13504c = "0";
        ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).sendSignalV1(this.f13517g.getId(), C2317a.m9932a().mo15979b((Object) dVar), null).mo19135b(C7333a.m23044b()).mo19129a(C4774j.f13534a, C4775k.f13535a);
    }

    /* renamed from: f */
    public final void mo12705f() {
        C4762d dVar = new C4762d();
        dVar.f13508g = 100102;
        dVar.f13505d = String.valueOf(TTLiveSDKContext.getHostService().mo22367h().mo22179b());
        dVar.f13506e = String.valueOf(C3912d.m13795a().f11713h);
        dVar.f13503b = "0";
        dVar.f13504c = "0";
        ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).sendSignalV1(this.f13517g.getId(), C2317a.m9932a().mo15979b((Object) dVar), null).mo19135b(C7333a.m23044b()).mo19129a(C4776l.f13536a, C4768d.f13528a);
    }

    /* renamed from: a */
    public final void mo12685a() {
        if (this.f13513c != null) {
            this.f13513c.addMessageListener(MessageType.LINK_MIC.getIntType(), this);
            this.f13513c.addMessageListener(MessageType.LINK_MIC_SIGNAL.getIntType(), this);
        }
        this.f13520j.observeForever("cmd_interact_state_change", this.f13524n);
        this.f13518h = true;
        if (this.f13517g.isWithLinkMic()) {
            mo12696c();
            m15651g();
        }
    }

    /* renamed from: a */
    public final void mo12689a(C4765a aVar) {
        this.f13519i.add(aVar);
    }

    /* renamed from: b */
    public final void mo12695b(C4765a aVar) {
        this.f13519i.remove(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12697c(Throwable th) throws Exception {
        m15650f(th);
        this.f13515e = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12704e(Throwable th) throws Exception {
        this.f13516f = false;
        m15650f(th);
    }

    /* renamed from: f */
    private static void m15650f(Throwable th) {
        C3166a.m11955a(6, "LinkUserInfoCenter", th.getStackTrace());
    }

    /* renamed from: d */
    public final int mo12700d(int i) {
        C4854e a = mo12684a(0, i);
        if (a == null) {
            return 1;
        }
        return a.f13874g;
    }

    /* renamed from: a */
    private void m15644a(C4854e eVar) {
        if (this.f13522l.size() >= 5) {
            this.f13522l.remove(0);
        }
        this.f13522l.add(eVar);
    }

    /* renamed from: c */
    public final boolean mo12698c(int i) {
        Boolean bool = (Boolean) this.f13523m.get(Integer.valueOf(i));
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo12701d(Throwable th) throws Exception {
        m15650f(th);
        this.f13514d = false;
    }

    /* renamed from: e */
    public final long mo12702e(int i) {
        C4854e a = mo12684a(0, i);
        if (a == null || a.f13871d == null) {
            return 0;
        }
        return a.f13871d.getId();
    }

    /* renamed from: a */
    private void m15643a(C4450t tVar) {
        if (this.f13518h && 6 == tVar.f12909a && (tVar.f12910b instanceof Long) && !this.f13516f) {
            this.f13516f = true;
            long longValue = ((Long) tVar.f12910b).longValue();
            this.f13521k.mo119661a(C4258b.m14405a((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class), this.f13517g.getId(), longValue, 0).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C4767c<Object>(this, longValue), (C7326g<? super Throwable>) new C4769e<Object>(this)));
        }
    }

    /* renamed from: b */
    public final void mo12693b(int i) {
        this.f13523m.remove(Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12694b(C3478c cVar) throws Exception {
        this.f13514d = false;
        List<C4854e> list = cVar.f10296b;
        if (list.isEmpty()) {
            this.f13512b.clear();
        } else {
            this.f13512b = list;
        }
        for (C4765a b : this.f13519i) {
            b.mo12186b(this.f13512b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        mo12696c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMessage(com.p280ss.ugc.live.sdk.message.data.IMessage r8) {
        /*
            r7 = this;
            boolean r0 = r7.f13518h
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.message.model.C8508bd
            r1 = 0
            if (r0 == 0) goto L_0x0051
            com.bytedance.android.livesdk.message.model.bd r8 = (com.bytedance.android.livesdk.message.model.C8508bd) r8
            int r0 = r8.f23319a
            switch(r0) {
                case 5: goto L_0x004b;
                case 6: goto L_0x0046;
                case 7: goto L_0x003f;
                case 8: goto L_0x0017;
                case 9: goto L_0x0011;
                case 10: goto L_0x0012;
                case 11: goto L_0x0042;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0050
        L_0x0012:
            r7.mo12696c()
            goto L_0x00c1
        L_0x0017:
            java.util.List<com.bytedance.android.livesdk.chatroom.interact.e.a$a> r0 = r7.f13519i
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r0.next()
            com.bytedance.android.livesdk.chatroom.interact.e.a$a r2 = (com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a.C4765a) r2
            long r3 = r8.f23324f
            long r5 = r8.f23325g
            r2.mo12183a(r3, r5)
            goto L_0x001d
        L_0x0031:
            long r2 = r8.f23324f
            com.bytedance.android.livesdk.chatroom.model.a.e r0 = r7.mo12684a(r2, r1)
            if (r0 == 0) goto L_0x0050
            long r1 = r8.f23325g
            r0.f13869b = r1
            goto L_0x00c1
        L_0x003f:
            r7.m15651g()
        L_0x0042:
            r7.mo12696c()
            goto L_0x0050
        L_0x0046:
            r7.mo12696c()
            goto L_0x00c1
        L_0x004b:
            r7.m15651g()
            goto L_0x00c1
        L_0x0050:
            return
        L_0x0051:
            boolean r0 = r8 instanceof com.bytedance.android.livesdk.message.model.C8509be
            if (r0 == 0) goto L_0x00c1
            com.bytedance.android.livesdk.message.model.be r8 = (com.bytedance.android.livesdk.message.model.C8509be) r8
            com.bytedance.android.livesdk.chatroom.interact.data.d r0 = r8.mo21655a()
            if (r0 != 0) goto L_0x005e
            return
        L_0x005e:
            com.bytedance.android.livesdk.chatroom.interact.data.d r8 = r8.mo21655a()
            java.lang.String r0 = r8.f13505d     // Catch:{ NumberFormatException -> 0x00c1 }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00c1 }
            java.lang.String r0 = r8.f13506e     // Catch:{ NumberFormatException -> 0x00c1 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00c1 }
            int r4 = r8.f13508g     // Catch:{ NumberFormatException -> 0x00c1 }
            r5 = 101002(0x18a8a, float:1.41534E-40)
            if (r4 == r5) goto L_0x00a4
            switch(r4) {
                case 100101: goto L_0x0079;
                case 100102: goto L_0x0079;
                default: goto L_0x0078;
            }     // Catch:{ NumberFormatException -> 0x00c1 }
        L_0x0078:
            goto L_0x00c0
        L_0x0079:
            int r8 = r8.f13508g     // Catch:{ NumberFormatException -> 0x00c1 }
            r4 = 100102(0x18706, float:1.40273E-40)
            if (r8 != r4) goto L_0x0081
            r1 = 1
        L_0x0081:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r8 = r7.f13523m     // Catch:{ NumberFormatException -> 0x00c1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00c1 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch:{ NumberFormatException -> 0x00c1 }
            r8.put(r4, r5)     // Catch:{ NumberFormatException -> 0x00c1 }
            java.util.List<com.bytedance.android.livesdk.chatroom.interact.e.a$a> r8 = r7.f13519i     // Catch:{ NumberFormatException -> 0x00c1 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ NumberFormatException -> 0x00c1 }
        L_0x0094:
            boolean r4 = r8.hasNext()     // Catch:{ NumberFormatException -> 0x00c1 }
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r8.next()     // Catch:{ NumberFormatException -> 0x00c1 }
            com.bytedance.android.livesdk.chatroom.interact.e.a$a r4 = (com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a.C4765a) r4     // Catch:{ NumberFormatException -> 0x00c1 }
            r4.mo12182a(r2, r0, r1)     // Catch:{ NumberFormatException -> 0x00c1 }
            goto L_0x0094
        L_0x00a4:
            java.util.List<com.bytedance.android.livesdk.chatroom.interact.e.a$a> r8 = r7.f13519i     // Catch:{ NumberFormatException -> 0x00c1 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ NumberFormatException -> 0x00c1 }
        L_0x00aa:
            boolean r1 = r8.hasNext()     // Catch:{ NumberFormatException -> 0x00c1 }
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r1 = r8.next()     // Catch:{ NumberFormatException -> 0x00c1 }
            com.bytedance.android.livesdk.chatroom.interact.e.a$a r1 = (com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a.C4765a) r1     // Catch:{ NumberFormatException -> 0x00c1 }
            r1.mo12181a(r2, r0)     // Catch:{ NumberFormatException -> 0x00c1 }
            goto L_0x00aa
        L_0x00ba:
            r7.mo12693b(r0)     // Catch:{ NumberFormatException -> 0x00c1 }
            r7.m15649c(r2, r0)     // Catch:{ NumberFormatException -> 0x00c1 }
        L_0x00c0:
            return
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.p217e.C4764a.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* renamed from: a */
    public final int mo12683a(long j) {
        C4854e a = mo12684a(j, 0);
        if (a == null || a.f13871d == null) {
            return 0;
        }
        return a.f13870c;
    }

    /* renamed from: b */
    public final C4854e mo12691b(long j, int i) {
        for (C4854e eVar : this.f13511a) {
            if (m15646a(j, i, eVar)) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m15649c(long j, int i) {
        int size = this.f13511a.size();
        int i2 = 0;
        while (i2 < size) {
            C4854e eVar = (C4854e) this.f13511a.get(i2);
            if (eVar == null || ((i <= 0 || eVar.f13870c != i) && (j <= 0 || eVar.f13871d == null || eVar.f13871d.getId() != j))) {
                i2++;
            } else {
                this.f13511a.remove(i2);
                m15644a(eVar);
                return;
            }
        }
    }

    public C4764a(Room room, DataCenter dataCenter) {
        this.f13517g = room;
        this.f13520j = dataCenter;
        this.f13513c = (IMessageManager) dataCenter.get("data_message_manager");
    }

    /* renamed from: a */
    private static boolean m15647a(C4854e eVar, C4854e eVar2) {
        if (eVar == null || eVar.f13871d == null || eVar2 == null || eVar2.f13871d == null) {
            return false;
        }
        if ((eVar.f13870c <= 0 || eVar.f13870c != eVar2.f13870c) && (eVar.f13871d.getId() <= 0 || eVar.f13871d.getId() != eVar2.f13871d.getId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C4854e mo12684a(long j, int i) {
        for (C4854e eVar : this.f13511a) {
            if (m15646a(j, i, eVar)) {
                return eVar;
            }
        }
        for (C4854e eVar2 : this.f13512b) {
            if (m15646a(j, i, eVar2)) {
                return eVar2;
            }
        }
        for (C4854e eVar3 : this.f13522l) {
            if (m15646a(j, i, eVar3)) {
                return eVar3;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m15646a(long j, int i, C4854e eVar) {
        if ((j <= 0 && i <= 0) || eVar == null || eVar.f13871d == null) {
            return false;
        }
        if ((j <= 0 || eVar.f13871d.getId() != j) && (i <= 0 || eVar.f13870c != i)) {
            return false;
        }
        return true;
    }
}
