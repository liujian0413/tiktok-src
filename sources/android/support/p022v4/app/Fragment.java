package android.support.p022v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0070y;
import android.arch.lifecycle.C0071z;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p022v4.util.C0891c;
import android.support.p022v4.util.C0904k;
import android.support.p022v4.view.C0975g;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.app.Fragment */
public class Fragment implements C0043i, C0071z, ComponentCallbacks, OnCreateContextMenuListener {
    static final Object USE_DEFAULT_TRANSITION = new Object();
    private static final C0904k<String, Class<?>> sClassMap = new C0904k<>();
    boolean mAdded;
    C0550a mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    public C0612l mChildFragmentManager;
    C0632p mChildNonConfig;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public C0612l mFragmentManager;
    boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    boolean mHiddenChanged;
    FragmentHostCallback mHost;
    public boolean mInLayout;
    int mIndex = -1;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    LayoutInflater mLayoutInflater;
    C0044j mLifecycleRegistry = new C0044j(this);
    public boolean mMenuVisible = true;
    public Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    public boolean mRemoving;
    boolean mRestored;
    public boolean mRetainInstance = true;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    public String mTag;
    public Fragment mTarget;
    int mTargetIndex = -1;
    public int mTargetRequestCode;
    public boolean mUserVisibleHint = true;
    View mView;
    C0043i mViewLifecycleOwner;
    public C0052o<C0043i> mViewLifecycleOwnerLiveData = new C0052o<>();
    C0044j mViewLifecycleRegistry;
    C0070y mViewModelStore;
    String mWho;

