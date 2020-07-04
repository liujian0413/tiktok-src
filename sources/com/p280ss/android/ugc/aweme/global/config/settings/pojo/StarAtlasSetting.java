package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
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
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.StarAtlasSetting */
public final class StarAtlasSetting extends Message<StarAtlasSetting, Builder> {
    public static final DefaultValueProtoAdapter<StarAtlasSetting> ADAPTER = new ProtoAdapter_StarAtlasSetting();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean star_atlas_enable;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String star_atlas_redirect_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String star_atlas_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.StarAtlasSetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<StarAtlasSetting, Builder> {
        public Boolean star_atlas_enable;
        public String star_atlas_redirect_url;
        public String star_atlas_url;

        public final StarAtlasSetting build() {
            return new StarAtlasSetting(this.star_atlas_enable, this.star_atlas_url, this.star_atlas_redirect_url, super.buildUnknownFields());
        }

        public final Builder star_atlas_enable(Boolean bool) {
            this.star_atlas_enable = bool;
            return this;
        }

        public final Builder star_atlas_redirect_url(String str) {
            this.star_atlas_redirect_url = str;
            return this;
        }

        public final Builder star_atlas_url(String str) {
            this.star_atlas_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.StarAtlasSetting$ProtoAdapter_StarAtlasSetting */
    static final class ProtoAdapter_StarAtlasSetting extends DefaultValueProtoAdapter<StarAtlasSetting> {
        public final StarAtlasSetting redact(StarAtlasSetting starAtlasSetting) {
            return starAtlasSetting;
        }

        public ProtoAdapter_StarAtlasSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, StarAtlasSetting.class);
        }

        public final StarAtlasSetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (StarAtlasSetting) null);
        }

        public final int encodedSize(StarAtlasSetting starAtlasSetting) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, starAtlasSetting.star_atlas_enable) + ProtoAdapter.STRING.encodedSizeWithTag(2, starAtlasSetting.star_atlas_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, starAtlasSetting.star_atlas_redirect_url) + starAtlasSetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, StarAtlasSetting starAtlasSetting) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, starAtlasSetting.star_atlas_enable);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, starAtlasSetting.star_atlas_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, starAtlasSetting.star_atlas_redirect_url);
            protoWriter.writeBytes(starAtlasSetting.unknownFields());
        }

        public final StarAtlasSetting decode(ProtoReader protoReader, StarAtlasSetting starAtlasSetting) throws IOException {
            Builder builder;
            StarAtlasSetting starAtlasSetting2 = (StarAtlasSetting) C10938a.m32097a().mo26425a(StarAtlasSetting.class, starAtlasSetting);
            if (starAtlasSetting2 != null) {
                builder = starAtlasSetting2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.star_atlas_enable((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.star_atlas_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.star_atlas_redirect_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (starAtlasSetting2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Boolean getStarAtlasEnable() throws NullValueException {
        if (this.star_atlas_enable != null) {
            return this.star_atlas_enable;
        }
        throw new NullValueException();
    }

    public final String getStarAtlasRedirectUrl() throws NullValueException {
        if (this.star_atlas_redirect_url != null) {
            return this.star_atlas_redirect_url;
        }
        throw new NullValueException();
    }

    public final String getStarAtlasUrl() throws NullValueException {
        if (this.star_atlas_url != null) {
            return this.star_atlas_url;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.star_atlas_enable = this.star_atlas_enable;
        builder.star_atlas_url = this.star_atlas_url;
        builder.star_atlas_redirect_url = this.star_atlas_redirect_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.star_atlas_enable != null) {
            i = this.star_atlas_enable.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.star_atlas_url != null) {
            i2 = this.star_atlas_url.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.star_atlas_redirect_url != null) {
            i4 = this.star_atlas_redirect_url.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.star_atlas_enable != null) {
            sb.append(", star_atlas_enable=");
            sb.append(this.star_atlas_enable);
        }
        if (this.star_atlas_url != null) {
            sb.append(", star_atlas_url=");
            sb.append(this.star_atlas_url);
        }
        if (this.star_atlas_redirect_url != null) {
            sb.append(", star_atlas_redirect_url=");
            sb.append(this.star_atlas_redirect_url);
        }
        StringBuilder replace = sb.replace(0, 2, "StarAtlasSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StarAtlasSetting)) {
            return false;
        }
        StarAtlasSetting starAtlasSetting = (StarAtlasSetting) obj;
        if (!unknownFields().equals(starAtlasSetting.unknownFields()) || !Internal.equals(this.star_atlas_enable, starAtlasSetting.star_atlas_enable) || !Internal.equals(this.star_atlas_url, starAtlasSetting.star_atlas_url) || !Internal.equals(this.star_atlas_redirect_url, starAtlasSetting.star_atlas_redirect_url)) {
            return false;
        }
        return true;
    }

    public StarAtlasSetting(Boolean bool, String str, String str2) {
        this(bool, str, str2, ByteString.EMPTY);
    }

    public StarAtlasSetting(Boolean bool, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.star_atlas_enable = bool;
        this.star_atlas_url = str;
        this.star_atlas_redirect_url = str2;
    }
}
