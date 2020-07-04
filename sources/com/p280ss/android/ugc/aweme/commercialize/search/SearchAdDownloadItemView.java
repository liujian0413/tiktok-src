package com.p280ss.android.ugc.aweme.commercialize.search;

import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22942a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22943b;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22944c;
import com.p280ss.android.ugc.aweme.commercialize.model.C24993d;
import com.p280ss.android.ugc.aweme.commercialize.model.C25007p;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25175a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25175a.C25176a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25196d;
import com.p280ss.android.ugc.aweme.commercialize.views.AdTextProgressButton;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchAdDownloadItemView */
public final class SearchAdDownloadItemView extends SearchAdBaseItemView implements OnClickListener {

    /* renamed from: a */
    public static final C25039a f66077a = new C25039a(null);

    /* renamed from: b */
    private boolean f66078b;

    /* renamed from: c */
    private boolean f66079c;

    /* renamed from: d */
    private HashMap f66080d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchAdDownloadItemView$a */
    public static final class C25039a {
        private C25039a() {
        }

        public /* synthetic */ C25039a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchAdDownloadItemView$b */
    final class C25040b implements C19388d {
        /* renamed from: a */
        public final void mo51373a() {
            ((AdTextProgressButton) SearchAdDownloadItemView.this.mo65518a(R.id.cl1)).mo51373a();
        }

        public C25040b() {
        }

        /* renamed from: b */
        public final void mo51377b(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            ((AdTextProgressButton) SearchAdDownloadItemView.this.mo65518a(R.id.cl1)).mo51377b(eVar);
        }

        /* renamed from: c */
        public final void mo51379c(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            ((AdTextProgressButton) SearchAdDownloadItemView.this.mo65518a(R.id.cl1)).mo51379c(eVar);
        }

        /* renamed from: a */
        public final void mo51375a(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            ((AdTextProgressButton) SearchAdDownloadItemView.this.mo65518a(R.id.cl1)).mo51375a(eVar);
        }

        /* renamed from: a */
        public final void mo51374a(C19387c cVar, C19384a aVar) {
            C7573i.m23587b(cVar, "downloadModel");
            ((AdTextProgressButton) SearchAdDownloadItemView.this.mo65518a(R.id.cl1)).mo51374a(cVar, aVar);
        }

        /* renamed from: b */
        public final void mo51378b(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
            ((AdTextProgressButton) SearchAdDownloadItemView.this.mo65518a(R.id.cl1)).mo51378b(eVar, i);
        }

