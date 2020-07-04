package com.p280ss.android.ugc.aweme.servicimpl;

import android.content.Context;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.group.C12604b;
import com.bytedance.scene.navigation.C12648d;
import com.bytedance.scene.p639a.C12565c;
import com.bytedance.scene.p639a.p640a.C12559b;
import com.bytedance.scene.p642b.C12586e.C12588a;
import com.p280ss.android.ugc.aweme.photomovie.C34937u;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.tools.beauty.C42177e;
import com.p280ss.android.ugc.gamora.bottomtab.C43867c;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.integration.IIntegrationService;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44781c;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.IntegrationServiceImpl */
public final class IntegrationServiceImpl implements IIntegrationService {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23601a((PropertyReference0) new PropertyReference0Impl(C7575l.m23595a(IntegrationServiceImpl.class), "beautyScene", "<v#0>"))};

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.IntegrationServiceImpl$a */
    static final class C37445a extends Lambda implements C7562b<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C12648d f97716a;

        /* renamed from: b */
        final /* synthetic */ C7541d f97717b;

        /* renamed from: c */
        final /* synthetic */ C7595j f97718c;

        /* renamed from: d */
        final /* synthetic */ C43868d f97719d;

        C37445a(C12648d dVar, C7541d dVar2, C7595j jVar, C43868d dVar3) {
            this.f97716a = dVar;
            this.f97717b = dVar2;
            this.f97718c = jVar;
            this.f97719d = dVar3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m120065a(((Boolean) obj).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120065a(boolean z) {
            if (!z || C37299a.m119792a(this.f97716a, (C12629j) this.f97717b.getValue())) {
                if (C37299a.m119792a(this.f97716a, (C12629j) this.f97717b.getValue())) {
                    this.f97716a.mo31069b();
                }
                return;
            }
            this.f97716a.mo31062a((C12629j) this.f97717b.getValue(), new C12588a().mo30862a(true).mo30860a((C12565c) new C12559b()).mo30863a());
            C37299a.m119789a(this.f97716a, (C12629j) this.f97717b.getValue(), (C7561a<C7581n>) new C7561a<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C37445a f97720a;

                {
                    this.f97720a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    m120066a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m120066a() {
                    ((RecordViewModel) C36113b.m116288a(this.f97720a.f97719d.mo106145d()).mo91871a(RecordViewModel.class)).mo106843h(false);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.IntegrationServiceImpl$b */
    static final class C37447b extends Lambda implements C7561a<C42177e> {

        /* renamed from: a */
        final /* synthetic */ C43868d f97721a;

        C37447b(C43868d dVar) {
            this.f97721a = dVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C42177e invoke() {
            return new C42177e(this.f97721a);
        }
    }

    public final void onPostSceneCreated(C43868d dVar, C12604b bVar) {
        C7573i.m23587b(dVar, "recordEnv");
        C7573i.m23587b(bVar, "groupScene");
    }

    public final void onSceneCreated(C43868d dVar, C12604b bVar) {
        C7573i.m23587b(dVar, "recordEnv");
        C7573i.m23587b(bVar, "groupScene");
    }

    public final List<C43867c> getRecordBottomTabComponents(C43868d dVar) {
        C7573i.m23587b(dVar, "recordEnv");
        return new C37468d().getRecordBottomTabComponents(dVar);
    }

    public final C44781c getToolbarManager(C43868d dVar) {
        C7573i.m23587b(dVar, "recordEnv");
        new C37470e();
        return C37470e.m120149a(dVar);
    }

    public final void onEnvCreated(C43868d dVar, C12604b bVar) {
        C7573i.m23587b(dVar, "recordEnv");
        C7573i.m23587b(bVar, "groupScene");
        C12648d dVar2 = bVar.f33527e;
        if (dVar2 != null) {
            C7573i.m23582a((Object) dVar2, "groupScene.navigationScene ?: return");
            ((RecordViewModel) C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordViewModel.class)).m140465a(dVar2, C37522x.f97873a, new C11672v(), new C37445a(dVar2, C7546e.m23569a(new C37447b(dVar)), $$delegatedProperties[0], dVar));
        }
    }

    public final void openPhotoMovieActivity(Context context, PhotoMovieContext photoMovieContext, List<? extends AVMusic> list, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(photoMovieContext, "photoMovieContext");
        C7573i.m23587b(list, "musicList");
        C7573i.m23587b(str, "shootWay");
        C34937u.m112586a(context, photoMovieContext, list, str);
    }
}
