package com.p280ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.p280ss.android.ugc.aweme.common.p1142c.C25664e;
import com.p280ss.android.ugc.aweme.feed.adapter.SuperRecommendAdapter;
import com.p280ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder;
import com.p280ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapter.C36630b;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView */
public final class RecommendSuperUserView extends RelativeLayout {

    /* renamed from: a */
    public RecyclerView f74762a;

    /* renamed from: b */
    public SuperRecommendAdapter f74763b;

    /* renamed from: c */
    public GalleryLayoutManager f74764c;

    /* renamed from: d */
    private String f74765d = "";

    /* renamed from: e */
    private List<UserWithAweme> f74766e = new ArrayList();

    public final List<UserWithAweme> getMCardItems() {
        return this.f74766e;
    }

    public final String getRequestId() {
        return this.f74765d;
    }

    public final SuperRecommendAdapter getAdapter() {
        SuperRecommendAdapter superRecommendAdapter = this.f74763b;
        if (superRecommendAdapter == null) {
            C7573i.m23583a("adapter");
        }
        return superRecommendAdapter;
    }

    public final GalleryLayoutManager getLayoutManager() {
        GalleryLayoutManager galleryLayoutManager = this.f74764c;
        if (galleryLayoutManager == null) {
            C7573i.m23583a("layoutManager");
        }
        return galleryLayoutManager;
    }

    public final RecyclerView getList() {
        RecyclerView recyclerView = this.f74762a;
        if (recyclerView == null) {
            C7573i.m23583a("list");
        }
        return recyclerView;
    }

    /* renamed from: a */
    public final void mo72061a() {
        GalleryLayoutManager galleryLayoutManager = this.f74764c;
        if (galleryLayoutManager == null) {
            C7573i.m23583a("layoutManager");
        }
        if (galleryLayoutManager != null) {
            GalleryLayoutManager galleryLayoutManager2 = this.f74764c;
            if (galleryLayoutManager2 == null) {
                C7573i.m23583a("layoutManager");
            }
            galleryLayoutManager2.mo72059g();
        }
    }

    /* renamed from: b */
    public final void mo72062b() {
        RecyclerView recyclerView = this.f74762a;
        if (recyclerView == null) {
            C7573i.m23583a("list");
        }
        GalleryLayoutManager galleryLayoutManager = this.f74764c;
        if (galleryLayoutManager == null) {
            C7573i.m23583a("layoutManager");
        }
        C1293v f = recyclerView.mo5575f(galleryLayoutManager.f74738a);
        if (f == null) {
            return;
        }
        if (f != null) {
            ((SuperRecommendViewHolder) f).mo71622e();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
    }

    /* renamed from: d */
    private void m93278d() {
        this.f74762a = new RecyclerView(getContext());
        RecyclerView recyclerView = this.f74762a;
        if (recyclerView == null) {
            C7573i.m23583a("list");
        }
        addView(recyclerView, new LayoutParams(-1, -1));
        this.f74764c = new GalleryLayoutManager(0);
        GalleryLayoutManager galleryLayoutManager = this.f74764c;
        if (galleryLayoutManager == null) {
            C7573i.m23583a("layoutManager");
        }
        RecyclerView recyclerView2 = this.f74762a;
        if (recyclerView2 == null) {
            C7573i.m23583a("list");
        }
        galleryLayoutManager.mo72055a(recyclerView2, 0);
        GalleryLayoutManager galleryLayoutManager2 = this.f74764c;
        if (galleryLayoutManager2 == null) {
            C7573i.m23583a("layoutManager");
        }
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        galleryLayoutManager2.f74743f = new C28397l(context);
        GalleryLayoutManager galleryLayoutManager3 = this.f74764c;
        if (galleryLayoutManager3 == null) {
            C7573i.m23583a("layoutManager");
        }
        this.f74763b = m93277a(galleryLayoutManager3);
        RecyclerView recyclerView3 = this.f74762a;
        if (recyclerView3 == null) {
            C7573i.m23583a("list");
        }
        SuperRecommendAdapter superRecommendAdapter = this.f74763b;
        if (superRecommendAdapter == null) {
            C7573i.m23583a("adapter");
        }
        recyclerView3.setAdapter(superRecommendAdapter);
        RecyclerView recyclerView4 = this.f74762a;
        if (recyclerView4 == null) {
            C7573i.m23583a("list");
        }
        RecyclerView recyclerView5 = this.f74762a;
        if (recyclerView5 == null) {
            C7573i.m23583a("list");
        }
        recyclerView4.setItemAnimator(new SwitchItemAnimator(recyclerView5));
    }

    /* renamed from: c */
    public final void mo72063c() {
        RecyclerView recyclerView = this.f74762a;
        if (recyclerView == null) {
            C7573i.m23583a("list");
        }
        GalleryLayoutManager galleryLayoutManager = this.f74764c;
        if (galleryLayoutManager == null) {
            C7573i.m23583a("layoutManager");
        }
        C1293v f = recyclerView.mo5575f(galleryLayoutManager.f74738a);
        if (f != null) {
            if (f != null) {
                ((SuperRecommendViewHolder) f).mo71623f();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
            }
        }
        RecyclerView recyclerView2 = this.f74762a;
        if (recyclerView2 == null) {
            C7573i.m23583a("list");
        }
        GalleryLayoutManager galleryLayoutManager2 = this.f74764c;
        if (galleryLayoutManager2 == null) {
            C7573i.m23583a("layoutManager");
        }
        C1293v f2 = recyclerView2.mo5575f(galleryLayoutManager2.f74738a + 1);
        if (f2 != null) {
            if (f2 != null) {
                ((SuperRecommendViewHolder) f2).mo71620c();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
            }
        }
        RecyclerView recyclerView3 = this.f74762a;
        if (recyclerView3 == null) {
            C7573i.m23583a("list");
        }
        GalleryLayoutManager galleryLayoutManager3 = this.f74764c;
        if (galleryLayoutManager3 == null) {
            C7573i.m23583a("layoutManager");
        }
        C1293v f3 = recyclerView3.mo5575f(galleryLayoutManager3.f74738a - 1);
        if (f3 == null) {
            return;
        }
        if (f3 != null) {
            ((SuperRecommendViewHolder) f3).mo71620c();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder");
    }

    public final void setAdapter(SuperRecommendAdapter superRecommendAdapter) {
        C7573i.m23587b(superRecommendAdapter, "<set-?>");
        this.f74763b = superRecommendAdapter;
    }

    public final void setLayoutManager(GalleryLayoutManager galleryLayoutManager) {
        C7573i.m23587b(galleryLayoutManager, "<set-?>");
        this.f74764c = galleryLayoutManager;
    }

    public final void setList(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "<set-?>");
        this.f74762a = recyclerView;
    }

    public final void setMCardItems(List<UserWithAweme> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f74766e = list;
    }

    public final void setRequestId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f74765d = str;
    }

