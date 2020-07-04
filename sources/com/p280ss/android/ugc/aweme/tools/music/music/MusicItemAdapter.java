package com.p280ss.android.ugc.aweme.tools.music.music;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.tools.music.music.MusicItemViewHolder.C42465a;
import com.p280ss.android.ugc.aweme.tools.music.music.MusicLibViewHolder.C42468a;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.IStickPointMusicAdapter;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42613k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.music.MusicItemAdapter */
public class MusicItemAdapter extends IStickPointMusicAdapter implements C42612j {

    /* renamed from: k */
    public static final C42461a f110374k = new C42461a(null);

    /* renamed from: a */
    public RecyclerView f110375a;

    /* renamed from: b */
    public C42613k f110376b;

    /* renamed from: c */
    public AnimatorSet f110377c = new AnimatorSet();

    /* renamed from: d */
    public int f110378d = 1;

    /* renamed from: e */
    public boolean f110379e;

    /* renamed from: f */
    public int f110380f;

    /* renamed from: g */
    public Map<String, Boolean> f110381g = new LinkedHashMap();

    /* renamed from: h */
    public Set<String> f110382h = new LinkedHashSet();

    /* renamed from: i */
    public List<? extends MusicModel> f110383i;

    /* renamed from: j */
    public C42612j f110384j;

    /* renamed from: l */
    private int f110385l = -1;

    /* renamed from: m */
    private int f110386m = -1;

    /* renamed from: n */
    private final List<Animator> f110387n = new ArrayList();

    /* renamed from: o */
    private boolean f110388o = true;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.MusicItemAdapter$a */
    public static final class C42461a {
        private C42461a() {
        }

        /* renamed from: a */
        public static String m134946a() {
            if (C6399b.m19946v()) {
                return "94349537923";
            }
            if (C6399b.m19947w()) {
                return "94349537828";
            }
            return "94349537798";
        }

        public /* synthetic */ C42461a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.MusicItemAdapter$b */
    public static final class C42462b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ MusicItemAdapter f110389a;

        C42462b(MusicItemAdapter musicItemAdapter) {
            this.f110389a = musicItemAdapter;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f110389a.f110378d = 3;
            this.f110389a.f110377c.end();
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f110389a.f110378d < 3) {
                this.f110389a.f110377c.start();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f110389a.f110378d++;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.MusicItemAdapter$c */
    public static final class C42463c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MusicItemAdapter f110390a;

        public final void run() {
            C1273i iVar;
            C1293v vVar;
            MusicItemAdapter musicItemAdapter = this.f110390a;
            RecyclerView recyclerView = this.f110390a.f110375a;
            if (recyclerView != null) {
                iVar = recyclerView.getLayoutManager();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                musicItemAdapter.f110380f = ((LinearLayoutManager) iVar).mo5447l();
                int i = this.f110390a.f110380f;
                for (int i2 = 1; i2 < i; i2++) {
                    MusicItemAdapter musicItemAdapter2 = this.f110390a;
                    RecyclerView recyclerView2 = this.f110390a.f110375a;
                    if (recyclerView2 != null) {
                        vVar = recyclerView2.mo5575f(i2);
                    } else {
                        vVar = null;
                    }
                    musicItemAdapter2.mo103965a(vVar, (i2 - 1) * 175);
                }
                this.f110390a.mo103973e();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }

        C42463c(MusicItemAdapter musicItemAdapter) {
            this.f110390a = musicItemAdapter;
        }
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 2;
    }

    /* renamed from: a */
    public final int mo103962a() {
        return this.f110385l - 1;
    }

    /* renamed from: b */
    public final int mo103967b() {
        return this.f110386m - 1;
    }

    /* renamed from: f */
    public final void mo103974f() {
        if (this.f110377c.isRunning()) {
            this.f110377c.cancel();
        }
    }

    /* renamed from: k */
    public final void mo103979k() {
        mo103969b(-1, false);
        mo103963a(-1);
        mo103968b(-1);
    }

    /* renamed from: l */
    private void m134926l() {
        C1293v vVar;
        if (this.f110386m > 0) {
            RecyclerView recyclerView = this.f110375a;
            if (recyclerView != null) {
                vVar = recyclerView.mo5575f(this.f110386m);
            } else {
                vVar = null;
            }
            if (vVar instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) vVar).mo103986c();
            }
        }
    }

