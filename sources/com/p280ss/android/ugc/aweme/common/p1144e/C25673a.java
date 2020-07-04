package com.p280ss.android.ugc.aweme.common.p1144e;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25678f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.e.a */
public abstract class C25673a<T, K> extends C25640a<K> {
    public int mCount;
    protected boolean mIsNewDataEmpty;
    public int mListQueryType = 1;

    public abstract List<T> getItems();

    public abstract boolean isHasMore();

    public boolean isNewDataEmpty() {
        return this.mIsNewDataEmpty;
    }

    /* access modifiers changed from: protected */
    public void loadLatestList(Object... objArr) {
    }

    /* access modifiers changed from: protected */
    public abstract void loadMoreList(Object... objArr);

    /* access modifiers changed from: protected */
    public abstract void refreshList(Object... objArr);

    public void setItems(List<T> list) {
    }

    public boolean isDataEmpty() {
        return C6307b.m19566a((Collection<T>) getItems());
    }

    public boolean insertItem(T t) {
        int i;
        List items = getItems();
        if (items == null) {
            i = 0;
        } else {
            i = items.size();
        }
        return insertItem(t, i);
    }

    public boolean deleteItem(T t) {
        List items = getItems();
        if (C6307b.m19566a((Collection<T>) items)) {
            return false;
        }
        int indexOf = items.indexOf(t);
        boolean remove = items.remove(t);
        if (indexOf >= 0) {
            for (C25678f fVar : this.mNotifyListeners) {
                if (fVar != null && (fVar instanceof C25677e)) {
                    ((C25677e) fVar).mo59135a(indexOf);
                }
            }
        }
        return remove;
    }

    public boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        if (isDataEmpty()) {
            this.mListQueryType = 1;
        } else {
            this.mListQueryType = objArr[0].intValue();
        }
        int i = this.mListQueryType;
        if (i != 4) {
            switch (i) {
                case 1:
                    refreshList(objArr);
                    break;
                case 2:
                    loadLatestList(objArr);
                    break;
            }
        } else {
            loadMoreList(objArr);
        }
        return true;
    }

    public boolean insertItem(T t, int i) {
        List items = getItems();
        if (C6307b.m19566a((Collection<T>) items)) {
            items = new ArrayList();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.add(i, t);
        if (items.size() == 1) {
            setItems(items);
        }
        for (C25678f fVar : this.mNotifyListeners) {
            if (fVar != null && (fVar instanceof C25677e)) {
                ((C25677e) fVar).mo59136a(items, i);
            }
        }
        return true;
    }

    public boolean insertItemList(List<T> list, int i) {
        List items = getItems();
        if (C6307b.m19566a((Collection<T>) items)) {
            items = new ArrayList();
        }
        if (i < 0 || i > items.size()) {
            return false;
        }
        items.addAll(i, list);
        if (items.size() == 1) {
            setItems(items);
        }
        for (C25678f fVar : this.mNotifyListeners) {
            if (fVar != null && (fVar instanceof C25677e)) {
                ((C25677e) fVar).mo59136a(items, i);
            }
        }
        return true;
    }
}
