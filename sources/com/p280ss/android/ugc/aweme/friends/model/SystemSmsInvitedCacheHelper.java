package com.p280ss.android.ugc.aweme.friends.model;

import android.os.Build.VERSION;
import android.util.ArraySet;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SystemSmsInvitedCacheHelper */
public class SystemSmsInvitedCacheHelper {
    private static Set<Object> invitedContacts;

    public static void clear() {
        invitedContacts.clear();
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            invitedContacts = new ArraySet();
        } else {
            invitedContacts = new HashSet();
        }
    }

    public static void addInvitedContact(String str) {
        invitedContacts.add(str);
    }

    public static boolean contains(String str) {
        return invitedContacts.contains(str);
    }
}
