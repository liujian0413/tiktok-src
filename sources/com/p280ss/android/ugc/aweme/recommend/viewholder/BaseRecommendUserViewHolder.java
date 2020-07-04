package com.p280ss.android.ugc.aweme.recommend.viewholder;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.metrics.C33238ak;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.BaseRecommendUserViewHolder */
public abstract class BaseRecommendUserViewHolder extends RecommendItemViewHolder<User> {

    /* renamed from: a */
    public final DataCenter f97187a;

    /* renamed from: b */
    private final ViewStub f97188b;

    /* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.BaseRecommendUserViewHolder$a */
    static final class C37142a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ User f97189a;

        C37142a(User user) {
            this.f97189a = user;
        }

        public final /* synthetic */ Object call() {
            m119411a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m119411a() {
            try {
                DiscoverApi.m87297b(this.f97189a.getUid());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public abstract int mo93623b();

    /* renamed from: c */
    public void mo93625c() {
    }

    /* renamed from: d */
    public void mo93627d() {
    }

    /* renamed from: e */
    public void mo93628e() {
    }

    /* renamed from: h */
    private final void m119398h() {
        this.f97188b.setLayoutResource(mo93623b());
        this.f97188b.inflate();
    }

    /* renamed from: g */
    private FragmentActivity mo93634g() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        Context context = view.getContext();
        if (context != null) {
            return (FragmentActivity) context;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: i */
    private String m119399i() {
        DataCenter dataCenter = this.f97187a;
        if (dataCenter != null) {
            String str = (String) dataCenter.mo60135a("key_previous_page");
            if (str != null) {
                return str;
            }
        }
        return "others_homepage";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Context mo93619a() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        return context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo93629f() {
        DataCenter dataCenter = this.f97187a;
        if (dataCenter != null) {
            String str = (String) dataCenter.mo60135a("key_enter_from");
            if (str != null) {
                return str;
            }
        }
        return "find_friends";
    }

    /* renamed from: a */
    public final void mo93620a(User user) {
        if (user != null) {
            new C33276r().mo85322o(user.getUid()).mo85310b(mo93629f()).mo85319i(m119399i()).mo85320j("card").mo85252e();
        }
    }

    /* renamed from: b */
    public final void mo93624b(User user) {
        String str;
        if (user != null) {
            if (user.getFollowStatus() == 0) {
                str = "follow";
            } else {
                str = "follow_cancel";
            }
            new C33280v(str).mo85345e(m119399i()).mo85341b(mo93629f()).mo85343c("follow_button").mo85348g(user.getUid()).mo85349i("card").mo85252e();
        }
    }

    public BaseRecommendUserViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1t, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(\n   …user_view, parent, false)");
        super(inflate);
        C0065w a = C0069x.m159a(mo93634g());
        FragmentActivity g = mo93634g();
        if (g != null) {
            this.f97187a = DataCenter.m75849a(a, (C0043i) g);
            View findViewById = this.itemView.findViewById(R.id.a20);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.content_container)");
            this.f97188b = (ViewStub) findViewById;
            m119398h();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* renamed from: c */
    public void mo93626c(User user) {
        if (user != null) {
            UserProfileActivity.m117386a(mo93619a(), C42914ab.m136242a().mo104633a("uid", user.getUid()).mo104633a("sec_user_id", user.getSecUid()).mo104633a("enter_from", mo93629f()).mo104633a("enter_from_request_id", user.getRequestId()).mo104630a("need_track_compare_recommend_reason", 1).mo104633a("previous_recommend_reason", user.getRecommendReason()).mo104633a("recommend_from_type", "list").f111445a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo93622a(User user, boolean z) {
        if (user != null) {
            C1592h.m7853a((Callable<TResult>) new C37142a<TResult>(user));
            if (z) {
                C10761a.m31409e(mo93619a(), (int) R.string.tu).mo25750a();
            }
        }
    }

    /* renamed from: a */
    public void mo93621a(User user, String str, int i) {
        C7573i.m23587b(str, "eventType");
        if (user != null) {
            new C33238ak(null, 1, null).mo85095a(user.getUid()).mo85097b(mo93629f()).mo85098c(str).mo85093a(i).mo85099d(user.getRequestId()).mo85100e(user.getRecommendReason()).mo85101f("card").mo85102g("nonempty").mo85252e();
        }
    }
}
