package com.p280ss.android.ugc.aweme.tools.beauty.manager;

import com.bytedance.keva.Keva;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.beauty.BeautifyInfo;
import com.p280ss.android.ugc.aweme.beauty.BeautifyTag;
import com.p280ss.android.ugc.aweme.beauty.C23534e;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.tools.beauty.C42188h;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.f */
public final class C42209f {

    /* renamed from: a */
    public static final C42209f f109793a = new C42209f();

    /* renamed from: b */
    private static final Keva f109794b;

    /* renamed from: c */
    private static ArrayList<C23534e> f109795c = new ArrayList<>();

    /* renamed from: d */
    private static boolean f109796d;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.f$a */
    public static final class C42210a extends C6597a<List<C23534e>> {
        C42210a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.f$b */
    static final class C42211b<T> implements Comparator<ComposerBeauty> {

        /* renamed from: a */
        public static final C42211b f109797a = new C42211b();

        C42211b() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m134285a((ComposerBeauty) obj, (ComposerBeauty) obj2);
        }

        /* renamed from: a */
        private static int m134285a(ComposerBeauty composerBeauty, ComposerBeauty composerBeauty2) {
            ArrayList a = C42209f.m134277a();
            String effectId = composerBeauty.getEffect().getEffectId();
            C7573i.m23582a((Object) effectId, "o1.effect.effectId");
            int indexOf = a.indexOf(new C23534e(effectId, 0, 2, null));
            ArrayList a2 = C42209f.m134277a();
            String effectId2 = composerBeauty2.getEffect().getEffectId();
            C7573i.m23582a((Object) effectId2, "o2.effect.effectId");
            return indexOf - a2.indexOf(new C23534e(effectId2, 0, 2, null));
        }
    }

    private C42209f() {
    }

    /* renamed from: a */
    public static ArrayList<C23534e> m134277a() {
        return f109795c;
    }

    static {
        Keva repo = Keva.getRepo("ulike_repo");
        C7573i.m23582a((Object) repo, "Keva.getRepo(KEVA_ULIKE_REPO)");
        f109794b = repo;
    }

    /* renamed from: c */
    private static void m134282c() {
        Keva keva = f109794b;
        StringBuilder sb = new StringBuilder();
        sb.append(C42212g.m134316c().f62108a.getFlag());
        sb.append("_key_beauty_sequence");
        keva.storeString(sb.toString(), C35574k.m114859a().mo70085S().mo15979b((Object) f109795c));
    }

