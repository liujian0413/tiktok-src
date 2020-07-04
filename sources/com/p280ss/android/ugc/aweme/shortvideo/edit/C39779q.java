package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.q */
public final class C39779q {

    /* renamed from: a */
    public static final C39779q f103403a = new C39779q();

    /* renamed from: b */
    private static final String f103404b = f103404b;

    /* renamed from: c */
    private static final String[] f103405c;

    /* renamed from: d */
    private static final int f103406d;

    /* renamed from: e */
    private static final int f103407e = C7519g.m23443c((T[]) f103405c, "sticker_lyric_music");

    /* renamed from: f */
    private static final int f103408f = C7519g.m23443c((T[]) f103405c, "auto_enhance");

    /* renamed from: g */
    private static final int f103409g = C7519g.m23443c((T[]) f103405c, "music");

    /* renamed from: h */
    private static final int f103410h = C7519g.m23443c((T[]) f103405c, "sticker");

    /* renamed from: i */
    private static final int f103411i = C7519g.m23443c((T[]) f103405c, "effect");

    /* renamed from: j */
    private static final int f103412j = C7519g.m23443c((T[]) f103405c, "voice");

    /* renamed from: k */
    private static final HashMap<String, Integer> f103413k = new HashMap<>();

    /* renamed from: l */
    private static SharedPreferences f103414l = C7285c.m22838a(C35563c.f93238a, "av_settings.xml", 0);

    /* renamed from: m */
    private static boolean f103415m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.q$a */
    public interface C39780a {
        /* renamed from: a */
        void mo99225a();

        /* renamed from: b */
        void mo99226b();

        /* renamed from: c */
        void mo99227c();

        /* renamed from: d */
        void mo99228d();

        /* renamed from: e */
        void mo99229e();

        /* renamed from: f */
        void mo99230f();
    }

    private C39779q() {
    }

    /* renamed from: a */
    public static int m127360a() {
        return f103406d;
    }

    /* renamed from: b */
    public static int m127368b() {
        return f103407e;
    }

    /* renamed from: c */
    public static int m127370c() {
        return f103408f;
    }

    /* renamed from: d */
    public static int m127372d() {
        return f103409g;
    }

    /* renamed from: e */
    public static int m127373e() {
        return f103410h;
    }

    /* renamed from: f */
    public static int m127374f() {
        return f103411i;
    }

    /* renamed from: g */
    public static int m127375g() {
        return f103412j;
    }

    /* renamed from: h */
    private static Set<String> m127376h() {
        boolean z;
        String string = f103414l.getString("prompt_shown", "");
        Set<String> hashSet = new HashSet<>();
        if (string == null) {
            return hashSet;
        }
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return hashSet;
        }
        Object a = C35563c.f93239b.mo15974a(string, Set.class);
        if (a != null) {
            return C7577n.m23625e(a);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
    }

    /* renamed from: i */
    private static void m127377i() {
        HashSet hashSet = new HashSet();
        SharedPreferences a = C7285c.m22838a(C35563c.f93238a, "ai_music", 0);
        if (a.getBoolean("ai_music_guide_show", false) || f103414l.getBoolean("show_combine_shoot_mode_tip", false)) {
            hashSet.add("music");
            hashSet.add("effect");
            hashSet.add("sticker");
            hashSet.add("voice");
            hashSet.add("status_background");
        }
        Editor edit = a.edit();
        C7573i.m23582a((Object) edit, "preferences.edit()");
        edit.remove("ai_music_guide_show").apply();
        Editor edit2 = f103414l.edit();
        C7573i.m23582a((Object) edit2, "sPreferences.edit()");
        edit2.remove("show_combine_shoot_mode_tip").apply();
        m127365a((Set<String>) hashSet);
    }

    static {
        String[] strArr = {"status_background", "sticker_lyric_music", "auto_enhance", "music", "sticker", "effect", "voice"};
        f103405c = strArr;
        f103406d = C7519g.m23443c((T[]) strArr, "status_background");
    }

    /* renamed from: a */
    public static final void m127366a(boolean z) {
        f103415m = z;
    }

    /* renamed from: a */
    public static final boolean m127367a(String str) {
        C7573i.m23587b(str, "tag");
        return m127376h().contains(str);
    }

