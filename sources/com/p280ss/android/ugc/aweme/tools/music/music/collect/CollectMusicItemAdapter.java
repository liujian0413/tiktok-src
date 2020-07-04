package com.p280ss.android.ugc.aweme.tools.music.music.collect;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.tools.music.music.MusicItemViewHolder;
import com.p280ss.android.ugc.aweme.tools.music.music.MusicItemViewHolder.C42465a;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42612j;
import com.p280ss.android.ugc.aweme.toolsport.p1679a.C42613k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicItemAdapter */
public final class CollectMusicItemAdapter extends BaseAdapter<MusicModel> implements C42612j {

    /* renamed from: a */
    public boolean f110410a;

    /* renamed from: b */
    public int f110411b;

    /* renamed from: c */
    public boolean f110412c;

    /* renamed from: d */
    public int f110413d = -1;

    /* renamed from: e */
    public int f110414e = -1;

    /* renamed from: f */
    public RecyclerView f110415f;

    /* renamed from: g */
    public ImageView f110416g;

    /* renamed from: h */
    public AnimatorSet f110417h = new AnimatorSet();

    /* renamed from: i */
    public int f110418i = 1;

    /* renamed from: j */
    public Map<String, Boolean> f110419j = new LinkedHashMap();

    /* renamed from: k */
    public C42613k f110420k;

    /* renamed from: w */
    public C42612j f110421w;

    /* renamed from: x */
    private boolean f110422x = true;

    /* renamed from: y */
    private final List<Animator> f110423y = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicItemAdapter$a */
    public static final class C42470a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CollectMusicItemAdapter f110424a;

