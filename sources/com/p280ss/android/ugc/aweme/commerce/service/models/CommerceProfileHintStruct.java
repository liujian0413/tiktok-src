package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.CommerceProfileHintStruct */
public final class CommerceProfileHintStruct implements Serializable {
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private long f64596id;
    @C6593c(mo15949a = "text")
    private String text;
    @C6593c(mo15949a = "url")
    private String url;

    public CommerceProfileHintStruct() {
        this(0, null, null, 7, null);
    }

    public final long getId() {
        return this.f64596id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setId(long j) {
        this.f64596id = j;
    }

    public final void setText(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.text = str;
    }

    public final void setUrl(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.url = str;
    }

    public CommerceProfileHintStruct(long j, String str, String str2) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "url");
        this.f64596id = j;
        this.text = str;
        this.url = str2;
    }

    public /* synthetic */ CommerceProfileHintStruct(long j, String str, String str2, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        this(j, str, str2);
    }
}
