package com.p280ss.android.ugc.aweme.wiki;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.wiki.CheckWikiWordResult */
public final class CheckWikiWordResult implements Serializable {
    @C6593c(mo15949a = "status_code")
    private final int code;
    @C6593c(mo15949a = "status_msg")
    private final String msg;

    public static /* synthetic */ CheckWikiWordResult copy$default(CheckWikiWordResult checkWikiWordResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = checkWikiWordResult.code;
        }
        if ((i2 & 2) != 0) {
            str = checkWikiWordResult.msg;
        }
        return checkWikiWordResult.copy(i, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.msg;
    }

    public final CheckWikiWordResult copy(int i, String str) {
        C7573i.m23587b(str, "msg");
        return new CheckWikiWordResult(i, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckWikiWordResult) {
                CheckWikiWordResult checkWikiWordResult = (CheckWikiWordResult) obj;
                if (!(this.code == checkWikiWordResult.code) || !C7573i.m23585a((Object) this.msg, (Object) checkWikiWordResult.msg)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.msg;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckWikiWordResult(code=");
        sb.append(this.code);
        sb.append(", msg=");
        sb.append(this.msg);
        sb.append(")");
        return sb.toString();
    }

    public CheckWikiWordResult(int i, String str) {
        C7573i.m23587b(str, "msg");
        this.code = i;
        this.msg = str;
    }
}
