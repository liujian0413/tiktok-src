package com.google.firebase.messaging;

import com.google.android.gms.tasks.C17057f;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.messaging.a */
public class C18359a {

    /* renamed from: a */
    private static final Pattern f49868a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: b */
    private static C18359a f49869b;

    /* renamed from: c */
    private final FirebaseInstanceId f49870c;

    /* renamed from: a */
    public static synchronized C18359a m60499a() {
        C18359a aVar;
        synchronized (C18359a.class) {
            if (f49869b == null) {
                f49869b = new C18359a(FirebaseInstanceId.m60321a());
            }
            aVar = f49869b;
        }
        return aVar;
    }

    private C18359a(FirebaseInstanceId firebaseInstanceId) {
        this.f49870c = firebaseInstanceId;
    }

    /* renamed from: a */
    public final C17057f<Void> mo47293a(String str) {
        if (str != null && str.startsWith("/topics/")) {
            str = str.substring(8);
        }
        if (str == null || !f49868a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("Invalid topic name: ");
            sb.append(str);
            sb.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(sb.toString());
        }
        FirebaseInstanceId firebaseInstanceId = this.f49870c;
        String valueOf = String.valueOf("S!");
        String valueOf2 = String.valueOf(str);
        return firebaseInstanceId.mo47181a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }
}