    public RecommendSuperUserView(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        m93278d();
    }

    /* renamed from: a */
    private SuperRecommendAdapter m93277a(GalleryLayoutManager galleryLayoutManager) {
        C7573i.m23587b(galleryLayoutManager, "layoutManager");
        SuperRecommendAdapter superRecommendAdapter = new SuperRecommendAdapter(galleryLayoutManager);
        superRecommendAdapter.mo66516d(false);
        superRecommendAdapter.mo62323c(this.f74766e);
        return superRecommendAdapter;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C7573i.m23587b(motionEvent, "ev");
        ViewParent parent = getParent();
        if (parent != null) {
            if (!(parent instanceof RecyclerView)) {
                z = true;
            } else {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnItemOperationListener(C36630b bVar) {
        C7573i.m23587b(bVar, "onItemOperationListener");
        SuperRecommendAdapter superRecommendAdapter = this.f74763b;
        if (superRecommendAdapter == null) {
            C7573i.m23583a("adapter");
        }
        superRecommendAdapter.mo71612a(bVar);
    }

    public final void setOnViewFirstShowListener(C25664e<SuperRecommendViewHolder> eVar) {
        C7573i.m23587b(eVar, "onViewAttachedToWindowListener");
        SuperRecommendAdapter superRecommendAdapter = this.f74763b;
        if (superRecommendAdapter == null) {
            C7573i.m23583a("adapter");
        }
        superRecommendAdapter.mo71610a(eVar);
    }

    public final void setData(List<UserWithAweme> list) {
        C7573i.m23587b(list, "users");
        this.f74765d = this.f74765d;
        this.f74766e = list;
        SuperRecommendAdapter superRecommendAdapter = this.f74763b;
        if (superRecommendAdapter == null) {
            C7573i.m23583a("adapter");
        }
        superRecommendAdapter.mo58045a(this.f74766e);
        SuperRecommendAdapter superRecommendAdapter2 = this.f74763b;
        if (superRecommendAdapter2 == null) {
            C7573i.m23583a("adapter");
        }
        superRecommendAdapter2.mo71613a(this.f74765d);
        SuperRecommendAdapter superRecommendAdapter3 = this.f74763b;
        if (superRecommendAdapter3 == null) {
            C7573i.m23583a("adapter");
        }
        superRecommendAdapter3.notifyDataSetChanged();
    }

    public RecommendSuperUserView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
        m93278d();
    }

    public RecommendSuperUserView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i);
        m93278d();
    }
}
