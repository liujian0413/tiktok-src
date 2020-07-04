package com.p280ss.ugc.live.gift.resource.exception;

import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.p1830d.C46231c;

/* renamed from: com.ss.ugc.live.gift.resource.exception.BaseGetResourceException */
public class BaseGetResourceException extends RuntimeException {
    private C46220c mRequest;

    public C46220c getResourceRequest() {
        return this.mRequest;
    }

    public long getId() {
        return this.mRequest.f118812a;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mRequest.toString());
        sb.append("\navailable disk space:");
        sb.append(C46231c.m145168a());
        sb.append("KB\n");
        sb.append(super.getMessage());
        return sb.toString();
    }

    public String toString() {
        String runtimeException = super.toString();
        Throwable cause = getCause();
        if (cause == null || cause == this) {
            return runtimeException;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(runtimeException);
        sb.append("\n");
        sb.append(cause.toString());
        return sb.toString();
    }

    public BaseGetResourceException(C46220c cVar) {
        this.mRequest = cVar;
    }

    public BaseGetResourceException(String str, C46220c cVar) {
        super(str);
        this.mRequest = cVar;
    }

    public BaseGetResourceException(String str, Throwable th, C46220c cVar) {
        super(str, th);
        this.mRequest = cVar;
    }
}
