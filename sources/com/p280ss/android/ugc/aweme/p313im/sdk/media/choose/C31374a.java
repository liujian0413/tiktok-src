package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.PopupWindow;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.C31403a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel.C31417a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a */
public final class C31374a extends PopupWindow {

    /* renamed from: a */
    private MediaChooseViewModel f82178a;

    /* renamed from: b */
    private RecyclerView f82179b;

    /* renamed from: c */
    private MenuAdapter f82180c;

    /* renamed from: d */
    private Animator f82181d;

    /* renamed from: e */
    private final FragmentActivity f82182e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a$a */
    public static final class C31375a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C31374a f82183a;

        /* renamed from: b */
        final /* synthetic */ boolean f82184b;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a$a$a */
        static final class C31376a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C31375a f82185a;

            C31376a(C31375a aVar) {
                this.f82185a = aVar;
            }

            public final void run() {
                this.f82185a.f82183a.dismiss();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            View contentView = this.f82183a.getContentView();
            if (!(!this.f82184b)) {
                contentView = null;
            }
            if (contentView != null) {
                contentView.postDelayed(new C31376a(this), 10);
            }
        }

        C31375a(C31374a aVar, boolean z) {
            this.f82183a = aVar;
            this.f82184b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.a$b */
    static final /* synthetic */ class C31377b extends FunctionReference implements C7562b<C31403a, C7581n> {
        C31377b(C31374a aVar) {
            super(1, aVar);
        }

        public final String getName() {
            return "openAlbum";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C31374a.class);
        }

        public final String getSignature() {
            return "openAlbum(Lcom/ss/android/ugc/aweme/im/sdk/media/choose/model/MediaAlbum;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102121a((C31403a) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102121a(C31403a aVar) {
            C7573i.m23587b(aVar, "p1");
            ((C31374a) this.receiver).mo81938a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo81937a() {
        m102116a(false);
    }

    /* renamed from: b */
    private final void m102117b() {
        this.f82178a = C31417a.m102227a(this.f82182e);
        this.f82180c = new MenuAdapter(new C31377b(this));
        View findViewById = getContentView().findViewById(R.id.bnf);
        C7573i.m23582a((Object) findViewById, "contentView.findViewById(R.id.list_view)");
        this.f82179b = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f82179b;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f82182e, 1, false));
        RecyclerView recyclerView2 = this.f82179b;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        MenuAdapter menuAdapter = this.f82180c;
        if (menuAdapter == null) {
            C7573i.m23583a("adapter");
        }
        recyclerView2.setAdapter(menuAdapter);
    }

    /* renamed from: a */
    public final void mo81938a(C31403a aVar) {
        MediaChooseViewModel mediaChooseViewModel = this.f82178a;
        if (mediaChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        mediaChooseViewModel.mo82001c().setValue(aVar);
        mo81937a();
    }

    /* renamed from: a */
    private final void m102116a(boolean z) {
        float f;
        Animator animator = this.f82181d;
        if (animator != null && animator.isRunning()) {
            Animator animator2 = this.f82181d;
            if (animator2 != null) {
                animator2.cancel();
            }
        }
        float f2 = 0.0f;
        if (z) {
            f = -((float) getHeight());
        } else {
            f = 0.0f;
        }
        if (!z) {
            f2 = -((float) getHeight());
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getContentView(), "translationY", new float[]{f, f2});
        ofFloat.addListener(new C31375a(this, z));
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(500);
        ofFloat.start();
        this.f82181d = ofFloat;
    }

    /* renamed from: a */
    public final boolean mo81939a(View view) {
        boolean z;
        C7573i.m23587b(view, "anchorView");
        if (this.f82182e.isFinishing() || isShowing()) {
            return false;
        }
        MediaChooseViewModel mediaChooseViewModel = this.f82178a;
        if (mediaChooseViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        List list = (List) mediaChooseViewModel.mo81995a().getValue();
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C10761a.m31399c((Context) this.f82182e, (int) R.string.bgo).mo25750a();
            return false;
        }
        MenuAdapter menuAdapter = this.f82180c;
        if (menuAdapter == null) {
            C7573i.m23583a("adapter");
        }
        menuAdapter.mo81932a(list);
        showAtLocation(view, 8388659, 0, this.f82182e.getResources().getDimensionPixelSize(R.dimen.i6) + C10994a.m32204a((Context) this.f82182e));
        m102116a(true);
        return true;
    }

    public C31374a(FragmentActivity fragmentActivity, int i) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f82182e = fragmentActivity;
        setContentView(LayoutInflater.from(this.f82182e).inflate(R.layout.a9z, null, false));
        setWidth(-1);
        setHeight(i);
        m102117b();
    }
}
