package com.p280ss.android.ugc.gamora.editor;

import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39779q.C39780a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.editor.bc */
public final class C44167bc implements C39780a {

    /* renamed from: a */
    private final EditViewModel f114234a;

    /* renamed from: b */
    private final EditToolbarViewModel f114235b;

    /* renamed from: a */
    public final void mo99225a() {
        this.f114235b.mo106418c(2, true);
    }

    /* renamed from: c */
    public final void mo99227c() {
        this.f114235b.mo106418c(4, true);
    }

    /* renamed from: e */
    public final void mo99229e() {
        this.f114235b.mo106427g();
    }

    /* renamed from: d */
    public final void mo99228d() {
        if (this.f114234a.mo106430C()) {
            this.f114235b.mo106418c(6, true);
        }
    }

    /* renamed from: f */
    public final void mo99230f() {
        this.f114235b.mo106418c(12, true);
    }

    /* renamed from: b */
    public final void mo99226b() {
        if (EditViewModel.m139162E()) {
            this.f114235b.f113758d.f114386b = true;
            if (C35563c.f93246i.mo103866d() || !this.f114235b.f113758d.f114388d) {
                this.f114235b.mo106418c(1, true);
            } else {
                this.f114235b.mo106413b(1, true);
            }
        } else {
            this.f114235b.mo106418c(1, true);
        }
    }

    public C44167bc(EditViewModel editViewModel, EditToolbarViewModel editToolbarViewModel) {
        C7573i.m23587b(editViewModel, "editViewModel");
        C7573i.m23587b(editToolbarViewModel, "toolbarViewModel");
        this.f114234a = editViewModel;
        this.f114235b = editToolbarViewModel;
    }
}
