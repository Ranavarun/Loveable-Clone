package com.coadingShuttle.Project.loveable_clone.Entity;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class User {
   BigInteger id;
   String email;
   String passwordHash;
   String name;
   String avatarUrl;
   Instant createdAt;
   Instant updatedAt;
   Instant deletedAt;
}







