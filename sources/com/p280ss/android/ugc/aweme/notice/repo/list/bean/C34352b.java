package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.b */
public final class C34352b {

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.b$a */
    static final class C34353a extends Lambda implements C7562b<User, CharSequence> {

        /* renamed from: a */
        public static final C34353a f89523a = new C34353a();

        C34353a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m111067a((User) obj);
        }

        /* renamed from: a */
        private static CharSequence m111067a(User user) {
            C7573i.m23587b(user, "it");
            String uid = user.getUid();
            if (uid != null) {
                return uid;
            }
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
    }

    /* renamed from: a */
    public static final String m111066a(CheckProfileNotice checkProfileNotice) {
        C7573i.m23587b(checkProfileNotice, "$this$customNid");
        List users = checkProfileNotice.getUsers();
        if (users != null) {
            String a = C7525m.m23492a(users, null, null, null, 0, null, C34353a.f89523a, 31, null);
            if (a != null) {
                return a;
            }
        }
        return TEVideoRecorder.FACE_BEAUTY_NULL;
    }
}
