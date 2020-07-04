package android.support.p022v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0070y;
import android.arch.lifecycle.C0071z;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.p022v4.app.ActivityCompat.C0539a;
import android.support.p022v4.app.ActivityCompat.C0540b;
import android.support.p022v4.app.ActivityCompat.C0541c;
import android.support.p022v4.util.C0905l;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.FragmentActivity */
public class FragmentActivity extends SupportActivity implements C0071z, C0539a, C0541c {
    boolean mCreated;
    final C0607i mFragments = C0607i.m2538a((FragmentHostCallback<?>) new C0553a<Object>());
    final Handler mHandler = new Handler() {
        public final void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            FragmentActivity.this.onResumeFragments();
            FragmentActivity.this.mFragments.mo2640m();
        }
    };
    int mNextCandidateRequestIndex;
    C0905l<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;
    private C0070y mViewModelStore;

    /* renamed from: android.support.v4.app.FragmentActivity$a */
    class C0553a extends FragmentHostCallback<FragmentActivity> {
        /* renamed from: f */
        public final /* bridge */ /* synthetic */ Object mo2418f() {
            return FragmentActivity.this;
        }

        /* renamed from: c */
        public final void mo2415c() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: b */
        public final LayoutInflater mo2413b() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: d */
        public final boolean mo2416d() {
            if (FragmentActivity.this.getWindow() != null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final int mo2417e() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        /* renamed from: a */
        public final boolean mo2352a() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        public C0553a() {
            super(FragmentActivity.this);
        }

        /* renamed from: a */
        public final View mo2351a(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: b */
        public final void mo2414b(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        /* renamed from: a */
        public final boolean mo2411a(Fragment fragment) {
            if (!FragmentActivity.this.isFinishing()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo2412a(String str) {
            return ActivityCompat.m2242a((Activity) FragmentActivity.this, str);
        }

        /* renamed from: a */
        public final void mo2409a(Fragment fragment, String[] strArr, int i) {
            FragmentActivity.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        /* renamed from: a */
        public final void mo2407a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        /* renamed from: a */
        public final void mo2410a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, null, printWriter, strArr);
        }

        /* renamed from: a */
        public final void mo2408a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
            FragmentActivity.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: android.support.v4.app.FragmentActivity$b */
    static final class C0554b {

        /* renamed from: a */
        Object f2154a;

        /* renamed from: b */
        C0070y f2155b;

        /* renamed from: c */
        C0632p f2156c;

        C0554b() {
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.m2243b(this);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.m2246d(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.m2247e(this);
    }

    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    public C0608j getSupportFragmentManager() {
        return this.mFragments.mo2617a();
    }

    public C0650v getSupportLoaderManager() {
        return C0650v.m2811a(this);
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragments.mo2635h();
    }

    public void onStateNotSaved() {
        this.mFragments.mo2626b();
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), State.CREATED));
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0554b bVar = (C0554b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.f2154a;
        }
        return null;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.mo2639l();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.mo2637j();
    }

    public void onBackPressed() {
        C0608j a = this.mFragments.mo2617a();
        boolean h = a.mo2660h();
        if (!h || VERSION.SDK_INT > 25) {
            if (h || !a.mo2656d()) {
                super.onBackPressed();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.mViewModelStore != null && !isChangingConfigurations()) {
            this.mViewModelStore.mo151a();
        }
        this.mFragments.mo2638k();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        if (this.mHandler.hasMessages(2)) {
            this.mHandler.removeMessages(2);
            onResumeFragments();
        }
        this.mFragments.mo2636i();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        onResumeFragments();
        this.mFragments.mo2640m();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.mo2640m();
    }

    public C0070y getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                C0554b bVar = (C0554b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.mViewModelStore = bVar.f2155b;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new C0070y();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C0632p d = this.mFragments.mo2631d();
        if (d == null && this.mViewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0554b bVar = new C0554b();
        bVar.f2154a = onRetainCustomNonConfigurationInstance;
        bVar.f2155b = this.mViewModelStore;
        bVar.f2156c = d;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.mo2633f();
        }
        this.mFragments.mo2626b();
        this.mFragments.mo2640m();
        this.mFragments.mo2634g();
    }

    public void setEnterSharedElementCallback(C0591ae aeVar) {
        ActivityCompat.m2240a((Activity) this, aeVar);
    }

    public void setExitSharedElementCallback(C0591ae aeVar) {
        ActivityCompat.m2244b(this, aeVar);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.mo2622a(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.mo2628b(z);
    }

    static void checkForValidRequestCode(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.mo2626b();
        this.mFragments.mo2619a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.mo2626b();
    }

    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.mo3435b() < 65534) {
            while (this.mPendingFragmentActivityResults.mo3444f(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            }
            int i = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.mo3437b(i, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0632p pVar = null;
        this.mFragments.mo2621a((Fragment) null);
        super.onCreate(bundle);
        C0554b bVar = (C0554b) getLastNonConfigurationInstance();
        if (!(bVar == null || bVar.f2155b == null || this.mViewModelStore != null)) {
            this.mViewModelStore = bVar.f2155b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0607i iVar = this.mFragments;
            if (bVar != null) {
                pVar = bVar.f2156c;
            }
            iVar.mo2620a(parcelable, pVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (!(intArray == null || stringArray == null || intArray.length != stringArray.length)) {
                    this.mPendingFragmentActivityResults = new C0905l<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.mo3437b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C0905l<>();
            this.mNextCandidateRequestIndex = 0;
        }
        this.mFragments.mo2632e();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        Parcelable c = this.mFragments.mo2630c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.mPendingFragmentActivityResults.mo3435b() > 0) {
            bundle.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.mo3435b()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.mo3435b()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.mo3435b(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.mo3442d(i);
                strArr[i] = (String) this.mPendingFragmentActivityResults.mo3443e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.mo2627b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.mo2624a(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.mo2625a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.mo2629b(menuItem);
    }

    private static boolean markState(C0608j jVar, State state) {
        boolean z = false;
        for (Fragment fragment : jVar.mo2658f()) {
            if (fragment != null) {
                if (fragment.getLifecycle().mo54a().isAtLeast(State.STARTED)) {
                    fragment.mLifecycleRegistry.mo117a(state);
                    z = true;
                }
                C0612l lVar = fragment.mChildFragmentManager;
                if (lVar != null) {
                    z |= markState(lVar, state);
                }
            }
        }
        return z;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, null);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return onPrepareOptionsPanel(view, menu) | this.mFragments.mo2623a(menu);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo2626b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.mPendingFragmentActivityResults.mo3433a(i4);
            this.mPendingFragmentActivityResults.mo3436b(i4);
            if (str != null) {
                Fragment a = this.mFragments.mo2616a(str);
                if (a != null) {
                    a.onActivityResult(i & 65535, i2, intent);
                }
                return;
            }
            return;
        }
        C0540b a2 = ActivityCompat.m2236a();
        if (a2 == null || !a2.mo2175a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo2626b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.mPendingFragmentActivityResults.mo3433a(i3);
            this.mPendingFragmentActivityResults.mo3436b(i3);
            if (str != null) {
                Fragment a = this.mFragments.mo2616a(str);
                if (a != null) {
                    a.onRequestPermissionsResult(i & 65535, strArr, iArr);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            ActivityCompat.m2241a(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            ActivityCompat.m2241a(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.mRequestedPermissionsFromFragment = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.mo2618a(view, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                ActivityCompat.m2238a(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            ActivityCompat.m2238a(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            C0650v.m2811a(this).mo2483a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.mo2617a().mo2652a(str, fileDescriptor, printWriter, strArr);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        int i5 = i;
        this.mStartedIntentSenderFromFragment = true;
        if (i5 == -1) {
            try {
                ActivityCompat.m2239a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            ActivityCompat.m2239a(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i5 & 65535), intent, i2, i3, i4, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }
}
