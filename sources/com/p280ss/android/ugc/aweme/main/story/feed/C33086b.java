package com.p280ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;
import com.p280ss.android.ugc.aweme.base.mvvm.impl.C23361a;
import com.p280ss.android.ugc.aweme.base.p1063g.C23343a;
import com.p280ss.android.ugc.aweme.base.p1063g.C23344b;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.widget.DividerView;
import com.p280ss.android.ugc.aweme.base.widget.commonitem.p1068a.C23509b;
import com.p280ss.android.ugc.aweme.base.widget.divider.DividerViewModel;
import com.p280ss.android.ugc.aweme.base.widget.divider.DividerViewModel.Orientation;
import com.p280ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.main.story.live.C33104d;
import com.p280ss.android.ugc.aweme.main.story.p1387a.C33068a;
import com.p280ss.android.ugc.aweme.main.widget.StoryFeedLoadMoreProgressBar;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.story.model.C42002c;
import com.p280ss.android.ugc.aweme.story.model.C42005d;
import com.p280ss.android.ugc.aweme.story.model.C42005d.C42006a;
import com.p280ss.android.ugc.aweme.story.model.Story;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.main.story.feed.b */
public class C33086b extends C23361a<StoryFeedPanel> implements C23344b<C42005d> {

    /* renamed from: g */
    private static final String f86082g = "b";

    /* renamed from: b */
    public final List<C23360e> f86083b = new ArrayList();

    /* renamed from: c */
    public C42006a f86084c;

    /* renamed from: d */
    public String f86085d;

    /* renamed from: e */
    public C33085a f86086e;

    /* renamed from: f */
    public String f86087f = "toplist_homepage_hot";

    /* renamed from: h */
    private C42002c f86088h = new C42002c();

    /* renamed from: i */
    private PageLoadingListMultiTypeAdapter f86089i;

    /* renamed from: j */
    private DividerViewModel f86090j;

    /* renamed from: k */
    private Class f86091k;

    /* renamed from: l */
    private boolean f86092l;

    /* renamed from: c */
    private C25673a<Aweme, Object> m106813c() {
        return new C25673a<Aweme, Object>() {

            /* renamed from: a */
            List<Aweme> f86095a;

            public final boolean checkParams(Object... objArr) {
                return false;
            }

            public final List getItems() {
                return this.f86095a;
            }

            public final boolean isHasMore() {
                return false;
            }

            public final void loadMoreList(Object... objArr) {
            }

            public final void refreshList(Object... objArr) {
            }

            public final void setItems(List<Aweme> list) {
                this.f86095a = list;
            }
        };
    }

    /* renamed from: a */
    public final void mo84807a(boolean z) {
        this.f86088h.mo103181a(z, this.f86092l);
    }

    /* renamed from: a */
    public final C23360e mo84805a(int i) {
        if (!C6307b.m19566a((Collection<T>) this.f86083b) && i < this.f86083b.size()) {
            return (C23360e) this.f86083b.get(i);
        }
        return null;
    }

    public C33086b(Class cls) {
        boolean z;
        double d;
        this.f86088h.mo60639a((C23344b) this);
        this.f86091k = cls;
        if (cls == StoryFeedItemViewBig.class) {
            z = true;
        } else {
            z = false;
        }
        this.f86092l = z;
        if (this.f86092l) {
            d = 16.0d;
        } else {
            d = 8.0d;
        }
        this.f86090j = new DividerViewModel(C23486n.m77122a(d), Orientation.HORIZONTAL);
    }

