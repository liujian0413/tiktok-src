package com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.C27605a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.C27609b;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.online.C27612a;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.online.C27612a.C27613a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.a.a */
public final class C27606a implements C27605a {

    /* renamed from: a */
    public static C27606a f72763a;

    /* renamed from: b */
    public static final C27607a f72764b = new C27607a(null);

    /* renamed from: c */
    private C27605a f72765c;

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.a.a$a */
    public static final class C27607a {
        private C27607a() {
        }

        public /* synthetic */ C27607a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C27606a m90499a(Context context) {
            C7573i.m23587b(context, "context");
            if (C27606a.f72763a == null) {
                synchronized (C27606a.class) {
                    if (C27606a.f72763a == null) {
                        C27606a.f72763a = new C27606a(context, null);
                    }
                }
            }
            C27606a aVar = C27606a.f72763a;
            if (aVar == null) {
                C7573i.m23580a();
            }
            return aVar;
        }
    }

    /* renamed from: b */
    public static final C27606a m90489b(Context context) {
        return C27607a.m90499a(context);
    }

    /* renamed from: a */
    public final int mo70928a() {
        return this.f72765c.mo70928a();
    }

    /* renamed from: b */
    public final String mo70935b() {
        return this.f72765c.mo70935b();
    }

    /* renamed from: a */
    public final Drawable mo70929a(Context context) {
        return this.f72765c.mo70929a(context);
    }

    private C27606a(Context context) {
        boolean z;
        C27605a aVar;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean disableOnlineSmallEmoji = a.getDisableOnlineSmallEmoji();
            C7573i.m23582a((Object) disableOnlineSmallEmoji, "SettingsReader.get().disableOnlineSmallEmoji");
            z = disableOnlineSmallEmoji.booleanValue();
        } catch (NullValueException unused) {
            z = false;
        }
        if (z || !C27613a.m90534a()) {
            aVar = new C27609b(context);
        } else {
            aVar = new C27612a();
        }
        this.f72765c = aVar;
        StringBuilder sb = new StringBuilder("EmojiResHelper disableOnline=");
        sb.append(z);
        sb.append(", mAdapter=");
        sb.append(this.f72765c);
        C6921a.m21555a(sb.toString());
    }

    /* renamed from: a */
    public final LinkedHashMap<String, Integer> mo70936a(CharSequence charSequence) {
        Integer num;
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        if (TextUtils.isEmpty(charSequence)) {
            return linkedHashMap;
        }
        Matcher matcher = C27608b.f72766a.matcher(charSequence);
        while (matcher.find()) {
            String group = matcher.group();
            if (mo70934a(group)) {
                Integer num2 = (Integer) linkedHashMap.get(group);
                if (num2 == null || num2.intValue() <= 0) {
                    num = Integer.valueOf(1);
                } else {
                    num = Integer.valueOf(num2.intValue() + 1);
                }
                Map map = linkedHashMap;
                C7573i.m23582a((Object) group, "emojiText");
                map.put(group, num);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final boolean mo70934a(String str) {
        return this.f72765c.mo70934a(str);
    }

    public /* synthetic */ C27606a(Context context, C7571f fVar) {
        this(context);
    }

    /* renamed from: a */
    public final Drawable mo70930a(Context context, String str) {
        return this.f72765c.mo70930a(context, str);
    }

    /* renamed from: a */
    public final List<C27517a> mo70931a(int i, int i2) {
        return this.f72765c.mo70931a(i, i2);
    }

    /* renamed from: a */
    public final List<C27517a> mo70932a(List<String> list, int i) {
        return this.f72765c.mo70932a(list, i);
    }

    /* renamed from: a */
    public final void mo70933a(RemoteImageView remoteImageView, C27517a aVar) {
        this.f72765c.mo70933a(remoteImageView, aVar);
    }
}
