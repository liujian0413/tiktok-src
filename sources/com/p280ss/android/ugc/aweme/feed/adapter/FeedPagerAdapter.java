package com.p280ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.util.C0901h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.C10804a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.experiment.C27685a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.experiment.DDislikeStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.helper.C28412a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28254o;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LongPressLayout.C28748a;
import com.p280ss.android.ugc.aweme.feed.service.C28677a;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.story.C41983b;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter */
public class FeedPagerAdapter extends MultiTypePagerAdapter implements C28198z {

    /* renamed from: l */
    private static final String f73983l = "FeedPagerAdapter";

    /* renamed from: r */
    private static HashMap<Long, Long> f73984r = new HashMap<>();

    /* renamed from: a */
    public boolean f73985a;

    /* renamed from: b */
    public boolean f73986b = true;

    /* renamed from: c */
    public C28254o f73987c;

    /* renamed from: d */
    public long f73988d;

    /* renamed from: e */
    protected C28412a f73989e;

    /* renamed from: f */
    protected OnTouchListener f73990f;

    /* renamed from: g */
    protected C28748a f73991g;

    /* renamed from: m */
    private List<Aweme> f73992m = new ArrayList();

    /* renamed from: n */
    private C28343z<C28318an> f73993n;

    /* renamed from: o */
    private Fragment f73994o;

    /* renamed from: p */
    private final OnTouchListener f73995p;

    /* renamed from: q */
    private BaseFeedPageParams f73996q;

    /* renamed from: s */
    private int f73997s = -1;

    /* renamed from: f */
    private static int m91873f(int i) {
        if (i == 2) {
            return 1;
        }
        if (i == 101) {
            return 2;
        }
        if (i == 4000) {
            return 5;
        }
        return i == 4001 ? 7 : 0;
    }

    /* renamed from: b */
    public final List<Aweme> mo71593b() {
        return this.f73992m;
    }