    /* renamed from: c */
    public static final boolean m127371c(boolean z) {
        if (C6399b.m19944t() || C39360dw.m125725a().mo97931b() != null || m127367a("sticker_lyric_no_music") || z) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m127369b(boolean z) {
        if (!C6399b.m19944t() && C39360dw.m125725a().mo97931b() != null) {
            AVMusic b = C39360dw.m125725a().mo97931b();
            if (b == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) b, "PublishManager.inst().getCurMusic()!!");
            if (b.getLrcUrl() != null && !m127367a("sticker_lyric_music") && !z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m127365a(Set<String> set) {
        C7573i.m23587b(set, "tagSet");
        if (!set.isEmpty()) {
            Set linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(m127376h());
            linkedHashSet.addAll(set);
            f103414l.edit().putString("prompt_shown", C35563c.f93239b.mo15979b((Object) linkedHashSet)).commit();
        }
    }

    /* renamed from: a */
    public static final void m127362a(String str, int i) {
        C7573i.m23587b(str, "tag");
        f103413k.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static final void m127364a(String str, boolean z) {
        boolean z2;
        C7573i.m23587b(str, "tag");
        if (C35563c.f93231M.mo93305a(Property.EditPagePrompt)) {
            Set h = m127376h();
            if (z) {
                z2 = h.add(str);
            } else {
                z2 = h.remove(str);
            }
            if (z2) {
                m127365a(h);
            }
        }
    }

    /* renamed from: a */
    private static void m127363a(String str, C39780a aVar) {
        switch (str.hashCode()) {
            case -1890252483:
                if (str.equals("sticker")) {
                    aVar.mo99227c();
                    return;
                }
                break;
            case -1306084975:
                if (str.equals("effect")) {
                    aVar.mo99225a();
                    return;
                }
                break;
            case 104263205:
                if (str.equals("music")) {
                    aVar.mo99226b();
                    return;
                }
                break;
            case 112386354:
                if (str.equals("voice")) {
                    aVar.mo99228d();
                    return;
                }
                break;
            case 516565022:
                if (str.equals("auto_enhance")) {
                    aVar.mo99229e();
                    return;
                }
                break;
            case 1060097947:
                if (str.equals("status_background")) {
                    aVar.mo99230f();
                    break;
                }
                break;
        }
    }

    /* renamed from: a */
    public static final void m127361a(C39780a aVar, Set<String> set) {
        C7573i.m23587b(aVar, "listener");
        m127377i();
        if (f103415m) {
            boolean z = false;
            f103415m = false;
            f103414l.edit().putBoolean("lyric_first_click_use", true).apply();
            Set h = m127376h();
            if (!h.isEmpty()) {
                Iterator it = f103413k.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C7573i.m23582a(next, "it.next()");
                    Entry entry = (Entry) next;
                    if ((C6399b.m19944t() || (!C7573i.m23585a((Object) (String) entry.getKey(), (Object) "sticker"))) && (h.contains(entry.getKey()) || (set != null && set.contains(entry.getKey())))) {
                        it.remove();
                    } else if (!C6399b.m19944t() && C7573i.m23585a((Object) (String) entry.getKey(), (Object) "sticker") && h.contains(entry.getKey()) && h.contains("sticker_lyric_music") && h.contains("sticker_lyric_no_music")) {
                        it.remove();
                    }
                }
            }
            int i = Integer.MAX_VALUE;
            String str = "";
            for (String str2 : f103413k.keySet()) {
                Object obj = f103413k.get(str2);
                if (obj == null) {
                    C7573i.m23580a();
                }
                Integer num = (Integer) obj;
                if (num == null || num.intValue() != -1) {
                    Object obj2 = f103413k.get(str2);
                    if (obj2 == null) {
                        C7573i.m23580a();
                    }
                    if (C7573i.m23576a(((Number) obj2).intValue(), i) < 0) {
                        Object obj3 = f103413k.get(str2);
                        if (obj3 == null) {
                            C7573i.m23580a();
                        }
                        i = ((Number) obj3).intValue();
                        C7573i.m23582a((Object) str2, "key");
                        str = str2;
                    }
                }
            }
            if (str.length() > 0) {
                z = true;
            }
            if (z) {
                m127363a(str, aVar);
            }
        }
    }
}
