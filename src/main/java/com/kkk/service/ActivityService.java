package com.kkk.service;

import com.kkk.dao.ActivityDao;
import com.kkk.entity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    @Autowired
    private ActivityDao activityDao;

    public Activity getById(String id){
        return activityDao.getById(id);
    }


}
