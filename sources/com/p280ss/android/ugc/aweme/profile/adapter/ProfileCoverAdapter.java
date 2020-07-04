package com.p280ss.android.ugc.aweme.profile.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.ProfileCoverAdapter */
public class ProfileCoverAdapter extends BaseAdapter<UrlModel> {

    /* renamed from: a */
    public C35706a f93646a;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.ProfileCoverAdapter$a */
    public interface C35706a {
        /* renamed from: a */
        void mo90554a(UrlModel urlModel);
    }

    /* renamed from: a */
    public final int mo58030a(View view) {
        return (int) C9738o.m28708b(view.getContext(), 24.0f);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new ProfileCoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wi, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        User curUser = C21115b.m71197a().getCurUser();
        boolean z = false;
        if (!C6307b.m19566a((Collection<T>) curUser.getCoverUrls())) {
            z = TextUtils.equals(((UrlModel) this.f67539l.get(i)).getUri(), ((UrlModel) curUser.getCoverUrls().get(0)).getUri());
        }
        ((ProfileCoverViewHolder) vVar).mo90555a((UrlModel) this.f67539l.get(i), z, this.f93646a);
    }
}
