package com.p280ss.android.newmedia.redbadge.p894a;

import android.content.AsyncQueryHandler;
import android.content.AsyncQueryHandler.WorkerHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import com.p280ss.android.newmedia.redbadge.C19953a;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.l */
public class C19965l implements C19953a {

    /* renamed from: a */
    private final Uri f54053a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    private AsyncQueryHandler f54054b;

    /* renamed from: com.ss.android.newmedia.redbadge.a.l$a */
    static class C19967a extends AsyncQueryHandler {

        /* renamed from: com.ss.android.newmedia.redbadge.a.l$a$a */
        class C19968a extends WorkerHandler {
            public final void handleMessage(Message message) {
                try {
                    C19967a.super.handleMessage(message);
                } catch (SecurityException unused) {
                }
            }

            C19968a(Looper looper) {
                super(C19967a.this, looper);
            }
        }

        C19967a(ContentResolver contentResolver) {
            super(contentResolver);
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [com.ss.android.newmedia.redbadge.a.l$a$a, android.os.Handler] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.ss.android.newmedia.redbadge.a.l$a$a, android.os.Handler]
          assigns: [com.ss.android.newmedia.redbadge.a.l$a$a]
          uses: [android.os.Handler]
          mth insns count: 2
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.os.Handler createHandler(android.os.Looper r2) {
            /*
                r1 = this;
                com.ss.android.newmedia.redbadge.a.l$a$a r0 = new com.ss.android.newmedia.redbadge.a.l$a$a
                r0.<init>(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.redbadge.p894a.C19965l.C19967a.createHandler(android.os.Looper):android.os.Handler");
        }
    }

    /* renamed from: a */
    public final List<String> mo53458a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    /* renamed from: a */
    private static boolean m65824a(Context context) {
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m65823a(int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", str);
        contentValues.put("activity_name", str2);
        this.f54054b.startInsert(0, null, this.f54053a, contentValues);
    }

    /* renamed from: b */
    private static void m65825b(Context context, ComponentName componentName, int i) {
        boolean z;
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        String str = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE";
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra(str, z);
        context.sendBroadcast(intent);
    }

    /* renamed from: c */
    private void m65826c(Context context, ComponentName componentName, int i) {
        if (i >= 0) {
            if (this.f54054b == null) {
                this.f54054b = new C19967a(context.getApplicationContext().getContentResolver()) {
                };
            }
            m65823a(i, componentName.getPackageName(), componentName.getClassName());
        }
    }

    /* renamed from: a */
    public final void mo53459a(Context context, ComponentName componentName, int i) throws RedBadgerException {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            try {
                if (m65824a(context)) {
                    m65826c(context, componentName, i);
                } else {
                    m65825b(context, componentName, i);
                }
            } catch (Throwable th) {
                throw new RedBadgerException(th.getMessage());
            }
        }
    }
}
