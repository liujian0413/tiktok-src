package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder;

import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.C31448a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.model.MediaPreviewSettings;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1334b.C31454b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.PanelChooseVideoViewHolder */
public final class PanelChooseVideoViewHolder extends ChooseVideoViewHolder {

    /* renamed from: k */
    public static final C31416a f82283k = new C31416a(null);

    /* renamed from: l */
    private View f82284l;

    /* renamed from: m */
    private final boolean f82285m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.PanelChooseVideoViewHolder$a */
    public static final class C31416a {
        private C31416a() {
        }

        public /* synthetic */ C31416a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static PanelChooseVideoViewHolder m102215a(ViewGroup viewGroup, MediaPanelChooseViewModel mediaPanelChooseViewModel) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(mediaPanelChooseViewModel, "viewModel");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xt, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new PanelChooseVideoViewHolder(inflate, mediaPanelChooseViewModel);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo81987e() {
        return this.f82285m;
    }

    /* renamed from: b */
    public final void mo80310b() {
        super.mo80310b();
        Object a = mo80306a((int) R.id.bh9);
        C7573i.m23582a(a, "findViewById(R.id.layout_duration)");
        this.f82284l = (View) a;
        View view = this.f82284l;
        if (view == null) {
            C7573i.m23583a("layoutDuration");
        }
        view.setVisibility(8);
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

    public PanelChooseVideoViewHolder(View view, MediaPanelChooseViewModel mediaPanelChooseViewModel) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(mediaPanelChooseViewModel, "viewModel");
        super(view, mediaPanelChooseViewModel);
    }

    /* renamed from: a */
    public final void mo81985a(MediaModel mediaModel, int i, int i2) {
        C7573i.m23587b(mediaModel, "data");
        View view = this.f82284l;
        if (view == null) {
            C7573i.m23583a("layoutDuration");
        }
        view.setVisibility(0);
        super.mo81985a(mediaModel, i, i2);
    }
}
