package com.p280ss.android.ugc.aweme.notification.newstyle.adapter;

import android.app.Activity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.C34542a;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.viewholder.FollowRequestHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.viewholder.FollowRequestHolder.C34548a;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.MusTimestampTitleItem;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTTimestampTitleHolder;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.MusFollowRequestAdapter */
public final class MusFollowRequestAdapter extends BaseAdapter<User> implements C34548a {

    /* renamed from: b */
    public static final C34506a f90007b = new C34506a(null);

    /* renamed from: a */
    public int f90008a;

    /* renamed from: c */
    private final C34542a f90009c;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.MusFollowRequestAdapter$a */
    public static final class C34506a {
        private C34506a() {
        }

        public /* synthetic */ C34506a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo58045a(List<User> list) {
        super.mo58045a(list);
    }

    /* renamed from: b */
    public final void mo61577b(List<? extends User> list) {
        super.mo61577b(list);
    }

    public MusFollowRequestAdapter(C34542a aVar) {
        C7573i.m23587b(aVar, "mActivity");
        this.f90009c = aVar;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (mo62312a().get(i) instanceof MusTimestampTitleItem) {
            return 14;
        }
        return super.mo58029a(i);
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        int c = C0683b.m2912c(viewGroup.getContext(), R.color.a53);
        this.f67550q = c;
        C1293v a_ = super.mo61886a_(viewGroup);
        DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
        dmtTextView.setGravity(17);
        dmtTextView.setTextColor(c);
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setText(R.string.bnk);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25963b((View) dmtTextView));
            C7573i.m23582a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        if (mo58029a(i) != 14) {
            ((FollowRequestHolder) vVar).mo87852a((User) mo62312a().get(i));
            return;
        }
        MTTimestampTitleHolder mTTimestampTitleHolder = (MTTimestampTitleHolder) vVar;
        Object obj = mo62312a().get(i);
        if (obj != null) {
            mTTimestampTitleHolder.mo87877a((MusTimestampTitleItem) obj);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.model.MusTimestampTitleItem");
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i != 14) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w2, viewGroup, false);
            C34542a aVar = this.f90009c;
            if (aVar != null) {
                return new FollowRequestHolder(inflate, (Activity) aVar, this);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.af8, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "view");
        return new MTTimestampTitleHolder(inflate2);
    }

    /* renamed from: a */
    public final void mo87816a(User user, int i, int i2) {
        C7573i.m23587b(user, "user");
        if (i >= 0 && i < mo62312a().size()) {
            mo62312a().remove(i);
            boolean z = false;
            int i3 = i - 1;
            if (i3 >= 0 && mo58029a(i3) == 14 && (i >= mo62312a().size() || mo58029a(i) == 14)) {
                mo62312a().remove(i3);
                z = true;
            }
            if (mo62312a().isEmpty()) {
                notifyDataSetChanged();
                this.f90009c.mo87781a();
            } else if (z) {
                notifyItemRangeRemoved(i3, 2);
            } else {
                notifyItemRemoved(i);
            }
        }
    }
}
