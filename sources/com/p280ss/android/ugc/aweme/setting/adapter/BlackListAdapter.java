package com.p280ss.android.ugc.aweme.setting.adapter;

import android.app.Activity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.AppCompatTextView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.adapter.BlackListAdapter */
public class BlackListAdapter extends BaseAdapter<User> {

    /* renamed from: a */
    protected Activity f97951a;

    public BlackListAdapter(Activity activity) {
        this.f97951a = activity;
    }

    /* renamed from: a_ */
    public C1293v mo61886a_(ViewGroup viewGroup) {
        int c = C0683b.m2912c(viewGroup.getContext(), R.color.a53);
        this.f67550q = c;
        C1293v a_ = super.mo61886a_(viewGroup);
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView.setGravity(17);
        appCompatTextView.setTextColor(c);
        appCompatTextView.setTextSize(13.0f);
        appCompatTextView.setText(R.string.bmc);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(viewGroup.getContext());
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setTextColor(c);
        appCompatTextView2.setTextSize(13.0f);
        if (C6399b.m19944t()) {
            appCompatTextView2.setText(R.string.dvr);
        } else {
            appCompatTextView2.setText(R.string.bnk);
        }
        appCompatTextView2.setText(R.string.tk);
        DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
        dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25963b((View) appCompatTextView2));
        return a_;
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((BlackHolder) vVar).mo94836a((User) this.f67539l.get(i));
    }

    /* renamed from: a */
    public C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new BlackHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tj, viewGroup, false), this.f97951a);
    }
}
