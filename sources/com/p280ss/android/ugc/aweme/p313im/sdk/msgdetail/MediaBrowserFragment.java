package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.PagerSnapHelper;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.C31072c;
import com.p280ss.android.ugc.aweme.p313im.sdk.common.ListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.adapter.MediaBrowserAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.adapter.MediaBrowserAdapter.C31550b;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.p1342a.C31547a;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.C31583a;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.C31585c;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.MediaBrowserViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C31574a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView.C31973a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.DragView.IViewInfo;
import com.p280ss.ttm.player.MediaPlayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserFragment */
public final class MediaBrowserFragment extends AmeBaseFragment implements C31550b, C31585c, C31973a {

    /* renamed from: h */
    public static final C31539a f82554h = new C31539a(null);

    /* renamed from: e */
    public RecyclerView f82555e;

    /* renamed from: f */
    public DragView f82556f;

    /* renamed from: g */
    public MediaBrowserAdapter f82557g;

    /* renamed from: i */
    private MediaBrowserViewModel f82558i;

    /* renamed from: j */
    private C31544a f82559j;

    /* renamed from: k */
    private C31547a<BaseContent> f82560k;

    /* renamed from: l */
    private boolean f82561l;

    /* renamed from: m */
    private final MediaBrowserFragment$recyclerViewScrollListener$1 f82562m = new MediaBrowserFragment$recyclerViewScrollListener$1(this);

    /* renamed from: n */
    private HashMap f82563n;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserFragment$a */
    public static final class C31539a {
        private C31539a() {
        }

        public /* synthetic */ C31539a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserFragment$b */
    static final class C31540b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MediaBrowserFragment f82564a;

        /* renamed from: b */
        final /* synthetic */ Message f82565b;

        C31540b(MediaBrowserFragment mediaBrowserFragment, Message message) {
            this.f82564a = mediaBrowserFragment;
            this.f82565b = message;
        }

