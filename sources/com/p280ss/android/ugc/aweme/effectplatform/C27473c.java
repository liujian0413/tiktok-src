package com.p280ss.android.ugc.aweme.effectplatform;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.effectmanager.C43681b;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.C43837h;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43751a;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43752b;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43758h;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43761k;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43762l;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43763m;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43764n;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43766p;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43769s;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.c */
public final class C27473c {

    /* renamed from: b */
    private static final File f72466b = new File(C35574k.m114861b().getFilesDir(), "effect");

    /* renamed from: a */
    public C43837h f72467a;

    /* renamed from: c */
    private boolean f72468c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo70680a(C43834g gVar) {
        this.f72467a = new C43837h();
        this.f72468c = this.f72467a.mo106022a(gVar);
        return this.f72468c;
    }

    /* renamed from: a */
    public final void mo70675a(String str, boolean z, C43757g gVar) {
        C27490k a = C27490k.m90118a(str, gVar);
        if (!this.f72468c) {
            a.mo9274a(m90057d());
        } else {
            this.f72467a.mo106015a(str, z, (C43757g) a);
        }
    }

    /* renamed from: a */
    public final void mo70676a(String str, boolean z, String str2, int i, int i2, C43762l lVar) {
        this.f72467a.mo106026b(str, z, str2, i, i2, lVar);
    }

    /* renamed from: a */
    public final void mo70674a(String str, boolean z, int i, int i2, C43763m mVar) {
        if (!this.f72468c) {
            mVar.mo100795a(m90057d());
        } else {
            this.f72467a.mo106014a(str, z, i, i2, mVar);
        }
    }

    /* renamed from: a */
    public final void mo70668a(String str, String str2, C43751a aVar) {
        this.f72467a.mo106009a(str, str2, aVar);
    }

    /* renamed from: a */
    public final void mo70671a(String str, String str2, boolean z, int i, int i2, int i3, String str3, C43756f fVar) {
        if (!this.f72468c) {
            fVar.mo70686a(m90057d());
            return;
        }
        mo70665a(str, str2, i, i2, i3, str3, z, fVar);
    }

    /* renamed from: a */
    public final void mo70665a(String str, String str2, int i, int i2, int i3, String str3, boolean z, C43756f fVar) {
        final C27488j a = C27488j.m90114a(str, i, i2, fVar);
        if (z) {
            C43837h hVar = this.f72467a;
            final C43756f fVar2 = fVar;
            final String str4 = str;
            final String str5 = str2;
            final int i4 = i;
            final int i5 = i2;
            final int i6 = i3;
            final String str6 = str3;
            C274794 r0 = new C43756f() {
                /* renamed from: a */
                public final void mo70687a(CategoryPageModel categoryPageModel) {
                    fVar2.mo70687a(categoryPageModel);
                }

                /* renamed from: a */
                public final void mo70686a(C43726c cVar) {
                    C27473c.this.f72467a.mo106006a(str4, str5, i4, i5, i6, str6, a);
                }
            };
            hVar.mo106025b(str, str2, i, i2, i3, str3, r0);
            return;
        }
        this.f72467a.mo106006a(str, str2, i, i2, i3, str3, a);
    }

    /* renamed from: a */
    public final void mo70666a(String str, String str2, int i, int i2, C43763m mVar) {
        if (!this.f72468c) {
            mVar.mo100795a(m90057d());
        } else {
            this.f72467a.mo106008a(str, str2, i, i2, false, mVar);
        }
    }

    /* renamed from: a */
    public final void mo70669a(String str, String str2, C43760j jVar) {
        if (!this.f72468c) {
            jVar.mo9281a(null, m90057d());
        } else {
            this.f72467a.mo106013a(str, m90056b(str2), jVar);
        }
    }

    /* renamed from: a */
    public final void mo70678a(List<String> list, Map<String, String> map, boolean z, C43759i iVar) {
        if (!this.f72468c) {
            iVar.mo95925a(m90057d());
        } else {
            this.f72467a.mo106019a(list, z, map, iVar);
        }
    }

    /* renamed from: a */
    public final void mo70677a(List<String> list, Map<String, String> map, C43758h hVar) {
        if (!this.f72468c) {
            hVar.mo101875a(m90057d());
        } else {
            this.f72467a.mo106018a(list, map, hVar);
        }
    }

