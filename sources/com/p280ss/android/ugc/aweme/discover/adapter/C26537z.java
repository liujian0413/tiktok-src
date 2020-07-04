package com.p280ss.android.ugc.aweme.discover.adapter;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.discover.model.CardType;
import com.p280ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.z */
public final class C26537z {

    /* renamed from: a */
    private final List<SearchMusic> f70002a = new ArrayList();

    /* renamed from: a */
    public static boolean m87236a(SearchMusic searchMusic) {
        C7573i.m23587b(searchMusic, "searchMusic");
        return searchMusic instanceof ClusterButtonData;
    }

    /* renamed from: b */
    private final void m87237b(List<? extends SearchMusic> list) {
        if (list != null) {
            this.f70002a.clear();
            this.f70002a.addAll(list);
        }
    }

    /* renamed from: a */
    public static List<SearchMusic> m87235a(ClusterButtonData clusterButtonData) {
        C7573i.m23587b(clusterButtonData, "cluster");
        Iterable<Music> clusterList = clusterButtonData.getClusterList();
        Collection arrayList = new ArrayList(C7525m.m23469a(clusterList, 10));
        for (Music music : clusterList) {
            SearchMusic searchMusic = new SearchMusic();
            searchMusic.setMusic(music);
            arrayList.add(searchMusic);
        }
        return C7525m.m23509d((Collection<? extends T>) (List) arrayList);
    }

    /* renamed from: a */
    public final List<SearchMusic> mo68159a(List<? extends SearchMusic> list) {
        boolean z;
        Collection collection = list;
        if (C6307b.m19566a(collection)) {
            return new ArrayList<>();
        }
        m87237b(list);
        if (list == null) {
            C7573i.m23580a();
        }
        List d = C7525m.m23509d(collection);
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            SearchMusic searchMusic = (SearchMusic) listIterator.next();
            if (searchMusic.getCardType() == CardType.TYPE_CLUSTER.getValue() && !C6307b.m19566a((Collection<T>) searchMusic.getMusicList())) {
                listIterator.remove();
                SearchMusic searchMusic2 = new SearchMusic();
                searchMusic2.setCardType(CardType.TYPE_NORMAL.getValue());
                List musicList = searchMusic.getMusicList();
                if (musicList == null) {
                    C7573i.m23580a();
                }
                searchMusic2.setMusic((Music) C7525m.m23511f(musicList));
                listIterator.add(searchMusic2);
                ClusterButtonData clusterButtonData = new ClusterButtonData(false, null, 3, null);
                List clusterList = clusterButtonData.getClusterList();
                List musicList2 = searchMusic.getMusicList();
                if (musicList2 == null) {
                    C7573i.m23580a();
                }
                List musicList3 = searchMusic.getMusicList();
                if (musicList3 == null) {
                    C7573i.m23580a();
                }
                clusterList.addAll(musicList2.subList(1, musicList3.size()));
                listIterator.add(clusterButtonData);
            }
        }
        Iterable iterable = d;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            SearchMusic searchMusic3 = (SearchMusic) next;
            if (!(searchMusic3 instanceof ClusterButtonData) || ((ClusterButtonData) searchMusic3).getClusterList().size() > 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        return C7525m.m23509d((Collection<? extends T>) (List) arrayList);
    }

    /* renamed from: a */
    public final List<SearchMusic> mo68160a(List<? extends SearchMusic> list, List<? extends SearchMusic> list2) {
        boolean z;
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Collection collection2 = list2;
            if (collection2 == null || collection2.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                int indexOf = list2.indexOf(C7525m.m23515h(this.f70002a));
                if (indexOf >= list2.size() - 1) {
                    return list;
                }
                if (indexOf <= 0) {
                    m87237b(list2);
                    return list2;
                }
                List<SearchMusic> a = mo68159a(list2.subList(indexOf + 1, list2.size()));
                a.addAll(0, collection);
                m87237b(list2);
                return a;
            }
        }
        if (list2 == null) {
            return null;
        }
        m87237b(list2);
        return list2;
    }
}
