package com.google.api.client.googleapis.json;

import com.google.api.client.json.C17285b;
import com.google.api.client.util.C17366i;
import com.google.api.client.util.C6580n;
import java.util.List;

/* renamed from: com.google.api.client.googleapis.json.a */
public class C17223a extends C17285b {
    @C6580n
    public int code;
    @C6580n
    public List<C17224a> errors;
    @C6580n
    public String message;

    /* renamed from: com.google.api.client.googleapis.json.a$a */
    public static class C17224a extends C17285b {
        @C6580n
        public String domain;
        @C6580n
        public String location;
        @C6580n
        public String locationType;
        @C6580n
        public String message;
        @C6580n
        public String reason;

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C17224a clone() {
            return (C17224a) super.clone();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17224a mo44448c(String str, Object obj) {
            return (C17224a) super.mo44448c(str, obj);
        }
    }

    static {
        C17366i.m57807a(C17224a.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C17223a clone() {
        return (C17223a) super.clone();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C17223a mo44448c(String str, Object obj) {
        return (C17223a) super.mo44448c(str, obj);
    }
}
