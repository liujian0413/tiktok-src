package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.PreviewImageViewHolder */
public final class PreviewImageViewHolder extends MediaPreviewViewHolder {

    /* renamed from: d */
    public static final C31459a f82373d = new C31459a(null);

    /* renamed from: e */
    private RemoteImageView f82374e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.PreviewImageViewHolder$a */
    public static final class C31459a {
        private C31459a() {
        }

        public /* synthetic */ C31459a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static PreviewImageViewHolder m102316a(ViewGroup viewGroup, MediaPreviewViewModel mediaPreviewViewModel) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(mediaPreviewViewModel, "viewModel");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xu, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new PreviewImageViewHolder(inflate, mediaPreviewViewModel);
        }
    }

    /* renamed from: g */
    public final View mo82076g() {
        RemoteImageView remoteImageView = this.f82374e;
        if (remoteImageView == null) {
            C7573i.m23583a("ivCover");
        }
        return remoteImageView;
    }

    /* renamed from: b */
    public final void mo80310b() {
        Object a = mo80306a((int) R.id.b7x);
        C7573i.m23582a(a, "findViewById(R.id.iv_cover)");
        this.f82374e = (RemoteImageView) a;
    }

    /* renamed from: a */
    public final void mo80308a(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "data");
        if (mediaModel != this.f82367b && (mediaModel.isGif() || mediaModel.isImage())) {
            super.mo80308a(mediaModel);
            String filePath = mediaModel.getFilePath();
            if (filePath != null) {
                RemoteImageView remoteImageView = this.f82374e;
                if (remoteImageView == null) {
                    C7573i.m23583a("ivCover");
                }
                StringBuilder sb = new StringBuilder("file://");
                sb.append(filePath);
                String sb2 = sb.toString();
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                int width = view.getWidth();
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                C23323e.m76525b(remoteImageView, sb2, width, view2.getHeight());
            }
        }
    }

    public PreviewImageViewHolder(View view, MediaPreviewViewModel mediaPreviewViewModel) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(mediaPreviewViewModel, "viewModel");
        super(view, mediaPreviewViewModel);
    }
}
