package com.bytedance.p263im.core.model;

import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.internal.utils.C11432j;
import com.bytedance.p263im.core.internal.utils.MessageSortedList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.model.j */
public final class C11440j implements C11439h {

    /* renamed from: a */
    public final String f30961a;

    /* renamed from: b */
    public final int[] f30962b;

    /* renamed from: c */
    public final int f30963c;

    /* renamed from: d */
    public final MessageSortedList f30964d;

    /* renamed from: e */
    public boolean f30965e = true;

    /* renamed from: f */
    public boolean f30966f;

    /* renamed from: g */
    private C11439h f30967g;

    /* renamed from: a */
    public final void mo27445a(int i, Message message) {
    }

    /* renamed from: a */
    public final void mo27446a(int i, PropertyMsg propertyMsg) {
    }

    /* renamed from: a */
    public final void mo27454a(boolean z) {
    }

    /* renamed from: b */
    public final void mo27455b(int i, Message message) {
    }

    /* renamed from: c */
    public final void mo27462c(List<Message> list) {
    }

    /* renamed from: f */
    public final void mo27466f(List<Message> list) {
    }

    /* renamed from: g */
    public final void mo27467g(List<PropertyMsg> list) {
    }

    /* renamed from: d */
    public final List<Message> mo27658d() {
        return new ArrayList(this.f30964d);
    }

    /* renamed from: a */
    public final void mo27654a() {
        this.f30967g = null;
        this.f30964d.clear();
        C11407f.m33601a().mo27460b(this.f30961a, (C11439h) this);
    }

    /* renamed from: b */
    public final void mo27656b() {
        C11432j.m33706a();
        if (!this.f30966f) {
            this.f30966f = true;
            C11319e.m33191a(new C11318d<List<Message>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public List<Message> mo15560a() {
                    Message c = C11440j.this.mo27657c();
                    if (c == null) {
                        return null;
                    }
                    C11375q.m33429a();
                    return C11375q.m33435a(C11440j.this.f30961a, c.getIndex(), C11440j.this.f30963c, C11440j.this.f30962b);
                }
            }, new C11317c<List<Message>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(List<Message> list) {
                    C11440j.this.f30966f = false;
                    C11440j.this.mo27464e(list);
                }
            });
        }
    }

    /* renamed from: c */
    public final Message mo27657c() {
        if (this.f30964d.isEmpty()) {
            return null;
        }
        return (Message) this.f30964d.get(this.f30964d.size() - 1);
    }

    /* renamed from: a */
    public final void mo27655a(C11439h hVar) {
        this.f30967g = hVar;
        C11407f.m33601a().mo27452a(this.f30961a, (C11439h) this);
    }

    /* renamed from: d */
    public final void mo27463d(List<Message> list) {
        if (this.f30967g != null) {
            this.f30967g.mo27463d(list);
        }
    }

    /* renamed from: e */
    public final void mo27464e(List<Message> list) {
        if (list != null && !list.isEmpty()) {
            this.f30964d.appendList(list);
        }
        if (this.f30967g != null) {
            this.f30967g.mo27464e(list);
        }
    }

    /* renamed from: a */
    public final void mo27447a(Message message) {
        if (this.f30964d.remove(message) && this.f30967g != null) {
            this.f30967g.mo27447a(message);
        }
    }

    /* renamed from: b */
    public final void mo27456b(Message message) {
        if (message != null && this.f30967g != null) {
            this.f30964d.update(message);
            this.f30967g.mo27456b(message);
        }
    }

    public C11440j(String str, int[] iArr, int i) {
        this.f30961a = str;
        this.f30962b = iArr;
        this.f30963c = i;
        this.f30964d = new MessageSortedList();
    }
}
