package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.p263im.core.model.Message;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a */
public final class C31544a {

    /* renamed from: e */
    public static List<Message> f82574e;

    /* renamed from: f */
    public static final C31546b f82575f = new C31546b(null);

    /* renamed from: a */
    public String f82576a;

    /* renamed from: b */
    public Message f82577b;

    /* renamed from: c */
    public List<Message> f82578c;

    /* renamed from: d */
    public ArrayList<DragViewInfo> f82579d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a$a */
    public static final class C31545a {

        /* renamed from: a */
        public final C31544a f82580a = new C31544a();

        /* renamed from: a */
        public final C31545a mo82259a(Message message) {
            this.f82580a.f82577b = message;
            return this;
        }

        /* renamed from: b */
        public final C31545a mo82262b(ArrayList<DragViewInfo> arrayList) {
            this.f82580a.f82579d = arrayList;
            return this;
        }

        /* renamed from: a */
        public final C31545a mo82260a(String str) {
            this.f82580a.f82576a = str;
            return this;
        }

        /* renamed from: a */
        public final C31545a mo82261a(ArrayList<Message> arrayList) {
            C31546b.m102556a(arrayList);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.a$b */
    public static final class C31546b {
        private C31546b() {
        }

        /* renamed from: a */
        public final void mo82263a() {
            m102556a(null);
        }

        /* renamed from: a */
        public static void m102556a(List<Message> list) {
            C31544a.f82574e = list;
        }

        public /* synthetic */ C31546b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final Intent mo82255a(Intent intent) {
        intent.putExtra("MediaBrowserParam", mo82256a(new Bundle()));
        return intent;
    }

    /* renamed from: b */
    public final C31544a mo82257b(Intent intent) {
        Bundle bundle;
        if (intent != null) {
            bundle = intent.getBundleExtra("MediaBrowserParam");
        } else {
            bundle = null;
        }
        return mo82258b(bundle);
    }

    /* renamed from: a */
    public final Bundle mo82256a(Bundle bundle) {
        bundle.putString("conversation_id", this.f82576a);
        bundle.putSerializable("current_message", this.f82577b);
        bundle.putParcelableArrayList("view_info_list", this.f82579d);
        return bundle;
    }

    /* renamed from: b */
    public final C31544a mo82258b(Bundle bundle) {
        String str;
        Serializable serializable;
        ArrayList<DragViewInfo> arrayList = null;
        if (bundle != null) {
            str = bundle.getString("conversation_id");
        } else {
            str = null;
        }
        this.f82576a = str;
        if (bundle != null) {
            serializable = bundle.getSerializable("current_message");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof Message)) {
            serializable = null;
        }
        this.f82577b = (Message) serializable;
        this.f82578c = f82574e;
        if (bundle != null) {
            arrayList = bundle.getParcelableArrayList("view_info_list");
        }
        this.f82579d = arrayList;
        return this;
    }
}
