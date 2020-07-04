package com.p280ss.android.ugc.aweme.flowfeed.adapter;

import android.graphics.Rect;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.LoadMoreViewHolder;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.feed.event.C28308ad;
import com.p280ss.android.ugc.aweme.feed.helper.C28418f;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29367b;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29369d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29371f;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29374h;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j.C29381a;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.BaseFollowViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.C29433v;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowImageViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowVideoViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21745c;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21746d;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29889i;
import com.p280ss.android.ugc.aweme.forward.p1272vh.BaseForwardViewHolder;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardImageViewHolder;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardTextViewHolder;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardVideoViewHolder;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42975bi;
import com.p280ss.android.ugc.aweme.utils.C43064dn;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.adapter.FlowFeedAdapter */
public class FlowFeedAdapter<T extends C34145b> extends RecyclerHeaderViewAdapter<T> implements C21745c, C21746d, C29381a {

    /* renamed from: A */
    public String f58236A;

    /* renamed from: B */
    public String f58237B;

    /* renamed from: C */
    public int f58238C;

    /* renamed from: D */
    protected boolean f58239D;

    /* renamed from: E */
    private int f58240E;

    /* renamed from: e */
    protected C29376j f58241e;

    /* renamed from: f */
    protected Set<BaseFollowViewHolder> f58242f;

    /* renamed from: g */
    protected Set<BaseForwardViewHolder> f58243g;

    /* renamed from: h */
    public C21747e f58244h;

    /* renamed from: i */
    public C21743a f58245i;

    /* renamed from: j */
    public C25663d f58246j;

    /* renamed from: k */
    public C21744b f58247k;

    /* renamed from: w */
    protected RecyclerView f58248w;

    /* renamed from: x */
    public String f58249x;

    /* renamed from: y */
    public String f58250y;

    /* renamed from: z */
    public String f58251z;

    /* renamed from: a */
    public void mo58036a(Aweme aweme, String str) {
    }

    /* renamed from: a */
    public void mo58039a(String str) {
    }

