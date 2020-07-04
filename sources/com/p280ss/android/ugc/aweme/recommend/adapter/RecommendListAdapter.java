package com.p280ss.android.ugc.aweme.recommend.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.recommend.viewholder.BaseRecommendUserViewHolder;
import com.p280ss.android.ugc.aweme.recommend.viewholder.RecommendCommonUserViewHolderV1;
import com.p280ss.android.ugc.aweme.recommend.viewholder.RecommendFamiliarFeedUserViewHolder;
import com.p280ss.android.ugc.aweme.recommend.viewholder.RecommendFeedFamiliarUserViewHolder;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.adapter.RecommendListAdapter */
public class RecommendListAdapter extends BaseAdapter<User> {

    /* renamed from: a */
    private final int f97161a;

    public RecommendListAdapter(int i) {
        this.f97161a = i;
    }

    /* renamed from: a */
    public int mo58029a(int i) {
        switch (this.f97161a) {
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final User mo93605b(int i) {
        List a = mo62312a();
        if (a == null || i < 0 || i >= a.size()) {
            return null;
        }
        return (User) mo62312a().get(i);
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof BaseRecommendUserViewHolder) {
            ((BaseRecommendUserViewHolder) vVar).mo93628e();
        }
    }

    /* renamed from: a */
    public final int mo93604a(String str) {
        List<User> a = mo62312a();
        if (a == null) {
            return -1;
        }
        int i = 0;
        for (User user : a) {
            CharSequence charSequence = str;
            C7573i.m23582a((Object) user, "it");
            if (TextUtils.equals(charSequence, user.getUid())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        switch (i) {
            case 3:
                return new RecommendFamiliarFeedUserViewHolder(viewGroup);
            case 4:
                return new RecommendFeedFamiliarUserViewHolder(viewGroup);
            default:
                return new RecommendCommonUserViewHolderV1(viewGroup);
        }
    }

    /* renamed from: a */
    public void mo58033a(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        BaseRecommendUserViewHolder baseRecommendUserViewHolder = (BaseRecommendUserViewHolder) vVar;
        baseRecommendUserViewHolder.mo93633a(mo93605b(i));
        if (!(vVar instanceof RecommendFamiliarFeedUserViewHolder) || i >= mo60557c() - 1) {
            baseRecommendUserViewHolder.mo93627d();
        } else {
            baseRecommendUserViewHolder.mo93625c();
        }
    }
}
