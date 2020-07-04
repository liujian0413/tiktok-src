package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder.ChooseImageViewHolder.C31409a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder.ChooseVideoViewHolder.C31410a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder.MediaChooseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.adapter.MediaChooseAdapter */
public class MediaChooseAdapter extends C1262a<MediaChooseViewHolder> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82186a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaChooseAdapter.class), "data", "getData()Ljava/util/List;"))};

    /* renamed from: c */
    public static final C31379a f82187c = new C31379a(null);

    /* renamed from: b */
    public RecyclerView f82188b;

    /* renamed from: d */
    private final C7541d f82189d = C7546e.m23569a(C31380b.f82192a);

    /* renamed from: e */
    private int f82190e = -1;

    /* renamed from: f */
    private final MediaChooseViewModel f82191f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.adapter.MediaChooseAdapter$a */
    public static final class C31379a {
        private C31379a() {
        }

        public /* synthetic */ C31379a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.adapter.MediaChooseAdapter$b */
    static final class C31380b extends Lambda implements C7561a<List<MediaModel>> {

        /* renamed from: a */
        public static final C31380b f82192a = new C31380b();

        C31380b() {
            super(0);
        }

        /* renamed from: a */
        private static List<MediaModel> m102129a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102129a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<MediaModel> mo81943a() {
        return (List) this.f82189d.getValue();
    }

    public int getItemCount() {
        return mo81943a().size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onViewAttachedToWindow(MediaChooseViewHolder mediaChooseViewHolder) {
        C7573i.m23587b(mediaChooseViewHolder, "holder");
        super.onViewAttachedToWindow(mediaChooseViewHolder);
        mediaChooseViewHolder.mo81989g();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onViewDetachedFromWindow(MediaChooseViewHolder mediaChooseViewHolder) {
        C7573i.m23587b(mediaChooseViewHolder, "holder");
        super.onViewDetachedFromWindow(mediaChooseViewHolder);
        mediaChooseViewHolder.mo81990h();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f82188b = recyclerView;
        super.onAttachedToRecyclerView(recyclerView);
    }

    public MediaChooseAdapter(MediaChooseViewModel mediaChooseViewModel) {
        C7573i.m23587b(mediaChooseViewModel, "viewModel");
        this.f82191f = mediaChooseViewModel;
    }

    public int getItemViewType(int i) {
        if (((MediaModel) mo81943a().get(i)).isVideo()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo81945a(List<MediaModel> list) {
        C7573i.m23587b(list, "list");
        mo81943a().clear();
        mo81943a().addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public MediaChooseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 1) {
            return C31410a.m102190a(viewGroup, this.f82191f);
        }
        return C31409a.m102184a(viewGroup, this.f82191f);
    }

    /* renamed from: a */
    public void onBindViewHolder(MediaChooseViewHolder mediaChooseViewHolder, int i) {
        int i2;
        C7573i.m23587b(mediaChooseViewHolder, "viewHolder");
        if (this.f82190e <= 0) {
            RecyclerView recyclerView = this.f82188b;
            if (recyclerView != null) {
                i2 = recyclerView.getMeasuredWidth();
            } else {
                i2 = -1;
            }
            this.f82190e = i2 / 4;
        }
        mediaChooseViewHolder.mo81985a((MediaModel) mo81943a().get(i), this.f82190e, this.f82190e);
    }
}
