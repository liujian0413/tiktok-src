package com.bytedance.ies.settings;

/* renamed from: com.bytedance.ies.settings.b */
public final class C10939b {
    /* renamed from: a */
    public static MissingRequiredFieldsException m32101a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        int length = objArr.length;
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        StringBuilder sb2 = new StringBuilder("Required field");
        sb2.append(str);
        sb2.append(" not set:");
        sb2.append(sb);
        throw new MissingRequiredFieldsException(sb2.toString());
    }
}
