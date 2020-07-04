package com.p280ss.android.ugc.trill.language;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.C32982di;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.user.C42811c;
import com.p280ss.android.ugc.aweme.user.C42813d;
import com.p280ss.android.ugc.aweme.views.C43374j;
import com.p280ss.android.ugc.trill.language.api.LanguageApi;
import com.p280ss.android.ugc.trill.settings.ContentLangDialogBoxSettings;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.trill.language.e */
public final class C45022e extends C43374j implements OnClickListener, C45035h {

    /* renamed from: a */
    public ContentLanguageGuideAdapter f115723a;

    /* renamed from: b */
    public String f115724b;

    /* renamed from: c */
    public final C32982di f115725c = new C32982di();

    /* renamed from: d */
    public final LanguageApi f115726d = ((LanguageApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(LanguageApi.class));

    /* renamed from: e */
    private ArrayList<String> f115727e = new ArrayList<>();

    /* renamed from: f */
    private long f115728f;

    /* renamed from: com.ss.android.ugc.trill.language.e$a */
    static final class C45023a implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C45022e f115729a;

        C45023a(C45022e eVar) {
            this.f115729a = eVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            String str;
            C7573i.m23582a((Object) C42811c.m135845a(), "UserManager.inst()");
            if (C42811c.m135867c()) {
                this.f115729a.f115726d.setContentLanguageDialogShown("content_language_already_popup").mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<BaseResponse>() {
                    public final void onComplete() {
                    }

                    public final void onError(Throwable th) {
                        C7573i.m23587b(th, "e");
                    }

                    public final void onSubscribe(C7321c cVar) {
                        C7573i.m23587b(cVar, "d");
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        m142021a((BaseResponse) obj);
                    }

                    /* renamed from: a */
                    private static void m142021a(BaseResponse baseResponse) {
                        C7573i.m23587b(baseResponse, "t");
                        if (baseResponse.status_code == 0) {
                            Object service = ServiceManager.get().getService(IUserService.class);
                            C7573i.m23582a(service, "ServiceManager.get().get…IUserService::class.java)");
                            User currentUser = ((IUserService) service).getCurrentUser();
                            C7573i.m23582a((Object) currentUser, "ServiceManager.get().get…             .currentUser");
                            currentUser.setContentLanguageDialogShown(true);
                            C42813d.m135938h();
                        }
                    }
                });
            } else {
                this.f115729a.f115725c.mo84683a(true);
            }
            String str2 = "show_content_language_popup";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f115729a.f115724b);
            String str3 = "is_login";
            C7573i.m23582a((Object) C42811c.m135845a(), "UserManager.inst()");
            if (C42811c.m135867c()) {
                str = "1";
            } else {
                str = "0";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.e$b */
    public static final class C45025b implements C7498y<BaseResponse> {
        C45025b() {
        }

        /* renamed from: a */
        private static void m142022a(BaseResponse baseResponse) {
            C7573i.m23587b(baseResponse, "t");
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            m142022a((BaseResponse) obj);
        }
    }

    /* renamed from: b */
    public final void mo71376b() {
        m142015g();
    }

    /* renamed from: a */
    public final void mo71375a() {
        this.f115728f = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        m142015g();
    }

    public final void onStart() {
        super.onStart();
        this.f115728f = System.currentTimeMillis();
    }

    /* renamed from: g */
    private final void m142015g() {
        if (this.f115728f > 0) {
            C6907h.m21524a("popup_duration", (Map) C22984d.m75611a().mo59973a("enter_from", this.f115724b).mo59971a("duration", System.currentTimeMillis() - this.f115728f).mo59970a("icon_load", this.f115727e.size()).f60753a);
            this.f115728f = 0;
        }
    }

    /* renamed from: c */
    public final void mo73992c() {
        super.mo73992c();
        this.f112344h = (int) C9738o.m28708b(getContext(), 280.0f);
        double b = (double) C9738o.m28709b(getContext());
        Double.isNaN(b);
        this.f112345i = (int) (b * 0.67d);
    }

    /* renamed from: f */
    private final void m142014f() {
        ArrayList<String> arrayList;
        float f;
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.r2);
        C7573i.m23582a((Object) dmtTextView, "btn_ok");
        ContentLanguageGuideAdapter contentLanguageGuideAdapter = this.f115723a;
        if (contentLanguageGuideAdapter != null) {
            arrayList = contentLanguageGuideAdapter.f115693b;
        } else {
            arrayList = null;
        }
        dmtTextView.setEnabled(!C6307b.m19566a((Collection<T>) arrayList));
        DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.r2);
        C7573i.m23582a((Object) dmtTextView2, "btn_ok");
        DmtTextView dmtTextView3 = (DmtTextView) findViewById(R.id.r2);
        C7573i.m23582a((Object) dmtTextView3, "btn_ok");
        if (dmtTextView3.isEnabled()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        dmtTextView2.setAlpha(f);
    }

