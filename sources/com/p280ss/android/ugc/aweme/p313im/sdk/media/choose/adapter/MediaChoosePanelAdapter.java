package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder.MediaChooseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder.PanelChooseImageViewHolder.C31415a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder.PanelChooseVideoViewHolder.C31416a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.adapter.MediaChoosePanelAdapter */
public final class MediaChoosePanelAdapter extends MediaChooseAdapter {

    /* renamed from: e */
    public static final C31381a f82193e = new C31381a(null);

    /* renamed from: g */
    private static final int f82194g = C6399b.m19921a().getResources().getDimensionPixelSize(R.dimen.i0);

    /* renamed from: h */
    private static final int f82195h = C6399b.m19921a().getResources().getDimensionPixelSize(R.dimen.i3);

    /* renamed from: d */
    public int f82196d = -1;

    /* renamed from: f */
    private final MediaPanelChooseViewModel f82197f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.adapter.MediaChoosePanelAdapter$a */
    public static final class C31381a {
        private C31381a() {
        }

        public /* synthetic */ C31381a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.adapter.MediaChoosePanelAdapter$b */
    static final class C31382b extends Lambda implements C7562b<MediaModel, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaChoosePanelAdapter f82198a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f82199b;

        /* renamed from: c */
        final /* synthetic */ MediaChooseViewHolder f82200c;

        C31382b(MediaChoosePanelAdapter mediaChoosePanelAdapter, MediaModel mediaModel, MediaChooseViewHolder mediaChooseViewHolder) {
            this.f82198a = mediaChoosePanelAdapter;
            this.f82199b = mediaModel;
            this.f82200c = mediaChooseViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102134a((MediaModel) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102134a(MediaModel mediaModel) {
            C7573i.m23587b(mediaModel, "it");
            this.f82200c.mo81985a(this.f82199b, this.f82198a.mo81946a(this.f82199b), this.f82198a.f82196d);
        }
    }

    public MediaChoosePanelAdapter(MediaPanelChooseViewModel mediaPanelChooseViewModel) {
        C7573i.m23587b(mediaPanelChooseViewModel, "viewModel");
        super(mediaPanelChooseViewModel);
        this.f82197f = mediaPanelChooseViewModel;
    }

    /* renamed from: a */
    public final int mo81946a(MediaModel mediaModel) {
        int i;
        if (this.f82196d < 0) {
            RecyclerView recyclerView = this.f82188b;
            if (recyclerView != null) {
                i = recyclerView.getMeasuredHeight();
            } else {
                i = -1;
            }
            this.f82196d = i;
        }
        if (this.f82196d < 0) {
            this.f82196d = f82195h;
        }
        if (this.f82196d <= 0 || mediaModel.getWidth() <= 0 || mediaModel.getHeight() <= 0) {
            return f82194g;
        }
        float width = ((float) mediaModel.getWidth()) / ((float) mediaModel.getHeight());
        double d = (double) width;
        if (d < 0.5625d) {
            double d2 = (double) this.f82196d;
            Double.isNaN(d2);
            return (int) (d2 * 0.5625d);
        } else if (d <= 1.7777777777777777d) {
            return (int) (((float) this.f82196d) * width);
        } else {
            double d3 = (double) this.f82196d;
            Double.isNaN(d3);
            return (int) (d3 * 1.7777777777777777d);
        }
    }

    /* renamed from: a */
    public final void mo81945a(List<MediaModel> list) {
        C7573i.m23587b(list, "list");
        if (!C7573i.m23585a((Object) mo81943a(), (Object) list)) {
            super.mo81945a(list);
        }
    }

    /* renamed from: a */
    public final MediaChooseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 1) {
            return C31416a.m102215a(viewGroup, this.f82197f);
        }
        return C31415a.m102210a(viewGroup, this.f82197f);
    }

    /* renamed from: a */
    public final void onBindViewHolder(MediaChooseViewHolder mediaChooseViewHolder, int i) {
        C7573i.m23587b(mediaChooseViewHolder, "viewHolder");
        MediaModel mediaModel = (MediaModel) mo81943a().get(i);
        mediaModel.accurateSize(false, new C31382b(this, mediaModel, mediaChooseViewHolder));
    }
}
