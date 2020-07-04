package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.content.res.Resources;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.adapter.FlowFeedAdapter;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.BaseFollowViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21746d;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.forward.p1272vh.BaseForwardViewHolder;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardTextViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FixRatioForwardDeletedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowDeletedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.MomentFollowFeedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.MomentForwardDeletedViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.MomentForwardFeedViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.UserStateFeedAdapter */
public class UserStateFeedAdapter extends FlowFeedAdapter<FollowFeed> {
    /* renamed from: b */
    public final void mo58051b(View view) {
        if (this.f58239D) {
            view.setPadding(0, 0, 0, view.getResources().getDimensionPixelSize(R.dimen.my));
        }
    }

    /* renamed from: a */
    public final int mo58030a(View view) {
        if (view == null) {
            return 0;
        }
        Resources resources = view.getResources();
        if (this.f58239D) {
            return resources.getDimensionPixelSize(R.dimen.en) + resources.getDimensionPixelSize(R.dimen.my);
        }
        return resources.getDimensionPixelSize(R.dimen.en);
    }

    /* renamed from: b */
    public final BaseFollowViewHolder mo58049b(ViewGroup viewGroup) {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (a) {
            case 1:
            case 8:
                UserStateFixRatioFollowImageViewHolder userStateFixRatioFollowImageViewHolder = new UserStateFixRatioFollowImageViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                return userStateFixRatioFollowImageViewHolder;
            case 2:
                return new MomentFollowFeedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 3:
            case 9:
                UserStateInsFollowImageViewHolder userStateInsFollowImageViewHolder = new UserStateInsFollowImageViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                return userStateInsFollowImageViewHolder;
            case 4:
                UserStateInsFollowImageViewHolderPlanA userStateInsFollowImageViewHolderPlanA = new UserStateInsFollowImageViewHolderPlanA((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                return userStateInsFollowImageViewHolderPlanA;
            case 5:
                UserStateInsFollowImageViewHolderPlanB userStateInsFollowImageViewHolderPlanB = new UserStateInsFollowImageViewHolderPlanB((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                return userStateInsFollowImageViewHolderPlanB;
            case 6:
                UserStateInsFollowImageViewHolderPlanC userStateInsFollowImageViewHolderPlanC = new UserStateInsFollowImageViewHolderPlanC((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                return userStateInsFollowImageViewHolderPlanC;
            case 7:
                UserStateInsFollowImageViewHolderPlanD userStateInsFollowImageViewHolderPlanD = new UserStateInsFollowImageViewHolderPlanD((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                return userStateInsFollowImageViewHolderPlanD;
            default:
                return new UserStateFlowItemImageViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
        }
    }

    /* renamed from: c */
    public final BaseFollowViewHolder mo58054c(ViewGroup viewGroup) {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (a) {
            case 1:
            case 8:
                UserStateFixRatioFollowVideoViewHolder userStateFixRatioFollowVideoViewHolder = new UserStateFixRatioFollowVideoViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                userStateFixRatioFollowVideoViewHolder.f77594aT = this;
                return userStateFixRatioFollowVideoViewHolder;
            case 2:
                return new MomentFollowFeedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
            case 3:
            case 9:
                UserStateInsFollowVideoViewHolder userStateInsFollowVideoViewHolder = new UserStateInsFollowVideoViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                userStateInsFollowVideoViewHolder.f77594aT = this;
                return userStateInsFollowVideoViewHolder;
            case 4:
                UserStateInsFollowVideoViewHolderPlanA userStateInsFollowVideoViewHolderPlanA = new UserStateInsFollowVideoViewHolderPlanA((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                userStateInsFollowVideoViewHolderPlanA.f77594aT = this;
                return userStateInsFollowVideoViewHolderPlanA;
            case 5:
                UserStateInsFollowVideoViewHolderPlanB userStateInsFollowVideoViewHolderPlanB = new UserStateInsFollowVideoViewHolderPlanB((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                userStateInsFollowVideoViewHolderPlanB.f77594aT = this;
                return userStateInsFollowVideoViewHolderPlanB;
            case 6:
                UserStateInsFollowVideoViewHolderPlanC userStateInsFollowVideoViewHolderPlanC = new UserStateInsFollowVideoViewHolderPlanC((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                userStateInsFollowVideoViewHolderPlanC.f77594aT = this;
                return userStateInsFollowVideoViewHolderPlanC;
            case 7:
                UserStateInsFollowVideoViewHolderPlanD userStateInsFollowVideoViewHolderPlanD = new UserStateInsFollowVideoViewHolderPlanD((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i, this.f58239D);
                userStateInsFollowVideoViewHolderPlanD.f77594aT = this;
                return userStateInsFollowVideoViewHolderPlanD;
            default:
                UserStateFlowItemVideoViewHolder userStateFlowItemVideoViewHolder = new UserStateFlowItemVideoViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58245i);
                userStateFlowItemVideoViewHolder.f77594aT = this;
                return userStateFlowItemVideoViewHolder;
        }
    }

    /* renamed from: d */
    public final BaseForwardViewHolder mo58058d(ViewGroup viewGroup) {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (a) {
            case 1:
            case 8:
                UserStateFixRatioForwardImageViewHolder userStateFixRatioForwardImageViewHolder = new UserStateFixRatioForwardImageViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                return userStateFixRatioForwardImageViewHolder;
            case 2:
                MomentForwardFeedViewHolder momentForwardFeedViewHolder = new MomentForwardFeedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return momentForwardFeedViewHolder;
            case 3:
            case 9:
                UserStateInsForwardImageViewHolder userStateInsForwardImageViewHolder = new UserStateInsForwardImageViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                return userStateInsForwardImageViewHolder;
            case 4:
                UserStateInsForwardImageViewHolderPlanA userStateInsForwardImageViewHolderPlanA = new UserStateInsForwardImageViewHolderPlanA((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                return userStateInsForwardImageViewHolderPlanA;
            case 5:
                UserStateInsForwardImageViewHolderPlanB userStateInsForwardImageViewHolderPlanB = new UserStateInsForwardImageViewHolderPlanB((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                return userStateInsForwardImageViewHolderPlanB;
            case 6:
                UserStateInsForwardImageViewHolderPlanC userStateInsForwardImageViewHolderPlanC = new UserStateInsForwardImageViewHolderPlanC((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                return userStateInsForwardImageViewHolderPlanC;
            case 7:
                UserStateInsForwardImageViewHolderPlanD userStateInsForwardImageViewHolderPlanD = new UserStateInsForwardImageViewHolderPlanD((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                return userStateInsForwardImageViewHolderPlanD;
            default:
                UserStateFlowItemForwardImageViewHolder userStateFlowItemForwardImageViewHolder = new UserStateFlowItemForwardImageViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return userStateFlowItemForwardImageViewHolder;
        }
    }

    /* renamed from: f */
    public final C1293v mo58062f(ViewGroup viewGroup) {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (a) {
            case 1:
            case 8:
                FixRatioForwardDeletedViewHolder fixRatioForwardDeletedViewHolder = new FixRatioForwardDeletedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return fixRatioForwardDeletedViewHolder;
            case 2:
                MomentForwardDeletedViewHolder momentForwardDeletedViewHolder = new MomentForwardDeletedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return momentForwardDeletedViewHolder;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
                InsFollowDeletedViewHolder insFollowDeletedViewHolder = new InsFollowDeletedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return insFollowDeletedViewHolder;
            default:
                ForwardTextViewHolder forwardTextViewHolder = new ForwardTextViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return forwardTextViewHolder;
        }
    }

    /* renamed from: e */
    public final BaseForwardViewHolder mo58059e(ViewGroup viewGroup) {
        int a = C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false);
        switch (a) {
            case 1:
            case 8:
                UserStateFixRatioForwardVideoViewHolder userStateFixRatioForwardVideoViewHolder = new UserStateFixRatioForwardVideoViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                userStateFixRatioForwardVideoViewHolder.mo76069a((C21746d) this);
                return userStateFixRatioForwardVideoViewHolder;
            case 2:
                MomentForwardFeedViewHolder momentForwardFeedViewHolder = new MomentForwardFeedViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                return momentForwardFeedViewHolder;
            case 3:
            case 9:
                UserStateInsForwardVideoViewHolder userStateInsForwardVideoViewHolder = new UserStateInsForwardVideoViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                userStateInsForwardVideoViewHolder.mo76069a((C21746d) this);
                return userStateInsForwardVideoViewHolder;
            case 4:
                UserStateInsForwardVideoViewHolderPlanA userStateInsForwardVideoViewHolderPlanA = new UserStateInsForwardVideoViewHolderPlanA((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                userStateInsForwardVideoViewHolderPlanA.mo76069a((C21746d) this);
                return userStateInsForwardVideoViewHolderPlanA;
            case 5:
                UserStateInsForwardVideoViewHolderPlanB userStateInsForwardVideoViewHolderPlanB = new UserStateInsForwardVideoViewHolderPlanB((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                userStateInsForwardVideoViewHolderPlanB.mo76069a((C21746d) this);
                return userStateInsForwardVideoViewHolderPlanB;
            case 6:
                UserStateInsForwardVideoViewHolderPlanC userStateInsForwardVideoViewHolderPlanC = new UserStateInsForwardVideoViewHolderPlanC((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                userStateInsForwardVideoViewHolderPlanC.mo76069a((C21746d) this);
                return userStateInsForwardVideoViewHolderPlanC;
            case 7:
                UserStateInsForwardVideoViewHolderPlanD userStateInsForwardVideoViewHolderPlanD = new UserStateInsForwardVideoViewHolderPlanD((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i, this.f58239D);
                userStateInsForwardVideoViewHolderPlanD.mo76069a((C21746d) this);
                return userStateInsForwardVideoViewHolderPlanD;
            default:
                UserStateFlowItemForwardVideoViewHolder userStateFlowItemForwardVideoViewHolder = new UserStateFlowItemForwardVideoViewHolder((FollowFeedLayout) inflate, this.f58247k, this.f58241e, this.f58244h, this.f58245i);
                userStateFlowItemForwardVideoViewHolder.mo76069a((C21746d) this);
                return userStateFlowItemForwardVideoViewHolder;
        }
    }

    public UserStateFeedAdapter(RecyclerView recyclerView, boolean z) {
        super(recyclerView);
        this.f58239D = z;
        this.f58237B = "trends";
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C1293v a = super.mo58032a(viewGroup, i);
        if (a instanceof BaseForwardViewHolder) {
            ((BaseForwardViewHolder) a).mo76025b(2);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo58036a(Aweme aweme, String str) {
        if (aweme != null && TextUtils.equals(str, this.f58251z)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f58248w.getLayoutManager();
            for (FollowFeed followFeed : this.f67539l) {
                if (followFeed.getAweme() != null && followFeed.getFeedType() == 65280 && TextUtils.equals(followFeed.getAweme().getAid(), aweme.getAid())) {
                    linearLayoutManager.mo5417a(this.f67539l.indexOf(followFeed), 0);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58042a(String str, Aweme aweme, int i) {
        mo62316a(new FollowFeed(aweme), i);
        int d = mo58057d(str);
        m72695a(mo58050b(d));
        C1293v f = this.f58248w.mo5575f(d);
        if (f instanceof BaseFollowViewHolder) {
            ((BaseFollowViewHolder) f).mo68532m();
            return;
        }
        if (f instanceof BaseForwardViewHolder) {
            ((BaseForwardViewHolder) f).mo76008E();
        }
    }
}
