package com.p280ss.android.ugc.aweme.filter.p1245d;

import android.content.Context;
import android.net.Uri;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.effectplatform.C27470a;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.filter.C29341z;
import com.p280ss.android.ugc.aweme.filter.FilterManager;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.utils.C43117fa;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.filter.d.a */
public final class C29279a {

    /* renamed from: a */
    private EffectPlatform f77254a;

    /* renamed from: a */
    public final void mo74942a() {
        if (this.f77254a != null) {
            this.f77254a.destroy();
        }
        this.f77254a = null;
    }

    /* renamed from: a */
    private static int m96033a(Effect effect) {
        try {
            return Integer.parseInt(effect.getEffectId());
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            return -1;
        }
    }

    /* renamed from: a */
    public final EffectPlatform mo74940a(Context context) {
        if (this.f77254a == null) {
            this.f77254a = new EffectPlatform(context, C35574k.m114859a().mo70107v().mo83209c(), C35574k.m114859a().mo70078L().getOKHttpClient());
        }
        return this.f77254a;
    }

    /* renamed from: a */
    public final List<C29296g> mo74941a(List<Effect> list) {
        if (C6311g.m19573a(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Effect effect : list) {
            C29296g gVar = new C29296g();
            gVar.f77267b = effect.getName();
            gVar.f77268c = C29341z.m96254a(effect);
            gVar.f77266a = m96033a(effect);
            gVar.f77269d = C43117fa.m136744a(C27470a.m90049a(effect.getFileUrl()));
            gVar.f77274i = effect.getTags();
            gVar.f77271f = Uri.parse((String) effect.getIconUrl().getUrlList().get(0));
            arrayList.add(gVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo74943a(Context context, String str) {
        mo74940a(context).mo70636a(str, false, (C43757g) new C43757g() {
            /* renamed from: a */
            public final void mo9274a(C43726c cVar) {
            }

            /* renamed from: a */
            public final void mo9275a(EffectChannelResponse effectChannelResponse) {
            }
        });
    }

    /* renamed from: a */
    public final void mo74944a(Context context, String str, final C43757g gVar) {
        this.f77254a = mo74940a(context);
        this.f77254a.mo70641b(str, false, new C43757g() {
            /* renamed from: a */
            public final void mo9274a(C43726c cVar) {
                if (gVar != null) {
                    gVar.mo9274a(cVar);
                }
            }

            /* access modifiers changed from: 0000 */
            /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse>, for r3v0, types: [java.util.List, java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse>] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.util.List mo74945a(java.util.List<com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> r3) throws java.lang.Exception {
                /*
                    r2 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Iterator r3 = r3.iterator()
                L_0x0009:
                    boolean r1 = r3.hasNext()
                    if (r1 == 0) goto L_0x001b
                    java.lang.Object r1 = r3.next()
                    com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r1 = (com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse) r1
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r1.totalEffects
                    r0.addAll(r1)
                    goto L_0x0009
                L_0x001b:
                    com.ss.android.ugc.aweme.filter.d.a r3 = com.p280ss.android.ugc.aweme.filter.p1245d.C29279a.this
                    java.util.List r3 = r3.mo74941a(r0)
                    com.ss.android.ugc.aweme.filter.FilterManager r0 = com.p280ss.android.ugc.aweme.filter.FilterManager.m95700a()
                    r0.mo74719b(r3)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.filter.p1245d.C29279a.C292801.mo74945a(java.util.List):java.util.List");
            }

            /* renamed from: a */
            public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                List<EffectCategoryResponse> list = effectChannelResponse.categoryResponseList;
                if (!C6307b.m19566a((Collection<T>) list)) {
                    C1592h.m7855a((Callable<TResult>) new C29282b<TResult>(this, list), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C29283c<TResult,TContinuationResult>(list), C1592h.f5958b).mo6876a((C1591g<TResult, TContinuationResult>) new C29284d<TResult,TContinuationResult>(list), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C29285e<TResult,TContinuationResult>(gVar, effectChannelResponse), C1592h.f5958b);
                }
            }

            /* renamed from: b */
            static final /* synthetic */ List m96041b(List list, C1592h hVar) throws Exception {
                if (!hVar.mo6882b() || C6311g.m19573a((List) hVar.mo6890e())) {
                    return null;
                }
                C35574k.m114859a().mo70097l().mo74951d().mo74823a(list);
                return (List) hVar.mo6890e();
            }

            /* renamed from: a */
            static final /* synthetic */ List m96040a(List list, C1592h hVar) throws Exception {
                if (!hVar.mo6882b() || C6311g.m19573a((List) hVar.mo6890e())) {
                    return null;
                }
                C35574k.m114859a().mo70097l().mo74951d().mo74826b(list);
                C35574k.m114859a().mo70097l().mo74951d().mo74829c((List) hVar.mo6890e());
                return C29341z.m96256a((List) hVar.mo6890e());
            }

            /* renamed from: a */
            static final /* synthetic */ Void m96039a(C43757g gVar, EffectChannelResponse effectChannelResponse, C1592h hVar) throws Exception {
                if (!hVar.mo6882b() || C6311g.m19573a((List) hVar.mo6890e())) {
                    return null;
                }
                FilterManager.m95700a().mo74715a((List) hVar.mo6890e());
                FilterManager.m95700a().mo74717b();
                if (gVar != null) {
                    gVar.mo9275a(effectChannelResponse);
                }
                return null;
            }
        });
    }
}
