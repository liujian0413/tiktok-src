package com.p280ss.android.ugc.aweme.out;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.services.video.IRecordActivityService;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPublishActivity;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.out.i */
public final class C34720i implements IRecordActivityService {

    /* renamed from: a */
    public static final C7541d f90520a = C7546e.m23569a(C34722b.f90523a);

    /* renamed from: b */
    public static final C34721a f90521b = new C34721a(null);

    /* renamed from: com.ss.android.ugc.aweme.out.i$a */
    public static final class C34721a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f90522a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C34721a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/out/RecordActivityServiceImpl;"))};

        private C34721a() {
        }

        /* renamed from: a */
        public static C34720i m112043a() {
            return (C34720i) C34720i.f90520a.getValue();
        }

        public /* synthetic */ C34721a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.i$b */
    static final class C34722b extends Lambda implements C7561a<C34720i> {

        /* renamed from: a */
        public static final C34722b f90523a = new C34722b();

        C34722b() {
            super(0);
        }

        /* renamed from: a */
        private static C34720i m112044a() {
            return new C34720i(null);
        }

        public final /* synthetic */ Object invoke() {
            return m112044a();
        }
    }

    private C34720i() {
    }

    /* renamed from: a */
    public static final C34720i m112042a() {
        return C34721a.m112043a();
    }

    public final Class<? extends Activity> getVideoPublishActivityClass() {
        return VideoPublishActivity.class;
    }

    public final Class<? extends Activity> getVideoRecordActivityClass() {
        return VideoRecordNewActivity.class;
    }

    public /* synthetic */ C34720i(C7571f fVar) {
        this();
    }

    public final boolean instanceOfVideoRecordActivity(Context context) {
        if (context == null) {
            return false;
        }
        return context instanceof VideoRecordNewActivity;
    }
}
