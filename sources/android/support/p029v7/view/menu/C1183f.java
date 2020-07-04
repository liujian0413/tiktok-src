package android.support.p029v7.view.menu;

import android.content.Context;
import android.support.p022v4.internal.view.C0746b;
import android.support.p022v4.view.C0958b.C0960b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.f */
final class C1183f extends MenuItemWrapperICS {

    /* renamed from: android.support.v7.view.menu.f$a */
    class C1184a extends C1169a implements VisibilityListener {

        /* renamed from: e */
        C0960b f4404e;

        /* renamed from: b */
        public final boolean mo3734b() {
            return this.f4346c.overridesItemVisibility();
        }

        /* renamed from: c */
        public final boolean mo3735c() {
            return this.f4346c.isVisible();
        }

        /* renamed from: a */
        public final View mo3730a(MenuItem menuItem) {
            return this.f4346c.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public final void mo3731a(C0960b bVar) {
            this.f4404e = bVar;
            this.f4346c.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            if (this.f4404e != null) {
                this.f4404e.mo3740a(z);
            }
        }

        public C1184a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1169a mo4811a(ActionProvider actionProvider) {
        return new C1184a(this.f4353a, actionProvider);
    }

    C1183f(Context context, C0746b bVar) {
        super(context, bVar);
    }
}
