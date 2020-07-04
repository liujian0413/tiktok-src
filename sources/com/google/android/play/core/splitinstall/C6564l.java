package com.google.android.play.core.splitinstall;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.splitinstall.l */
final class C6564l {

    /* renamed from: a */
    private final XmlPullParser f18883a;

    /* renamed from: b */
    private final C17142o f18884b = new C17142o();

    C6564l(XmlPullParser xmlPullParser) {
        this.f18883a = xmlPullParser;
    }

    /* renamed from: a */
    private final String m20389a(String str) {
        for (int i = 0; i < this.f18883a.getAttributeCount(); i++) {
            if (this.f18883a.getAttributeName(i).equals(str)) {
                return this.f18883a.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    private final void m20390b() throws IOException, XmlPullParserException {
        int i = 1;
        while (i != 0) {
            switch (this.f18883a.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C6565m mo15929a() {
        while (this.f18883a.next() != 1) {
            try {
                if (this.f18883a.getEventType() == 2) {
                    if (this.f18883a.getName().equals("splits")) {
                        while (this.f18883a.next() != 3) {
                            if (this.f18883a.getEventType() == 2) {
                                if (this.f18883a.getName().equals("module")) {
                                    String a = m20389a("name");
                                    if (a != null) {
                                        while (this.f18883a.next() != 3) {
                                            if (this.f18883a.getEventType() == 2) {
                                                if (this.f18883a.getName().equals("language")) {
                                                    while (this.f18883a.next() != 3) {
                                                        if (this.f18883a.getEventType() == 2) {
                                                            if (this.f18883a.getName().equals("entry")) {
                                                                String a2 = m20389a("key");
                                                                String a3 = m20389a("split");
                                                                m20390b();
                                                                if (!(a2 == null || a3 == null)) {
                                                                    this.f18884b.mo44414a(a, a2, a3);
                                                                }
                                                            } else {
                                                                m20390b();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    m20390b();
                                                }
                                            }
                                        }
                                    }
                                }
                                m20390b();
                            }
                        }
                    } else {
                        m20390b();
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                return null;
            }
        }
        return this.f18884b.mo44413a();
    }
}
