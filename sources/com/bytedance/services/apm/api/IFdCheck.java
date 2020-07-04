package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;
import java.util.List;

public interface IFdCheck extends IService {
    List<String> getFdList();
}
