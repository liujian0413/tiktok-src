package com.p280ss.android.ugc.aweme.p1216fe.method.upload;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.profile.p1487ui.HeaderDetailActivity;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.views.DmtLoadingDialog;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity */
public final class ImageChooseUploadActivity extends AmeActivity {

    /* renamed from: i */
    public static C28038b f73816i;

    /* renamed from: j */
    public static final C28023a f73817j = new C28023a(null);

    /* renamed from: a */
    public DmtLoadingDialog f73818a;

    /* renamed from: b */
    public RecyclerView f73819b;

    /* renamed from: c */
    public DmtTextView f73820c;

    /* renamed from: d */
    public DmtTextView f73821d;

    /* renamed from: e */
    public ImageChooseAdapter f73822e;

    /* renamed from: f */
    public List<String> f73823f;

    /* renamed from: g */
    public final C7563m<View, String, C7581n> f73824g = new C28029g(this);

    /* renamed from: h */
    public final C7562b<List<String>, C7581n> f73825h = new C28028f(this);

    /* renamed from: k */
    private DmtTextView f73826k;

    /* renamed from: l */
    private Boolean f73827l = Boolean.valueOf(true);

    /* renamed from: m */
    private int f73828m = 1;

    /* renamed from: n */
    private final int f73829n = 4;

    /* renamed from: o */
    private String f73830o = "";

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$a */
    public static final class C28023a {
        private C28023a() {
        }

        public /* synthetic */ C28023a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$b */
    static final class C28024b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f73831a;

