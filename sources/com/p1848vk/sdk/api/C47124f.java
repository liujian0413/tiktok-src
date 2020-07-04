package com.p1848vk.sdk.api;

import com.p1848vk.sdk.api.VKRequest.C47115a;
import com.p1848vk.sdk.api.httpClient.C47135a;
import com.p1848vk.sdk.api.httpClient.C47151g;
import com.p1848vk.sdk.api.httpClient.C47151g.C47152a;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation.C47133a;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation.VKOperationState;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.f */
public abstract class C47124f extends VKRequest {

    /* renamed from: com.vk.sdk.api.f$a */
    class C47126a extends VKAbstractOperation {

        /* renamed from: a */
        protected VKAbstractOperation f120934a;

        /* renamed from: com.vk.sdk.api.f$a$a */
        class C47128a extends C47115a {
            private C47128a() {
            }

            /* renamed from: a */
            public final void mo118376a(C47121c cVar) {
                if (C47124f.this.f120899h != null) {
                    C47124f.this.f120899h.mo118376a(cVar);
                }
            }

            /* renamed from: a */
            public final void mo118377a(C47123e eVar) {
                try {
                    C47151g a = C47124f.this.mo118417a(eVar.f120931b.getJSONObject("response").getString("upload_url"));
                    a.mo118431a((C47133a<OperationType, ResponseType>) new C47152a() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void mo118401a(C47151g gVar, C47121c cVar) {
                            if (C47124f.this.f120899h != null) {
                                C47124f.this.f120899h.mo118376a(cVar);
                            }
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void mo118402a(C47151g gVar, JSONObject jSONObject) {
                            VKRequest a = C47124f.this.mo118416a(jSONObject);
                            a.f120899h = new C47115a() {
                                /* renamed from: a */
                                public final void mo118376a(C47121c cVar) {
                                    if (C47124f.this.f120899h != null) {
                                        C47124f.this.f120899h.mo118376a(cVar);
                                    }
                                }

                                /* renamed from: a */
                                public final void mo118377a(C47123e eVar) {
                                    if (C47124f.this.f120899h != null) {
                                        C47124f.this.f120899h.mo118377a(eVar);
                                    }
                                    C47126a.this.mo118422a(VKOperationState.Finished);
                                }
                            };
                            C47126a.this.f120934a = a.mo118396d();
                            C47135a.m147382a(C47126a.this.f120934a);
                        }
                    });
                    C47126a.this.f120934a = a;
                    C47135a.m147382a(C47126a.this.f120934a);
                } catch (JSONException e) {
                    C47121c cVar = new C47121c(-104);
                    cVar.f120920a = e;
                    cVar.f120924e = e.getMessage();
                    if (C47124f.this.f120899h != null) {
                        C47124f.this.f120899h.mo118376a(cVar);
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo118421b() {
            super.mo118421b();
            this.f120934a = null;
        }

        /* renamed from: a */
        public final void mo118419a() {
            if (this.f120934a != null) {
                this.f120934a.mo118419a();
            }
            super.mo118419a();
        }

        private C47126a() {
        }

        /* renamed from: a */
        public final void mo118420a(ExecutorService executorService) {
            super.mo118420a(executorService);
            final C47115a aVar = C47124f.this.f120899h;
            C47124f.this.f120899h = new C47115a() {
                /* renamed from: a */
                public final void mo118376a(C47121c cVar) {
                    C47126a.this.mo118422a(VKOperationState.Finished);
                    cVar.f120922c = C47124f.this;
                    if (aVar != null) {
                        aVar.mo118376a(cVar);
                    }
                }

                /* renamed from: a */
                public final void mo118377a(C47123e eVar) {
                    C47126a.this.mo118422a(VKOperationState.Finished);
                    eVar.f120930a = C47124f.this;
                    if (aVar != null) {
                        aVar.mo118377a(eVar);
                    }
                }
            };
            mo118422a(VKOperationState.Executing);
            VKRequest h = C47124f.this.mo118418h();
            h.f120899h = new C47128a();
            this.f120934a = h.mo118396d();
            C47135a.m147382a(this.f120934a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract VKRequest mo118416a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C47151g mo118417a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract VKRequest mo118418h();

    public C47124f() {
        super(null);
    }

    /* renamed from: d */
    public final VKAbstractOperation mo118396d() {
        return new C47126a();
    }
}
