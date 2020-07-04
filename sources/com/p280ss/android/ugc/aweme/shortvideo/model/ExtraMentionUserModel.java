package com.p280ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel */
public final class ExtraMentionUserModel implements Serializable {
    public static final Companion Companion = new Companion(null);
    private List<Pair<String, String>> userList = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }

        public final ExtraMentionUserModel newInstance(String str, String str2) {
            C7573i.m23587b(str, "uid");
            C7573i.m23587b(str2, "nickname");
            ExtraMentionUserModel extraMentionUserModel = new ExtraMentionUserModel();
            extraMentionUserModel.addMentionUser(str, str2);
            return extraMentionUserModel;
        }
    }

    public final List<Pair<String, String>> getUserList() {
        return this.userList;
    }

    public final List<User> transform() {
        List<Pair<String, String>> list = this.userList;
        if (!(!this.userList.isEmpty())) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        Iterable<Pair> iterable = list;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (Pair pair : iterable) {
            User user = new User();
            user.setUid((String) pair.getFirst());
            user.setNickname((String) pair.getSecond());
            arrayList.add(user);
        }
        return (List) arrayList;
    }

    public final void addMentionUser(String str, String str2) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(str2, "name");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.userList.add(new Pair(str, str2));
        }
    }
}
