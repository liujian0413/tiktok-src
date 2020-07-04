package com.bytedance.router.interceptor;

import java.util.List;

public interface IInterceptorProvider {
    List<IInterceptor> getInterceptors();
}
