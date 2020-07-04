package net.openid.appauth;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: net.openid.appauth.c */
final class C48253c {
    /* renamed from: a */
    public static Set<String> m149683a(String str) {
        if (str == null) {
            return null;
        }
        List asList = Arrays.asList(TextUtils.split(str, " "));
        LinkedHashSet linkedHashSet = new LinkedHashSet(asList.size());
        linkedHashSet.addAll(asList);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static String m149682a(Iterable<String> iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : iterable) {
            C48280n.m149791a(!TextUtils.isEmpty(str), (Object) "individual scopes cannot be null or empty");
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }
}
