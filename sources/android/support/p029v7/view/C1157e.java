package android.support.p029v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.p022v4.view.C0958b;
import android.support.p022v4.view.C0977i;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.support.p029v7.view.menu.MenuItemWrapperICS;
import android.support.p029v7.widget.C1433w;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.view.e */
public final class C1157e extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f4158a;

    /* renamed from: b */
    static final Class<?>[] f4159b;

    /* renamed from: c */
    final Object[] f4160c;

    /* renamed from: d */
    final Object[] f4161d = this.f4160c;

    /* renamed from: e */
    Context f4162e;

    /* renamed from: f */
    private Object f4163f;

    /* renamed from: android.support.v7.view.e$a */
    static class C1158a implements OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f4164a = {MenuItem.class};

        /* renamed from: b */
        private Object f4165b;

        /* renamed from: c */
        private Method f4166c;

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f4166c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f4166c.invoke(this.f4165b, new Object[]{menuItem})).booleanValue();
                }
                this.f4166c.invoke(this.f4165b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public C1158a(Object obj, String str) {
            this.f4165b = obj;
            Class cls = obj.getClass();
            try {
                this.f4166c = cls.getMethod(str, f4164a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
    }

    /* renamed from: android.support.v7.view.e$b */
    class C1159b {

        /* renamed from: A */
        private String f4167A;

        /* renamed from: B */
        private String f4168B;

        /* renamed from: C */
        private CharSequence f4169C;

        /* renamed from: D */
        private CharSequence f4170D;

        /* renamed from: E */
        private ColorStateList f4171E;

        /* renamed from: F */
        private Mode f4172F;

        /* renamed from: a */
        public boolean f4173a;

        /* renamed from: b */
        C0958b f4174b;

        /* renamed from: d */
        private Menu f4176d;

        /* renamed from: e */
        private int f4177e;

        /* renamed from: f */
        private int f4178f;

        /* renamed from: g */
        private int f4179g;

        /* renamed from: h */
        private int f4180h;

        /* renamed from: i */
        private boolean f4181i;

        /* renamed from: j */
        private boolean f4182j;

        /* renamed from: k */
        private int f4183k;

        /* renamed from: l */
        private int f4184l;

        /* renamed from: m */
        private CharSequence f4185m;

        /* renamed from: n */
        private CharSequence f4186n;

        /* renamed from: o */
        private int f4187o;

        /* renamed from: p */
        private char f4188p;

        /* renamed from: q */
        private int f4189q;

        /* renamed from: r */
        private char f4190r;

        /* renamed from: s */
        private int f4191s;

        /* renamed from: t */
        private int f4192t;

        /* renamed from: u */
        private boolean f4193u;

        /* renamed from: v */
        private boolean f4194v;

        /* renamed from: w */
        private boolean f4195w;

        /* renamed from: x */
        private int f4196x;

        /* renamed from: y */
        private int f4197y;

        /* renamed from: z */
        private String f4198z;

        /* renamed from: b */
        public final void mo4590b() {
            this.f4173a = true;
            m5150a(this.f4176d.add(this.f4177e, this.f4183k, this.f4184l, this.f4185m));
        }

        /* renamed from: c */
        public final SubMenu mo4592c() {
            this.f4173a = true;
            SubMenu addSubMenu = this.f4176d.addSubMenu(this.f4177e, this.f4183k, this.f4184l, this.f4185m);
            m5150a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: a */
        public final void mo4588a() {
            this.f4177e = 0;
            this.f4178f = 0;
            this.f4179g = 0;
            this.f4180h = 0;
            this.f4181i = true;
            this.f4182j = true;
        }

        /* renamed from: a */
        private static char m5148a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        public final void mo4589a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1157e.this.f4162e.obtainStyledAttributes(attributeSet, R$styleable.MenuGroup);
            this.f4177e = obtainStyledAttributes.getResourceId(1, 0);
            this.f4178f = obtainStyledAttributes.getInt(3, 0);
            this.f4179g = obtainStyledAttributes.getInt(4, 0);
            this.f4180h = obtainStyledAttributes.getInt(5, 0);
            this.f4181i = obtainStyledAttributes.getBoolean(2, true);
            this.f4182j = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m5150a(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f4193u).setVisible(this.f4194v).setEnabled(this.f4195w);
            boolean z2 = false;
            if (this.f4192t > 0) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f4186n).setIcon(this.f4187o);
            if (this.f4196x >= 0) {
                menuItem.setShowAsAction(this.f4196x);
            }
            if (this.f4168B != null) {
                if (!C1157e.this.f4162e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C1158a(C1157e.this.mo4585a(), this.f4168B));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f4192t >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).mo4758a(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).mo4812a(true);
                }
            }
            if (this.f4198z != null) {
                menuItem.setActionView((View) m5149a(this.f4198z, C1157e.f4158a, C1157e.this.f4160c));
                z2 = true;
            }
            if (this.f4197y > 0 && !z2) {
                menuItem.setActionView(this.f4197y);
            }
            if (this.f4174b != null) {
                C0977i.m4122a(menuItem, this.f4174b);
            }
            C0977i.m4126a(menuItem, this.f4169C);
            C0977i.m4128b(menuItem, this.f4170D);
            C0977i.m4127b(menuItem, this.f4188p, this.f4189q);
            C0977i.m4123a(menuItem, this.f4190r, this.f4191s);
            if (this.f4172F != null) {
                C0977i.m4125a(menuItem, this.f4172F);
            }
            if (this.f4171E != null) {
                C0977i.m4124a(menuItem, this.f4171E);
            }
        }

        /* renamed from: b */
        public final void mo4591b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1157e.this.f4162e.obtainStyledAttributes(attributeSet, R$styleable.MenuItem);
            this.f4183k = obtainStyledAttributes.getResourceId(2, 0);
            this.f4184l = (obtainStyledAttributes.getInt(5, this.f4178f) & -65536) | (obtainStyledAttributes.getInt(6, this.f4179g) & 65535);
            this.f4185m = obtainStyledAttributes.getText(7);
            this.f4186n = obtainStyledAttributes.getText(8);
            this.f4187o = obtainStyledAttributes.getResourceId(0, 0);
            this.f4188p = m5148a(obtainStyledAttributes.getString(9));
            this.f4189q = obtainStyledAttributes.getInt(16, 4096);
            this.f4190r = m5148a(obtainStyledAttributes.getString(10));
            this.f4191s = obtainStyledAttributes.getInt(20, 4096);
            if (obtainStyledAttributes.hasValue(11)) {
                this.f4192t = obtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
            } else {
                this.f4192t = this.f4180h;
            }
            this.f4193u = obtainStyledAttributes.getBoolean(3, false);
            this.f4194v = obtainStyledAttributes.getBoolean(4, this.f4181i);
            boolean z = true;
            this.f4195w = obtainStyledAttributes.getBoolean(1, this.f4182j);
            this.f4196x = obtainStyledAttributes.getInt(21, -1);
            this.f4168B = obtainStyledAttributes.getString(12);
            this.f4197y = obtainStyledAttributes.getResourceId(13, 0);
            this.f4198z = obtainStyledAttributes.getString(15);
            this.f4167A = obtainStyledAttributes.getString(14);
            if (this.f4167A == null) {
                z = false;
            }
            if (z && this.f4197y == 0 && this.f4198z == null) {
                this.f4174b = (C0958b) m5149a(this.f4167A, C1157e.f4159b, C1157e.this.f4161d);
            } else {
                this.f4174b = null;
            }
            this.f4169C = obtainStyledAttributes.getText(17);
            this.f4170D = obtainStyledAttributes.getText(22);
            if (obtainStyledAttributes.hasValue(19)) {
                this.f4172F = C1433w.m7200a(obtainStyledAttributes.getInt(19, -1), this.f4172F);
            } else {
                this.f4172F = null;
            }
            if (obtainStyledAttributes.hasValue(18)) {
                this.f4171E = obtainStyledAttributes.getColorStateList(18);
            } else {
                this.f4171E = null;
            }
            obtainStyledAttributes.recycle();
            this.f4173a = false;
        }

        public C1159b(Menu menu) {
            this.f4176d = menu;
            mo4588a();
        }

        /* renamed from: a */
        private <T> T m5149a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = C1157e.this.f4162e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f4158a = clsArr;
        f4159b = clsArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo4585a() {
        if (this.f4163f == null) {
            this.f4163f = m5145a(this.f4162e);
        }
        return this.f4163f;
    }

    public C1157e(Context context) {
        super(context);
        this.f4162e = context;
        this.f4160c = new Object[]{context};
    }

    /* renamed from: a */
    private Object m5145a(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(int r3, android.view.Menu r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof android.support.p022v4.internal.view.C0745a
            if (r0 != 0) goto L_0x0008
            super.inflate(r3, r4)
            return
        L_0x0008:
            r0 = 0
            android.content.Context r1 = r2.f4162e     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x002c }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x002c }
            android.content.res.XmlResourceParser r3 = r1.getLayout(r3)     // Catch:{ XmlPullParserException -> 0x0035, IOException -> 0x002c }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0024, all -> 0x0021 }
            r2.m5146a(r3, r0, r4)     // Catch:{ XmlPullParserException -> 0x0027, IOException -> 0x0024, all -> 0x0021 }
            if (r3 == 0) goto L_0x0020
            r3.close()
            return
        L_0x0020:
            return
        L_0x0021:
            r4 = move-exception
            r0 = r3
            goto L_0x003e
        L_0x0024:
            r4 = move-exception
            r0 = r3
            goto L_0x002d
        L_0x0027:
            r4 = move-exception
            r0 = r3
            goto L_0x0036
        L_0x002a:
            r4 = move-exception
            goto L_0x003e
        L_0x002c:
            r4 = move-exception
        L_0x002d:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x0035:
            r4 = move-exception
        L_0x0036:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x002a }
            throw r3     // Catch:{ all -> 0x002a }
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()
        L_0x0043:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.view.C1157e.inflate(int, android.view.Menu):void");
    }

    /* renamed from: a */
    private void m5146a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C1159b bVar = new C1159b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (z2) {
                        break;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if (!name2.equals("group")) {
                            if (!name2.equals("item")) {
                                if (!name2.equals("menu")) {
                                    str = name2;
                                    z2 = true;
                                    break;
                                } else {
                                    m5146a(xmlPullParser, attributeSet, bVar.mo4592c());
                                    break;
                                }
                            } else {
                                bVar.mo4591b(attributeSet);
                                break;
                            }
                        } else {
                            bVar.mo4589a(attributeSet);
                            break;
                        }
                    }
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (!z2 || !name3.equals(str)) {
                        if (!name3.equals("group")) {
                            if (!name3.equals("item")) {
                                if (!name3.equals("menu")) {
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else if (!bVar.f4173a) {
                                if (bVar.f4174b != null && bVar.f4174b.mo3737e()) {
                                    bVar.mo4592c();
                                    break;
                                } else {
                                    bVar.mo4590b();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            bVar.mo4588a();
                            break;
                        }
                    } else {
                        str = null;
                        z2 = false;
                        break;
                    }
            }
            i = xmlPullParser.next();
        }
    }
}
