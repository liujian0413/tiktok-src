package com.p280ss.android.ugc.aweme.i18n.checkprofile;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.CheckProfileAdapter */
public class CheckProfileAdapter extends BaseAdapter<User> {

    /* renamed from: a */
    private C30440a f79976a;

    /* renamed from: com.ss.android.ugc.aweme.i18n.checkprofile.CheckProfileAdapter$a */
    public interface C30440a {
        /* renamed from: a */
        void mo80112a(User user);
    }

    /* renamed from: a */
    public final List<User> mo62312a() {
        if (super.mo62312a() == null) {
            return new ArrayList();
        }
        return super.mo62312a();
    }

    CheckProfileAdapter(C30440a aVar) {
        this.f79976a = aVar;
    }

    /* renamed from: b */
    public static void m99439b(int i) {
        m99438a(i, "click");
    }

    /* renamed from: c */
    private static void m99440c(int i) {
        m99438a(i, "show");
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C30442b) {
            m99440c(vVar.getAdapterPosition());
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new C30442b(viewGroup);
    }

    /* renamed from: a */
    private static void m99438a(int i, String str) {
        C6907h.m21524a("notification_message_folded_message", (Map) C22984d.m75611a().mo59973a("action_type", str).mo59973a("account_type", "check_profile").mo59970a("client_order", i).f60753a);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar instanceof C30442b) {
            ((C30442b) vVar).mo80119a((User) this.f67539l.get(i), this.f79976a);
        }
    }
}
