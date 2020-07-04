package com.p1848vk.sdk.api.httpClient;

import com.p1848vk.sdk.api.C47121c;
import com.p1848vk.sdk.api.httpClient.C47135a.C47139a;
import com.p1848vk.sdk.api.httpClient.C47135a.C47141c;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation.C47133a;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation.C47134b;
import com.p1848vk.sdk.api.httpClient.VKAbstractOperation.VKOperationState;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vk.sdk.api.httpClient.e */
public class C47145e<ResponseType> extends VKAbstractOperation {

    /* renamed from: a */
    public final C47139a f120962a;

    /* renamed from: b */
    protected Exception f120963b;

    /* renamed from: e */
    public C47141c f120964e;

    /* renamed from: f */
    private String f120965f;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo118433d() {
        return true;
    }

    /* renamed from: a */
    public final void mo118419a() {
        C47135a.m147383a(this);
        super.mo118419a();
    }

    /* renamed from: b */
    public final void mo118421b() {
        mo118433d();
        super.mo118421b();
    }

    /* renamed from: c */
    public ResponseType mo118432c() {
        if (this.f120964e != null) {
            return this.f120964e.f120961d;
        }
        return null;
    }

    /* renamed from: e */
    public final byte[] mo118434e() {
        if (this.f120964e != null) {
            return this.f120964e.f120961d;
        }
        return null;
    }

    /* renamed from: f */
    public final String mo118435f() {
        if (this.f120964e == null || this.f120964e.f120961d == null) {
            return null;
        }
        if (this.f120965f == null) {
            try {
                this.f120965f = new String(this.f120964e.f120961d, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                this.f120963b = e;
            }
        }
        return this.f120965f;
    }

    public C47145e(C47139a aVar) {
        this.f120962a = aVar;
    }

    /* renamed from: a */
    public final <OperationType extends C47145e> void mo118431a(final C47133a<OperationType, ResponseType> aVar) {
        this.f120943c = new C47134b() {
            /* renamed from: a */
            public final void mo118424a() {
                if (C47145e.this.f120944d == VKOperationState.Finished && C47145e.this.f120963b == null) {
                    aVar.mo118402a(C47145e.this, C47145e.this.mo118432c());
                } else {
                    aVar.mo118401a(C47145e.this, C47145e.this.mo118430a(C47145e.this.f120963b));
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C47121c mo118430a(Exception exc) {
        C47121c cVar;
        if (this.f120944d == VKOperationState.Canceled) {
            cVar = new C47121c(-102);
        } else {
            cVar = new C47121c(-105);
        }
        if (exc != null) {
            cVar.f120924e = exc.getMessage();
            if (cVar.f120924e == null) {
                cVar.f120924e = exc.toString();
            }
            cVar.f120920a = exc;
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo118420a(ExecutorService executorService) {
        super.mo118420a(executorService);
        mo118422a(VKOperationState.Executing);
        try {
            if (!this.f120962a.f120956f) {
                this.f120964e = C47135a.m147380a(this.f120962a);
                mo118422a(VKOperationState.Finished);
            }
        } catch (IOException e) {
            this.f120963b = e;
        }
    }
}