        C28024b(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f73831a = imageChooseUploadActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<MediaModel> call() {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).getMediaLoaderImages(this.f73831a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$c */
    static final class C28025c<TTaskResult, TContinuationResult> implements C1591g<List<? extends MediaModel>, Object> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f73832a;

        C28025c(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f73832a = imageChooseUploadActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<List<MediaModel>> hVar) {
            C1267f fVar;
            C7573i.m23582a((Object) hVar, "it");
            if (C23477d.m77081a((Collection) hVar.mo6890e())) {
                DmtLoadingDialog dmtLoadingDialog = this.f73832a.f73818a;
                if (dmtLoadingDialog != null) {
                    dmtLoadingDialog.dismiss();
                }
                DmtTextView dmtTextView = this.f73832a.f73821d;
                if (dmtTextView != null) {
                    dmtTextView.setVisibility(0);
                }
                DmtTextView dmtTextView2 = this.f73832a.f73821d;
                if (dmtTextView2 != null) {
                    dmtTextView2.setText(this.f73832a.getResources().getString(R.string.cmc));
                }
            } else {
                DmtTextView dmtTextView3 = this.f73832a.f73821d;
                if (dmtTextView3 != null) {
                    dmtTextView3.setVisibility(8);
                }
                DmtLoadingDialog dmtLoadingDialog2 = this.f73832a.f73818a;
                if (dmtLoadingDialog2 != null) {
                    dmtLoadingDialog2.dismiss();
                }
                ImageChooseAdapter imageChooseAdapter = this.f73832a.f73822e;
                if (imageChooseAdapter != null) {
                    Object e = hVar.mo6890e();
                    C7573i.m23582a(e, "it.result");
                    imageChooseAdapter.mo71468a((Collection) e);
                }
                RecyclerView recyclerView = this.f73832a.f73819b;
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.f73832a.f73822e);
                }
                RecyclerView recyclerView2 = this.f73832a.f73819b;
                if (recyclerView2 != null) {
                    fVar = recyclerView2.getItemAnimator();
                } else {
                    fVar = null;
                }
                if (!(fVar instanceof SimpleItemAnimator)) {
                    fVar = null;
                }
                SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) fVar;
                if (simpleItemAnimator != null) {
                    simpleItemAnimator.f5112m = false;
                }
                ImageChooseAdapter imageChooseAdapter2 = this.f73832a.f73822e;
                if (imageChooseAdapter2 != null) {
                    imageChooseAdapter2.f73790d = this.f73832a.f73824g;
                }
                ImageChooseAdapter imageChooseAdapter3 = this.f73832a.f73822e;
                if (imageChooseAdapter3 != null) {
                    imageChooseAdapter3.f73791e = this.f73832a.f73825h;
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$d */
    static final class C28026d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f73833a;

        C28026d(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f73833a = imageChooseUploadActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C28038b bVar = ImageChooseUploadActivity.f73816i;
            if (bVar != null) {
                bVar.mo61509e();
            }
            this.f73833a.finish();
            this.f73833a.mo71476a("cancel_image_choose");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$e */
    static final class C28027e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f73834a;

        C28027e(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f73834a = imageChooseUploadActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f73834a.mo71475a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$f */
    static final class C28028f extends Lambda implements C7562b<List<? extends String>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f73835a;

        C28028f(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f73835a = imageChooseUploadActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m91637a((List) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91637a(List<String> list) {
            Integer num;
            if (C23477d.m77083b(list)) {
                DmtTextView dmtTextView = this.f73835a.f73820c;
                if (dmtTextView != null) {
                    ImageChooseUploadActivity imageChooseUploadActivity = this.f73835a;
                    Object[] objArr = new Object[1];
                    if (list != null) {
                        num = Integer.valueOf(list.size());
                    } else {
                        num = Integer.valueOf(0);
                    }
                    objArr[0] = num;
                    dmtTextView.setText(imageChooseUploadActivity.getString(R.string.vm, objArr));
                }
                DmtTextView dmtTextView2 = this.f73835a.f73820c;
                if (dmtTextView2 != null) {
                    dmtTextView2.setVisibility(0);
                }
            } else {
                DmtTextView dmtTextView3 = this.f73835a.f73820c;
                if (dmtTextView3 != null) {
                    dmtTextView3.setVisibility(8);
                }
            }
            this.f73835a.f73823f = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$g */
    static final class C28029g extends Lambda implements C7563m<View, String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f73836a;

        C28029g(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f73836a = imageChooseUploadActivity;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91638a((View) obj, (String) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91638a(View view, String str) {
            C7573i.m23587b(view, "v");
            if (!TextUtils.isEmpty(str)) {
                HeaderDetailActivity.m116636a(this.f73836a, view, (((float) C9738o.m28691a((Context) this.f73836a)) * 1.0f) / ((float) C9738o.m28709b((Context) this.f73836a)), null, false, null, str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity$h */
    static final class C28030h<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ ImageChooseUploadActivity f73837a;

        C28030h(ImageChooseUploadActivity imageChooseUploadActivity) {
            this.f73837a = imageChooseUploadActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7581n call() {
            C28038b bVar = ImageChooseUploadActivity.f73816i;
            if (bVar == null) {
                return null;
            }
            bVar.mo61506a(this.f73837a.f73823f, new C7561a<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C28030h f73838a;

                {
                    this.f73838a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    m91640a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m91640a() {
                    DmtLoadingDialog dmtLoadingDialog = this.f73838a.f73837a.f73818a;
                    if (dmtLoadingDialog != null) {
                        dmtLoadingDialog.dismiss();
                    }
                    this.f73838a.f73837a.finish();
                }
            });
            return C7581n.f20898a;
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        C28038b bVar = f73816i;
        if (bVar != null) {
            bVar.mo61510f();
        }
        f73816i = null;
    }

    /* renamed from: b */
    private final void m91632b() {
        DmtLoadingDialog dmtLoadingDialog = this.f73818a;
        if (dmtLoadingDialog != null) {
            dmtLoadingDialog.show();
        }
        C1592h.m7853a((Callable<TResult>) new C28024b<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C28025c<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        mo71476a("cancel_image_choose");
        C28038b bVar = f73816i;
        if (bVar != null) {
            bVar.mo61509e();
        }
    }

    /* renamed from: a */
    public final void mo71475a() {
        if (!C23477d.m77081a((Collection<T>) this.f73823f)) {
            ImageChooseAdapter imageChooseAdapter = this.f73822e;
            if (imageChooseAdapter == null || !imageChooseAdapter.f73789c) {
                ImageChooseAdapter imageChooseAdapter2 = this.f73822e;
                if (imageChooseAdapter2 != null) {
                    imageChooseAdapter2.f73789c = true;
                }
                DmtLoadingDialog dmtLoadingDialog = this.f73818a;
                if (dmtLoadingDialog != null) {
                    dmtLoadingDialog.dismiss();
                }
                this.f73818a = new DmtLoadingDialog(this, getString(R.string.fl0));
                DmtLoadingDialog dmtLoadingDialog2 = this.f73818a;
                if (dmtLoadingDialog2 != null) {
                    dmtLoadingDialog2.show();
                }
                C1592h.m7853a((Callable<TResult>) new C28030h<TResult>(this));
                mo71476a("upload_image_choose");
            }
        }
    }

    /* renamed from: a */
    public final void mo71476a(String str) {
        C6907h.m21524a(str, (Map) new C22984d().mo59973a("enter_from", this.f73830o).f60753a);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bm);
        Context context = this;
        this.f73818a = new DmtLoadingDialog(context);
        this.f73819b = (RecyclerView) findViewById(R.id.cxg);
        RecyclerView recyclerView = this.f73819b;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapGridLayoutManager(null, this.f73829n));
        }
        RecyclerView recyclerView2 = this.f73819b;
        if (recyclerView2 != null) {
            recyclerView2.mo5525a((C1272h) new GridSpacingItemDecoration(this.f73829n, (int) C9738o.m28708b(context, 1.0f), false));
        }
        this.f73821d = (DmtTextView) findViewById(R.id.dym);
        this.f73820c = (DmtTextView) findViewById(R.id.e2y);
        this.f73826k = (DmtTextView) findViewById(R.id.dr5);
        DmtTextView dmtTextView = this.f73826k;
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(new C28026d(this));
        }
        DmtTextView dmtTextView2 = this.f73820c;
        if (dmtTextView2 != null) {
            dmtTextView2.setOnClickListener(new C28027e(this));
        }
        if (getIntent().hasExtra("shouldWithCamera")) {
            this.f73827l = Boolean.valueOf(getIntent().getBooleanExtra("shouldWithCamera", true));
        }
        if (getIntent().hasExtra("maxSelectNum")) {
            this.f73828m = getIntent().getIntExtra("maxSelectNum", 9);
        }
        if (getIntent() != null && getIntent().hasExtra("enter_from")) {
            String stringExtra = getIntent().getStringExtra("enter_from");
            C7573i.m23582a((Object) stringExtra, "intent.getStringExtra(ENTER_FROM)");
            this.f73830o = stringExtra;
        }
        ImageChooseAdapter imageChooseAdapter = new ImageChooseAdapter(context, this.f73829n, this.f73828m, this.f73827l, 1.0d, 1.5f, 0);
        this.f73822e = imageChooseAdapter;
        m91632b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity", "onCreate", false);
    }
}
