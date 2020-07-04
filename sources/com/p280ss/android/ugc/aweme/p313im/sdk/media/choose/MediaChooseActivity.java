package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.C31403a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseParameters;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseResult;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel.C31417a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1328a.C31342b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax.C31882a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity */
public final class MediaChooseActivity extends AmeActivity {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82147a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaChooseActivity.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/im/sdk/media/choose/viewmodel/MediaChooseViewModel;"))};

    /* renamed from: c */
    public static final C31359a f82148c = new C31359a(null);

    /* renamed from: b */
    public C31374a f82149b;

    /* renamed from: d */
    private final C7541d f82150d = C7546e.m23569a(new C31367i(this));

    /* renamed from: e */
    private HashMap f82151e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$a */
    public static final class C31359a {
        private C31359a() {
        }

        public /* synthetic */ C31359a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m102091a(Activity activity, MediaChooseParameters mediaChooseParameters) {
            C7573i.m23587b(activity, "context");
            C7573i.m23587b(mediaChooseParameters, "parameters");
            Intent intent = new Intent(activity, MediaChooseActivity.class);
            intent.putExtra("extra_choose_parameters", mediaChooseParameters);
            activity.startActivityForResult(intent, AdError.INTERNAL_ERROR_CODE);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$b */
    static final class C31360b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f82152a;

        C31360b(MediaChooseActivity mediaChooseActivity) {
            this.f82152a = mediaChooseActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7573i.m23582a((Object) view, "it");
            view.setSelected(!view.isSelected());
            this.f82152a.mo81926a().f82289d = view.isSelected();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$c */
    static final class C31361c extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f82153a;

        C31361c(MediaChooseActivity mediaChooseActivity) {
            this.f82153a = mediaChooseActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102092a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102092a(View view) {
            C7573i.m23587b(view, "it");
            this.f82153a.m102082a(true, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$d */
    static final class C31362d<T> implements C0053p<List<MediaModel>> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f82154a;

        C31362d(MediaChooseActivity mediaChooseActivity) {
            this.f82154a = mediaChooseActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<MediaModel> list) {
            this.f82154a.mo81928b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$e */
    static final class C31363e extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f82155a;

        C31363e(MediaChooseActivity mediaChooseActivity) {
            this.f82155a = mediaChooseActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102094a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102094a(View view) {
            C7573i.m23587b(view, "it");
            this.f82155a.m102082a(false, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$f */
    static final class C31364f extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f82156a;

        C31364f(MediaChooseActivity mediaChooseActivity) {
            this.f82156a = mediaChooseActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102095a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102095a(View view) {
            C7573i.m23587b(view, "it");
            this.f82156a.mo81929c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$g */
    static final class C31365g extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f82157a;

        C31365g(MediaChooseActivity mediaChooseActivity) {
            this.f82157a = mediaChooseActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102096a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102096a(View view) {
            C7573i.m23587b(view, "it");
            this.f82157a.mo81929c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$h */
    static final class C31366h<T> implements C0053p<C31403a> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f82158a;

        C31366h(MediaChooseActivity mediaChooseActivity) {
            this.f82158a = mediaChooseActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C31403a aVar) {
            if (this.f82158a.f82149b != null) {
                this.f82158a.mo81927a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity$i */
    static final class C31367i extends Lambda implements C7561a<MediaChooseViewModel> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseActivity f82159a;

        C31367i(MediaChooseActivity mediaChooseActivity) {
            this.f82159a = mediaChooseActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MediaChooseViewModel invoke() {
            return C31417a.m102227a(this.f82159a);
        }
    }

    /* renamed from: a */
    private View m102080a(int i) {
        if (this.f82151e == null) {
            this.f82151e = new HashMap();
        }
        View view = (View) this.f82151e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82151e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final MediaChooseViewModel mo81926a() {
        return (MediaChooseViewModel) this.f82150d.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    public final void onBackPressed() {
        setResult(2011, new Intent());
        super.onBackPressed();
    }

    /* renamed from: g */
    private final void m102086g() {
        getSupportFragmentManager().mo2645a().mo2600b(R.id.aoy, new MixMediaChooseFragment(), "TAG_CONTAINER").mo2606d();
    }

    /* renamed from: d */
    private final void m102083d() {
        Serializable serializable;
        Intent intent = getIntent();
        if (intent != null) {
            serializable = intent.getSerializableExtra("extra_choose_parameters");
        } else {
            serializable = null;
        }
        if (serializable instanceof MediaChooseParameters) {
            MediaChooseParameters mediaChooseParameters = (MediaChooseParameters) serializable;
            mo81926a().mo81996a(mediaChooseParameters);
            mo81926a().f82289d = mediaChooseParameters.getSendRaw();
            mo81926a().mo82000b().setValue(mediaChooseParameters.getSelectedList());
        }
    }

    /* renamed from: e */
    private final void m102084e() {
        ImageView imageView = (ImageView) m102080a((int) R.id.b6a);
        C7573i.m23582a((Object) imageView, "iv_back");
        C31342b.m102053a(imageView, new C31363e(this));
        DmtTextView dmtTextView = (DmtTextView) m102080a((int) R.id.dqf);
        C7573i.m23582a((Object) dmtTextView, "tv_album");
        C31342b.m102053a(dmtTextView, new C31364f(this));
        ImageView imageView2 = (ImageView) m102080a((int) R.id.b5x);
        C7573i.m23582a((Object) imageView2, "iv_album");
        C31342b.m102053a(imageView2, new C31365g(this));
        mo81926a().mo82001c().observe(this, new C31366h(this));
        C31882a.m103579n().mo82725a((ImageView) m102080a((int) R.id.b6a), (DmtTextView) m102080a((int) R.id.dqf), (ImageView) m102080a((int) R.id.b5x));
    }

    /* renamed from: f */
    private final void m102085f() {
        if (mo81926a().f82288c.supportGif()) {
            FrameLayout frameLayout = (FrameLayout) m102080a((int) R.id.bgs);
            C7573i.m23582a((Object) frameLayout, "layout_bottom");
            frameLayout.setVisibility(8);
        }
        DmtTextView dmtTextView = (DmtTextView) m102080a((int) R.id.ri);
        C7573i.m23582a((Object) dmtTextView, "btn_send_raw");
        dmtTextView.setSelected(mo81926a().f82289d);
        ((DmtTextView) m102080a((int) R.id.ri)).setOnClickListener(new C31360b(this));
        DmtButton dmtButton = (DmtButton) m102080a((int) R.id.rg);
        C7573i.m23582a((Object) dmtButton, "btn_send");
        C31342b.m102053a(dmtButton, new C31361c(this));
        C31882a.m103579n().mo82725a((DmtTextView) m102080a((int) R.id.ri), (DmtButton) m102080a((int) R.id.rg));
        mo81926a().mo82000b().observe(this, new C31362d(this));
        mo81928b();
    }

    /* renamed from: b */
    public final void mo81928b() {
        boolean z;
        if (isViewValid()) {
            List list = (List) mo81926a().mo82000b().getValue();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                DmtButton dmtButton = (DmtButton) m102080a((int) R.id.rg);
                C7573i.m23582a((Object) dmtButton, "btn_send");
                dmtButton.setText(getResources().getString(R.string.bp9));
                DmtButton dmtButton2 = (DmtButton) m102080a((int) R.id.rg);
                C7573i.m23582a((Object) dmtButton2, "btn_send");
                dmtButton2.setEnabled(false);
                return;
            }
            DmtButton dmtButton3 = (DmtButton) m102080a((int) R.id.rg);
            C7573i.m23582a((Object) dmtButton3, "btn_send");
            dmtButton3.setText(getResources().getString(R.string.bpa, new Object[]{Integer.valueOf(list.size())}));
            DmtButton dmtButton4 = (DmtButton) m102080a((int) R.id.rg);
            C7573i.m23582a((Object) dmtButton4, "btn_send");
            dmtButton4.setEnabled(true);
        }
    }

    /* renamed from: c */
    public final void mo81929c() {
        boolean z;
        Collection collection = (Collection) mo81926a().mo81995a().getValue();
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.f82149b == null) {
                FragmentActivity fragmentActivity = this;
                FrameLayout frameLayout = (FrameLayout) m102080a((int) R.id.aoy);
                C7573i.m23582a((Object) frameLayout, "fragment_container");
                int height = frameLayout.getHeight();
                FrameLayout frameLayout2 = (FrameLayout) m102080a((int) R.id.bgs);
                C7573i.m23582a((Object) frameLayout2, "layout_bottom");
                this.f82149b = new C31374a(fragmentActivity, height + frameLayout2.getHeight());
            }
            C31374a aVar = this.f82149b;
            if (aVar == null) {
                C7573i.m23580a();
            }
            if (aVar.isShowing()) {
                C31374a aVar2 = this.f82149b;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                aVar2.mo81937a();
                mo81927a(false);
                return;
            }
            C31374a aVar3 = this.f82149b;
            if (aVar3 == null) {
                C7573i.m23580a();
            }
            RelativeLayout relativeLayout = (RelativeLayout) m102080a((int) R.id.djz);
            C7573i.m23582a((Object) relativeLayout, "title_bar");
            aVar3.mo81939a((View) relativeLayout);
            mo81927a(true);
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.d6);
        C6956a.m21633b().setupStatusBar(this);
        m102083d();
        m102084e();
        m102085f();
        m102086g();
        mo81926a().mo82003l();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.media.choose.MediaChooseActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo81927a(boolean z) {
        float f;
        float f2;
        if (z) {
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(500);
        rotateAnimation.setFillAfter(true);
        ((ImageView) m102080a((int) R.id.b5x)).startAnimation(rotateAnimation);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m102082a(boolean z, MediaChooseResult mediaChooseResult) {
        Serializable serializable;
        int i;
        Intent intent = new Intent();
        String str = "extra_choose_result";
        if (mediaChooseResult != null) {
            serializable = mediaChooseResult;
        } else {
            ArrayList arrayList = new ArrayList();
            List list = (List) mo81926a().mo82000b().getValue();
            if (list != null) {
                arrayList.addAll(list);
            }
            serializable = new MediaChooseResult(mo81926a().f82289d, arrayList);
        }
        intent.putExtra(str, serializable);
        if (z) {
            i = 2012;
        } else {
            i = 2011;
        }
        setResult(i, intent);
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Object obj;
        super.onActivityResult(i, i2, intent);
        if (i == 2002) {
            Object obj2 = null;
            if (intent != null) {
                obj = intent.getSerializableExtra("extra_choose_result");
            } else {
                obj = null;
            }
            if (obj instanceof MediaChooseResult) {
                obj2 = obj;
            }
            MediaChooseResult mediaChooseResult = (MediaChooseResult) obj2;
            if (i2 != 2011) {
                m102082a(true, mediaChooseResult);
            } else if (mediaChooseResult != null) {
                DmtTextView dmtTextView = (DmtTextView) m102080a((int) R.id.ri);
                if (dmtTextView != null) {
                    dmtTextView.setSelected(mediaChooseResult.getSendRaw());
                }
                mo81926a().f82289d = mediaChooseResult.getSendRaw();
                mo81926a().mo82000b().setValue(C7525m.m23509d((Collection<? extends T>) mediaChooseResult.getSelectedList()));
            }
        }
    }
}
