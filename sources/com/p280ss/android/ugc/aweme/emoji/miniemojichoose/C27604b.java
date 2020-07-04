package com.p280ss.android.ugc.aweme.emoji.miniemojichoose;

import android.content.Context;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27606a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.miniemojichoose.b */
public final class C27604b {

    /* renamed from: a */
    public static final String[] f72759a = {"[赞]", "[玫瑰]", "[捂脸]", "[666]", "[鼓掌]", "[呲牙]", "[微笑]", "[耶]"};

    /* renamed from: b */
    private Context f72760b;

    /* renamed from: c */
    private C27606a f72761c;

    public C27604b(Context context) {
        this.f72760b = context;
        this.f72761c = C27606a.m90489b(context);
    }

    /* renamed from: a */
    public final List<C27517a> mo70899a(List<String> list) {
        if (list == null || list.size() < 8) {
            list = Arrays.asList(f72759a);
        }
        return C27606a.m90489b(this.f72760b).mo70932a(list, 8);
    }
}
