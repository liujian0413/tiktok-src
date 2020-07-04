package android.support.p029v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.view.menu.e */
final class C1182e implements OnClickListener, OnDismissListener, OnKeyListener, C1189a {

    /* renamed from: a */
    ListMenuPresenter f4400a;

    /* renamed from: b */
    public C1189a f4401b;

    /* renamed from: c */
    private MenuBuilder f4402c;

    /* renamed from: d */
    private AlertDialog f4403d;

    public final void dismiss() {
        if (this.f4403d != null) {
            this.f4403d.dismiss();
        }
    }

    public C1182e(MenuBuilder menuBuilder) {
        this.f4402c = menuBuilder;
    }

    /* renamed from: a */
    public final boolean mo4339a(MenuBuilder menuBuilder) {
        if (this.f4401b != null) {
            return this.f4401b.mo4339a(menuBuilder);
        }
        return false;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f4400a.mo1112a(this.f4402c, true);
    }

    /* renamed from: a */
    public final void mo4912a(IBinder iBinder) {
        MenuBuilder menuBuilder = this.f4402c;
        C1081a aVar = new C1081a(menuBuilder.f4288a);
        this.f4400a = new ListMenuPresenter(aVar.mo4224a(), (int) R.layout.q);
        this.f4400a.mo1113a((C1189a) this);
        this.f4402c.mo4704a((C1188i) this.f4400a);
        aVar.mo4232a(this.f4400a.mo4688d(), (OnClickListener) this);
        View view = menuBuilder.f4293f;
        if (view != null) {
            aVar.mo4231a(view);
        } else {
            aVar.mo4230a(menuBuilder.f4292e).mo4233a(menuBuilder.f4291d);
        }
        aVar.mo4229a((OnKeyListener) this);
        this.f4403d = aVar.mo4242b();
        this.f4403d.setOnDismissListener(this);
        LayoutParams attributes = this.f4403d.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        this.f4403d.show();
    }

    /* renamed from: a */
    public final void mo4338a(MenuBuilder menuBuilder, boolean z) {
        if (z || menuBuilder == this.f4402c) {
            dismiss();
        }
        if (this.f4401b != null) {
            this.f4401b.mo4338a(menuBuilder, z);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4402c.mo4708a((MenuItem) (MenuItemImpl) this.f4400a.mo4688d().getItem(i), 0);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f4403d.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f4403d.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f4402c.mo4722b(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f4402c.performShortcut(i, keyEvent, 0);
    }
}
