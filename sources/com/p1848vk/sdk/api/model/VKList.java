package com.p1848vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p1848vk.sdk.api.model.C47207a;
import com.p1848vk.sdk.api.model.VKApiModel;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKList */
public class VKList<T extends VKApiModel & Parcelable & C47207a> extends VKApiModel implements Parcelable, List<T> {
    public static Creator<VKList> CREATOR = new Creator<VKList>() {
        /* renamed from: a */
        private static VKList[] m147621a(int i) {
            return new VKList[i];
        }

        /* renamed from: a */
        private static VKList m147620a(Parcel parcel) {
            return new VKList(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147620a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147621a(i);
        }
    };

    /* renamed from: a */
    static final /* synthetic */ boolean f121330a = (!VKList.class.desiredAssertionStatus());

    /* renamed from: b */
    private ArrayList<T> f121331b = new ArrayList<>();

    /* renamed from: c */
    private int f121332c = -1;

    /* renamed from: com.vk.sdk.api.model.VKList$a */
    public interface C47196a<D> {
        /* renamed from: a */
        D mo118614a(JSONObject jSONObject) throws Exception;
    }

    /* renamed from: com.vk.sdk.api.model.VKList$b */
    public static final class C47197b<D extends VKApiModel> implements C47196a<D> {

        /* renamed from: a */
        private final Class<? extends D> f121333a;

        public C47197b(Class<? extends D> cls) {
            this.f121333a = cls;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public D mo118614a(JSONObject jSONObject) throws Exception {
            try {
                Constructor constructor = this.f121333a.getConstructor(new Class[]{JSONObject.class});
                if (constructor != null) {
                    return (VKApiModel) constructor.newInstance(new Object[]{jSONObject});
                }
            } catch (Exception unused) {
            }
            return ((VKApiModel) this.f121333a.newInstance()).mo118445b(jSONObject);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void clear() {
        this.f121331b.clear();
    }

    public boolean isEmpty() {
        return this.f121331b.isEmpty();
    }

    public Iterator<T> iterator() {
        return this.f121331b.iterator();
    }

    public ListIterator<T> listIterator() {
        return this.f121331b.listIterator();
    }

    public int size() {
        return this.f121331b.size();
    }

    public Object[] toArray() {
        return this.f121331b.toArray();
    }

    public VKList() {
    }

    /* renamed from: b */
    public VKApiModel mo118445b(JSONObject jSONObject) throws JSONException {
        throw new JSONException("Operation is not supported while class is generic");
    }

    public boolean contains(Object obj) {
        return this.f121331b.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f121331b.containsAll(collection);
    }

    public int indexOf(Object obj) {
        return this.f121331b.indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return this.f121331b.lastIndexOf(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.f121331b.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.f121331b.retainAll(collection);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T get(int i) {
        return (VKApiModel) this.f121331b.get(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public T remove(int i) {
        return (VKApiModel) this.f121331b.remove(i);
    }

    public boolean addAll(Collection<? extends T> collection) {
        return this.f121331b.addAll(collection);
    }

    public ListIterator<T> listIterator(int i) {
        return this.f121331b.listIterator(i);
    }

    public boolean remove(Object obj) {
        return this.f121331b.remove(obj);
    }

    public <T1> T1[] toArray(T1[] t1Arr) {
        return this.f121331b.toArray(t1Arr);
    }

    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass()) || !this.f121331b.equals(obj)) {
            return false;
        }
        return true;
    }

    public VKList(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f121331b.add((VKApiModel) parcel.readParcelable(getClass().getClassLoader()));
        }
        this.f121332c = parcel.readInt();
    }

    public VKList(List<? extends T> list) {
        if (f121330a || list != null) {
            this.f121331b = new ArrayList<>(list);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final boolean add(T t) {
        return this.f121331b.add(t);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void add(int i, T t) {
        this.f121331b.add(i, t);
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        return this.f121331b.addAll(i, collection);
    }

    public List<T> subList(int i, int i2) {
        return this.f121331b.subList(i, i2);
    }

    public VKList(JSONArray jSONArray, Class<? extends T> cls) {
        mo118622a(jSONArray, cls);
    }

    /* renamed from: a */
    private void m147612a(JSONObject jSONObject, C47196a<? extends T> aVar) {
        if (jSONObject != null) {
            mo118621a(jSONObject.optJSONArray("items"), aVar);
            this.f121332c = jSONObject.optInt("count", this.f121332c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public T set(int i, T t) {
        return (VKApiModel) this.f121331b.set(i, t);
    }

    /* renamed from: a */
    public final void mo118621a(JSONArray jSONArray, C47196a<? extends T> aVar) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    VKApiModel vKApiModel = (VKApiModel) aVar.mo118614a(jSONArray.getJSONObject(i));
                    if (vKApiModel != null) {
                        this.f121331b.add(vKApiModel);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f121331b.size());
        Iterator it = iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((VKApiModel) it.next(), i);
        }
        parcel.writeInt(this.f121332c);
    }

    /* renamed from: a */
    public final void mo118622a(JSONArray jSONArray, Class<? extends T> cls) {
        mo118621a(jSONArray, (C47196a<? extends T>) new C47197b<Object>(cls));
    }

    public VKList(JSONObject jSONObject, Class<? extends T> cls) {
        mo118623a(jSONObject, cls);
    }

    /* renamed from: a */
    public final void mo118623a(JSONObject jSONObject, Class<? extends T> cls) {
        if (jSONObject.has("response")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("response");
            if (optJSONArray != null) {
                mo118622a(optJSONArray, cls);
            } else {
                mo118623a(jSONObject.optJSONObject("response"), cls);
            }
        } else {
            m147612a(jSONObject, (C47196a<? extends T>) new C47197b<Object>(cls));
        }
    }
}