    /* renamed from: android.support.v4.app.Fragment$InstantiationException */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: android.support.v4.app.Fragment$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m2261a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m2259a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2259a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m2261a(i);
            }

            /* renamed from: a */
            private static SavedState m2260a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m2260a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        final Bundle f2132a;

        public int describeContents() {
            return 0;
        }

        SavedState(Bundle bundle) {
            this.f2132a = bundle;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f2132a);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f2132a = parcel.readBundle();
            if (classLoader != null && this.f2132a != null) {
                this.f2132a.setClassLoader(classLoader);
            }
        }
    }

    /* renamed from: android.support.v4.app.Fragment$a */
    static class C0550a {

        /* renamed from: a */
        View f2133a;

        /* renamed from: b */
        Animator f2134b;

        /* renamed from: c */
        int f2135c;

        /* renamed from: d */
        int f2136d;

        /* renamed from: e */
        int f2137e;

        /* renamed from: f */
        int f2138f;

        /* renamed from: g */
        Object f2139g;

        /* renamed from: h */
        Object f2140h = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: i */
        Object f2141i;

        /* renamed from: j */
        Object f2142j = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: k */
        Object f2143k;

        /* renamed from: l */
        Object f2144l = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: m */
        Boolean f2145m;

        /* renamed from: n */
        Boolean f2146n;

        /* renamed from: o */
        C0591ae f2147o;

        /* renamed from: p */
        C0591ae f2148p;

        /* renamed from: q */
        boolean f2149q;

        /* renamed from: r */
        C0551b f2150r;

        /* renamed from: s */
        boolean f2151s;

        C0550a() {
        }
    }

    /* renamed from: android.support.v4.app.Fragment$b */
    interface C0551b {
        /* renamed from: a */
        void mo2358a();

        /* renamed from: b */
        void mo2359b();
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public View getView() {
        return this.mView;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public C0650v getLoaderManager() {
        return C0650v.m2811a(this);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f2149q = true;
    }

    private C0550a ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0550a();
        }
        return this.mAnimationInfo;
    }

    public final FragmentActivity getActivity() {
        if (this.mHost == null) {
            return null;
        }
        return (FragmentActivity) this.mHost.f2158b;
    }

    /* access modifiers changed from: 0000 */
    public View getAnimatingAway() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2133a;
    }

    /* access modifiers changed from: 0000 */
    public Animator getAnimator() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2134b;
    }

    public Context getContext() {
        if (this.mHost == null) {
            return null;
        }
        return this.mHost.f2159c;
    }

    public Object getEnterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2139g;
    }

    /* access modifiers changed from: 0000 */
    public C0591ae getEnterTransitionCallback() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2147o;
    }

    public Object getExitTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2141i;
    }

    /* access modifiers changed from: 0000 */
    public C0591ae getExitTransitionCallback() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2148p;
    }

    public final Object getHost() {
        if (this.mHost == null) {
            return null;
        }
        return this.mHost.mo2418f();
    }

    public final LayoutInflater getLayoutInflater() {
        if (this.mLayoutInflater == null) {
            return performGetLayoutInflater(null);
        }
        return this.mLayoutInflater;
    }

    /* access modifiers changed from: 0000 */
    public int getNextAnim() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f2136d;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransition() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f2137e;
    }

    /* access modifiers changed from: 0000 */
    public int getNextTransitionStyle() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f2138f;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public Object getSharedElementEnterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.f2143k;
    }

    /* access modifiers changed from: 0000 */
    public int getStateAfterAnimating() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.f2135c;
    }

    public C0043i getViewLifecycleOwner() {
        if (this.mViewLifecycleOwner != null) {
            return this.mViewLifecycleOwner;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final boolean isAdded() {
        if (this.mHost == null || !this.mAdded) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean isHideReplaced() {
        if (this.mAnimationInfo == null) {
            return false;
        }
        return this.mAnimationInfo.f2151s;
    }

    /* access modifiers changed from: 0000 */
    public boolean isPostponed() {
        if (this.mAnimationInfo == null) {
            return false;
        }
        return this.mAnimationInfo.f2149q;
    }

    public final boolean isResumed() {
        if (this.mState >= 4) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        if (this.mFragmentManager == null) {
            return false;
        }
        return this.mFragmentManager.mo2660h();
    }

    /* access modifiers changed from: 0000 */
    public void noteStateNotSaved() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2704m();
        }
    }

    /* access modifiers changed from: 0000 */
    public void performLowMemory() {
        onLowMemory();
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2716v();
        }
    }

    /* access modifiers changed from: 0000 */
    public void callStartTransitionListener() {
        C0551b bVar;
        if (this.mAnimationInfo == null) {
            bVar = null;
        } else {
            this.mAnimationInfo.f2149q = false;
            bVar = this.mAnimationInfo.f2150r;
            this.mAnimationInfo.f2150r = null;
        }
        if (bVar != null) {
            bVar.mo2358a();
        }
    }

    public boolean getAllowEnterTransitionOverlap() {
        if (this.mAnimationInfo == null || this.mAnimationInfo.f2146n == null) {
            return true;
        }
        return this.mAnimationInfo.f2146n.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        if (this.mAnimationInfo == null || this.mAnimationInfo.f2145m == null) {
            return true;
        }
        return this.mAnimationInfo.f2145m.booleanValue();
    }

    public Object getReenterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        if (this.mAnimationInfo.f2142j == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return this.mAnimationInfo.f2142j;
    }

    public Object getReturnTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        if (this.mAnimationInfo.f2140h == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return this.mAnimationInfo.f2140h;
    }

    public Object getSharedElementReturnTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        if (this.mAnimationInfo.f2144l == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return this.mAnimationInfo.f2144l;
    }

    public C0070y getViewModelStore() {
        if (getContext() != null) {
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C0070y();
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: 0000 */
    public void instantiateChildFragmentManager() {
        if (this.mHost != null) {
            this.mChildFragmentManager = new C0612l();
            this.mChildFragmentManager.mo2678a(this.mHost, (C0606h) new C0606h() {
                /* renamed from: a */
                public final boolean mo2352a() {
                    if (Fragment.this.mView != null) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: a */
                public final View mo2351a(int i) {
                    if (Fragment.this.mView != null) {
                        return Fragment.this.mView.findViewById(i);
                    }
                    throw new IllegalStateException("Fragment does not have a view");
                }

                /* renamed from: a */
                public final Fragment mo2350a(Context context, String str, Bundle bundle) {
                    return Fragment.this.mHost.mo2350a(context, str, bundle);
                }
            }, this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    public void onDestroy() {
        boolean z = true;
        this.mCalled = true;
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            z = false;
        }
        if (this.mViewModelStore != null && !z) {
            this.mViewModelStore.mo151a();
        }
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    public final C0608j requireFragmentManager() {
        C0612l lVar = this.mFragmentManager;
        if (lVar != null) {
            return lVar;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a host.");
        throw new IllegalStateException(sb.toString());
    }

    public final C0608j getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            if (this.mState >= 4) {
                this.mChildFragmentManager.mo2710q();
            } else if (this.mState >= 3) {
                this.mChildFragmentManager.mo2709p();
            } else if (this.mState >= 2) {
                this.mChildFragmentManager.mo2706o();
            } else if (this.mState > 0) {
                this.mChildFragmentManager.mo2705n();
            }
        }
        return this.mChildFragmentManager;
    }

    /* access modifiers changed from: 0000 */
    public void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
    }

    public final boolean isVisible() {
        if (!isAdded() || this.mHidden || this.mView == null || this.mView.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void performDestroy() {
        this.mLifecycleRegistry.mo116a(Event.ON_DESTROY);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2715u();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new C0593af(sb.toString());
    }

    public void startPostponedEnterTransition() {
        if (this.mFragmentManager == null || this.mFragmentManager.f2414m == null) {
            ensureAnimationInfo().f2149q = false;
        } else if (Looper.myLooper() != this.mFragmentManager.f2414m.f2160d.getLooper()) {
            this.mFragmentManager.f2414m.f2160d.postAtFrontOfQueue(new Runnable() {
                public final void run() {
                    Fragment.this.callStartTransitionListener();
                }
            });
        } else {
            callStartTransitionListener();
        }
    }

    /* access modifiers changed from: 0000 */
    public void performDestroyView() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.mo116a(Event.ON_DESTROY);
        }
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2713t();
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C0650v.m2811a(this).mo2481a();
            this.mPerformedCreateView = false;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new C0593af(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDetach()");
            throw new C0593af(sb.toString());
        } else if (this.mChildFragmentManager == null) {
        } else {
            if (this.mRetaining) {
                this.mChildFragmentManager.mo2715u();
                this.mChildFragmentManager = null;
                return;
            }
            StringBuilder sb2 = new StringBuilder("Child FragmentManager of ");
            sb2.append(this);
            sb2.append(" was not  destroyed and this fragment is not retaining instance");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPause() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.mo116a(Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo116a(Event.ON_PAUSE);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2711r();
        }
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new C0593af(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void performResume() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2704m();
            this.mChildFragmentManager.mo2701j();
        }
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.mo2710q();
                this.mChildFragmentManager.mo2701j();
            }
            this.mLifecycleRegistry.mo116a(Event.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.mo116a(Event.ON_RESUME);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new C0593af(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performStart() {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2704m();
            this.mChildFragmentManager.mo2701j();
        }
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.mo2709p();
            }
            this.mLifecycleRegistry.mo116a(Event.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.mo116a(Event.ON_START);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new C0593af(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void performStop() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.mo116a(Event.ON_STOP);
        }
        this.mLifecycleRegistry.mo116a(Event.ON_STOP);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2712s();
        }
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new C0593af(sb.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        C0891c.m3790a(this, sb);
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    /* access modifiers changed from: 0000 */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f2133a = view;
    }

    /* access modifiers changed from: 0000 */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f2134b = animator;
    }

    public void setEnterSharedElementCallback(C0591ae aeVar) {
        ensureAnimationInfo().f2147o = aeVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f2139g = obj;
    }

    public void setExitSharedElementCallback(C0591ae aeVar) {
        ensureAnimationInfo().f2148p = aeVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f2141i = obj;
    }

    /* access modifiers changed from: 0000 */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f2151s = z;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f2142j = obj;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f2140h = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f2143k = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f2144l = obj;
    }

    /* access modifiers changed from: 0000 */
    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().f2135c = i;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    /* access modifiers changed from: 0000 */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2674a(configuration);
        }
    }

    /* access modifiers changed from: 0000 */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        this.mLayoutInflater = onGetLayoutInflater(bundle);
        return this.mLayoutInflater;
    }

    /* access modifiers changed from: 0000 */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2681a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2691b(z);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f2146n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f2145m = Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().f2136d = i;
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        if (this.mHost != null) {
            return this.mHost.mo2412a(str);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        if (this.mChildFragmentManager != null) {
            return this.mChildFragmentManager.mo2686b(str);
        }
        return null;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        if (this.mHost != null) {
            LayoutInflater b = this.mHost.mo2413b();
            getChildFragmentManager();
            C0975g.m4117a(b, this.mChildFragmentManager.mo2717w());
            return b;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        if (this.mHost == null) {
            activity = null;
        } else {
            activity = this.mHost.f2158b;
        }
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager != null && !this.mChildFragmentManager.mo2692b(1)) {
            this.mChildFragmentManager.mo2705n();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            if (this.mChildFragmentManager != null && this.mChildFragmentManager.mo2693b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.mo2690b(menu);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        if (this.mChildFragmentManager != null) {
            return z | this.mChildFragmentManager.mo2682a(menu);
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        if (this.mChildFragmentManager != null) {
            Parcelable l = this.mChildFragmentManager.mo2703l();
            if (l != null) {
                bundle.putParcelable("android:support:fragments", l);
            }
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mIndex < 0 || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !this.mHidden) {
                this.mHost.mo2415c();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mIndex < 0) {
            if (savedState == null || savedState.f2132a == null) {
                bundle = null;
            } else {
                bundle = savedState.f2132a;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !this.mHidden) {
                this.mHost.mo2415c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void performActivityCreated(Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2704m();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onActivityCreated()");
            throw new C0593af(sb.toString());
        } else if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2706o();
        }
    }

    /* access modifiers changed from: 0000 */
    public void performCreate(Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2704m();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo116a(Event.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new C0593af(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            if (this.mChildFragmentManager != null && this.mChildFragmentManager.mo2684a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void restoreChildFragmentState(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.mChildFragmentManager == null) {
                    instantiateChildFragmentManager();
                }
                this.mChildFragmentManager.mo2675a(parcelable, this.mChildNonConfig);
                this.mChildNonConfig = null;
                this.mChildFragmentManager.mo2705n();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void restoreViewState(Bundle bundle) {
        if (this.mSavedViewState != null) {
            this.mInnerView.restoreHierarchyState(this.mSavedViewState);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new C0593af(sb.toString());
        } else if (this.mView != null) {
            this.mViewLifecycleRegistry.mo116a(Event.ON_CREATE);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setOnStartEnterTransitionListener(C0551b bVar) {
        ensureAnimationInfo();
        if (bVar != this.mAnimationInfo.f2150r) {
            if (bVar == null || this.mAnimationInfo.f2150r == null) {
                if (this.mAnimationInfo.f2149q) {
                    this.mAnimationInfo.f2150r = bVar;
                }
                if (bVar != null) {
                    bVar.mo2359b();
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2;
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.mo2687b(this);
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 3 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    static boolean isSupportFragmentClass(Context context, String str) {
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    /* access modifiers changed from: 0000 */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        if (this.mChildFragmentManager != null) {
            return z | this.mChildFragmentManager.mo2683a(menu, menuInflater);
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f2137e = i;
            this.mAnimationInfo.f2138f = i2;
        }
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            this.mHost.mo2409a(this, strArr, i);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public final void setIndex(int i, Fragment fragment) {
        this.mIndex = i;
        if (fragment != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(fragment.mWho);
            sb.append(":");
            sb.append(this.mIndex);
            this.mWho = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder("android:fragment:");
        sb2.append(this.mIndex);
        this.mWho = sb2.toString();
    }

    public void startActivity(Intent intent, Bundle bundle) {
        if (this.mHost != null) {
            this.mHost.mo2407a(this, intent, -1, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public void setTargetFragment(Fragment fragment, int i) {
        C0612l lVar;
        C0612l lVar2 = this.mFragmentManager;
        if (fragment != null) {
            lVar = fragment.mFragmentManager;
        } else {
            lVar = null;
        }
        if (lVar2 == null || lVar == null || lVar2 == lVar) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.mTarget;
                } else {
                    StringBuilder sb = new StringBuilder("Setting ");
                    sb.append(fragment);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.mTarget = fragment;
            this.mTargetRequestCode = i;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Fragment ");
        sb2.append(fragment);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        if (this.mHost == null) {
            activity = null;
        } else {
            activity = this.mHost.f2158b;
        }
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.mChildFragmentManager != null) {
            this.mChildFragmentManager.mo2704m();
        }
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0043i() {
            public final Lifecycle getLifecycle() {
                if (Fragment.this.mViewLifecycleRegistry == null) {
                    Fragment.this.mViewLifecycleRegistry = new C0044j(Fragment.this.mViewLifecycleOwner);
                }
                return Fragment.this.mViewLifecycleRegistry;
            }
        };
        this.mViewLifecycleRegistry = null;
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null) {
            this.mViewLifecycleOwner.getLifecycle();
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        } else if (this.mViewLifecycleRegistry == null) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            this.mHost.mo2407a(this, intent, i, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new InstantiationException(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new InstantiationException(sb2.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new InstantiationException(sb3.toString(), e3);
        } catch (NoSuchMethodException e4) {
            StringBuilder sb4 = new StringBuilder("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": could not find Fragment constructor");
            throw new InstantiationException(sb4.toString(), e4);
        } catch (InvocationTargetException e5) {
            StringBuilder sb5 = new StringBuilder("Unable to instantiate fragment ");
            sb5.append(str);
            sb5.append(": calling Fragment constructor caused an exception");
            throw new InstantiationException(sb5.toString(), e5);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            C0650v.m2811a(this).mo2483a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            StringBuilder sb = new StringBuilder("Child ");
            sb.append(this.mChildFragmentManager);
            sb.append(":");
            printWriter.println(sb.toString());
            C0612l lVar = this.mChildFragmentManager;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            lVar.mo2652a(sb2.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (this.mHost != null) {
            this.mHost.mo2408a(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
}
