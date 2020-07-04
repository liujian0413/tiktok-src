package com.p280ss.android.ugc.aweme.base.widget.recyclerview;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.mvvm.C23359d;
import com.p280ss.android.ugc.aweme.base.mvvm.C23360e;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.MultiTypeAdapter */
public class MultiTypeAdapter<T extends C23360e> extends C1262a<BaseViewHolder> {

    /* renamed from: a */
    private Map<Class, Class> f62082a;

    /* renamed from: b */
    private final List<T> f62083b;

    /* renamed from: c */
    private final Context f62084c;

    /* renamed from: d */
    private Map<Class, Integer> f62085d;

    /* renamed from: e */
    private List<Constructor> f62086e;

    public int getItemCount() {
        return this.f62083b.size();
    }

    /* renamed from: a */
    private Object m77245a(int i) {
        return this.f62083b.get(i);
    }

    public int getItemViewType(int i) {
        return super.getItemViewType(i) + m77251b(i);
    }

    /* renamed from: a */
    private static Constructor m77246a(Class cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[]{Context.class});
    }

    /* renamed from: b */
    private int m77251b(int i) {
        Integer num = (Integer) this.f62085d.get(m77245a(i).getClass());
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sb = new StringBuilder("No corresponding View match ");
        sb.append(m77245a(i).getClass().getName());
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    private void m77252b(Map<Class, Class> map) {
        this.f62085d = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f62086e = new ArrayList();
        Class cls = null;
        try {
            for (Entry entry : map.entrySet()) {
                Class cls2 = (Class) entry.getKey();
                Class cls3 = (Class) entry.getValue();
                try {
                    if (!this.f62085d.containsKey(cls2)) {
                        if (!arrayList.contains(cls3)) {
                            arrayList.add(cls3);
                            this.f62086e.add(m77246a(cls3));
                        }
                        this.f62085d.put(cls2, Integer.valueOf(arrayList.indexOf(entry.getValue())));
                    }
                    Class cls4 = cls3;
                } catch (NoSuchMethodException unused) {
                    cls = cls3;
                    StringBuilder sb = new StringBuilder("Can't find constructor in ");
                    sb.append(cls.getSimpleName());
                    sb.append(".class according to ");
                    sb.append(getClass().getSimpleName());
                    sb.append("'s getConstructor(Class)!");
                    throw new RuntimeException(sb.toString());
                }
            }
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder("Can't find constructor in ");
            sb2.append(cls.getSimpleName());
            sb2.append(".class according to ");
            sb2.append(getClass().getSimpleName());
            sb2.append("'s getConstructor(Class)!");
            throw new RuntimeException(sb2.toString());
        }
    }

    /* renamed from: a */
    private void m77249a(Map<Class, Class> map) {
        for (Entry entry : map.entrySet()) {
            if (m77250a((Class) entry.getKey(), C23360e.class)) {
                if (!m77250a((Class) entry.getValue(), C23359d.class)) {
                }
            }
            throw new IllegalArgumentException("All keys in dataViewMap must be <K> Class<K extends IViewModel> and All values must be <T> Class<T extends IView>");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new BaseViewHolder(m77243a(i, viewGroup));
    }

    /* renamed from: a */
    private C23359d m77243a(int i, ViewGroup viewGroup) {
        try {
            C23359d dVar = (C23359d) ((Constructor) this.f62086e.get(i)).newInstance(new Object[]{this.f62084c});
            try {
                dVar.create(this.f62084c, viewGroup);
                return dVar;
            } catch (Exception unused) {
                return dVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        baseViewHolder.f62080a.bind((C23360e) this.f62083b.get(i));
    }

    /* renamed from: a */
    private static boolean m77250a(Class cls, Class cls2) {
        return cls2.isAssignableFrom(cls);
    }

    public MultiTypeAdapter(Context context, List<T> list, Map<Class, Class> map) {
        m77247a(context, list, map);
        this.f62084c = context;
        this.f62083b = list;
        this.f62082a = map;
        m77252b(map);
    }

    /* renamed from: a */
    private void m77247a(Context context, List<T> list, Map<Class, Class> map) {
        if (context == null) {
            throw new NullPointerException("context mustn't be null!");
        } else if (list != null) {
            m77249a(map);
        } else {
            throw new NullPointerException("viewbeans mustn't be null!");
        }
    }
}
