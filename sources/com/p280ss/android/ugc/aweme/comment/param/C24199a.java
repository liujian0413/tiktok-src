package com.p280ss.android.ugc.aweme.comment.param;

import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.param.a */
public abstract class C24199a {

    /* renamed from: a */
    public String f63864a;

    /* renamed from: b */
    public String f63865b;

    /* renamed from: c */
    public String f63866c;

    /* renamed from: d */
    public List<? extends TextExtraStruct> f63867d;

    /* renamed from: e */
    public String f63868e;

    /* renamed from: f */
    public Emoji f63869f;

    /* renamed from: g */
    public int f63870g = -1;

    /* renamed from: h */
    public String f63871h;

    /* renamed from: i */
    public String f63872i;

    /* renamed from: com.ss.android.ugc.aweme.comment.param.a$a */
    public static abstract class C24200a<T extends C24199a, B extends C24200a<T, B>> {

        /* renamed from: a */
        public String f63873a;

        /* renamed from: b */
        public String f63874b;

        /* renamed from: c */
        public String f63875c;

        /* renamed from: d */
        public List<? extends TextExtraStruct> f63876d;

        /* renamed from: e */
        public String f63877e;

        /* renamed from: f */
        public Emoji f63878f;

        /* renamed from: g */
        public int f63879g = -1;

        /* renamed from: h */
        public String f63880h;

        /* renamed from: a */
        public abstract B mo62890a();

        /* renamed from: a */
        public final B mo62891a(int i) {
            this.f63879g = i;
            return mo62890a();
        }

        /* renamed from: b */
        public final B mo62895b(String str) {
            this.f63874b = str;
            return mo62890a();
        }

        /* renamed from: c */
        public final B mo62896c(String str) {
            this.f63875c = str;
            return mo62890a();
        }

        /* renamed from: d */
        public final B mo62897d(String str) {
            this.f63877e = str;
            return mo62890a();
        }

        /* renamed from: e */
        public final B mo62898e(String str) {
            this.f63880h = str;
            return mo62890a();
        }

        /* renamed from: a */
        public final B mo62892a(Emoji emoji) {
            this.f63878f = emoji;
            return mo62890a();
        }

        /* renamed from: a */
        public final B mo62893a(String str) {
            this.f63873a = str;
            return mo62890a();
        }

        /* renamed from: a */
        public final B mo62894a(List<? extends TextExtraStruct> list) {
            this.f63876d = list;
            return mo62890a();
        }
    }
}