        public final void run() {
            List b = MediaBrowserFragment.m102522a(this.f82564a).mo82269b();
            int size = b.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((C31547a) b.get(i)).f82582b.getIndex() == this.f82565b.getIndex() && ((C31547a) b.get(i)).f82582b.getMsgType() == this.f82565b.getMsgType()) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                MediaBrowserFragment.m102525b(this.f82564a).mo5541b(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserFragment$c */
    static final class C31541c extends Lambda implements C7563m<List<C31547a<BaseContent>>, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaBrowserFragment f82566a;

        C31541c(MediaBrowserFragment mediaBrowserFragment) {
            this.f82566a = mediaBrowserFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m102545a((List) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102545a(List<C31547a<BaseContent>> list, boolean z) {
            Integer num;
            StringBuilder sb = new StringBuilder("refresh onSuccess: ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            sb.append(num);
            MediaBrowserFragment.m102522a(this.f82566a).mo82268a(list, true);
            this.f82566a.mo82251k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserFragment$d */
    static final class C31542d extends Lambda implements C7563m<List<C31547a<BaseContent>>, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaBrowserFragment f82567a;

        C31542d(MediaBrowserFragment mediaBrowserFragment) {
            this.f82567a = mediaBrowserFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m102546a((List) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102546a(List<C31547a<BaseContent>> list, boolean z) {
            Integer num;
            StringBuilder sb = new StringBuilder("loadLatest onSuccess: ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            sb.append(num);
            MediaBrowserFragment.m102522a(this.f82567a).mo82270b(list, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.MediaBrowserFragment$e */
    static final class C31543e extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaBrowserFragment f82568a;

        C31543e(MediaBrowserFragment mediaBrowserFragment) {
            this.f82568a = mediaBrowserFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102547a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102547a(Throwable th) {
            MediaBrowserFragment.m102522a(this.f82568a).mo82271c();
        }
    }

    /* renamed from: q */
    private void m102530q() {
        if (this.f82563n != null) {
            this.f82563n.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m102530q();
    }

    /* renamed from: a */
    public final void mo80760a() {
        m102523a(1);
    }

    /* renamed from: b */
    public final void mo80762b() {
        m102523a(4);
    }

    /* renamed from: c */
    public final void mo80763c() {
        this.f82561l = false;
        m102523a(0);
    }

    /* renamed from: d */
    public final void mo80764d() {
        this.f82561l = true;
        m102523a(2);
    }

    /* renamed from: e */
    public final void mo80765e() {
        this.f82561l = true;
        m102523a(3);
    }

    /* renamed from: l */
    public final boolean mo82252l() {
        mo82253m();
        return true;
    }

    /* renamed from: f */
    public final void mo80766f() {
        m102523a(6);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: g */
    public final boolean mo80767g() {
        MediaBrowserAdapter mediaBrowserAdapter = this.f82557g;
        if (mediaBrowserAdapter == null) {
            C7573i.m23583a("adapter");
        }
        return mediaBrowserAdapter.mo82273e();
    }

    /* renamed from: h */
    public final boolean mo80768h() {
        MediaBrowserAdapter mediaBrowserAdapter = this.f82557g;
        if (mediaBrowserAdapter == null) {
            C7573i.m23583a("adapter");
        }
        return mediaBrowserAdapter.mo82274f();
    }

    public final void onDestroy() {
        MediaBrowserViewModel mediaBrowserViewModel = this.f82558i;
        if (mediaBrowserViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        mediaBrowserViewModel.mo82315d();
        super.onDestroy();
    }

    public final void onPause() {
        MediaBrowserViewModel mediaBrowserViewModel = this.f82558i;
        if (mediaBrowserViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        mediaBrowserViewModel.mo82314c();
        super.onPause();
    }

    /* renamed from: j */
    public final void mo82250j() {
        MediaBrowserViewModel mediaBrowserViewModel = this.f82558i;
        if (mediaBrowserViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        if (!mediaBrowserViewModel.mo81557i()) {
            MediaBrowserViewModel mediaBrowserViewModel2 = this.f82558i;
            if (mediaBrowserViewModel2 == null) {
                C7573i.m23583a("viewModel");
            }
            mediaBrowserViewModel2.mo82313b();
        }
    }

    /* renamed from: m */
    public final void mo82253m() {
        if (!this.f82561l) {
            DragView dragView = this.f82556f;
            if (dragView == null) {
                C7573i.m23583a("dragView");
            }
            dragView.mo82816a();
        }
    }

    /* renamed from: p */
    private final void m102529p() {
        MediaBrowserViewModel mediaBrowserViewModel = this.f82558i;
        if (mediaBrowserViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        ListViewModel.m101340a(mediaBrowserViewModel, this, C31072c.m101360a(null, new C31541c(this), null, 5, null), null, C31072c.m101360a(null, new C31542d(this), new C31543e(this), 1, null), 4, null);
    }

    /* renamed from: k */
    public final void mo82251k() {
        C31544a aVar = this.f82559j;
        if (aVar == null) {
            C7573i.m23583a("param");
        }
        Message message = aVar.f82577b;
        if (message != null) {
            RecyclerView recyclerView = this.f82555e;
            if (recyclerView == null) {
                C7573i.m23583a("recyclerView");
            }
            recyclerView.post(new C31540b(this, message));
        }
    }

    /* renamed from: n */
    private final IViewInfo m102527n() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WindowManager windowManager = activity.getWindowManager();
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
        }
        float f = (((float) displayMetrics.heightPixels) * 1.0f) / ((float) displayMetrics.widthPixels);
        int i = (int) (400.0f * f);
        IViewInfo iViewInfo = new IViewInfo(Math.max((displayMetrics.widthPixels - 400) / 2, 0), Math.max((displayMetrics.heightPixels - i) / 2, 0), i, MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 20.0f, f);
        return iViewInfo;
    }

    /* renamed from: o */
    private final void m102528o() {
        this.f82559j = new C31544a().mo82258b(getArguments());
        IViewInfo n = m102527n();
        C31544a aVar = this.f82559j;
        if (aVar == null) {
            C7573i.m23583a("param");
        }
        ArrayList<DragViewInfo> arrayList = aVar.f82579d;
        if (arrayList != null) {
            for (DragViewInfo dragViewInfo : arrayList) {
                IViewInfo iViewInfo = dragViewInfo.f82550b;
                if (iViewInfo != null) {
                    iViewInfo.f83540d = (int) (n.f83542f * ((float) iViewInfo.f83539c));
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo82249i() {
        MediaBrowserAdapter mediaBrowserAdapter = this.f82557g;
        if (mediaBrowserAdapter == null) {
            C7573i.m23583a("adapter");
        }
        C31547a<BaseContent> d = mediaBrowserAdapter.mo82272d();
        if (d != this.f82560k) {
            this.f82560k = d;
            if (d != null) {
                Message message = d.f82582b;
                if (message != null) {
                    long index = message.getIndex();
                    IViewInfo iViewInfo = null;
                    C31544a aVar = this.f82559j;
                    if (aVar == null) {
                        C7573i.m23583a("param");
                    }
                    ArrayList<DragViewInfo> arrayList = aVar.f82579d;
                    if (arrayList != null) {
                        for (DragViewInfo dragViewInfo : arrayList) {
                            if (index == dragViewInfo.f82549a && dragViewInfo.f82550b != null) {
                                iViewInfo = dragViewInfo.f82550b;
                                if (iViewInfo == null) {
                                    C7573i.m23580a();
                                }
                            }
                        }
                    }
                    if (iViewInfo == null) {
                        iViewInfo = m102527n();
                    }
                    if (iViewInfo != null) {
                        DragView dragView = this.f82556f;
                        if (dragView == null) {
                            C7573i.m23583a("dragView");
                        }
                        dragView.mo82822a(iViewInfo);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MediaBrowserAdapter m102522a(MediaBrowserFragment mediaBrowserFragment) {
        MediaBrowserAdapter mediaBrowserAdapter = mediaBrowserFragment.f82557g;
        if (mediaBrowserAdapter == null) {
            C7573i.m23583a("adapter");
        }
        return mediaBrowserAdapter;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecyclerView m102525b(MediaBrowserFragment mediaBrowserFragment) {
        RecyclerView recyclerView = mediaBrowserFragment.f82555e;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public static final /* synthetic */ DragView m102526c(MediaBrowserFragment mediaBrowserFragment) {
        DragView dragView = mediaBrowserFragment.f82556f;
        if (dragView == null) {
            C7573i.m23583a("dragView");
        }
        return dragView;
    }

    /* renamed from: a */
    public final void mo80761a(ValueAnimator valueAnimator) {
        m102523a(5);
    }

    /* renamed from: a */
    private final void m102523a(int i) {
        DragView dragView = this.f82556f;
        if (dragView == null) {
            C7573i.m23583a("dragView");
        }
        int fullWidth = dragView.getFullWidth();
        DragView dragView2 = this.f82556f;
        if (dragView2 == null) {
            C7573i.m23583a("dragView");
        }
        C31583a aVar = new C31583a(i, fullWidth, dragView2.getFullHeight());
        MediaBrowserViewModel mediaBrowserViewModel = this.f82558i;
        if (mediaBrowserViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        mediaBrowserViewModel.mo82311a(aVar);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m102528o();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        this.f82558i = C31574a.m102663a(activity);
        MediaBrowserViewModel mediaBrowserViewModel = this.f82558i;
        if (mediaBrowserViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        C31544a aVar = this.f82559j;
        if (aVar == null) {
            C7573i.m23583a("param");
        }
        mediaBrowserViewModel.mo82310a(aVar, m102527n());
    }

    /* renamed from: a */
    private final void m102524a(View view) {
        long j;
        View findViewById = view.findViewById(R.id.abd);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.dragView)");
        this.f82556f = (DragView) findViewById;
        LayoutInflater from = LayoutInflater.from(getContext());
        DragView dragView = this.f82556f;
        if (dragView == null) {
            C7573i.m23583a("dragView");
        }
        View inflate = from.inflate(R.layout.ux, dragView, false);
        View findViewById2 = inflate.findViewById(R.id.cqd);
        C7573i.m23582a((Object) findViewById2, "contentView.findViewById(R.id.recyclerView)");
        this.f82555e = (RecyclerView) findViewById2;
        IViewInfo n = m102527n();
        C31544a aVar = this.f82559j;
        if (aVar == null) {
            C7573i.m23583a("param");
        }
        ArrayList<DragViewInfo> arrayList = aVar.f82579d;
        if (arrayList != null) {
            for (DragViewInfo dragViewInfo : arrayList) {
                C31544a aVar2 = this.f82559j;
                if (aVar2 == null) {
                    C7573i.m23583a("param");
                }
                Message message = aVar2.f82577b;
                if (message != null) {
                    j = message.getIndex();
                } else {
                    j = -1;
                }
                if (dragViewInfo.f82549a == j && dragViewInfo.f82550b != null) {
                    n = dragViewInfo.f82550b;
                    if (n == null) {
                        C7573i.m23580a();
                    }
                }
            }
        }
        DragView dragView2 = this.f82556f;
        if (dragView2 == null) {
            C7573i.m23583a("dragView");
        }
        RecyclerView recyclerView = this.f82555e;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        dragView2.mo82821a(inflate, recyclerView, n);
        DragView dragView3 = this.f82556f;
        if (dragView3 == null) {
            C7573i.m23583a("dragView");
        }
        dragView3.setFullScreenWindow(true);
        DragView dragView4 = this.f82556f;
        if (dragView4 == null) {
            C7573i.m23583a("dragView");
        }
        dragView4.setDragStateListener(this);
        C31550b bVar = this;
        RecyclerView recyclerView2 = this.f82555e;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        this.f82557g = new MediaBrowserAdapter(bVar, recyclerView2);
        RecyclerView recyclerView3 = this.f82555e;
        if (recyclerView3 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView4 = this.f82555e;
        if (recyclerView4 == null) {
            C7573i.m23583a("recyclerView");
        }
        MediaBrowserAdapter mediaBrowserAdapter = this.f82557g;
        if (mediaBrowserAdapter == null) {
            C7573i.m23583a("adapter");
        }
        recyclerView4.setAdapter(mediaBrowserAdapter);
        RecyclerView recyclerView5 = this.f82555e;
        if (recyclerView5 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView5.setItemViewCacheSize(2);
        RecyclerView recyclerView6 = this.f82555e;
        if (recyclerView6 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView6.mo5528a((C1281m) this.f82562m);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        RecyclerView recyclerView7 = this.f82555e;
        if (recyclerView7 == null) {
            C7573i.m23583a("recyclerView");
        }
        pagerSnapHelper.mo6007a(recyclerView7);
        MediaBrowserViewModel mediaBrowserViewModel = this.f82558i;
        if (mediaBrowserViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        mediaBrowserViewModel.mo82309a((C0043i) this, (C31585c) this);
        MediaBrowserViewModel mediaBrowserViewModel2 = this.f82558i;
        if (mediaBrowserViewModel2 == null) {
            C7573i.m23583a("viewModel");
        }
        mediaBrowserViewModel2.mo82308a();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m102529p();
        m102524a(view);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ou, viewGroup, false);
    }
}
