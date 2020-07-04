package com.p280ss.android.ugc.aweme.emoji.p1205c;

import android.view.ViewGroup;
import android.widget.EditText;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.c.b */
public final class C27526b {

    /* renamed from: a */
    public final ViewGroup f72564a;

    /* renamed from: b */
    public final EditText f72565b;

    /* renamed from: c */
    public final int f72566c;

    /* renamed from: d */
    public final String f72567d;

    /* renamed from: e */
    public final C27525a f72568e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27526b) {
                C27526b bVar = (C27526b) obj;
                if (C7573i.m23585a((Object) this.f72564a, (Object) bVar.f72564a) && C7573i.m23585a((Object) this.f72565b, (Object) bVar.f72565b)) {
                    if (!(this.f72566c == bVar.f72566c) || !C7573i.m23585a((Object) this.f72567d, (Object) bVar.f72567d) || !C7573i.m23585a((Object) this.f72568e, (Object) bVar.f72568e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ViewGroup viewGroup = this.f72564a;
        int i = 0;
        int hashCode = (viewGroup != null ? viewGroup.hashCode() : 0) * 31;
        EditText editText = this.f72565b;
        int hashCode2 = (((hashCode + (editText != null ? editText.hashCode() : 0)) * 31) + this.f72566c) * 31;
        String str = this.f72567d;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C27525a aVar = this.f72568e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IMMiniChooseEmojiPayload(layout=");
        sb.append(this.f72564a);
        sb.append(", editText=");
        sb.append(this.f72565b);
        sb.append(", maxLength=");
        sb.append(this.f72566c);
        sb.append(", exceedErrorTip=");
        sb.append(this.f72567d);
        sb.append(", callback=");
        sb.append(this.f72568e);
        sb.append(")");
        return sb.toString();
    }

    public C27526b(ViewGroup viewGroup, EditText editText, int i, String str, C27525a aVar) {
        C7573i.m23587b(viewGroup, "layout");
        C7573i.m23587b(editText, "editText");
        this.f72564a = viewGroup;
        this.f72565b = editText;
        this.f72566c = i;
        this.f72567d = str;
        this.f72568e = aVar;
    }
}
