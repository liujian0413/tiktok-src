package com.p280ss.android.ugc.aweme.i18n.settings.blacklist;

import android.app.Activity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.AppCompatTextView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.setting.adapter.BlackHolder;
import com.p280ss.android.ugc.aweme.setting.adapter.BlackListAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.blacklist.MusBlackListAdapter */
public class MusBlackListAdapter extends BlackListAdapter {
    MusBlackListAdapter(Activity activity) {
        super(activity);
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
        appCompatTextView2.setText(R.string.bnk);
        DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
        dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25963b((View) appCompatTextView2));
        return a_;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new BlackHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tj, viewGroup, false), this.f97951a);
    }
}