    /* renamed from: c */
    public List<Aweme> mo71596c() {
        return this.f73992m;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo71584a() {
        return this.f73996q.getPoiTabType();
    }

    /* renamed from: a */
    public void mo71589a(List<Aweme> list) {
        this.f73992m.clear();
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f73992m.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo64965a(int i, View view, ViewGroup viewGroup) {
        C28130ac acVar;
        int a = mo64963a(i);
        if (!m91863a(view, a)) {
            view = m91859a(viewGroup, a);
            acVar = m91860a(view, a, i);
            view.setTag(R.id.ajf, Integer.valueOf(a));
            view.setTag(R.id.aje, acVar);
        } else {
            acVar = (C28130ac) view.getTag(R.id.aje);
        }
        m91862a(acVar, i, viewGroup, a);
        return view;
    }

    /* renamed from: a */
    public C28130ac mo67564a(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        VideoViewHolder videoViewHolder = new VideoViewHolder(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        mo71586a((C28130ac) videoViewHolder);
        return videoViewHolder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71586a(C28130ac acVar) {
        VideoViewHolder videoViewHolder = (VideoViewHolder) acVar;
        videoViewHolder.mo71657a(this.f73990f);
        videoViewHolder.mo71662a(this.f73991g);
        if (DDislikeStyleExperiment.enableDetailShowOptionDialog()) {
            videoViewHolder.mo71669aa();
        }
    }

    /* renamed from: a */
    public final void mo71588a(FollowStatus followStatus) {
        if (getCount() != 0) {
            for (Aweme aweme : this.f73992m) {
                if (!(aweme == null || aweme.getAuthor() == null || !C6319n.m19594a(aweme.getAuthor().getUid(), followStatus.userId))) {
                    aweme.getAuthor().setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo71592a(String str) {
        boolean z = false;
        for (int size = this.f73992m.size() - 1; size >= 0; size--) {
            Aweme aweme = (Aweme) this.f73992m.get(size);
            if (aweme != null && TextUtils.equals(str, aweme.getAuthorUid())) {
                mo71598d(size);
                z = true;
            }
        }
        if (z) {
            notifyDataSetChanged();
        }
        return z;
    }

    /* renamed from: a */
    public final void mo71587a(Aweme aweme, int i) {
        if (aweme != null && i >= 0 && i <= getCount()) {
            this.f73992m.add(i, aweme);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo71590a(List<Aweme> list, int i) {
        mo71591a(list, i, 1);
    }

    /* renamed from: a */
    public final void mo71591a(List<Aweme> list, int i, int i2) {
        int i3;
        if (!C6307b.m19566a((Collection<T>) list) && i >= 0 && i < list.size() && i <= getCount()) {
            int size = this.f73992m.size();
            while (true) {
                size--;
                i3 = 0;
                if (size < i) {
                    break;
                }
                while (i3 < i2) {
                    Aweme aweme = (Aweme) list.get(i + i3);
                    if (!(this.f73992m.get(size) == null || aweme == null || !TextUtils.equals(((Aweme) this.f73992m.get(size)).getAid(), aweme.getAid()))) {
                        this.f73992m.remove(size);
                    }
                    i3++;
                }
            }
            while (i3 < i2) {
                int i4 = i + i3;
                this.f73992m.add(i4, (Aweme) list.get(i4));
                i3++;
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo71585a(int i, boolean z) {
        if (C6399b.m19944t()) {
            m91874g(i);
        } else {
            m91865b(i, z);
        }
    }

    /* renamed from: d */
    private int m91867d() {
        return this.f73996q.awemeFromPage;
    }

    /* renamed from: e */
    private String m91871e() {
        return this.f73996q.eventType;
    }

    /* renamed from: f */
    private int m91872f() {
        return this.f73996q.pageType;
    }

    public int getCount() {
        if (this.f73992m == null) {
            return 0;
        }
        return this.f73992m.size();
    }

    /* renamed from: c */
    public Aweme mo71595c(int i) {
        return mo67568b(i);
    }

    /* renamed from: d */
    private static C28130ac m91868d(View view) {
        return C28677a.m94350d().mo71779a(view);
    }

    /* renamed from: e */
    private static C28130ac m91870e(View view) {
        return C28677a.m94350d().mo71782b(view);
    }

    /* renamed from: c */
    public final void mo71597c(View view) {
        C28130ac acVar = (C28130ac) view.getTag(R.id.aje);
        if (acVar != null) {
            acVar.mo65713j();
        }
    }

    /* renamed from: b */
    private boolean m91866b(Aweme aweme) {
        if (m91867d() == 2) {
            return false;
        }
        return C27685a.f72985a.mo71138a(m91871e(), aweme);
    }

    /* renamed from: e */
    public final void mo71599e(int i) {
        mo71598d(i);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo71598d(int i) {
        if (i >= 0 && i < getCount()) {
            this.f73992m.remove(i);
        }
    }

    public int getItemPosition(Object obj) {
        C28130ac acVar = (C28130ac) ((View) obj).getTag(R.id.aje);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            Aweme aweme = (Aweme) this.f73992m.get(i);
            if (acVar != null && C6319n.m19594a(aweme.getAid(), acVar.mo65711h().getAid())) {
                return i;
            }
        }
        return -2;
    }

    /* renamed from: b */
    public Aweme mo67568b(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (Aweme) this.f73992m.get(i);
    }

    /* renamed from: g */
    private void m91874g(int i) {
        int i2 = i;
        if (!C6307b.m19566a((Collection<T>) this.f73992m) && i2 >= 0 && i2 < this.f73992m.size() && i2 != this.f73997s) {
            this.f73997s = i2;
            Aweme aweme = (Aweme) this.f73992m.get(i2);
            if (aweme != null) {
                User author = aweme.getAuthor();
                if (author != null && author.isLive() && C41983b.m133444a()) {
                    if (TextUtils.equals(m91871e(), "homepage_hot")) {
                        C41989d.m133493c(this.f74004j, 0, author.getRequestId(), author.getUid(), author.roomId);
                        C41989d.m133483a(author.getUid(), author.roomId, "homepage_hot", "video_head", author.getRequestId(), -1, true, aweme.getAid());
                    } else if (TextUtils.equals(m91871e(), "homepage_follow")) {
                        C41989d.m133489b(this.f74004j, 0, author.getRequestId(), author.getUid(), author.roomId);
                    } else {
                        C41989d.m133471a(this.f74004j, 0, m91871e(), author.getRequestId(), author.getUid(), author.roomId);
                    }
                    C41989d.m133479a(author.getUid(), author.roomId, m91871e(), aweme.getRequestId(), -1, -1, false, aweme.getAid(), "video_head");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64963a(int i) {
        Aweme b = mo67568b(i);
        if (C24671f.m80859i().mo65652b(this.f74004j, b, C25329c.m83212a(b, mo71593b(), i))) {
            return 3;
        }
        if (b != null) {
            return mo71583a(b);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71594b(View view) {
        if (view != null && (view instanceof C28130ac)) {
            ((C28130ac) view.getTag(R.id.aje)).mo71565p();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64964a(View view) {
        if (view == null) {
            return 0;
        }
        return m91873f(((C28130ac) view.getTag(R.id.aje)).mo65709f());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo71583a(Aweme aweme) {
        if (aweme.isAwemeFromXiGua()) {
            return 4;
        }
        if (aweme.isAwemeFromDongCheDi()) {
            return 6;
        }
        if (!m91866b(aweme)) {
            return m91873f(aweme.getAwemeType());
        }
        if (aweme.getAwemeType() == 2) {
            return 9;
        }
        return 8;
    }

    /* renamed from: a */
    private C28130ac m91861a(View view, C28343z<C28318an> zVar) {
        return C28677a.m94350d().mo71780a(view, zVar, m91871e(), this.f73988d);
    }

    /* renamed from: a */
    private static boolean m91863a(View view, int i) {
        if (view == null) {
            return false;
        }
        return C0901h.m3836a(view.getTag(R.id.ajf), Integer.valueOf(i));
    }

    /* renamed from: a */
    private View m91859a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return this.f74003i.inflate(R.layout.vd, viewGroup, false);
            case 2:
                return C28677a.m94350d().mo71777a(this.f74003i, m91871e(), viewGroup);
            case 3:
                return C24671f.m80859i().mo65650b(this.f74004j);
            case 5:
                return C28677a.m94350d().mo71784d(this.f74003i, viewGroup);
            case 7:
                return C28677a.m94350d().mo71776a(this.f74003i, viewGroup);
            case 8:
                return C28677a.m94350d().mo71781b(this.f74003i, viewGroup);
            case 9:
                return C28677a.m94350d().mo71783c(this.f74003i, viewGroup);
            default:
                return ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f74004j, R.layout.item_feed);
        }
    }

    /* renamed from: b */
    private void m91865b(int i, boolean z) {
        String str;
        int i2 = i;
        if (!C6307b.m19566a((Collection<T>) this.f73992m) && i2 >= 0 && i2 < this.f73992m.size()) {
            Aweme aweme = (Aweme) this.f73992m.get(i2);
            if (aweme != null) {
                User author = aweme.getAuthor();
                if (author != null && author.isLive() && C41983b.m133444a()) {
                    if (TextUtils.equals(m91871e(), "homepage_hot")) {
                        C41989d.m133493c(this.f74004j, 0, aweme.getRequestId(), author.getUid(), author.roomId);
                        C41989d.m133483a(author.getUid(), author.roomId, "homepage_hot", "video_head", aweme.getRequestId(), -1, false, aweme.getAid());
                        return;
                    }
                    if (TextUtils.equals(m91871e(), "homepage_follow")) {
                        C41989d.m133489b(this.f74004j, 0, aweme.getRequestId(), author.getUid(), author.roomId);
                        if (!aweme.isLive()) {
                            String uid = author.getUid();
                            long j = author.roomId;
                            String str2 = "homepage_follow";
                            String requestId = aweme.getRequestId();
                            String aid = aweme.getAid();
                            String str3 = "video_head";
                            if (z) {
                                str = "draw";
                            } else {
                                str = "click";
                            }
                            C41989d.m133481a(uid, j, str2, requestId, -1, -1, false, aid, str3, str, null);
                        }
                    } else if (!TextUtils.equals(m91871e(), "homepage_fresh")) {
                        C41989d.m133471a(this.f74004j, 0, m91871e(), aweme.getRequestId(), author.getUid(), author.roomId);
                        C41989d.m133479a(author.getUid(), author.roomId, m91871e(), aweme.getRequestId(), -1, -1, false, aweme.getAid(), "video_head");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private C28130ac m91860a(View view, int i, int i2) {
        switch (i) {
            case 1:
                return mo67563a(m91867d(), view, this.f73993n, m91871e(), this.f73995p, this.f73994o, m91872f());
            case 2:
                return m91861a(view, this.f73993n);
            case 3:
                return C28677a.m94350d().mo71778a(this.f74004j, m91867d(), view, this.f73993n, m91871e(), this.f73995p, this.f73994o, m91872f());
            case 4:
                return mo67565b(view, this.f73993n, this.f73995p, this.f73994o, this.f73996q);
            case 5:
                return m91868d(view);
            case 6:
                return mo67566c(view, this.f73993n, this.f73995p, this.f73994o, this.f73996q);
            case 7:
                return m91870e(view);
            case 8:
                return m91869d(view, this.f73993n, this.f73995p, this.f73994o, this.f73996q);
            case 9:
                return m91864b(m91867d(), view, this.f73993n, m91871e(), this.f73995p, this.f73994o, m91872f());
            default:
                return mo67564a(view, this.f73993n, this.f73995p, this.f73994o, this.f73996q);
        }
    }

    /* renamed from: a */
    private void m91862a(C28130ac acVar, int i, ViewGroup viewGroup, int i2) {
        acVar.mo71548a(mo71595c(i), i);
    }

    /* renamed from: d */
    private C28130ac m91869d(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        C28178g gVar = new C28178g(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        mo71586a((C28130ac) gVar);
        return gVar;
    }

    /* renamed from: c */
    public C28130ac mo67566c(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        VideoViewHolder videoViewHolder = new VideoViewHolder(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        mo71586a((C28130ac) videoViewHolder);
        return videoViewHolder;
    }

    /* renamed from: b */
    public C28130ac mo67565b(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        VideoViewHolder videoViewHolder = new VideoViewHolder(view, zVar, onTouchListener, fragment, baseFeedPageParams, this.f73987c, this.f73989e);
        mo71586a((C28130ac) videoViewHolder);
        return videoViewHolder;
    }

    /* renamed from: b */
    private static C28130ac m91864b(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        C28174e eVar = new C28174e(i, view, zVar, str, onTouchListener, fragment, i2);
        return eVar;
    }

    /* renamed from: a */
    public C28130ac mo67563a(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        FeedImageViewHolder feedImageViewHolder = new FeedImageViewHolder(i, view, zVar, str, onTouchListener, fragment, i2);
        return feedImageViewHolder;
    }

    public FeedPagerAdapter(Context context, LayoutInflater layoutInflater, int i, C28343z<C28318an> zVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        super(context, layoutInflater, i);
        this.f73993n = zVar;
        this.f73994o = fragment;
        this.f73995p = onTouchListener;
        this.f73996q = baseFeedPageParams;
        this.f73989e = new C28412a();
        if (VERSION.SDK_INT >= 17) {
            C28412a.m93382a(this.f74004j);
        }
        this.f73990f = new C10804a(0.5f, 1.0f);
        this.f73991g = VideoViewHolder.m92018a(this.f74004j, this.f73996q);
    }
}
