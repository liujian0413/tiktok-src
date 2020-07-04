package com.p280ss.android.ugc.aweme.utils;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.utils.ec */
public final class C43088ec {

    /* renamed from: a */
    private static final C7562b<String, String> f111706a = C43090b.f111708a;

    /* renamed from: com.ss.android.ugc.aweme.utils.ec$a */
    static final class C43089a extends Lambda implements C7562b<String, String> {

        /* renamed from: a */
        public static final C43089a f111707a = new C43089a();

        C43089a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m136692a((String) obj);
        }

        /* renamed from: a */
        private static String m136692a(String str) {
            C7573i.m23587b(str, "it");
            String obj = C7634n.m23762b(str).toString();
            if (C7634n.m23721b(obj, ",", false)) {
                if (obj != null) {
                    String substring = obj.substring(1);
                    C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                    if (substring != null) {
                        obj = C7634n.m23762b(substring).toString();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append((String) C43088ec.m136689a().invoke(obj));
            sb.append("\n");
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ec$b */
    static final class C43090b extends Lambda implements C7562b<String, String> {

        /* renamed from: a */
        public static final C43090b f111708a = new C43090b();

        C43090b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m136693a((String) obj);
        }

        /* renamed from: a */
        private static String m136693a(String str) {
            C7573i.m23587b(str, "it");
            CharSequence charSequence = str;
            int length = C7634n.m23762b(charSequence).toString().length();
            StringBuilder sb = new StringBuilder("| ");
            sb.append(C7634n.m23762b(charSequence).toString());
            sb.append(C7634n.m23708a(" ", Math.max(0, 197 - length)));
            sb.append('|');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static final C7562b<String, String> m136689a() {
        return f111706a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m136690a(Object[] objArr, boolean z) {
        Object[] objArr2;
        boolean z2;
        C7573i.m23587b(objArr, "args");
        if (objArr.length > 1) {
            Object[] array = C7519g.m23429a((T[]) objArr, 1).toArray(new Object[0]);
            if (array != null) {
                String.valueOf(objArr[0]);
                objArr2 = array;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            objArr2 = objArr;
        }
        StringBuilder sb = new StringBuilder("|");
        sb.append(C7634n.m23708a("-", 198));
        sb.append("|\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(" \n");
        sb3.append(sb2);
        String a = C7519g.m23426a(objArr2, ", ", "", "", -1, "...", null);
        if (a != null) {
            sb3.append(C7525m.m23492a(C7634n.m23768b(C7634n.m23762b(a).toString(), new String[]{"\n"}, false, 0), "", null, null, 0, null, C43089a.f111707a, 30, null));
            sb3.append(sb2);
            if (z) {
                String stackTraceString = Log.getStackTraceString(new Throwable());
                C7573i.m23582a((Object) stackTraceString, "trace");
                Iterable b = C7634n.m23766b((CharSequence) stackTraceString, new char[]{10}, false, 0);
                Collection arrayList = new ArrayList();
                for (Object next : b) {
                    CharSequence charSequence = (String) next;
                    if (!C7634n.m23776c(charSequence, (CharSequence) "com.ss.", false) || C7634n.m23776c(charSequence, (CharSequence) "smartLog", false)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        arrayList.add(next);
                    }
                }
                sb3.append(C7525m.m23492a((List) arrayList, "\n", null, null, 0, null, f111706a, 30, null));
                sb3.append(10);
                sb3.append(sb2);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
