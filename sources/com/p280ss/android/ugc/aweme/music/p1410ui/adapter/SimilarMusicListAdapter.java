package com.p280ss.android.ugc.aweme.music.p1410ui.adapter;

import android.arch.lifecycle.C0043i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicListViewHolder;
import com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel.C34015d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.p1878b.C47891a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.music.ui.adapter.SimilarMusicListAdapter */
public final class SimilarMusicListAdapter extends JediBaseSingleTypeAdapter<C34015d> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f88524c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListAdapter.class), "screenWidth", "getScreenWidth()F")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SimilarMusicListAdapter.class), "cellHeight", "getCellHeight()F"))};

    /* renamed from: d */
    public final C0043i f88525d;

    /* renamed from: e */
    private HashMap<Integer, Integer> f88526e = new HashMap<>();

    /* renamed from: f */
    private final C7541d f88527f = C7546e.m23569a(C33926c.f88531a);

    /* renamed from: g */
    private final C7541d f88528g = C7546e.m23569a(new C33925b(this));

    /* renamed from: h */
    private C33924a f88529h;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.adapter.SimilarMusicListAdapter$a */
    public interface C33924a {
        /* renamed from: a */
        void mo86564a(Aweme aweme, int i, int i2);

        /* renamed from: a */
        void mo86565a(Music music, int i);

        /* renamed from: a */
        void mo86566a(boolean z);

        /* renamed from: b */
        void mo86568b(Music music, int i);

        /* renamed from: c */
        void mo86570c(Music music, int i);

        /* renamed from: d */
        void mo86571d(Music music, int i);

        /* renamed from: e */
        void mo86572e(Music music, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.adapter.SimilarMusicListAdapter$b */
    static final class C33925b extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListAdapter f88530a;

        C33925b(SimilarMusicListAdapter similarMusicListAdapter) {
            this.f88530a = similarMusicListAdapter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m109361a());
        }

        /* renamed from: a */
        private float m109361a() {
            return ((this.f88530a.mo86585f() / 2.0f) * 4.0f) / 3.0f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.adapter.SimilarMusicListAdapter$c */
    static final class C33926c extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        public static final C33926c f88531a = new C33926c();

        C33926c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m109362a());
        }

        /* renamed from: a */
        private static float m109362a() {
            return ((float) C9738o.m28691a(C6399b.m19921a())) - C9738o.m28708b(C6399b.m19921a(), 33.0f);
        }
    }

    /* renamed from: j */
    private final float m109349j() {
        return ((Number) this.f88528g.getValue()).floatValue();
    }

    /* renamed from: f */
    public final float mo86585f() {
        return ((Number) this.f88527f.getValue()).floatValue();
    }

    /* renamed from: g */
    public final float mo86586g() {
        return m109349j();
    }

    /* renamed from: a */
    public final void mo86584a(C33924a aVar) {
        C7573i.m23587b(aVar, "onItemOperationListener");
        this.f88529h = aVar;
    }

    public SimilarMusicListAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "parent");
        super(iVar, new RecommendMusicDiff(), null, 4, null);
        this.f88525d = iVar;
    }

    /* renamed from: a */
    public final JediViewHolder<? extends C11501d, C34015d> mo60559a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a36, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        SimilarMusicListViewHolder similarMusicListViewHolder = new SimilarMusicListViewHolder(inflate, C47891a.m148821a(m109349j()), getItemCount(), this.f88529h, this.f88526e);
        return similarMusicListViewHolder;
    }
}