    /* renamed from: a */
    public final void mo70667a(String str, String str2, int i, int i2, Map<String, String> map, C43769s sVar) {
        if (!this.f72468c) {
            sVar.mo70694a(m90057d());
            return;
        }
        this.f72467a.mo106007a(str, str2, i, i2, map, (C43769s) C27486i.m90110a(str, str2, i, i2, sVar));
    }

    /* renamed from: a */
    public final void mo70670a(String str, String str2, C43770t tVar) {
        if (str != null && str2 != null) {
            if (!this.f72468c) {
                tVar.mo9402a();
            } else {
                this.f72467a.mo106011a(str, str2, tVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo70673a(String str, List<String> list, String str2, C43765o oVar) {
        if (str != null && !C6307b.m19566a((Collection<T>) list)) {
            if (!this.f72468c) {
                oVar.mo9279b();
            } else {
                this.f72467a.mo106010a(str, str2, oVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo70672a(String str, List<String> list, Boolean bool, C43766p pVar) {
        if (!this.f72468c) {
            pVar.mo101169a(m90057d());
        } else {
            this.f72467a.mo106012a(str, list, bool, pVar);
        }
    }

    /* renamed from: a */
    public final boolean mo70679a(Effect effect) {
        if (effect == null || this.f72467a == null) {
            return false;
        }
        return C43681b.m138407b().mo105678a(this.f72467a, effect);
    }

    /* renamed from: a */
    public static String m90054a() {
        return f72466b.getAbsolutePath();
    }

    /* renamed from: b */
    public final void mo70681b() {
        if (this.f72467a != null) {
            this.f72467a.mo106023b();
            this.f72467a = null;
        }
        this.f72468c = false;
    }

    /* renamed from: c */
    public final void mo70684c() {
        if (this.f72468c) {
            this.f72467a.mo105999a();
        }
    }

    /* renamed from: d */
    private static C43726c m90057d() {
        C43726c cVar = new C43726c((Exception) new RuntimeException());
        cVar.f113220a = -1;
        cVar.f113221b = "effect sdk manager init failed";
        return cVar;
    }

    /* renamed from: a */
    public final void mo70660a(String str) {
        if (this.f72468c) {
            this.f72467a.mo106002a(str);
        }
    }

    /* renamed from: b */
    private static Map<String, String> m90056b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scene", str);
        return hashMap;
    }

    /* renamed from: a */
    private void m90055a(String str, C43751a aVar) {
        if (!this.f72468c) {
            aVar.mo9276a(m90057d());
        } else {
            this.f72467a.mo106003a(str, aVar);
        }
    }

    /* renamed from: a */
    public final void mo70658a(Effect effect, C43760j jVar) {
        if (!this.f72468c) {
            jVar.mo9281a(effect, m90057d());
            return;
        }
        StringBuilder sb = new StringBuilder("fetchEffect ");
        sb.append(effect.getName());
        sb.append(" requirements = ");
        sb.append(effect.getRequirements());
        C41530am.m132280a(sb.toString());
        this.f72467a.mo106000a(effect, jVar);
    }

    /* renamed from: a */
    public final void mo70659a(ProviderEffect providerEffect, C43752b bVar) {
        if (!this.f72468c) {
            bVar.mo100799a(providerEffect, m90057d());
        } else {
            this.f72467a.mo106001a(providerEffect, bVar);
        }
    }

    /* renamed from: a */
    public final void mo70661a(String str, C43757g gVar) {
        if (!this.f72468c) {
            gVar.mo9274a(m90057d());
        } else {
            this.f72467a.mo106004a(str, gVar);
        }
    }

    /* renamed from: a */
    public final void mo70662a(String str, C43761k kVar) {
        if (!this.f72468c) {
            kVar.mo101300a(m90057d());
        } else {
            this.f72467a.mo106005a(str, kVar);
        }
    }

    /* renamed from: a */
    public final void mo70663a(String str, C43764n nVar) {
        if (!this.f72468c) {
            nVar.mo100237a(m90057d());
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id_map", str);
        this.f72467a.mo106020a((Map<String, String>) hashMap, nVar);
    }

    /* renamed from: b */
    public final void mo70682b(final String str, final boolean z, final C43757g gVar) {
        if (!this.f72468c) {
            gVar.mo9274a(m90057d());
        } else {
            m90055a(str, (C43751a) new C43751a() {
                /* renamed from: a */
                public final void mo9277a(boolean z) {
                    if (z) {
                        C27473c.this.mo70675a(str, z, gVar);
                    } else {
                        C27473c.this.mo70661a(str, (C43757g) new C43757g() {
                            /* renamed from: a */
                            public final void mo9274a(C43726c cVar) {
                                StringBuilder sb = new StringBuilder("fetchListFromCache fail : ");
                                sb.append(cVar.toString());
                                C6921a.m21562b("EffectPlatform", sb.toString());
                                C27473c.this.mo70675a(str, z, gVar);
                            }

                            /* renamed from: a */
                            public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                                if (effectChannelResponse.allCategoryEffects.size() == 0) {
                                    C27473c.this.mo70675a(str, z, gVar);
                                } else {
                                    gVar.mo9275a(effectChannelResponse);
                                }
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo9276a(C43726c cVar) {
                    StringBuilder sb = new StringBuilder("checkChannel fail : ");
                    sb.append(cVar.toString());
                    C6921a.m21562b("EffectPlatform", sb.toString());
                    C27473c.this.mo70661a(str, (C43757g) new C43757g() {
                        /* renamed from: a */
                        public final void mo9274a(C43726c cVar) {
                            StringBuilder sb = new StringBuilder("fetchListFromCache fail : ");
                            sb.append(cVar.toString());
                            C6921a.m21562b("EffectPlatform", sb.toString());
                            C27473c.this.mo70675a(str, z, gVar);
                        }

                        /* renamed from: a */
                        public final void mo9275a(EffectChannelResponse effectChannelResponse) {
                            if (effectChannelResponse.allCategoryEffects.size() == 0) {
                                C27473c.this.mo70675a(str, z, gVar);
                            } else {
                                gVar.mo9275a(effectChannelResponse);
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo70685c(String str, boolean z, String str2, int i, int i2, C43762l lVar) {
        if (!this.f72468c) {
            lVar.mo70697a(m90057d());
            return;
        }
        final C43762l lVar2 = lVar;
        C43837h hVar = this.f72467a;
        final String str3 = str;
        final boolean z2 = z;
        final String str4 = str2;
        final int i3 = i;
        final int i4 = i2;
        C274741 r0 = new C43751a() {
            /* renamed from: a */
            public final void mo9276a(C43726c cVar) {
                C27473c.this.mo70676a(str3, z2, str4, i3, i4, lVar2);
            }

            /* renamed from: a */
            public final void mo9277a(boolean z) {
                if (z) {
                    C27473c.this.mo70683b(str3, z2, str4, i3, i4, lVar2);
                } else {
                    C27473c.this.mo70676a(str3, z2, str4, i3, i4, lVar2);
                }
            }
        };
        String str5 = str;
        hVar.mo106024b(str, r0);
    }

    /* renamed from: b */
    public final void mo70683b(String str, boolean z, String str2, int i, int i2, C43762l lVar) {
        this.f72467a.mo106016a(str, z, str2, i, i2, (C43762l) C27493n.m90130a(str, lVar));
    }

    /* renamed from: a */
    public final void mo70664a(String str, String str2, int i, int i2, int i3, String str3, C43756f fVar) {
        if (!this.f72468c) {
            fVar.mo70686a(m90057d());
            return;
        }
        final C43756f fVar2 = fVar;
        C43837h hVar = this.f72467a;
        final String str4 = str;
        final String str5 = str2;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final String str6 = str3;
        C274752 r0 = new C43751a() {
            /* renamed from: a */
            public final void mo9276a(C43726c cVar) {
                C27473c.this.mo70665a(str4, str5, i4, i5, i6, str6, true, fVar2);
            }

            /* renamed from: a */
            public final void mo9277a(boolean z) {
                if (z) {
                    C27473c.this.mo70665a(str4, str5, i4, i5, i6, str6, false, fVar2);
                    return;
                }
                C27473c.this.mo70665a(str4, str5, i4, i5, i6, str6, true, fVar2);
            }
        };
        String str7 = str;
        String str8 = str2;
        hVar.mo106009a(str, str2, (C43751a) r0);
    }
}
