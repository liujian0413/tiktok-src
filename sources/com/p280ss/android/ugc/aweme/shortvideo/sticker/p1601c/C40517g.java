package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.keva.Keva;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.effectmanager.common.exception.UnzipException;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p280ss.android.ugc.effectmanager.effect.model.ResourceListModel.ResourceListBean;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47973b;
import kotlin.text.C48038d;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c.g */
public final class C40517g {

    /* renamed from: a */
    public static final C40517g f105289a = new C40517g();

    private C40517g() {
    }

    /* renamed from: a */
    public static final void m129528a(C40506c cVar) {
        C7573i.m23587b(cVar, "resourceBean");
        String b = m129532b(cVar);
        try {
            C43733e.m138598b(b, m129539d(cVar));
        } catch (UnzipException unused) {
            C43733e.m138603e(m129539d(cVar));
        }
        C43733e.m138599b(b);
    }

    /* renamed from: a */
    public static final void m129530a(String str, String str2, List<StickerWrapper> list, StickerWrapper stickerWrapper) {
        Throwable th;
        C7573i.m23587b(str, "id");
        C7573i.m23587b(str2, "dir");
        C7573i.m23587b(list, "wrapperList");
        if (stickerWrapper != null) {
            Effect effect = stickerWrapper.f104908a;
            C7573i.m23582a((Object) effect, "wrapper.effect");
            String a = m129523a(effect, str2);
            C6600e S = C35574k.m114859a().mo70085S();
            Closeable outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(a)), C48038d.f122880a);
            String[] strArr = null;
            try {
                S.mo15977a((Object) stickerWrapper.f104908a, (Appendable) (OutputStreamWriter) outputStreamWriter);
                C47973b.m148917a(outputStreamWriter, null);
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList();
                List<Effect> a2 = StickerWrapper.m129068a(list);
                C7573i.m23582a((Object) a2, "StickerWrapper.covertData(wrapperList)");
                for (Effect effect2 : a2) {
                    arrayList.add(m129523a(effect2, str2));
                    String extra = effect2.getExtra();
                    C7573i.m23582a((Object) extra, "it.extra");
                    arrayList2.add(extra);
                }
                StringBuilder sb = new StringBuilder("memoji: save effect composer: ");
                Effect effect3 = stickerWrapper.f104908a;
                C7573i.m23582a((Object) effect3, "wrapper.effect");
                List composerPath = effect3.getComposerPath();
                if (composerPath != null) {
                    Object[] array = composerPath.toArray(new String[0]);
                    if (array != null) {
                        strArr = (String[]) array;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                sb.append(Arrays.toString(strArr));
                C41530am.m132280a(sb.toString());
                C6893q.m21447a("tools_memoji_json", C38510bb.m123095a().mo96481a("values", C35574k.m114859a().mo70085S().mo15979b((Object) arrayList2)).mo96482b());
                m129529a(str, C7525m.m23492a(arrayList, "#######", null, null, 0, null, null, 62, null));
            } catch (Throwable th2) {
                C47973b.m148917a(outputStreamWriter, th);
                throw th2;
            }
        }
    }

