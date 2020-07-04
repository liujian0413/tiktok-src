package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b;

import android.icu.text.AlphabeticIndex;
import android.icu.text.AlphabeticIndex.Bucket;
import android.icu.text.AlphabeticIndex.Bucket.LabelType;
import android.icu.text.AlphabeticIndex.ImmutableIndex;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31857ac;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b */
public class C31733b {

    /* renamed from: a */
    private static volatile C31733b f83045a;

    /* renamed from: b */
    private C31739c f83046b;

    /* renamed from: c */
    private Locale f83047c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$a */
    static class C31734a extends C31736c {
        public C31734a(List<Locale> list) {
            super(list);
        }

        /* renamed from: a */
        public final int mo82528a(String str, int i) {
            int c = mo82532c(str.substring(i, i + 1));
            char charAt = str.charAt(i);
            if (i != 0 && Character.isLowerCase(charAt)) {
                c += 26;
            }
            if (c != -1) {
                return c;
            }
            if (C7048a.m21929b(charAt)) {
                return ((mo82531a() + charAt) - 48) + 26;
            }
            if (C7048a.m21931c(charAt)) {
                return mo82531a() + 36;
            }
            if (C7048a.m21927a(str.substring(i))) {
                return 99;
            }
            return mo82531a() + 37;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$b */
    static class C31735b implements C31739c {

        /* renamed from: a */
        private boolean f83048a = C31857ac.m103405d();

        /* renamed from: a */
        public final String mo82529a(String str) {
            return C7048a.m21925a(str, this.f83048a);
        }

        /* renamed from: b */
        public final String mo82530b(String str) {
            return C7048a.m21932d(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$c */
    static class C31736c implements C31739c {

        /* renamed from: a */
        protected final ImmutableIndex f83049a;

        /* renamed from: b */
        private final int f83050b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo82531a() {
            return this.f83050b + 1;
        }

        /* renamed from: b */
        private Bucket m103067b(int i) {
            return this.f83049a.getBucket(i);
        }

        /* renamed from: a */
        private String m103066a(int i) {
            if (i < 0 || i >= mo82531a()) {
                return "#";
            }
            return this.f83049a.getBucket(i).getLabel();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo82532c(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            int bucketIndex = this.f83049a.getBucketIndex(str);
            if (m103067b(bucketIndex).getLabelType() != LabelType.NORMAL) {
                return -1;
            }
            return bucketIndex;
        }

        public C31736c(List<Locale> list) {
            AlphabeticIndex maxLabelCount = new AlphabeticIndex((Locale) list.get(0)).setMaxLabelCount(100);
            for (Locale locale : list) {
                maxLabelCount.addLabels(new Locale[]{locale});
            }
            this.f83049a = maxLabelCount.buildImmutableIndex();
            this.f83050b = this.f83049a.getBucketCount();
        }

        /* renamed from: a */
        public final String mo82529a(String str) {
            if (C7048a.m21927a(str)) {
                return "#";
            }
            return m103066a(mo82532c(str));
        }

        /* renamed from: b */
        public final String mo82530b(String str) {
            int i;
            if (TextUtils.isEmpty(str)) {
                return "0";
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            int i3 = 0;
            while (i2 < 12) {
                if (i3 < str.length()) {
                    i = mo82528a(str, i3);
                } else {
                    i = 0;
                }
                if (i < 10) {
                    sb.append("0");
                }
                if (i == 99) {
                    i3++;
                }
                sb.append(String.valueOf(i));
                i2++;
                i3++;
            }
            return sb.toString();
        }

        /* renamed from: a */
        public int mo82528a(String str, int i) {
            int c = mo82532c(str.substring(i, i + 1));
            if (c != -1) {
                return c;
            }
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                return (mo82531a() + charAt) - 65;
            }
            if (Character.isLowerCase(charAt)) {
                return ((mo82531a() + charAt) - 97) + 26;
            }
            if (C7048a.m21929b(charAt)) {
                return ((mo82531a() + charAt) - 48) + 52;
            }
            if (C7048a.m21931c(charAt)) {
                return mo82531a() + 62;
            }
            if (C7048a.m21927a(str.substring(i))) {
                return 99;
            }
            return mo82531a() + 63;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$d */
    static class C31737d extends C31736c {
        public C31737d(List<Locale> list) {
            super(list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final int mo82532c(String str) {
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            int c = super.mo82532c(str);
            if (c == -1) {
                c = super.mo82532c(C7048a.m21930c(str));
            }
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$e */
    static class C31738e extends C31736c {
        public C31738e(List<Locale> list) {
            super(list);
        }
    }

    private C31733b() {
        m103059b();
    }

    /* renamed from: a */
    public static C31733b m103058a() {
        C31733b bVar = f83045a;
        if (bVar == null) {
            synchronized (C31733b.class) {
                if (bVar == null) {
                    try {
                        bVar = new C31733b();
                        f83045a = bVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: b */
    private void m103059b() {
        this.f83047c = C31857ac.m103402a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f83047c);
        if (VERSION.SDK_INT <= 24) {
            this.f83046b = new C31735b();
        } else if (this.f83047c.getLanguage().equals(Locale.CHINESE.getLanguage())) {
            this.f83046b = new C31734a(arrayList);
        } else if (this.f83047c.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            this.f83046b = new C31734a(arrayList);
        } else if (this.f83047c.getLanguage().equals(Locale.JAPANESE.getLanguage())) {
            arrayList.add(Locale.CHINESE);
            this.f83046b = new C31737d(arrayList);
        } else if (this.f83047c.getLanguage().equals(Locale.KOREAN.getLanguage())) {
            this.f83046b = new C31738e(arrayList);
        } else {
            this.f83046b = new C31736c(arrayList);
        }
    }

    /* renamed from: a */
    public final String mo82525a(String str) {
        return this.f83046b.mo82529a(str);
    }

    /* renamed from: b */
    public final String mo82527b(String str) {
        return this.f83046b.mo82530b(str);
    }

    /* renamed from: a */
    public final void mo82526a(Locale locale) {
        if (!TextUtils.equals(this.f83047c.getLanguage(), locale.getLanguage())) {
            m103059b();
        }
    }
}
