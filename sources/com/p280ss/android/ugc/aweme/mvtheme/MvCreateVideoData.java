package com.p280ss.android.ugc.aweme.mvtheme;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData */
public class MvCreateVideoData implements Serializable {
    @C6593c(mo15949a = "mv_contact_video_path")
    public String contactVideoPath;
    @C6593c(mo15949a = "mask_file_data")
    public ArrayList<AfrFileBean> maskFileData = new ArrayList<>();
    @C6593c(mo15949a = "mv_video_music_ids")
    public List<String> musicIds;
    @C6593c(mo15949a = "mv_auto_save_toast")
    public String mvAutoSaveToast;
    @C6593c(mo15949a = "mv_video_res_unzippath")
    public String mvResUnzipPath;
    @C6593c(mo15949a = "mv_res_zippath")
    public String mvResZipPath;
    @C6593c(mo15949a = "mv_type")
    public int mvType;
    @C6593c(mo15949a = "photo_to_save")
    public ArrayList<String> photoToSave = new ArrayList<>();
    @C6593c(mo15949a = "select_media_list")
    public ArrayList<String> selectMediaList = new ArrayList<>();
    @C6593c(mo15949a = "select_src_media_list")
    public ArrayList<String> srcSelectMediaList = new ArrayList<>();
    @C6593c(mo15949a = "mv_video_cover")
    public String videoCoverImgPath;
    @C6593c(mo15949a = "mv_video_cover_starttime")
    public int videoCoverStartTime;
}
