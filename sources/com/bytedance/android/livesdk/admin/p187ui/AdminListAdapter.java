package com.bytedance.android.livesdk.admin.p187ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.admin.p184b.C3889b;
import com.bytedance.android.livesdk.admin.p184b.C3890c;
import com.bytedance.android.livesdk.common.AbsViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.admin.ui.AdminListAdapter */
public class AdminListAdapter extends C1262a<AbsViewHolder> {

    /* renamed from: a */
    private Context f11633a;

    /* renamed from: b */
    private List<C3889b> f11634b = new ArrayList();

    /* renamed from: c */
    private C3890c f11635c;

    /* renamed from: d */
    private long f11636d;

    /* renamed from: e */
    private long f11637e;

    public int getItemCount() {
        return this.f11634b.size();
    }

    /* renamed from: a */
    public final void mo11436a(long j) {
        for (int size = this.f11634b.size() - 1; size >= 0; size--) {
            C3889b bVar = (C3889b) this.f11634b.get(size);
            if (bVar != null) {
                User user = bVar.f11616a;
                if (user != null && user.getId() == j) {
                    this.f11634b.remove(size);
                    notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11437a(C3890c cVar) {
        this.f11635c = cVar;
        if (cVar != null) {
            List<C3889b> list = cVar.f11618a;
            if (list != null && list.size() > 0) {
                this.f11634b.clear();
                this.f11634b.addAll(list);
                notifyDataSetChanged();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(AbsViewHolder absViewHolder, int i) {
        absViewHolder.mo11439a((C3889b) this.f11634b.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AbsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AdminListViewHolder adminListViewHolder = new AdminListViewHolder(this.f11633a, LayoutInflater.from(this.f11633a).inflate(R.layout.are, viewGroup, false), this.f11636d, this.f11637e);
        return adminListViewHolder;
    }

    public AdminListAdapter(Context context, long j, long j2) {
        this.f11633a = context;
        this.f11636d = j;
        this.f11637e = j2;
    }
}
