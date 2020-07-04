package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolder.C36633a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolder.C36634b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapter */
public class RecommendUserAdapter extends BaseAdapter<User> {

    /* renamed from: a */
    public int f96159a;

    /* renamed from: b */
    public C36630b f96160b;

    /* renamed from: c */
    public C36629a f96161c;

    /* renamed from: d */
    public C25663d f96162d;

    /* renamed from: e */
    public String f96163e;

    /* renamed from: f */
    public int f96164f;

    /* renamed from: g */
    public Map<String, Integer> f96165g = new HashMap();

    /* renamed from: h */
    public C36633a f96166h = new C36633a() {
        /* renamed from: a */
        public final void mo92946a(User user, int i) {
            if (i >= 0 && i < RecommendUserAdapter.this.f67539l.size()) {
                RecommendUserAdapter.this.f67539l.remove(i);
                RecommendUserAdapter.this.notifyItemRemoved(i);
                if (RecommendUserAdapter.this.f96160b != null) {
                    RecommendUserAdapter.this.f96160b.mo72050a(user, i);
                    if (RecommendUserAdapter.this.f67539l.isEmpty()) {
                        RecommendUserAdapter.this.f96160b.mo72051b(user, i);
                    }
                }
                if (i != RecommendUserAdapter.this.f67539l.size()) {
                    RecommendUserAdapter recommendUserAdapter = RecommendUserAdapter.this;
                    recommendUserAdapter.notifyItemRangeChanged(i, recommendUserAdapter.f67539l.size() - i);
                }
                if (RecommendUserAdapter.this.f67566v) {
                    if (RecommendUserAdapter.this.f67539l.size() <= 10) {
                        RecommendUserAdapter.this.mo66516d(false);
                    } else {
                        RecommendUserAdapter.this.mo66516d(true);
                    }
                }
            }
        }
    };

    /* renamed from: i */
    public C36634b f96167i;

    /* renamed from: j */
    private boolean f96168j = false;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapter$a */
    public interface C36629a {
        /* renamed from: a */
        void mo92925a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapter$b */
    public interface C36630b {
        /* renamed from: a */
        void mo72050a(User user, int i);

        /* renamed from: b */
        void mo72051b(User user, int i);

        /* renamed from: c */
        void mo72052c(User user, int i);

        /* renamed from: d */
        void mo72053d(User user, int i);
    }

    /* renamed from: a */
    public final List<User> mo62312a() {
        return this.f67539l;
    }

    /* renamed from: a */
    public final void mo62313a(C1293v vVar) {
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (((User) this.f67539l.get(i)) instanceof RecommendContact) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    private User m118178b(int i) {
        if (this.f67539l == null || i < 0 || i >= this.f67539l.size()) {
            return null;
        }
        return (User) this.f67539l.get(i);
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1q, viewGroup, false);
        inflate.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (RecommendUserAdapter.this.f96161c != null) {
                    RecommendUserAdapter.this.f96161c.mo92925a();
                }
            }
        });
        return new EnterMoreViewHolder(inflate);
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (!(vVar instanceof RecommendUserCardViewHolder) || this.f96162d == null) {
            if ((vVar instanceof RecommendContactCardViewHolder) && !this.f96168j) {
                ((RecommendContactCardViewHolder) vVar).mo92940a();
                this.f96168j = true;
            }
            return;
        }
        this.f96162d.mo61737a(vVar);
    }

    /* renamed from: a */
    public final void mo92944a(FollowStatus followStatus) {
        if (this.f67539l != null && !this.f67539l.isEmpty() && followStatus != null && !TextUtils.isEmpty(followStatus.userId)) {
            int size = this.f67539l.size();
            int i = 0;
            while (i < size) {
                User user = (User) this.f67539l.get(i);
                if (user == null || !followStatus.userId.equals(user.getUid())) {
                    i++;
                } else {
                    user.setFollowStatus(followStatus.followStatus);
                    notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58045a(List<User> list) {
        if (list != null && list.size() != 0) {
            if (this.f67539l == null) {
                this.f67539l = new ArrayList();
            }
            this.f67539l.clear();
            this.f67539l.addAll(list);
            for (int i = 0; i < this.f67539l.size(); i++) {
                User user = (User) this.f67539l.get(i);
                if (!(user instanceof RecommendContact)) {
                    this.f96165g.put(user.getUid(), Integer.valueOf(i));
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar instanceof RecommendUserCardViewHolder) {
            ((RecommendUserCardViewHolder) vVar).mo92953a(m118178b(i), i, this.f96166h, this.f96167i, this.f96160b, this.f96159a, this.f96163e);
            return;
        }
        if (vVar instanceof RecommendContactCardViewHolder) {
            RecommendContactCardViewHolder recommendContactCardViewHolder = (RecommendContactCardViewHolder) vVar;
            recommendContactCardViewHolder.mo92941a((RecommendContact) m118178b(i), i);
            recommendContactCardViewHolder.f96145b = new C7563m<RecommendContact, Integer, C7581n>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C7581n invoke(RecommendContact recommendContact, Integer num) {
                    if (RecommendUserAdapter.this.f96166h != null) {
                        RecommendUserAdapter.this.f96166h.mo92946a(recommendContact, num.intValue());
                    }
                    return null;
                }
            };
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (C6399b.m19947w() && this.f96164f == 0) {
            return new RecommendUserCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1p, viewGroup, false), this.f96164f);
        }
        if (i == 1) {
            return new RecommendContactCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1n, viewGroup, false), this.f96164f);
        }
        return new RecommendUserCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1n, viewGroup, false), this.f96164f);
    }
}
