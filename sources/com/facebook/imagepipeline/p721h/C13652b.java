package com.facebook.imagepipeline.p721h;

import com.facebook.common.p686c.C13286a;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.h.b */
public final class C13652b implements C13653c {

    /* renamed from: a */
    private final List<C13653c> f36273a;

    /* renamed from: a */
    public final void mo33288a(C13653c cVar) {
        this.f36273a.add(cVar);
    }

    public C13652b(C13653c... cVarArr) {
        this.f36273a = new ArrayList(cVarArr.length);
        for (C13653c cVar : cVarArr) {
            if (cVar != null) {
                this.f36273a.add(cVar);
            }
        }
    }

    public final void onRequestCancellation(String str) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C13653c) this.f36273a.get(i)).onRequestCancellation(str);
            } catch (Exception e) {
                m40265a("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public final boolean requiresExtraMap(String str) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            if (((C13653c) this.f36273a.get(i)).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public C13652b(Set<C13653c> set) {
        this.f36273a = new ArrayList(set.size());
        for (C13653c cVar : set) {
            if (cVar != null) {
                this.f36273a.add(cVar);
            }
        }
    }

    /* renamed from: a */
    private static void m40265a(String str, Throwable th) {
        C13286a.m38861c("ForwardingRequestListener", str, th);
    }

    public final void onProducerStart(String str, String str2) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C13653c) this.f36273a.get(i)).onProducerStart(str, str2);
            } catch (Exception e) {
                m40265a("InternalListener exception in onProducerStart", e);
            }
        }
    }

    public final void onProducerEvent(String str, String str2, String str3) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C13653c) this.f36273a.get(i)).onProducerEvent(str, str2, str3);
            } catch (Exception e) {
                m40265a("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    public final void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C13653c) this.f36273a.get(i)).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e) {
                m40265a("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C13653c) this.f36273a.get(i)).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e) {
                m40265a("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C13653c) this.f36273a.get(i)).onRequestSuccess(imageRequest, str, z);
            } catch (Exception e) {
                m40265a("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    public final void onUltimateProducerReached(String str, String str2, boolean z) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C13653c) this.f36273a.get(i)).onUltimateProducerReached(str, str2, z);
            } catch (Exception e) {
                m40265a("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    public final void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C13653c) this.f36273a.get(i)).onProducerFinishWithFailure(str, str2, th, map);
            } catch (Exception e) {
                m40265a("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    public final void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C13653c) this.f36273a.get(i)).onRequestFailure(imageRequest, str, th, z);
            } catch (Exception e) {
                m40265a("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    public final void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        int size = this.f36273a.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C13653c) this.f36273a.get(i)).onRequestStart(imageRequest, obj, str, z);
            } catch (Exception e) {
                m40265a("InternalListener exception in onRequestStart", e);
            }
        }
    }
}
