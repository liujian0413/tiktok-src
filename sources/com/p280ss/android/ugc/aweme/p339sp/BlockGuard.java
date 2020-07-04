package com.p280ss.android.ugc.aweme.p339sp;

/* renamed from: com.ss.android.ugc.aweme.sp.BlockGuard */
public final class BlockGuard {

    /* renamed from: a */
    public static final C7223a f20194a = new C7223a() {
    };

    /* renamed from: b */
    private static ThreadLocal<C7223a> f20195b = new ThreadLocal<C7223a>() {
        /* renamed from: a */
        private static C7223a m22650a() {
            return BlockGuard.f20194a;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return m22650a();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.sp.BlockGuard$a */
    public interface C7223a {
    }

    /* renamed from: com.ss.android.ugc.aweme.sp.BlockGuard$BlockGuardPolicyException */
    public static class BlockGuardPolicyException extends RuntimeException {
        private final String mMessage;
        private final int mPolicyState;
        private final int mPolicyViolated;

        public int getPolicy() {
            return this.mPolicyState;
        }

        public int getPolicyViolation() {
            return this.mPolicyViolated;
        }

        public String getMessage() {
            String str;
            StringBuilder sb = new StringBuilder("policy=");
            sb.append(this.mPolicyState);
            sb.append(" violation=");
            sb.append(this.mPolicyViolated);
            if (this.mMessage == null) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder(" msg=");
                sb2.append(this.mMessage);
                str = sb2.toString();
            }
            sb.append(str);
            return sb.toString();
        }

        public BlockGuardPolicyException(int i, int i2) {
            this(i, i2, null);
        }

        public BlockGuardPolicyException(int i, int i2, String str) {
            this.mPolicyState = i;
            this.mPolicyViolated = i2;
            this.mMessage = str;
            fillInStackTrace();
        }
    }

    /* renamed from: a */
    public static C7223a m22649a() {
        return (C7223a) f20195b.get();
    }
}
