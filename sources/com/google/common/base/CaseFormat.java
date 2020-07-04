package com.google.common.base;

import java.io.Serializable;

public enum CaseFormat {
    LOWER_HYPHEN(C17405d.m57891a('-'), "-") {
        /* access modifiers changed from: 0000 */
        public final String normalizeWord(String str) {
            return C17404c.m57886a(str);
        }

        /* access modifiers changed from: 0000 */
        public final String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            if (caseFormat == UPPER_UNDERSCORE) {
                return C17404c.m57887b(str.replace('-', '_'));
            }
            return CaseFormat.super.convert(caseFormat, str);
        }
    },
    LOWER_UNDERSCORE(C17405d.m57891a('_'), "_") {
        /* access modifiers changed from: 0000 */
        public final String normalizeWord(String str) {
            return C17404c.m57886a(str);
        }

        /* access modifiers changed from: 0000 */
        public final String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == LOWER_HYPHEN) {
                return str.replace('_', '-');
            }
            if (caseFormat == UPPER_UNDERSCORE) {
                return C17404c.m57887b(str);
            }
            return CaseFormat.super.convert(caseFormat, str);
        }
    },
    LOWER_CAMEL(C17405d.m57892a('A', 'Z'), "") {
        /* access modifiers changed from: 0000 */
        public final String normalizeWord(String str) {
            return CaseFormat.firstCharOnlyToUpper(str);
        }
    },
    UPPER_CAMEL(C17405d.m57892a('A', 'Z'), "") {
        /* access modifiers changed from: 0000 */
        public final String normalizeWord(String str) {
            return CaseFormat.firstCharOnlyToUpper(str);
        }
    },
    UPPER_UNDERSCORE(C17405d.m57891a('_'), "_") {
        /* access modifiers changed from: 0000 */
        public final String normalizeWord(String str) {
            return C17404c.m57887b(str);
        }

        /* access modifiers changed from: 0000 */
        public final String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == LOWER_HYPHEN) {
                return C17404c.m57886a(str.replace('_', '-'));
            }
            if (caseFormat == LOWER_UNDERSCORE) {
                return C17404c.m57886a(str);
            }
            return CaseFormat.super.convert(caseFormat, str);
        }
    };
    
    private final C17405d wordBoundary;
    private final String wordSeparator;

    /* renamed from: com.google.common.base.CaseFormat$a */
    static final class C17394a extends C17425e<String, String> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final CaseFormat f48335a;

        /* renamed from: b */
        private final CaseFormat f48336b;

        public final int hashCode() {
            return this.f48335a.hashCode() ^ this.f48336b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f48335a);
            sb.append(".converterTo(");
            sb.append(this.f48336b);
            sb.append(")");
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String mo44877a(String str) {
            return this.f48335a.mo44876to(this.f48336b, str);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C17394a)) {
                return false;
            }
            C17394a aVar = (C17394a) obj;
            if (!this.f48335a.equals(aVar.f48335a) || !this.f48336b.equals(aVar.f48336b)) {
                return false;
            }
            return true;
        }

        C17394a(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.f48335a = (CaseFormat) C17439m.m57962a(caseFormat);
            this.f48336b = (CaseFormat) C17439m.m57962a(caseFormat2);
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract String normalizeWord(String str);

    public C17425e<String, String> converterTo(CaseFormat caseFormat) {
        return new C17394a(this, caseFormat);
    }

    private String normalizeFirstWord(String str) {
        if (this == LOWER_CAMEL) {
            return C17404c.m57886a(str);
        }
        return normalizeWord(str);
    }

    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C17404c.m57885a(str.charAt(0)));
        sb.append(C17404c.m57886a(str.substring(1)));
        return sb.toString();
    }

    /* renamed from: to */
    public final String mo44876to(CaseFormat caseFormat, String str) {
        C17439m.m57962a(caseFormat);
        C17439m.m57962a(str);
        if (caseFormat == this) {
            return str;
        }
        return convert(caseFormat, str);
    }

    /* access modifiers changed from: 0000 */
    public String convert(CaseFormat caseFormat, String str) {
        int i = 0;
        StringBuilder sb = null;
        int i2 = -1;
        while (true) {
            i2 = this.wordBoundary.mo44909a((CharSequence) str, i2 + 1);
            if (i2 == -1) {
                break;
            }
            if (i == 0) {
                sb = new StringBuilder(str.length() + (this.wordSeparator.length() * 4));
                sb.append(caseFormat.normalizeFirstWord(str.substring(i, i2)));
            } else {
                sb.append(caseFormat.normalizeWord(str.substring(i, i2)));
            }
            sb.append(caseFormat.wordSeparator);
            i = this.wordSeparator.length() + i2;
        }
        if (i == 0) {
            return caseFormat.normalizeFirstWord(str);
        }
        sb.append(caseFormat.normalizeWord(str.substring(i)));
        return sb.toString();
    }

    private CaseFormat(C17405d dVar, String str) {
        this.wordBoundary = dVar;
        this.wordSeparator = str;
    }
}
