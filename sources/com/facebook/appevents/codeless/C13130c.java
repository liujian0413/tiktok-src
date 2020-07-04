package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.AdapterView;
import com.facebook.C13499h;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.C13123a.C13125a;
import com.facebook.appevents.codeless.C13134d.C13135a;
import com.facebook.appevents.codeless.internal.C13145a;
import com.facebook.appevents.codeless.internal.C13148d;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType;
import com.facebook.internal.C13924n;
import com.facebook.internal.C13926o;
import com.facebook.internal.C13946r;
import com.facebook.internal.C13967z;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.facebook.appevents.codeless.c */
class C13130c {

    /* renamed from: a */
    public static final String f34779a = C13130c.class.getCanonicalName();

    /* renamed from: g */
    private static C13130c f34780g = null;

    /* renamed from: b */
    private final Handler f34781b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private Set<Activity> f34782c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d */
    private Set<C13133b> f34783d = new HashSet();

    /* renamed from: e */
    private HashSet<String> f34784e = new HashSet<>();

    /* renamed from: f */
    private HashMap<Integer, HashSet<String>> f34785f = new HashMap<>();

    /* renamed from: com.facebook.appevents.codeless.c$a */
    public static class C13132a {

        /* renamed from: a */
        public String f34787a;

        /* renamed from: b */
        private WeakReference<View> f34788b;

        /* renamed from: a */
        public final View mo32305a() {
            if (this.f34788b == null) {
                return null;
            }
            return (View) this.f34788b.get();
        }

        public C13132a(View view, String str) {
            this.f34788b = new WeakReference<>(view);
            this.f34787a = str;
        }
    }

    /* renamed from: com.facebook.appevents.codeless.c$b */
    protected static class C13133b implements OnGlobalLayoutListener, OnScrollChangedListener, Runnable {

        /* renamed from: a */
        private WeakReference<View> f34789a;

        /* renamed from: b */
        private List<EventBinding> f34790b;

        /* renamed from: c */
        private final Handler f34791c;

        /* renamed from: d */
        private HashSet<String> f34792d;

        /* renamed from: e */
        private final String f34793e;

        public final void onGlobalLayout() {
            m38399a();
        }

        public final void onScrollChanged() {
            m38399a();
        }

        /* renamed from: a */
        private void m38399a() {
            if (this.f34790b != null && this.f34789a.get() != null) {
                for (int i = 0; i < this.f34790b.size(); i++) {
                    m38401a((EventBinding) this.f34790b.get(i), (View) this.f34789a.get());
                }
            }
        }

        public final void run() {
            C13924n a = C13926o.m41097a(C13499h.m39725k());
            if (a != null && a.f36848l) {
                this.f34790b = EventBinding.m38415a(a.f36850n);
                if (this.f34790b != null) {
                    View view = (View) this.f34789a.get();
                    if (view != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        m38399a();
                    }
                }
            }
        }

