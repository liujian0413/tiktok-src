package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig */
public final class SuperEntranceConfig extends Message<SuperEntranceConfig, Builder> {
    public static final DefaultValueProtoAdapter<SuperEntranceConfig> ADAPTER = new ProtoAdapter_SuperEntranceConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 6)
    public final String effect_id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 9)
    public final List<String> effect_ids;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 13)
    public final String effect_tip;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 5)
    public final String loop_video_md5;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 4)
    public final String loop_video_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 8)
    public final String plus_icon_md5;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 7)
    public final String plus_icon_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 12)
    public final String try_tip;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.ValidTimesConfig#ADAPTER", label = 2, tag = 1)
    public final List<ValidTimesConfig> valid_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 11)
    public final String video_back_img_md5;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 10)
    public final String video_back_img_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 3)
    public final String video_md5;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 2)
    public final String video_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SuperEntranceConfig, Builder> {
        public String effect_id = "";
        public List<String> effect_ids = Internal.newMutableList();
        public String effect_tip = "";
        public String loop_video_md5 = "";
        public String loop_video_url = "";
        public String plus_icon_md5 = "";
        public String plus_icon_url = "";
        public String try_tip = "";
        public List<ValidTimesConfig> valid_times = Internal.newMutableList();
        public String video_back_img_md5 = "";
        public String video_back_img_url = "";
        public String video_md5 = "";
        public String video_url = "";

        public final SuperEntranceConfig build() {
            if (this.video_url == null || this.video_md5 == null || this.loop_video_url == null || this.loop_video_md5 == null || this.effect_id == null || this.plus_icon_url == null || this.plus_icon_md5 == null || this.video_back_img_url == null || this.video_back_img_md5 == null || this.try_tip == null || this.effect_tip == null) {
                throw C10939b.m32101a(this.video_url, "video_url", this.video_md5, "video_md5", this.loop_video_url, "loop_video_url", this.loop_video_md5, "loop_video_md5", this.effect_id, "effect_id", this.plus_icon_url, "plus_icon_url", this.plus_icon_md5, "plus_icon_md5", this.video_back_img_url, "video_back_img_url", this.video_back_img_md5, "video_back_img_md5", this.try_tip, "try_tip", this.effect_tip, "effect_tip");
            }
            SuperEntranceConfig superEntranceConfig = new SuperEntranceConfig(this.valid_times, this.video_url, this.video_md5, this.loop_video_url, this.loop_video_md5, this.effect_id, this.plus_icon_url, this.plus_icon_md5, this.effect_ids, this.video_back_img_url, this.video_back_img_md5, this.try_tip, this.effect_tip, super.buildUnknownFields());
            return superEntranceConfig;
        }

        public final Builder effect_id(String str) {
            this.effect_id = str;
            return this;
        }

        public final Builder effect_tip(String str) {
            this.effect_tip = str;
            return this;
        }

        public final Builder loop_video_md5(String str) {
            this.loop_video_md5 = str;
            return this;
        }

        public final Builder loop_video_url(String str) {
            this.loop_video_url = str;
            return this;
        }

        public final Builder plus_icon_md5(String str) {
            this.plus_icon_md5 = str;
            return this;
        }

        public final Builder plus_icon_url(String str) {
            this.plus_icon_url = str;
            return this;
        }

        public final Builder try_tip(String str) {
            this.try_tip = str;
            return this;
        }

        public final Builder video_back_img_md5(String str) {
            this.video_back_img_md5 = str;
            return this;
        }

        public final Builder video_back_img_url(String str) {
            this.video_back_img_url = str;
            return this;
        }

        public final Builder video_md5(String str) {
            this.video_md5 = str;
            return this;
        }

        public final Builder video_url(String str) {
            this.video_url = str;
            return this;
        }

        public final Builder effect_ids(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.effect_ids = list;
            return this;
        }

        public final Builder valid_times(List<ValidTimesConfig> list) {
            Internal.checkElementsNotNull(list);
            this.valid_times = list;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig$ProtoAdapter_SuperEntranceConfig */
    static final class ProtoAdapter_SuperEntranceConfig extends DefaultValueProtoAdapter<SuperEntranceConfig> {
        public final SuperEntranceConfig redact(SuperEntranceConfig superEntranceConfig) {
            return superEntranceConfig;
        }

        public ProtoAdapter_SuperEntranceConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, SuperEntranceConfig.class);
        }

        public final SuperEntranceConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (SuperEntranceConfig) null);
        }

        public final int encodedSize(SuperEntranceConfig superEntranceConfig) {
            return ValidTimesConfig.ADAPTER.asRepeated().encodedSizeWithTag(1, superEntranceConfig.valid_times) + ProtoAdapter.STRING.encodedSizeWithTag(2, superEntranceConfig.video_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, superEntranceConfig.video_md5) + ProtoAdapter.STRING.encodedSizeWithTag(4, superEntranceConfig.loop_video_url) + ProtoAdapter.STRING.encodedSizeWithTag(5, superEntranceConfig.loop_video_md5) + ProtoAdapter.STRING.encodedSizeWithTag(6, superEntranceConfig.effect_id) + ProtoAdapter.STRING.encodedSizeWithTag(7, superEntranceConfig.plus_icon_url) + ProtoAdapter.STRING.encodedSizeWithTag(8, superEntranceConfig.plus_icon_md5) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, superEntranceConfig.effect_ids) + ProtoAdapter.STRING.encodedSizeWithTag(10, superEntranceConfig.video_back_img_url) + ProtoAdapter.STRING.encodedSizeWithTag(11, superEntranceConfig.video_back_img_md5) + ProtoAdapter.STRING.encodedSizeWithTag(12, superEntranceConfig.try_tip) + ProtoAdapter.STRING.encodedSizeWithTag(13, superEntranceConfig.effect_tip) + superEntranceConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, SuperEntranceConfig superEntranceConfig) throws IOException {
            ValidTimesConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, superEntranceConfig.valid_times);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, superEntranceConfig.video_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, superEntranceConfig.video_md5);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, superEntranceConfig.loop_video_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, superEntranceConfig.loop_video_md5);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, superEntranceConfig.effect_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, superEntranceConfig.plus_icon_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, superEntranceConfig.plus_icon_md5);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 9, superEntranceConfig.effect_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, superEntranceConfig.video_back_img_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, superEntranceConfig.video_back_img_md5);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, superEntranceConfig.try_tip);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, superEntranceConfig.effect_tip);
            protoWriter.writeBytes(superEntranceConfig.unknownFields());
        }

        public final SuperEntranceConfig decode(ProtoReader protoReader, SuperEntranceConfig superEntranceConfig) throws IOException {
            Builder builder;
            SuperEntranceConfig superEntranceConfig2 = (SuperEntranceConfig) C10938a.m32097a().mo26425a(SuperEntranceConfig.class, superEntranceConfig);
            if (superEntranceConfig2 != null) {
                builder = superEntranceConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<ValidTimesConfig> newMutableList = Internal.newMutableList();
            List<String> newMutableList2 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(ValidTimesConfig.ADAPTER.decode(protoReader, C10938a.m32097a().mo26424a(ValidTimesConfig.class)));
                            break;
                        case 2:
                            builder.video_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.video_md5((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.loop_video_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.loop_video_md5((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.effect_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.plus_icon_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.plus_icon_md5((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            newMutableList2.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.video_back_img_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.video_back_img_md5((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 12:
                            builder.try_tip((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.effect_tip((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (superEntranceConfig2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.valid_times = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder.effect_ids = newMutableList2;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final String getEffectId() {
        return this.effect_id;
    }

    public final List<String> getEffectIds() {
        return this.effect_ids;
    }

    public final String getEffectTip() {
        return this.effect_tip;
    }

    public final String getLoopVideoMd5() {
        return this.loop_video_md5;
    }

    public final String getLoopVideoUrl() {
        return this.loop_video_url;
    }

    public final String getPlusIconMd5() {
        return this.plus_icon_md5;
    }

    public final String getPlusIconUrl() {
        return this.plus_icon_url;
    }

    public final String getTryTip() {
        return this.try_tip;
    }

    public final List<ValidTimesConfig> getValidTimes() {
        return this.valid_times;
    }

    public final String getVideoBackImgMd5() {
        return this.video_back_img_md5;
    }

    public final String getVideoBackImgUrl() {
        return this.video_back_img_url;
    }

    public final String getVideoMd5() {
        return this.video_md5;
    }

    public final String getVideoUrl() {
        return this.video_url;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.valid_times = Internal.copyOf("valid_times", this.valid_times);
        builder.video_url = this.video_url;
        builder.video_md5 = this.video_md5;
        builder.loop_video_url = this.loop_video_url;
        builder.loop_video_md5 = this.loop_video_md5;
        builder.effect_id = this.effect_id;
        builder.plus_icon_url = this.plus_icon_url;
        builder.plus_icon_md5 = this.plus_icon_md5;
        builder.effect_ids = Internal.copyOf("effect_ids", this.effect_ids);
        builder.video_back_img_url = this.video_back_img_url;
        builder.video_back_img_md5 = this.video_back_img_md5;
        builder.try_tip = this.try_tip;
        builder.effect_tip = this.effect_tip;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.valid_times.hashCode()) * 37) + this.video_url.hashCode()) * 37) + this.video_md5.hashCode()) * 37) + this.loop_video_url.hashCode()) * 37) + this.loop_video_md5.hashCode()) * 37) + this.effect_id.hashCode()) * 37) + this.plus_icon_url.hashCode()) * 37) + this.plus_icon_md5.hashCode()) * 37) + this.effect_ids.hashCode()) * 37) + this.video_back_img_url.hashCode()) * 37) + this.video_back_img_md5.hashCode()) * 37) + this.try_tip.hashCode()) * 37) + this.effect_tip.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.valid_times.isEmpty()) {
            sb.append(", valid_times=");
            sb.append(this.valid_times);
        }
        sb.append(", video_url=");
        sb.append(this.video_url);
        sb.append(", video_md5=");
        sb.append(this.video_md5);
        sb.append(", loop_video_url=");
        sb.append(this.loop_video_url);
        sb.append(", loop_video_md5=");
        sb.append(this.loop_video_md5);
        sb.append(", effect_id=");
        sb.append(this.effect_id);
        sb.append(", plus_icon_url=");
        sb.append(this.plus_icon_url);
        sb.append(", plus_icon_md5=");
        sb.append(this.plus_icon_md5);
        if (!this.effect_ids.isEmpty()) {
            sb.append(", effect_ids=");
            sb.append(this.effect_ids);
        }
        sb.append(", video_back_img_url=");
        sb.append(this.video_back_img_url);
        sb.append(", video_back_img_md5=");
        sb.append(this.video_back_img_md5);
        sb.append(", try_tip=");
        sb.append(this.try_tip);
        sb.append(", effect_tip=");
        sb.append(this.effect_tip);
        StringBuilder replace = sb.replace(0, 2, "SuperEntranceConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuperEntranceConfig)) {
            return false;
        }
        SuperEntranceConfig superEntranceConfig = (SuperEntranceConfig) obj;
        if (!unknownFields().equals(superEntranceConfig.unknownFields()) || !this.valid_times.equals(superEntranceConfig.valid_times) || !this.video_url.equals(superEntranceConfig.video_url) || !this.video_md5.equals(superEntranceConfig.video_md5) || !this.loop_video_url.equals(superEntranceConfig.loop_video_url) || !this.loop_video_md5.equals(superEntranceConfig.loop_video_md5) || !this.effect_id.equals(superEntranceConfig.effect_id) || !this.plus_icon_url.equals(superEntranceConfig.plus_icon_url) || !this.plus_icon_md5.equals(superEntranceConfig.plus_icon_md5) || !this.effect_ids.equals(superEntranceConfig.effect_ids) || !this.video_back_img_url.equals(superEntranceConfig.video_back_img_url) || !this.video_back_img_md5.equals(superEntranceConfig.video_back_img_md5) || !this.try_tip.equals(superEntranceConfig.try_tip) || !this.effect_tip.equals(superEntranceConfig.effect_tip)) {
            return false;
        }
        return true;
    }

    public SuperEntranceConfig(List<ValidTimesConfig> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list2, String str8, String str9, String str10, String str11) {
        this(list, str, str2, str3, str4, str5, str6, str7, list2, str8, str9, str10, str11, ByteString.EMPTY);
    }

    public SuperEntranceConfig(List<ValidTimesConfig> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list2, String str8, String str9, String str10, String str11, ByteString byteString) {
        super(ADAPTER, byteString);
        this.valid_times = Internal.immutableCopyOf("valid_times", list);
        this.video_url = str;
        this.video_md5 = str2;
        this.loop_video_url = str3;
        this.loop_video_md5 = str4;
        this.effect_id = str5;
        this.plus_icon_url = str6;
        this.plus_icon_md5 = str7;
        this.effect_ids = Internal.immutableCopyOf("effect_ids", list2);
        this.video_back_img_url = str8;
        this.video_back_img_md5 = str9;
        this.try_tip = str10;
        this.effect_tip = str11;
    }
}
