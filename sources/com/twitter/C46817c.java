package com.twitter;

import com.twitter.Extractor.Entity;
import java.text.Normalizer;
import java.text.Normalizer.Form;

/* renamed from: com.twitter.c */
public final class C46817c {

    /* renamed from: a */
    public int f120099a = 23;

    /* renamed from: b */
    public int f120100b = 23;

    /* renamed from: c */
    private Extractor f120101c = new Extractor();

    /* renamed from: a */
    public final int mo117892a(String str) {
        int i;
        String normalize = Normalizer.normalize(str, Form.NFC);
        int codePointCount = normalize.codePointCount(0, normalize.length());
        for (Entity entity : this.f120101c.mo117888a(normalize)) {
            int i2 = codePointCount + (entity.f120076a - entity.f120077b);
            if (entity.f120078c.toLowerCase().startsWith("https://")) {
                i = this.f120100b;
            } else {
                i = this.f120099a;
            }
            codePointCount = i2 + i;
        }
        return codePointCount;
    }
}
