package com.p280ss.android.ugc.aweme.emoji.base;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;

/* renamed from: com.ss.android.ugc.aweme.emoji.base.a */
public final class C27517a {

    /* renamed from: a */
    public int f72556a;

    /* renamed from: b */
    public String f72557b;

    /* renamed from: c */
    public String f72558c;

    /* renamed from: d */
    public Emoji f72559d;

    /* renamed from: a */
    public final boolean mo70726a() {
        if (this.f72559d != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C27517a)) {
            return false;
        }
        C27517a aVar = (C27517a) obj;
        if (((aVar.f72556a > 0 || !TextUtils.isEmpty(aVar.f72557b)) && aVar.f72556a == this.f72556a && TextUtils.equals(aVar.f72557b, this.f72557b) && TextUtils.equals(aVar.f72558c, this.f72558c)) || (aVar.f72559d != null && aVar.f72559d.equals(this.f72559d))) {
            return true;
        }
        return false;
    }
}
