package com.p280ss.android.ugc.aweme.profile.adapter;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixAdapter */
public final class MediaMixAdapter extends JediBaseSingleTypeAdapter<MixStruct> {

    /* renamed from: c */
    public static final MixStruct f93602c = new MixStruct();

    /* renamed from: d */
    public static final C35690a f93603d = new C35690a(null);

    /* renamed from: e */
    private final MediaMixListViewModel f93604e;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixAdapter$a */
    public static final class C35690a {
        private C35690a() {
        }

        /* renamed from: a */
        public static MixStruct m115372a() {
            return MediaMixAdapter.f93602c;
        }

        public /* synthetic */ C35690a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (((MixStruct) aC_().mo29144a(i, false)) == f93602c) {
            return Integer.MIN_VALUE;
        }
        return super.mo58029a(i);
    }

    /* renamed from: a */
    public final JediViewHolder<? extends C11501d, MixStruct> mo60559a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        MediaMixViewHolder mediaMixViewHolder = new MediaMixViewHolder(viewGroup, this.f93604e, null, 4, null);
        return mediaMixViewHolder;
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        C1293v a_ = super.mo61886a_(viewGroup);
        View view = a_.itemView;
        C7573i.m23582a((Object) view, "holder.itemView");
        view.getLayoutParams().width = (int) C9738o.m28708b(viewGroup.getContext(), 72.0f);
        C7573i.m23582a((Object) a_, "holder");
        return a_;
    }

    public MediaMixAdapter(C0043i iVar, MediaMixListViewModel mediaMixListViewModel) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(mediaMixListViewModel, "mMediaMixListViewModel");
        super(iVar, new Diff(), null, 4, null);
        this.f93604e = mediaMixListViewModel;
        this.f67566v = false;
    }
}
