package com.p280ss.android.ugc.iesdownload;

/* renamed from: com.ss.android.ugc.iesdownload.c */
public final class C44850c {

    /* renamed from: a */
    public int f115334a;

    /* renamed from: b */
    public String f115335b;

    private C44850c() {
    }

    /* renamed from: a */
    public static C44850c m141527a() {
        return new C44850c();
    }

    /* renamed from: a */
    public final C44850c mo107290a(String str) {
        this.f115335b = str;
        return this;
    }

    /* renamed from: a */
    public final C44850c mo107289a(int i) {
        this.f115334a = i;
        m141528b(i);
        return this;
    }

    /* renamed from: b */
    private String m141528b(int i) {
        switch (i) {
            case 1:
                mo107290a("the context is null or not valid!");
                break;
            case 2:
                mo107290a("the download url or filePath is not valid!");
                break;
            case 3:
                mo107290a("the download request is repeat!");
                break;
            case 4:
                mo107290a("the download request is complete!");
                break;
            case 5:
                mo107290a("okHttp onResponse fail!");
                break;
            case 6:
                mo107290a("okHttp onFailure!");
                break;
            case 7:
                mo107290a("okHttp io error!");
                break;
            case 8:
                mo107290a("android storage memory size is too low");
                break;
            default:
                mo107290a("unknown error!");
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f115335b);
        sb.append("     errorCode: ");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final C44850c mo107291a(String str, String str2) {
        StringBuilder sb = new StringBuilder("the download url [");
        sb.append(str);
        sb.append("] or filePath [ ");
        sb.append(str2);
        sb.append("] is not valid!");
        this.f115335b = sb.toString();
        return this;
    }
}
