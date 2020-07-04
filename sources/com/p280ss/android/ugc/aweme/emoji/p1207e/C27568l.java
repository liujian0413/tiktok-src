package com.p280ss.android.ugc.aweme.emoji.p1207e;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.p482io.FileUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse;
import com.p280ss.android.ugc.aweme.emoji.utils.C27631b;
import com.p280ss.android.ugc.aweme.emoji.utils.C27641j;
import com.p280ss.android.ugc.aweme.emoji.utils.C27646m;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44851d;
import com.p280ss.android.ugc.iesdownload.C44854e;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.emoji.e.l */
public class C27568l implements C27565i {

    /* renamed from: a */
    public boolean f72643a;

    /* renamed from: b */
    private List<C27565i> f72644b = new ArrayList();

    /* renamed from: b */
    public static ResourcesResponse m90348b(String str) {
        try {
            return (ResourcesResponse) C27631b.m90586a().getResources(str).get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo70799a(final String str) {
        C1592h.m7855a((Callable<TResult>) new Callable<List<Resources>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<Resources> call() throws Exception {
                List<Resources> list;
                ResourcesResponse b = C27568l.m90348b(str);
                if (b == null) {
                    list = null;
                } else {
                    list = b.getResources();
                }
                if (b == null || b.status_code != 0) {
                    List<Resources> a = C27566j.m90342a(str);
                    if (a == null) {
                        a = new ArrayList<>();
                    }
                    return a;
                }
                if (list == null) {
                    list = new ArrayList<>();
                }
                for (Resources type : list) {
                    type.setType(str);
                }
                C27566j.m90343a(str, list);
                if (list.size() <= 0) {
                    return list;
                }
                C27568l.m90350c(str, list);
                return list;
            }
        }, (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<List<Resources>, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<List<Resources>> hVar) throws Exception {
                C27568l.this.mo70794a(str, (List) hVar.mo6890e());
                return null;
            }
        }, C1592h.f5958b);
    }

    /* renamed from: a */
    public static boolean m90347a(Resources resources) {
        if (resources == null) {
            return false;
        }
        File file = new File(C27641j.m90630c(resources));
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m90349b(Resources resources) {
        File file = new File(C27641j.m90625a(resources));
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70793a(final Resources resources, final boolean z) {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                C27568l.this.mo70797a(z, resources);
            }
        });
    }

    /* renamed from: c */
    public static void m90350c(String str, List<Resources> list) {
        HashMap hashMap = new HashMap();
        for (Resources b : list) {
            hashMap.put(C27641j.m90628b(b), Boolean.valueOf(true));
        }
        File file = new File(C27641j.m90626a(str));
        if (file.exists() && file.isDirectory()) {
            String[] list2 = file.list();
            if (list2 != null) {
                for (int i = 0; i < list2.length; i++) {
                    if (hashMap.get(list2[i]) == null) {
                        try {
                            FileUtils.m28680d(list2[i]);
                            new File(list2[i]).delete();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70794a(String str, List<Resources> list) {
        mo70798b(str, list);
        if (list == null || list.size() == 0) {
            this.f72643a = true;
        } else {
            this.f72643a = false;
        }
    }

    /* renamed from: b */
    public final void mo70798b(String str, List<Resources> list) {
        for (C27565i b : this.f72644b) {
            b.mo70798b(str, list);
        }
    }

    /* renamed from: a */
    public final void mo70797a(boolean z, Resources resources) {
        for (C27565i a : this.f72644b) {
            a.mo70797a(z, resources);
        }
    }

    /* renamed from: b */
    public final boolean mo70800b(final Resources resources, final boolean z) {
        if (!C27577m.m90365a(C6399b.m19921a())) {
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    C27568l.this.mo70793a(resources, false);
                }
            });
            return false;
        } else if (C27567k.m90344a(resources.getResourceUrl()) != null) {
            return false;
        } else {
            File file = new File(C27641j.m90625a(resources));
            if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                return false;
            }
            C44854e a = new C44856a().mo107294a(resources.getResourceUrl()).mo107298b(file.getAbsolutePath()).mo107297a();
            C27567k.m90345a(resources.getResourceUrl(), a);
            C44851d.m141532a().mo107292a(a, (C44849d) new C44849d() {
                /* renamed from: a */
                public final void mo59407a(int i) {
                }

                /* renamed from: a */
                public final void mo59408a(int i, long j, long j2) {
                }

                /* renamed from: f */
                public final void mo59418f() {
                }

                /* renamed from: g */
                public final void mo59419g() {
                    C27567k.m90346b(resources.getResourceUrl());
                    C6726a.m20842a(new Runnable() {
                        public final void run() {
                            C27568l.m90349b(resources);
                            C27568l.this.mo70793a(resources, false);
                        }
                    });
                }

                /* renamed from: a */
                public final void mo59411a(C44850c cVar) {
                    C27567k.m90346b(resources.getResourceUrl());
                    if (z) {
                        C27568l.this.mo70800b(resources, false);
                    } else {
                        C6726a.m20842a(new Runnable() {
                            public final void run() {
                                C27568l.m90349b(resources);
                                C27568l.this.mo70793a(resources, false);
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo59412a(String str) {
                    C27567k.m90346b(resources.getResourceUrl());
                    C6726a.m20842a(new Runnable() {
                        public final void run() {
                            C27646m.m90636a(C27641j.m90625a(resources), C27641j.m90627a(resources.getType(), resources.getId(), resources.getVersion()));
                            C27568l.m90349b(resources);
                            C27568l.this.mo70793a(resources, C27568l.m90347a(resources));
                        }
                    });
                }
            });
            return true;
        }
    }
}
