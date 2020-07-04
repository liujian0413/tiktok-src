package com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg;

import com.bytedance.p263im.core.model.Message;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.selectmsg.b */
public final class C6951b {

    /* renamed from: a */
    public static final C6951b f19653a = new C6951b();

    /* renamed from: b */
    private static HashMap<String, List<Message>> f19654b;

    /* renamed from: c */
    private static HashMap<String, Integer> f19655c;

    private C6951b() {
    }

    /* renamed from: a */
    public static final void m21622a() {
        if (f19655c != null) {
            f19655c = null;
        }
        if (f19654b != null) {
            f19654b = null;
        }
    }

    /* renamed from: a */
    public static final Integer m21621a(String str) {
        HashMap<String, Integer> hashMap = f19655c;
        if (hashMap != null) {
            return (Integer) hashMap.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public static final void m21625b(String str) {
        HashMap<String, Integer> hashMap = f19655c;
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    /* renamed from: c */
    public static List<Message> m21626c(String str) {
        HashMap<String, List<Message>> hashMap = f19654b;
        if (hashMap != null) {
            return (List) hashMap.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public static final void m21627d(String str) {
        HashMap<String, List<Message>> hashMap = f19654b;
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    /* renamed from: a */
    public static final void m21623a(String str, Integer num) {
        if (f19655c == null) {
            f19655c = new HashMap<>();
        }
        HashMap<String, Integer> hashMap = f19655c;
        if (hashMap == null) {
            C7573i.m23580a();
        }
        hashMap.put(str, num);
    }

    /* renamed from: a */
    public static final void m21624a(String str, List<Message> list) {
        if (f19654b == null) {
            f19654b = new HashMap<>();
        }
        HashMap<String, List<Message>> hashMap = f19654b;
        if (hashMap == null) {
            C7573i.m23580a();
        }
        hashMap.put(str, list);
    }
}
