package com.p280ss.android.ugc.aweme.tools.beauty;

import android.arch.lifecycle.C0053p;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategory;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.C23540j;
import com.p280ss.android.ugc.aweme.beauty.C23542k;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.f */
public final class C42182f {

    /* renamed from: a */
    public static final C42182f f109746a = new C42182f();

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.f$a */
    static final class C42183a extends Lambda implements C7562b<ComposerBeauty, C7581n> {

        /* renamed from: a */
        public static final C42183a f109747a = new C42183a();

        C42183a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m134207a((ComposerBeauty) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public static void m134207a(ComposerBeauty composerBeauty) {
            boolean z;
            C7573i.m23587b(composerBeauty, "$this$convertValue");
            if (C42182f.m134204a(composerBeauty)) {
                List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                Collection collection = items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    items = null;
                }
                if (items != null) {
                    for (ItemsBean itemsBean : items) {
                        int a = C42194c.f109764a.mo103637b(composerBeauty, itemsBean.getTag(), -1);
                        int a2 = C23540j.m77314a(itemsBean.getTag());
                        if (a == -1 && a2 != -1) {
                            C42194c.f109764a.mo103635a(composerBeauty, itemsBean.getTag(), a2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.f$b */
    static final class C42184b<T> implements C0053p<Map<BeautyCategory, List<? extends ComposerBeauty>>> {

        /* renamed from: a */
        public static final C42184b f109748a = new C42184b();

        C42184b() {
        }

        public final /* synthetic */ void onChanged(Object obj) {
            m134208a((Map) obj);
        }

        /* renamed from: a */
        private static void m134208a(Map<BeautyCategory, List<ComposerBeauty>> map) {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    C42182f.m134205b((List) entry.getValue());
                    C42182f.m134203a((List) entry.getValue());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.f$c */
    static final class C42185c extends Lambda implements C7562b<ComposerBeauty, C7581n> {

        /* renamed from: a */
        public static final C42185c f109749a = new C42185c();

        C42185c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m134209a((ComposerBeauty) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public static void m134209a(ComposerBeauty composerBeauty) {
            boolean z;
            C7573i.m23587b(composerBeauty, "$this$convert");
            if (C42182f.m134204a(composerBeauty)) {
                List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                Collection collection = items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    items = null;
                }
                if (items != null) {
                    for (ItemsBean itemsBean : items) {
                        List b = C7634n.m23768b(itemsBean.getTag(), new String[]{"_"}, false, 0);
                        if (!(!b.isEmpty())) {
                            b = null;
                        }
                        if (b != null) {
                            C42182f.f109746a.mo103627a(composerBeauty, itemsBean, (String) b.get(0));
                        }
                    }
                }
            }
        }
    }

    private C42182f() {
    }

    /* renamed from: a */
    public static void m134202a(AppCompatActivity appCompatActivity) {
        C7573i.m23587b(appCompatActivity, "activity");
        if (C23536f.m77298a()) {
            C42212g.m134292a().mo104730a(appCompatActivity, C42184b.f109748a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m134204a(com.p280ss.android.ugc.aweme.beauty.ComposerBeauty r3) {
        /*
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.getEffect()
            java.lang.String r0 = r0.getUnzipPath()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            if (r0 != 0) goto L_0x0034
            com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify r0 = r3.getBeautifyExtra()
            java.util.List r0 = r0.getItems()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r0 = 0
            goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            if (r0 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x003c
            return r2
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.beauty.C42182f.m134204a(com.ss.android.ugc.aweme.beauty.ComposerBeauty):boolean");
    }

    /* renamed from: a */
    private static float m134201a(C23542k kVar) {
        C7573i.m23587b(kVar, "data");
        if (!kVar.f62125a) {
            return ((float) (kVar.f62129e * kVar.f62132h)) / 100.0f;
        }
        if (((float) kVar.f62132h) >= ((float) kVar.f62126b) / 2.0f) {
            return (((((float) kVar.f62132h) - (((float) kVar.f62126b) / 2.0f)) * 2.0f) * ((float) kVar.f62129e)) / 100.0f;
        }
        return ((((((float) kVar.f62126b) / 2.0f) - ((float) kVar.f62132h)) * 2.0f) * ((float) kVar.f62130f)) / 100.0f;
    }

    /* renamed from: b */
    public static void m134205b(List<ComposerBeauty> list) {
        Object obj;
        if (!C6399b.m19946v()) {
            for (ComposerBeauty composerBeauty : list) {
                if (composerBeauty.isCollectionType()) {
                    List childList = composerBeauty.getChildList();
                    if (childList != null) {
                        Iterator it = childList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((ComposerBeauty) obj).getExtra().getDefault()) {
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                        if (composerBeauty2 != null) {
                            C42185c.m134209a(composerBeauty2);
                        }
                    }
                } else {
                    C42185c.m134209a(composerBeauty);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m134203a(List<ComposerBeauty> list) {
        Object obj;
        for (ComposerBeauty composerBeauty : list) {
            boolean isCollectionType = composerBeauty.isCollectionType();
            if (isCollectionType) {
                List childList = composerBeauty.getChildList();
                if (childList != null) {
                    Iterator it = childList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((ComposerBeauty) obj).getExtra().getDefault()) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                    if (composerBeauty2 != null) {
                        C42183a.m134207a(composerBeauty2);
                    }
                }
            } else if (!isCollectionType) {
                C42183a.m134207a(composerBeauty);
            }
        }
    }

    /* renamed from: a */
    public final void mo103627a(ComposerBeauty composerBeauty, ItemsBean itemsBean, String str) {
        int i;
        int b;
        AVSettings f = C35574k.m114859a().mo70091f();
        int a = C42194c.f109764a.mo103637b(composerBeauty, itemsBean.getTag(), -1);
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C7573i.m23582a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            String lowerCase2 = "Smooth".toLowerCase();
            C7573i.m23582a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
            if (C7573i.m23585a((Object) lowerCase, (Object) lowerCase2)) {
                b = f.mo93343b(Property.UserSmoothSkinLevel);
            } else {
                String lowerCase3 = "Eye".toLowerCase();
                C7573i.m23582a((Object) lowerCase3, "(this as java.lang.String).toLowerCase()");
                if (C7573i.m23585a((Object) lowerCase, (Object) lowerCase3)) {
                    b = f.mo93343b(Property.UserBigEyeLevel);
                } else {
                    String lowerCase4 = "Face".toLowerCase();
                    C7573i.m23582a((Object) lowerCase4, "(this as java.lang.String).toLowerCase()");
                    if (C7573i.m23585a((Object) lowerCase, (Object) lowerCase4)) {
                        b = f.mo93343b(Property.UserShapeLevel);
                    } else {
                        String lowerCase5 = "Lips".toLowerCase();
                        C7573i.m23582a((Object) lowerCase5, "(this as java.lang.String).toLowerCase()");
                        if (C7573i.m23585a((Object) lowerCase, (Object) lowerCase5)) {
                            b = f.mo93343b(Property.UserLipLevel);
                        } else {
                            String lowerCase6 = "Blusher".toLowerCase();
                            C7573i.m23582a((Object) lowerCase6, "(this as java.lang.String).toLowerCase()");
                            if (C7573i.m23585a((Object) lowerCase, (Object) lowerCase6)) {
                                b = f.mo93343b(Property.UserBlushLevel);
                            } else {
                                i = -1;
                                if (a == -1 && i != -1) {
                                    C23542k kVar = new C23542k(itemsBean.getDoubleDirectionin(), 100, 0, 0, itemsBean.getMax(), itemsBean.getMin(), 0, i, 76, null);
                                    ComposerBeauty composerBeauty2 = composerBeauty;
                                    C42194c.f109764a.mo103635a(composerBeauty2, itemsBean.getTag(), (int) m134201a(kVar));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
            i = b;
            if (a == -1) {
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
