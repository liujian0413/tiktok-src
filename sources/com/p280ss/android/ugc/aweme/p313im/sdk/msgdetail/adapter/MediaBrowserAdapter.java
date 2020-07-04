package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.adapter;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.p1342a.C31547a;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewholder.AbsMediaViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewholder.PictureViewHolder.C31556a;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewholder.VideoViewHolder.C31568a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.adapter.MediaBrowserAdapter */
public final class MediaBrowserAdapter extends C1262a<AbsMediaViewHolder> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82584a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaBrowserAdapter.class), "data", "getData()Ljava/util/List;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaBrowserAdapter.class), "attachedViewHolders", "getAttachedViewHolders()Ljava/util/ArrayList;"))};

    /* renamed from: b */
    public static final C31549a f82585b = new C31549a(null);

    /* renamed from: c */
    private final C7541d f82586c = C31553a.m102575a(C31552d.f82594a);

    /* renamed from: d */
    private final C7541d f82587d = C31553a.m102575a(C31551c.f82593a);

    /* renamed from: e */
    private boolean f82588e = true;

    /* renamed from: f */
    private boolean f82589f = true;

    /* renamed from: g */
    private final C31550b f82590g;

    /* renamed from: h */
    private final RecyclerView f82591h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.adapter.MediaBrowserAdapter$a */
    public static final class C31549a {
        private C31549a() {
        }

        public /* synthetic */ C31549a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.adapter.MediaBrowserAdapter$b */
    public interface C31550b {
        /* renamed from: j */
        void mo82250j();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.adapter.MediaBrowserAdapter$c */
    static final class C31551c extends Lambda implements C7561a<ArrayList<AbsMediaViewHolder>> {

        /* renamed from: a */
        public static final C31551c f82593a = new C31551c();

        C31551c() {
            super(0);
        }

        /* renamed from: a */
        private static ArrayList<AbsMediaViewHolder> m102573a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102573a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.adapter.MediaBrowserAdapter$d */
    static final class C31552d extends Lambda implements C7561a<List<C31547a<BaseContent>>> {

        /* renamed from: a */
        public static final C31552d f82594a = new C31552d();

        C31552d() {
            super(0);
        }

        /* renamed from: a */
        private static List<C31547a<BaseContent>> m102574a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102574a();
        }
    }

    /* renamed from: g */
    private final List<C31547a<BaseContent>> m102562g() {
        return (List) this.f82586c.getValue();
    }

    /* renamed from: h */
    private final ArrayList<AbsMediaViewHolder> m102563h() {
        return (ArrayList) this.f82587d.getValue();
    }

    /* renamed from: c */
    public final void mo82271c() {
        this.f82588e = false;
    }

    /* renamed from: b */
    public final List<C31547a<BaseContent>> mo82269b() {
        return m102562g();
    }

    public final int getItemCount() {
        return m102562g().size();
    }

    /* renamed from: d */
    public final C31547a<BaseContent> mo82272d() {
        if (m102563h().isEmpty()) {
            return null;
        }
        Object obj = m102563h().get(0);
        C7573i.m23582a(obj, "attachedViewHolders[0]");
        return ((AbsMediaViewHolder) obj).f82600e;
    }

    /* renamed from: e */
    public final boolean mo82273e() {
        if (m102563h().isEmpty()) {
            return false;
        }
        return ((AbsMediaViewHolder) m102563h().get(0)).mo82282d();
    }

    /* renamed from: f */
    public final boolean mo82274f() {
        if (m102563h().isEmpty()) {
            return false;
        }
        return ((AbsMediaViewHolder) m102563h().get(0)).mo82283e();
    }

    /* renamed from: a */
    public final void mo82267a() {
        if (this.f82588e) {
            if (this.f82589f) {
                this.f82589f = false;
                return;
            }
            C1273i layoutManager = this.f82591h.getLayoutManager();
            if (layoutManager != null) {
                int m = ((LinearLayoutManager) layoutManager).mo5448m();
                if (m >= 0 && 2 >= m) {
                    this.f82590g.mo82250j();
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onViewDetachedFromWindow(AbsMediaViewHolder absMediaViewHolder) {
        C7573i.m23587b(absMediaViewHolder, "holder");
        super.onViewDetachedFromWindow(absMediaViewHolder);
        absMediaViewHolder.mo82285g();
        m102563h().remove(absMediaViewHolder);
    }

    public final int getItemViewType(int i) {
        BaseContent baseContent = (BaseContent) ((C31547a) m102562g().get(i)).f82581a;
        if (baseContent instanceof StoryVideoContent) {
            return 1;
        }
        if (baseContent instanceof StoryPictureContent) {
            return 2;
        }
        boolean z = baseContent instanceof OnlyPictureContent;
        return 3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onViewAttachedToWindow(AbsMediaViewHolder absMediaViewHolder) {
        C7573i.m23587b(absMediaViewHolder, "holder");
        super.onViewAttachedToWindow(absMediaViewHolder);
        absMediaViewHolder.mo82284f();
        m102563h().add(absMediaViewHolder);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AbsMediaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i != 1) {
            return C31556a.m102604a(viewGroup, this.f82591h);
        }
        return C31568a.m102631a(viewGroup, this.f82591h);
    }

    public MediaBrowserAdapter(C31550b bVar, RecyclerView recyclerView) {
        C7573i.m23587b(bVar, "callback");
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f82590g = bVar;
        this.f82591h = recyclerView;
        this.f82591h.mo5528a((C1281m) new C1281m(this) {

            /* renamed from: a */
            final /* synthetic */ MediaBrowserAdapter f82592a;

            {
                this.f82592a = r1;
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                C7573i.m23587b(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                this.f82592a.mo82267a();
            }
        });
    }

    /* renamed from: b */
    public final void mo82270b(List<C31547a<BaseContent>> list, boolean z) {
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int size = list.size() - m102562g().size();
            m102562g().clear();
            m102562g().addAll(collection);
            if (size > 0) {
                notifyItemRangeInserted(0, size);
            } else {
                notifyDataSetChanged();
            }
        }
        this.f82588e = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(AbsMediaViewHolder absMediaViewHolder, int i) {
        C7573i.m23587b(absMediaViewHolder, "viewHolder");
        absMediaViewHolder.mo82278a((C31547a) m102562g().get(i));
    }

    /* renamed from: a */
    public final void mo82268a(List<C31547a<BaseContent>> list, boolean z) {
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            m102562g().clear();
            m102562g().addAll(collection);
            notifyDataSetChanged();
        }
        this.f82588e = true;
    }
}