    /* renamed from: a */
    public void mo58042a(String str, Aweme aweme, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public List<T> mo58060e(List<T> list) {
        return list;
    }

    /* renamed from: e */
    public boolean mo58061e(int i) {
        return true;
    }

    /* renamed from: l */
    public final C21745c mo58066l() {
        return this;
    }

    /* renamed from: m */
    public boolean mo58067m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo58068n() {
        return true;
    }

    /* renamed from: a */
    public final void mo58035a(Aweme aweme) {
        C0902i a = C43064dn.m136619a(this.f58248w);
        for (int intValue = ((Integer) a.f3154a).intValue(); intValue <= ((Integer) a.f3155b).intValue(); intValue++) {
            if (intValue >= 0 && intValue < mo62312a().size() && ((C34145b) mo62312a().get(intValue)).getFeedType() == 65280) {
                Aweme aweme2 = ((C34145b) mo62312a().get(intValue)).getAweme();
                if (!(aweme2 == null || aweme2.getAid() == null || aweme2.getAid().equals(aweme.getAid()))) {
                    C1293v f = this.f58248w.mo5575f(intValue);
                    if (f != null && (f instanceof FollowVideoViewHolder)) {
                        FollowVideoViewHolder followVideoViewHolder = (FollowVideoViewHolder) f;
                        if (followVideoViewHolder.f77521aj) {
                            followVideoViewHolder.mo75311ai();
                        }
                    }
                    if (f != null && (f instanceof ForwardVideoViewHolder)) {
                        ForwardVideoViewHolder forwardVideoViewHolder = (ForwardVideoViewHolder) f;
                        if (forwardVideoViewHolder.f78555I) {
                            ((C29889i) forwardVideoViewHolder.f78560N).mo75935m();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58038a(Exception exc, Aweme aweme, int i) {
        C1293v e = m72698e(aweme);
        if (e instanceof C29433v) {
            ((C29433v) e).mo75265b(aweme);
        }
        C22814a.m75245a(this.f58247k.mo58074c(), exc, i == 1 ? R.string.apd : R.string.fjf);
    }

    /* renamed from: a */
    public final void mo58041a(String str, Comment comment) {
        int d = mo58057d(str);
        if (d >= 0) {
            m72696a(mo58050b(d), -1);
            C29369d.m96462a(mo58050b(d), comment);
            C1293v f = this.f58248w.mo5575f(d);
            if (f != null && (f instanceof C29433v)) {
                C29433v vVar = (C29433v) f;
                vVar.mo75230F();
                vVar.mo75266c(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo58040a(String str, int i) {
        int d = mo58057d(str);
        if (d >= 0) {
            m72696a(mo58050b(d), i);
            C1293v f = this.f58248w.mo5575f(d);
            if (f != null && (f instanceof C29433v)) {
                ((C29433v) f).mo75230F();
            }
        }
    }

    /* renamed from: a */
    public final void mo58044a(String str, String str2, int i) {
        int d = mo58057d(str);
        if (d >= 0) {
            int a = C29369d.m96461a(mo58050b(d), str2, i);
            C1293v f = this.f58248w.mo5575f(d);
            if (a >= 0 && (f instanceof C29433v)) {
                ((C29433v) f).mo75271e(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo58043a(String str, String str2) {
        int d = mo58057d(str);
        if (d >= 0) {
            int a = C29369d.m96460a(mo58050b(d), str2);
            C1293v f = this.f58248w.mo5575f(d);
            if (a >= 0 && (f instanceof C29433v)) {
                ((C29433v) f).mo75269d(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo58046a(boolean z, Aweme aweme) {
        int i;
        if (z) {
            if (aweme != null) {
                Rect d = m72697d(aweme);
                if (d != null) {
                    int[] iArr = new int[2];
                    this.f58248w.getLocationOnScreen(iArr);
                    i = d.top - iArr[1];
                    this.f58240E = i;
                }
            }
            i = 0;
            this.f58240E = i;
        } else {
            i = -this.f58240E;
            this.f58240E = 0;
        }
        if (this.f58248w != null) {
            this.f58248w.mo5521a(0, i);
        }
    }

    /* renamed from: a */
    public final void mo58037a(Aweme aweme, boolean z, String str, long j) {
        if (aweme != null && TextUtils.equals(str, this.f58251z)) {
            String a = C29370e.m96465a(this.f58247k.mo58075d(), aweme.getAid());
            C29370e c = C29371f.m96475a().mo75106c(a);
            if (c == null) {
                c = new C29370e(aweme, new C42975bi(1), a);
            }
            c.f77402g = C28418f.m93413a().f74931a;
            C28418f.m93413a().f74931a = null;
            c.f77397b = z ? 3 : 4;
            if (j > 0) {
                c.mo75091a(j);
            }
            C29371f.m96475a().mo75103a(a, c);
        }
    }

    /* renamed from: a */
    public void mo58045a(List<T> list) {
        super.mo58045a(mo58060e(list));
    }

    /* renamed from: k */
    public void mo58065k() {
        if (this.f58241e != null) {
            this.f58241e.mo75121f();
        }
    }

    public void aW_() {
        if (!C6307b.m19566a((Collection<T>) this.f58242f)) {
            for (BaseFollowViewHolder X : this.f58242f) {
                X.mo75248X();
            }
        }
        if (!C6307b.m19566a((Collection<T>) this.f58243g)) {
            for (BaseForwardViewHolder aW_ : this.f58243g) {
                aW_.aW_();
            }
        }
    }

    /* renamed from: j */
    public void mo58064j() {
        if (!C6307b.m19566a((Collection<T>) this.f58242f)) {
            for (BaseFollowViewHolder Z : this.f58242f) {
                Z.mo75250Z();
            }
        }
        if (!C6307b.m19566a((Collection<T>) this.f58243g)) {
            for (BaseForwardViewHolder j : this.f58243g) {
                j.mo58064j();
            }
        }
        if (this.f58241e != null) {
            this.f58241e.mo75123h();
        }
    }

    public FlowFeedAdapter(RecyclerView recyclerView) {
        this(recyclerView, null);
    }

    /* renamed from: d */
    private Rect m72697d(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        C1293v e = m72698e(aweme);
        if (e != null) {
            return C43064dn.m136618a(e);
        }
        return null;
    }

    /* renamed from: g */
    private C1293v m72700g(ViewGroup viewGroup) {
        return new C1293v(new View(viewGroup.getContext())) {
        };
    }

    /* renamed from: a */
    public int mo58030a(View view) {
        if (view == null) {
            return 0;
        }
        return (int) C9738o.m28708b(view.getContext(), 95.0f);
    }

    /* renamed from: b */
    public void mo58051b(View view) {
        view.setPadding(0, 0, 0, (int) C9738o.m28708b(view.getContext(), 40.5f));
    }

    /* renamed from: c */
    public final void mo58056c(Aweme aweme) {
        C1293v e = m72698e(aweme);
        if (e != null && (e instanceof BaseFollowViewHolder)) {
            ((BaseFollowViewHolder) e).mo75268c(aweme);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void mo58063f(int i) {
        try {
            if (this.f67539l.size() == 0) {
                notifyDataSetChanged();
            } else {
                notifyItemRemoved(i);
            }
        } catch (Exception e) {
            C6921a.m21556a("FeedAdapter_NotifyRemove_Crash", e);
        }
    }

    /* renamed from: a */
    public final void mo58034a(C28308ad adVar) {
        C1293v e = m72698e(adVar.f74617b);
        if (e != null && (e instanceof C29433v)) {
            C29433v vVar = (C29433v) e;
            vVar.mo75258a(adVar.f74617b.getStatus(), adVar.f74616a.labelPrivate);
            vVar.mo75228D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public BaseFollowViewHolder mo58049b(ViewGroup viewGroup) {
        return new FollowImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f58247k, this.f58241e, this.f58245i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public BaseFollowViewHolder mo58054c(ViewGroup viewGroup) {
        FollowVideoViewHolder followVideoViewHolder = new FollowVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f58247k, this.f58241e, this.f58245i);
        followVideoViewHolder.f77594aT = this;
        return followVideoViewHolder;
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof BaseFollowViewHolder) {
            this.f58242f.remove(vVar);
        }
        if (vVar instanceof BaseForwardViewHolder) {
            this.f58243g.remove(vVar);
        }
    }

    /* renamed from: a */
    public static void m72695a(C34145b bVar) {
        if (bVar != null) {
            Aweme aweme = bVar.getAweme();
            if (aweme != null) {
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    statistics.setForwardCount(statistics.getForwardCount() + 1);
                } else {
                    statistics = new AwemeStatistics();
                    statistics.setForwardCount(1);
                }
                aweme.setStatistics(statistics);
            }
        }
    }

    /* renamed from: b */
    public final C34145b mo58050b(int i) {
        if (i < 0 || i >= mo60557c() || this.f67539l == null) {
            return null;
        }
        return (C34145b) this.f67539l.get(i);
    }

    /* renamed from: c */
    public final void mo58055c(int i) {
        if (this.f67539l != null) {
            this.f67539l.remove(i);
            if (this.f58248w.mo5606i()) {
                this.f58248w.post(new C21742a(this, i));
            } else {
                mo58063f(i);
            }
            this.f58241e.mo75114a(500);
        }
    }

    /* renamed from: d */
    public final int mo58057d(String str) {
        if (mo62312a() == null) {
            return -1;
        }
        for (int i = 0; i < mo62312a().size(); i++) {
            C34145b b = mo58050b(i);
            if (b.getAweme() != null && TextUtils.equals(b.getAweme().getAid(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public BaseForwardViewHolder mo58059e(ViewGroup viewGroup) {
        ForwardVideoViewHolder forwardVideoViewHolder = new ForwardVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f58247k, this.f58241e, this.f58244h, this.f58245i);
        forwardVideoViewHolder.mo76069a((C21746d) this);
        return forwardVideoViewHolder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C1293v mo58062f(ViewGroup viewGroup) {
        ForwardTextViewHolder forwardTextViewHolder = new ForwardTextViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f58247k, this.f58241e, this.f58244h, this.f58245i);
        return forwardTextViewHolder;
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (this.f58246j != null) {
            this.f58246j.mo61737a(vVar);
        }
        if (vVar instanceof BaseFollowViewHolder) {
            this.f58242f.add((BaseFollowViewHolder) vVar);
        }
        if (vVar instanceof BaseForwardViewHolder) {
            this.f58243g.add((BaseForwardViewHolder) vVar);
        }
    }

    /* renamed from: e */
    private C1293v m72698e(Aweme aweme) {
        C0902i a = C43064dn.m136619a(this.f58248w);
        List a2 = mo62312a();
        if (C6307b.m19566a((Collection<T>) a2)) {
            return null;
        }
        for (int intValue = ((Integer) a.f3154a).intValue(); intValue <= ((Integer) a.f3155b).intValue(); intValue++) {
            if (intValue < a2.size() && intValue >= 0 && ((C34145b) mo62312a().get(intValue)).getFeedType() == 65280) {
                Aweme aweme2 = ((C34145b) a2.get(intValue)).getAweme();
                if (!(aweme2 == null || aweme2.getAid() == null || !aweme2.getAid().equals(aweme.getAid()))) {
                    return this.f58248w.mo5575f(intValue);
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    private static int m72699f(Aweme aweme) {
        if (aweme == null) {
            return -1;
        }
        if (aweme.isAwemeFromXiGua()) {
            return 24;
        }
        if (C29367b.m96458a(aweme)) {
            return 16;
        }
        if (aweme.getAwemeType() == 2) {
            return 17;
        }
        if (aweme.getAwemeType() == 13) {
            if (aweme.getForwardItem() == null) {
                return 20;
            }
            if (C29367b.m96458a(aweme.getForwardItem())) {
                return 18;
            }
            if (aweme.getForwardItem().getAwemeType() == 2) {
                return 19;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final Aweme mo58048b(Aweme aweme) {
        if (C6307b.m19566a((Collection<T>) this.f67539l) || aweme == null) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= this.f67539l.size()) {
                i = -1;
                break;
            }
            C34145b bVar = (C34145b) this.f67539l.get(i);
            if (bVar.getAweme() != null && m72699f(bVar.getAweme()) == 16 && TextUtils.equals(bVar.getAweme().getAid(), aweme.getAid())) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return null;
        }
        while (true) {
            i++;
            if (i >= this.f67539l.size()) {
                return null;
            }
            C34145b bVar2 = (C34145b) this.f67539l.get(i);
            if (bVar2.getAweme() != null && m72699f(bVar2.getAweme()) == 16) {
                return bVar2.getAweme();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public BaseForwardViewHolder mo58058d(ViewGroup viewGroup) {
        ForwardImageViewHolder forwardImageViewHolder = new ForwardImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f58247k, this.f58241e, this.f58244h, this.f58245i);
        return forwardImageViewHolder;
    }

    /* renamed from: a */
    public int mo58029a(int i) {
        if (this.f67539l == null) {
            return -1;
        }
        C34145b bVar = (C34145b) this.f67539l.get(i);
        if (bVar != null && bVar.getFeedType() == 65280) {
            return m72699f(bVar.getAweme());
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo58052b(String str) {
        int d = mo58057d(str);
        if (d >= 0) {
            Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
            if (awemeById != null) {
                mo58050b(d).getAweme().setUserDigg(awemeById.getUserDigg());
                mo58050b(d).getAweme().setStatistics(awemeById.getStatistics());
                C1293v e = m72698e(awemeById);
                if (e != null && (e instanceof C29433v)) {
                    ((C29433v) e).mo75231G();
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo58031a(User user) {
        if (mo62312a() == null || mo62312a().size() == 0) {
            return -1;
        }
        for (int i = 0; i < mo62312a().size(); i++) {
            C34145b b = mo58050b(i);
            if (b.getFeedType() == 65289) {
                User recommendUser = ((FollowFeed) b).getRecommendUser();
                if (recommendUser != null && recommendUser.equals(user)) {
                    return i;
                }
            } else if (b.getFeedType() == 65299) {
                User recommendUser2 = ((FollowFeed) b).getRecommendUser();
                if ((user instanceof RecommendContact) && (recommendUser2 instanceof RecommendContact)) {
                    return i;
                }
            } else {
                continue;
            }
        }
        return -1;
    }

    public FlowFeedAdapter(RecyclerView recyclerView, C29374h hVar) {
        this.f58242f = new LinkedHashSet();
        this.f58243g = new LinkedHashSet();
        this.f58248w = recyclerView;
        this.f58241e = new C29376j(recyclerView, hVar, this);
    }

    /* renamed from: a */
    private static void m72696a(C34145b bVar, int i) {
        if (bVar != null) {
            Aweme aweme = bVar.getAweme();
            if (aweme != null) {
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    if (i < 0) {
                        i = statistics.getCommentCount() + 1;
                    }
                    statistics.setCommentCount(i);
                } else {
                    statistics = new AwemeStatistics();
                    if (i < 0) {
                        i = 1;
                    }
                    statistics.setCommentCount(i);
                }
                aweme.setStatistics(statistics);
            }
        }
    }

    /* renamed from: b */
    public final void mo58053b(String str, Comment comment) {
        int d = mo58057d(str);
        if (d >= 0) {
            C29369d.m96462a(mo58050b(d), comment);
            C1293v f = this.f58248w.mo5575f(d);
            if (f instanceof C29433v) {
                ((C29433v) f).mo75266c(0);
            }
        }
    }

    /* renamed from: a */
    public C1293v mo58032a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 16:
                return mo58054c(viewGroup);
            case 17:
                return mo58049b(viewGroup);
            case 18:
                return mo58059e(viewGroup);
            case 19:
                return mo58058d(viewGroup);
            case 20:
                return mo58062f(viewGroup);
            default:
                return m72700g(viewGroup);
        }
    }

    /* renamed from: a */
    public void mo58033a(C1293v vVar, int i) {
        List arrayList;
        List list;
        if (vVar instanceof LoadMoreViewHolder) {
            ((LoadMoreViewHolder) vVar).mo66509a();
            return;
        }
        this.f67539l.get(i);
        int i2 = i + 1;
        if (i2 < this.f67539l.size()) {
            this.f67539l.get(i2);
        }
        int a = mo58029a(i);
        if (a != 24) {
            switch (a) {
                case 16:
                case 17:
                    break;
                case 18:
                case 19:
                case 20:
                    if (((C34145b) this.f67539l.get(i)).getAweme() != null) {
                        BaseForwardViewHolder baseForwardViewHolder = (BaseForwardViewHolder) vVar;
                        baseForwardViewHolder.f78551E = (C34145b) this.f67539l.get(i);
                        Aweme aweme = ((C34145b) this.f67539l.get(i)).getAweme();
                        if (this.f67539l.get(i) != null) {
                            arrayList = ((C34145b) this.f67539l.get(i)).getCommentList();
                        } else {
                            arrayList = new ArrayList();
                        }
                        List list2 = arrayList;
                        if (this.f67539l.get(i) != null) {
                            list = ((C34145b) this.f67539l.get(i)).getLikeList();
                        } else {
                            list = null;
                        }
                        baseForwardViewHolder.mo76022a(aweme, list2, list, this.f58251z, this.f58236A);
                        break;
                    }
                    break;
            }
        }
        BaseFollowViewHolder baseFollowViewHolder = (BaseFollowViewHolder) vVar;
        baseFollowViewHolder.f77515ad = this.f58249x;
        baseFollowViewHolder.f77514ac = this.f58250y;
        baseFollowViewHolder.f77512aa = this.f58238C;
        baseFollowViewHolder.f77513ab = "list";
        baseFollowViewHolder.f77510Z = this.f58251z;
        if (mo58067m()) {
            baseFollowViewHolder.f77523al = mo58061e(i);
        }
        baseFollowViewHolder.f77545i = (C34145b) this.f67539l.get(i);
        baseFollowViewHolder.mo68518a(((C34145b) this.f67539l.get(i)).getAweme(), ((C34145b) this.f67539l.get(i)).getCommentList(), ((C34145b) this.f67539l.get(i)).getLikeList(), this.f58244h);
        if (!TextUtils.isEmpty(this.f58237B)) {
            baseFollowViewHolder.f77527ap = this.f58237B;
        }
    }
}
