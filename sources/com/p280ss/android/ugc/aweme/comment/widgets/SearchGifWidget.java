package com.p280ss.android.ugc.aweme.comment.widgets;

import android.arch.lifecycle.C0065w.C0067b;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.view.C1156d;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.jedi.arch.C11497af;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.comment.adapter.C24081l;
import com.p280ss.android.ugc.aweme.comment.adapter.GifEmojiAdapter;
import com.p280ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p280ss.android.ugc.aweme.comment.p1103ui.GifEmojiDecoration;
import com.p280ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState;
import com.p280ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget */
public final class SearchGifWidget extends BaseCommentJediWidget implements TextWatcher, OnClickListener, OnEditorActionListener, C11497af<C24405a> {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f64407g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchGifWidget.class), "mResultLayout", "getMResultLayout()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchGifWidget.class), "mRecyclerView", "getMRecyclerView()Landroid/support/v7/widget/RecyclerView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchGifWidget.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchGifWidget.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/comment/adapter/GifEmojiAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchGifWidget.class), "mEditText", "getMEditText()Landroid/widget/EditText;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchGifWidget.class), "mClear", "getMClear()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchGifWidget.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/comment/viewmodel/GifEmojiListViewModel;"))};

    /* renamed from: j */
    public static final C24391a f64408j = new C24391a(null);

    /* renamed from: h */
    public boolean f64409h;

    /* renamed from: i */
    public final C24081l f64410i;

    /* renamed from: k */
    private final C24377a f64411k = m80103a((int) R.id.bje);

    /* renamed from: l */
    private final C24377a f64412l = m80103a((int) R.id.cqf);

    /* renamed from: m */
    private final C24377a f64413m = m80103a((int) R.id.dav);

    /* renamed from: n */
    private final C7541d f64414n = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C24403k(this));

    /* renamed from: o */
    private final C24377a f64415o = m80103a((int) R.id.d0v);

    /* renamed from: p */
    private final C24377a f64416p = m80103a((int) R.id.d0u);

    /* renamed from: q */
    private final WidgetLifecycleAwareLazy f64417q;

    /* renamed from: r */
    private final int f64418r;

    /* renamed from: s */
    private final C7561a<C7581n> f64419s;

    /* renamed from: t */
    private final C7561a<C7581n> f64420t;

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$a */
    static final class C24391a {
        private C24391a() {
        }

        public /* synthetic */ C24391a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$b */
    static final class C24392b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f64421a;

        C24392b(SearchGifWidget searchGifWidget) {
            this.f64421a = searchGifWidget;
        }

        public final void run() {
            KeyboardUtils.m77056b(this.f64421a.mo63323t());
            this.f64421a.f64409h = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$c */
    public static final class C24393c implements C11557c<GifEmoji, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f64422a;

        /* renamed from: b */
        final /* synthetic */ C7563m f64423b;

        /* renamed from: c */
        final /* synthetic */ C7563m f64424c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f64425d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f64426e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends GifEmoji>, C7581n> f64427f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f64425d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f64426e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends GifEmoji>, C7581n> mo29140c() {
            return this.f64427f;
        }

        public C24393c(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f64422a = bVar;
            this.f64423b = mVar;
            this.f64424c = mVar2;
            this.f64425d = bVar;
            this.f64426e = mVar;
            this.f64427f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$d */
    public static final class C24394d implements C11557c<GifEmoji, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f64428a;

        /* renamed from: b */
        final /* synthetic */ C7563m f64429b;

        /* renamed from: c */
        final /* synthetic */ C7563m f64430c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f64431d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f64432e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends GifEmoji>, C7581n> f64433f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f64431d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f64432e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends GifEmoji>, C7581n> mo29140c() {
            return this.f64433f;
        }

        public C24394d(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f64428a = bVar;
            this.f64429b = mVar;
            this.f64430c = mVar2;
            this.f64431d = bVar;
            this.f64432e = mVar;
            this.f64433f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$e */
    static final class C24395e extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f64434a;

        C24395e(SearchGifWidget searchGifWidget) {
            this.f64434a = searchGifWidget;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m80244a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80244a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f64434a.mo63321r().mo25942f();
            if (this.f64434a.mo63320q().getVisibility() != 0) {
                this.f64434a.mo63320q().setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$f */
    static final class C24396f extends Lambda implements C7563m<C11585f, List<? extends GifEmoji>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f64435a;

        C24396f(SearchGifWidget searchGifWidget) {
            this.f64435a = searchGifWidget;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m80245a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80245a(C11585f fVar, final List<GifEmoji> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "result");
            fVar.mo29066a(this.f64435a.mo63324u(), new C7562b<GifEmojiListState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C24396f f64436a;

                {
                    this.f64436a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m80246a((GifEmojiListState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m80246a(GifEmojiListState gifEmojiListState) {
                    C7573i.m23587b(gifEmojiListState, "it");
                    if (list.isEmpty()) {
                        this.f64436a.f64435a.mo63314A();
                    } else {
                        this.f64436a.f64435a.mo63321r().mo25939d();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$g */
    static final class C24398g extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f64438a;

        C24398g(SearchGifWidget searchGifWidget) {
            this.f64438a = searchGifWidget;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m80247a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80247a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f64438a.mo63324u().mo63254g();
            this.f64438a.mo63321r().mo25944h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$h */
    static final class C24399h extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f64439a;

        C24399h(SearchGifWidget searchGifWidget) {
            this.f64439a = searchGifWidget;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m80248a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80248a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f64439a.mo63322s().ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$i */
    static final class C24400i extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f64440a;

        C24400i(SearchGifWidget searchGifWidget) {
            this.f64440a = searchGifWidget;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m80249a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80249a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f64440a.mo63322s().mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$j */
    static final class C24401j extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f64441a;

        C24401j(SearchGifWidget searchGifWidget) {
            this.f64441a = searchGifWidget;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m80250a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80250a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                this.f64441a.mo63322s().ai_();
                this.f64441a.mo63322s().mo66504a((C6905a) new C24407c(new C7561a<C7581n>(this.f64441a) {
                    public final String getName() {
                        return "loadMore";
                    }

                    public final C7585d getOwner() {
                        return C7575l.m23595a(SearchGifWidget.class);
                    }

                    public final String getSignature() {
                        return "loadMore()V";
                    }

                    /* renamed from: a */
                    private void m80251a() {
                        ((SearchGifWidget) this.receiver).mo63328y();
                    }

                    public final /* synthetic */ Object invoke() {
                        m80251a();
                        return C7581n.f20898a;
                    }
                }));
                return;
            }
            this.f64441a.mo63322s().ah_();
            this.f64441a.mo63322s().mo66504a((C6905a) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$k */
    static final class C24403k extends Lambda implements C7561a<GifEmojiAdapter> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f64442a;

        /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$k$a */
        static final /* synthetic */ class C24404a extends FunctionReference implements C7561a<C7581n> {
            C24404a(SearchGifWidget searchGifWidget) {
                super(0, searchGifWidget);
            }

            public final String getName() {
                return "loadMore";
            }

            public final C7585d getOwner() {
                return C7575l.m23595a(SearchGifWidget.class);
            }

            public final String getSignature() {
                return "loadMore()V";
            }

            /* renamed from: a */
            private void m80253a() {
                ((SearchGifWidget) this.receiver).mo63328y();
            }

            public final /* synthetic */ Object invoke() {
                m80253a();
                return C7581n.f20898a;
            }
        }

        C24403k(SearchGifWidget searchGifWidget) {
            this.f64442a = searchGifWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GifEmojiAdapter invoke() {
            GifEmojiAdapter gifEmojiAdapter = new GifEmojiAdapter(this.f64442a, this.f64442a.f64410i, null, 4, null);
            gifEmojiAdapter.mo66504a((C6905a) new C24408d(new C24404a(this.f64442a)));
            return gifEmojiAdapter;
        }
    }

    /* renamed from: C */
    private final RecyclerView m80219C() {
        return (RecyclerView) this.f64412l.mo63301a(this, f64407g[1]);
    }

    /* renamed from: D */
    private final View m80220D() {
        return this.f64416p.mo63301a(this, f64407g[5]);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: h */
    public final int mo31583h() {
        return this.f64418r;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: q */
    public final View mo63320q() {
        return this.f64411k.mo63301a(this, f64407g[0]);
    }

    /* renamed from: r */
    public final DmtStatusView mo63321r() {
        return (DmtStatusView) this.f64413m.mo63301a(this, f64407g[2]);
    }

    /* renamed from: s */
    public final GifEmojiAdapter mo63322s() {
        return (GifEmojiAdapter) this.f64414n.getValue();
    }

    /* renamed from: t */
    public final EditText mo63323t() {
        return (EditText) this.f64415o.mo63301a(this, f64407g[4]);
    }

    /* renamed from: u */
    public final GifEmojiListViewModel mo63324u() {
        return (GifEmojiListViewModel) this.f64417q.getValue();
    }

    /* renamed from: B */
    private static C24405a m80218B() {
        return new C24405a();
    }

    /* renamed from: f */
    public final /* synthetic */ C0067b mo29056f() {
        return m80218B();
    }

    /* renamed from: A */
    public final void mo63314A() {
        mo63321r().mo25943g();
        mo63324u().mo63254g();
    }

    /* renamed from: i */
    public final void mo31584i() {
        super.mo31584i();
        m80221E();
        m80222F();
    }

    /* renamed from: x */
    public final void mo63327x() {
        KeyboardUtils.m77057c(mo63323t());
    }

    /* renamed from: y */
    public final void mo63328y() {
        mo63324u().f64267f.mo29085c();
    }

    /* renamed from: z */
    public final CharSequence mo63329z() {
        return mo63323t().getText();
    }

    /* renamed from: v */
    public final void mo63325v() {
        mo63323t().requestFocus();
        mo63323t().postDelayed(new C24392b(this), 300);
    }

    /* renamed from: w */
    public final void mo63326w() {
        Editable text = mo63323t().getText();
        if (text != null) {
            text.clear();
        }
        m80104a(mo63320q());
        mo63323t().clearFocus();
        this.f64409h = false;
        mo63327x();
    }

    /* renamed from: F */
    private final void m80222F() {
        ListMiddleware.m33938a(mo63324u().f64267f, this, mo63322s(), false, false, new C24393c(new C24395e(this), new C24398g(this), new C24396f(this)), new C24394d(new C24399h(this), new C24400i(this), SearchGifWidget$initViewModel$$inlined$ListListener$2.INSTANCE), new C24401j(this), null, null, null, 908, null);
    }

    /* renamed from: E */
    private final void m80221E() {
        mo63323t().addTextChangedListener(this);
        mo63323t().setOnEditorActionListener(this);
        m80220D().setOnClickListener(this);
        RecyclerView C = m80219C();
        C.mo5525a((C1272h) new GifEmojiDecoration());
        C.setLayoutManager(new WrapLinearLayoutManager(C.getContext(), 0, false));
        C.setAdapter(mo63322s());
        int c = C0683b.m2912c(mo63300p(), R.color.abk);
        DmtTextView dmtTextView = new DmtTextView(new C1156d(mo63300p(), R.style.ss));
        dmtTextView.setTextColor(c);
        dmtTextView.setText(R.string.b0d);
        DmtTextView dmtTextView2 = new DmtTextView(new C1156d(mo63300p(), R.style.ss));
        dmtTextView2.setTextColor(c);
        dmtTextView2.setText(R.string.b0i);
        mo63321r().setBuilder(C10803a.m31631a(mo63300p()).mo25963b((View) dmtTextView2).mo25966c((View) dmtTextView));
    }

    public final void afterTextChanged(Editable editable) {
        m80223a(editable);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        Editable editableText = mo63323t().getEditableText();
        if (editableText != null) {
            editableText.clear();
        }
        m80104a(mo63320q());
        this.f64419s.invoke();
    }

    /* renamed from: a */
    private final void m80223a(Editable editable) {
        boolean z;
        if (!C24406b.m80255a(mo63300p())) {
            mo63324u().mo63254g();
            mo63321r().mo25944h();
            return;
        }
        CharSequence charSequence = editable;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo63314A();
            m80104a(mo63320q());
        } else if (editable.length() > 8) {
            mo63314A();
        } else {
            mo63321r().mo25942f();
            mo63324u().mo63253a(charSequence);
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Editable editable;
        if (i != 3 || (!mo63321r().mo25947k() && !mo63321r().mo25948l() && !mo63321r().mo25949m())) {
            return false;
        }
        if (textView != null) {
            editable = textView.getEditableText();
        } else {
            editable = null;
        }
        m80223a(editable);
        return true;
    }

    public SearchGifWidget(C7561a<C7581n> aVar, C24081l lVar, C7561a<C7581n> aVar2) {
        C7573i.m23587b(aVar, "exitSearchGifMode");
        C7573i.m23587b(lVar, "gifEmojiActionListener");
        C7573i.m23587b(aVar2, "dismiss");
        this.f64419s = aVar;
        this.f64410i = lVar;
        this.f64420t = aVar2;
        C7584c a = C7575l.m23595a(GifEmojiListViewModel.class);
        C7561a searchGifWidget$$special$$inlined$viewModel$1 = new SearchGifWidget$$special$$inlined$viewModel$1(this, a);
        this.f64417q = new WidgetLifecycleAwareLazy(this, searchGifWidget$$special$$inlined$viewModel$1, new SearchGifWidget$$special$$inlined$viewModel$3(this, searchGifWidget$$special$$inlined$viewModel$1, a, SearchGifWidget$$special$$inlined$viewModel$2.INSTANCE));
        this.f64418r = R.layout.a52;
    }
}
