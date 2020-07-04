package com.bytedance.android.livesdk.live;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.util.ArrayMap;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.p220ui.LivePlayFragment;
import com.bytedance.android.livesdk.widget.LiveFragmentStatePagerAdapter;
import com.bytedance.android.livesdkapi.depend.live.C9330e;
import com.bytedance.android.livesdkapi.p452h.C9416e;
import com.bytedance.android.livesdkapi.p452h.C9416e.C9417a;
import java.util.Map;

public class LiveDetailPagerAdapter extends LiveFragmentStatePagerAdapter {

    /* renamed from: a */
    private final C9416e f22980a;

    /* renamed from: b */
    private final C9417a f22981b = new C8383a(this);

    /* renamed from: c */
    private final Map<Long, C9330e> f22982c = new ArrayMap();

    /* renamed from: a */
    public final void mo21542a() {
        this.f22980a.mo23115b(this.f22981b);
    }

    public int getCount() {
        return this.f22980a.mo14629b();
    }

    /* renamed from: c */
    public final long mo21544c(int i) {
        return m25520a(this.f22980a.mo14625a(i));
    }

    /* renamed from: a */
    public final Fragment mo21541a(int i) {
        LivePlayFragment livePlayFragment = new LivePlayFragment();
        livePlayFragment.mo13278g().setArguments(this.f22980a.mo14625a(i));
        return livePlayFragment.mo13278g();
    }

    /* renamed from: b */
    public final C9330e mo21543b(int i) {
        return (C9330e) this.f22982c.get(Long.valueOf(mo21544c(i)));
    }

    public int getItemPosition(Object obj) {
        int a = this.f22980a.mo14624a(((Fragment) obj).getArguments());
        if (a < 0) {
            return -2;
        }
        return a;
    }

    /* renamed from: a */
    private static long m25520a(Bundle bundle) {
        long j = bundle.getLong("live.intent.extra.item_id_for_view_pager", -1);
        if (j > 0) {
            return j;
        }
        long j2 = bundle.getLong("live.intent.extra.USER_ID", -1);
        if (j2 <= 0) {
            j2 = bundle.getLong("live.intent.extra.ROOM_ID", -1);
        }
        bundle.putLong("live.intent.extra.item_id_for_view_pager", j2);
        return j2;
    }

    public LiveDetailPagerAdapter(C0608j jVar, C9416e eVar) {
        super(jVar);
        this.f22980a = eVar;
        this.f22980a.mo23114a(this.f22981b);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C9330e eVar = (C9330e) super.instantiateItem(viewGroup, i);
        this.f22982c.put(Long.valueOf(mo21544c(i)), eVar);
        return eVar;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof C9330e) {
            C9330e eVar = (C9330e) obj;
            eVar.mo13273c();
            this.f22982c.remove(Long.valueOf(m25520a(eVar.mo13278g().getArguments())));
        }
        super.destroyItem(viewGroup, i, obj);
    }
}
