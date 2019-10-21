package com.kkk.dao;

import com.kkk.entity.Activity;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityDao {

      Activity getById(String id);

}
