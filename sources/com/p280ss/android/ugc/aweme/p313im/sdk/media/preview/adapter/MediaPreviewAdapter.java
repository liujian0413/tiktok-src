package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.adapter;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewholder.MediaPreviewViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewholder.PreviewImageViewHolder.C31459a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewholder.PreviewVideoViewHolder.C31460a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.adapter.MediaPreviewAdapter */
public final class MediaPreviewAdapter extends C1262a<MediaPreviewViewHolder> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82348a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaPreviewAdapter.class), "data", "getData()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C31450a f82349b = new C31450a(null);

    /* renamed from: c */
    private final C7541d f82350c = C7546e.m23569a(C31451b.f82353a);

    /* renamed from: d */
    private RecyclerView f82351d;

    /* renamed from: e */
    private final MediaPreviewViewModel f82352e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.adapter.MediaPreviewAdapter$a */
    public static final class C31450a {
        private C31450a() {
        }

        public /* synthetic */ C31450a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.adapter.MediaPreviewAdapter$b */
    static final class C31451b extends Lambda implements C7561a<List<MediaModel>> {

        /* renamed from: a */
        public static final C31451b f82353a = new C31451b();

        C31451b() {
            super(0);
        }

        /* renamed from: a */
        private static List<MediaModel> m102285a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102285a();
        }
    }

    /* renamed from: a */
    private final List<MediaModel> m102278a() {
        return (List) this.f82350c.getValue();
    }

    public final int getItemCount() {
        return m102278a().size();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onViewDetachedFromWindow(MediaPreviewViewHolder mediaPreviewViewHolder) {
        C7573i.m23587b(mediaPreviewViewHolder, "holder");
        super.onViewDetachedFromWindow(mediaPreviewViewHolder);
        mediaPreviewViewHolder.mo82075f();
    }

    public MediaPreviewAdapter(MediaPreviewViewModel mediaPreviewViewModel) {
        C7573i.m23587b(mediaPreviewViewModel, "viewModel");
        this.f82352e = mediaPreviewViewModel;
    }

    public final int getItemViewType(int i) {
        if (((MediaModel) m102278a().get(i)).isVideo()) {
            return 2;
        }
        return 1;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.mo5528a((C1281m) new MediaPreviewAdapter$onAttachedToRecyclerView$1(this));
        this.f82351d = recyclerView;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onViewAttachedToWindow(MediaPreviewViewHolder mediaPreviewViewHolder) {
        C7573i.m23587b(mediaPreviewViewHolder, "holder");
        super.onViewAttachedToWindow(mediaPreviewViewHolder);
        mediaPreviewViewHolder.mo82074e();
    }

    /* renamed from: a */
    public final void mo82053a(RecyclerView recyclerView) {
        int i;
        boolean z;
        C7573i.m23587b(recyclerView, "recyclerView");
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            i = linearLayoutManager.mo5445j();
        } else {
            i = -1;
        }
        int size = m102278a().size();
        if (i >= 0 && size > i) {
            C23084b o = this.f82352e.mo82089o();
            Object obj = m102278a().get(i);
            if (((MediaModel) obj) != ((MediaModel) o.getValue())) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                obj = null;
            }
            MediaModel mediaModel = (MediaModel) obj;
            if (mediaModel != null) {
                o.setValue(mediaModel);
            }
        }
    }

    /* renamed from: a */
    public final void mo82054a(MediaModel mediaModel) {
        if (mediaModel != null) {
            if (!m102278a().contains(mediaModel)) {
                mediaModel = null;
            }
            if (mediaModel != null) {
                RecyclerView recyclerView = this.f82351d;
                if (recyclerView != null) {
                    recyclerView.mo5541b(m102278a().indexOf(mediaModel));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo82055a(List<MediaModel> list) {
        C7573i.m23587b(list, "list");
        m102278a().clear();
        m102278a().addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MediaPreviewViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 2) {
            return C31460a.m102337a(viewGroup, this.f82352e);
        }
        return C31459a.m102316a(viewGroup, this.f82352e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(MediaPreviewViewHolder mediaPreviewViewHolder, int i) {
        C7573i.m23587b(mediaPreviewViewHolder, "viewHolder");
        mediaPreviewViewHolder.mo80308a((MediaModel) m102278a().get(i));
    }
}
