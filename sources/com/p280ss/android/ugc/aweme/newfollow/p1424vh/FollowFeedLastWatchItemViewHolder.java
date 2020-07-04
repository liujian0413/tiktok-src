package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.follow.C29436a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder */
public final class FollowFeedLastWatchItemViewHolder extends C1293v {

    /* renamed from: a */
    public static final C34231a f89275a = new C34231a(null);

    /* renamed from: b */
    private final DmtTextView f89276b;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder$a */
    public static final class C34231a {
        private C34231a() {
        }

        public /* synthetic */ C34231a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FollowFeedLastWatchItemViewHolder m110569a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vv, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new FollowFeedLastWatchItemViewHolder(inflate);
        }
    }

    public FollowFeedLastWatchItemViewHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        view.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            public final void onViewDetachedFromWindow(View view) {
            }

            public final void onViewAttachedToWindow(View view) {
                C34138b.m110017f();
            }
        });
        View findViewById = view.findViewById(R.id.e4q);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_watch_history)");
        this.f89276b = (DmtTextView) findViewById;
    }

    /* renamed from: a */
    public final void mo86980a(FollowFeed followFeed) {
        CharSequence charSequence;
        DmtTextView dmtTextView = this.f89276b;
        if (followFeed != null) {
            C29436a lastViewData = followFeed.getLastViewData();
            if (lastViewData != null) {
                String str = lastViewData.f77633b;
                if (str != null) {
                    charSequence = str;
                    dmtTextView.setText(charSequence);
                }
            }
        }
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        charSequence = view.getContext().getString(R.string.byj);
        dmtTextView.setText(charSequence);
    }
}