        /* renamed from: a */
        private static List<View> m38397a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private void m38401a(EventBinding eventBinding, View view) {
            if (eventBinding != null && view != null) {
                if (TextUtils.isEmpty(eventBinding.f34822g) || eventBinding.f34822g.equals(this.f34793e)) {
                    List a = eventBinding.mo32320a();
                    if (a.size() <= 25) {
                        for (C13132a a2 : m38398a(eventBinding, view, a, 0, -1, this.f34793e)) {
                            m38400a(a2, view, eventBinding);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        private void m38403b(C13132a aVar, View view, EventBinding eventBinding) {
            boolean z;
            View a = aVar.mo32305a();
            if (a != null) {
                String str = aVar.f34787a;
                OnClickListener d = C13148d.m38435d(a);
                if (!(d instanceof C13125a) || !((C13125a) d).f34761a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f34792d.contains(str) && !z) {
                    a.setOnClickListener(C13123a.m38377a(eventBinding, view, a));
                    this.f34792d.add(str);
                }
            }
        }

        /* renamed from: c */
        private void m38404c(C13132a aVar, View view, EventBinding eventBinding) {
            boolean z;
            View a = aVar.mo32305a();
            if (a != null) {
                String str = aVar.f34787a;
                OnTouchListener e = C13148d.m38436e(a);
                if (!(e instanceof C13135a) || !((C13135a) e).f34795a) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f34792d.contains(str) && !z) {
                    a.setOnTouchListener(C13134d.m38405a(eventBinding, view, a));
                    this.f34792d.add(str);
                }
            }
        }

        /* renamed from: a */
        private void m38400a(C13132a aVar, View view, EventBinding eventBinding) {
            if (eventBinding != null) {
                try {
                    View a = aVar.mo32305a();
                    if (a != null) {
                        View f = C13148d.m38437f(a);
                        if (f != null && C13148d.m38432a(a, f)) {
                            m38404c(aVar, view, eventBinding);
                        } else if (!a.getClass().getName().startsWith("com.facebook.react") && !(a instanceof AdapterView)) {
                            m38403b(aVar, view, eventBinding);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: a */
        private static boolean m38402a(View view, PathComponent pathComponent, int i) {
            String str;
            String str2;
            if (pathComponent.f34826b != -1 && i != pathComponent.f34826b) {
                return false;
            }
            if (!view.getClass().getCanonicalName().equals(pathComponent.f34825a)) {
                if (!pathComponent.f34825a.matches(".*android\\..*")) {
                    return false;
                }
                String[] split = pathComponent.f34825a.split("\\.");
                if (split.length <= 0) {
                    return false;
                }
                if (!view.getClass().getSimpleName().equals(split[split.length - 1])) {
                    return false;
                }
            }
            if ((pathComponent.f34832h & MatchBitmaskType.ID.getValue()) > 0 && pathComponent.f34827c != view.getId()) {
                return false;
            }
            if ((pathComponent.f34832h & MatchBitmaskType.TEXT.getValue()) > 0) {
                String str3 = pathComponent.f34828d;
                String b = C13148d.m38433b(view);
                String a = C13967z.m41222a(C13967z.m41262c(b), "");
                if (!str3.equals(b) && !str3.equals(a)) {
                    return false;
                }
            }
            if ((pathComponent.f34832h & MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                String str4 = pathComponent.f34830f;
                if (view.getContentDescription() == null) {
                    str2 = "";
                } else {
                    str2 = String.valueOf(view.getContentDescription());
                }
                String a2 = C13967z.m41222a(C13967z.m41262c(str2), "");
                if (!str4.equals(str2) && !str4.equals(a2)) {
                    return false;
                }
            }
            if ((pathComponent.f34832h & MatchBitmaskType.HINT.getValue()) > 0) {
                String str5 = pathComponent.f34831g;
                String c = C13148d.m38434c(view);
                String a3 = C13967z.m41222a(C13967z.m41262c(c), "");
                if (!str5.equals(c) && !str5.equals(a3)) {
                    return false;
                }
            }
            if ((pathComponent.f34832h & MatchBitmaskType.TAG.getValue()) > 0) {
                String str6 = pathComponent.f34829e;
                if (view.getTag() == null) {
                    str = "";
                } else {
                    str = String.valueOf(view.getTag());
                }
                String a4 = C13967z.m41222a(C13967z.m41262c(str), "");
                if (str6.equals(str) || str6.equals(a4)) {
                    return true;
                }
                return false;
            }
            return true;
        }

        public C13133b(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f34789a = new WeakReference<>(view);
            this.f34791c = handler;
            this.f34792d = hashSet;
            this.f34793e = str;
            this.f34791c.postDelayed(this, 200);
        }

        /* renamed from: a */
        public static List<C13132a> m38398a(EventBinding eventBinding, View view, List<PathComponent> list, int i, int i2, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(String.valueOf(i2));
            String sb2 = sb.toString();
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new C13132a(view, sb2));
            } else {
                PathComponent pathComponent = (PathComponent) list.get(i);
                if (pathComponent.f34825a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List a = m38397a((ViewGroup) parent);
                        int size = a.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(m38398a(eventBinding, (View) a.get(i3), list, i + 1, i3, sb2));
                        }
                    }
                    return arrayList;
                } else if (pathComponent.f34825a.equals(ClassUtils.PACKAGE_SEPARATOR)) {
                    arrayList.add(new C13132a(view, sb2));
                    return arrayList;
                } else if (!m38402a(view, pathComponent, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new C13132a(view, sb2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List a2 = m38397a((ViewGroup) view);
                int size2 = a2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(m38398a(eventBinding, (View) a2.get(i4), list, i + 1, i4, sb2));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static synchronized C13130c m38390a() {
        C13130c cVar;
        synchronized (C13130c.class) {
            if (f34780g == null) {
                f34780g = new C13130c();
            }
            cVar = f34780g;
        }
        return cVar;
    }

    /* renamed from: c */
    private void m38391c() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mo32301b();
        } else {
            this.f34781b.post(new Runnable() {
                public final void run() {
                    C13130c.this.mo32301b();
                }
            });
        }
    }

    private C13130c() {
    }

    /* renamed from: b */
    public final void mo32301b() {
        for (Activity activity : this.f34782c) {
            if (activity != null) {
                this.f34783d.add(new C13133b(activity.getWindow().getDecorView().getRootView(), this.f34781b, this.f34784e, activity.getClass().getSimpleName()));
            }
        }
    }

    /* renamed from: c */
    public final void mo32303c(Activity activity) {
        this.f34785f.remove(Integer.valueOf(activity.hashCode()));
    }

    /* renamed from: a */
    public final void mo32300a(Activity activity) {
        if (!C13946r.m41124b()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f34782c.add(activity);
                this.f34784e.clear();
                if (this.f34785f.containsKey(Integer.valueOf(activity.hashCode()))) {
                    this.f34784e = (HashSet) this.f34785f.get(Integer.valueOf(activity.hashCode()));
                }
                m38391c();
                return;
            }
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        }
    }

    /* renamed from: b */
    public final void mo32302b(Activity activity) {
        if (!C13946r.m41124b()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f34782c.remove(activity);
                this.f34783d.clear();
                this.f34785f.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f34784e.clone());
                this.f34784e.clear();
                return;
            }
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        }
    }

    /* renamed from: a */
    public static Bundle m38389a(EventBinding eventBinding, View view, View view2) {
        List list;
        Bundle bundle = new Bundle();
        if (eventBinding == null) {
            return bundle;
        }
        List<C13145a> b = eventBinding.mo32321b();
        if (b != null) {
            for (C13145a aVar : b) {
                if (aVar.f34835b == null || aVar.f34835b.length() <= 0) {
                    if (aVar.f34836c.size() > 0) {
                        if (aVar.f34837d.equals("relative")) {
                            list = C13133b.m38398a(eventBinding, view2, aVar.f34836c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            list = C13133b.m38398a(eventBinding, view, aVar.f34836c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C13132a aVar2 = (C13132a) it.next();
                            if (aVar2.mo32305a() != null) {
                                String b2 = C13148d.m38433b(aVar2.mo32305a());
                                if (b2.length() > 0) {
                                    bundle.putString(aVar.f34834a, b2);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    bundle.putString(aVar.f34834a, aVar.f34835b);
                }
            }
        }
        return bundle;
    }
}
