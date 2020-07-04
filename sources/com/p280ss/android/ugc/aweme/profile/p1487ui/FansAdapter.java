package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.FansCardViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.FansAdapter */
public class FansAdapter extends C1262a {

    /* renamed from: a */
    private int f94636a;

    /* renamed from: b */
    private List<FollowerDetail> f94637b;

    /* renamed from: c */
    private Context f94638c;

    /* renamed from: d */
    private boolean f94639d;

    /* renamed from: e */
    private User f94640e;

    public int getItemCount() {
        if (C6307b.m19566a((Collection<T>) this.f94637b)) {
            return 0;
        }
        return this.f94637b.size();
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        int i2;
        FansCardViewHolder fansCardViewHolder = (FansCardViewHolder) vVar;
        FollowerDetail followerDetail = (FollowerDetail) this.f94637b.get(i);
        int i3 = this.f94636a;
        boolean z = this.f94639d;
        boolean z2 = true;
        if (C6307b.m19566a((Collection<T>) this.f94637b)) {
            i2 = 0;
        } else {
            i2 = this.f94637b.size() - 1;
        }
        if (i != i2) {
            z2 = false;
        }
        fansCardViewHolder.mo92821a(followerDetail, i3, z, z2, this.f94640e);
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (this.f94636a == 2) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b0s, viewGroup, false);
        } else if (this.f94636a == 3) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aki, viewGroup, false);
        } else if (this.f94636a == 4) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aki, viewGroup, false);
        } else if (this.f94636a == 5) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mx, viewGroup, false);
        } else {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mw, viewGroup, false);
        }
        m116632a(this.f94636a, view);
        return new FansCardViewHolder(view);
    }

    /* renamed from: a */
    private void m116632a(int i, View view) {
        int i2;
        int a = C9738o.m28691a(this.f94638c);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        if (i < 2 || i > 4) {
            i2 = (int) C9738o.m28708b(this.f94638c, 0.0f);
        } else {
            i2 = (int) C9738o.m28708b(this.f94638c, 5.0f);
            a = (int) (((float) a) - C9738o.m28708b(this.f94638c, 25.0f));
        }
        if (!C6307b.m19566a((Collection<T>) this.f94637b)) {
            this.f94637b.size();
        }
        switch (i) {
            case 2:
                marginLayoutParams.width = (a - (i2 * 2)) / 2;
                marginLayoutParams.leftMargin = i2;
                view.setLayoutParams(marginLayoutParams);
                return;
            case 3:
                marginLayoutParams.width = (a - (i2 * 3)) / 3;
                marginLayoutParams.leftMargin = i2;
                view.setLayoutParams(marginLayoutParams);
                return;
            case 4:
                marginLayoutParams.leftMargin = i2;
                view.setLayoutParams(marginLayoutParams);
                return;
            case 5:
                marginLayoutParams.width = (a - (i2 * 2)) / 2;
                marginLayoutParams.leftMargin = i2;
                view.setLayoutParams(marginLayoutParams);
                return;
            case 6:
                marginLayoutParams.width = (a - (i2 * 3)) / 3;
                marginLayoutParams.leftMargin = i2;
                view.setLayoutParams(marginLayoutParams);
                return;
            case 7:
                marginLayoutParams.leftMargin = i2;
                marginLayoutParams.width = (int) C9738o.m28708b(this.f94638c, 88.0f);
                view.setLayoutParams(marginLayoutParams);
                break;
        }
    }

    public FansAdapter(Context context, int i, List<FollowerDetail> list, boolean z, User user) {
        this.f94636a = i;
        this.f94637b = list;
        this.f94638c = context;
        this.f94639d = z;
        this.f94640e = user;
    }
}
