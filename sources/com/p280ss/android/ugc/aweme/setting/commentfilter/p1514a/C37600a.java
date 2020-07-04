package com.p280ss.android.ugc.aweme.setting.commentfilter.p1514a;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.setting.commentfilter.api.C37606a;
import com.p280ss.android.ugc.aweme.setting.commentfilter.api.CommentFilterApi;
import com.p280ss.android.ugc.aweme.setting.commentfilter.api.CommentFilterApi.API;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.a.a */
public final class C37600a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f98050a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C37600a.class), "mApi", "getMApi()Lcom/ss/android/ugc/aweme/setting/commentfilter/api/CommentFilterApi$API;"))};

    /* renamed from: c */
    public static final C37601a f98051c = new C37601a(null);

    /* renamed from: b */
    public final DataCenter f98052b;

    /* renamed from: d */
    private final C7541d f98053d = C7546e.m23569a(C37603c.f98055a);

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.a.a$a */
    public static final class C37601a {
        private C37601a() {
        }

        public /* synthetic */ C37601a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.a.a$b */
    static final class C37602b<TTaskResult, TContinuationResult> implements C1591g<C37606a, Object> {

        /* renamed from: a */
        final /* synthetic */ C37600a f98054a;

        C37602b(C37600a aVar) {
            this.f98054a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C37606a> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6887c() || hVar.mo6889d() || !hVar.mo6882b()) {
                return null;
            }
            DataCenter dataCenter = this.f98054a.f98052b;
            if (dataCenter != null) {
                dataCenter.mo60134a("list_keywords", (Object) ((C37606a) hVar.mo6890e()).f98066a);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.a.a$c */
    static final class C37603c extends Lambda implements C7561a<API> {

        /* renamed from: a */
        public static final C37603c f98055a = new C37603c();

        C37603c() {
            super(0);
        }

        /* renamed from: a */
        private static API m120407a() {
            return CommentFilterApi.f98065a;
        }

        public final /* synthetic */ Object invoke() {
            return m120407a();
        }
    }

    /* renamed from: b */
    private final API m120403b() {
        return (API) this.f98053d.getValue();
    }

    /* renamed from: a */
    public final void mo94911a() {
        API b = m120403b();
        C7573i.m23582a((Object) b, "mApi");
        b.getCommentFilterKeywords().mo6876a((C1591g<TResult, TContinuationResult>) new C37602b<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    public C37600a(DataCenter dataCenter) {
        this.f98052b = dataCenter;
    }

    /* renamed from: a */
    public final C1592h<BaseResponse> mo94910a(String str) {
        C7573i.m23587b(str, "keywords");
        C1592h<BaseResponse> commentFilterKeywords = m120403b().setCommentFilterKeywords(str);
        C7573i.m23582a((Object) commentFilterKeywords, "mApi.setCommentFilterKeywords(keywords)");
        return commentFilterKeywords;
    }
}
