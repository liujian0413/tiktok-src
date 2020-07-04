package com.p1848vk.sdk.api.httpClient;

import com.p1848vk.sdk.api.C47121c;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vk.sdk.api.httpClient.VKAbstractOperation */
public abstract class VKAbstractOperation {

    /* renamed from: a */
    private boolean f120941a;

    /* renamed from: b */
    private ExecutorService f120942b;

    /* renamed from: c */
    public C47134b f120943c;

    /* renamed from: d */
    public VKOperationState f120944d = VKOperationState.Created;

    /* renamed from: com.vk.sdk.api.httpClient.VKAbstractOperation$VKOperationState */
    public enum VKOperationState {
        Created,
        Ready,
        Executing,
        Paused,
        Finished,
        Canceled
    }

    /* renamed from: com.vk.sdk.api.httpClient.VKAbstractOperation$a */
    public static abstract class C47133a<OperationType extends VKAbstractOperation, ResponseType> {
        /* renamed from: a */
        public abstract void mo118401a(OperationType operationtype, C47121c cVar);

        /* renamed from: a */
        public abstract void mo118402a(OperationType operationtype, ResponseType responsetype);
    }

    /* renamed from: com.vk.sdk.api.httpClient.VKAbstractOperation$b */
    public interface C47134b {
        /* renamed from: a */
        void mo118424a();
    }

    public VKAbstractOperation() {
        mo118422a(VKOperationState.Ready);
    }

    /* renamed from: a */
    public void mo118419a() {
        this.f120941a = true;
        mo118422a(VKOperationState.Canceled);
    }

    /* renamed from: b */
    public void mo118421b() {
        C471311 r0 = new Runnable() {
            public final void run() {
                if (VKAbstractOperation.this.f120943c != null) {
                    VKAbstractOperation.this.f120943c.mo118424a();
                }
            }
        };
        if (this.f120942b != null) {
            this.f120942b.submit(r0);
        } else {
            r0.run();
        }
    }

    /* renamed from: a */
    public void mo118420a(ExecutorService executorService) {
        this.f120942b = executorService;
    }

    /* renamed from: a */
    public final void mo118422a(VKOperationState vKOperationState) {
        if (!m147370a(this.f120944d, vKOperationState, this.f120941a)) {
            this.f120944d = vKOperationState;
            if (this.f120944d == VKOperationState.Finished || this.f120944d == VKOperationState.Canceled) {
                mo118421b();
            }
        }
    }

    /* renamed from: a */
    private static boolean m147370a(VKOperationState vKOperationState, VKOperationState vKOperationState2, boolean z) {
        switch (vKOperationState) {
            case Paused:
                if (C471322.f120946a[vKOperationState2.ordinal()] == 3 || vKOperationState2 == VKOperationState.Ready) {
                    return false;
                }
                return true;
            case Executing:
                int i = C471322.f120946a[vKOperationState2.ordinal()];
                if (i != 1) {
                    switch (i) {
                        case 3:
                        case 4:
                            break;
                        default:
                            return true;
                    }
                }
                return false;
            case Canceled:
            case Finished:
                return true;
            case Ready:
                switch (vKOperationState2) {
                    case Paused:
                    case Executing:
                    case Canceled:
                        return false;
                    case Finished:
                        if (!z) {
                            return true;
                        }
                        return false;
                    default:
                        return true;
                }
            default:
                return false;
        }
    }
}
