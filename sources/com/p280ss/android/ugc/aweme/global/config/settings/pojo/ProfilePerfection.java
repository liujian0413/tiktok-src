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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ProfilePerfection */
public final class ProfilePerfection extends Message<ProfilePerfection, Builder> {
    public static final DefaultValueProtoAdapter<ProfilePerfection> ADAPTER = new ProtoAdapter_ProfilePerfection();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
    public final Float avatar;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 5)
    public final Float birthday;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
    public final Float gender;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 8)
    public final Float location;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float nickname;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 6)
    public final Float school;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
    public final Float short_id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 7)
    public final Float signature;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ProfilePerfection$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ProfilePerfection, Builder> {
        public Float avatar;
        public Float birthday;
        public Float gender;
        public Float location;
        public Float nickname;
        public Float school;
        public Float short_id;
        public Float signature;

        public final ProfilePerfection build() {
            ProfilePerfection profilePerfection = new ProfilePerfection(this.avatar, this.nickname, this.short_id, this.gender, this.birthday, this.school, this.signature, this.location, super.buildUnknownFields());
            return profilePerfection;
        }

        public final Builder avatar(Float f) {
            this.avatar = f;
            return this;
        }

        public final Builder birthday(Float f) {
            this.birthday = f;
            return this;
        }

        public final Builder gender(Float f) {
            this.gender = f;
            return this;
        }

        public final Builder location(Float f) {
            this.location = f;
            return this;
        }

        public final Builder nickname(Float f) {
            this.nickname = f;
            return this;
        }

        public final Builder school(Float f) {
            this.school = f;
            return this;
        }

        public final Builder short_id(Float f) {
            this.short_id = f;
            return this;
        }

        public final Builder signature(Float f) {
            this.signature = f;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ProfilePerfection$ProtoAdapter_ProfilePerfection */
    static final class ProtoAdapter_ProfilePerfection extends DefaultValueProtoAdapter<ProfilePerfection> {
        public final ProfilePerfection redact(ProfilePerfection profilePerfection) {
            return profilePerfection;
        }

        public ProtoAdapter_ProfilePerfection() {
            super(FieldEncoding.LENGTH_DELIMITED, ProfilePerfection.class);
        }

        public final ProfilePerfection decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ProfilePerfection) null);
        }

        public final int encodedSize(ProfilePerfection profilePerfection) {
            return ProtoAdapter.FLOAT.encodedSizeWithTag(1, profilePerfection.avatar) + ProtoAdapter.FLOAT.encodedSizeWithTag(2, profilePerfection.nickname) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, profilePerfection.short_id) + ProtoAdapter.FLOAT.encodedSizeWithTag(4, profilePerfection.gender) + ProtoAdapter.FLOAT.encodedSizeWithTag(5, profilePerfection.birthday) + ProtoAdapter.FLOAT.encodedSizeWithTag(6, profilePerfection.school) + ProtoAdapter.FLOAT.encodedSizeWithTag(7, profilePerfection.signature) + ProtoAdapter.FLOAT.encodedSizeWithTag(8, profilePerfection.location) + profilePerfection.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ProfilePerfection profilePerfection) throws IOException {
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 1, profilePerfection.avatar);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 2, profilePerfection.nickname);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 3, profilePerfection.short_id);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, profilePerfection.gender);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 5, profilePerfection.birthday);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 6, profilePerfection.school);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 7, profilePerfection.signature);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 8, profilePerfection.location);
            protoWriter.writeBytes(profilePerfection.unknownFields());
        }

        public final ProfilePerfection decode(ProtoReader protoReader, ProfilePerfection profilePerfection) throws IOException {
            Builder builder;
            ProfilePerfection profilePerfection2 = (ProfilePerfection) C10938a.m32097a().mo26425a(ProfilePerfection.class, profilePerfection);
            if (profilePerfection2 != null) {
                builder = profilePerfection2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.avatar((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 2:
                            builder.nickname((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 3:
                            builder.short_id((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 4:
                            builder.gender((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 5:
                            builder.birthday((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 6:
                            builder.school((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 7:
                            builder.signature((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        case 8:
                            builder.location((Float) ProtoAdapter.FLOAT.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (profilePerfection2 != null) {
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

    public final Float getAvatar() throws NullValueException {
        if (this.avatar != null) {
            return this.avatar;
        }
        throw new NullValueException();
    }

    public final Float getBirthday() throws NullValueException {
        if (this.birthday != null) {
            return this.birthday;
        }
        throw new NullValueException();
    }

    public final Float getGender() throws NullValueException {
        if (this.gender != null) {
            return this.gender;
        }
        throw new NullValueException();
    }

    public final Float getLocation() throws NullValueException {
        if (this.location != null) {
            return this.location;
        }
        throw new NullValueException();
    }

    public final Float getNickname() throws NullValueException {
        if (this.nickname != null) {
            return this.nickname;
        }
        throw new NullValueException();
    }

    public final Float getSchool() throws NullValueException {
        if (this.school != null) {
            return this.school;
        }
        throw new NullValueException();
    }

    public final Float getShortId() throws NullValueException {
        if (this.short_id != null) {
            return this.short_id;
        }
        throw new NullValueException();
    }

    public final Float getSignature() throws NullValueException {
        if (this.signature != null) {
            return this.signature;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.avatar = this.avatar;
        builder.nickname = this.nickname;
        builder.short_id = this.short_id;
        builder.gender = this.gender;
        builder.birthday = this.birthday;
        builder.school = this.school;
        builder.signature = this.signature;
        builder.location = this.location;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i9 = 0;
        if (this.avatar != null) {
            i = this.avatar.hashCode();
        } else {
            i = 0;
        }
        int i10 = (hashCode + i) * 37;
        if (this.nickname != null) {
            i2 = this.nickname.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 37;
        if (this.short_id != null) {
            i3 = this.short_id.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 37;
        if (this.gender != null) {
            i4 = this.gender.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 37;
        if (this.birthday != null) {
            i5 = this.birthday.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 37;
        if (this.school != null) {
            i6 = this.school.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 37;
        if (this.signature != null) {
            i7 = this.signature.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 37;
        if (this.location != null) {
            i9 = this.location.hashCode();
        }
        int i17 = i16 + i9;
        this.hashCode = i17;
        return i17;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.short_id != null) {
            sb.append(", short_id=");
            sb.append(this.short_id);
        }
        if (this.gender != null) {
            sb.append(", gender=");
            sb.append(this.gender);
        }
        if (this.birthday != null) {
            sb.append(", birthday=");
            sb.append(this.birthday);
        }
        if (this.school != null) {
            sb.append(", school=");
            sb.append(this.school);
        }
        if (this.signature != null) {
            sb.append(", signature=");
            sb.append(this.signature);
        }
        if (this.location != null) {
            sb.append(", location=");
            sb.append(this.location);
        }
        StringBuilder replace = sb.replace(0, 2, "ProfilePerfection{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfilePerfection)) {
            return false;
        }
        ProfilePerfection profilePerfection = (ProfilePerfection) obj;
        if (!unknownFields().equals(profilePerfection.unknownFields()) || !Internal.equals(this.avatar, profilePerfection.avatar) || !Internal.equals(this.nickname, profilePerfection.nickname) || !Internal.equals(this.short_id, profilePerfection.short_id) || !Internal.equals(this.gender, profilePerfection.gender) || !Internal.equals(this.birthday, profilePerfection.birthday) || !Internal.equals(this.school, profilePerfection.school) || !Internal.equals(this.signature, profilePerfection.signature) || !Internal.equals(this.location, profilePerfection.location)) {
            return false;
        }
        return true;
    }

    public ProfilePerfection(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8) {
        this(f, f2, f3, f4, f5, f6, f7, f8, ByteString.EMPTY);
    }

    public ProfilePerfection(Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.avatar = f;
        this.nickname = f2;
        this.short_id = f3;
        this.gender = f4;
        this.birthday = f5;
        this.school = f6;
        this.signature = f7;
        this.location = f8;
    }
}