    /* renamed from: a */
    private final void m129527a(StickerWrapper stickerWrapper, List<StickerWrapper> list, String str) {
        if (stickerWrapper != null) {
            HashSet hashSet = new HashSet();
            List<Effect> a = StickerWrapper.m129068a(list);
            C7573i.m23582a((Object) a, "StickerWrapper.covertData(wrapperList)");
            for (Effect composerPath : a) {
                List<String> composerPath2 = composerPath.getComposerPath();
                if (composerPath2 != null) {
                    for (String add : composerPath2) {
                        hashSet.add(add);
                    }
                }
            }
            StringBuilder sb = new StringBuilder("memoji: all path: ");
            Object[] array = a.toArray(new Effect[0]);
            if (array != null) {
                sb.append(Arrays.toString(array));
                C41530am.m132280a(sb.toString());
                Effect effect = stickerWrapper.f104908a;
                C7573i.m23582a((Object) effect, "wrapper.effect");
                C43733e.m138599b(m129523a(effect, str));
                Effect effect2 = stickerWrapper.f104908a;
                C7573i.m23582a((Object) effect2, "wrapper.effect");
                List<String> composerPath3 = effect2.getComposerPath();
                if (composerPath3 != null) {
                    for (String str2 : composerPath3) {
                        if (!hashSet.contains(str2)) {
                            StringBuilder sb2 = new StringBuilder("memoji: delete path: ");
                            sb2.append(str2);
                            C41530am.m132280a(sb2.toString());
                            C43733e.m138603e(str2);
                        }
                    }
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: a */
    public static final boolean m129531a(Effect effect, ResourceListModel resourceListModel) {
        List<ResourceListBean> list = null;
        if ((effect != null ? effect.getComposerPath() : null) == null) {
            return true;
        }
        List composerPath = effect.getComposerPath();
        C7573i.m23582a((Object) composerPath, "composerPath");
        List b = m129533b(composerPath);
        if (b.isEmpty()) {
            return true;
        }
        if (resourceListModel != null) {
            list = resourceListModel.resource_list;
        }
        if (list == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        List<ResourceListBean> list2 = resourceListModel.resource_list;
        C7573i.m23582a((Object) list2, "model.resourceList");
        for (ResourceListBean resourceListBean : list2) {
            C7573i.m23582a((Object) resourceListBean, "it");
            if (!TextUtils.isEmpty(resourceListBean.resource_uri)) {
                arrayList.add(resourceListBean.resource_uri);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        return !b.containsAll(arrayList);
    }

    /* renamed from: c */
    public static final void m129536c() {
        Keva.getRepo("personal_effect").clear();
        C43733e.m138603e(m129522a());
    }

    /* renamed from: a */
    public static String m129522a() {
        StringBuilder sb = new StringBuilder();
        Application b = C35574k.m114861b();
        C7573i.m23582a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C7573i.m23582a((Object) filesDir, "CameraClient.getApplication().filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("personalEffect");
        return sb.toString();
    }

    /* renamed from: b */
    public static final Map<String, List<String>> m129534b() {
        Keva repo = Keva.getRepo("personal_effect");
        C7573i.m23582a((Object) repo, "keva");
        Map all = repo.getAll();
        C7573i.m23582a((Object) all, "keva.all");
        Map<String, List<String>> hashMap = new HashMap<>();
        for (Entry entry : all.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String str = (String) value;
                StringBuilder sb = new StringBuilder("memoji: read string: ");
                sb.append(str);
                C41530am.m132280a(sb.toString());
                hashMap.put(entry.getKey(), C7634n.m23768b((CharSequence) str, new String[]{"#######"}, false, 0));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public static final boolean m129538c(C40506c cVar) {
        C7573i.m23587b(cVar, "resourceId");
        return C43733e.m138597a(m129539d(cVar));
    }

    /* renamed from: b */
    public static final boolean m129535b(String str) {
        C7573i.m23587b(str, "id");
        return C6311g.m19574b((List) m129534b().get(str));
    }

    /* renamed from: d */
    private static String m129539d(C40506c cVar) {
        C7573i.m23587b(cVar, "resourceBean");
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f105268e);
        sb.append(File.separator);
        sb.append(cVar.f105264a);
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m129532b(C40506c cVar) {
        C7573i.m23587b(cVar, "resourceBean");
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f105268e);
        sb.append(File.separator);
        sb.append(cVar.f105264a);
        sb.append(".zip");
        return sb.toString();
    }

    /* renamed from: c */
    public static final void m129537c(String str) {
        C7573i.m23587b(str, "dir");
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: b */
    private static List<String> m129533b(List<String> list) {
        C7573i.m23587b(list, "composerPathList");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            CharSequence charSequence = str;
            String str2 = File.separator;
            C7573i.m23582a((Object) str2, "File.separator");
            int b = C7634n.m23760b(charSequence, str2, 0, false, 6, (Object) null) + 1;
            if (str != null) {
                String substring = str.substring(b);
                C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                arrayList.add(substring);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final String m129524a(String str) {
        C7573i.m23587b(str, "id");
        StringBuilder sb = new StringBuilder();
        sb.append(m129522a());
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static List<String> m129525a(List<C40506c> list) {
        C7573i.m23587b(list, "resourceList");
        ArrayList arrayList = new ArrayList();
        for (C40506c d : list) {
            arrayList.add(m129539d(d));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m129529a(String str, String str2) {
        Keva.getRepo("personal_effect").storeString(str, str2);
    }

    /* renamed from: a */
    private static String m129523a(Effect effect, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append(effect.getId());
        return sb.toString();
    }

    /* renamed from: a */
    public static final Effect m129521a(ResourceListModel resourceListModel, List<C40506c> list) {
        C7573i.m23587b(resourceListModel, "model");
        C7573i.m23587b(list, "resourceList");
        Effect effect = new Effect();
        UUID randomUUID = UUID.randomUUID();
        effect.setEffectId(randomUUID.toString());
        effect.setId(randomUUID.toString());
        effect.setExtra(resourceListModel.params);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C40496bh.m129431a(resourceListModel.icon_uri, resourceListModel.url_prefix));
        effect.setIconUrl(urlModel);
        effect.setComposerPath(m129525a(list));
        effect.setResourceId(C35574k.m114859a().mo70085S().mo15979b((Object) resourceListModel));
        return effect;
    }

    /* renamed from: a */
    public static final Effect m129520a(Effect effect, ResourceListModel resourceListModel, List<C40506c> list) {
        String str;
        String str2;
        String str3;
        String str4;
        C7573i.m23587b(list, "resourceList");
        Effect effect2 = new Effect();
        List<String> list2 = null;
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        effect2.setEffectId(str);
        if (effect != null) {
            str2 = effect.getId();
        } else {
            str2 = null;
        }
        effect2.setId(str2);
        if (resourceListModel != null) {
            str3 = resourceListModel.params;
        } else {
            str3 = null;
        }
        effect2.setExtra(str3);
        UrlModel urlModel = new UrlModel();
        if (resourceListModel != null) {
            str4 = resourceListModel.icon_uri;
        } else {
            str4 = null;
        }
        if (resourceListModel != null) {
            list2 = resourceListModel.url_prefix;
        }
        urlModel.setUrlList(C40496bh.m129431a(str4, list2));
        effect2.setIconUrl(urlModel);
        effect2.setComposerPath(m129525a(list));
        effect2.setResourceId(C35574k.m114859a().mo70085S().mo15979b((Object) resourceListModel));
        return effect2;
    }

    /* renamed from: a */
    public static final void m129526a(int i, StickerWrapper stickerWrapper, List<StickerWrapper> list, String str) {
        String[] strArr;
        C7573i.m23587b(list, "wrapperList");
        C7573i.m23587b(str, "dir");
        if (stickerWrapper != null) {
            StringBuilder sb = new StringBuilder("memoji: modify: ");
            Effect effect = stickerWrapper.f104908a;
            C7573i.m23582a((Object) effect, "wrapper.effect");
            List composerPath = effect.getComposerPath();
            if (composerPath != null) {
                Object[] array = composerPath.toArray(new String[0]);
                if (array != null) {
                    strArr = (String[]) array;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                strArr = null;
            }
            sb.append(Arrays.toString(strArr));
            C41530am.m132280a(sb.toString());
            f105289a.m129527a((StickerWrapper) list.set(i, stickerWrapper), list, str);
        }
    }
}
