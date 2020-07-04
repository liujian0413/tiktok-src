package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.model.p601c.C11786e;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeViewModel */
public class JediAwemeViewModel extends JediViewModel<AwemeState> {

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeViewModel$a */
    static final class C35932a extends Lambda implements C7562b<AwemeState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeViewModel f94087a;

        C35932a(JediAwemeViewModel jediAwemeViewModel) {
            this.f94087a = jediAwemeViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115861a((AwemeState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115861a(AwemeState awemeState) {
            C7573i.m23587b(awemeState, "state");
            JediAwemeViewModel jediAwemeViewModel = this.f94087a;
            C7321c f = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).observeAwemeById(awemeState.getAweme().getAid()).mo19325f((C7326g<? super T>) new C7326g<C11786e<? extends Aweme>>(this) {

                /* renamed from: a */
                final /* synthetic */ C35932a f94088a;

                {
                    this.f94088a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C11786e<? extends Aweme> eVar) {
                    final Aweme aweme = (Aweme) eVar.mo29356a();
                    if (aweme != null) {
                        this.f94088a.f94087a.mo29038c(new C7562b<AwemeState, AwemeState>() {
                            /* access modifiers changed from: private */
                            /* renamed from: a */
                            public AwemeState invoke(AwemeState awemeState) {
                                C7573i.m23587b(awemeState, "$receiver");
                                return awemeState.copy(aweme);
                            }
                        });
                    }
                }
            });
            C7573i.m23582a((Object) f, "ServiceManager.get().get…          }\n            }");
            jediAwemeViewModel.mo29029a(f);
        }
    }

    /* renamed from: f */
    private static AwemeState m115857f() {
        return new AwemeState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m115857f();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        m115858g();
    }

    /* renamed from: g */
    private final void m115858g() {
        mo29036b(new C35932a(this));
    }
}
