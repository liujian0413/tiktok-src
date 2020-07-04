package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.HeadViewAdapter */
public final class HeadViewAdapter extends C1262a<HeadHolder> {

    /* renamed from: a */
    public static final C34386a f89738a = new C34386a(null);

    /* renamed from: b */
    private final List<User> f89739b = new ArrayList();

    /* renamed from: c */
    private final int f89740c = ((int) C9738o.m28708b(C6399b.m19921a(), 27.0f));

    /* renamed from: d */
    private final Activity f89741d;

    /* renamed from: e */
    private final int f89742e = 4;

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.HeadViewAdapter$a */
    public static final class C34386a {
        private C34386a() {
        }

        public /* synthetic */ C34386a(C7571f fVar) {
            this();
        }
    }

    public final int getItemCount() {
        return this.f89739b.size();
    }

    /* renamed from: a */
    public final void mo87663a(List<? extends User> list) {
        C7573i.m23587b(list, "data");
        this.f89739b.clear();
        this.f89739b.addAll(C7525m.m23505c((Iterable<? extends T>) list, this.f89742e));
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(HeadHolder headHolder, int i) {
        C7573i.m23587b(headHolder, "holder");
        headHolder.mo87661a((User) this.f89739b.get(i));
    }

    public HeadViewAdapter(Activity activity, int i) {
        C7573i.m23587b(activity, "mActivity");
        this.f89741d = activity;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public HeadHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        AvatarImageWithVerify avatarImageWithVerify = new AvatarImageWithVerify(viewGroup.getContext());
        avatarImageWithVerify.setLayoutParams(new LayoutParams(this.f89740c, this.f89740c));
        return new HeadHolder(this.f89741d, avatarImageWithVerify);
    }
}
