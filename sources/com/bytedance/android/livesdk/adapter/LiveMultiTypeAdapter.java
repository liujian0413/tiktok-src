package com.bytedance.android.livesdk.adapter;

import android.support.p029v7.util.C1143a;
import android.support.p029v7.util.C1143a.C1146b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.livesdk.log.C8444d;
import java.util.ArrayList;
import java.util.List;
import p1886me.drakeet.multitype.MultiTypeAdapter;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public class LiveMultiTypeAdapter extends MultiTypeAdapter {

    /* renamed from: c */
    private ListDiffCallback f11588c;

    /* renamed from: d */
    private List<?> f11589d = new ArrayList();

    /* renamed from: a */
    public final void mo11418a(List list) {
        if (list != null) {
            this.f11588c = new ListDiffCallback(this.f11589d, list);
            C7492s.m23301b(C1143a.m5066a(this.f11588c)).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C3882e<Object>(this, list), C3883f.f11600a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11419a(List list, C1146b bVar) throws Exception {
        super.mo11418a(list);
        try {
            bVar.mo4548a((C1262a) this);
        } catch (Exception e) {
            C8444d.m25673b();
            C8444d.m11969a(6, e.getStackTrace());
        }
        this.f11589d.clear();
        this.f11589d.addAll(list);
    }
}
