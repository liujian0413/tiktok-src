package com.bytedance.p263im.core.internal.queue.p597a;

import com.bytedance.p263im.core.proto.Request;

/* renamed from: com.bytedance.im.core.internal.queue.a.b */
public final class C11381b {

    /* renamed from: a */
    public String f30833a;

    /* renamed from: b */
    public String f30834b;

    /* renamed from: c */
    public byte[] f30835c;

    /* renamed from: d */
    public Request f30836d;

    /* renamed from: com.bytedance.im.core.internal.queue.a.b$a */
    public static class C11383a {

        /* renamed from: a */
        public C11381b f30837a = new C11381b();

        /* renamed from: a */
        public final C11383a mo27407a(Request request) {
            this.f30837a.f30836d = request;
            return this;
        }

        /* renamed from: b */
        public final C11383a mo27410b(String str) {
            this.f30837a.f30834b = str;
            return this;
        }

        /* renamed from: a */
        public final C11383a mo27408a(String str) {
            this.f30837a.f30833a = str;
            return this;
        }

        /* renamed from: a */
        public final C11383a mo27409a(byte[] bArr) {
            this.f30837a.f30835c = bArr;
            return this;
        }
    }

    private C11381b() {
    }
}
