package com.p280ss.android.ugc.aweme.account.util;

import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.profile.UserResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.util.x */
public final class C22351x implements C6310a {

    /* renamed from: a */
    public C22332k f59617a;

    /* renamed from: b */
    private boolean f59618b;

    /* renamed from: c */
    private C6309f f59619c = new C6309f(this);

    /* renamed from: a */
    private void m74005a() {
        this.f59618b = false;
    }

    public C22351x() {
        m74005a();
    }

    /* renamed from: a */
    public final void mo58768a(Map<String, String> map) {
        if (map != null && map.size() != 0 && !this.f59618b) {
            this.f59618b = true;
            C21671bd.m72520a().updateUserInfo(this.f59619c, map);
        }
    }

    public final void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            m74007a((Exception) message.obj, message.what);
        } else if (message.obj instanceof User) {
            m74006a((User) message.obj, message.what);
        } else {
            if (message.obj instanceof UserResponse) {
                UserResponse userResponse = (UserResponse) message.obj;
                if (userResponse.getAction() == 1) {
                    m74008a(userResponse.status_msg, true);
                } else if (userResponse.getAction() == 2) {
                    m74008a(userResponse.status_msg, false);
                } else {
                    m74006a(userResponse.getUser(), message.what);
                }
            }
        }
    }

    /* renamed from: a */
    private void m74008a(String str, boolean z) {
        this.f59618b = false;
        if (this.f59617a != null) {
            this.f59617a.mo57588a(str, z);
        }
    }

    /* renamed from: a */
    private void m74006a(User user, int i) {
        if (user != null) {
            if (i == 112) {
                this.f59618b = false;
                C21671bd.m72529a(user);
            }
            if (this.f59617a != null && !this.f59618b) {
                this.f59617a.mo57589c(true);
            }
        }
    }

    /* renamed from: a */
    private void m74007a(Exception exc, int i) {
        if (i == 112) {
            this.f59618b = false;
        }
        if (this.f59617a != null) {
            this.f59617a.mo57587a(exc, i);
            if (!this.f59618b) {
                this.f59617a.mo57589c(false);
            }
        }
    }
}
