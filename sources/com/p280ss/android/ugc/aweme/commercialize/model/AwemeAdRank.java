package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.AwemeAdRank */
public final class AwemeAdRank implements Serializable {
    public static final C24984a Companion = new C24984a(null);
    @C6593c(mo15949a = "aweme_id")
    private final String awemeId;
    @C6593c(mo15949a = "item_type")
    private final int itemType;
    @C6593c(mo15949a = "repack_aweme")
    private final Aweme repackAweme;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.AwemeAdRank$a */
    public static final class C24984a {
        private C24984a() {
        }

        public /* synthetic */ C24984a(C7571f fVar) {
            this();
        }
    }

    public AwemeAdRank() {
        this(null, 0, null, 7, null);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int getItemType() {
        return this.itemType;
    }

    public final Aweme getRepackAweme() {
        return this.repackAweme;
    }

    public AwemeAdRank(String str, int i, Aweme aweme) {
        this.awemeId = str;
        this.itemType = i;
        this.repackAweme = aweme;
    }

    public /* synthetic */ AwemeAdRank(String str, int i, Aweme aweme, int i2, C7571f fVar) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            aweme = null;
        }
        this(str, i, aweme);
    }
}
