package com.appsflyer.cache;

import java.util.Scanner;

public class RequestCacheData {

    /* renamed from: ˊ */
    public String f6779;

    /* renamed from: ˎ */
    public String f6780;

    /* renamed from: ˏ */
    public String f6781;

    /* renamed from: ॱ */
    public String f6782;

    public RequestCacheData(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f6781 = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f6782 = nextLine.substring(8).trim();
            } else if (nextLine.startsWith("data=")) {
                this.f6780 = nextLine.substring(5).trim();
            }
        }
        scanner.close();
    }

    public RequestCacheData(String str, String str2, String str3) {
        this.f6781 = str;
        this.f6780 = str2;
        this.f6782 = str3;
    }
}
