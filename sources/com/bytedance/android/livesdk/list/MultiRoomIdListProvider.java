package com.bytedance.android.livesdk.list;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9412a;
import com.bytedance.android.livesdkapi.p452h.C9419g;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class MultiRoomIdListProvider extends C9419g implements C0042h {

    /* renamed from: a */
    private List<Long> f22970a = new ArrayList();

    /* renamed from: b */
    private List<Room> f22971b;

    /* renamed from: c */
    private final List<Bundle> f22972c = new ArrayList();

    /* renamed from: d */
    private Bundle f22973d;

    /* renamed from: e */
    private C7321c f22974e;

    /* renamed from: f */
    private List<Room> f22975f = new ArrayList();

    /* renamed from: a */
    public final List<Room> mo21537a() {
        return this.f22975f;
    }

    /* renamed from: a */
    public final void mo14626a(int i, FeedItem feedItem) {
    }

    /* renamed from: b */
    public final void mo14631b(int i) {
    }

    /* renamed from: b */
    public final int mo14629b() {
        return this.f22970a.size();
    }

    /* renamed from: d */
    public final List<Room> mo14634d() {
        return new ArrayList();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.f22974e != null) {
            this.f22974e.dispose();
            this.f22974e = null;
        }
    }

    /* renamed from: a */
    public final int mo14624a(Bundle bundle) {
        return this.f22970a.indexOf(Long.valueOf(bundle.getLong("live.intent.extra.ROOM_ID")));
    }

    /* renamed from: b */
    private void m25500b(List<Room> list) {
        this.f22972c.clear();
        if (!C6311g.m19573a(list)) {
            for (Room a : list) {
                this.f22972c.add(C9412a.m27916a(a));
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo14625a(int i) {
        if (!C6307b.m19566a((Collection<T>) this.f22972c) && this.f22972c.size() > i) {
            return (Bundle) this.f22972c.get(i);
        }
        Bundle bundle = new Bundle(this.f22973d);
        if (i >= 0 && i < this.f22970a.size()) {
            bundle.putLong("live.intent.extra.ROOM_ID", ((Long) this.f22970a.get(i)).longValue());
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo14627a(long j) {
        Iterator it = this.f22970a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() == j) {
                it.remove();
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21538a(C3479d dVar) throws Exception {
        if (dVar != null && dVar.data != null) {
            Map map = (Map) dVar.data;
            ArrayList<Room> arrayList = new ArrayList<>();
            boolean z = false;
            String str = "";
            String str2 = "";
            if (this.f22973d != null) {
                str = this.f22973d.getString("live.intent.extra.REQUEST_ID");
                str2 = this.f22973d.getString("live.intent.extra.LOG_PB");
                if (TextUtils.isEmpty(str)) {
                    str = this.f22973d.getString("request_id");
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = this.f22973d.getString("log_pb");
                }
            }
            Iterator it = this.f22970a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Long l = (Long) it.next();
                if (l == null || !map.containsKey(String.valueOf(l))) {
                    z = true;
                } else {
                    arrayList.add(map.get(String.valueOf(l)));
                }
            }
            for (Room room : arrayList) {
                room.setLog_pb(str2);
                room.setRequestId(str);
            }
            if (!z) {
                this.f22971b = new ArrayList(arrayList);
                m25500b(this.f22971b);
            }
        }
    }

    /* renamed from: a */
    public final void mo21539a(List<Room> list) {
        if (!C6311g.m19573a(list)) {
            if (this.f22975f == null) {
                this.f22975f = new ArrayList();
            }
            this.f22975f.clear();
            this.f22975f.addAll(list);
        }
    }

    public MultiRoomIdListProvider(Lifecycle lifecycle, long[] jArr, Bundle bundle) {
        this.f22973d = bundle;
        for (long valueOf : jArr) {
            this.f22970a.add(Long.valueOf(valueOf));
        }
        lifecycle.mo55a(this);
        if (jArr != null) {
            this.f22974e = C4275g.m14436a(jArr).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C8380a<Object>(this), C8381b.f22977a);
        }
    }
}
