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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VideoAuth */
public final class VideoAuth extends Message<VideoAuth, Builder> {
    public static final DefaultValueProtoAdapter<VideoAuth> ADAPTER = new ProtoAdapter_VideoAuth();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String auth;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String code;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VideoAuth$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VideoAuth, Builder> {
        public String auth;
        public String code;

        public final VideoAuth build() {
            return new VideoAuth(this.auth, this.code, super.buildUnknownFields());
        }

        public final Builder auth(String str) {
            this.auth = str;
            return this;
        }

        public final Builder code(String str) {
            this.code = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.VideoAuth$ProtoAdapter_VideoAuth */
    static final class ProtoAdapter_VideoAuth extends DefaultValueProtoAdapter<VideoAuth> {
        public final VideoAuth redact(VideoAuth videoAuth) {
            return videoAuth;
        }

        public ProtoAdapter_VideoAuth() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoAuth.class);
        }

        public final VideoAuth decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (VideoAuth) null);
        }

        public final int encodedSize(VideoAuth videoAuth) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, videoAuth.auth) + ProtoAdapter.STRING.encodedSizeWithTag(2, videoAuth.code) + videoAuth.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, VideoAuth videoAuth) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoAuth.auth);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoAuth.code);
            protoWriter.writeBytes(videoAuth.unknownFields());
        }

        public final VideoAuth decode(ProtoReader protoReader, VideoAuth videoAuth) throws IOException {
            Builder builder;
            VideoAuth videoAuth2 = (VideoAuth) C10938a.m32097a().mo26425a(VideoAuth.class, videoAuth);
            if (videoAuth2 != null) {
                builder = videoAuth2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.auth((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.code((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (videoAuth2 != null) {
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

    public final String getAuth() throws NullValueException {
        if (this.auth != null) {
            return this.auth;
        }
        throw new NullValueException();
    }

    public final String getCode() throws NullValueException {
        if (this.code != null) {
            return this.code;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.auth = this.auth;
        builder.code = this.code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.auth != null) {
            i = this.auth.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.code != null) {
            i3 = this.code.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.auth != null) {
            sb.append(", auth=");
            sb.append(this.auth);
        }
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoAuth{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoAuth)) {
            return false;
        }
        VideoAuth videoAuth = (VideoAuth) obj;
        if (!unknownFields().equals(videoAuth.unknownFields()) || !Internal.equals(this.auth, videoAuth.auth) || !Internal.equals(this.code, videoAuth.code)) {
            return false;
        }
        return true;
    }

    public VideoAuth(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public VideoAuth(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.auth = str;
        this.code = str2;
    }
}
