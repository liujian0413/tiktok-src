package com.p280ss.android.ugc.aweme.comment.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.model.CommentPrompt */
public final class CommentPrompt implements Serializable {
    @C6593c(mo15949a = "content")
    private final String content;
    @C6593c(mo15949a = "type")
    private final int type;

    public CommentPrompt() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ CommentPrompt copy$default(CommentPrompt commentPrompt, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = commentPrompt.type;
        }
        if ((i2 & 2) != 0) {
            str = commentPrompt.content;
        }
        return commentPrompt.copy(i, str);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.content;
    }

    public final CommentPrompt copy(int i, String str) {
        C7573i.m23587b(str, C38347c.f99553h);
        return new CommentPrompt(i, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentPrompt) {
                CommentPrompt commentPrompt = (CommentPrompt) obj;
                if (!(this.type == commentPrompt.type) || !C7573i.m23585a((Object) this.content, (Object) commentPrompt.content)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getType() {
        return this.type;
    }

    public final int hashCode() {
        int i = this.type * 31;
        String str = this.content;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentPrompt(type=");
        sb.append(this.type);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(")");
        return sb.toString();
    }

    public CommentPrompt(int i, String str) {
        C7573i.m23587b(str, C38347c.f99553h);
        this.type = i;
        this.content = str;
    }

    public /* synthetic */ CommentPrompt(int i, String str, int i2, C7571f fVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        this(i, str);
    }
}