    /* renamed from: d */
    private final void m142012d() {
        setCanceledOnTouchOutside(false);
        setOnShowListener(new C45023a(this));
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.title);
        C7573i.m23582a((Object) dmtTextView, "title");
        dmtTextView.setText(ContentLangDialogBoxSettings.getContentLangDialogContent().getTitle());
        DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.a7e);
        C7573i.m23582a((Object) dmtTextView2, "desc");
        dmtTextView2.setText(ContentLangDialogBoxSettings.getContentLangDialogContent().getText());
        OnClickListener onClickListener = this;
        ((DmtTextView) findViewById(R.id.r2)).setOnClickListener(onClickListener);
        m142014f();
        ((ImageView) findViewById(R.id.px)).setOnClickListener(onClickListener);
        this.f115723a = new ContentLanguageGuideAdapter(this.f115724b, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cqp);
        C7573i.m23582a((Object) recyclerView, "recycler_view");
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.cqp);
        C7573i.m23582a((Object) recyclerView2, "recycler_view");
        recyclerView2.setAdapter(this.f115723a);
        ((RecyclerView) findViewById(R.id.cqp)).mo5525a((C1272h) new ItemDecoration());
    }

    /* renamed from: e */
    private final void m142013e() {
        ArrayList<String> arrayList;
        ContentLanguageGuideAdapter contentLanguageGuideAdapter = this.f115723a;
        if (contentLanguageGuideAdapter != null) {
            arrayList = contentLanguageGuideAdapter.f115693b;
        } else {
            arrayList = null;
        }
        if (arrayList == null || C6307b.m19566a((Collection<T>) arrayList)) {
            C6907h.m21524a("click_content_language_popup", (Map) C22984d.m75611a().mo59973a("enter_from", this.f115724b).mo59973a("language_type", "ok").mo59973a("click_type", TEVideoRecorder.FACE_BEAUTY_NULL).f60753a);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String append : arrayList) {
            sb.append(append);
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
            i++;
        }
        C7573i.m23582a((Object) C42811c.m135845a(), "UserManager.inst()");
        if (C42811c.m135867c()) {
            this.f115726d.setContentLanguage("content_language", sb.toString(), 1).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C45025b<Object>());
        } else {
            C32982di diVar = this.f115725c;
            String sb2 = sb.toString();
            C7573i.m23582a((Object) sb2, "languageCode.toString()");
            diVar.mo84682a(sb2);
        }
        C6907h.m21524a("choose_content_language_popup", (Map) C22984d.m75611a().mo59973a("enter_from", this.f115724b).mo59973a("language_type", sb.toString()).f60753a);
        dismiss();
    }

    /* renamed from: a */
    public final void mo107539a(String str) {
        C7573i.m23587b(str, "code");
        m142014f();
    }

    /* renamed from: b */
    public final void mo107540b(String str) {
        if (!TextUtils.isEmpty(str) && !C7525m.m23496a((Iterable<? extends T>) this.f115727e, str)) {
            ArrayList<String> arrayList = this.f115727e;
            if (str == null) {
                C7573i.m23580a();
            }
            arrayList.add(str);
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.px) {
            C6907h.m21524a("choose_content_language_popup", (Map) C22984d.m75611a().mo59973a("enter_from", this.f115724b).mo59973a("language_type", "cancel").f60753a);
            dismiss();
            return;
        }
        if (num != null && num.intValue() == R.id.r2) {
            m142013e();
        }
    }

    public C45022e(Context context, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "enterFrom");
        super(context, (int) R.style.w2, 0, 0);
        this.f115724b = str;
        setContentView(R.layout.jz);
        m142012d();
    }
}