        /* renamed from: a */
        public final void mo51376a(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
            ((AdTextProgressButton) SearchAdDownloadItemView.this.mo65518a(R.id.cl1)).mo51376a(eVar, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchAdDownloadItemView$c */
    static final class C25041c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ SearchAdDownloadItemView f66082a;

        /* renamed from: b */
        final /* synthetic */ AwemeRawAd f66083b;

        C25041c(SearchAdDownloadItemView searchAdDownloadItemView, AwemeRawAd awemeRawAd) {
            this.f66082a = searchAdDownloadItemView;
            this.f66083b = awemeRawAd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m82475a();
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
            if (r1 == null) goto L_0x0018;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m82475a() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.commercialize.search.SearchAdDownloadItemView r0 = r4.f66082a
                android.content.Context r0 = r0.getContext()
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r4.f66083b
                java.lang.Long r1 = r1.getCreativeId()
                if (r1 == 0) goto L_0x0018
                long r1 = r1.longValue()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                if (r1 != 0) goto L_0x001a
            L_0x0018:
                java.lang.String r1 = ""
            L_0x001a:
                java.lang.String r2 = "card_download_button"
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r4.f66083b
                java.lang.String r3 = r3.getLogExtra()
                com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82162b(r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.search.SearchAdDownloadItemView.C25041c.m82475a():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchAdDownloadItemView$d */
    static final class C25042d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f66084a;

        C25042d(AwemeRawAd awemeRawAd) {
            this.f66084a = awemeRawAd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m82476a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m82476a() {
            C19535g a = DownloaderManagerHolder.m75524a();
            String downloadUrl = this.f66084a.getDownloadUrl();
            Long adId = this.f66084a.getAdId();
            C7573i.m23582a((Object) adId, "rawAd.adId");
            a.mo51670a(downloadUrl, adId.longValue(), 2, C22943b.m75511a("result_ad", this.f66084a, "card_download_button"), C22942a.m75508a(this.f66084a));
        }
    }

    /* renamed from: a */
    public final View mo65518a(int i) {
        if (this.f66080d == null) {
            this.f66080d = new HashMap();
        }
        View view = (View) this.f66080d.get(Integer.valueOf(R.id.cl1));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.cl1);
        this.f66080d.put(Integer.valueOf(R.id.cl1), findViewById);
        return findViewById;
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        m82466b();
        m82463a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m82466b();
        this.f66079c = false;
    }

    /* renamed from: b */
    private final void m82466b() {
        String str;
        if (this.f66078b) {
            this.f66078b = false;
            C19535g a = DownloaderManagerHolder.m75524a();
            C25007p adModuleInfo = getAdModuleInfo();
            if (adModuleInfo != null) {
                C24993d dVar = adModuleInfo.f65962a;
                if (dVar != null) {
                    AwemeRawAd awemeRawAd = dVar.f65900a;
                    if (awemeRawAd != null) {
                        str = awemeRawAd.getDownloadUrl();
                        a.mo51669a(str, hashCode());
                    }
                }
            }
            str = null;
            a.mo51669a(str, hashCode());
        }
    }

    /* renamed from: a */
    private final void m82463a() {
        C25007p adModuleInfo = getAdModuleInfo();
        if (adModuleInfo != null) {
            C24993d dVar = adModuleInfo.f65962a;
            if (!(dVar == null || dVar.f65900a == null)) {
                C25007p adModuleInfo2 = getAdModuleInfo();
                if (adModuleInfo2 == null) {
                    C7573i.m23580a();
                }
                C24993d dVar2 = adModuleInfo2.f65962a;
                if (dVar2 == null) {
                    C7573i.m23580a();
                }
                AwemeRawAd awemeRawAd = dVar2.f65900a;
                if (awemeRawAd == null) {
                    C7573i.m23580a();
                }
                if (!this.f66078b) {
                    this.f66078b = true;
                    DownloaderManagerHolder.m75524a().mo51666a(getContext(), hashCode(), new C25040b(), C22944c.m75515a(getContext(), awemeRawAd));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r2 == null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            com.ss.android.ugc.aweme.commercialize.model.p r0 = r5.getAdModuleInfo()
            if (r0 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.commercialize.model.d r0 = r0.f65962a
            if (r0 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.f65900a
            if (r0 != 0) goto L_0x0012
            goto L_0x005c
        L_0x0012:
            com.ss.android.ugc.aweme.commercialize.model.p r0 = r5.getAdModuleInfo()
            if (r0 != 0) goto L_0x001b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x001b:
            com.ss.android.ugc.aweme.commercialize.model.d r0 = r0.f65962a
            if (r0 != 0) goto L_0x0022
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0022:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.f65900a
            if (r0 != 0) goto L_0x0029
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0029:
            r5.m82463a()
            boolean r1 = r5.f66079c
            if (r1 != 0) goto L_0x0058
            int r1 = r5.getVisibility()
            if (r1 != 0) goto L_0x0058
            android.content.Context r1 = r5.getContext()
            java.lang.Long r2 = r0.getCreativeId()
            if (r2 == 0) goto L_0x004a
            long r2 = r2.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r2 != 0) goto L_0x004c
        L_0x004a:
            java.lang.String r2 = ""
        L_0x004c:
            java.lang.String r3 = "card"
            java.lang.String r4 = r0.getLogExtra()
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82068a(r1, r2, r3, r4)
            r5.mo65520b(r0)
        L_0x0058:
            r0 = 1
            r5.f66079c = r0
            return
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.search.SearchAdDownloadItemView.onAttachedToWindow():void");
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null) {
            C25007p adModuleInfo = getAdModuleInfo();
            if (adModuleInfo != null) {
                C24993d dVar = adModuleInfo.f65962a;
                if (!(dVar == null || dVar.f65900a == null)) {
                    C25007p adModuleInfo2 = getAdModuleInfo();
                    if (adModuleInfo2 == null) {
                        C7573i.m23580a();
                    }
                    C24993d dVar2 = adModuleInfo2.f65962a;
                    if (dVar2 == null) {
                        C7573i.m23580a();
                    }
                    AwemeRawAd awemeRawAd = dVar2.f65900a;
                    if (awemeRawAd == null) {
                        C7573i.m23580a();
                    }
                    int id = view.getId();
                    if (id == R.id.gh) {
                        m82464a(awemeRawAd, "card_photo");
                    } else if (id == R.id.gj) {
                        m82464a(awemeRawAd, "card_name");
                    } else if (id == R.id.gg || id == R.id.cnk) {
                        m82464a(awemeRawAd, "card_title");
                    } else if (id == R.id.aal) {
                        m82464a(awemeRawAd, "card");
                    } else {
                        if (id == R.id.cl1) {
                            Context context = getContext();
                            C7573i.m23582a((Object) context, "context");
                            C25196d.m82880a(context, m82465b(awemeRawAd, "card_download_button"), new C25041c(this, awemeRawAd), new C25042d(awemeRawAd)).mo65822a();
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r1 == null) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m82464a(com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd r4, java.lang.String r5) {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = m82465b(r4, r5)
            com.ss.android.ugc.aweme.commercialize.utils.a.g r0 = com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25196d.m82879a(r0, r1)
            r0.mo65822a()
            android.content.Context r0 = r3.getContext()
            java.lang.Long r1 = r4.getCreativeId()
            if (r1 == 0) goto L_0x0028
            long r1 = r1.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            if (r1 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r1 = ""
        L_0x002a:
            java.lang.String r2 = r4.getLogExtra()
            com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82162b(r0, r1, r5, r2)
            r3.mo65519a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.search.SearchAdDownloadItemView.m82464a(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, java.lang.String):void");
    }

    /* renamed from: b */
    private static C25175a m82465b(AwemeRawAd awemeRawAd, String str) {
        long j;
        Aweme aweme = new Aweme();
        aweme.setAwemeRawAd(awemeRawAd);
        aweme.setAd(true);
        C25176a f = new C25176a().mo65765a(aweme).mo65772c(awemeRawAd.getOpenUrl()).mo65775e(awemeRawAd.getWebUrl()).mo65776f(awemeRawAd.getWebTitle());
        Long creativeId = awemeRawAd.getCreativeId();
        long j2 = 0;
        if (creativeId != null) {
            j = creativeId.longValue();
        } else {
            j = 0;
        }
        C25176a b = f.mo65764a(j).mo65770b(awemeRawAd.getLogExtra());
        Long groupId = awemeRawAd.getGroupId();
        if (groupId != null) {
            j2 = groupId.longValue();
        }
        return b.mo65769b(j2).mo65778h("result_ad").mo65779i(str).f66436a;
    }
}
