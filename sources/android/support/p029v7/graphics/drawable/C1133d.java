package android.support.p029v7.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.content.res.C0704f;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.graphics.drawable.d */
class C1133d extends C1127a {

    /* renamed from: b */
    public C1134a f4082b;

    /* renamed from: c */
    private boolean f4083c;

    /* renamed from: android.support.v7.graphics.drawable.d$a */
    static class C1134a extends C1130b {

        /* renamed from: L */
        int[][] f4084L;

        public Drawable newDrawable() {
            return new C1133d(this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4460a() {
            int[] iArr;
            int[][] iArr2 = new int[this.f4084L.length][];
            for (int length = this.f4084L.length - 1; length >= 0; length--) {
                if (this.f4084L[length] != null) {
                    iArr = (int[]) this.f4084L[length].clone();
                } else {
                    iArr = null;
                }
                iArr2[length] = iArr;
            }
            this.f4084L = iArr2;
        }

        public Drawable newDrawable(Resources resources) {
            return new C1133d(this, resources);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo4534b(int[] iArr) {
            int[][] iArr2 = this.f4084L;
            int i = this.f4051j;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo4533a(int[] iArr, Drawable drawable) {
            int a = mo4480a(drawable);
            this.f4084L[a] = iArr;
            return a;
        }

        /* renamed from: e */
        public final void mo4490e(int i, int i2) {
            super.mo4490e(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f4084L, 0, iArr, 0, i);
            this.f4084L = iArr;
        }

        C1134a(C1134a aVar, C1133d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f4084L = aVar.f4084L;
            } else {
                this.f4084L = new int[mo4485c()][];
            }
        }
    }

    public boolean isStateful() {
        return true;
    }

    C1133d() {
        this(null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1134a mo4420b() {
        return new C1134a(this.f4082b, this, null);
    }

    public Drawable mutate() {
        if (!this.f4083c && super.mutate() == this) {
            this.f4082b.mo4460a();
            this.f4083c = true;
        }
        return this;
    }

    C1133d(C1134a aVar) {
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4418a(C1130b bVar) {
        super.mo4418a(bVar);
        if (bVar instanceof C1134a) {
            this.f4082b = (C1134a) bVar;
        }
    }

    /* renamed from: a */
    private void m5029a(TypedArray typedArray) {
        C1134a aVar = this.f4082b;
        if (VERSION.SDK_INT >= 21) {
            aVar.f4047f |= typedArray.getChangingConfigurations();
        }
        aVar.f4052k = typedArray.getBoolean(2, aVar.f4052k);
        aVar.f4055n = typedArray.getBoolean(3, aVar.f4055n);
        aVar.f4035C = typedArray.getInt(4, aVar.f4035C);
        aVar.f4036D = typedArray.getInt(5, aVar.f4036D);
        aVar.f4067z = typedArray.getBoolean(0, aVar.f4067z);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.f4082b.mo4534b(iArr);
        if (b < 0) {
            b = this.f4082b.mo4534b(StateSet.WILD_CARD);
        }
        if (mo4470a(b) || onStateChange) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static int[] m5030a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    C1133d(C1134a aVar, Resources resources) {
        mo4418a((C1130b) new C1134a(aVar, this, resources));
        onStateChange(getState());
    }

    /* renamed from: b */
    public void mo4421b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C0704f.m2990a(resources, theme, attributeSet, R$styleable.StateListDrawable);
        setVisible(a.getBoolean(1, true), true);
        m5029a(a);
        mo4468a(resources);
        a.recycle();
        m5028a(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    /* renamed from: a */
    private void m5028a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        C1134a aVar = this.f4082b;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next2 == 3) {
                    return;
                }
                if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                    TypedArray a = C0704f.m2990a(resources, theme, attributeSet, R$styleable.StateListDrawableItem);
                    Drawable drawable = null;
                    int resourceId = a.getResourceId(0, -1);
                    if (resourceId > 0) {
                        drawable = C1065a.m4641b(context, resourceId);
                    }
                    a.recycle();
                    int[] a2 = m5030a(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(xmlPullParser.getPositionDescription());
                            sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            throw new XmlPullParserException(sb.toString());
                        } else if (VERSION.SDK_INT >= 21) {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    aVar.mo4533a(a2, drawable);
                }
            } else {
                return;
            }
        }
    }
}
