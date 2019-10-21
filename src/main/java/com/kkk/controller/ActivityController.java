package com.kkk.controller;

import com.kkk.entity.Activity;
import com.kkk.service.ActivityService;
import com.kkk.util.OperateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    ActivityService activityService;

    @RequestMapping("/{id}")
    public OperateResult<Activity> getActivity(String id){
        OperateResult<Activity> result = new OperateResult<>();
        try {
            Activity activity = activityService.getById(id);
            return result.success(activity);
        }catch (Exception e){
            return result.error(e.getMessage());
        }
    }

}
