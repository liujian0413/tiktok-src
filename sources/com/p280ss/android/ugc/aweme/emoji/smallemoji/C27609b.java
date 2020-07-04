package com.p280ss.android.ugc.aweme.emoji.smallemoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.R$drawable;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.b */
public final class C27609b implements C27605a {

    /* renamed from: a */
    public static final C27610a f72768a = new C27610a(null);

    /* renamed from: b */
    private Map<String, Integer> f72769b;

    /* renamed from: c */
    private String[] f72770c;

    /* renamed from: d */
    private List<String> f72771d;

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.b$a */
    public static final class C27610a {
        private C27610a() {
        }

        public /* synthetic */ C27610a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo70935b() {
        return null;
    }

    /* renamed from: a */
    public final int mo70928a() {
        m90509c();
        List<String> list = this.f72771d;
        if (list == null) {
            C7573i.m23580a();
        }
        return list.size();
    }

    /* renamed from: c */
    private final void m90509c() {
        boolean z;
        boolean z2;
        String[] strArr = this.f72770c;
        if (strArr != null) {
            if (strArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z = false;
                if (!z && this.f72769b == null) {
                    this.f72771d = new ArrayList();
                    String[] strArr2 = this.f72770c;
                    if (strArr2 == null) {
                        C7573i.m23580a();
                    }
                    this.f72769b = new HashMap(strArr2.length);
                    String[] strArr3 = this.f72770c;
                    if (strArr3 == null) {
                        C7573i.m23580a();
                    }
                    for (String a : strArr3) {
                        String[] a2 = C27608b.m90504a(a, "\\|", 2);
                        int parseInt = Integer.parseInt(a2[0]);
                        Locale locale = Locale.ENGLISH;
                        C7573i.m23582a((Object) locale, "Locale.ENGLISH");
                        String a3 = C1642a.m8035a(locale, "im_e%d", Arrays.copyOf(new Object[]{Integer.valueOf(parseInt)}, 1));
                        C7573i.m23582a((Object) a3, "java.lang.String.format(locale, format, *args)");
                        Map<String, Integer> map = this.f72769b;
                        if (map == null) {
                            C7573i.m23580a();
                        }
                        String str = a2[1];
                        C7573i.m23582a((Object) str, "emojiIdAndName[1]");
                        map.put(str, Integer.valueOf(m90508c(a3)));
                        List<String> list = this.f72771d;
                        if (list == null) {
                            C7573i.m23580a();
                        }
                        if (list.size() == parseInt) {
                            List<String> list2 = this.f72771d;
                            if (list2 == null) {
                                C7573i.m23580a();
                            }
                            int i = parseInt - 1;
                            String str2 = a2[1];
                            C7573i.m23582a((Object) str2, "emojiIdAndName[1]");
                            list2.set(i, str2);
                        } else {
                            List<String> list3 = this.f72771d;
                            if (list3 == null) {
                                C7573i.m23580a();
                            }
                            String str3 = a2[1];
                            C7573i.m23582a((Object) str3, "emojiIdAndName[1]");
                            list3.add(str3);
                        }
                    }
                    return;
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* renamed from: b */
    private final String m90507b(int i) {
        m90509c();
        List<String> list = this.f72771d;
        if (list == null || i >= list.size()) {
            return "";
        }
        return (String) list.get(i);
    }

    /* renamed from: c */
    private static int m90508c(String str) {
        int i;
        if (str == null) {
            return -1;
        }
        Class<R$drawable> cls = R$drawable.class;
        try {
            i = cls.getField(str).getInt(cls);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException unused) {
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    public final Drawable mo70929a(Context context) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                return resources.getDrawable(R.drawable.a07);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r0 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27609b(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            r3.<init>()
            java.lang.String[] r0 = r3.f72770c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            if (r1 == 0) goto L_0x0026
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2130903062(0x7f030016, float:1.7412931E38)
            java.lang.String[] r4 = r4.getStringArray(r0)
            r3.f72770c = r4
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.smallemoji.C27609b.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    private final int m90505a(int i) {
        Locale locale = Locale.ENGLISH;
        C7573i.m23582a((Object) locale, "Locale.ENGLISH");
        String a = C1642a.m8035a(locale, "im_e%d", Arrays.copyOf(new Object[]{Integer.valueOf(i + 1)}, 1));
        C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
        return m90508c(a);
    }

    /* renamed from: b */
    private final int m90506b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        m90509c();
        Map<String, Integer> map = this.f72769b;
        if (map == null) {
            C7573i.m23580a();
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo70934a(String str) {
        if (str == null || m90506b(str) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Drawable mo70930a(Context context, String str) {
        boolean z;
        if (context != null) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int b = m90506b(str);
                if (b > 0) {
                    return context.getResources().getDrawable(b);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final List<C27517a> mo70931a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = i2 + i;
        while (i < i3) {
            C27517a aVar = new C27517a();
            aVar.f72558c = m90507b(i);
            aVar.f72556a = m90505a(i);
            arrayList.add(aVar);
            i++;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<C27517a> mo70932a(List<String> list, int i) {
        if (list == null) {
            return new ArrayList<>();
        }
        m90509c();
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (m90506b(str) > 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() < i) {
            List<String> list2 = this.f72771d;
            if (list2 == null) {
                C7573i.m23580a();
            }
            for (String str2 : list2) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
                if (arrayList.size() >= i) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            C27517a aVar = new C27517a();
            aVar.f72558c = str3;
            aVar.f72556a = m90506b(str3);
            arrayList2.add(aVar);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final void mo70933a(RemoteImageView remoteImageView, C27517a aVar) {
        boolean z;
        if (!(remoteImageView == null || aVar == null)) {
            if (aVar.f72556a > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar = null;
            }
            if (aVar != null) {
                remoteImageView.setImageResource(aVar.f72556a);
            }
        }
    }
}
