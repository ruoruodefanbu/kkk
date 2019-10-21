package com.kkk.entity;

/**
* <p>
* 
* </p>
* @author liup
* @since 2019-10-21
*/

public class ActivityImage  {
    public static final String NAME = "ActivityImage";
    private static final long serialVersionUID = 1L;

    private String id;

    private String activityId;

    private String imagePath;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
        }
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
