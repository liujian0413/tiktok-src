package com.p280ss.android.ugc.aweme.followrequest.adapter;

import android.app.Activity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.AppCompatTextView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.followrequest.C29864b;
import com.p280ss.android.ugc.aweme.followrequest.adapter.FollowRequestHolder.C29860a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.followrequest.adapter.FollowRequestAdapter */
public class FollowRequestAdapter extends BaseAdapter<User> implements C29860a {

    /* renamed from: b */
    private static final int f78436b = ((int) C9738o.m28708b(C6399b.m19921a(), 6.0f));

    /* renamed from: a */
    private C29864b f78437a;

    public FollowRequestAdapter(C29864b bVar) {
        this.f78437a = bVar;
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        int c = C0683b.m2912c(viewGroup.getContext(), R.color.a53);
        this.f67550q = c;
        C1293v a_ = super.mo61886a_(viewGroup);
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(c);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setText(R.string.bzx);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setTextColor(c);
        appCompatTextView2.setTextSize(13.0f);
        if (C6399b.m19944t()) {
            appCompatTextView2.setText(R.string.dvr);
        } else {
            appCompatTextView2.setText(R.string.bnk);
        }
        DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
        dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25963b((View) appCompatTextView2));
        return a_;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new FollowRequestHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w2, viewGroup, false), (Activity) this.f78437a, this);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((FollowRequestHolder) vVar).mo75845a((User) this.f67539l.get(i));
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) vVar.itemView.getLayoutParams();
        if (i == 0) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, f78436b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    /* renamed from: a */
    public final void mo75844a(User user, int i, int i2) {
        if (i >= 0 && i < this.f67539l.size()) {
            this.f67539l.remove(i);
            notifyItemRemoved(i);
            if (this.f67539l.isEmpty()) {
                this.f78437a.mo58711c();
            }
        }
    }
}
