package com.p280ss.android.ugc.aweme.tools.music.lrc;

import android.text.TextPaint;
import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.a */
public final class C42450a {

    /* renamed from: d */
    public static final C42451a f110349d = new C42451a(null);
    @C6593c(mo15949a = "timeId")

    /* renamed from: a */
    public float f110350a = 0.0f;
    @C6593c(mo15949a = "text")

    /* renamed from: b */
    public String f110351b;

    /* renamed from: c */
    public float f110352c;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.a$a */
    public static final class C42451a {
        private C42451a() {
        }

        public /* synthetic */ C42451a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static List<C42450a> m134909a(List<C42450a> list, TextPaint textPaint) {
            C7573i.m23587b(textPaint, "paint");
            if (list == null) {
                return null;
            }
            int i = 0;
            while (i < list.size()) {
                int i2 = i + 1;
                if (i2 < list.size() && ((C42450a) list.get(i)).f110350a == ((C42450a) list.get(i2)).f110350a) {
                    C42450a aVar = (C42450a) list.get(i);
                    StringBuilder sb = new StringBuilder();
                    sb.append(((C42450a) list.get(i)).f110351b);
                    sb.append(" ");
                    sb.append(((C42450a) list.get(i2)).f110351b);
                    aVar.f110351b = sb.toString();
                    list.remove(i2);
                    i--;
                }
                i++;
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((C42450a) list.get(i3)).f110352c = textPaint.measureText(((C42450a) list.get(i3)).f110351b) + 15.0f;
            }
            return list;
        }
    }

    public C42450a(float f, String str) {
        C7573i.m23587b(str, "text");
        this.f110351b = str;
    }
}
