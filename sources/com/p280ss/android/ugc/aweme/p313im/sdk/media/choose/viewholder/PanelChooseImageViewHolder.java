package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder;

import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.C31448a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.model.MediaPreviewSettings;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1334b.C31454b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.PanelChooseImageViewHolder */
public final class PanelChooseImageViewHolder extends ChooseImageViewHolder {

    /* renamed from: k */
    public static final C31415a f82281k = new C31415a(null);

    /* renamed from: l */
    private final boolean f82282l;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.PanelChooseImageViewHolder$a */
    public static final class C31415a {
        private C31415a() {
        }

        public /* synthetic */ C31415a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static PanelChooseImageViewHolder m102210a(ViewGroup viewGroup, MediaPanelChooseViewModel mediaPanelChooseViewModel) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(mediaPanelChooseViewModel, "viewModel");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xs, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new PanelChooseImageViewHolder(inflate, mediaPanelChooseViewModel);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo81986e() {
        return this.f82282l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo81993k() {
        FragmentActivity d = mo80312d();
        if (d != null) {
            MediaChooseViewModel mediaChooseViewModel = this.f82275j;
            if (mediaChooseViewModel != null) {
                MediaPanelChooseViewModel mediaPanelChooseViewModel = (MediaPanelChooseViewModel) mediaChooseViewModel;
                C31454b.m102297a(d, new MediaPreviewSettings(1, mediaPanelChooseViewModel.f82289d), new C31448a((List) mediaPanelChooseViewModel.mo82006o().getValue(), this.f82273h, (List) mediaPanelChooseViewModel.mo82000b().getValue()), AdError.CACHE_ERROR_CODE);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel");
        }
    }

    public PanelChooseImageViewHolder(View view, MediaPanelChooseViewModel mediaPanelChooseViewModel) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(mediaPanelChooseViewModel, "viewModel");
        super(view, mediaPanelChooseViewModel);
    }
}