        C42470a(CollectMusicItemAdapter collectMusicItemAdapter) {
            this.f110424a = collectMusicItemAdapter;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f110424a.f110418i = 3;
            this.f110424a.f110417h.end();
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f110424a.f110418i < 3) {
                this.f110424a.f110417h.start();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f110424a.f110418i++;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicItemAdapter$b */
    public static final class C42471b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CollectMusicItemAdapter f110425a;

        public final void run() {
            C1273i iVar;
            C1293v vVar;
            CollectMusicItemAdapter collectMusicItemAdapter = this.f110425a;
            RecyclerView recyclerView = this.f110425a.f110415f;
            if (recyclerView != null) {
                iVar = recyclerView.getLayoutManager();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                collectMusicItemAdapter.f110411b = ((LinearLayoutManager) iVar).mo5447l();
                int i = this.f110425a.f110411b;
                for (int c = this.f110425a.mo103997c(0); c < i; c++) {
                    CollectMusicItemAdapter collectMusicItemAdapter2 = this.f110425a;
                    RecyclerView recyclerView2 = this.f110425a.f110415f;
                    if (recyclerView2 != null) {
                        vVar = recyclerView2.mo5575f(c);
                    } else {
                        vVar = null;
                    }
                    collectMusicItemAdapter2.mo103996b(vVar, (c - 1) * 175);
                }
                this.f110425a.mo104001l();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }

        C42471b(CollectMusicItemAdapter collectMusicItemAdapter) {
            this.f110425a = collectMusicItemAdapter;
        }
    }

    /* renamed from: f */
    public final MusicModel mo103998f() {
        List list = this.f67539l;
        if (list != null) {
            return (MusicModel) C7525m.m23504c(list, this.f110414e);
        }
        return null;
    }

    /* renamed from: k */
    public final void mo104000k() {
        if (this.f110417h.isRunning()) {
            this.f110417h.cancel();
        }
    }

    /* renamed from: n */
    public final void mo104003n() {
        mo103995b(-1, false);
        this.f110413d = -1;
        this.f110414e = -1;
    }

    /* renamed from: o */
    private void m134962o() {
        C1293v vVar;
        if (this.f110414e >= 0) {
            RecyclerView recyclerView = this.f110415f;
            if (recyclerView != null) {
                vVar = recyclerView.mo5575f(this.f110414e);
            } else {
                vVar = null;
            }
            if (vVar instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) vVar).mo103986c();
            }
        }
    }

    /* renamed from: c */
    public final int mo60557c() {
        if (C6307b.m19566a((Collection<T>) this.f67539l)) {
            return 9;
        }
        return super.mo60557c();
    }

    /* renamed from: l */
    public final void mo104001l() {
        this.f110417h.playTogether(this.f110423y);
        this.f110417h.start();
        this.f110417h.addListener(new C42470a(this));
    }

    /* renamed from: j */
    public final void mo103999j() {
        this.f110412c = true;
        this.f110418i = 1;
        this.f110423y.clear();
        this.f110417h.cancel();
        this.f110417h.removeAllListeners();
        RecyclerView recyclerView = this.f110415f;
        if (recyclerView != null) {
            recyclerView.post(new C42471b(this));
        }
    }

    /* renamed from: m */
    public final void mo104002m() {
        C1293v vVar;
        if (this.f110414e >= 0) {
            RecyclerView recyclerView = this.f110415f;
            if (recyclerView != null) {
                vVar = recyclerView.mo5575f(this.f110414e);
            } else {
                vVar = null;
            }
            if (vVar instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) vVar).mo103987d();
            } else {
                notifyItemChanged(this.f110414e);
            }
        }
    }

    /* renamed from: e */
    private final int m134961e(int i) {
        if (this.f110410a) {
            return i - 1;
        }
        return i;
    }

    /* renamed from: c */
    public final int mo103997c(int i) {
        if (this.f110410a) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo58030a(View view) {
        Context context;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        return (int) C9738o.m28708b(context, 72.0f);
    }

    /* renamed from: d */
    public final void mo66516d(boolean z) {
        super.mo66516d(z);
        if (!z) {
            ImageView imageView = this.f110416g;
            if (imageView != null) {
                imageView.clearAnimation();
            }
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f110415f = recyclerView;
    }

    /* renamed from: b */
    public final MusicModel mo103994b(int i) {
        List list = this.f67539l;
        if (list != null) {
            return (MusicModel) C7525m.m23504c(list, m134961e(i));
        }
        return null;
    }

    public CollectMusicItemAdapter(C42612j jVar) {
        C7573i.m23587b(jVar, "onItemClickListener");
        this.f110421w = jVar;
    }

    /* renamed from: a */
    public final void mo62313a(C1293v vVar) {
        Context context;
        super.mo62313a(vVar);
        ImageView imageView = this.f110416g;
        if (imageView != null) {
            ImageView imageView2 = this.f110416g;
            if (imageView2 != null) {
                context = imageView2.getContext();
            } else {
                context = null;
            }
            imageView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.av));
        }
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        Context context;
        Integer num = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.a85, viewGroup, false);
        this.f110416g = (ImageView) inflate.findViewById(R.id.b_w);
        C1293v a_ = super.mo61886a_(viewGroup);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25960a(inflate));
            View view2 = viewGroup;
            LayoutParams layoutParams = new LayoutParams(mo58030a(view2), mo58030a(view2));
            if (viewGroup != null) {
                num = Integer.valueOf(viewGroup.getHeight());
            }
            if (num == null) {
                C7573i.m23580a();
            }
            layoutParams.bottomMargin = num.intValue() - mo58030a(view2);
            dmtStatusView.setLayoutParams(layoutParams);
            C7573i.m23582a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        boolean z;
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof MusicItemViewHolder) {
            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) vVar;
            if (musicItemViewHolder.getLayoutPosition() == this.f110413d) {
                MusicItemViewHolder.m134947a();
            }
            int adapterPosition = musicItemViewHolder.getAdapterPosition();
            List list = this.f67539l;
            if (list != null) {
                Collection collection = list;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    List list2 = this.f67539l;
                    if (list2 != null) {
                        MusicModel musicModel = (MusicModel) list2.get(adapterPosition);
                        if (musicModel != null) {
                            String musicId = musicModel.getMusicId();
                            if (musicId != null) {
                                if (this.f110419j.get(musicId) == null || C7573i.m23585a((Object) (Boolean) this.f110419j.get(musicId), (Object) Boolean.valueOf(false))) {
                                    this.f110419j.put(musicId, Boolean.valueOf(true));
                                    C42613k kVar = this.f110420k;
                                    if (kVar != null) {
                                        kVar.mo104208a(adapterPosition);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo103993a(int i, boolean z) {
        mo104002m();
        this.f110414e = i;
        if (z) {
            m134962o();
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "viewGroup");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C7573i.m23582a((Object) from, "LayoutInflater.from(viewGroup.context)");
        return new MusicItemViewHolder(C42465a.m134953a(from, viewGroup), this);
    }

    /* renamed from: b */
    public final void mo103995b(int i, boolean z) {
        C1293v vVar;
        int itemCount = getItemCount() - 1;
        int i2 = this.f110413d;
        C1293v vVar2 = null;
        if (i2 >= 0 && itemCount >= i2) {
            RecyclerView recyclerView = this.f110415f;
            if (recyclerView != null) {
                vVar = recyclerView.mo5575f(this.f110413d);
            } else {
                vVar = null;
            }
            if (vVar instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) vVar).mo103985a(false);
                MusicItemViewHolder.m134948b();
            } else {
                notifyItemChanged(this.f110413d);
            }
        }
        this.f110413d = i;
        if (this.f110413d < getItemCount()) {
            RecyclerView recyclerView2 = this.f110415f;
            if (recyclerView2 != null) {
                vVar2 = recyclerView2.mo5575f(this.f110413d);
            }
            if (vVar2 instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) vVar2).mo103985a(true);
                MusicItemViewHolder.m134947a();
            }
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        MusicModel musicModel;
        boolean z;
        boolean z2;
        C7573i.m23587b(vVar, "viewHolder");
        if (vVar instanceof MusicItemViewHolder) {
            boolean z3 = false;
            if (i >= this.f110411b) {
                this.f110422x = false;
            }
            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) vVar;
            List list = this.f67539l;
            if (list != null) {
                musicModel = (MusicModel) C7525m.m23504c(list, m134961e(i));
            } else {
                musicModel = null;
            }
            if (this.f110413d == i) {
                z = true;
            } else {
                z = false;
            }
            if (this.f110413d == this.f110414e || this.f110414e != i) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f110412c && this.f110422x) {
                z3 = true;
            }
            musicItemViewHolder.mo103984a(musicModel, z, z2, z3);
        }
    }

    /* renamed from: b */
    public final void mo103996b(C1293v vVar, int i) {
        if (vVar instanceof MusicItemViewHolder) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, 0.5f, 1.0f});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, 0.5f, 1.0f});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((MusicItemViewHolder) vVar).f110392a, new PropertyValuesHolder[]{ofFloat, ofFloat2});
            C7573i.m23582a((Object) ofPropertyValuesHolder, "scale");
            ofPropertyValuesHolder.setDuration(700);
            ofPropertyValuesHolder.setStartDelay((long) i);
            this.f110423y.add(ofPropertyValuesHolder);
        }
    }

    /* renamed from: a */
    public final void mo97305a(View view, int i) {
        C7573i.m23587b(view, "view");
        C42612j jVar = this.f110421w;
        if (jVar != null) {
            jVar.mo97305a(view, m134961e(i));
        }
    }
}