    /* renamed from: b */
    private int m106810b(String str) {
        for (int i = 0; i < this.f86083b.size(); i++) {
            C23360e eVar = (C23360e) this.f86083b.get(i);
            if ((eVar instanceof StoryFeedItemViewModel) && str.equals(((StoryFeedItemViewModel) eVar).mo84780g())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m106809a(C42006a aVar) {
        this.f86085d = aVar.f109120d;
        if (!aVar.f109117a) {
            this.f86083b.clear();
            this.f86083b.add(this.f86090j);
        } else if (this.f86089i != null) {
            this.f86089i.mo61169c();
        }
        for (int i = aVar.f109118b; i < this.f86088h.mo103182b(); i++) {
            this.f86083b.add(new StoryFeedItemViewModel(new C33068a(this.f86088h.mo103178a(i), this.f86088h), this, aVar.f109120d));
        }
        mo60675b();
        if (this.f86086e != null) {
            this.f86086e.mo75548a(this.f86083b, aVar);
        }
    }

    /* renamed from: b */
    private List<Aweme> m106812b(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f86088h.mo103182b(); i++) {
            String a = this.f86088h.mo103178a(i);
            Story story = this.f86088h.mo103177a(a).f109095a;
            if (story.isFollowing() && (z || !story.isRead())) {
                arrayList.addAll(this.f86088h.mo103177a(a).f109096b.getAwemeList());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final int mo84803a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < this.f86088h.mo103182b(); i2++) {
            String a = this.f86088h.mo103178a(i2);
            if (this.f86088h.mo103177a(a).f109095a.isFollowing()) {
                i++;
                if (C23472a.m77066a(str, a)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final C1262a mo84804a(Context context) {
        if (this.f86089i == null) {
            HashMap hashMap = new HashMap();
            if (this.f86091k != null) {
                hashMap.put(StoryFeedItemViewModel.class, this.f86091k);
            } else {
                hashMap.put(StoryFeedItemViewModel.class, StoryFeedItemView.class);
            }
            hashMap.put(C23509b.class, StoryFeedLoadMoreProgressBar.class);
            hashMap.put(DividerViewModel.class, DividerView.class);
            this.f86089i = new PageLoadingListMultiTypeAdapter(context, this.f86083b, hashMap) {
                /* renamed from: b */
                public final C23360e mo61168b() {
                    return null;
                }

                /* renamed from: g */
                public final void mo61177g() {
                    C6726a.m20843a(new Runnable() {
                        public final void run() {
                            C33086b.this.mo84807a(true);
                        }
                    }, VETransitionFilterParam.TransitionDuration_DEFAULT);
                }
            };
            if (this.f86084c != null && !this.f86084c.f109119c) {
                this.f86089i.mo61170d();
            }
        }
        return this.f86089i;
    }

    /* renamed from: a */
    private static String m106807a(List<Aweme> list, String str) {
        for (Aweme aweme : list) {
            if (C23472a.m77066a(aweme.getAuthor().getUid(), str)) {
                return aweme.getAid();
            }
        }
        return null;
    }

    /* renamed from: b */
    private static int m106811b(List<Aweme> list, String str) {
        if (list == null) {
            return 0;
        }
        for (Aweme aweme : list) {
            if (aweme != null && aweme.getAuthor() != null && C23472a.m77066a(aweme.getAuthor().getUid(), str)) {
                return aweme.getEnterpriseType();
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo60641a(C23343a aVar, C42005d dVar) {
        if (this.f86088h == aVar) {
            int i = dVar.f109115a;
            if (i != 1) {
                if (i != 9999) {
                    switch (i) {
                        case 4:
                            String str = (String) dVar.f109116b;
                            StoryFeedItemViewModel storyFeedItemViewModel = null;
                            if (!C6319n.m19594a(str, C21115b.m71197a().getCurUserId())) {
                                int b = m106810b(str);
                                if (b != -1) {
                                    storyFeedItemViewModel = (StoryFeedItemViewModel) this.f86083b.get(b);
                                }
                            }
                            if (storyFeedItemViewModel != null) {
                                storyFeedItemViewModel.mo84777d();
                                storyFeedItemViewModel.mo60675b();
                                return;
                            }
                            break;
                        case 5:
                            ((StoryFeedPanel) mo60671a()).setLivePageItemView((C33104d) dVar.f109116b);
                            return;
                        case 6:
                            ((StoryFeedPanel) mo60671a()).setPanelVisibility(((Integer) dVar.f109116b).intValue(), false);
                            break;
                    }
                } else if (this.f86089i != null) {
                    this.f86089i.mo61169c();
                    return;
                }
                return;
            }
            this.f86084c = (C42006a) dVar.f109116b;
            if (this.f86089i != null) {
                if (this.f86084c.f109119c) {
                    this.f86089i.mo61171e();
                } else {
                    this.f86089i.mo61170d();
                }
            }
            m106809a(this.f86084c);
        }
    }

    /* renamed from: a */
    public final void mo84806a(Context context, String str) {
        try {
            List b = m106812b(this.f86088h.mo103177a(str).f109095a.isRead());
            C25673a c = m106813c();
            c.setItems(b);
            C28503s.m93679a(c);
            String a = m106807a(b, str);
            int b2 = m106811b(b, str);
            C7195s a2 = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(a);
            a2.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "toplist_friend").mo18694a("video_from", "from_window_following").mo18693a("profile_enterprise_type", b2).mo18695a());
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }
}