    /* renamed from: c */
    public final MusicModel mo103970c() {
        List<? extends MusicModel> list = this.f110383i;
        if (list != null) {
            return (MusicModel) C7525m.m23504c(list, this.f110386m - 1);
        }
        return null;
    }

    /* renamed from: e */
    public final void mo103973e() {
        this.f110377c.playTogether(this.f110387n);
        this.f110377c.start();
        this.f110377c.addListener(new C42462b(this));
    }

    public int getItemCount() {
        int i;
        List<? extends MusicModel> list = this.f110383i;
        if (list != null && list.size() == 0) {
            return 9;
        }
        List<? extends MusicModel> list2 = this.f110383i;
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        return i + 1;
    }

    /* renamed from: h */
    public final void mo103976h() {
        C1293v vVar;
        RecyclerView recyclerView = this.f110375a;
        if (recyclerView != null) {
            vVar = recyclerView.mo5575f(this.f110385l);
        } else {
            vVar = null;
        }
        if (vVar instanceof MusicItemViewHolder) {
            MusicItemViewHolder.m134947a();
        }
    }

    /* renamed from: i */
    public final void mo103977i() {
        C1293v vVar;
        RecyclerView recyclerView = this.f110375a;
        if (recyclerView != null) {
            vVar = recyclerView.mo5575f(this.f110385l);
        } else {
            vVar = null;
        }
        if (vVar instanceof MusicItemViewHolder) {
            MusicItemViewHolder.m134948b();
        }
    }

    /* renamed from: j */
    public final MusicModel mo103978j() {
        List<? extends MusicModel> list = this.f110383i;
        if (list != null) {
            return (MusicModel) C7525m.m23504c(list, this.f110385l - 1);
        }
        return null;
    }

    /* renamed from: d */
    public final void mo103972d() {
        this.f110379e = true;
        this.f110378d = 1;
        this.f110387n.clear();
        this.f110377c.cancel();
        this.f110377c.removeAllListeners();
        RecyclerView recyclerView = this.f110375a;
        if (recyclerView != null) {
            recyclerView.post(new C42463c(this));
        }
    }

