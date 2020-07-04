package com.p280ss.android.ugc.aweme.tutorial;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41253ah;
import com.p280ss.android.ugc.aweme.tutorial.p1683a.C42665a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialRecyclerViewAdapter */
public final class TutorialRecyclerViewAdapter extends BaseAdapter<C42665a> {

    /* renamed from: a */
    public final FragmentActivity f110886a;

    /* renamed from: b */
    private final List<C42665a> f110887b = new ArrayList();

    /* renamed from: c */
    private final Map<Integer, List<C42665a>> f110888c = new LinkedHashMap();

    /* renamed from: d */
    private final Map<Integer, Integer> f110889d = new LinkedHashMap();

    /* renamed from: e */
    private int f110890e;

    /* renamed from: f */
    private final LayoutInflater f110891f;

    /* renamed from: g */
    private final C7562b<C42665a, C7581n> f110892g;

    /* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialRecyclerViewAdapter$a */
    static final class C42658a extends Lambda implements C7562b<C42665a, C7581n> {

        /* renamed from: a */
        final /* synthetic */ TutorialRecyclerViewAdapter f110893a;

        C42658a(TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter) {
            this.f110893a = tutorialRecyclerViewAdapter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m135487a((C42665a) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m135487a(C42665a aVar) {
            String str;
            C7573i.m23587b(aVar, "it");
            if (!C42673c.m135521a(this.f110893a.f110886a)) {
                C10761a.m31392b((Context) this.f110893a.f110886a, (int) R.string.cjs, 0).mo25750a();
                return;
            }
            C41253ah.m131870a(aVar.f110913a);
            C0063u a = C0069x.m159a(this.f110893a.f110886a).mo147a(ShortVideoContextViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
            if (shortVideoContext != null) {
                str = shortVideoContext.f99787w;
            } else {
                str = null;
            }
            C7195s.m22438a().mo18682a(C7203u.m22460a("aweme://aweme/detail/0").mo18694a("extra_previous_page", "video_shoot_page").mo18694a("enter_from", "video_tutorial_page").mo18694a("video_from", "from_tutorial_detail").mo18694a("extra_tutorial_id", aVar.f110913a).mo18694a("creation_id", str).mo18695a());
        }
    }

    /* renamed from: c */
    public final int mo60557c() {
        return this.f110887b.size();
    }

    /* renamed from: g */
    public final void mo66502g() {
        this.f110887b.clear();
        this.f110889d.clear();
        this.f110888c.clear();
        this.f110890e = 0;
    }

    /* renamed from: e */
    public final void mo104268e(List<C42665a> list) {
        C7573i.m23587b(list, "list");
        this.f110889d.put(Integer.valueOf(this.f110890e), Integer.valueOf(this.f110887b.size()));
        this.f110887b.addAll(list);
        Map<Integer, List<C42665a>> map = this.f110888c;
        int i = this.f110890e;
        this.f110890e = i + 1;
        map.put(Integer.valueOf(i), list);
    }

    public TutorialRecyclerViewAdapter(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f110886a = fragmentActivity;
        LayoutInflater from = LayoutInflater.from(this.f110886a);
        C7573i.m23582a((Object) from, "LayoutInflater.from(activity)");
        this.f110891f = from;
        this.f110892g = new C42658a(this);
        this.f67551r = this.f110886a.getResources().getColor(R.color.axl);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        View inflate = this.f110891f.inflate(R.layout.iw, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new TutorialViewHolder(inflate, this.f110892g);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (vVar != null) {
            ((TutorialViewHolder) vVar).mo104269a((C42665a) this.f110887b.get(i));
            C42672b.m135520b(((C42665a) this.f110887b.get(i)).f110913a);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.tutorial.TutorialViewHolder");
    }

    /* renamed from: a */
    public final int mo104267a(int i, List<C42665a> list) {
        int i2;
        int i3;
        C7573i.m23587b(list, "newTutorialList");
        List list2 = (List) this.f110888c.get(Integer.valueOf(i));
        if (list2 != null) {
            this.f110887b.removeAll(list2);
            i2 = list2.size();
        } else {
            i2 = 0;
        }
        List<C42665a> list3 = this.f110887b;
        Integer num = (Integer) this.f110889d.get(Integer.valueOf(i));
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = this.f110887b.size();
        }
        list3.addAll(i3, list);
        this.f110888c.put(Integer.valueOf(i), list);
        return i2;
    }
}
