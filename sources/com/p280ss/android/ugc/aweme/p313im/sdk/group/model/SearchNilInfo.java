package com.p280ss.android.ugc.aweme.p313im.sdk.group.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.SearchNilInfo */
public final class SearchNilInfo implements Serializable {
    public static final C31267a Companion = new C31267a(null);
    @C6593c(mo15949a = "search_nil_item")
    private String nilItem;
    @C6593c(mo15949a = "text_type")
    private Integer textType;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.SearchNilInfo$a */
    public static final class C31267a {
        private C31267a() {
        }

        public /* synthetic */ C31267a(C7571f fVar) {
            this();
        }
    }

    public final String getNilItem() {
        return this.nilItem;
    }

    public final Integer getTextType() {
        return this.textType;
    }

    public final boolean isHate() {
        return com.p280ss.android.ugc.aweme.discover.model.SearchNilInfo.HIT_HEAT_SPEECH.equals(this.nilItem);
    }

    public final boolean isHitLimit() {
        return com.p280ss.android.ugc.aweme.discover.model.SearchNilInfo.HIT_LIMIT.equals(this.nilItem);
    }

    public final boolean isSensitive() {
        return Integer.valueOf(12).equals(this.textType);
    }

    public final void setNilItem(String str) {
        this.nilItem = str;
    }

    public final void setTextType(Integer num) {
        this.textType = num;
    }
}
