package com.bytedance.android.livesdk.chatroom.interact.p216d;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.C4811i;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4517a.C4518a;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4517a.C4519b;
import com.bytedance.android.livesdk.chatroom.model.C4848a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4853d;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.sharedpref.Properties;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdkapi.IPropertyCache.C9283a;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.C47559ag;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.h */
public final class C4736h extends C4518a {

    /* renamed from: b */
    private Room f13455b;

    /* renamed from: c */
    private boolean f13456c;

    /* renamed from: d */
    private List<C4853d> f13457d;

    /* renamed from: e */
    private int f13458e = 1;

    /* renamed from: f */
    private int f13459f;

    /* renamed from: g */
    private int f13460g = 2;

    /* renamed from: h */
    private String f13461h = "";

    /* renamed from: i */
    private C9355c f13462i;

    /* renamed from: j */
    private String f13463j;

    /* renamed from: k */
    private boolean f13464k;

    /* renamed from: l */
    private C7321c f13465l;

    /* renamed from: a */
    public final int mo12337a() {
        return this.f13460g;
    }

    /* renamed from: b */
    public final String mo12341b() {
        return this.f13461h;
    }

    /* renamed from: d */
    public final boolean mo12344d() {
        return this.f13456c;
    }

    /* renamed from: c */
    public final ImageModel mo12343c() {
        return TTLiveSDKContext.getHostService().mo22367h().mo22165a().getAvatarThumb();
    }

    /* renamed from: f */
    public final void mo12661f() {
        super.mo12661f();
        if (this.f13465l != null && !this.f13465l.isDisposed()) {
            this.f13465l.dispose();
        }
    }

    /* renamed from: g */
    private void m15587g() {
        String str;
        HashMap hashMap = new HashMap();
        if (this.f13455b != null) {
            String str2 = "room_type";
            if (this.f13455b.getStreamType() == LiveMode.AUDIO) {
                str = "radio";
            } else {
                str = "video";
            }
            hashMap.put(str2, str);
        }
        hashMap.put("audience_connection_type", "voice");
        C8443c.m25663a().mo21606a("audience_connection_apply", hashMap, new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("click"), C8438j.class, Room.class);
    }

    /* renamed from: e */
    public final void mo12345e() {
        int i;
        int i2;
        String str;
        if (!this.f13464k) {
            boolean z = true;
            this.f13464k = true;
            C3913e a = C3913e.m13800a();
            if (this.f13456c) {
                C4853d dVar = (C4853d) this.f13457d.get(this.f13459f);
                i = dVar.f13866a;
                i2 = dVar.f13867b;
                a.f11724j = true;
                a.f11725k = i;
                a.f11726l = i2;
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(i));
                sb.append("-");
                sb.append(i2);
                str = sb.toString();
            } else {
                a.f11724j = false;
                a.f11725k = 0;
                a.f11726l = 0;
                str = "";
                i2 = 0;
                i = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("link_type", String.valueOf(this.f13458e));
            hashMap.put("guest_supported_vendor", "6");
            hashMap.put("guest_supported_layout", "15");
            hashMap.put("payed_money", String.valueOf(i));
            hashMap.put("link_duration", String.valueOf(i2));
            this.f13465l = ((LinkApi) C3458e.m12798a().mo10440a(LinkApi.class)).apply(this.f13455b.getId(), hashMap).mo19124a((C47559ag<? super T, ? extends R>) C3303k.m12366a()).mo19129a((C7326g<? super T>) new C4741i<Object>(this), (C7326g<? super Throwable>) new C4742j<Object>(this));
            C3913e.m13800a().f11721g = this.f13460g;
            C3913e.m13800a().f11722h = this.f13462i;
            C3913e.m13800a().f11723i = this.f13461h;
            Room room = this.f13455b;
            if (this.f13458e != 1) {
                z = false;
            }
            C9036ae.m26995a(room, z, str);
            m15587g();
        }
    }

    /* renamed from: a */
    public final void mo12338a(int i) {
        this.f13458e = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo12659a(C4519b bVar) {
        super.mo12659a(bVar);
        this.f13460g = TTLiveSDKContext.getHostService().mo22361b().mo23190b().mo22768b(Properties.LIVE_INTERACT_BEAUTY_LEVEL);
    }

    /* renamed from: b */
    public final void mo12342b(int i) {
        this.f13460g = i;
        TTLiveSDKContext.getHostService().mo22361b().mo23190b().mo22764a((C9283a) Properties.LIVE_INTERACT_BEAUTY_LEVEL, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12658a(C3479d dVar) throws Exception {
        C4848a aVar = (C4848a) dVar.data;
        this.f13464k = false;
        if (this.f17242a != null) {
            C3912d.m13795a().f11713h = aVar.f13843a;
            C3912d.m13795a().f11714i = aVar.f13845c;
            C3913e.m13800a().mo11452a(Integer.valueOf(1));
            C3913e.m13800a().f11727m = this.f13458e;
            C4811i.m15837a(this.f13458e);
            ((C4519b) this.f17242a).mo12347b();
        }
    }

    /* renamed from: a */
    public final void mo12339a(C9355c cVar) {
        this.f13462i = cVar;
    }

    /* renamed from: a */
    public final void mo12340a(String str) {
        this.f13461h = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12660a(Throwable th) throws Exception {
        this.f13464k = false;
        if (this.f17242a != null) {
            ((C4519b) this.f17242a).mo12346a(th);
        }
    }

    public C4736h(Room room, boolean z, List<C4853d> list, String str) {
        this.f13455b = room;
        this.f13456c = z;
        this.f13457d = list;
        this.f13463j = str;
    }
}
