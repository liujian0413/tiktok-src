package com.p280ss.android.ugc.aweme.tools.beauty.manager;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.keva.Keva;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategory;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41902b;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48080as;
import kotlinx.coroutines.C48143e;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.c */
public final class C42194c {

    /* renamed from: a */
    public static final C42194c f109764a = new C42194c();

    /* renamed from: b */
    private static final Keva f109765b;

    /* renamed from: c */
    private static final HashMap<String, String> f109766c = new HashMap<>();

    /* renamed from: d */
    private static final HashMap<String, List<String>> f109767d = new HashMap<>();

    /* renamed from: e */
    private static final HashMap<String, String> f109768e = new HashMap<>();

    @C7540d(mo19421b = "BeautyFileManager.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautyFileManager$getAllCategoryList$2")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.c$a */
    static final class C42195a extends SuspendLambda implements C7563m<C48056ad, C47919b<? super List<Effect>>, Object> {

        /* renamed from: a */
        int f109769a;

        /* renamed from: b */
        private C48056ad f109770b;

        C42195a(C47919b bVar) {
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42195a aVar = new C42195a(bVar);
            aVar.f109770b = (C48056ad) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42195a) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f109769a == 0) {
                try {
                    return (List) C35574k.m114859a().mo70085S().mo15975a(C42194c.m134236a().getString("key_all_category_list", null), new C6597a<List<? extends Effect>>() {
                    }.type);
                } catch (Throwable unused) {
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @C7540d(mo19421b = "BeautyFileManager.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautyFileManager$getCategoryResponseList$2")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.c$b */
    static final class C42197b extends SuspendLambda implements C7563m<C48056ad, C47919b<? super List<EffectCategoryResponse>>, Object> {

        /* renamed from: a */
        int f109771a;

        /* renamed from: b */
        private C48056ad f109772b;

        C42197b(C47919b bVar) {
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42197b bVar2 = new C42197b(bVar);
            bVar2.f109772b = (C48056ad) obj;
            return bVar2;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42197b) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f109771a == 0) {
                try {
                    return (List) C35574k.m114859a().mo70085S().mo15975a(C42194c.m134236a().getString("key_category_response_list", null), new C6597a<List<EffectCategoryResponse>>() {
                    }.type);
                } catch (Throwable unused) {
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @C7540d(mo19421b = "BeautyFileManager.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautyFileManager$saveAllCategoryList$2")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.c$c */
    static final class C42199c extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        int f109773a;

        /* renamed from: b */
        final /* synthetic */ List f109774b;

        /* renamed from: c */
        private C48056ad f109775c;

        C42199c(List list, C47919b bVar) {
            this.f109774b = list;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42199c cVar = new C42199c(this.f109774b, bVar);
            cVar.f109775c = (C48056ad) obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42199c) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f109773a == 0) {
                C42194c.m134236a().storeString("key_all_category_list", C35574k.m114859a().mo70085S().mo15979b((Object) this.f109774b));
                return C7581n.f20898a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C7540d(mo19421b = "BeautyFileManager.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautyFileManager$saveCategoryResponseList$2")
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.manager.c$d */
    static final class C42200d extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        int f109776a;

        /* renamed from: b */
        final /* synthetic */ List f109777b;

        /* renamed from: c */
        private C48056ad f109778c;

        C42200d(List list, C47919b bVar) {
            this.f109777b = list;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C42200d dVar = new C42200d(this.f109777b, bVar);
            dVar.f109778c = (C48056ad) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C42200d) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f109776a == 0) {
                C42194c.m134236a().storeString("key_category_response_list", C35574k.m114859a().mo70085S().mo15979b((Object) this.f109777b));
                return C7581n.f20898a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private C42194c() {
    }

    /* renamed from: a */
    public static Keva m134236a() {
        return f109765b;
    }

    /* renamed from: c */
    public static int m134245c() {
        return f109765b.getInt("key_detect_female_count", 0);
    }

    /* renamed from: d */
    public static void m134246d() {
        f109766c.clear();
        f109767d.clear();
        f109768e.clear();
    }

    /* renamed from: e */
    private static String m134247e() {
        StringBuilder sb = new StringBuilder();
        sb.append(C42212g.m134316c().f62108a.getFlag());
        sb.append("_key_selected_category");
        return sb.toString();
    }

    static {
        Keva repo = Keva.getRepo("ulike_repo");
        C7573i.m23582a((Object) repo, "Keva.getRepo(KEVA_ULIKE_REPO)");
        f109765b = repo;
    }

    /* renamed from: b */
    public final String mo103638b() {
        return f109765b.getString(m134247e(), null);
    }

    /* renamed from: a */
    public static void m134240a(int i) {
        f109765b.storeInt("key_detect_female_count", i);
    }

    /* renamed from: f */
    private static String m134250f(String str) {
        if (C41902b.m133264a((Object) str)) {
            return str;
        }
        return "";
    }

    /* renamed from: g */
    private final void m134251g(ComposerBeauty composerBeauty) {
        Map map = f109766c;
        String f = m134249f(composerBeauty);
        String effectId = composerBeauty.getEffect().getEffectId();
        C7573i.m23582a((Object) effectId, "effect.effectId");
        map.put(f, effectId);
    }

    /* renamed from: d */
    public final List<String> mo103643d(String str) {
        return (List) f109767d.get(m134250f(str));
    }

    /* renamed from: a */
    public static Object m134238a(C47919b<? super List<EffectCategoryResponse>> bVar) {
        return C48143e.m149376a(C48080as.m149073c(), new C42197b(null), bVar);
    }

    /* renamed from: b */
    public static Object m134243b(C47919b<? super List<Effect>> bVar) {
        return C48143e.m149376a(C48080as.m149073c(), new C42195a(null), bVar);
    }

    /* renamed from: e */
    private static String m134248e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C42212g.m134316c().f62108a.getFlag());
        sb.append("_key_selected_beauty_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: f */
    private static String m134249f(ComposerBeauty composerBeauty) {
        String str;
        StringBuilder sb = new StringBuilder();
        BeautyCategory category = composerBeauty.getCategory();
        if (category != null) {
            EffectCategoryResponse categoryResponse = category.getCategoryResponse();
            if (categoryResponse != null) {
                str = categoryResponse.f113500id;
                sb.append(str);
                sb.append('_');
                sb.append(composerBeauty.getParentId());
                return sb.toString();
            }
        }
        str = null;
        sb.append(str);
        sb.append('_');
        sb.append(composerBeauty.getParentId());
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo103641c(String str) {
        boolean z;
        String str2 = (String) f109768e.get(m134250f(str));
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mo103639b(str);
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m134252h(com.p280ss.android.ugc.aweme.beauty.ComposerBeauty r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.beauty.BeautyCategory r0 = r4.getCategory()
            if (r0 == 0) goto L_0x000f
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse r0 = r0.getCategoryResponse()
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.f113500id
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.lang.String r0 = m134250f(r0)
            boolean r1 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42226h.m134344d(r4)
            if (r1 == 0) goto L_0x002f
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f109768e
            java.util.Map r1 = (java.util.Map) r1
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.getEffect()
            java.lang.String r4 = r4.getEffectId()
            java.lang.String r2 = "effect.effectId"
            kotlin.jvm.internal.C7573i.m23582a(r4, r2)
            r1.put(r0, r4)
            return
        L_0x002f:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1 = f109767d
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = com.p280ss.android.ugc.aweme.storage.p1640b.C41902b.m133264a(r1)
            if (r2 == 0) goto L_0x0059
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r4.getEffect()
            java.lang.String r2 = r2.getEffectId()
            r1.remove(r2)
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.getEffect()
            java.lang.String r4 = r4.getEffectId()
            java.lang.String r2 = "effect.effectId"
            kotlin.jvm.internal.C7573i.m23582a(r4, r2)
            r1.add(r4)
            goto L_0x0070
        L_0x0059:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = r4.getEffect()
            java.lang.String r4 = r4.getEffectId()
            java.lang.String r2 = "effect.effectId"
            kotlin.jvm.internal.C7573i.m23582a(r4, r2)
            r1.add(r4)
        L_0x0070:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r4 = f109767d
            java.util.Map r4 = (java.util.Map) r4
            r4.put(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c.m134252h(com.ss.android.ugc.aweme.beauty.ComposerBeauty):void");
    }

    /* renamed from: c */
    public final void mo103642c(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "$this$saveSelectedBeauty");
        m134252h(composerBeauty);
        String str = null;
        if (composerBeauty.getExtra().getDisableCache()) {
            Keva keva = f109765b;
            BeautyCategory category = composerBeauty.getCategory();
            if (category != null) {
                EffectCategoryResponse categoryResponse = category.getCategoryResponse();
                if (categoryResponse != null) {
                    str = categoryResponse.f113500id;
                }
            }
            keva.storeString(m134248e(str), "-1");
            return;
        }
        Keva keva2 = f109765b;
        BeautyCategory category2 = composerBeauty.getCategory();
        if (category2 != null) {
            EffectCategoryResponse categoryResponse2 = category2.getCategoryResponse();
            if (categoryResponse2 != null) {
                str = categoryResponse2.f113500id;
            }
        }
        keva2.storeString(m134248e(str), composerBeauty.getEffect().getEffectId());
    }

    /* renamed from: d */
    public final void mo103644d(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "$this$saveSelectedAlbum");
        m134251g(composerBeauty);
        String str = null;
        if (composerBeauty.getExtra().getDisableCache()) {
            Keva keva = f109765b;
            BeautyCategory category = composerBeauty.getCategory();
            if (category != null) {
                EffectCategoryResponse categoryResponse = category.getCategoryResponse();
                if (categoryResponse != null) {
                    str = categoryResponse.f113500id;
                }
            }
            keva.storeString(m134244b(str, composerBeauty.getParentId()), "-1");
            return;
        }
        Keva keva2 = f109765b;
        BeautyCategory category2 = composerBeauty.getCategory();
        if (category2 != null) {
            EffectCategoryResponse categoryResponse2 = category2.getCategoryResponse();
            if (categoryResponse2 != null) {
                str = categoryResponse2.f113500id;
            }
        }
        keva2.storeString(m134244b(str, composerBeauty.getParentId()), composerBeauty.getEffect().getEffectId());
    }

    /* renamed from: e */
    public final String mo103645e(ComposerBeauty composerBeauty) {
        boolean z;
        C7573i.m23587b(composerBeauty, "$this$getTempSelectedAlbum");
        String str = null;
        if (!composerBeauty.isCollectionType()) {
            return null;
        }
        String str2 = (String) f109766c.get(m134249f(composerBeauty));
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            BeautyCategory category = composerBeauty.getCategory();
            if (category != null) {
                EffectCategoryResponse categoryResponse = category.getCategoryResponse();
                if (categoryResponse != null) {
                    str = categoryResponse.f113500id;
                }
            }
            str2 = mo103634a(str, composerBeauty.getEffect().getEffectId());
        }
        return str2;
    }

    /* renamed from: a */
    public static boolean m134241a(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "beautyBean");
        File file = new File(composerBeauty.getEffect().getUnzipPath());
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            C7573i.m23582a((Object) listFiles, "listFiles()");
            for (File file2 : listFiles) {
                CharSequence charSequence = FilterModel.CONFIG_FILE;
                C7573i.m23582a((Object) file2, "it");
                if (TextUtils.equals(charSequence, file2.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final String mo103639b(String str) {
        return f109765b.getString(m134248e(str), null);
    }

    /* renamed from: b */
    public final void mo103640b(ComposerBeauty composerBeauty) {
        C7573i.m23587b(composerBeauty, "beautyBean");
        if (!m134241a(composerBeauty)) {
            Effect effect = composerBeauty.getEffect();
            File file = new File(effect.getZipPath());
            File file2 = new File(effect.getUnzipPath());
            try {
                C7276d.m22822e(effect.getUnzipPath());
                C43136fo.m136824a(file, file2);
            } catch (IOException e) {
                C41530am.m132283b(Log.getStackTraceString(e));
            } finally {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    public final void mo103636a(String str) {
        f109765b.storeString(m134247e(), str);
    }

    /* renamed from: a */
    public static Object m134237a(List<? extends EffectCategoryResponse> list, C47919b<? super C7581n> bVar) {
        return C48143e.m149376a(C48080as.m149073c(), new C42200d(list, null), bVar);
    }

    /* renamed from: b */
    public static Object m134242b(List<? extends Effect> list, C47919b<? super C7581n> bVar) {
        return C48143e.m149376a(C48080as.m149073c(), new C42199c(list, null), bVar);
    }

    /* renamed from: a */
    private static String m134239a(ComposerBeauty composerBeauty, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(C42212g.m134316c().f62108a.getFlag());
        sb.append("_composer_beauty_manual_");
        BeautyCategory category = composerBeauty.getCategory();
        if (category != null) {
            EffectCategoryResponse categoryResponse = category.getCategoryResponse();
            if (categoryResponse != null) {
                str2 = categoryResponse.f113500id;
                sb.append(str2);
                sb.append('_');
                sb.append(composerBeauty.getParentId());
                sb.append('_');
                sb.append(composerBeauty.getEffect().getEffectId());
                sb.append('_');
                sb.append(str);
                return sb.toString();
            }
        }
        str2 = null;
        sb.append(str2);
        sb.append('_');
        sb.append(composerBeauty.getParentId());
        sb.append('_');
        sb.append(composerBeauty.getEffect().getEffectId());
        sb.append('_');
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    private static String m134244b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C42212g.m134316c().f62108a.getFlag());
        sb.append("_key_selected_album_");
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo103634a(String str, String str2) {
        return f109765b.getString(m134244b(str, str2), null);
    }

    /* renamed from: b */
    public final int mo103637b(ComposerBeauty composerBeauty, String str, int i) {
        C7573i.m23587b(composerBeauty, "$this$getComposerBeautyTagValue");
        return f109765b.getInt(m134239a(composerBeauty, str), i);
    }

    /* renamed from: a */
    public final void mo103635a(ComposerBeauty composerBeauty, String str, int i) {
        C7573i.m23587b(composerBeauty, "$this$saveComposerBeautyTagValue");
        f109765b.storeInt(m134239a(composerBeauty, str), i);
    }
}
