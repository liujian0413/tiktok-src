package com.bytedance.android.livesdk.gift.effect.doodle.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.gift.effect.doodle.C7996n;
import com.bytedance.android.livesdk.gift.effect.doodle.C7997o;
import com.bytedance.android.livesdk.gift.effect.doodle.DoodleGiftViewHolder;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.p390a.C8139f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

public class DoodleGiftAdapter extends C1262a<DoodleGiftViewHolder> implements C7996n {

    /* renamed from: a */
    public C7997o f21643a;

    /* renamed from: b */
    private Context f21644b;

    /* renamed from: c */
    private LayoutInflater f21645c;

    /* renamed from: d */
    private List<C8139f> f21646d = new ArrayList();

    /* renamed from: e */
    private C8139f f21647e;

    public int getItemCount() {
        return this.f21646d.size();
    }

    /* renamed from: a */
    public final void mo20878a(C8139f fVar) {
        if (fVar != null) {
            m24486b(fVar);
        }
    }

    public DoodleGiftAdapter(Context context) {
        this.f21644b = context;
        this.f21645c = LayoutInflater.from(context);
    }

    /* renamed from: b */
    private void m24486b(C8139f fVar) {
        if (!fVar.f22204b) {
            if (this.f21647e != null) {
                this.f21643a.mo20851a(this.f21647e, false);
            }
            this.f21647e = fVar;
            this.f21643a.mo20851a(fVar, true);
        }
    }

    /* renamed from: a */
    public final C8139f mo20876a(long j) {
        for (C8139f fVar : this.f21646d) {
            if (fVar != null && fVar.mo21275p() == j) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int mo20880b(long j) {
        for (int i = 0; i < this.f21646d.size(); i++) {
            if (this.f21646d.get(i) != null && ((C8139f) this.f21646d.get(i)).mo21275p() == j) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo20879a(List<C8139f> list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size() % 4;
            if (size > 0) {
                for (int i = 0; i < 4 - size; i++) {
                    C8149d dVar = new C8149d();
                    dVar.f22238i = true;
                    dVar.f22233d = -1;
                    list.add(new C8139f(dVar));
                }
            }
            this.f21646d.clear();
            this.f21646d.addAll(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public DoodleGiftViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DoodleGiftViewHolder(this.f21645c.inflate(R.layout.aro, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(DoodleGiftViewHolder doodleGiftViewHolder, int i) {
        C8139f fVar = (C8139f) this.f21646d.get(i);
        if (fVar != null && fVar.mo21262c()) {
            doodleGiftViewHolder.mo20867a(fVar);
            doodleGiftViewHolder.f21630a = this;
            doodleGiftViewHolder.mo20869a(fVar.f22204b);
        }
    }

    /* renamed from: a */
    public final void mo20877a(C1293v vVar, Object obj) {
        if ((vVar instanceof DoodleGiftViewHolder) && (obj instanceof C8139f)) {
            m24486b((C8139f) obj);
        }
    }
}
