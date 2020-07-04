package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b.C31345b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.ChooseImageViewHolder */
public class ChooseImageViewHolder extends MediaChooseViewHolder {

    /* renamed from: b */
    public static final C31409a f82262b = new C31409a(null);

    /* renamed from: k */
    private final boolean f82263k = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.ChooseImageViewHolder$a */
    public static final class C31409a {
        private C31409a() {
        }

        public /* synthetic */ C31409a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ChooseImageViewHolder m102184a(ViewGroup viewGroup, MediaChooseViewModel mediaChooseViewModel) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(mediaChooseViewModel, "viewModel");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xn, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new ChooseImageViewHolder(inflate, mediaChooseViewModel);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo81986e() {
        return this.f82263k;
    }

    public ChooseImageViewHolder(View view, MediaChooseViewModel mediaChooseViewModel) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(mediaChooseViewModel, "viewModel");
        super(view, mediaChooseViewModel);
    }

    /* renamed from: a */
    public final void mo81985a(MediaModel mediaModel, int i, int i2) {
        C7573i.m23587b(mediaModel, "data");
        if (mediaModel.isImage() || mediaModel.isGif()) {
            super.mo81985a(mediaModel, i, i2);
            C31345b.f82130a.mo81919a(mo81988f(), mediaModel, i, i2, mo81986e());
        }
    }
}
