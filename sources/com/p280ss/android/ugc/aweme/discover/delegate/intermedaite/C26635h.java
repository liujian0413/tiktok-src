package com.p280ss.android.ugc.aweme.discover.delegate.intermedaite;

import android.app.Activity;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchUserViewHolder;
import com.p280ss.android.ugc.aweme.discover.delegate.intermedaite.C26632g.C26633a;
import com.p280ss.android.ugc.aweme.discover.mob.C26807z;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestUser;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.C29748a;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.delegate.intermedaite.h */
public final class C26635h extends C26633a implements C29748a {

    /* renamed from: d */
    private Activity f70224d;

    public C26635h(SearchSquareAdapter<?> searchSquareAdapter) {
        C7573i.m23587b(searchSquareAdapter, "adapter");
        super(searchSquareAdapter);
    }

    /* renamed from: a */
    public final C1293v mo68320a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        this.f70224d = C23487o.m77158e(viewGroup);
        SearchUserViewHolder a = SearchUserViewHolder.m87108a(viewGroup, this);
        C7573i.m23582a((Object) a, "SearchUserViewHolder.create(parent, this)");
        return a;
    }

    /* renamed from: a */
    public final boolean mo68090a(User user) {
        String str;
        C7573i.m23587b(user, "user");
        if (user.getFollowStatus() == 0) {
            new C33280v("follow").mo85341b("search_for_you_list").mo85348g(user.getUid()).mo85252e();
        } else {
            new C33280v("follow_cancel").mo85341b("search_for_you_list").mo85348g(user.getUid()).mo85252e();
        }
        if (user.getFollowStatus() == 0) {
            str = "search_follow";
        } else {
            str = "search_follow_cancel";
        }
        String str2 = str;
        C26807z zVar = C26807z.f70733a;
        String uid = user.getUid();
        C7573i.m23582a((Object) uid, "user.uid");
        zVar.mo68584a(str2, uid, "search_for_you_list", true, "");
        return true;
    }

    /* renamed from: a */
    public final void mo68088a(User user, int i) {
        C7573i.m23587b(user, "user");
        if (this.f70224d != null) {
            C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "search_for_you_list").mo59973a("to_user_id", user.getUid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(user.getRequestId())).mo59970a(POIService.KEY_ORDER, mo68324a((Object) user)).f60753a);
            UserProfileActivity.m117388a((Context) this.f70224d, user, "search_for_you_list");
        }
    }

    /* renamed from: a */
    public final void mo68321a(List<? extends Object> list, int i, C1293v vVar, List<Object> list2) {
        C7573i.m23587b(list, "items");
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list2, "payloads");
        Object obj = list.get(i);
        if (obj != null) {
            ((SearchUserViewHolder) vVar).mo68095a((SuggestUser) obj);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.SuggestUser");
    }
}