    /* renamed from: g */
    public final void mo103975g() {
        C1293v vVar;
        if (this.f110386m > 0) {
            RecyclerView recyclerView = this.f110375a;
            if (recyclerView != null) {
                vVar = recyclerView.mo5575f(this.f110386m);
            } else {
                vVar = null;
            }
            if (vVar instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) vVar).mo103987d();
            } else {
                notifyItemChanged(this.f110386m);
            }
        }
    }

    /* renamed from: a */
    public final void mo103963a(int i) {
        this.f110385l = i + 1;
    }

    /* renamed from: b */
    public final void mo103968b(int i) {
        this.f110386m = i + 1;
    }

    /* renamed from: c */
    public final MusicModel mo103971c(int i) {
        List<? extends MusicModel> list = this.f110383i;
        if (list != null) {
            return (MusicModel) C7525m.m23504c(list, i);
        }
        return null;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f110375a = recyclerView;
    }

    /* renamed from: b */
    private static void m134925b(MusicModel musicModel) {
        String str;
        if (musicModel != null && musicModel.getComeFromForMod() == 1) {
            String str2 = "jarvis_item_show";
            C22984d a = C22984d.m75611a().mo59973a("item_id", musicModel.getMusicId()).mo59973a("channel_id", C42461a.m134946a());
            String str3 = "req_id";
            LogPbBean logPb = musicModel.getLogPb();
            if (logPb != null) {
                str = logPb.getImprId();
            } else {
                str = null;
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo103966a(MusicModel musicModel) {
        C7573i.m23587b(musicModel, "mMusicModel");
        String musicId = musicModel.getMusicId();
        if (musicId != null) {
            if (this.f110381g.get(musicId) == null || C7573i.m23585a((Object) (Boolean) this.f110381g.get(musicId), (Object) Boolean.valueOf(false))) {
                this.f110381g.put(musicId, Boolean.valueOf(true));
            }
            this.f110382h.add(musicId);
        }
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        boolean z;
        MusicModel musicModel;
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof MusicItemViewHolder) {
            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) vVar;
            if (musicItemViewHolder.getLayoutPosition() == this.f110385l) {
                MusicItemViewHolder.m134947a();
            }
            int adapterPosition = musicItemViewHolder.getAdapterPosition() - 1;
            List<? extends MusicModel> list = this.f110383i;
            if (list != null) {
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    List<? extends MusicModel> list2 = this.f110383i;
                    if (list2 != null) {
                        MusicModel musicModel2 = (MusicModel) list2.get(adapterPosition);
                        if (musicModel2 != null) {
                            String musicId = musicModel2.getMusicId();
                            if (musicId != null) {
                                if (this.f110381g.get(musicId) == null || C7573i.m23585a((Object) (Boolean) this.f110381g.get(musicId), (Object) Boolean.valueOf(false))) {
                                    this.f110381g.put(musicId, Boolean.valueOf(true));
                                    C42613k kVar = this.f110376b;
                                    if (kVar != null) {
                                        kVar.mo104208a(adapterPosition);
                                    }
                                }
                                if (!this.f110382h.contains(musicId)) {
                                    List<? extends MusicModel> list3 = this.f110383i;
                                    if (list3 != null) {
                                        musicModel = (MusicModel) C7525m.m23504c(list3, adapterPosition);
                                    } else {
                                        musicModel = null;
                                    }
                                    m134925b(musicModel);
                                    this.f110382h.add(musicId);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo103964a(int i, boolean z) {
        mo103975g();
        this.f110386m = i + 1;
        if (z) {
            m134926l();
        }
    }

    public MusicItemAdapter(List<? extends MusicModel> list, C42612j jVar) {
        C7573i.m23587b(jVar, "onItemClickListener");
        this.f110383i = list;
        this.f110384j = jVar;
    }

    /* renamed from: a */
    public final void mo97305a(View view, int i) {
        C7573i.m23587b(view, "view");
        C42612j jVar = this.f110384j;
        if (jVar != null) {
            jVar.mo97305a(view, i - 1);
        }
    }

    /* renamed from: a */
    public final void mo103965a(C1293v vVar, int i) {
        if (vVar instanceof MusicItemViewHolder) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, 0.5f, 1.0f});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, 0.5f, 1.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((MusicItemViewHolder) vVar).f110392a, new PropertyValuesHolder[]{ofFloat, ofFloat2});
            C7573i.m23582a((Object) ofPropertyValuesHolder, "scale");
            ofPropertyValuesHolder.setDuration(700);
            ofPropertyValuesHolder.setStartDelay((long) i);
            this.f110387n.add(ofPropertyValuesHolder);
        }
    }

    /* renamed from: b */
    public final void mo103969b(int i, boolean z) {
        C1293v vVar;
        C1293v vVar2 = null;
        if (this.f110385l > 0 && this.f110385l < getItemCount()) {
            RecyclerView recyclerView = this.f110375a;
            if (recyclerView != null) {
                vVar = recyclerView.mo5575f(this.f110385l);
            } else {
                vVar = null;
            }
            if (vVar instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) vVar).mo103985a(false);
                MusicItemViewHolder.m134948b();
            } else {
                notifyItemChanged(this.f110385l);
            }
        }
        this.f110385l = i + 1;
        if (this.f110385l < getItemCount()) {
            RecyclerView recyclerView2 = this.f110375a;
            if (recyclerView2 != null) {
                vVar2 = recyclerView2.mo5575f(this.f110385l);
            }
            if (vVar2 instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) vVar2).mo103985a(true);
                MusicItemViewHolder.m134947a();
            }
        }
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        MusicModel musicModel;
        boolean z;
        boolean z2;
        C7573i.m23587b(vVar, "viewHolder");
        if (vVar instanceof MusicItemViewHolder) {
            boolean z3 = false;
            if (i >= this.f110380f) {
                this.f110388o = false;
            }
            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) vVar;
            List<? extends MusicModel> list = this.f110383i;
            if (list != null) {
                musicModel = (MusicModel) C7525m.m23504c(list, i - 1);
            } else {
                musicModel = null;
            }
            if (this.f110385l == i) {
                z = true;
            } else {
                z = false;
            }
            if (this.f110385l == this.f110386m || this.f110386m != i) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f110379e && this.f110388o) {
                z3 = true;
            }
            musicItemViewHolder.mo103984a(musicModel, z, z2, z3);
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "viewGroup");
        if (getItemViewType(i) != 0) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            C7573i.m23582a((Object) from, "LayoutInflater.from(viewGroup.context)");
            return new MusicItemViewHolder(C42465a.m134953a(from, viewGroup), this);
        }
        LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
        C7573i.m23582a((Object) from2, "LayoutInflater.from(viewGroup.context)");
        return new MusicLibViewHolder(C42468a.m134954a(from2, viewGroup), this);
    }
}
