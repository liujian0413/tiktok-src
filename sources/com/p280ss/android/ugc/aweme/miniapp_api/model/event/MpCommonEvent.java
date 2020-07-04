package com.p280ss.android.ugc.aweme.miniapp_api.model.event;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.event.MpCommonEvent */
public class MpCommonEvent implements Serializable {
    public int code;
    public String message;
    public boolean success;
    public String type;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.event.MpCommonEvent$a */
    public static final class C33461a {

        /* renamed from: a */
        private String f87352a;

        /* renamed from: b */
        private int f87353b;

        /* renamed from: c */
        private String f87354c;

        /* renamed from: d */
        private boolean f87355d;

        /* renamed from: a */
        public final MpCommonEvent mo85773a() {
            MpCommonEvent mpCommonEvent = new MpCommonEvent();
            mpCommonEvent.type = this.f87352a;
            mpCommonEvent.message = this.f87354c;
            mpCommonEvent.code = this.f87353b;
            mpCommonEvent.success = this.f87355d;
            return mpCommonEvent;
        }

        /* renamed from: a */
        public final C33461a mo85770a(int i) {
            this.f87353b = i;
            return this;
        }

        /* renamed from: b */
        public final C33461a mo85774b(String str) {
            this.f87354c = str;
            return this;
        }

        /* renamed from: a */
        public final C33461a mo85771a(String str) {
            this.f87352a = str;
            return this;
        }

        /* renamed from: a */
        public final C33461a mo85772a(boolean z) {
            this.f87355d = z;
            return this;
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getType() {
        return this.type;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public void setType(String str) {
        this.type = str;
    }
}
