package com.p280ss.android.download;

/* renamed from: com.ss.android.download.o */
final class C19436o extends Exception {
    private static final long serialVersionUID = -2378731952523070735L;

    /* renamed from: a */
    private final int f52617a;

    /* renamed from: a */
    public final int mo51475a() {
        return this.f52617a;
    }

    public C19436o(int i, String str) {
        super(str);
        this.f52617a = i;
    }

    public C19436o(int i, Throwable th) {
        super(th);
        this.f52617a = i;
    }

    /* renamed from: a */
    public static C19436o m63911a(int i, String str) throws C19436o {
        StringBuilder sb = new StringBuilder("Unhandled HTTP response: ");
        sb.append(i);
        sb.append(" ");
        sb.append(str);
        String sb2 = sb.toString();
        if (i >= 400 && i < 600) {
            throw new C19436o(i, sb2);
        } else if (i < 300 || i >= 400) {
            throw new C19436o(494, sb2);
        } else {
            throw new C19436o(493, sb2);
        }
    }

    public C19436o(int i, String str, Throwable th) {
        super(str, th);
        this.f52617a = i;
    }
}
