package com.p280ss.android.ugc.aweme.poi.p1462b;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.api.PoiAnswerLikeApi;
import com.p280ss.android.ugc.aweme.poi.api.PoiAnswerLikeApi.C35057a;
import com.p280ss.android.ugc.aweme.poi.model.PoiAnswer;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.poi.b.a */
public final class C35061a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f91698a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C35061a.class), "service", "getService()Lcom/ss/android/ugc/aweme/poi/api/PoiAnswerLikeApi;"))};

    /* renamed from: b */
    public int f91699b;

    /* renamed from: c */
    public boolean f91700c;

    /* renamed from: d */
    public View f91701d;

    /* renamed from: e */
    public PoiAnswer f91702e;

    /* renamed from: f */
    public String f91703f;

    /* renamed from: g */
    public PoiSimpleBundle f91704g;

    /* renamed from: h */
    private final CheckableImageView f91705h;

    /* renamed from: i */
    private final DmtTextView f91706i;

    /* renamed from: j */
    private final LinearLayout f91707j;

    /* renamed from: k */
    private final C7541d f91708k = C7546e.m23568a(LazyThreadSafetyMode.NONE, C35064a.f91711a);

    /* renamed from: com.ss.android.ugc.aweme.poi.b.a$a */
    static final class C35064a extends Lambda implements C7561a<PoiAnswerLikeApi> {

        /* renamed from: a */
        public static final C35064a f91711a = new C35064a();

        C35064a() {
            super(0);
        }

        /* renamed from: a */
        private static PoiAnswerLikeApi m113182a() {
            return C35057a.m113162a();
        }

        public final /* synthetic */ Object invoke() {
            return m113182a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.b.a$b */
    static final class C35065b<T> implements C7326g<BaseResponse> {

        /* renamed from: a */
        public static final C35065b f91712a = new C35065b();

        C35065b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.b.a$c */
    static final class C35066c<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C35066c f91713a = new C35066c();

        C35066c() {
        }

        /* renamed from: a */
        private static void m113183a(Throwable th) {
            if (th != null) {
                C6497a.m20185b(th);
            }
        }

        public final /* synthetic */ void accept(Object obj) {
            m113183a((Throwable) obj);
        }
    }

    /* renamed from: b */
    private final PoiAnswerLikeApi m113173b() {
        return (PoiAnswerLikeApi) this.f91708k.getValue();
    }

    /* renamed from: a */
    public final void mo88880a() {
        m113175c();
        m113176d();
        m113174b(this.f91702e.getAnswerId());
    }

    /* renamed from: d */
    private void m113176d() {
        int i;
        CheckableImageView checkableImageView = this.f91705h;
        if (this.f91700c) {
            i = R.drawable.b_6;
        } else {
            i = R.drawable.b_5;
        }
        checkableImageView.setImageResource(i);
        m113177e();
    }

    /* renamed from: c */
    private final void m113175c() {
        this.f91700c = !this.f91700c;
        if (this.f91700c && this.f91699b == Integer.MAX_VALUE) {
            return;
        }
        if (this.f91700c) {
            this.f91699b++;
            m113172a("like_poi_answer");
            return;
        }
        this.f91699b--;
        m113172a("cancel_like_poi_answer");
    }

    /* renamed from: e */
    private final void m113177e() {
        boolean z;
        this.f91706i.setVisibility(8);
        Integer valueOf = Integer.valueOf(this.f91699b);
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.intValue();
            this.f91706i.setVisibility(0);
            this.f91706i.setText(C30537o.m99738a((long) this.f91699b));
        }
    }

    /* renamed from: b */
    private void m113174b(String str) {
        int i;
        C7573i.m23587b(str, "answerId");
        if (this.f91700c) {
            i = 1;
        } else {
            i = 2;
        }
        m113173b().uploadAnswerLike(str, i).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) C35065b.f91712a, (C7326g<? super Throwable>) C35066c.f91713a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r3 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r3 == null) goto L_0x0039;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m113172a(java.lang.String r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r0 = r4.f91704g
            com.ss.android.ugc.aweme.app.g.d r1 = new com.ss.android.ugc.aweme.app.g.d
            r1.<init>()
            java.lang.String r2 = "question_id"
            java.lang.String r3 = r4.f91703f
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "answer_id"
            com.ss.android.ugc.aweme.poi.model.PoiAnswer r3 = r4.f91702e
            java.lang.String r3 = r3.getAnswerId()
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "poi_id"
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r3 = r4.f91704g
            if (r3 == 0) goto L_0x0027
            java.lang.String r3 = r3.getPoiId()
            if (r3 != 0) goto L_0x0029
        L_0x0027:
            java.lang.String r3 = ""
        L_0x0029:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "previous_page"
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r3 = r4.f91704g
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.getPreviousPage()
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            java.lang.String r3 = ""
        L_0x003b:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "poi_page"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            com.p280ss.android.ugc.aweme.poi.utils.C35454m.m114523a(r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p1462b.C35061a.m113172a(java.lang.String):void");
    }

    public C35061a(View view, PoiAnswer poiAnswer, String str, PoiSimpleBundle poiSimpleBundle) {
        boolean z;
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(poiAnswer, "answer");
        C7573i.m23587b(str, "questionId");
        this.f91701d = view;
        this.f91702e = poiAnswer;
        this.f91703f = str;
        this.f91704g = poiSimpleBundle;
        View findViewById = this.f91701d.findViewById(R.id.ax2);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.ic_like)");
        this.f91705h = (CheckableImageView) findViewById;
        View findViewById2 = this.f91701d.findViewById(R.id.blo);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.like_amounts)");
        this.f91706i = (DmtTextView) findViewById2;
        View findViewById3 = this.f91701d.findViewById(R.id.bls);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.like_container)");
        this.f91707j = (LinearLayout) findViewById3;
        this.f91707j.setOnClickListener(new C42939as(this) {

            /* renamed from: a */
            final /* synthetic */ C35061a f91709a;

            /* renamed from: com.ss.android.ugc.aweme.poi.b.a$1$a */
            static final class C35063a implements C23305g {

                /* renamed from: a */
                final /* synthetic */ C350621 f91710a;

                C35063a(C350621 r1) {
                    this.f91710a = r1;
                }

                /* renamed from: a */
                public final void mo58664a(Bundle bundle) {
                }

                /* renamed from: a */
                public final void mo58663a() {
                    this.f91710a.f91709a.mo88880a();
                }
            }

            {
                this.f91709a = r1;
            }

            /* renamed from: a */
            public final void mo70606a(View view) {
                IAccountUserService f = C6861a.m21337f();
                C7573i.m23582a((Object) f, "AccountProxyService.userService()");
                if (!f.isLogin()) {
                    C32656f.m105745a(C6405d.m19984g(), "poi_page", "click_like_poi_answer", (C23305g) new C35063a(this));
                } else {
                    this.f91709a.mo88880a();
                }
            }
        });
        int i = 0;
        this.f91707j.setVisibility(0);
        Boolean isUserLike = this.f91702e.isUserLike();
        if (isUserLike != null) {
            z = isUserLike.booleanValue();
        } else {
            z = false;
        }
        this.f91700c = z;
        this.f91706i.setVisibility(8);
        Integer likeAmounts = this.f91702e.getLikeAmounts();
        if (likeAmounts != null) {
            i = likeAmounts.intValue();
        }
        this.f91699b = i;
    }
}
