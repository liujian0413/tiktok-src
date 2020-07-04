package com.p280ss.android.ugc.aweme.discover.model;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter */
public final class DiscoverV4PlayListDataCenter {
    public static final Companion Companion = new Companion(null);
    public static final String DISCOVER_PLAYLIST = DISCOVER_PLAYLIST;
    public static final C7541d INSTANCE$delegate = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, DiscoverV4PlayListDataCenter$Companion$INSTANCE$2.INSTANCE);
    public static final String TRENDING_PLAYLIST = TRENDING_PLAYLIST;
    private final Map<String, DiscoverV4PlayListResponse> dataMap;
    private final List<WeakReference<DiscoverV4DataObserver>> mObservers;
    private final Map<String, Boolean> pageStateMap;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$Companion */
    public static final class Companion {
        static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/discover/model/DiscoverV4PlayListDataCenter;"))};

        private Companion() {
        }

        public final String getDISCOVER_PLAYLIST() {
            return DiscoverV4PlayListDataCenter.DISCOVER_PLAYLIST;
        }

        public final DiscoverV4PlayListDataCenter getINSTANCE() {
            return (DiscoverV4PlayListDataCenter) DiscoverV4PlayListDataCenter.INSTANCE$delegate.getValue();
        }

        public final String getTRENDING_PLAYLIST() {
            return DiscoverV4PlayListDataCenter.TRENDING_PLAYLIST;
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter$DiscoverV4DataObserver */
    public interface DiscoverV4DataObserver {
        void onDataChanged(String str);

        void onNeedUpdateData(String str);
    }

    public final void clear() {
        this.mObservers.clear();
        this.dataMap.clear();
        this.pageStateMap.clear();
    }

    private DiscoverV4PlayListDataCenter() {
        this.pageStateMap = new LinkedHashMap();
        this.dataMap = new LinkedHashMap();
        this.mObservers = new ArrayList();
    }

    public /* synthetic */ DiscoverV4PlayListDataCenter(C7571f fVar) {
        this();
    }

    public final DiscoverV4PlayListResponse getData(String str) {
        C7573i.m23587b(str, "key");
        return (DiscoverV4PlayListResponse) this.dataMap.get(str);
    }

    public final void needLoadData(String str) {
        C7573i.m23587b(str, "key");
        onNeedUpdateData(str);
    }

    public final void removeData(String str) {
        C7573i.m23587b(str, "key");
        this.dataMap.remove(str);
    }

    private final void onDataChanged(String str) {
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            } else {
                DiscoverV4DataObserver discoverV4DataObserver = (DiscoverV4DataObserver) weakReference.get();
                if (discoverV4DataObserver != null) {
                    discoverV4DataObserver.onDataChanged(str);
                }
            }
        }
    }

    private final void onNeedUpdateData(String str) {
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            } else {
                DiscoverV4DataObserver discoverV4DataObserver = (DiscoverV4DataObserver) weakReference.get();
                if (discoverV4DataObserver != null) {
                    discoverV4DataObserver.onNeedUpdateData(str);
                }
            }
        }
    }

    public final boolean isPageShow(String str) {
        C7573i.m23587b(str, "tabName");
        if (this.pageStateMap.get(str) == null) {
            return false;
        }
        Object obj = this.pageStateMap.get(str);
        if (obj == null) {
            C7573i.m23580a();
        }
        return ((Boolean) obj).booleanValue();
    }

    public final void unRegister(DiscoverV4DataObserver discoverV4DataObserver) {
        DiscoverV4DataObserver discoverV4DataObserver2;
        C7573i.m23587b(discoverV4DataObserver, "observer");
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference != null) {
                discoverV4DataObserver2 = (DiscoverV4DataObserver) weakReference.get();
            } else {
                discoverV4DataObserver2 = null;
            }
            if (C7573i.m23585a((Object) discoverV4DataObserver2, (Object) discoverV4DataObserver)) {
                weakReference.clear();
            } else if (!(weakReference == null || weakReference.get() == null)) {
            }
            it.remove();
        }
    }

    public final void register(DiscoverV4DataObserver discoverV4DataObserver) {
        DiscoverV4DataObserver discoverV4DataObserver2;
        C7573i.m23587b(discoverV4DataObserver, "observer");
        int size = this.mObservers.size();
        int i = 0;
        while (i < size) {
            if (this.mObservers.get(i) != null) {
                WeakReference weakReference = (WeakReference) this.mObservers.get(i);
                if (weakReference != null) {
                    discoverV4DataObserver2 = (DiscoverV4DataObserver) weakReference.get();
                } else {
                    discoverV4DataObserver2 = null;
                }
                if (discoverV4DataObserver2 != null) {
                    i++;
                }
            }
            this.mObservers.set(i, new WeakReference(discoverV4DataObserver));
            return;
        }
        this.mObservers.add(new WeakReference(discoverV4DataObserver));
    }

    public final void setPageState(String str, boolean z) {
        C7573i.m23587b(str, "tabName");
        this.pageStateMap.put(str, Boolean.valueOf(z));
    }

    public final void loadData(String str, DiscoverV4PlayListResponse discoverV4PlayListResponse) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(discoverV4PlayListResponse, "data");
        handleLoadData(str, discoverV4PlayListResponse);
        onDataChanged(str);
    }

    public final void refreshData(String str, DiscoverV4PlayListResponse discoverV4PlayListResponse) {
        C7573i.m23587b(str, "key");
        C7573i.m23587b(discoverV4PlayListResponse, "data");
        this.dataMap.put(str, discoverV4PlayListResponse);
        onDataChanged(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleLoadData(java.lang.String r9, com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r10) {
        /*
            r8 = this;
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse> r0 = r8.dataMap
            java.lang.Object r0 = r0.get(r9)
            if (r0 == 0) goto L_0x004a
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse> r0 = r8.dataMap
            java.lang.Object r0 = r0.get(r9)
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r0 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse) r0
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r0 = r0.cells
            if (r0 == 0) goto L_0x001d
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.C7525m.m23509d(r0)
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r4 = r0
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r0 = r10.cells
            if (r0 == 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
        L_0x002a:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse> r0 = r8.dataMap
            java.lang.Object r0 = r0.get(r9)
            r1 = r0
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r1 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse) r1
            if (r1 == 0) goto L_0x0049
            int r2 = r10.nextCursor
            int r3 = r10.hasMore
            r5 = 0
            r6 = 8
            r7 = 0
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r10 = com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse.copy$default(r1, r2, r3, r4, r5, r6, r7)
            if (r10 == 0) goto L_0x0049
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse> r0 = r8.dataMap
            r0.put(r9, r10)
            goto L_0x004f
        L_0x0049:
            return
        L_0x004a:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse> r0 = r8.dataMap
            r0.put(r9, r10)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.handleLoadData(java.lang.String, com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateData(java.lang.String r9, int r10, com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r11) {
        /*
            r8 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.lang.String r0 = "cell"
            kotlin.jvm.internal.C7573i.m23587b(r11, r0)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse> r0 = r8.dataMap
            java.lang.Object r0 = r0.get(r9)
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r0 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse) r0
            if (r0 == 0) goto L_0x001f
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r0 = r0.cells
            if (r0 == 0) goto L_0x001f
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.C7525m.m23509d(r0)
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r4 = r0
            if (r4 == 0) goto L_0x0052
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.e.c r0 = kotlin.collections.C7525m.m23462a(r0)
            boolean r0 = r0.mo19434a(r10)
            r1 = 1
            if (r0 != r1) goto L_0x0051
            r4.set(r10, r11)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse> r10 = r8.dataMap
            java.lang.Object r10 = r10.get(r9)
            r1 = r10
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r1 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse) r1
            if (r1 == 0) goto L_0x0051
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 11
            r7 = 0
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r10 = com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse.copy$default(r1, r2, r3, r4, r5, r6, r7)
            if (r10 == 0) goto L_0x0051
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse> r11 = r8.dataMap
            r11.put(r9, r10)
            return
        L_0x0051:
            return
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter.updateData(java.lang.String, int, com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4):void");
    }
}
