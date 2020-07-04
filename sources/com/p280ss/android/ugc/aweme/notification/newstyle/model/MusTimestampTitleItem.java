package com.p280ss.android.ugc.aweme.notification.newstyle.model;

import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.MusTimestampTitleItem */
public final class MusTimestampTitleItem extends User {
    public static final Companion Companion = new Companion(null);
    private int type;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.MusTimestampTitleItem$Companion */
    public static final class Companion implements Serializable {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public MusTimestampTitleItem(int i) {
        this.type = i;
    }
}
