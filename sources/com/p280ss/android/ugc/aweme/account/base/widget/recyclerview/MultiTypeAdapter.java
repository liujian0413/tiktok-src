package com.p280ss.android.ugc.aweme.account.base.widget.recyclerview;

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

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.MultiTypeAdapter */
public class MultiTypeAdapter<T extends C23360e> extends C1262a<BaseViewHolder> {

    /* renamed from: a */
    private Map<Class, Class> f56798a;

    /* renamed from: b */
    private final List<T> f56799b;

    /* renamed from: c */
    private final Context f56800c;

    /* renamed from: d */
    private Map<Class, Integer> f56801d;

    /* renamed from: e */
    private List<Constructor> f56802e;

    public int getItemCount() {
        return this.f56799b.size();
    }

    /* renamed from: a */
    private Object m71273a(int i) {
        return this.f56799b.get(i);
    }

    public int getItemViewType(int i) {
        return super.getItemViewType(i) + m71279b(i);
    }

    /* renamed from: a */
    private static Constructor m71274a(Class cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[]{Context.class});
    }

    /* renamed from: b */
    private int m71279b(int i) {
        Integer num = (Integer) this.f56801d.get(m71273a(i).getClass());
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sb = new StringBuilder("No corresponding View match ");
        sb.append(m71273a(i).getClass().getName());
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    private void m71280b(Map<Class, Class> map) {
        this.f56801d = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f56802e = new ArrayList();
        Class cls = null;
        try {
            for (Entry entry : map.entrySet()) {
                Class cls2 = (Class) entry.getKey();
                Class cls3 = (Class) entry.getValue();
                try {
                    if (!this.f56801d.containsKey(cls2)) {
                        if (!arrayList.contains(cls3)) {
                            arrayList.add(cls3);
                            this.f56802e.add(m71274a(cls3));
                        }
                        this.f56801d.put(cls2, Integer.valueOf(arrayList.indexOf(entry.getValue())));
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
    private void m71277a(Map<Class, Class> map) {
        for (Entry entry : map.entrySet()) {
            if (m71278a((Class) entry.getKey(), C23360e.class)) {
                if (!m71278a((Class) entry.getValue(), C23359d.class)) {
                }
            }
            throw new IllegalArgumentException("All keys in dataViewMap must be <K> Class<K extends IViewModel> and All values must be <T> Class<T extends IView>");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new BaseViewHolder(m71272a(i, viewGroup));
    }

    /* renamed from: a */
    private C23359d m71272a(int i, ViewGroup viewGroup) {
        try {
            C23359d dVar = (C23359d) ((Constructor) this.f56802e.get(i)).newInstance(new Object[]{this.f56800c});
            try {
                dVar.create(this.f56800c, viewGroup);
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
        baseViewHolder.f56796a.bind((C23360e) this.f56799b.get(i));
    }

    /* renamed from: a */
    private static boolean m71278a(Class cls, Class cls2) {
        return cls2.isAssignableFrom(cls);
    }

    public MultiTypeAdapter(Context context, List<T> list, Map<Class, Class> map) {
        m71275a(context, list, map);
        this.f56800c = context;
        this.f56799b = list;
        this.f56798a = map;
        m71280b(map);
    }

    /* renamed from: a */
    private void m71275a(Context context, List<T> list, Map<Class, Class> map) {
        if (context == null) {
            throw new NullPointerException("context mustn't be null!");
        } else if (list != null) {
            m71277a(map);
        } else {
            throw new NullPointerException("viewbeans mustn't be null!");
        }
    }
}
