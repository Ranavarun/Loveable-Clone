package com.coadingShuttle.Project.loveable_clone.Entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Plan {
// what kind of resouce plan inside the current plan
    Long id;
    String name;
    String stripePriceId;
    Integer maxProjects;
    Integer maxTokenPerDay;
    Integer maxPreviews;
    Boolean unlimitedAi;
    Boolean active;


}
