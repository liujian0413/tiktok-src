package com.p280ss.android.ugc.aweme.filter;

import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.ViewStubCompat;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.filter.C29241bd.C29242a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39369c;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39370d;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39376h;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39378j;
import com.p280ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.filter.a */
public abstract class C29182a implements C39378j {

    /* renamed from: a */
    private C39376h f77077a;

    /* renamed from: b */
    private C29241bd f77078b;

    /* renamed from: c */
    private CompositeStoryFilterIndicator f77079c;

    /* renamed from: a */
    public abstract ViewStubCompat mo74782a();

    /* renamed from: b */
    public abstract FrameLayout mo74786b();

    /* renamed from: c */
    public abstract FrameLayout mo74787c();

    /* renamed from: a */
    public final void mo74785a(C39376h hVar) {
        this.f77077a = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r10 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r10 == null) goto L_0x0054;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74784a(com.p280ss.android.ugc.aweme.filter.C29296g r10, com.p280ss.android.ugc.aweme.filter.C29296g r11, boolean r12) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator r0 = r9.f77079c
            if (r0 != 0) goto L_0x001b
            android.support.v7.widget.ViewStubCompat r0 = r9.mo74782a()
            android.view.View r0 = r0.mo6224a()
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator r0 = (com.p280ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator) r0
            r9.f77079c = r0
            goto L_0x001b
        L_0x0013:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException
            java.lang.String r11 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator"
            r10.<init>(r11)
            throw r10
        L_0x001b:
            com.ss.android.ugc.aweme.port.in.n r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
            com.ss.android.ugc.aweme.filter.e.a r0 = r0.mo70097l()
            com.ss.android.ugc.aweme.filter.f.b r0 = r0.mo74951d()
            java.lang.String r0 = r0.mo74828c(r10)
            com.ss.android.ugc.aweme.port.in.n r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114859a()
            com.ss.android.ugc.aweme.filter.e.a r1 = r1.mo70097l()
            com.ss.android.ugc.aweme.filter.f.b r1 = r1.mo74951d()
            java.lang.String r1 = r1.mo74828c(r11)
            com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator r2 = r9.f77079c
            if (r2 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.shortvideo.e.b r3 = new com.ss.android.ugc.aweme.shortvideo.e.b
            if (r10 == 0) goto L_0x0047
            java.lang.String r10 = r10.f77267b
            if (r10 != 0) goto L_0x0049
        L_0x0047:
            java.lang.String r10 = ""
        L_0x0049:
            r3.<init>(r10, r0)
            com.ss.android.ugc.aweme.shortvideo.e.b r4 = new com.ss.android.ugc.aweme.shortvideo.e.b
            if (r11 == 0) goto L_0x0054
            java.lang.String r10 = r11.f77267b
            if (r10 != 0) goto L_0x0056
        L_0x0054:
            java.lang.String r10 = ""
        L_0x0056:
            r4.<init>(r10, r1)
            r6 = 0
            r7 = 8
            r8 = 0
            r5 = r12
            r2.mo103467a(r3, r4, r5, false)
            return
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.filter.C29182a.mo74784a(com.ss.android.ugc.aweme.filter.g, com.ss.android.ugc.aweme.filter.g, boolean):void");
    }

    /* renamed from: a */
    public final void mo74783a(AppCompatActivity appCompatActivity, C23258e eVar, AVETParameter aVETParameter, C39370d dVar, C7561a<C7581n> aVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(eVar, "listenableActivityRegistry");
        C7573i.m23587b(aVETParameter, "parameter");
        C7573i.m23587b(aVar, "firstCreateCallback");
        if (this.f77078b == null) {
            this.f77078b = new C29242a(appCompatActivity, mo74786b(), mo74787c()).mo74870a(eVar).mo74873a(this.f77077a).mo74871a((C29240bc) new C39369c(C35574k.m114859a().mo70097l().mo74950c().mo74723f())).mo74875a(C35574k.m114859a().mo70091f().mo93342a(Property.DisableFilter)).mo74874a(aVETParameter).mo74877b(true).mo74872a(dVar).mo74876a();
            aVar.invoke();
        }
        C29241bd bdVar = this.f77078b;
        if (bdVar != null) {
            bdVar.mo74749a();
        }
    }
}