    /* renamed from: d */
    private static List<C23534e> m134283d() {
        Keva keva = f109794b;
        StringBuilder sb = new StringBuilder();
        sb.append(C42212g.m134316c().f62108a.getFlag());
        sb.append("_key_beauty_sequence");
        try {
            return (List) C35574k.m114859a().mo70085S().mo15975a(keva.getString(sb.toString(), null), new C42210a().type);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static ComposerBeautyBuriedInfo m134280b() {
        int i;
        if (!C23536f.m77298a()) {
            ComposerBeautyBuriedInfo composerBeautyBuriedInfo = new ComposerBeautyBuriedInfo(0, 0, null, 4, null);
            return composerBeautyBuriedInfo;
        }
        Iterable a = C42226h.m134340a((Map) C42212g.m134292a().getValue());
        Collection arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ComposerBeauty composerBeauty = (ComposerBeauty) next;
            ArrayList<C23534e> arrayList2 = f109795c;
            String effectId = composerBeauty.getEffect().getEffectId();
            C7573i.m23582a((Object) effectId, "it.effect.effectId");
            if (arrayList2.contains(new C23534e(effectId, 0, 2, null))) {
                arrayList.add(next);
            }
        }
        Iterable<ComposerBeauty> iterable = (List) arrayList;
        Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable, 10));
        for (ComposerBeauty composerBeauty2 : iterable) {
            ArrayList arrayList4 = new ArrayList();
            if (!C42226h.m134341a(composerBeauty2) && (composerBeauty2.getExtra().getDisableCache() || composerBeauty2.getAdd2Nodes().f62103a)) {
                List<ItemsBean> items = composerBeauty2.getBeautifyExtra().getItems();
                if (items != null) {
                    for (ItemsBean itemsBean : items) {
                        arrayList4.add(new BeautifyTag(itemsBean.getTag(), C42188h.m134212a(composerBeauty2)));
                        if (C42194c.f109764a.mo103637b(composerBeauty2, itemsBean.getTag(), itemsBean.getValue()) != itemsBean.getValue()) {
                            i = 1;
                        }
                    }
                }
            }
            String effectId2 = composerBeauty2.getEffect().getEffectId();
            C7573i.m23582a((Object) effectId2, "composerBeauty.effect.effectId");
            arrayList3.add(new BeautifyInfo(effectId2, arrayList4));
        }
        return new ComposerBeautyBuriedInfo(i, C23536f.m77298a() ? 1 : 0, (List) arrayList3);
    }

    /* renamed from: a */
    public static void m134278a(C23534e eVar) {
        C7573i.m23587b(eVar, "beautySequence");
        if (f109796d) {
            ArrayList<C23534e> arrayList = f109795c;
            if (arrayList.contains(eVar)) {
                arrayList.remove(eVar);
            }
            arrayList.add(eVar);
            m134282c();
        }
    }

    /* renamed from: b */
    public static void m134281b(C23534e eVar) {
        C7573i.m23587b(eVar, "beautySequence");
        if (f109796d) {
            f109795c.remove(eVar);
            m134282c();
        }
    }

    /* renamed from: a */
    public final void mo103647a(boolean z) {
        f109796d = z;
        f109795c.clear();
        if (z) {
            List d = m134283d();
            if (d != null) {
                f109795c.addAll(d);
            }
        }
    }

    /* renamed from: a */
    public static void m134279a(List<ComposerBeauty> list) {
        Object obj;
        Object obj2;
        Object obj3;
        List<ComposerBeauty> list2 = list;
        C7573i.m23587b(list2, "list");
        C7525m.m23474a(list2, C42211b.f109797a);
        Iterator it = list.iterator();
        while (true) {
            Object obj4 = null;
            if (!it.hasNext()) {
                break;
            }
            ComposerBeauty composerBeauty = (ComposerBeauty) it.next();
            if (C42226h.m134341a(composerBeauty)) {
                Iterator it2 = f109795c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (C7573i.m23585a((Object) composerBeauty.getEffect().getEffectId(), (Object) ((C23534e) next).f62116a)) {
                        obj4 = next;
                        break;
                    }
                }
                if (((C23534e) obj4) == null) {
                    it.remove();
                }
            }
        }
        int indexOf = f109795c.indexOf(new C23534e("EFFECT_ID_TYPE_FILTER", 2));
        if (indexOf >= 0 && indexOf < f109795c.size()) {
            Effect effect = new Effect();
            ComposerBeautyExtra composerBeautyExtra = new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, false, false, 524287, null);
            ComposerBeauty composerBeauty2 = new ComposerBeauty(effect, composerBeautyExtra, new ComposerBeautyExtraBeautify(null, null, 3, null), null, null, null, false, null, false, false, 0, false, 4088, null);
            composerBeauty2.getEffect().setEffectId("EFFECT_ID_TYPE_FILTER");
            if (indexOf == f109795c.size() - 1) {
                list2.add(composerBeauty2);
                return;
            }
            boolean z = false;
            if (indexOf == 0) {
                int size = f109795c.size();
                boolean z2 = false;
                for (int i = 1; i < size && !z2; i++) {
                    Object obj5 = f109795c.get(i);
                    C7573i.m23582a(obj5, "beautyApplySequence[afterIndex]");
                    C23534e eVar = (C23534e) obj5;
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        if (C7573i.m23585a((Object) ((ComposerBeauty) obj3).getEffect().getEffectId(), (Object) eVar.f62116a)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty3 = (ComposerBeauty) obj3;
                    if (composerBeauty3 != null) {
                        list2.add(list2.indexOf(composerBeauty3), composerBeauty2);
                        z2 = true;
                    }
                }
                if (!z2) {
                    list2.add(composerBeauty2);
                }
            } else {
                for (int i2 = indexOf - 1; i2 <= 0 && !z; i2++) {
                    Object obj6 = f109795c.get(i2);
                    C7573i.m23582a(obj6, "beautyApplySequence[beforeIndex]");
                    C23534e eVar2 = (C23534e) obj6;
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it4.next();
                        if (C7573i.m23585a((Object) ((ComposerBeauty) obj2).getEffect().getEffectId(), (Object) eVar2.f62116a)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty4 = (ComposerBeauty) obj2;
                    if (composerBeauty4 != null) {
                        list2.add(list2.indexOf(composerBeauty4) + 1, composerBeauty2);
                        z = true;
                    }
                }
                if (!z) {
                    int size2 = f109795c.size();
                    for (int i3 = indexOf + 1; i3 < size2 && !z; i3++) {
                        Object obj7 = f109795c.get(i3);
                        C7573i.m23582a(obj7, "beautyApplySequence[afterIndex]");
                        C23534e eVar3 = (C23534e) obj7;
                        Iterator it5 = list2.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it5.next();
                            if (C7573i.m23585a((Object) ((ComposerBeauty) obj).getEffect().getEffectId(), (Object) eVar3.f62116a)) {
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty5 = (ComposerBeauty) obj;
                        if (composerBeauty5 != null) {
                            list2.add(list2.indexOf(composerBeauty5), composerBeauty2);
                            z = true;
                        }
                    }
                    if (!z) {
                        list2.add(composerBeauty2);
                    }
                }
            }
        }
    }
}
